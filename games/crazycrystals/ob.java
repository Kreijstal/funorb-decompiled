/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob {
    static int field_g;
    static int field_l;
    static boolean field_o;
    km field_m;
    static int[] field_b;
    km field_f;
    km field_k;
    km field_a;
    ng field_n;
    int field_c;
    long field_e;
    ng field_i;
    volatile int field_j;
    byte field_d;
    volatile int field_p;
    ld field_h;

    abstract void a(boolean param0, Object param1, boolean param2);

    final int d(int param0) {
        if (param0 != 20) {
            return -98;
        }
        return ((ob) this).field_k.c(0) + ((ob) this).field_a.c(param0 ^ 20);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 12554) {
            field_l = -115;
        }
    }

    abstract void e(int param0);

    abstract boolean b(byte param0);

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -34) {
          L0: {
            int discarded$10 = ((ob) this).b(123);
            if (20 > ((ob) this).b(20)) {
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
            if (20 > ((ob) this).b(20)) {
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

    final int b(int param0) {
        Object var3 = null;
        if (param0 != 20) {
          var3 = null;
          ((ob) this).a(true, (Object) null, false);
          return ((ob) this).field_m.c(param0 + -20) - -((ob) this).field_f.c(0);
        } else {
          return ((ob) this).field_m.c(param0 + -20) - -((ob) this).field_f.c(0);
        }
    }

    final ld a(boolean param0, int param1, int param2, int param3, byte param4) {
        long var6 = 0L;
        ld var8 = null;
        Object var9 = null;
        ld stackIn_2_0 = null;
        ld stackIn_3_0 = null;
        ld stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ld stackIn_15_0 = null;
        ld stackIn_16_0 = null;
        ld stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ld stackOut_14_0 = null;
        ld stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ld stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ld stackOut_1_0 = null;
        ld stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ld stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 == 18303) {
          L0: {
            var6 = (long)param2 + ((long)param3 << 586864800);
            var8 = new ld();
            var8.field_u = param4;
            var8.field_k = var6;
            stackOut_14_0 = (ld) var8;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param0) {
              stackOut_16_0 = (ld) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (ld) (Object) stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          L1: {
            stackIn_17_0.field_q = stackIn_17_1 != 0;
            if (param0) {
              if (20 <= ((ob) this).b(param1 ^ 18283)) {
                throw new RuntimeException();
              } else {
                ((ob) this).field_m.a((byte) 110, (ij) (Object) var8);
                break L1;
              }
            } else {
              if (-21 >= (((ob) this).d(20) ^ -1)) {
                throw new RuntimeException();
              } else {
                ((ob) this).field_k.a((byte) 100, (ij) (Object) var8);
                break L1;
              }
            }
          }
          return var8;
        } else {
          L2: {
            var9 = null;
            ((ob) this).a(true, (Object) null, false);
            var6 = (long)param2 + ((long)param3 << 586864800);
            var8 = new ld();
            var8.field_u = param4;
            var8.field_k = var6;
            stackOut_1_0 = (ld) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (ld) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (ld) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          L3: {
            stackIn_4_0.field_q = stackIn_4_1 != 0;
            if (param0) {
              if (20 <= ((ob) this).b(param1 ^ 18283)) {
                throw new RuntimeException();
              } else {
                ((ob) this).field_m.a((byte) 110, (ij) (Object) var8);
                break L3;
              }
            } else {
              if (-21 >= (((ob) this).d(20) ^ -1)) {
                throw new RuntimeException();
              } else {
                ((ob) this).field_k.a((byte) 100, (ij) (Object) var8);
                break L3;
              }
            }
          }
          return var8;
        }
    }

    abstract void a(byte param0);

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            ((ob) this).field_i = null;
            if (-21 < ((ob) this).d(20)) {
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
            if (-21 > ((ob) this).d(20)) {
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

    ob() {
        ((ob) this).field_m = new km();
        ((ob) this).field_f = new km();
        ((ob) this).field_k = new km();
        ((ob) this).field_a = new km();
        ((ob) this).field_n = new ng(6);
        ((ob) this).field_j = 0;
        ((ob) this).field_d = (byte) 0;
        ((ob) this).field_p = 0;
        ((ob) this).field_i = new ng(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
    }
}
