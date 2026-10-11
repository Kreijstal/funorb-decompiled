/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends da {
    static int[] field_k;
    boolean field_j;
    static boolean field_n;
    static ka[] field_p;
    static int[] field_s;
    byte[] field_q;
    static String field_i;
    static char[] field_r;
    static boolean field_o;
    static eb field_l;
    static boolean field_m;

    final static boolean a(String param0, boolean param1, String param2, int param3, dg param4, int param5, String param6) {
        ta var7 = null;
        RuntimeException var7_ref = null;
        String var8 = null;
        ta var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (mg.field_c != gj.field_a) {
            return false;
          }
          if (param3 != 193) {
            var8 = (String) null;
            eb.a((String) null, false, (String) null, -40, (dg) null, -123, (String) null);
          }
          var9 = new ta(t.field_b, param4);
          var7 = var9;
          t.field_b.a((byte) 125, (ee) (var9));
          if (wi.a(0)) {
            var9.h((byte) 21);
            return true;
          }
          mj.field_d = param6;
          cf.field_f = param5;
          uf.field_j = param2;
          cj.field_d = param1;
          pd.field_h = null;
          gj.field_a = qc.field_i;
          vb.field_m = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("eb.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_i = null;
        field_r = null;
        field_l = null;
        if (param0 != 237) {
          return;
        }
        field_k = null;
        field_p = null;
    }

    eb() {
    }

    static {
        field_i = "Resume Game";
        field_r = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_s = new int[]{34, 34, 34};
    }
}
