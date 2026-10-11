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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sqa.a(param1, 83, param3, param4, param2)) {
            return false;
          }
          var6_int = 17 / ((-37 - param0) / 62);
          if (param1 == 1) {
            param1 = 0;
          }
          wp.field_a = param4;
          bta.field_q = param1;
          var8 = (CharSequence) ((Object) param4);
          mn.field_n = jd.a(1, var8);
          ica.field_b = param2;
          var7 = sa.a(oka.field_w, uka.field_M, tg.field_c, param3, false);
          asa.a(-124, var7);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("eca.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 30152) {
          field_b = (String[][]) null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        eca.a((byte) -86, 99, 60L, (int[]) null, (String) null);
        field_b = (String[][]) null;
        field_c = null;
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
