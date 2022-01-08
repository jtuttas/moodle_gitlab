# Moodle & Github/Gitlab
Dieses Repository realisiert folgende Funktionalität:
- Markdown Dateien (.md), die sich im Ordner **docs** befinden, werden als pdf Dateien exportiert und finden sich dann im Ordner **pdfs**.
- Draw.io Grafiken (.drawio) werden gewandelt nach SVG.
- Umlet Dateien (.uxf) werden gewandelt nach SVG.

Wenn in Github auch noch *pages* aktiviert wurden, dann werden die Markdown Dateien zusätzlich noch nach html exportiert und können über https://{github Benutzer name}.github.io/{Name des Repositories}/docs/bsp.html abgerufen werden. Wobei bsp.md die zugehörige Markdown Datei ist.

## Moodle Kurs mit weiteren Ideen
Der zugehörige Kurs findet sich [hier](https://moodle.mm-bbs.de/moodle/course/view.php?id=2659)

## Installation
Um diese Funktionalität zu nutzen muss:
1. das Repository geklont werden und auf github gehostet werden. Will man lieber gitlab verwenden, so kann hier das Repository gespiegelt werden. Der dazu notwendige Personal Access Token für gitlab muss über die Rechte Repository und Actions verfügen.
2. Für Github muss GitHub Pages aktiviert werden.
