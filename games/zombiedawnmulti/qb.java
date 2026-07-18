/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb {
    static ip field_e;
    static int[] field_a;
    static String field_o;
    lq field_g;
    lq field_j;
    static ri field_h;
    lq field_c;
    lq field_l;
    k field_b;
    long field_f;
    int field_d;
    k field_k;
    volatile int field_p;
    byte field_i;
    volatile int field_n;
    tn field_m;

    abstract void a(boolean param0, Object param1, int param2);

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (on.field_Z != null) {
          var1 = (Object) (Object) on.field_Z;
          synchronized (var1) {
            L0: {
              on.field_Z = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int d(int param0) {
        if (param0 != 20) {
          ((qb) this).field_d = 116;
          return ((qb) this).field_c.a((byte) 98) - -((qb) this).field_l.a((byte) 98);
        } else {
          return ((qb) this).field_c.a((byte) 98) - -((qb) this).field_l.a((byte) 98);
        }
    }

    final static void a(int param0, byte param1, pd param2, int param3) {
        try {
            if (param1 > -101) {
                qb.c((byte) 57);
            }
            po.field_l = param2;
            la.field_m = param0;
            um.field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        Object var2 = null;
        field_e = null;
        if (param0 != -7) {
          var2 = null;
          qb.a(36, (byte) -107, (pd) null, 47);
          field_o = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_o = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final tn a(int param0, int param1, boolean param2, int param3, byte param4) {
        long var6 = 0L;
        tn var8 = null;
        Object var9 = null;
        tn stackIn_1_0 = null;
        tn stackIn_2_0 = null;
        tn stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        tn stackOut_0_0 = null;
        tn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        tn stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = ((long)param3 << 32) - -(long)param1;
          var8 = new tn();
          var8.field_B = param4;
          var8.field_l = var6;
          stackOut_0_0 = (tn) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = (tn) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (tn) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_r = stackIn_3_1 != 0;
          if (!param2) {
            if (20 <= ((qb) this).d(20)) {
              throw new RuntimeException();
            } else {
              ((qb) this).field_c.a(29664, (qa) (Object) var8);
              break L1;
            }
          } else {
            if (20 > ((qb) this).a(0)) {
              ((qb) this).field_g.a(param0 ^ 488002304, (qa) (Object) var8);
              break L1;
            } else {
              throw new RuntimeException();
            }
          }
        }
        if (param0 != 487989472) {
          var9 = null;
          ((qb) this).a(false, (Object) null, 52);
          return var8;
        } else {
          return var8;
        }
    }

    abstract void f(int param0);

    abstract void a(byte param0);

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 13) {
          L0: {
            ((qb) this).field_d = -46;
            if (-21 < ((qb) this).a(0)) {
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
            if (-21 > ((qb) this).a(0)) {
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

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -32) {
          L0: {
            ((qb) this).field_b = null;
            if (((qb) this).d(20) < 20) {
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
            if (((qb) this).d(20) < 20) {
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

    abstract boolean b(byte param0);

    final int a(int param0) {
        if (param0 != 0) {
            return 31;
        }
        return ((qb) this).field_g.a((byte) 98) + ((qb) this).field_j.a((byte) 98);
    }

    qb() {
        ((qb) this).field_g = new lq();
        ((qb) this).field_j = new lq();
        ((qb) this).field_c = new lq();
        ((qb) this).field_l = new lq();
        ((qb) this).field_b = new k(6);
        ((qb) this).field_i = (byte) 0;
        ((qb) this).field_n = 0;
        ((qb) this).field_p = 0;
        ((qb) this).field_k = new k(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has joined your game.";
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_e = new ip();
    }
}
