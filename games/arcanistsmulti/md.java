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
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (!param0) {
                break L1;
              } else {
                md.a((byte) 28);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -59) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if ((param1 & 1L << var4) != 0L) {
                  var3_int = var3_int + ta.a(true, var4);
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "md.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 17 % ((param0 - 37) / 56);
        field_f = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_d = "Polishing menus";
        field_e = "Press '<col=ffffff>Z</col>' and '<col=ffffff>X</col>' to move your selected unit over the landscape. Remember that you cannot walk up steep cliffs.  You can also use '<col=ffffff><lt></col>' and '<col=ffffff><gt></col>'.";
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
