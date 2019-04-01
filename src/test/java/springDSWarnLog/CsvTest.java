package springDSWarnLog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvTest {

	public static void main(String args[]) {
		File file = new File ("C:\\Users\\cy\\Downloads\\dummy.csv");
		String oldFileBasePath = "C:\\Users\\cy\\Downloads\\oldSystem";
		List<CsvData> dataList = new ArrayList<CsvData> ();
		CsvData csvData = null;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			String line = "";
			while ((line=bufferReader.readLine())!=null) {
				String[] arrayLine = line.split(",");
				csvData = new CsvData(arrayLine[0],arrayLine[1],arrayLine[2],arrayLine[3],arrayLine[4]);
				dataList.add(csvData);
			}
			Collections.sort(dataList);

			for (CsvData temp:dataList) {
				String tempFolder = oldFileBasePath + "\\"+ temp.getOldId();
				File tempFolderFile = new File(tempFolder);
				if (tempFolderFile.isDirectory()) {
					String[] fileList = tempFolderFile.list();
					for (int i=0;i<fileList.length;i++) {
						File subFolder = new File(tempFolderFile+"\\"+fileList[i]);
						File subFolderFile = new File(tempFolderFile+"\\"+fileList[i]+"\\"+subFolder.list()[0]);
						System.out.println(subFolderFile.getName());
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
