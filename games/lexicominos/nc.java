/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends kd {
    int field_j;
    int field_l;
    int[] field_m;
    long field_h;
    int field_k;
    static String field_p;
    static db field_n;
    static int field_r;
    int field_o;
    int field_s;
    int field_q;
    int field_i;

    final static tf a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_16_0 = null;
        tf stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        tf stackOut_19_0 = null;
        tf stackOut_15_0 = null;
        tf stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = w.field_k;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (63 >= var2_int) {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (-1 == dc.field_y.indexOf(var4)) {
                        stackOut_19_0 = ll.field_a;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        break L1;
                      }
                    } else {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (var3 != -1 + var2_int) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_15_0 = ll.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_6_0 = vi.field_l;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("nc.A(").append(63).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 1;
        field_p = null;
        field_n = null;
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((nc) this).field_q = param3;
            ((nc) this).field_s = param5;
            int fieldTemp$0 = hl.field_B;
            hl.field_B = hl.field_B + 1;
            ((nc) this).field_j = fieldTemp$0 & 65535;
            ((nc) this).field_i = param2;
            ((nc) this).field_o = param4;
            ((nc) this).field_m = param6;
            ((nc) this).field_l = param1;
            ((nc) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
    }
}
