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
        int incrementValue$0 = 0;
        int[] stackIn_43_0 = null;
        int[] stackIn_47_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        int[] var10 = null;
        RuntimeException var10_ref = null;
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
        int[][] var27 = null;
        int[][] var28 = null;
        var24 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            mk.field_P = param7;
            nk.field_Hb = param0;
            var10_int = 0;
            L1: while (true) {
              if (var10_int >= this.field_v.length) {
                L2: {
                  dl.a(param1, (byte) -107);
                  ib.a((byte) -122, param4, param6);
                  var26 = new int[param6 * param4];
                  var10 = var26;
                  if (!param2) {
                    var11 = 0;
                    var13 = 1;
                    var12 = param6;
                    break L2;
                  } else {
                    var13 = -1;
                    var12 = -1;
                    var11 = param6 + -1;
                    break L2;
                  }
                }
                var14 = 0;
                var15 = 0;
                L3: while (true) {
                  if (param4 <= var15) {
                    var15 = 0;
                    if (param5 == 27127) {
                      L4: while (true) {
                        if (var15 >= this.field_v.length) {
                          stackIn_47_0 = (int[]) (var10);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_v[var15].f(2);
                          var15++;
                          continue L4;
                        }
                      }
                    } else {
                      stackIn_43_0 = (int[]) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    L5: {
                      if (param3) {
                        var14 = var15;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_A.field_o) {
                        var19_ref_int__ = this.field_A.c(var15, param5 + -27024);
                        var18 = var19_ref_int__;
                        var16 = var19_ref_int__;
                        var17 = var19_ref_int__;
                        break L6;
                      } else {
                        var28 = this.field_A.b(-3780, var15);
                        var27 = var28;
                        var25 = var27;
                        var19_ref_int____ = var25;
                        var17 = var28[1];
                        var16 = var28[0];
                        var18 = var28[2];
                        break L6;
                      }
                    }
                    var19 = var11;
                    L7: while (true) {
                      if (var12 == var19) {
                        var15++;
                        continue L3;
                      } else {
                        L8: {
                          var20 = var16[var19] >> 358944100;
                          if (-256 > (var20 ^ -1)) {
                            var20 = 255;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (var20 < 0) {
                            var20 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var21 = var17[var19] >> -1323489532;
                          if (var21 <= 255) {
                            break L10;
                          } else {
                            var21 = 255;
                            break L10;
                          }
                        }
                        L11: {
                          if (var21 < 0) {
                            var21 = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          var22 = var18[var19] >> 238011972;
                          if ((var22 ^ -1) >= -256) {
                            break L12;
                          } else {
                            var22 = 255;
                            break L12;
                          }
                        }
                        L13: {
                          var21 = li.field_l[var21];
                          if (0 > var22) {
                            var22 = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          var20 = li.field_l[var20];
                          var22 = li.field_l[var22];
                          var23 = (var20 << -380984080) - (-(var21 << -1761461944) - var22);
                          if (var23 != 0) {
                            var23 = var23 | -16777216;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          incrementValue$0 = var14;
                          var14++;
                          var26[incrementValue$0] = var23;
                          if (param3) {
                            var14 = var14 + (-1 + param6);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var19 = var19 + var13;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                this.field_v[var10_int].b(param4, param6, 255);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10_ref = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var10_ref);

            stackIn_50_1 = new StringBuilder().append("he.D(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L16;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L17;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L17;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_51_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_43_0;
        } else {
          return stackIn_47_0;
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
        mi var5 = null;
        int var4 = 0;
        try {
            var5 = uh.field_Wb;
            var5.j(param0, 118);
            var5.field_u = var5.field_u + 1;
            var4 = var5.field_u;
            var5.f(1, 117);
            var5.f(param1.field_u, -71);
            if (param2 != -27011) {
                he.a((byte) -108, 124);
            }
            var5.b(param1.field_q, (byte) -124);
            var5.e(param1.field_s, 0);
            var5.e(param1.field_o, 0);
            var5.e(param1.field_r, 0);
            var5.e(param1.field_n, 0);
            var5.c(var4, 85);
            var5.b((byte) 53, var5.field_u - var4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "he.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(r param0, ka param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 >= (b.field_i ^ -1)) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_y.length) {
                    break L1;
                  } else {
                    if (!param0.b(param2 ^ 0, b.field_i, this.field_y[var4_int])) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_y.length) {
                    break L1;
                  } else {
                    if (!param0.a(this.field_y[var4_int], (byte) 53)) {
                      stackIn_7_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            var4_int = param2;
            L4: while (true) {
              if (this.field_w.length <= var4_int) {
                stackIn_23_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param1.f(0, this.field_w[var4_int])) {
                  var4_int++;
                  continue L4;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("he.C(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    he(ed param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int[] array$2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        ji var15 = null;
        try {
          L0: {
            var2_int = param0.h(-11);
            var3 = 0;
            var4 = 0;
            var12 = new int[var2_int][];
            this.field_v = new ji[var2_int];
            var6 = 0;
            L1: while (true) {
              if (var2_int <= var6) {
                this.field_y = new int[var3];
                var3 = 0;
                this.field_w = new int[var4];
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var2_int <= var6) {
                    this.field_A = this.field_v[param0.h(-11)];
                    param0.h(-11);
                    var5 = (int[][]) null;
                    param0.h(-11);
                    break L0;
                  } else {
                    var15 = this.field_v[var6];
                    var8 = var15.field_u.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var15.a((byte) -117);
                          var10 = var15.e(6557);
                          if ((var9 ^ -1) >= -1) {
                            break L4;
                          } else {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_y[incrementValue$0] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if ((var10 ^ -1) >= -1) {
                            break L5;
                          } else {
                            incrementValue$1 = var4;
                            var4++;
                            this.field_w[incrementValue$1] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_u[var9] = this.field_v[var12[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = ve.a((byte) -109, param0);
                  var14 = var13;
                  if (0 > var14.a((byte) -117)) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (-1 < (var14.e(6557) ^ -1)) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_u.length;
                array$2 = new int[var8];
                var12[var6] = array$2;
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var8) {
                    this.field_v[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var12[var6][var9] = param0.h(-11);
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("he.<init>(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_B = "Owner";
        field_t = "Personal Best: <%0>";
        field_z = "Play the game without logging in just yet";
        field_u = new int[4];
    }
}
