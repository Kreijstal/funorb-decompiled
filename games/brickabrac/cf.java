/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static byte[][] field_b;
    static int field_d;
    static int field_a;
    static int[] field_c;

    final static oq a(int param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var5 = null;
        var6 = null;
        var4 = param0;
        if (var4 != 1) {
          if (var4 != 17) {
            if (var4 != 2) {
              if (var4 != 3) {
                if (var4 != 4) {
                  return new oq(param0, (int[]) var5, (int[]) var6);
                } else {
                  var15 = new int[]{2, 20, 21, 13};
                  var16 = new int[]{2, 20, 21, 6, 13};
                  return new oq(param0, var15, var16);
                }
              } else {
                var13 = new int[]{2, 20, 21, 12, 13};
                var14 = new int[]{2, 20, 21, 6, 12, 13};
                return new oq(param0, var13, var14);
              }
            } else {
              var11 = new int[]{2, 20, 21, 11, 13};
              var12 = new int[]{2, 20, 21, 6, 11, 13};
              return new oq(param0, var11, var12);
            }
          } else {
            var10 = new int[]{2, 20, 21, 6, 5, 9};
            var9 = new int[]{2, 20, 21, 5, 9};
            return new oq(param0, var9, var10);
          }
        } else {
          var7 = new int[]{2, 20, 21, 36, 5, 9};
          var8 = new int[]{2, 20, 21, 36, 6, 5, 9};
          return new oq(param0, var7, var8);
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 62) {
          L0: {
            boolean discarded$8 = cf.a((byte) 59);
            if (2 > kb.field_Yb) {
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
            if (2 > kb.field_Yb) {
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

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[1000][];
    }
}
