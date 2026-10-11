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
        nn var1 = (nn) (ag.field_b.d((byte) 92));
        if (var1 == null) {
          var1 = new nn();
        }
        if (param0 < -12) {
          var1.a(bi.field_d, bi.field_c, bi.field_f, bi.field_i, bi.field_l, -550, bi.field_j, bi.field_e);
          gi.field_v.a(var1, false);
          return;
        }
    }

    final static void a(int param0) {
        if (!kg.h(0)) {
          return;
        }
        if (param0 >= 64) {
          bl.a(false, 4, -30962);
          return;
        }
        tg.a((byte) -2);
        bl.a(false, 4, -30962);
    }

    final static void a(int param0, cr param1) {
        cr var4 = null;
        cr var5 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = (cr) (param1.field_M.a((byte) 100));
          cr var2 = var4;
          while (var4 != null) {
            var4.field_kb = 0;
            var4.field_N = 0;
            var4.field_L = 0;
            var4.field_db = 0;
            var5 = (cr) (param1.field_M.b(95));
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = uh.field_Wb;
          var3.j(param0, 120);
          var3.f(param1.field_w, param2 + 96);
          var3.f(param1.field_n, 103);
          if (param2 == 0) {
            return;
          }
          field_e = -11;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("tg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
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
