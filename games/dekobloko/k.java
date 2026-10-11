/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_d;
    static w field_a;
    static sk field_f;
    static String field_h;
    static String field_e;
    static int[] field_g;
    static mh field_c;
    static s field_b;

    public static void a(int param0) {
        field_d = null;
        if (param0 == -5161) {
          field_g = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_f = null;
          return;
        }
        field_b = (s) null;
        field_g = null;
        field_h = null;
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_4_0 = h.field_c.equals(kf.a(var3, (byte) 2));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("k.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -36) {
          field_c = (mh) null;
          jg.a(se.h(25144), 0);
          return;
        }
        jg.a(se.h(25144), 0);
    }

    static {
        field_h = "Accept rematch";
        field_d = "Security";
        field_f = new sk(1);
        field_e = null;
    }
}
