/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    int field_a;
    int field_b;
    static ob field_e;
    int field_c;
    static char field_d;

    public static void a(int param0) {
        if (param0 != 10934) {
          fm var2 = (fm) null;
          rk.a(-99, true, (fm) null, 69);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static boolean a(int param0, boolean param1, fm param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return false;
          }
          var5 = param2.a(param3, param0, true);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          sd.a((byte) -95, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("rk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    rk(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_b = param1;
        this.field_a = param0;
    }

    static {
        field_d = '/';
    }
}
