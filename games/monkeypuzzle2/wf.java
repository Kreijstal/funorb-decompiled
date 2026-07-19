/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ug {
    int field_l;
    int field_e;
    int field_k;
    int field_f;
    static String field_i;
    static int[] field_m;
    int field_g;
    int field_j;
    static lg field_h;

    final static long a(int param0) {
        if (param0 < 44) {
            return pf.a(0) - d.field_k;
        }
        return pf.a(0) - d.field_k;
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != -47) {
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        da.field_a = param2;
        if (param3 != 8192) {
          wf.a((byte) 47);
          nf.field_M = param1;
          hb.field_n = param0;
          gi.field_a = param4;
          return;
        } else {
          nf.field_M = param1;
          hb.field_n = param0;
          gi.field_a = param4;
          return;
        }
    }

    private wf() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Login: ";
        field_m = new int[8192];
    }
}
