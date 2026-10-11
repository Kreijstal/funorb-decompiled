/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends ng {
    private int field_I;
    static tf field_W;
    private int field_T;
    static tf field_N;
    private tf field_K;
    boolean field_Y;
    private tf field_L;
    private tf field_F;
    private int field_M;
    static de[] field_H;
    static tf field_S;
    private int field_V;
    private int field_Z;
    private int field_R;
    int field_Q;
    private tf[] field_P;
    static boolean field_G;
    static ak field_U;
    static boolean field_J;
    static ak field_O;
    static String field_X;

    private final void d(byte param0) {
        this.field_P = new tf[]{this.a(this.field_Z, this.field_I, (byte) -121), this.a(this.field_V, this.field_T, (byte) -125)};
        if (param0 > 73) {
          this.field_F = this.c(true);
          this.field_K = this.field_F.e();
          this.field_L = new tf(this.field_C >> 1, this.field_C);
          return;
        }
        ng var3 = (ng) null;
        this.a(59, -16, -71, (ng) null);
        this.field_F = this.c(true);
        this.field_K = this.field_F.e();
        this.field_L = new tf(this.field_C >> 1, this.field_C);
    }

    public static void a(byte param0) {
        field_U = null;
        field_H = null;
        if (param0 == -9) {
          field_N = null;
          field_S = null;
          field_O = null;
          field_W = null;
          field_X = null;
          return;
        }
    }

    private final tf c(boolean param0) {
        tf var11 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var2 = this.field_C >> 1;
        int var4Lifetime1;
        int var5Lifetime1;
        double var6Lifetime1;
        int var8Lifetime1;
        if (param0) {
          var11 = new tf(var2, this.field_C);
          h.a(-72, var11);
          for (var4 = 0; this.field_C > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
              var6 = (double)var5 * (double)var5 / (double)((this.field_C - var4) * var4);
              var8 = 1;
              if (var6 < 1.0) {
                var6 = Math.sqrt(-var6 + 1.0);
                var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
              }
              t.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
          }
          ia.a((byte) 92);
          return var11;
        }
        this.a(-24, 16, 122, (byte) -10);
        tf var10 = new tf(var2, this.field_C);
        h.a(-72, var10);
        for (var4Lifetime1 = 0; this.field_C > var4Lifetime1; var4Lifetime1++) {
          for (var5Lifetime1 = 0; var2 > var5Lifetime1; var5Lifetime1++) {
            var6Lifetime1 = (double)var5Lifetime1 * (double)var5Lifetime1 / (double)((this.field_C - var4Lifetime1) * var4Lifetime1);
            var8Lifetime1 = 1;
            if (var6Lifetime1 < 1.0) {
              var6Lifetime1 = Math.sqrt(-var6Lifetime1 + 1.0);
              var8Lifetime1 = !(1.0 <= var6Lifetime1) ? (int)(var6Lifetime1 * 255.0) : 255;
            }
            t.a(var5Lifetime1, var4Lifetime1, var8Lifetime1 << 8 | var8Lifetime1 | var8Lifetime1 << 16);
          }
        }
        ia.a((byte) 92);
        return var10;
    }

    final static void a(te param0, boolean param1) {
        if (!param1) {
          return;
        }
        try {
          bn.field_I.a(param0, (byte) 26);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
          return;
        }
        int var5 = 19 % ((param3 - 70) / 49);
        int var6 = this.field_z + param2;
        int var7 = this.field_p + param0;
        this.a(this.field_P[0], 1177347297, var6, var7);
        if (65536 <= this.field_Q) {
          return;
        }
        hp.a(var6 + (this.field_E * this.field_Q >> 16), this.field_C + var7, var6 + this.field_E, (byte) -126, var7);
        this.a(this.field_P[1], 1177347297, var6, var7);
        ia.a((byte) 92);
    }

    final void a(byte param0, int param1, int param2) {
        this.field_Z = param1;
        this.field_V = (16711422 & param1) >> 1;
        if (param0 > 87) {
          this.field_I = param2;
          this.field_T = param2 >> 1 & 8355711;
          this.d((byte) 120);
          return;
        }
        field_O = (ak) null;
        this.field_I = param2;
        this.field_T = param2 >> 1 & 8355711;
        this.d((byte) 120);
    }

    final void a(int param0, int param1, int param2, ng param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Y) {
            this.field_R = this.field_R + 1;
            if (2 * this.field_M < this.field_R) {
              this.field_R = this.field_R - this.field_M * 2;
            }
          }
          if (param0 == 40) {
            return;
          }
          this.field_Q = 103;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oc.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 94, param2, param3, param4);
        this.d((byte) 96);
        if (param1 < 19) {
          this.field_M = -109;
        }
    }

    private final tf a(int param0, int param1, byte param2) {
        tf var16 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Pixelate.field_H ? 1 : 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var12Lifetime2;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        if (param2 < -119) {
          var16 = new tf(2 * this.field_M, this.field_C);
          h.a(-66, var16);
          var5 = this.field_C >> 1;
          for (var6 = 0; this.field_C > var6; var6++) {
            var7 = (2 * this.field_M - 1) * (var6 >> 1) % (2 * this.field_M);
            var8 = 16711935 & param0;
            var9 = param0 & 65280;
            var10 = var6 - var5;
            var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
            var12 = 256 <= var11 ? var9 | var8 : (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
            t.b(var7, var6, this.field_M, var12);
            t.b(-(this.field_M * 2) + var7, var6, this.field_M, var12);
            var9Lifetime2 = param1 & 65280;
            var8Lifetime2 = param1 & 16711935;
            var12Lifetime2 = var11 < 256 ? (-16711936 & var8Lifetime2 * var11 | 16711680 & var11 * var9Lifetime2) >>> 8 : var8Lifetime2 | var9Lifetime2;
            t.b(this.field_M + var7, var6, this.field_M, var12Lifetime2);
            t.b(-this.field_M + var7, var6, this.field_M, var12Lifetime2);
          }
          ia.a((byte) 92);
          return var16;
        }
        field_U = (ak) null;
        tf var15 = new tf(2 * this.field_M, this.field_C);
        h.a(-66, var15);
        var5Lifetime1 = this.field_C >> 1;
        for (var6Lifetime1 = 0; this.field_C > var6Lifetime1; var6Lifetime1++) {
          var7Lifetime1 = (2 * this.field_M - 1) * (var6Lifetime1 >> 1) % (2 * this.field_M);
          var8Lifetime1 = 16711935 & param0;
          var9Lifetime1 = param0 & 65280;
          var10Lifetime1 = var6Lifetime1 - var5Lifetime1;
          var11Lifetime1 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10Lifetime1 * var10Lifetime1) + var5Lifetime1 * var5Lifetime1)) / (double)var5Lifetime1));
          var12Lifetime1 = 256 <= var11Lifetime1 ? var9Lifetime1 | var8Lifetime1 : (-16711936 & var8Lifetime1 * var11Lifetime1 | var9Lifetime1 * var11Lifetime1 & 16711680) >>> 8;
          t.b(var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1);
          t.b(-(this.field_M * 2) + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1);
          var9Lifetime1Lifetime1 = param1 & 65280;
          var8Lifetime1Lifetime1 = param1 & 16711935;
          var12Lifetime1Lifetime1 = var11Lifetime1 < 256 ? (-16711936 & var8Lifetime1Lifetime1 * var11Lifetime1 | 16711680 & var11Lifetime1 * var9Lifetime1Lifetime1) >>> 8 : var8Lifetime1Lifetime1 | var9Lifetime1Lifetime1;
          t.b(this.field_M + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1Lifetime1);
          t.b(-this.field_M + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1Lifetime1);
        }
        ia.a((byte) 92);
        return var15;
    }

    private final void a(tf param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = param2 + this.field_E;
          if (param1 != 1177347297) {
            this.field_M = -54;
          }
          hp.a(this.field_F.field_F + param2, this.field_C + param3, var5_int - this.field_F.field_F, (byte) -112, param3);
          for (var6 = param2 - this.field_R; var5_int > var6; var6 = var6 + param0.field_F) {
            param0.b(var6, param3);
          }
          ia.a((byte) 92);
          if (this.field_F.field_F + param2 >= t.field_e) {
            h.a(-122, this.field_L);
            param0.b(-this.field_R, 0);
            param0.b(-this.field_R + this.field_M * 2, 0);
            this.field_K.g(0, 0);
            ia.a((byte) 92);
            this.field_L.b(param2, param3);
          }
          if (-this.field_F.field_F + var5_int > t.field_h) {
            return;
          }
          h.a(param1 - 1177347371, this.field_L);
          for (var7 = this.field_E - (this.field_F.field_F - this.field_R); this.field_M * 2 < var7; var7 = var7 - 2 * this.field_M) {
          }
          param0.b(-var7, 0);
          param0.b(-var7 + this.field_M * 2, 0);
          this.field_F.g(0, 0);
          ia.a((byte) 92);
          this.field_L.b(-this.field_F.field_F + var5_int, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_V = param7;
        this.field_T = param8;
        this.field_Z = param5;
        this.field_I = param6;
        this.field_M = param4;
        this.a(param2, (byte) 33, param1, param0, param3);
    }

    static {
        field_H = new de[18];
        hb.a(true, 127, 0, 590, new int[]{28, 1, 5, 20, 21, 27, 6, 4, 3, 22, 19}, 30, 50);
        hb.a(true, 175, 1, 460, new int[]{2, 20, 21, 27, 5, 9}, 30, 180);
        hb.a(true, 175, 2, 460, new int[]{2, 20, 21, 27, 5, 11, 13}, 30, 180);
        hb.a(true, 175, 4, 460, new int[]{2, 20, 21, 27, 5, 13}, 30, 180);
        hb.a(true, 410, 5, 610, new int[]{23, 8}, 30, 30);
        hb.a(true, 410, 6, 460, new int[]{23, 7}, 30, 180);
        hb.a(true, 420, 7, 460, new int[]{25, 8, 26}, 30, 70);
        hb.a(true, 420, 8, 460, new int[]{8, 23}, 30, 180);
        hb.a(true, 420, 9, 460, new int[]{8, 3}, 30, 180);
        hb.a(true, 260, 10, 460, new int[]{23, 24}, 30, 180);
        hb.a(true, 420, 11, 460, new int[]{7}, 30, 180);
        hb.a(true, 175, 12, 460, new int[]{}, 30, 180);
        hb.a(true, 420, 13, 460, new int[]{33, 34}, 30, 180);
        hb.a(true, 360, 16, 460, new int[]{0, 29, 7}, 30, 180);
        hb.a(true, 420, 17, 460, new int[]{7}, 30, 180);
        hb.a(true, 175, 14, 460, new int[]{}, 30, 180);
        field_S = fi.a(600);
        field_W = fi.a(180);
        field_N = fi.a(300);
        field_X = "Play free version";
    }
}
