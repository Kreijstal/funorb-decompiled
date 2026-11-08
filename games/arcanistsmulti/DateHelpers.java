/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DateHelpers {
    static String field_b;
    static String field_g;
    static ValidationState field_k;
    static String field_l;
    static String field_i;
    static IndexedSprite[] field_j;
    static int field_m;
    static int field_h;
    static String field_n;
    static Sprite field_a;
    static String field_e;
    static String field_d;
    static IndexedSprite[] field_c;
    static byte[] field_f;

    final static int currentYear(int param0) {
        int var1 = -69 / ((53 - param0) / 62);
        return new Date().getYear() + 1900;
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_a = null;
        field_f = null;
        field_n = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_g = null;
        field_c = null;
        field_i = null;
        if (param0 == 64) {
          field_e = null;
          field_l = null;
          return;
        }
        SceneWidget var2 = (SceneWidget) null;
        DateHelpers.linkScenes((SceneWidget) null, 47, (SceneWidget) null);
        field_e = null;
        field_l = null;
    }

    final static void linkScenes(SceneWidget param0, int param1, SceneWidget param2) {
        try {
          if (null == param0.field_G) {
            param0.field_G = new IntrusiveDeque();
          }
          if (param2.field_G == null) {
            param2.field_G = new IntrusiveDeque();
          }
          if (StatusDialog.field_Qb == null) {
            StatusDialog.field_Qb = new IntrusiveNodeHashTable(64);
          }
          if (null == QuickChatHelpers.field_c) {
            QuickChatHelpers.field_c = new IntrusiveNodeHashTable(64);
          }
          TextLine.field_d = param0.field_G;
          if (param1 != 64) {
            field_e = (String) null;
          }
          QuickChatCategory.field_B = param2.field_G;
          MessageDialog.clearLobbyEntries(65);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ra.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<shad><col=<%0>>STONE</col></shad>";
        field_g = "Only two targets left! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_i = "Spellbook not purchased";
        field_l = "Press F10 to open Quick Chat.";
        field_k = new ValidationState();
        field_e = "<shad><col=<%0>>NATURE</col></shad>";
        field_n = "Offer rematch";
        field_d = "Loading fonts";
    }
}
