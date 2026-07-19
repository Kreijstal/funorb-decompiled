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
            this.field_n = (va) null;
            if (20 > this.a(true)) {
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
            if (20 > this.a(true)) {
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
          this.a(-59);
          return this.field_p.c(0) - -this.field_l.c(0);
        } else {
          return this.field_p.c(0) - -this.field_l.c(0);
        }
    }

    abstract void a(int param0);

    final int a(byte param0) {
        if (param0 != 88) {
          this.field_e = (n) null;
          return this.field_j.c(0) + this.field_n.c(0);
        } else {
          return this.field_j.c(0) + this.field_n.c(0);
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -4470) {
            field_b = 100;
            field_a = null;
            return;
        }
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
            this.field_n = (va) null;
            if (20 > this.a((byte) 88)) {
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
            if (20 > this.a((byte) 88)) {
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
        long var6 = 0L;
        s var8 = null;
        s stackIn_2_0 = null;
        s stackIn_3_0 = null;
        s stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        s stackIn_15_0 = null;
        s stackIn_16_0 = null;
        s stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        s stackOut_14_0 = null;
        s stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        s stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        s stackOut_1_0 = null;
        s stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        s stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = (long)param3 + ((long)param0 << -1318677728);
        if (param2 == 0) {
          L0: {
            var8 = new s();
            var8.field_y = param4;
            stackOut_14_0 = (s) (var8);
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param1) {
              stackOut_16_0 = (s) ((Object) stackIn_16_0);
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (s) ((Object) stackIn_15_0);
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          L1: {
            stackIn_17_0.field_r = stackIn_17_1 != 0;
            var8.field_p = var6;
            if (param1) {
              if (-21 >= (this.a(true) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_p.a(-1, var8);
                break L1;
              }
            } else {
              if ((this.a((byte) 88) ^ -1) <= -21) {
                throw new RuntimeException();
              } else {
                this.field_j.a(param2 ^ -1, var8);
                break L1;
              }
            }
          }
          return var8;
        } else {
          L2: {
            this.field_f = -16;
            var8 = new s();
            var8.field_y = param4;
            stackOut_1_0 = (s) (var8);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (s) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (s) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          L3: {
            stackIn_4_0.field_r = stackIn_4_1 != 0;
            var8.field_p = var6;
            if (param1) {
              if (-21 >= (this.a(true) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_p.a(-1, var8);
                break L3;
              }
            } else {
              if ((this.a((byte) 88) ^ -1) <= -21) {
                throw new RuntimeException();
              } else {
                this.field_j.a(param2 ^ -1, var8);
                break L3;
              }
            }
          }
          return var8;
        }
    }

    sb() {
        this.field_p = new va();
        this.field_l = new va();
        this.field_j = new va();
        this.field_n = new va();
        this.field_e = new n(6);
        this.field_g = 0;
        this.field_m = (byte) 0;
        this.field_d = 0;
        this.field_o = new n(10);
    }

    static {
        field_b = 0;
        field_i = "";
    }
}
