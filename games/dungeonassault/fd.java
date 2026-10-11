/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String[] field_b;
    static String field_a;
    int field_c;

    final static gj b(byte param0) {
        if (param0 != 108) {
          return (gj) null;
        }
        return (gj) ((Object) new fg());
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (ib.field_f != null) {
          var1 = ib.field_f;
          synchronized (var1) {
            ib.field_f = null;
          }
        }
        if (param0 < 24) {
          field_a = (String) null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 18) {
          fd.a(-49);
          field_a = null;
          return;
        }
        field_a = null;
    }

    fd(int param0) {
        this.field_c = param0;
    }

    static {
        field_a = "How will you style yourself?";
    }
}
