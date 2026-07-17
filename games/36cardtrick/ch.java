/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ch {
    cd field_g;
    cd field_h;
    cd field_a;
    cd field_e;
    pb field_c;
    long field_d;
    int field_k;
    volatile int field_l;
    volatile int field_b;
    byte field_f;
    pb field_i;
    na field_j;

    abstract void c(byte param0);

    final static void a(int param0, qk param1) {
        ig var2 = null;
        try {
            ig.a(param1.a((byte) 7, "", "headers.packvorbis"));
            var2 = ig.a(param1, "jagex logo2.packvorbis", "");
            int var3 = -108 / ((param0 - -29) / 58);
            ib discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ch.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void a(Object param0, boolean param1, boolean param2);

    final int b(int param0) {
        if (param0 != -21040) {
          ((ch) this).a(85);
          return ((ch) this).field_a.b(1) + ((ch) this).field_e.b(1);
        } else {
          return ((ch) this).field_a.b(1) + ((ch) this).field_e.b(1);
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            na discarded$18 = ((ch) this).a(true, -13, 58, (byte) 80, 74);
            if (((ch) this).a((byte) 72) < 20) {
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
            if (((ch) this).a((byte) 72) < 20) {
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

    abstract void a(int param0);

    abstract boolean b(byte param0);

    final na a(boolean param0, int param1, int param2, byte param3, int param4) {
        long var6 = ((long)param4 << 32) + (long)param2;
        if (param1 != -1640279264) {
            return null;
        }
        na var8 = new na();
        var8.field_o = param0 ? true : false;
        var8.field_j = var6;
        var8.field_u = param3;
        if (!param0) {
            if (!(((ch) this).b(param1 ^ 1640300272) < 20)) {
                throw new RuntimeException();
            }
            ((ch) this).field_a.a((byte) -78, (he) (Object) var8);
        } else {
            if (((ch) this).a((byte) 107) < 20) {
                ((ch) this).field_g.a((byte) -75, (he) (Object) var8);
                return var8;
            }
            throw new RuntimeException();
        }
        return var8;
    }

    final int a(byte param0) {
        int var2 = -71 / ((30 - param0) / 40);
        return ((ch) this).field_g.b(1) + ((ch) this).field_h.b(1);
    }

    final boolean c(int param0) {
        int var2 = 49 % ((param0 - 8) / 43);
        return 20 <= ((ch) this).b(-21040) ? true : false;
    }

    ch() {
        ((ch) this).field_g = new cd();
        ((ch) this).field_h = new cd();
        ((ch) this).field_a = new cd();
        ((ch) this).field_e = new cd();
        ((ch) this).field_c = new pb(6);
        ((ch) this).field_b = 0;
        ((ch) this).field_l = 0;
        ((ch) this).field_f = (byte) 0;
        ((ch) this).field_i = new pb(10);
    }

    static {
    }
}
