/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eca {
    static String[][] field_b;
    static int field_a;
    static nh[] field_c;

    final static boolean a(byte param0, int param1, long param2, int[] param3, String param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        eua var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!sqa.a(param1, 83, param3, param4, param2)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var6_int = 17 / ((-37 - param0) / 62);
                if (param1 == 1) {
                  param1 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              wp.field_a = param4;
              bta.field_q = param1;
              var8 = (CharSequence) ((Object) param4);
              mn.field_n = jd.a(1, var8);
              ica.field_b = param2;
              var7 = sa.a(oka.field_w, uka.field_M, tg.field_c, param3, false);
              asa.a(-124, var7);
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("eca.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void a(int param0) {
        String var2;
        if (param0 != 30152) {
          var2 = (String) null;
          eca.a((byte) -86, 99, 60L, (int[]) null, (String) null);
          field_b = (String[][]) null;
          field_c = null;
          return;
        } else {
          field_b = (String[][]) null;
          field_c = null;
          return;
        }
    }

    final static iu[] a(int param0, int param1) {
        iu[] var3 = new iu[9];
        iu[] var2 = var3;
        var3[param0] = jf.a(param1, 124, 64);
        return var2;
    }

    static {
    }
}
