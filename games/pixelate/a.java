/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends ch implements vo {
    static pf field_I;
    private pn field_K;
    static java.awt.Font field_L;
    static int[] field_N;
    private String[] field_Q;
    static String field_J;
    static pi field_O;
    private qm[] field_P;
    static String field_M;

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_Q.length; var6_int++) {
            if (this.field_P[var6_int] == param0) {
              this.field_K.a(this.field_Q[var6_int], (byte) -104);
            }
          }
          if (this.field_P[this.field_Q.length] == param0) {
            this.field_K.a((byte) 41);
          }
          if (param2 != 11) {
            this.field_Q = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("a.Q(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 16) {
          a.a(true, -63);
        }
        field_M = null;
        field_N = null;
        field_L = null;
        field_I = null;
        field_J = null;
        field_O = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -79);
        if (param1 != 0) {
          return;
        }
        int var5 = 118 / ((param3 - 70) / 49);
        jl var6 = he.field_d;
        if (null != this.field_Q) {
          var6.a(ok.field_c, param2 + this.field_z, param0 + this.field_p, this.field_E, 20, 16777215, -1, 0, 0, var6.field_w + var6.field_z);
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
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
          if (98 == param0) {
            stackIn_6_0 = this.a(0, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(10, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("a.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (null != ri.field_f &&
          ri.field_f.b(-85, param0)) {
          ri.field_f = null;
        }
        if (param1 <= 56) {
          field_O = (pi) null;
        }
    }

    final static void a(byte param0, int param1) {
        jg.l(84);
        if (param0 >= -103) {
          field_M = (String) null;
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
        ia var4 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_F.e(81);
          if (param1 != null &&
            param1.length != 0) {
            if (param0 >= -83) {
              return;
            }
            var3_int = param1.length;
            this.field_Q = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_Q[var4_int] = ng.a((CharSequence) ((Object) param1[var4_int]), -1).replace(' ', ' ');
            }
            var4 = new ia(he.field_d, 0, 1);
            this.field_P = new qm[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_P[var5] = new qm(this.field_Q[var5], (fn) (this));
              this.field_P[var5].field_y = (eb) ((Object) var4);
              this.field_P[var5].field_l = io.field_a;
              this.field_P[var5].a(80, (byte) 63, 20 + 16 * var5, 0, 15);
              this.b(this.field_P[var5], 80);
            }
            this.field_P[var3_int] = new qm(d.field_d, (fn) (this));
            this.field_P[var3_int].field_y = (eb) ((Object) var4);
            this.field_P[var3_int].a(100, (byte) 102, 16 + (16 * var3_int + 20), 0, 15);
            this.b(this.field_P[var3_int], 80);
            return;
          }
          this.field_Q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("a.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void l(int param0) {
        String var2 = (String) null;
        al.a(nk.field_b, -116, (String) null);
        if (param0 != 20700) {
          a.a((byte) -98, -12);
        }
    }

    a(pn param0) {
        super(0, 0, 0, 0, (eb) null);
        try {
          this.field_K = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new int[4];
        field_J = "Friends";
        field_M = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
