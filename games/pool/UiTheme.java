/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiTheme {
    WidgetPainter field_l;
    int tooltipLeftPadding;
    WidgetPainter field_k;
    int tooltipRightPadding;
    int tooltipBottomPadding;
    WidgetPainter field_j;
    int tooltipLineSpacing;
    WidgetPainter field_c;
    WidgetPainter field_o;
    int tooltipBackgroundColor;
    private boolean wrapTooltips;
    private int tooltipTextColor;
    int tooltipTopPadding;
    BitmapFont tooltipFont;
    int tooltipBorderColor;

    final static boolean a(byte param0, int param1) {
        IntrusiveDequeCursor var2 = null;
        RuntimeException var2_ref = null;
        AnimatedNotification var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var2 = new IntrusiveDequeCursor(MarkerSliderPainter.field_i);
          var3 = (AnimatedNotification) (var2.last((byte) -92));
          while (true) {
            if (var3 == null) {
              var4 = 116 / ((param0 + 61) / 60);
              return false;
            }
            if (~var3.field_m != ~param1) {
              var3 = (AnimatedNotification) (var2.previous(-100));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "nq.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param1, param5, param4, param2, param3);
        if (param0 != -1) {
          this.wrapTooltips = true;
        }
    }

    final void drawTooltip(byte param0, int param1, int param2, String param3) {
        java.awt.Component var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.wrapTooltips) {
            this.drawSingleLineTooltip(param3, param2, (byte) -94, param1);
          } else {
            this.drawWrappedTooltip(param1, 10066329, param3, param2);
          }
          if (param0 > -42) {
            var6 = (java.awt.Component) null;
            UiTheme.a((MidiPcmStream) null, (PlatformTaskDispatcher) null, (java.awt.Component) null, -58, true, 17, true, -29);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("nq.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void drawWrappedTooltip(int param0, int param1, String param2, int param3) {
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
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        try {
          var5_int = this.tooltipLeftPadding + this.tooltipRightPadding;
          var6 = this.tooltipTopPadding + this.tooltipBottomPadding;
          var7 = this.tooltipLineSpacing;
          if (var7 == -1) {
            var7 = this.tooltipFont.maxAscent + this.tooltipFont.maxDescent;
          }
          var8 = SoftwareRasterizer.width >> 2;
          var9 = this.tooltipFont.b(param2);
          if (param1 != 10066329) {
            return;
          }
          var10 = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param2.indexOf("<br>")) {
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var13 + (var9 % var8 - 1)) / var13) + var8;
            }
            if (null == GrowableIntListFactory.field_k) {
              GrowableIntListFactory.field_k = new String[16];
            }
            var11Lifetime1 = this.tooltipFont.wrapText(param2, new int[]{var12}, GrowableIntListFactory.field_k);
            var9 = 0;
            var10 = var10 + var7 * (var11Lifetime1 - 1);
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.tooltipFont.b(GrowableIntListFactory.field_k[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var5_int + var12 + var9 > SoftwareRasterizer.width) {
            var12 = -var5_int - var9 + SoftwareRasterizer.width;
          }
          var13Lifetime1 = -this.tooltipFont.field_L + (param0 + 32);
          if (SoftwareRasterizer.height < var6 + var13Lifetime1 + var10) {
            var13Lifetime1 = -var6 - var10 + param0;
          }
          SoftwareRasterizer.drawRectangle(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.tooltipBorderColor);
          SoftwareRasterizer.fillRectangle(var12 + 1, 1 + var13Lifetime1, -2 + (var5_int + var9), -2 + var6 + var10, this.tooltipBackgroundColor);
          this.tooltipFont.drawParagraph(param2, var12 + this.tooltipLeftPadding, var13Lifetime1 + this.tooltipTopPadding, var9, var10, this.tooltipTextColor, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("nq.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final void fillRectangleAlpha(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        SoftwareRasterizer.fillRectangleAlpha(param6, param3, param0, param2, param4, param1);
        if (param5 < 69) {
          this.tooltipLineSpacing = 36;
        }
    }

    final static boolean isRenderableCharacter(char param0, byte param1) {
        if (param0 >= 32 &&
          param0 <= 126) {
          return true;
        }
        if (160 <= param0 &&
          param0 <= 255) {
          return true;
        }
        if (param0 != 8364 &&
          param0 != 338 &&
          8212 != param0 &&
          param0 != 339 &&
          param0 != 376) {
          if (param1 == -125) {
            return false;
          }
          return true;
        }
        return true;
    }

    private final void drawSingleLineTooltip(String param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.tooltipFont.b(param0);
          var6 = this.tooltipFont.maxDescent + this.tooltipFont.field_L;
          if (param2 > -62) {
            this.tooltipBackgroundColor = -110;
          }
          var7 = param1;
          if (6 + var5_int + var7 > SoftwareRasterizer.width) {
            var7 = -6 - var5_int + SoftwareRasterizer.width;
          }
          var8 = -this.tooltipFont.field_L + (param3 + 32);
          if (SoftwareRasterizer.height < 6 + var8 + var6) {
            var8 = SoftwareRasterizer.height + (-var6 - 6);
          }
          SoftwareRasterizer.drawRectangle(var7, var8, 6 + var5_int, 6 + var6, this.tooltipTextColor);
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, var5_int + 4, var6 + 4, this.tooltipBackgroundColor);
          this.tooltipFont.d(param0, var7 + 3, this.tooltipFont.field_L + (var8 + 3), this.tooltipTextColor, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("nq.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void initializePainters(BitmapFont param0, int param1) {
        int var7_int = 0;
        StatefulTextPainter var19 = null;
        int var15 = Pool.field_O;
        TextWidgetPainter var17 = new TextWidgetPainter(param0, 2, 2, 2236962, 1, 1, 1, param0.maxDescent + param0.maxAscent + 2);
        var17.textColor = 16777215;
        this.field_c = (WidgetPainter) ((Object) var17);
        StatefulTextPainter var4 = new StatefulTextPainter();
        var17.copyStyleTo(-1177150015, var4);
        this.tooltipRightPadding = 3;
        this.tooltipBottomPadding = 3;
        this.tooltipTopPadding = 3;
        var4.selectionColor = 11711154;
        this.tooltipTextColor = 15658734;
        this.tooltipBackgroundColor = 5592405;
        this.tooltipLeftPadding = 3;
        this.tooltipFont = param0;
        var4.caretColor = 15658734;
        this.tooltipBorderColor = 15658734;
        this.tooltipLineSpacing = -1;
        var4.createStateLayer(0, 0).setTextColor(15658734, 57).setFrameSprites(NineBallRules.createBeveledPanelSprites(8947848, 10066329, 7829367, false), (byte) 67);
        var4.createStateLayer(1, 0).setFrameSprites(NineBallRules.createBeveledPanelSprites(11184810, 10066329, 13421772, false), (byte) 76);
        var4.createStateLayer(3, 0).setFrameSprites(NineBallRules.createBeveledPanelSprites(8947848, 7829367, 10066329, false), (byte) 64).setOffsetX(1, -1).setOffsetY(1, (byte) 90);
        Sprite[] var5 = new Sprite[9];
        ArgbSprite var16 = new ArgbSprite(32, 32);
        ArgbSprite var18 = var16;
        for (var7_int = 0; var7_int < var18.field_D.length; var7_int++) {
          var16.field_D[var7_int] = 1077952576;
        }
        var5[4] = (Sprite) ((Object) var18);
        var4.createStateLayer(4, 0).setFlushBeforeApply(-15359, true).setFrameSprites(var5, (byte) 126);
        var4.createStateLayer(5, 0).setFrameSprites(DualLinkNode.a(0, 0, -119, 65793, 0), (byte) 90).setFlushBeforeApply(-15359, true).setTextColor(-1, 71);
        this.field_l = (WidgetPainter) ((Object) var4);
        StatefulTextPainter var6 = new StatefulTextPainter(var4, true);
        var6.horizontalAlignment = 0;
        StatefulTextPainter var7 = new StatefulTextPainter(var4, true);
        var7.horizontalAlignment = 0;
        var7.setFrameSpritesForAllStates(UiWidget.a((byte) 83, 8947848), 6);
        var7.createStateLayer(1, 0).setFrameSprites(UiWidget.a((byte) 32, 11184810), (byte) 120).setTextColor(2236962, 51);
        this.field_o = (WidgetPainter) ((Object) new CheckboxPainter(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        DialRenderer discarded$0 = new DialRenderer(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        MarkerSliderPainter discarded$1 = new MarkerSliderPainter(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        StatefulTextPainter var8 = new StatefulTextPainter();
        var17.copyStyleTo(-1177150015, var8);
        var8.createStateLayer(0, 0).setFrameSprites(NineBallRules.createBeveledPanelSprites(15658734, 7829367, 10066329, false), (byte) 74).setTextColor(1118481, 72).setShadowColor(true, -1);
        var8.createStateLayer(4, 0).setFlushBeforeApply(-15359, true).setFrameSprites(var5, (byte) 77);
        this.field_j = (WidgetPainter) ((Object) var8);
        Sprite[] var9 = new Sprite[9];
        var9[4] = new Sprite(2, 1);
        Sprite[] var10 = new Sprite[9];
        var10[4] = new Sprite(1, 2);
        Sprite dupTemp$2 = var9[4];
        dupTemp$2.field_D = new int[]{6710886, 7829367};
        var10[4].field_D = new int[]{6710886, 7829367};
        StatefulTextPainter var11 = new StatefulTextPainter();
        StatefulTextPainter var12 = new StatefulTextPainter();
        var11.setStateFrameSprites((byte) -79, 0, var9);
        var12.setStateFrameSprites((byte) -79, 0, var10);
        Sprite var13 = new Sprite(7, 4);
        var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        StatefulTextPainter var14 = new StatefulTextPainter(var4, true);
        var14.setSpriteForAllStates(var13.copy(), 117);
        var13.rotateClockwise();
        var14 = new StatefulTextPainter(var4, true);
        var14.setSpriteForAllStates(var13.copy(), 114);
        var13.rotateClockwise();
        if (param1 > -8) {
          return;
        }
        try {
          var14 = new StatefulTextPainter(var4, true);
          var14.setSpriteForAllStates(var13.copy(), -37);
          var13.rotateClockwise();
          var19 = new StatefulTextPainter(var4, true);
          var19.setSpriteForAllStates(var13, -107);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(MidiPcmStream param0, PlatformTaskDispatcher param1, java.awt.Component param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        try {
          AudioOutput.configure(param7, param6, 10);
          MidiNoteMixer.field_s = AudioOutput.createOutput(param1, param2, 0, param3);
          CacheEntry.field_D = AudioOutput.createOutput(param1, param2, 1, param5);
          SpaceObject.field_d = new PcmStreamMixer();
          BallEvent.field_b = param5 * 1000 / param7;
          CacheEntry.field_D.setRootStream(SpaceObject.field_d);
          RankingsScreen.field_N = param0;
          RankingsScreen.field_N.setMasterVolume(TranslatedUiText.field_h, (byte) -26);
          MidiNoteMixer.field_s.setRootStream(RankingsScreen.field_N);
          if (param4) {
            UiTheme.isRenderableCharacter('`', (byte) -1);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nq.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public UiTheme() {
        this.wrapTooltips = true;
    }

    static {
    }
}
