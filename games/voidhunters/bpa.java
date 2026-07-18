/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bpa implements wwa {
    private nva field_b;
    static int field_a;
    static llb field_c;
    static String field_d;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 44) {
            bpa.a((byte) 122);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param3 > param4) {
          ww.a(param0, param3, rba.field_b[param1], (byte) 75, param4);
          return;
        } else {
          ww.a(param0, param4, rba.field_b[param1], (byte) 75, param3);
          return;
        }
    }

    bpa(nva param0) {
        try {
            ((bpa) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bpa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param1.field_g + param2;
              var7 = param3 + param1.field_r;
              npa.a(var7, (byte) 115, param1.field_f, param1.field_h, var6_int);
              if (!param1.e((byte) -120)) {
                break L1;
              } else {
                aha.a(var7 - -2, param1.field_h + -4, 2 + var6_int, param1.field_f + -4, (byte) -100);
                break L1;
              }
            }
            L2: {
              dma.b(var6_int, var7, param1.field_h + (var6_int - 2), param1.field_f + var7);
              var9 = 78 % ((-27 - param0) / 35);
              var8 = ((bpa) this).field_b.field_w.g((byte) 96);
              if (var8 == null) {
                break L2;
              } else {
                var10 = var8.toString();
                ((bpa) this).field_b.field_v.c(var10, 2 + var6_int, -1 + ((((bpa) this).field_b.field_v.field_k + param1.field_f >> 1) + var7), 10000536, -1);
                if (!((bpa) this).field_b.e((byte) -120)) {
                  break L2;
                } else {
                  if (var10.startsWith(((bpa) this).field_b.field_E)) {
                    var11 = ((bpa) this).field_b.field_v.b(((bpa) this).field_b.field_E);
                    dma.e(var6_int - -2, var7 + 2, var11, -4 + param1.field_f, 2188450, 100);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            dma.d();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("bpa.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 131072;
        field_d = "This game option is only available to members.";
    }
}
