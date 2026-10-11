/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends rqa {
    static dja field_r;
    static String field_t;
    static String field_q;
    static String field_s;
    static int field_o;
    static int[] field_p;

    kg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 != 7848) {
          field_o = 99;
        }
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
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(145, 98));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kg.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (param0 == 11) {
          return 0 != (32 & param2) ? true : false;
        }
        field_t = (String) null;
        return 0 != (32 & param2) ? true : false;
    }

    static {
        field_t = "VIP";
        field_q = "You have entered another game.";
        field_r = (dja) ((Object) new fl());
        field_o = 1;
        field_s = "Members";
    }
}
