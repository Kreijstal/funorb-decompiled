/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RequestQueueHelpers {
    static String field_e;
    static IntrusiveDequeCursor field_b;
    static boolean field_c;
    static int field_a;
    static SceneWidget field_d;

    final static void resetRequestQueue(boolean param0) {
        ScreenClearHelpers.field_b = new IntrusiveDeque();
        if (!param0) {
          RequestQueueHelpers.releaseStatics((byte) 83);
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 > -19) {
          RequestQueueHelpers.resetRequestQueue(true);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_e = "";
        field_a = 0;
        field_b = new IntrusiveDequeCursor();
    }
}
