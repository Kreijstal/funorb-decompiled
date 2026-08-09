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
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        if (param0 <= 62) {
          L0: {
            field_p = 24;
            if (null != psb.field_b) {
              stackIn_8_0 = psb.field_b;
              break L0;
            } else {
              stackIn_8_0 = igb.field_a;
              break L0;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null != psb.field_b) {
              stackIn_4_0 = psb.field_b;
              break L1;
            } else {
              stackIn_4_0 = igb.field_a;
              break L1;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_4_0);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(16, 62, param0[0].a(29));
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (aba) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("df.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = new aba();
        field_p = 0;
    }
}
