/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityValidator extends TextFieldValidator {
    private boolean field_s;
    static String[] field_r;
    private String field_q;
    static int field_t;

    public static void releaseStatics(int param0) {
        if (param0 >= -23) {
          NameAvailabilityValidator.releaseStatics(-116);
        }
        field_r = null;
    }

    final void invalidateCachedAvailability(byte param0) {
        this.field_q = null;
        if (param0 > -92) {
          this.field_s = true;
        }
    }

    final ValidationState validationStateForText(int param0, String param1) {
        AccountServerResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_12_0 = null;
        ValidationState stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!BufferedSocket.isValidUsername((byte) 123, var4)) {
            stackIn_3_0 = QuickChatCommandType.field_h;
            return stackIn_3_0;
          }
          if (param0 != 0) {
            this.invalidateCachedAvailability((byte) -30);
          }
          if (!param1.equals(this.field_q)) {
            var3 = TextLayout.pollUsernameAvailability(param1, (byte) -80);
            if (var3 != null &&
              null == var3.field_i) {
              this.field_q = param1;
              this.field_s = var3.field_f;
            } else {
              stackIn_12_0 = LoadingProgressDialog.field_cb;
              return stackIn_12_0;
            }
          }
          if (this.field_s) {
            stackIn_17_0 = PlayerContextMenu.field_a;
          } else {
            stackIn_17_0 = QuickChatCommandType.field_h;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static long bitOr(long param0, long param1) {
        return param0 | param1;
    }

    final static LobbyPlayerEntry findSocialEntry(long param0, int param1) {
        if (param1 != -26778) {
          field_t = -16;
        }
        return (LobbyPlayerEntry) (QuickChatCommandType.field_a.findByKey(param0, 1));
    }

    final String validationMessageForText(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServerResult var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = LoginPanel.getAccountNameValidationMessage(35, var5);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_q)) {
            var4 = TextLayout.pollUsernameAvailability(param0, (byte) -80);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_i) {
              return null;
            }
            this.field_s = var4.field_f;
            this.field_q = param0;
          }
          if (this.field_s) {
            stackIn_18_0 = ClientProtocolStage.field_e;
            return stackIn_18_0;
          }
          stackIn_16_0 = FullscreenErrorDialog.field_fb;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void initializeLobbyState(byte param0, int param1, UiComponent param2, int param3, int param4, UiComponent param5, byte[] param6, UiComponent param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          EditableTextWidget.field_Y = param6;
          LoadingStageHook.field_a = param4;
          IsaacCipher.field_c = -1L;
          GameOptionControls.field_k = param6.length;
          FullscreenFocusCanvas.field_a = false;
          PendingSubmission.field_o = new byte[(LoadingStageHook.field_a + 7) / 8];
          AccountWelcomePanel.field_N = null;
          GameKeyHandler.field_a = null;
          var10_int = 0;
          for (var11 = 0; var11 < EditableTextWidget.field_Y.length; var11++) {
            var10_int = var10_int + (255 & EditableTextWidget.field_Y[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          StringPadHelpers.field_a = new byte[var10_int];
          if (param5.field_fb == null) {
            param5.field_fb = new IntrusiveDeque();
          }
          if (param0 != -58) {
            NameAvailabilityValidator.releaseStatics(71);
          }
          AlternateLongAndTextCredentials.field_p = param5.field_fb;
          AlternateLongAndTextCredentials.field_p.clear(1);
          QuickChatCommandType.field_a = new DualLinkNodeHashTable(param9);
          ContextMenu.field_Pb = -1;
          QuickChatHelpDialog.field_Nb = 0;
          TextureCache.field_g = 0;
          IntrusiveNode.field_l = -1;
          if (null == param7.field_fb) {
            param7.field_fb = new IntrusiveDeque();
          }
          InputDetachHelpers.field_a = param7.field_fb;
          InputDetachHelpers.field_a.clear(1);
          QuickChatCommandType.field_e = new DualLinkNodeHashTable(param1);
          if (null == param2.field_fb) {
            param2.field_fb = new IntrusiveDeque();
          }
          ModelMergeHelpers.field_d = param2.field_fb;
          ModelMergeHelpers.field_d.clear(1);
          WidgetStyleLayer.field_g = new DualLinkNodeHashTable(param3);
          UrlFetchTask.field_f = 0L;
          QuickChatPhraseCache.field_a = param8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("tm.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param7 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    NameAvailabilityValidator(EditableTextWidget param0) {
        super(param0);
        this.field_s = false;
    }

    static {
        field_r = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_t = 0;
    }
}
