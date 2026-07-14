/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String[] field_e;
    int field_f;
    int field_d;
    static ql field_a;
    int[] field_c;
    static bh field_b;

    final int a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 6586) {
            break L0;
          } else {
            var3 = null;
            lq.a((er) null, (byte) 110);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((lq) this).field_c == null) {
              break L2;
            } else {
              if (((lq) this).field_c.length != 0) {
                stackOut_6_0 = ((lq) this).field_c[-1 + ((lq) this).field_c.length];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null == ((lq) this).field_c) {
          return 0;
        } else {
          if (0 != ((lq) this).field_c.length) {
            L0: {
              if (!param1) {
                break L0;
              } else {
                ((lq) this).field_f = 59;
                break L0;
              }
            }
            var3 = 1;
            L1: while (true) {
              if (var3 >= ((lq) this).field_c.length) {
                return ((lq) this).field_c.length + -1;
              } else {
                if (((lq) this).field_c[var3] + ((lq) this).field_c[var3 + -1] >> 501033697 <= param0) {
                  var3++;
                  continue L1;
                } else {
                  return -1 + var3;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            lq.a((er) null, (byte) -50);
        }
    }

    lq(int param0, int param1, int param2) {
        ((lq) this).field_f = param0;
        ((lq) this).field_d = param1;
        ((lq) this).field_c = new int[param2 + 1];
    }

    final static void a(er param0, byte param1) {
        if (param1 != -94) {
            return;
        }
        tg.a((byte) -110);
        bi.a(param0.field_F, param0.field_x, param0.field_B);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = null;
    }
}
