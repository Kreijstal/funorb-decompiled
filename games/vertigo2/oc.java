/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends li {
    int field_p;
    int[] field_u;
    int[] field_y;
    wk[] field_t;
    static cc field_s;
    static cr field_v;
    static String field_x;
    byte[][][] field_q;
    int[] field_o;
    int field_n;
    static r field_r;
    wk[] field_w;

    final static boolean a(char param0, byte param1) {
        if (param1 <= -87) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_v = null;
          if (param0 >= 65) {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, jj param3, int param4, int param5) {
        RuntimeException var6 = null;
        cl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        cl[] var10 = null;
        wk var11 = null;
        Object stackIn_25_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_24_0 = null;
        Object stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param3.a(-124)) {
              L1: {
                if (param1 != 0) {
                  break L1;
                } else {
                  var10 = an.a(8315, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_24_0 = null;
                          stackIn_25_0 = stackOut_24_0;
                          return (java.awt.Frame) (Object) stackIn_25_0;
                        }
                      } else {
                        L3: {
                          if (param4 != var10[var8].field_b) {
                            var8++;
                            break L3;
                          } else {
                            if (param0 != var10[var8].field_a) {
                              var8++;
                              break L3;
                            } else {
                              L4: {
                                if (0 == param2) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_e != param2) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_g > param1) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param1 = var10[var8].field_g;
                              var7_int = 1;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var11 = param3.a(param0, param4, param2, param1, 1636602704);
              L6: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) var11.field_d;
                  if (var7 != null) {
                    if (var11.field_b == 2) {
                      br.a(var7, param3, 8);
                      stackOut_34_0 = null;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return null;
                  }
                } else {
                  um.a(true, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var6;
            stackOut_36_1 = new StringBuilder().append("oc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param4 + 44 + 54 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_35_0;
    }

    public static void a(int param0) {
        field_x = null;
        field_v = null;
        field_s = null;
        field_r = null;
    }

    oc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Please log in to access this feature.";
    }
}
