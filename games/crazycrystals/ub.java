/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends RuntimeException {
    String field_a;
    Throwable field_c;
    static tp[] field_d;
    static int[] field_b;

    final static int a(int param0) {
        if (param0 != 255) {
            return -99;
        }
        return ri.field_a - bf.field_c;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        if (!param0) {
            field_b = (int[]) null;
        }
    }

    ub(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    final static void b(int param0) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (tm.field_b != null) {
          var1 = tm.field_b;
          synchronized (var1) {
            L0: {
              tm.field_b = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              discarded$7 = ub.a(-12);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              discarded$8 = ub.a(-12);
              break L2;
            }
          }
          return;
        }
    }

    static {
        int var0 = 0;
        field_d = new tp[255];
        for (var0 = 0; field_d.length > var0; var0++) {
            field_d[var0] = new tp();
        }
    }
}
