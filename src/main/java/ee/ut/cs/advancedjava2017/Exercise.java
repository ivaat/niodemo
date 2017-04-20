package ee.ut.cs.advancedjava2017;

public class Exercise {
    /*
     * The niodemo\src\main\resources folder contains many zip files, which in turn contain a precious cat pic collection,
     * passed on through countless generations.
     *
     * Grandmother just got a new laptop and wants to view the collection. She even bought a WinRAR license!
     *
     * Unfortunately she doesn't know how to download several attachments from an email, so you can't just send all zip files.
     * Also, the concept of folders is completely foreign to her, so the carefully categorized folder structure is useless.
     *
     * Therefore we need a program that creates a single merged & flattened zip file:
     * 1) Instead of several zip files, the program must create one archive file named "cats.zip"
     * 2) The zip file must have a flat structure - it must contain no subfolders. All cat pics in the original zip files,
     *    even those that were under subfolders, must be moved to the "first level".
     * 3) The file names must remain the same as in the original zip files.
     *    If this is not possible (for example if several files had the same name), append "(Cat)" to the file name.
     *    For example, the second file named "redcat.jpg" would become "redcat(Cat).jpg".
     *    If a file with this name is also already present, just keep appending the "(Cat)" substring until you arrive at a unique name.
     *    Overwriting any cat pics is not allowed!
     * 4) The program must clean up after itself. The original zip files must not be deleted, all other temporary files must be deleted.
     */
}
