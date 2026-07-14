/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    boolean field_b;
    int field_a;
    int field_c;

    final boolean a(byte param0, fs param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -22) {
          return true;
        } else {
          L0: {
            if (param1.field_a != ((fs) this).field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(bra param0, int param1) {
        if (param1 > -76) {
            ((fs) this).field_b = false;
            return true;
        }
        return true;
    }

    public final String toString() {
        return super.toString();
    }

    fs(int param0, int param1) {
        ((fs) this).field_b = true;
        ((fs) this).field_a = param0;
        ((fs) this).field_c = param1;
    }

    static {
    }
}
