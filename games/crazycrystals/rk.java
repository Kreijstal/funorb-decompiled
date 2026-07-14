/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    static int field_d;
    static int field_g;
    static dl field_a;
    static String field_f;
    static oi field_c;
    static int field_b;

    final static void a(String[] args, int param1) {
        if (param1 == 3928) {
          L0: {
            if (uo.field_i != null) {
              uo.field_i.field_L.a(args, 0);
              break L0;
            } else {
              break L0;
            }
          }
          if (oh.field_d != null) {
            oh.field_d.field_A.a(args, 0);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_b = -46;
            if (uo.field_i != null) {
              uo.field_i.field_L.a(args, 0);
              break L1;
            } else {
              break L1;
            }
          }
          if (oh.field_d == null) {
            return;
          } else {
            oh.field_d.field_A.a(args, 0);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 54) {
            return;
        }
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (!gl.field_c) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        fl.a(true, param0 + 1);
        hp.field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 54;
        field_e = "Waiting for sound effects";
        field_a = new dl(540, 140);
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = new oi();
    }
}
