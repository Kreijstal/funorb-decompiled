/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf implements kf {
    private long field_e;
    static kg field_g;
    static ad field_a;
    static le field_d;
    static int[] field_c;
    static String field_b;
    static hj field_f;

    public final na b(boolean param0) {
        if (!((hf) this).a(true)) {
          if (pf.a(0) >= 350L + ((hf) this).field_e) {
            if (param0) {
              return null;
            } else {
              return ((hf) this).c(1);
            }
          } else {
            return ke.field_d;
          }
        } else {
          return uc.field_e;
        }
    }

    final static String b() {
        String var1 = "";
        if (null != j.field_e) {
            var1 = j.field_e.a(32);
        }
        if (!(0 != var1.length())) {
            int discarded$0 = 10367;
            var1 = ka.c();
        }
        if (!(0 != var1.length())) {
            var1 = pg.field_c;
        }
        return var1;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -113) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_g = null;
    }

    abstract na c(int param0);

    public final String b(byte param0) {
        int var2 = 0;
        var2 = -15 / ((param0 - 20) / 44);
        if (!((hf) this).a(true)) {
          if (~pf.a(0) > ~(350L + ((hf) this).field_e)) {
            return null;
          } else {
            return ((hf) this).c((byte) -58);
          }
        } else {
          return null;
        }
    }

    public final void a(byte param0) {
        ((hf) this).field_e = pf.a(0);
        if (param0 > -87) {
            hf.a(-14);
        }
    }

    abstract String c(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new kg();
        field_b = null;
    }
}
