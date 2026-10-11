/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends qm {
    private qb field_F;
    private qb field_D;
    int field_O;
    private qb[] field_N;
    boolean field_I;
    private int field_C;
    private int field_J;
    static aj field_M;
    private int field_G;
    static String field_L;
    private qb field_A;
    static na field_x;
    static int field_H;
    private int field_z;
    static int[] field_B;
    private int field_K;
    private int field_y;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 > -49) {
          this.field_G = 79;
        }
        super.a(param0, param1, param2, param3, -125);
        this.e(-385446591);
    }

    final void b(int param0, boolean param1, int param2) {
        if (!param1) {
          this.a((byte) 89, 89, 4, 126);
        }
        this.field_y = param0;
        this.field_J = (16711422 & param0) >> 1;
        this.field_K = (16711422 & param2) >> 1;
        this.field_C = param2;
        this.e(-385446591);
    }

    final static void g(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        aa var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ko var5_ref_ko = null;
        int[] var6 = null;
        int var8 = 0;
        ab var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != 29) {
            field_x = (na) null;
          }
          var9 = df.field_z;
          var2 = var9.e((byte) 105);
          var3 = var9.e((byte) 89);
          if (var2 == 0) {
            var4 = (aa) (ve.field_o.b(12623));
            if (var4 == null) {
              ka.b(false);
              return;
            }
            var5 = -var9.field_g + fj.field_h;
            var11 = var4.field_g;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.e((byte) -119) << dg.a(768, var7 << 8));
            }
            var4.a(true);
            return;
          }
          if (1 == var2) {
            var4_int = var9.i(-1);
            var5_ref_ko = (ko) (lc.field_j.b(param0 + 12594));
            while (var5_ref_ko != null) {
              if (var5_ref_ko.field_i != var3 ||
                var5_ref_ko.field_l != var4_int) {
                var5_ref_ko = (ko) (lc.field_j.a(param0 - 29));
                continue;
              }
              break;
            }
            if (var5_ref_ko == null) {
              ka.b(false);
              return;
            }
            var5_ref_ko.a(true);
            return;
          }
          jh.a((Throwable) null, "LR1: " + nn.g((byte) -25), (byte) 20);
          ka.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "om.G(" + param0 + ')');
        }
    }

    private final qb a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param1 != -5179) {
          this.field_K = 98;
        }
        qb var14 = new qb(this.field_z * 2, this.field_k);
        fk.a(var14, -23095);
        int var5 = this.field_k >> 1;
        for (var6 = 0; this.field_k > var6; var6++) {
          var7 = (this.field_z * 2 - 1) * (var6 >> 1) % (this.field_z * 2);
          var8 = param2 & 16711935;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
          var12 = var11 >= 256 ? var8 | var9 : (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
          de.f(var7, var6, this.field_z, var12);
          de.f(var7 - 2 * this.field_z, var6, this.field_z, var12);
          var8Lifetime1 = 16711935 & param0;
          var9Lifetime1 = param0 & 65280;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var11 * var9Lifetime1) >>> 8;
          de.f(var7 + this.field_z, var6, this.field_z, var12Lifetime1);
          de.f(-this.field_z + var7, var6, this.field_z, var12Lifetime1);
        }
        oo.c(-15405);
        return var14;
    }

    private final qb a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = this.field_k >> 1;
        qb var3 = new qb(var2, this.field_k);
        fk.a(var3, -23095);
        if (param0 != 1) {
          this.a(-3, -8, -52, -69, 66);
        }
        for (var4 = 0; this.field_k > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_k - var4));
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            de.a(var5, var4, var8 | var8 << 8 | var8 << 16);
          }
        }
        oo.c(-15405);
        return var3;
    }

    final static qb[] a(int param0, int param1, byte param2, eg param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb[] stackIn_5_0 = null;
        qb[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!fc.a(-124, param3, param1, param0)) {
            stackIn_2_0 = null;
            return (qb[]) (stackIn_2_0);
          }
          if (param2 <= -117) {
            stackIn_7_0 = gg.a(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (qb[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("om.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, qb param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 != 0) {
            var9 = (qb) null;
            this.a(-69, 9, (qb) null, -92);
          }
          var5_int = param0 + this.field_v;
          da.a(-this.field_D.field_q + var5_int, this.field_k + param1, 122, this.field_D.field_q + param0, param1);
          for (var6 = param0 - this.field_G; var6 < var5_int; var6 = var6 + param2.field_q) {
            param2.c(var6, param1);
          }
          oo.c(-15405);
          if (de.field_i <= this.field_D.field_q + param0) {
            fk.a(this.field_A, -23095);
            param2.c(-this.field_G, 0);
            param2.c(-this.field_G + 2 * this.field_z, 0);
            this.field_F.g(0, 0);
            oo.c(param3 - 15405);
            this.field_A.c(param0, param1);
          }
          if (-this.field_D.field_q + var5_int <= de.field_h) {
            fk.a(this.field_A, -23095);
            for (var7 = this.field_G + this.field_v - this.field_D.field_q; var7 > 2 * this.field_z; var7 = var7 - 2 * this.field_z) {
            }
            param2.c(-var7, 0);
            param2.c(this.field_z * 2 - var7, 0);
            this.field_D.g(0, 0);
            oo.c(param3 ^ -15405);
            this.field_A.c(-this.field_D.field_q + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("om.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(int param0) {
        this.field_N = new qb[]{this.a(this.field_y, param0 + 385441412, this.field_C), this.a(this.field_J, -5179, this.field_K)};
        this.field_D = this.a(1);
        if (param0 != -385446591) {
          qb var3 = (qb) null;
          this.a(-100, -38, (qb) null, -12);
        }
        this.field_F = this.field_D.b();
        this.field_A = new qb(this.field_k >> 1, this.field_k);
    }

    public static void a(byte param0) {
        field_M = null;
        if (param0 > -124) {
          return;
        }
        field_L = null;
        field_x = null;
        field_B = null;
    }

    om(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 != param2) {
          return;
        }
        if (param0 > -52) {
          field_H = 20;
        }
        int var5 = param1 + this.field_n;
        int var6 = this.field_j + param3;
        this.a(var5, var6, this.field_N[0], 0);
        if (this.field_O < 65536) {
          da.a(this.field_v + var5, var6 + this.field_k, 122, (this.field_v * this.field_O >> 16) + var5, var6);
          this.a(var5, var6, this.field_N[1], 0);
          oo.c(-15405);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_I) {
            this.field_G = this.field_G + 1;
            if (this.field_G > 2 * this.field_z) {
              this.field_G = this.field_G - 2 * this.field_z;
            }
          }
          if (param2 != 170) {
            this.field_D = (qb) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("om.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private om(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_C = param5;
        this.field_K = param7;
        this.field_J = param8;
        this.field_y = param6;
        this.field_z = param4;
        this.a(param3, param1, param2, param0, -85);
    }

    static {
        field_M = new aj(6, 0, 4, 2);
        field_L = "Minions:";
        field_B = new int[]{73, 74, 75};
        field_H = 500;
    }
}
