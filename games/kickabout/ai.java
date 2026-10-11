/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends wj implements qu, vh {
    static ut field_E;
    private wi field_I;
    private jn field_B;
    static String field_L;
    static String field_C;
    static hd field_H;
    static up field_G;
    static String[] field_K;
    private lb field_D;
    static int field_J;

    private final String m(int param0) {
        String discarded$0 = null;
        if (param0 != -1522433695) {
          discarded$0 = this.k(13);
          return "</col></u>";
        }
        return "</col></u>";
    }

    public static void l(int param0) {
        field_C = null;
        field_L = null;
        field_E = null;
        if (param0 == 0) {
          field_H = null;
          field_K = null;
          field_G = null;
          return;
        }
        ai.l(122);
        field_H = null;
        field_K = null;
        field_G = null;
    }

    final static boolean a(int param0) {
        int var1 = 61 % ((-62 - param0) / 44);
        if (null == kl.field_h) {
          return false;
        }
        if (kl.field_h.e(0)) {
          return true;
        }
        return false;
    }

    ai(jn param0) {
        super(0, 0, 288, 0, (gj) null);
        String var7 = null;
        int var3 = 0;
        qv var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_B = param0;
          this.field_I = new wi(es.field_g, (jv) null);
          this.field_I.field_r = (gj) ((Object) new op());
          var7 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ov.field_a, new String[]{this.k(107), this.m(-1522433695)});
          var3 = 20;
          var4 = new qv(gf.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, gf.field_a.field_G, -1, 2147483647, true);
          this.field_D = new lb(var7, var4);
          this.field_D.field_u = "";
          this.field_D.a(fa.field_e, 0, 12082);
          this.field_D.a(fa.field_e, 1, 12082);
          this.field_D.field_n = this.field_n - 40;
          this.field_D.field_k = (jv) (this);
          this.field_D.c(-1, -40 + this.field_n, 26, var3);
          var3 = var3 + (15 + this.field_D.field_i);
          this.a(-103, this.field_D);
          var5 = 4;
          var6 = 200;
          this.field_I.a(40, 1, 300 - var6 >> 1, var6, var3);
          this.field_I.field_k = (jv) (this);
          this.a(-43, this.field_I);
          this.a(55 + (var3 + var5), 1, 0, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -122, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.a(param2, (byte) -100);
            return stackIn_7_0;
          }
          if (param3 == 99) {
            stackIn_10_0 = this.b(param2, (byte) 125);
            return stackIn_10_0;
          }
          if (param1 <= -60) {
            return false;
          }
          this.field_B = (jn) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ai.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(lb param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param3 < 7) {
            return;
          }
          if (param2 == 0) {
            rb.a((byte) -51, "terms.ws");
            return;
          }
          if (1 == param2) {
            rb.a((byte) -51, "privacy.ws");
            return;
          }
          if (2 != param2) {
            return;
          }
          rb.a((byte) -51, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ai.VA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 64) {
            this.field_D = (lb) null;
          }
          if (param1 != this.field_I) {
            return;
          }
          oh.a(-124);
          this.field_B.q(-87);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ai.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String k(int param0) {
        if (param0 < 63) {
          lb var3 = (lb) null;
          this.a((lb) null, -77, -73, -3);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static int a(int param0, int param1) {
        int var2 = qr.a(param0, (byte) -1);
        if (ia.field_c) {
          var2 = -var2 + 896;
        }
        if (param1 == 6784) {
          return var2;
        }
        ai.a(121, -36);
        return var2;
    }

    static {
        field_C = "This kit is only available to you.";
        field_L = "Please try again in a few minutes.";
        field_K = new String[]{"Trap Mouse: Off", "Trap Mouse: On"};
    }
}
