/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private BitmapFont field_i;
    private boolean field_n;
    static int[] field_j;
    private String field_g;
    private int field_m;
    private int field_l;
    static EmailValidationError field_p;
    private int field_k;
    private int field_o;
    private int field_h;

    final void layoutRightAligned(BitmapFont font, String text, int rightX, int baselineY, byte guard) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          if (guard != 69) {
            BitmapFont var7 = (BitmapFont) null;
            TextLayoutLine discarded$0 = this.createSingleLine((String) null, 107, 116, (BitmapFont) null);
          }
          if (text == null) {
            this.lines = null;
            return;
          }
          if (font == this.field_i &&
            this.field_n &&
            this.field_l == 2 &&
            null != this.field_g &&
            this.field_g.equals(text)) {
            return;
          }
          this.field_l = 2;
          this.field_n = true;
          this.field_g = text;
          this.field_i = font;
          TextLayoutLine var9 = this.createSingleLine(text, baselineY, 116, font);
          TextLayoutLine var10 = var9;
          var10.insertionX[0] = -font.stringWidth(text) + rightX;
          var10.insertionX[text.length()] = rightX;
          ChatHistorySupport.fillJustifiedInsertionPositions(0, text, var10, font, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("wh.C(");
          if (font == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (text == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(rightX).append(',').append(baselineY).append(',').append(guard).append(')').toString());
        }
    }

    private final TextLayoutLine createSingleLine(String text, int baselineY, int guard, BitmapFont font) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          TextLayoutLine var6 = new TextLayoutLine(-font.maxAscent + baselineY, baselineY + font.maxDescent, text.length());
          TextLayoutLine var5 = var6;
          if (guard <= 112) {
            field_j = (int[]) null;
          }
          this.lines = new TextLayoutLine[]{var6};
          TextLayoutLine stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("wh.B(");
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(baselineY).append(',').append(guard).append(',');
          if (font == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void layoutWrapped(int height, String text, BitmapFont font, int width, int horizontalAlignment, int verticalAlignment, int lineSpacing, byte guard) {
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        String stackIn_46_2 = null;
        String stackIn_49_2 = null;
        int var11 = 0;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (lineSpacing == 0) {
            lineSpacing = font.lineHeight;
          }
          if (text == null) {
            this.lines = null;
            return;
          }
          if (this.field_i == font &&
            !this.field_n &&
            horizontalAlignment == this.field_l &&
            verticalAlignment == this.field_h &&
            this.field_k == lineSpacing &&
            this.field_m == height &&
            width == this.field_o &&
            null != this.field_g &&
            this.field_g.equals(text)) {
            return;
          }
          this.field_g = text;
          this.field_h = verticalAlignment;
          this.field_k = lineSpacing;
          this.field_m = height;
          this.field_i = font;
          this.field_l = horizontalAlignment;
          this.field_o = width;
          this.field_n = false;
          String[] var17 = new String[font.wrappedLineCount(text, width) + 1];
          String[] var18 = var17;
          int var10 = Math.max(1, font.wrapLines(text, new int[]{width}, var18));
          int var12 = 55 / ((guard - 65) / 32);
          if (this.field_h == 3 &&
            var10 == 1) {
            this.field_h = 1;
          }
          this.lines = new TextLayoutLine[var10];
          if (this.field_h == 0) {
            var11 = font.maxAscent;
          } else if (this.field_h == 1) {
            var11 = (-(this.field_k * var10) + this.field_m >> 1) + font.maxAscent;
          } else if (2 != this.field_h) {
            int var13 = (-(var10 * this.field_k) + this.field_m) / (var10 + 1);
            if (0 > var13) {
              var13 = 0;
            }
            this.field_k = this.field_k + var13;
            var11 = font.maxAscent + var13;
          } else {
            var11 = -font.maxDescent + (this.field_m - var10 * this.field_k);
          }
          for (int var13Lifetime1 = 0; var10 > var13Lifetime1; var13Lifetime1++) {
            String var14 = var17[var13Lifetime1];
            TextLayoutLine stackIn_35_0 = null;
            TextLayoutLine stackIn_35_1 = null;
            int stackIn_35_2 = var11 - font.maxAscent;
            int stackIn_35_3 = var11 + font.maxDescent;
            if (var14 != null) {
              stackIn_36_4 = var14.length();
            } else {
              TextLayoutLine stackIn_36_0 = null;
              TextLayoutLine stackIn_36_1 = null;
              stackIn_36_4 = 0;
            }
            TextLayoutLine var15 = new TextLayoutLine(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var15.insertionX[0] = 0;
            if (var14 != null) {
              var15.insertionX[var14.length()] = font.stringWidth(var14);
              if (3 != horizontalAlignment) {
                stackIn_40_0 = 0;
              } else {
                stackIn_40_0 = this.justificationSpacingQ8(-21446, font.stringWidth(var14), var14, width);
              }
              ChatHistorySupport.fillJustifiedInsertionPositions(stackIn_40_0, var14, var15, font, false);
            }
            this.lines[var13Lifetime1] = var15;
            var11 = var11 + lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_45_0 = var9;
          StringBuilder stackIn_45_1 = new StringBuilder().append("wh.D(").append(height).append(',');
          if (text == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          StringBuilder stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (font == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(width).append(',').append(horizontalAlignment).append(',').append(verticalAlignment).append(',').append(lineSpacing).append(',').append(guard).append(')').toString());
        }
    }

    final void layoutLeftAligned(String text, int guard, int leftX, int baselineY, BitmapFont font) {
        if (text == null) {
          this.lines = null;
          return;
        }
        if (this.field_i == font && this.field_n && this.field_l == 0 && null != this.field_g &&
          this.field_g.equals(text)) {
          return;
        }
        try {
          this.field_g = text;
          this.field_l = 0;
          this.field_i = font;
          this.field_n = true;
          TextLayoutLine var7 = this.createSingleLine(text, baselineY, guard + 117, font);
          TextLayoutLine var8 = var7;
          var7.insertionX[0] = leftX;
          var8.insertionX[text.length()] = leftX + font.stringWidth(text);
          ChatHistorySupport.fillJustifiedInsertionPositions(guard, text, var8, font, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wh.A(" + (text != null ? "{...}" : "null") + ',' + guard + ',' + leftX + ',' + baselineY + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        field_p = null;
        if (!guard) {
          CachedTextLayout.releaseStatics(true);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final void layoutCentered(String text, int centerX, BitmapFont font, int baselineY, boolean guard) {
        if (text == null) {
          this.lines = null;
          return;
        }
        if (font == this.field_i &&
          this.field_n &&
          this.field_l == 1 &&
          this.field_g != null &&
          this.field_g.equals(text)) {
          return;
        }
        try {
          this.field_i = font;
          this.field_n = guard ? true : false;
          this.field_l = 1;
          TextLayoutLine var8 = this.createSingleLine(text, baselineY, 117, font);
          int var7 = font.stringWidth(text);
          var8.insertionX[0] = -(var7 >> 1) + centerX;
          var8.insertionX[text.length()] = (var7 >> 1) + centerX;
          ChatHistorySupport.fillJustifiedInsertionPositions(0, text, var8, font, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wh.F(" + (text != null ? "{...}" : "null") + ',' + centerX + ',' + (font != null ? "{...}" : "null") + ',' + baselineY + ',' + guard + ')');
        }
    }

    public CachedTextLayout() {
    }

    static {
        field_p = new EmailValidationError();
    }
}
