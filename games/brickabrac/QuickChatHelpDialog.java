/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpDialog extends UiComponent {
    static boolean pointerChanged;
    static String field_Wb;
    static String field_Rb;
    private UiComponent closeButton;
    static volatile int liveHeldButton;
    static boolean field_Sb;
    static String field_Tb;
    static RgbSprite[] field_Ub;
    static int field_Yb;
    static UiComponent field_Vb;
    static long field_Zb;
    static String field_Qb;

    final static boolean a(long param0, int param1, String param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        PlayerBoard var7 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3) {
            var7 = (PlayerBoard) null;
            QuickChatHelpDialog.a((MultiplayerMatch) null, 109, -70, (PlayerBoard) null);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param4 != 2 ||
            LevelSelectScreen.a(param0, param2, -123))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("kb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean updateAndPollDismissal(byte obfuscationGuard, boolean unusedInputFlag) {
        if (obfuscationGuard < 63) {
          QuickChatHelpDialog.h(-91);
          this.updateRoot(true, -15211);
          if (BackgroundScene.pressedButton == 0) {
            return this.closeButton.pressedButton != 0 ? true : false;
          }
          if (this.pressedButton != 0) {
            return this.closeButton.pressedButton != 0 ? true : false;
          }
          return true;
        }
        this.updateRoot(true, -15211);
        if (BackgroundScene.pressedButton != 0) {
          if (this.pressedButton == 0) {
            return true;
          }
          return this.closeButton.pressedButton != 0 ? true : false;
        }
        if (this.closeButton.pressedButton == 0) {
          return false;
        }
        return true;
    }

    public static void d(byte param0) {
        if (param0 >= 40) {
          field_Ub = null;
          field_Tb = null;
          field_Rb = null;
          field_Qb = null;
          field_Wb = null;
          field_Vb = null;
          return;
        }
        field_Yb = -55;
        field_Ub = null;
        field_Tb = null;
        field_Rb = null;
        field_Qb = null;
        field_Wb = null;
        field_Vb = null;
    }

    final static lo a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        lo stackIn_3_0 = null;
        lo stackIn_8_0 = null;
        lo stackIn_17_0 = null;
        lo stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = la.field_a;
            return stackIn_3_0;
          }
          if (param0 <= 80) {
            field_Tb = (String) null;
          }
          if (var2_int > 63) {
            stackIn_8_0 = BitPacketBuffer.field_r;
            return stackIn_8_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == var2_int - 1) {
                stackIn_17_0 = GameCanvas.field_c;
                return stackIn_17_0;
              }
            } else {
              if (IntNode.field_k.indexOf(var4) == -1) {
                stackIn_20_0 = GameCanvas.field_c;
                return stackIn_20_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("kb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    QuickChatHelpDialog(UiComponent unusedStyle, UiComponent titleStyle, UiComponent closeStyle, UiComponent textStyle, UiComponent unusedIconStyle, UiComponent unusedLabelStyle) {
        int shortcutIndex = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiComponent body = null;
        UiComponent subtitle = null;
        int nextRowY = 0;
        int maximumDescriptionWidth = 0;
        UiComponent shortcutLabel = null;
        UiComponent descriptionLabel = null;
        int descriptionWidth = 0;
        UiComponent title = null;
        int unusedCenteredY;
        try {
          title = new UiComponent(0L, titleStyle, ng.field_c.toUpperCase());
          title.horizontalAlignment = 1;
          this.closeButton = new UiComponent(0L, closeStyle);
          body = new UiComponent(0L, textStyle);
          subtitle = new UiComponent(0L, textStyle, DelegatingCanvas.field_b);
          subtitle.horizontalAlignment = 1;
          nextRowY = 50;
          maximumDescriptionWidth = 0;
          for (shortcutIndex = 0; MenuSelection.field_p.length > shortcutIndex; shortcutIndex++) {
            shortcutLabel = new UiComponent(0L, textStyle, PlayerNameChooserPanel.field_M[shortcutIndex]);
            descriptionLabel = new UiComponent(0L, textStyle, MenuSelection.field_p[shortcutIndex]);
            descriptionWidth = textStyle.font.measureText(MenuSelection.field_p[shortcutIndex]);
            shortcutLabel.setBounds(15, nextRowY, 20, 65, (byte) 64);
            if (descriptionWidth > maximumDescriptionWidth) {
              maximumDescriptionWidth = descriptionWidth;
            }
            descriptionLabel.setBounds(15, nextRowY, 90, 640, (byte) 64);
            body.addChild(shortcutLabel, 0);
            body.addChild(descriptionLabel, 0);
            nextRowY += 30;
          }
          title.setBounds(24, 0, 0, 20 + maximumDescriptionWidth + 90, (byte) 64);
          nextRowY += 15;
          this.setBounds(title.height + nextRowY, 100, 100, title.width, (byte) 64);
          this.closeButton.setBounds(15, 5, -20 + title.width, 15, (byte) 64);
          body.setBounds(this.height - title.height, title.height, 0, this.width, (byte) 64);
          subtitle.setBounds(15, 20, 0, this.width, (byte) 64);
          body.frameSprites = DateFieldsWidget.a(false, 8421504, 3, 11579568, body.height, 2105376);
          title.addChild(this.closeButton, 0);
          body.addChild(subtitle, 0);
          this.addChild(title, 0);
          this.addChild(body, 0);
          this.localX = -(this.width >> 1) + 320;
          unusedCenteredY = 240 - (this.height >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("kb.<init>(");
          if (unusedStyle == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (titleStyle == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (closeStyle == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (textStyle == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (unusedIconStyle == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (unusedLabelStyle == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static UiComponent h(int param0) {
        if (param0 != 2) {
          field_Vb = (UiComponent) null;
          return GameScreen.field_f.content;
        }
        return GameScreen.field_f.content;
    }

    final static void a(String param0, int param1) {
        try {
          pf.a(48, param0);
          int var2_int = 81 % ((param1 - 86) / 38);
          MusicPatch.a(0, WidgetTextLayout.field_d, false);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean i(int param0) {
        if (param0 != 7457) {
          return true;
        }
        if (AchievementIcon.field_j < 10) {
          return false;
        }
        if (GameConnectionShell.clientStage >= 13) {
          return true;
        }
        return false;
    }

    final static int a(MultiplayerMatch param0, int param1, int param2, PlayerBoard param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = ((1 << param1 & (param0.playerMaskThree | (param0.playerMaskTwo | param0.playerMaskOne))) == 0) ? 0 : 1;
          var4_int = stackIn_3_0;
          if (param2 <= 63) {
            var5 = (int[]) null;
            QuickChatHelpDialog.a(-35L, 83, (String) null, (int[]) null, -41);
          }
          if (var4_int == 0 &&
            param3.boardState == 2 && (!TextFieldRenderer.field_A ||
            !MusicVoice.a((byte) 93))) {
            if ((1 & param3.controlMask) != 0 &&
              (-2 & param3.controlMask) == 0) {
              stackIn_13_0 = 0;
              return stackIn_13_0;
            }
            if ((param3.controlMask & 2) != 0) {
              if ((param3.controlMask & -3) != 0) {
                return 1;
              }
              stackIn_18_0 = 2;
              return stackIn_18_0;
            }
          }
          stackIn_20_0 = 1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("kb.H(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_Wb = "Public";
        pointerChanged = false;
        liveHeldButton = 0;
        field_Tb = "Your ball fell out of play! Try to catch it with your paddle.";
        field_Rb = "Try changing the following settings:  ";
    }
}
