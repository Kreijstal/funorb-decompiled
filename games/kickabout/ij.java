/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ij extends am {
    static String field_n;
    int field_o;
    static String field_r;
    static String field_q;
    static char[] field_p;
    static hd field_s;

    abstract Object a(int param0);

    abstract boolean h(byte param0);

    ij(int param0) {
        ((ij) this).field_o = param0;
    }

    public static void g(byte param0) {
        field_n = null;
        field_q = null;
        field_r = null;
        if (param0 != -46) {
          ij.g((byte) -108);
          field_p = null;
          field_s = null;
          return;
        } else {
          field_p = null;
          field_s = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Quarter-Finals";
        field_q = "increase starting price by <%0>";
        field_r = "Add <%0> to ignore list";
        field_p = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
