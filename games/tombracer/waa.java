/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa {
    private bua field_d;
    static String field_b;
    private int field_c;
    private int field_a;
    static String field_e;

    final static int a(ft param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param1 == 1383) {
              break L0;
            } else {
              field_e = null;
              break L0;
            }
          }
          if (param0 == it.field_b) {
            stackOut_19_0 = 6407;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0;
          } else {
            if (gpa.field_a != param0) {
              if (rp.field_g != param0) {
                if (param0 == qr.field_w) {
                  stackOut_17_0 = 6409;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  if (wo.field_i != param0) {
                    if (param0 == js.field_g) {
                      stackOut_15_0 = 6145;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      throw new IllegalStateException();
                    }
                  } else {
                    stackOut_11_0 = 6410;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_7_0 = 6406;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 6408;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("waa.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L1;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 4974) {
            field_e = null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 6) {
          ((waa) this).field_c = -128;
          ura.a(param1 ^ -10991);
          hp.a(1024, 4095 & ((waa) this).field_a * ((waa) this).field_c, 1996, ((waa) this).field_d.b((byte) 74), -1918106173, param2 + ((waa) this).field_c, ((waa) this).field_a + param0);
          int discarded$2 = -6;
          se.f();
          return;
        } else {
          ura.a(param1 ^ -10991);
          hp.a(1024, 4095 & ((waa) this).field_a * ((waa) this).field_c, 1996, ((waa) this).field_d.b((byte) 74), -1918106173, param2 + ((waa) this).field_c, ((waa) this).field_a + param0);
          int discarded$3 = -6;
          se.f();
          return;
        }
    }

    final void b(int param0) {
        Object var3 = null;
        if (param0 != -9310) {
          var3 = null;
          int discarded$2 = waa.a((ft) null, 19);
          ((waa) this).field_d.a(0);
          return;
        } else {
          ((waa) this).field_d.a(0);
          return;
        }
    }

    waa(int param0, int param1) {
        ((waa) this).field_d = new bua(6, 4, 1);
        ((waa) this).field_d.a(1, true, (byte) -94, 6);
        ((waa) this).field_a = (int)((double)param0 * Math.random());
        ((waa) this).field_c = (int)(Math.random() * (double)param1);
        if (((waa) this).field_a < 20) {
            ((waa) this).field_a = 20;
        }
        if (20 > ((waa) this).field_c) {
            ((waa) this).field_c = 20;
        }
        if (param0 - 20 < ((waa) this).field_a) {
            ((waa) this).field_a = param0 - 20;
        }
        if (((waa) this).field_c > -20 + param1) {
            ((waa) this).field_c = param1 - 20;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Keys";
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
