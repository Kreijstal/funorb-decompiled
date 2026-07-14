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
        field_p = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
