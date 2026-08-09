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
        jp var2;
        field_d = null;
        field_a = null;
        if (param0 != 10) {
          var2 = (jp) null;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          L0: {
            L1: {
              if (param1 == -78) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            param0.d((-param0.field_x + param3) / 2 + (param9 + (param6 * 5 >> -1735827504)), param2);
            param5.c(-(8 / param10) + ((param6 * 10 >> -334173040) + ((param3 + -param5.field_x) / 2 + param9)), -(30 / param10) + (param2 + (param7 - -480) - param5.field_z));
            param4.c((20 * param6 >> -663092240) + ((param3 + -param4.field_x) / 2 + param9), 480 + -param4.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("tl.G(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    static {
        field_a = "FROM ONLY";
        field_c = "Never mind! <%0>";
        field_d = "Elapsed time";
        field_b = new lo();
    }
}
