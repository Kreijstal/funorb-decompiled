/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej {
    static vl field_g;
    bh field_b;
    bh field_j;
    static String field_o;
    static String field_n;
    static ub field_q;
    bh field_l;
    static gb field_h;
    bh field_a;
    int field_f;
    long field_c;
    vi field_m;
    volatile int field_k;
    volatile int field_e;
    byte field_r;
    static bd field_d;
    vi field_i;
    lm field_p;

    final lm a(byte param0, int param1, int param2, int param3, boolean param4) {
        long var6 = 0L;
        lm var8 = null;
        if (param3 != -18986) {
            boolean discarded$0 = ej.d((byte) -61);
            var6 = (long)param2 + ((long)param1 << -295689312);
            var8 = new lm();
            var8.field_h = var6;
            var8.field_w = param4 ? true : false;
            var8.field_B = param0;
            if (!param4) {
                if (!(((ej) this).b((byte) -34) < 20)) {
                    throw new RuntimeException();
                }
                ((ej) this).field_l.a((dk) (Object) var8, -128);
            } else {
                if (!(((ej) this).c((byte) 122) < 20)) {
                    throw new RuntimeException();
                }
                ((ej) this).field_b.a((dk) (Object) var8, 90);
            }
            return var8;
        }
        var6 = (long)param2 + ((long)param1 << -295689312);
        var8 = new lm();
        var8.field_h = var6;
        var8.field_w = param4 ? true : false;
        var8.field_B = param0;
        if (!param4) {
            if (!(((ej) this).b((byte) -34) < 20)) {
                throw new RuntimeException();
            }
            ((ej) this).field_l.a((dk) (Object) var8, -128);
        } else {
            if (!(((ej) this).c((byte) 122) < 20)) {
                throw new RuntimeException();
            }
            ((ej) this).field_b.a((dk) (Object) var8, 90);
        }
        return var8;
    }

    final int c(byte param0) {
        if (param0 != 122) {
            return -95;
        }
        return ((ej) this).field_b.c((byte) 66) - -((ej) this).field_j.c((byte) 74);
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 5) {
          L0: {
            boolean discarded$10 = ((ej) this).b(-16);
            if (-21 < ((ej) this).b((byte) -34)) {
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
            if (-21 > ((ej) this).b((byte) -34)) {
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

    abstract void c(int param0);

    final static Object a(boolean param0, byte[] param1, int param2) {
        md var3 = null;
        if (param1 != null) {
          if (param1.length <= 136) {
            if (param2 > 104) {
              if (!param0) {
                return (Object) (Object) param1;
              } else {
                return (Object) (Object) dc.a(109, param1);
              }
            } else {
              return null;
            }
          } else {
            var3 = new md();
            ((nj) (Object) var3).a(24, param1);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    abstract void a(byte param0);

    public static void d(int param0) {
        field_g = null;
        field_o = null;
        field_n = null;
        field_q = null;
        field_h = null;
        if (param0 != -21742) {
            return;
        }
        field_d = null;
    }

    final static boolean d(byte param0) {
        if (-21 >= (qh.field_u ^ -1)) {
          return false;
        } else {
          qh.field_u = qh.field_u + ((int)(5.0 * Math.random()) + 20);
          if (param0 < 46) {
            field_d = null;
            return true;
          } else {
            return true;
          }
        }
    }

    final int b(byte param0) {
        if (param0 != -34) {
          boolean discarded$2 = ej.d((byte) -13);
          return ((ej) this).field_l.c((byte) 93) - -((ej) this).field_a.c((byte) 39);
        } else {
          return ((ej) this).field_l.c((byte) 93) - -((ej) this).field_a.c((byte) 39);
        }
    }

    abstract boolean e(int param0);

    final boolean a(int param0) {
        if (param0 != 20) {
            return true;
        }
        return 20 <= ((ej) this).c((byte) 122) ? true : false;
    }

    ej() {
        ((ej) this).field_b = new bh();
        ((ej) this).field_j = new bh();
        ((ej) this).field_l = new bh();
        ((ej) this).field_a = new bh();
        ((ej) this).field_m = new vi(6);
        ((ej) this).field_k = 0;
        ((ej) this).field_e = 0;
        ((ej) this).field_r = (byte) 0;
        ((ej) this).field_i = new vi(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_o = "Menu";
        field_n = "Just play";
        field_q = new ub();
    }
}
