/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends ji {
    static int field_z;
    static String field_E;
    private int field_C;
    private int field_D;
    static int field_B;
    static int field_y;
    static byte[] field_A;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var3 = ((rm) this).field_x.a(param0, (byte) 60);
            if (!((rm) this).field_x.field_i) {
              break L0;
            } else {
              L1: {
                var5 = we.field_M / ((rm) this).field_C;
                var6 = aa.field_Vb / ((rm) this).field_D;
                if (0 < var6) {
                  var7 = param0 % var6;
                  var4 = ((rm) this).a(0, -1, var7 * aa.field_Vb / var6);
                  break L1;
                } else {
                  var4 = ((rm) this).a(0, -1, 0);
                  break L1;
                }
              }
              var10 = 0;
              var7 = var10;
              L2: while (true) {
                if (var10 >= we.field_M) {
                  break L0;
                } else {
                  if (-1 > (var5 ^ -1)) {
                    var8 = var10 % var5;
                    var3[var10] = var4[we.field_M * var8 / var5];
                    var10++;
                    continue L2;
                  } else {
                    var3[var10] = var4[0];
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final static boolean a(byte param0, long param1, String param2) {
        tp var4 = null;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = vo.a(param2, 0);
          if (var4 == null) {
            break L0;
          } else {
            if (null != var4.field_Lb) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < -122) {
            break L1;
          } else {
            field_E = null;
            break L1;
          }
        }
        L2: {
          L3: {
            if (null == gd.field_j) {
              break L3;
            } else {
              if (null == eq.a(param1, (byte) 102)) {
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L2;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) kb.field_a);
        if (param0 >= -73) {
            return;
        }
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) kb.field_a);
        fh.field_w = -1;
    }

    public static void g(int param0) {
        field_A = null;
        field_E = null;
        if (param0 != 16145) {
            rm.g(-113);
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 110) {
            break L0;
          } else {
            var6 = null;
            ((rm) this).a((byte) 114, 100, (ed) null);
            break L0;
          }
        }
        L1: {
          var4 = param1;
          if (var4 != 0) {
            if (1 == var4) {
              ((rm) this).field_D = param2.h(-11);
              break L1;
            } else {
              break L1;
            }
          } else {
            ((rm) this).field_C = param2.h(param0 + -121);
            break L1;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var21 = ((rm) this).field_v.a(param1, -2);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (!((rm) this).field_v.field_c) {
            break L0;
          } else {
            L1: {
              var5 = we.field_M / ((rm) this).field_C;
              var6 = aa.field_Vb / ((rm) this).field_D;
              if (0 < var6) {
                var7_int = param1 % var6;
                var4 = ((rm) this).c(0, 3, var7_int * aa.field_Vb / var6);
                break L1;
              } else {
                var4 = ((rm) this).c(0, param0 + 3783, 0);
                break L1;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var21[0];
            var11 = var21[1];
            var12 = var21[2];
            var13 = 0;
            L2: while (true) {
              if (var13 >= we.field_M) {
                break L0;
              } else {
                L3: {
                  if ((var5 ^ -1) >= -1) {
                    var14 = 0;
                    break L3;
                  } else {
                    var15 = var13 % var5;
                    var14 = var15 * we.field_M / var5;
                    break L3;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L2;
              }
            }
          }
        }
        if (param0 == -3780) {
          return var3;
        } else {
          return null;
        }
    }

    public rm() {
        super(1, false);
        ((rm) this).field_D = 4;
        ((rm) this).field_C = 4;
    }

    final static void b(byte param0) {
        int var1 = -81 % ((47 - param0) / 34);
        if (lo.field_k != null) {
            lo.field_k.b(0);
            lo.field_k = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new byte[]{(byte)2, (byte)8, (byte)4};
        field_E = "You can join this game";
    }
}
