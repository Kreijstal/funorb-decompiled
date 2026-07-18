/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ka {
    static int[][] field_b;
    static dq field_c;

    final static void a(int param0, wl param1) {
        RuntimeException runtimeException = null;
        od var2 = null;
        aj var2_ref = null;
        cs var2_ref2 = null;
        byte[] var4 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null != wl.field_Kb) {
                break L1;
              } else {
                var2 = new od();
                var4 = var2.a(-959081435, 128, 128, 16);
                wl.field_Kb = sf.a(false, -137, var4);
                break L1;
              }
            }
            L2: {
              if (mq.field_e != null) {
                break L2;
              } else {
                var2_ref = new aj();
                var5 = var2_ref.a(-4, 128, 16, 128);
                mq.field_e = sf.a(false, -137, var5);
                break L2;
              }
            }
            L3: {
              var2_ref2 = param1.field_cc;
              if (!var2_ref2.b(true)) {
                break L3;
              } else {
                if (null != ho.field_a) {
                  break L3;
                } else {
                  var6 = gg.a(8, -93, 16.0f, (ai) (Object) new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                  ho.field_a = sf.a(false, -137, var6);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("nb.C(").append(8).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
    }

    nb(wl param0) {
        try {
            hl discarded$0 = new hl((fq) null, 5126, 3, 0);
            hl discarded$1 = new hl((fq) null, 5126, 2, 0);
            hl discarded$2 = new hl((fq) null, 5126, 3, 0);
            hl discarded$3 = new hl((fq) null, 5121, 4, 0);
            nn discarded$4 = new nn();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
    }

    static {
    }
}
