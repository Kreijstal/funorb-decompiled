/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb implements n {
    private long field_a;
    static String field_c;
    static je field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var4 = -107 / ((param2 - 41) / 55);
            var3 = nf.a(true, param0);
            if ((param1.indexOf(param0) ^ -1) != 0) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                L1: {
                  L2: {
                    if (param1.startsWith(param0)) {
                      break L2;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param1.endsWith(param0)) {
                          break L2;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackIn_12_0 = 0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("rb.L(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    abstract gu c(int param0);

    final static boolean a(long param0, String param1, int param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -17231) {
                break L1;
              } else {
                field_b = (je) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (param3 != 2) {
                      break L4;
                    } else {
                      if (!wq.a(param0, param1, (byte) -125)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("rb.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static ne a(int param0, byte param1, bv param2) {
        ne var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        ne stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 != (param0 ^ -1)) {
              var3 = new ne();
              no.a(param2, var3, param0, -24721);
              var3.j(-78);
              var4 = -72 / ((-5 - param1) / 60);
              stackIn_4_0 = (ne) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("rb.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ne) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pu var4_ref_pu = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        pu var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            mn.field_t = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = iq.field_a.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = mn.field_t[param0] >> -629540216;
                  var4 = mn.field_t[10] >> 264936072;
                  var5 = mn.field_t[11] >> -1314104728;
                  var6 = ib.field_j << 1554443236;
                  var7 = 0;
                  var8 = ae.b(var6, 100) >> 1785809320;
                  var9 = g.a(param0 + -10, var6) >> 534432968;
                  if (sm.field_d == -1) {
                    break L2;
                  } else {
                    if (ko.field_b != -1) {
                      var9 = -128;
                      var7 = sm.field_d - 320;
                      var8 = -ko.field_b + 240;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 + -var3;
                var13 = var8 - var4;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L3: while (true) {
                  if (iq.field_a.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= iq.field_a.length) {
                        var21[var16] = -2147483648;
                        var17 = iq.field_a[var16];
                        cq.a((byte) -116, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (-4 >= (var18 ^ -1)) {
                            ou.a(var17, true, true, false, false, pd.field_a, mn.field_t);
                            fp.a(var13, var17, var9, var8, var12, var7, var14, (byte) 120);
                            var15++;
                            continue L3;
                          } else {
                            pd.field_a[var18] = pd.field_a[var18] + sd.field_s[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var21[var16] < var21[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_pu = iq.field_a[var3];
                var4_ref_pu.a(-3831);
                cq.a((byte) -116, var3);
                var5 = var4_ref_pu.field_L + var4_ref_pu.field_p >> 470108033;
                var6 = var4_ref_pu.field_H + var4_ref_pu.field_P >> -401580991;
                var7 = var4_ref_pu.field_D + var4_ref_pu.field_J >> -1252407999;
                var8 = mn.field_t[9] >> -1855318878;
                var9 = mn.field_t[10] >> -710206046;
                var10_int = mn.field_t[11] >> -1792785598;
                var11 = var8 * pd.field_a[3] + pd.field_a[4] * var9 - -(pd.field_a[5] * var10_int) >> -1764664338;
                var12 = var10_int * pd.field_a[8] + (var8 * pd.field_a[6] + var9 * pd.field_a[7]) >> -2022129842;
                var13 = pd.field_a[10] * var9 + pd.field_a[9] * var8 + pd.field_a[11] * var10_int >> -1708086482;
                var2[var3] = var11 * var5 - -(var12 * var6) - -(var7 * var13) >> -893537680;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "rb.C(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 <= 123) {
            return;
        }
        this.field_a = vi.b(99);
    }

    public final gu a(boolean param0) {
        if (param0) {
            return (gu) null;
        }
        if (!(!this.b(81))) {
            return lq.field_c;
        }
        if (!((350L + this.field_a ^ -1L) >= (vi.b(-96) ^ -1L))) {
            return ad.field_K;
        }
        return this.c(118);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ru param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
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
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param4 + param3 << -602358776) / param5.field_g;
              var7 = var6_int * param5.field_i + (param4 << -2082097144);
              param2 = param2 + param5.field_i;
              param0 = param0 + param5.field_d;
              var8 = param2 - -(qn.field_l * param0);
              var9 = 0;
              var10 = param5.field_h;
              var11 = param5.field_e;
              var12 = qn.field_l + -var11;
              if (param0 < qn.field_a) {
                var14 = qn.field_a + -param0;
                param0 = qn.field_a;
                var10 = var10 - var14;
                var9 = var9 + var11 * var14;
                var8 = var8 + qn.field_l * var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1708086482) {
                break L2;
              } else {
                rb.e(-63);
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (param2 < qn.field_j) {
                var14 = qn.field_j + -param2;
                var9 = var9 + var14;
                var8 = var8 + var14;
                param2 = qn.field_j;
                var13 = var13 + var14;
                var12 = var12 + var14;
                var7 = var7 + var6_int * var14;
                var11 = var11 - var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (qn.field_f >= var10 + param0) {
                break L4;
              } else {
                var10 = var10 - (param0 - -var10 + -qn.field_f);
                break L4;
              }
            }
            L5: {
              if (qn.field_e >= var11 + param2) {
                break L5;
              } else {
                var14 = -qn.field_e + param2 - -var11;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if ((var10 ^ -1) < -1) {
                  param0 = -var10;
                  L7: while (true) {
                    if (-1 >= (param0 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param2 = -var11;
                      L8: while (true) {
                        if (param2 >= 0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param0++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -1513187960;
                            var14 = var14 + var6_int;
                            var16 = -var15 + 256;
                            if (0 <= var15) {
                              L10: {
                                incrementValue$0 = var9;
                                var9++;
                                var17 = param5.field_j[param5.field_k[incrementValue$0] & 255];
                                if (0 != var17) {
                                  if (255 < var15) {
                                    qn.field_d[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = qn.field_d[var8];
                                    var19 = (var17 & 16711935) * var15 + (16711935 & var18) * var16 >> 208566024 & 16711935;
                                    qn.field_d[var8] = var19 + rn.a(65280, rn.a(var17, 65280) * var15 + rn.a(var18, 65280) * var16 >> -1903824056);
                                    break L10;
                                  }
                                } else {
                                  break L10;
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
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
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
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("rb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                field_b = (je) null;
                break L1;
              }
            }
            L2: {
              if ((param1[param0 >> 106908741] & 1 << (param0 & 31)) == 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public final String a(byte param0) {
        if (this.b(88)) {
            return null;
        }
        if ((vi.b(65) ^ -1L) > (350L + this.field_a ^ -1L)) {
            return null;
        }
        if (param0 != 55) {
            this.field_a = -82L;
        }
        return this.b((byte) -71);
    }

    public static void d(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 65280) {
            field_c = (String) null;
        }
    }

    abstract String b(byte param0);

    static {
        field_c = "This <%0> is currently wielding the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
    }
}
