/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    static String field_e;
    static String field_b;
    static String field_d;
    fq field_a;
    static ko field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -50) {
          fb.a((byte) -54);
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, dl[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
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
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param2 <= 0) {
                  break L1;
                } else {
                  var5_int = param1[0].field_n;
                  var6 = param1[2].field_n;
                  var7 = param1[1].field_n;
                  param1[0].a(param3, param4);
                  param1[2].a(-var6 + (param2 + param3), param4);
                  kh.b(ob.field_b);
                  kh.a(var5_int + param3, param4, -var6 + param2 + param3, param1[param0].field_o + param4);
                  var8 = param3 - -var5_int;
                  var9 = param2 + param3 + -var6;
                  param3 = var8;
                  L2: while (true) {
                    if (var9 <= param3) {
                      kh.a(ob.field_b);
                      break L0;
                    } else {
                      param1[1].a(param3, param4);
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
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("fb.E(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    abstract void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6);

    abstract fb a(int param0);

    fb(fq param0) {
        try {
            ((fb) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "fb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "'<%1>' levels complete<br><col=<%0>>Proceeding to '<%2>' levels";
        field_d = "Still Alive";
    }
}
