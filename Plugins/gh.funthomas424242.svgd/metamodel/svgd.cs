SYNTAXDEF svgd
FOR <http://devtool.sourceforge.net/language/svgd>
START SVGModel


OPTIONS{
reloadGeneratorModel="true";
generateCodeFromGeneratorModel="true"; //wichtig um Fehler im Generat zu vermeiden
disableLaunchSupport="false";
usePredefinedTokens="true";
}


TOKENSTYLES {
	"Rechteck" COLOR #7F0055, BOLD;
	"name", "import", "imports", "form" COLOR #7F0055, BOLD;
	"x" COLOR #7F0055, BOLD;
	"y" COLOR #7F0055, BOLD;
	"hoehe" COLOR #7F0055, BOLD;
	"breite" COLOR #7F0055, BOLD;
	"Kreis" COLOR #7F0055, BOLD;
	"radius" COLOR #7F0055, BOLD;
	"SVGModel" COLOR #7F0055, BOLD;
	"fileName" COLOR #7F0055, BOLD;
	"Linie" COLOR #7F0055, BOLD;
	"linien-art", "füllung:" COLOR #7F0055, BOLD;
	"x2" COLOR #7F0055, BOLD;
	"y2" COLOR #7F0055, BOLD;
}


RULES {
SVGModel ::= "SVGModel" "lang-version" version['"','"']
	"fileName" "=" fileName['"','"']  "hoehe" "=" hoehe['"','"']  "breite" "=" breite['"','"'] 
	("imports" imports )? "{"  (elements)+  "}";
Import ::= ("import" importedRessource['"','"'] ".")+ ;
Figure ::= "Figur" "name" "=" name['"','"'] "auf" "x" "=" x['"','"']  "y" "=" y['"','"']  "{"  (forms )+  "}" ;
EmbedForm ::= "form" form['"','"'] "auf" "x" "=" x['"','"']  "y" "=" y['"','"'] ".";
Rechteck ::= "Rechteck" "name" "=" name['"','"'] 
	"{" "hoehe" "=" hoehe['"','"']  "breite" "=" breite['"','"']  areaprops lineprops "}";
Kreis ::= "Kreis" "name" "=" name['"','"'] "{"  "radius" "=" radius['"','"'] areaprops lineprops "}";
Linie ::= "Linie"  "name" "=" name['"','"']   "{"  "x2" "=" x2['"','"']  "y2" "=" y2['"','"'] lineprops "}";
FlaechenStil ::= ("füllung:" fuellung['"','"'])? ("muster:" muster['"','"'])? ;
LinienStil ::= ("linien-dicke" ":" dicke['"','"'])?  ("linien-farbe" ":" farbe['"','"'] )?
	("linien-art" ":" zug[durchgezogen:"durchgezogen", gestrichelt:"gestrichelt", gepunktet:"gepunktet"])? ;
}