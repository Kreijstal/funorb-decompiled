/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends lc implements ki, rc {
    private wd field_H;
    static String field_D;
    static String field_z;
    private sd field_A;
    private vc field_B;
    static String field_F;
    static String[] field_E;

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 6) {
            discarded$1 = this.a(true);
          }
          if (this.field_H != param4) {
            return;
          }
          ck.e((byte) 127);
          this.field_A.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("eb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final String c(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final String a(boolean param0) {
        if (param0) {
          vc var3 = (vc) null;
          this.a((vc) null, (byte) -92, 87, 66);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void b(boolean param0) {
        field_E = null;
        field_D = null;
        if (param0) {
          field_F = null;
          field_z = null;
          return;
        }
        eb.b(false);
        field_F = null;
        field_z = null;
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a((byte) -89, param0);
            return stackIn_6_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param0, 19755);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("eb.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(vc param0, byte param1, int param2, int param3) {
        String discarded$1 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          if (param1 != 125) {
            discarded$1 = this.a(false);
          }
          if (0 == param3) {
            eh.a("terms.ws", (byte) 21);
            return;
          }
          if (1 == param3) {
            eh.a("privacy.ws", (byte) 21);
            return;
          }
          if (param3 != 2) {
            return;
          }
          eh.a("conduct.ws", (byte) 21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("eb.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(qj.field_c);
          if (param1 != -105) {
            field_D = (String) null;
          }
          param0.addFocusListener(qj.field_c);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "eb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    eb(sd param0) {
        super(0, 0, 288, 0, (fc) null);
        String var7 = null;
        int var3 = 0;
        jd var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_A = param0;
          this.field_H = new wd(pc.field_i, (sk) null);
          this.field_H.field_j = (fc) ((Object) new jh());
          var7 = jf.a(pa.field_b, new String[]{this.a(false), this.c(false)}, (byte) -126);
          var3 = 20;
          var4 = new jd(sg.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, sg.field_a.field_s, -1, 2147483647, true);
          this.field_B = new vc(var7, var4);
          this.field_B.field_q = "";
          this.field_B.a(ud.field_b, 0, (byte) 107);
          this.field_B.a(ud.field_b, 1, (byte) 125);
          this.field_B.field_n = (sk) (this);
          this.field_B.field_k = -40 + this.field_k;
          this.field_B.a(var3, (byte) -65, 26, this.field_k - 40);
          var3 = var3 + (15 + this.field_B.field_m);
          this.b(this.field_B, true);
          var5 = 4;
          var6 = 200;
          this.field_H.b(40, 80, var6, -var6 + 300 >> 1, var3);
          this.field_H.field_n = (sk) (this);
          this.b(this.field_H, true);
          this.b(var5 + var3 + 55, 80, 300, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = null;
        field_F = "Accept";
    }
}
