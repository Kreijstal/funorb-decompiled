/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableDialog extends FadingDialog {
    private int targetWidth;
    private int resizeStartHeight;
    static NamedSoundEffect field_O;
    static int field_V;
    static String field_Q;
    static int[] field_S;
    private int targetHeight;
    static int[] field_U;
    private int resizeTicks;
    private int resizeStartWidth;
    static volatile int field_R;
    private int resizeDuration;

    void drawFrame(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = HoldTheLine.field_D;
        SoftwareRasterizer.fillVerticalGradient(6 + param0, param1 + 35, -12 + this.width, this.height - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= SoftwareRasterizer.clipTop &&
            var8 < SoftwareRasterizer.clipBottom) {
            var9 = var5 + var7 * (-var5 + var6) / var4;
            var10 = 0;
            var11 = this.width;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRasterizer.pixels[SoftwareRasterizer.width * var8 - (-param0 - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer.pixels[param0 + (SoftwareRasterizer.width * var8 + var11)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            SoftwareRasterizer.drawHorizontalLine(param0 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        if (param2 != 20) {
          this.resizeTicks = 69;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-6 + (param0 + this.width), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        SpriteState.field_t.draw(param0 + this.width - 90, param1 + 10);
        NameSuggestionsPanel.drawHorizontalFrame(param1 + 35, 14191, param0 + 5, RaceVehicle.field_Db, -10 + this.width);
        NameSuggestionsPanel.drawHorizontalFrame(-22 + this.height + param1, 14191, param0, EncryptedPacketWriter.field_b, this.width);
        var4Lifetime2 = this.height - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(-6 + this.width + param0, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean finishAnimations(boolean param0) {
        this.finishResize(!param0 ? true : false);
        if (!param0) {
          this.animateResize(-69, -36, 41, 53);
        }
        return super.finishAnimations(true);
    }

    ResizableDialog(DialogLayer param0, int param1, int param2) {
        super(param0, param1, param2);
        this.resizeTicks = 0;
        this.resizeDuration = 0;
    }

    boolean updateAnimation(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 39) {
          this.targetHeight = 59;
        }
        if (this.resizeDuration <= 0) {
        } else {
          var2 = this.targetWidth;
          var3 = this.targetHeight;
          fieldTemp$0 = this.resizeTicks + 1;
          this.resizeTicks = this.resizeTicks + 1;
          if (fieldTemp$0 < this.resizeDuration) {
            var4 = this.resizeTicks * (-this.resizeTicks + this.resizeDuration * 2);
            var5 = this.resizeDuration * this.resizeDuration;
            var3 = var4 * (this.targetHeight - this.resizeStartHeight) / var5 + this.resizeStartHeight;
            var2 = this.resizeStartWidth + var4 * (this.targetWidth - this.resizeStartWidth) / var5;
          } else {
            this.resizeDuration = 0;
            this.onResizeComplete(-109);
          }
          this.setCenteredSize(537342017, var2, var3);
        }
        return super.updateAnimation((byte) 39);
    }

    final void animateResize(int param0, int param1, int param2, int param3) {
        if (param2 <= 0) {
          this.setCenteredSize(537342017, param1, param3);
          return;
        }
        this.targetWidth = param1;
        if (param0 <= 5) {
          return;
        }
        this.resizeTicks = 0;
        this.targetHeight = param3;
        this.resizeDuration = param2;
        this.resizeStartHeight = this.height;
        this.resizeStartWidth = this.width;
    }

    public static void clearSharedReferences(int param0) {
        field_S = null;
        if (param0 != 6) {
          field_V = -109;
        }
        field_U = null;
        field_O = null;
        field_Q = null;
    }

    final static String getAccountDisplayName(int param0) {
        if (QuickChatPhraseCache.field_e == null) {
          return "";
        }
        if (param0 != 21) {
          field_O = (NamedSoundEffect) null;
        }
        return QuickChatPhraseCache.field_e;
    }

    void finishResize(boolean param0) {
        if (0 >= this.resizeDuration) {
          return;
        }
        this.setCenteredSize(537342017, this.targetWidth, this.targetHeight);
        this.resizeDuration = 0;
        this.onResizeComplete(-108);
        if (param0) {
          this.finishResize(true);
        }
    }

    void onResizeComplete(int param0) {
        if (param0 >= -100) {
          this.updateAnimation((byte) -45);
        }
    }

    static {
        field_Q = "Dragster";
        field_U = new int[8192];
        field_R = 0;
        field_S = new int[8192];
    }
}
