/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_d;
    static long field_a;
    static int[] field_b;
    static va field_c;

    final static ti a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ti var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ti stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_14_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (qb.field_a != null) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = ua.a(-21, var6);
              if (var2 != null) {
                break L0;
              } else {
                var2 = param0;
                break L0;
              }
            }
            var3 = (ti) (Object) qb.field_a.a((byte) 109, (long)var2.hashCode());
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_db;
                  var4 = ua.a(90, var7);
                  if (var4 == null) {
                    var4 = var3.field_db;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  stackOut_14_0 = (ti) var3;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var3 = (ti) (Object) qb.field_a.c((byte) -97);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (ti) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("tg.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 256 + ')');
        }
    }

    final static void a(int param0, int param1) {
        se var2 = null;
        if (param0 >= -65) {
          return;
        } else {
          var2 = uk.field_b;
          var2.i(4, 108);
          var2.a(1, -92);
          var2.a(2, -71);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "EXCLUSIVE";
        field_b = new int[256];
    }
}
