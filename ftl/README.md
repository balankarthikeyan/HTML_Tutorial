# Steps to be followed:

1. Open the directory which you are going to use
2. Inside Directory, just right click on anywhere with shift key pressed
3. You can find, "Open Command Window Here" and choose it
4. And, just copy the below command and paste in to command promt and hit enter
5. Now, jar file will compile the DOM based on the FTL and json we have written and paste the DOM into the template.html
6. You can view the file by placing it in apache.

Note: When we using ftl file, it will cause Cross origin request issue. So, please use apace to see the output.

## Command:

java -jar jar\ftlcompile.jar ftl\sklayout.ftl json\data.json template.html
java -jar jar/ftlcompile.jar ftl/sklayout.ftl json/data.json template.html

---
