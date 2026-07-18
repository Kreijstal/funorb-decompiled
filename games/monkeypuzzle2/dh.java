/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static cd field_d;
    static volatile int field_b;
    static int field_c;
    static String field_a;

    final static am a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_3_0 = null;
        am stackIn_7_0 = null;
        am stackIn_17_0 = null;
        am stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_6_0 = null;
        am stackOut_16_0 = null;
        am stackOut_20_0 = null;
        am stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 63) {
              stackOut_6_0 = wk.field_f;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (var2_int + -1 != var3) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_16_0 = lh.field_c;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (fb.field_i.indexOf(var4) == -1) {
                        stackOut_20_0 = lh.field_c;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_2_0 = si.field_s;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("dh.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 55 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        kd.field_a = null;
        ii.field_T = 0;
        pg.field_a = null;
        var2 = oh.field_c;
        oh.field_c = pi.field_o;
        if (param1 != 51) {
          if (50 == param1) {
            lg.field_n.field_a = 5;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (lg.field_n.field_b < 2) {
              L0: {
                if (lg.field_n.field_b < 2) {
                  break L0;
                } else {
                  if (param1 != 50) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (lg.field_n.field_b >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (51 == param1) {
                return 2;
              } else {
                L1: {
                  if (lg.field_n.field_b < 2) {
                    break L1;
                  } else {
                    if (param1 != 50) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (lg.field_n.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            lg.field_n.field_a = 1;
            pi.field_o = var2;
            lg.field_n.field_b = lg.field_n.field_b + 1;
            if (lg.field_n.field_b < 2) {
              L2: {
                if (lg.field_n.field_b < 2) {
                  break L2;
                } else {
                  if (param1 != 50) {
                    break L2;
                  } else {
                    return 5;
                  }
                }
              }
              if (lg.field_n.field_b >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (51 == param1) {
                return 2;
              } else {
                L3: {
                  if (lg.field_n.field_b < 2) {
                    break L3;
                  } else {
                    if (param1 != 50) {
                      break L3;
                    } else {
                      return 5;
                    }
                  }
                }
                if (lg.field_n.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        } else {
          lg.field_n.field_a = 2;
          pi.field_o = var2;
          lg.field_n.field_b = lg.field_n.field_b + 1;
          if (lg.field_n.field_b >= 2) {
            if (51 == param1) {
              return 2;
            } else {
              if (lg.field_n.field_b >= 2) {
                if (param1 != 50) {
                  if (lg.field_n.field_b >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (lg.field_n.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            if (lg.field_n.field_b >= 2) {
              if (param1 == 50) {
                return 5;
              } else {
                if (lg.field_n.field_b >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              if (lg.field_n.field_b >= 4) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -14955) {
            dh.a(-41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = "Suggested names: ";
        field_d = new cd("usename");
    }
}
