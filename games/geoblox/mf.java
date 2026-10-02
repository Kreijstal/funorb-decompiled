/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static na field_a;

    final static void b(boolean param0) {
        if (!el.field_o.field_Y) {
            fj.field_m = fj.field_m + 1;
            if (param0) {
                mf.a(false);
                return;
            }
            return;
        }
        if (!param0) {
            return;
        }
        mf.a(false);
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (na) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, rh param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3.a(param1, -28153, param0);
          var4 = var5;
          if (param2 < 102) {
            return false;
          }
          if (var5 == null) {
            return false;
          }
          hf.a(true, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var4_ref);

          stackIn_11_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
