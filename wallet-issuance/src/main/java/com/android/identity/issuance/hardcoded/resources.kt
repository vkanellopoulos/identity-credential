package com.android.identity.issuance.hardcoded

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

// This file is needed until we create a resource-accessing interface that can be
// used on both server and the client. Right now resources are just hard-coded here
// (and images are in very low resolution).

@OptIn(ExperimentalEncodingApi::class)
val dmv_issuing_authority_logo_png = Base64.decode(
    """
        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
        c5v/BS9//79j1qAXAAAAAElFTkSuQmCC
    """.trimIndent().replace("\n", "")
)

@OptIn(ExperimentalEncodingApi::class)
val driving_license_card_art_png = Base64.decode(
    """
        iVBORw0KGgoAAAANSUhEUgAAADwAAAAmCAYAAACYsfiPAAAaMElEQVRo3j16+XNb15nla6WT8cSO93a8
        yEnsVCfO2nFiW5EskRI3cRMliqso7vtOggQJrgAJYiN2gNjBBSAJcKdEat9lSbYUO6WkO92pmerpH6a6
        O1VTM/MPjCc5c+6Fp3+4dd8DQBHnne873zmXUsY329/a/Hzg6cWnGmw9Gfrz9m8GcIFr9/NB7D7ux8VP
        e7D9WR+2n6iwyeu1h91Icq096MT6gw5sPmjHxqN2bD7qwPq9Fmzca8Ta/Was3W1F8k4rVm+3YPl6AxJ3
        mhG/2YDlG/WI327Gwq1mLF6rx8LV84hdrcXSlVosXqlBbK8ai5e49quxtHce8xdrsHCxCtELVVjcrcDC
        bjnmdysRXi9FdKuci9drFYisVyKULEVwvRzhjTLel/H+LPyrZ/7iXy3G3HLRF6Om/B8oa0/UD5JfWGDf
        1f4f58VJmFbGYFwahTkxDucWr2Ma3mtg3xyBNTkMS0KsITi2NDDF1bAuD0G/MABduJ/3g9BH+jAZ6OXP
        9cO81A9tuJev92JirpOf6YJ+sQcj3nZMhjpgiHXx9RbMBFv52XZogy2Y8rdCH2jBsLUBY84GTAWboXHU
        Qz1bh1FH6rXh2VpoAw28r4dW3JvroNbXQGOpwZijBuqZ81BNn8eg4TzGXLUYddd9aYs1wxYt/nulwzUB
        5bjl/yrpRiiHZ1AdnMPolRAq5zxQqsxQb/gxesGPA7VmZBscKLZbUWiehXJwEoUGM3KnLeiJO6FedyFt
        xIC2iAVDGza816rFwfoJlFv1UH6pRteCGTljk1DKRtEVnULR1DiUlwdQZpnCkf4xKEofcjSjyB+fxNsN
        Ggwl9ah38/Nn+tHqm8BQTIcK8ySyR0fQ4uHP/rAbZ/VjeL91EEXjwxiNj6Ncr8GrVQPo8GswGB3BOeMw
        lPfaoHzE9fO2L8sH6vh7iib/8lKZCW9VzUDJ12P3fycQ/qdF7P6PFVjuB7D/P2OI/ZclRP4wj/DvI3B8
        4sbKP4dxpE+HhX8Mw3zDhb0/RTBzxYHBVRO2/nsI/s+9WPzDHE5PaeF54sb4lgm6HSOMl02w3rTCfdeM
        Uv0olFd7sPBbG/QX+LuVDtivmeC+YYTjnhlzjywIPZmFKqbFxj/Z4bg2g2bvBGyX9bj9JzfOGzRwXNfD
        uD+F2O9MMO3p4LihR6t7GFt/NMKwO44uLwH/ugWv57bg+SyCPtLyF+XF83yKZ404UMpfmj2N9X9bJgtG
        +L6Iwvc0hK1/XcLun2LQ7LgR4n33vBXOhz64P/XBeteN9pAJe/8ehp6A670GrP6zH8v/1Y/+uAHZYxOo
        8+lhu2mRDNbaJhF96oCLgNN6hvhaLwKPZqFemuJ1G7/kDMz7erg/MSFLzS/7kx4+GA1Wns7CesWIStMY
        TFvT8N4xw3vLANedGQzMj2P6go4/p8Xo2jjqZoew/LkBuq1xVBrVUH7UjOdyCPZEO57JaobyWo0Or5Yb
        8UYlSy93GhcFw/+wQIaX4Xwcwsq/LCD+xzCs9/1Y+mMUg3EbmoKzeIJNdEZM6F204OL/WsTQlhMDa7Nk
        3csHYofzkRPKh4MsqQEYLxkxuj6D6T0TnPctGFjUQUnrg/KLPgSfWLD41IoqxzgcBGIlk9bbRnjuGxF+
        PIOh1Ums/cEK08VpVM+OwnfXBPXCOAxbk7jxbw70RfkQLk9jZncSK78zYIDvJX9vxERyDB0+VtHRFryS
        3YoXyPALOS18sKf4dI+yf48b+AXZwz43Ji750Rh24c06I85Y7GRcj2qvHWXs3ffb+bmTWgwmHeyvCXy3
        SYfehB39SRtyp2ZQOMN/q3AcNXMmlpAGyk/JVMEIP29AkXYCP2sZxQft7NnvqMigCgWT41CR4dbgFAq0
        Y8gaGcVrFQN8sJMs4XF8vWwAbZ4J9uQke3IchWMaHOocxquFPegPjuGHdQPs3SEMLoygQDOI10r60M6y
        7gtocM5Aht9rpYaQ4ffboXxAwA0uHVocBrQ6DdxnUDmlQ7FmEuUTWtRbtDg/zbI0alE5Mcb3CGRmHE3m
        cZQOadBsGEH99DCKVYM43T+IypFhlGvUqNUOo6SvHzXaAa5BVI0PIL+jB2XqPlSMDqB0RIUqrQrnJvpR
        0t+LvLZunOro5HUHSvs7UTnUhbyWdr7WgUp1J061tyG/pQ2nu9pR3NuO0r42lKpacbKlERX9LTjV1oSc
        xgYUtTeiuLsJWfX1yKypR25jHc72NshVIlZPA5T1L9TY/90QLj4dwj7X3u+5/34Ye0/VuPBbzuTfqrD7
        GxUufC5m8wB2Hvdg57MOXHjci91PezmjuT/u5muc15zTW4+6sf2gC9uPOrHxCWfzXc5lzmAxo9fvtWH9
        di2SN8qxdqsOiVtNWL3FWc2ZnOCMXr1Ri9VrnNVX67B65TxWrlQjdqWKi/ulKixdOsfZXJmaxdtliHJF
        tksQ2SpFeKccoY2z8CVOI7DG+/USBNfOIpAoRmi1EMGVfPjjZ6CsfKbG9udDNBWDBMNr3m/xeutTsQ9g
        /WE/Nh6osHavn1+exuNOFxL3OpG828XXernztdudfL0dydsdNBodWLnZRhCdSPD15evN/OIEtleB1Qun
        kFj/EMn1nyK58QGSqz9FfCcPC5dpQvbqsUSTEbtYjYUL1QRUlVq75xDZOY/QJg3GBo3H1jlEN2k0Nmgw
        hNEgqBABRriCNBoBmgwfgbkXT8vlWTiFucUieOYL4I4WQUn+Zhi7X3AR9M5v1Nh5MpQC/UhFoL3YfNhL
        R0Vgn/SRIYK624HEXQK+10FHRbD3u1Pg73amHsbtdoJuk2CTdwic98n9M9heeR6J7TSsXC3D2vVyMlmB
        lY1jSMa+idWt44hfrkNsvwZLFwTgSixeOEcmyeY2AW9WIcw9vFmC2WA+9L7TmPaehk4sdxGm3Ply6TwF
        mHLlwj1fCN+yAFoA34JYhbwuhJOgleQTAVYAVbN0yfDjQcnszmf9BN33H2vzYQ9tZA82CHBNMkxLSfDy
        ARBY4g6ZlWDF3kKWRany/no91rcOYW0rnbayEZ5gLkzjv4Lbl43Fqw1kuAjL8R/RUtZgkezOE2h0p4Ll
        Wk6glSk2t6rgp5UsHSqBUk3hqW6CUkcxqm9LXTdSkFq6odTyvdIafFBXAosvB75YIbzzp8gu9+hJOKIE
        vPF4iN5ZlPPAVyU9QN88gCSBrd7upu/txtLtLsRudmDpejtiNzoQ477EMk3cYdmylFdvCSY7UztBxm+w
        jG8RNPdV+ujlS+exzH71hnLRdlKBqu8g2rIVuJzpiF9vIpvCI5+nV64m2ErpjwVYsUJr5/h+NTSmfCjl
        7Xi5bwDPdfbgWYriC52deIFi90JXF75F4XxWNYDXevsJvBfFPQXwLp5kGRfAFcmHO3ISrnkJeDgFlgxv
        s293CVoA8wQPIRJ6FwH/e/D4PoLb+SM4zN+D1fh9WGe+C8PEQZicmWSyneIjSriNDBLwjRS7EiwZjTMU
        xC83yPsJ9d+ht/NrWN4uwIDqBxjp/j7fI7MXRK8SMMt2QYIlq5sMBizl4Dpf2ylD61QxlGYCaqjBgTay
        OzyCAz09+Hp3N75BwAofxH/i/lJjk2Q6o7mIJXwSzmgeXOF8eCPcI4VQ1j5l7wpWZSn3Y5OAPYt5WAy+
        iLXYi1hdOIjFwPew6FQQsZEV0ytwTD8L5/TzmOxW4EueY/+2SeDx6wI009FXgJev1XGvQ/xaE9ugFV5f
        LjryFajH3kPT2QOwGA5LdY5dqpFpKHqhPpV+Nqm+AjgTT5BJKLpVgpbpUij0AS9azVBoWb/e34dnRkbw
        zBCBjmjwzSE1/lqrxTenp6FMTCOrr5IAs2QZO0P58IRz4QznCcDsXwGWDAvgG+zfuaVcxOd/gJ34K9iY
        /wYi7jcRtD/D9TW4jG/Co38WXuPz0A0qmEtWSbFaYanHr7VIhgVb3vhZLF9pgIsqGaGyzobyYPPnYLr/
        x1A3HMTM1IeMdcWY9eRg1p9LFS4nuBIZ7cIbpRwxvJcqTAXePIvGSTJstuBlmxHPMyw8o+rGt9U9eM40
        jRd0I3h9WIXXB/vxLR3DkG6KgCvgDp0gWAE0h4s9zO+gJD+jKj9WyZLe+kzFrNvPZs/HUvAglvxvIOj+
        GzjNb2HOeADeGQUW7WuwTrwIh/4lGEeekyWXYL/GrzYz17KMb7bAv1aGyZlDBFyDQc37BFCC4fEPoBn7
        EP7lQmgJ1krRclBMejt/jI6OH2PUcAxTlmMIJkoxMnUMgeQZLubZldMIrZ9B0wi/7NQ0XvI58OroEL5h
        mcZrQTPemhjEc8YpPGcz4Nt97XhlhoCHB5HTRmYDObAHT8JO0C6KpV0AXnusoUiRYY6iTTK8JhiOFyDM
        Mp6fexUBx2twG/5GgnVN/RVmJ18h4Ffg0r0E8/Az/FLlEmTsaiMDfCNWOHcDFJrRqcMyzKsGf8ZRVA2z
        P18+4SnzCdiC2dAaPsboTDq6ut/DpPEIzIFcjBuOwhEsQGm6wj2PDJfAu3QK/kQB6sZoGiwGvB2x4+UR
        Nb6zH8XPN734vluLv93047kVN561TeFVs5YMTyCzq5jsZpDZfILm7w7kfQX4M9HDKmk2ttnD65y/c/M5
        CLjfwLznFcyZXoZdd5AACXb865gZ+zYB/2f4DN+CY/wAe7hCGo345SaCbpJlHLtUB50pHUOjh2CZy8bK
        5fMwe0/CNpfDdjkNzej7BHyUDyEXEzNHsLh/Dp5YMXTmNOiM6ejt+QV0ZDywchbe2Cnpkmo1VGn3LN6c
        d+D1gAXfu7OC70SYu2eGcPjhCn72OIk3/Ea86WbqCzqQ2VdOwBSt4ClY/fzdZNsWOEnAjwiUKr39mRCt
        PumshGjNzT4Hn/XbsBvegFF7EPqhA5gaUDAx/B2YJ96CU0/gZNu/VkWhaqYaU5wEWBqIJe5Le7XSNCxf
        rpdjZX5HOKWz3Cuk3YvQ+oXYr4HVMoQSJawqGoVYkXRJwYRgli5pqZDfpYhtkI+6idP8sgG8HnPhewEj
        3p4j22Tz3Vkt3vGb8LchM96JzOLHPoab+ByyBs7B5c9kNbGUCdQRzCLwLHrpRwNyLG19qsLmI7qqh31k
        +CTC9m8h7HhZlvPM2LvQql/EUDcXZ6hllKxrWdIahYaAPXxNABR+lyOI7MYunseCMBHcBVAhYikzQUFa
        PyvPo0Jf+Vy/ALdaSlD0wOxXAdor3NES52iMa+E0fIs5DDK1UB6t4Qdk8m2u9/Z8+NHlMN5Zm8MrK14c
        THjw6q043r0QwTNXlpA90waH5wjLWYgl9SKQlWI4+ZDMPhKuaiDlpmj+3bFSGDXPwj6uUJi+htHev8Zw
        Ow1Dk4LuFgUjXQrGuVTd7yJIFyRM/vL+/z94oz2UYDlm6IOju6kZKw7cwltCcWnshedNnMXcagl8K8Xw
        cgVSB21wLwjAhXCJ+SlWhKDnc9Gor4QSsuDn6268t+zAz59u4u1Pk3jXpsNPl+1454sdvL3Kno4ztoZt
        OKmpgcN7DLPUBlsgm6AzYBWAE4/UEvDGgz5s0Ddv3O+iy+piT5XCNXeC0p5NRc2F3lMIw1wujO4cGJ1Z
        MLuy4IpXsGTruGqkmxIsL16spWMis1tkeZtmYkcYB7K8LYxECeY3SiXDgYQoZbLNdBNKFEp2/bSCQfZs
        gELlXsijJaQvDhfQB+ejfzIdynYQP6FYvRux4p3dIN5cc+OdZQ9+uO7Fd/kg3mE5H1xysaTdqBikw/Kf
        wCx1w0qbafexvKkZyuqDQTJLwAwHIghs3G+XaWhdHsX2SYsZu8HXZBJqlvYxSVe1cKmRcY19ulcnQUZ3
        qsjeOXrhagQ3yO52tTT8wkCIvo3SRMxzzopUI8o4wPETIMN+sUSkW2H/spznFk9RTfllaRTctISeaIFk
        3OpNR6mxEYqLPeq1QJmzQQnMQvFxEbSy4cMBcW/S4lfDjdDbjpPZPFjnsuQItPsEcWR45X4vth6q/gPw
        +t1WGKIlcCRr4FlnPr3eAn2wBLZ4OezxUrhXmHZu0FAsnsWMvwDDVpp0qqknXoxxXgfXKqGayoQrVibT
        i8Z0Qp4nG315UrSc86ehd7CnaPNGTZmwcmwY3NkwenMwwZEljH6n5mNMz55ATfuH7MFs9I0cgpEV5Q5k
        QD2VBpU2E126XHRq89A5no1uca3j9WQe+sbTYbYflUI16yGrXrLMf9s6l8mdgFfvi/6lWH3CqHevSyYh
        jS0frkQVrIulWLnWCvNCOUwRKisZs8yfxfrNRpZzCaPYScazfI6XPOms3LEzkr3e8TTYQkUYsWSjZ/Iw
        rWIlRmYz+VCEvz2FMY4ew9xJ9Kp/BYOH89d4nNn1FEaNtIIcIyOcz3p7Nk5X/gQTthOobP4FJi3pNP+n
        OFdpIsIZsPuPSzAOH90Ul83Le7ETmJWtZ3JnwOw+AYs3C7MugvUch4UPQFkls5ufdEvAGwS8eb+DIlND
        s9BENsuxsN/A0SNO889RgasRYX+ucgRZwwzYHB2OxTNwLBSzZzl2KEyR7VJm0zxZquIzswQQ4gjSOXP4
        UM7ITKq1ZvDn8mHikxcGQ+x+Vo6VJegm8w4KlZ0PcVB3jMxmYkh3lNqRLb2whQ/KJMs0k4DSCSiDzGXD
        5DoBM183EaTRmQaLAOzK4H4cJkc6QafJzymr9wj0k85UkGeeXWe23WK43+D1yvVWGd+SzLRJxjsR0lfF
        2OGMXeYuTiiEUC1TmWMXUqNnfrecIZ49TDWe36qgaInTiTIKWJk0Ee4lqjDL30tG3TQbIqx7GdSd7FVb
        RIgVZ++86N18jkf2MlXWRWvoiAhreFLOVVuQJoJf3ug8+hWLBCkYFAAFcOcxuVscXK50CXrWdZzmh4Dj
        NP6bD7pl4hF/C0reZLLhWr3eCHOkjOGgDqYgWfOIEEB292kwKExLnLHCUCyR8YWdVLQToT26RXHi+JkX
        iixSj/w7T4U8Z6ruOITi+l+ivv8Q2tVH0cN+a1MdRn33R+gdTUdx7S/IogjtedL0OwjWSatp56SwE6TD
        nyUV10HggvWWgQ+hGj8E1eSv2QJp0OjTMG0lcOcJssqHYE+H1Xlc9rIALFhXlu+Qzfsd8sQicZuAmWHX
        xIEaAbtXqbSb52FfLIMldJZsVSG+L9iskrN2SR7FiHl7Xp5MRAk0yrETZfKJbKXAi+uwjHkl6FD/Gk3d
        H6J18DCGTccwbDiOnuEj6FAdkUJU1f5LgslhaM8n0DwCFCWfLW2hneAdwZT4CODD08fRMfwRujW/Qv/Y
        Ycyw19U6ih3t6SxBmu3HYbAe456eWs50lrsoaQH4birAJ242M+q1sHybyXQLy7oZies1WL1aI/t2VYT5
        veqUsSDQBZqKRZbykti/OqmIibIm+EVGQrGLso5uiL/kkWnO3cBKCb0xd+moUibDO89d9G5QGI2TvBZl
        LHwwV0C4JMY7wTaXnX1qF8IklNfL3XMCViFKVHEDgRlFvzpFOad6VyyLncAdH8PgoGit3O6S51LixDF5
        vR3hnXp64kbO2SZEdli++/U0DeJgrQreZXEScR4hcXIoSpjzVjAZYhx0RopYviX0v/TCq7SIy5yvElwp
        TQwdFVXdFj7FPi6SASIoFJ0W0itKmAHdzdkrEo1bRjmqdYBMigjpz5Hl7KQvdotrMVMZSEzuTIwYTmBY
        n4Exqrpq4ii0xjRMMHQMa49gVH8UM3b2syNdsi3K3OgUJS1OF+91yrOolWtNGDRmS0AuOi0b57E4MjUF
        irif4z+eBl+iAlqXGEW0fwtnKDRFklk1M2wwfhoGF0cC3xO7wZUD7WwW2tQfy883DaRJPyvOllz8OTGL
        HQGx8qmguewxAZDvS1Yz6IwyyWpWSqwEsz7BbobczWSruf8I+//X6Bo9jpqOIxjSHkbX2FFUdR5Gbfch
        TFvIMsGarGkw2gT7ZDh+i65Knim3Md41cKTkwpMol5lWsBi/Wg87v9zifhWVMAdxeuQxSxamXXlSZWdo
        OwNkeFB7TObXUVueVGIjZ6GP70+YM9Ax8JEMBX2TaXBwtIhSFm7K4hcrT8Y3K9mz0Ql5w1nSzjokuCw4
        50T/Zsr56mAJO7jb2cPiAdg8QpSozLS6RnsmTOxdwaLhq/412tKkcM3YjhG0AJwhAHf9Ock+XrvFkr6R
        Cu8xlvTylXp5wBbjLryxPHci8yscSaIHRdoRntgTOy0PwJ0EEKBFtJBB34o4AC9AmKHAwZI1s/x8S6mT
        By8jn0xDIoLOi9HDBxzNgjeaK8vZHc6WQiX71icMQ3aKVc5b0bt2graxb8UBon42AzpLBsYpfkK1BydZ
        ylNHMc5KNBKwheVskKDFPavMceIvSoy9S4a/TNygQov/mkCxWhZnU2Q2tfja1QY5d5cpWGIkxfdrU0GB
        aWjpYiXHUjlFqgyLFKmF7XKZhhaoykGmnxBTkIh+vjgDwrJ4EIUyFHg4ehy0lU4KlJtgHaFsGePsQpG5
        O8mq6GUBUrBt9WRKkbILkRKz1yn6M0OyqCd707NHMcWlo/rrjEcIUPTuCQnWRIaNs4e+tLio0tFrrZ/e
        +PtBbBB0kiq9fquV1pHqfK1ezuMkx1OSeTdJlU7snUNyv07+OSS+JxKSGFGVHE/nCFgcnKdmsEhFUXEg
        R4ARhoLQiji1KGQaYkCgw/LO57CPhavKk0ep3qgQrazUSAqLcSR6OUP2r7CNdrGEdRQs02DYPcI5HYGN
        5sLmJnP2I1TiNGk4hEhZbKlyNomxZPuYgI986QkdZ6BI/2+Kyln2VnS/9ZOlK22IXGz68/weU9B+My1l
        I6IXGxDcqUVot4EuqpYqzHnLwC8Ox0O0mmGOnNBGBfzJcvhEthVjJ1lKhWbWpTJ7KXwiwM8tnKLAkVla
        RuGa3CGhxvmpgzVx1hTMl9HN5suXy0JdMAkPzGWllbTQIclFDbFwBJmlNxYuilZSsMwRZCCbBIQZClSq
        f9mzNCFk98+it3Wzaf/SN3nkw/8HnfrqrdClFTsAAAAASUVORK5CYII=
    """.trimIndent().replace("\n", "")
)

@OptIn(ExperimentalEncodingApi::class)
internal val portrait_jpeg = Base64.decode(
    """
        /9j/4QDKRXhpZgAATU0AKgAAAAgABgESAAMAAAABAAEAAAEaAAUAAAABAAAAVgEbAAUAAAABAAAAXgEo
        AAMAAAABAAIAAAITAAMAAAABAAEAAIdpAAQAAAABAAAAZgAAAAAAAABIAAAAAQAAAEgAAAABAAeQAAAH
        AAAABDAyMjGRAQAHAAAABAECAwCgAAAHAAAABDAxMDCgAQADAAAAAQABAACgAgAEAAAAAQAAAHigAwAE
        AAAAAQAAAJmkBgADAAAAAQAAAAAAAAAAAAD/2wCEAAUFBQUFBQkFBQkNCQkJDRENDQ0NERURERERERUa
        FRUVFRUVGhoaGhoaGhofHx8fHx8kJCQkJCkpKSkpKSkpKSkBBgcHCgoKEgoKEiodGB0qKioqKioqKioq
        KioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKv/dAAQACP/AABEIAJkAeAMBIgAC
        EQEDEQH/xAGiAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgsQAAIBAwMCBAMFBQQEAAABfQECAwAE
        EQUSITFBBhNRYQcicRQygZGhCCNCscEVUtHwJDNicoIJChYXGBkaJSYnKCkqNDU2Nzg5OkNERUZHSElK
        U1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6g4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrC
        w8TFxsfIycrS09TV1tfY2drh4uPk5ebn6Onq8fLz9PX29/j5+gEAAwEBAQEBAQEBAQAAAAAAAAECAwQF
        BgcICQoLEQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEK
        FiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeI
        iYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T1
        9vf4+fr/2gAMAwEAAhEDEQA/APapV+dvqaj7YqR8b2+pplcp4o1elMPHANLwo5rnvEWuRaHZPcSHDAcV
        E6igjajRdR2RB4g8T6foEBadw03RUXqf/rV8/wCteKtb1hywHkxDoF9PUmlvXafdretkgOf3anqfYD1/
        lWcIbi5YSXKY7xQL0H+09ZRivikexGmoLliZm/I33DfjzTpby3RCqiTB45P+NS3xhsASw3TYyR2Uf57V
        zyiWXMrjOe57CumKvqS3bQsWkkUTleoY5APH6/SuotVYJvtWQn8DXEmVQflA29BWkt7c2irjBjbplQRV
        Ti2KMkj0jTtRlDiHU0Gz+8o4H4V0ctiEX7VYneo9BXl9jrM28K8SA9gGwrfTPAP447V32jTbh9psmK9m
        jYYIPoR2rimnE3Wp12k62Y1VvwNegQyRzoJIjuVhxXmy2MV8DNANsn8S+tbGi3UmnymzuuYpPun0NKlU
        s/I5MVh+aPMt0dp1o4pwJIx6UvzehrvPFP/Q9rdhvPpzULEqcgVLJ8rt9TU9rBuP2iTG1RXFKSirnkwg
        5OyKszR2Fsbu66/wr/KvGNaR9Yv5LvUf+PW0+Z89C/UL+Fek6vPLeS+aozyEjX+8x4H4Vy+tWElxJFok
        ABji+aZv7zdTXle0cpczPpaGHVOHKjyN431S5OrXi/u1+WGP0HbArXjsmgtmvpRl34Rf7zdv+Aj8q7Q6
        KjTqpHyL1qpqtmbrFqgwGBUD0X/E1p7XobqieQRaXPq96Ui/eKzct/e9W+noPTFUNcSOOYadZj93Hw7D
        +Ju/4DpXst3ZLo2lmzthtnuBgEfwjvj+lcXDoOImlCfKxwP+A10xxCT9Dn+rtrQ87tLLz4XJGMfMPXjj
        /CtvTrFvJW1uBujk+6e+7GRj6jjH0rvbLQUhjQL0JX8s/wCFOXSmSzVz1RwfyOM/lVSxN9gjhrHnP2I2
        zmFhnjjjhl7fjXW6IJLSZJY+Y2GMn+H2Pt/KuivdKLIj47Zx+hosbDadtZSrcyKVCx1sDbB9pjGSv31H
        pWw0cV3GJEwT+hrLtMRbWPbhh7dv04qdBJYXXlg4jk5XPaudMTidTYTF4Aj/AHk4q/kev6VgRl1fzV4P
        f0Iqz9pb0H613QrWVmePVwbcrxP/0fbSuZiAO5q5dsRCtrH93HNMhB3s3vj/APVUNyfLi3H1rwsTP7Is
        DS+0UdPtRJfPLx+4XA9mb/61OttNXynuevmMVX8PStTRoPLsWYjmRj/gK140ijjbJ+SBQg9yOTXKkem5
        2Z59dWSwZXpWTDZL815N91R/+oV1l2rXs/kxL1/z+lZetLGn+jj5YIRlz79h/SovY7Y7KJwd/G9xKHb7
        znCj0Aq/eabDZ2ywDsMfUmrGgQtrGsGUr+6gGR+FbcsAvdZAIPlRfO3p7Cma7O3Yy30tUkhgXruRefXp
        SSaQg01xj7gb/wAd6VsalcxW95EM87w/07j9K0Jgp0GeT+8WP4EirRi20kzjo7RJrGJsZI4P+fyqoLPy
        5BgdgcVe06fEbwE4G7jPuMf0q6f3gifGDgqfqOaBSWplTQG3iJH8Ix/WppkN3pykfeUAritKWHzbM7R2
        /wDrVBpQBtVDf/qHStInNJFWwn3QgntwfY/4Ve+0/SqAjFtfNGDgNzitDcKq5g0f/9L35I/nKjjrWNqs
        pjUAdTyBXRKOXxj/ACa4zWpj9uESnp8ox718zUep24aJ2toPLtIfYZrF1DUI1jW3ztXqf61uyFY7BcHG
        FwD7dK4K8ntra1Oo3o3ZJwPQA4AA+lQ+x04eHNqbGn3CpbSXsgCGT7gPYdB9Mn9K841jXodUuDZWO4xI
        3LY+8w4z7+w9Ki1zX9beJLi1tFit2P7vz32lyBz8g6KAOprO0PXDckNPbRGMruWS3O5GAOMg/XitXRkl
        do1pVIc+56P4cijsNNmlIwX6flxUVjKjfulxulPXPpxV6AQ3FqI4+h6Y71nnTxZv+761gdaine+5nauv
        mai03G0MVXHZV4Fab6jbHSpbZ26NyPTmub1K7WKQLL1NZ8mvaTbwyK43AEbiBx+laxVyKkUopdjPlu4L
        YsI37grj8q6WzuVniV+vzbh/I1xK+IPC8spt3t2gY93Xbn86uLJ/ZQ+02r77U9V7qfb/AAqpwsRdT+E7
        mzkLQvC38ORiodKKgGPj5Wxj61JYbGlkmQ/K+xxjvuH/ANaoNKG65uVH8Jz+TUonJNEmoReXcJJ/n0qL
        cvpWtrMeBuxxXObk9BVmUXof/9P6GnfyVdh/eP6V59fy51LzRyCwI/Ba7bWMeUxTjGa4G9U7N44KjP09
        K+Vmz1cLHQ7jULgR6XGF6lUrnmtPPhSK5QME5HtWvekyR2vORsQ/+O1UdHYblOKXU7KEUoI5PVNB1D7M
        I7Kf5DuwHG7aHG1lBH8LDqD07VyS6Vd6ZZvZjy1Gzy12rsRFJydqj35r0maeVRt44rI8lLqUeb83oK3V
        aWxSwtP4mifww92LOIXZDuPvNjG7HAOPpUmo3jfado+n4VtQwpbxbiMbe1c1f7GmEgrB7m8EjD1WJJlZ
        ipOBkY4rzcPcQieOONSHZSgbnG3tx+f1xXr3lJJw3SuTutMiSdng4rpp1OUxnRU1Z7HIaJpl19oAuYTL
        GjySfvjnd5gxt3f3B6Yrci0e5srJmjO9OjRjpjtg+3Qe1dDaZjXC5J+lbVv8q4ccVVStzKxnRwypv3TM
        8LXQls/JP3kjC/8AfJIH6VpaVui1adMcOG5/H/Csi3CWOruI/uypx9c1s6e2NXY5xn/CsIMzrwsdHq4L
        2270H8q5DK+ldjfgm3kT1UVyvkGtTihoj//U9/vUEsTpjlWrjNRjCWr59dv612DFluZM/dzgVymt4W24
        /vAcV8nUPYw2mhqtIrWlm3sF/wAKVo2YcdKwZLgLpYi/ij2v+BOa3vO2kDHBGaOp1Q+FWMG9jkTO2sbS
        ppft5iZfpXZ3XkyRbzjrUNvp0UeZOAx/Si2p1KouTVFp42DsrSLnHCZGR+FYt3bqo+bgVBqmgadqFyt5
        clhNH910OGGPpSas3nwiNHIA4z3p2FDQoRqd3yH5RXO6kSbo449Kt6fpMGmeYbeRm8w5bcc/zqV44Tc+
        Y3Q05KxpBq9hlhCxUEir83yrip1aKNBt6VnTzK/TtU30LtroYd/MsdxDO3HzbRXQWhJ1IEd8dK4PxTLt
        lsoV4/eZ/XFdvpMnnXkAHfaa0hG0Uzz8U7vQ7XUtiIV9CBWHlPSr2pT7pCnvmsrePatlseckf//V98vA
        PPKj+In8s1yerfvJIoUx+85+g6D9K6m7UvcuyepUVwWsXKQTTXbfdiG1R79K+UluevQWhg3eqRpqxsd3
        +sjIz/1zXivQtMlS90+GdD95B/hXz1qtwZsXIcpMmefr2r034Xaz9v0mWylPz2sm0f7rcr/hQoPludk7
        J2R2d5HNHMjhd4UHC+9Z76zbwHFwrQnoQw4H49K6eZAwHtWXcWUdzw65pWRpCcX8Rgy6nYyZKzAj1FYc
        +r2oO15Vo1rw7EY/MiGyQf3eM/hXGNpeGO8Z9/8ACqSVz0o0abheLOnXVbIEjzV9gahe/wBPf935itu4
        AWsCLRoXf7gwO5FdLDY2sMWyNQPwrRpHJKKWxBBJMpeBySFwVb2PY+4qVAxbPapYkKZT1qRk2CsGVF6H
        n/i6XZqNrj+Hmu/0J9skcx/gH/1q8k8SX6zeKBAPuwKhP13DivVbGKSBWR+Nvf2rr5bQieXOScpGtPce
        Y6nplTUWRVe5j8qOKRR0qD7U3pUmFj//1vf7nbFDJKOoyF/3jxXjviaT5fsqdARk+5New36fuSOwJrxv
        UozNOW/2h+Qr5SW57OG+E4HUodqf5+lT+AbqbTNfXb9y4+Rx/Ij6YrU1KA7Dge1O0fTzDdpcdCuMD3rZ
        T91o35NUe9ZDDPY1XJ2Ag1KE8yISxHHGarm4jwRWA0uxkXp3DjpXOzrtbIVSPpXSXEgKnaBisObgZIoO
        2CfKZzBf4VqMHFK1wgJGOlVJLmJeRVXFylvp89ZGr6nHYWpmP3sfKvv2qwsr3D7IuB61yPi8CONYx170
        oRvJIU3yxPKDI8891cyZLswbP+6a+l9PK3NnHP186JX/ADA/rXzdabT2/wA//qr6P8P25h0zT0btCgPt
        uWvUxOljwqWpemG618o/8s1Xn2xmsTy/cfpXT3MQguFWTpJ8n+FSfYLb1FcaZsf/1/fdYIELfXArzKeE
        b2c9q9C1Y52p/tGuYazMrbccGvk5bnt4de4chd2TbQSK437eya5bx54VwPY9iMV7Zd2Me9Y1HavFfF+h
        XujahDq8SboC4LHH3T2z9a6KcL6HRzWVz6A06QmPGe1Mmtllz2Nct4c16yvLZNsgz0rsFcPnb2rn8hu8
        XdGXDpaBG3c1i3un9UDYFdg0qbD2xXPXzhV60jWlKTepxt1aL5RYE7hwfesdIWJxiugldSSOtQ+UOoAp
        o6AtYxElec+L3YsT+VeoKhVMngCvMvFoknnTT9PXzLiY7EUeuP0xW1Fe+jmrP3Gc94UtILm42GMGOEb3
        Y89Owr3+zg2aXC69wP0NcZovhmPQtL8iQo8rIFfB9eOK764lit1S2HCoFT8hz+tb15XZwxhypIg1PbPb
        K3fg/lxXP7G960Le5LXJsX5Dqcf7w/8ArVc/s/8A2D+VZmW2h//Q9mkcTPtzyrZH54qybcfL7f5NW4f9
        cf8Ae/rWzJ938K+X5T1Pa2skjIhhj+0DPVhgVbvNJt7mF43UFGG1gehH0q+v/H1H9a2P4TXRCJhOu01Y
        +atb+Ht7pshu/DbFVzkxE9P90/0rnbPxzf6Nc+VqqFcdQeK+otT/AOPZvpXiHj7/AF0H+7VckZbnbTxL
        cNja0zxLpmsRB4JlBI6cU28aMr8rA1x/hP8A1lelSfdFcc4crsdNOvpdI8/O1SSW71BLq1hax5llUY7Z
        Fdlef6v8a4qT/j7etadK7sKWK8immpanrPlx6NDtjY8zSDEaj6/4V3Hh7wvaaKTdylnv5B88/BH0QdhX
        R+H/APkB2f8A1zFdPH0X6GuhRUdEcs67e5wusx4t/ObGeD096424vftFwpzhVU/nXrmq/wDHofwriz/r
        P+AmspouNVcuxx8VwItShdmAwyHn8v8A61dx/a9v/wA9E/Os24/1qfh/I0tOxzuZ/9k=
    """.trimIndent().replace("\n", "")
)

internal val ds_certificate =
    """
        -----BEGIN CERTIFICATE-----
        MIICnzCCAiagAwIBAgIRAK5pCRasa9Cm12ynr2MPrVgwCgYIKoZIzj0EAwIwOTELMAkGA1UEBhMC
        VVQxKjAoBgNVBAMMIU9XRiBJZGVudGl0eSBDcmVkZW50aWFsIFRFU1QgSUFDQTAeFw0yNDAyMjcx
        NTI1MjVaFw0yNTAyMjcxNTI1MjVaMDcxKDAmBgNVBAMMH09XRiBJZGVudGl0eSBDcmVkZW50aWFs
        IFRFU1QgRFMxCzAJBgNVBAYTAlVUMFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE/FxFTCnF+F4M
        ax9eeu/M47j7dcW4BDKrGZ/CwQ9WLpiyJzal3PimJaEoCYWUl0z8DQg+Tzk8nGmZqWLD0GqUiaOC
        AQ8wggELMB0GA1UdDgQWBBREp3sbCs5lMIIFus7Yo9xkCkTZPzAfBgNVHSMEGDAWgBQsZQWHnU2J
        b6IDpjEUerKmy0DNzzAOBgNVHQ8BAf8EBAMCB4AwFQYDVR0lAQH/BAswCQYHKIGMXQUBAjBUBgNV
        HR8ETQRLMEkwR6BFoEOGQWh0dHBzOi8vZ2l0aHViLmNvbS9vcGVud2FsbGV0LWZvdW5kYXRpb24t
        bGFicy9pZGVudGl0eS1jcmVkZW50aWFsMEwGA1UdEgRFBEOGQWh0dHBzOi8vZ2l0aHViLmNvbS9v
        cGVud2FsbGV0LWZvdW5kYXRpb24tbGFicy9pZGVudGl0eS1jcmVkZW50aWFsMAoGCCqGSM49BAMC
        A2cAMGQCMGy42VCAgv1x98B/AP7oRnhhgnd2wnmREtry4rHOD3RbYTUkBOQW78y00dIiPc+KMgIw
        WM3k3hqLgTgVRTUOzRAbJCiGTIz5C+xwdPrNyMyTPCwakoE/T3cHZh30RqE57G0Q
        -----END CERTIFICATE-----
    """.trimIndent()

internal val ds_private_key =
    """
        -----BEGIN PRIVATE KEY-----
        ME0CAQAwEwYHKoZIzj0CAQYIKoZIzj0DAQcEMzAxAgEBBCCtMDPe8S5YTRPVbFU0YY4FeKcFceCN
        7fjEmeekA1Nwk6AKBggqhkjOPQMBBw==
        -----END PRIVATE KEY-----
    """.trimIndent()