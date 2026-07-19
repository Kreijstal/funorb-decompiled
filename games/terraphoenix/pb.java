/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static jj field_a;
    static String field_c;
    static int field_b;

    final static ci[] a(int param0, boolean param1, int param2, fa param3) {
        String discarded$2 = null;
        RuntimeException var4 = null;
        ci[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ci[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (vh.a(param0, param2, param3, true)) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  discarded$2 = pb.a((byte) 72);
                  break L1;
                }
              }
              stackOut_5_0 = dj.c(-9);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("pb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static String a(byte param0) {
        if (qe.field_f == ua.field_d) {
          return ra.field_m;
        } else {
          if (param0 == -47) {
            if (pe.field_a != ua.field_d) {
              if (!vc.field_a.a(param0 ^ 78)) {
                return vh.field_l;
              } else {
                return ol.field_Hb;
              }
            } else {
              return vh.field_l;
            }
          } else {
            return (String) null;
          }
        }
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_c = null;
        field_a = null;
        if (param0 != -22970) {
            discarded$0 = pb.a((byte) -7);
        }
    }

    static {
        field_a = new jj();
        field_c = "Please check if address is correct";
    }
}
