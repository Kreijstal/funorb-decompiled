/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp {
    static String[] field_n;
    gb field_a;
    gb field_h;
    static k field_p;
    static int field_i;
    static String field_e;
    gb field_m;
    gb field_b;
    fj field_d;
    int field_l;
    long field_o;
    volatile int field_g;
    byte field_f;
    fj field_c;
    volatile int field_k;
    ac field_j;

    abstract boolean b(int param0);

    final int c(byte param0) {
        if (param0 != 0) {
          boolean discarded$2 = ((jp) this).a(23);
          return ((jp) this).field_a.b(param0 ^ -24088) + ((jp) this).field_h.b(param0 ^ -24088);
        } else {
          return ((jp) this).field_a.b(param0 ^ -24088) + ((jp) this).field_h.b(param0 ^ -24088);
        }
    }

    abstract void a(Object param0, boolean param1, byte param2);

    public static void d(byte param0) {
        field_p = null;
        int var1 = 5;
        field_n = null;
        field_e = null;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((jp) this).field_a = null;
            if (20 > ((jp) this).c((byte) 0)) {
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
            if (20 > ((jp) this).c((byte) 0)) {
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

    final ac a(byte param0, int param1, boolean param2, byte param3, int param4) {
        long var6 = 0L;
        ac var8 = null;
        ac stackIn_2_0 = null;
        ac stackIn_3_0 = null;
        ac stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ac stackIn_14_0 = null;
        ac stackIn_15_0 = null;
        ac stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ac stackOut_13_0 = null;
        ac stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ac stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ac stackOut_1_0 = null;
        ac stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ac stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = ((long)param1 << 32) + (long)param4;
        var8 = new ac();
        var8.field_l = var6;
        var8.field_y = param0;
        if (param3 == -51) {
          L0: {
            stackOut_13_0 = (ac) var8;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param2) {
              stackOut_15_0 = (ac) (Object) stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L0;
            } else {
              stackOut_14_0 = (ac) (Object) stackIn_14_0;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L0;
            }
          }
          stackIn_16_0.field_w = stackIn_16_1 != 0;
          if (param2) {
            if (((jp) this).c((byte) 0) >= 20) {
              throw new RuntimeException();
            } else {
              ((jp) this).field_a.a((byte) 119, (ta) (Object) var8);
              return var8;
            }
          } else {
            if (((jp) this).c(-6292) < 20) {
              ((jp) this).field_m.a((byte) 121, (ta) (Object) var8);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          L1: {
            ((jp) this).e((byte) -94);
            stackOut_1_0 = (ac) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param2) {
              stackOut_3_0 = (ac) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ac) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_w = stackIn_4_1 != 0;
          if (param2) {
            if (((jp) this).c((byte) 0) >= 20) {
              throw new RuntimeException();
            } else {
              ((jp) this).field_a.a((byte) 119, (ta) (Object) var8);
              return var8;
            }
          } else {
            if (((jp) this).c(-6292) < 20) {
              ((jp) this).field_m.a((byte) 121, (ta) (Object) var8);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    abstract void e(byte param0);

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 100) {
          L0: {
            ((jp) this).b((byte) 57);
            if (((jp) this).c(-6292) < 20) {
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
            if (((jp) this).c(-6292) < 20) {
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

    final int c(int param0) {
        if (param0 != -6292) {
            return -67;
        }
        return ((jp) this).field_m.b(param0 ^ 18052) - -((jp) this).field_b.b(-24088);
    }

    abstract void b(byte param0);

    jp() {
        ((jp) this).field_a = new gb();
        ((jp) this).field_h = new gb();
        ((jp) this).field_m = new gb();
        ((jp) this).field_b = new gb();
        ((jp) this).field_d = new fj(6);
        ((jp) this).field_g = 0;
        ((jp) this).field_k = 0;
        ((jp) this).field_f = (byte) 0;
        ((jp) this).field_c = new fj(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Open in popup window";
        field_i = 20;
        field_p = new k(4, 1, 1, 1);
    }
}
