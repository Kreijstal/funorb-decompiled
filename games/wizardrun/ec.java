/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static ji field_d;
    static String field_e;
    static o field_b;
    static String[] field_a;
    static int[] field_g;
    static byte[][] field_f;
    static int field_c;
    static String field_h;

    final static void a(kl param0, byte param1, int param2, vi param3) {
        try {
            pe.field_B = ih.a((byte) -109) * param2 / 1000;
            hd.a(param0, -125);
            if (param1 > -61) {
                ec.a(-127);
            }
            uk.a(125, param0);
            ab.a(param0, (byte) 1);
            vf.a(256);
            r.c(350);
            jd.field_f = 0 - pe.field_B;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ec.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = (byte[][]) null;
        field_b = null;
        field_h = null;
        if (param0 > -13) {
          field_e = (String) null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        field_e = "Type your email address again to make sure it's correct";
        field_h = "This entry doesn't match";
        field_f = new byte[1000][];
    }
}
