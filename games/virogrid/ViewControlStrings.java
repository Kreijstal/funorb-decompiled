/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewControlStrings {
    static Boolean field_b;
    static SpriteWidget field_d;
    static boolean field_c;
    static String textViewcontrolsCentre;
    static int[] field_e;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 >= 2) {
          field_b = null;
          field_e = null;
          textViewcontrolsCentre = null;
          return;
        }
        ViewControlStrings.releaseStatics(106);
        field_b = null;
        field_e = null;
        textViewcontrolsCentre = null;
    }

    static {
        field_z = "ia.A(";
        field_c = true;
        textViewcontrolsCentre = "Reset view";
    }
}
