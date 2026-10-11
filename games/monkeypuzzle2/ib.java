/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static le field_d;
    static int field_a;
    static le field_b;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 2) {
          return true;
        }
        stackIn_8_0 = (this == qk.field_c) || (ea.field_a == this) || (this == wh.field_b);
        return stackIn_8_0;
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1_int = 0;
        for (var2 = 0; var2 < jk.field_A; var2++) {
          if (null == jk.field_C[var2] ||
            jk.field_C[var2].h()) {
            var1_int = 1;
            break;
          }
        }
        if (var1_int == 0) {
          return;
        }
        try {
          jk.field_C[var2] = li.a(ke.field_h[2], param0, 96);
          na.a((byte) 38, jk.field_C[var2]);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ib.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 1 % ((-67 - param0) / 49);
    }

    static {
    }
}
