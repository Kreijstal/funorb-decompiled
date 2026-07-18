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

    final static java.awt.Frame a(int param0, int param1, int param2, jj param3, int param4) {
        RuntimeException var6 = null;
        cl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        cl[] var10 = null;
        wk var11 = null;
        Object stackIn_22_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
                          stackOut_21_0 = null;
                          stackIn_22_0 = stackOut_21_0;
                          return (java.awt.Frame) (Object) stackIn_22_0;
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
                                if (var7_int == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_g > param1) {
                                    break L4;
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
              var11 = param3.a(param0, param4, 0, param1, 1636602704);
              L5: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) var11.field_d;
                  if (var7 != null) {
                    if (var11.field_b == 2) {
                      br.a(var7, param3, 8);
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return null;
                  }
                } else {
                  um.a(true, 10L);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("oc.A(").append(param0).append(',').append(param1).append(',').append(0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param4 + ',' + 54 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_32_0;
    }

    public static void a() {
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
