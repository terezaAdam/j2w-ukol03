[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>

<div class="seznam">
    [#list vizitky as Vizitka]
    <a href="/detail">
        <div class="vizitka">
            <div class="jmeno">${Vizitka.jmeno}</div>
            <div class="firma">${Vizitka.firma}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${Vizitka.ulice}</div>
                    <div>${Vizitka.obecPsc}</div>
                    <div>${Vizitka.celaAdresa}</div>
                </div>
                <div class="kontakty">
                    [#if Vizitka.email?has_content]
                    <div><i class="las la-phone-alt"></i><span>${Vizitka.email}</span></div>
                    [/#if]
                    [#if Vizitka.telefon?has_content]
                    <div><i class="las la-phone-alt"></i><span>${Vizitka.telefon}</span></div>
                    [/#if]
                    [#if Vizitka.web?has_content]
                    <div><i class="las la-globe"></i><span>${Vizitka.web}</span></div>
                    [/#if]
                </div>
            </div>
        </div>
    </a>
    [/#list]
</div>
</body>
</html>