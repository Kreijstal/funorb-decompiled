/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressBar extends UiComponent {
    private int field_I;
    static Sprite field_W;
    private int field_T;
    static Sprite field_N;
    private Sprite field_K;
    boolean field_Y;
    private Sprite capWorkSurface;
    private Sprite rightCapMask;
    private int field_M;
    static MenuScreen[] field_H;
    static Sprite field_S;
    private int field_V;
    private int field_Z;
    private int stripeOffset;
    int field_Q;
    private Sprite[] field_P;
    static boolean field_G;
    static SceneWidget field_U;
    static boolean field_J;
    static SceneWidget field_O;
    static String field_X;

    private final void d(byte param0) {
        this.field_P = new Sprite[]{this.a(this.field_Z, this.field_I, (byte) -121), this.a(this.field_V, this.field_T, (byte) -125)};
        if (param0 > 73) {
          this.rightCapMask = this.c(true);
          this.field_K = this.rightCapMask.copyFlippedHorizontal();
          this.capWorkSurface = new Sprite(this.field_C >> 1, this.field_C);
          return;
        }
        UiComponent var3 = (UiComponent) null;
        this.updatePointer(59, -16, -71, (UiComponent) null);
        this.rightCapMask = this.c(true);
        this.field_K = this.rightCapMask.copyFlippedHorizontal();
        this.capWorkSurface = new Sprite(this.field_C >> 1, this.field_C);
    }

    public static void releaseStatics(byte param0) {
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

    private final Sprite c(boolean param0) {
        Sprite var11 = null;
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
          var11 = new Sprite(var2, this.field_C);
          Checkbox.a(-72, var11);
          for (var4 = 0; this.field_C > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
              var6 = (double)var5 * (double)var5 / (double)((this.field_C - var4) * var4);
              var8 = 1;
              if (var6 < 1.0) {
                var6 = Math.sqrt(-var6 + 1.0);
                var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
              }
              SoftwareRasterizer.setPixel(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
          }
          LinkButtonPainter.a((byte) 92);
          return var11;
        }
        this.drawLayer(-24, 16, 122, (byte) -10);
        Sprite var10 = new Sprite(var2, this.field_C);
        Checkbox.a(-72, var10);
        for (var4Lifetime1 = 0; this.field_C > var4Lifetime1; var4Lifetime1++) {
          for (var5Lifetime1 = 0; var2 > var5Lifetime1; var5Lifetime1++) {
            var6Lifetime1 = (double)var5Lifetime1 * (double)var5Lifetime1 / (double)((this.field_C - var4Lifetime1) * var4Lifetime1);
            var8Lifetime1 = 1;
            if (var6Lifetime1 < 1.0) {
              var6Lifetime1 = Math.sqrt(-var6Lifetime1 + 1.0);
              var8Lifetime1 = !(1.0 <= var6Lifetime1) ? (int)(var6Lifetime1 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5Lifetime1, var4Lifetime1, var8Lifetime1 << 8 | var8Lifetime1 | var8Lifetime1 << 16);
          }
        }
        LinkButtonPainter.a((byte) 92);
        return var10;
    }

    final static void a(QuickChatMenu param0, boolean param1) {
        if (!param1) {
          return;
        }
        try {
          DraggableWidget.field_I.addChild(param0, (byte) 26);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, (16711422 & param6) >> 1);
    }

    final void drawLayer(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
          return;
        }
        int var5 = 19 % ((param3 - 70) / 49);
        int var6 = this.field_z + param2;
        int var7 = this.field_p + param0;
        this.drawStripedBar(this.field_P[0], 1177347297, var6, var7);
        if (65536 <= this.field_Q) {
          return;
        }
        hp.a(var6 + (this.field_E * this.field_Q >> 16), this.field_C + var7, var6 + this.field_E, (byte) -126, var7);
        this.drawStripedBar(this.field_P[1], 1177347297, var6, var7);
        LinkButtonPainter.a((byte) 92);
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
        field_O = (SceneWidget) null;
        this.field_I = param2;
        this.field_T = param2 >> 1 & 8355711;
        this.d((byte) 120);
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Y) {
            this.stripeOffset = this.stripeOffset + 1;
            if (2 * this.field_M < this.stripeOffset) {
              this.stripeOffset = this.stripeOffset - this.field_M * 2;
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
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 94, param2, param3, param4);
        this.d((byte) 96);
        if (param1 < 19) {
          this.field_M = -109;
        }
    }

    private final Sprite a(int param0, int param1, byte param2) {
        Sprite var16 = null;
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
          var16 = new Sprite(2 * this.field_M, this.field_C);
          Checkbox.a(-66, var16);
          var5 = this.field_C >> 1;
          for (var6 = 0; this.field_C > var6; var6++) {
            var7 = (2 * this.field_M - 1) * (var6 >> 1) % (2 * this.field_M);
            var8 = 16711935 & param0;
            var9 = param0 & 65280;
            var10 = var6 - var5;
            var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
            var12 = 256 <= var11 ? var9 | var8 : (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
            SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_M, var12);
            SoftwareRasterizer.drawHorizontalLine(-(this.field_M * 2) + var7, var6, this.field_M, var12);
            var9Lifetime2 = param1 & 65280;
            var8Lifetime2 = param1 & 16711935;
            var12Lifetime2 = var11 < 256 ? (-16711936 & var8Lifetime2 * var11 | 16711680 & var11 * var9Lifetime2) >>> 8 : var8Lifetime2 | var9Lifetime2;
            SoftwareRasterizer.drawHorizontalLine(this.field_M + var7, var6, this.field_M, var12Lifetime2);
            SoftwareRasterizer.drawHorizontalLine(-this.field_M + var7, var6, this.field_M, var12Lifetime2);
          }
          LinkButtonPainter.a((byte) 92);
          return var16;
        }
        field_U = (SceneWidget) null;
        Sprite var15 = new Sprite(2 * this.field_M, this.field_C);
        Checkbox.a(-66, var15);
        var5Lifetime1 = this.field_C >> 1;
        for (var6Lifetime1 = 0; this.field_C > var6Lifetime1; var6Lifetime1++) {
          var7Lifetime1 = (2 * this.field_M - 1) * (var6Lifetime1 >> 1) % (2 * this.field_M);
          var8Lifetime1 = 16711935 & param0;
          var9Lifetime1 = param0 & 65280;
          var10Lifetime1 = var6Lifetime1 - var5Lifetime1;
          var11Lifetime1 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10Lifetime1 * var10Lifetime1) + var5Lifetime1 * var5Lifetime1)) / (double)var5Lifetime1));
          var12Lifetime1 = 256 <= var11Lifetime1 ? var9Lifetime1 | var8Lifetime1 : (-16711936 & var8Lifetime1 * var11Lifetime1 | var9Lifetime1 * var11Lifetime1 & 16711680) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-(this.field_M * 2) + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1);
          var9Lifetime1Lifetime1 = param1 & 65280;
          var8Lifetime1Lifetime1 = param1 & 16711935;
          var12Lifetime1Lifetime1 = var11Lifetime1 < 256 ? (-16711936 & var8Lifetime1Lifetime1 * var11Lifetime1 | 16711680 & var11Lifetime1 * var9Lifetime1Lifetime1) >>> 8 : var8Lifetime1Lifetime1 | var9Lifetime1Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(this.field_M + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_M + var7Lifetime1, var6Lifetime1, this.field_M, var12Lifetime1Lifetime1);
        }
        LinkButtonPainter.a((byte) 92);
        return var15;
    }

    private final void drawStripedBar(Sprite param0, int param1, int param2, int param3) {
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
          hp.a(this.rightCapMask.field_F + param2, this.field_C + param3, var5_int - this.rightCapMask.field_F, (byte) -112, param3);
          for (var6 = param2 - this.stripeOffset; var5_int > var6; var6 = var6 + param0.field_F) {
            param0.b(var6, param3);
          }
          LinkButtonPainter.a((byte) 92);
          if (this.rightCapMask.field_F + param2 >= SoftwareRasterizer.field_e) {
            Checkbox.a(-122, this.capWorkSurface);
            param0.b(-this.stripeOffset, 0);
            param0.b(-this.stripeOffset + this.field_M * 2, 0);
            this.field_K.g(0, 0);
            LinkButtonPainter.a((byte) 92);
            this.capWorkSurface.b(param2, param3);
          }
          if (-this.rightCapMask.field_F + var5_int > SoftwareRasterizer.field_h) {
            return;
          }
          Checkbox.a(param1 - 1177347371, this.capWorkSurface);
          for (var7 = this.field_E - (this.rightCapMask.field_F - this.stripeOffset); this.field_M * 2 < var7; var7 = var7 - 2 * this.field_M) {
          }
          param0.b(-var7, 0);
          param0.b(-var7 + this.field_M * 2, 0);
          this.rightCapMask.g(0, 0);
          LinkButtonPainter.a((byte) 92);
          this.capWorkSurface.b(-this.rightCapMask.field_F + var5_int, param3);
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
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_V = param7;
        this.field_T = param8;
        this.field_Z = param5;
        this.field_I = param6;
        this.field_M = param4;
        this.a(param2, (byte) 33, param1, param0, param3);
    }

    static {
        field_H = new MenuScreen[18];
        ContentTransitionDialog.a(true, 127, 0, 590, new int[]{28, 1, 5, 20, 21, 27, 6, 4, 3, 22, 19}, 30, 50);
        ContentTransitionDialog.a(true, 175, 1, 460, new int[]{2, 20, 21, 27, 5, 9}, 30, 180);
        ContentTransitionDialog.a(true, 175, 2, 460, new int[]{2, 20, 21, 27, 5, 11, 13}, 30, 180);
        ContentTransitionDialog.a(true, 175, 4, 460, new int[]{2, 20, 21, 27, 5, 13}, 30, 180);
        ContentTransitionDialog.a(true, 410, 5, 610, new int[]{23, 8}, 30, 30);
        ContentTransitionDialog.a(true, 410, 6, 460, new int[]{23, 7}, 30, 180);
        ContentTransitionDialog.a(true, 420, 7, 460, new int[]{25, 8, 26}, 30, 70);
        ContentTransitionDialog.a(true, 420, 8, 460, new int[]{8, 23}, 30, 180);
        ContentTransitionDialog.a(true, 420, 9, 460, new int[]{8, 3}, 30, 180);
        ContentTransitionDialog.a(true, 260, 10, 460, new int[]{23, 24}, 30, 180);
        ContentTransitionDialog.a(true, 420, 11, 460, new int[]{7}, 30, 180);
        ContentTransitionDialog.a(true, 175, 12, 460, new int[]{}, 30, 180);
        ContentTransitionDialog.a(true, 420, 13, 460, new int[]{33, 34}, 30, 180);
        ContentTransitionDialog.a(true, 360, 16, 460, new int[]{0, 29, 7}, 30, 180);
        ContentTransitionDialog.a(true, 420, 17, 460, new int[]{7}, 30, 180);
        ContentTransitionDialog.a(true, 175, 14, 460, new int[]{}, 30, 180);
        field_S = SpriteEffectHelpers.a(600);
        field_W = SpriteEffectHelpers.a(180);
        field_N = SpriteEffectHelpers.a(300);
        field_X = "Play free version";
    }
}
