/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static kv field_b;
    static String field_a;
    static eaa field_e;
    static ee field_c;
    static String field_d;

    final static tn a(int param0) {
        if (param0 != -4127) {
          us.a(23);
          return (tn) ((Object) new ru());
        }
        return (tn) ((Object) new ru());
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != 12745) {
          field_e = (eaa) null;
        }
    }

    final static boolean a(vr param0, vr param1, vr param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.a(0) &&
            param1.a("commonui", 20637)) {
            if (param3 < 23) {
              field_a = (String) null;
            }
            if (!param0.a(0)) {
              return false;
            }
            if (!param0.a("commonui", 20637)) {
              return false;
            }
            if (param2.a(0) &&
              param2.a("button.gif", 20637)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("us.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "You need 5 or more creatures to delete one.";
        field_e = new eaa();
        field_d = "Breaking real-world laws";
    }
}
