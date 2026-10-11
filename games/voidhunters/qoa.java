/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qoa extends rqa {
    static int field_o;
    static String field_p;

    qoa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 9099) {
          qoa.a(-21, -94, -54);
        }
    }

    final static void a(int param0, int param1, int param2) {
        uo.field_o = param1;
        ata.field_H = param0;
        if (param2 != 143) {
          qoa.a(-87);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            qoa.a(4);
          }
          si.a(143, 62, param0[0].a(49));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qoa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "CONGRATULATIONS, YOU ARE NOW QUALIFIED FOR BATTLE<br>PRESS ESCAPE TO OPEN THE MENU";
        field_o = 16;
    }
}
