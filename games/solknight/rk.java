/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rk {
    static String field_a;
    static int field_c;
    static String field_b;

    final static int a(boolean param0, byte param1, ab param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20) {
            rk.a((byte) -79);
          }
          stackIn_3_0 = param2.b(false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract void a(int param0, byte[] param1);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 94) {
          field_a = (String) null;
        }
    }

    abstract byte[] a(int param0);

    static {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = 0;
        field_b = "Names should contain a maximum of 12 characters";
    }
}
