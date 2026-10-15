/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SaveResultsPromptScreen extends MenuScreen {
    static String field_r;
    private String promptText;
    static ResourceArchive field_t;
    static String field_w;
    static ValidationStatus validationPending;
    static String field_x;
    static String[] field_u;
    static RgbSprite[] packCardIcons;
    static String field_y;

    final void layoutButtons(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_x = (String) null;
          this.e(2);
          return;
        }
        this.e(2);
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return 100;
        }
        return this.buttonTop;
    }

    final void drawScreen(byte obfuscationGuard) {
        super.drawScreen((byte) -39);
        GzipInflater.a(550, 5, 243, 5, 140, (byte) -81, 45);
        if (obfuscationGuard <= -14) {
          ContextActionController.field_g.drawParagraph(this.promptText, 54, 149, 532, 225, 2, -1, 1, 1, 22);
          this.a(0);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (QuickChatMenu.h(-26090)) {
          return;
        }
        BitPacketBuffer var4 = TextFieldValidator.outgoingPackets;
        var4.writeCipheredOpcode(-13413, 16);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(-126, 0);
        var4.writeShort((byte) 120, param0);
        var4.writeByte(113, param1);
        if (param2 == 532) {
          var4.writeShort((byte) 127, param3);
          var4.backfillByteLength((byte) 121, -var5 + var4.position);
          return;
        }
        packCardIcons = (RgbSprite[]) null;
        var4.writeShort((byte) 127, param3);
        var4.backfillByteLength((byte) 121, -var5 + var4.position);
    }

    final static QuickChatMenu a(int[] param0, UiComponent param1, UiComponent param2, UiComponent param3, byte param4) {
        int var10_int = 0;
        Object stackIn_9_0 = null;
        QuickChatMenu stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        QuickChatMenu[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        QuickChatPhraseDefinition var11 = null;
        int var12 = 0;
        UiComponent var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param4 != -78) {
            var13 = (UiComponent) null;
            SaveResultsPromptScreen.a((int[]) null, (UiComponent) null, (UiComponent) null, (UiComponent) null, (byte) -45);
          }
          var5_int = param0.length;
          var6 = new String[var5_int];
          var15 = new char[var5_int];
          var14 = var15;
          var7 = var14;
          var8 = new QuickChatMenu[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var5_int > var10_int; var10_int++) {
              var11 = LobbyUiHelpers.quickChatPhrases.getDefinition(param0[var10_int], true);
              var6[var10_int] = var11.getPreview(-3);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (QuickChatMenu) (stackIn_9_0);
          }
          stackIn_11_0 = new QuickChatMenu(0L, param1, param2, param3, var8, param0, var6, var15);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("hq.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(fa param0, int param1, int param2) {
        BitPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = TextFieldValidator.outgoingPackets;
          var3.writeCipheredOpcode(-13413, param1);
          var3.writeByte(85, param0.field_i);
          var3.writeShort((byte) 122, param0.field_k);
          if (param2 == 49) {
            return;
          }
          field_r = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("hq.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    SaveResultsPromptScreen() {
        super(10, 180, 460, 402, 35, new int[]{23, 24});
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        int var5 = 0;
        int var4 = WidgetGroup.a(pl.pendingAchievementMask, -1) ? 1 : 0;
        if (obfuscationGuard >= 96) {
          var5 = null != VerticalScrollbar.field_Ub ? 1 : 0;
          this.promptText = PauseMenuScreen.field_w + " " + BytePayloadRequest.replaceCharacter(-1, GamePresentationHelpers.formatIndexedText(AchievementBrowserScreen.buildSavePrompt(var4 != 0, var5 != 0, false, 126), new String[]{DesertBackground.field_r}, (byte) 103), '#', "<br><br>");
          return;
        }
    }

    final static void advanceAndDrawFireworks(boolean obfuscationGuard, boolean replaceFinishedBursts, int horizontalOffset) {
        FireworkBurst burst = null;
        int unusedClientFlag = 0;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          SoundCache.advanceFireworks(replaceFinishedBursts, (byte) -51);
          if (!obfuscationGuard) {
            field_y = (String) null;
          }
          burst = (FireworkBurst) (PasswordFieldRenderer.fireworkBursts.first(-58));
          while (burst != null) {
            burst.drawParticles(-1196049244, horizontalOffset << 4);
            burst = (FireworkBurst) (PasswordFieldRenderer.fireworkBursts.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "hq.E(" + obfuscationGuard + ',' + replaceFinishedBursts + ',' + horizontalOffset + ')');
        }
    }

    final void navigateBack(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          fa var3 = (fa) null;
          SaveResultsPromptScreen.a((fa) null, -66, -20);
        }
    }

    public static void f(int param0) {
        validationPending = null;
        field_u = null;
        field_x = null;
        field_y = null;
        if (param0 == 550) {
          packCardIcons = null;
          field_r = null;
          field_t = null;
          field_w = null;
          return;
        }
        field_w = (String) null;
        packCardIcons = null;
        field_r = null;
        field_t = null;
        field_w = null;
    }

    static {
        field_r = "Respect";
        field_x = "To <%0>: ";
        field_u = new String[]{"Do battle with Ninja!", "Amazing scores!", "Fiendish levels!", "Adventures on the high seas!", "Charged multiplayer action!"};
        field_w = "You must play 1 more rated game before playing with the current options.";
        validationPending = new ValidationStatus();
        field_y = "Press <img=1><img=0> or <img=4><img=3> to move the paddle left or right.<br><br>Press <img=2> or <img=5> to launch the ball.";
    }
}
