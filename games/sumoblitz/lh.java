/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ms {
    static il field_n;
    byte[] field_m;
    static ri field_k;
    boolean field_o;
    static ji field_l;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
        field_p = null;
        int var1 = -90 / ((param0 - 71) / 51);
    }

    final static dk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        dk var7 = null;
        int var8 = 0;
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        dk stackIn_17_0 = null;
        dk stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 != (var2_int ^ -1)) {
              if (255 < var2_int) {
                stackIn_7_0 = cn.field_ib;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = cn.a('.', param0, -27224);
                if (var3.length < 2) {
                  stackIn_11_0 = qo.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_20_0 = cp.a(param1 ^ -26, var3[var3.length + -1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = fh.a(var6, -1);
                      if (var7 != null) {
                        stackIn_17_0 = (dk) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = qo.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("lh.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    lh() {
    }

    static {
        field_n = new il();
        field_l = new ji();
        field_p = "reset stats";
    }
}
