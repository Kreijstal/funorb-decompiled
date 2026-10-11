/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kia {
    static String field_a;
    static String field_b;

    final static void a(byte param0) {
        String var1 = null;
        if (!tla.field_c) {
          throw new IllegalStateException();
        }
        if (param0 == 63) {
          if (null != hwa.field_o) {
            hwa.field_o.l((byte) -106);
          }
          var1 = mr.m((byte) -118);
          jt.field_o = new vla(var1, (String) null, true, false, false);
          klb.field_r.a(false, s.field_o);
          s.field_o.b(jt.field_o, -110);
          s.field_o.e(param0 - 10394);
          return;
        }
    }

    final static im a(int param0, qfa param1, int param2, byte[] param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        im stackIn_2_0 = null;
        im stackIn_9_0 = null;
        im stackIn_11_0 = null;
        im stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != 21989) {
            stackIn_2_0 = (im) null;
            return stackIn_2_0;
          }
          if (!param1.field_n && (!bd.a(param2, (byte) -95) ||
            !bd.a(param0, (byte) -95))) {
            if (!param1.field_g) {
              stackIn_11_0 = new im(param1, param7, param2, param0, hj.a(param2, (byte) -95), hj.a(param0, (byte) -109), param3, param4);
              return stackIn_11_0;
            }
            stackIn_9_0 = new im(param1, 34037, param7, param2, param0, param5, param3, param4);
            return stackIn_9_0;
          }
          stackIn_13_0 = new im(param1, 3553, param7, param2, param0, param5, param3, param4);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("kia.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 3553) {
          field_a = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Message game";
        field_a = "<%0> has won the round!";
    }
}
