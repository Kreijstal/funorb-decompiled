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

    public static void c() {
        field_g = null;
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -29) {
          L0: {
            boolean discarded$10 = ((ch) this).c((byte) 86);
            if (-21 < ((ch) this).b(1461895584)) {
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
            if (-21 > ((ch) this).b(1461895584)) {
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
        long var6 = (long)param3 + ((long)param4 << 32);
        ee var8 = new ee();
        if (param1 != -21) {
            ((ch) this).field_d = -79;
            var8.field_I = param0;
            var8.field_v = param2 ? true : false;
            var8.field_p = var6;
            if (param2) {
                if (!(((ch) this).a(-11975) < 20)) {
                    throw new RuntimeException();
                }
                ((ch) this).field_n.a((al) (Object) var8, false);
            } else {
                if (!(20 > ((ch) this).b(1461895584))) {
                    throw new RuntimeException();
                }
                ((ch) this).field_l.a((al) (Object) var8, false);
            }
            return var8;
        }
        var8.field_I = param0;
        var8.field_v = param2 ? true : false;
        var8.field_p = var6;
        if (param2) {
            if (!(((ch) this).a(-11975) < 20)) {
                throw new RuntimeException();
            }
            ((ch) this).field_n.a((al) (Object) var8, false);
        } else {
            if (!(20 > ((ch) this).b(1461895584))) {
                throw new RuntimeException();
            }
            ((ch) this).field_l.a((al) (Object) var8, false);
        }
        return var8;
    }

    final int b(int param0) {
        if (param0 != 1461895584) {
            return -16;
        }
        return ((ch) this).field_l.b(-48) - -((ch) this).field_m.b(param0 ^ 1461895675);
    }

    abstract void d(int param0);

    final int a(int param0) {
        if (param0 != -11975) {
          boolean discarded$2 = ((ch) this).c((byte) 83);
          return ((ch) this).field_n.b(-69) - -((ch) this).field_i.b(-63);
        } else {
          return ((ch) this).field_n.b(-69) - -((ch) this).field_i.b(-63);
        }
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -111) {
          L0: {
            boolean discarded$10 = ((ch) this).d((byte) 74);
            if (20 > ((ch) this).a(-11975)) {
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
            if (20 > ((ch) this).a(-11975)) {
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
        ((ch) this).field_n = new wa();
        ((ch) this).field_i = new wa();
        ((ch) this).field_l = new wa();
        ((ch) this).field_m = new wa();
        ((ch) this).field_k = new sb(6);
        ((ch) this).field_o = 0;
        ((ch) this).field_j = 0;
        ((ch) this).field_b = (byte) 0;
        ((ch) this).field_a = new sb(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 50;
    }
}
