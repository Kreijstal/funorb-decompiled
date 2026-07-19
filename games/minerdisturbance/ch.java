/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ch {
    wa field_n;
    static int field_h;
    static String field_g;
    wa field_i;
    static int field_f;
    wa field_l;
    wa field_m;
    int field_d;
    sb field_k;
    long field_e;
    volatile int field_o;
    sb field_a;
    byte field_b;
    volatile int field_j;
    ee field_c;

    abstract void b(byte param0);

    abstract void a(Object param0, boolean param1, int param2);

    public static void c(int param0) {
        field_g = null;
        if (param0 >= -11) {
            field_f = 16;
        }
    }

    final boolean c(byte param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -29) {
          L0: {
            discarded$10 = this.c((byte) 86);
            if (-21 < (this.b(1461895584) ^ -1)) {
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
            if (-21 < (this.b(1461895584) ^ -1)) {
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

    final ee a(byte param0, int param1, boolean param2, int param3, int param4) {
        long var6 = (long)param3 + ((long)param4 << 1461895584);
        ee var8 = new ee();
        if (param1 != -21) {
            this.field_d = -79;
            var8.field_I = param0;
            var8.field_v = param2 ? true : false;
            var8.field_p = var6;
            if (param2) {
                if (!(-21 < (this.a(-11975) ^ -1))) {
                    throw new RuntimeException();
                }
                this.field_n.a(var8, false);
            } else {
                if (!(20 > this.b(1461895584))) {
                    throw new RuntimeException();
                }
                this.field_l.a(var8, false);
            }
            return var8;
        }
        var8.field_I = param0;
        var8.field_v = param2 ? true : false;
        var8.field_p = var6;
        if (param2) {
            if (!(-21 < (this.a(-11975) ^ -1))) {
                throw new RuntimeException();
            }
            this.field_n.a(var8, false);
        } else {
            if (!(20 > this.b(1461895584))) {
                throw new RuntimeException();
            }
            this.field_l.a(var8, false);
        }
        return var8;
    }

    final int b(int param0) {
        if (param0 != 1461895584) {
            return -16;
        }
        return this.field_l.b(-48) - -this.field_m.b(param0 ^ 1461895675);
    }

    abstract void d(int param0);

    final int a(int param0) {
        boolean discarded$2 = false;
        if (param0 != -11975) {
          discarded$2 = this.c((byte) 83);
          return this.field_n.b(-69) - -this.field_i.b(-63);
        } else {
          return this.field_n.b(-69) - -this.field_i.b(-63);
        }
    }

    final boolean d(byte param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -111) {
          L0: {
            discarded$10 = this.d((byte) 74);
            if (20 > this.a(-11975)) {
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
            if (20 > this.a(-11975)) {
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

    abstract boolean a(byte param0);

    ch() {
        this.field_n = new wa();
        this.field_i = new wa();
        this.field_l = new wa();
        this.field_m = new wa();
        this.field_k = new sb(6);
        this.field_o = 0;
        this.field_j = 0;
        this.field_b = (byte) 0;
        this.field_a = new sb(10);
    }

    static {
        field_f = 50;
    }
}
