/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends bb {
    static boolean field_L;
    private id field_K;
    static ed field_O;
    int field_M;
    static int field_N;
    int field_P;
    private int field_R;
    static boolean field_Q;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param5 - param0 << 1723611368) / param2.field_x;
              var7 = var6_int * param2.field_q + (param0 << 1612409736);
              param3 = param3 + param2.field_q;
              param1 = param1 + param2.field_v;
              var8 = param3 - -(gb.field_d * param1);
              var9 = 0;
              var10 = param2.field_t;
              if (param4 == 2147483647) {
                break L1;
              } else {
                d.j(-47);
                break L1;
              }
            }
            L2: {
              var11 = param2.field_w;
              var12 = -var11 + gb.field_d;
              var13 = 0;
              if (gb.field_b <= param1) {
                break L2;
              } else {
                var14 = -param1 + gb.field_b;
                param1 = gb.field_b;
                var8 = var8 + gb.field_d * var14;
                var9 = var9 + var14 * var11;
                var10 = var10 - var14;
                break L2;
              }
            }
            L3: {
              if (var10 + param1 <= gb.field_i) {
                break L3;
              } else {
                var10 = var10 - (var10 + (param1 - gb.field_i));
                break L3;
              }
            }
            L4: {
              if (gb.field_l > param3) {
                var14 = gb.field_l - param3;
                var8 = var8 + var14;
                var9 = var9 + var14;
                var13 = var13 + var14;
                param3 = gb.field_l;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var6_int * var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 + param3 <= gb.field_h) {
                break L5;
              } else {
                var14 = var11 + (param3 - gb.field_h);
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if ((var10 ^ -1) >= -1) {
                  break L6;
                } else {
                  param1 = -var10;
                  L7: while (true) {
                    if (-1 >= (param1 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param3 = -var11;
                      L8: while (true) {
                        if (-1 >= (param3 ^ -1)) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param1++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -2068757560;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (-1 >= (var15 ^ -1)) {
                              L10: {
                                incrementValue$0 = var9;
                                var9++;
                                var17 = param2.field_B[incrementValue$0];
                                if (0 == var17) {
                                  break L10;
                                } else {
                                  if (255 < var15) {
                                    gb.field_a[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = gb.field_a[var8];
                                    var19 = (16711935 & var17) * var15 + (var18 & 16711935) * var16 >> -129030680 & 16711935;
                                    gb.field_a[var8] = (sc.a(16711908, sc.a(var17, 65280) * var15 + sc.a(65280, var18) * var16) >> -1641925464) + var19;
                                    break L10;
                                  }
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var8++;
                              var9++;
                              break L9;
                            }
                          }
                          param3++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6);

            stackIn_32_1 = new StringBuilder().append("d.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static si a(int param0, ih param1) {
        si stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b(8, (byte) -87);
            if (-1 <= (var2_int ^ -1)) {
              L1: {
                var3 = fb.a((byte) 98, param1) ? 1 : 0;
                var4 = fb.a((byte) 98, param1) ? 1 : 0;
                var5 = new si();
                var5.field_w = (short)param1.b(16, (byte) -87);
                var5.field_n = qg.a((byte) 125, var5.field_n, 16, param1);
                var5.field_f = qg.a((byte) 125, var5.field_f, 16, param1);
                var5.field_P = qg.a((byte) 125, var5.field_P, 16, param1);
                var5.field_j = (short)param1.b(16, (byte) -87);
                var5.field_Q = qg.a((byte) 125, var5.field_Q, 16, param1);
                var5.field_M = qg.a((byte) 125, var5.field_M, 16, param1);
                var5.field_N = qg.a((byte) 125, var5.field_N, 16, param1);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_p = (short)param1.b(16, (byte) -87);
                  var5.field_r = qg.a((byte) 125, var5.field_r, 16, param1);
                  var5.field_K = qg.a((byte) 125, var5.field_K, 16, param1);
                  var5.field_x = qg.a((byte) 125, var5.field_x, 16, param1);
                  var5.field_D = qg.a((byte) 125, var5.field_D, 16, param1);
                  var5.field_F = qg.a((byte) 125, var5.field_F, 16, param1);
                  var5.field_u = qg.a((byte) 125, var5.field_u, 16, param1);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  param1.b(16, (byte) -87);
                  var5.field_E = qg.a((byte) 125, var5.field_E, 16, param1);
                  var5.field_i = qg.a((byte) 125, var5.field_i, 16, param1);
                  var5.field_t = qg.a((byte) 125, var5.field_t, 16, param1);
                  var5.field_q = qg.a((byte) 125, var5.field_q, 16, param1);
                  var5.field_l = qg.a((byte) 125, var5.field_l, 16, param1);
                  break L2;
                }
              }
              L3: {
                if (!fb.a((byte) 98, param1)) {
                  break L3;
                } else {
                  var5.field_s = qg.a((byte) 125, var5.field_s, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!fb.a((byte) 98, param1)) {
                  break L4;
                } else {
                  var5.field_J = bf.a(param1, 8, var5.field_J, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_J.length <= var7) {
                      if (var6 != 0) {
                        var5.field_h = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_J = null;
                        break L4;
                      }
                    } else {
                      if ((var5.field_J[var7] & 255) > var6) {
                        var6 = var5.field_J[var7] & 255;
                        var7++;
                        continue L5;
                      } else {
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              var6 = 37 / ((87 - param0) / 37);
              stackIn_20_0 = (si) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("d.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final int a(int param0, int param1) {
        if (0 > param0 || this.field_K.b(0) <= param0) {
            return -1;
        }
        int var3 = 76 % ((param1 - 14) / 59);
        return this.field_K.b(param0, false);
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_22_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param4 - (param6 - -this.field_M);
                var9 = this.field_u - 2 * this.field_M;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 >= (var8_int ^ -1)) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_R * var8_int / var9;
                if (param5 != 1) {
                  if (-3 != (param5 ^ -1)) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_K.b(0)) {
                        if (0 > var11) {
                          break L3;
                        } else {
                          this.field_K.b(1, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_K.b(var12, false);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  this.field_K.a((byte) 47, var8_int);
                  break L3;
                }
              }
              stackIn_20_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("d.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_22_0 != 0;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 != -1) {
            field_O = (ed) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    final int i(int param0) {
        if (param0 <= 24) {
            this.i(-5);
        }
        return this.field_K.b(0);
    }

    final static void a(int param0, int param1, qc param2, qc param3, int param4, int param5, int param6, fa param7, fa param8, qc param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              bk.a(-5237, param15, param7, param8);
              hg.a(0, param17, param0, param14, param16);
              rb.a(param6, param4, (byte) 83);
              sk.a(param11, param2, param5, 443, param3, param19);
              if (param20 == 255) {
                break L1;
              } else {
                field_Q = false;
                break L1;
              }
            }
            ai.a(param10, param1, param9, false);
            mh.a(param12, 1, param18, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("d.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 9) {
            this.field_K = (id) null;
        }
        return this.field_R;
    }

    static {
        field_L = false;
        field_O = new ed();
    }
}
