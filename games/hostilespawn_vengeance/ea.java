/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    static String[] field_f;
    static int field_c;
    static String[] field_a;
    static float field_d;
    static bd field_e;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              me.a((java.awt.Component) ((Object) param0), 118);
              dc.a((java.awt.Component) ((Object) param0), (byte) 48);
              if (null == h.field_b) {
                break L1;
              } else {
                h.field_b.a((java.awt.Component) ((Object) param0), (byte) 86);
                break L1;
              }
            }
            if (param1 == 0) {
              break L0;
            } else {
              var3 = (java.awt.Canvas) null;
              ea.a((java.awt.Canvas) null, 44);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ea.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(nj.field_c);
            if (param0 != 1) {
                java.awt.Component var3 = (java.awt.Component) null;
                ea.a(-106, (java.awt.Component) null);
            }
            param1.removeFocusListener(nj.field_c);
            uc.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ea.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jd param0, int param1, int param2) {
        en var7 = null;
        en var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        try {
            var7 = s.field_b;
            var8 = var7;
            var8.i(19319, param1);
            var8.field_i = var8.field_i + 1;
            var4 = var8.field_i;
            var8.d(103, 1);
            var8.a((byte) -121, param0.field_u);
            var8.a((byte) -126, param0.field_t);
            var8.a((byte) -127, param0.field_j);
            var8.b(param0.field_r, 25251);
            var8.b(param0.field_n, 25251);
            var8.b(param0.field_p, 25251);
            var8.b(param0.field_m, 25251);
            var8.d(119, param0.field_w.length);
            for (var5 = 0; param0.field_w.length > var5; var5++) {
                var7.b(param0.field_w[var5], 25251);
            }
            var8.f(var4, 108);
            if (param2 <= 33) {
                field_e = (bd) null;
            }
            var8.a(var8.field_i - var4, -19720);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Get to the lift before the charges detonate!";
        field_d = 0.0f;
    }
}
