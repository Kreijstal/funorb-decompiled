/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class kl {
    static bn[] field_k;
    private int field_d;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_b;
    private o[] field_e;
    static String field_g;
    static String field_l;
    static int[] field_h;
    private o field_c;
    private o field_j;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_8_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_11_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (!param1.equals((Object) (Object) "B")) {
              if (!param1.equals((Object) (Object) "I")) {
                if (param1.equals((Object) (Object) "S")) {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (!param1.equals((Object) (Object) "J")) {
                    if (param1.equals((Object) (Object) "Z")) {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (!param1.equals((Object) (Object) "F")) {
                        if (param1.equals((Object) (Object) "D")) {
                          stackOut_22_0 = Double.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          field_g = null;
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_26_0 = Character.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        }
                      } else {
                        stackOut_18_0 = Float.TYPE;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  } else {
                    stackOut_11_0 = Long.TYPE;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = Integer.TYPE;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("kl.B(").append(0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    final void a(int param0, long param1, o param2) {
        o var5 = null;
        try {
            if (param2.field_c != null) {
                param2.c(-2193);
            }
            var5 = ((kl) this).field_e[(int)((long)(-1 + ((kl) this).field_b) & param1)];
            param2.field_h = var5;
            param2.field_c = var5.field_c;
            param2.field_c.field_h = param2;
            param2.field_e = param1;
            param2.field_h.field_c = param2;
            int var6 = -127 % ((-35 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kl.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final o a(int param0, long param1) {
        o var6 = null;
        int var7 = Chess.field_G;
        o var4 = ((kl) this).field_e[(int)((long)(((kl) this).field_b + -1) & param1)];
        ((kl) this).field_j = var4.field_h;
        int var5 = 101 / ((-50 - param0) / 58);
        while (((kl) this).field_j != var4) {
            if (~param1 == ~((kl) this).field_j.field_e) {
                var6 = ((kl) this).field_j;
                ((kl) this).field_j = ((kl) this).field_j.field_h;
                return var6;
            }
            ((kl) this).field_j = ((kl) this).field_j.field_h;
        }
        ((kl) this).field_j = null;
        return null;
    }

    final static void a(java.awt.Canvas param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            ol.a((java.awt.Component) (Object) param0, 20);
            L1: {
              uj.a(0, (java.awt.Component) (Object) param0);
              if (ii.field_L != null) {
                ii.field_L.a((java.awt.Component) (Object) param0, 2);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("kl.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -114 + ')');
        }
    }

    final o b(byte param0) {
        int var3 = 0;
        o var4 = null;
        o var5 = null;
        o var8 = null;
        var3 = Chess.field_G;
        if (0 < ((kl) this).field_d) {
          if (((kl) this).field_e[((kl) this).field_d + -1] != ((kl) this).field_c) {
            var8 = ((kl) this).field_c;
            ((kl) this).field_c = var8.field_h;
            return var8;
          } else {
            L0: while (true) {
              if (((kl) this).field_b <= ((kl) this).field_d) {
                if (param0 < 64) {
                  return null;
                } else {
                  return null;
                }
              } else {
                int fieldTemp$2 = ((kl) this).field_d;
                ((kl) this).field_d = ((kl) this).field_d + 1;
                var5 = ((kl) this).field_e[fieldTemp$2].field_h;
                if (((kl) this).field_e[-1 + ((kl) this).field_d] != var5) {
                  ((kl) this).field_c = var5.field_h;
                  return var5;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((kl) this).field_b <= ((kl) this).field_d) {
              if (param0 < 64) {
                return null;
              } else {
                return null;
              }
            } else {
              int fieldTemp$3 = ((kl) this).field_d;
              ((kl) this).field_d = ((kl) this).field_d + 1;
              var4 = ((kl) this).field_e[fieldTemp$3].field_h;
              if (((kl) this).field_e[-1 + ((kl) this).field_d] != var4) {
                ((kl) this).field_c = var4.field_h;
                return var4;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    public static void a() {
        field_k = null;
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_a = null;
    }

    final o a(boolean param0) {
        ((kl) this).field_d = 0;
        if (!param0) {
            o discarded$0 = ((kl) this).a(-106, 109L);
            return ((kl) this).b((byte) 88);
        }
        return ((kl) this).b((byte) 88);
    }

    kl(int param0) {
        int var2 = 0;
        o var3 = null;
        ((kl) this).field_d = 0;
        ((kl) this).field_e = new o[param0];
        ((kl) this).field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            o dupTemp$2 = new o();
            var3 = dupTemp$2;
            ((kl) this).field_e[var2] = dupTemp$2;
            var3.field_c = var3;
            var3.field_h = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "%D";
        field_k = new bn[7];
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Return to lobby";
        field_h = new int[128];
        field_l = "White wins!";
    }
}
