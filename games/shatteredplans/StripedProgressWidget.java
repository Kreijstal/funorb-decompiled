/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressWidget extends UiWidget {
    static String field_I;
    static boolean field_B;
    private int field_E;
    private Sprite field_S;
    private Sprite field_R;
    boolean field_L;
    private int field_P;
    static String field_G;
    static String field_D;
    private int field_O;
    private Sprite field_N;
    static int field_M;
    static String field_K;
    private Sprite[] field_z;
    private int field_A;
    static boolean field_Q;
    static int[] field_J;
    int field_y;
    private int field_H;
    private int field_F;

    private final Sprite a(int param0, byte param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = ShatteredPlansClient.field_F ? 1 : 0;
        Sprite var15 = new Sprite(2 * this.field_H, this.field_n);
        int var5 = -87 % ((param1 - 33) / 61);
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        aq.pushSpriteRaster((byte) 83, var15);
        int var6 = this.field_n >> 1;
        for (var7 = 0; var7 < this.field_n; var7++) {
          var8 = (this.field_H * 2 - 1) * (var7 >> 1) % (2 * this.field_H);
          var9 = param0 & 16711935;
          var10 = 65280 & param0;
          var11 = var7 - var6;
          var12 = 128 + (int)(Math.sqrt((double)(-(var11 * var11) + var6 * var6)) / (double)var6 * 128.0);
          var13 = var12 >= 256 ? var9 | var10 : (var12 * var10 & 16711680 | -16711936 & var12 * var9) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var8, var7, this.field_H, var13);
          SoftwareRasterizer.drawHorizontalLine(var8 - this.field_H * 2, var7, this.field_H, var13);
          var10Lifetime1 = 65280 & param2;
          var9Lifetime1 = 16711935 & param2;
          var13Lifetime1 = 256 <= var12 ? var10Lifetime1 | var9Lifetime1 : (16711680 & var12 * var10Lifetime1 | var9Lifetime1 * var12 & -16711936) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var8 + this.field_H, var7, this.field_H, var13Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_H + var8, var7, this.field_H, var13Lifetime1);
        }
        Star.f((byte) 111);
        return var15;
    }

    private final void a(int param0) {
        this.field_z = new Sprite[]{this.a(this.field_E, (byte) 98, this.field_F), this.a(this.field_A, (byte) 124, this.field_O)};
        if (param0 != -907398527) {
          StripedProgressWidget.a((byte) 86, -76, 69);
        }
        this.field_R = this.h(61);
        this.field_N = this.field_R.flippedCopy();
        this.field_S = new Sprite(this.field_n >> 1, this.field_n);
    }

    final static void a(int param0, String param1, int param2, String param3, String param4, int param5) {
        nf var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          var6 = new nf(param0, param3, param2, param4, param1);
          ei.a((byte) 37, var6);
          if (param5 != -16169) {
            StripedProgressWidget.clearStatics(127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("md.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, byte param2, int param3, int param4) {
        super.setBounds(param0, param1, (byte) 107, param3, param4);
        if (param2 <= 99) {
          return;
        }
        this.a(-907398527);
    }

    StripedProgressWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    private final void a(Sprite param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 != -1) {
            this.field_S = (Sprite) null;
          }
          var5_int = param2 + this.field_x;
          BufferedSocket.a(-6187, var5_int - this.field_R.field_z, this.field_n + param1, param1, param2 + this.field_R.field_z);
          for (var6 = -this.field_P + param2; var5_int > var6; var6 = var6 + param0.field_z) {
            param0.draw(var6, param1);
          }
          Star.f((byte) -64);
          if (SoftwareRasterizer.field_i <= param2 + this.field_R.field_z) {
            aq.pushSpriteRaster((byte) -90, this.field_S);
            param0.draw(-this.field_P, 0);
            param0.draw(-this.field_P + this.field_H * 2, 0);
            this.field_N.drawMultiply(0, 0);
            Star.f((byte) -91);
            this.field_S.draw(param2, param1);
          }
          if (SoftwareRasterizer.field_l >= -this.field_R.field_z + var5_int) {
            aq.pushSpriteRaster((byte) 98, this.field_S);
            for (var7 = -this.field_R.field_z + this.field_x + this.field_P; 2 * this.field_H < var7; var7 = var7 - 2 * this.field_H) {
            }
            param0.draw(-var7, 0);
            param0.draw(this.field_H * 2 - var7, 0);
            this.field_R.drawMultiply(0, 0);
            Star.f((byte) 111);
            this.field_S.draw(-this.field_R.field_z + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("md.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_L) {
            this.field_P = this.field_P + 1;
            if (this.field_H * 2 < this.field_P) {
              this.field_P = this.field_P - 2 * this.field_H;
            }
          }
          if (param3 != 91) {
            this.field_E = 61;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("md.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        if (param1 != -11857) {
          UiWidget var7 = (UiWidget) null;
          this.updateHover(-111, -4, (UiWidget) null, (byte) -84);
        }
        int var5 = param3 + this.field_m;
        int var6 = this.field_q + param2;
        this.a(this.field_z[0], var6, var5, -1);
        if (this.field_y < 65536) {
          BufferedSocket.a(-6187, var5 + this.field_x, var6 + this.field_n, var6, var5 + (this.field_y * this.field_x >> 16));
          this.a(this.field_z[1], var6, var5, -1);
          Star.f((byte) -78);
        }
    }

    final static Sprite i(int param0) {
        int var2 = 0;
        int var1 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1Lifetime1;
        Star.field_F = new Sprite(182 - IntrusiveDeque.field_a[0].field_z * 3 / 4, rs.field_Cb.field_J);
        RandomAccessCacheFile.a(param0 - 106);
        Star.field_F.bindAsRenderTarget();
        for (var1 = 1; -1 + Star.field_F.field_w > var1; var1++) {
          var2 = (-var1 + Star.field_F.field_w / 2) * (Star.field_F.field_w / 2 - var1);
          SoftwareRasterizer.drawHorizontalLine(0, var1, Star.field_F.field_z, 328965 * (Star.field_F.field_w / 2 * (Star.field_F.field_w / 2) - var2));
        }
        SoftwareRasterizer.drawHorizontalLine(param0, 0, Star.field_F.field_z, 1052688);
        SoftwareRasterizer.drawHorizontalLine(0, -1 + Star.field_F.field_w, Star.field_F.field_z, 1052688);
        for (var1Lifetime1 = 0; var1Lifetime1 < Star.field_F.field_w; var1Lifetime1++) {
          SoftwareRasterizer.setPixel(-1 + Star.field_F.field_z, var1Lifetime1, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[-1 + (var1Lifetime1 + 1) * Star.field_F.field_z], -114, 128));
        }
        SoftwareRasterizer.setPixel(Star.field_F.field_z - 2, 1, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[Star.field_F.field_z * 2 - 2], -83, 128));
        SoftwareRasterizer.setPixel(Star.field_F.field_z - 3, 1, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[-3 + Star.field_F.field_z * 2], -78, 192));
        SoftwareRasterizer.setPixel(-2 + Star.field_F.field_z, 2, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[-2 + Star.field_F.field_z * 3], -110, 192));
        SoftwareRasterizer.setPixel(Star.field_F.field_z - 2, Star.field_F.field_w - 2, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[Star.field_F.field_z * (Star.field_F.field_w - 1) - 2], param0 - 117, 128));
        SoftwareRasterizer.setPixel(-3 + Star.field_F.field_z, -2 + Star.field_F.field_w, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[-3 + (-1 + Star.field_F.field_w) * Star.field_F.field_z], -125, 192));
        SoftwareRasterizer.setPixel(-2 + Star.field_F.field_z, -3 + Star.field_F.field_w, SolVictoryChecker.blendColours(1052688, Star.field_F.field_B[-2 + Star.field_F.field_z * (-2 + Star.field_F.field_w)], -111, 192));
        OpacityWidget.popLegacyRasterState(param0 + 0);
        return Star.field_F;
    }

    private final Sprite h(int param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = this.field_n >> 1;
        Sprite var3 = new Sprite(var2, this.field_n);
        int var4 = 44 / ((param0 + 16) / 62);
        aq.pushSpriteRaster((byte) -50, var3);
        for (var5 = 0; this.field_n > var5; var5++) {
          for (var6 = 0; var2 > var6; var6++) {
            var7 = (double)var6 * (double)var6 / (double)(var5 * (-var5 + this.field_n));
            var9 = 1;
            if (var7 < 1.0) {
              var7 = Math.sqrt(-var7 + 1.0);
              var9 = !(1.0 <= var7) ? (int)(255.0 * var7) : 255;
            }
            SoftwareRasterizer.setPixel(var6, var5, var9 << 8 | var9 | var9 << 16);
          }
        }
        Star.f((byte) 110);
        return var3;
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        int[] var10 = new int[param2];
        int[] var3 = var10;
        int var4 = 16711935 & param1;
        int var5 = param1 & 65280;
        if (param0 <= 23) {
          String var9 = (String) null;
          StripedProgressWidget.a(27, (String) null, 25, (String) null, (String) null, 0);
        }
        for (var6 = 0; param2 > var6; var6++) {
          var7 = (param2 - var6) * 256 / param2;
          var10[var6] = PrivateChatMessage.intOr(we.intAnd(var7 * var4, -16711936), we.intAnd(16711680, var7 * var5)) >>> 8;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        this.field_F = param0;
        if (param2 != -27855) {
          this.field_O = -4;
        }
        this.field_O = (16711422 & param0) >> 1;
        this.field_A = param1 >> 1 & 8355711;
        this.field_E = param1;
        this.a(-907398527);
    }

    public static void clearStatics(int param0) {
        field_D = null;
        field_K = null;
        int var1 = -58 / ((-52 - param0) / 49);
        field_G = null;
        field_I = null;
        field_J = null;
    }

    private StripedProgressWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_O = param8;
        this.field_E = param5;
        this.field_F = param6;
        this.field_A = param7;
        this.field_H = param4;
        this.setBounds(param1, param3, (byte) 122, param0, param2);
    }

    static {
        field_I = "You do not have a suitable number of players for the current options.";
        field_G = "Showing system collapses.";
        field_K = "Outgoing fleet";
        field_D = "Honour";
        field_J = new int[]{32, 24, 16, 12, 10};
    }
}
