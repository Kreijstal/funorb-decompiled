/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    String field_b;
    static jp[][] field_e;
    boolean field_d;
    static String field_g;
    static jp field_a;
    static jp field_f;
    static mh field_h;
    String field_c;

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 >= -51) {
            return;
        }
        field_e = (jp[][]) null;
        field_f = null;
        field_a = null;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 >= 24) {
              if ((qg.field_A ^ -1) <= -11) {
                if (il.e((byte) -94)) {
                  if (i.field_j != 0) {
                    kn.a(true, param1);
                    return;
                  } else {
                    lf.a(param2, -71, false);
                    ck.a(param1, 0, 14209, 0);
                    return;
                  }
                } else {
                  lb.d();
                  dg.a(false, 240, 320);
                  ck.a(param1, 0, 14209, 0);
                  return;
                }
              } else {
                L1: {
                  var3_int = 0;
                  if (qc.field_i) {
                    var3_int = 1;
                    qc.field_i = false;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                po.a(da.d((byte) 103), sb.field_f, oj.b(false), var3_int != 0, 0);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    static {
    }
}
