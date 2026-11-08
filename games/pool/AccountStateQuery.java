/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountStateQuery extends IntrusiveNode {
    static Sprite field_n;
    static byte[] field_u;
    static boolean field_p;
    boolean field_s;
    static int field_r;
    static String raSuggestmute;
    static String tooltipSnookered;
    static int field_t;
    static UiComponent field_m;
    static String ratedMembersonly;
    static SceneNode field_o;
    int[] field_l;
    static int field_q;

    final static boolean isLobbyChatComposerOpen(byte obfuscationGuard) {
        if (!DualLinkNode.field_p) {
          return false;
        }
        if (CookieDateSupport.field_b != 0) {
          return false;
        }
        if (obfuscationGuard != -75) {
          AccountStateQuery.releaseStatics(75);
        }
        return true;
    }

    final static int[] createTintedColorPalette(int color, int alpha, boolean obfuscationGuard) {
        int var4 = 0;
        Sprite var5 = new Sprite(1024, 64);
        Sprite var3 = var5;
        if (obfuscationGuard) {
          AccountStateQuery.releaseStatics(57);
        }
        for (var4 = 0; var3.field_D.length > var4; var4++) {
          var5.field_D[var4] = TriangleRasterizer.colorPalette[var4];
        }
        var3.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, color, alpha);
        OpacityWidget.field_P.bindAsRenderTarget(15100);
        return var3.field_D;
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        raSuggestmute = null;
        field_m = null;
        tooltipSnookered = null;
        ratedMembersonly = null;
        if (param0 != 0) {
          AccountStateQuery.createTintedColorPalette(-16, 85, false);
        }
        field_o = null;
        field_u = null;
    }

    final static boolean isChatRecipientAvailable(boolean obfuscationGuard, long playerId, String name) {
        SocialListEntry var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            var5 = (String) null;
            AccountStateQuery.isChatRecipientAvailable(true, -73L, (String) null);
          }
          var4 = UsernameSuggestionSupport.findSocialEntryByName(62, name);
          if (var4 != null &&
            null != var4.serverName) {
            return true;
          }
          stackIn_10_0 = (null != HighscoresScreen.field_L) && (QuickChatHelpDialog.findLobbyPlayer(playerId, 0) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("tq.A(").append(obfuscationGuard).append(',').append(playerId).append(',');
          if (name == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void setPrivateQuickChatRecipient(long playerId, byte obfuscationGuard, String name) {
        CharSequence var5 = null;
        try {
          CookieDateSupport.field_b = 2;
          ArrayWidgetGroup.field_I = name;
          if (obfuscationGuard != -104) {
            tooltipSnookered = (String) null;
          }
          var5 = (CharSequence) ((Object) name);
          ResourceArchive.field_a = TutorialController.normalizeDisplayName(117, var5);
          QuickChatMenuSupport.field_d = playerId;
          QuickChatNavigationSupport.restoreQuickChatMenu((byte) 11);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tq.G(" + playerId + ',' + obfuscationGuard + ',' + (name != null ? "{...}" : "null") + ')');
        }
    }

    final static void leaveFullscreen(byte obfuscationGuard) {
        if (null == MatchingTextValidator.field_u) {
          return;
        }
        CanvasInputSupport.detachInputListeners(MatchingTextValidator.field_u, 0);
        if (obfuscationGuard > -100) {
          return;
        }
        MatchingTextValidator.field_u.releaseFullscreen(StatefulTextPainter.field_s, -1);
        MatchingTextValidator.field_u = null;
        if (null != PlasmaTableScene.field_gb) {
          PlasmaTableScene.field_gb.restorePreviousViewportSize(22472);
        }
        TimeTrialSelectScreen.field_K.requestFocus();
    }

    final static int[] doubleArrayToFixed(int fractionalBits, int obfuscationGuard, double[] values) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var5 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new int[values.length];
          var3 = var5;
          if (obfuscationGuard != -20607) {
            ratedMembersonly = (String) null;
          }
          for (var4 = 0; var4 < var5.length; var4++) {
            var5[var4] = SingleChildWidget.doubleToFixed(values[var4], fractionalBits, 1);
          }
          stackIn_6_0 = var5;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("tq.D(").append(fractionalBits).append(',').append(obfuscationGuard).append(',');
          if (values == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    AccountStateQuery() {
        this.field_s = false;
    }

    static {
        tooltipSnookered = "Snookered";
        raSuggestmute = "Suggest muting this player";
        field_p = true;
        ratedMembersonly = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
