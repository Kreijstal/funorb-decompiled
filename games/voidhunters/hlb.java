/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hlb extends rqa {
    static int field_p;
    static String field_o;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        if (param1 == 255) {
          var2 = param0 - 50;
          return Math.min(255 * var2 / 50, 255);
        }
        hlb.a(75, 111);
        var2Lifetime1 = param0 - 50;
        return Math.min(255 * var2Lifetime1 / 50, 255);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(58, 90));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hlb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param3 > 44) {
          qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        }
        field_o = (String) null;
        qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
    }

    hlb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 66) {
          hlb.e((byte) 9);
        }
    }

    static {
        field_o = "Left wing";
        field_p = 256;
    }
}
