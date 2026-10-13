/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    static String field_l;
    static int field_c;
    int privateMessageIdLow24;
    String accountName;
    static String[] field_i;
    int chatIconId;
    static boolean field_w;
    static RgbSprite[] field_g;
    String displayName;
    static boolean field_r;
    static RgbSprite field_t;
    int channelId;
    static RgbSprite field_s;
    ClientUiComponent rowComponent;
    static String field_o;
    long accountId;
    int[] responsePhraseIds;
    String channelLabel;
    String text;
    int privateMessageIdHigh16;
    static int consoleArgumentStartKind;
    int contextId;
    boolean systemMessage;

    final int getFilterPriority(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.displayName = (String) null;
        }
        if (!this.systemMessage && (2 != this.channelId ||
          this.chatIconId <= 0)) {
          if (ChannelBaseVolumeConsoleCommand.localAccountId == this.accountId) {
            return 1;
          }
          if (th.socialListState == 2 &&
            jj.isFriend(82, this.accountName)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var7 = param1;
        if (var7 > param3) {
          return false;
        }
        int var8 = -73 / ((param5 + 46) / 53);
        int var9 = var7 + param4;
        if (var9 < param3) {
          return false;
        }
        int var10 = param2;
        if (var10 > param0) {
          return false;
        }
        int var11 = var10 + param6;
        if (var11 < param0) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_g = null;
        field_s = null;
        field_l = null;
        field_o = null;
        field_t = null;
        field_i = null;
        if (param0 != 0) {
          ChatMessage.a(-123, 18, -64, -107, -63, (byte) 82, 91);
        }
    }

    ChatMessage(boolean retainResponsePhraseIds) {
        this.text = BattleGraphicsAssets.decodedChatText;
        if (retainResponsePhraseIds) {
          this.responsePhraseIds = HotspotTextWidget.decodedChatResponsePhraseIds;
        } else {
          this.responsePhraseIds = null;
        }
        this.privateMessageIdHigh16 = PcmPlayerService.decodedPrivateMessageIdHigh16;
        this.channelId = MatchConditionEntry.decodedChatChannel;
        this.channelLabel = BestScoreStrategy.decodedChatChannelLabel;
        this.systemMessage = DualNodeDeque.decodedChatSystemMessage;
        this.accountName = gp.decodedChatAccountName;
        this.displayName = RegistrationAgreementPane.decodedChatDisplayName;
        this.contextId = ut.decodedChatContextId;
        this.privateMessageIdLow24 = th.decodedPrivateMessageIdLow24;
        this.chatIconId = hc.decodedChatIconId;
        this.accountId = ModalDialogHost.decodedChatAccountId;
    }

    ChatMessage(int channelId, String accountName, int contextId, String channelLabel, String text) {
        try {
          this.accountName = accountName;
          this.displayName = accountName;
          this.systemMessage = true;
          this.accountId = 0L;
          this.channelLabel = channelLabel;
          this.contextId = contextId;
          this.chatIconId = 0;
          this.responsePhraseIds = null;
          this.privateMessageIdLow24 = 0;
          this.channelId = channelId;
          this.text = text;
          this.privateMessageIdHigh16 = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mo.<init>(" + channelId + ',' + (accountName != null ? "{...}" : "null") + ',' + contextId + ',' + (channelLabel != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "This game is full.";
        field_r = false;
        field_o = "Click to begin";
        consoleArgumentStartKind = 0;
    }
}
