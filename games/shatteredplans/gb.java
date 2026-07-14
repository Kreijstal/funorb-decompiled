/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends oh {
    static qh field_n;
    int[] field_k;
    boolean field_l;
    boolean field_j;
    static String field_o;
    static qr field_m;
    int field_h;
    static int field_i;

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        int var1 = -46 % ((param0 - -22) / 47);
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          if (-1 != param3) {
            if (-2 != param3) {
              break L0;
            } else {
              if (sq.field_a == param2) {
                break L0;
              } else {
                sq.field_a = param2;
                qh.field_v = true;
                kb.a(55, param1);
                break L0;
              }
            }
          } else {
            if (-2 != param3) {
              break L0;
            } else {
              if (sq.field_a == param2) {
                break L0;
              } else {
                sq.field_a = param2;
                qh.field_v = true;
                kb.a(55, param1);
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 40 % ((-21 - param0) / 59);
          if (param3 != 2) {
            break L1;
          } else {
            if (ul.field_Hb == param2) {
              break L1;
            } else {
              ul.field_Hb = param2;
              qh.field_v = true;
              kb.a(95, param1);
              break L1;
            }
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!gq.a(param1, true, -4)) {
            return false;
        }
        int var2 = 0;
        int var3 = -2 / ((param0 - -7) / 59);
        while (var2 < param1.length()) {
            if (!ne.a(0, param1.charAt(var2))) {
                return false;
            }
            var2++;
        }
        return true;
    }

    gb() {
        ((gb) this).field_j = false;
        ((gb) this).field_l = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Quick Chat lobby";
    }
}
