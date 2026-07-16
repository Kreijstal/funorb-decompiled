/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends ta {
    private am[] field_t;
    private int[] field_s;
    private int[] field_q;
    static String field_r;
    private am field_u;

    final static boolean a(int param0) {
        int var1 = -8 % ((-70 - param0) / 35);
        return bn.field_i;
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
            field_r = null;
        }
    }

    final int[] a(boolean param0, la param1, int param2, double param3, boolean param4, int param5, si param6, int param7) {
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
        var24 = Torquing.field_u;
        ue.field_g = param6;
        vf.field_a = param1;
        var10_int = 0;
        L0: while (true) {
          if (((wd) this).field_t.length <= var10_int) {
            L1: {
              pe.a((byte) -122, param3);
              re.a(param2, 0, param7);
              var26 = new int[param7 * param2];
              var10 = var26;
              if (param4) {
                var12 = -1;
                var11 = -1 + param7;
                var13 = -1;
                break L1;
              } else {
                var12 = param7;
                var11 = 0;
                var13 = 1;
                break L1;
              }
            }
            var14 = param5;
            var15 = 0;
            L2: while (true) {
              if (param2 <= var15) {
                var27 = 0;
                var15 = var27;
                L3: while (true) {
                  if (((wd) this).field_t.length <= var27) {
                    return var10;
                  } else {
                    ((wd) this).field_t[var27].d((byte) -127);
                    var27++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (!param0) {
                    break L4;
                  } else {
                    var14 = var15;
                    break L4;
                  }
                }
                L5: {
                  if (((wd) this).field_u.field_p) {
                    var19_ref_int__ = ((wd) this).field_u.a((byte) 111, var15);
                    var18 = var19_ref_int__;
                    var17 = var19_ref_int__;
                    var16 = var19_ref_int__;
                    break L5;
                  } else {
                    var31 = ((wd) this).field_u.a(-29116, var15);
                    var30 = var31;
                    var29 = var30;
                    var28 = var29;
                    var25 = var28;
                    var19_ref_int____ = var25;
                    var16 = var31[0];
                    var18 = var31[2];
                    var17 = var31[1];
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
                      var20 = var16[var19] >> -146838428;
                      if ((var20 ^ -1) >= -256) {
                        break L7;
                      } else {
                        var20 = 255;
                        break L7;
                      }
                    }
                    L8: {
                      if (var20 >= 0) {
                        break L8;
                      } else {
                        var20 = 0;
                        break L8;
                      }
                    }
                    L9: {
                      var21 = var17[var19] >> 701020452;
                      if (-256 <= (var21 ^ -1)) {
                        break L9;
                      } else {
                        var21 = 255;
                        break L9;
                      }
                    }
                    L10: {
                      if (-1 >= (var21 ^ -1)) {
                        break L10;
                      } else {
                        var21 = 0;
                        break L10;
                      }
                    }
                    L11: {
                      var22 = var18[var19] >> 240316292;
                      if ((var22 ^ -1) >= -256) {
                        break L11;
                      } else {
                        var22 = 255;
                        break L11;
                      }
                    }
                    L12: {
                      if (-1 < (var22 ^ -1)) {
                        var22 = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      var20 = uk.field_b[var20];
                      var21 = uk.field_b[var21];
                      var22 = uk.field_b[var22];
                      var23 = var22 + ((var21 << -1795631928) + (var20 << -2083134704));
                      if (var23 == 0) {
                        break L13;
                      } else {
                        var23 = var23 | -16777216;
                        break L13;
                      }
                    }
                    L14: {
                      int incrementValue$1 = var14;
                      var14++;
                      var26[incrementValue$1] = var23;
                      if (param0) {
                        var14 = var14 + (-1 + param7);
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
            ((wd) this).field_t[var10_int].a(param7, param5 + 17749, param2);
            var10_int++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        L0: {
          if (param4) {
            break L0;
          } else {
            wd.b(23);
            break L0;
          }
        }
        if (param5 == param3) {
          lc.a(param1, param2, -123, param7, param6, param5, param0);
          return;
        } else {
          L1: {
            if (kn.field_e > -param5 + param2) {
              wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
              break L1;
            } else {
              if (qg.field_z < param2 - -param5) {
                wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                break L1;
              } else {
                if (j.field_q > -param3 + param7) {
                  wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                  break L1;
                } else {
                  if (param3 + param7 > qk.field_p) {
                    wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                    break L1;
                  } else {
                    ai.a(param6, param0, param2, param5, param7, param1, -128, param3);
                    break L1;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, la param1, si param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (-1 >= (po.field_u ^ -1)) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((wd) this).field_q.length) {
                break L0;
              } else {
                if (!param1.a(po.field_u, ((wd) this).field_q[var4], (byte) -123)) {
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
              if (((wd) this).field_q.length <= var4) {
                break L0;
              } else {
                if (!param1.a(((wd) this).field_q[var4], false)) {
                  return false;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        var4 = 0;
        L3: while (true) {
          if (((wd) this).field_s.length <= var4) {
            var5 = -105 % ((param0 - 2) / 37);
            return true;
          } else {
            if (!param2.a(((wd) this).field_s[var4], 3)) {
              return false;
            } else {
              var4++;
              continue L3;
            }
          }
        }
    }

    wd(fj param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        am var13 = null;
        am var14 = null;
        int[][] var15 = null;
        am var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        var2 = param0.i((byte) -101);
        var3 = 0;
        var4 = 0;
        ((wd) this).field_t = new am[var2];
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
          if (var2 <= var6) {
            ((wd) this).field_q = new int[var3];
            ((wd) this).field_s = new int[var4];
            var3 = 0;
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var2) {
                ((wd) this).field_u = ((wd) this).field_t[param0.i((byte) -101)];
                int discarded$4 = param0.i((byte) -101);
                int discarded$5 = param0.i((byte) -101);
                var5 = null;
                return;
              } else {
                var16 = ((wd) this).field_t[var6];
                var8 = var16.field_m.length;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var8) {
                    L3: {
                      var9 = var16.e((byte) 27);
                      var10 = var16.f((byte) 57);
                      if (-1 <= (var9 ^ -1)) {
                        break L3;
                      } else {
                        int incrementValue$6 = var3;
                        var3++;
                        ((wd) this).field_q[incrementValue$6] = var9;
                        break L3;
                      }
                    }
                    L4: {
                      if ((var10 ^ -1) >= -1) {
                        break L4;
                      } else {
                        int incrementValue$7 = var4;
                        var4++;
                        ((wd) this).field_s[incrementValue$7] = var10;
                        break L4;
                      }
                    }
                    var5[var6] = null;
                    var6++;
                    continue L1;
                  } else {
                    var16.field_m[var9] = ((wd) this).field_t[var23[var6][var9]];
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            L5: {
              var13 = fn.a(-58, param0);
              var14 = var13;
              if (-1 < (var14.e((byte) 62) ^ -1)) {
                break L5;
              } else {
                var3++;
                break L5;
              }
            }
            L6: {
              if (0 > var14.f((byte) 23)) {
                break L6;
              } else {
                var4++;
                break L6;
              }
            }
            var8 = var14.field_m.length;
            var12[var6] = new int[var8];
            var9 = 0;
            L7: while (true) {
              if (var8 <= var9) {
                ((wd) this).field_t[var6] = var13;
                var6++;
                continue L0;
              } else {
                var22[var6][var9] = param0.i((byte) -101);
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
        field_r = "to over <%0> great games";
    }
}
