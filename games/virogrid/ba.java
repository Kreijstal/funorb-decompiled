/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    static il field_c;
    static int field_a;
    static String field_b;

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            stackIn_3_0 = nm.field_c;
            return stackIn_3_0;
          }
          if (param2 != 83) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          if (param1 == 6) {
            stackIn_9_0 = na.field_Eb;
            return stackIn_9_0;
          }
          if (param1 == 7) {
            stackIn_13_0 = hg.field_o;
            return stackIn_13_0;
          }
          if (param1 == 8) {
            stackIn_16_0 = ti.field_c;
            return stackIn_16_0;
          }
          if (param1 == 9) {
            stackIn_20_0 = wc.field_e;
            return stackIn_20_0;
          }
          if (param1 == 10) {
            stackIn_24_0 = se.field_a;
            return stackIn_24_0;
          }
          if (11 == param1) {
            stackIn_27_0 = qd.field_g;
            return stackIn_27_0;
          }
          if (param1 != 14) {
            return null;
          }
          stackIn_31_0 = oi.a(new String[]{param0}, oe.field_d, param2 ^ 81);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("ba.E(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract int a(int param0, int param1);

    final static void b(int param0) {
        if (param0 != 14) {
          ba.a(-71);
        }
    }

    abstract sj a(byte param0);

    abstract byte[] b(int param0, int param1);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 14) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
