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
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          if (param1 == -100) {
            break L0;
          } else {
            ((rj) this).field_c = -22;
            break L0;
          }
        }
        if (((rj) this).field_a == null) {
          return 0;
        } else {
          if (((rj) this).field_a.length != 0) {
            var3 = 1;
            L1: while (true) {
              if (var3 >= ((rj) this).field_a.length) {
                return -1 + ((rj) this).field_a.length;
              } else {
                if (param0 < ((rj) this).field_a[var3] + ((rj) this).field_a[-1 + var3] >> 1) {
                  return var3 - 1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 23) {
            break L0;
          } else {
            ((rj) this).field_c = 50;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((rj) this).field_a) {
              break L2;
            } else {
              if (((rj) this).field_a.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((rj) this).field_a[((rj) this).field_a.length - 1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    rj(int param0, int param1, int param2) {
        ((rj) this).field_a = new int[param2 + 1];
        ((rj) this).field_d = param0;
        ((rj) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new aj(8, 0, 4, 1);
    }
}
