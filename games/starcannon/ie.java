/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends kf {
    static int field_z;
    static gi field_y;
    static hl[] field_B;
    static int field_C;
    static volatile int field_D;
    int field_w;
    static pf field_x;
    static hl[] field_A;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param0 != 0) {
            return;
        }
        if (!(null != ((ie) this).field_t)) {
            return;
        }
        if (!(((ie) this).field_w != 0)) {
            return;
        }
        if (!(((ie) this).field_w != 256)) {
            ((ie) this).field_t.a(param0, param1 - -((ie) this).field_s, (byte) 49, param3 + ((ie) this).field_j);
            return;
        }
        hl var6 = new hl(((ie) this).field_t.field_i, ((ie) this).field_t.field_f);
        bc.a(var6, 26095);
        ((ie) this).field_t.a(param0, 0, param2, 0);
        wf.a(-110);
        var6.e(((ie) this).field_s + param1, ((ie) this).field_j + param3, ((ie) this).field_w);
    }

    public static void h(int param0) {
        field_y = null;
        field_x = null;
        field_A = null;
        field_B = null;
    }

    ie(uj param0) {
        super(param0.field_s, param0.field_j, param0.field_i, param0.field_f, (de) null, (qg) null);
        try {
            param0.a(0, ((ie) this).field_i, (byte) 117, ((ie) this).field_f, 0);
            ((ie) this).field_w = 256;
            ((ie) this).field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            field_x = s.field_f;
            if (param3 != 255) {
              L1: {
                if (param3 < 100) {
                  break L1;
                } else {
                  if (param3 > 105) {
                    break L1;
                  } else {
                    var4 = param2;
                    dl.a((byte) -12, var4);
                    mf.field_a = hc.a(param2, 0);
                    return;
                  }
                }
              }
              mf.field_a = fb.a(param1, param3, 0);
              break L0;
            } else {
              L2: {
                if (qb.field_a >= 13) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              mf.field_a = cf.a(stackIn_4_0 != 0, false);
              var5 = null;
              dl.a((byte) -12, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("ie.LA(").append(-111).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final static void g(int param0) {
    }

    public ie() {
        super(0, 0, 0, 0, (de) null, (qg) null);
        ((ie) this).field_w = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_C = 0;
    }
}
