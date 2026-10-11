/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends rqa {
    static int field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 10);
          }
          stackIn_3_0 = new nc(sn.field_Y);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gaa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 == 11343) {
          lfa.a((byte) 34, param3);
          ha.a(param3, param0, param2, 5);
          return;
        }
        gaa.a(72, 8, 14, true);
        lfa.a((byte) 34, param3);
        ha.a(param3, param0, param2, 5);
    }

    gaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 10;
    }
}
