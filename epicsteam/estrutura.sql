DROP DATABASE IF EXISTS steamdb; -- Apaga o banco de dados (CUIDADO)
CREATE DATABASE steamdb; 
-- Banco de dados é o local que será armazenado as múltiplas tabelas
USE steamdb;
-- Tabela é o local onde será armazenado os múltiplos registros
CREATE TABLE categorias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200)
);
-- PRIMARY KEY é uma chave primária (será única)
-- AUTO_INCREMENT é utilizado para definir um código sequencia automagicamente
-- VARCHAR é o tipo utilizado para texto e 200 é a qtd máxima de caracteres 
-- que pode armazenar

CREATE TABLE softwares (
	id INT PRIMARY KEY AUTO_INCREMENT,
    id_categoria INT NOT NULL,
    nome VARCHAR(150) NOT NULL,
    url VARCHAR(100),
	-- Criando o relacionamento da tabela de softwares com a tabela de categorias
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

INSERT INTO categorias (nome) VALUES
("Programação"),
("Engenharia"),
("Saúde");




-- Inserindo 70 softwares para a categoria "Programação" (id_categoria = 1)
INSERT INTO softwares (id_categoria, nome, url) VALUES
(1, 'Visual Studio Code', 'https://code.visualstudio.com/'),
(1, 'Eclipse', 'https://www.eclipse.org/'),
(1, 'PyCharm', 'https://www.jetbrains.com/pycharm/'),
(1, 'Sublime Text', 'https://www.sublimetext.com/'),
(1, 'Atom', 'https://atom.io/'),
(1, 'IntelliJ IDEA', 'https://www.jetbrains.com/idea/'),
(1, 'NetBeans', 'https://netbeans.apache.org/'),
(1, 'Xcode', 'https://developer.apple.com/xcode/'),
(1, 'Brackets', 'http://brackets.io/'),
(1, 'Android Studio', 'https://developer.android.com/studio/'),
(1, 'WebStorm', 'https://www.jetbrains.com/webstorm/'),
(1, 'Notepad++', 'https://notepad-plus-plus.org/'),
(1, 'Jupyter Notebook', 'https://jupyter.org/'),
(1, 'RStudio', 'https://rstudio.com/'),
(1, 'BlueJ', 'https://www.bluej.org/'),
(1, 'Geany', 'https://www.geany.org/'),
(1, 'Spyder', 'https://www.spyder-ide.org/'),
(1, 'CLion', 'https://www.jetbrains.com/clion/'),
(1, 'Vim', 'https://www.vim.org/'),
(1, 'Emacs', 'https://www.gnu.org/software/emacs/'),
(1, 'Code::Blocks', 'http://www.codeblocks.org/'),
(1, 'Dev C++', 'https://sourceforge.net/projects/orwelldevcpp/'),
(1, 'Qt Creator', 'https://www.qt.io/qt-creator'),
(1, 'Brackets', 'http://brackets.io/'),
(1, 'RubyMine', 'https://www.jetbrains.com/ruby/'),
(1, 'Xamarin Studio', 'https://visualstudio.microsoft.com/xamarin/'),
(1, 'Coda', 'https://panic.com/coda/'),
(1, 'SlickEdit', 'https://www.slickedit.com/'),
(1, 'Sublime Merge', 'https://www.sublimemerge.com/'),
(1, 'Notepad2', 'https://www.flos-freeware.ch/notepad2.html'),
(1, 'ReSharper', 'https://www.jetbrains.com/resharper/'),
(1, 'Telerik', 'https://www.telerik.com/products/aspnet-ajax.aspx'),
(1, 'JDeveloper', 'https://www.oracle.com/tools/jdeveloper/'),
(1, 'Xojo', 'https://www.xojo.com/'),
(1, 'Komodo IDE', 'https://www.activestate.com/products/komodo-ide/'),
(1, 'SharpDevelop', 'https://github.com/icsharpcode/SharpDevelop'),
(1, 'CodeLite', 'https://codelite.org/'),
(1, 'MonoDevelop', 'https://www.monodevelop.com/'),
(1, 'Zend Studio', 'https://www.zend.com/products/zend-studio'),
(1, 'HaxePunk', 'http://haxepunk.com/'),
(1, 'Pinegrow', 'https://pinegrow.com/'),
(1, 'CodePen', 'https://codepen.io/'),
(1, 'Replit', 'https://replit.com/'),
(1, 'Codenvy', 'https://www.eclipse.org/codenvy/'),
(1, 'JSFiddle', 'https://jsfiddle.net/'),
(1, 'Glitch', 'https://glitch.com/'),
(1, 'Gitpod', 'https://www.gitpod.io/'),
(1, 'Thonny', 'https://thonny.org/'),
(1, 'PHPStorm', 'https://www.jetbrains.com/phpstorm/'),
(1, 'Codelobster', 'https://www.codelobster.com/'),
(1, 'Xojo IDE', 'https://www.xojo.com/'),
(1, 'SikuliX', 'http://www.sikulix.com/'),
(1, 'AppCode', 'https://www.jetbrains.com/objc/'),
(1, 'NetBeans IDE', 'https://netbeans.apache.org/');

-- Inserindo 70 softwares para a categoria "Engenharia" (id_categoria = 2)
INSERT INTO softwares (id_categoria, nome, url) VALUES
(2, 'AutoCAD', 'https://www.autodesk.com/products/autocad/overview'),
(2, 'SolidWorks', 'https://www.solidworks.com/'),
(2, 'MATLAB', 'https://www.mathworks.com/products/matlab.html'),
(2, 'Revit', 'https://www.autodesk.com/products/revit/overview'),
(2, 'Fusion 360', 'https://www.autodesk.com/products/fusion-360/overview'),
(2, 'Inventor', 'https://www.autodesk.com/products/inventor/overview'),
(2, 'Simulink', 'https://www.mathworks.com/products/simulink.html'),
(2, 'ANSYS', 'https://www.ansys.com/'),
(2, 'Blender', 'https://www.blender.org/'),
(2, 'PTC Creo', 'https://www.ptc.com/en/products/creo'),
(2, 'SketchUp', 'https://www.sketchup.com/'),
(2, 'Fusion 360', 'https://www.autodesk.com/products/fusion-360/overview'),
(2, 'Rhino', 'https://www.rhino3d.com/'),
(2, 'AutoCAD Electrical', 'https://www.autodesk.com/products/autocad-electrical/overview'),
(2, 'CATIA', 'https://www.3ds.com/products-services/catia/'),
(2, 'CATIA Composer', 'https://www.3ds.com/products-services/catia/catia-composer/'),
(2, 'Simul8', 'https://www.simul8.com/'),
(2, 'MSC Adams', 'https://www.mscsoftware.com/product/adams'),
(2, 'Tecnomatix', 'https://www.siemens.com/plm/tecnomatix/'),
(2, 'Siemens NX', 'https://www.plm.automation.siemens.com/global/en/products/nx/'),
(2, 'AutoCAD Civil 3D', 'https://www.autodesk.com/products/autocad-civil-3d/overview'),
(2, 'OpenSCAD', 'https://www.openscad.org/'),
(2, 'FreeCAD', 'https://www.freecadweb.org/'),
(2, 'HyperWorks', 'https://www.altair.com/hyperworks'),
(2, 'Altair Inspire', 'https://www.altair.com/inspire/'),
(2, 'LabVIEW', 'https://www.ni.com/en-us/shop/labview.html'),
(2, 'Solid Edge', 'https://www.solidedge.com/'),
(2, 'COMSOL Multiphysics', 'https://www.comsol.com/comsol-multiphysics'),
(2, 'OpenModelica', 'https://www.openmodelica.org/'),
(2, 'MapleSim', 'https://www.maplesoft.com/products/MapleSim/'),
(2, 'AutoCAD Mechanical', 'https://www.autodesk.com/products/autocad-mechanical/overview'),
(2, 'ArchiCAD', 'https://www.graphisoft.com/archicad/'),
(2, 'Navisworks', 'https://www.autodesk.com/products/navisworks/overview'),
(2, 'Dynamo Studio', 'https://www.autodesk.com/products/dynamo-studio/overview'),
(2, 'Revit MEP', 'https://www.autodesk.com/products/revit/overview'),
(2, 'BIM 360', 'https://www.autodesk.com/bim-360'),
(2, 'Tekla Structures', 'https://www.tekla.com/products/tekla-structures'),
(2, 'AutoCAD Plant 3D', 'https://www.autodesk.com/products/autocad-plant-3d/overview'),
(2, 'Hec-RAS', 'https://www.hec.usace.army.mil/software/hec-ras/'),
(2, 'Civil 3D', 'https://www.autodesk.com/products/autocad-civil-3d/overview'),
(2, 'Altium Designer', 'https://www.altium.com/'),
(2, 'Revit Architecture', 'https://www.autodesk.com/products/revit/overview'),
(2, 'STAAD Pro', 'https://www.bentley.com/en/products/brands/staad'),
(2, 'Abaqus', 'https://www.3ds.com/products-services/simulia/products/abaqus/'),
(2, 'LabVIEW', 'https://www.ni.com/en-us/shop/labview.html'),
(2, 'Nastran', 'https://www.altair.com/nastran'),
(2, 'Pro/Engineer', 'https://www.ptc.com/en/products/cad'),
(2, 'Mathcad', 'https://www.ptc.com/en/products/mathcad');

-- Inserindo 70 softwares para a categoria "Saúde" (id_categoria = 3)
INSERT INTO softwares (id_categoria, nome, url) VALUES
(3, 'MedCalc', 'https://www.medcalc.org/'),
(3, 'SageMath', 'https://www.sagemath.org/'),
(3, 'Minitab', 'https://www.minitab.com/'),
(3, 'GraphPad', 'https://www.graphpad.com/'),
(3, 'MATLAB', 'https://www.mathworks.com/products/matlab.html'),
(3, 'EpiInfo', 'https://www.cdc.gov/epiinfo/index.html'),
(3, 'SPSS', 'https://www.ibm.com/products/spss-statistics'),
(3, 'Stata', 'https://www.stata.com/'),
(3, 'MedLine', 'https://pubmed.ncbi.nlm.nih.gov/'),
(3, 'Pharmacopeia', 'https://www.usp.org/'),
(3, 'PsycINFO', 'https://www.apa.org/pubs/databases/psycinfo'),
(3, 'MATLAB', 'https://www.mathworks.com/products/matlab.html'),
(3, 'Python', 'https://www.python.org/'),
(3, 'RStudio', 'https://rstudio.com/'),
(3, 'JMP', 'https://www.jmp.com/en_us/home.html'),
(3, 'LabVIEW', 'https://www.ni.com/en-us/shop/labview.html'),
(3, 'Labster', 'https://www.labster.com/'),
(3, 'OpenMRS', 'https://openmrs.org/'),
(3, 'Tableau', 'https://www.tableau.com/'),
(3, 'QlikView', 'https://www.qlik.com/us/products/qlikview'),
(3, 'Kaggle', 'https://www.kaggle.com/'),
(3, 'OpenClinica', 'https://www.openclinica.com/'),
(3, 'BioStat', 'https://www.biostat.com/'),
(3, 'SAS', 'https://www.sas.com/en_us/software/stat.html'),
(3, 'NVivo', 'https://www.qsrinternational.com/nvivo-qualitative-data-analysis-software/home'),
(3, 'Medscape', 'https://www.medscape.com/'),
(3, 'CureMetrix', 'https://www.curemetrix.com/'),
(3, 'OncoKB', 'https://www.oncokb.org/'),
(3, 'Geneious', 'https://www.geneious.com/'),
(3, 'BioRad', 'https://www.biorad.com/'),
(3, 'ChemDraw', 'https://www.perkinelmer.com/category/chemdraw'),
(3, 'VMD', 'https://www.ks.uiuc.edu/Research/vmd/'),
(3, 'EndNote', 'https://endnote.com/'),
(3, 'Bioconductor', 'https://bioconductor.org/'),
(3, 'Visio', 'https://www.microsoft.com/en-us/microsoft-365/visio/flowchart-software'),
(3, 'MedCalc', 'https://www.medcalc.org/'),
(3, 'OmniGraffle', 'https://www.omnigroup.com/omnigraffle'),
(3, 'GraphPad Prism', 'https://www.graphpad.com/'),
(3, 'SPSS', 'https://www.ibm.com/products/spss-statistics'),
(3, 'SciPy', 'https://www.scipy.org/'),
(3, 'Anaconda', 'https://www.anaconda.com/'),
(3, 'EndNote', 'https://endnote.com/'),
(3, 'BioAnalysis', 'https://www.bioanalysis-zone.com/'),
(3, 'GeneMapper', 'https://www.thermofisher.com/'),
(3, 'EpiInfo', 'https://www.cdc.gov/epiinfo/index.html'),
(3, 'PaxGene', 'https://www.preanalytix.com/'),
(3, 'SmartCat', 'https://www.smartcat.com/'),
(3, 'Transcriber', 'https://transcriber.sourceforge.net/'),
(3, 'BioEdit', 'http://www.mbio.ncsu.edu/BioEdit/bioedit.html');







SELECT * FROM categorias;
SELECT * FROM softwares;

SELECT 
	s.id,
    s.nome,
    s.id_categoria,
    categorias.nome AS 'categoria'
    FROM softwares AS s
    INNER JOIN categorias ON (s.id_categoria = categorias.id);