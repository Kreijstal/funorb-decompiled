/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.Class;
import java.net.Socket;

abstract class oe {
    static int[] field_b;
    static int field_a;
    int field_d;
    String field_c;

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(int param0, int param1, rb param2, int param3, int param4) {
        RuntimeException var5 = null;
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
              param2.a(12, param1 ^ -79);
              param2.c(17, -306);
              param2.c(param3, -306);
              param2.c(param0, -306);
              if (param1 == 32) {
                break L1;
              } else {
                oe.a(-101, 110, (rb) null, -119, 60);
                break L1;
              }
            }
            param2.a(param4, -61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("oe.K(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_21_0 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + wc.field_i + " " + hh.field_a + " " + bh.field_d + ") " + vh.field_t;
                if (il.field_g <= 0) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (il.field_g <= var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & se.field_p.field_f[var2];
                      var4 = var3 >> 890069092;
                      var3 = var3 & 15;
                      stackOut_4_0 = ~var4;
                      stackOut_4_1 = -11;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 <= stackIn_5_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var1_ref = var1_ref + (char)var4;
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 37;
              stackOut_20_1 = (param0 - 3) / 43;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            var2 = stackIn_21_0 % stackIn_21_1;
            stackOut_21_0 = (String) var1_ref;
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "oe.G(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_33_0 = null;
        Class stackIn_36_0 = null;
        Class stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_6_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_38_0 = null;
        Class stackOut_35_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                oe.b(71);
                break L1;
              }
            }
            if (param0.equals((Object) (Object) "B")) {
              stackOut_6_0 = Byte.TYPE;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (!param0.equals((Object) (Object) "S")) {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_23_0 = Boolean.TYPE;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_32_0 = Double.TYPE;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        } else {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_38_0 = Class.forName(param0);
                            stackIn_39_0 = stackOut_38_0;
                            break L0;
                          } else {
                            stackOut_35_0 = Character.TYPE;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0;
                          }
                        }
                      } else {
                        stackOut_26_0 = Float.TYPE;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0;
                      }
                    }
                  } else {
                    stackOut_17_0 = Long.TYPE;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                } else {
                  stackOut_13_0 = Short.TYPE;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                stackOut_9_0 = Integer.TYPE;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("oe.L(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L2;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ')');
        }
        return stackIn_39_0;
    }

    final java.net.Socket b(byte param0) throws IOException {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 <= -56) {
              stackOut_4_0 = new java.net.Socket(((oe) this).field_c, ((oe) this).field_d);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.Socket) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "oe.I(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    final static i a(int param0, byte[] param1) {
        i var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        i stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        i stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (null != param1) {
              var2 = new i(param1, fc.field_d, qd.field_H, gg.field_d, gh.field_C, of.field_g, og.field_c);
              if (param0 == 5) {
                rc.b((byte) 105);
                stackOut_6_0 = (i) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (i) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (i) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("oe.J(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final static sg c(int param0) {
        RuntimeException var1 = null;
        Object stackIn_5_0 = null;
        sg stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (s.field_i != null) {
                break L1;
              } else {
                s.field_i = new sg();
                s.field_i.a((byte) 123, nb.field_c);
                s.field_i.field_u = 0;
                s.field_i.field_m = 4;
                s.field_i.field_h = 7697781;
                s.field_i.field_l = nb.field_b;
                s.field_i.field_g = 5;
                s.field_i.field_s = 2763306;
                s.field_i.field_r = 6;
                s.field_i.field_b = 14;
                break L1;
              }
            }
            if (param0 == -5671) {
              stackOut_6_0 = s.field_i;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (sg) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "oe.M(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != 12) {
                String discarded$0 = oe.a(75);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "oe.H(" + param0 + ')');
        }
    }

    static {
    }
}
