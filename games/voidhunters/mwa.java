/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mwa extends rqa {
    static String field_o;
    static jra field_p;

    mwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            mwa.a('A', 38);
          }
          si.a(177, 62, param0[0].a(9));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mwa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(char param0, int param1) {
        if (0 > param0) {
          if (param1 <= -20) {
            return -1;
          }
          mwa.a('\033', 79);
          return -1;
        }
        if (param0 < si.field_q.length) {
          return si.field_q[param0];
        }
        if (param1 <= -20) {
          return -1;
        }
        mwa.a('\033', 79);
        return -1;
    }

    public static void a(int param0) {
        if (param0 < 126) {
          return;
        }
        field_p = null;
        field_o = null;
    }

    static {
        field_o = "Scores";
        field_p = new jra();
    }
}
