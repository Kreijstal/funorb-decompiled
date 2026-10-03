/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends UiWidget {
    static int[] field_D;
    private Sprite[] field_F;
    private int field_J;
    private int field_L;
    private int field_E;
    private int field_A;
    private Sprite field_y;
    private Sprite field_z;
    private int field_H;
    int field_x;
    private Sprite field_M;
    private int field_I;
    static int[] decodedSpriteHeights;
    static boolean field_G;
    boolean field_C;
    static IntrusiveDeque field_B;

    private final Sprite a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Geoblox.clientControlFlowFlag;
        Sprite var14 = new Sprite(this.field_H * 2, this.widgetHeight);
        Geoblox.setRasterTarget(1, var14);
        int var5 = this.widgetHeight >> 1;
        for (var6 = 0; this.widgetHeight > var6; var6++) {
            var7 = (var6 >> 1) * (-1 + this.field_H * 2) % (this.field_H * 2);
            var8 = 16711935 & param2;
            var9 = 65280 & param2;
            var10 = -var5 + var6;
            var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
            var12 = var11 >= 256 ? var9 | var8 : (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 8;
            SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_H, var12);
            SoftwareRasterizer.drawHorizontalLine(-(2 * this.field_H) + var7, var6, this.field_H, var12);
            var9 = param0 & 65280;
            var8 = param0 & 16711935;
            var12 = 256 > var11 ? (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
            SoftwareRasterizer.drawHorizontalLine(this.field_H + var7, var6, this.field_H, var12);
            SoftwareRasterizer.drawHorizontalLine(-this.field_H + var7, var6, this.field_H, var12);
        }
        id.a(param1);
        return var14;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_A = 8355711 & param0 >> 1;
        this.field_E = param1;
        this.field_J = param1 >> 1 & 8355711;
        if (param2 != -103) {
            this.e(-107);
        }
        this.field_L = param0;
        this.e(-1326628703);
    }

    private final Sprite g(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Geoblox.clientControlFlowFlag;
        int var2 = this.widgetHeight >> 1;
        Sprite var3 = new Sprite(var2, this.widgetHeight);
        if (param0 != 255) {
            return (Sprite) null;
        }
        Geoblox.setRasterTarget(1, var3);
        for (var4 = 0; var4 < this.widgetHeight; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.widgetHeight));
                var8 = 1;
                if (!(!(var6 < 1.0))) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        id.a(true);
        return var3;
    }

    private final void a(Sprite param0, int param1, int param2, int param3) {
        int var6 = 0;
        Sprite discarded$0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var5_int = param2 + this.widgetWidth;
          uh.a(param1, this.field_M.width + param2, param3 ^ 6447, this.widgetHeight + param1, var5_int - this.field_M.width);
          for (var6 = param2 - this.field_I; var6 < var5_int; var6 = var6 + param0.width) {
            param0.draw(var6, param1);
          }
          if (param3 != -12276) {
            discarded$0 = this.g(1);
          }
          id.a(true);
          if (this.field_M.width + param2 >= SoftwareRasterizer.clipLeft) {
            Geoblox.setRasterTarget(1, this.field_z);
            param0.draw(-this.field_I, 0);
            param0.draw(2 * this.field_H - this.field_I, 0);
            this.field_y.drawMultiply(0, 0);
            id.a(true);
            this.field_z.draw(param2, param1);
          }
          if (SoftwareRasterizer.clipRight >= var5_int - this.field_M.width) {
            Geoblox.setRasterTarget(param3 ^ -12275, this.field_z);
            for (var7 = this.field_I + (this.widgetWidth - this.field_M.width); var7 > 2 * this.field_H; var7 = var7 - 2 * this.field_H) {
            }
            param0.draw(-var7, 0);
            param0.draw(-var7 + this.field_H * 2, 0);
            this.field_M.drawMultiply(0, 0);
            id.a(true);
            this.field_z.draw(-this.field_M.width + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var5);
          stackIn_17_1 = new StringBuilder().append("hl.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5 = -76 % ((methodGuard - 1) / 43);
        if (!(renderPass == 0)) {
            return;
        }
        int var6 = parentX + this.widgetX;
        int var7 = parentY + this.widgetY;
        this.a(this.field_F[0], var7, var6, -12276);
        if (this.field_x < 65536) {
            uh.a(var7, var6 + (this.widgetWidth * this.field_x >> 16), -14045, var7 + this.widgetHeight, this.widgetWidth + var6);
            this.a(this.field_F[1], var7, var6, -12276);
            id.a(true);
        }
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        Sprite discarded$0 = null;
        super.setWidgetBounds(height, width, (byte) -74, y, x);
        this.e(-1326628703);
        if (methodGuard > -6) {
            discarded$0 = this.g(109);
        }
    }

    private final void e(int param0) {
        this.field_F = new Sprite[]{this.a(this.field_L, true, this.field_E), this.a(this.field_A, true, this.field_J)};
        this.field_M = this.g(255);
        if (param0 != -1326628703) {
            return;
        }
        this.field_y = this.field_M.copyMirroredHorizontally();
        this.field_z = new Sprite(this.widgetHeight >> 1, this.widgetHeight);
    }

    private hl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_E = param5;
        this.field_H = param4;
        this.field_L = param6;
        this.field_J = param7;
        this.field_A = param8;
        this.setWidgetBounds(param3, param2, (byte) -121, param1, param0);
    }

    hl(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    public static void f(int param0) {
        if (param0 != 407213000) {
            hl.f(93);
        }
        field_B = null;
        decodedSpriteHeights = null;
        field_D = null;
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_C) {
            this.field_I = this.field_I + 1;
            if (this.field_I > 2 * this.field_H) {
              this.field_I = this.field_I - 2 * this.field_H;
            }
          }
          if (hoverGuard) {
            field_G = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var5);
          stackIn_8_1 = new StringBuilder().append("hl.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(parentX).append(')').toString());
        }
    }

    static {
        field_D = new int[4];
        field_G = true;
    }
}
