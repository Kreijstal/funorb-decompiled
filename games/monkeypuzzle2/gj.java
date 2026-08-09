/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String[] field_b;
    static li field_a;
    static int[] field_c;

    final static void a(byte param0) {
        ke.field_f = new le[3];
        ke.field_f[0] = new le(410, 67);
        if (param0 != -31) {
          field_c = (int[]) null;
          ke.field_f[1] = new le(221, 190);
          ke.field_f[2] = new le(178, 190);
          return;
        } else {
          ke.field_f[1] = new le(221, 190);
          ke.field_f[2] = new le(178, 190);
          return;
        }
    }

    public static void a(int param0) {
        gg var2;
        field_c = null;
        field_b = null;
        if (param0 != 1) {
          var2 = (gg) null;
          gj.a(-38, -19, -44, 117, -100, -28, 19, -46, 44, (ta) null, 126, -70, (ta) null, 108, (gg) null, 59, 98, 43, 6, (gg) null, (gg) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ta param9, int param10, int param11, ta param12, int param13, gg param14, int param15, int param16, int param17, int param18, gg param19, gg param20) {
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              ff.a(false, param9, param12, param3);
              wf.a(param10, param17, param0, 8192, param16);
              if (param15 < -88) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            tf.a((byte) 33, param6, param13);
            e.a(param19, param8, param11, param18, -1, param20);
            qa.a((byte) -39, param14, param1, param5);
            w.a(param7, param4, param2, -21734);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("gj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param13).append(',');

            if (param14 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param20 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        di.field_c = param1;
        sc.field_e = 1;
        ej.field_b = param0;
        dh.field_c = param2;
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = null;
        field_c = new int[8192];
    }
}
