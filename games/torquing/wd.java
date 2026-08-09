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
            field_r = (String) null;
        }
    }

    final int[] a(boolean param0, la param1, int param2, double param3, boolean param4, int param5, si param6, int param7) {
        int incrementValue$0 = 0;
        int[] stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
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
        var24 = Torquing.field_u;
        try {
          L0: {
            ue.field_g = param6;
            vf.field_a = param1;
            var10_int = 0;
            L1: while (true) {
              if (this.field_t.length <= var10_int) {
                L2: {
                  pe.a((byte) -122, param3);
                  re.a(param2, 0, param7);
                  var26 = new int[param7 * param2];
                  var10 = var26;
                  if (param4) {
                    var12 = -1;
                    var11 = -1 + param7;
                    var13 = -1;
                    break L2;
                  } else {
                    var12 = param7;
                    var11 = 0;
                    var13 = 1;
                    break L2;
                  }
                }
                var14 = param5;
                var15 = 0;
                L3: while (true) {
                  if (param2 <= var15) {
                    var27 = 0;
                    var15 = var27;
                    L4: while (true) {
                      if (this.field_t.length <= var27) {
                        stackIn_40_0 = (int[]) (var10);
                        break L0;
                      } else {
                        this.field_t[var27].d((byte) -127);
                        var27++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!param0) {
                        break L5;
                      } else {
                        var14 = var15;
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_u.field_p) {
                        var19_ref_int__ = this.field_u.a((byte) 111, var15);
                        var18 = var19_ref_int__;
                        var17 = var19_ref_int__;
                        var16 = var19_ref_int__;
                        break L6;
                      } else {
                        var29 = this.field_u.a(-29116, var15);
                        var28 = var29;
                        var25 = var28;
                        var19_ref_int____ = var25;
                        var16 = var29[0];
                        var18 = var29[2];
                        var17 = var29[1];
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
                          var20 = var16[var19] >> -146838428;
                          if ((var20 ^ -1) >= -256) {
                            break L8;
                          } else {
                            var20 = 255;
                            break L8;
                          }
                        }
                        L9: {
                          if (var20 >= 0) {
                            break L9;
                          } else {
                            var20 = 0;
                            break L9;
                          }
                        }
                        L10: {
                          var21 = var17[var19] >> 701020452;
                          if (-256 <= (var21 ^ -1)) {
                            break L10;
                          } else {
                            var21 = 255;
                            break L10;
                          }
                        }
                        L11: {
                          if (-1 >= (var21 ^ -1)) {
                            break L11;
                          } else {
                            var21 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var22 = var18[var19] >> 240316292;
                          if ((var22 ^ -1) >= -256) {
                            break L12;
                          } else {
                            var22 = 255;
                            break L12;
                          }
                        }
                        L13: {
                          if (-1 < (var22 ^ -1)) {
                            var22 = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          var20 = uk.field_b[var20];
                          var21 = uk.field_b[var21];
                          var22 = uk.field_b[var22];
                          var23 = var22 + ((var21 << -1795631928) + (var20 << -2083134704));
                          if (var23 == 0) {
                            break L14;
                          } else {
                            var23 = var23 | -16777216;
                            break L14;
                          }
                        }
                        L15: {
                          incrementValue$0 = var14;
                          var14++;
                          var26[incrementValue$0] = var23;
                          if (param0) {
                            var14 = var14 + (-1 + param7);
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
                this.field_t[var10_int].a(param7, param5 + 17749, param2);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var10_ref);

            stackIn_43_1 = new StringBuilder().append("wd.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L16;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L17;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L17;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_44_0), stackIn_47_2 + ',' + param7 + ')');
        }
        return stackIn_40_0;
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
        int var4_int = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
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
        int var5 = 0;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (-1 >= (po.field_u ^ -1)) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_q.length) {
                    break L1;
                  } else {
                    if (!param1.a(po.field_u, this.field_q[var4_int], (byte) -123)) {
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
                  if (this.field_q.length <= var4_int) {
                    break L1;
                  } else {
                    if (!param1.a(this.field_q[var4_int], false)) {
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
            var4_int = 0;
            L4: while (true) {
              if (this.field_s.length <= var4_int) {
                var5 = -105 % ((param0 - 2) / 37);
                stackIn_24_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!param2.a(this.field_s[var4_int], 3)) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("wd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              return stackIn_24_0 != 0;
            }
          }
        }
    }

    wd(fj param0) {
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
        am var13 = null;
        am var14 = null;
        am var15 = null;
        try {
          L0: {
            var2_int = param0.i((byte) -101);
            var3 = 0;
            var4 = 0;
            this.field_t = new am[var2_int];
            var12 = new int[var2_int][];
            var6 = 0;
            L1: while (true) {
              if (var2_int <= var6) {
                this.field_q = new int[var3];
                this.field_s = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var2_int) {
                    this.field_u = this.field_t[param0.i((byte) -101)];
                    param0.i((byte) -101);
                    param0.i((byte) -101);
                    var5 = (int[][]) null;
                    break L0;
                  } else {
                    var15 = this.field_t[var6];
                    var8 = var15.field_m.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var8) {
                        L4: {
                          var9 = var15.e((byte) 27);
                          var10 = var15.f((byte) 57);
                          if (-1 <= (var9 ^ -1)) {
                            break L4;
                          } else {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_q[incrementValue$0] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if ((var10 ^ -1) >= -1) {
                            break L5;
                          } else {
                            incrementValue$1 = var4;
                            var4++;
                            this.field_s[incrementValue$1] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_m[var9] = this.field_t[var12[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = fn.a(-58, param0);
                  var14 = var13;
                  if (-1 >= (var14.e((byte) 62) ^ -1)) {
                    var3++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (0 > var14.f((byte) 23)) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_m.length;
                array$2 = new int[var8];
                var12[var6] = array$2;
                var9 = 0;
                L8: while (true) {
                  if (var8 <= var9) {
                    this.field_t[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var12[var6][var9] = param0.i((byte) -101);
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

            stackIn_27_1 = new StringBuilder().append("wd.<init>(");

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
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_r = "to over <%0> great games";
    }
}
