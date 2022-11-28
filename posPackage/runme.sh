#!/bin/bash

echo "///////////////////////////////////////////////////////////////////////////////"
echo "//"                  
echo "// Title:            Blockblunder Video POS Terminal"
echo "// Purpose:          COMP2663 Assignment 5"
echo "// "
echo "// Authors:          Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and"
echo "//                   Sean Rogowsky (134715r) <134715r@ACADIAU.CA> "
echo "// Main Class File:  posTerminal.java"
echo "//"
echo "///////////////////////////////////////////////////////////////////////////////"

echo "See staff.java for login credentials."


javac -d ./posPackage/. posPackage/*.java

java posPackage.posTerminal

echo "Thank you, come again."