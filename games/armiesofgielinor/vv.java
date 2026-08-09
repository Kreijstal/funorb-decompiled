/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vv {
    static Random field_b;
    static String field_c;
    static String field_a;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 79) {
            vv.a(110, 51, false, 108, -96, 59);
        }
    }

    final static void a(int param0) {
        int var1;
        L0: {
          if (224 > te.field_n) {
            var1 = te.field_n % 32;
            jf.b(32 + (te.field_n - var1), 84);
            break L0;
          } else {
            jf.b(256, param0 ^ -30690);
            break L0;
          }
        }
        if (param0 != -30647) {
          vv.a((byte) 85);
          return;
        } else {
          return;
        }
    }

    final static og[] a(String param0, int param1) {
        int incrementValue$1 = 0;
        at var2 = null;
        RuntimeException var2_ref = null;
        og[] var3 = null;
        int var4 = 0;
        og var5 = null;
        int var6 = 0;
        og[] stackIn_4_0 = null;
        og[] stackIn_7_0 = null;
        og[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0.equals(no.field_N)) {
              stackIn_4_0 = ol.field_w;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = gu.a(false, param0);
              var3 = new og[var2.b(false)];
              var4 = 0;
              if (param1 > 109) {
                var5 = (og) ((Object) var2.e((byte) 100));
                L1: while (true) {
                  if (var5 == null) {
                    no.field_N = param0;
                    ol.field_w = var3;
                    stackIn_12_0 = (og[]) (var3);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    incrementValue$1 = var4;
                    var4++;
                    var3[incrementValue$1] = var5;
                    var5 = (og) ((Object) var2.a((byte) 123));
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = (og[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2_ref);

            stackIn_15_1 = new StringBuilder().append("vv.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int[][] stackIn_41_4;
        int stackIn_42_0;
        int stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        int[][] stackIn_42_4;
        int stackIn_42_5;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_51_3;
        int[][] stackIn_51_4;
        int stackIn_52_3;
        int[][] stackIn_52_4;
        int stackIn_52_5;
        int stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int[][] stackIn_82_4;
        int stackIn_83_0;
        int stackIn_83_1;
        int stackIn_83_2;
        int stackIn_83_3;
        int[][] stackIn_83_4;
        int stackIn_83_5;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_92_3;
        int[][] stackIn_92_4;
        int stackIn_93_3;
        int[][] stackIn_93_4;
        int stackIn_93_5;
        int stackIn_123_0;
        int stackIn_123_1;
        int stackIn_123_2;
        int stackIn_123_3;
        int[][] stackIn_123_4;
        int stackIn_124_0;
        int stackIn_124_1;
        int stackIn_124_2;
        int stackIn_124_3;
        int[][] stackIn_124_4;
        int stackIn_124_5;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_133_3;
        int[][] stackIn_133_4;
        int stackIn_134_3;
        int[][] stackIn_134_4;
        int stackIn_134_5;
        int stackIn_159_0;
        int stackIn_159_1;
        int stackIn_159_2;
        int stackIn_159_3;
        int[][] stackIn_159_4;
        int stackIn_160_0;
        int stackIn_160_1;
        int stackIn_160_2;
        int stackIn_160_3;
        int[][] stackIn_160_4;
        int stackIn_160_5;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_167_2 = 0;
        int stackIn_169_3;
        int[][] stackIn_169_4;
        int stackIn_170_3;
        int[][] stackIn_170_4;
        int stackIn_170_5;
        int stackIn_191_0;
        int stackIn_191_1;
        int stackIn_191_2;
        int stackIn_191_3;
        int[][] stackIn_191_4;
        int stackIn_192_0;
        int stackIn_192_1;
        int stackIn_192_2;
        int stackIn_192_3;
        int[][] stackIn_192_4;
        int stackIn_192_5;
        int stackIn_198_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_199_0 = 0;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        int stackIn_201_3;
        int[][] stackIn_201_4;
        int stackIn_202_3 = 0;
        int[][] stackIn_202_4 = null;
        int stackIn_202_5 = 0;
        int stackIn_227_0;
        int stackIn_227_1;
        int stackIn_227_2;
        int stackIn_227_3;
        int[][] stackIn_227_4;
        int stackIn_228_0;
        int stackIn_228_1;
        int stackIn_228_2;
        int stackIn_228_3;
        int[][] stackIn_228_4;
        int stackIn_228_5;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        int stackIn_235_0 = 0;
        int stackIn_235_1 = 0;
        int stackIn_235_2 = 0;
        int stackIn_237_3;
        int[][] stackIn_237_4;
        int stackIn_238_3 = 0;
        int[][] stackIn_238_4 = null;
        int stackIn_238_5 = 0;
        int stackIn_266_0;
        int stackIn_266_1;
        int stackIn_266_2;
        int stackIn_266_3;
        int[][] stackIn_266_4;
        int stackIn_267_0;
        int stackIn_267_1;
        int stackIn_267_2;
        int stackIn_267_3;
        int[][] stackIn_267_4;
        int stackIn_267_5;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_274_0 = 0;
        int stackIn_274_1 = 0;
        int stackIn_274_2 = 0;
        int stackIn_276_3;
        int[][] stackIn_276_4;
        int stackIn_277_3 = 0;
        int[][] stackIn_277_4 = null;
        int stackIn_277_5 = 0;
        int var7;
        int var8;
        ne var9;
        int var10;
        int var11;
        jd var12;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 < -72) {
          L0: {
            var12 = vs.field_e[param3].field_c;
            if (var12 == null) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          var7 = stackIn_5_0;
          if (param2) {
            return;
          } else {
            if (var7 != 0) {
              L1: {
                var8 = jf.field_C.field_q;
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = bv.field_w.field_gb;
                  break L1;
                }
              }
              var9 = vs.field_e[param3];
              if (var12.field_u) {
                return;
              } else {
                if (!var12.field_s) {
                  L2: {
                    if (-2 == (var12.field_ab ^ -1)) {
                      i.a(false, param5, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var12.c(false)) {
                      eu.a(111, param5, param0, var12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var12.u(8)) {
                      nb.a(param0, param5, (byte) -97, var12);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var12.field_x != null) {
                    if (var12.field_O == ne.field_i) {
                      if (!var12.field_s) {
                        if (jf.field_C.field_L > 0) {
                          go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                          if (var9.a(false)) {
                            if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              if (var12.i(-21428)) {
                                L5: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (0 > (var9.field_a ^ -1)) {
                                    L6: {
                                      stackIn_266_0 = param0 - -19;

                                      stackIn_266_1 = param5 + 31;

                                      stackIn_266_2 = 40;

                                      stackIn_266_3 = 4;

                                      stackIn_266_4 = op.field_c;

                                      if (bv.field_w.field_wb) {
                                        stackIn_267_0 = stackIn_266_0;
                                        stackIn_267_1 = stackIn_266_1;
                                        stackIn_267_2 = stackIn_266_2;
                                        stackIn_267_3 = stackIn_266_3;
                                        stackIn_267_4 = (int[][]) ((Object) stackIn_266_4);
                                        stackIn_267_5 = 1;
                                        break L6;
                                      } else {
                                        stackIn_267_0 = stackIn_266_0;
                                        stackIn_267_1 = stackIn_266_1;
                                        stackIn_267_2 = stackIn_266_2;
                                        stackIn_267_3 = stackIn_266_3;
                                        stackIn_267_4 = (int[][]) ((Object) stackIn_266_4);
                                        stackIn_267_5 = 0;
                                        break L6;
                                      }
                                    }
                                    qn.f(stackIn_267_0, stackIn_267_1, stackIn_267_2, stackIn_267_3, stackIn_267_4[stackIn_267_5][var9.field_a]);
                                    break L5;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L5;
                                  }
                                }
                                L7: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << -1124917309) / 3;
                                    break L7;
                                  } else {
                                    var10 = var10 << 2;
                                    break L7;
                                  }
                                }
                                L8: {
                                  stackIn_273_0 = param0 + 19;

                                  stackIn_273_1 = 31 + param5;

                                  if (var10 > 40) {
                                    stackIn_274_0 = stackIn_273_0;
                                    stackIn_274_1 = stackIn_273_1;
                                    stackIn_274_2 = 40;
                                    break L8;
                                  } else {
                                    stackIn_274_0 = stackIn_273_0;
                                    stackIn_274_1 = stackIn_273_1;
                                    stackIn_274_2 = var10;
                                    break L8;
                                  }
                                }
                                L9: {






                                  stackIn_276_3 = 4;

                                  stackIn_276_4 = op.field_c;

                                  if (!bv.field_w.field_wb) {



                                    stackIn_277_3 = stackIn_276_3;
                                    stackIn_277_4 = (int[][]) ((Object) stackIn_276_4);
                                    stackIn_277_5 = 0;
                                    break L9;
                                  } else {



                                    stackIn_277_3 = stackIn_276_3;
                                    stackIn_277_4 = (int[][]) ((Object) stackIn_276_4);
                                    stackIn_277_5 = 1;
                                    break L9;
                                  }
                                }
                                qn.f(stackIn_274_0, stackIn_274_1, stackIn_274_2, stackIn_277_3, stackIn_277_4[stackIn_277_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L10: {
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                return;
                              }
                            } else {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            if (param4 <= 0) {
                              return;
                            } else {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              return;
                            }
                          }
                        } else {
                          if (var9.a(false)) {
                            if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              if (!var12.i(-21428)) {
                                L11: {
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                return;
                              } else {
                                L12: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (0 > (var9.field_a ^ -1)) {
                                    L13: {
                                      stackIn_227_0 = param0 - -19;

                                      stackIn_227_1 = param5 + 31;

                                      stackIn_227_2 = 40;

                                      stackIn_227_3 = 4;

                                      stackIn_227_4 = op.field_c;

                                      if (bv.field_w.field_wb) {
                                        stackIn_228_0 = stackIn_227_0;
                                        stackIn_228_1 = stackIn_227_1;
                                        stackIn_228_2 = stackIn_227_2;
                                        stackIn_228_3 = stackIn_227_3;
                                        stackIn_228_4 = (int[][]) ((Object) stackIn_227_4);
                                        stackIn_228_5 = 1;
                                        break L13;
                                      } else {
                                        stackIn_228_0 = stackIn_227_0;
                                        stackIn_228_1 = stackIn_227_1;
                                        stackIn_228_2 = stackIn_227_2;
                                        stackIn_228_3 = stackIn_227_3;
                                        stackIn_228_4 = (int[][]) ((Object) stackIn_227_4);
                                        stackIn_228_5 = 0;
                                        break L13;
                                      }
                                    }
                                    qn.f(stackIn_228_0, stackIn_228_1, stackIn_228_2, stackIn_228_3, stackIn_228_4[stackIn_228_5][var9.field_a]);
                                    break L12;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L12;
                                  }
                                }
                                L14: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << -1124917309) / 3;
                                    break L14;
                                  } else {
                                    var10 = var10 << 2;
                                    break L14;
                                  }
                                }
                                L15: {
                                  stackIn_234_0 = param0 + 19;

                                  stackIn_234_1 = 31 + param5;

                                  if (var10 > 40) {
                                    stackIn_235_0 = stackIn_234_0;
                                    stackIn_235_1 = stackIn_234_1;
                                    stackIn_235_2 = 40;
                                    break L15;
                                  } else {
                                    stackIn_235_0 = stackIn_234_0;
                                    stackIn_235_1 = stackIn_234_1;
                                    stackIn_235_2 = var10;
                                    break L15;
                                  }
                                }
                                L16: {






                                  stackIn_237_3 = 4;

                                  stackIn_237_4 = op.field_c;

                                  if (!bv.field_w.field_wb) {



                                    stackIn_238_3 = stackIn_237_3;
                                    stackIn_238_4 = (int[][]) ((Object) stackIn_237_4);
                                    stackIn_238_5 = 0;
                                    break L16;
                                  } else {



                                    stackIn_238_3 = stackIn_237_3;
                                    stackIn_238_4 = (int[][]) ((Object) stackIn_237_4);
                                    stackIn_238_5 = 1;
                                    break L16;
                                  }
                                }
                                L17: {
                                  qn.f(stackIn_235_0, stackIn_235_1, stackIn_235_2, stackIn_238_3, stackIn_238_4[stackIn_238_5][bv.field_w.o(var12.field_O, -1)]);
                                  if (param4 > 0) {
                                    bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                return;
                              }
                            } else {
                              L18: {
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              return;
                            }
                          } else {
                            L19: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        if (var9.a(false)) {
                          if (!bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                            if (!var12.i(-21428)) {
                              L20: {
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              return;
                            } else {
                              L21: {
                                qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                if (0 > (var9.field_a ^ -1)) {
                                  L22: {
                                    stackIn_191_0 = param0 - -19;

                                    stackIn_191_1 = param5 + 31;

                                    stackIn_191_2 = 40;

                                    stackIn_191_3 = 4;

                                    stackIn_191_4 = op.field_c;

                                    if (bv.field_w.field_wb) {
                                      stackIn_192_0 = stackIn_191_0;
                                      stackIn_192_1 = stackIn_191_1;
                                      stackIn_192_2 = stackIn_191_2;
                                      stackIn_192_3 = stackIn_191_3;
                                      stackIn_192_4 = (int[][]) ((Object) stackIn_191_4);
                                      stackIn_192_5 = 1;
                                      break L22;
                                    } else {
                                      stackIn_192_0 = stackIn_191_0;
                                      stackIn_192_1 = stackIn_191_1;
                                      stackIn_192_2 = stackIn_191_2;
                                      stackIn_192_3 = stackIn_191_3;
                                      stackIn_192_4 = (int[][]) ((Object) stackIn_191_4);
                                      stackIn_192_5 = 0;
                                      break L22;
                                    }
                                  }
                                  qn.f(stackIn_192_0, stackIn_192_1, stackIn_192_2, stackIn_192_3, stackIn_192_4[stackIn_192_5][var9.field_a]);
                                  break L21;
                                } else {
                                  qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                  break L21;
                                }
                              }
                              L23: {
                                var10 = var9.e(10) + -var9.field_m;
                                if (10 != var9.e(10)) {
                                  var10 = (var10 << -1124917309) / 3;
                                  break L23;
                                } else {
                                  var10 = var10 << 2;
                                  break L23;
                                }
                              }
                              L24: {
                                stackIn_198_0 = param0 + 19;

                                stackIn_198_1 = 31 + param5;

                                if (var10 > 40) {
                                  stackIn_199_0 = stackIn_198_0;
                                  stackIn_199_1 = stackIn_198_1;
                                  stackIn_199_2 = 40;
                                  break L24;
                                } else {
                                  stackIn_199_0 = stackIn_198_0;
                                  stackIn_199_1 = stackIn_198_1;
                                  stackIn_199_2 = var10;
                                  break L24;
                                }
                              }
                              L25: {






                                stackIn_201_3 = 4;

                                stackIn_201_4 = op.field_c;

                                if (!bv.field_w.field_wb) {



                                  stackIn_202_3 = stackIn_201_3;
                                  stackIn_202_4 = (int[][]) ((Object) stackIn_201_4);
                                  stackIn_202_5 = 0;
                                  break L25;
                                } else {



                                  stackIn_202_3 = stackIn_201_3;
                                  stackIn_202_4 = (int[][]) ((Object) stackIn_201_4);
                                  stackIn_202_5 = 1;
                                  break L25;
                                }
                              }
                              L26: {
                                qn.f(stackIn_199_0, stackIn_199_1, stackIn_199_2, stackIn_202_3, stackIn_202_4[stackIn_202_5][bv.field_w.o(var12.field_O, -1)]);
                                if (param4 > 0) {
                                  bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              return;
                            }
                          } else {
                            L27: {
                              if (param4 > 0) {
                                bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            return;
                          }
                        } else {
                          L28: {
                            if (param4 > 0) {
                              bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L29: {
                        if (!var9.a(false)) {
                          break L29;
                        } else {
                          if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                            break L29;
                          } else {
                            if (var12.i(-21428)) {
                              L30: {
                                qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                if (0 > (var9.field_a ^ -1)) {
                                  L31: {
                                    stackIn_159_0 = param0 - -19;

                                    stackIn_159_1 = param5 + 31;

                                    stackIn_159_2 = 40;

                                    stackIn_159_3 = 4;

                                    stackIn_159_4 = op.field_c;

                                    if (bv.field_w.field_wb) {
                                      stackIn_160_0 = stackIn_159_0;
                                      stackIn_160_1 = stackIn_159_1;
                                      stackIn_160_2 = stackIn_159_2;
                                      stackIn_160_3 = stackIn_159_3;
                                      stackIn_160_4 = (int[][]) ((Object) stackIn_159_4);
                                      stackIn_160_5 = 1;
                                      break L31;
                                    } else {
                                      stackIn_160_0 = stackIn_159_0;
                                      stackIn_160_1 = stackIn_159_1;
                                      stackIn_160_2 = stackIn_159_2;
                                      stackIn_160_3 = stackIn_159_3;
                                      stackIn_160_4 = (int[][]) ((Object) stackIn_159_4);
                                      stackIn_160_5 = 0;
                                      break L31;
                                    }
                                  }
                                  qn.f(stackIn_160_0, stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4[stackIn_160_5][var9.field_a]);
                                  break L30;
                                } else {
                                  qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                  break L30;
                                }
                              }
                              L32: {
                                var10 = var9.e(10) + -var9.field_m;
                                if (10 != var9.e(10)) {
                                  var10 = (var10 << -1124917309) / 3;
                                  break L32;
                                } else {
                                  var10 = var10 << 2;
                                  break L32;
                                }
                              }
                              L33: {
                                stackIn_166_0 = param0 + 19;

                                stackIn_166_1 = 31 + param5;

                                if (var10 > 40) {
                                  stackIn_167_0 = stackIn_166_0;
                                  stackIn_167_1 = stackIn_166_1;
                                  stackIn_167_2 = 40;
                                  break L33;
                                } else {
                                  stackIn_167_0 = stackIn_166_0;
                                  stackIn_167_1 = stackIn_166_1;
                                  stackIn_167_2 = var10;
                                  break L33;
                                }
                              }
                              L34: {






                                stackIn_169_3 = 4;

                                stackIn_169_4 = op.field_c;

                                if (!bv.field_w.field_wb) {



                                  stackIn_170_3 = stackIn_169_3;
                                  stackIn_170_4 = (int[][]) ((Object) stackIn_169_4);
                                  stackIn_170_5 = 0;
                                  break L34;
                                } else {



                                  stackIn_170_3 = stackIn_169_3;
                                  stackIn_170_4 = (int[][]) ((Object) stackIn_169_4);
                                  stackIn_170_5 = 1;
                                  break L34;
                                }
                              }
                              qn.f(stackIn_167_0, stackIn_167_1, stackIn_167_2, stackIn_170_3, stackIn_170_4[stackIn_170_5][bv.field_w.o(var12.field_O, -1)]);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      L35: {
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!var12.h(-13494)) {
                    if (-1 == (var12.field_B ^ -1)) {
                      L36: {
                        of.field_Mb[2].a(param0 + 8, param5 + 12);
                        if (-2 == (var12.field_ab ^ -1)) {
                          i.a(false, param5, param0);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      L37: {
                        if (var12.c(false)) {
                          eu.a(111, param5, param0, var12);
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if (var12.u(8)) {
                          nb.a(param0, param5, (byte) -97, var12);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        if (var12.field_x != null) {
                          L40: {
                            if (var12.field_O != ne.field_i) {
                              break L40;
                            } else {
                              if (var12.field_s) {
                                break L40;
                              } else {
                                if (jf.field_C.field_L > 0) {
                                  go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          L41: {
                            if (!var9.a(false)) {
                              break L41;
                            } else {
                              if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                                break L41;
                              } else {
                                if (var12.i(-21428)) {
                                  L42: {
                                    qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                    if (0 > (var9.field_a ^ -1)) {
                                      L43: {
                                        stackIn_123_0 = param0 - -19;

                                        stackIn_123_1 = param5 + 31;

                                        stackIn_123_2 = 40;

                                        stackIn_123_3 = 4;

                                        stackIn_123_4 = op.field_c;

                                        if (bv.field_w.field_wb) {
                                          stackIn_124_0 = stackIn_123_0;
                                          stackIn_124_1 = stackIn_123_1;
                                          stackIn_124_2 = stackIn_123_2;
                                          stackIn_124_3 = stackIn_123_3;
                                          stackIn_124_4 = (int[][]) ((Object) stackIn_123_4);
                                          stackIn_124_5 = 1;
                                          break L43;
                                        } else {
                                          stackIn_124_0 = stackIn_123_0;
                                          stackIn_124_1 = stackIn_123_1;
                                          stackIn_124_2 = stackIn_123_2;
                                          stackIn_124_3 = stackIn_123_3;
                                          stackIn_124_4 = (int[][]) ((Object) stackIn_123_4);
                                          stackIn_124_5 = 0;
                                          break L43;
                                        }
                                      }
                                      qn.f(stackIn_124_0, stackIn_124_1, stackIn_124_2, stackIn_124_3, stackIn_124_4[stackIn_124_5][var9.field_a]);
                                      break L42;
                                    } else {
                                      qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                      break L42;
                                    }
                                  }
                                  L44: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      var10 = (var10 << -1124917309) / 3;
                                      break L44;
                                    } else {
                                      var10 = var10 << 2;
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    stackIn_130_0 = param0 + 19;

                                    stackIn_130_1 = 31 + param5;

                                    if (var10 > 40) {
                                      stackIn_131_0 = stackIn_130_0;
                                      stackIn_131_1 = stackIn_130_1;
                                      stackIn_131_2 = 40;
                                      break L45;
                                    } else {
                                      stackIn_131_0 = stackIn_130_0;
                                      stackIn_131_1 = stackIn_130_1;
                                      stackIn_131_2 = var10;
                                      break L45;
                                    }
                                  }
                                  L46: {






                                    stackIn_133_3 = 4;

                                    stackIn_133_4 = op.field_c;

                                    if (!bv.field_w.field_wb) {



                                      stackIn_134_3 = stackIn_133_3;
                                      stackIn_134_4 = (int[][]) ((Object) stackIn_133_4);
                                      stackIn_134_5 = 0;
                                      break L46;
                                    } else {



                                      stackIn_134_3 = stackIn_133_3;
                                      stackIn_134_4 = (int[][]) ((Object) stackIn_133_4);
                                      stackIn_134_5 = 1;
                                      break L46;
                                    }
                                  }
                                  qn.f(stackIn_131_0, stackIn_131_1, stackIn_131_2, stackIn_134_3, stackIn_134_4[stackIn_134_5][bv.field_w.o(var12.field_O, -1)]);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L39;
                          } else {
                            break L39;
                          }
                        } else {
                          break L39;
                        }
                      }
                      return;
                    } else {
                      L47: {
                        of.field_Mb[1].a(param0 - -8, param5 - -12);
                        if (-2 == (var12.field_ab ^ -1)) {
                          i.a(false, param5, param0);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      L48: {
                        if (var12.c(false)) {
                          eu.a(111, param5, param0, var12);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (var12.u(8)) {
                          nb.a(param0, param5, (byte) -97, var12);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (var12.field_x != null) {
                          L51: {
                            if (var12.field_O != ne.field_i) {
                              break L51;
                            } else {
                              if (var12.field_s) {
                                break L51;
                              } else {
                                if (jf.field_C.field_L > 0) {
                                  go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                  break L51;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                          L52: {
                            if (!var9.a(false)) {
                              break L52;
                            } else {
                              if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                                break L52;
                              } else {
                                if (var12.i(-21428)) {
                                  L53: {
                                    qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                    if (0 > (var9.field_a ^ -1)) {
                                      L54: {
                                        stackIn_82_0 = param0 - -19;

                                        stackIn_82_1 = param5 + 31;

                                        stackIn_82_2 = 40;

                                        stackIn_82_3 = 4;

                                        stackIn_82_4 = op.field_c;

                                        if (bv.field_w.field_wb) {
                                          stackIn_83_0 = stackIn_82_0;
                                          stackIn_83_1 = stackIn_82_1;
                                          stackIn_83_2 = stackIn_82_2;
                                          stackIn_83_3 = stackIn_82_3;
                                          stackIn_83_4 = (int[][]) ((Object) stackIn_82_4);
                                          stackIn_83_5 = 1;
                                          break L54;
                                        } else {
                                          stackIn_83_0 = stackIn_82_0;
                                          stackIn_83_1 = stackIn_82_1;
                                          stackIn_83_2 = stackIn_82_2;
                                          stackIn_83_3 = stackIn_82_3;
                                          stackIn_83_4 = (int[][]) ((Object) stackIn_82_4);
                                          stackIn_83_5 = 0;
                                          break L54;
                                        }
                                      }
                                      qn.f(stackIn_83_0, stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4[stackIn_83_5][var9.field_a]);
                                      break L53;
                                    } else {
                                      qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    var10 = var9.e(10) + -var9.field_m;
                                    if (10 != var9.e(10)) {
                                      var10 = (var10 << -1124917309) / 3;
                                      break L55;
                                    } else {
                                      var10 = var10 << 2;
                                      break L55;
                                    }
                                  }
                                  L56: {
                                    stackIn_89_0 = param0 + 19;

                                    stackIn_89_1 = 31 + param5;

                                    if (var10 > 40) {
                                      stackIn_90_0 = stackIn_89_0;
                                      stackIn_90_1 = stackIn_89_1;
                                      stackIn_90_2 = 40;
                                      break L56;
                                    } else {
                                      stackIn_90_0 = stackIn_89_0;
                                      stackIn_90_1 = stackIn_89_1;
                                      stackIn_90_2 = var10;
                                      break L56;
                                    }
                                  }
                                  L57: {






                                    stackIn_92_3 = 4;

                                    stackIn_92_4 = op.field_c;

                                    if (!bv.field_w.field_wb) {



                                      stackIn_93_3 = stackIn_92_3;
                                      stackIn_93_4 = (int[][]) ((Object) stackIn_92_4);
                                      stackIn_93_5 = 0;
                                      break L57;
                                    } else {



                                      stackIn_93_3 = stackIn_92_3;
                                      stackIn_93_4 = (int[][]) ((Object) stackIn_92_4);
                                      stackIn_93_5 = 1;
                                      break L57;
                                    }
                                  }
                                  qn.f(stackIn_90_0, stackIn_90_1, stackIn_90_2, stackIn_93_3, stackIn_93_4[stackIn_93_5][bv.field_w.o(var12.field_O, -1)]);
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                            }
                          }
                          if (param4 > 0) {
                            bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                            break L50;
                          } else {
                            break L50;
                          }
                        } else {
                          break L50;
                        }
                      }
                      return;
                    }
                  } else {
                    L58: {
                      if (-2 == (var12.field_ab ^ -1)) {
                        i.a(false, param5, param0);
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    L59: {
                      if (var12.c(false)) {
                        eu.a(111, param5, param0, var12);
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L60: {
                      if (var12.u(8)) {
                        nb.a(param0, param5, (byte) -97, var12);
                        break L60;
                      } else {
                        break L60;
                      }
                    }
                    L61: {
                      if (var12.field_x != null) {
                        L62: {
                          if (var12.field_O != ne.field_i) {
                            break L62;
                          } else {
                            if (var12.field_s) {
                              break L62;
                            } else {
                              if (jf.field_C.field_L > 0) {
                                go.field_g.f(10 + param0, param5 - -5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                go.field_g.f(10 + param0, 5 + param5, (int)(256.0 * Math.sin((double)jf.field_C.field_L * 3.141592653589793 / 200.0)));
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                          }
                        }
                        L63: {
                          if (!var9.a(false)) {
                            break L63;
                          } else {
                            if (bv.field_w.c(var9.field_a, -16985, var12.field_O)) {
                              break L63;
                            } else {
                              if (var12.i(-21428)) {
                                L64: {
                                  qn.b(param0 + 18, param5 - -30, 42, 6, 11184810);
                                  if (0 > (var9.field_a ^ -1)) {
                                    L65: {
                                      stackIn_41_0 = param0 - -19;

                                      stackIn_41_1 = param5 + 31;

                                      stackIn_41_2 = 40;

                                      stackIn_41_3 = 4;

                                      stackIn_41_4 = op.field_c;

                                      if (bv.field_w.field_wb) {
                                        stackIn_42_0 = stackIn_41_0;
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = stackIn_41_2;
                                        stackIn_42_3 = stackIn_41_3;
                                        stackIn_42_4 = (int[][]) ((Object) stackIn_41_4);
                                        stackIn_42_5 = 1;
                                        break L65;
                                      } else {
                                        stackIn_42_0 = stackIn_41_0;
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = stackIn_41_2;
                                        stackIn_42_3 = stackIn_41_3;
                                        stackIn_42_4 = (int[][]) ((Object) stackIn_41_4);
                                        stackIn_42_5 = 0;
                                        break L65;
                                      }
                                    }
                                    qn.f(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4[stackIn_42_5][var9.field_a]);
                                    break L64;
                                  } else {
                                    qn.f(param0 + 19, param5 - -31, 40, 4, 0);
                                    break L64;
                                  }
                                }
                                L66: {
                                  var10 = var9.e(10) + -var9.field_m;
                                  if (10 != var9.e(10)) {
                                    var10 = (var10 << -1124917309) / 3;
                                    break L66;
                                  } else {
                                    var10 = var10 << 2;
                                    break L66;
                                  }
                                }
                                L67: {
                                  stackIn_48_0 = param0 + 19;

                                  stackIn_48_1 = 31 + param5;

                                  if (var10 > 40) {
                                    stackIn_49_0 = stackIn_48_0;
                                    stackIn_49_1 = stackIn_48_1;
                                    stackIn_49_2 = 40;
                                    break L67;
                                  } else {
                                    stackIn_49_0 = stackIn_48_0;
                                    stackIn_49_1 = stackIn_48_1;
                                    stackIn_49_2 = var10;
                                    break L67;
                                  }
                                }
                                L68: {






                                  stackIn_51_3 = 4;

                                  stackIn_51_4 = op.field_c;

                                  if (!bv.field_w.field_wb) {



                                    stackIn_52_3 = stackIn_51_3;
                                    stackIn_52_4 = (int[][]) ((Object) stackIn_51_4);
                                    stackIn_52_5 = 0;
                                    break L68;
                                  } else {



                                    stackIn_52_3 = stackIn_51_3;
                                    stackIn_52_4 = (int[][]) ((Object) stackIn_51_4);
                                    stackIn_52_5 = 1;
                                    break L68;
                                  }
                                }
                                qn.f(stackIn_49_0, stackIn_49_1, stackIn_49_2, stackIn_52_3, stackIn_52_4[stackIn_52_5][bv.field_w.o(var12.field_O, -1)]);
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        if (param4 > 0) {
                          bk.field_d[1].b(30 + param0, -50 + param5, param4, 0);
                          break L61;
                        } else {
                          break L61;
                        }
                      } else {
                        break L61;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 125 % ((17 - param0) / 52);
            stackIn_1_0 = er.a(true, -108, param1, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("vv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
        if (param0 != -62) {
            field_a = (String) null;
            return "Hi!";
        }
        return "Hi!";
    }

    static {
        field_b = new Random(6L);
        field_c = "Fire";
        field_a = "Single";
    }
}
