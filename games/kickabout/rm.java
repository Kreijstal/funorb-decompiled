/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends qt {
    static String[] field_A;
    static boolean[] field_B;
    static int field_C;

    final static Class a(Object param0, byte param1) {
        if (Integer.class.isInstance(param0)) {
            return Integer.TYPE;
        }
        if (Byte.class.isInstance(param0)) {
            return Byte.TYPE;
        }
        if (!(!Short.class.isInstance(param0))) {
            return Short.TYPE;
        }
        if (!(!Long.class.isInstance(param0))) {
            return Long.TYPE;
        }
        if (Boolean.class.isInstance(param0)) {
            return Boolean.TYPE;
        }
        if (!(!Float.class.isInstance(param0))) {
            return Float.TYPE;
        }
        if (param1 < 105) {
            rm.f(37);
            if (Double.class.isInstance(param0)) {
                return Double.TYPE;
            }
            if (!(!Character.class.isInstance(param0))) {
                return Character.TYPE;
            }
            return null;
        }
        if (Double.class.isInstance(param0)) {
            return Double.TYPE;
        }
        if (!(!Character.class.isInstance(param0))) {
            return Character.TYPE;
        }
        return null;
    }

    rm() {
    }

    private final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var16 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        int stackIn_3_0 = 0;
        String stackIn_12_0 = null;
        String stackIn_19_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        String stackOut_11_0 = null;
        String stackOut_10_0 = null;
        L0: {
          if (param7 % 2 == 0) {
            stackOut_2_0 = 128;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var10 = stackIn_3_0;
        var11 = 18;
        if (param2 >= 99) {
          var12 = 140;
          on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10);
          var11 = 4 + (var11 - -var12);
          var12 = 36;
          on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10);
          var11 = 4 + var12 + var11;
          on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10);
          var11 = var12 + var11 - -4;
          on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10);
          var11 = 4 + var11 + var12;
          on.a(((rm) this).field_j + var11, -17 + param8, var12, 25, 0, var10);
          var11 = 4 + var12 + var11;
          on.a(var11 - -((rm) this).field_j, param8 - 17, var12, 25, 0, var10);
          var13 = param1 + (param4 - -param6);
          if (param7 != -1) {
            L1: {
              q.field_d.c(param7 - -1 + ". ", ((rm) this).field_j + 35, param8, param5, -1);
              if (var13 != 0) {
                param4 = (var13 + param4 * 200) / (2 * var13);
                param1 = (var13 + 200 * param1) / (2 * var13);
                param6 = (param6 * 200 - -var13) / (2 * var13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var19 = param3;
              q.field_d.a(var19, 35 + ((rm) this).field_j, param8, param5, -1);
              var14 = Integer.toString(param0);
              q.field_d.d(var14, ml.field_r[0] - -((rm) this).field_j, param8, param5, -1);
              if (9999 <= var13) {
                stackOut_18_0 = "9999+";
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                stackOut_17_0 = Integer.toString(var13);
                stackIn_19_0 = stackOut_17_0;
                break L2;
              }
            }
            var20 = stackIn_19_0;
            var16 = var20;
            var14 = var16;
            q.field_d.d(var20, ml.field_r[1] + ((rm) this).field_j, param8, param5, -1);
            var21 = param4 + "%";
            q.field_d.d(var21, ((rm) this).field_j + ml.field_r[2], param8, param5, -1);
            var14 = param1 + "%";
            q.field_d.d(var14, ml.field_r[3] - -((rm) this).field_j, param8, param5, -1);
            var22 = param6 + "%";
            q.field_d.d(var22, ((rm) this).field_j + ml.field_r[4], param8, param5, -1);
            return;
          } else {
            L3: {
              if (var13 != 0) {
                param4 = (var13 + param4 * 200) / (2 * var13);
                param1 = (var13 + 200 * param1) / (2 * var13);
                param6 = (param6 * 200 - -var13) / (2 * var13);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var23 = param3;
              q.field_d.a(var23, 35 + ((rm) this).field_j, param8, param5, -1);
              var14 = Integer.toString(param0);
              q.field_d.d(var14, ml.field_r[0] - -((rm) this).field_j, param8, param5, -1);
              if (9999 <= var13) {
                stackOut_11_0 = "9999+";
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = Integer.toString(var13);
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            var24 = stackIn_12_0;
            var16 = var24;
            var14 = var16;
            q.field_d.d(var24, ml.field_r[1] + ((rm) this).field_j, param8, param5, -1);
            var25 = param4 + "%";
            q.field_d.d(var25, ((rm) this).field_j + ml.field_r[2], param8, param5, -1);
            var14 = param1 + "%";
            q.field_d.d(var14, ml.field_r[3] - -((rm) this).field_j, param8, param5, -1);
            var26 = param6 + "%";
            q.field_d.d(var26, ((rm) this).field_j + ml.field_r[4], param8, param5, -1);
            return;
          }
        } else {
          return;
        }
    }

    final static qb b(int param0, byte param1) {
        am stackIn_4_0 = null;
        am stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        am stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        am stackOut_2_0 = null;
        if (param1 != -52) {
          L0: {
            field_B = null;
            if (null == sr.field_f) {
              stackOut_7_0 = null;
              stackIn_8_0 = (am) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = sr.field_f.a(param1 + -3559, (long)param0);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (qb) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == sr.field_f) {
              stackOut_3_0 = null;
              stackIn_4_0 = (am) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = sr.field_f.a(param1 + -3559, (long)param0);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (qb) (Object) stackIn_4_0;
        }
    }

    private final void g(byte param0) {
        if (param0 != -4) {
          field_B = null;
          pb.field_C.d(sh.field_b, 192 + ((rm) this).field_j, q.field_d.field_G - -275 + -38, 16777215, -1);
          return;
        } else {
          pb.field_C.d(sh.field_b, 192 + ((rm) this).field_j, q.field_d.field_G - -275 + -38, 16777215, -1);
          return;
        }
    }

    final static void e(int param0) {
        if (param0 != 25) {
            return;
        }
        np.field_Jb.a((gn) (Object) new pq(), 3);
    }

    final int b(int param0, int param1) {
        if (!la.a(100)) {
          if (0 != param0) {
            if (param1 == -22667) {
              if (param0 == 1) {
                return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
              } else {
                return super.b(param0, -22667);
              }
            } else {
              field_B = null;
              if (param0 == 1) {
                return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
              } else {
                return super.b(param0, -22667);
              }
            }
          } else {
            return 70;
          }
        } else {
          if (param0 != 0) {
            if (-2 != (param0 ^ -1)) {
              if (0 != param0) {
                if (param1 != -22667) {
                  field_B = null;
                  if (param0 == 1) {
                    return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
                  } else {
                    return super.b(param0, -22667);
                  }
                } else {
                  if (param0 == 1) {
                    return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
                  } else {
                    return super.b(param0, -22667);
                  }
                }
              } else {
                return 70;
              }
            } else {
              return -(((rm) this).field_i[1].field_d >> -725846367) + 340;
            }
          } else {
            return (((rm) this).field_i[0].field_d >> -1610253791) + 25;
          }
        }
    }

    final static void a(boolean param0) {
        java.awt.Canvas var1 = null;
        if (param0) {
          L0: {
            field_B = null;
            if (dr.field_a) {
              break L0;
            } else {
              dr.field_a = true;
              var1 = ln.l(64);
              wt.field_x = el.field_A;
              us.field_j = n.field_m;
              wu discarded$4 = oo.field_c.a((byte) 76, 240, 320, (java.awt.Component) (Object) var1);
              wu discarded$5 = oo.field_c.a(-126, (java.awt.Component) (Object) var1, false);
              el.field_A = 320;
              n.field_m = 240;
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (dr.field_a) {
              break L1;
            } else {
              dr.field_a = true;
              var1 = ln.l(64);
              wt.field_x = el.field_A;
              us.field_j = n.field_m;
              wu discarded$6 = oo.field_c.a((byte) 76, 240, 320, (java.awt.Component) (Object) var1);
              wu discarded$7 = oo.field_c.a(-126, (java.awt.Component) (Object) var1, false);
              el.field_A = 320;
              n.field_m = 240;
              break L1;
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        var3 = -89 / ((param0 - -49) / 52);
        if (!la.a(100)) {
          if (2 == param1) {
            return super.a(-101, param1);
          } else {
            return 410;
          }
        } else {
          return super.a(-101, param1);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        var10 = Kickabout.field_G;
        pt.a(374 - -((rm) this).field_j, -22914, ((rm) this).field_j + 10, 390, 80);
        on.a(10 + ((rm) this).field_j, 80, 364, 320, 10, 0, 128);
        ta.e(126);
        super.a(param0, param1);
        if (la.a(param0 ^ -97)) {
          this.g((byte) -4);
          return;
        } else {
          L0: {
            if (ug.field_e != null) {
              break L0;
            } else {
              ug.field_e = jt.a(10, (byte) 100, 0, 7);
              break L0;
            }
          }
          var3 = 99;
          var4 = 11184810;
          q.field_d.d(wm.field_p, ml.field_r[0] - -((rm) this).field_j, var3, var4, -1);
          q.field_d.d(k.field_e, ((rm) this).field_j + ml.field_r[1], var3, var4, -1);
          q.field_d.d(mt.field_e, ((rm) this).field_j + ml.field_r[2], var3, var4, -1);
          q.field_d.d(ta.field_D, ml.field_r[3] - -((rm) this).field_j, var3, var4, -1);
          q.field_d.d(ku.field_e, ml.field_r[4] + ((rm) this).field_j, var3, var4, -1);
          var3 = var3 + (q.field_d.field_G - -8);
          if (ug.field_e.field_e) {
            if (null == ug.field_e.field_i) {
              var12 = bg.field_o;
              var13 = var12;
              var13 = var12;
              var3 = 385 - -q.field_d.field_G;
              un.field_d.d(var12.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
              return;
            } else {
              var5 = jw.field_Fb;
              var11 = ug.field_e.field_i[wv.field_ib];
              var6 = var11;
              var7 = ug.field_e.field_o[wv.field_ib];
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (-11 >= (var9 ^ -1)) {
                  L2: {
                    if (var8 == 0) {
                      var4 = 16777215;
                      this.a(ug.field_e.field_f, ug.field_e.field_h, (byte) 105, ow.field_e, ug.field_e.field_m, var4, ug.field_e.field_j, -1, var3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3 = 385 - -q.field_d.field_G;
                  un.field_d.d(var5.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
                  return;
                } else {
                  if (null != var11[var9]) {
                    L3: {
                      var4 = 16777215;
                      if (hm.a((byte) -101, var11[var9])) {
                        var4 = 16750882;
                        var8 = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5 = "";
                    var13 = var5;
                    var13 = var5;
                    this.a(var7[4 * var9], var7[2 + 4 * var9], (byte) 104, var11[var9], var7[1 + 4 * var9], var4, var7[4 * var9 - -3], var9, var3);
                    var3 += 25;
                    var9++;
                    continue L1;
                  } else {
                    var3 += 25;
                    var9++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var5 = uf.field_a;
            var3 = 385 - -q.field_d.field_G;
            un.field_d.d(var5.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_B = null;
        field_A = null;
        if (param0 > -20) {
            field_C = 1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to KickaboutText.text_benefits."};
        field_C = -1;
    }
}
