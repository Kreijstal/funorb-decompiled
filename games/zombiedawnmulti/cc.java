/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static ri field_c;
    static ja[] field_b;
    static String field_a;
    static String field_d;

    final static boolean a(String param0, String param1, String param2, int param3, int param4, fe param5, boolean param6) {
        RuntimeException var7 = null;
        tf var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (mp.field_b != id.field_B) {
            return false;
          }
          if (param4 != -10663) {
            field_b = (ja[]) null;
          }
          var8 = new tf(nb.field_a, param5);
          nb.field_a.b(param4 ^ -8815, var8);
          if (sd.h(3853)) {
            var8.p(param4 ^ -10591);
            return true;
          }
          iq.field_c = null;
          mc.field_g = param2;
          am.field_a = param0;
          ab.field_k = param6;
          id.field_B = dj.field_k;
          rj.field_J = param3;
          ch.field_j = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("cc.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -52) {
          return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "Click here to close help.";
        field_d = "Cloak your zombies in pure fear. Humans will run from them above all else, falling right into your clutches.";
    }
}
