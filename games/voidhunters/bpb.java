/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bpb extends rqa {
    static String field_o;
    static String[] field_q;
    static phb[][] field_p;

    final nc a(nc[] param0, int param1) {
        si.a(144, 62, param0[0].a(55));
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          bpb.a(55);
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    bpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
        field_o = "Special Weapon";
    }
}
