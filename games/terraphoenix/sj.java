/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static fa field_f;
    static int field_b;
    static ci[] field_e;
    static lg[] field_a;
    static volatile boolean field_c;
    static int[] field_g;
    static String field_d;

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 != 0) {
          sj.a(53);
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(boolean param0, byte param1, boolean param2, String param3) {
        dh.g((byte) -124);
        jl.field_I.b(false);
        mb.field_s = new uh(ol.field_Hb, (String) null, qi.field_b, param2, param0);
        bj.field_f = new jg(jl.field_I, (gl) (Object) mb.field_s);
        jl.field_I.a((gl) (Object) bj.field_f, (byte) -1);
        if (param1 != 68) {
            field_a = null;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        if (param1 != 20) {
          return 29;
        } else {
          return og.field_f.a(param6, param5, param2 - 20, param3 + -param5, 480, param0, param7, 0, 0, param4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = new lg[4];
        field_d = "Create your own free Jagex account";
        field_g = new int[128];
    }
}
