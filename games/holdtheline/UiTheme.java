/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiTheme {
    WidgetRenderer field_s;
    BitmapFont field_m;
    static String[] field_k;
    int field_n;
    WidgetRenderer field_p;
    static String field_h;
    int field_q;
    int field_g;
    static String field_a;
    int field_c;
    private int field_j;
    WidgetRenderer field_f;
    int field_b;
    WidgetRenderer field_d;
    int field_e;
    WidgetRenderer field_r;
    int field_i;
    static int field_o;
    private boolean field_l;

    final static CoverageBitmapFont loadNamedCoverageFont(String param0, String param1, ResourceArchive param2, byte param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ResourceArchive var7 = null;
        CoverageBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 35) {
            var7 = (ResourceArchive) null;
            UiTheme.loadNamedCoverageFont((String) null, (String) null, (ResourceArchive) null, (byte) -97, (ResourceArchive) null);
          }
          var5_int = param4.getGroupId(param0, 3);
          var6 = param4.getFileId(var5_int, param1, false);
          stackIn_3_0 = Cp1252CharacterRules.loadCoverageFont(var6, param4, param2, var5_int, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ga.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void drawWrappedTooltip(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = HoldTheLine.field_D;
        try {
          var5_int = this.field_i + this.field_b;
          var6 = this.field_e + this.field_n;
          var7 = this.field_g;
          if (-1 == var7) {
            var7 = this.field_m.ascent + this.field_m.descent;
          }
          var8 = SoftwareRasterizer.width >> 2;
          if (param0 != -90) {
            this.drawLine(-99, -111, (byte) -11, -66, 61, 51);
          }
          var9 = this.field_m.measureText(param2);
          var10 = this.field_m.descent + this.field_m.ascent;
          var11 = 1;
          if (var8 < var9 ||
            param2.indexOf("<br>") != -1) {
            if (AgeValidator.field_k == null) {
              AgeValidator.field_k = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
            }
            var11Lifetime1 = this.field_m.wrapLines(param2, new int[]{var12}, AgeValidator.field_k);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_m.measureText(AgeValidator.field_k[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param1;
          if (SoftwareRasterizer.width < var5_int + var9 + var12) {
            var12 = -var5_int + (-var9 + SoftwareRasterizer.width);
          }
          var13Lifetime1 = 32 + (-this.field_m.capitalHeight + param3);
          if (SoftwareRasterizer.height < var6 + (var10 + var13Lifetime1)) {
            var13Lifetime1 = -var6 - var10 + param3;
          }
          SoftwareRasterizer.drawRectangle(var12, var13Lifetime1, var5_int + var9, var6 + var10, this.field_c);
          SoftwareRasterizer.fillRectangle(var12 + 1, var13Lifetime1 + 1, var9 + var5_int - 2, -2 + (var10 + var6), this.field_q);
          this.field_m.drawParagraph(param2, var12 + this.field_i, this.field_n + var13Lifetime1, var9, var10, this.field_j, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawTooltip(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l) {
            this.drawWrappedTooltip((byte) -90, param2, param1, param3);
          } else {
            this.drawSimpleTooltip(-88, param2, param3, param1);
          }
          if (param0 == 7829367) {
            return;
          }
          var6 = (ResourceArchive) null;
          UiTheme.loadNamedCoverageFont((String) null, (String) null, (ResourceArchive) null, (byte) 115, (ResourceArchive) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ga.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawLine(int param0, int param1, byte param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param5, param1, param4, param3, param0);
        if (param2 != -53) {
          this.field_c = -35;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_k = null;
        field_a = null;
        if (param0 != 1) {
          return;
        }
        field_h = null;
    }

    final void fillRectangleAlpha(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 == 13421772) {
          SoftwareRasterizer.fillRectangleAlpha(param4, param2, param6, param3, param5, param0);
          return;
        }
        this.fillRectangleAlpha(-126, 95, 114, -63, -82, 84, 53);
        SoftwareRasterizer.fillRectangleAlpha(param4, param2, param6, param3, param5, param0);
    }

    public UiTheme() {
        this.field_l = true;
    }

    final void initializeStyles(BitmapFont param0, byte param1) {
        TextWidgetStyle var18 = null;
        LayeredButtonRenderer var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var17 = null;
        ArgbSprite var19 = null;
        int var7_int = 0;
        LayeredButtonRenderer var6 = null;
        LayeredButtonRenderer var7 = null;
        DialWidgetRenderer discarded$0 = null;
        MarkerSliderRenderer discarded$1 = null;
        LayeredButtonRenderer var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        LayeredButtonRenderer var11 = null;
        LayeredButtonRenderer var12 = null;
        Sprite var13 = null;
        LayeredButtonRenderer var14 = null;
        LayeredButtonRenderer var20 = null;
        int var15 = HoldTheLine.field_D;
        LayeredButtonRenderer var14Lifetime1;
        LayeredButtonRenderer var14Lifetime2;
        try {
          var18 = new TextWidgetStyle(param0, 2, 2, 2236962, 1, 1, 1, param0.ascent - (-param0.descent - 2));
          this.field_r = (WidgetRenderer) ((Object) var18);
          var18.field_c = 16777215;
          var4 = new LayeredButtonRenderer();
          var18.copyTo((byte) -123, var4);
          this.field_m = param0;
          this.field_j = 15658734;
          this.field_g = -1;
          var4.field_a = 15658734;
          this.field_i = 3;
          this.field_c = 15658734;
          this.field_e = 3;
          this.field_q = 5592405;
          this.field_b = 3;
          this.field_n = 3;
          var4.field_b = 11711154;
          var4.createStateStyle(0, 62).setTextColor(15658734, -26228).setBorderSprites(29536, ImageProducerRasterBuffer.createSolidBeveledPanel(7829367, 10066329, 8947848, 14));
          var4.createStateStyle(1, param1 ^ 76).setBorderSprites(29536, ImageProducerRasterBuffer.createSolidBeveledPanel(13421772, 10066329, 11184810, param1 - 25));
          var4.createStateStyle(3, 122).setBorderSprites(29536, ImageProducerRasterBuffer.createSolidBeveledPanel(10066329, 7829367, 8947848, 14)).setOffsetX(1, -116).setOffsetY(1, true);
          var5 = new Sprite[9];
          var17 = new ArgbSprite(32, 32);
          var19 = var17;
          for (var7_int = 0; var19.pixels.length > var7_int; var7_int++) {
            var17.pixels[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var19);
          var4.createStateStyle(4, -79).setFlushBeforeApply(true, param1 ^ -2147483609).setBorderSprites(29536, var5);
          var4.createStateStyle(5, -97).setBorderSprites(29536, EntitySound.createPanelBorderSprites(0, 0, 65793, -104, 0)).setFlushBeforeApply(true, -2147483648).setTextColor(-1, -26228);
          this.field_p = (WidgetRenderer) ((Object) var4);
          var6 = new LayeredButtonRenderer(var4, true);
          var6.field_i = 0;
          var7 = new LayeredButtonRenderer(var4, true);
          var7.field_i = 0;
          var7.setBorderSprites((byte) -2, BoundaryLoopTracer.createSolidNineSlice(8947848, (byte) -127));
          var7.createStateStyle(1, param1 + 75).setBorderSprites(param1 + 29497, BoundaryLoopTracer.createSolidNineSlice(11184810, (byte) 87)).setTextColor(2236962, -26228);
          this.field_f = (WidgetRenderer) ((Object) new CheckboxRenderer(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new DialWidgetRenderer(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MarkerSliderRenderer(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new LayeredButtonRenderer();
          var18.copyTo((byte) -124, var8);
          var8.createStateStyle(0, 61).setBorderSprites(29536, ImageProducerRasterBuffer.createSolidBeveledPanel(10066329, 7829367, 15658734, 14)).setTextColor(1118481, -26228).setShadowColor(-1, false);
          var8.createStateStyle(4, -90).setFlushBeforeApply(true, param1 ^ -2147483609).setBorderSprites(29536, var5);
          this.field_s = (WidgetRenderer) ((Object) var8);
          var9 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10 = new Sprite[9];
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new LayeredButtonRenderer();
          if (param1 != 39) {
            ResourceArchive var16 = (ResourceArchive) null;
            UiTheme.loadNamedCoverageFont((String) null, (String) null, (ResourceArchive) null, (byte) -94, (ResourceArchive) null);
          }
          var12 = new LayeredButtonRenderer();
          var11.setStateBorderSprites(var9, 6821, 0);
          var12.setStateBorderSprites(var10, 6821, 0);
          var13 = new Sprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new LayeredButtonRenderer(var4, true);
          var14.setIcon(var13.copy(), param1 - 39);
          var13.rotateClockwise();
          var14Lifetime1 = new LayeredButtonRenderer(var4, true);
          var14Lifetime1.setIcon(var13.copy(), 0);
          var13.rotateClockwise();
          var14Lifetime2 = new LayeredButtonRenderer(var4, true);
          var14Lifetime2.setIcon(var13.copy(), 0);
          var13.rotateClockwise();
          var20 = new LayeredButtonRenderer(var4, true);
          var20.setIcon(var13, 0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ga.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void drawSimpleTooltip(int param0, int param1, int param2, String param3) {
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
          var5_int = this.field_m.measureText(param3);
          var6 = this.field_m.descent + this.field_m.capitalHeight;
          var7 = param1;
          if (6 + var7 + var5_int > SoftwareRasterizer.width) {
            var7 = -6 - var5_int + SoftwareRasterizer.width;
          }
          if (param0 >= -72) {
            this.field_m = (BitmapFont) null;
          }
          var8 = 32 + (param2 - this.field_m.capitalHeight);
          if (SoftwareRasterizer.height < var6 + var8 + 6) {
            var8 = -6 + (-var6 + SoftwareRasterizer.height);
          }
          SoftwareRasterizer.drawRectangle(var7, var8, var5_int + 6, 6 + var6, this.field_j);
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, 4 + var5_int, 4 + var6, this.field_q);
          this.field_m.draw(param3, 3 + var7, 3 + var8 + this.field_m.capitalHeight, this.field_j, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ga.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_k = new String[]{"Click to view best times for the <col=1>Classic Championship</col>", "Click to view best times for the <col=1>Desert Championship</col>", "Click to view best times for the <col=1>Alpine Championship</col>", "Click to view best times for the <col=1>Night Championship</col>"};
        field_a = "Snowmobile";
        field_h = "Afterburner";
        field_o = 256;
    }
}
