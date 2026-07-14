/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    int field_d;
    int field_g;
    static qb field_f;
    static String field_b;
    static int[] field_c;
    int field_e;
    static qb[] field_i;
    int field_a;
    static co field_h;

    final static int a(jd param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        if (-1 <= (param1 ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          if (!uj.a(-2147483648, param1)) {
            var3 = -(int)(4294967296L % (long)param1) + -2147483648;
            if (param2 <= -22) {
              L0: while (true) {
                var4 = param0.c((byte) -46);
                if (var4 < var3) {
                  return dh.a(var4, true, param1);
                } else {
                  continue L0;
                }
              }
            } else {
              return -99;
            }
          } else {
            return (int)((long)param1 * ((long)param0.c((byte) -46) & 4294967295L) >> 1264703648);
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0) {
            return;
        }
        field_f = null;
    }

    final static void a(int param0, byte param1, int param2) {
        ab var3 = null;
        Object var4 = null;
        var3 = he.field_e;
        var3.b((byte) -32, param2);
        var3.f(3, (byte) -54);
        var3.f(8, (byte) -85);
        var3.c(param0, (byte) -93);
        if (param1 < -92) {
          return;
        } else {
          var4 = null;
          int discarded$2 = uj.a((jd) null, 16, (byte) 39);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2147483648) {
          L0: {
            field_f = null;
            if (param1 != (param1 & -param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 != (param1 & -param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Since you have figured out the controls and don't need movement explained, select the Arcane<nbsp>Flash spell.";
        field_c = new int[]{70, 71, 72};
        field_h = new co();
    }
}
