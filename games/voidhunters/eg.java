/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends rqa {
    static rbb field_p;
    static int field_o;

    final static void a(int param0, int param1, phb[] param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var5_int = param2[0].field_m;
                  var6 = param2[2].field_m;
                  var7 = param2[1].field_m;
                  param2[0].a(param3, param1);
                  param2[2].a(param4 + (param3 - var6), param1);
                  dma.a(ola.field_o);
                  dma.g(var5_int + param3, param1, param4 + param3 - var6, param1 - -param2[param0].field_n);
                  var8 = param3 - -var5_int;
                  var9 = -var6 + param4 + param3;
                  param3 = var8;
                  L2: while (true) {
                    if (param3 >= var9) {
                      dma.b(ola.field_o);
                      break L0;
                    } else {
                      param2[1].a(param3, param1);
                      param3 = param3 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("eg.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    eg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(71, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("eg.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_p = null;
    }

    final static void e(byte param0) {
        if (fda.e((byte) 104)) {
            return;
        }
        if (!wh.g(-127)) {
            return;
        }
        kc var1 = es.field_b;
        if (!(var1 != null)) {
            return;
        }
        if (!(!bqa.a(false))) {
            var1 = new kc();
            es.field_b.b((byte) 87, (tv) (Object) var1);
            var1.field_f = null;
        }
        byte[] var20 = dab.a(-30234, (tv) (Object) var1);
        byte[] var11 = var20;
        byte[] var2 = var11;
        if (var2 == null) {
            nkb.a(false, "Failed to write player gamedata");
            return;
        }
        if (var20.length > 200) {
            nkb.a(false, "Failed to write player gamedata");
            return;
        }
        nkb.a(false, "Submitting " + var20.length + " bytes to clientdata");
        if (param0 > -35) {
            field_o = -50;
        } else {
            int discarded$0 = 6;
            int discarded$1 = 64;
            dnb discarded$2 = jla.a(var2);
            return;
        }
        int discarded$3 = 6;
        int discarded$4 = 64;
        dnb discarded$5 = jla.a(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 2;
    }
}
