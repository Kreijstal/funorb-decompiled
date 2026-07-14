/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static gq field_b;
    static String field_c;
    static String field_d;
    static ut field_a;

    final static void a(int param0, sp param1) {
        if (param0 != 6022) {
            return;
        }
        np.field_Jb.a((gn) (Object) new ce(param1), 3);
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 7 % ((param0 - 2) / 37);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -41) {
          if (param1 != 32) {
            if (param1 != 40) {
              if (param1 == 41) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = null;
          if (param1 != 32) {
            if (param1 == 40) {
              return true;
            } else {
              L0: {
                if (param1 != 41) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static vn a(int param0, int param1, int param2, up param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        var6 = param3.field_q;
        if (param0 <= 90) {
          return null;
        } else {
          var7 = param3.field_j;
          var8 = (4045 & var7) >> -2010932888;
          var9 = (246 & var7) >> -1654847356;
          var10 = (15 & var7) >> 677982016;
          var11 = fp.a(param4, param2, var8, var6, var9, var10, param1, false, false, param5);
          return var11;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading park";
        field_d = "The league system is currently unavailable .";
    }
}
