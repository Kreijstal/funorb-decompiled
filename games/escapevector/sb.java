/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    static wl field_a;
    static int field_h;
    va field_p;
    static int field_b;
    va field_l;
    static String field_i;
    va field_j;
    va field_n;
    long field_k;
    n field_e;
    int field_f;
    volatile int field_d;
    byte field_m;
    volatile int field_g;
    n field_o;
    s field_c;

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((sb) this).field_n = null;
            if (20 > ((sb) this).a(true)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((sb) this).a(true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          ((sb) this).a(-59);
          return ((sb) this).field_p.c(0) - -((sb) this).field_l.c(0);
        } else {
          return ((sb) this).field_p.c(0) - -((sb) this).field_l.c(0);
        }
    }

    abstract void a(int param0);

    final int a(byte param0) {
        if (param0 != 88) {
          ((sb) this).field_e = null;
          return ((sb) this).field_j.c(0) + ((sb) this).field_n.c(0);
        } else {
          return ((sb) this).field_j.c(0) + ((sb) this).field_n.c(0);
        }
    }

    public static void e() {
        field_i = null;
        field_a = null;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((sb) this).field_n = null;
            if (20 > ((sb) this).a((byte) 88)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > ((sb) this).a((byte) 88)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void b(byte param0);

    abstract void a(Object param0, boolean param1, byte param2);

    abstract boolean d(int param0);

    final s a(int param0, boolean param1, byte param2, int param3, byte param4) {
        s var8 = null;
        long var6 = (long)param3 + ((long)param0 << 32);
        if (param2 != 0) {
            ((sb) this).field_f = -16;
            var8 = new s();
            var8.field_y = param4;
            var8.field_r = param1 ? true : false;
            var8.field_p = var6;
            if (!param1) {
                if (!(((sb) this).a((byte) 88) < 20)) {
                    throw new RuntimeException();
                }
                ((sb) this).field_j.a((int) param2, (fl) (Object) var8);
            } else {
                if (!(-21 > ((sb) this).a(true))) {
                    throw new RuntimeException();
                }
                ((sb) this).field_p.a(-1, (fl) (Object) var8);
            }
            return var8;
        }
        var8 = new s();
        var8.field_y = param4;
        var8.field_r = param1 ? true : false;
        var8.field_p = var6;
        if (!param1) {
            if (!(((sb) this).a((byte) 88) < 20)) {
                throw new RuntimeException();
            }
            ((sb) this).field_j.a((int) param2, (fl) (Object) var8);
        } else {
            if (!(-21 > ((sb) this).a(true))) {
                throw new RuntimeException();
            }
            ((sb) this).field_p.a(-1, (fl) (Object) var8);
        }
        return var8;
    }

    sb() {
        ((sb) this).field_p = new va();
        ((sb) this).field_l = new va();
        ((sb) this).field_j = new va();
        ((sb) this).field_n = new va();
        ((sb) this).field_e = new n(6);
        ((sb) this).field_g = 0;
        ((sb) this).field_m = (byte) 0;
        ((sb) this).field_d = 0;
        ((sb) this).field_o = new n(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_i = "";
    }
}
