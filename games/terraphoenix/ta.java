/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_b;
    static String field_a;

    final static void a(String param0, boolean param1, int param2) {
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          fd.field_k = true;
          if (!param1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ok.field_h = stackIn_3_0 != 0;
        nb.field_b = new si(jl.field_I, be.field_x, param0, qi.field_b, ok.field_h);
        if (param2 != 10) {
          var4 = null;
          int discarded$2 = ta.a((CharSequence) null, 126);
          jl.field_I.a((gl) (Object) nb.field_b, (byte) -1);
          return;
        } else {
          jl.field_I.a((gl) (Object) nb.field_b, (byte) -1);
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static pd a(boolean param0, String param1) {
        if (pe.field_a != ua.field_d) {
          if (param0) {
            if (pe.field_a == k.field_b) {
              if (!param1.equals((Object) (Object) vh.field_l)) {
                h.field_c = null;
                vh.field_l = param1;
                pe.field_a = ua.field_d;
                return null;
              } else {
                pe.field_a = og.field_a;
                return h.field_c;
              }
            } else {
              h.field_c = null;
              vh.field_l = param1;
              pe.field_a = ua.field_d;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2 = 23 % ((param1 - 65) / 45);
        return wl.a(true, param0, false, 10);
    }

    final static void a(int param0) {
        int var1 = -81 / ((-80 - param0) / 38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Out of ammo";
        field_b = "Difficulty: Normal";
    }
}
