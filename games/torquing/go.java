/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends am {
    private int field_t;
    private int field_u;
    static String field_v;
    static boolean[] field_s;
    static int field_x;
    static double[] field_w;

    final int[][] a(int param0, int param1) {
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
          var16 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            int[] discarded$1 = ((go) this).a((byte) 7, -3);
            break L0;
          }
        }
        L1: {
          var21 = ((go) this).field_r.a(15142, param1);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (((go) this).field_r.field_b) {
            L2: {
              var5 = ci.field_c / ((go) this).field_u;
              var6 = um.field_o / ((go) this).field_t;
              if (0 >= var6) {
                var4 = ((go) this).c(24066, 0, 0);
                break L2;
              } else {
                var7_int = param1 % var6;
                var4 = ((go) this).c(param0 + 53182, var7_int * um.field_o / var6, 0);
                break L2;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var21[0];
            var11 = var21[1];
            var12 = var21[2];
            var13 = 0;
            L3: while (true) {
              if (var13 >= ci.field_c) {
                break L1;
              } else {
                L4: {
                  if (0 >= var5) {
                    var14 = 0;
                    break L4;
                  } else {
                    var15 = var13 % var5;
                    var14 = ci.field_c * var15 / var5;
                    break L4;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        return var17;
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 <= 59) {
            field_v = null;
        }
        field_v = null;
        field_s = null;
    }

    final static void b(int param0) {
        na.field_G = null;
        if (param0 != 0) {
            return;
        }
        vo.field_b = null;
        cq.field_y = null;
        pn.field_b = null;
        fj.field_o = null;
        ij.field_o = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (-1 != (var4 ^ -1)) {
            if ((var4 ^ -1) == -2) {
              ((go) this).field_t = param0.i((byte) -101);
              break L0;
            } else {
              break L0;
            }
          } else {
            ((go) this).field_u = param0.i((byte) -101);
            break L0;
          }
        }
        L1: {
          if (param1 == 35) {
            break L1;
          } else {
            field_v = null;
            break L1;
          }
        }
    }

    public go() {
        super(1, false);
        ((go) this).field_u = 4;
        ((go) this).field_t = 4;
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = Torquing.field_u;
          if (param0 >= 86) {
            break L0;
          } else {
            ((go) this).field_u = 7;
            break L0;
          }
        }
        L1: {
          var3 = ((go) this).field_l.a(param1, 25657);
          if (!((go) this).field_l.field_b) {
            break L1;
          } else {
            L2: {
              var5 = ci.field_c / ((go) this).field_u;
              var6 = um.field_o / ((go) this).field_t;
              if ((var6 ^ -1) >= -1) {
                var4 = ((go) this).b(0, 0, 0);
                break L2;
              } else {
                var7 = param1 % var6;
                var4 = ((go) this).b(0, 0, var7 * um.field_o / var6);
                break L2;
              }
            }
            var10 = 0;
            var7 = var10;
            L3: while (true) {
              if (var10 >= ci.field_c) {
                break L1;
              } else {
                if (-1 > (var5 ^ -1)) {
                  var8 = var10 % var5;
                  var3[var10] = var4[ci.field_c * var8 / var5];
                  var10++;
                  continue L3;
                } else {
                  var3[var10] = var4[0];
                  var10++;
                  continue L3;
                }
              }
            }
          }
        }
        return var3;
    }

    final static he a(boolean param0, java.applet.Applet param1) {
        int var4 = 0;
        he var5 = null;
        int var6 = Torquing.field_u;
        String var2 = nb.a("jagex-last-login-method", param1, (byte) -118);
        if (!(var2 != null)) {
            return jf.field_c;
        }
        he[] var3 = ji.b(21169);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.b(0, var2)) {
                return var5;
            }
        }
        if (param0) {
            go.b(104);
        }
        return jf.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Email: ";
        field_w = new double[8];
    }
}
