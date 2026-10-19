# VRAP (Vintage Resourcify API Plugin)

Allows to set Vintage Resourcify CurseForge API token from remote URL.
Uses PolyMC proxy by default.

![logo](images/logo_small.png)

[![hub](images/badges/github.png)](https://github.com/AngelicIndustries/vrap/releases)
[![67](images/badges/67.png)](https://67minecraft.com/mod/vrap)
[![maven](images/badges/maven.png)](https://maven.angelic.industries/#/releases/industries/angelic/vrap/vrap)
![forge](images/badges/forge.png)
[![cord](images/badges/cord.png)](https://discord.gg/xAWCqGrguG)

## Building

VRAP 1.0.2 requires VintageResourcify 1.0.6 or newer, using its new `industries.angelic.vintageresourcify` API. VRAP's own namespace is now `industries.angelic.vrap`; its mod ID and configuration file remain unchanged. Use VRAP 1.0.1 with older VintageResourcify releases.

```sh
./gradlew build
```

Before VintageResourcify 1.0.6 is published, test with its local development jar:

```sh
VERSION=1.0.2 ./gradlew build -PresourcifyDevJar=/absolute/path/to/vintage-resourcify-1.0.6-dev.jar
```

Release VintageResourcify to Angelic Maven before tagging VRAP so CI can resolve the matching dependency.

## Credits

* [GT:NH buildscript](https://github.com/GTNewHorizons/ExampleMod1.7.10)

## License

`WTFPL`.

## Buy me some creatine

* [ko-fi.com](https://ko-fi.com/jackisasubtlejoke)
* Monero: `893tQ56jWt7czBsqAGPq8J5BDnYVCg2tvKpvwTcMY1LS79iDabopdxoUzNLEZtRTH4ewAcKLJ4DM4V41fvrJGHgeKArxwmJ`

<br>

![license](images/WTFPL_badge.png)
