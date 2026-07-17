/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends RuntimeException {
    String field_a;
    Throwable field_c;
    static tp[] field_d;
    static int[] field_b;

    final static int a() {
        return ri.field_a - bf.field_c;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
    }

    ub(Throwable param0, String param1) {
        ((ub) this).field_a = param1;
        ((ub) this).field_c = param0;
    }

    final static void b() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (tm.field_b != null) {
          var1 = (Object) (Object) tm.field_b;
          synchronized (var1) {
            L0: {
              tm.field_b = null;
              break L0;
            }
          }
          int discarded$10 = -12;
          int discarded$11 = ub.a();
          return;
        } else {
          int discarded$12 = -12;
          int discarded$13 = ub.a();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new tp[255];
        for (var0 = 0; field_d.length > var0; var0++) {
            field_d[var0] = new tp();
        }
    }
}
