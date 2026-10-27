/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends bj implements sg, qb {
    static Sprite field_H;
    static String field_M;
    static int field_J;
    static String field_K;
    static String field_O;
    private hc field_N;
    private qc field_G;
    static String[] field_I;
    private ue field_L;

    public static void j(int param0) {
        field_K = null;
        field_H = null;
        field_I = null;
        field_O = null;
        if (param0 == 1) {
          field_M = null;
          return;
        }
        jf.l(51);
        field_M = null;
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
          hc var3 = (hc) null;
          this.a((hc) null, -9, -71, 98, 16);
          return "</col></u>";
        }
        return "</col></u>";
    }

    jf(qc param0) {
        super(0, 0, 288, 0, (db) null);
        try {
          this.field_G = param0;
          this.field_N = new hc(bm.field_d, (wn) null);
          this.field_N.field_s = (db) ((Object) new ck());
          String var7 = r.a(mh.field_c, -63, new String[]{this.k(-102), this.a((byte) 126)});
          int var3 = 20;
          k var4 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, sb.field_a.field_r, -1, 2147483647, true);
          this.field_L = new ue(var7, var4);
          this.field_L.field_i = "";
          this.field_L.a(ah.field_m, (byte) 102, 0);
          this.field_L.a(ah.field_m, (byte) 104, 1);
          this.field_L.field_q = (wn) (this);
          this.field_L.field_g = this.field_g - 40;
          this.field_L.b(2463, 26, -40 + this.field_g, var3);
          var3 = var3 + (15 + this.field_L.field_x);
          this.b(this.field_L, false);
          int var5 = 4;
          int var6 = 200;
          this.field_N.a(var6, var3, -var6 + 300 >> 1, true, 40);
          this.field_N.field_q = (wn) (this);
          this.b(this.field_N, false);
          this.a(300, 0, 0, true, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(int param0) {
        if (param0 == 3) {
          return kb.field_d > 250 ? true : false;
        }
        field_M = (String) null;
        return kb.field_d > 250 ? true : false;
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param2 == 0) {
            qd.a(param0 ^ -2849, "terms.ws");
          } else if (1 == param2) {
            qd.a(12, "privacy.ws");
          } else if (param2 == 2) {
            qd.a(12, "conduct.ws");
          }
          if (param0 == -2861) {
            return;
          }
          field_H = (Sprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        String stackIn_17_2 = null;
        try {
          if (super.a(param0, param1, param2, 18)) {
            return true;
          }
          if (param3 <= 0) {
            return false;
          }
          if (98 == param2) {
            boolean stackIn_9_0 = this.a((byte) 22, param0);
            return stackIn_9_0;
          }
          if (param2 != 99) {
            return false;
          }
          boolean stackIn_13_0 = this.a(param0, true);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("jf.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String k(int param0) {
        if (param0 >= -90) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        String stackIn_9_2 = null;
        try {
          if (param3 != 1) {
            ue var7 = (ue) null;
            this.a(-113, (ue) null, -113, -16);
          }
          if (param0 != this.field_N) {
            return;
          }
          sm.b((byte) -125);
          this.field_G.o(-18861);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var6;
          StringBuilder stackIn_8_1 = new StringBuilder().append("jf.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_M = "Level will restart shortly.";
        field_K = "Level: ";
        field_O = "Create a free account to store your progress.";
    }
}
