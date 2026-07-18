/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static wk field_r;
    static String field_o;
    bk field_c;
    bk field_h;
    static int field_j;
    bk field_a;
    static int field_q;
    static String field_d;
    static int field_f;
    bk field_n;
    long field_l;
    int field_b;
    oa field_i;
    byte field_m;
    oa field_g;
    volatile int field_k;
    volatile int field_p;
    pj field_e;

    abstract void d(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final int a(byte param0) {
        int var2 = -4 % ((param0 - 10) / 39);
        return ((uh) this).field_c.a((byte) 16) + ((uh) this).field_h.a((byte) 16);
    }

    final int e(int param0) {
        if (param0 != -10236) {
          boolean discarded$2 = ((uh) this).c((byte) -50);
          return ((uh) this).field_a.a((byte) 16) - -((uh) this).field_n.a((byte) 16);
        } else {
          return ((uh) this).field_a.a((byte) 16) - -((uh) this).field_n.a((byte) 16);
        }
    }

    public static void c() {
        field_d = null;
        field_o = null;
        field_r = null;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 6) {
          L0: {
            field_q = -40;
            if (((uh) this).a((byte) 72) < 20) {
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
            if (((uh) this).a((byte) 72) < 20) {
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

    final static void a(java.awt.Component param0, int param1, int param2, fe param3, lc param4, boolean param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              int discarded$3 = 1024;
              aj.a(param0, param1, 22290, param4, param5, param1, param3);
              if (param2 == -21) {
                break L1;
              } else {
                field_q = 117;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uh.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
        }
    }

    final pj a(int param0, boolean param1, boolean param2, byte param3, int param4) {
        long var6 = 0L;
        pj var8 = null;
        Object var9 = null;
        pj stackIn_1_0 = null;
        pj stackIn_2_0 = null;
        pj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        pj stackOut_0_0 = null;
        pj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        pj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param4 + ((long)param0 << 32);
          var8 = new pj();
          var8.field_z = param3;
          stackOut_0_0 = (pj) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = (pj) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (pj) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_p = stackIn_3_1 != 0;
        if (!param1) {
          var8.field_j = var6;
          if (param2) {
            if (-21 <= ((uh) this).a((byte) -110)) {
              throw new RuntimeException();
            } else {
              ((uh) this).field_c.a((byte) -128, (ri) (Object) var8);
              return var8;
            }
          } else {
            if (-21 >= ((uh) this).e(-10236)) {
              throw new RuntimeException();
            } else {
              ((uh) this).field_a.a((byte) -128, (ri) (Object) var8);
              return var8;
            }
          }
        } else {
          var9 = null;
          uh.a((java.awt.Component) null, -79, 112, (fe) null, (lc) null, false);
          var8.field_j = var6;
          if (param2) {
            if (-21 <= ((uh) this).a((byte) -110)) {
              throw new RuntimeException();
            } else {
              ((uh) this).field_c.a((byte) -128, (ri) (Object) var8);
              return var8;
            }
          } else {
            if (-21 >= ((uh) this).e(-10236)) {
              throw new RuntimeException();
            } else {
              ((uh) this).field_a.a((byte) -128, (ri) (Object) var8);
              return var8;
            }
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 < 68) {
            return true;
        }
        return ((uh) this).e(-10236) >= 20 ? true : false;
    }

    abstract void a(int param0);

    abstract boolean c(byte param0);

    uh() {
        ((uh) this).field_c = new bk();
        ((uh) this).field_h = new bk();
        ((uh) this).field_a = new bk();
        ((uh) this).field_n = new bk();
        ((uh) this).field_i = new oa(6);
        ((uh) this).field_m = (byte) 0;
        ((uh) this).field_p = 0;
        ((uh) this).field_k = 0;
        ((uh) this).field_g = new oa(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_r = new wk();
        field_d = "You have <%0> unread messages!";
    }
}
