import java.io.File;

public class Main {
	static void DirectoryPrint(File[] arr, int index, int level)
	{
		if (index == arr.length)
			return;

		for (int i = 0; i < level; i++)
			System.out.print("\t");

		if (arr[index].isFile())
			System.out.println(arr[index].getName());

		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName()+ "]");

			DirectoryPrint(arr[index].listFiles(), 0,level + 1);
		}
		DirectoryPrint(arr, ++index, level);
	}

	public static void main(String[] args)
	{
		String path = "C:\\Users\\HP\\OneDrive - New\\Desktop";
		File dir = new File(path);

		if (dir.exists() && dir.isDirectory()) {
			File arr[] = dir.listFiles();
			System.out.println(
				"Files and Folders in directory : " + dir);

			DirectoryPrint(arr, 0, 0);
		}
	}
}
