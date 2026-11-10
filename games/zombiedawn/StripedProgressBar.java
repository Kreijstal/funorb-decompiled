/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressBar extends UiWidget {
    private int field_x;
    private int field_y;
    private int field_A;
    private Sprite field_K;
    static String[] field_D;
    private Sprite[] field_L;
    private Sprite field_J;
    boolean field_F;
    int field_C;
    private Sprite field_B;
    private int field_z;
    static String field_G;
    private int field_H;
    private int field_E;

    private final void rebuildSprites(int param0) {
        this.field_L = new Sprite[]{this.createStripeSprite(this.field_y, this.field_A, -69), this.createStripeSprite(this.field_z, this.field_x, -105)};
        this.field_K = this.createCapMask(-108);
        this.field_J = this.field_K.copyFlippedHorizontal();
        this.field_B = new Sprite(this.field_n >> 1, this.field_n);
        int var2 = -77 / ((param0 - 88) / 33);
    }

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, param6 >> 1 & 8355711);
    }

    private final Sprite createStripeSprite(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = ZombieDawn.field_J;
        Sprite var15 = new Sprite(this.field_E * 2, this.field_n);
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        ContentTransitionDialog.setRasterTarget((byte) -99, var15);
        int var5 = this.field_n >> 1;
        int var6 = -39 / ((34 - param2) / 50);
        for (var7 = 0; this.field_n > var7; var7++) {
          var8 = (var7 >> 1) * (this.field_E * 2 - 1) % (2 * this.field_E);
          var9 = 16711935 & param0;
          var10 = param0 & 65280;
          var11 = var7 - var5;
          var12 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var11 * var11)) / (double)var5)) + 128;
          var13 = var12 >= 256 ? var9 | var10 : (var12 * var9 & -16711936 | 16711680 & var12 * var10) >>> 8;
          Rasterizer.drawHorizontalLine(var8, var7, this.field_E, var13);
          var9Lifetime1 = 16711935 & param1;
          var10Lifetime1 = param1 & 65280;
          Rasterizer.drawHorizontalLine(var8 - 2 * this.field_E, var7, this.field_E, var13);
          var13Lifetime1 = var12 < 256 ? (16711680 & var12 * var10Lifetime1 | -16711936 & var9Lifetime1 * var12) >>> 8 : var10Lifetime1 | var9Lifetime1;
          Rasterizer.drawHorizontalLine(var8 + this.field_E, var7, this.field_E, var13Lifetime1);
          Rasterizer.drawHorizontalLine(-this.field_E + var8, var7, this.field_E, var13Lifetime1);
        }
        SingleChildWidget.popRasterState(-21189);
        return var15;
    }

    private final void drawStripedBar(int param0, Sprite param1, byte param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var5_int = this.field_i + param3;
          Mover.intersectClipIntArgs(param0, 99, -this.field_K.field_w + var5_int, this.field_n + param0, this.field_K.field_w + param3);
          for (var6 = param3 - this.field_H; var5_int > var6; var6 = var6 + param1.field_w) {
            param1.drawTransparent(var6, param0);
          }
          var7 = -32 / ((param2 - 34) / 50);
          SingleChildWidget.popRasterState(-21189);
          if (Rasterizer.clipLeft <= this.field_K.field_w + param3) {
            ContentTransitionDialog.setRasterTarget((byte) -118, this.field_B);
            param1.drawTransparent(-this.field_H, 0);
            param1.drawTransparent(-this.field_H + 2 * this.field_E, 0);
            this.field_J.drawMultiply(0, 0);
            SingleChildWidget.popRasterState(-21189);
            this.field_B.drawTransparent(param3, param0);
          }
          if (-this.field_K.field_w + var5_int <= Rasterizer.clipRight) {
            ContentTransitionDialog.setRasterTarget((byte) -107, this.field_B);
            for (var7Lifetime1 = -this.field_K.field_w + (this.field_i + this.field_H); this.field_E * 2 < var7Lifetime1; var7Lifetime1 = var7Lifetime1 - this.field_E * 2) {
            }
            param1.drawTransparent(-var7Lifetime1, 0);
            param1.drawTransparent(-var7Lifetime1 + 2 * this.field_E, 0);
            this.field_K.drawMultiply(0, 0);
            SingleChildWidget.popRasterState(-21189);
            this.field_B.drawTransparent(var5_int - this.field_K.field_w, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("hb.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setColors(int param0, int param1, int param2) {
        if (param0 >= 0) {
          return;
        }
        this.field_z = 8355711 & param2 >> 1;
        this.field_A = param1;
        this.field_x = 8355711 & param1 >> 1;
        this.field_y = param2;
        this.rebuildSprites(52);
    }

    public static void releaseStatics(int param0) {
        field_G = null;
        field_D = null;
        if (param0 > -83) {
          field_D = (String[]) null;
        }
    }

    private final Sprite createCapMask(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ZombieDawn.field_J;
        int var2 = this.field_n >> 1;
        Sprite var3 = new Sprite(var2, this.field_n);
        ContentTransitionDialog.setRasterTarget((byte) -118, var3);
        for (var4 = 0; var4 < this.field_n; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_n) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
            }
            Rasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        if (param0 >= -81) {
          this.field_H = 42;
        }
        SingleChildWidget.popRasterState(-21189);
        return var3;
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        try {
          if (this.field_F) {
            this.field_H = this.field_H + 1;
            if (2 * this.field_E < this.field_H) {
              this.field_H = this.field_H - 2 * this.field_E;
            }
          }
          int var5_int = 20 / ((46 - param1) / 42);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "hb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        int var5 = this.field_k + param2;
        int var6 = this.field_j + param0;
        this.drawStripedBar(var6, this.field_L[param3], (byte) -52, var5);
        if (this.field_C < 65536) {
          Mover.intersectClipIntArgs(var6, 99, var5 + this.field_i, var6 + this.field_n, (this.field_i * this.field_C >> 16) + var5);
          this.drawStripedBar(var6, this.field_L[1], (byte) -104, var5);
          SingleChildWidget.popRasterState(-21189);
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -79 / ((-23 - param0) / 48);
        super.setBounds(-116, param1, param2, param3, param4);
        this.rebuildSprites(123);
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_z = param7;
        this.field_E = param4;
        this.field_y = param5;
        this.field_x = param8;
        this.field_A = param6;
        this.setBounds(-91, param1, param0, param2, param3);
    }

    static {
        field_D = new String[]{"You've conquered the Yanks!", "You've conquered the Brits!"};
        field_G = "Go to Next Level!";
    }
}
