/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends rqa {
    static String field_o;
    static ef field_p;

    final static int a(int param0, int param1) {
        param0 = (param1 & param0) + (1431655765 & param0 >>> 1);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param2) {
          var3 = param0 >>> 31;
          return -var3 + (param0 + var3) / param1;
        }
        field_p = (ef) null;
        var3Lifetime1 = param0 >>> 31;
        return -var3Lifetime1 + (param0 + var3Lifetime1) / param1;
    }

    lb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -612363640) {
          lb.a(-95, 34);
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
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(75, 62, param0[0].a(52));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Quit";
    }
}
