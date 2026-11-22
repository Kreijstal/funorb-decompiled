/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryKeyboardSupport {
    static String field_a;
    static UiComponent field_b;
    private static String[] field_c;

    final static boolean handleNameEntryKeyInput(boolean param0) {
        if (!param0) {
          return false;
        }
        if (bl.field_a == null) {
          return false;
        }
        if (!bl.field_a.handleKeyInput(false)) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 71) {
          NameEntryKeyboardSupport.handleNameEntryKeyInput(true);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = new String[5];
        field_c[3] = "Flower";
        field_c[2] = "T2";
        field_c[1] = "T1 Green";
        field_c[0] = "T1 Red";
        field_c[4] = "Hanging Moss 1";
        field_a = "GRAPHICS QUALITY";
    }
}
