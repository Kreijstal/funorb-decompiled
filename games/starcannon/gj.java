/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj {
    static hl field_e;
    static int[] field_f;
    static char[] field_d;
    static String field_b;
    static ig field_a;
    static int field_c;
    private static String field_z;

    abstract int a(byte param0);

    abstract void a(java.awt.Component param0, boolean param1);

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 15686) {
          gj.a(44);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "gj.D(";
        field_b = "Loading extra data";
        field_d = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
