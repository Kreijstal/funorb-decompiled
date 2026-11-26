/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static UiPanel field_a;
    static int field_b;

    final static int a(int param0) {
        if (param0 > -89) {
          oi.clearStaticReferences((byte) -32);
          return -sg.field_d + c.field_e;
        }
        return -sg.field_d + c.field_e;
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 < 76) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param2 < 119) {
          return;
        }
        SocketConnector.a(param3, NetworkArchiveRequest.field_G, 2, NanoFrameTimer.field_k, param1, param0, Archive.field_f);
    }

    static {
    }
}
