/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatLine {
    int[] field_f;
    int field_d;
    int field_m;
    int field_b;
    static IndexedSprite[] field_c;
    static IndexedSprite[] field_l;
    int field_k;
    SceneWidget field_a;
    String field_e;
    String field_n;
    long field_h;
    static String field_j;
    static boolean field_r;
    boolean field_i;
    static int[] field_p;
    int field_q;
    String field_o;
    String field_g;

    final int getStatusIcon(int param0) {
        if (this.field_i) {
          return 2;
        }
        if (this.field_m == 2 &&
          this.field_b > 0) {
          return 2;
        }
        if (~this.field_h == ~MembershipGlobals.field_a) {
          return 1;
        }
        if (SpriteState.field_t == 2 &&
          ArrayWidgetContainer.hasEntryNamed(this.field_n, 1)) {
          return 1;
        }
        if (param0 <= -19) {
          return 0;
        }
        this.field_a = (SceneWidget) null;
        return 0;
    }

    final static void updateTurnCaptions(int param0) {
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == SpriteState.field_z) {
          return;
        }
        if (param0 != -3) {
          field_c = (IndexedSprite[]) null;
          if ((SpriteState.field_z.field_D & 1 << SpriteState.field_z.field_I) != 0) {
            GameSelectionHelpers.field_g[10] = ClipState.field_s;
            return;
          }
          if (0 != SpriteState.field_z.field_D) {
            GameSelectionHelpers.field_g[10] = ContextActionMenu.field_Nb;
            return;
          }
          GameSelectionHelpers.field_g[10] = BirthDateEntryPanel.field_K;
          return;
        }
        if ((SpriteState.field_z.field_D & 1 << SpriteState.field_z.field_I) != 0) {
          GameSelectionHelpers.field_g[10] = ClipState.field_s;
          return;
        }
        if (0 != SpriteState.field_z.field_D) {
          GameSelectionHelpers.field_g[10] = ContextActionMenu.field_Nb;
          return;
        }
        GameSelectionHelpers.field_g[10] = BirthDateEntryPanel.field_K;
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_j = null;
        field_l = null;
        field_c = null;
        if (param0 != -25776) {
          field_p = (int[]) null;
        }
    }

    final static int floorDivide(int param0, int param1, int param2) {
        if (param1 != -271087521) {
          return -96;
        }
        int var3 = param2 >>> 31;
        return (var3 + param2) / param0 - var3;
    }

    ChatLine(boolean param0) {
        this.field_i = ValidationHelpWidget.field_V;
        this.field_h = FadingModalPanel.field_P;
        this.field_e = PendingTask.field_p;
        this.field_b = Crc32Helpers.field_e;
        this.field_o = NumericDateInputWidget.field_N;
        this.field_g = RawDataNode.field_j;
        this.field_q = QuickChatInputHelpers.field_c;
        this.field_d = ChatPanel.field_f;
        if (param0) {
          this.field_f = ImageProducerRasterBuffer.field_s;
        } else {
          this.field_f = null;
        }
        this.field_n = FrameAndQuickChatHelpers.field_a;
        this.field_k = Scrollbar.field_M;
        this.field_m = ScrollContainer.field_W;
    }

    ChatLine(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_k = 0;
          this.field_f = null;
          this.field_g = param1;
          this.field_n = param1;
          this.field_b = 0;
          this.field_i = true;
          this.field_q = param2;
          this.field_e = param4;
          this.field_d = 0;
          this.field_h = 0L;
          this.field_o = param3;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = false;
        field_j = "Hide lobby chat";
    }
}
