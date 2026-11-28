/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends UiWidget {
    private int field_L;
    private int field_M;
    private RgbSprite[] field_K;
    private int field_G;
    private RgbSprite field_E;
    static byte field_H;
    private int field_z;
    static String field_y;
    private RgbSprite field_D;
    private int field_A;
    private int field_B;
    private RgbSprite field_F;
    boolean field_I;
    int field_J;

    final void setBounds(int param0, int param1, int param2, int param3, boolean param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.b(!param4 ? true : false);
    }

    public static void resetStaticState(int param0) {
        if (param0 != 2) {
          field_H = (byte) 43;
        }
        field_y = null;
    }

    ng(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        if (param2 != ~param3) {
          return;
        }
        int var5 = param0 + this.field_o;
        int var6 = this.field_i + param1;
        this.a(this.field_K[0], var6, false, var5);
        if (65536 > this.field_J) {
          DefaultTextWidgetRenderer.a(var6, this.field_h + var5, (this.field_J * this.field_h >> 16) + var5, (byte) 74, this.field_q + var6);
          this.a(this.field_K[1], var6, false, var5);
          gg.a(14756);
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -68) {
          return false;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 3) {
            return;
          }
          if (this.field_I) {
            this.field_B = this.field_B + 1;
            if (this.field_B > 2 * this.field_G) {
              this.field_B = this.field_B - 2 * this.field_G;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ng.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(RgbSprite param0, int param1, boolean param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        UiWidget var9 = null;
        var8 = Main.field_T;
        try {
          var5_int = param3 + this.field_h;
          DefaultTextWidgetRenderer.a(param1, -this.field_D.field_p + var5_int, this.field_D.field_p + param3, (byte) 96, this.field_q + param1);
          var6 = -this.field_B + param3;
          if (param2) {
            var9 = (UiWidget) null;
            this.updatePointer(-91, 67, (UiWidget) null, -108);
          }
          while (var5_int > var6) {
            param0.draw(var6, param1);
            var6 = var6 + param0.field_p;
          }
          gg.a(14756);
          if (this.field_D.field_p + param3 >= SoftwareRasterizer.field_f) {
            dl.a(80, this.field_F);
            param0.draw(-this.field_B, 0);
            param0.draw(this.field_G * 2 - this.field_B, 0);
            this.field_E.drawMultiply(0, 0);
            gg.a(14756);
            this.field_F.draw(param3, param1);
          }
          if (SoftwareRasterizer.field_a >= -this.field_D.field_p + var5_int) {
            dl.a(-103, this.field_F);
            for (var7 = this.field_h - this.field_D.field_p + this.field_B; var7 > 2 * this.field_G; var7 = var7 - 2 * this.field_G) {
            }
            param0.draw(-var7, 0);
            param0.draw(-var7 + this.field_G * 2, 0);
            this.field_D.drawMultiply(0, 0);
            gg.a(14756);
            this.field_F.draw(-this.field_D.field_p + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ng.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        this.field_K = new RgbSprite[]{this.a(this.field_z, this.field_M, (byte) 88), this.a(this.field_A, this.field_L, (byte) 88)};
        this.field_D = this.a(param0);
        if (param0) {
          ng.resetStaticState(-28);
        }
        this.field_E = this.field_D.copyMirroredHorizontally();
        this.field_F = new RgbSprite(this.field_q >> 1, this.field_q);
    }

    private final RgbSprite a(boolean param0) {
        RgbSprite discarded$0 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Main.field_T;
        int var2 = this.field_q >> 1;
        if (param0) {
          discarded$0 = this.a(-57, 44, (byte) 37);
        }
        RgbSprite var3 = new RgbSprite(var2, this.field_q);
        dl.a(-79, var3);
        for (var4 = 0; var4 < this.field_q; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_q));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        gg.a(14756);
        return var3;
    }

    private final RgbSprite a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Main.field_T;
        RgbSprite var14 = new RgbSprite(2 * this.field_G, this.field_q);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        dl.a(102, var14);
        if (param2 != 88) {
          return (RgbSprite) null;
        }
        int var5 = this.field_q >> 1;
        for (var6 = 0; var6 < this.field_q; var6++) {
          var7 = (var6 >> 1) * (2 * this.field_G - 1) % (2 * this.field_G);
          var8 = 16711935 & param0;
          var9 = param0 & 65280;
          var10 = -var5 + var6;
          var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
          var12 = var11 < 256 ? (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_G, var12);
          var8Lifetime1 = 16711935 & param1;
          var9Lifetime1 = param1 & 65280;
          SoftwareRasterizer.drawHorizontalLine(var7 - 2 * this.field_G, var6, this.field_G, var12);
          var12Lifetime1 = var11 >= 256 ? var9Lifetime1 | var8Lifetime1 : (var11 * var9Lifetime1 & 16711680 | -16711936 & var11 * var8Lifetime1) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(this.field_G + var7, var6, this.field_G, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_G + var7, var6, this.field_G, var12Lifetime1);
        }
        gg.a(param2 ^ 14844);
        return var14;
    }

    final void a(int param0, int param1, int param2) {
        this.field_M = param1;
        this.field_A = 8355711 & param2 >> 1;
        this.field_L = (16711422 & param1) >> 1;
        if (param0 != 0) {
          this.field_L = -68;
        }
        this.field_z = param2;
        this.b(false);
    }

    private ng(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param8;
        this.field_G = param4;
        this.field_M = param6;
        this.field_z = param5;
        this.field_A = param7;
        this.setBounds(param3, param1, param2, param0, true);
    }

    static {
    }
}
