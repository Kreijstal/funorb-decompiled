/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tl {
    static String field_a;
    static lo field_b;
    static String field_c;
    static String field_d;

    abstract byte[] b(int param0);

    public static void a(int param0) {
        Object var2 = null;
        field_d = null;
        field_a = null;
        if (param0 != 10) {
          var2 = null;
          tl.a((jp) null, (byte) 73, 53, -72, (jp) null, (jp) null, 93, 73, -92, 81, -52);
          field_c = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          return;
        }
    }

    abstract void a(int param0, byte[] param1);

    final static void a(jp param0, byte param1, int param2, int param3, jp param4, jp param5, int param6, int param7, int param8, int param9, int param10) {
        if (param1 != -78) {
          field_c = null;
          param0.d((-param0.field_x + param3) / 2 + (param9 + (param6 * 5 >> -1735827504)), param2);
          param5.c(-(8 / param10) + ((param6 * 10 >> -334173040) + ((param3 + -param5.field_x) / 2 + param9)), -(30 / param10) + (param2 + (param7 - -480) - param5.field_z));
          param4.c((20 * param6 >> -663092240) + ((param3 + -param4.field_x) / 2 + param9), 480 + -param4.field_z);
          return;
        } else {
          param0.d((-param0.field_x + param3) / 2 + (param9 + (param6 * 5 >> -1735827504)), param2);
          param5.c(-(8 / param10) + ((param6 * 10 >> -334173040) + ((param3 + -param5.field_x) / 2 + param9)), -(30 / param10) + (param2 + (param7 - -480) - param5.field_z));
          param4.c((20 * param6 >> -663092240) + ((param3 + -param4.field_x) / 2 + param9), 480 + -param4.field_z);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "FROM ONLY";
        field_c = "Never mind! <%0>";
        field_d = "Elapsed time";
        field_b = new lo();
    }
}
