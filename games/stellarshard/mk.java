/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends gg {
    static id field_l;
    static int field_k;

    final static void a(String[] args, boolean param1) {
        RuntimeException var2 = null;
        String[] var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != la.field_B) {
            la.field_B.field_O.a(2178, args);
          }
          if (pd.field_e != null) {
            pd.field_e.field_F.a(2178, args);
          }
          if (param1) {
            return;
          }
          var3 = (String[]) null;
          mk.a((String[]) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mk.B(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private mk() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 > -44) {
          mk.a((byte) -122);
        }
    }

    static {
    }
}
