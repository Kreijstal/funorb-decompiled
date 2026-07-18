/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc {
    static oi field_k;
    ra field_a;
    ra field_l;
    ra field_f;
    ra field_m;
    long field_g;
    de field_b;
    int field_i;
    volatile int field_e;
    volatile int field_h;
    byte field_c;
    de field_j;
    og field_d;

    final int a(boolean param0) {
        if (!param0) {
          int discarded$2 = ((pc) this).a(true);
          return ((pc) this).field_f.a(false) - -((pc) this).field_m.a(false);
        } else {
          return ((pc) this).field_f.a(false) - -((pc) this).field_m.a(false);
        }
    }

    abstract void a(int param0);

    abstract void d(int param0);

    final og a(byte param0, boolean param1, int param2, byte param3, int param4) {
        int var6 = 31 % ((-29 - param3) / 53);
        long var7 = (long)param4 + ((long)param2 << 32);
        og var9 = new og();
        var9.field_C = param0;
        var9.field_r = param1 ? true : false;
        var9.field_n = var7;
        if (!param1) {
            if (((pc) this).a(true) >= 20) {
                throw new RuntimeException();
            }
            ((pc) this).field_f.a((nb) (Object) var9, (byte) -99);
        } else {
            if (!(20 > ((pc) this).e(-1216122784))) {
                throw new RuntimeException();
            }
            ((pc) this).field_a.a((nb) (Object) var9, (byte) -124);
        }
        return var9;
    }

    final static void a(int param0, byte param1) {
        ki.field_V = em.field_K[param0];
        cj.field_e = te.field_Q[param0];
        l.field_g = vj.field_p[param0];
    }

    abstract void a(boolean param0, Object param1, int param2);

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 118) {
          L0: {
            ((pc) this).field_l = null;
            if (-21 < ((pc) this).a(true)) {
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
            if (-21 > ((pc) this).a(true)) {
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

    final static void a(byte param0, fn param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          t.field_i.a((sp) (Object) param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("pc.H(").append(13).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 96) {
          L0: {
            ((pc) this).field_l = null;
            if (((pc) this).e(-1216122784) < 20) {
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
            if (((pc) this).e(-1216122784) < 20) {
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

    public static void b(boolean param0) {
        field_k = null;
        if (!param0) {
            field_k = null;
        }
    }

    abstract boolean c(int param0);

    final int e(int param0) {
        if (param0 != -1216122784) {
          ((pc) this).field_g = 8L;
          return ((pc) this).field_a.a(false) - -((pc) this).field_l.a(false);
        } else {
          return ((pc) this).field_a.a(false) - -((pc) this).field_l.a(false);
        }
    }

    pc() {
        ((pc) this).field_a = new ra();
        ((pc) this).field_l = new ra();
        ((pc) this).field_f = new ra();
        ((pc) this).field_m = new ra();
        ((pc) this).field_b = new de(6);
        ((pc) this).field_h = 0;
        ((pc) this).field_c = (byte) 0;
        ((pc) this).field_e = 0;
        ((pc) this).field_j = new de(10);
    }

    static {
    }
}
