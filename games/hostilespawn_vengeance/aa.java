/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int field_a;
    static int field_f;
    static java.lang.reflect.Method field_e;
    static String field_c;
    static bd[] field_d;
    static bd field_b;

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_27_0 = 0;
        try {
          L0: {
            if (0 == param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (0 < param1) {
                L1: {
                  var2_int = 1;
                  if (65535 >= param1) {
                    break L1;
                  } else {
                    param1 = param1 >> 16;
                    var2_int += 16;
                    break L1;
                  }
                }
                L2: {
                  if (param1 > 255) {
                    param1 = param1 >> 8;
                    var2_int += 8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1 > 15) {
                    var2_int += 4;
                    param1 = param1 >> 4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 <= 3) {
                    break L4;
                  } else {
                    param1 = param1 >> 2;
                    var2_int += 2;
                    break L4;
                  }
                }
                L5: {
                  if (param1 > 1) {
                    param1 = param1 >> 1;
                    var2_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_24_0 = var2_int;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0;
              } else {
                if (param0 == 4) {
                  L6: {
                    var2_int = 2;
                    if (param1 >= -65536) {
                      break L6;
                    } else {
                      var2_int += 16;
                      param1 = param1 >> 16;
                      break L6;
                    }
                  }
                  L7: {
                    if (param1 < -256) {
                      param1 = param1 >> 8;
                      var2_int += 8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param1 < -16) {
                      var2_int += 4;
                      param1 = param1 >> 4;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param1 < -4) {
                      param1 = param1 >> 2;
                      var2_int += 2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param1 >= -2) {
                      break L10;
                    } else {
                      param1 = param1 >> 1;
                      var2_int++;
                      break L10;
                    }
                  }
                  stackOut_45_0 = var2_int;
                  stackIn_46_0 = stackOut_45_0;
                  break L0;
                } else {
                  stackOut_27_0 = 63;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "aa.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_46_0;
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (rf.a(true, param0)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (param1 == 108) {
                    break L1;
                  } else {
                    int discarded$2 = aa.a(94, -75);
                    break L1;
                  }
                }
                L2: {
                  if (45 == param0) {
                    break L2;
                  } else {
                    if (param0 == 160) {
                      break L2;
                    } else {
                      if (param0 == 32) {
                        break L2;
                      } else {
                        if (param0 == 95) {
                          break L2;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackOut_23_0 = 1;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "aa.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_26_0 != 0;
    }

    public static void a(byte param0) {
        if (param0 != -104) {
            return;
        }
        try {
            field_b = null;
            field_c = null;
            field_e = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "aa.D(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              qj.a("", param0, (byte) 51);
              if (param1 == 2429) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            o.a((byte) -61, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("aa.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Reach the lift and proceed to the next level.";
    }
}
