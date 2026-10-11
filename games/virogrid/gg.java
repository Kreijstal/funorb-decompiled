/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gg extends fd {
    private je field_L;
    static int[][] field_E;
    static km field_F;
    boolean field_G;
    static String[] field_I;
    static jc field_D;
    static km field_M;
    static String field_N;
    private int field_H;
    static String field_J;
    static ao field_K;

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 == this.field_H) {
          return;
        }
        if (256 <= this.field_H) {
          if (0 != param3) {
            return;
          }
          this.b(param2 + this.field_u, 40, param1 + this.field_l);
          super.a((byte) 37, param1, param2, param3);
          return;
        }
        if (b.field_Eb == null ||
          !(b.field_Eb.field_w >= this.field_g) ||
          !(b.field_Eb.field_p >= this.field_m)) {
          b.field_Eb = new mg(this.field_g, this.field_m);
        }
        kb.a(b.field_Eb, 16865);
        df.c();
        this.b(0, 23, 0);
        super.a(param0, -param1 - this.field_l, -param2 - this.field_u, param3);
        ai.a(true);
        b.field_Eb.a(param1 + this.field_l, this.field_u + param2, this.field_H);
    }

    boolean a(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -67 / ((50 - param0) / 33);
        this.field_H = this.e((byte) 30);
        stackIn_4_0 = (this.field_H == 0) && (!this.field_G);
        return stackIn_4_0;
    }

    public static void g(int param0) {
        field_K = null;
        field_F = null;
        field_I = null;
        field_J = null;
        field_D = null;
        field_E = (int[][]) null;
        if (param0 != -1) {
          CharSequence var2 = (CharSequence) null;
          gg.a((CharSequence) null, 'ﾙ', 7);
        }
        field_N = null;
        field_M = null;
    }

    final fi c(byte param0) {
        fi var2 = super.c(param0);
        if (var2 != null) {
          return var2;
        }
        return (fi) (this);
    }

    private final int e(byte param0) {
        if (param0 < 28) {
          field_I = (String[]) null;
        }
        return !this.field_G ? 0 : this.field_L.c((byte) 51) != this ? 0 : 256;
    }

    boolean f(int param0) {
        int var2;
        int var3;
        boolean stackIn_11_0 = false;
        if (param0 != 3) {
          this.c(8, 89, 62);
        }
        var2 = this.e((byte) 99);
        var3 = -this.field_H + var2;
        if (var3 > 0) {
          this.field_H = this.field_H + (var3 + 7) / 8;
        }
        if (var3 < 0) {
          this.field_H = this.field_H + (-16 + var3 + 1) / 16;
        }
        stackIn_11_0 = (0 == this.field_H) && (var2 == 0) && (!this.field_G);
        return stackIn_11_0;
    }

    final void c(int param0, int param1, int param2) {
        this.a(param0, true, mn.field_a - param0 >> 1, mm.field_i - param2 >> 1, param2);
        if (param1 < 106) {
          field_F = (km) null;
        }
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          var5 = 0;
          if (param2 != 16) {
            var7 = (CharSequence) null;
            gg.a((CharSequence) null, '`', -91);
          }
          while (var5 < var4) {
            if (param0.charAt(var5) == param1) {
              var3_int++;
            }
            var5++;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gg.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, wg param1, boolean param2, int param3) {
        try {
          if (!param2) {
            field_F = (km) null;
          }
          jf.field_o = param1;
          oe.field_f = param0;
          qg.field_w = param3;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gg.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    gg(je param0, int param1, int param2) {
        super(-param1 + mm.field_i >> 1, -param2 + mn.field_a >> 1, param1, param2, (ol) null);
        try {
          this.field_G = false;
          this.field_L = param0;
          this.field_H = 0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        pc.field_b = hc.a(-9986);
        if (param0 != 15810) {
          return;
        }
        jg.field_e = 0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_I = new String[16];
        field_N = "You have won!";
        field_D = new jc(256);
        field_J = "You are on <%0>";
    }
}
