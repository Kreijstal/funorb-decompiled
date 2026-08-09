/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends rqa {
    static String field_o;
    static ef field_p;

    final static int a(int param0, int param1) {
        param0 = (param1 & param0) - -(1431655765 & param0 >>> 653165089);
        param0 = (param0 & 858993459) - -((-858993460 & param0) >>> -1686521054);
        param0 = 252645135 & (param0 >>> 148032772) + param0;
        param0 = param0 + (param0 >>> -612363640);
        param0 = param0 + (param0 >>> -464755376);
        return 255 & param0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3;
        if (param2) {
          field_p = (ef) null;
          var3 = param0 >>> -530246273;
          return -var3 + (param0 + var3) / param1;
        } else {
          var3 = param0 >>> -530246273;
          return -var3 + (param0 + var3) / param1;
        }
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(75, 62, param0[0].a(52));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("lb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_o = "Quit";
    }
}
