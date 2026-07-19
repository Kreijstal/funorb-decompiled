/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends pu {
    static ee[] field_l;
    static sna field_n;
    static String[] field_m;

    public static void b(int param0) {
        field_l = null;
        if (param0 != 2630) {
            field_n = (sna) null;
        }
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, int param1, kv param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        kv var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 >= dg.field_f) {
                break L1;
              } else {
                param5 = param5 - (-param0 + dg.field_f);
                param0 = dg.field_f;
                break L1;
              }
            }
            L2: {
              if (dg.field_h >= param5 + param0) {
                break L2;
              } else {
                param5 = dg.field_h - param0;
                break L2;
              }
            }
            L3: {
              if (param4 < dg.field_j) {
                param3 = param3 - (dg.field_j + -param4);
                param4 = dg.field_j;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (dg.field_k >= param3 + param4) {
                break L4;
              } else {
                param3 = -param4 + dg.field_k;
                break L4;
              }
            }
            L5: {
              if (param5 <= 0) {
                break L5;
              } else {
                if ((param3 ^ -1) < -1) {
                  var21 = param2.a();
                  var30 = dg.field_e;
                  var10 = dg.field_i;
                  var11 = dg.field_c;
                  var29 = new int[4];
                  dg.a(var29);
                  param2.b();
                  if (param7 > 71) {
                    dg.c(var29[0], var29[1], var29[2], var29[3]);
                    var13 = param0 - -(param2.field_q * param4);
                    var14 = param2.field_q - param5;
                    var25 = var21.field_v;
                    var22 = var25;
                    var15 = var22;
                    var16 = param4;
                    L6: while (true) {
                      if (var16 >= param4 + param3) {
                        var21.e(-param2.field_t, -param2.field_u);
                        dg.a(var30, var10, var11);
                        dg.b(var29);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var17 = param0;
                        L7: while (true) {
                          if (var17 >= param0 + param5) {
                            var13 = var13 + var14;
                            var16++;
                            continue L6;
                          } else {
                            L8: {
                              var18 = var25[var13];
                              if (0 != var18) {
                                L9: {
                                  L10: {
                                    if ((var17 ^ -1) >= -1) {
                                      break L10;
                                    } else {
                                      if (var15[-1 + var13] == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if ((var16 ^ -1) >= -1) {
                                      break L11;
                                    } else {
                                      if (-1 == (var15[-param2.field_q + var13] ^ -1)) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var17 >= param2.field_q + -1) {
                                      break L12;
                                    } else {
                                      if (var15[1 + var13] == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var16 < -1 + param2.field_p) {
                                    if (var15[param2.field_q + var13] == 0) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    var13++;
                                    var17++;
                                    continue L7;
                                  }
                                }
                                dg.b(var17, var16, param1, param6);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var8);
            stackOut_40_1 = new StringBuilder().append("sb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
