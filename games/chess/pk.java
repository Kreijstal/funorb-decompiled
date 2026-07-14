/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pk {
    static String field_h;
    static boolean field_g;
    static boolean field_j;
    static c field_a;
    boolean field_e;
    boolean field_f;
    boolean field_d;
    int field_i;
    int field_c;
    int field_k;
    int field_l;
    static int field_b;

    public static void b(byte param0) {
        field_h = null;
        field_a = null;
        if (param0 != -100) {
            pk.b((byte) -25);
        }
    }

    final static void a(int param0, int param1, fd param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -126);
        var3.c(5, (byte) -108);
        var3.c(0, (byte) -120);
        int var4 = -54 / ((-22 - param1) / 58);
        var3.b(param2.field_j, 114);
        var3.c(param2.field_k, (byte) -111);
        var3.c(param2.field_m, (byte) -62);
    }

    boolean a(byte param0) {
        if (param0 == -9) {
          if (hn.field_k >= ((pk) this).field_i) {
            if (((pk) this).field_k <= rf.field_b) {
              if (((pk) this).field_l + ((pk) this).field_i >= hn.field_k) {
                if (((pk) this).field_c + ((pk) this).field_k < rf.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 101 / ((23 - param1) / 42);
        cb.field_a = param0;
        if (!(da.field_F == ug.field_b)) {
            var3 = ug.field_b * ug.field_b;
            var4 = var3 - da.field_F * da.field_F;
            param0 = param0 + var4 * (Chess.field_E - param0) / var3;
        }
        uh.field_m.a(fl.field_x, 640, -2147483648, 120, param0);
        ga.a(5, 640, 0, 22478, ri.field_g, Chess.field_E + -24, qc.field_e);
    }

    pk() {
        ((pk) this).field_f = false;
        ((pk) this).field_e = true;
        ((pk) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Best";
        field_b = -1;
    }
}
