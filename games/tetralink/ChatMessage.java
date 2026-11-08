/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    boolean field_l;
    static String field_d;
    int[] field_a;
    String field_n;
    int field_j;
    String field_e;
    static String field_t;
    int field_i;
    static String field_m;
    String field_c;
    int field_k;
    static int[] field_p;
    static UiComponent field_b;
    int field_g;
    static Sprite[] field_q;
    long field_r;
    static boolean field_o;
    UiComponent field_f;
    String field_h;
    int field_s;

    final int getFilterPriority(byte param0) {
        if (!this.field_l && (this.field_i != 2 ||
          0 >= this.field_k)) {
          if (IsaacCipher.field_c == this.field_r) {
            return 1;
          }
          if (param0 != -63) {
            this.getFilterPriority((byte) -16);
          }
          if (TwoColumnListPanel.field_Tb == 2 &&
            IsaacCipher.isFriend(1, this.field_n)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_m = null;
        field_t = null;
        field_b = null;
        int var1 = 95 % ((-43 - param0) / 40);
        field_q = null;
        field_d = null;
    }

    ChatMessage(boolean param0) {
        this.field_j = LoadingStatusHelpers.field_c;
        this.field_k = CheckboxPainter.field_i;
        this.field_n = TetraLink.field_M;
        this.field_g = GameOptionControls.field_a;
        this.field_e = MidiPcmStream.field_O;
        this.field_s = NameSuggestionsPanel.field_O;
        this.field_h = ContentTransitionDialog.field_fb;
        this.field_c = ValidationStatusIcon.field_U;
        if (param0) {
          this.field_a = MouseInputHandler.field_i;
        } else {
          this.field_a = null;
        }
        this.field_r = LobbyGame.field_tc;
        this.field_l = CachedArchiveSource.field_s;
        this.field_i = MusicPatch.field_u;
    }

    ChatMessage(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_j = param2;
          this.field_r = 0L;
          this.field_l = true;
          this.field_n = param1;
          this.field_a = null;
          this.field_k = 0;
          this.field_s = 0;
          this.field_g = 0;
          this.field_e = param1;
          this.field_c = param3;
          this.field_i = param0;
          this.field_h = param4;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Show chat";
        field_t = "Show game chat from my friends";
    }
}
