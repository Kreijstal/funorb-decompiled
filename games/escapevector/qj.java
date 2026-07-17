/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    int field_h;
    int field_b;
    static ee field_g;
    static String field_d;
    static int field_c;
    static java.awt.Frame field_f;
    static n field_a;
    static java.awt.Frame field_i;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, ed param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param6 > 0) {
                if (20 >= param6) {
                  L2: {
                    var8_int = 0;
                    var9 = param6;
                    if (var9 <= 20) {
                      break L2;
                    } else {
                      var9 = 20;
                      break L2;
                    }
                  }
                  L3: {
                    if (var9 <= 10) {
                      var8_int = 0;
                      break L3;
                    } else {
                      var8_int = -10 + var9;
                      var8_int = 224 * (var8_int * var8_int) / 100;
                      var9 = 20 * var9 / (var8_int + 20);
                      break L3;
                    }
                  }
                  var10 = var9 * var9;
                  var11 = param5 - var9;
                  L4: while (true) {
                    if (param5 + var9 <= var11) {
                      break L1;
                    } else {
                      var12 = param3 + (-var8_int + var11 * 640);
                      var13 = (-param5 + var11) * (1 + (var11 + -param5));
                      var14 = -var9;
                      L5: while (true) {
                        if (var14 >= 0) {
                          var14 = -(255 * var13 / var10) + 255;
                          var15 = -var8_int;
                          L6: while (true) {
                            if (var15 >= var8_int) {
                              var14 = 0;
                              L7: while (true) {
                                if (var14 >= var9) {
                                  var11++;
                                  continue L4;
                                } else {
                                  L8: {
                                    var15 = var13 + var14 * (var14 - -1);
                                    if (var15 < var10) {
                                      var16 = -(255 * var15 / var10) + 255;
                                      em.field_i[var14 + var12] = var16 * 65793;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var14++;
                                  continue L7;
                                }
                              }
                            } else {
                              int incrementValue$3 = var12;
                              var12++;
                              em.field_i[incrementValue$3] = var14 * 65793;
                              var15++;
                              continue L6;
                            }
                          }
                        } else {
                          L9: {
                            var15 = var13 + var14 * (1 + var14);
                            if (var15 >= var10) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var14++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  if (param6 < 30) {
                    var8_int = param6 - 20;
                    var8_int = param4.field_z / 2 * (var8_int * var8_int) / 100;
                    if (0 >= var8_int) {
                      break L1;
                    } else {
                      var9 = param4.field_z / 2 * 65536 / var8_int;
                      var10 = var9 >> 1;
                      var11 = 0;
                      L10: while (true) {
                        if (var11 >= var8_int + var8_int) {
                          break L1;
                        } else {
                          L11: {
                            var12 = var10 >> 16;
                            var10 = var10 + var9;
                            if (var12 < param4.field_v) {
                              break L11;
                            } else {
                              if (var12 < param4.field_v - -param4.field_x) {
                                var13 = param4.field_s * var12;
                                var14 = (var11 + -var8_int + param5) * 640 + param7 + param4.field_q;
                                var15_double = 8.0 * Math.sin((double)param1 + (double)((param1 & 7) + 8) * ((double)var12 * 0.001));
                                var15_double = var15_double + Math.sin((double)(param1 + var12) * 0.002 * (double)((5 * param1 & 31) + 16)) * 4.0;
                                var14 = var14 + (int)Math.floor(var15_double + 0.5);
                                var17 = 0;
                                L12: while (true) {
                                  if (param4.field_s <= var17) {
                                    break L11;
                                  } else {
                                    int incrementValue$4 = var13;
                                    var13++;
                                    var18 = param4.field_B[incrementValue$4];
                                    int incrementValue$5 = var14;
                                    var14++;
                                    em.field_i[incrementValue$5] = var18 - ae.a(4144959, var18 >> 2);
                                    var17++;
                                    continue L12;
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          var11++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    param4.e(param7, param2);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L13: {
              if (param0 == -1276284702) {
                break L13;
              } else {
                field_a = null;
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("qj.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param4 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw t.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          L1: {
            L2: {
              var2 = EscapeVector.field_A;
              var1 = hm.field_o.field_b.field_j ? 1 : 0;
              if (!bj.e((byte) -32)) {
                break L2;
              } else {
                if (hm.field_o.field_f != 2) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!aj.b(-119)) {
              if (!bj.e((byte) -122)) {
                if (aj.b(-126)) {
                  break L0;
                } else {
                  if (1 == hm.field_o.field_f) {
                    break L0;
                  } else {
                    hm.field_o = new pf(var1 != 0);
                    break L0;
                  }
                }
              } else {
                if (bj.e((byte) -122)) {
                  break L0;
                } else {
                  if (aj.b(-126)) {
                    break L0;
                  } else {
                    if (1 == hm.field_o.field_f) {
                      break L0;
                    } else {
                      hm.field_o = new pf(var1 != 0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (bj.e((byte) -122)) {
                break L0;
              } else {
                if (aj.b(-126)) {
                  break L0;
                } else {
                  if (1 == hm.field_o.field_f) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          hm.field_o = new pf(var1 != 0);
          break L0;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -38) {
            qj.b(69);
        }
        return ni.a(param2, param1, false, ka.field_d);
    }

    qj(int param0, int param1) {
        ((qj) this).field_b = param1;
        ((qj) this).field_h = param0;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_e = null;
        if (param0 != -10497) {
            field_c = -87;
        }
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ee("");
        field_d = "Ship";
        field_c = 0;
        field_a = new n(256);
        field_e = " - shoot";
    }
}
