new File("").eachFileMatch(~/.*.xml/){ file -> println file.getName() }
