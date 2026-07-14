/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = 51 % ((param0 - 19) / 52);
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = HoldTheLine.field_D;
          if (param2 <= -1) {
            break L0;
          } else {
            param0 = param0 + param2;
            param2 = 0;
            break L0;
          }
        }
        L1: {
          if (-1 > param4) {
            param1 = param1 + param4;
            param4 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param4 + param1 <= tc.field_c) {
            break L2;
          } else {
            param1 = -param4 + tc.field_c;
            break L2;
          }
        }
        L3: {
          if (tc.field_j >= param0 + param2) {
            break L3;
          } else {
            param0 = -param2 + tc.field_j;
            break L3;
          }
        }
        var6 = -param5 + 256;
        var7 = param4 - -param1;
        var8 = param4;
        L4: while (true) {
          if (var7 <= var8) {
            if (param3 != 0) {
              mj.a(-35);
              return;
            } else {
              return;
            }
          } else {
            var9 = var8 * tc.field_j + param2;
            var10 = param0;
            L5: while (true) {
              if (-1 <= (var10 ^ -1)) {
                var8++;
                var8++;
                continue L4;
              } else {
                var11 = tc.field_b[var9];
                var12 = (var11 & 16711680) >> 304316912;
                var13 = 255 & var11 >> 927944936;
                var14 = var11 & 255;
                var15 = var14 * 5 + (6 * var13 + var12 * 5);
                var16 = (var6 * var15 >> -1059631284) + (param5 * var12 >> -645259768);
                var17 = (var6 * var15 >> -1143322772) + (var13 * param5 >> -1782067320);
                var18 = (var15 * var6 >> 1864533100) + (var14 * param5 >> 1084193608);
                var19 = var16 << 1525471696 | var17 << 2131926632 | var18;
                tc.field_b[var9] = var19;
                var9++;
                var10--;
                continue L5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names cannot start or end with space or underscore";
    }
}
