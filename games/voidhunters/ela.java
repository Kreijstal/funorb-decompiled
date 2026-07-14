/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ela extends rqa {
    static int field_o;
    static int field_q;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(156, 98));
    }

    final static int[] a(byte param0, int[] param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var6 = VoidHunters.field_G;
        var12 = new int[4];
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var2 = var8;
        var12[1] = -2147483648;
        var12[0] = 2147483647;
        var12[2] = 2147483647;
        var12[3] = -2147483648;
        if (param0 > -93) {
          L0: {
            var7 = null;
            int[] discarded$1 = ela.a((byte) -43, (int[]) null);
            var3 = 0;
            if (var3 >= param1.length) {
              break L0;
            } else {
              L1: {
                var4 = param1[var3];
                var5 = param1[1 + var3];
                if (var4 < var12[0]) {
                  var12[0] = var4;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var12[2] > var5) {
                  var12[2] = var5;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5 > var12[3]) {
                  var12[3] = var5;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var12[1] < var4) {
                  var12[1] = var4;
                  break L4;
                } else {
                  var3 += 2;
                  break L4;
                }
              }
              var3 += 2;
              var3 += 2;
              var3 += 2;
              break L0;
            }
          }
          return var8;
        } else {
          var3 = 0;
          L5: while (true) {
            if (var3 >= param1.length) {
              return var8;
            } else {
              L6: {
                var4 = param1[var3];
                var5 = param1[1 + var3];
                if (var4 < var12[0]) {
                  var12[0] = var4;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var12[2] > var5) {
                  var12[2] = var5;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var5 > var12[3]) {
                  var12[3] = var5;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (var12[1] < var4) {
                var12[1] = var4;
                var3 += 2;
                var3 += 2;
                continue L5;
              } else {
                var3 += 2;
                var3 += 2;
                continue L5;
              }
            }
          }
        }
    }

    ela(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_q = 256;
        field_p = 50;
    }
}
