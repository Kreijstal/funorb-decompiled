/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String[] field_b;
    static qa field_c;
    static String field_a;
    static boolean field_d;

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        af var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        af stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (param2 == null) {
            return null;
          }
          if (param2.length > 136) {
            var3 = new af();
            ((qb) ((Object) var3)).a(param2, 98);
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          if (param0) {
            stackIn_14_0 = sm.a(-128, param2);
            return stackIn_14_0;
          }
          stackIn_12_0 = (byte[]) (param2);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 136) {
          field_d = false;
          return rd.field_h;
        }
        return rd.field_h;
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = -70 % ((param0 - 53) / 58);
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "to over <%0> great games";
        field_b = new String[]{"By rating", "By win percentage"};
    }
}
