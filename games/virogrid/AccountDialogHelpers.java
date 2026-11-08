/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountDialogHelpers {
    static int field_b;
    static int field_d;
    static Js5Archive field_c;
    static String textBootsequenceHalloween;
    static String field_e;

    final static void closeAccountDialogs(int param0) {
        if (param0 != 18887) {
          textBootsequenceHalloween = (String) null;
          DebouncedValidator.closeAccountDialogs(-116);
          return;
        }
        DebouncedValidator.closeAccountDialogs(-116);
    }

    public static void releaseStatics(int param0) {
        textBootsequenceHalloween = null;
        int var1 = 75 % ((param0 + 52) / 32);
        field_e = null;
        field_c = null;
    }

    static {
        field_b = -1;
        field_d = -1;
        textBootsequenceHalloween = "Welcome to Hallowe'en Virogrid!         <br><col=ffcc00>(10%)   Carving pumpkins...<br><col=ff0000>(40%)   Populating ventilation shafts...<br><col=ffffff>(70%)   Creating ghost image...     <br>   Loading complete!";
        field_e = "Try changing the following settings:  ";
    }
}
