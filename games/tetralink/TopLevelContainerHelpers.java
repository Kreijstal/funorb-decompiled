/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TopLevelContainerHelpers {
    static IndexedSprite[] field_a;
    static UiComponent field_d;
    static WidgetContainer field_i;
    static TwoColumnListPanel field_f;
    static String[] field_h;
    static String[] field_g;
    static int field_e;
    static String field_c;
    static PlatformTaskDispatcher field_b;

    final static boolean isAccountCreationMode(byte param0) {
        if (param0 < 28) {
          field_e = 38;
          return RasterStackHelpers.field_d;
        }
        return RasterStackHelpers.field_d;
    }

    final static java.awt.Container getTopLevelContainer(byte param0) {
        if (param0 > -15) {
          return (java.awt.Container) null;
        }
        if (null != IterableNodeHashTable.field_h) {
          return (java.awt.Container) ((Object) IterableNodeHashTable.field_h);
        }
        return (java.awt.Container) ((Object) ProgressMessageDialog.getHostApplet(13));
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        if (param0 > 25) {
          field_d = null;
          field_f = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_c = (String) null;
        field_d = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_i = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_c = "You can join this game";
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
