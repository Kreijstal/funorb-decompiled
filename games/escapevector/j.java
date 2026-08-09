/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 26 % ((65 - param0) / 59);
    }

    final static void a(String[] args, String param1, byte param2, int param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var6 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              dn.field_q = ia.field_y;
              if (-256 == (param3 ^ -1)) {
                L2: {
                  if (13 <= gf.field_a) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
                nf.field_y = fc.a(stackIn_10_0 != 0, (byte) -82);
                break L1;
              } else {
                if ((param3 ^ -1) > -101) {
                  nf.field_y = bm.a(param1, param3, 4);
                  break L1;
                } else {
                  if (105 < param3) {
                    nf.field_y = bm.a(param1, param3, 4);
                    break L1;
                  } else {
                    nf.field_y = rg.a(args, (byte) -103);
                    break L1;
                  }
                }
              }
            }
            if (param2 == -72) {
              break L0;
            } else {
              var6 = (String) null;
              j.a((String[]) null, (String) null, (byte) -30, 62);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("j.A(");

            if (args == null) {
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


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Creating your account";
    }
}
