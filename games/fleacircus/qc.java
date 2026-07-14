/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static int field_b;
    private dd[] field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        og.a(param4, ((qc) this).field_a, 96, param0, param3, param2);
        if (param1 != 0) {
            field_b = 91;
        }
    }

    final static void a(int param0) {
        if (ci.field_f) {
          tb.field_c = true;
          ae.a(true, (byte) 119);
          if (param0 != 500) {
            field_b = 26;
            bh.field_t = 0;
            return;
          } else {
            bh.field_t = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    qc(dd[] param0) {
        ((qc) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 500;
    }
}
