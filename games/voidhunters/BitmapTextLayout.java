/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitmapTextLayout extends TextLayout {
    private boolean singleLine;
    private int layoutHeight;
    private int layoutWidth;
    private int verticalAlignment;
    private BitmapFont font;
    static GameStateFactory field_k;
    private int horizontalAlignment;
    private String cachedText;
    private int lineSpacing;
    static ScrollableActionPanel field_n;

    public static void clearSharedReferences(int param0) {
        if (param0 != -2705) {
          field_n = (ScrollableActionPanel) null;
          field_n = null;
          field_k = null;
          return;
        }
        field_n = null;
        field_k = null;
    }

    private final TextLayoutLine createSingleLine(int param0, String param1, BitmapFont param2, int param3) {
        TextLayoutLine var5 = null;
        RuntimeException var5_ref = null;
        TextLayoutLine var6 = null;
        TextLayoutLine stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 77) {
            BitmapTextLayout.setMusicVolume(-111, (byte) -91);
          }
          var6 = new TextLayoutLine(-param2.maxAscent + param3, param3 + param2.maxDescent, param1.length());
          var5 = var6;
          this.lines = new TextLayoutLine[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("re.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void layoutParagraph(int param0, int param1, int param2, String param3, BitmapFont param4, int param5, int param6, int param7) {
        TextLayoutLine stackIn_35_0;
        TextLayoutLine stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        TextLayoutLine stackIn_36_0 = null;
        TextLayoutLine stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        BitmapFont stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        TextLayoutLine var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param0 == 0) {
            param0 = param4.ascent;
          }
          if (param3 == null) {
            this.lines = null;
            return;
          }
          if (this.font == param4 &&
            !this.singleLine &&
            this.horizontalAlignment == param5 &&
            param7 == this.verticalAlignment &&
            param0 == this.lineSpacing &&
            this.layoutHeight == param1 &&
            param2 == this.layoutWidth &&
            this.cachedText != null &&
            this.cachedText.equals(param3)) {
            return;
          }
          this.layoutWidth = param2;
          this.horizontalAlignment = param5;
          this.singleLine = false;
          this.layoutHeight = param1;
          this.cachedText = param3;
          this.lineSpacing = param0;
          this.verticalAlignment = param7;
          this.font = param4;
          var16 = new String[param4.getLineCount(param3, param2) + 1];
          var17 = var16;
          var10 = Math.max(1, param4.wrapLines(param3, new int[]{param2}, var17));
          if (this.verticalAlignment == param6 &&
            1 == var10) {
            this.verticalAlignment = 1;
          }
          if (0 == this.verticalAlignment) {
            var11 = param4.maxAscent;
          } else {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment != 2) {
                var12 = (-(var10 * this.lineSpacing) + this.layoutHeight) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param4.maxAscent;
                this.lineSpacing = this.lineSpacing + var12;
              } else {
                var11 = -(var10 * this.lineSpacing) + (this.layoutHeight - param4.maxDescent);
              }
            } else {
              var11 = param4.maxAscent + (this.layoutHeight - this.lineSpacing * var10 >> 1);
            }
          }
          this.lines = new TextLayoutLine[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param4.maxAscent + var11;
            stackIn_35_3 = var11 + param4.maxDescent;
            if (var13 != null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            }
            var14 = new TextLayoutLine(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.caretXs[0] = 0;
            if (var13 != null) {
              var14.caretXs[var13.length()] = param4.getStringWidth(var13);
              stackIn_39_0 = (BitmapFont) (param4);
              if (param5 != 3) {
                stackIn_40_1 = 0;
              } else {
                stackIn_40_1 = this.computeJustificationSpacing(false, param2, param4.getStringWidth(var13), var13);
              }
              TrailHolder.fillCaretPositions(stackIn_39_0, stackIn_40_1, var14, var13, 18126);
            }
            var11 = var11 + param0;
            this.lines[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("re.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void layoutLeftAligned(int param0, BitmapFont param1, int param2, String param3, int param4) {
        TextLayoutLine var7 = null;
        TextLayoutLine var8 = null;
        if (param3 == null) {
          this.lines = null;
          return;
        }
        if (this.font == param1 &&
          this.singleLine &&
          0 == this.horizontalAlignment &&
          null != this.cachedText &&
          this.cachedText.equals(param3)) {
          return;
        }
        try {
          this.font = param1;
          this.singleLine = true;
          this.cachedText = param3;
          this.horizontalAlignment = 0;
          var7 = this.createSingleLine(param2 + 108, param3, param1, param0);
          var8 = var7;
          var7.caretXs[0] = param4;
          var8.caretXs[param3.length()] = param4 + param1.getStringWidth(param3);
          if (param2 != -3) {
            field_n = (ScrollableActionPanel) null;
          }
          TrailHolder.fillCaretPositions(param1, 0, var8, param3, 18126);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void layoutCentered(int param0, int param1, String param2, int param3, BitmapFont param4) {
        TextLayoutLine var8 = null;
        int var7 = 0;
        if (param2 == null) {
          this.lines = null;
          return;
        }
        if (this.font == param4 &&
          this.singleLine &&
          this.horizontalAlignment == 1 &&
          null != this.cachedText &&
          this.cachedText.equals(param2)) {
          return;
        }
        this.font = param4;
        this.horizontalAlignment = 1;
        this.singleLine = true;
        if (param0 != -2661) {
          return;
        }
        try {
          var8 = this.createSingleLine(113, param2, param4, param3);
          var7 = param4.getStringWidth(param2);
          var8.caretXs[0] = -(var7 >> 1) + param1;
          var8.caretXs[param2.length()] = (var7 >> 1) + param1;
          TrailHolder.fillCaretPositions(param4, 0, var8, param2, 18126);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "re.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutRightAligned(int param0, BitmapFont param1, int param2, int param3, String param4) {
        TextLayoutLine var8 = null;
        TextLayoutLine var9 = null;
        if (param4 == null) {
          this.lines = null;
          return;
        }
        if (this.font == param1 &&
          this.singleLine &&
          this.horizontalAlignment == 2 &&
          null != this.cachedText &&
          this.cachedText.equals(param4)) {
          return;
        }
        this.horizontalAlignment = 2;
        this.cachedText = param4;
        if (param2 < 30) {
          return;
        }
        try {
          this.singleLine = true;
          this.font = param1;
          var8 = this.createSingleLine(93, param4, param1, param0);
          var9 = var8;
          var9.caretXs[0] = -param1.getStringWidth(param4) + param3;
          var9.caretXs[param4.length()] = param3;
          TrailHolder.fillCaretPositions(param1, 0, var9, param4, 18126);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "re.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public BitmapTextLayout() {
    }

    final static void setMusicVolume(int param0, byte param1) {
        GetMutatorVotes.field_p = param0;
        if (null != SetMassDriverRandomness.field_o) {
          SetMassDriverRandomness.field_o.setMasterVolume(param0, (byte) 14);
          if (param1 >= -93) {
            BitmapTextLayout.clearSharedReferences(-100);
            if (null != GetBurstFireMaxEnergy.musicStream) {
              GetBurstFireMaxEnergy.musicStream.setMasterGain((byte) -108, param0);
            }
            return;
          }
          if (null != GetBurstFireMaxEnergy.musicStream) {
            GetBurstFireMaxEnergy.musicStream.setMasterGain((byte) -108, param0);
          }
          return;
        }
        if (param1 < -93) {
          if (null != GetBurstFireMaxEnergy.musicStream) {
            GetBurstFireMaxEnergy.musicStream.setMasterGain((byte) -108, param0);
          }
          return;
        }
        BitmapTextLayout.clearSharedReferences(-100);
        if (null != GetBurstFireMaxEnergy.musicStream) {
          GetBurstFireMaxEnergy.musicStream.setMasterGain((byte) -108, param0);
        }
    }

    static {
        field_k = (GameStateFactory) ((Object) new AdjustVariableActionFactory());
    }
}
