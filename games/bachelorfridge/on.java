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
        int var4_int = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (sp.field_l < 0) {
                var4_int = 0;
                L2: while (true) {
                  if (this.field_o.length <= var4_int) {
                    break L1;
                  } else {
                    if (!param1.a(0, this.field_o[var4_int])) {
                      stackIn_13_0 = 0;
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
                  if (var4_int >= this.field_o.length) {
                    break L1;
                  } else {
                    if (param1.a(-122, this.field_o[var4_int], sp.field_l)) {
                      var4_int++;
                      continue L3;
                    } else {
                      stackIn_6_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            L4: while (true) {
              if (var4_int >= this.field_q.length) {
                L5: {
                  if (param2 <= -44) {
                    break L5;
                  } else {
                    on.e(-105);
                    break L5;
                  }
                }
                stackIn_24_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param0.c((byte) -98, this.field_q[var4_int])) {
                  var4_int++;
                  continue L4;
                } else {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("on.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_24_0 != 0;
            }
          }
        }
    }

    on(lu param0) {
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
        k var13 = null;
        k var14 = null;
        k var15 = null;
        try {
          L0: {
            var2_int = param0.b(16711935);
            var3 = 0;
            var4 = 0;
            this.field_y = new k[var2_int];
            var12 = new int[var2_int][];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var2_int) {
                this.field_o = new int[var3];
                this.field_q = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var2_int) {
                    this.field_v = this.field_y[param0.b(16711935)];
                    param0.b(16711935);
                    param0.b(16711935);
                    var5 = (int[][]) null;
                    break L0;
                  } else {
                    var15 = this.field_y[var6];
                    var8 = var15.field_g.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var15.a(-2359);
                          var10 = var15.c((byte) 47);
                          if (-1 <= (var9 ^ -1)) {
                            break L4;
                          } else {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_o[incrementValue$0] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (-1 <= (var10 ^ -1)) {
                            break L5;
                          } else {
                            incrementValue$1 = var4;
                            var4++;
                            this.field_q[incrementValue$1] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_g[var9] = this.field_y[var12[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = wb.b(param0, 94);
                  var14 = var13;
                  if (-1 >= (var14.a(-2359) ^ -1)) {
                    var3++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((var14.c((byte) 78) ^ -1) > -1) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_g.length;
                array$2 = new int[var8];
                var12[var6] = array$2;
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var8) {
                    this.field_y[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var12[var6][var9] = param0.b(16711935);
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

            stackIn_27_1 = new StringBuilder().append("on.<init>(");

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
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final int[] a(double param0, boolean param1, q param2, int param3, int param4, vr param5, boolean param6, int param7) {
        int incrementValue$0 = 0;
        int[] stackIn_9_0 = null;
        int[] stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
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
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        var24 = BachelorFridge.field_y;
        try {
          L0: {
            da.field_c = param2;
            l.field_r = param5;
            var10_int = 0;
            L1: while (true) {
              if (var10_int >= this.field_y.length) {
                L2: {
                  vd.a(param0, 81);
                  jp.a(-117, param3, param4);
                  var26 = new int[param4 * param3];
                  var10 = var26;
                  if (!param6) {
                    var13 = 1;
                    var12 = param3;
                    var11 = 0;
                    break L2;
                  } else {
                    var11 = -1 + param3;
                    var13 = -1;
                    var12 = -1;
                    break L2;
                  }
                }
                var14 = 0;
                if (param7 == -1) {
                  var15 = 0;
                  L3: while (true) {
                    if (param4 <= var15) {
                      var27 = 0;
                      var15 = var27;
                      L4: while (true) {
                        if (var27 >= this.field_y.length) {
                          stackIn_46_0 = (int[]) (var10);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_y[var27].b(-256);
                          var27++;
                          continue L4;
                        }
                      }
                    } else {
                      L5: {
                        if (param1) {
                          var14 = var15;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_v.field_f) {
                          var19_ref_int__ = this.field_v.a(var15, 0);
                          var17 = var19_ref_int__;
                          var16 = var19_ref_int__;
                          var18 = var19_ref_int__;
                          break L6;
                        } else {
                          var29 = this.field_v.a(false, var15);
                          var28 = var29;
                          var25 = var28;
                          var19_ref_int____ = var25;
                          var17 = var29[1];
                          var16 = var29[0];
                          var18 = var29[2];
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
                            var20 = var16[var19] >> -182242780;
                            if (-256 <= (var20 ^ -1)) {
                              break L8;
                            } else {
                              var20 = 255;
                              break L8;
                            }
                          }
                          L9: {
                            if (0 <= var20) {
                              break L9;
                            } else {
                              var20 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            var21 = var17[var19] >> 2127936420;
                            if (var21 <= 255) {
                              break L10;
                            } else {
                              var21 = 255;
                              break L10;
                            }
                          }
                          L11: {
                            if (-1 < (var21 ^ -1)) {
                              var21 = 0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            var22 = var18[var19] >> 1257436356;
                            if (-256 > (var22 ^ -1)) {
                              var22 = 255;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            var21 = jna.field_f[var21];
                            if ((var22 ^ -1) <= -1) {
                              break L13;
                            } else {
                              var22 = 0;
                              break L13;
                            }
                          }
                          L14: {
                            var20 = jna.field_f[var20];
                            var22 = jna.field_f[var22];
                            var23 = (var20 << -1244182224) - -(var21 << -1332377400) - -var22;
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
                            if (param1) {
                              var14 = var14 + (-1 + param3);
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
                  stackIn_9_0 = (int[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                this.field_y[var10_int].a(param4, (byte) -93, param3);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10_ref = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var10_ref);

            stackIn_49_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L16;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L17;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L17;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_46_0;
        }
    }

    static {
        field_n = 0;
        field_u = new int[]{3, 5, 1, 3, 1, 1, 1, 1, 2, 1, 1, 1, 3, 5, 2, 1, 1, 1, 5, 1, 2, 2, 1, 1, 1, 5, 3, 3, 2, 2, 10, 5, 3, 5, 3, 5, 5, 3, 10, 5, 5, 5, 3, 5, 3, 3, 2, 5, 3, 1};
        field_s = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_w = new int[8192];
        field_p = "Buying or selling an account";
        field_r = new eaa();
    }
}
