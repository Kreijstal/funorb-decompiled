/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends java.awt.Canvas {
    private java.awt.Component field_b;
    static ve field_c;
    static long field_a;
    static int field_e;
    static String field_d;
    static double field_f;

    final static void a(byte param0) {
        nn var1 = null;
        L0: {
          var1 = (nn) (Object) ag.field_b.d((byte) 92);
          if (var1 == null) {
            var1 = new nn();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -12) {
          return;
        } else {
          var1.a(bi.field_d, bi.field_c, bi.field_f, bi.field_i, bi.field_l, -550, bi.field_j, bi.field_e);
          gi.field_v.a((li) (Object) var1, false);
          return;
        }
    }

    final static void a() {
        if (!(kg.h(0))) {
            return;
        }
        bl.a(false, 4, -30962);
    }

    final static void a(int param0, cr param1) {
        cr var4 = null;
        cr var5 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        try {
            var4 = (cr) (Object) param1.field_M.a((byte) 100);
            cr var2 = var4;
            while (var4 != null) {
                var4.field_kb = 0;
                var4.field_N = 0;
                var4.field_L = 0;
                var4.field_db = 0;
                var5 = (cr) (Object) param1.field_M.b(95);
                var5 = var5;
            }
            param1.field_kb = 0;
            param1.field_L = 0;
            param1.field_db = 0;
            param1.field_N = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tg.C(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, ri param1) {
        mi var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var3 = uh.field_Wb;
          var3.j(7, 120);
          var3.f(param1.field_w, 96);
          var3.f(param1.field_n, 103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("tg.A(").append(7).append(44);
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
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((tg) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tg.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    tg(java.awt.Component param0) {
        try {
            ((tg) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((tg) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tg.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You must play <%1> more rated games before playing with the current options.";
        field_e = 256;
        field_c = new ve(11, 0, 1, 2);
        field_f = 65536.0;
    }
}
