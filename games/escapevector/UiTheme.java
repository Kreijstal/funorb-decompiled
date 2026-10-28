/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiTheme {
    int tooltipLeftPadding;
    static int field_n;
    WidgetPainter editableTextPainter;
    WidgetPainter checkboxPainter;
    int tooltipBackgroundColor;
    static String field_s;
    WidgetPainter buttonPainter;
    private boolean wrapTooltips;
    int tooltipTopPadding;
    BitmapFont tooltipFont;
    int tooltipBorderColor;
    int tooltipLineSpacing;
    private int tooltipTextColor;
    WidgetPainter field_b;
    WidgetPainter componentPainter;
    static Sprite field_e;
    int tooltipRightPadding;
    int tooltipBottomPadding;
    static PcmSample field_g;

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2) {
        try {
          ThreeSliceButtonPainter.field_x = param0;
          ModeProgressSupport.field_e = param1;
          if (param2 != -96) {
            UiTheme.a(-27);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uf.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 < 2) {
          return false;
        }
        return EmailAvailabilityValidator.field_o == MeshMaterial.field_b ? true : false;
    }

    private final void drawWrappedTooltip(int x, int guard, int y, String text) {
        String stackIn_32_2 = null;
        int var12 = 0;
        int var15 = EscapeVector.obfuscationControl;
        try {
          int var5_int = this.tooltipRightPadding + this.tooltipLeftPadding;
          int var6 = this.tooltipTopPadding + this.tooltipBottomPadding;
          int var7 = this.tooltipLineSpacing;
          if (var7 == -1) {
            var7 = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          }
          int var8 = SoftwareRasterizer.width >> 2;
          int var9 = this.tooltipFont.stringWidth(text);
          int var10 = this.tooltipFont.maxDescent + this.tooltipFont.maxAscent;
          int var11 = 1;
          if (var8 < var9 ||
            text.indexOf("<br>") != -1) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              int var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
            }
            if (null == InputGlyphSupport.field_c) {
              InputGlyphSupport.field_c = new String[16];
            }
            int var11Lifetime1 = this.tooltipFont.wrapLines(text, new int[]{var12}, InputGlyphSupport.field_c);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (int var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              int var14 = this.tooltipFont.stringWidth(InputGlyphSupport.field_c[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = x;
          if (var9 + var12 + var5_int > SoftwareRasterizer.width) {
            var12 = SoftwareRasterizer.width - var9 - var5_int;
          }
          int var13Lifetime1 = 32 + (-this.tooltipFont.capHeight + y);
          if (var6 + (var13Lifetime1 + var10) > SoftwareRasterizer.height) {
            var13Lifetime1 = -var10 + (y - var6);
          }
          SoftwareRasterizer.drawRectangle(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.tooltipBorderColor);
          SoftwareRasterizer.fillRectangle(1 + var12, var13Lifetime1 + 1, -2 + (var9 + var5_int), -2 + var6 + var10, this.tooltipBackgroundColor);
          if (guard <= 2) {
            return;
          }
          this.tooltipFont.drawParagraph(text, var12 + this.tooltipLeftPadding, this.tooltipTopPadding + var13Lifetime1, var9, var10, this.tooltipTextColor, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var5;
          StringBuilder stackIn_31_1 = new StringBuilder().append("uf.E(").append(x).append(',').append(guard).append(',').append(y).append(',');
          if (text == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (InstructionsScreen.field_q == EmailAvailabilityValidator.field_o) {
          return ResourceArchive.field_b;
        }
        if (param0 == 30519) {
          return NameAvailabilityResultSupport.field_g;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        UiTheme.a((ResourceArchive) null, (ResourceArchive) null, (byte) 91);
        return NameAvailabilityResultSupport.field_g;
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 <= 42) {
          return;
        }
        try {
          LinkButtonPainter.field_a = param2;
          SavedDataQuery.field_i = true;
          SavedDataRequestSupport.requestDialog = new AccountRequestDialog(Checkbox.field_F, RasterRestoreSupport.field_b, param1, DialWidget.field_H, LinkButtonPainter.field_a);
          Checkbox.field_F.pushPanel(SavedDataRequestSupport.requestDialog, 77);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uf.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void drawLine(int endX, int endY, int guard, int startX, int startY, int color) {
        if (guard == -29666) {
          SoftwareRasterizer.drawLine(startX, startY, endX, endY, color);
          return;
        }
        UiTheme.a(15);
        SoftwareRasterizer.drawLine(startX, startY, endX, endY, color);
    }

    final void initializePainters(int guard, BitmapFont font) {
        int var15 = EscapeVector.obfuscationControl;
        try {
          TextWidgetPainter var17 = new TextWidgetPainter(font, 2, 2, 2236962, 1, 1, 1, font.maxDescent + font.maxAscent + 2);
          this.componentPainter = (WidgetPainter) ((Object) var17);
          var17.textColor = 16777215;
          StatefulTextPainter var4 = new StatefulTextPainter();
          if (guard != -31476) {
            field_n = 115;
          }
          var17.copyStyleTo(var4, 77);
          this.tooltipTextColor = 15658734;
          this.tooltipBottomPadding = 3;
          this.tooltipBackgroundColor = 5592405;
          this.tooltipRightPadding = 3;
          this.tooltipTopPadding = 3;
          this.tooltipBorderColor = 15658734;
          this.tooltipLineSpacing = -1;
          this.tooltipLeftPadding = 3;
          var4.selectionColor = 11711154;
          var4.caretColor = 15658734;
          this.tooltipFont = font;
          var4.createStateLayer(0, (byte) -53).setTextColor(15658734, -22572).setFrameSprites(2, HuffmanDecoder.createFlatFrameTiles(8947848, 1, 10066329, 7829367));
          var4.createStateLayer(1, (byte) -53).setFrameSprites(2, HuffmanDecoder.createFlatFrameTiles(11184810, 1, 10066329, 13421772));
          var4.createStateLayer(3, (byte) -53).setFrameSprites(2, HuffmanDecoder.createFlatFrameTiles(8947848, 1, 7829367, 10066329)).setOffsetX(101, 1).setOffsetY(1, (byte) 102);
          Sprite[] var5 = new Sprite[9];
          ArgbSprite var16 = new ArgbSprite(32, 32);
          ArgbSprite var18 = var16;
          for (int var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.createStateLayer(4, (byte) -53).setFlushBeforeApply(guard ^ 31367, true).setFrameSprites(2, var5);
          var4.createStateLayer(5, (byte) -53).setFrameSprites(2, SavedCompletionFlags.createFrameSprites(65793, 0, 0, 0, 1317)).setFlushBeforeApply(guard + 31367, true).setTextColor(-1, -22572);
          this.buttonPainter = (WidgetPainter) ((Object) var4);
          StatefulTextPainter var6 = new StatefulTextPainter(var4, true);
          var6.horizontalAlignment = 0;
          StatefulTextPainter var7 = new StatefulTextPainter(var4, true);
          var7.horizontalAlignment = 0;
          var7.setFrameSpritesForAllStates(LoginPromptSupport.createCenterOnlyFrame(8947848, 46), guard + 31482);
          var7.createStateLayer(1, (byte) -53).setFrameSprites(2, LoginPromptSupport.createCenterOnlyFrame(11184810, 51)).setTextColor(2236962, -22572);
          this.checkboxPainter = (WidgetPainter) ((Object) new CheckboxPainter(font, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          DialWidgetPainter discarded$0 = new DialWidgetPainter(font, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          MarkerSliderPainter discarded$1 = new MarkerSliderPainter(font, 16777215, -1, 125269879, 4473924, 3, 268435455);
          StatefulTextPainter var8 = new StatefulTextPainter();
          var17.copyStyleTo(var8, 111);
          var8.createStateLayer(0, (byte) -53).setFrameSprites(2, HuffmanDecoder.createFlatFrameTiles(15658734, 1, 7829367, 10066329)).setTextColor(1118481, -22572).setShadowColor(-93, -1);
          var8.createStateLayer(4, (byte) -53).setFlushBeforeApply(-121, true).setFrameSprites(guard + 31478, var5);
          this.editableTextPainter = (WidgetPainter) ((Object) var8);
          Sprite[] var9 = new Sprite[9];
          Sprite[] var10 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10[4] = new Sprite(1, 2);
          Sprite dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          StatefulTextPainter var11 = new StatefulTextPainter();
          StatefulTextPainter var12 = new StatefulTextPainter();
          var11.setStateFrameSprites(var9, 0, (byte) -117);
          var12.setStateFrameSprites(var10, 0, (byte) -117);
          Sprite var13 = new Sprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          StatefulTextPainter var14 = new StatefulTextPainter(var4, true);
          var14.setSpriteForAllStates(var13.copy(), (byte) 74);
          var13.rotateClockwise();
          StatefulTextPainter var14Lifetime1 = new StatefulTextPainter(var4, true);
          var14Lifetime1.setSpriteForAllStates(var13.copy(), (byte) 118);
          var13.rotateClockwise();
          StatefulTextPainter var14Lifetime2 = new StatefulTextPainter(var4, true);
          var14Lifetime2.setSpriteForAllStates(var13.copy(), (byte) 78);
          var13.rotateClockwise();
          StatefulTextPainter var19 = new StatefulTextPainter(var4, true);
          var19.setSpriteForAllStates(var13, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uf.A(" + guard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    final void fillRectangleAlpha(int rectangleHeight, int guard, int alpha, int y, int rectangleWidth, int color, int x) {
        if (guard != 1) {
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(x, y, rectangleWidth, rectangleHeight, color, alpha);
    }

    final void drawTooltip(byte guard, String text, int x, int y) {
        String stackIn_9_2 = null;
        try {
          if (!this.wrapTooltips) {
            this.drawSingleLineTooltip(text, y, x, 16777215);
          } else {
            this.drawWrappedTooltip(x, 29, y, text);
          }
          if (guard < -29) {
            return;
          }
          this.fillRectangleAlpha(-88, -91, 122, 46, 47, -59, -12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("uf.F(").append(guard).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(x).append(',').append(y).append(')').toString());
        }
    }

    private final void drawSingleLineTooltip(String text, int y, int x, int guard) {
        String stackIn_12_2 = null;
        try {
          int var5_int = this.tooltipFont.stringWidth(text);
          int var6 = this.tooltipFont.maxDescent + this.tooltipFont.capHeight;
          int var7 = x;
          if (SoftwareRasterizer.width < 6 + var7 + var5_int) {
            var7 = -6 - var5_int + SoftwareRasterizer.width;
          }
          if (guard != 16777215) {
            return;
          }
          int var8 = y + (-this.tooltipFont.capHeight + 32);
          if (SoftwareRasterizer.height < var6 + (var8 + 6)) {
            var8 = SoftwareRasterizer.height - var6 - 6;
          }
          SoftwareRasterizer.drawRectangle(var7, var8, var5_int + 6, var6 + 6, this.tooltipTextColor);
          SoftwareRasterizer.fillRectangle(1 + var7, 1 + var8, 4 + var5_int, 4 + var6, this.tooltipBackgroundColor);
          this.tooltipFont.drawLeft(text, 3 + var7, var8 + 3 + this.tooltipFont.capHeight, this.tooltipTextColor, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("uf.C(");
          if (text == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(y).append(',').append(x).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard == -27204) {
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        UiTheme.a((ResourceArchive) null, (ResourceArchive) null, (byte) 55);
        field_g = null;
        field_e = null;
        field_s = null;
    }

    public UiTheme() {
        this.wrapTooltips = true;
    }

    static {
        field_s = "Quit";
    }
}
