/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static IntrusiveDeque field_a;
    static int field_d;
    static Archive field_b;
    static Archive field_c;

    final static void playIndexedSoundEffect(byte param0, int param1) {
        if (param0 == -68) {
          SocketArchiveRequestConnection.a(TextLineMetrics.field_d[param1], NameSuggestionsPanel.field_G[param1], (byte) -110);
          return;
        }
        field_a = (IntrusiveDeque) null;
        SocketArchiveRequestConnection.a(TextLineMetrics.field_d[param1], NameSuggestionsPanel.field_G[param1], (byte) -110);
    }

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 < 18) {
          return;
        }
        field_b = null;
    }

    static {
        field_a = new IntrusiveDeque();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void playIndexedSoundEffectWithIntGuard(int param0, int param1) {
        if (param0 == -68) {
          SocketArchiveRequestConnection.a(TextLineMetrics.field_d[param1], NameSuggestionsPanel.field_G[param1], (byte) -110);
          return;
        }
        field_a = (IntrusiveDeque) null;
        SocketArchiveRequestConnection.a(TextLineMetrics.field_d[param1], NameSuggestionsPanel.field_G[param1], (byte) -110);
    }
}
