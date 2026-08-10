/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends wc {
    static boolean field_r;
    static volatile int field_s;
    static ko field_t;

    private aq(vc param0, int param1) {
        super(param0, param1);
    }

    aq(int param0) {
        this(ai.field_h, param0);
    }

    public static void b(int param0) {
        field_t = null;
        if (param0 >= -23) {
            aq.b(51);
        }
    }

    final String d(qm param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              stackIn_4_0 = r.a(true, '*', param0.field_o.length());
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("aq.R(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.addMouseListener(tm.field_b);
            param1.addMouseMotionListener(tm.field_b);
            param1.addFocusListener(tm.field_b);
            if (param0 < 36) {
                java.awt.Component var3 = (java.awt.Component) null;
                aq.a((byte) -118, (java.awt.Component) null);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "aq.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = false;
        field_s = 0;
    }
}
