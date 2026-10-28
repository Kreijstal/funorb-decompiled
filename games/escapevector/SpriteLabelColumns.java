/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteLabelColumns extends LegacyTextBlock {
    private String[] labels;
    private int labelColor;
    static int[] field_u;
    private SpriteStrip[] spriteRows;
    static String field_q;

    private final void drawLabels(byte guard, String[] labels, int baselineY, int color, int alignment) {
        String stackIn_25_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (this.font == null) {
            return;
          }
          if (labels == null) {
            return;
          }
          if (labels.length == 0) {
            return;
          }
          if (guard != -95) {
            return;
          }
          String[] var10 = labels;
          String[] var6 = var10;
          for (int var7 = 0; var7 < var10.length; var7++) {
            String var8 = var10[var7];
            if (var8 != null &&
              0 < var8.length()) {
              if (alignment < 0) {
                this.font.drawLeft(var8, this.columnSplitX, baselineY, color, -1);
              }
              if (alignment > 0) {
                this.font.drawRight(var8, this.columnSplitX, baselineY, color, -1);
              }
            }
            baselineY = baselineY + this.lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var6_ref;
          StringBuilder stackIn_24_1 = new StringBuilder().append("wd.B(").append(guard).append(',');
          if (labels == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(baselineY).append(',').append(color).append(',').append(alignment).append(')').toString());
        }
    }

    private final void updateColumns(int guard) {
        int var2 = 640;
        int var3 = this.maximumSpriteWidth(this.spriteRows, 0);
        int var4 = this.maximumTextWidth(this.labels, 0);
        int var5 = 90 / ((42 - guard) / 41);
        this.contentWidth = var4 + var3;
        this.columnSplitX = var3 + (var2 - this.contentWidth) / 2;
    }

    final void draw(int y, int guard) {
        if (null == this.font) {
          return;
        }
        int var3 = this.font.maxAscent;
        if (guard != 3) {
          return;
        }
        y = y + var3;
        y = y + this.drawTitle(y, guard ^ 13944);
        this.drawSpriteRows(y, this.spriteRows, (byte) -121);
        this.drawLabels((byte) -95, this.labels, y, this.labelColor, -1);
    }

    private final void drawSpriteRows(int baselineY, SpriteStrip[] rows, byte guard) {
        String stackIn_19_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (this.font == null) {
            return;
          }
          if (rows == null) {
            return;
          }
          if (0 == rows.length) {
            return;
          }
          int var4_int = this.font.maxAscent;
          baselineY = baselineY - var4_int;
          SpriteStrip[] var5 = rows;
          int var6 = 101 / ((guard + 57) / 55);
          for (int var7 = 0; var5.length > var7; var7++) {
            SpriteStrip var8 = var5[var7];
            if (var8 != null) {
              var8.draw(103, this.columnSplitX - var8.width(11384), baselineY);
            }
            baselineY = baselineY + this.lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var4;
          StringBuilder stackIn_18_1 = new StringBuilder().append("wd.E(").append(baselineY).append(',');
          if (rows == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    final void configure(int bodyColor, BinaryBitmapFont font, int titleColor, int guard) {
        try {
          super.configure(0, font, titleColor, -80);
          this.labelColor = bodyColor;
          int var5_int = 77 % ((guard - 47) / 60);
          this.updateColumns(126);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wd.D(" + bodyColor + ',' + (font != null ? "{...}" : "null") + ',' + titleColor + ',' + guard + ')');
        }
    }

    private final int maximumSpriteWidth(SpriteStrip[] rows, int minimumWidth) {
        String stackIn_20_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (rows == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (rows.length == 0) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          int var3_int = minimumWidth;
          for (int var4 = 0; var4 < rows.length; var4++) {
            SpriteStrip var5 = rows[var4];
            if (var5 != null) {
              var3_int = t.a(var5.width(11384), var3_int, 41);
            }
          }
          int stackIn_16_0 = var3_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var3;
          StringBuilder stackIn_19_1 = new StringBuilder().append("wd.A(");
          if (rows == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(minimumWidth).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_u = null;
        field_q = null;
        if (guard < 85) {
          SpriteLabelColumns.releaseStatics(-128);
        }
    }

    SpriteLabelColumns(String title, SpriteStrip[] spriteRows, String[] labels) {
        super(title, labels);
        try {
          this.labels = labels;
          this.spriteRows = spriteRows;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (title != null ? "{...}" : "null") + ',' + (spriteRows != null ? "{...}" : "null") + ',' + (labels != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new int[256];
        field_q = "Targets";
    }
}
