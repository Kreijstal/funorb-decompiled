/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj extends ah {
    static int field_v;
    int field_u;
    static gd field_r;
    static int[] field_w;
    static String field_s;
    static int field_t;

    public static void d(byte param0) {
        int var1 = 82 / ((param0 - 55) / 58);
        field_r = null;
        field_w = null;
        field_s = null;
    }

    final static ml a(boolean param0, String[] param1) {
        ml var2 = null;
        Object var3 = null;
        if (!param0) {
          var3 = null;
          ml discarded$2 = gj.a(false, (String[]) null);
          var2 = new ml(false);
          var2.field_d = param1;
          return var2;
        } else {
          var2 = new ml(false);
          var2.field_d = param1;
          return var2;
        }
    }

    final static boolean a(qe param0, int param1, boolean param2, qe param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = param3.c((byte) 48);
          if (param1 == 0) {
            break L0;
          } else {
            gj.d((byte) -22);
            break L0;
          }
        }
        var5 = param0.c((byte) 39);
        if (param0.field_a + (double)var5 > param3.field_a - (double)var4) {
          if (param3.field_a + (double)var4 > param0.field_a - (double)var5) {
            if (param3.field_l - (double)var4 < (double)var5 + param0.field_l) {
              if (param0.field_l - (double)var5 < param3.field_l + (double)var4) {
                if (!param2) {
                  if (dk.a(param3.b(640), (int)param3.field_a, (int)param3.field_l, param0.b(640), (int)param0.field_a, (int)param0.field_l)) {
                    return true;
                  } else {
                    return false;
                  }
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

    abstract boolean f(int param0);

    abstract Object e(int param0);

    gj(int param0) {
        ((gj) this).field_u = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_s = "Reload game";
    }
}
