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
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 2) {
          L0: {
            L1: {
              if (this == (Object) (Object) qk.field_c) {
                break L1;
              } else {
                if ((Object) (Object) ea.field_a == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) wh.field_b) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1 = 0;
        for (var2 = 0; var2 < jk.field_A; var2++) {
            if (null != jk.field_C[var2]) {
                // ifeq L43
            }
            var1 = 1;
            break;
        }
        if (!(var1 != 0)) {
            return;
        }
        jk.field_C[var2] = li.a(ke.field_h[2], param0, 96);
        na.a((byte) 38, jk.field_C[var2]);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 1 % ((-67 - param0) / 49);
    }

    static {
    }
}
