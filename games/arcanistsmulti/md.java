/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_e;
    static qb[] field_f;
    static String field_d;
    static kc field_b;
    static int field_c;
    static String[] field_a;

    final static int a(boolean param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= 58) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if ((param1 & 1L << var4) == 0L) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "md.A(" + false + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 0;
        field_f = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Polishing menus";
        field_e = "Press '<col=ffffff>Z</col>' and '<col=ffffff>X</col>' to move your selected unit over the landscape. Remember that you cannot walk up steep cliffs.  You can also use '<col=ffffff><lt></col>' and '<col=ffffff><gt></col>'.";
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
