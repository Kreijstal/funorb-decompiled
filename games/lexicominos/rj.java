/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int[] field_a;
    int field_c;
    static aj field_b;
    int field_d;

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 88) {
            field_b = (aj) null;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != -100) {
            this.field_c = -22;
        }
        if (this.field_a == null || this.field_a.length == 0) {
            return 0;
        }
        for (var3 = 1; var3 < this.field_a.length; var3++) {
            if (!(param0 >= this.field_a[var3] + this.field_a[-1 + var3] >> 525366881)) {
                return var3 - 1;
            }
        }
        return -1 + this.field_a.length;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 23) {
            break L0;
          } else {
            this.field_c = 50;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_a) {
              break L2;
            } else {
              if (this.field_a.length == 0) {
                break L2;
              } else {
                stackIn_6_0 = this.field_a[this.field_a.length - 1];
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    rj(int param0, int param1, int param2) {
        this.field_a = new int[param2 + 1];
        this.field_d = param0;
        this.field_c = param1;
    }

    static {
        field_b = new aj(8, 0, 4, 1);
    }
}
