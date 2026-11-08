/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitCountAndDialogHelpers {
    static int field_c;
    static IntrusiveDeque field_a;
    static boolean[] field_d;
    static String textBootsequence;
    static SpriteWidget field_b;
    static String field_f;

    final static int bitCount(int param0, int param1) {
        param0 = ((-1431655766 & param0) >>> 1) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        if (param1 == 522894888) {
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
        BitCountAndDialogHelpers.bitCount(-59, -15);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    public static void releaseStatics(byte param0) {
        textBootsequence = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = -12 / ((-52 - param0) / 62);
    }

    final static void openAccountMessageDialog(int param0) {
        Js5Transport.showLoadingDialog(param0 + 27089);
        DualLinkHashTable.setLoginResultCode(4, -1);
        if (param0 != -26700) {
          field_a = (IntrusiveDeque) null;
        }
    }

    static {
        field_a = new IntrusiveDeque();
        field_d = new boolean[]{false, false, false, false, false, false, false, false, false, true};
        textBootsequence = "Welcome to the Kolonia I Interactive Entertainment System!         <br>What do you want to play?                     <br>      <col=ffffff>Virogrid</col>           <br>Downloading classic Earth game-set...";
        field_f = "Off";
    }
}
