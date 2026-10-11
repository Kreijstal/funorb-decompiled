/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_c;
    static String field_d;
    static String field_a;
    static String[][] field_b;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 < 0) {
          return false;
        }
        if (param1 > 11) {
          return false;
        }
        if (param2 < ~param0) {
          return false;
        }
        if (bo.a((byte) -57, param3, param1) >= param0) {
          return true;
        }
        return false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, og param2) {
        pc var5 = null;
        int var4 = 0;
        try {
          if (param1 != -18989) {
            field_c = (String) null;
          }
          var5 = aa.field_f;
          pc var3 = var5;
          var5.g(param0, 15514);
          var5.field_m = var5.field_m + 1;
          var4 = var5.field_m;
          var5.e(160, 1);
          if (param2.field_k != null) {
            var5.e(160, param2.field_k.length);
            var5.a(param2.field_k.length, 0, param1 + 15496, param2.field_k);
          } else {
            var5.e(160, 0);
          }
          var5.b(var4, (byte) 48);
          var5.field_m = var5.field_m - 4;
          param2.field_m = var5.k(param1 + 18989);
          var5.f(var5.field_m - var4, param1 + 18988);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dq.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = (String[][]) null;
        field_c = null;
        field_a = null;
        field_d = null;
        int var1 = -55 % ((param0 + 67) / 53);
    }

    final static hh a(byte param0, String param1, String param2, fm param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hh stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 31) {
            stackIn_2_0 = (hh) null;
            return stackIn_2_0;
          }
          var4_int = param3.a(117, param2);
          var5 = param3.a((byte) -125, param1, var4_int);
          stackIn_4_0 = lh.a(var4_int, param3, var5, 119);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = "Offer rematch";
        field_d = "Scamming";
        field_a = "The requirements for this Achievement are hidden.";
    }
}
