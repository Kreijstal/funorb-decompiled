/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static int field_b;
    static java.math.BigInteger field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 != -49) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          if (param3 != -106) {
            return;
          }
          ma.field_d = ik.field_d;
          if (param0 == 255) {
            stackIn_11_0 = !(wh.field_k >= 13);
            va.field_n = al.a(stackIn_11_0, 1);
            return;
          }
          if (param0 >= 100 &&
            param0 <= 105) {
            va.field_n = ng.a((byte) -67, param2);
            return;
          }
          va.field_n = hj.a(param1, param0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ki.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_a = "Game options changed (<%0>)";
        field_c = new java.math.BigInteger("65537");
    }
}
