/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static pb field_b;
    static v field_d;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 84) {
            Object var2 = null;
            q.a(-104, (pb[]) null);
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var13 = stellarshard.field_B;
          if (param4 <= param1) {
            break L0;
          } else {
            L1: {
              var5 = (param4 + param1) / 2;
              var6 = param1;
              var7 = param2[var5];
              param2[var5] = param2[param4];
              param2[param4] = var7;
              var8 = param3[var5];
              param3[var5] = param3[param4];
              param3[param4] = var8;
              if (var7 != 2147483647) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var9 = stackIn_4_0;
            var10 = param1;
            L2: while (true) {
              if (var10 >= param4) {
                param2[param4] = param2[var6];
                param2[var6] = var7;
                param3[param4] = param3[var6];
                param3[var6] = var8;
                q.a(1, param1, param2, param3, var6 + -1);
                q.a(param0 + 0, var6 + 1, param2, param3, param4);
                break L0;
              } else {
                if (var7 - (var9 & var10) < param2[var10]) {
                  var11 = param2[var10];
                  param2[var10] = param2[var6];
                  param2[var6] = var11;
                  var12 = param3[var10];
                  param3[var10] = param3[var6];
                  var6++;
                  param3[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            var14 = null;
            q.a(-111, -13, (int[]) null, (int[]) null, 22);
            break L3;
          }
        }
    }

    final static void a(int param0, pb[] param1) {
        ed.field_a = param1;
        if (param0 <= 58) {
            Object var3 = null;
            q.a(84, -14, (int[]) null, (int[]) null, 119);
        }
        if (ed.field_a != null) {
            if (!(param1.length >= 3)) {
                throw new IllegalArgumentException("");
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = 0;
    }
}
