/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static byte[][] field_b;
    static int field_d;
    static int field_a;
    static int[] field_c;

    final static oq a(int param0, int param1) {
        int var4;
        Object var5;
        Object var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int[] var14;
        int[] var15;
        int[] var16;
        Object var17;
        int[] var18;
        int[] var19;
        int[] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        var5 = null;
        if (param1 == -2635) {
          var17 = null;
          var4 = param0;
          if ((var4 ^ -1) != -2) {
            if ((var4 ^ -1) != -18) {
              if (var4 != 2) {
                if ((var4 ^ -1) != -4) {
                  if (var4 != 4) {
                    return new oq(param0, (int[]) (var5), (int[]) (var17));
                  } else {
                    var26 = new int[]{2, 20, 21, 13};
                    var27 = new int[]{2, 20, 21, 6, 13};
                    return new oq(param0, var26, var27);
                  }
                } else {
                  var24 = new int[]{2, 20, 21, 12, 13};
                  var25 = new int[]{2, 20, 21, 6, 12, 13};
                  return new oq(param0, var24, var25);
                }
              } else {
                var22 = new int[]{2, 20, 21, 11, 13};
                var23 = new int[]{2, 20, 21, 6, 11, 13};
                return new oq(param0, var22, var23);
              }
            } else {
              var21 = new int[]{2, 20, 21, 6, 5, 9};
              var20 = new int[]{2, 20, 21, 5, 9};
              return new oq(param0, var20, var21);
            }
          } else {
            var18 = new int[]{2, 20, 21, 36, 5, 9};
            var19 = new int[]{2, 20, 21, 36, 6, 5, 9};
            return new oq(param0, var18, var19);
          }
        } else {
          cf.a(-1);
          var6 = null;
          var4 = param0;
          if ((var4 ^ -1) != -2) {
            if ((var4 ^ -1) != -18) {
              if (var4 != 2) {
                if ((var4 ^ -1) != -4) {
                  if (var4 != 4) {
                    return new oq(param0, (int[]) (var5), (int[]) (var6));
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
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 62) {
          L0: {
            cf.a((byte) 59);
            if (2 > kb.field_Yb) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (2 > kb.field_Yb) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_b = (byte[][]) null;
        if (param0 != -12251) {
            cf.a((byte) -13);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_b = new byte[1000][];
    }
}
