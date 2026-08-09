/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String field_a;
    static int field_d;
    static int field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            if (param0 != 0) {
                java.awt.Component var3 = (java.awt.Component) null;
                lq.a(-23, (java.awt.Component) null);
            }
            param1.addKeyListener(wd.field_e);
            param1.addFocusListener(wd.field_e);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ki param0, int param1) {
        wb var6 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var6 = new wb(param0.a("", "final_frame.jpg", -1), (java.awt.Component) ((Object) qn.field_f));
            var3 = var6.field_x;
            var4 = var6.field_u;
            kc.j(103);
            if (param1 >= -62) {
                ki var5 = (ki) null;
                lq.a(-58, (String) null, (String) null, (ki) null);
            }
            kh.field_a = new wb(var3, var4 * 3 / 4);
            kh.field_a.d();
            var6.c(0, 0);
            mq.field_a = new wb(var3, var4 + -kh.field_a.field_u);
            mq.field_a.d();
            var6.c(0, -kh.field_a.field_u);
            mq.field_a.field_A = kh.field_a.field_u;
            su.a((byte) 71);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lq.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(int param0, String param1, String param2, ki param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 100) {
              if (!param3.b((byte) 127)) {
                stackIn_6_0 = (String) (param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = param1 + " - " + param3.a(0) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("lq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    static {
        field_b = -1;
        field_a = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "To server list";
    }
}
