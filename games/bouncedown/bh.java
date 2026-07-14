/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    int field_b;
    static ld field_d;
    int field_f;
    int[] field_a;
    static eh field_e;
    static int field_c;

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -44 % ((param0 - 9) / 63);
            if (((bh) this).field_a == null) {
              break L1;
            } else {
              if (((bh) this).field_a.length == 0) {
                break L1;
              } else {
                stackOut_2_0 = ((bh) this).field_a[((bh) this).field_a.length + -1];
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          if (((bh) this).field_a == null) {
            break L0;
          } else {
            if (((bh) this).field_a.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= ((bh) this).field_a.length) {
                  if (param1 >= 9) {
                    return ((bh) this).field_a.length - 1;
                  } else {
                    return -26;
                  }
                } else {
                  if (((bh) this).field_a[-1 + var3] - -((bh) this).field_a[var3] >> 1571861633 > param0) {
                    return var3 + -1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    public static void b(byte param0) {
        if (param0 < 95) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    bh(int param0, int param1, int param2) {
        ((bh) this).field_b = param1;
        ((bh) this).field_a = new int[param2 - -1];
        ((bh) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new eh(6, 0, 4, 2);
        field_c = -1;
    }
}
