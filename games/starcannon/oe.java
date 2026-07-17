/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.Class;

abstract class oe {
    static int[] field_b;
    static int field_a;
    int field_d;
    String field_c;

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(int param0, int param1, rb param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (param1 != 32) {
                var6 = null;
                oe.a(-101, 110, (rb) null, -119, 60);
                param2.a(60, -61);
                break L1;
              } else {
                param2.a(60, -61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("oe.K(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + 60 + 41);
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = StarCannon.field_A;
        var6 = "(" + wc.field_i + " " + hh.field_a + " " + bh.field_d + ") " + vh.field_t;
        if (il.field_g > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (il.field_g > var2) {
              L1: {
                var7 = var1 + 32;
                var3 = 255 & se.field_p.field_f[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 >= 10) {
                  var4 += 55;
                  break L1;
                } else {
                  var4 += 48;
                  break L1;
                }
              }
              L2: {
                var8 = var7 + (char)var4;
                if (var3 < 10) {
                  var3 += 48;
                  break L2;
                } else {
                  var3 += 55;
                  break L2;
                }
              }
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            } else {
              var2 = 0;
              return var1;
            }
          }
        } else {
          var2 = 0;
          return var6;
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_4_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_7_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
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
              stackOut_4_0 = Byte.TYPE;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (!param0.equals((Object) (Object) "S")) {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_17_0 = Boolean.TYPE;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_24_0 = Double.TYPE;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_29_0 = Class.forName(param0);
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          } else {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          }
                        }
                      } else {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  } else {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = Integer.TYPE;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("oe.L(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 41);
        }
        return stackIn_30_0;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 > -56) {
            return null;
        }
        return new java.net.Socket(((oe) this).field_c, ((oe) this).field_d);
    }

    final static i a(int param0, byte[] param1) {
        i var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        i stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        i stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 != null) {
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
            stackOut_8_1 = new StringBuilder().append("oe.J(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static sg c(int param0) {
        if (s.field_i != null) {
          if (param0 != -5671) {
            return null;
          } else {
            return s.field_i;
          }
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
          if (param0 != -5671) {
            return null;
          } else {
            return s.field_i;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 12) {
            String discarded$0 = oe.a(75);
        }
    }

    static {
    }
}
