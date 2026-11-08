/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServerResult {
    boolean field_f;
    String[] field_h;
    static String field_c;
    static String field_j;
    String field_i;
    boolean field_b;
    static QuickChatHelpDialog field_g;
    int field_d;
    static long field_k;
    static int field_e;
    static boolean field_a;

    final static byte[] readTextResourceBytes(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -1) {
            stackIn_4_0 = VerticalScrollbar.field_Nb.getFileByName("", param0, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sj.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean openPrivateQuickChat(long param0, String param1, int[] param2, int param3, int param4) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        Archive var7 = null;
        CharSequence var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!AccountCreationDialog.canSendQuickChat(param0, param4, param1, (byte) -94, param2)) {
            return false;
          }
          if (param4 == 1) {
            param4 = 0;
          }
          LongAndTextCredentials.field_m = param1;
          SecondaryNodeDequeIterator.field_d = param4;
          var8 = (CharSequence) ((Object) param1);
          NineSliceFrameHelpers.field_a = DialWidgetPainter.normalizeDisplayName(var8, (byte) 115);
          if (param3 < 55) {
            var7 = (Archive) null;
            AccountServerResult.loadIndexedSprite(-34, (Archive) null, 19, 68);
          }
          PendingListRequest.field_o = param0;
          var6 = ProgressMessageDialog.createQuickChatPhraseMenu(-29, WeightedLruCache.field_b, TriangleSpanHelpers.field_a, PacketDiagnosticsHelpers.field_n, param2);
          BackgroundSparkle.showQuickChatMenu(false, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("sj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (param0 != 0) {
          field_a = true;
        }
    }

    final static boolean startAccountCreation(int param0, String param1, String param2, AccountCreationForm param3, String param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        AccountCreationDialog var8 = null;
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
        try {
          if (AnimationPlayer.field_d != HotspotTextWidget.field_Q) {
            return false;
          }
          if (param5 != -1) {
            return false;
          }
          var8 = new AccountCreationDialog(InsetTextPainter.field_s, param3);
          InsetTextPainter.field_s.pushLayer(var8, false);
          if (ImageProducerRasterBuffer.hasStatButtonCookie(2)) {
            var8.showTimeoutResult(param5 + 45);
            return true;
          }
          AnimationPlayer.field_d = ArchiveRequest.field_C;
          NotificationToast.field_s = param2;
          LoadingStepTracker.field_k = param0;
          InputDetachHelpers.field_c = param4;
          PendingListRequest.field_q = param6;
          StatusRequestHelpers.field_e = param1;
          TextHighlightSpan.field_n = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
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
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static Sprite loadIndexedSprite(int param0, Archive param1, int param2, int param3) {
        RuntimeException var4 = null;
        int[] var5 = null;
        Object stackIn_4_0 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            var5 = (int[]) null;
            AccountServerResult.openPrivateQuickChat(54L, (String) null, (int[]) null, -74, -128);
          }
          if (AccountTermsPanel.decodeSpriteSheetFromArchive(param3, param1, param2, param0 - 49)) {
            stackIn_6_0 = DisplayMode.buildFirstDecodedSprite(0);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (Sprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    AccountServerResult(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    final static boolean isAllowedNameCharacter(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = TetraLink.field_J;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (LongAndTextCredentials.isAsciiAlphanumeric(65, param1)) {
            return true;
          }
          var8 = HuffmanCodec.field_b;
          var7 = var8;
          var6 = var7;
          var2 = var6;
          for (var3 = 0; var3 < var8.length; var3++) {
            var4 = var8[var3];
            if (param1 == var4) {
              return true;
            }
          }
          var2Lifetime1 = GameApplet.field_g;
          var3Lifetime1 = 0;
          while (var3Lifetime1 < var2Lifetime1.length) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            stackIn_22_0 = ~param1;
            stackIn_22_1 = ~var4Lifetime1;
            if (stackIn_22_0 == stackIn_22_1) {
              return true;
            }
            var3Lifetime1++;
          }
          if (param0 != 3010) {
            field_e = -93;
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "sj.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_j = "Played";
        field_c = null;
        field_e = -1;
    }
}
