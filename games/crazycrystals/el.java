/*
 * Decompiled by CFR-JS 0.4.0.
 */
class el extends fb {
    static dl field_g;
    static String field_h;
    static String field_f;

    void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        L0: {
          if (param3 <= -59) {
            break L0;
          } else {
            el.b(126);
            break L0;
          }
        }
        if (param1 == 24) {
          if ((param2 ^ -1) != -25) {
            ((el) this).field_a.h(-80).b(param5, -param2 + param6, param1 * 2, param2 * 3, ek.field_f[((el) this).field_a.field_u]);
            return;
          } else {
            ((el) this).field_a.h(-121).c(param5, -param2 + param6, ek.field_f[((el) this).field_a.field_u]);
            return;
          }
        } else {
          ((el) this).field_a.h(-80).b(param5, -param2 + param6, param1 * 2, param2 * 3, ek.field_f[((el) this).field_a.field_u]);
          return;
        }
    }

    el(fq param0, int param1) {
        super(param0);
        param0.d(param1, hp.field_m[param1], -9634);
    }

    public static void b(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != 2) {
            return;
        }
        field_g = null;
    }

    fb a(int param0) {
        int var2 = 98 % ((36 - param0) / 62);
        return (fb) (((el) this).field_a.i(12555) ? null : this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Create a free account to start using this feature";
    }
}
