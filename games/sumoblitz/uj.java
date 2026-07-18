/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static hr[] field_b;
    static ri[] field_c;
    static hr field_a;

    final static ah a(int param0, int param1, int param2, byte param3, int param4) {
        return (ah) (Object) new dr(param0, param2, param1, param4);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, boolean param2, tv param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (qr.field_b != null) {
                u.a(param3, 256, (byte) -87, 1048576, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != qc.field_e) {
                var4 = (Object) (Object) wd.field_f;
                synchronized (var4) {
                  L3: {
                    qc.field_e.a((byte) -91, -1, 256);
                    if (nd.field_B != param3) {
                      L4: {
                        qc.field_e.e(0);
                        wd.field_f.d();
                        nd.field_B = param3;
                        if (null == nd.field_B) {
                          break L4;
                        } else {
                          qc.field_e.a(param2, nd.field_B, 91);
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("uj.A(").append(-124).append(',').append(256).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
    }
}
