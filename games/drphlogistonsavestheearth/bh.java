/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static String field_d;
    static he[] field_b;
    static nh[] field_c;
    static int field_a;
    static he[] field_e;

    final static void a(byte param0) {
        L0: {
          if (null != ol.field_a) {
            ol.field_a.d(true);
            break L0;
          } else {
            break L0;
          }
        }
        dd.field_g = new ah();
        fb.field_e.a(33, (vg) (Object) dd.field_g);
        if (param0 >= -11) {
          bh.a((byte) 18);
          return;
        } else {
          return;
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    abstract byte[] c(int param0);

    final static void b(int param0) {
        int var1 = -57 % ((param0 - -21) / 51);
        int discarded$0 = -20480;
        e.e();
    }

    abstract void a(byte[] param0, byte param1);

    final static boolean b() {
        return hg.field_ub == lc.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
    }
}
