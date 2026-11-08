/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyEventGlobals {
    static int field_a;
    static boolean field_d;
    static String field_c;
    static String field_e;
    static ConnectionState field_b;

    public static void releaseStatics(int param0) {
        if (param0 != -19064) {
          return;
        }
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final static boolean isCanvasResizeAllowed(boolean param0) {
        if (param0) {
          field_e = (String) null;
          if (GzipDecoder.field_c == null) {
            return false;
          }
          if (GzipDecoder.field_c.canResize((byte) 99)) {
            return true;
          }
          return false;
        }
        if (GzipDecoder.field_c == null) {
          return false;
        }
        if (GzipDecoder.field_c.canResize((byte) 99)) {
          return true;
        }
        return false;
    }

    static {
        field_d = false;
        field_c = "Encouraging rule breaking";
        field_e = "You are on <%0>";
        field_b = new ConnectionState();
    }
}
