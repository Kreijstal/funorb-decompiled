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
        if (param0) {
          if (null == qi.field_d) {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          } else {
            return;
          }
        } else {
          field_h = 85;
          if (null != qi.field_d) {
            return;
          } else {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          }
        }
    }

    final static void a(int param0, pn param1, int param2, ic param3, boolean param4, java.awt.Component param5) {
        try {
            int var6_int = -23;
            int discarded$0 = -98;
            int discarded$1 = 1024;
            v.a(22050, true, 22050, param3, param1, param5);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qm.E(" + -31 + 44 + (param1 != null ? "{...}" : "null") + 44 + 22050 + 44 + (param3 != null ? "{...}" : "null") + 44 + 1 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ah var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4 = wi.a(param1, (byte) 122);
              if (var4 == null) {
                break L1;
              } else {
                if (null != var4.field_ac) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (null == nf.field_b) {
                  break L3;
                } else {
                  if (kh.a(false, param2) == null) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("qm.B(").append(-31).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0) {
        if (!(null == ch.field_O)) {
            ch.field_O.m(104);
        }
        nm.field_o = new qc();
        ci.field_a.c((lh) (Object) nm.field_o, -22908735);
    }

    public static void a() {
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
