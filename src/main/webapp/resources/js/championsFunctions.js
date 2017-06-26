function setOneEnemy() {
    var value = document.getElementById("enemyName").value;
    if (!checkName(value))
        return;
    value = value.replace(value[0], value[0].toUpperCase());
    value = getRealName(value);

    document.getElementById('enemyName').value = value;
    document.getElementById('enemyChampion123').innerHTML = '<input type="submit" name="'
        + "name" + '"' + '/>';
}
function setAlly() {
    var value = document.getElementById("name").value;
    if (!checkName(value))
        return;
    for (var i = 1; i <= 5; i++)
        if (document.getElementById('allyChampion' + i).value.toLowerCase() == value
                .toLowerCase())
            return;
        else if ((document.getElementById('enemyChampion' + i).value
                .toLowerCase() == value.toLowerCase()))
            return;

    value = value.replace(value[0], value[0].toUpperCase());

    for (var i = 1; i <= 5; i++)
        if (document.getElementById('allyChampion' + i).value == "") {
            value = getRealName(value);
            document.getElementById('allyChampion' + i).value = value;
            document.getElementById('allyChampionDiv' + i).innerHTML = value
                + " " + '<input type="radio" name="championRadio" value=' + '"' + value + '"' + '/>';
            return;
        }
};

function setEnemy() {
    var value = document.getElementById("name").value;
    if (!checkName(value))
        return;
    for (var i = 1; i <= 5; i++)
        if (document.getElementById('allyChampion' + i).value.toLowerCase() == value
                .toLowerCase())
            return;
        else if ((document.getElementById('enemyChampion' + i).value
                .toLowerCase() == value.toLowerCase()))
            return;

    value = value.replace(value[0], value[0].toUpperCase());

    for (var i = 1; i <= 5; i++)
        if (document.getElementById('enemyChampion' + i).value == "") {
            value = getRealName(value);
            document.getElementById('enemyChampion' + i).value = value;
            document.getElementById('enemyChampionDiv' + i).innerHTML = value;
            return;
        }
};
function cleanAlly() {
    var value = "";
    for (var i = 1; i <= 5; i++) {
        document.getElementById('allyChampion' + i).value = "";
        document.getElementById('allyChampionDiv' + i).innerHTML = "";
    }
};
function cleanEnemy() {
    for (var i = 1; i <= 5; i++) {
        document.getElementById('enemyChampion' + i).value = "";
        document.getElementById('enemyChampionDiv' + i).innerHTML = "";
    }
};

function getRealName(name) {
    if (name == "Aatrox" || name == "aatrox")
        return "Aatrox";
    if (name == "Ahri" || name == "ahri")
        return "Ahri";
    if (name == "Akali" || name == "akali")
        return "Akali";
    if (name == "Alistar" || name == "alistar")
        return "Alistar";
    if (name == "Amumu" || name == "amumu")
        return "Amumu";
    if (name == "Anivia" || name == "anivia")
        return "Anivia";
    if (name == "Annie" || name == "annie")
        return "Annie";
    if (name == "Ashe" || name == "ashe")
        return "Ashe";
    if (name == "Aurelion Sol" || name == "aurelion sol")
        return "Aurelion Sol";
    if (name == "Azir" || name == "azir")
        return "Azir";
    if (name == "Bard" || name == "bard")
        return "Bard";
    if (name == "Blitzcrank" || name == "blitzcrank")
        return "Blitzcrank";
    if (name == "Brand" || name == "brand")
        return "Brand";
    if (name == "Braum" || name == "braum")
        return "Braum";
    if (name == "Caitlyn" || name == "caitlyn")
        return "Caitlyn";
    if (name == "Camille" || name == "camille")
        return "Camille";
    if (name == "Cassiopeia" || name == "cassiopeia")
        return "Cassiopeia";
    if (name == "Cho'Gath" || name == "cho'Gath" || name == "Cho gath"
        || name == "cho gath")
        return "Cho'Gath";
    if (name == "Corki" || name == "corki")
        return "Corki";
    if (name == "Darius" || name == "darius")
        return "Darius";
    if (name == "Diana" || name == "diana")
        return "Diana";
    if (name == "Dr Mundo" || name == "dr mundo")
        return "Dr Mundo"
    if (name == "Draven" || name == "draven")
        return "Draven";
    if (name == "Ekko" || name == "ekko")
        return "Ekko";
    if (name == "Elise" || name == "elise")
        return "Elise";
    if (name == "Evelynn" || name == "evelynn")
        return "Evelynn";
    if (name == "Ezreal" || name == "ezreal")
        return "Ezreal";
    if (name == "Fiddlesticks" || name == "fiddlesticks")
        return "Fiddlesticks";
    if (name == "Fiora" || name == "fiora")
        return "Fiora";
    if (name == "Fizz" || name == "fizz")
        return "Fizz";
    if (name == "Galio" || name == "galio")
        return "Fizz";
    if (name == "Gankplank" || name == "gankplank")
        return "Gankplank";
    if (name == "Garen" || name == "garen")
        return "Garen";
    if (name == "Gnar" || name == "gnar")
        return "Gnar";
    if (name == "Gragas" || name == "Graves")
        return "Gragas";
    if (name == "Hecarim" || name == "hecarim")
        return "Hecarim";
    if (name == "Heimerdinger" || name == "heimerdinger")
        return "Heimerdinger";
    if (name == "Illaoi" || name == "illaoi")
        return "Illaoi";
    if (name == "Irelia" || name == "irelia")
        return "Irelia";
    if (name == "Ivern" || name == "ivern")
        return "Ivern";
    if (name == "Janna" || name == "janna")
        return "Janna";
    if (name == "Jarvan 4" || name == "jarvan 4")
        return "Jarvan 4";
    if (name == "Jax" || name == "jax")
        return "Jax";
    if (name == "Jayce" || name == "jayce")
        return "Jayce";
    if (name == "Jhin" || name == "jhin")
        return "Jhin";
    if (name == "Jinx" || name == "jinx")
        return "Jinx";
    if (name == "Kalista" || name == "kalista")
        return "Kalista";
    if (name == "Karma" || name == "karma")
        return "Karma";
    if (name == "Karthus" || name == "karthus")
        return "Karthus";
    if (name == "Kassadin" || name == "kassadin")
        return "Kassadin";
    if (name == "Kayle" || name == "kayle")
        return "Kayle";
    if (name == "Kennen" || name == "kennen")
        return "Kennen";
    if (name == "Kha'Zix" || name == "kha'zix" || name == "Kha zix"
        || name == "kha zix")
        return "Kha'Zix";
    if (name == "Kindred" || name == "kindred")
        return "Kindred";
    if (name == "Kled" || name == "kled")
        return "Kled";
    if (name == "Kog'Maw" || name == "kog'maw" || name == "Kog maw"
        || name == "kog maw")
        return "Kog'Maw";
    if (name == "LeBlanc" || name == "leblanc")
        return "LeBlanc";
    if (name == "Lee Sin" || name == "lee sin")
        return "Lee Sin";
    if (name == "Leona" || name == "leona")
        return "Leona";
    if (name == "Lissandra" || name == "lissandra")
        return "Lissandra";
    if (name == "Lucian" || name == "lucian")
        return "Lucian";
    if (name == "Lulu" || name == "lulu")
        return "Lulu";
    if (name == "Lux" || name == "lux")
        return "Lux";
    if (name == "Malphite" || name == "malphite")
        return "Malphite";
    if (name == "Malzahar" || name == "malzahar")
        return "Malzahar";
    if (name == "Maokai" || name == "maokai")
        return "Maokai";
    if (name == "Master Yi" || name == "master yi" || name == "yi"
        || name == "master")
        return "Master Yi";
    if (name == "Miss Fortune" || name == "miss fortune")
        return "Miss Fortune";
    if (name == "Mordekaiser" || name == "Mordekaiser")
        return "Mordekaiser";
    if (name == "Morgana" || name == "morgana")
        return "Morgana";
    if (name == "Nami" || name == "nami")
        return "Nami";
    if (name == "Nasus" || name == "nasus")
        return "Nasus";
    if (name == "Nautilus" || name == "nautilus")
        return "Nautilus";
    if (name == "Nidalee" || name == "nidalee")
        return "Nidalee";
    if (name == "Nocturne" || name == "nocturne")
        return "Nocturne";
    if (name == "Nunu" || name == "nunu")
        return "Nunu";
    if (name == "Olaf" || name == "olaf")
        return "Olaf";
    if (name == "Orianna" || name == "orianna")
        return "Orianna";
    if (name == "Pantheon" || name == "pantheon")
        return "Pantheon";
    if (name == "Poppy" || name == "poppy")
        return "Poppy";
    if (name == "Quin" || name == "quin")
        return "Quin";
    if (name == "Rammus" || name == "rammus")
        return "Rammus";
    if (name == "Rek'Sai" || name == "rek'sai" || name == "Reksai"
        || name == "reksai")
        return "Rek'Sai";
    if (name == "Renekton" || name == "renekton")
        return "Renekton";
    if (name == "Rengar" || name == "rengar")
        return "Rengar";
    if (name == "Riven" || name == "riven")
        return "Riven";
    if (name == "Rumble" || name == "rumble")
        return "Rumble";
    if (name == "Ryze" || name == "ryze")
        return "Ryze";
    if (name == "Sejuani" || name == "sejuani")
        return "Sejuani";
    if (name == "Shaco" || name == "shaco")
        return "Shaco";
    if (name == "Shen" || name == "shen")
        return "Shen";
    if (name == "Shyvana" || name == "Singed")
        return "Shyvana";
    if (name == "Sion" || name == "sion")
        return "Sion";
    if (name == "Sivir" || name == "sivir")
        return "Sivir";
    if (name == "Skarner" || name == "skarner")
        return "Skarner";
    if (name == "Sona" || name == "sona")
        return "Sona";
    if (name == "Soraka" || name == "soraka")
        return "Soraka";
    if (name == "Swain" || name == "swain")
        return "Swain";
    if (name == "Syndra" || name == "syndra")
        return "Syndra";
    if (name == "Tahm Kennch" || name == "tahm kench")
        return "Tahm Kennch";
    if (name == "Taliyah" || name == "taliyah")
        return "Taliyah";
    if (name == "Talon" || name == "talon")
        return "Talon";
    if (name == "Taric" || name == "taric")
        return "Taric";
    if (name == "Teemo" || name == "teemo")
        return "Teemo";
    if (name == "Thresh" || name == "thresh")
        return "Thresh";
    if (name == "Tristana" || name == "tristana")
        return "Tristana";
    if (name == "Trundle" || name == "trundle")
        return "Trundle";
    if (name == "Tryndamere" || name == "tryndamere")
        return "Tryndamere";
    if (name == "Twisted Fate" || name == "twisted fate")
        return "Twisted Fate";
    if (name == "Twitch" || name == "twitch")
        return "Twitch";
    if (name == "Udyr" || name == "udyr")
        return "Udyr";
    if (name == "Urgot" || name == "urgot")
        return "Urgot";
    if (name == "Varus" || name == "varus")
        return "Varus";
    if (name == "Vayne" || name == "vayne")
        return "Vayne";
    if (name == "Veigar" || name == "veigar")
        return "Veigar";
    if (name == "Vel'Koz" || name == "vel'koz" || name == "Vel koz"
        || name == "vel koz" || name == "velkoz")
        return "Vel'Koz";
    if (name == "Vi" || name == "vi")
        return "Vi";
    if (name == "Viktor" || name == "viktor")
        return "Viktor";
    if (name == "Vladmir" || name == "vladmir")
        return "Vladmir";
    if (name == "Volibear" || name == "volibear")
        return "Volibear";
    if (name == "Warwick" || name == "warwick")
        return "Warwick";
    if (name == "Wukong" || name == "wukong")
        return "Wukong";
    if (name == "Xerath" || name == "xerath")
        return "Xerath";
    if (name == "Xin Zhaon" || name == "Xin Zhao")
        return "Xin Zhaon";
    if (name == "Yasuo" || name == "yasuo")
        return "Yasuo";
    if (name == "Yorick" || name == "yorick")
        return "Yorick";
    if (name == "Zac" || name == "zac")
        return "Zac";
    if (name == "Zed" || name == "zed")
        return "Zed";
    if (name == "Ziggs" || name == "ziggs")
        return "Ziggs";
    if (name == "Zilean" || name == "zilean")
        return "Zilean";
    if (name == "Zyra" || name == "zyra")
        return "Zyra";
};

function checkName(name) {
    if (name == "Aatrox" || name == "aatrox")
        return true;
    if (name == "Ahri" || name == "ahri")
        return true;
    if (name == "Akali" || name == "akali")
        return true;
    if (name == "Alistar" || name == "alistar")
        return true;
    if (name == "Amumu" || name == "amumu")
        return true;
    if (name == "Anivia" || name == "anivia")
        return true;
    if (name == "Annie" || name == "annie")
        return true;
    if (name == "Ashe" || name == "ashe")
        return true;
    if (name == "Aurelion Sol" || name == "aurelion sol")
        return true;
    if (name == "Azir" || name == "azir")
        return true;
    if (name == "Bard" || name == "bard")
        return true;
    if (name == "Blitzcrank" || name == "blitzcrank")
        return true;
    if (name == "Brand" || name == "brand")
        return true;
    if (name == "Braum" || name == "braum")
        return true;
    if (name == "Caitlyn" || name == "caitlyn")
        return true;
    if (name == "Camille" || name == "camille")
        return true;
    if (name == "Cassiopeia" || name == "cassiopeia")
        return true;
    if (name == "Cho'Gath" || name == "cho'Gath" || name == "Cho gath"
        || name == "cho gath")
        return true;
    if (name == "Corki" || name == "corki")
        return true;
    if (name == "Darius" || name == "darius")
        return true;
    if (name == "Diana" || name == "diana")
        return true;
    if (name == "Dr Mundo" || name == "dr mundo")
        return true;
    if (name == "Draven" || name == "draven")
        return true;
    if (name == "Ekko" || name == "ekko")
        return true;
    if (name == "Elise" || name == "elise")
        return true;
    if (name == "Evelynn" || name == "evelynn")
        return true;
    if (name == "Ezreal" || name == "ezreal")
        return true;
    if (name == "Fiddlesticks" || name == "fiddlesticks")
        return true;
    if (name == "Fiora" || name == "fiora")
        return true;
    if (name == "Fizz" || name == "fizz")
        return true;
    if (name == "Galio" || name == "galio")
        return true;
    if (name == "Gankplank" || name == "gankplank")
        return true;
    if (name == "Garen" || name == "garen")
        return true;
    if (name == "Gnar" || name == "gnar")
        return true;
    if (name == "Gragas" || name == "Graves")
        return true;
    if (name == "Hecarim" || name == "hecarim")
        return true;
    if (name == "Heimerdinger" || name == "heimerdinger")
        return true;
    if (name == "Illaoi" || name == "illaoi")
        return true;
    if (name == "Irelia" || name == "irelia")
        return true;
    if (name == "Ivern" || name == "ivern")
        return true;
    if (name == "Janna" || name == "janna")
        return true;
    if (name == "Jarvan 4" || name == "jarvan 4")
        return true;
    if (name == "Jax" || name == "jax")
        return true;
    if (name == "Jayce" || name == "jayce")
        return true;
    if (name == "Jhin" || name == "jhin")
        return true;
    if (name == "Jinx" || name == "jinx")
        return true;
    if (name == "Kalista" || name == "kalista")
        return true;
    if (name == "Karma" || name == "karma")
        return true;
    if (name == "Karthus" || name == "karthus")
        return true;
    if (name == "Kassadin" || name == "kassadin")
        return true;
    if (name == "Kayle" || name == "kayle")
        return true;
    if (name == "Kennen" || name == "kennen")
        return true;
    if (name == "Kha'Zix" || name == "kha'zix" || name == "Kha zix"
        || name == "kha zix")
        return true;
    if (name == "Kindred" || name == "kindred")
        return true;
    if (name == "Kled" || name == "kled")
        return true;
    if (name == "Kog'Maw" || name == "kog'maw" || name == "Kog maw"
        || name == "kog maw")
        return true;
    if (name == "LeBlanc" || name == "leblanc")
        return true;
    if (name == "Lee Sin" || name == "lee sin")
        return true;
    if (name == "Leona" || name == "leona")
        return true;
    if (name == "Lissandra" || name == "lissandra")
        return true;
    if (name == "Lucian" || name == "lucian")
        return true;
    if (name == "Lulu" || name == "lulu")
        return true;
    if (name == "Lux" || name == "lux")
        return true;
    if (name == "Malphite" || name == "malphite")
        return true;
    if (name == "Malzahar" || name == "malzahar")
        return true;
    if (name == "Maokai" || name == "maokai")
        return true;
    if (name == "Master Yi" || name == "master yi" || name == "yi"
        || name == "master")
        return true;
    if (name == "Miss Fortune" || name == "miss fortune")
        return true;
    if (name == "Mordekaiser" || name == "Mordekaiser")
        return true;
    if (name == "Morgana" || name == "morgana")
        return true;
    if (name == "Nami" || name == "nami")
        return true;
    if (name == "Nasus" || name == "nasus")
        return true;
    if (name == "Nautilus" || name == "nautilus")
        return true;
    if (name == "Nidalee" || name == "nidalee")
        return true;
    if (name == "Nocturne" || name == "nocturne")
        return true;
    if (name == "Nunu" || name == "nunu")
        return true;
    if (name == "Olaf" || name == "olaf")
        return true;
    if (name == "Orianna" || name == "orianna")
        return true;
    if (name == "Pantheon" || name == "pantheon")
        return true;
    if (name == "Poppy" || name == "poppy")
        return true;
    if (name == "Quin" || name == "quin")
        return true;
    if (name == "Rammus" || name == "rammus")
        return true;
    if (name == "Rek'Sai" || name == "rek'sai" || name == "Reksai"
        || name == "reksai")
        return true;
    if (name == "Renekton" || name == "renekton")
        return true;
    if (name == "Rengar" || name == "rengar")
        return true;
    if (name == "Riven" || name == "riven")
        return true;
    if (name == "Rumble " || name == "rumble")
        return true;
    if (name == "Ryze" || name == "ryze")
        return true;
    if (name == "Sejuani" || name == "sejuani")
        return true;
    if (name == "Shaco" || name == "shaco")
        return true;
    if (name == "Shen" || name == "shen")
        return true;
    if (name == "Shyvana" || name == "Singed")
        return true;
    if (name == "Sion" || name == "sion")
        return true;
    if (name == "Sivir" || name == "sivir")
        return true;
    if (name == "Skarner" || name == "skarner")
        return true;
    if (name == "Sona" || name == "sona")
        return true;
    if (name == "Soraka" || name == "soraka")
        return true;
    if (name == "Swain" || name == "swain")
        return true;
    if (name == "Syndra" || name == "syndra")
        return true;
    if (name == "Tahm Kennch" || name == "tahm kench")
        return true;
    if (name == "Taliyah" || name == "taliyah")
        return true;
    if (name == "Talon" || name == "talon")
        return true;
    if (name == "Taric" || name == "taric")
        return true;
    if (name == "Teemo" || name == "teemo")
        return true;
    if (name == "Thresh" || name == "thresh")
        return true;
    if (name == "Tristana" || name == "tristana")
        return true;
    if (name == "Trundle" || name == "trundle")
        return true;
    if (name == "Tryndamere" || name == "tryndamere")
        return true;
    if (name == "Twisted Fate" || name == "twisted fate")
        return true;
    if (name == "Twitch" || name == "twitch")
        return true;
    if (name == "Udyr" || name == "udyr")
        return true;
    if (name == "Urgot" || name == "urgot")
        return true;
    if (name == "Varus" || name == "varus")
        return true;
    if (name == "Vayne" || name == "vayne")
        return true;
    if (name == "Veigar" || name == "veigar")
        return true;
    if (name == "Vel'Koz" || name == "vel'koz" || name == "Vel koz"
        || name == "vel koz" || name == "velkoz")
        return true;
    if (name == "Vi" || name == "vi")
        return true;
    if (name == "Viktor" || name == "viktor")
        return true;
    if (name == "Vladmir" || name == "vladmir")
        return true;
    if (name == "Volibear" || name == "volibear")
        return true;
    if (name == "Warwick" || name == "warwick")
        return true;
    if (name == "Wukong" || name == "wukong")
        return true;
    if (name == "Xerath" || name == "xerath")
        return true;
    if (name == "Xin Zhaon" || name == "Xin Zhao")
        return true;
    if (name == "Yasuo" || name == "yasuo")
        return true;
    if (name == "Yorick" || name == "yorick")
        return true;
    if (name == "Zac" || name == "zac")
        return true;
    if (name == "Zed" || name == "zed")
        return true;
    if (name == "Ziggs" || name == "ziggs")
        return true;
    if (name == "Zilean" || name == "zilean")
        return true;
    if (name == "Zyra" || name == "zyra")
        return true;
    return false;
};
