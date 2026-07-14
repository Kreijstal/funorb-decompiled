/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wea implements dv {
    static int field_a;
    private int[] field_e;
    static String field_c;
    static gqa[] field_d;
    private boolean[] field_b;

    public final void a(kh param0, boolean param1) {
        ((wea) this).field_b = c.a(8, ((wea) this).field_b, (byte) -84, param0);
        if (param1) {
          return;
        } else {
          ((wea) this).field_e = fa.a(0, param0, 8, ((wea) this).field_e);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            wea.a(105);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        if (param3 > -35) {
          ((wea) this).a(-48, 98, false, (byte) -57);
          ((wea) this).field_b[param0] = param2;
          ((wea) this).field_e[param0] = param1;
          return;
        } else {
          ((wea) this).field_b[param0] = param2;
          ((wea) this).field_e[param0] = param1;
          return;
        }
    }

    final static void a(int param0, int param1, sq param2, boolean param3, java.awt.Component param4, fia param5) {
        nba.a(param5, param2, param1, param0, param0, param4, -45, param3);
    }

    final la a(int param0, int param1, int param2, dt param3) {
        if (param0 != 1024) {
          field_a = 4;
          return tp.a(((wea) this).field_e[param1], ((wea) this).field_b[param1], param3, param2, (byte) -125);
        } else {
          return tp.a(((wea) this).field_e[param1], ((wea) this).field_b[param1], param3, param2, (byte) -125);
        }
    }

    wea() {
    }

    wea(int param0) {
        ((wea) this).field_b = new boolean[param0];
        ((wea) this).field_e = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Asking for or providing contact information";
    }
}
