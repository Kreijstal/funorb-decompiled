/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends jb {
    static String field_r;
    int field_l;
    static int[] field_q;
    int field_f;
    int[] field_p;
    static int field_s;
    static dl field_g;
    long field_i;
    int field_o;
    int field_h;
    static int[] field_m;
    int field_n;
    int field_j;
    int field_k;

    public static void a(int param0) {
        field_q = null;
        field_g = null;
        field_m = null;
        field_r = null;
        if (param0 != 20974) {
          field_r = (String) null;
        }
    }

    final static ef a(db param0, int param1, String param2, db param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        ef stackIn_3_0 = null;
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
          var5_int = param3.a(param4, -1);
          if (param1 != 0) {
            var7 = (String) null;
            hp.a((db) null, 9, (String) null, (db) null, (String) null);
          }
          var6 = param3.a(-2862, param2, var5_int);
          stackIn_3_0 = pl.a(var5_int, var6, param1 ^ -11, param3, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("hp.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String d(int param0) {
        if (l.field_b == lc.field_c) {
          return fh.field_i;
        }
        if (param0 != 5) {
          field_m = (int[]) null;
          return ig.field_p;
        }
        return ig.field_p;
    }

    hp(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_l = param2;
          this.field_p = param6;
          fieldTemp$0 = fq.field_D;
          fq.field_D = fq.field_D + 1;
          this.field_n = fieldTemp$0 & 65535;
          this.field_f = param3;
          this.field_o = param4;
          this.field_h = param5;
          this.field_j = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "hp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[8192];
        field_r = "Open in popup window";
        field_m = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 8, 8, 8, 3, 2, 5, 5, 0, 99, 99, 99, 99, 0, 0, -1};
    }
}
