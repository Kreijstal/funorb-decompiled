/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String fullscreenCloseButtonText;
    static m field_d;
    static java.awt.Font field_a;
    static m field_c;

    final static sl a(int param0, boolean param1) {
        sl var2 = new sl(true);
        var2.field_d = param1 ? true : false;
        int var3 = -105 / ((-35 - param0) / 37);
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_9_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = je.field_j;
        synchronized (var1_ref) {
          if (param0 <= 41) {
            return false;
          }
          if (vd.field_n == pc.field_p) {
            return false;
          }
          ki.field_d = kj.field_O[vd.field_n];
          te.field_a = ai.field_n[vd.field_n];
          vd.field_n = 1 + vd.field_n & 127;
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        fullscreenCloseButtonText = null;
        field_d = null;
        if (param0) {
            hh.a(102, true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        fullscreenCloseButtonText = "Close";
    }
}
