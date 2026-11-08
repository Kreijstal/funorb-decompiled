/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreRowName {
    boolean field_a;
    static IntrusiveDeque field_f;
    static String field_b;
    String field_g;
    static IntrusiveDeque field_c;
    String field_e;
    static ClientProtocolStage field_d;

    final static int pollArchiveLoading(boolean param0) {
        if (!param0) {
          return -49;
        }
        CacheEntry.field_u.serviceProviders((byte) 111);
        if (!Renderable.field_e.poll(false)) {
          return ServerConnectionHelpers.pollServerConnection(-102);
        }
        return 0;
    }

    public static void releaseStatics(int param0) {
        int var1 = 87 / ((param0 - 86) / 37);
        field_f = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_f = new IntrusiveDeque();
        field_c = new IntrusiveDeque();
        field_d = new ClientProtocolStage();
    }
}
