/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static bc field_f;
    static Bounce field_h;
    static String field_e;
    static int[] field_b;
    static long field_g;
    static int field_a;
    static e field_d;
    static tg field_c;

    public static void a(int param0) {
        if (param0 > 68) {
          field_d = null;
          field_f = null;
          field_h = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_a = -28;
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static ng a(String param0, boolean param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ng stackIn_2_0 = null;
        ng stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param2 != 7117) {
            stackIn_2_0 = (ng) null;
            return stackIn_2_0;
          }
          if (param3.indexOf('@') != -1) {
            var6 = param3;
          } else {
            var7 = (CharSequence) ((Object) param3);
            var4_long = ma.a((byte) 82, var7);
          }
          stackIn_7_0 = ck.a(param0, (String) (var6), var4_long, 112, param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jl.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_f = new bc();
        field_e = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
