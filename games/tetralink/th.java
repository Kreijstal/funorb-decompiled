/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class th {
    static java.awt.Color field_e;
    jo field_k;
    static hl field_i;
    static kh[] field_p;
    static int field_g;
    static int field_l;
    jo field_j;
    jo field_o;
    jo field_c;
    int field_a;
    long field_f;
    bh field_b;
    bh field_m;
    volatile int field_h;
    byte field_n;
    volatile int field_d;
    rh field_q;

    final int c(byte param0) {
        if (param0 >= -33) {
            return -43;
        }
        return ((th) this).field_k.d(0) + ((th) this).field_j.d(0);
    }

    abstract void b(int param0);

    final int d(int param0) {
        if (param0 != 20) {
            return 22;
        }
        return ((th) this).field_o.d(param0 ^ 20) - -((th) this).field_c.d(0);
    }

    abstract boolean a(boolean param0);

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -7614) {
          L0: {
            ((th) this).field_a = -74;
            if (-21 < ((th) this).d(20)) {
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
            if (-21 > ((th) this).d(20)) {
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

    public static void a(int param0) {
        field_p = null;
        field_i = null;
        if (param0 <= 110) {
            field_l = -119;
            field_e = null;
            return;
        }
        field_e = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static mh a(int param0, String param1) {
        String var4 = null;
        mh var5 = null;
        if (param1 == null) {
            return ec.field_a;
        }
        if (0 == param1.length()) {
            return ec.field_a;
        }
        int var2 = param1.indexOf('@');
        if (-1 == var2) {
            return c.field_o;
        }
        String var3 = param1.substring(0, var2);
        if (param0 > -98) {
            Object var6 = null;
            mh discarded$0 = th.a(-51, (String) null);
            var4 = param1.substring(1 + var2);
            var5 = cf.a(var3, (byte) -124);
            if (!(var5 == null)) {
                return var5;
            }
            return rh.b(2, var4);
        }
        var4 = param1.substring(1 + var2);
        var5 = cf.a(var3, (byte) -124);
        if (!(var5 == null)) {
            return var5;
        }
        return rh.b(2, var4);
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 119) {
          L0: {
            ((th) this).field_b = null;
            if (20 > ((th) this).c((byte) -47)) {
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
            if (20 > ((th) this).c((byte) -47)) {
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

    abstract void a(byte param0);

    final rh a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        rh var8 = null;
        long var6 = (long)param3 + ((long)param1 << -1983421408);
        if (param0) {
            field_l = -80;
            var8 = new rh();
            var8.field_D = param4 ? true : false;
            var8.field_n = var6;
            var8.field_H = param2;
            if (!param4) {
                if (!(((th) this).d(20) < 20)) {
                    throw new RuntimeException();
                }
                ((th) this).field_o.a((gb) (Object) var8, 0);
            } else {
                if (!(-21 < (((th) this).c((byte) -100) ^ -1))) {
                    throw new RuntimeException();
                }
                ((th) this).field_k.a((gb) (Object) var8, 0);
            }
            return var8;
        }
        var8 = new rh();
        var8.field_D = param4 ? true : false;
        var8.field_n = var6;
        var8.field_H = param2;
        if (!param4) {
            if (!(((th) this).d(20) < 20)) {
                throw new RuntimeException();
            }
            ((th) this).field_o.a((gb) (Object) var8, 0);
        } else {
            if (!(-21 < (((th) this).c((byte) -100) ^ -1))) {
                throw new RuntimeException();
            }
            ((th) this).field_k.a((gb) (Object) var8, 0);
        }
        return var8;
    }

    th() {
        ((th) this).field_k = new jo();
        ((th) this).field_j = new jo();
        ((th) this).field_o = new jo();
        ((th) this).field_c = new jo();
        ((th) this).field_b = new bh(6);
        ((th) this).field_h = 0;
        ((th) this).field_d = 0;
        ((th) this).field_n = (byte) 0;
        ((th) this).field_m = new bh(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new java.awt.Color(10040319);
    }
}
