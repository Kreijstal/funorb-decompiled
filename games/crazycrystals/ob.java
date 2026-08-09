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
        return this.field_k.c(0) + this.field_a.c(param0 ^ 20);
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
        if (param0 >= -34) {
          L0: {
            this.b(123);
            if (20 > this.b(20)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (20 > this.b(20)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int b(int param0) {
        Object var3;
        if (param0 != 20) {
          var3 = (Object) null;
          this.a(true, (Object) null, false);
          return this.field_m.c(param0 + -20) - -this.field_f.c(0);
        } else {
          return this.field_m.c(param0 + -20) - -this.field_f.c(0);
        }
    }

    final ld a(boolean param0, int param1, int param2, int param3, byte param4) {
        ld stackIn_3_0 = null;
        ld stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ld stackIn_16_0 = null;
        ld stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        long var6;
        ld var8;
        Object var9;
        if (param1 == 18303) {
          L0: {
            var6 = (long)param2 + ((long)param3 << 586864800);
            var8 = new ld();
            var8.field_u = param4;
            var8.field_k = var6;
            stackIn_16_0 = (ld) (var8);

            if (!param0) {
              stackIn_17_0 = (ld) ((Object) stackIn_16_0);
              stackIn_17_1 = 0;
              break L0;
            } else {
              stackIn_17_0 = (ld) ((Object) stackIn_16_0);
              stackIn_17_1 = 1;
              break L0;
            }
          }
          L1: {
            stackIn_17_0.field_q = stackIn_17_1 != 0;
            if (param0) {
              if (20 <= this.b(param1 ^ 18283)) {
                throw new RuntimeException();
              } else {
                this.field_m.a((byte) 110, var8);
                break L1;
              }
            } else {
              if (-21 >= (this.d(20) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_k.a((byte) 100, var8);
                break L1;
              }
            }
          }
          return var8;
        } else {
          L2: {
            var9 = (Object) null;
            this.a(true, (Object) null, false);
            var6 = (long)param2 + ((long)param3 << 586864800);
            var8 = new ld();
            var8.field_u = param4;
            var8.field_k = var6;
            stackIn_3_0 = (ld) (var8);

            if (!param0) {
              stackIn_4_0 = (ld) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L2;
            } else {
              stackIn_4_0 = (ld) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L2;
            }
          }
          L3: {
            stackIn_4_0.field_q = stackIn_4_1 != 0;
            if (param0) {
              if (20 <= this.b(param1 ^ 18283)) {
                throw new RuntimeException();
              } else {
                this.field_m.a((byte) 110, var8);
                break L3;
              }
            } else {
              if (-21 >= (this.d(20) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_k.a((byte) 100, var8);
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
        if (param0 != -21) {
          L0: {
            this.field_i = (ng) null;
            if (-21 < (this.d(20) ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.d(20) ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ob() {
        this.field_m = new km();
        this.field_f = new km();
        this.field_k = new km();
        this.field_a = new km();
        this.field_n = new ng(6);
        this.field_j = 0;
        this.field_d = (byte) 0;
        this.field_p = 0;
        this.field_i = new ng(10);
    }

    static {
        field_b = new int[4];
    }
}
