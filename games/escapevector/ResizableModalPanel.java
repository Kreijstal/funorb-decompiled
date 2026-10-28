/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableModalPanel extends ModalPanel {
    static TextWidgetPainter field_U;
    static String field_T;
    private int targetHeight;
    private int resizeTick;
    private int initialHeight;
    private int resizeDuration;
    private int targetWidth;
    private int initialWidth;

    void finishTransition(boolean guard) {
        if (this.resizeDuration <= 0) {
          return;
        }
        this.resizeAndCenter(255, this.targetHeight, this.targetWidth);
        this.resizeDuration = 0;
        if (guard) {
          field_T = (String) null;
        }
        this.onResizeComplete(100);
    }

    final static Boolean takeEmailAvailabilityResponse(int guard) {
        if (guard != -9878) {
          ResizableModalPanel.takeEmailAvailabilityResponse(-90);
        }
        Boolean var1 = DialWidgetPainter.field_g;
        DialWidgetPainter.field_g = null;
        return var1;
    }

    void onResizeComplete(int guard) {
        int var2 = 15 / ((guard - 45) / 53);
    }

    public static void releaseStatics(byte guard) {
        if (guard != -112) {
          return;
        }
        field_T = null;
        field_U = null;
    }

    final static int minimumButtonY(LegacyButton[] buttons, byte guard) {
        String stackIn_17_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = 2147483647;
          if (guard != -122) {
            String var7 = (String) null;
            ResizableModalPanel.replaceAllLiteral((String) null, (String) null, (byte) -76, (String) null);
          }
          LegacyButton[] var3 = buttons;
          for (int var4 = 0; var3.length > var4; var4++) {
            LegacyButton var5 = var3[var4];
            if (var5.y < var2_int) {
              var2_int = var5.y;
            }
          }
          if (2147483647 != var2_int) {
            int stackIn_13_0 = var2_int;
            return stackIn_13_0;
          }
          int stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("vg.OB(");
          if (buttons == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
        }
    }

    void drawPanelBackground(int screenY, int screenX, byte guard) {
        int var16 = EscapeVector.obfuscationControl;
        SoftwareRasterizer.fillVerticalGradient(screenX + 6, screenY + 35, -12 + this.width, -40 + this.height, 2105376, 0);
        int var4 = 35;
        int var5 = 211;
        int var6 = 194;
        int var7 = 0;
        int var8 = screenY;
        while (var7 < var4) {
          if (SoftwareRasterizer.clipTop <= var8 &&
            var8 < SoftwareRasterizer.clipBottom) {
            int var9 = var7 * (var6 - var5) / var4 + var5;
            int var10 = 0;
            int var11 = this.width;
            if (20 >= var7) {
              while (var10 <= 20) {
                int var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  int var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  SoftwareRasterizer.pixels[SoftwareRasterizer.width * var8 - (-screenX - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              int var12Lifetime1 = var11;
              var11 -= 21;
              for (int var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                int var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    int var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer.pixels[SoftwareRasterizer.width * var8 + screenX + var11] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            SoftwareRasterizer.drawHorizontalLine(screenX + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        int var6Lifetime1 = 169;
        int var5Lifetime1 = 194;
        int var4Lifetime1 = 22;
        int var7Lifetime1 = 0;
        int var8Lifetime1 = screenY + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          int var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(screenX, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-6 + this.width + screenX, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ProgressRecord.field_j.drawTransparent(-90 + (screenX + this.width), 10 + screenY);
        LoginMethod.drawThreeSlice(5 + screenX, -10 + this.width, true, SecondaryNodeHashTable.field_a, 35 + screenY);
        LoginMethod.drawThreeSlice(screenX, this.width, true, bn.field_d, screenY + this.height - 22);
        int var5Lifetime2 = 169;
        int var4Lifetime2 = -79 + this.height;
        int var6Lifetime2 = 127;
        int var7Lifetime2 = 0;
        int var8Lifetime2 = 57 + screenY;
        if (guard <= 80) {
          field_U = (TextWidgetPainter) null;
        }
        while (var7Lifetime2 < var4Lifetime2) {
          int var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer.drawHorizontalLine(screenX, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(-6 + (this.width + screenX), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean updateAnimationsAndCheckClosed(int guard) {
        if (guard != -13907) {
          field_U = (TextWidgetPainter) null;
        }
        if (this.resizeDuration <= 0) {
        } else {
          int var2 = this.targetWidth;
          int var3 = this.targetHeight;
          int fieldTemp$0 = this.resizeTick + 1;
          this.resizeTick = this.resizeTick + 1;
          if (fieldTemp$0 >= this.resizeDuration) {
            this.resizeDuration = 0;
            this.onResizeComplete(-105);
          } else {
            int var4 = this.resizeTick * (-this.resizeTick + 2 * this.resizeDuration);
            int var5 = this.resizeDuration * this.resizeDuration;
            var2 = this.initialWidth + (this.targetWidth - this.initialWidth) * var4 / var5;
            var3 = this.initialHeight + var4 * (-this.initialHeight + this.targetHeight) / var5;
          }
          this.resizeAndCenter(guard ^ -13998, var3, var2);
        }
        return super.updateAnimationsAndCheckClosed(-13907);
    }

    ResizableModalPanel(ModalStack param0, int param1, int param2) {
        super(param0, param1, param2);
        this.resizeTick = 0;
        this.resizeDuration = 0;
    }

    final void animateResize(boolean guard, int duration, int panelWidth, int panelHeight) {
        if (duration <= 0) {
          this.resizeAndCenter(255, panelHeight, panelWidth);
          return;
        }
        this.resizeTick = 0;
        this.initialWidth = this.width;
        this.targetHeight = panelHeight;
        this.resizeDuration = duration;
        this.targetWidth = panelWidth;
        if (guard) {
          this.resizeDuration = 115;
        }
        this.initialHeight = this.height;
    }

    boolean refreshVisibilityAndCheckClosed(byte guard) {
        this.finishTransition(false);
        int var2 = -126 % ((7 - guard) / 55);
        return super.refreshVisibilityAndCheckClosed((byte) -61);
    }

    final static String replaceAllLiteral(String text, String search, byte guard, String replacement) {
        int var5 = EscapeVector.obfuscationControl;
        if (guard != 111) {
          field_T = (String) null;
        }
        int var4 = text.indexOf(search);
        while (var4 != -1) {
          text = text.substring(0, var4) + replacement + text.substring(var4 + search.length());
          var4 = text.indexOf(search, var4 + replacement.length());
        }
        return text;
    }

    static {
        field_T = "Orb coins: ";
    }
}
