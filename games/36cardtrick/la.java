/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class la extends he {
    static int[] field_m;
    boolean field_o;
    static kc field_k;
    volatile boolean field_n;
    boolean field_l;

    abstract byte[] b(boolean param0);

    abstract int a(boolean param0);

    public static void b(byte param0) {
        field_m = null;
        if (param0 < 12) {
          return;
        }
        field_k = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = wk.a('_', 63, param0, "");
          if (param1 != -115) {
            return true;
          }
          var3 = gi.a(98, param2);
          stackIn_8_0 = (-1 != param0.indexOf(param2)) || (-1 != param0.indexOf(var3));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("la.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    la() {
        this.field_n = true;
    }

    static {
        field_m = new int[8192];
    }
}
