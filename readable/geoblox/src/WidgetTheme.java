/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetTheme {
    private boolean wrapTooltips;
    int tooltipBackgroundColor;
    BitmapFont tooltipFont;
    WidgetRenderer field_j;
    int field_h;
    int field_p;
    WidgetRenderer field_g;
    static int avatarShockEffectTicks;
    WidgetRenderer field_c;
    WidgetRenderer field_l;
    int field_d;
    private int tooltipTextAndBorderColor;
    WidgetRenderer field_b;
    int field_e;
    int field_i;
    int field_n;

    private final void drawSingleLineTooltip(byte methodGuard, int pointerX, String text, int pointerY) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        try {
          var5_int = this.tooltipFont.measureTextWidth(text);
          var6 = this.tooltipFont.maxDescent + this.tooltipFont.capitalXAscent;
          var7 = pointerX;
          if (SoftwareRasterizer.stride < 6 + var7 + var5_int) {
            var7 = -6 + SoftwareRasterizer.stride - var5_int;
          }
          var8 = -this.tooltipFont.capitalXAscent + (pointerY + 32);
          if (SoftwareRasterizer.framebufferHeight < 6 + (var8 + var6)) {
            var8 = SoftwareRasterizer.framebufferHeight - var6 - 6;
          }
          SoftwareRasterizer.drawRectangle(var7, var8, 6 + var5_int, var6 + 6, this.tooltipTextAndBorderColor);
          if (methodGuard != 69) {
            var9 = (String) null;
            this.drawTooltip(-83, false, 61, (String) null);
          }
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, var5_int + 4, 4 + var6, this.tooltipBackgroundColor);
          this.tooltipFont.drawText(text, 3 + var7, this.tooltipFont.capitalXAscent + 3 + var8, this.tooltipTextAndBorderColor, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wa.C(").append(methodGuard).append(',').append(pointerX).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(pointerY).append(')').toString());
        }
    }

    final void initializeRenderers(int methodGuard, BitmapFont font) {
        TextWidgetRenderer var17 = null;
        StatefulWidgetRenderer var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        StatefulWidgetRenderer var6 = null;
        StatefulWidgetRenderer var7 = null;
        DialRenderer discarded$0 = null;
        MultiHandleSliderRenderer discarded$1 = null;
        StatefulWidgetRenderer var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        StatefulWidgetRenderer var11 = null;
        StatefulWidgetRenderer var12 = null;
        Sprite var13 = null;
        StatefulWidgetRenderer var14 = null;
        StatefulWidgetRenderer var19 = null;
        int var15 = Geoblox.clientControlFlowFlag;
        try {
            var17 = new TextWidgetRenderer(font, 2, 2, 2236962, 1, 1, 1, 2 + (font.maxAscent + font.maxDescent));
            this.field_b = (WidgetRenderer) ((Object) var17);
            var17.field_o = 16777215;
            var4 = new StatefulWidgetRenderer();
            var17.a(var4, true);
            this.field_n = 15658734;
            var4.field_h = 11711154;
            var4.field_c = 15658734;
            this.tooltipBackgroundColor = 5592405;
            this.field_e = 3;
            this.field_p = 3;
            this.tooltipTextAndBorderColor = 15658734;
            this.field_h = -1;
            this.field_d = 3;
            this.field_i = 3;
            this.tooltipFont = font;
            var4.a(methodGuard - 126, 0).b(256, 15658734).a(WidgetTheme.a(10066329, 8947848, 7829367, 1), true);
            var4.a(-106, 1).a(WidgetTheme.a(10066329, 11184810, 13421772, 1), true);
            var4.a(methodGuard ^ -100, 3).a(WidgetTheme.a(7829367, 8947848, 10066329, methodGuard - 8), true).b((byte) -53, 1).a(methodGuard - 9, 1);
            var5 = new Sprite[9];
            var16 = new ArgbSprite(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
                var16.pixels[var7_int] = 1077952576;
            }
            var5[4] = (Sprite) ((Object) var18);
            var4.a(-127, 4).a(true, (byte) 73).a(var5, true);
            var4.a(-101, 5).a(IntrusiveDeque.buildUnitBorderNineSliceSprites(0, 0, 116, 0, 65793), true).a(true, (byte) 73).b(256, -1);
            this.field_j = (WidgetRenderer) ((Object) var4);
            var6 = new StatefulWidgetRenderer(var4, true);
            var6.field_g = 0;
            var7 = new StatefulWidgetRenderer(var4, true);
            var7.field_g = 0;
            var7.a((byte) 124, MeshPrioritySupport.createSolidCenterSlices(8947848, (byte) -112));
            var7.a(-116, 1).a(MeshPrioritySupport.createSolidCenterSlices(11184810, (byte) -112), true).b(256, 2236962);
            this.field_c = (WidgetRenderer) ((Object) new CheckboxRenderer(font, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new DialRenderer(font, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new MultiHandleSliderRenderer(font, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new StatefulWidgetRenderer();
            var17.a(var8, true);
            var8.a(-124, 0).a(WidgetTheme.a(7829367, 15658734, 10066329, 1), true).b(256, 1118481).a((byte) 16, -1);
            var8.a(-105, 4).a(true, (byte) 73).a(var5, true);
            this.field_g = (WidgetRenderer) ((Object) var8);
            var9 = new Sprite[methodGuard];
            var10 = new Sprite[9];
            var9[4] = new Sprite(2, 1);
            var10[4] = new Sprite(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.pixels = new int[]{6710886, 7829367};
            var10[4].pixels = new int[]{6710886, 7829367};
            var11 = new StatefulWidgetRenderer();
            var12 = new StatefulWidgetRenderer();
            var11.a(var9, 0, (byte) 57);
            var12.a(var10, 0, (byte) 108);
            var13 = new Sprite(7, 4);
            var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new StatefulWidgetRenderer(var4, true);
            var14.a(0, var13.copy());
            var13.rotateClockwise();
            var14 = new StatefulWidgetRenderer(var4, true);
            var14.a(methodGuard ^ 9, var13.copy());
            var13.rotateClockwise();
            var14 = new StatefulWidgetRenderer(var4, true);
            var14.a(0, var13.copy());
            var13.rotateClockwise();
            var19 = new StatefulWidgetRenderer(var4, true);
            var19.a(methodGuard ^ 9, var13);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "wa.B(" + methodGuard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawWrappedTooltip(int pointerY, String text, int pointerX, int methodGuard) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Geoblox.clientControlFlowFlag;
        try {
          var5_int = this.field_e + this.field_d;
          var6 = this.field_p + this.field_i;
          var7 = this.field_h;
          if (methodGuard != -3140) {
            return;
          }
          if (-1 == var7) {
            var7 = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          }
          var8 = SoftwareRasterizer.stride >> 2;
          var9 = this.tooltipFont.measureTextWidth(text);
          var10 = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          var11 = 1;
          if (!((var8 >= var9) &&
              (-1 == text.indexOf("<br>")))) {
            if (FadingDialog.field_E == null) {
              FadingDialog.field_E = new String[16];
            }
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = (var9 % var8 + var13 - 1) / var13 * 2 + var8;
            }
            var11 = this.tooltipFont.wrapText(text, new int[]{var12}, FadingDialog.field_E);
            var9 = 0;
            var10 = var10 + (var11 - 1) * var7;
            for (var13 = 0; var13 < var11; var13++) {
              var14 = this.tooltipFont.measureTextWidth(FadingDialog.field_E[var13]);
              if (var14 <= var9) {
                continue;
              }
              var9 = var14;
            }
          }
          var12 = pointerX;
          if (var5_int + var9 + var12 > SoftwareRasterizer.stride) {
            var12 = -var5_int + (SoftwareRasterizer.stride - var9);
          }
          var13 = 32 + (-this.tooltipFont.capitalXAscent + pointerY);
          if (SoftwareRasterizer.framebufferHeight < var10 + (var13 + var6)) {
            var13 = pointerY - var10 - var6;
          }
          SoftwareRasterizer.drawRectangle(var12, var13, var5_int + var9, var10 + var6, this.field_n);
          SoftwareRasterizer.fillRectangle(1 + var12, 1 + var13, var9 + (var5_int - 2), -2 + (var10 + var6), this.tooltipBackgroundColor);
          this.tooltipFont.drawParagraph(text, this.field_d + var12, this.field_i + var13, var9, var10, this.tooltipTextAndBorderColor, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("wa.G(").append(pointerY).append(',');
          if (text == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(pointerX).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void drawTooltip(int pointerY, boolean methodGuard, int pointerX, String text) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.wrapTooltips) {
            this.drawSingleLineTooltip((byte) 69, pointerX, text, pointerY);
          } else {
            this.drawWrappedTooltip(pointerY, text, pointerX, -3140);
          }
          if (!methodGuard) {
            this.field_c = (WidgetRenderer) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("wa.D(").append(pointerY).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final static Sprite[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            WidgetTheme.a(-34, 65, 52, 47);
        }
        return TextInputWidget.createTwoTonePanelSprites(param0, (byte) -70, param2, param1, 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 15658734) {
            return;
        }
        SoftwareRasterizer.fillRectangleAlpha(param6, param0, param2, param1, param5, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param4, param3, param1, param0, param2);
        if (param5 != 8947848) {
            this.field_p = 22;
        }
    }

    public WidgetTheme() {
        this.wrapTooltips = true;
    }

    final static int collectUnfinishedPopupPoints(int param0) {
        int unfinishedPoints = 0;
        RuntimeException var1 = null;
        ScorePopup popup = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          unfinishedPoints = 0;
          if (param0 != -25866) {
            WidgetTheme.a(53, -56, 122, 126);
          }
          popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.removeFirst((byte) -121));
          while (popup != null) {
            unfinishedPoints = unfinishedPoints + popup.points;
            popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.removeFirst((byte) -99));
          }
          stackIn_7_0 = unfinishedPoints;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "wa.H(" + param0 + ')');
        }
    }

    static {
        avatarShockEffectTicks = 0;
    }
}
