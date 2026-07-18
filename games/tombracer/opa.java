/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opa extends qra {
    private boolean field_o;
    private gsa[] field_r;
    private boolean field_m;
    private boolean field_p;
    private boolean field_q;
    private boolean field_s;
    static mi[] field_n;

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5) {
        RuntimeException runtimeException = null;
        kh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              var6 = ql.field_k;
              var6.k(param2, param3 + -35359);
              var6.field_h = var6.field_h + 1;
              if (param3 == 32371) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              var7 = var6.field_h;
              var6.i(param0, 0);
              if (param0 == 2) {
                var6.a(param4, false);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (param1 == null) {
                  break L4;
                } else {
                  int discarded$5 = wq.a(param1, (uia) (Object) var6, 0);
                  if (!TombRacer.field_G) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var6.f(-1477662136, param5);
              break L3;
            }
            var6.d(-var7 + var6.field_h, (byte) 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("opa.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 25) {
                break L1;
              } else {
                ((opa) this).field_m = false;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "opa.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public static void f(int param0) {
        try {
            field_n = null;
            if (param0 < 73) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "opa.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_25_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_16_0 = false;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 > param1) {
              if (~(param1 + 1) > ~param2) {
                L1: {
                  if (param2 <= param1 - -5) {
                    break L1;
                  } else {
                    if (~param0 == ~param5) {
                      break L1;
                    } else {
                      var7_int = (1 & (param5 & param0)) + (param5 >> 1598161089) + (param0 >> -668009087);
                      var8 = param1;
                      var9 = param0;
                      var10 = param5;
                      var11 = param1;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (param2 <= var11) {
                              break L4;
                            } else {
                              var12 = boa.field_n[var11];
                              stackOut_25_0 = param6;
                              stackIn_43_0 = stackOut_25_0 ? 1 : 0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var14 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (!stackIn_26_0) {
                                    stackOut_31_0 = ic.field_c[var12];
                                    stackIn_32_0 = stackOut_31_0;
                                    break L5;
                                  } else {
                                    stackOut_29_0 = jk.field_h[var12];
                                    stackIn_32_0 = stackOut_29_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  L7: {
                                    var13 = stackIn_32_0;
                                    if (~var7_int > ~var13) {
                                      break L7;
                                    } else {
                                      if (~var10 <= ~var13) {
                                        break L6;
                                      } else {
                                        var10 = var13;
                                        if (var14 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  boa.field_n[var11] = boa.field_n[var8];
                                  int incrementValue$1 = var8;
                                  var8++;
                                  boa.field_n[incrementValue$1] = var12;
                                  if (~var13 <= ~var9) {
                                    break L6;
                                  } else {
                                    var9 = var13;
                                    break L6;
                                  }
                                }
                                var11++;
                                if (var14 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          opa.a(param0, param1, var8, param3, (byte) -100, var9, param6);
                          stackOut_42_0 = var10;
                          stackIn_43_0 = stackOut_42_0;
                          break L3;
                        }
                        opa.a(stackIn_43_0, var8, param2, param3, param4, param5, param6);
                        break L0;
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L8: while (true) {
                  stackOut_12_0 = ~var7_int;
                  stackIn_13_0 = stackOut_12_0;
                  L9: while (true) {
                    L10: {
                      if (stackIn_13_0 >= ~param1) {
                        break L10;
                      } else {
                        var8 = param1;
                        L11: while (true) {
                          L12: {
                            if (~var8 <= ~var7_int) {
                              break L12;
                            } else {
                              var9 = boa.field_n[var8];
                              var10 = boa.field_n[var8 + 1];
                              stackOut_16_0 = cl.a(param6, (byte) 119, var10, var9);
                              stackIn_13_0 = stackOut_16_0 ? 1 : 0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var14 != 0) {
                                continue L9;
                              } else {
                                L13: {
                                  if (!stackIn_17_0) {
                                    break L13;
                                  } else {
                                    boa.field_n[var8] = var10;
                                    boa.field_n[var8 - -1] = var9;
                                    break L13;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "opa.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean e(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -9202) {
                break L1;
              } else {
                ((opa) this).field_m = true;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "opa.E(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13_int = 0;
        String var13 = null;
        gsa var14_ref_gsa = null;
        int var14 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        String var20_ref_String = null;
        int var20 = 0;
        int var21_int = 0;
        nh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        nh var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_164_0 = 0;
        StringBuilder stackIn_165_0 = null;
        StringBuilder stackIn_167_0 = null;
        StringBuilder stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_183_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        int stackIn_197_0 = 0;
        StringBuilder stackIn_198_0 = null;
        StringBuilder stackIn_200_0 = null;
        StringBuilder stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        int stackIn_211_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_230_0 = 0;
        StringBuilder stackIn_231_0 = null;
        StringBuilder stackIn_233_0 = null;
        StringBuilder stackIn_234_0 = null;
        int stackIn_234_1 = 0;
        int stackIn_244_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        int stackIn_251_0 = 0;
        int stackIn_251_1 = 0;
        int stackIn_252_0 = 0;
        int stackIn_252_1 = 0;
        int stackIn_252_2 = 0;
        int stackIn_256_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_161_0 = 0;
        StringBuilder stackOut_164_0 = null;
        StringBuilder stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        StringBuilder stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int stackOut_175_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_182_1 = 0;
        int stackOut_185_0 = 0;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        int stackOut_183_0 = 0;
        int stackOut_183_1 = 0;
        int stackOut_183_2 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        StringBuilder stackOut_197_0 = null;
        StringBuilder stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        StringBuilder stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_208_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_212_0 = 0;
        int stackOut_212_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_229_0 = 0;
        int stackOut_227_0 = 0;
        StringBuilder stackOut_230_0 = null;
        StringBuilder stackOut_233_0 = null;
        int stackOut_233_1 = 0;
        StringBuilder stackOut_231_0 = null;
        int stackOut_231_1 = 0;
        int stackOut_241_0 = 0;
        int stackOut_243_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_248_1 = 0;
        int stackOut_251_0 = 0;
        int stackOut_251_1 = 0;
        int stackOut_251_2 = 0;
        int stackOut_249_0 = 0;
        int stackOut_249_1 = 0;
        int stackOut_249_2 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_255_0 = 0;
        var27 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -50) {
                break L1;
              } else {
                ((opa) this).field_s = false;
                break L1;
              }
            }
            ura.a(-10985);
            la.field_j.a(0, 0);
            ik.field_h.a(0, 0);
            ng.field_b[1].a(50, -10);
            var3_int = -250 + aaa.a(false);
            var4 = -10 + ng.field_b[1].c() + -70;
            ng.field_b[1].a(var3_int, -10);
            nm.field_l.a(var3_int, 0);
            nm.field_l.a(var3_int, var4);
            var5 = 3;
            var6 = (var3_int + -50) / (var5 - -1);
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var5 >= ~var7) {
                    break L4;
                  } else {
                    var8 = 50 - -((1 + var7) * var6);
                    ng.field_b[0].a(var8, 0);
                    var7++;
                    if (var27 != 0) {
                      break L3;
                    } else {
                      if (var27 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var7 = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (3 <= var7) {
                      break L7;
                    } else {
                      var8 = -30 + (var3_int + -50 >> 2071501314) * 3;
                      var9 = (var7 + 1) * (var4 / 4) + 20;
                      ng.field_b[0].a((float)var8, (float)var9, 4096, 16384, 3, 1610612736, 1);
                      ng.field_b[0].a((float)(var8 - -150), (float)var9, 4096, 16384, 3, 1610612736, 1);
                      var7++;
                      if (var27 != 0) {
                        break L6;
                      } else {
                        if (var27 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var7 = ((opa) this).field_c.field_E;
                  break L6;
                }
                var8 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        if (((opa) this).field_c.field_k <= var8) {
                          break L11;
                        } else {
                          var9 = var3_int + 32;
                          stackOut_19_0 = 95 * var8;
                          stackOut_19_1 = 70;
                          stackOut_19_2 = -4;
                          stackIn_99_0 = stackOut_19_0;
                          stackIn_99_1 = stackOut_19_1;
                          stackIn_99_2 = stackOut_19_2;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          stackIn_20_2 = stackOut_19_2;
                          if (var27 != 0) {
                            L12: while (true) {
                              stackOut_99_0 = stackIn_99_0;
                              stackOut_99_1 = stackIn_99_1 ^ stackIn_99_2;
                              stackIn_100_0 = stackOut_99_0;
                              stackIn_100_1 = stackOut_99_1;
                              L13: while (true) {
                                if (stackIn_100_0 <= stackIn_100_1) {
                                  break L10;
                                } else {
                                  stackOut_101_0 = 95 * var8 + 105;
                                  stackIn_256_0 = stackOut_101_0;
                                  stackIn_102_0 = stackOut_101_0;
                                  if (var27 != 0) {
                                    break L9;
                                  } else {
                                    L14: {
                                      stackOut_102_0 = stackIn_102_0;
                                      stackIn_107_0 = stackOut_102_0;
                                      stackIn_103_0 = stackOut_102_0;
                                      if (((opa) this).field_c.field_k < 3) {
                                        stackOut_107_0 = stackIn_107_0;
                                        stackOut_107_1 = 95;
                                        stackIn_108_0 = stackOut_107_0;
                                        stackIn_108_1 = stackOut_107_1;
                                        break L14;
                                      } else {
                                        stackOut_103_0 = stackIn_103_0;
                                        stackIn_105_0 = stackOut_103_0;
                                        stackOut_105_0 = stackIn_105_0;
                                        stackOut_105_1 = 0;
                                        stackIn_108_0 = stackOut_105_0;
                                        stackIn_108_1 = stackOut_105_1;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      var9 = stackIn_108_0 + stackIn_108_1;
                                      if (~(-100 + fd.field_e) < ~var7) {
                                        break L15;
                                      } else {
                                        if (~var8 == ~((opa) this).field_c.e(2)) {
                                          L16: {
                                            L17: {
                                              if (((opa) this).field_c.field_L == ((opa) this).field_c.field_v[var8]) {
                                                break L17;
                                              } else {
                                                oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9 - 22, (var3_int + 50 >> -1164132767) + 20, -1);
                                                if (var27 == 0) {
                                                  break L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9 + -22, (var3_int + 50 >> 1972141153) - -20, -1);
                                            break L16;
                                          }
                                          var10 = 0;
                                          var11 = 0;
                                          L18: while (true) {
                                            L19: {
                                              if (((opa) this).field_r.length <= var11) {
                                                break L19;
                                              } else {
                                                stackOut_122_0 = var11;
                                                stackOut_122_1 = var8;
                                                stackIn_100_0 = stackOut_122_0;
                                                stackIn_100_1 = stackOut_122_1;
                                                stackIn_123_0 = stackOut_122_0;
                                                stackIn_123_1 = stackOut_122_1;
                                                if (var27 != 0) {
                                                  continue L13;
                                                } else {
                                                  L20: {
                                                    if (stackIn_123_0 == stackIn_123_1) {
                                                      break L20;
                                                    } else {
                                                      if (((opa) this).field_r[var8].field_x != ((opa) this).field_r[var11].field_x) {
                                                        break L20;
                                                      } else {
                                                        var10 = 1;
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  var11++;
                                                  if (var27 == 0) {
                                                    continue L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                            if (var10 != 0) {
                                              oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9, 20 + (50 + var3_int >> -479353247), -1);
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L21: {
                                      L22: {
                                        L23: {
                                          tga.field_a.KA(0, var9 - 100, (int)(2.0 + ((opa) this).field_r[var8].field_q), var9 - -50);
                                          var10 = wga.field_a[var8];
                                          gca.field_a.a(62, 10 + var9 + -95, 0, var10 | -1006632960, 1);
                                          tga.field_a.la();
                                          ((opa) this).field_c.field_H[var8].n((byte) -42).a(-1, (int)((opa) this).field_r[var8].field_q, 1400, 1536, var9);
                                          oka.a(((opa) this).field_c.field_l[var8].toUpperCase(), var10, kn.field_p, -1, var9, (int)((opa) this).field_r[var8].field_q, -1);
                                          if (((opa) this).field_p) {
                                            break L23;
                                          } else {
                                            if (~var7 > ~(var8 * 50 + efa.field_y)) {
                                              break L23;
                                            } else {
                                              if (~var7 > ~(50 + efa.field_y - -(((opa) this).field_c.field_k * 50))) {
                                                break L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        L24: {
                                          L25: {
                                            if (((opa) this).field_m) {
                                              break L25;
                                            } else {
                                              if (var7 < var8 * 50 + nta.field_d) {
                                                break L25;
                                              } else {
                                                if (50 + (((opa) this).field_c.field_k * 50 + nta.field_d) > var7) {
                                                  break L24;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                          if (((opa) this).field_o) {
                                            break L21;
                                          } else {
                                            if (var7 < var8 * 50 + iv.field_ub) {
                                              break L21;
                                            } else {
                                              if (var7 < ((opa) this).field_c.field_k * 50 + iv.field_ub - -50) {
                                                L26: {
                                                  if (~(50 * var8 + iv.field_ub + 25) < ~var7) {
                                                    stackOut_163_0 = 0;
                                                    stackIn_164_0 = stackOut_163_0;
                                                    break L26;
                                                  } else {
                                                    stackOut_161_0 = 1;
                                                    stackIn_164_0 = stackOut_161_0;
                                                    break L26;
                                                  }
                                                }
                                                L27: {
                                                  var11 = stackIn_164_0;
                                                  var12 = Integer.toString(((opa) this).field_r[var8].field_c);
                                                  stackOut_164_0 = new StringBuilder().append("$");
                                                  stackIn_167_0 = stackOut_164_0;
                                                  stackIn_165_0 = stackOut_164_0;
                                                  if (var11 == 0) {
                                                    stackOut_167_0 = (StringBuilder) (Object) stackIn_167_0;
                                                    stackOut_167_1 = 0;
                                                    stackIn_168_0 = stackOut_167_0;
                                                    stackIn_168_1 = stackOut_167_1;
                                                    break L27;
                                                  } else {
                                                    stackOut_165_0 = (StringBuilder) (Object) stackIn_165_0;
                                                    stackOut_165_1 = ((opa) this).field_r[var8].field_f;
                                                    stackIn_168_0 = stackOut_165_0;
                                                    stackIn_168_1 = stackOut_165_1;
                                                    break L27;
                                                  }
                                                }
                                                L28: {
                                                  L29: {
                                                    var13 = Integer.toString(stackIn_168_1 + ((opa) this).field_r[var8].field_a);
                                                    var14 = ((opa) this).field_c.field_H[var8].z(-113);
                                                    if (var11 == 0) {
                                                      break L29;
                                                    } else {
                                                      if (0 >= ((opa) this).field_r[var8].field_f) {
                                                        break L29;
                                                      } else {
                                                        if (var14 < 0) {
                                                          break L29;
                                                        } else {
                                                          stackOut_175_0 = 1;
                                                          stackIn_178_0 = stackOut_175_0;
                                                          break L28;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_177_0 = 0;
                                                  stackIn_178_0 = stackOut_177_0;
                                                  break L28;
                                                }
                                                L30: {
                                                  var15 = stackIn_178_0;
                                                  if (var15 == 0) {
                                                    stackOut_181_0 = 0;
                                                    stackIn_182_0 = stackOut_181_0;
                                                    break L30;
                                                  } else {
                                                    stackOut_179_0 = 20;
                                                    stackIn_182_0 = stackOut_179_0;
                                                    break L30;
                                                  }
                                                }
                                                L31: {
                                                  var16 = stackIn_182_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) 45), 70 + wb.field_a.a("+" + var13, (byte) 98));
                                                  stackOut_182_0 = 40;
                                                  stackOut_182_1 = (int)((opa) this).field_r[var8].field_q;
                                                  stackIn_185_0 = stackOut_182_0;
                                                  stackIn_185_1 = stackOut_182_1;
                                                  stackIn_183_0 = stackOut_182_0;
                                                  stackIn_183_1 = stackOut_182_1;
                                                  if ((double)(-var16 + var3_int) > ((opa) this).field_r[var8].field_q) {
                                                    stackOut_185_0 = stackIn_185_0;
                                                    stackOut_185_1 = stackIn_185_1;
                                                    stackOut_185_2 = 0;
                                                    stackIn_186_0 = stackOut_185_0;
                                                    stackIn_186_1 = stackOut_185_1;
                                                    stackIn_186_2 = stackOut_185_2;
                                                    break L31;
                                                  } else {
                                                    stackOut_183_0 = stackIn_183_0;
                                                    stackOut_183_1 = stackIn_183_1;
                                                    stackOut_183_2 = var16;
                                                    stackIn_186_0 = stackOut_183_0;
                                                    stackIn_186_1 = stackOut_183_1;
                                                    stackIn_186_2 = stackOut_183_2;
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  var17 = stackIn_186_0 + (stackIn_186_1 + -stackIn_186_2);
                                                  var18 = -70 + var9;
                                                  eca.field_c[2].a(var17, var18 + -5, eca.field_c[2].a() >> 813448290, eca.field_c[2].c() >> 1171533250);
                                                  ts.a(0, -30, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                                  ts.a(0, -100, var18 + 17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                                  ts.a(0, -126, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                                                  ts.a(0, -24, 55 + var18, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                                                  if (var15 != 0) {
                                                    var19 = var17 - -wb.field_a.a("x" + var12, (byte) 36) - -25;
                                                    var20 = -11 + var18;
                                                    var21 = sta.field_y[bta.field_f[var14]];
                                                    var21.a(var19, var20, var21.a() >> -1516435071, var21.c() >> -1785801471);
                                                    break L32;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                                if (var27 == 0) {
                                                  break L21;
                                                } else {
                                                  break L24;
                                                }
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                        L33: {
                                          if (~(25 + (nta.field_d + var8 * 50)) < ~var7) {
                                            stackOut_196_0 = 0;
                                            stackIn_197_0 = stackOut_196_0;
                                            break L33;
                                          } else {
                                            stackOut_194_0 = 1;
                                            stackIn_197_0 = stackOut_194_0;
                                            break L33;
                                          }
                                        }
                                        L34: {
                                          var11 = stackIn_197_0;
                                          var12 = Integer.toString(((opa) this).field_r[var8].field_r);
                                          stackOut_197_0 = new StringBuilder().append("$");
                                          stackIn_200_0 = stackOut_197_0;
                                          stackIn_198_0 = stackOut_197_0;
                                          if (var11 != 0) {
                                            stackOut_200_0 = (StringBuilder) (Object) stackIn_200_0;
                                            stackOut_200_1 = ((opa) this).field_r[var8].field_z;
                                            stackIn_201_0 = stackOut_200_0;
                                            stackIn_201_1 = stackOut_200_1;
                                            break L34;
                                          } else {
                                            stackOut_198_0 = (StringBuilder) (Object) stackIn_198_0;
                                            stackOut_198_1 = 0;
                                            stackIn_201_0 = stackOut_198_0;
                                            stackIn_201_1 = stackOut_198_1;
                                            break L34;
                                          }
                                        }
                                        L35: {
                                          L36: {
                                            var13 = Integer.toString(stackIn_201_1 + ((opa) this).field_r[var8].field_n);
                                            var14 = ((opa) this).field_c.field_H[var8].z(39);
                                            if (var11 == 0) {
                                              break L36;
                                            } else {
                                              if (((opa) this).field_r[var8].field_z <= 0) {
                                                break L36;
                                              } else {
                                                if (var14 < 0) {
                                                  break L36;
                                                } else {
                                                  stackOut_208_0 = 1;
                                                  stackIn_211_0 = stackOut_208_0;
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_210_0 = 0;
                                          stackIn_211_0 = stackOut_210_0;
                                          break L35;
                                        }
                                        L37: {
                                          var15 = stackIn_211_0;
                                          stackOut_211_0 = Math.max(95 + wb.field_a.a("x" + var12, (byte) 49), 70 + wb.field_a.a("+" + var13, (byte) 99));
                                          stackIn_214_0 = stackOut_211_0;
                                          stackIn_212_0 = stackOut_211_0;
                                          if (var15 != 0) {
                                            stackOut_214_0 = stackIn_214_0;
                                            stackOut_214_1 = 20;
                                            stackIn_215_0 = stackOut_214_0;
                                            stackIn_215_1 = stackOut_214_1;
                                            break L37;
                                          } else {
                                            stackOut_212_0 = stackIn_212_0;
                                            stackOut_212_1 = 0;
                                            stackIn_215_0 = stackOut_212_0;
                                            stackIn_215_1 = stackOut_212_1;
                                            break L37;
                                          }
                                        }
                                        L38: {
                                          var16 = stackIn_215_0 - -stackIn_215_1;
                                          stackOut_215_0 = (int)((opa) this).field_r[var8].field_q - -40;
                                          stackIn_218_0 = stackOut_215_0;
                                          stackIn_216_0 = stackOut_215_0;
                                          if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                                            stackOut_218_0 = stackIn_218_0;
                                            stackOut_218_1 = var16;
                                            stackIn_219_0 = stackOut_218_0;
                                            stackIn_219_1 = stackOut_218_1;
                                            break L38;
                                          } else {
                                            stackOut_216_0 = stackIn_216_0;
                                            stackOut_216_1 = 0;
                                            stackIn_219_0 = stackOut_216_0;
                                            stackIn_219_1 = stackOut_216_1;
                                            break L38;
                                          }
                                        }
                                        L39: {
                                          var17 = stackIn_219_0 + -stackIn_219_1;
                                          var18 = var9 - 70;
                                          eca.field_c[1].a(var17, -5 + var18, eca.field_c[1].a() >> -332879806, eca.field_c[1].c() >> 997498242);
                                          ts.a(0, -42, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                          ts.a(0, -124, var18 - -17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                          ts.a(0, -92, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                                          ts.a(0, -119, 55 + var18, var13, var17 + 25, qr.field_v, wga.field_a[var8]);
                                          if (var15 != 0) {
                                            var19 = var17 + (wb.field_a.a("x" + var12, (byte) -122) + 25);
                                            var20 = var18 + -11;
                                            var21 = sta.field_y[bta.field_f[var14]];
                                            var21.a(var19, var20, var21.a() >> -574488927, var21.c() >> -267027071);
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                        if (var27 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      L40: {
                                        if (~(var8 * 50 + efa.field_y - -25) < ~var7) {
                                          stackOut_229_0 = 0;
                                          stackIn_230_0 = stackOut_229_0;
                                          break L40;
                                        } else {
                                          stackOut_227_0 = 1;
                                          stackIn_230_0 = stackOut_227_0;
                                          break L40;
                                        }
                                      }
                                      L41: {
                                        var11 = stackIn_230_0;
                                        var12 = Integer.toString(((opa) this).field_r[var8].field_p);
                                        stackOut_230_0 = new StringBuilder().append("$");
                                        stackIn_233_0 = stackOut_230_0;
                                        stackIn_231_0 = stackOut_230_0;
                                        if (var11 == 0) {
                                          stackOut_233_0 = (StringBuilder) (Object) stackIn_233_0;
                                          stackOut_233_1 = 0;
                                          stackIn_234_0 = stackOut_233_0;
                                          stackIn_234_1 = stackOut_233_1;
                                          break L41;
                                        } else {
                                          stackOut_231_0 = (StringBuilder) (Object) stackIn_231_0;
                                          stackOut_231_1 = ((opa) this).field_r[var8].field_u;
                                          stackIn_234_0 = stackOut_231_0;
                                          stackIn_234_1 = stackOut_231_1;
                                          break L41;
                                        }
                                      }
                                      L42: {
                                        L43: {
                                          var13 = Integer.toString(stackIn_234_1 + ((opa) this).field_r[var8].field_v);
                                          var14 = ((opa) this).field_c.field_H[var8].z(-124);
                                          if (var11 == 0) {
                                            break L43;
                                          } else {
                                            if (((opa) this).field_r[var8].field_u <= 0) {
                                              break L43;
                                            } else {
                                              if (var14 < 0) {
                                                break L43;
                                              } else {
                                                stackOut_241_0 = 1;
                                                stackIn_244_0 = stackOut_241_0;
                                                break L42;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_243_0 = 0;
                                        stackIn_244_0 = stackOut_243_0;
                                        break L42;
                                      }
                                      L44: {
                                        var15 = stackIn_244_0;
                                        if (var15 == 0) {
                                          stackOut_247_0 = 0;
                                          stackIn_248_0 = stackOut_247_0;
                                          break L44;
                                        } else {
                                          stackOut_245_0 = 20;
                                          stackIn_248_0 = stackOut_245_0;
                                          break L44;
                                        }
                                      }
                                      L45: {
                                        var16 = stackIn_248_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) -103), wb.field_a.a("+" + var13, (byte) 87) + 70);
                                        stackOut_248_0 = 40;
                                        stackOut_248_1 = (int)((opa) this).field_r[var8].field_q;
                                        stackIn_251_0 = stackOut_248_0;
                                        stackIn_251_1 = stackOut_248_1;
                                        stackIn_249_0 = stackOut_248_0;
                                        stackIn_249_1 = stackOut_248_1;
                                        if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                                          stackOut_251_0 = stackIn_251_0;
                                          stackOut_251_1 = stackIn_251_1;
                                          stackOut_251_2 = var16;
                                          stackIn_252_0 = stackOut_251_0;
                                          stackIn_252_1 = stackOut_251_1;
                                          stackIn_252_2 = stackOut_251_2;
                                          break L45;
                                        } else {
                                          stackOut_249_0 = stackIn_249_0;
                                          stackOut_249_1 = stackIn_249_1;
                                          stackOut_249_2 = 0;
                                          stackIn_252_0 = stackOut_249_0;
                                          stackIn_252_1 = stackOut_249_1;
                                          stackIn_252_2 = stackOut_249_2;
                                          break L45;
                                        }
                                      }
                                      var17 = stackIn_252_0 + (stackIn_252_1 - stackIn_252_2);
                                      var18 = var9 + -70;
                                      eca.field_c[0].a(var17, -5 + var18, eca.field_c[0].a() >> 1028237665, eca.field_c[0].c() >> 188512449);
                                      ts.a(0, -123, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                      ts.a(0, -51, 17 + var18, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                      ts.a(0, -103, var18 - -55, "+", var17 - -2, qr.field_v, wga.field_a[var8]);
                                      ts.a(0, -65, var18 - -55, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                                      if (var15 == 0) {
                                        break L21;
                                      } else {
                                        var19 = 25 + wb.field_a.a("x" + var12, (byte) 31) + var17;
                                        var20 = -11 + var18;
                                        var21 = sta.field_y[bta.field_f[var14]];
                                        var21.a(var19, var20, var21.a() >> 160958305, var21.c() >> 457600321);
                                        break L21;
                                      }
                                    }
                                    var8++;
                                    if (var27 == 0) {
                                      stackOut_98_0 = ~var8;
                                      stackOut_98_1 = ((opa) this).field_c.field_k;
                                      stackOut_98_2 = -1;
                                      stackIn_99_0 = stackOut_98_0;
                                      stackIn_99_1 = stackOut_98_1;
                                      stackIn_99_2 = stackOut_98_2;
                                      continue L12;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L46: {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = stackIn_20_1;
                              stackIn_25_0 = stackOut_20_0;
                              stackIn_25_1 = stackOut_20_1;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (stackIn_20_2 >= ~((opa) this).field_c.field_k) {
                                stackOut_25_0 = stackIn_25_0;
                                stackOut_25_1 = stackIn_25_1;
                                stackOut_25_2 = 0;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                stackIn_26_2 = stackOut_25_2;
                                break L46;
                              } else {
                                stackOut_21_0 = stackIn_21_0;
                                stackOut_21_1 = stackIn_21_1;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                stackOut_23_0 = stackIn_23_0;
                                stackOut_23_1 = stackIn_23_1;
                                stackOut_23_2 = 95;
                                stackIn_26_0 = stackOut_23_0;
                                stackIn_26_1 = stackOut_23_1;
                                stackIn_26_2 = stackOut_23_2;
                                break L46;
                              }
                            }
                            L47: {
                              var10 = stackIn_26_0 + (stackIn_26_1 - -stackIn_26_2);
                              var11 = -50 + var10;
                              var12_int = var10 - 25;
                              eca.field_c[2].a(3 + var9, var11, eca.field_c[2].a() >> 299328994, eca.field_c[2].c() >> 1776428962);
                              var13_int = var10;
                              eca.field_c[1].a(var9, var12_int, eca.field_c[1].a() >> -656139454, eca.field_c[1].c() >> -2106429246);
                              eca.field_c[0].a(2 + var9, var13_int, eca.field_c[0].a() / 3, eca.field_c[0].c() / 3);
                              var14_ref_gsa = ((opa) this).field_r[var8];
                              if (!var14_ref_gsa.field_l) {
                                stackOut_29_0 = 0;
                                stackIn_30_0 = stackOut_29_0;
                                break L47;
                              } else {
                                stackOut_27_0 = var14_ref_gsa.field_c;
                                stackIn_30_0 = stackOut_27_0;
                                break L47;
                              }
                            }
                            L48: {
                              var15 = stackIn_30_0;
                              var16_ref_String = Integer.toString(var15);
                              if (var15 < 10) {
                                var16_ref_String = "0" + var16_ref_String;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            L49: {
                              ts.a(-1, -73, 20 + var11, var16_ref_String.toUpperCase(), 24 + var9, eda.field_f, 2431750);
                              if (var14_ref_gsa.field_d) {
                                stackOut_37_0 = var14_ref_gsa.field_r;
                                stackIn_38_0 = stackOut_37_0;
                                break L49;
                              } else {
                                stackOut_35_0 = 0;
                                stackIn_38_0 = stackOut_35_0;
                                break L49;
                              }
                            }
                            L50: {
                              var17 = stackIn_38_0;
                              var18_ref_String = Integer.toString(var17);
                              if (10 > var17) {
                                var18_ref_String = "0" + var18_ref_String;
                                break L50;
                              } else {
                                break L50;
                              }
                            }
                            L51: {
                              ts.a(-1, -28, var12_int - -17, var18_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                              if (var14_ref_gsa.field_k) {
                                stackOut_45_0 = var14_ref_gsa.field_p;
                                stackIn_46_0 = stackOut_45_0;
                                break L51;
                              } else {
                                stackOut_43_0 = 0;
                                stackIn_46_0 = stackOut_43_0;
                                break L51;
                              }
                            }
                            L52: {
                              var19 = stackIn_46_0;
                              var20_ref_String = Integer.toString(var19);
                              if (var19 >= 10) {
                                break L52;
                              } else {
                                var20_ref_String = "0" + var20_ref_String;
                                break L52;
                              }
                            }
                            L53: {
                              ts.a(-1, -29, var13_int + 14, var20_ref_String.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                              var21_int = ((opa) this).field_c.field_H[var8].z(-104);
                              var22 = 0;
                              if (var21_int < 0) {
                                break L53;
                              } else {
                                if (2 != bta.field_n[var21_int]) {
                                  break L53;
                                } else {
                                  if (var14_ref_gsa.field_o) {
                                    var22 = 1;
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                            }
                            L54: {
                              if (0 > var21_int) {
                                break L54;
                              } else {
                                if (bta.field_n[var21_int] != 1) {
                                  break L54;
                                } else {
                                  if (!var14_ref_gsa.field_h) {
                                    break L54;
                                  } else {
                                    var22 = 1;
                                    break L54;
                                  }
                                }
                              }
                            }
                            L55: {
                              if (var21_int < 0) {
                                break L55;
                              } else {
                                if (0 != bta.field_n[var21_int]) {
                                  break L55;
                                } else {
                                  if (var14_ref_gsa.field_b) {
                                    var22 = 1;
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                            }
                            L56: {
                              if (var21_int < 0) {
                                break L56;
                              } else {
                                if (var22 != 0) {
                                  L57: {
                                    var23 = 43 + var9;
                                    if (bta.field_n[var21_int] != 2) {
                                      if (bta.field_n[var21_int] != 1) {
                                        stackOut_88_0 = var13_int - 10;
                                        stackIn_89_0 = stackOut_88_0;
                                        break L57;
                                      } else {
                                        stackOut_86_0 = -6 + var12_int;
                                        stackIn_89_0 = stackOut_86_0;
                                        break L57;
                                      }
                                    } else {
                                      stackOut_83_0 = -4 + var11;
                                      stackIn_89_0 = stackOut_83_0;
                                      break L57;
                                    }
                                  }
                                  var24 = stackIn_89_0;
                                  var25_ref = sta.field_y[bta.field_f[var21_int]];
                                  var25_ref.a(var23, var24, var25_ref.a() >> -1701847199, var25_ref.c() >> -888815583);
                                  break L56;
                                } else {
                                  break L56;
                                }
                              }
                            }
                            L58: {
                              var23 = 80 + var9;
                              var24 = 32 + var10;
                              var25 = String.valueOf(((opa) this).field_r[var8].field_m);
                              ts.a(-1, -59, var24, "$", var23, qr.field_v, 2431750);
                              ts.a(0, -28, -1 + var24, var25.toUpperCase(), 18 + var23, qr.field_v, wga.field_a[var8]);
                              var26 = ((opa) this).field_c.field_v[var8];
                              if (~var8 != ~((opa) this).field_c.e(2)) {
                                break L58;
                              } else {
                                if (~var7 <= ~(-100 + fd.field_e)) {
                                  break L58;
                                } else {
                                  var26--;
                                  break L58;
                                }
                              }
                            }
                            oka.a(Integer.toString(var26), wga.field_a[var8], qr.field_v, -1, -47 + (var24 + -1), 55, 0);
                            oka.a(Integer.toString(((opa) this).field_c.field_L), wga.field_a[var8], qr.field_v, -1, -12 + (var24 + -1), 55, 0);
                            oka.a("_", wga.field_a[var8], qr.field_v, -1, -40 + var24, 55, 0);
                            var8++;
                            if (var27 == 0) {
                              continue L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      var8 = 0;
                      L59: while (true) {
                        stackOut_98_0 = ~var8;
                        stackOut_98_1 = ((opa) this).field_c.field_k;
                        stackOut_98_2 = -1;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        stackIn_99_2 = stackOut_98_2;
                        stackOut_99_0 = stackIn_99_0;
                        stackOut_99_1 = stackIn_99_1 ^ stackIn_99_2;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        L60: while (true) {
                          if (stackIn_100_0 <= stackIn_100_1) {
                            break L10;
                          } else {
                            stackOut_101_0 = 95 * var8 + 105;
                            stackIn_256_0 = stackOut_101_0;
                            stackIn_102_0 = stackOut_101_0;
                            if (var27 != 0) {
                              break L9;
                            } else {
                              L61: {
                                stackOut_102_0 = stackIn_102_0;
                                stackIn_107_0 = stackOut_102_0;
                                stackIn_103_0 = stackOut_102_0;
                                if (((opa) this).field_c.field_k < 3) {
                                  stackOut_107_0 = stackIn_107_0;
                                  stackOut_107_1 = 95;
                                  stackIn_108_0 = stackOut_107_0;
                                  stackIn_108_1 = stackOut_107_1;
                                  break L61;
                                } else {
                                  stackOut_103_0 = stackIn_103_0;
                                  stackIn_105_0 = stackOut_103_0;
                                  stackOut_105_0 = stackIn_105_0;
                                  stackOut_105_1 = 0;
                                  stackIn_108_0 = stackOut_105_0;
                                  stackIn_108_1 = stackOut_105_1;
                                  break L61;
                                }
                              }
                              L62: {
                                var9 = stackIn_108_0 + stackIn_108_1;
                                if (~(-100 + fd.field_e) < ~var7) {
                                  break L62;
                                } else {
                                  if (~var8 == ~((opa) this).field_c.e(2)) {
                                    L63: {
                                      L64: {
                                        if (((opa) this).field_c.field_L == ((opa) this).field_c.field_v[var8]) {
                                          break L64;
                                        } else {
                                          oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9 - 22, (var3_int + 50 >> -1164132767) + 20, -1);
                                          if (var27 == 0) {
                                            break L63;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                      oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9 + -22, (var3_int + 50 >> 1972141153) - -20, -1);
                                      break L63;
                                    }
                                    var10 = 0;
                                    var11 = 0;
                                    L65: while (true) {
                                      L66: {
                                        if (((opa) this).field_r.length <= var11) {
                                          break L66;
                                        } else {
                                          stackOut_122_0 = var11;
                                          stackOut_122_1 = var8;
                                          stackIn_100_0 = stackOut_122_0;
                                          stackIn_100_1 = stackOut_122_1;
                                          stackIn_123_0 = stackOut_122_0;
                                          stackIn_123_1 = stackOut_122_1;
                                          if (var27 != 0) {
                                            continue L60;
                                          } else {
                                            L67: {
                                              if (stackIn_123_0 == stackIn_123_1) {
                                                break L67;
                                              } else {
                                                if (((opa) this).field_r[var8].field_x != ((opa) this).field_r[var11].field_x) {
                                                  break L67;
                                                } else {
                                                  var10 = 1;
                                                  break L67;
                                                }
                                              }
                                            }
                                            var11++;
                                            if (var27 == 0) {
                                              continue L65;
                                            } else {
                                              break L66;
                                            }
                                          }
                                        }
                                      }
                                      if (var10 != 0) {
                                        oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9, 20 + (50 + var3_int >> -479353247), -1);
                                        break L62;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              L68: {
                                L69: {
                                  L70: {
                                    tga.field_a.KA(0, var9 - 100, (int)(2.0 + ((opa) this).field_r[var8].field_q), var9 - -50);
                                    var10 = wga.field_a[var8];
                                    gca.field_a.a(62, 10 + var9 + -95, 0, var10 | -1006632960, 1);
                                    tga.field_a.la();
                                    ((opa) this).field_c.field_H[var8].n((byte) -42).a(-1, (int)((opa) this).field_r[var8].field_q, 1400, 1536, var9);
                                    oka.a(((opa) this).field_c.field_l[var8].toUpperCase(), var10, kn.field_p, -1, var9, (int)((opa) this).field_r[var8].field_q, -1);
                                    if (((opa) this).field_p) {
                                      break L70;
                                    } else {
                                      if (~var7 > ~(var8 * 50 + efa.field_y)) {
                                        break L70;
                                      } else {
                                        if (~var7 > ~(50 + efa.field_y - -(((opa) this).field_c.field_k * 50))) {
                                          break L69;
                                        } else {
                                          break L70;
                                        }
                                      }
                                    }
                                  }
                                  L71: {
                                    L72: {
                                      if (((opa) this).field_m) {
                                        break L72;
                                      } else {
                                        if (var7 < var8 * 50 + nta.field_d) {
                                          break L72;
                                        } else {
                                          if (50 + (((opa) this).field_c.field_k * 50 + nta.field_d) > var7) {
                                            break L71;
                                          } else {
                                            break L72;
                                          }
                                        }
                                      }
                                    }
                                    if (((opa) this).field_o) {
                                      break L68;
                                    } else {
                                      if (var7 < var8 * 50 + iv.field_ub) {
                                        break L68;
                                      } else {
                                        if (var7 < ((opa) this).field_c.field_k * 50 + iv.field_ub - -50) {
                                          L73: {
                                            if (~(50 * var8 + iv.field_ub + 25) < ~var7) {
                                              stackOut_163_0 = 0;
                                              stackIn_164_0 = stackOut_163_0;
                                              break L73;
                                            } else {
                                              stackOut_161_0 = 1;
                                              stackIn_164_0 = stackOut_161_0;
                                              break L73;
                                            }
                                          }
                                          L74: {
                                            var11 = stackIn_164_0;
                                            var12 = Integer.toString(((opa) this).field_r[var8].field_c);
                                            stackOut_164_0 = new StringBuilder().append("$");
                                            stackIn_167_0 = stackOut_164_0;
                                            stackIn_165_0 = stackOut_164_0;
                                            if (var11 == 0) {
                                              stackOut_167_0 = (StringBuilder) (Object) stackIn_167_0;
                                              stackOut_167_1 = 0;
                                              stackIn_168_0 = stackOut_167_0;
                                              stackIn_168_1 = stackOut_167_1;
                                              break L74;
                                            } else {
                                              stackOut_165_0 = (StringBuilder) (Object) stackIn_165_0;
                                              stackOut_165_1 = ((opa) this).field_r[var8].field_f;
                                              stackIn_168_0 = stackOut_165_0;
                                              stackIn_168_1 = stackOut_165_1;
                                              break L74;
                                            }
                                          }
                                          L75: {
                                            L76: {
                                              var13 = Integer.toString(stackIn_168_1 + ((opa) this).field_r[var8].field_a);
                                              var14 = ((opa) this).field_c.field_H[var8].z(-113);
                                              if (var11 == 0) {
                                                break L76;
                                              } else {
                                                if (0 >= ((opa) this).field_r[var8].field_f) {
                                                  break L76;
                                                } else {
                                                  if (var14 < 0) {
                                                    break L76;
                                                  } else {
                                                    stackOut_175_0 = 1;
                                                    stackIn_178_0 = stackOut_175_0;
                                                    break L75;
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_177_0 = 0;
                                            stackIn_178_0 = stackOut_177_0;
                                            break L75;
                                          }
                                          L77: {
                                            var15 = stackIn_178_0;
                                            if (var15 == 0) {
                                              stackOut_181_0 = 0;
                                              stackIn_182_0 = stackOut_181_0;
                                              break L77;
                                            } else {
                                              stackOut_179_0 = 20;
                                              stackIn_182_0 = stackOut_179_0;
                                              break L77;
                                            }
                                          }
                                          L78: {
                                            var16 = stackIn_182_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) 45), 70 + wb.field_a.a("+" + var13, (byte) 98));
                                            stackOut_182_0 = 40;
                                            stackOut_182_1 = (int)((opa) this).field_r[var8].field_q;
                                            stackIn_185_0 = stackOut_182_0;
                                            stackIn_185_1 = stackOut_182_1;
                                            stackIn_183_0 = stackOut_182_0;
                                            stackIn_183_1 = stackOut_182_1;
                                            if ((double)(-var16 + var3_int) > ((opa) this).field_r[var8].field_q) {
                                              stackOut_185_0 = stackIn_185_0;
                                              stackOut_185_1 = stackIn_185_1;
                                              stackOut_185_2 = 0;
                                              stackIn_186_0 = stackOut_185_0;
                                              stackIn_186_1 = stackOut_185_1;
                                              stackIn_186_2 = stackOut_185_2;
                                              break L78;
                                            } else {
                                              stackOut_183_0 = stackIn_183_0;
                                              stackOut_183_1 = stackIn_183_1;
                                              stackOut_183_2 = var16;
                                              stackIn_186_0 = stackOut_183_0;
                                              stackIn_186_1 = stackOut_183_1;
                                              stackIn_186_2 = stackOut_183_2;
                                              break L78;
                                            }
                                          }
                                          L79: {
                                            var17 = stackIn_186_0 + (stackIn_186_1 + -stackIn_186_2);
                                            var18 = -70 + var9;
                                            eca.field_c[2].a(var17, var18 + -5, eca.field_c[2].a() >> 813448290, eca.field_c[2].c() >> 1171533250);
                                            ts.a(0, -30, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                            ts.a(0, -100, var18 + 17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                            ts.a(0, -126, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                                            ts.a(0, -24, 55 + var18, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                                            if (var15 != 0) {
                                              var19 = var17 - -wb.field_a.a("x" + var12, (byte) 36) - -25;
                                              var20 = -11 + var18;
                                              var21 = sta.field_y[bta.field_f[var14]];
                                              var21.a(var19, var20, var21.a() >> -1516435071, var21.c() >> -1785801471);
                                              break L79;
                                            } else {
                                              break L79;
                                            }
                                          }
                                          if (var27 == 0) {
                                            break L68;
                                          } else {
                                            break L71;
                                          }
                                        } else {
                                          break L68;
                                        }
                                      }
                                    }
                                  }
                                  L80: {
                                    if (~(25 + (nta.field_d + var8 * 50)) < ~var7) {
                                      stackOut_196_0 = 0;
                                      stackIn_197_0 = stackOut_196_0;
                                      break L80;
                                    } else {
                                      stackOut_194_0 = 1;
                                      stackIn_197_0 = stackOut_194_0;
                                      break L80;
                                    }
                                  }
                                  L81: {
                                    var11 = stackIn_197_0;
                                    var12 = Integer.toString(((opa) this).field_r[var8].field_r);
                                    stackOut_197_0 = new StringBuilder().append("$");
                                    stackIn_200_0 = stackOut_197_0;
                                    stackIn_198_0 = stackOut_197_0;
                                    if (var11 != 0) {
                                      stackOut_200_0 = (StringBuilder) (Object) stackIn_200_0;
                                      stackOut_200_1 = ((opa) this).field_r[var8].field_z;
                                      stackIn_201_0 = stackOut_200_0;
                                      stackIn_201_1 = stackOut_200_1;
                                      break L81;
                                    } else {
                                      stackOut_198_0 = (StringBuilder) (Object) stackIn_198_0;
                                      stackOut_198_1 = 0;
                                      stackIn_201_0 = stackOut_198_0;
                                      stackIn_201_1 = stackOut_198_1;
                                      break L81;
                                    }
                                  }
                                  L82: {
                                    L83: {
                                      var13 = Integer.toString(stackIn_201_1 + ((opa) this).field_r[var8].field_n);
                                      var14 = ((opa) this).field_c.field_H[var8].z(39);
                                      if (var11 == 0) {
                                        break L83;
                                      } else {
                                        if (((opa) this).field_r[var8].field_z <= 0) {
                                          break L83;
                                        } else {
                                          if (var14 < 0) {
                                            break L83;
                                          } else {
                                            stackOut_208_0 = 1;
                                            stackIn_211_0 = stackOut_208_0;
                                            break L82;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_210_0 = 0;
                                    stackIn_211_0 = stackOut_210_0;
                                    break L82;
                                  }
                                  L84: {
                                    var15 = stackIn_211_0;
                                    stackOut_211_0 = Math.max(95 + wb.field_a.a("x" + var12, (byte) 49), 70 + wb.field_a.a("+" + var13, (byte) 99));
                                    stackIn_214_0 = stackOut_211_0;
                                    stackIn_212_0 = stackOut_211_0;
                                    if (var15 != 0) {
                                      stackOut_214_0 = stackIn_214_0;
                                      stackOut_214_1 = 20;
                                      stackIn_215_0 = stackOut_214_0;
                                      stackIn_215_1 = stackOut_214_1;
                                      break L84;
                                    } else {
                                      stackOut_212_0 = stackIn_212_0;
                                      stackOut_212_1 = 0;
                                      stackIn_215_0 = stackOut_212_0;
                                      stackIn_215_1 = stackOut_212_1;
                                      break L84;
                                    }
                                  }
                                  L85: {
                                    var16 = stackIn_215_0 - -stackIn_215_1;
                                    stackOut_215_0 = (int)((opa) this).field_r[var8].field_q - -40;
                                    stackIn_218_0 = stackOut_215_0;
                                    stackIn_216_0 = stackOut_215_0;
                                    if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                                      stackOut_218_0 = stackIn_218_0;
                                      stackOut_218_1 = var16;
                                      stackIn_219_0 = stackOut_218_0;
                                      stackIn_219_1 = stackOut_218_1;
                                      break L85;
                                    } else {
                                      stackOut_216_0 = stackIn_216_0;
                                      stackOut_216_1 = 0;
                                      stackIn_219_0 = stackOut_216_0;
                                      stackIn_219_1 = stackOut_216_1;
                                      break L85;
                                    }
                                  }
                                  L86: {
                                    var17 = stackIn_219_0 + -stackIn_219_1;
                                    var18 = var9 - 70;
                                    eca.field_c[1].a(var17, -5 + var18, eca.field_c[1].a() >> -332879806, eca.field_c[1].c() >> 997498242);
                                    ts.a(0, -42, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                    ts.a(0, -124, var18 - -17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                    ts.a(0, -92, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                                    ts.a(0, -119, 55 + var18, var13, var17 + 25, qr.field_v, wga.field_a[var8]);
                                    if (var15 != 0) {
                                      var19 = var17 + (wb.field_a.a("x" + var12, (byte) -122) + 25);
                                      var20 = var18 + -11;
                                      var21 = sta.field_y[bta.field_f[var14]];
                                      var21.a(var19, var20, var21.a() >> -574488927, var21.c() >> -267027071);
                                      break L86;
                                    } else {
                                      break L86;
                                    }
                                  }
                                  if (var27 == 0) {
                                    break L68;
                                  } else {
                                    break L69;
                                  }
                                }
                                L87: {
                                  if (~(var8 * 50 + efa.field_y - -25) < ~var7) {
                                    stackOut_229_0 = 0;
                                    stackIn_230_0 = stackOut_229_0;
                                    break L87;
                                  } else {
                                    stackOut_227_0 = 1;
                                    stackIn_230_0 = stackOut_227_0;
                                    break L87;
                                  }
                                }
                                L88: {
                                  var11 = stackIn_230_0;
                                  var12 = Integer.toString(((opa) this).field_r[var8].field_p);
                                  stackOut_230_0 = new StringBuilder().append("$");
                                  stackIn_233_0 = stackOut_230_0;
                                  stackIn_231_0 = stackOut_230_0;
                                  if (var11 == 0) {
                                    stackOut_233_0 = (StringBuilder) (Object) stackIn_233_0;
                                    stackOut_233_1 = 0;
                                    stackIn_234_0 = stackOut_233_0;
                                    stackIn_234_1 = stackOut_233_1;
                                    break L88;
                                  } else {
                                    stackOut_231_0 = (StringBuilder) (Object) stackIn_231_0;
                                    stackOut_231_1 = ((opa) this).field_r[var8].field_u;
                                    stackIn_234_0 = stackOut_231_0;
                                    stackIn_234_1 = stackOut_231_1;
                                    break L88;
                                  }
                                }
                                L89: {
                                  L90: {
                                    var13 = Integer.toString(stackIn_234_1 + ((opa) this).field_r[var8].field_v);
                                    var14 = ((opa) this).field_c.field_H[var8].z(-124);
                                    if (var11 == 0) {
                                      break L90;
                                    } else {
                                      if (((opa) this).field_r[var8].field_u <= 0) {
                                        break L90;
                                      } else {
                                        if (var14 < 0) {
                                          break L90;
                                        } else {
                                          stackOut_241_0 = 1;
                                          stackIn_244_0 = stackOut_241_0;
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_243_0 = 0;
                                  stackIn_244_0 = stackOut_243_0;
                                  break L89;
                                }
                                L91: {
                                  var15 = stackIn_244_0;
                                  if (var15 == 0) {
                                    stackOut_247_0 = 0;
                                    stackIn_248_0 = stackOut_247_0;
                                    break L91;
                                  } else {
                                    stackOut_245_0 = 20;
                                    stackIn_248_0 = stackOut_245_0;
                                    break L91;
                                  }
                                }
                                L92: {
                                  var16 = stackIn_248_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) -103), wb.field_a.a("+" + var13, (byte) 87) + 70);
                                  stackOut_248_0 = 40;
                                  stackOut_248_1 = (int)((opa) this).field_r[var8].field_q;
                                  stackIn_251_0 = stackOut_248_0;
                                  stackIn_251_1 = stackOut_248_1;
                                  stackIn_249_0 = stackOut_248_0;
                                  stackIn_249_1 = stackOut_248_1;
                                  if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                                    stackOut_251_0 = stackIn_251_0;
                                    stackOut_251_1 = stackIn_251_1;
                                    stackOut_251_2 = var16;
                                    stackIn_252_0 = stackOut_251_0;
                                    stackIn_252_1 = stackOut_251_1;
                                    stackIn_252_2 = stackOut_251_2;
                                    break L92;
                                  } else {
                                    stackOut_249_0 = stackIn_249_0;
                                    stackOut_249_1 = stackIn_249_1;
                                    stackOut_249_2 = 0;
                                    stackIn_252_0 = stackOut_249_0;
                                    stackIn_252_1 = stackOut_249_1;
                                    stackIn_252_2 = stackOut_249_2;
                                    break L92;
                                  }
                                }
                                var17 = stackIn_252_0 + (stackIn_252_1 - stackIn_252_2);
                                var18 = var9 + -70;
                                eca.field_c[0].a(var17, -5 + var18, eca.field_c[0].a() >> 1028237665, eca.field_c[0].c() >> 188512449);
                                ts.a(0, -123, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -51, 17 + var18, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -103, var18 - -55, "+", var17 - -2, qr.field_v, wga.field_a[var8]);
                                ts.a(0, -65, var18 - -55, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                                if (var15 == 0) {
                                  break L68;
                                } else {
                                  var19 = 25 + wb.field_a.a("x" + var12, (byte) 31) + var17;
                                  var20 = -11 + var18;
                                  var21 = sta.field_y[bta.field_f[var14]];
                                  var21.a(var19, var20, var21.a() >> 160958305, var21.c() >> 457600321);
                                  break L68;
                                }
                              }
                              var8++;
                              if (var27 == 0) {
                                continue L59;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_255_0 = -6;
                    stackIn_256_0 = stackOut_255_0;
                    break L9;
                  }
                  se.f((byte) stackIn_256_0);
                  ((opa) this).d(-27142);
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "opa.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, byte param1) {
        RuntimeException var2 = null;
        mi[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        String stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        String stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_array = ih.a((byte) 126, param0);
            var3 = new StringBuilder();
            var4 = -99 % ((param1 - 5) / 54);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var2_array.length) {
                  break L2;
                } else {
                  L3: {
                    var6 = var2_array[var5];
                    var7 = var6.field_h;
                    if (var5 != var2_array.length + -1) {
                      stackOut_6_0 = var2_array[var5 - -1].field_h;
                      stackIn_7_0 = stackOut_6_0;
                      break L3;
                    } else {
                      stackOut_4_0 = param0.length();
                      stackIn_7_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var8 = stackIn_7_0;
                      var9 = param0.substring(var7, var8);
                      if (var6.field_p == ma.field_e) {
                        break L5;
                      } else {
                        L6: {
                          if (~nl.field_d == ~var6.field_p) {
                            break L6;
                          } else {
                            L7: {
                              if (var6.field_p != tr.field_f) {
                                break L7;
                              } else {
                                StringBuilder discarded$6 = var3.append("<col=ffff99>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (dc.field_o != var6.field_p) {
                                break L8;
                              } else {
                                StringBuilder discarded$7 = var3.append("<col=ffaaff>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (~var6.field_p != ~dja.field_r) {
                                break L9;
                              } else {
                                StringBuilder discarded$8 = var3.append("<col=33ffaa>").append(var9).append("</col>");
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            StringBuilder discarded$9 = var3.append(var9);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        StringBuilder discarded$10 = var3.append("<col=33bbff>").append(var9).append("</col>");
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    StringBuilder discarded$11 = var3.append("<col=66ffff>").append(var9).append("</col>");
                    break L4;
                  }
                  var5++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_38_0 = var3.toString();
              stackIn_39_0 = stackOut_38_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("opa.H(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ')');
        }
        return stackIn_39_0;
    }

    opa(qh param0, v param1, int[][] param2) {
        super(param0, param1);
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        gsa var14 = null;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        gsa var18_ref_gsa = null;
        double var18 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        int var33 = 0;
        int stackIn_11_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        double stackIn_38_0 = 0.0;
        double stackIn_45_0 = 0.0;
        double stackIn_52_0 = 0.0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        double stackOut_37_0 = 0.0;
        double stackOut_35_0 = 0.0;
        double stackOut_44_0 = 0.0;
        double stackOut_42_0 = 0.0;
        double stackOut_49_0 = 0.0;
        double stackOut_51_0 = 0.0;
        int stackOut_53_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var33 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = ((opa) this).field_c.field_H.length;
            ((opa) this).field_r = new gsa[var4_int];
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_int >= ~var5_int) {
                    break L3;
                  } else {
                    ((opa) this).field_r[var5_int] = new gsa(((opa) this).field_c.field_H[var5_int], param2[var5_int]);
                    var5_int++;
                    if (var33 != 0) {
                      break L2;
                    } else {
                      if (var33 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                er.b(1, 0);
                ((opa) this).field_s = false;
                mr.field_w = new w();
                break L2;
              }
              var5 = 0.0;
              var7 = 0.0;
              var9 = 0.0;
              var11 = 0.0;
              var13_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (~var13_int <= ~((opa) this).field_r.length) {
                      break L6;
                    } else {
                      var14 = ((opa) this).field_r[var13_int];
                      var15_int = var14.field_v + var14.field_u;
                      var16 = var14.field_n + var14.field_z;
                      var17 = var14.field_a - -var14.field_f;
                      stackOut_10_0 = (var9 < (double)var16 ? -1 : (var9 == (double)var16 ? 0 : 1));
                      stackIn_26_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var33 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_11_0 < 0) {
                            var9 = (double)var16;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var7 < (double)var15_int) {
                            var7 = (double)var15_int;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if ((double)(var15_int - (-var16 + -var17)) <= var5) {
                            break L9;
                          } else {
                            var5 = (double)(var17 + (var15_int - -var16));
                            break L9;
                          }
                        }
                        L10: {
                          if (var11 >= (double)var17) {
                            break L10;
                          } else {
                            var11 = (double)var17;
                            break L10;
                          }
                        }
                        var13_int++;
                        if (var33 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = aaa.a(false) + -250;
                  stackIn_26_0 = stackOut_25_0;
                  break L5;
                }
                var13 = (double)stackIn_26_0;
                var15 = -50.0 + var13;
                var17 = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (((opa) this).field_r.length <= var17) {
                        break L13;
                      } else {
                        var18_ref_gsa = ((opa) this).field_r[var17];
                        var19 = (double)(var18_ref_gsa.field_u + var18_ref_gsa.field_v);
                        stackOut_28_0 = (var19 < 0.0 ? -1 : (var19 == 0.0 ? 0 : 1));
                        stackIn_54_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var33 != 0) {
                          break L12;
                        } else {
                          L14: {
                            L15: {
                              if (stackIn_29_0 == 0) {
                                break L15;
                              } else {
                                if (0.0 != var5) {
                                  stackOut_37_0 = var19 / var5 * 100.0;
                                  stackIn_38_0 = stackOut_37_0;
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            stackOut_35_0 = 0.0;
                            stackIn_38_0 = stackOut_35_0;
                            break L14;
                          }
                          L16: {
                            L17: {
                              var21 = stackIn_38_0;
                              var23 = var21 * (var15 / 100.0) / 100.0;
                              var25 = (double)(var18_ref_gsa.field_n + var18_ref_gsa.field_z);
                              if (0.0 == var25) {
                                break L17;
                              } else {
                                if (var5 != 0.0) {
                                  stackOut_44_0 = 100.0 * (var25 / var5);
                                  stackIn_45_0 = stackOut_44_0;
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            stackOut_42_0 = 0.0;
                            stackIn_45_0 = stackOut_42_0;
                            break L16;
                          }
                          L18: {
                            L19: {
                              var21 = stackIn_45_0;
                              var27 = var21 * (var15 / 100.0) / 100.0;
                              var29 = (double)(var18_ref_gsa.field_f + var18_ref_gsa.field_a);
                              if (var29 == 0.0) {
                                break L19;
                              } else {
                                if (0.0 == var5) {
                                  break L19;
                                } else {
                                  stackOut_49_0 = 100.0 * (var29 / var5);
                                  stackIn_52_0 = stackOut_49_0;
                                  break L18;
                                }
                              }
                            }
                            stackOut_51_0 = 0.0;
                            stackIn_52_0 = stackOut_51_0;
                            break L18;
                          }
                          var21 = stackIn_52_0;
                          var31 = var21 * (var15 / 100.0) / 100.0;
                          var18_ref_gsa.a(var27, var31, var23, true);
                          var17++;
                          if (var33 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var17 = 50;
                    stackOut_53_0 = (0.0 < var7 ? -1 : (0.0 == var7 ? 0 : 1));
                    stackIn_54_0 = stackOut_53_0;
                    break L12;
                  }
                  L20: {
                    L21: {
                      if (stackIn_54_0 >= 0) {
                        break L21;
                      } else {
                        efa.field_y = var17;
                        var17 = var4_int * 50 + (var17 - -50);
                        ona.field_H = var17;
                        var17 += 100;
                        var17 += 50;
                        if (var33 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    ((opa) this).field_p = true;
                    break L20;
                  }
                  L22: {
                    L23: {
                      if (var9 > 0.0) {
                        break L23;
                      } else {
                        ((opa) this).field_m = true;
                        if (var33 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    nta.field_d = var17;
                    var17 = 50 + var4_int * 50 + var17;
                    og.field_m = var17;
                    var17 += 100;
                    var17 += 50;
                    break L22;
                  }
                  L24: {
                    L25: {
                      if (0.0 < var11) {
                        break L25;
                      } else {
                        ((opa) this).field_o = true;
                        if (var33 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    iv.field_ub = var17;
                    var17 = var17 - -(var4_int * 50) + 50;
                    ema.field_b = var17;
                    var17 += 100;
                    break L24;
                  }
                  L26: {
                    if (!((opa) this).field_p) {
                      break L26;
                    } else {
                      if (!((opa) this).field_m) {
                        break L26;
                      } else {
                        if (((opa) this).field_o) {
                          ona.field_H = var17;
                          var17 += 100;
                          var18 = var15 / 100.0;
                          ((opa) this).field_r[((opa) this).field_c.e(2)].field_i = var18;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  var17 += 100;
                  fd.field_e = var17;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var4 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var4;
            stackOut_80_1 = new StringBuilder().append("opa.<init>(");
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L27;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L27;
            }
          }
          L28: {
            stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',');
            stackIn_87_0 = stackOut_84_0;
            stackIn_87_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param1 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L28;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_88_0 = stackOut_85_0;
              stackIn_88_1 = stackOut_85_1;
              stackIn_88_2 = stackOut_85_2;
              break L28;
            }
          }
          L29: {
            stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',');
            stackIn_91_0 = stackOut_88_0;
            stackIn_91_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param2 == null) {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L29;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_92_0 = stackOut_89_0;
              stackIn_92_1 = stackOut_89_1;
              stackIn_92_2 = stackOut_89_2;
              break L29;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_92_0, stackIn_92_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_14_0 = false;
        w stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        w stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        w stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_13_0 = false;
        w stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        w stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        w stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 80) {
                break L1;
              } else {
                ((opa) this).b(76, true);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= ((opa) this).field_c.field_H.length) {
                    break L4;
                  } else {
                    stackOut_6_0 = ((opa) this).field_q;
                    stackIn_14_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0) {
                          break L5;
                        } else {
                          ((opa) this).field_c.field_H[var3_int].n((byte) -98).a(26, 4, true);
                          break L5;
                        }
                      }
                      ((opa) this).field_c.field_H[var3_int].n((byte) -127).a(param0 + 21383);
                      ((opa) this).field_c.field_H[var3_int].n((byte) -54).f(-4366);
                      var3_int++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((opa) this).field_q = true;
                stackOut_13_0 = param1;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              }
              L6: {
                if (stackIn_14_0) {
                  ((opa) this).c(7);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ((opa) this).field_c.field_E = ((opa) this).field_c.field_E + 1;
                var3_int = ((opa) this).field_c.field_E;
                if (fd.field_e > var3_int) {
                  break L7;
                } else {
                  if (!((opa) this).field_s) {
                    L8: {
                      if (((opa) this).field_f == null) {
                        break L8;
                      } else {
                        ((opa) this).field_f.a(6418);
                        break L8;
                      }
                    }
                    ((opa) this).field_s = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              var4 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (((opa) this).field_r.length <= var4) {
                      break L11;
                    } else {
                      ((opa) this).field_r[var4].a(0, var3_int, var4);
                      var4++;
                      if (var5 != 0) {
                        break L10;
                      } else {
                        if (var5 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    stackOut_33_0 = mr.field_w;
                    stackOut_33_1 = param0 + 35;
                    stackIn_36_0 = stackOut_33_0;
                    stackIn_36_1 = stackOut_33_1;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    if (param1) {
                      stackOut_36_0 = (w) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      break L12;
                    } else {
                      stackOut_34_0 = (w) (Object) stackIn_34_0;
                      stackOut_34_1 = stackIn_34_1;
                      stackOut_34_2 = 1;
                      stackIn_37_0 = stackOut_34_0;
                      stackIn_37_1 = stackOut_34_1;
                      stackIn_37_2 = stackOut_34_2;
                      break L12;
                    }
                  }
                  ((w) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2 != 0);
                  break L10;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "opa.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
