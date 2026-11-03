/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableDialog extends FadingDialog {
    private int resizeStartHeight;
    static String tutorialCameraZoom;
    private int resizeTargetHeight;
    private int resizeStartWidth;
    static int field_fb;
    static int[][] field_ab;
    private int resizeTick;
    private int resizeDurationTicks;
    static String playersInGame;
    private int resizeTargetWidth;

    boolean advanceDialogAnimation(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.resizeDurationTicks > 0) {
          var2 = this.resizeTargetWidth;
          var3 = this.resizeTargetHeight;
          fieldTemp$0 = this.resizeTick + 1;
          this.resizeTick = this.resizeTick + 1;
          if (fieldTemp$0 >= this.resizeDurationTicks) {
            this.resizeDurationTicks = 0;
            this.onResizeTransitionComplete(50);
          } else {
            var4 = this.resizeTick * (this.resizeDurationTicks * 2 - this.resizeTick);
            var5 = this.resizeDurationTicks * this.resizeDurationTicks;
            var2 = (-this.resizeStartWidth + this.resizeTargetWidth) * var4 / var5 + this.resizeStartWidth;
            var3 = (this.resizeTargetHeight - this.resizeStartHeight) * var4 / var5 + this.resizeStartHeight;
          }
          this.resizeAndCenter(var3, 31936, var2);
        }
        if (param0 != -20) {
          this.startResizeTransition((byte) 127, -67, -57, -106);
        }
        return super.advanceDialogAnimation((byte) -20);
    }

    boolean settleDialogAnimation(boolean param0) {
        this.finishTransition(param0);
        return super.settleDialogAnimation(param0);
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 != 4096) {
          return 124;
        }
        if (param0 == 0) {
          if (0 != param1) {
            if (param1 < 0) {
              return -2048;
            }
            return 2048;
          }
          return 0;
        }
        if (0 <= param0) {
          if (param1 == 0) {
            return 0;
          }
          if (param1 < 0) {
            return -jd.a(param0, 1164778608, -param1);
          }
          return jd.a(param0, 1164778608, param1);
        }
        if (0 == param1) {
          return 4096;
        }
        if (param1 >= 0) {
          return -jd.a(-param0, 1164778608, param1) + 4096;
        }
        return -4096 + jd.a(-param0, 1164778608, -param1);
    }

    final void startResizeTransition(byte param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.resizeAndCenter(param1, 31936, param2);
          return;
        }
        this.resizeTick = 0;
        this.resizeStartWidth = this.widgetWidth;
        int var5 = 77 / ((param0 - 44) / 34);
        this.resizeTargetHeight = param1;
        this.resizeTargetWidth = param2;
        this.resizeDurationTicks = param3;
        this.resizeStartHeight = this.widgetHeight;
    }

    final static int i(int param0) {
        if (QuickChatCategoryDefinition.field_y < 2) {
          return 0;
        }
        if (0 != ProgressBarWidget.field_S) {
          if (null != QuickChatPhraseRegistry.field_a) {
            if (!QuickChatPhraseRegistry.field_a.isIndexReady(-103)) {
              return 14;
            }
            if (!QuickChatPhraseRegistry.field_a.hasGroupNamed((byte) 114, "")) {
              return 29;
            }
            if (!QuickChatPhraseRegistry.field_a.ensureGroupAvailableByName("", 0)) {
              return 29;
            }
          }
          if (!uj.field_d.isIndexReady(84)) {
            return 43;
          }
          if (!uj.field_d.ensureGroupAvailableByName("commonui", param0 - 19535)) {
            return 57;
          }
          if (!PolarTableScene.field_nb.isIndexReady(-96)) {
            return 71;
          }
          if (!PolarTableScene.field_nb.ensureGroupAvailableByName("commonui", 0)) {
            return 80;
          }
          if (!DualLinkNode.field_r.isIndexReady(47)) {
            return 82;
          }
          if (!DualLinkNode.field_r.ensureAllGroupsAvailable(-63)) {
            return 86;
          }
        } else {
          if (!uj.field_d.isIndexReady(param0 - 19430)) {
            return 20;
          }
          if (!uj.field_d.ensureGroupAvailableByName("commonui", 0)) {
            return 40;
          }
          if (!PolarTableScene.field_nb.isIndexReady(104)) {
            return 50;
          }
          if (!PolarTableScene.field_nb.ensureGroupAvailableByName("commonui", param0 ^ 19535)) {
            return 60;
          }
          if (!DualLinkNode.field_r.isIndexReady(114)) {
            return 70;
          }
          if (!DualLinkNode.field_r.ensureAllGroupsAvailable(-63)) {
            return 80;
          }
        }
        if (param0 != 19535) {
          ResizableDialog.i(-99);
        }
        return 100;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -16) {
          ResizableDialog.i(83);
        }
        field_ab = (int[][]) null;
        playersInGame = null;
        tutorialCameraZoom = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        boolean stackIn_6_0 = false;
        var7 = 101 / ((69 - param1) / 51);
        stackIn_6_0 = (param0 >= param6) && (param0 < param4 + param6) && (param5 <= param3) && (param3 < param5 + param2);
        return stackIn_6_0;
    }

    void onResizeTransitionComplete(int param0) {
        if (param0 != 50) {
          this.settleDialogAnimation(true);
        }
    }

    ResizableDialog(DialogLayer param0, int param1, int param2) {
        super(param0, param1, param2);
        this.resizeDurationTicks = 0;
        this.resizeTick = 0;
    }

    void drawDialogFrame(int param0, int param1, int param2) {
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
        var16 = Pool.field_O;
        SoftwareRasterizer.fillVerticalGradient(6 + param0, param1 + 35, this.widgetWidth - 12, this.widgetHeight - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        if (param2 != 260) {
          return;
        }
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= SoftwareRasterizer.clipTop &&
            var8 < SoftwareRasterizer.clipBottom) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.widgetWidth;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRasterizer.pixels[var10 + SoftwareRasterizer.width * var8 + param0] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (-var7 + 20);
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer.pixels[param0 + (SoftwareRasterizer.width * var8 + var11)] = var15;
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
            SoftwareRasterizer.drawHorizontalLine(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(this.widgetWidth + param0 - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        EmailAvailabilityValidator.field_p.draw(this.widgetWidth + param0 - 90, 10 + param1);
        MouseWheelInput.a(param1 + 35, this.widgetWidth - 10, ArchiveRequest.field_I, param0 + 5, (byte) 23);
        MouseWheelInput.a(-22 + (param1 + this.widgetHeight), this.widgetWidth, ArchiveLoadSequence.field_d, param0, (byte) 23);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.widgetHeight;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(param0 - (-this.widgetWidth + 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    void finishTransition(boolean param0) {
        if (0 >= this.resizeDurationTicks) {
          return;
        }
        this.resizeAndCenter(this.resizeTargetHeight, 31936, this.resizeTargetWidth);
        if (param0) {
          this.settleDialogAnimation(true);
        }
        this.resizeDurationTicks = 0;
        this.onResizeTransitionComplete(50);
    }

    static {
        playersInGame = "Players: ";
        tutorialCameraZoom = "To <u=ffffff>zoom</u> in and out: Use the <img=1> <col=99ff99>mouse wheel</col>, or hold <img=11>+<img=0> left mouse button and drag.";
    }
}
