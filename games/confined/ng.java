/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, df param6, String param7, int param8) {
        try {
            hj.field_k = param1;
            wi.field_c = param4;
            ek.field_p = param6;
            eb.field_n = param7;
            tl.field_f = param3;
            fa.field_P = param0;
            hc.field_n = param8;
            pi.field_L = param5;
            if (param2 != 24774) {
                mi var10 = (mi) null;
                ng.a((mi) null, 105, (mi) null);
            }
            om.field_s = (jf) ((Object) new kd());
            oc.field_l = new pc(param6);
            dh.field_vb = new ja(om.field_s, oc.field_l);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ng.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 113 / ((18 - param0) / 58);
        field_a = null;
    }

    final static void a(mi param0, int param1, mi param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rn.field_f = param2;
              un.field_a = param0;
              if (param1 == -15518) {
                break L1;
              } else {
                field_a = (String) null;
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

            stackIn_5_1 = new StringBuilder().append("ng.C(");

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


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_a = "HOMING ALIEN SHOTS";
    }
}
