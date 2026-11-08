/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressBarWidget extends UiWidget {
    private int stripeOffset;
    static Sprite field_T;
    static java.applet.Applet field_W;
    static int field_S;
    static BitmapFont field_R;
    private int stripeWidth;
    private int dimStripeColor;
    private int alternateStripeColor;
    private Sprite field_H;
    static UiComponent field_K;
    boolean animationEnabled;
    private int stripeColor;
    private Sprite[] stripeSprites;
    int fillFractionQ16;
    private Sprite field_U;
    static int field_G;
    private Sprite field_F;
    private int dimAlternateStripeColor;

    private final Sprite buildStripeSprite(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param2 < 82) {
          this.renderWidget(-24, (byte) -90, 11, -53);
        }
        Sprite var13 = new Sprite(2 * this.stripeWidth, this.widgetHeight);
        CueAim.a(113, var13);
        int var5 = this.widgetHeight >> 1;
        for (var6 = 0; var6 < this.widgetHeight; var6++) {
          var7 = (2 * this.stripeWidth - 1) * (var6 >> 1) % (this.stripeWidth * 2);
          var8 = 16711935 & param1;
          var9 = param1 & 65280;
          var10 = var6 - var5;
          var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
          var12 = var11 >= 256 ? var8 | var9 : (var8 * var11 & -16711936 | var11 * var9 & 16711680) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.stripeWidth, var12);
          SoftwareRasterizer.drawHorizontalLine(-(this.stripeWidth * 2) + var7, var6, this.stripeWidth, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = 16711935 & param0;
          var12Lifetime1 = 256 > var11 ? (-16711936 & var8Lifetime1 * var11 | var9Lifetime1 * var11 & 16711680) >>> 8 : var8Lifetime1 | var9Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
        }
        TriangleMesh.a(122);
        return var13;
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ModelInstance.isValidDisplayName(param1, (byte) -113, true)) {
            return false;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            if (!HalloweenBallSkin.isAllowedNameCharacter(param1.charAt(var2_int), (byte) 124)) {
              return false;
            }
          }
          if (param0 == -25908) {
            return true;
          }
          var3 = (byte[]) null;
          ProgressBarWidget.a((byte[]) null, 26, -23);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void setWidgetBounds(int param0, int param1, int param2, boolean param3, int param4) {
        super.setWidgetBounds(param0, param1, param2, param3, param4);
        this.rebuildSprites((byte) 33);
    }

    private final Sprite buildEndMask(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        Sprite discarded$0 = null;
        int var2 = this.widgetHeight >> 1;
        Sprite var3 = new Sprite(var2, this.widgetHeight);
        CueAim.a(55, var3);
        for (var4 = 0; var4 < this.widgetHeight; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.widgetHeight) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 | var8 << 8 | var8 << 16);
          }
        }
        if (param0 != 16711422) {
          discarded$0 = this.buildStripeSprite(24, 48, (byte) -125);
        }
        TriangleMesh.a(117);
        return var3;
    }

    private final void drawRoundedStripes(boolean param0, int param1, int param2, Sprite param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          var5_int = param1 + this.widgetWidth;
          QuickChatPhraseRegistry.pushRasterClip(param1 + this.field_U.field_z, param2, var5_int - this.field_U.field_z, (byte) 31, param2 + this.widgetHeight);
          for (var6 = -this.stripeOffset + param1; var5_int > var6; var6 = var6 + param3.field_z) {
            param3.draw(var6, param2);
          }
          if (param0) {
            this.field_U = (Sprite) null;
          }
          TriangleMesh.a(121);
          if (SoftwareRasterizer.clipLeft <= param1 + this.field_U.field_z) {
            CueAim.a(43, this.field_H);
            param3.draw(-this.stripeOffset, 0);
            param3.draw(-this.stripeOffset + 2 * this.stripeWidth, 0);
            this.field_F.drawMultiply(0, 0);
            TriangleMesh.a(114);
            this.field_H.draw(param1, param2);
          }
          if (var5_int - this.field_U.field_z <= SoftwareRasterizer.clipRight) {
            CueAim.a(86, this.field_H);
            for (var7 = -this.field_U.field_z + (this.widgetWidth + this.stripeOffset); var7 > this.stripeWidth * 2; var7 = var7 - this.stripeWidth * 2) {
            }
            param3.draw(-var7, 0);
            param3.draw(this.stripeWidth * 2 - var7, 0);
            this.field_U.drawMultiply(0, 0);
            TriangleMesh.a(121);
            this.field_H.draw(var5_int - this.field_U.field_z, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    ProgressBarWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, (param6 & 16711422) >> 1);
    }

    public static void releaseStatics(boolean param0) {
        field_T = null;
        field_W = null;
        if (!param0) {
          field_K = (UiComponent) null;
        }
        field_K = null;
        field_R = null;
    }

    final static boolean a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            field_R = (BitmapFont) null;
          }
          stackIn_6_0 = (2 <= param1) && (!LogoMaterial.a(param1, 125, param0, LoginMethod.field_h));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gj.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        int var6 = 23 / ((-42 - param1) / 53);
        int var5 = this.widgetX + param2;
        int var7 = this.widgetY + param3;
        this.drawRoundedStripes(false, var5, var7, this.stripeSprites[0]);
        if (this.fillFractionQ16 < 65536) {
          QuickChatPhraseRegistry.pushRasterClip(var5 + (this.widgetWidth * this.fillFractionQ16 >> 16), var7, this.widgetWidth + var5, (byte) -116, var7 + this.widgetHeight);
          this.drawRoundedStripes(false, var5, var7, this.stripeSprites[1]);
          TriangleMesh.a(112);
        }
    }

    private final void rebuildSprites(byte param0) {
        this.stripeSprites = new Sprite[]{this.buildStripeSprite(this.alternateStripeColor, this.stripeColor, (byte) 108), this.buildStripeSprite(this.dimAlternateStripeColor, this.dimStripeColor, (byte) 110)};
        if (param0 <= 8) {
          byte[] var3 = (byte[]) null;
          ProgressBarWidget.a((byte[]) null, -61, 57);
        }
        this.field_U = this.buildEndMask(16711422);
        this.field_F = this.field_U.copyFlippedHorizontal();
        this.field_H = new Sprite(this.widgetHeight >> 1, this.widgetHeight);
    }

    final void setStripeColors(int param0, int param1, int param2) {
        this.alternateStripeColor = param0;
        this.stripeColor = param2;
        this.dimAlternateStripeColor = (16711422 & param0) >> 1;
        if (param1 != 19365) {
          this.animationEnabled = false;
        }
        this.dimStripeColor = 8355711 & param2 >> 1;
        this.rebuildSprites((byte) 83);
    }

    final static AnimatedNotification a(boolean param0, int param1, String param2, String param3) {
        AnimatedNotification var4 = null;
        RuntimeException var4_ref = null;
        AnimatedNotification stackIn_2_0 = null;
        AnimatedNotification stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          VertexTransformSupport.a((byte) 48, param1);
          var4 = new AnimatedNotification(param1);
          if (!param0) {
            stackIn_2_0 = (AnimatedNotification) null;
            return stackIn_2_0;
          }
          var4.renderNotificationText(param2, (byte) 87, param3);
          MarkerSliderPainter.field_i.addFirst((byte) 92, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("gj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 958) {
            this.setWidgetBounds(-58, 31, -62, true, -86);
          }
          if (this.animationEnabled) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeOffset <= this.stripeWidth * 2) {
              return;
            }
            this.stripeOffset = this.stripeOffset - 2 * this.stripeWidth;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gj.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private ProgressBarWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.alternateStripeColor = param6;
        this.dimAlternateStripeColor = param8;
        this.stripeColor = param5;
        this.dimStripeColor = param7;
        this.stripeWidth = param4;
        this.setWidgetBounds(param2, param0, param3, false, param1);
    }

    static {
        field_G = 0;
    }
}
