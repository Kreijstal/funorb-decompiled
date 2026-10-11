/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends rqa {
    static int[][] field_o;
    static String field_p;

    final static void a(int param0) {
        if (param0 <= 48) {
          tm.a(45);
          if (li.field_i) {
            feb.a(og.field_r, true).a(true);
            return;
          }
          bia.a((byte) 124);
          return;
        }
        if (li.field_i) {
          feb.a(og.field_r, true).a(true);
          return;
        }
        bia.a((byte) 124);
    }

    tm(String param0, Class[] param1, String param2) {
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
            field_p = (String) null;
          }
          stackIn_3_0 = new nc(frb.a(66, 94));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = (int[][]) null;
        field_p = null;
        if (!param0) {
          field_p = (String) null;
        }
    }

    static {
        field_p = "Who can join";
    }
}
