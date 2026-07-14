/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends hi {
    static String[] field_o;
    static boolean field_r;
    static int field_q;
    static int[] field_p;

    ka(ig param0) {
        super(param0);
    }

    final bm a(String param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 55 % ((param1 - 3) / 42);
          if (hj.b(param0, 11242) != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (var4 == 0) {
          return bi.field_d;
        } else {
          return nd.field_d;
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        jj.field_j[0].a((double)param2, (double)param0, false, (double)param3 + param1.field_c, 128);
    }

    public static void f(int param0) {
        field_o = null;
        int var1 = -102 / ((43 - param0) / 48);
        field_p = null;
    }

    final String a(byte param0, String param1) {
        int var3 = 21 % ((param0 - -24) / 35);
        if (!(((ka) this).a(param1, (byte) 91) != bi.field_d)) {
            return en.field_z;
        }
        return ak.field_g;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 0) {
          if (j.field_c >= param4) {
            if (j.field_c < param4 - -param3) {
              if (param0 <= rb.field_m) {
                if (param0 - -param2 <= rb.field_m) {
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
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[]{3, 1};
    }
}
