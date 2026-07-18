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
        field_e = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        mh var5 = null;
        Object var6 = null;
        mh stackIn_4_0 = null;
        mh stackIn_7_0 = null;
        mh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_12_0 = null;
        mh stackOut_6_0 = null;
        mh stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (-1 != var2_int) {
                    L2: {
                      var3 = param1.substring(0, var2_int);
                      if (param0 <= -98) {
                        break L2;
                      } else {
                        var6 = null;
                        mh discarded$2 = th.a(-51, (String) null);
                        break L2;
                      }
                    }
                    var4 = param1.substring(1 + var2_int);
                    var5 = cf.a(var3, (byte) -124);
                    if (var5 != null) {
                      stackOut_12_0 = (mh) var5;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      return rh.b(2, var4);
                    }
                  } else {
                    stackOut_6_0 = c.field_o;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = ec.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("th.N(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
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
        long var6 = (long)param3 + ((long)param1 << 32);
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
                if (!(((th) this).c((byte) -100) < 20)) {
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
            if (!(((th) this).c((byte) -100) < 20)) {
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
