# Moodle & Github/Gitlab
Dieses Repository realisiert folgende Funktionalität:
- Markdown Dateien (.md), die sich im Ordner **docs** befinden, werden als pdf Dateien exportiert und finden sich dann im Ordner **pdfs**.
- Draw.io Grafiken (.drawio) im Ordner **docs** werden gewandelt nach SVG und im Ordner **docs/images** abgelegt.
- Umlet Dateien (.uxf) im Ordner **docs** werden gewandelt nach SVG und im Ordner **docs/images** abgelegt.

- Wenn in Github auch noch *pages* aktiviert wurden, dann werden die Markdown Dateien zusätzlich noch nach html exportiert und können über https://{github Benutzer name}.github.io/{Name des Repositories}/docs/bsp.html abgerufen werden. Wobei bsp.md die zugehörige Markdown Datei ist. Für github Pages muss sich die Datei **_config.yml** im Wurzelverzeichnis des Repositories befinden. Minimal mit folgendem Inhalt:

```yml
plugins:
  - jekyll-relative-links
relative_links:
  enabled: true
  collections: true
include:
  - README.md
  - bsp.md 
```

- Markdown Dateien im Ordner **docs** werden ferner via *mkdocs* gerendert als html Dateien. Der Output erfolgt default mäßig in den Ordner **site**. Zur Konfiguration muss sich die Dateil **mkdocs.yml** im Wurzelverzeichnis des Repositories befinden. Minimal hat die Datei folgenden Inhalt:

```yml
site_name: MyTest

nav:
    - Home: bsp.md
```

## Beispiele

- [pdf ](https://github.com/jtuttas/moodle_gitlab/raw/master/pdfs/bsp.pdf)
- [github pages](https://jtuttas.github.io/moodle_gitlab/docs/bsp.html)
- [mkdocs](https://jtuttas.github.io/moodle_gitlab/site/bsp/index.html)


## Moodle Kurs mit weiteren Ideen
Der zugehörige Kurs findet sich [hier](https://moodle.mm-bbs.de/moodle/course/view.php?id=2659)

## Installation
Um diese Funktionalität zu nutzen muss:
1. das Repository geklont werden und auf github gehostet werden. Will man lieber gitlab verwenden, so kann hier das Repository gespiegelt werden. Der dazu notwendige Personal Access Token für gitlab muss über die Rechte Repository und Actions verfügen.
2. Für Github muss GitHub Pages aktiviert werden.
