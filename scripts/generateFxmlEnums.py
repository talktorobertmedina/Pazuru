import os

parentDir = os.path.dirname(os.getcwd())

def grabFiles(dir):
    fxmlList = []
    for root, dirs, files in os.walk(dir):
        for file in files:
            if (file.endswith(".fxml")):
                fxmlList.append(file)
    return fxmlList

def genFxmlEnum(fxmlList):
    template = '''\
package app;
    
public class FxmlEnumList {{
    {codeList}
}}
'''

    codeList = []
    for file in fxmlList:
        genFxmlName = file[:-5]
        codeList.append("public static final String {genFxmlNameCap}_FXML = \"/{genFxmlName}.fxml\";".format(genFxmlNameCap=genFxmlName.upper(), genFxmlName=genFxmlName))
    return template.format(codeList=os.linesep.join(codeList))

fxmlList = grabFiles(parentDir + os.sep + "resources")
genJavaFile = genFxmlEnum(fxmlList)

genJavaFilePath = open(parentDir + os.sep + "src" + os.sep + "app" + os.sep + "FxmlEnumList.java", "w")
genJavaFilePath.write(genJavaFile)
genJavaFilePath.close()
