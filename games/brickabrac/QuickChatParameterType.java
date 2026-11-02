/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatParameterType {
    static RgbSprite field_j;
    int definitionWordCount;
    static String field_f;
    static String[] field_a;
    static boolean field_d;
    static RgbSprite field_i;
    static boolean tooltipSuppressed;
    static RgbSprite parisMidSprite;
    int commandId;
    static boolean field_b;

    public static void clearSharedReferences(int obfuscationGuard) {
        int var1 = -115 % ((83 - obfuscationGuard) / 41);
        field_f = null;
        field_a = null;
        field_i = null;
        parisMidSprite = null;
        field_j = null;
    }

    final static boolean openQuickChatForRecipient(int[] menuIndices, long recipientId, int channel, boolean flag, String recipientName) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!QuickChatHelpDialog.canUseQuickChat(recipientId, -3, recipientName, menuIndices, channel)) {
            return false;
          }
          if (channel == 1) {
            channel = 0;
          }
          DualLinkNode.quickChatRecipient = recipientName;
          ScreenNavigationHelpers.quickChatChannel = channel;
          var7 = (CharSequence) ((Object) recipientName);
          QuickChatHelpDialog.field_Qb = ChatMessage.normalizePlayerName(var7, 64);
          CanvasResizeController.field_n = recipientId;
          var6 = SaveResultsPromptScreen.a(menuIndices, WidgetLayerStack.field_K, ArchiveIndex.field_j, SoftwareFramebuffer.field_e, (byte) -78);
          if (flag) {
            field_f = (String) null;
          }
          HuffmanCodec.installQuickChatMenu(105, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("th.B(");
          if (menuIndices == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(recipientId).append(',').append(channel).append(',').append(flag).append(',');
          if (recipientName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 == -63) {
          UsernameSuggestionPanel.increaseMasterSoundGain(true);
          return;
        }
        String var2 = (String) null;
        QuickChatParameterType.openQuickChatForRecipient((int[]) null, 43L, -67, true, (String) null);
        UsernameSuggestionPanel.increaseMasterSoundGain(true);
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -81) {
            QuickChatParameterType.a((byte) -77);
          }
          stackIn_3_0 = AchievementsScreen.a(0, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("th.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void closeQuickChatIfOpen(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          QuickChatParameterType.a((byte) 83);
          if (!TooltipSprite.quickChatMenuOpen) {
            return;
          }
          GamePresentationHelpers.closeQuickChatMenu(-1);
          return;
        }
        if (TooltipSprite.quickChatMenuOpen) {
          GamePresentationHelpers.closeQuickChatMenu(-1);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatParameterType(int commandId, int unusedOption0, int unusedOption1, int definitionWordCount) {
        this.definitionWordCount = definitionWordCount;
        this.commandId = commandId;
    }

    static {
        tooltipSuppressed = false;
        field_f = "Players: ";
    }
}
