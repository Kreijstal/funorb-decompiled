/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gp {
    static String field_B;
    private int[] field_w;
    private int[] field_y;
    static String field_t;
    private ji[] field_v;
    static String field_z;
    static cr field_x;
    private ji field_A;
    static int[] field_u;

    final int[] a(r param0, double param1, boolean param2, boolean param3, int param4, int param5, int param6, ka param7) {
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
        var24 = Vertigo2.field_L ? 1 : 0;
        mk.field_P = param7;
        nk.field_Hb = param0;
        var10_int = 0;
        L0: while (true) {
          if (var10_int >= ((he) this).field_v.length) {
            L1: {
              dl.a(param1, (byte) -107);
              ib.a((byte) -122, param4, param6);
              var26 = new int[param6 * param4];
              var10 = var26;
              if (!param2) {
                var11 = 0;
                var13 = 1;
                var12 = param6;
                break L1;
              } else {
                var13 = -1;
                var12 = -1;
                var11 = param6 + -1;
                break L1;
              }
            }
            var14 = 0;
            var15 = 0;
            L2: while (true) {
              if (param4 <= var15) {
                var27 = 0;
                var15 = var27;
                if (param5 == 27127) {
                  L3: while (true) {
                    if (var27 >= ((he) this).field_v.length) {
                      return var10;
                    } else {
                      ((he) this).field_v[var27].f(2);
                      var27++;
                      continue L3;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                L4: {
                  if (param3) {
                    var14 = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((he) this).field_A.field_o) {
                    var19_ref_int__ = ((he) this).field_A.c(var15, param5 + -27024);
                    var18 = var19_ref_int__;
                    var16 = var19_ref_int__;
                    var17 = var19_ref_int__;
                    break L5;
                  } else {
                    var31 = ((he) this).field_A.b(-3780, var15);
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
                      var20 = var16[var19] >> 358944100;
                      if (-256 > (var20 ^ -1)) {
                        var20 = 255;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var20 < 0) {
                        var20 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var21 = var17[var19] >> -1323489532;
                      if (var21 <= 255) {
                        break L9;
                      } else {
                        var21 = 255;
                        break L9;
                      }
                    }
                    L10: {
                      if (var21 < 0) {
                        var21 = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      var22 = var18[var19] >> 238011972;
                      if ((var22 ^ -1) >= -256) {
                        break L11;
                      } else {
                        var22 = 255;
                        break L11;
                      }
                    }
                    L12: {
                      var21 = li.field_l[var21];
                      if (0 > var22) {
                        var22 = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      var20 = li.field_l[var20];
                      var22 = li.field_l[var22];
                      var23 = (var20 << -380984080) - (-(var21 << -1761461944) - var22);
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
                      if (param3) {
                        var14 = var14 + (-1 + param6);
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
            ((he) this).field_v[var10_int].b(param4, param6, 255);
            var10_int++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -113) {
            return;
        }
        field_B = null;
        field_u = null;
        field_z = null;
        field_x = null;
        field_t = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 > -72) {
            return true;
        }
        return 0 != (param1 & 2) ? true : false;
    }

    final static void a(int param0, ub param1, int param2) {
        mi var5 = uh.field_Wb;
        var5.j(param0, 118);
        var5.field_u = var5.field_u + 1;
        int var4 = var5.field_u;
        var5.f(1, 117);
        var5.f(param1.field_u, -71);
        if (param2 != -27011) {
            boolean discarded$0 = he.a((byte) -108, 124);
        }
        var5.b(param1.field_q, (byte) -124);
        var5.e(param1.field_s, 0);
        var5.e(param1.field_o, 0);
        var5.e(param1.field_r, 0);
        var5.e(param1.field_n, 0);
        int discarded$1 = var5.c(var4, 85);
        var5.b((byte) 53, var5.field_u - var4);
    }

    final boolean a(r param0, ka param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (-1 >= (b.field_i ^ -1)) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((he) this).field_y.length) {
                break L0;
              } else {
                if (!param0.b(param2 ^ 0, b.field_i, ((he) this).field_y[var4])) {
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
              if (var4 >= ((he) this).field_y.length) {
                break L0;
              } else {
                if (!param0.a(((he) this).field_y[var4], (byte) 53)) {
                  return false;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        var4 = param2;
        L3: while (true) {
          if (((he) this).field_w.length <= var4) {
            return true;
          } else {
            if (param1.f(0, ((he) this).field_w[var4])) {
              var4++;
              continue L3;
            } else {
              return false;
            }
          }
        }
    }

    he(ed param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ji var13 = null;
        ji var14 = null;
        int[][] var15 = null;
        ji var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        var2 = param0.h(-11);
        var3 = 0;
        var4 = 0;
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
        ((he) this).field_v = new ji[var2];
        var6 = 0;
        L0: while (true) {
          if (var2 <= var6) {
            ((he) this).field_y = new int[var3];
            var3 = 0;
            ((he) this).field_w = new int[var4];
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var2 <= var6) {
                ((he) this).field_A = ((he) this).field_v[param0.h(-11)];
                int discarded$2 = param0.h(-11);
                var5 = null;
                int discarded$3 = param0.h(-11);
              } else {
                var16 = ((he) this).field_v[var6];
                var8 = var16.field_u.length;
                var9 = 0;
                L2: while (true) {
                  if (var8 <= var9) {
                    L3: {
                      var9 = var16.a((byte) -117);
                      var10 = var16.e(6557);
                      if ((var9 ^ -1) >= -1) {
                        break L3;
                      } else {
                        var3++;
                        ((he) this).field_y[var3] = var9;
                        break L3;
                      }
                    }
                    L4: {
                      if ((var10 ^ -1) >= -1) {
                        break L4;
                      } else {
                        var4++;
                        ((he) this).field_w[var4] = var10;
                        break L4;
                      }
                    }
                    var5[var6] = null;
                    var6++;
                    continue L1;
                  } else {
                    var16.field_u[var9] = ((he) this).field_v[var23[var6][var9]];
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L5: {
              var13 = ve.a((byte) -109, param0);
              var14 = var13;
              if (0 > var14.a((byte) -117)) {
                break L5;
              } else {
                var3++;
                break L5;
              }
            }
            L6: {
              if (-1 < (var14.e(6557) ^ -1)) {
                break L6;
              } else {
                var4++;
                break L6;
              }
            }
            var8 = var14.field_u.length;
            var12[var6] = new int[var8];
            var9 = 0;
            L7: while (true) {
              if (var9 >= var8) {
                ((he) this).field_v[var6] = var13;
                var6++;
                continue L0;
              } else {
                var22[var6][var9] = param0.h(-11);
                var9++;
                continue L7;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Owner";
        field_t = "Personal Best: <%0>";
        field_z = "Play the game without logging in just yet";
        field_u = new int[4];
    }
}
