/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_f;
    int field_c;
    String field_b;
    static ek field_j;
    String field_a;
    static int field_i;
    qk field_d;
    static String field_e;
    String field_g;
    static long field_h;
    static int field_k;

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 0) {
          field_j = (ek) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1 > -54) {
            t.a((byte) 20);
          }
          if (param0.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param0.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param0.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("Z")) {
            stackIn_19_0 = Boolean.TYPE;
            return stackIn_19_0;
          }
          if (param0.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            stackIn_31_0 = Class.forName(param0);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("t.C(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 < 84) {
          return;
        }
        ri.field_c = rd.field_j.c(false);
        CharSequence var2 = (CharSequence) ((Object) ri.field_c);
        aa.field_fb = ff.a((byte) 116, var2);
    }

    private t() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Service unavailable";
        field_i = 111;
        field_e = null;
        field_h = 0L;
        field_k = 20;
    }
}
