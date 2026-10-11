/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
        int var6 = 0;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        o var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * this.field_N, this.field_x);
        cl.a(-112, var14);
        var5 = this.field_x >> 1;
        for (var6 = 0; this.field_x > var6; var6++) {
          var7 = (var6 >> 1) * (-1 + 2 * this.field_N) % (2 * this.field_N);
          var8 = param0 & 16711935;
          var9 = param0 & 65280;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
          if (var11 < 256) {
            stackIn_7_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8;
          } else {
            stackIn_7_0 = var8 | var9;
          }
          var12 = stackIn_7_0;
          mi.b(var7, var6, this.field_N, var12);
          var9Lifetime1 = param2 & 65280;
          var8Lifetime1 = param2 & 16711935;
          mi.b(var7 - 2 * this.field_N, var6, this.field_N, var12);
          if (var11 >= 256) {
            stackIn_10_0 = var9Lifetime1 | var8Lifetime1;
          } else {
            stackIn_10_0 = (var9Lifetime1 * var11 & 16711680 | var11 * var8Lifetime1 & -16711936) >>> 8;
          }
          var12Lifetime1 = stackIn_10_0;
          mi.b(this.field_N + var7, var6, this.field_N, var12Lifetime1);
          mi.b(var7 - this.field_N, var6, this.field_N, var12Lifetime1);
        }
        if (param1 != 16711935) {
          this.field_O = 56;
        }
        mf.e(4096);
        return var14;
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        if (param0 != -277997311) {
          field_H = -117;
        }
        this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
        this.field_P = this.a((byte) -119);
        this.field_A = this.field_P.b();
        this.field_G = new o(this.field_x >> 1, this.field_x);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 18874) {
            this.a((byte) -66, -124, 9);
          }
          if (this.field_B) {
            this.field_D = this.field_D + 1;
            if (this.field_N * 2 < this.field_D) {
              this.field_D = this.field_D - this.field_N * 2;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("c.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param1) {
          return;
        }
        int var5 = this.field_m + param2;
        int var6 = param0 + this.field_j;
        this.a(param3, var6, this.field_S[0], var5);
        if (this.field_R < 65536) {
          kf.a((byte) 97, var5 + (this.field_t * this.field_R >> 16), var6, var5 + this.field_t, this.field_x + var6);
          this.a(0, var6, this.field_S[1], var5);
          mf.e(4096);
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        int var6 = 0;
        o discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var5_int = this.field_t + param3;
          kf.a((byte) 97, param3 + this.field_P.field_p, param1, -this.field_P.field_p + var5_int, this.field_x + param1);
          for (var6 = -this.field_D + param3; var5_int > var6; var6 = var6 + param2.field_p) {
            param2.d(var6, param1);
          }
          if (param0 != 0) {
            discarded$0 = this.a((byte) 120);
          }
          mf.e(4096);
          if (mi.field_b <= this.field_P.field_p + param3) {
            cl.a(param0 ^ -100, this.field_G);
            param2.d(-this.field_D, 0);
            param2.d(-this.field_D + 2 * this.field_N, 0);
            this.field_A.g(0, 0);
            mf.e(param0 ^ 4096);
            this.field_G.d(param3, param1);
          }
          if (mi.field_k >= -this.field_P.field_p + var5_int) {
            cl.a(param0 - 119, this.field_G);
            for (var7 = this.field_D + (-this.field_P.field_p + this.field_t); var7 > 2 * this.field_N; var7 = var7 - this.field_N * 2) {
            }
            param2.d(-var7, 0);
            param2.d(-var7 + 2 * this.field_N, 0);
            this.field_P.g(0, 0);
            mf.e(param0 ^ 4096);
            this.field_G.d(-this.field_P.field_p + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_F = (param1 & 16711422) >> 1;
        this.field_I = 8355711 & param2 >> 1;
        this.field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        this.field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -97 % ((param0 + 47) / 39);
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (gb.a(param1, 126)) {
            return true;
          }
          var6 = hh.field_N;
          var2 = var6;
          for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
              return true;
            }
          }
          var2Lifetime1 = qk.field_k;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "c.H(" + param0 + ',' + param1 + ')');
        }
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_I = param7;
        this.field_K = param6;
        this.field_F = param8;
        this.field_O = param5;
        this.field_N = param4;
        this.b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var2 = this.field_x >> 1;
        if (param0 != -119) {
          return (o) null;
        }
        o var3 = new o(var2, this.field_x);
        cl.a(-98, var3);
        for (var4 = 0; this.field_x > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_x));
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            mi.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        mf.e(4096);
        return var3;
    }

    static {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
