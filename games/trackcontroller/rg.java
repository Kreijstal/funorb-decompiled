/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_a;
    static int field_b;
    static PlatformTaskDispatcher field_c;

    final static void a(boolean param0) {
        if (param0) {
          field_c = (PlatformTaskDispatcher) null;
        }
    }

    final static void a(MidiFile param0, int param1) {
        try {
          fe.a(true, param0, param1 ^ 15171);
          if (param1 != 14915) {
            MidiFile var3 = (MidiFile) null;
            rg.a((MidiFile) null, 121);
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "rg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17883) {
          field_a = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_a = "Player names can be up to 12 letters, numbers and underscores";
    }
}
