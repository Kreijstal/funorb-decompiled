/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends rqa {
    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var1_int = 3 / ((param0 - 64) / 44);
                if (null == qta.field_o) {
                  break L2;
                } else {
                  if (null != jmb.field_q) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jmb.field_q = new int[256];
              qta.field_o = new int[256];
              var2 = 0;
              L3: while (true) {
                if (256 <= var2) {
                  break L1;
                } else {
                  var3 = (double)var2 / 255.0 * 6.283185307179586;
                  qta.field_o[var2] = (int)(4096.0 * Math.sin(var3));
                  jmb.field_q[var2] = (int)(Math.cos(var3) * 4096.0);
                  var2++;
                  continue L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "taa.B(" + param0 + ')');
        }
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
                taa.e((byte) 116);
                break L1;
              }
            }
            stackOut_2_0 = new nc(pcb.field_o);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("taa.A(");
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

    taa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
