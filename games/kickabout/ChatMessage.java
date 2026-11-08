/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    String field_h;
    int field_p;
    String field_l;
    static int field_i;
    int field_j;
    int field_c;
    String field_g;
    static String[] field_a;
    static UiLayoutNode field_e;
    static String field_k;
    long field_d;
    String field_q;
    boolean field_m;
    UiLayoutNode field_s;
    int field_o;
    int[] field_r;
    int field_n;
    static Sprite[] field_b;
    static int[][] field_f;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_k = null;
        field_e = null;
        if (param0 != 2) {
          return;
        }
        field_f = (int[][]) null;
        field_b = null;
    }

    final int b(int param0) {
        if (this.field_m) {
          return 2;
        }
        if (2 != this.field_c) {
          if (param0 != 80) {
            this.field_l = (String) null;
          }
        } else {
          if (this.field_o > 0) {
            return 2;
          }
          if (param0 == 80) {
            if (this.field_d == AnimationPlayer.field_c) {
              return 1;
            }
            if (PitchCoordinateSupport.field_d != 2) {
              return 0;
            }
            if (IntKeyLookup.a(this.field_q, param0 + 18)) {
              return 1;
            }
            return 0;
          }
          this.field_l = (String) null;
        }
        if (this.field_d == AnimationPlayer.field_c) {
          return 1;
        }
        if (PitchCoordinateSupport.field_d != 2) {
          return 0;
        }
        if (!IntKeyLookup.a(this.field_q, param0 + 18)) {
          return 0;
        }
        return 1;
    }

    ChatMessage(boolean param0) {
        this.field_l = MatchTextInputOverlay.field_e;
        this.field_g = GameMediaSupport.field_a;
        this.field_p = DateInputWidget.field_G;
        this.field_h = SortCriterion.field_d;
        this.field_n = WorldSpriteDecoration.field_f;
        if (!param0) {
          this.field_r = null;
        } else {
          this.field_r = ChatComposeSupport.field_b;
        }
        this.field_c = RegistrationRequestDialog.field_ob;
        this.field_j = FindingOpponentScreen.field_E;
        this.field_m = PasswordValidator.field_l;
        this.field_d = MessageDialog.field_z;
        this.field_o = SellPlayerDialog.field_F;
        this.field_q = LookupRecordUpdate.field_f;
    }

    ChatMessage(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_r = null;
          this.field_d = 0L;
          this.field_j = 0;
          this.field_o = 0;
          this.field_l = param3;
          this.field_n = param2;
          this.field_h = param1;
          this.field_m = true;
          this.field_c = param0;
          this.field_p = 0;
          this.field_g = param4;
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_k = "to return to the normal view.";
        field_f = new int[5][2];
        field_f[0][1] = 220;
        field_f[0][0] = 80;
        field_f[1][0] = 190;
        field_f[1][1] = 220;
        field_f[2][0] = 290;
        field_f[2][1] = 220;
        field_f[3][0] = 120;
        field_f[3][1] = 300;
        field_f[4][0] = 250;
        field_f[4][1] = 300;
        field_i = 0;
    }
}
