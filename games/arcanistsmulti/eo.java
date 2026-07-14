/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static qb[] field_a;
    static int[] field_b;
    static ne field_c;

    final static short[] a(ab param0, short[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param0.d(28089, param3);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param0.d(param2 ^ 28073, 4);
            var6 = (short)param0.d(28089, param2);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (short)(param0.d(28089, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -14449) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[17];
    }
}
