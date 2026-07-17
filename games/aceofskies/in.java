/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_b;
    long field_d;
    static pa[] field_c;
    private wl field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
    }

    protected final void finalize() throws Throwable {
        ((in) this).field_a.a(((in) this).field_d, 3);
        super.finalize();
    }

    final static fr a(byte param0, boolean param1) {
        fr var2 = new fr(true);
        var2.field_d = false;
        if (param0 != 111) {
            field_b = null;
        }
        return var2;
    }

    in(wl param0, long param1, aq[] param2) {
        try {
            ((in) this).field_a = param0;
            ((in) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "in.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static w a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        w var7 = null;
        int var8 = 0;
        w stackIn_4_0 = null;
        w stackIn_8_0 = null;
        w stackIn_12_0 = null;
        w stackIn_20_0 = null;
        w stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_3_0 = null;
        w stackOut_7_0 = null;
        w stackOut_11_0 = null;
        w stackOut_22_0 = null;
        w stackOut_19_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = nh.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = ei.field_d;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = ee.a((byte) 10, '.', param1);
                if (var3.length < 2) {
                  stackOut_11_0 = nh.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  L1: {
                    if (param0 >= 124) {
                      break L1;
                    } else {
                      field_c = null;
                      break L1;
                    }
                  }
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_22_0 = we.a(var3[-1 + var3.length], -120);
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ic.a(var6, false);
                      if (var7 != null) {
                        stackOut_19_0 = (w) var7;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("in.A(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1000];
    }
}
