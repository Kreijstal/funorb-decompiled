/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mua {
    static int field_b;
    static fpa field_a;

    final static la a(dt param0, int param1) {
        RuntimeException var2 = null;
        dt var3 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 10) {
            var3 = (dt) null;
            mua.a((dt) null, -83);
          }
          stackIn_3_0 = new la(param0, 0, (kh) null, 0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mua.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          mua.a(34);
        }
    }

    static {
        field_a = new fpa();
    }
}
