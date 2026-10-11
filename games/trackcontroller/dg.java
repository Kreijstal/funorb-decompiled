/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends al {
    private qj[] field_Q;
    private qj field_G;
    private int field_F;
    private int field_K;
    static be field_H;
    private qj field_R;
    private int field_P;
    boolean field_C;
    private qj field_O;
    private int field_D;
    private int field_I;
    private int field_M;
    int field_J;
    static java.awt.Color field_E;
    static boolean field_B;

    final void a(int param0, int param1, byte param2) {
        this.field_F = (16711422 & param0) >> 1;
        this.field_I = param1;
        this.field_D = param0;
        if (param2 == -33) {
          this.field_P = (16711422 & param1) >> 1;
          this.i(param2 - 22471);
          return;
        }
    }

    private final qj b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TrackController.field_F ? 1 : 0;
        int var2 = this.field_u >> 1;
        qj var3 = new qj(var2, this.field_u);
        int var4Lifetime1;
        int var5Lifetime1;
        double var6Lifetime1;
        int var8Lifetime1;
        mb.a((byte) -18, var3);
        if (param0) {
          for (var4 = 0; this.field_u > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
              var6 = (double)var5 * (double)var5 / (double)((this.field_u - var4) * var4);
              var8 = 1;
              if (var6 < 1.0) {
                var6 = Math.sqrt(-var6 + 1.0);
                var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
              }
              ll.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
          }
          ch.m(96);
          return var3;
        }
        qj discarded$0 = this.a(73, true, -4);
        for (var4Lifetime1 = 0; this.field_u > var4Lifetime1; var4Lifetime1++) {
          for (var5Lifetime1 = 0; var2 > var5Lifetime1; var5Lifetime1++) {
            var6Lifetime1 = (double)var5Lifetime1 * (double)var5Lifetime1 / (double)((this.field_u - var4Lifetime1) * var4Lifetime1);
            var8Lifetime1 = 1;
            if (var6Lifetime1 < 1.0) {
              var6Lifetime1 = Math.sqrt(-var6Lifetime1 + 1.0);
              var8Lifetime1 = !(1.0 <= var6Lifetime1) ? (int)(255.0 * var6Lifetime1) : 255;
            }
            ll.a(var5Lifetime1, var4Lifetime1, var8Lifetime1 | var8Lifetime1 << 8 | var8Lifetime1 << 16);
          }
        }
        ch.m(96);
        return var3;
    }

    public static void a(byte param0) {
        int var1 = -59 / ((param0 + 33) / 41);
        field_H = null;
        field_E = null;
    }

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, param6 >> 1 & 8355711);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != 29221) {
          this.a(-117, 48, 62, -30);
        }
        if (param0 == 0) {
          var5 = this.field_p + param1;
          var6 = this.field_m + param2;
          this.a(this.field_Q[0], -86, var5, var6);
          if (this.field_J < 65536) {
            mb.a(var5 + (this.field_x * this.field_J >> 16), var6, var6 + this.field_u, (byte) -41, this.field_x + var5);
            this.a(this.field_Q[1], -70, var5, var6);
            ch.m(param3 ^ -29281);
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-22504);
    }

    private final void a(qj param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 >= -41) {
            return;
          }
          var5_int = this.field_x + param2;
          mb.a(param2 + this.field_O.field_t, param3, param3 + this.field_u, (byte) -103, var5_int - this.field_O.field_t);
          for (var6 = -this.field_M + param2; var5_int > var6; var6 = var6 + param0.field_t) {
            param0.e(var6, param3);
          }
          ch.m(40);
          if (ll.field_a <= param2 + this.field_O.field_t) {
            mb.a((byte) -72, this.field_G);
            param0.e(-this.field_M, 0);
            param0.e(2 * this.field_K - this.field_M, 0);
            this.field_R.c(0, 0);
            ch.m(53);
            this.field_G.e(param2, param3);
          }
          if (var5_int - this.field_O.field_t > ll.field_e) {
            return;
          }
          mb.a((byte) -57, this.field_G);
          for (var7 = this.field_x - this.field_O.field_t + this.field_M; var7 > this.field_K * 2; var7 = var7 - this.field_K * 2) {
          }
          param0.e(-var7, 0);
          param0.e(-var7 + this.field_K * 2, 0);
          this.field_O.c(0, 0);
          ch.m(-122);
          this.field_G.e(var5_int - this.field_O.field_t, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("dg.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final qj a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TrackController.field_F ? 1 : 0;
        qj var14 = new qj(2 * this.field_K, this.field_u);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param1) {
          mb.a((byte) -72, var14);
          var5 = this.field_u >> 1;
          for (var6 = 0; this.field_u > var6; var6++) {
            var7 = (var6 >> 1) * (-1 + 2 * this.field_K) % (this.field_K * 2);
            var8 = param2 & 16711935;
            var9 = 65280 & param2;
            var10 = var6 - var5;
            var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
            var12 = var11 < 256 ? (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> 8 : var8 | var9;
            ll.a(var7, var6, this.field_K, var12);
            var8Lifetime1 = 16711935 & param0;
            ll.a(var7 - this.field_K * 2, var6, this.field_K, var12);
            var9Lifetime1 = param0 & 65280;
            var12Lifetime1 = var11 >= 256 ? var9Lifetime1 | var8Lifetime1 : (16711680 & var9Lifetime1 * var11 | var11 * var8Lifetime1 & -16711936) >>> 8;
            ll.a(var7 + this.field_K, var6, this.field_K, var12Lifetime1);
            ll.a(-this.field_K + var7, var6, this.field_K, var12Lifetime1);
          }
          ch.m(-88);
          return var14;
        }
        return (qj) null;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C) {
            this.field_M = this.field_M + 1;
            if (2 * this.field_K < this.field_M) {
              this.field_M = this.field_M - 2 * this.field_K;
            }
          }
          if (param2 == -124) {
            return;
          }
          this.i(-65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dg.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        if (param0 == -22504) {
          this.field_Q = new qj[]{this.a(this.field_D, true, this.field_I), this.a(this.field_F, true, this.field_P)};
          this.field_O = this.b(true);
          this.field_R = this.field_O.c();
          this.field_G = new qj(this.field_u >> 1, this.field_u);
          return;
        }
    }

    final static qj[] a(boolean param0, int param1, int param2, kk param3) {
        RuntimeException var4 = null;
        kk var5 = null;
        qj[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sk.a(param2, param3, 1, param1)) {
            return null;
          }
          if (param0) {
            var5 = (kk) null;
            dg.a(true, 90, -7, (kk) null);
          }
          stackIn_6_0 = nb.a((byte) -100);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_P = param7;
        this.field_F = param8;
        this.field_D = param6;
        this.field_I = param5;
        this.field_K = param4;
        this.a(param3, -3050, param1, param2, param0);
    }

    static {
        field_E = new java.awt.Color(10040319);
        field_B = false;
    }
}
