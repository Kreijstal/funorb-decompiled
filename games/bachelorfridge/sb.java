/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends pu {
    static ee[] field_l;
    static sna field_n;
    static String[] field_m;

    public static void b(int param0) {
        field_l = null;
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
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
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
              if (~param4 > ~dg.field_j) {
                param3 = param3 - (dg.field_j + -param4);
                param4 = dg.field_j;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~dg.field_k <= ~(param3 + param4)) {
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
                if (param3 > 0) {
                  var21 = param2.a();
                  var32 = dg.field_e;
                  var10 = dg.field_i;
                  var11 = dg.field_c;
                  var30 = new int[4];
                  dg.a(var30);
                  param2.b();
                  if (param7 > 71) {
                    dg.c(var30[0], var30[1], var30[2], var30[3]);
                    var13 = param0 - -(param2.field_q * param4);
                    var14 = param2.field_q - param5;
                    var31 = var21.field_v;
                    var28 = var31;
                    var25 = var28;
                    var22 = var25;
                    var15 = var22;
                    var16 = param4;
                    L6: while (true) {
                      if (var16 >= param4 + param3) {
                        var21.e(-param2.field_t, -param2.field_u);
                        dg.a(var32, var10, var11);
                        dg.b(var30);
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
                              var18 = var31[var13];
                              if (0 != var18) {
                                L9: {
                                  L10: {
                                    if (var17 <= 0) {
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
                                    if (var16 <= 0) {
                                      break L11;
                                    } else {
                                      if (var15[-param2.field_q + var13] == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (~var17 <= ~(param2.field_q + -1)) {
                                      break L12;
                                    } else {
                                      if (var15[1 + var13] == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var16 >= -1 + param2.field_p) {
                                    break L8;
                                  } else {
                                    if (var15[param2.field_q + var13] == 0) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
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
                    return;
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var8;
            stackOut_39_1 = new StringBuilder().append("sb.B(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
