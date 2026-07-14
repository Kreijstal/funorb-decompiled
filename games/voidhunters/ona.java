/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ona {
    static String field_l;
    vga field_a;
    vga field_d;
    vga field_c;
    vga field_f;
    ds field_e;
    int field_m;
    long field_h;
    ds field_i;
    byte field_j;
    volatile int field_k;
    volatile int field_g;
    km field_b;

    abstract void a(int param0);

    public static void c(int param0) {
        field_l = null;
        if (param0 < 124) {
            field_l = null;
        }
    }

    abstract boolean e(int param0);

    final boolean d(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 38) {
          L0: {
            var3 = null;
            ((ona) this).a((Object) null, true, false);
            if (((ona) this).f(13223) < 20) {
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
            if (((ona) this).f(13223) < 20) {
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

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 32) {
          L0: {
            ona.c(58);
            if (-21 < ((ona) this).b(-3666)) {
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
            if (-21 > ((ona) this).b(-3666)) {
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

    abstract void a(Object param0, boolean param1, boolean param2);

    final int f(int param0) {
        if (param0 != 13223) {
            return -111;
        }
        return ((ona) this).field_a.c(0) + ((ona) this).field_d.c(param0 + -13223);
    }

    abstract void a(byte param0);

    final km a(boolean param0, int param1, int param2, byte param3, int param4) {
        if (param1 != -21) {
            return null;
        }
        long var6 = ((long)param4 << 1633492640) + (long)param2;
        km var8 = new km();
        var8.field_i = var6;
        var8.field_l = param0 ? true : false;
        var8.field_q = param3;
        if (param0) {
            if (!(((ona) this).f(13223) > -21)) {
                throw new RuntimeException();
            }
            ((ona) this).field_a.a((fh) (Object) var8, -75);
        } else {
            if (-21 > ((ona) this).b(-3666)) {
                ((ona) this).field_c.a((fh) (Object) var8, -90);
                return var8;
            }
            throw new RuntimeException();
        }
        return var8;
    }

    final int b(int param0) {
        if (param0 != -3666) {
            return -55;
        }
        return ((ona) this).field_c.c(0) + ((ona) this).field_f.c(0);
    }

    ona() {
        ((ona) this).field_a = new vga();
        ((ona) this).field_d = new vga();
        ((ona) this).field_c = new vga();
        ((ona) this).field_f = new vga();
        ((ona) this).field_e = new ds(6);
        ((ona) this).field_j = (byte) 0;
        ((ona) this).field_g = 0;
        ((ona) this).field_k = 0;
        ((ona) this).field_i = new ds(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Report <%0> for abuse";
    }
}
