/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PairedTextColumns extends LegacyTextBlock {
    static String field_r;
    private int rightColor;
    static String field_s;
    private String[] leftRows;
    private int leftColor;
    private String[] rightRows;

    final static void updateBrowserLinks(byte guard, java.applet.Applet applet) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var4 = applet.getCodeBase();
              String var3 = WeightedCacheEntry.withSessionParameters((byte) 104, applet, var4).getFile();
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 119, applet, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 107, applet, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
              if (guard != 15) {
                PairedTextColumns.releaseStatics(true);
              }
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 112, applet, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 110, applet, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 104, applet, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
              JavaScriptBridge.callWindowFunctionWithArguments((byte) 123, applet, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("gl.B(").append(guard).append(',');
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(boolean guard) {
        field_s = null;
        if (guard) {
          return;
        }
        field_r = null;
    }

    PairedTextColumns(String title, String[] leftRows, String[] rightRows) {
        super(title, leftRows);
        try {
          this.leftRows = leftRows;
          this.rightRows = rightRows;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (title != null ? "{...}" : "null") + ',' + (leftRows != null ? "{...}" : "null") + ',' + (rightRows != null ? "{...}" : "null") + ')');
        }
    }

    private final void updateColumns(byte guard) {
        int var2 = 15 % ((guard + 92) / 33);
        int var3 = 640;
        int var4 = this.maximumTextWidth(this.leftRows, 0);
        int var5 = this.maximumTextWidth(this.rightRows, 0);
        this.contentWidth = var4 + var5;
        this.columnSplitX = (-this.contentWidth + var3) / 2 + var4;
    }

    final static TextWidgetPainter defaultTextPainter(boolean guard) {
        if (!guard) {
          return (TextWidgetPainter) null;
        }
        if (null == ResizableModalPanel.field_U) {
          ResizableModalPanel.field_U = new TextWidgetPainter(ke.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, ke.field_c.maxAscent, -1, 2147483647, true);
        }
        return ResizableModalPanel.field_U;
    }

    final void configureColumns(int rightColor, int leftColor, int titleColor, byte guard, BinaryBitmapFont font) {
        super.configure(0, font, titleColor, -101);
        if (guard != -92) {
          return;
        }
        try {
          this.rightColor = rightColor;
          this.leftColor = leftColor;
          this.updateColumns((byte) 38);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gl.C(" + rightColor + ',' + leftColor + ',' + titleColor + ',' + guard + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawColumn(int guard, int baselineY, int alignment, String[] rows, int color) {
        String stackIn_22_2 = null;
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
          if (guard != -1) {
            PairedTextColumns.releaseStatics(true);
          }
          String[] var10 = rows;
          String[] var6 = var10;
          for (int var7 = 0; var7 < var10.length; var7++) {
            String var8 = var10[var7];
            if (var8 != null &&
              var8.length() > 0) {
              if (0 > alignment) {
                this.font.drawLeft(var8, this.columnSplitX, baselineY, color, -1);
              }
              if (0 < alignment) {
                this.font.drawRight(var8, this.columnSplitX, baselineY, color, -1);
              }
            }
            baselineY = baselineY + this.lineSpacing;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var6_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("gl.F(").append(guard).append(',').append(baselineY).append(',').append(alignment).append(',');
          if (rows == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(color).append(')').toString());
        }
    }

    final void draw(int y, int guard) {
        if (null == this.font) {
          return;
        }
        if (guard != 3) {
          PairedTextColumns.releaseStatics(false);
        }
        int var3 = this.font.maxAscent;
        y = y + var3;
        y = y + this.drawTitle(y, guard + 13944);
        this.drawColumn(-1, y, 1, this.leftRows, this.leftColor);
        this.drawColumn(-1, y, -1, this.rightRows, this.rightColor);
    }

    static {
        field_r = "Destroy all the alien infrastructure";
        field_s = "Retribution objectives";
    }
}
