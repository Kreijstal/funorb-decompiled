/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    String field_f;
    boolean field_e;
    int field_h;
    static vj field_c;
    boolean field_n;
    static int[] field_b;
    static ck field_k;
    static ve field_m;
    String[] field_d;
    static String field_j;
    static boolean field_i;
    static int field_a;
    static String field_l;
    static volatile boolean field_g;

    final static lm a(String param0, ji param1, ji param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 86) {
            field_b = (int[]) null;
          }
          var5_int = param2.b(-1, param4);
          var6 = param2.a(var5_int, 13030, param0);
          stackIn_3_0 = ql.a(param2, (byte) 41, var6, var5_int, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cd.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 8192) {
          field_c = (vj) null;
          return cl.field_v != null ? true : qc.field_N;
        }
        return cl.field_v != null ? true : qc.field_N;
    }

    final static void a(boolean param0) {
        am.field_a = null;
        nk.field_k = false;
        h.field_d = null;
        f.field_s = null;
        pd.field_d = null;
        ca.field_wb = null;
        kf.field_G = null;
        cl.field_B = null;
        if (!param0) {
          field_m = (ve) null;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_c = null;
        field_m = null;
        field_k = null;
        if (param0 < 119) {
          return;
        }
        field_b = null;
        field_j = null;
    }

    cd(boolean param0) {
        this.field_n = param0 ? true : false;
    }

    static {
        field_c = new vj();
        field_b = new int[8192];
        field_i = false;
        field_j = "<%0> wants to draw.";
        field_g = true;
        field_l = "Full";
    }
}
