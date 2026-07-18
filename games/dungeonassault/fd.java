/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String[] field_b;
    static String field_a;
    int field_c;

    final static gj b(byte param0) {
        return (gj) (Object) new fg();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (ib.field_f != null) {
          var1 = (Object) (Object) ib.field_f;
          synchronized (var1) {
            L0: {
              ib.field_f = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    fd(int param0) {
        ((fd) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "How will you style yourself?";
    }
}
