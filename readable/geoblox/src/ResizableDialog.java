/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableDialog extends FadingDialog {
    static int[] awtKeyCodeToInternalCode;
    private int resizeStartWidth;
    static String connectionRestoredText;
    private int resizeTargetHeight;
    private int resizeDurationTicks;
    private int resizeTargetWidth;
    private int resizeStartHeight;
    static ClientProtocolStage awaitingInitialLoginReplyStage;
    private int resizeTick;
    static int field_V;
    static boolean field_S;

    public static void j(int param0) {
        awaitingInitialLoginReplyStage = null;
        if (param0 != 89) {
            field_S = false;
        }
        awtKeyCodeToInternalCode = null;
        connectionRestoredText = null;
    }

    boolean settleDialogAnimation(int methodGuard) {
        this.finishTransition(true);
        if (methodGuard != 229) {
            this.advanceDialogAnimation(45);
        }
        return super.settleDialogAnimation(229);
    }

    final void startResizeTransition(int targetHeight, int targetWidth, int methodGuard, int durationTicks) {
        if (!(durationTicks > 0)) {
            this.resizeAndCenter(targetHeight, methodGuard + 5373, targetWidth);
            return;
        }
        this.resizeStartWidth = this.widgetWidth;
        this.resizeTick = 0;
        if (methodGuard != -5269) {
            this.resizeStartWidth = 59;
        }
        this.resizeTargetHeight = targetHeight;
        this.resizeStartHeight = this.widgetHeight;
        this.resizeTargetWidth = targetWidth;
        this.resizeDurationTicks = durationTicks;
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 44) {
            stackIn_4_0 = AccountContentDialog.a(false, false, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("oe.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void finishTransition(boolean finishResize) {
        if (this.resizeDurationTicks <= 0) {
            return;
        }
        if (!finishResize) {
            return;
        }
        this.resizeAndCenter(this.resizeTargetHeight, 105, this.resizeTargetWidth);
        this.resizeDurationTicks = 0;
        this.onResizeTransitionComplete(-107);
    }

    final static void clearMeshDepthBucketCounts(int startIndex) {
        int[] depthBucketCountsAlias = null;
        int clearIndex = 0;
        int arrayLength = 0;
        int controlFlagSnapshot = 0;
        int[] depthBucketCounts = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          depthBucketCounts = GameApplet.meshFaceCountsByDepthBucket;
          depthBucketCountsAlias = depthBucketCounts;
          clearIndex = startIndex;
          arrayLength = depthBucketCounts.length;
          while (clearIndex < arrayLength) {
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contextFailure), "oe.N(" + startIndex + ')');
        }
    }

    ResizableDialog(DialogLayer dialogLayer, int initialWidth, int initialHeight) {
        super(dialogLayer, initialWidth, initialHeight);
        this.resizeDurationTicks = 0;
        this.resizeTick = 0;
    }

    void onResizeTransitionComplete(int methodGuard) {
        if (methodGuard > -20) {
            this.resizeTargetWidth = 122;
        }
    }

    final static int computeCrc32(int endPosition, byte[] bytes, int methodGuard, int startPosition) {
        int byteIndex = 0;
        int crcAccumulator = 0;
        RuntimeException checksumFailureForContext = null;
        CharSequence unusedNullTextSnapshot = null;
        int checksumBeforeReturn = 0;
        RuntimeException checksumFailureBeforeDescription = null;
        StringBuilder checksumMessagePrefix = null;
        String bytesDescription = null;
        RuntimeException caughtChecksumFailure = null;
        try {
          if (methodGuard > -27) {
            unusedNullTextSnapshot = (CharSequence) null;
            ResizableDialog.a((CharSequence) null, -115);
          }
          crcAccumulator = -1;
          for (byteIndex = startPosition; byteIndex < endPosition; byteIndex++) {
            crcAccumulator = sb.crc32Table[(crcAccumulator ^ bytes[byteIndex]) & 255] ^ crcAccumulator >>> 8;
          }
          crcAccumulator = ~crcAccumulator;
          checksumBeforeReturn = crcAccumulator;
          return checksumBeforeReturn;
        } catch (java.lang.RuntimeException checksumFailure) {
          caughtChecksumFailure = checksumFailure;
          checksumFailureForContext = caughtChecksumFailure;
          checksumFailureBeforeDescription = checksumFailureForContext;
          checksumMessagePrefix = new StringBuilder().append("oe.P(").append(endPosition).append(',');
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checksumFailureBeforeDescription), ((StringBuilder) (Object) checksumMessagePrefix).append(bytesDescription).append(',').append(methodGuard).append(',').append(startPosition).append(')').toString());
        }
    }

    boolean advanceDialogAnimation(int methodGuard) {
        int frameWidth = 0;
        int frameHeight = 0;
        int nextResizeTick = 0;
        int durationSquared = 0;
        int easingNumerator = 0;
        if (~this.resizeDurationTicks < methodGuard) {
            frameWidth = this.resizeTargetWidth;
            frameHeight = this.resizeTargetHeight;
            nextResizeTick = this.resizeTick + 1;
            this.resizeTick = this.resizeTick + 1;
            if (nextResizeTick < this.resizeDurationTicks) {
                easingNumerator = (-this.resizeTick + 2 * this.resizeDurationTicks) * this.resizeTick;
                durationSquared = this.resizeDurationTicks * this.resizeDurationTicks;
                frameWidth = this.resizeStartWidth + easingNumerator * (this.resizeTargetWidth - this.resizeStartWidth) / durationSquared;
                frameHeight = easingNumerator * (this.resizeTargetHeight - this.resizeStartHeight) / durationSquared + this.resizeStartHeight;
            } else {
                this.resizeDurationTicks = 0;
                this.onResizeTransitionComplete(-31);
            }
            this.resizeAndCenter(frameHeight, 113, frameWidth);
        }
        return super.advanceDialogAnimation(methodGuard ^ 0);
    }

    final static void a(int param0, byte param1, int param2) {
        NodeHashTableIterator.field_g = param2;
        if (param1 > -20) {
            return;
        }
        DequeCursor.field_e = param0;
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (gg.a((byte) 125, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (gg.a((byte) -47, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (1 > var4) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          if (param1 != 12) {
            connectionRestoredText = (String) null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (TextHotspotBounds.a((char) var7, -47)) {
              var8 = ValidatedTextInputWidget.a((char) var7, param1 - 239);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_28_0 = var5.toString();
            return stackIn_28_0;
          }
          stackIn_26_0 = null;
          return (String) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("oe.L(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          var3_int = 160;
          var4 = 190;
          if (!param1) {
            var4 -= 10;
          }
          if (param0) {
            stackIn_7_0 = ScorePopupSupport.newAchievementMask;
          } else {
            stackIn_7_0 = InstrumentPatch.earnedAchievementMask;
          }
          var5 = stackIn_7_0;
          var6 = 0;
          if (param2 != 160) {
            return;
          }
          var7 = 0;
          var8 = 0;
          if (!param0) {
            if (var8 >= 8) {
              var3_int = var3_int + (-160 + var7);
            }
            for (var9 = 0; GameplaySetupSupport.achievementTitles.length > var9; var9++) {
              if (!(((1 << var9 & var5) == 0) &&
                    (param0)) &&
                  !((!da.a(0, 88)) &&
                    (var9 == 16) &&
                    (!AchievementQuery.hasReceivedAchievementSixteen(109)))) {
                if ((mc.pointerPressXSnapshot >= var3_int) &&
                    (mc.pointerPressXSnapshot <= var3_int + 32) &&
                    (var4 <= FullscreenFocusCanvas.pointerPressYSnapshot) &&
                    (FullscreenFocusCanvas.pointerPressYSnapshot <= var4 + 32)) {
                  if (BoardEntityState.selectedAchievementIndex == var9) {
                    BoardEntityState.selectedAchievementIndex = -1;
                    return;
                  }
                  BoardEntityState.selectedAchievementIndex = var9;
                  return;
                }
                incrementValue$1 = var6;
                var6++;
                if (7 != incrementValue$1) {
                  var3_int += 40;
                } else {
                  var3_int = 160;
                  var4 += 40;
                  if (!param1) {
                    var4 += 5;
                  }
                  if ((param0) &&
                      (var8 < 8)) {
                    var3_int = var3_int + var7;
                  }
                }
              }
            }
          } else {
            for (var9 = 15; var9 >= 0; var9--) {
              if ((var5 & 1 << var9) == 0) {
                var7 += 20;
                var8++;
              }
            }
            if (var8 >= 8) {
              var3_int = var3_int + (-160 + var7);
            }
            for (var9 = 0; GameplaySetupSupport.achievementTitles.length > var9; var9++) {
              if (!(((1 << var9 & var5) == 0) &&
                    (param0)) &&
                  !((!da.a(0, 88)) &&
                    (var9 == 16) &&
                    (!AchievementQuery.hasReceivedAchievementSixteen(109)))) {
                if ((mc.pointerPressXSnapshot >= var3_int) &&
                    (mc.pointerPressXSnapshot <= var3_int + 32) &&
                    (var4 <= FullscreenFocusCanvas.pointerPressYSnapshot) &&
                    (FullscreenFocusCanvas.pointerPressYSnapshot <= var4 + 32)) {
                  if (BoardEntityState.selectedAchievementIndex == var9) {
                    BoardEntityState.selectedAchievementIndex = -1;
                    return;
                  }
                  BoardEntityState.selectedAchievementIndex = var9;
                  return;
                }
                incrementValue$0 = var6;
                var6++;
                if (7 != incrementValue$0) {
                  var3_int += 40;
                } else {
                  var3_int = 160;
                  var4 += 40;
                  if (!param1) {
                    var4 += 5;
                  }
                  if ((param0) &&
                      (var8 < 8)) {
                    var3_int = var3_int + var7;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "oe.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void b(int param0, int param1, int param2) {
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
        var16 = Geoblox.clientControlFlowFlag;
        SoftwareRasterizer.fillVerticalGradient(param0 + 6, param2 + 35, -12 + this.widgetWidth, -40 + this.widgetHeight, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (~var8 > ~SoftwareRasterizer.clipTop) {
            var8++;
            var7++;
            continue;
          }
          if (SoftwareRasterizer.clipBottom <= var8) {
            var8++;
            var7++;
            continue;
          }
          var9 = (-var5 + var6) * var7 / var4 + var5;
          var10 = 0;
          var11 = this.widgetWidth;
          if (var7 <= 20) {
            while (!(var10 > 20)) {
              var12 = (-var7 + 20) * (-var7 + 20) + (-var10 + 20) * (20 - var10);
              if (var12 > 462) {
                var10++;
                continue;
              }
              if (var12 < 420) {
                break;
              }
              var13 = (-var12 + 462) * var9 / 42;
              var13 = var13 | (var13 << 8 | var13 << 16);
              SoftwareRasterizer.framebuffer[var8 * SoftwareRasterizer.stride + param0 + var10] = var13;
              var10++;
              continue;
            }
          }
          if (20 >= var7) {
            var12 = var11;
            var11 -= 21;
            for (var13 = 0; var13 <= 20; var13++) {
              var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
              if (var14 <= 462) {
                if (var14 < 420) {
                  var12 = var11 + 1;
                  var11++;
                  continue;
                }
                var15 = var9 * (462 - var14) / 42;
                var15 = var15 | (var15 << 8 | var15 << 16);
                SoftwareRasterizer.framebuffer[var11 + param0 + SoftwareRasterizer.stride * var8] = var15;
                var11++;
                continue;
              }
              break;
            }
            var11 = var12;
          }
          var9 = var9 | (var9 << 16 | var9 << 8);
          SoftwareRasterizer.drawHorizontalLine(var10 + param0, var8, var11 - var10, var9);
          var8++;
          var7++;
        }
        var4 = 22;
        var5 = 194;
        var6 = 169;
        var7 = 0;
        var8 = 35 + param2;
        while (var7 < var4) {
          var9 = var5 + (-var5 + var6) * var7 / var4;
          var9 = var9 | (var9 << 8 | var9 << 16);
          SoftwareRasterizer.drawHorizontalLine(param0, var8, 6, var9);
          SoftwareRasterizer.drawHorizontalLine(this.widgetWidth + param0 - 6, var8, 6, var9);
          var7++;
          var8++;
        }
        AvatarFeedbackSupport.grayJagexLogoSprite.draw(-90 + this.widgetWidth + param0, 10 + param2);
        if (param1 != 20) {
          this.resizeTargetHeight = -34;
        }
        InstrumentPatch.a(id.field_c, -10 + this.widgetWidth, 35 + param2, 5 + param0, (byte) 107);
        InstrumentPatch.a(UnderlinedButtonRenderer.field_e, this.widgetWidth, -22 + (this.widgetHeight + param2), param0, (byte) 107);
        var4 = this.widgetHeight - 79;
        var5 = 169;
        var6 = 127;
        var7 = 0;
        var8 = param2 + 57;
        while (var7 < var4) {
          var9 = var7 * (var6 - var5) / var4 + var5;
          var9 = var9 | (var9 << 16 | var9 << 8);
          SoftwareRasterizer.drawHorizontalLine(param0, var8, 6, var9);
          SoftwareRasterizer.drawHorizontalLine(-6 + (this.widgetWidth + param0), var8, 6, var9);
          var8++;
          var7++;
        }
    }

    static {
        awtKeyCodeToInternalCode = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        connectionRestoredText = "Connection restored.";
        awaitingInitialLoginReplyStage = new ClientProtocolStage();
        field_V = 0;
        field_S = false;
    }
}
