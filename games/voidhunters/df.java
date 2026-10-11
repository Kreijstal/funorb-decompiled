/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends rqa {
    static aba field_o;
    static int field_p;

    public static void f(byte param0) {
        field_o = null;
        if (param0 > -90) {
          df.e((byte) 1);
        }
    }

    df(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static java.awt.Canvas e(byte param0) {
        if (param0 > 62) {
          return null == psb.field_b ? igb.field_a : (java.awt.Canvas) ((Object) psb.field_b);
        }
        field_p = 24;
        return null == psb.field_b ? igb.field_a : (java.awt.Canvas) ((Object) psb.field_b);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(16, 62, param0[0].a(29));
          if (param1 > -119) {
            field_o = (aba) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("df.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new aba();
        field_p = 0;
    }
}
