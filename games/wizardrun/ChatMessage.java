/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    int field_c;
    private int senderRights;
    String message;
    int messageType;
    int[] quickChatParameters;
    int field_d;
    static IntegerSyntaxHelpers field_j;
    static Sprite field_f;
    static int field_k;
    private long senderId;
    private String senderName;
    private boolean field_a;

    final static int hitTestMembershipButton(int param0, int param1, int param2) {
        if (param0 != 29292) {
          field_j = (IntegerSyntaxHelpers) null;
        }
        if (ToggleButton.field_H == null) {
          return -1;
        }
        if (param2 >= GzipDecompressor.field_c && ToggleButton.field_H.width + GzipDecompressor.field_c > param2 && LoginForm.field_L <= param1 &&
          !(LoginForm.field_L + ToggleButton.field_H.height <= param1)) {
          return 0;
        }
        if (param2 >= IndexedSpriteArrayFactory.field_f && param2 < IndexedSpriteArrayFactory.field_f + ToggleButton.field_H.width && param1 >= ProxyAuthenticationException.field_b &&
          !(ToggleButton.field_H.height + ProxyAuthenticationException.field_b <= param1)) {
          return 1;
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 2) {
          field_j = (IntegerSyntaxHelpers) null;
        }
    }

    final int getRetentionPriority(byte param0) {
        if (!this.field_a && (this.messageType != 2 ||
          this.senderRights <= 0)) {
          if (param0 != 102) {
            this.messageType = -108;
          }
          if (~LevelData.field_e == ~this.senderId) {
            return 1;
          }
          if (DisplayNameValidator.field_k == 2 &&
            FriendEntry.isFriend(this.senderName, (byte) -85)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    ChatMessage(boolean param0) {
        this.messageType = ByteStorage.field_e;
        this.senderRights = RadixParsingHelpers.field_a;
        this.field_a = DisplayModeInfo.field_a;
        this.field_c = NodeHashTableIterator.field_g;
        this.message = CheckboxPainter.field_f;
        this.field_d = QuickChatPhraseDefinition.field_r;
        this.senderName = LevelData.field_b;
        if (!param0) {
          this.quickChatParameters = null;
        } else {
          this.quickChatParameters = PasswordValidator.field_m;
        }
        this.senderId = RadialSelectorWidget.field_N;
    }

    static {
    }
}
