/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_a;
    static int[] field_c;
    static ll field_d;
    static db[] field_b;

    final static short[] a(th param0, byte param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_18_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param0.g(param2, 26527);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              var5 = param0.g(4, 26527);
              if (param1 <= -32) {
                L3: {
                  var6 = (short)param0.g(16, 26527);
                  if (var5 > 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (short)(param0.g(var5, 26527) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param3[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (short[]) param3;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (short[]) (Object) stackIn_10_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("hi.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wh var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_25_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        wh stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_35_0 = null;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        wh stackOut_42_0 = null;
        wh stackOut_41_0 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = rf.field_c;
              var2 = 0;
              if (sh.field_a != 2) {
                break L1;
              } else {
                var3_long = -ug.field_x + rf.c(0);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (ee.field_g.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = ni.field_a[var3];
                  if (var4 >= 0) {
                    if (bc.field_H.field_d == var4) {
                      var5 = g.field_n;
                      break L3;
                    } else {
                      var5 = ec.field_c;
                      break L3;
                    }
                  } else {
                    var5 = ea.field_b;
                    break L3;
                  }
                }
                L4: {
                  var6 = ee.field_g[var3];
                  if (sh.field_a != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (hf.field_b.length > ed.field_t.length) {
                          stackOut_15_0 = hf.field_b.length;
                          stackIn_16_0 = stackOut_15_0;
                          break L5;
                        } else {
                          stackOut_14_0 = ed.field_t.length;
                          stackIn_16_0 = stackOut_14_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_16_0;
                        if (qc.field_e.length < nl.field_a.length) {
                          stackOut_18_0 = nl.field_a.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = qc.field_e.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_19_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var7 + 6 > var3) {
                            L8: {
                              if (0 <= var3 - (6 + -ed.field_t.length) + -var7) {
                                stackOut_24_0 = ed.field_t[-var7 + ed.field_t.length + (-6 + var3)];
                                stackIn_25_0 = stackOut_24_0;
                                break L8;
                              } else {
                                stackOut_23_0 = "";
                                stackIn_25_0 = stackOut_23_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_25_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var8 + (7 - -var7) > var3) {
                          L9: {
                            if (qc.field_e.length <= -var7 + -7 + var3) {
                              stackOut_31_0 = "";
                              stackIn_32_0 = stackOut_31_0;
                              break L9;
                            } else {
                              stackOut_30_0 = qc.field_e[-var7 + (-7 + var3)];
                              stackIn_32_0 = stackOut_30_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_35_0 = (String) var6;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (var4 < 0) {
                    stackOut_37_0 = (String) (Object) stackIn_37_0;
                    stackOut_37_1 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L11;
                  } else {
                    stackOut_36_0 = (String) (Object) stackIn_36_0;
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = ii.a(stackIn_38_0, stackIn_38_1 != 0, 0);
                  var8 = -(var7 >> 1) + uh.field_D;
                  if (var4 >= 0) {
                    L13: {
                      if (bc.field_H.field_d != var4) {
                        stackOut_42_0 = sc.field_d;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = fg.field_c;
                        stackIn_43_0 = stackOut_41_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      var1_int = var1_int + we.field_l;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(var1_int, (oh.field_b << 1) + fb.field_g, var7 - -(jh.field_e << 1), var8 + -jh.field_e, -1160208572);
                        break L14;
                      }
                    }
                    var1_int = var1_int + oh.field_b;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    pb.field_i.b(var6, var8, var1_int + sb.field_f, var5, -1);
                    var1_int = var1_int + hc.field_fb;
                    break L15;
                  } else {
                    fb.field_m.b(var6, var8, var1_int - -kk.field_o, var5, -1);
                    var1_int = var1_int + (oh.field_b - -we.field_l + fb.field_g);
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hi.B(" + 0 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 18670) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{2, 2, 3, 5, 1, 2, 3, 5, 3, 5, 10, 1, 3, 5, 10, 2};
        field_a = "Create your own free Jagex account";
    }
}
