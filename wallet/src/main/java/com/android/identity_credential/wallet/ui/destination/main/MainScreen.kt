package com.android.identity_credential.wallet.ui.destination.main

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.android.identity.android.securearea.AndroidKeystoreSecureArea
import com.android.identity.util.Logger
import com.android.identity_credential.wallet.CardViewModel
import com.android.identity_credential.wallet.QrEngagementViewModel
import com.android.identity_credential.wallet.R
import com.android.identity_credential.wallet.SettingsModel
import com.android.identity_credential.wallet.WalletApplication
import com.android.identity_credential.wallet.navigation.WalletDestination
import com.android.identity_credential.wallet.ui.ScreenWithAppBar
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

private const val TAG = "MainScreen"

@Composable
fun MainScreen(
    onNavigate: (String) -> Unit,
    qrEngagementViewModel: QrEngagementViewModel,
    cardViewModel: CardViewModel,
    settingsModel: SettingsModel,
    context: Context,
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(stringResource(R.string.wallet_drawer_title), modifier = Modifier.padding(16.dp))
                Divider()
                NavigationDrawerItem(
                    icon = { Icon(imageVector = Icons.Filled.Add, contentDescription = null) },
                    label = { Text(text = stringResource(R.string.wallet_drawer_add)) },
                    selected = false,
                    onClick = {
                        scope.launch {
                            drawerState.close()
                            onNavigate(WalletDestination.AddToWallet.route)
                        }
                    }
                )
                NavigationDrawerItem(
                    icon = { Icon(imageVector = Icons.Filled.Settings, contentDescription = null) },
                    label = { Text(text = stringResource(R.string.wallet_drawer_settings)) },
                    selected = false,
                    onClick = {
                        scope.launch {
                            drawerState.close()
                            onNavigate(WalletDestination.Settings.route)
                        }
                    }
                )
                NavigationDrawerItem(
                    icon = { Icon(imageVector = Icons.Filled.Info, contentDescription = null) },
                    label = { Text(text = stringResource(R.string.wallet_drawer_about)) },
                    selected = false,
                    onClick = {
                        scope.launch {
                            drawerState.close()
                            onNavigate(WalletDestination.About.route)
                        }
                    }
                )
            }
        },
    ) {
        MainScreenContent(
            onNavigate = onNavigate,
            settingsModel = settingsModel,
            qrEngagementViewModel = qrEngagementViewModel,
            cardViewModel = cardViewModel,
            scope = scope,
            drawerState = drawerState,
            context = context
        )
    }
}

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MainScreenContent(
    onNavigate: (String) -> Unit,
    settingsModel: SettingsModel,
    qrEngagementViewModel: QrEngagementViewModel,
    cardViewModel: CardViewModel,
    scope: CoroutineScope,
    drawerState: DrawerState,
    context: Context,
) {
    val hasProximityPresentationPermissions = rememberMultiplePermissionsState(
        WalletApplication.MDOC_PROXIMITY_PERMISSIONS
    )

    var showProximityPresentationPermissionsMissing by remember { mutableStateOf(false) }
    if (showProximityPresentationPermissionsMissing) {
        AlertDialog(
            title = {
                Text(stringResource(R.string.proximity_permissions_qr_alert_dialog_title))
            },
            text = {
                Text(stringResource(R.string.proximity_permissions_qr_alert_dialog_content))
            },
            onDismissRequest = { showProximityPresentationPermissionsMissing = false },
            dismissButton = {
                TextButton(onClick = { showProximityPresentationPermissionsMissing = false }) {
                    Text(stringResource(R.string.proximity_permissions_qr_alert_dialog_dismiss_button))
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showProximityPresentationPermissionsMissing = false
                        hasProximityPresentationPermissions.launchMultiplePermissionRequest()
                    }
                ) {
                    Text(stringResource(R.string.proximity_permissions_qr_alert_dialog_confirm_button))
                }
            },
        )
    }


    var showDeviceLockNotSetupWarning by remember { mutableStateOf(false) }
    if (showDeviceLockNotSetupWarning) {
        AlertDialog(
            title = {
                Text(text = stringResource(R.string.qr_lskf_warning_dialog_title))
            },
            text = {
                Text(text = stringResource(R.string.qr_lskf_warning_dialog_text))
            },
            onDismissRequest = { showDeviceLockNotSetupWarning = false },
            confirmButton = {
                TextButton(
                    onClick = { showDeviceLockNotSetupWarning = false }
                ) {
                    Text(text = stringResource(R.string.qr_lskf_warning_dismiss_btn))
                }
            },
        )
    }

    val snackbarHostState = remember { SnackbarHostState() }
    ScreenWithAppBar(title = stringResource(R.string.wallet_screen_title),
        navigationIcon = {
            IconButton(
                onClick = {
                    scope.launch {
                        drawerState.apply {
                            Logger.d(TAG, "isClosed = $isClosed")
                            if (isClosed) open() else close()
                        }
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = stringResource(R.string.accessibility_menu_icon)
                )
            }
        },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
    ) {
        if (cardViewModel.cards.isEmpty()) {
            MainScreenNoCredentialsAvailable(onNavigate, context)
        } else {
            if (!hasProximityPresentationPermissions.allPermissionsGranted &&
                !settingsModel.hideMissingProximityPermissionsWarning.value!!) {
                LaunchedEffect(snackbarHostState) {
                    when (snackbarHostState.showSnackbar(
                        message = context.getString(R.string.proximity_permissions_snackbar_text),
                        actionLabel = context.getString(R.string.proximity_permissions_snackbar_action_label),
                        duration = SnackbarDuration.Indefinite,
                        withDismissAction = true
                    )) {
                        SnackbarResult.Dismissed -> {
                            settingsModel.hideMissingProximityPermissionsWarning.value = true
                        }
                        SnackbarResult.ActionPerformed -> {
                            hasProximityPresentationPermissions.launchMultiplePermissionRequest()
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(0.25f))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.nfc_icon),
                        contentDescription = stringResource(R.string.wallet_screen_nfc_icon_content_description),
                        modifier = Modifier.size(96.dp),
                    )
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = stringResource(R.string.wallet_screen_nfc_presentation_instructions),
                    )
                }
            }

            Spacer(modifier = Modifier.weight(0.25f))

            MainScreenCredentialPager(
                onNavigate = onNavigate,
                cardViewModel = cardViewModel,
                settingsModel = settingsModel
            )

            Spacer(modifier = Modifier.weight(0.5f))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp, top = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedButton(
                    onClick = {
                        if (!AndroidKeystoreSecureArea.Capabilities(context).secureLockScreenSetup) {
                            showDeviceLockNotSetupWarning = true
                        } else {
                            if (!hasProximityPresentationPermissions.allPermissionsGranted) {
                                showProximityPresentationPermissionsMissing = true
                            } else {
                                qrEngagementViewModel.startQrEngagement()
                                onNavigate(WalletDestination.QrEngagement.route)
                            }
                        }
                    },
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.qr_icon),
                        contentDescription = stringResource(R.string.wallet_screen_qr_icon_content_description),
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                    Text(
                        text = stringResource(R.string.wallet_screen_show_qr)
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreenNoCredentialsAvailable(
    onNavigate: (String) -> Unit,
    context: Context
) {
    var showDeviceLockNotSetupWarning by remember { mutableStateOf(false) }
    if (showDeviceLockNotSetupWarning) {
        AlertDialog(
            title = {
                Text(text = stringResource(R.string.add_cred_lskf_warning_dialog_title))
            },
            text = {
                Text(text = stringResource(R.string.add_cred_lskf_warning_dialog_text))
            },
            onDismissRequest = { showDeviceLockNotSetupWarning = false },
            confirmButton = {
                TextButton(
                    onClick = { showDeviceLockNotSetupWarning = false }
                ) {
                    Text(text = stringResource(R.string.add_cred_lskf_warning_dismiss_btn))
                }
            },
        )
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = stringResource(R.string.wallet_screen_empty),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            if (!AndroidKeystoreSecureArea.Capabilities(context).secureLockScreenSetup) {
                showDeviceLockNotSetupWarning = true
            } else {
                onNavigate(WalletDestination.AddToWallet.route)
            }

        }) {
            Text(stringResource(R.string.wallet_screen_add))
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreenCredentialPager(
    onNavigate: (String) -> Unit,
    cardViewModel: CardViewModel,
    settingsModel: SettingsModel,
) {
    val pagerState = rememberPagerState(
        initialPage = cardViewModel.getCardIndex(settingsModel.focusedCardId.value!!) ?: 0,
        pageCount = { cardViewModel.cards.size }
    )

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            settingsModel.focusedCardId.value = cardViewModel.cards[page].id
        }
    }

    Column {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.height(200.dp)
        ) { page ->
            val card = cardViewModel.cards[page]
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    bitmap = card.cardArtwork.asImageBitmap(),
                    contentDescription =
                    stringResource(R.string.accessibility_artwork_for, card.name),
                    modifier = Modifier.clickable(onClick = {
                        onNavigate(
                            WalletDestination.CardInfo
                                .getRouteWithArguments(
                                    listOf(
                                        Pair(
                                            WalletDestination.CardInfo.Argument.CARD_ID,
                                            card.id
                                        )
                                    )
                                )
                        )
                    })
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .height(30.dp)
                .padding(8.dp),
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color =
                    if (pagerState.currentPage == iteration) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.secondary
                    }
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(8.dp)
                )
            }
        }
    }
}
