/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ka {
    static int[][] field_b;
    static dq field_c;

    final static void a(int param0, wl param1) {
        RuntimeException runtimeException = null;
        od var7 = null;
        aj var9 = null;
        cs var11 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (null != wl.field_Kb) {
                break L1;
              } else {
                var7 = new od();
                var19 = var7.a(-959081435, 128, 128, 16);
                wl.field_Kb = sf.a(false, param0 + -145, var19);
                break L1;
              }
            }
            L2: {
              if (mq.field_e != null) {
                break L2;
              } else {
                var9 = new aj();
                var20 = var9.a(param0 + -12, 128, 16, 128);
                mq.field_e = sf.a(false, -137, var20);
                break L2;
              }
            }
            L3: {
              if (param0 == 8) {
                break L3;
              } else {
                field_c = (dq) null;
                break L3;
              }
            }
            L4: {
              var11 = param1.field_cc;
              if (!var11.b(true)) {
                break L4;
              } else {
                if (null != ho.field_a) {
                  break L4;
                } else {
                  var21 = gg.a(8, -93, 16.0f, new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                  ho.field_a = sf.a(false, -137, var21);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("nb.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 10536) {
            wl var3 = (wl) null;
            nb.a(-6, (wl) null);
        }
    }

    nb(wl param0) {
        hl discarded$0 = null;
        hl discarded$1 = null;
        hl discarded$2 = null;
        hl discarded$3 = null;
        nn discarded$4 = null;
        try {
            discarded$0 = new hl((fq) null, 5126, 3, 0);
            discarded$1 = new hl((fq) null, 5126, 2, 0);
            discarded$2 = new hl((fq) null, 5126, 3, 0);
            discarded$3 = new hl((fq) null, 5121, 4, 0);
            discarded$4 = new nn();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_b = (int[][]) null;
        if (param0 < 66) {
            field_c = (dq) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
    }
}
