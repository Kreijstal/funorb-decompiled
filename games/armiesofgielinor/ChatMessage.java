/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    static String field_l;
    static int field_c;
    int identityWord1;
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
    int[] quickChatValues;
    String channelLabel;
    String text;
    int identityWord0;
    static int field_j;
    int contextId;
    boolean systemMessage;

    final int getFilterPriority(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.displayName = (String) null;
        }
        if (!this.systemMessage && (2 != this.channelId ||
          this.chatIconId <= 0)) {
          if (oh.localAccountId == this.accountId) {
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

    ChatMessage(boolean retainQuickChatValues) {
        this.text = dg.field_b;
        if (retainQuickChatValues) {
          this.quickChatValues = hv.field_R;
        } else {
          this.quickChatValues = null;
        }
        this.identityWord0 = rh.field_e;
        this.channelId = MatchConditionEntry.field_k;
        this.channelLabel = BestScoreStrategy.field_k;
        this.systemMessage = DualNodeDeque.field_b;
        this.accountName = gp.field_b;
        this.displayName = qd.field_L;
        this.contextId = ut.field_eb;
        this.identityWord1 = th.field_c;
        this.chatIconId = hc.field_e;
        this.accountId = gk.field_I;
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
          this.quickChatValues = null;
          this.identityWord1 = 0;
          this.channelId = channelId;
          this.text = text;
          this.identityWord0 = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mo.<init>(" + channelId + ',' + (accountName != null ? "{...}" : "null") + ',' + contextId + ',' + (channelLabel != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "This game is full.";
        field_r = false;
        field_o = "Click to begin";
        field_j = 0;
    }
}
