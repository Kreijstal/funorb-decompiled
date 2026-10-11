/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ma {
    int field_s;
    static String field_u;
    qa field_l;
    static lr field_t;
    int field_p;
    static String field_m;
    int field_q;
    static vh field_v;
    int field_n;
    int field_w;
    static int field_r;
    static String field_o;

    final static void a(int[][] param0, bf[] param1, pq[] param2, int param3) {
        int dupTemp$1 = 0;
        pq[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pq[] var6 = null;
        pq[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        pq[] var4Lifetime1;
        int var5Lifetime1;
        try {
          hb.field_s = -1;
          td.field_b = 0;
          or.field_l = 0;
          var6 = param2;
          var4 = var6;
          for (var5 = 0; var6.length > var5; var5++) {
            var6[var5].field_w = 0;
          }
          var4_int = 0;
          do {
            dupTemp$1 = oe.a(param1, var4_int, param2, param0, param3 + 0);
            var4_int = dupTemp$1;
          } while (dupTemp$1 != -1);
          var7 = param2;
          var4Lifetime1 = var7;
          var8 = param3;
          var5Lifetime1 = var8;
          while (var8 < var7.length) {
            if (var7[var8].field_s) {
              var7[var8].a(false);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("qa.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_t = null;
        field_m = null;
        field_u = null;
        field_v = null;
        if (param0 < 4) {
          field_u = (String) null;
        }
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
          qo.field_x = param1;
          qg.field_a = param3;
          wf.a(param0, gg.field_a, -126);
          int var4_int = -110 % ((param2 + 30) / 57);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (param0 != 1) {
            return false;
          }
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!vq.a((char) var3, 22987) &&
              !kh.a((char) var3, (byte) 120)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("qa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        oa.a(param1, (byte) 80);
        if (param0 != 55) {
          String var3 = (String) null;
          qa.a((String) null, 95);
        }
        hm.a(param1, param0 - 19268);
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
          }
          stackIn_4_0 = new String(var3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qa.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, lr param2, String param3, int param4, int param5) {
        int var11 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Pool.field_O;
        try {
          var6_int = param2.b(param3);
          var7 = param2.field_w + param2.field_C;
          var8 = 1;
          if (var6_int > param1) {
            var9 = var6_int / param1;
            var10 = 2 * ((-1 + (var6_int % param1 + var9)) / var9) + param1;
            if (null == wg.field_Mb) {
              wg.field_Mb = new String[16];
            }
            var8Lifetime1 = param2.a(param3, new int[]{var10}, wg.field_Mb);
            var7 = var7 * var8Lifetime1;
            var6_int = 0;
            for (var11 = 0; var11 < var8Lifetime1; var11++) {
              var12 = param2.b(wg.field_Mb[var11]);
              if (var12 > var6_int) {
                var6_int = var12;
              }
            }
          }
          if (param0 != 71) {
            return;
          }
          var9Lifetime1 = pa.field_H;
          if (var9Lifetime1 + var6_int + 6 > qh.field_l) {
            var9Lifetime1 = -6 - var6_int + qh.field_l;
          }
          var10 = -param2.field_L + (pm.field_p + 32);
          if (qh.field_f < var7 + (var10 + 6)) {
            var10 = pm.field_p + (-var7 - 6);
          }
          qh.b(var9Lifetime1, var10, 6 + var6_int, 6 + var7, param4);
          qh.f(1 + var9Lifetime1, 1 + var10, var6_int + 4, 4 + var7, param5);
          param2.a(param3, 3 + var9Lifetime1, var10 + 3, var6_int, var7, param4, -1, 0, 0, param2.field_w + param2.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("qa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    qa(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param0;
        this.field_q = param4;
        this.field_p = param2;
        this.field_n = param1;
        this.field_w = param3;
    }

    static {
        field_u = "Reject";
        field_m = "Respect";
        field_o = "Players: <%0>/<%1>";
    }
}
