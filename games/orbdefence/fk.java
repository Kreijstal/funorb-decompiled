/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_d;
    static hj field_b;
    static String field_a;
    int field_c;

    final static qj a(boolean param0, byte param1) {
        qj var2 = new qj(true);
        if (param1 == -68) {
          var2.field_d = param0 ? true : false;
          return var2;
        }
        fk.a(-117);
        var2.field_d = param0 ? true : false;
        return var2;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != -102) {
          fk.a((byte) 29);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1113) {
          field_a = (String) null;
          return tl.a(uj.b((byte) -120), 61);
        }
        return tl.a(uj.b((byte) -120), 61);
    }

    final static hj a(ki param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 122 % ((param2 + 6) / 44);
          var5 = param0.a(param3, 0);
          var6 = param0.a(param1, 5187, var5);
          stackIn_1_0 = va.a(var5, var6, param0, (byte) -127);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("fk.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fk(int param0) {
        this.field_c = param0;
    }

    static {
        field_d = "Change display name";
        field_a = "Type your password again to make sure it's correct";
    }
}
