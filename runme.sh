#!/bin/bash
ECHO "Hacking the Planet..."

ECHO "///////////////////////////////////////////////////////////////////////////////"
ECHO "//"                  
ECHO "// Title:            Blockblunder Video POS Terminal"
ECHO "// Purpose:          COMP2663 Assignment 4"
ECHO "// "
ECHO "// Authors:          Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and"
ECHO "//                   Sean Rogowsky (134715r) <134715r@ACADIAU.CA> "
ECHO "// Main Class File:  posTerminal.java"
ECHO "//"
ECHO "///////////////////////////////////////////////////////////////////////////////"

ECHO "See staff.java for login credentials."


javac *.java

java posTerminal

rm *.class

ECHO "Thank you, come again."