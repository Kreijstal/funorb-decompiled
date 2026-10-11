/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static String field_g;
    static int[] field_c;
    static int field_d;
    static int field_a;
    static oh[][] field_b;
    static fg field_f;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -9648) {
          return;
        }
        if (vi.field_a == null) {
          return;
        }
        var1 = vi.field_a;
        synchronized (var1) {
          vi.field_a = null;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = (oh[][]) null;
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 != 14236) {
          rl.b(109);
        }
    }

    static {
        field_e = "Game";
        field_g = "Loading music";
    }
}
