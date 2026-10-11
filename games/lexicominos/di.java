/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends id {
    static String field_y;
    static qj field_x;

    di(int param0) {
        this(ql.field_Q, param0);
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_y = null;
        field_x = null;
    }

    final String c(int param0, w param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 349) {
            di.a(false);
          }
          stackIn_3_0 = nh.a('*', param1.field_u.length(), (byte) 67);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("di.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private di(le param0, int param1) {
        super(param0, param1);
    }

    static {
        field_y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
