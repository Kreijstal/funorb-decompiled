/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae {
    mb field_f;
    mb field_c;
    mb field_h;
    mb field_k;
    int field_d;
    long field_j;
    be field_g;
    volatile int field_b;
    byte field_i;
    be field_a;
    volatile int field_e;
    hi field_l;

    final static int a(byte param0, int param1) {
        int var2 = -94;
        int var3 = 0;
        if (!((param1 & 7) == 0)) {
            var3 = 8 + -(7 & param1);
        }
        int var4 = param1 + var3;
        return var4;
    }

    abstract void b(byte param0);

    final int a(byte param0) {
        if (param0 != 105) {
          ((ae) this).field_f = null;
          return ((ae) this).field_f.c((byte) -117) - -((ae) this).field_c.c((byte) -79);
        } else {
          return ((ae) this).field_f.c((byte) -117) - -((ae) this).field_c.c((byte) -79);
        }
    }

    abstract void c(byte param0);

    final int a(int param0) {
        if (param0 != 7) {
          int discarded$2 = ((ae) this).a((byte) -121);
          return ((ae) this).field_h.c((byte) -127) + ((ae) this).field_k.c((byte) -57);
        } else {
          return ((ae) this).field_h.c((byte) -127) + ((ae) this).field_k.c((byte) -57);
        }
    }

    final boolean d(int param0) {
        if (param0 != -18316) {
            return false;
        }
        return ((ae) this).a((byte) 105) >= 20 ? true : false;
    }

    abstract void a(byte param0, boolean param1, Object param2);

    abstract boolean b(int param0);

    final hi a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        long var6 = 0L;
        hi var8 = null;
        hi stackIn_2_0 = null;
        hi stackIn_3_0 = null;
        hi stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hi stackIn_15_0 = null;
        hi stackIn_16_0 = null;
        hi stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        hi stackOut_14_0 = null;
        hi stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        hi stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hi stackOut_1_0 = null;
        hi stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hi stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param2) {
          L0: {
            var6 = (long)param3 + ((long)param0 << 32);
            var8 = new hi();
            var8.field_m = var6;
            stackOut_14_0 = (hi) var8;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param1) {
              stackOut_16_0 = (hi) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (hi) (Object) stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          stackIn_17_0.field_q = stackIn_17_1 != 0;
          var8.field_B = param4;
          if (!param1) {
            if (20 <= ((ae) this).a(7)) {
              throw new RuntimeException();
            } else {
              ((ae) this).field_h.a((gb) (Object) var8, true);
              return var8;
            }
          } else {
            if (((ae) this).a((byte) 105) >= 20) {
              throw new RuntimeException();
            } else {
              ((ae) this).field_f.a((gb) (Object) var8, true);
              return var8;
            }
          }
        } else {
          L1: {
            ((ae) this).field_i = (byte) -39;
            var6 = (long)param3 + ((long)param0 << 32);
            var8 = new hi();
            var8.field_m = var6;
            stackOut_1_0 = (hi) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (hi) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (hi) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          var8.field_B = param4;
          if (!param1) {
            if (20 <= ((ae) this).a(7)) {
              throw new RuntimeException();
            } else {
              ((ae) this).field_h.a((gb) (Object) var8, true);
              return var8;
            }
          } else {
            if (((ae) this).a((byte) 105) >= 20) {
              throw new RuntimeException();
            } else {
              ((ae) this).field_f.a((gb) (Object) var8, true);
              return var8;
            }
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -28419) {
          L0: {
            ((ae) this).field_b = 112;
            if (((ae) this).a(7) < 20) {
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
            if (((ae) this).a(7) < 20) {
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

    ae() {
        ((ae) this).field_f = new mb();
        ((ae) this).field_c = new mb();
        ((ae) this).field_h = new mb();
        ((ae) this).field_k = new mb();
        ((ae) this).field_g = new be(6);
        ((ae) this).field_e = 0;
        ((ae) this).field_i = (byte) 0;
        ((ae) this).field_b = 0;
        ((ae) this).field_a = new be(10);
    }

    static {
    }
}
