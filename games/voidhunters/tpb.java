/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tpb {
    int field_a;
    ml field_b;

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 61) {
          L0: {
            this.a(33);
            if (this.field_b == null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_b == null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0) {
        this.field_a = param0;
        this.field_b = null;
    }

    public tpb() {
        this.a(2147483647);
    }

    static {
    }
}
