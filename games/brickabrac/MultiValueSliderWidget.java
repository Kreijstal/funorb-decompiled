/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiValueSliderWidget extends FocusableWidget {
    private int maximumValue;
    static String field_N;
    int trackY;
    private GrowableIntList values;
    static RgbSprite[] field_K;
    int horizontalInset;

    final static LoginMethodPreference a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethodPreference[] var3 = null;
        LoginMethodPreference var5 = null;
        int var6 = 0;
        LoginMethodPreference stackIn_4_0 = null;
        LoginMethodPreference stackIn_10_0 = null;
        LoginMethodPreference stackIn_14_0 = null;
        LoginMethodPreference stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var2 = BackgroundScene.a(param0, 104, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = LinkWidgetRenderer.field_c;
            return stackIn_4_0;
          }
          var3 = NumericLoginCredentials.b(140);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.matchesCookieValue(var2, param1 + 28554)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          if (param1 == -28432) {
            stackIn_16_0 = LinkWidgetRenderer.field_c;
            return stackIn_16_0;
          }
          stackIn_14_0 = (LoginMethodPreference) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("qi.I(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getValueCount(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          field_N = (String) null;
          return this.values.size(true);
        }
        return this.values.size(true);
    }

    public static void j(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != 18724) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          MultiValueSliderWidget.a((java.applet.Applet) null, 5);
        }
    }

    final static void clearFaceGroupCounts(byte obfuscationGuard) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = AppletGameShell.faceGroupOffsets;
          var1 = var5;
          var2 = 0;
          if (obfuscationGuard != 109) {
            return;
          }
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "qi.F(" + obfuscationGuard + ')');
        }
    }

    final int getValue(int index, boolean obfuscationGuard) {
        if (0 > index) {
          return -1;
        }
        if (this.values.size(!obfuscationGuard ? true : false) <= index) {
          return -1;
        }
        if (!obfuscationGuard) {
          return this.values.get(index, (byte) 64);
        }
        this.values = (GrowableIntList) null;
        return this.values.get(index, (byte) 64);
    }

    final int getMaximumValue(int obfuscationGuard) {
        if (obfuscationGuard >= -81) {
          this.trackY = -5;
          return this.maximumValue;
        }
        return this.maximumValue;
    }

    final static void handleAchievementResponse(int obfuscationGuard) {
        int wordIndex = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int responseType = 0;
        int[] achievementMask = null;
        int[] var4 = null;
        BitPacketBuffer var5 = null;
        int wordCount = 0;
        int clientBranchFlag = 0;
        int[] var10 = null;
        int[] var11 = null;
        AchievementSubmission submission = null;
        AchievementMaskRequest maskRequest = null;
        BitPacketBuffer packet = null;
        AchievementMaskRequest emptyMaskRequest = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = jl.incomingPackets;
          responseType = packet.readUnsignedByte(255);
          if (obfuscationGuard == ~responseType) {
            var11 = Ball.createAchievementMask(8);
            achievementMask = var11;
            var10 = var11;
            var4 = var10;
            var5 = packet;
            wordCount = ((PacketBuffer) ((Object) var5)).readUnsignedByte(255);
            for (wordIndex = 0; wordCount > wordIndex; wordIndex++) {
              var10[wordIndex] = ((PacketBuffer) ((Object) var5)).readInt(LevelResultSubmission.a(obfuscationGuard, -256));
            }
            maskRequest = (AchievementMaskRequest) (StrongCacheEntry.pendingAchievementMaskRequests.first(obfuscationGuard - 84));
            if (maskRequest == null) {
              hn.a((byte) 102);
              return;
            }
            maskRequest.complete = true;
            maskRequest.achievementMask = achievementMask;
            maskRequest.unlink((byte) 111);
            return;
          }
          if (1 == responseType) {
            submission = (AchievementSubmission) (DateFieldsWidget.pendingAchievementSubmissions.first(obfuscationGuard ^ 86));
            if (submission == null) {
              hn.a((byte) 103);
              return;
            }
            submission.unlink((byte) 111);
            return;
          }
          if (responseType != 2) {
            AlignedIconLabel.a("A1: " + WhirlpoolHasher.c((byte) -92), (Throwable) null, 88);
            hn.a((byte) 52);
            return;
          }
          emptyMaskRequest = (AchievementMaskRequest) (StrongCacheEntry.pendingAchievementMaskRequests.first(-42));
          if (emptyMaskRequest == null) {
            hn.a((byte) 119);
            return;
          }
          emptyMaskRequest.achievementMask = Ball.createAchievementMask(8);
          emptyMaskRequest.complete = true;
          emptyMaskRequest.unlink((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "qi.A(" + obfuscationGuard + ')');
        }
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        int var12 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard + obfuscationGuard)) {
            return false;
          }
          var8_int = -this.horizontalInset + (-parentX + pointerX);
          var9 = -(this.horizontalInset * 2) + this.width;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.maximumValue * var8_int / var9;
          if (button == 1) {
            this.values.append(false, var8_int);
          } else {
            if (button == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.values.size(true) > var12; var12++) {
                var13 = -var8_int + this.values.get(var12, (byte) 64);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.values.removeAt((byte) 46, var11);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("qi.MA(");
          if (focusRoot == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int i(int param0) {
        if (param0 != -29946) {
          return -15;
        }
        return ScorePopup.field_p;
    }

    private MultiValueSliderWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_N = "Cool!";
    }
}
