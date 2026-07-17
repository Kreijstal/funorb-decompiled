/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int[] field_a;
    int field_d;
    int[] field_e;
    static ja[] field_c;
    static long field_g;
    static ug field_b;
    static hi field_f;
    int field_h;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_f = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param0) {
          L0: {
            if (null == ((td) this).field_e) {
              break L0;
            } else {
              if (0 == ((td) this).field_e.length) {
                break L0;
              } else {
                var3 = 1;
                L1: while (true) {
                  if (var3 >= ((td) this).field_e.length) {
                    return -1 + ((td) this).field_e.length;
                  } else {
                    if (((td) this).field_e[-1 + var3] + ((td) this).field_e[var3] >> 1 > param1) {
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
        } else {
          return 91;
        }
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -27328) {
            break L0;
          } else {
            ((td) this).field_h = 59;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((td) this).field_e == null) {
              break L2;
            } else {
              if (((td) this).field_e.length != 0) {
                stackOut_6_0 = ((td) this).field_e[-1 + ((td) this).field_e.length];
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

    td(int param0, int param1, int param2) {
        ((td) this).field_h = param1;
        ((td) this).field_d = param0;
        ((td) this).field_e = new int[param2 + 1];
    }

    final static jm a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        jm var8 = (jm) (Object) mf.field_b.g(86);
        if (!(var8 != null)) {
            var8 = new jm();
        }
        var8.a(param5, param0, param1, param7, 27658, param4, param6, param2);
        if (param3 <= 26) {
            jm discarded$0 = td.a(109, 31, 61, (byte) 110, 59, 3, 72, 118);
        }
        return var8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_a = new int[128];
        field_g = 20000000L;
    }
}
