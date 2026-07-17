/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String[][] field_b;
    static ci field_c;
    static String field_a;

    final static int a() {
        int var1 = 0;
        ge.field_fb.a(32130);
        if (qh.field_c.b(-31259)) {
            return 0;
        }
        int discarded$0 = 32288;
        return sh.b();
    }

    final static void b() {
        mh.field_d.b();
        kn.field_F.b();
    }

    final static mh a(boolean param0, String param1) {
        RuntimeException var2 = null;
        mh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new mh(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("la.E(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        int var1 = -24;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -103);
        var3.c(3, (byte) 47);
        int var4 = 11 % ((75 - param1) / 50);
        var3.c(10, (byte) -112);
        var3.b(param2, 87);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param1 < 48) {
          if (param1 < 65) {
            L0: {
              if (param1 < 97) {
                break L0;
              } else {
                if (param1 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param1 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param1 < 97) {
                    break L2;
                  } else {
                    if (param1 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param1 > 57) {
            if (param1 >= 65) {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (param1 > 122) {
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
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
