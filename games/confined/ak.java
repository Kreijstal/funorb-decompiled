/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ga implements el {
    private String[] field_H;
    private rg[] field_Q;
    static String field_P;
    static String[] field_L;
    static String field_O;
    private pg field_R;

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param0 <= 68) {
            return;
          }
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (this.field_Q[var6_int] == param3) {
              this.field_R.a(11579568, this.field_H[var6_int]);
            }
          }
          if (this.field_Q[this.field_H.length] != param3) {
            return;
          }
          this.field_R.a((byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ak.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        hk var4 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          this.field_N.e(31);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_H = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_H[var4_int] = am.a(72, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new hk(gm.field_cb, 0, 1);
            this.field_Q = new rg[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_Q[var5] = new rg(this.field_H[var5], (uk) (this));
              this.field_Q[var5].field_n = (fe) ((Object) var4);
              this.field_Q[var5].field_C = field_O;
              this.field_Q[var5].a(-125, 80, 20 + 16 * var5, 15, 0);
              this.b(this.field_Q[var5], 10);
            }
            this.field_Q[var3_int] = new rg(eh.field_A, (uk) (this));
            this.field_Q[var3_int].field_n = (fe) ((Object) var4);
            if (param0 > -126) {
              field_L = (String[]) null;
            }
            this.field_Q[var3_int].a(-114, 100, 20 + (var3_int + 1) * 16, 15, 0);
            this.b(this.field_Q[var3_int], 10);
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ak.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -101 / ((47 - param1) / 43);
          if (super.a(param0, (byte) 99, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.c(param0, 32);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.a(17731, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ak.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void j(int param0) {
        int var1 = -100 / ((param0 + 50) / 48);
        field_L = null;
        field_P = null;
        field_O = null;
    }

    ak(pg param0) {
        super(0, 0, 0, 0, (fe) null);
        try {
          this.field_R = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(double param0, double[] param1, dj param2, int param3, oi param4, mn param5) {
        double var7_double = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        try {
          if (param3 != 4825) {
            mn var15 = (mn) null;
            ak.a(1.1248923326487368, (double[]) null, (dj) null, -35, (oi) null, (mn) null);
          }
          var7_double = param2.field_E + param2.field_C * param1[9];
          var9 = param2.field_C * param1[10] + param2.field_t;
          var11 = param2.field_D + param2.field_C * param1[11];
          param4.field_p = var11;
          var13 = param0 * 0.4;
          param4.field_o = var9;
          param4.field_t = var7_double;
          param4.field_u = var13 * 25.0;
          param5.a((rk) (param4), (byte) -65);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ak.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ok var5 = null;
        ok var5Lifetime1;
        super.a(param0, param1, (byte) 97, param3);
        if (param2 < 36) {
          field_O = (String) null;
          if (param1 == 0) {
            var5 = gm.field_cb;
            if (this.field_H != null) {
              var5.a(qd.field_a, this.field_q + param3, this.field_m + param0, this.field_F, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_D);
            }
            return;
          }
          return;
        }
        if (param1 == 0) {
          var5Lifetime1 = gm.field_cb;
          if (this.field_H != null) {
            var5Lifetime1.a(qd.field_a, this.field_q + param3, this.field_m + param0, this.field_F, 20, 16777215, -1, 0, 0, var5Lifetime1.field_C + var5Lifetime1.field_D);
          }
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(tf.field_a);
          param1.removeMouseMotionListener(tf.field_a);
          param1.removeFocusListener(tf.field_a);
          pe.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ak.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_P = "Loading models";
        field_L = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_O = "Use this alternative as your account name";
    }
}
