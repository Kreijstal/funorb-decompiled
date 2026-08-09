/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static boolean field_a;
    static String field_f;
    static boolean[][] field_b;
    static je field_c;
    static String field_d;
    static je field_e;

    final static void a(byte param0, p param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        sn var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 90) {
                break L1;
              } else {
                field_c = (je) null;
                break L1;
              }
            }
            vi.field_a = new sn[km.field_j.length];
            var7 = "";
            var2 = var7;
            var3 = 0;
            L2: while (true) {
              if (var3 >= km.field_j.length) {
                break L0;
              } else {
                var4 = km.field_j[var3];
                var5 = param1.a(var4, (byte) -97, var7);
                vi.field_a[var3] = var5;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ke.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_b = (boolean[][]) null;
        int var1 = 77 % ((5 - param0) / 39);
        field_c = null;
        field_f = null;
    }

    static {
        field_f = "Options";
        field_d = "The invitation has been withdrawn.";
    }
}
