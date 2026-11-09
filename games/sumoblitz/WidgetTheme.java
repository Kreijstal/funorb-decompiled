/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetTheme {
    WidgetRenderer checkboxRenderer;
    int tooltipPaddingLeft;
    int tooltipPaddingBottom;
    static String instructionsText;
    WidgetRenderer field_f;
    int tooltipLineHeight;
    int tooltipBackgroundColor;
    private int tooltipTextColor;
    WidgetRenderer textInputRenderer;
    int tooltipPaddingTop;
    WidgetRenderer field_j;
    int field_g;
    LegacyBitmapFont font;
    static int[] field_c;
    WidgetRenderer labelRenderer;
    int field_a;
    WidgetRenderer field_p;
    int field_b;
    private boolean wrapTooltips;
    WidgetRenderer field_n;
    int tooltipBorderColor;
    int tooltipPaddingRight;

    final static dk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_7_0 = null;
        dk stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = -62 / ((-57 - param0) / 48);
          var4 = 0;
          while (true) {
            if (var4 >= var2_int) {
              stackIn_10_0 = gs.field_a;
              return stackIn_10_0;
            }
            var5 = param1.charAt(var4);
            if (var5 < 48) {
              return null;
            }
            if (var5 <= 57) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_7_0 = null;
          return (dk) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("cp.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void drawTooltip(int y, int guard, int x, String text) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (guard != 13421772) {
            this.a(104, 13, -85, (byte) 98, -17);
          }
          if (!this.wrapTooltips) {
            this.drawSingleLineTooltip(y, text, x, -22699);
          } else {
            this.drawWrappedTooltip(x, text, -84, y);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cp.F(").append(y).append(',').append(guard).append(',').append(x).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        kw.a(param0, param2, 1, param1, param4);
        if (param3 > -57) {
          String var7 = (String) null;
          this.drawTooltip(-116, 1, -84, (String) null);
        }
    }

    private final void drawSingleLineTooltip(int y, String text, int x, int guard) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (guard != -22699) {
            this.field_a = 76;
          }
          var5_int = this.font.a(text);
          var6 = this.font.field_y + this.font.field_I;
          var7 = x;
          if (var7 + var5_int + 6 > SoftwareRasterizer.width) {
            var7 = SoftwareRasterizer.width - (var5_int + 6);
          }
          var8 = 32 - this.font.field_y + y;
          if (SoftwareRasterizer.height < 6 + (var8 + var6)) {
            var8 = -6 + SoftwareRasterizer.height - var6;
          }
          SoftwareRasterizer.drawRectangle(var7, var8, var5_int + 6, 6 + var6, this.tooltipTextColor);
          SoftwareRasterizer.fillRectangle(var7 + 1, var8 + 1, var5_int + 4, 4 + var6, this.tooltipBackgroundColor);
          this.font.b(text, var7 + 3, var8 + 3 + this.font.field_y, this.tooltipTextColor, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cp.H(").append(y).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(x).append(',').append(guard).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param3, param5, param1, param4, param0);
        if (param2) {
          this.field_f = (WidgetRenderer) null;
        }
    }

    final static byte[] copyBytes(byte[] bytes, int sourceOffset) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = bytes.length;
          var3 = new byte[var2_int];
          la.a(bytes, sourceOffset, var3, 0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("cp.C(");
          if (bytes == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(sourceOffset).append(')').toString());
        }
    }

    private final void drawWrappedTooltip(int x, String text, int guard, int y) {
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
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = this.tooltipPaddingLeft + this.tooltipPaddingRight;
          var6 = this.tooltipPaddingTop + this.tooltipPaddingBottom;
          var7 = this.tooltipLineHeight;
          if (var7 == -1) {
            var7 = this.font.field_I + this.font.field_s;
          }
          var8 = SoftwareRasterizer.width >> 2;
          var9 = this.font.a(text);
          var10 = this.font.field_s + this.font.field_I;
          var11 = 1;
          if (var9 > var8 ||
            text.indexOf("<br>") != -1) {
            if (var8 < var9) {
              var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
            } else {
              var12 = var8;
            }
            if (null == qn.field_b) {
              qn.field_b = new String[16];
            }
            var11Lifetime1 = this.font.a(text, new int[]{var12}, qn.field_b);
            var9 = 0;
            var10 = var10 + var7 * (var11Lifetime1 - 1);
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.font.a(qn.field_b[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = x;
          var13Lifetime1 = 70 / ((74 - guard) / 40);
          if (SoftwareRasterizer.width < var5_int + var12 + var9) {
            var12 = -var5_int + SoftwareRasterizer.width - var9;
          }
          var14Lifetime1 = 32 + (-this.font.field_y + y);
          if (SoftwareRasterizer.height < var6 + var14Lifetime1 + var10) {
            var14Lifetime1 = -var10 + y - var6;
          }
          SoftwareRasterizer.drawRectangle(var12, var14Lifetime1, var9 + var5_int, var10 + var6, this.tooltipBorderColor);
          SoftwareRasterizer.fillRectangle(var12 + 1, 1 + var14Lifetime1, var5_int + var9 - 2, var6 + var10 - 2, this.tooltipBackgroundColor);
          this.font.a(text, var12 + this.tooltipPaddingLeft, var14Lifetime1 + this.tooltipPaddingTop, var9, var10, this.tooltipTextColor, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("cp.E(").append(x).append(',');
          if (text == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(guard).append(',').append(y).append(')').toString());
        }
    }

    final void initializeDefaultStyles(LegacyBitmapFont font, byte guard) {
        TextWidgetRenderer var17 = null;
        fl var4 = null;
        Sprite[] var5 = null;
        mg var16 = null;
        mg var18 = null;
        int var7_int = 0;
        fl var6 = null;
        fl var7 = null;
        va discarded$0 = null;
        iu discarded$1 = null;
        fl var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        fl var11 = null;
        fl var12 = null;
        Sprite var13 = null;
        fl var14 = null;
        fl var19 = null;
        int var15 = Sumoblitz.field_L ? 1 : 0;
        fl var14Lifetime1;
        fl var14Lifetime2;
        try {
          var17 = new TextWidgetRenderer(font, 2, 2, 2236962, 1, 1, 1, font.field_I + (font.field_s + 2));
          this.labelRenderer = (WidgetRenderer) ((Object) var17);
          var17.textColor = 16777215;
          var4 = new fl();
          var17.copyStyleTo(var4, -102);
          this.tooltipPaddingTop = 3;
          this.tooltipPaddingBottom = 3;
          this.tooltipPaddingLeft = 3;
          this.tooltipBackgroundColor = 5592405;
          this.font = font;
          var4.caretColor = 15658734;
          this.tooltipBorderColor = 15658734;
          this.tooltipPaddingRight = 3;
          this.tooltipTextColor = 15658734;
          this.tooltipLineHeight = -1;
          var4.selectionColor = 11711154;
          var4.a(false, 0).c(15658734, 17818).a(FontMetrics.a(8947848, 92, 10066329, 7829367), 2147483647);
          var4.a(false, 1).a(FontMetrics.a(11184810, 126, 10066329, 13421772), 2147483647);
          var4.a(false, 3).a(FontMetrics.a(8947848, 97, 7829367, 10066329), 2147483647).a(1, -1).b(1, 1);
          var5 = new Sprite[9];
          var16 = new mg(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          if (guard >= -37) {
            this.checkboxRenderer = (WidgetRenderer) null;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.a(false, 4).a(true, true).a(var5, 2147483647);
          var4.a(false, 5).a(HardwareTurbulentWaterNoise.a((byte) -71, 0, 65793, 0, 0), 2147483647).a(true, true).c(-1, 17818);
          this.textInputRenderer = (WidgetRenderer) ((Object) var4);
          var6 = new fl(var4, true);
          var6.horizontalAlignment = 0;
          var7 = new fl(var4, true);
          var7.horizontalAlignment = 0;
          var7.a(OpenGlBuffer.a(8947848, -115), 28715);
          var7.a(false, 1).a(OpenGlBuffer.a(11184810, -125), 2147483647).c(2236962, 17818);
          this.checkboxRenderer = (WidgetRenderer) ((Object) new CheckboxRenderer(font, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new va(font, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new iu(font, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new fl();
          var17.copyStyleTo(var8, 107);
          var8.a(false, 0).a(FontMetrics.a(15658734, 102, 7829367, 10066329), 2147483647).c(1118481, 17818).d(-1, 30149);
          var8.a(false, 4).a(true, true).a(var5, 2147483647);
          this.field_j = (WidgetRenderer) ((Object) var8);
          var9 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10 = new Sprite[9];
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new fl();
          var12 = new fl();
          var11.a((byte) 116, var9, 0);
          var12.a((byte) 115, var10, 0);
          this.field_f = (WidgetRenderer) ((Object) var12);
          this.field_p = (WidgetRenderer) ((Object) var4);
          var13 = new Sprite(7, 4);
          this.field_g = 10;
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new fl(var4, true);
          var14.a(-84, var13.copy());
          var13.rotateClockwise();
          var14Lifetime1 = new fl(var4, true);
          var14Lifetime1.a(30, var13.copy());
          var13.rotateClockwise();
          var14Lifetime2 = new fl(var4, true);
          var14Lifetime2.a(111, var13.copy());
          var13.rotateClockwise();
          var19 = new fl(var4, true);
          var19.a(-29, var13);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cp.I(" + (font != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 111) {
          return;
        }
        field_c = null;
        instructionsText = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        SoftwareRasterizer.fillRectangleAlpha(param4, param6, param5, param2, param3, param0);
        if (param1 != 3) {
          byte[] var9 = (byte[]) null;
          WidgetTheme.copyBytes((byte[]) null, -45);
        }
    }

    final void b(byte param0) {
        ClientException.a((byte) -59);
        if (param0 >= -63) {
          byte[] var3 = (byte[]) null;
          WidgetTheme.copyBytes((byte[]) null, 126);
        }
    }

    public WidgetTheme() {
        this.wrapTooltips = true;
    }

    static {
        field_c = new int[128];
        instructionsText = "Instructions";
    }
}
