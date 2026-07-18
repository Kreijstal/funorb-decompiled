/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static boolean field_b;
    static int field_d;
    static upa field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static int[] a(int param0, int[] param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = new int[pd.a(param1, 2048)];
              var2 = var7;
              var3 = 0;
              var4 = 0;
              if (param1.length <= var4) {
                break L1;
              } else {
                L2: {
                  if (param1[var4] != 0) {
                    var5 = 0;
                    L3: while (true) {
                      if (32 <= var5) {
                        break L2;
                      } else {
                        L4: {
                          if ((1 << var5 & param1[var4]) == 0) {
                            var5++;
                            var5++;
                            break L4;
                          } else {
                            int incrementValue$341 = var3;
                            var3++;
                            var7[incrementValue$341] = fh.a(var5, var4 << 5);
                            var5++;
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    var4++;
                    break L2;
                  }
                }
                var4++;
                var4++;
                break L1;
              }
            }
            stackOut_15_0 = (int[]) var7;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("sb.B(").append(0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, cn param1, cn param2, cn param3, cn param4) {
        try {
            bja.field_a = param4;
            qoa.field_b = param1;
            ua.field_a = param2;
            nj.field_v = param3;
            ns.field_j = new nda(qoa.field_b, nj.field_v);
            bia.field_J = new u[237];
            int var5_int = 0;
            fna.field_j = new qua[4];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sb.C(" + -70 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_c = "Accept <%0> into this game";
    }
}
