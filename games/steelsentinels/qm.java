/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ef field_f;
    static String field_c;
    static String field_e;
    static gh field_b;
    static int field_h;
    static String field_g;
    static String field_a;
    static int[] field_d;

    final static void a(boolean param0) {
        if (null == qi.field_d) {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
        }
    }

    final static void a(int param0, pn param1, int param2, ic param3, boolean param4, java.awt.Component param5) {
        try {
            int var6_int = 23 / ((-76 - param0) / 40);
            v.a(param2, param4, param2, param3, param1, param5, 1024, -98);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qm.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ah var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4 = wi.a(param1, (byte) 122);
              if (param0 == -31) {
                break L1;
              } else {
                field_h = 51;
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (null != var4.field_ac) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (null == nf.field_b) {
                  break L4;
                } else {
                  if (kh.a(false, param2) == null) {
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("qm.B(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static void a(int param0) {
        if (!(null == ch.field_O)) {
            ch.field_O.m(104);
        }
        nm.field_o = new qc();
        ci.field_a.c((lh) (Object) nm.field_o, -22908735);
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        int var1 = 3;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ef();
        field_e = "<br><br><col=ffffff>This sentinel uses the following ";
        field_h = -1;
        field_c = "RMB <img=26>: Scroll view";
        field_g = "Show private chat from my friends and opponents";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = new int[]{108, -1, 30, 28, 29, -1, -1, -1, -1, -1, -1};
    }
}
