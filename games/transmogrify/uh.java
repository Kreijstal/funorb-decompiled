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
        return this.field_c.a((byte) 16) + this.field_h.a((byte) 16);
    }

    final int e(int param0) {
        if (param0 != -10236) {
          this.c((byte) -50);
          return this.field_a.a((byte) 16) - -this.field_n.a((byte) 16);
        } else {
          return this.field_a.a((byte) 16) - -this.field_n.a((byte) 16);
        }
    }

    public static void c(int param0) {
        lc var2;
        if (param0 != -21) {
          var2 = (lc) null;
          uh.a((java.awt.Component) null, 16, -39, (fe) null, (lc) null, true);
          field_d = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_d = null;
          field_o = null;
          field_r = null;
          return;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 6) {
          L0: {
            field_q = -40;
            if ((this.a((byte) 72) ^ -1) > -21) {
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
            if ((this.a((byte) 72) ^ -1) > -21) {
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

    final static void a(java.awt.Component param0, int param1, int param2, fe param3, lc param4, boolean param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              aj.a(param0, param1, 22290, param4, param5, param1, param3, 1024);
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("uh.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param5 + ')');
        }
    }

    final pj a(int param0, boolean param1, boolean param2, byte param3, int param4) {
        pj stackIn_2_0 = null;
        pj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        long var6;
        pj var8;
        lc var9;
        L0: {
          var6 = (long)param4 + ((long)param0 << -2025316960);
          var8 = new pj();
          var8.field_z = param3;
          stackIn_2_0 = (pj) (var8);

          if (!param2) {
            stackIn_3_0 = (pj) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (pj) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_p = stackIn_3_1 != 0;
        if (!param1) {
          L1: {
            var8.field_j = var6;
            if (param2) {
              break L1;
            } else {
              if (-21 >= (this.e(-10236) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_a.a((byte) -128, var8);
                if (Transmogrify.field_A) {
                  break L1;
                } else {
                  return var8;
                }
              }
            }
          }
          if (-21 >= (this.a((byte) -110) ^ -1)) {
            throw new RuntimeException();
          } else {
            this.field_c.a((byte) -128, var8);
            return var8;
          }
        } else {
          L2: {
            var9 = (lc) null;
            uh.a((java.awt.Component) null, -79, 112, (fe) null, (lc) null, false);
            var8.field_j = var6;
            if (param2) {
              break L2;
            } else {
              if (-21 >= (this.e(-10236) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_a.a((byte) -128, var8);
                if (Transmogrify.field_A) {
                  break L2;
                } else {
                  return var8;
                }
              }
            }
          }
          if (-21 >= (this.a((byte) -110) ^ -1)) {
            throw new RuntimeException();
          } else {
            this.field_c.a((byte) -128, var8);
            return var8;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 < 68) {
            return true;
        }
        return this.e(-10236) >= 20 ? true : false;
    }

    abstract void a(int param0);

    abstract boolean c(byte param0);

    uh() {
        this.field_c = new bk();
        this.field_h = new bk();
        this.field_a = new bk();
        this.field_n = new bk();
        this.field_i = new oa(6);
        this.field_m = (byte) 0;
        this.field_p = 0;
        this.field_k = 0;
        this.field_g = new oa(10);
    }

    static {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_r = new wk();
        field_d = "You have <%0> unread messages!";
    }
}
