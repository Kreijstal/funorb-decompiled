/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends gn {
    static String field_l;
    ot field_e;
    int field_g;
    static tf field_i;
    int field_k;
    ob field_h;
    static ut field_f;
    gm field_m;
    boolean field_n;
    private int field_j;

    final static int a(js param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              if (0 == param0.field_c) {
                break L2;
              } else {
                if (17 == param0.field_c) {
                  break L2;
                } else {
                  if (13 == param0.field_c) {
                    break L2;
                  } else {
                    if (param0.field_c == 12) {
                      break L2;
                    } else {
                      if (param0.field_c == 1) {
                        break L2;
                      } else {
                        if (2 == param0.field_c) {
                          break L2;
                        } else {
                          if (param0.field_c == 3) {
                            break L2;
                          } else {
                            if (4 == param0.field_c) {
                              break L2;
                            } else {
                              if (param0.field_c == 5) {
                                break L2;
                              } else {
                                if (6 == param0.field_c) {
                                  break L2;
                                } else {
                                  if (param0.field_c == 8) {
                                    break L2;
                                  } else {
                                    if (18 == param0.field_c) {
                                      break L2;
                                    } else {
                                      if (param0.field_c == -5) {
                                        break L2;
                                      } else {
                                        if (param0.field_c == 26) {
                                          break L2;
                                        } else {
                                          L3: {
                                            if (-1 != param0.field_c) {
                                              break L3;
                                            } else {
                                              if (!ja.field_O) {
                                                break L3;
                                              } else {
                                                stackOut_21_0 = dt.b((byte) -75);
                                                stackIn_22_0 = stackOut_21_0;
                                                return stackIn_22_0;
                                              }
                                            }
                                          }
                                          stackOut_23_0 = 0;
                                          stackIn_24_0 = stackOut_23_0;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_17_0 = 256;
            stackIn_18_0 = stackOut_17_0;
            return stackIn_18_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("ak.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var2 = 69 / ((param0 - 50) / 59);
        if (((ak) this).field_j != 1) {
          if (((ak) this).field_j != 2) {
            if (((ak) this).field_j == 3) {
              L0: {
                if (((ak) this).field_n ^ ia.field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = 1344;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              return stackIn_9_0;
            } else {
              return ((ak) this).field_g;
            }
          } else {
            return ((ak) this).field_h.field_E >> 16;
          }
        } else {
          return ((ak) this).field_m.a(true);
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ak) this).field_g = -(((ak) this).field_e.field_v >> 1) + param1;
        if (param2 > -46) {
            return;
        }
        ((ak) this).field_k = param0;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var9 = Kickabout.field_G;
        if (-1 == ((ak) this).field_j) {
          L0: {
            if (((ak) this).field_j == 0) {
              stackOut_11_0 = 4;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_10_0 = ((ak) this).field_e.field_v >> 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            }
          }
          var2 = stackIn_12_0;
          var3 = ug.a(0, ((ak) this).field_k);
          var4 = lf.a((byte) -59, ((ak) this).field_g - -var2);
          var5_int = ((ak) this).field_e.field_o * hw.field_i >> 8;
          var6 = ((ak) this).field_e.field_v * hw.field_i >> 8;
          ((ak) this).field_e.a(var3 - (var5_int >> 1), -(var6 >> 1) + var4, var5_int, var6);
          if (param0 == 192) {
            return;
          } else {
            ((ak) this).b(86);
            return;
          }
        } else {
          if (-5 != ((ak) this).field_j) {
            if (((ak) this).field_j != 5) {
              if (((ak) this).field_j != 3) {
                if (1 != ((ak) this).field_j) {
                  if (((ak) this).field_j == 2) {
                    ((ak) this).field_h.h(param0 ^ 128);
                    if (param0 != 192) {
                      ((ak) this).b(86);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 != 192) {
                      ((ak) this).b(86);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  ((ak) this).field_m.d(false);
                  if (param0 != 192) {
                    ((ak) this).b(86);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ru.a(((ak) this).field_n, (byte) -114);
                if (param0 != 192) {
                  ((ak) this).b(86);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L1: {
                var2 = ug.a(param0 ^ 192, ((ak) this).field_k);
                var3 = lf.a((byte) -110, (((ak) this).field_e.field_v >> 1) + ((ak) this).field_g);
                var4 = hw.field_i << 4;
                var5 = nj.a(param0 + -126);
                var7 = (int)(var5 % 1050L);
                if (var7 >= 700) {
                  break L1;
                } else {
                  var8 = (65536 + we.a((var7 << 13) / 700, false) >> 11) + 192;
                  var4 = var8 * var4 >> 8;
                  break L1;
                }
              }
              var8 = (int)((var5 << 16) / 2600L);
              ((ak) this).field_e.a(var3, 24407, -var8, var2, var4);
              if (param0 != 192) {
                ((ak) this).b(86);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              if (((ak) this).field_j == 0) {
                stackOut_4_0 = 4;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = ((ak) this).field_e.field_v >> 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var2 = stackIn_5_0;
            var3 = ug.a(0, ((ak) this).field_k);
            var4 = lf.a((byte) -59, ((ak) this).field_g - -var2);
            var5_int = ((ak) this).field_e.field_o * hw.field_i >> 8;
            var6 = ((ak) this).field_e.field_v * hw.field_i >> 8;
            ((ak) this).field_e.a(var3 - (var5_int >> 1), -(var6 >> 1) + var4, var5_int, var6);
            if (param0 == 192) {
              return;
            } else {
              ((ak) this).b(86);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_f = null;
        field_l = null;
    }

    ak(int param0) {
        ((ak) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The '<%0>' setting needs to be changed.";
        field_i = new tf();
    }
}
