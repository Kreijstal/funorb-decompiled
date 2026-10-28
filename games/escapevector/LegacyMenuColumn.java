/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyMenuColumn extends IntrusiveNode {
    static String[] field_o;
    private String[] rows;
    private int widthMode;
    static String[] field_g;
    private int rowCount;
    static long field_p;
    private BinaryBitmapFont font;
    private int y;
    static String field_n;
    private int selectedColor;
    private int textColor;
    private String header;
    private int x;

    private final int paddedWidth(byte guard, int contentWidth) {
        int var3 = this.doubleSpaceWidth(guard - 4093);
        int var4 = contentWidth + var3;
        int var5 = this.headerWidth(guard ^ -31);
        if (guard != 106) {
          BinaryBitmapFont var7 = (BinaryBitmapFont) null;
          this.configure((BinaryBitmapFont) null, -7, (byte) 1, 49);
        }
        int var6 = var4 < var5 ? var5 : var4;
        return var6;
    }

    private final int numberedWidth(byte guard) {
        int var2 = this.widestDigit((byte) 102);
        int var3 = 46;
        int var4 = this.font.charAdvance((char) var3);
        if (guard != -65) {
          this.setPosition(21, 106, -114);
        }
        int var5 = this.doubleSpaceWidth(-3987);
        int var6 = var5 + var4 + 2 * var2;
        return var6;
    }

    private final int rowHeight(int guard) {
        int var2 = un.a(this.font, 31512);
        int var3 = 0;
        if (guard != -1) {
          return -113;
        }
        var3 = var3 + var2;
        var3 += 2;
        return var3;
    }

    final void configure(BinaryBitmapFont font, int selectedColor, byte guard, int textColor) {
        try {
          this.font = font;
          this.selectedColor = selectedColor;
          if (guard > -25) {
            int discarded$0 = this.twoDigitWidth(-42);
          }
          this.textColor = textColor;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "me.K(" + (font != null ? "{...}" : "null") + ',' + selectedColor + ',' + guard + ',' + textColor + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          field_o = (String[]) null;
        }
        field_g = null;
        field_n = null;
        field_o = null;
    }

    private final int drawRow(int selectedRow, int rowHeight, int x, int baselineY, int rowIndex, int guard) {
        boolean var7 = (rowIndex == selectedRow);
        int var8 = (!(var7)) ? this.textColor : this.selectedColor;
        if (null != this.rows[rowIndex]) {
          this.font.drawLeft(this.rows[rowIndex], x, baselineY, var8, -1);
        }
        if (guard != -17751) {
          this.x = -120;
        }
        baselineY = baselineY + rowHeight;
        return baselineY;
    }

    private final int fixedTextWidth(int guard) {
        int var2 = gi.a((byte) -96, this.font);
        if (guard != -407) {
          boolean[] var3 = (boolean[]) null;
          this.drawVisibleRows(100, (boolean[]) null, (byte) 94);
        }
        return this.paddedWidth((byte) 106, var2);
    }

    private final int headerAreaHeight(int topPadding) {
        int var2 = un.a(this.font, 31512);
        int var3 = 0;
        var3 = var3 + topPadding;
        var3 = var3 + var2;
        var3 += 2;
        var3 += 2;
        return var3;
    }

    private final void drawVisibleRowsInternal(int selectedRow, boolean guard, boolean[] visibleRows) {
        String stackIn_13_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var4_int = this.x;
          int var5 = this.headerAreaHeight(2);
          int var6 = this.rowHeight(-1);
          int var7 = var5 + (this.y + uc.a(-1, this.font));
          if (!guard) {
            int discarded$1 = this.widestDigit((byte) 22);
          }
          for (int var8 = 0; var8 < this.rows.length; var8++) {
            boolean var9 = (visibleRows[var8]);
            if (var9) {
              var7 = this.drawRow(selectedRow, var6, var4_int, var7, var8, -17751);
            } else {
              var7 = var7 + var6;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("me.N(").append(selectedRow).append(',').append(guard).append(',');
          if (visibleRows == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void draw(int guard, int selectedRow) {
        this.drawHeader(-115);
        if (guard != -6131) {
          this.selectedColor = -63;
        }
        this.drawRows(3, selectedRow);
    }

    final void drawVisibleRows(int selectedRow, boolean[] visibleRows, byte guard) {
        String stackIn_12_2 = null;
        try {
          if (guard != 48) {
            return;
          }
          if (visibleRows != null &&
            this.rowCount == visibleRows.length) {
            this.drawHeader(-128);
            this.drawVisibleRowsInternal(selectedRow, true, visibleRows);
            return;
          }
          this.draw(-6131, selectedRow);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("me.P(").append(selectedRow).append(',');
          if (visibleRows == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    final int width(byte guard) {
        if (0 == this.widthMode) {
          return this.numberedWidth((byte) -65);
        }
        if (this.widthMode == 1) {
          return this.fixedTextWidth(guard - 280);
        }
        if (guard != -127) {
          int discarded$0 = this.headerAreaHeight(21);
        }
        if (this.widthMode == 2) {
          return this.textWidth((byte) -124);
        }
        if (3 == this.widthMode) {
          return this.twoDigitWidth(guard ^ -126);
        }
        return 0;
    }

    final int height(byte guard) {
        if (guard <= 78) {
          this.x = 56;
        }
        int var2 = 0;
        var2 = var2 + this.headerAreaHeight(2);
        int var3 = this.rowHeight(-1);
        var2 = var2 + this.rowCount * var3;
        return var2;
    }

    private final void drawHeader(int guard) {
        if (guard >= -22) {
          this.widthMode = 104;
        }
        if (this.header == null) {
          return;
        }
        int var2 = this.x;
        int var3 = this.y - (-2 - uc.a(-1, this.font));
        this.font.drawLeft(this.header, var2, var3, this.textColor, -1);
        int var4 = this.font.stringWidth(this.header);
        SoftwareRasterizer.fillRectangle(var2, var3, var4, 2, this.textColor);
    }

    private final int textWidth(byte guard) {
        int var8 = EscapeVector.obfuscationControl;
        int var2 = 0;
        int var4 = -23 % ((-68 - guard) / 56);
        String[] var3 = this.rows;
        for (int var5 = 0; var3.length > var5; var5++) {
          String var6 = var3[var5];
          int var7 = this.font.stringWidth(var6);
          if (var2 < var7) {
            var2 = var7;
          }
        }
        return this.paddedWidth((byte) 106, var2);
    }

    private final int widestDigit(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = 0;
        for (int var3 = 0; var3 <= 9; var3++) {
          int var4 = Character.forDigit(var3, 10);
          int var5 = this.font.charAdvance((char) var4);
          if (var5 > var2) {
            var2 = var5;
          }
        }
        if (guard <= 92) {
          int discarded$0 = this.twoDigitWidth(7);
        }
        return var2;
    }

    private final int twoDigitWidth(int guard) {
        int var2 = this.widestDigit((byte) 123);
        int var3 = this.doubleSpaceWidth(guard - 3990);
        if (guard != 3) {
          this.header = (String) null;
        }
        int var4 = var3 + var2 * 2;
        int var5 = this.headerWidth(guard - 113);
        int var6 = var5 <= var4 ? var4 : var5;
        return var6;
    }

    private final void drawRows(int guard, int selectedRow) {
        int var8 = EscapeVector.obfuscationControl;
        int var3 = this.x;
        int var4 = this.headerAreaHeight(2);
        int var5 = this.rowHeight(-1);
        int var6 = var4 + this.y + uc.a(-1, this.font);
        int var7 = 0;
        if (guard != 3) {
          int discarded$0 = this.drawRow(-111, -60, -104, -15, 22, -100);
        }
        while (this.rows.length > var7) {
          var6 = this.drawRow(selectedRow, var5, var3, var6, var7, -17751);
          var7++;
        }
    }

    private final int doubleSpaceWidth(int guard) {
        int var2 = 32;
        if (guard != -3987) {
          int discarded$0 = this.fixedTextWidth(-81);
        }
        int var3 = this.font.charAdvance((char) var2);
        return var3 * 2;
    }

    final void setPosition(int x, int y, int guard) {
        this.x = x;
        if (guard != 0) {
          return;
        }
        this.y = y;
    }

    private final int headerWidth(int guard) {
        if (null == this.header) {
          return 0;
        }
        int var2 = this.font.stringWidth(this.header);
        if (guard > -102) {
          return 31;
        }
        int var3 = this.doubleSpaceWidth(-3987);
        return var2 + var3;
    }

    LegacyMenuColumn(int rowCount) {
        this.rowCount = rowCount;
        this.widthMode = 0;
        this.rows = new String[this.rowCount];
        String var2 = ".";
        for (int var3 = 0; this.rowCount > var3; var3++) {
          int var4 = 1 + var3;
          String var5 = Integer.toString(var4) + var2;
          this.rows[var3] = var5;
        }
    }

    LegacyMenuColumn(String header, String[] rows, int widthMode) {
        try {
          this.widthMode = 2;
          this.header = header;
          this.rows = rows;
          if (widthMode == 1) {
            this.widthMode = 1;
          }
          this.rowCount = this.rows.length;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "me.<init>(" + (header != null ? "{...}" : "null") + ',' + (rows != null ? "{...}" : "null") + ',' + widthMode + ')');
        }
    }

    LegacyMenuColumn(String header, int[] values) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          this.widthMode = 3;
          this.header = header;
          this.rowCount = values.length;
          this.rows = new String[this.rowCount];
          for (int var3_int = 0; var3_int < this.rowCount; var3_int++) {
            int var4 = values[var3_int];
            Object var5 = Integer.toString(var4);
            if (var4 < 0) {
              var5 = null;
            }
            this.rows[var3_int] = (String) (var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3;
          StringBuilder stackIn_9_1 = new StringBuilder().append("me.<init>(");
          if (header == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (values == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_o = new String[]{"Congratulations, commander. You have recovered Earth's most advanced technologies from the mysterious aliens.", "Unfortunately, the aliens had time to analyze and duplicate some of our stolen weapons technology.", "They are now quickly amassing an armada, ready to strike at Earth.", "Earth's defences need time to prepare for repelling the alien invasion.", "Given your location in the alien home system, you have been ordered to do all in your powers to delay the alien arms build-up, and give Earth time to prepare."};
        field_p = 0L;
        field_g = new String[]{"Excellent work, commander. You have retrieved all of our technology from the sun-baked moon orbiting the innermost planet.", "Our next destination is an icy moon orbiting the aliens' home world.<br><br>Information about this moon is sketchy, but you should expect the alien defences to be considerably stronger here."};
        field_n = "This entry doesn't match";
    }
}
