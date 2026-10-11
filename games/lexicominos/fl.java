/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    static db field_c;
    static String field_d;
    static String[] field_a;

    final static mj a(byte[] param0, byte param1) {
        mj var2 = null;
        RuntimeException var2_ref = null;
        mj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != -116) {
            field_b = (String) null;
          }
          var2 = new mj(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, ci.field_b, be.field_f);
          gk.a(12428);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0) {
          fl.a(false);
        }
    }

    static {
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
