/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oi {
    static he field_h;
    static he[] field_a;
    static double[] field_b;
    static nh field_d;
    static he[] field_g;
    static boolean field_c;
    static bl field_e;
    static he field_f;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param1 == 1) {
          L0: {
            L1: {
              var2 = 0;
              if ((param0 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 >= 65536) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = param0 >>> 16;
            var2 += 16;
            break L0;
          }
          L2: {
            if (param0 < 256) {
              break L2;
            } else {
              var2 += 8;
              param0 = param0 >>> 8;
              break L2;
            }
          }
          L3: {
            if (16 > param0) {
              break L3;
            } else {
              var2 += 4;
              param0 = param0 >>> 4;
              break L3;
            }
          }
          L4: {
            if (param0 < 4) {
              break L4;
            } else {
              param0 = param0 >>> 2;
              var2 += 2;
              break L4;
            }
          }
          L5: {
            if (param0 >= 1) {
              var2++;
              param0 = param0 >>> 1;
              break L5;
            } else {
              break L5;
            }
          }
          return param0 + var2;
        } else {
          return 85;
        }
    }

    final static int a(a param0, a param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -85) {
                break L1;
              } else {
                oi.a((byte) -77);
                break L1;
              }
            }
            stackOut_2_0 = pj.a((String) null, 0, param0, param1, param2 + 85, 0, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("oi.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var2 = 0;
            IOException var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (p.field_a != null) {
                    p.field_a.a((byte) -82);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (pd.field_d == null) {
                    break L2;
                  } else {
                    pd.field_d.a((byte) 104);
                    break L2;
                  }
                }
                L3: {
                  var1_int = 35 / ((param0 - -45) / 48);
                  if (null == uj.field_h) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        uj.field_h.a(-126);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (rc.field_d == null) {
                    break L6;
                  } else {
                    var2 = 0;
                    L7: while (true) {
                      if (rc.field_d.length <= var2) {
                        break L6;
                      } else {
                        if (rc.field_d[var2] != null) {
                          try {
                            L8: {
                              rc.field_d[var2].a(-104);
                              break L8;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L9: {
                              var3 = (IOException) (Object) decompiledCaughtException;
                              break L9;
                            }
                          }
                          var2++;
                          continue L7;
                        } else {
                          var2++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ie.a((Throwable) ((Object) var1), "oi.H(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 86) {
            return;
        }
        field_f = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    final static boolean a(int param0, String param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1.length()) {
                if (param0 == 8975) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$2 = oi.a(-35, (byte) 4);
                  return false;
                }
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (ug.a(-1, (char) var3)) {
                    break L2;
                  } else {
                    if (!lb.a((char) var3, true)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("oi.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_b = new double[]{1.5, 5.0, 2.5, 3.0, 3.0, 2.0, 1.0, 2.5, 4.5, 3.0, 1.5, 2.0, 1.0, 1.5, 1.5, 3.0, 3.0, 2.0, 5.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 5.0, 5.0, 2.5, 1.5, 5.0, 4.5, 1.0, 1.0, 1.0, 5.0, 1.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        field_c = false;
    }
}
