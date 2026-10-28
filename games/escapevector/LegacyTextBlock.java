/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LegacyTextBlock {
    int contentWidth;
    private int titleGap;
    BinaryBitmapFont font;
    private int titleCenterX;
    private String[] paragraphs;
    private String title;
    static IntrusiveDeque field_n;
    static int field_a;
    private int bodyColor;
    private int height;
    private int titleColor;
    int columnSplitX;
    static String field_l;
    int lineSpacing;
    static int[] field_p;
    static String field_c;

    void configure(int bodyColor, BinaryBitmapFont font, int titleColor, int guard) {
        try {
          int var5_int = 107 / ((guard - 47) / 60);
          this.titleColor = titleColor;
          this.bodyColor = bodyColor;
          this.font = font;
          this.updateLayout((byte) 102);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jl.D(" + bodyColor + ',' + (font != null ? "{...}" : "null") + ',' + titleColor + ',' + guard + ')');
        }
    }

    final int maximumTextWidth(String[] lines, int firstLine) {
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.font == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (lines == null) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (lines.length == 0) {
            int stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          int var3_int = 0;
          String[] var4 = lines;
          for (int var5 = firstLine; var4.length > var5; var5++) {
            String var6 = var4[var5];
            int var7 = this.font.stringWidth(var6);
            if (var3_int <= var7) {
              var3_int = var7;
            }
          }
          int stackIn_19_0 = var3_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("jl.M(");
          if (lines == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(firstLine).append(')').toString());
        }
    }

    private final void updateLayout(byte guard) {
        int var2 = 640;
        if (guard <= 39) {
          field_c = (String) null;
        }
        this.columnSplitX = var2 / 2;
        this.titleCenterX = var2 / 2;
        this.contentWidth = var2 * 3 / 4;
        this.lineSpacing = this.fontHeight((byte) 111);
        this.titleGap = this.lineSpacing / 2;
        this.height = this.lineSpacing + (this.titleGap + this.paragraphsHeight(this.paragraphs, (byte) 113));
    }

    final static void writeBrowserSessionMarker(int guard) {
        se.writeBrowserSessionMarker((byte) 86, PointCloudEffect.d((byte) -91));
        if (guard != 2) {
          LegacyTextBlock.releaseStatics(8);
        }
    }

    public static void releaseStatics(int guard) {
        field_n = null;
        if (guard != -30082) {
          LegacyTextBlock.releaseStatics(113);
        }
        field_l = null;
        field_p = null;
        field_c = null;
    }

    final int drawTitle(int baselineY, int guard) {
        if (this.font == null) {
          return baselineY;
        }
        if (this.title == null) {
          return baselineY;
        }
        if (this.title.length() == 0) {
          return baselineY;
        }
        this.font.drawCentered(this.title, this.titleCenterX, baselineY, this.titleColor, -1);
        if (guard != 13947) {
          return 12;
        }
        return this.lineSpacing + this.titleGap;
    }

    final int contentWidth(boolean guard) {
        if (!guard) {
          this.lineSpacing = 117;
        }
        return this.contentWidth;
    }

    private final void drawParagraphs(boolean guard, int baselineY) {
        int var16 = EscapeVector.obfuscationControl;
        if (this.font == null) {
          return;
        }
        if (this.paragraphs == null) {
          return;
        }
        if (this.paragraphs.length == 0) {
          return;
        }
        String[] var17 = this.paragraphs;
        if (!guard) {
          this.translateX((byte) 91, 82);
        }
        for (int var4 = 0; var17.length > var4; var4++) {
          String var5 = var17[var4];
          if (var5 != null &&
            var5.length() != 0) {
            int var6 = 640;
            int var7 = (-this.contentWidth + var6) / 2;
            int var8 = baselineY - this.font.maxAscent;
            int var9 = this.contentWidth;
            int var10 = this.bodyColor;
            int var11 = -1;
            int var12 = 1;
            int var13 = 0;
            int var14 = this.lineSpacing;
            int var15 = this.font.drawParagraph(var5, var7, var8, var9, baselineY, var10, var11, var12, var13, var14);
            baselineY = baselineY + var15 * this.lineSpacing;
          }
        }
    }

    final void translateX(byte guard, int offset) {
        this.columnSplitX = this.columnSplitX + offset;
        this.titleCenterX = this.titleCenterX + offset;
        if (guard > -64) {
          this.lineSpacing = 52;
        }
    }

    final int height(byte guard) {
        if (guard != -90) {
          this.updateLayout((byte) -46);
        }
        return this.height;
    }

    private final int paragraphsHeight(String[] paragraphs, byte guard) {
        String stackIn_28_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.font == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (paragraphs == null) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (paragraphs.length == 0) {
            int stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          if (guard <= 97) {
            this.height = 12;
          }
          int var3_int = 0;
          String[] var4 = paragraphs;
          for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6 != null &&
              0 != var6.length()) {
              int var7 = this.font.wrappedLineCount(var6, this.contentWidth);
              var3_int = var3_int + var7 * this.lineSpacing;
            }
          }
          int stackIn_24_0 = var3_int;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var3;
          StringBuilder stackIn_27_1 = new StringBuilder().append("jl.J(");
          if (paragraphs == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(guard).append(')').toString());
        }
    }

    final int fontHeight(byte guard) {
        if (guard <= 98) {
          return -42;
        }
        int var2 = 0;
        if (this.font != null) {
          var2 = this.font.maxAscent + this.font.maxDescent;
        } else {
          var2 = 0;
        }
        return var2;
    }

    void draw(int y, int guard) {
        if (null == this.font) {
          return;
        }
        int var3 = this.font.maxAscent;
        y = y + var3;
        y = y + this.drawTitle(y, 13947);
        this.drawParagraphs(true, y);
        if (guard != 3) {
          this.font = (BinaryBitmapFont) null;
        }
    }

    LegacyTextBlock(String title, String[] paragraphs) {
        try {
          if (title != null) {
            this.title = title.toUpperCase();
          }
          this.paragraphs = paragraphs;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (title != null ? "{...}" : "null") + ',' + (paragraphs != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 35;
        field_n = new IntrusiveDeque();
        field_l = "Please try again in a few minutes.";
        field_p = new int[8192];
        field_c = "Restarting level";
    }
}
