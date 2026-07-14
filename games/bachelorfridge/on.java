/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends eo {
    private k field_v;
    static int[] field_u;
    static int field_n;
    static String field_p;
    static eaa field_r;
    private int[] field_o;
    static char[] field_s;
    static int[] field_w;
    private k[] field_y;
    private int[] field_q;
    static boolean field_x;
    static int field_t;

    public static void e(int param0) {
        if (param0 != -29639) {
            field_t = -81;
        }
        field_p = null;
        field_u = null;
        field_w = null;
        field_r = null;
        field_s = null;
    }

    final boolean a(q param0, vr param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (sp.field_l < 0) {
            var4 = 0;
            L1: while (true) {
              if (((on) this).field_o.length <= var4) {
                break L0;
              } else {
                if (!param1.a(0, ((on) this).field_o[var4])) {
                  return false;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((on) this).field_o.length) {
                break L0;
              } else {
                if (param1.a(-122, ((on) this).field_o[var4], sp.field_l)) {
                  var4++;
                  continue L2;
                } else {
                  return false;
                }
              }
            }
          }
        }
        var4 = 0;
        L3: while (true) {
          if (var4 >= ((on) this).field_q.length) {
            L4: {
              if (param2 <= -44) {
                break L4;
              } else {
                on.e(-105);
                break L4;
              }
            }
            return true;
          } else {
            if (param0.c((byte) -98, ((on) this).field_q[var4])) {
              var4++;
              continue L3;
            } else {
              return false;
            }
          }
        }
    }

    on(lu param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        k var13 = null;
        k var14 = null;
        int[][] var15 = null;
        k var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        var2 = param0.b(16711935);
        var3 = 0;
        var4 = 0;
        ((on) this).field_y = new k[var2];
        var22 = new int[var2][];
        var20 = var22;
        var18 = var20;
        var15 = var18;
        var12 = var15;
        var23 = var12;
        var21 = var23;
        var19 = var21;
        var17 = var19;
        var5 = var17;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var2) {
            ((on) this).field_o = new int[var3];
            ((on) this).field_q = new int[var4];
            var3 = 0;
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var2) {
                ((on) this).field_v = ((on) this).field_y[param0.b(16711935)];
                int discarded$2 = param0.b(16711935);
                int discarded$3 = param0.b(16711935);
                var5 = null;
              } else {
                var16 = ((on) this).field_y[var6];
                var8 = var16.field_g.length;
                var9 = 0;
                L2: while (true) {
                  if (var8 <= var9) {
                    L3: {
                      var9 = var16.a(-2359);
                      var10 = var16.c((byte) 47);
                      if (-1 <= var9) {
                        break L3;
                      } else {
                        var3++;
                        ((on) this).field_o[var3] = var9;
                        break L3;
                      }
                    }
                    L4: {
                      if (-1 >= var10) {
                        break L4;
                      } else {
                        var4++;
                        ((on) this).field_q[var4] = var10;
                        break L4;
                      }
                    }
                    var5[var6] = null;
                    var6++;
                    continue L1;
                  } else {
                    var16.field_g[var9] = ((on) this).field_y[var23[var6][var9]];
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L5: {
              var13 = wb.b(param0, 94);
              var14 = var13;
              if (-1 < (var14.a(-2359) ^ -1)) {
                break L5;
              } else {
                var3++;
                break L5;
              }
            }
            L6: {
              if ((var14.c((byte) 78) ^ -1) > -1) {
                break L6;
              } else {
                var4++;
                break L6;
              }
            }
            var8 = var14.field_g.length;
            var12[var6] = new int[var8];
            var9 = 0;
            L7: while (true) {
              if (var9 >= var8) {
                ((on) this).field_y[var6] = var13;
                var6++;
                continue L0;
              } else {
                var22[var6][var9] = param0.b(16711935);
                var9++;
                continue L7;
              }
            }
          }
        }
    }

    final int[] a(double param0, boolean param1, q param2, int param3, int param4, vr param5, boolean param6, int param7) {
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        var24 = BachelorFridge.field_y;
        da.field_c = param2;
        l.field_r = param5;
        var10_int = 0;
        L0: while (true) {
          if (var10_int >= ((on) this).field_y.length) {
            L1: {
              vd.a(param0, 81);
              jp.a(-117, param3, param4);
              var26 = new int[param4 * param3];
              var10 = var26;
              if (!param6) {
                var13 = 1;
                var12 = param3;
                var11 = 0;
                break L1;
              } else {
                var11 = -1 + param3;
                var13 = -1;
                var12 = -1;
                break L1;
              }
            }
            var14 = 0;
            if (param7 == -1) {
              var15 = 0;
              L2: while (true) {
                if (param4 <= var15) {
                  var27 = 0;
                  var15 = var27;
                  L3: while (true) {
                    if (var27 >= ((on) this).field_y.length) {
                      return var10;
                    } else {
                      ((on) this).field_y[var27].b(-256);
                      var27++;
                      continue L3;
                    }
                  }
                } else {
                  L4: {
                    if (param1) {
                      var14 = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (((on) this).field_v.field_f) {
                      var19_ref_int__ = ((on) this).field_v.a(var15, 0);
                      var17 = var19_ref_int__;
                      var16 = var19_ref_int__;
                      var18 = var19_ref_int__;
                      break L5;
                    } else {
                      var31 = ((on) this).field_v.a(false, var15);
                      var30 = var31;
                      var29 = var30;
                      var28 = var29;
                      var25 = var28;
                      var19_ref_int____ = var25;
                      var17 = var31[1];
                      var16 = var31[0];
                      var18 = var31[2];
                      break L5;
                    }
                  }
                  var19 = var11;
                  L6: while (true) {
                    if (var12 == var19) {
                      var15++;
                      continue L2;
                    } else {
                      L7: {
                        var20 = var16[var19] >> -182242780;
                        if (-256 <= (var20 ^ -1)) {
                          break L7;
                        } else {
                          var20 = 255;
                          break L7;
                        }
                      }
                      L8: {
                        if (0 <= var20) {
                          break L8;
                        } else {
                          var20 = 0;
                          break L8;
                        }
                      }
                      L9: {
                        var21 = var17[var19] >> 2127936420;
                        if (var21 <= 255) {
                          break L9;
                        } else {
                          var21 = 255;
                          break L9;
                        }
                      }
                      L10: {
                        if (-1 < var21) {
                          var21 = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var22 = var18[var19] >> 1257436356;
                        if (-256 < var22) {
                          var22 = 255;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        var21 = jna.field_f[var21];
                        if ((var22 ^ -1) <= -1) {
                          break L12;
                        } else {
                          var22 = 0;
                          break L12;
                        }
                      }
                      L13: {
                        var20 = jna.field_f[var20];
                        var22 = jna.field_f[var22];
                        var23 = (var20 << -1244182224) - -(var21 << -1332377400) - -var22;
                        if (var23 != 0) {
                          var23 = var23 | -16777216;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var14++;
                        var26[var14] = var23;
                        if (param1) {
                          var14 = var14 + (-1 + param3);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var19 = var19 + var13;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            ((on) this).field_y[var10_int].a(param4, (byte) -93, param3);
            var10_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_u = new int[]{3, 5, 1, 3, 1, 1, 1, 1, 2, 1, 1, 1, 3, 5, 2, 1, 1, 1, 5, 1, 2, 2, 1, 1, 1, 5, 3, 3, 2, 2, 10, 5, 3, 5, 3, 5, 5, 3, 10, 5, 5, 5, 3, 5, 3, 3, 2, 5, 3, 1};
        field_s = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_w = new int[8192];
        field_p = "Buying or selling an account";
        field_r = new eaa();
    }
}
