/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static uf field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != -9192) {
          kb.b(-118);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        if (param0 == 808) {
          DisplayNameSelectionPanel.field_N.closeAllDialogs(-20281);
          if (DisplayNameSelectionPanel.field_A == null) {
            DisplayNameSelectionPanel.field_A = new db(DisplayNameSelectionPanel.field_N, ej.field_c);
          }
          DisplayNameSelectionPanel.field_N.showDialog(DisplayNameSelectionPanel.field_A, false);
          return;
        }
        kb.a(-78);
        DisplayNameSelectionPanel.field_N.closeAllDialogs(-20281);
        if (DisplayNameSelectionPanel.field_A == null) {
          DisplayNameSelectionPanel.field_A = new db(DisplayNameSelectionPanel.field_N, ej.field_c);
        }
        DisplayNameSelectionPanel.field_N.showDialog(DisplayNameSelectionPanel.field_A, false);
    }

    static {
        field_b = new uf();
    }
}
