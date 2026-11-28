/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static int field_c;
    static String field_a;
    static int field_b;

    public static void clearStaticReferences(int param0) {
        if (param0 != -14935) {
          return;
        }
        field_a = null;
    }

    final static boolean b(int param0) {
        if (param0 != 21856) {
          fi.clearStaticReferences(93);
          if (null == MouseWheelInput.field_b) {
            return false;
          }
          if (MouseWheelInput.field_b.getTopOpenDialog(false) != null) {
            return true;
          }
          return false;
        }
        if (null == MouseWheelInput.field_b) {
          return false;
        }
        if (MouseWheelInput.field_b.getTopOpenDialog(false) != null) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Loading graphics";
    }
}
