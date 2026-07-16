/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends ne {
    private int field_m;
    static String field_l;
    private fa field_k;
    static String field_h;
    private String field_j;
    static volatile boolean field_e;
    static int field_g;
    private int field_r;
    private int field_i;
    private int field_n;
    private boolean field_p;
    static String[] field_o;
    static int field_f;
    private int field_q;

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_h = null;
        if (param0 >= -89) {
            Object var2 = null;
            j.a((rh) null, (rh) null, -107, (rh) null);
        }
    }

    final static int a(int param0, int param1, String param2, String param3, byte param4, String param5, boolean param6) {
        ad var7 = new ad(param5);
        ad var8 = new ad(param3);
        int var9 = -9 / ((param4 - -67) / 33);
        return ak.a(param1, 15021, param6, var7, param0, param2, var8);
    }

    final void a(int param0, int param1, int param2, String param3, fa param4) {
        if (param3 == null) {
            ((j) this).field_c = null;
            return;
        }
        if (param4 == ((j) this).field_k) {
            if (((j) this).field_p) {
                if ((((j) this).field_n ^ -1) == -3) {
                    if (null != ((j) this).field_j) {
                        if (((j) this).field_j.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((j) this).field_n = 2;
        ((j) this).field_k = param4;
        ((j) this).field_p = true;
        ((j) this).field_j = param3;
        pi var7 = this.a(param3, (byte) -74, param1, param4);
        pi var8 = var7;
        var8.field_d[param2] = param0 - param4.b(param3);
        var7.field_d[param3.length()] = param0;
        cd.a(param3, param4, var8, param2 + 30988, 0);
    }

    final static void a(rh param0, rh param1, int param2, rh param3) {
        int var8 = 0;
        int var9 = 0;
        bi[] var14 = null;
        int var11_int = 0;
        int var13 = fleas.field_A ? 1 : 0;
        uh.field_m = of.a("frame_top", "commonui", param0, 101);
        ki.field_c = of.a("frame_bottom", "commonui", param0, 85);
        if (param2 != 31760) {
            return;
        }
        ha.field_i = kl.a(252, param0, "commonui", "jagex_logo_grey");
        ng.field_h = of.a("button", "commonui", param0, 61);
        t.field_h = bg.a("validation", param0, (byte) 7, "commonui");
        nb.field_c = (fa) (Object) fi.a(param0, param1, "commonui", "arezzo12", (byte) 82);
        ug.field_e = (fa) (Object) fi.a(param0, param1, "commonui", "arezzo14", (byte) 82);
        rg.field_o = (fa) (Object) fi.a(param0, param1, "commonui", "arezzo14bold", (byte) 82);
        dd var17 = new dd(param3.a(0, "", "button.gif"), (java.awt.Component) (Object) ol.field_e);
        bi discarded$0 = hm.a("dropdown", param0, (byte) -42, "commonui");
        bi[] var5 = fb.a(param0, (byte) 45, "commonui", "screen_options");
        k.field_c = new bi[4];
        lg.field_c = new bi[4];
        hh.field_a = new bi[4];
        bi[][] var6 = new bi[][]{lg.field_c, k.field_c, hh.field_a};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_k[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            bi[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = uk.a((byte) 84, var21[var11_int], var5[var9]);
            }
        }
        var9 = var17.field_t;
        we.a(-111);
        var17.f();
        gb.e(0, 0, gb.field_d, gb.field_k);
        dd var15 = new dd(var9, var9);
        dd var18 = var15;
        var18.f();
        var17.f(0, 0);
        dd var11 = new dd(var9, var9);
        var11.f();
        var17.f(-var17.field_w + var9, 0);
        dd var12 = new dd(var17.field_w + -(2 * var9), var9);
        var12.f();
        var17.f(-var9, 0);
        ia.a(-125);
        ng.field_h = new dd[]{var15, var12, var11};
    }

    final void a(fa param0, int param1, String param2, int param3, int param4) {
        if (param2 == null) {
            ((j) this).field_c = null;
            return;
        }
        if (((j) this).field_k == param0) {
            if (((j) this).field_p) {
                if ((((j) this).field_n ^ -1) == -2) {
                    if (null != ((j) this).field_j) {
                        if (!(!((j) this).field_j.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((j) this).field_k = param0;
        ((j) this).field_p = true;
        ((j) this).field_n = 1;
        pi var8 = this.a(param2, (byte) -74, param4, param0);
        int var7 = param0.b(param2);
        var8.field_d[0] = param3 - (var7 >> 986168641);
        var8.field_d[param2.length()] = param3 - -(var7 >> -1271554303);
        cd.a(param2, param0, var8, 30988, 0);
        if (param1 <= 45) {
            ((j) this).field_r = 7;
        }
    }

    private final pi a(String param0, byte param1, int param2, fa param3) {
        if (param1 != -74) {
            Object var6 = null;
            j.a((rh) null, (rh) null, -66, (rh) null);
        }
        pi var7 = new pi(param2 + -param3.field_H, param3.field_K + param2, param0.length());
        pi var5 = var7;
        ((j) this).field_c = new pi[]{var7};
        return var5;
    }

    final void a(boolean param0, int param1, int param2, fa param3, String param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        pi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        pi stackIn_34_0 = null;
        pi stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        pi stackIn_35_0 = null;
        pi stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        pi stackIn_36_0 = null;
        pi stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        String stackIn_39_0 = null;
        fa stackIn_39_1 = null;
        pi stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        String stackIn_40_0 = null;
        fa stackIn_40_1 = null;
        pi stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        String stackIn_41_0 = null;
        fa stackIn_41_1 = null;
        pi stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        pi stackOut_33_0 = null;
        pi stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        pi stackOut_35_0 = null;
        pi stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        pi stackOut_34_0 = null;
        pi stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        String stackOut_38_0 = null;
        fa stackOut_38_1 = null;
        pi stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        String stackOut_40_0 = null;
        fa stackOut_40_1 = null;
        pi stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        String stackOut_39_0 = null;
        fa stackOut_39_1 = null;
        pi stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        L0: {
          var15 = fleas.field_A ? 1 : 0;
          if (0 == param1) {
            param1 = param3.field_N;
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 == null) {
          ((j) this).field_c = null;
          return;
        } else {
          L1: {
            if (((j) this).field_k != param3) {
              break L1;
            } else {
              if (((j) this).field_p) {
                break L1;
              } else {
                if (param2 != ((j) this).field_n) {
                  break L1;
                } else {
                  if (((j) this).field_i != param6) {
                    break L1;
                  } else {
                    if (param1 != ((j) this).field_m) {
                      break L1;
                    } else {
                      if (param7 != ((j) this).field_r) {
                        break L1;
                      } else {
                        if ((param5 ^ -1) != (((j) this).field_q ^ -1)) {
                          break L1;
                        } else {
                          if (((j) this).field_j == null) {
                            break L1;
                          } else {
                            if (!((j) this).field_j.equals((Object) (Object) param4)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((j) this).field_r = param7;
          ((j) this).field_k = param3;
          ((j) this).field_j = param4;
          ((j) this).field_p = false;
          ((j) this).field_m = param1;
          ((j) this).field_n = param2;
          ((j) this).field_i = param6;
          ((j) this).field_q = param5;
          if (param0) {
            L2: {
              var16 = new String[1 + param3.a(param4, param5)];
              var17 = var16;
              var10 = Math.max(1, param3.a(param4, new int[1], var17));
              if (((j) this).field_i != 3) {
                break L2;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L2;
                } else {
                  ((j) this).field_i = 1;
                  break L2;
                }
              }
            }
            L3: {
              if (-1 == (((j) this).field_i ^ -1)) {
                var11 = param3.field_H;
                break L3;
              } else {
                if ((((j) this).field_i ^ -1) != -2) {
                  if (((j) this).field_i == 2) {
                    var11 = -(((j) this).field_m * var10) + ((j) this).field_r - param3.field_K;
                    break L3;
                  } else {
                    L4: {
                      var12 = (((j) this).field_r - var10 * ((j) this).field_m) / (var10 - -1);
                      if (0 > var12) {
                        var12 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11 = var12 + param3.field_H;
                    ((j) this).field_m = ((j) this).field_m + var12;
                    break L3;
                  }
                } else {
                  var11 = param3.field_H - -(((j) this).field_r - var10 * ((j) this).field_m >> -61668671);
                  break L3;
                }
              }
            }
            ((j) this).field_c = new pi[var10];
            var12 = 0;
            L5: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = var11 + -param3.field_H;
                  stackOut_33_3 = var11 + param3.field_K;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  if (var13 != null) {
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = stackIn_35_2;
                    stackOut_35_3 = stackIn_35_3;
                    stackOut_35_4 = var13.length();
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    stackIn_36_4 = stackOut_35_4;
                    break L6;
                  } else {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = 0;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    break L6;
                  }
                }
                L7: {
                  var14 = new pi(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                  var14.field_d[0] = 0;
                  if (var13 != null) {
                    L8: {
                      var14.field_d[var13.length()] = param3.b(var13);
                      stackOut_38_0 = (String) var13;
                      stackOut_38_1 = (fa) param3;
                      stackOut_38_2 = (pi) var14;
                      stackOut_38_3 = 30988;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      if ((param2 ^ -1) != -4) {
                        stackOut_40_0 = (String) (Object) stackIn_40_0;
                        stackOut_40_1 = (fa) (Object) stackIn_40_1;
                        stackOut_40_2 = (pi) (Object) stackIn_40_2;
                        stackOut_40_3 = stackIn_40_3;
                        stackOut_40_4 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        stackIn_41_4 = stackOut_40_4;
                        break L8;
                      } else {
                        stackOut_39_0 = (String) (Object) stackIn_39_0;
                        stackOut_39_1 = (fa) (Object) stackIn_39_1;
                        stackOut_39_2 = (pi) (Object) stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = ((j) this).a(param3.b(var13), var13, 0, param5);
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        stackIn_41_3 = stackOut_39_3;
                        stackIn_41_4 = stackOut_39_4;
                        break L8;
                      }
                    }
                    cd.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var11 = var11 + param1;
                ((j) this).field_c[var12] = var14;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(String param0, int param1, fa param2, boolean param3, int param4) {
        if (!(param0 != null)) {
            ((j) this).field_c = null;
            return;
        }
        if (((j) this).field_k == param2) {
            if (((j) this).field_p) {
                if (((j) this).field_n == 0) {
                    if (null != ((j) this).field_j) {
                        if (((j) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((j) this).field_n = 0;
        ((j) this).field_k = param2;
        ((j) this).field_p = param3 ? true : false;
        ((j) this).field_j = param0;
        pi var7 = this.a(param0, (byte) -74, param4, param2);
        pi var8 = var7;
        var7.field_d[0] = param1;
        var8.field_d[param0.length()] = param2.b(param0) + param1;
        cd.a(param0, param2, var8, 30988, 0);
    }

    public j() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "<%0>Green Switches:<%1> cause all the recessed walls to slide out and become normal wall blocks. Warning: fleas standing in the way are crushed and die!";
        field_h = "Left slope: ";
        field_e = true;
        field_f = 0;
    }
}
