/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends fd {
    String field_nb;
    static int field_pb;
    static int field_sb;
    static ta field_qb;
    static volatile boolean field_rb;
    int field_tb;
    String field_ob;

    public static void b() {
        field_qb = null;
    }

    final static l a(byte param0, int param1, int param2, int param3, int param4, vf param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        l var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        l stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_6_0 = null;
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
            int discarded$4 = 0;
            var8 = pk.a((byte) 72, 0, param1, param3, param5);
            var6 = var8;
            if (param0 < -70) {
              if (var8 != null) {
                var7 = new l();
                var7.field_d = var8;
                java.awt.Component discarded$5 = var7.field_d.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param1, param3);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                stackOut_6_0 = (l) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (l) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (l) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("pe.C(").append(param0).append(44).append(param1).append(44).append(0).append(44).append(param3).append(44).append(0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(vf param0, int param1, int param2, byte param3, boolean param4, java.awt.Component param5, di param6) {
        try {
            fj.a(22050, true, 10);
            mj.field_o = fj.a(param0, param5, 0, 22050);
            im.field_b = fj.a(param0, param5, 1, 512);
            hj.field_f = new hg();
            mj.field_p = 23;
            im.field_b.b((um) (Object) hj.field_f);
            km.field_a = param6;
            km.field_a.a((byte) -127, ee.field_J);
            mj.field_o.b((um) (Object) km.field_a);
            int var8_int = 0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "pe.A(" + (param0 != null ? "{...}" : "null") + 44 + 22050 + 44 + 512 + 44 + -124 + 44 + 1 + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + 22050 + 41);
        }
    }

    pe() {
        super(0L, (fd) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = 0;
        field_rb = true;
    }
}
