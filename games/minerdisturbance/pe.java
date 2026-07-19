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

    public static void b(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_qb = null;
    }

    final static l a(byte param0, int param1, int param2, int param3, int param4, vf param5) {
        java.awt.Component discarded$2 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        l var7 = null;
        java.awt.Frame var8 = null;
        l stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        l stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        l stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        l stackOut_1_0 = null;
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
            var8 = pk.a((byte) 72, param4, param1, param3, param5, param2);
            var6 = var8;
            if (param0 < -70) {
              if (var8 != null) {
                var7 = new l();
                var7.field_d = var8;
                discarded$2 = var7.field_d.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param1, param3);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackOut_6_0 = (l) (var7);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (l) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6_ref);
            stackOut_8_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (l) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(vf param0, int param1, int param2, byte param3, boolean param4, java.awt.Component param5, di param6, int param7) {
        try {
            fj.a(param7, param4, 10);
            mj.field_o = fj.a(param0, param5, 0, param1);
            im.field_b = fj.a(param0, param5, 1, param2);
            hj.field_f = new hg();
            mj.field_p = param2 * 1000 / param7;
            im.field_b.b(hj.field_f);
            km.field_a = param6;
            km.field_a.a((byte) -127, ee.field_J);
            mj.field_o.b(km.field_a);
            int var8_int = -122 % ((param3 - -69) / 50);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "pe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    pe() {
        super(0L, (fd) null);
    }

    static {
        field_pb = 0;
        field_rb = true;
    }
}
