/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends fj {
    private int field_Y;
    private nf field_L;
    int field_R;
    private nf[] field_X;
    static long[] field_V;
    private nf field_U;
    private int field_S;
    private int field_I;
    private int field_Z;
    boolean field_N;
    private int field_H;
    private int field_P;
    static long[][] field_T;
    private nf field_K;
    static int field_W;
    static bi field_J;
    static int[] field_M;

    public static void h(byte param0) {
        if (param0 != -20) {
          field_T = (long[][]) null;
        }
        field_M = null;
        field_V = null;
        field_T = (long[][]) null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-119, param1, param2, param3, param4);
        this.g((byte) -111);
        if (param0 >= -109) {
          this.field_Y = 98;
        }
    }

    ib(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, 8355711 & param6 >> 1);
    }

    final static int a(byte param0) {
        if (param0 != 109) {
          return 118;
        }
        if (we.field_c < 2) {
          return 0;
        }
        if (hc.field_m == 0) {
          if (!wc.field_Wb.b(0)) {
            return 20;
          }
          if (!wc.field_Wb.a("commonui", 0)) {
            return 40;
          }
          if (!i.field_r.b(param0 ^ 109)) {
            return 50;
          }
          if (!i.field_r.a("commonui", 0)) {
            return 60;
          }
          if (!tf.field_k.b(0)) {
            return 70;
          }
          if (!tf.field_k.a(25057)) {
            return 80;
          }
        } else {
          if (null != o.field_f) {
            if (!o.field_f.b(param0 ^ 109)) {
              return 14;
            }
            if (!o.field_f.b("", -4308)) {
              return 29;
            }
            if (!o.field_f.a("", 0)) {
              return 29;
            }
          }
          if (!wc.field_Wb.b(param0 - 109)) {
            return 43;
          }
          if (!wc.field_Wb.a("commonui", 0)) {
            return 57;
          }
          if (!i.field_r.b(0)) {
            return 71;
          }
          if (!i.field_r.a("commonui", 0)) {
            return 80;
          }
          if (!tf.field_k.b(0)) {
            return 82;
          }
          if (!tf.field_k.a(param0 + 24948)) {
            return 86;
          }
        }
        return 100;
    }

    final static void b(boolean param0) {
        ud var1 = (ud) (ve.field_b.b((byte) 98));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        fn.a(var1.field_s, var1.field_u, var1.field_m);
        if (param0) {
          field_W = -15;
        }
        fn.h(var1.field_t, var1.field_n, var1.field_r, var1.field_p);
        var1.field_s = null;
        m.field_d.a((rk) (var1), (byte) -108);
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_Y = (param2 & 16711422) >> 1;
        this.field_Z = param0;
        this.field_I = param2;
        this.field_S = (16711422 & param0) >> 1;
        if (param1) {
          return;
        }
        this.g((byte) -127);
    }

    final void a(fj param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_N) {
            this.field_H = this.field_H + 1;
            if (this.field_P * 2 < this.field_H) {
              this.field_H = this.field_H - 2 * this.field_P;
            }
          }
          if (param1 != 11579568) {
            this.g((byte) 88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ib.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final nf b(int param0, byte param1, int param2) {
        nf discarded$0 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Confined.field_J ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param1 > -75) {
          discarded$0 = this.f(-60);
        }
        nf var14 = new nf(2 * this.field_P, this.field_z);
        vm.a(var14, -8409);
        int var5 = this.field_z >> 1;
        for (var6 = 0; this.field_z > var6; var6++) {
          var7 = (2 * this.field_P - 1) * (var6 >> 1) % (2 * this.field_P);
          var8 = 16711935 & param0;
          var9 = 65280 & param0;
          var10 = var6 - var5;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
          var12 = 256 > var11 ? (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 8 : var8 | var9;
          fn.b(var7, var6, this.field_P, var12);
          var9Lifetime1 = param2 & 65280;
          var8Lifetime1 = param2 & 16711935;
          fn.b(var7 - this.field_P * 2, var6, this.field_P, var12);
          var12Lifetime1 = 256 <= var11 ? var8Lifetime1 | var9Lifetime1 : (var11 * var9Lifetime1 & 16711680 | var8Lifetime1 * var11 & -16711936) >>> 8;
          fn.b(this.field_P + var7, var6, this.field_P, var12Lifetime1);
          fn.b(var7 - this.field_P, var6, this.field_P, var12Lifetime1);
        }
        ib.b(false);
        return var14;
    }

    private final void a(byte param0, nf param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var5_int = this.field_F + param2;
          lc.a(param2 + this.field_K.field_u, -this.field_K.field_u + var5_int, param3 + this.field_z, param3, 14907);
          for (var6 = -this.field_H + param2; var6 < var5_int; var6 = var6 + param1.field_u) {
            param1.d(var6, param3);
          }
          var7 = -39 % ((param0 - 61) / 63);
          ib.b(false);
          if (fn.field_c <= this.field_K.field_u + param2) {
            vm.a(this.field_L, -8409);
            param1.d(-this.field_H, 0);
            param1.d(-this.field_H + this.field_P * 2, 0);
            this.field_U.a(0, 0);
            ib.b(false);
            this.field_L.d(param2, param3);
          }
          if (fn.field_i >= var5_int - this.field_K.field_u) {
            vm.a(this.field_L, -8409);
            for (var7Lifetime1 = -this.field_K.field_u + this.field_F + this.field_H; 2 * this.field_P < var7Lifetime1; var7Lifetime1 = var7Lifetime1 - this.field_P * 2) {
            }
            param1.d(-var7Lifetime1, 0);
            param1.d(-var7Lifetime1 + 2 * this.field_P, 0);
            this.field_K.a(0, 0);
            ib.b(false);
            this.field_L.d(var5_int - this.field_K.field_u, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ib.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final nf f(int param0) {
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = Confined.field_J ? 1 : 0;
        int var2 = this.field_z >> 1;
        nf var3 = new nf(var2, this.field_z);
        vm.a(var3, -8409);
        int var4 = 0;
        int var5 = 1 % ((47 - param0) / 59);
        while (this.field_z > var4) {
          for (var6 = 0; var2 > var6; var6++) {
            var7 = (double)var6 * (double)var6 / (double)(var4 * (this.field_z - var4));
            var9 = 1;
            if (var7 < 1.0) {
              var7 = Math.sqrt(-var7 + 1.0);
              var9 = !(1.0 <= var7) ? (int)(255.0 * var7) : 255;
            }
            fn.a(var6, var4, var9 << 16 | (var9 << 8 | var9));
          }
          var4++;
        }
        ib.b(false);
        return var3;
    }

    final static void c(boolean param0) {
        if (ki.field_c != null) {
          ki.field_c.n(10);
        }
        if (param0) {
          return;
        }
        hb.field_u = new bf();
        dn.field_b.a((fj) (hb.field_u), (byte) -72);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != param1) {
          return;
        }
        int var5 = this.field_q + param3;
        int var6 = this.field_m + param0;
        this.a((byte) -80, this.field_X[0], var5, var6);
        if (65536 > this.field_R) {
          lc.a((this.field_F * this.field_R >> 16) + var5, this.field_F + var5, var6 + this.field_z, var6, 14907);
          this.a((byte) 124, this.field_X[1], var5, var6);
          ib.b(false);
        }
        if (param2 <= 36) {
          this.field_I = -41;
        }
    }

    private final void g(byte param0) {
        this.field_X = new nf[]{this.b(this.field_Z, (byte) -81, this.field_I), this.b(this.field_S, (byte) -120, this.field_Y)};
        this.field_K = this.f(124);
        this.field_U = this.field_K.b();
        this.field_L = new nf(this.field_z >> 1, this.field_z);
        if (param0 >= -105) {
          this.field_S = -14;
        }
    }

    private ib(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_P = param4;
        this.field_Y = param8;
        this.field_S = param7;
        this.field_Z = param5;
        this.field_I = param6;
        this.a(-126, param2, param1, param3, param0);
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_V = new long[11];
        field_T = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) == 0 ? (long)(var1 >>> 8) : (long)(var1 & 255);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_T[0][var0] = rk.a(rk.a(rk.a(rk.a(var10 << 24, rk.a(rk.a(rk.a(var2 << 48, var2 << 56), var6 << 40), var2 << 32)), var8 << 16), var4 << 8), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_T[var14][var0] = rk.a(field_T[-1 + var14][var0] >>> 8, field_T[var14 - 1][var0] << 56);
            }
            var0++;
        }
        field_V[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = 8 * (-1 + var15);
            field_V[var15] = pa.a(kd.a(field_T[7][var1 + 7], 255L), pa.a(kd.a(65280L, field_T[6][6 + var1]), pa.a(kd.a(field_T[5][5 + var1], 16711680L), pa.a(pa.a(kd.a(1095216660480L, field_T[3][var1 + 3]), pa.a(kd.a(field_T[2][var1 + 2], 280375465082880L), pa.a(kd.a(71776119061217280L, field_T[1][var1 + 1]), kd.a(field_T[0][var1], -72057594037927936L)))), kd.a(field_T[4][var1 + 4], 4278190080L)))));
            var15++;
        }
        field_W = 49;
        field_M = new int[256];
    }
}
