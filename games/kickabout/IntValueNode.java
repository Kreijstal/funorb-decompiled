/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntValueNode extends IntrusiveNode {
    static String field_h;
    static WorldSpriteDecoration[] field_e;
    static String field_k;
    static String[] field_f;
    static NineSlicePanelPainter field_g;
    int field_j;
    static UiLayoutNode field_i;

    final static boolean b(int param0) {
        int var1 = 66 % ((param0 + 43) / 35);
        if (TextFieldValidator.f(-1)) {
          return false;
        }
        if (WeightedLruCache.field_d > 0) {
          return true;
        }
        return false;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_e = null;
        field_f = null;
        if (!param0) {
          field_i = null;
          field_k = null;
          field_g = null;
          return;
        }
        IntValueNode.a(-54);
        field_i = null;
        field_k = null;
        field_g = null;
    }

    final static void a(int param0) {
        if (param0 < 13) {
          IntValueNode.a(-87);
          QuickChatCategoryCache.field_i = null;
          BrowserUiSupport.field_b = null;
          return;
        }
        QuickChatCategoryCache.field_i = null;
        BrowserUiSupport.field_b = null;
    }

    IntValueNode(int param0) {
        this.field_j = param0;
    }

    static {
        field_h = "Show lobby chat from my friends";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
