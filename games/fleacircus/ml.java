/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends dk {
    private int field_G;
    private fa field_H;
    static ak field_I;
    private String field_M;
    private int field_L;
    static int field_O;
    private int field_J;
    static wd field_K;
    static long field_P;
    private boolean field_E;
    static String[] field_N;
    static wh field_F;

    ml(int param0, int param1, int param2, int param3, qa param4, boolean param5, int param6, int param7, fa param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ch) null, (kd) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          stackIn_4_1 = (param5);
          this.field_E = stackIn_4_1;
          this.field_J = param7;
          this.field_M = param10;
          this.field_A = param4;
          this.field_L = param6;
          this.field_H = param8;
          this.field_G = param9;
          var12_int = -this.field_J + this.field_L;
          var13 = this.field_H.b(param10, var12_int, this.field_H.field_H) + this.field_J * 2;
          if (param3 < var13) {
            this.a(param0, param2, param1, var13, 80);
          } else {
            var13 = param3;
          }
          if (this.field_E) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_J * 2 + this.field_L;
          }
          var14 = stackIn_10_0;
          this.field_A.a(var14, -this.field_L + (param2 - this.field_J * 3), this.field_J + (var13 - param3 >> 1), -(this.field_J * 2) + param3, 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String g(int param0) {
        int var2 = this.field_A.field_x ? 1 : 0;
        this.field_A.field_x = this.field_x;
        String var3 = this.field_A.g(param0);
        this.field_A.field_x = var2 != 0 ? true : false;
        return var3;
    }

    final static void d(byte param0) {
        if (!ci.field_f) {
          throw new IllegalStateException();
        }
        tb.field_c = true;
        if (param0 > 38) {
          ae.a(false, (byte) 96);
          bh.field_t = 0;
          return;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        hg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          var4 = (hg) (ak.field_d.c((byte) 47));
          while (var4 != null) {
            ec.a(var4, (byte) 30, param0);
            var4 = (hg) (ak.field_d.b((byte) -105));
          }
          if (param1 == 960240129) {
            return;
          }
          field_F = (wh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "ml.AA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        field_K = null;
        if (param0 == 1) {
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        }
        field_P = -1L;
        field_N = null;
        field_I = null;
        field_F = null;
    }

    final static void i(int param0) {
        int var2 = 0;
        ql var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          var3 = (ql) (mi.field_r.c((byte) 47));
          if (param0 >= -36) {
            field_N = (String[]) null;
          }
          while (var3 != null) {
            rd.a(var3, 115, 5);
            var3 = (ql) (mi.field_r.b((byte) -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ml.EA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = param1 + this.field_y;
        int var6 = this.field_z + param0;
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var7 = !this.field_E ? 0 : -(2 * this.field_J) + (this.field_u - this.field_L);
        this.field_H.a(this.field_M, this.field_J + var5 + var7, var6 + this.field_J, -this.field_J + this.field_L, -(2 * this.field_J) + this.field_j, this.field_G, -1, !this.field_E ? 2 : 0, 1, this.field_H.field_H);
    }

    final static void a(int param0, int param1, dd[] param2, int param3, int param4, int param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (param2 != null &&
            0 < param4) {
            var6_int = param2[0].field_x;
            var7 = param2[2].field_x;
            var8 = param2[1].field_x;
            param2[0].e(param0, param3, param5);
            param2[2].e(-var7 + param0 + param4, param3, param5);
            gb.a(ng.field_a);
            gb.g(param0 + var6_int, param3, param0 - (-param4 + var7), param3 + param2[param1].field_r);
            var9 = var6_int + param0;
            var10 = param0 + param4 - var7;
            for (param0 = var9; var10 > param0; param0 = param0 + var8) {
              param2[1].e(param0, param3, param5);
            }
            gb.b(ng.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ml.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_I = new ak();
        field_O = 40;
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_K = new wd();
        field_F = new wh("email");
    }
}
