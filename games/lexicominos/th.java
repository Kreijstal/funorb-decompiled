/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wf {
    static int field_m;
    static sh field_u;
    static sh field_p;
    static long field_k;
    private int field_q;
    static int field_r;
    static cc[] field_o;
    private pe field_n;
    static int field_t;
    static db[] field_l;
    static int field_s;

    final int i(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == -76) {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          return this.field_j[fieldTemp$0] - this.field_n.c(0) & 255;
        }
        field_u = (sh) null;
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_j[fieldTemp$1] - this.field_n.c(0) & 255;
    }

    final void f(int param0) {
        this.field_h = (this.field_q + 7) / param0;
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 56) {
            return;
          }
          if (null != bg.field_b) {
            bg.field_b.field_C.a(param1, false);
          }
          if (null == hd.field_a) {
            return;
          }
          hd.field_a.field_F.a(param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("th.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 + this.field_n.c(param1));
    }

    final void e(int param0) {
        if (param0 != 10) {
          return;
        }
        this.field_q = 8 * this.field_h;
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var3 = this.field_q >> 3;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1 != 26527) {
          field_r = 53;
        } else {
          var4 = -(7 & this.field_q) + 8;
          var5 = 0;
          this.field_q = this.field_q + param0;
          while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((bd.field_j[var4] & this.field_j[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (param0 == var4) {
            var5 = var5 + (this.field_j[var3] & bd.field_j[var4]);
          } else {
            var5 = var5 + (this.field_j[var3] >> var4 - param0 & bd.field_j[param0]);
          }
          return var5;
        }
        var4Lifetime1 = -(7 & this.field_q) + 8;
        var5Lifetime1 = 0;
        this.field_q = this.field_q + param0;
        while (param0 > var4Lifetime1) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((bd.field_j[var4Lifetime1] & this.field_j[incrementValue$1]) << -var4Lifetime1 + param0);
          param0 = param0 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (param0 == var4Lifetime1) {
          var5Lifetime1 = var5Lifetime1 + (this.field_j[var3] & bd.field_j[var4Lifetime1]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.field_j[var3] >> var4Lifetime1 - param0 & bd.field_j[param0]);
        }
        return var5Lifetime1;
    }

    th(byte[] param0) {
        super(param0);
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            stackIn_4_0 = ti.a(param2, param0, 18, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = 116;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("th.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_l = null;
        field_u = null;
        field_o = null;
        field_p = null;
        int var1 = -42 % ((-6 - param0) / 50);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = -69 % ((-4 - param2) / 32);
          for (var6 = 0; param0 > var6; var6++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            param3[var6 + param1] = (byte)(this.field_j[fieldTemp$0] - this.field_n.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("th.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1) {
        try {
          int var3_int = 18 / ((param1 + 36) / 50);
          this.field_n = new pe(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "th.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    th(int param0) {
        super(param0);
    }

    static {
        field_o = new cc[10];
    }
}
