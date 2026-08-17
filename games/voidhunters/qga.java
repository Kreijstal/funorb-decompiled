/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga {
    static faa field_b;
    static long field_a;

    final static void a(String param0, int param1, byte param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 > 34) {
                break L1;
              } else {
                field_a = -92L;
                break L1;
              }
            }
            lrb.field_b = gka.field_o;
            if (param1 == 255) {
              L2: {
                if (-14 >= (iua.field_p ^ -1)) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              jra.field_a = rv.a(stackIn_12_0 != 0, 1);
              var6 = (String[]) null;
              mfb.a((String[]) null, 11113);
              break L0;
            } else {
              if (-101 < (param1 ^ -1)) {
                jra.field_a = tma.a(param1, param0, (byte) -124);
                return;
              } else {
                if ((param1 ^ -1) < -106) {
                  jra.field_a = tma.a(param1, param0, (byte) -124);
                  return;
                } else {
                  var4 = param3;
                  mfb.a(var4, 11113);
                  jra.field_a = wm.a(param3, (byte) -123);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("qga.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 94 / ((param0 - 55) / 45);
    }

    static {
    }
}
