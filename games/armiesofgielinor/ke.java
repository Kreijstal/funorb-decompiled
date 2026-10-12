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
        int var3 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        String var4 = null;
        sn var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 90) {
            field_c = (je) null;
          }
          vi.field_a = new sn[km.field_j.length];
          var7 = "";
          var2 = var7;
          for (var3 = 0; var3 < km.field_j.length; var3++) {
            var4 = km.field_j[var3];
            var5 = param1.a(var4, (byte) -97, var7);
            vi.field_a[var3] = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ke.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
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
