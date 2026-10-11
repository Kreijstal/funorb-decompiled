/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hb extends nb {
    static int[] field_h;
    static int field_j;
    static ci field_m;
    static String field_o;
    static int field_l;
    private String field_q;
    private long field_k;
    static ci[] field_p;
    static int field_i;
    static int field_n;

    final static int a(gf param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 124) {
            field_o = (String) null;
          }
          stackIn_3_0 = param0.a(param2, (byte) -50);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(pk param0, int param1, int param2, String param3, em param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Terraphoenix.field_V;
        try {
          if (param2 <= 36) {
            return;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param3.length(); var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = param4.field_d[0] + (var5_int >> 8) + param0.b(param3.substring(0, var7));
            }
            if (var6 != -1) {
              param4.field_d[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param4.field_d[var7] = (var5_int >> 8) + param4.field_d[0] + param0.b(param3.substring(0, var7 + 1)) - param0.a((char) var8);
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("hb.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    cm c(int param0) {
        if (param0 != 0) {
          gf var3 = (gf) null;
          hb.a((gf) null, 1, true);
        }
        return hf.field_s;
    }

    final void a(byte param0, dh param1) {
        try {
          param1.a(this.field_k, 76);
          param1.a(-97, this.field_q);
          if (param0 != -2) {
            dh var4 = (dh) null;
            this.a((byte) -36, (dh) null);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 >= -120) {
          field_n = 114;
        }
        field_h = null;
        field_m = null;
        field_p = null;
        field_o = null;
    }

    hb(long param0, String param1) {
        try {
          this.field_q = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[]{2, 3, -1, 2, -1, -1, -1, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 71, 71, -1, 72, 73, 74, 75, 76, 77, 78, 79};
        field_l = 9;
    }
}
