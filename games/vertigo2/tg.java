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
          var1 = (nn) ((Object) ag.field_b.d((byte) 92));
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
          gi.field_v.a(var1, false);
          return;
        }
    }

    final static void a(int param0) {
        if (!kg.h(0)) {
          return;
        } else {
          if (param0 < 64) {
            tg.a((byte) -2);
            bl.a(false, 4, -30962);
            return;
          } else {
            bl.a(false, 4, -30962);
            return;
          }
        }
    }

    final static void a(int param0, cr param1) {
        cr var4 = null;
        cr var5 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        try {
            var4 = (cr) ((Object) param1.field_M.a((byte) 100));
            cr var2 = var4;
            while (var4 != null) {
                var4.field_kb = 0;
                var4.field_N = 0;
                var4.field_L = 0;
                var4.field_db = 0;
                var5 = (cr) ((Object) param1.field_M.b(95));
                var5 = var5;
            }
            param1.field_kb = 0;
            param1.field_L = 0;
            param1.field_db = param0;
            param1.field_N = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ri param1, int param2) {
        mi var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = uh.field_Wb;
            var3.j(param0, 120);
            var3.f(param1.field_w, param2 + 96);
            var3.f(param1.field_n, 103);
            if (param2 == 0) {
              break L0;
            } else {
              field_e = -11;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("tg.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tg.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    tg(java.awt.Component param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tg.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 4) {
            field_f = 1.7799608967568306;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_d = "You must play <%1> more rated games before playing with the current options.";
        field_e = 256;
        field_c = new ve(11, 0, 1, 2);
        field_f = 65536.0;
    }
}
