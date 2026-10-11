/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wm {
    private rk field_s;
    private rk field_u;
    static String field_t;
    static int field_w;
    static volatile int field_r;
    static int field_p;
    static boolean[] field_v;
    static String field_q;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_s.field_E.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (client.a(param1 + 111, var5)) {
            stackIn_5_0 = pe.field_c;
            return stackIn_5_0;
          }
          if (qf.a(var5, 0)) {
            stackIn_9_0 = uk.field_y;
            return stackIn_9_0;
          }
          if (mc.a(var5, (byte) -121)) {
            stackIn_12_0 = lf.field_b;
            return stackIn_12_0;
          }
          if (this.c(param0, (byte) 14)) {
            stackIn_15_0 = bg.field_f;
            return stackIn_15_0;
          }
          if (param1 != -11) {
            var6 = (String) null;
            this.a((String) null, (byte) -103);
          }
          if (var7.length() <= 0) {
            stackIn_31_0 = e.field_c;
            return stackIn_31_0;
          }
          if (nn.a(false, var7, var5)) {
            stackIn_21_0 = rb.field_g;
            return stackIn_21_0;
          }
          if (ij.a(var5, var7, (byte) -126)) {
            stackIn_24_0 = ng.field_j;
            return stackIn_24_0;
          }
          if (!he.a(var7, (byte) -11, var5)) {
            stackIn_29_0 = pe.field_c;
            return stackIn_29_0;
          }
          stackIn_27_0 = rb.field_g;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("te.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    te(rk param0, rk param1, rk param2) {
        super(param0);
        try {
          this.field_u = param2;
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
          mm var2 = (mm) null;
          te.a((String) null, 15, -79, (String[]) null, (mm) null);
        }
        field_v = null;
        field_t = null;
    }

    private final boolean c(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 14) {
            te.e(-108);
          }
          var3 = this.field_u.field_E.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 < var3.length() &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("te.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(String param0, int param1, int param2, String[] param3, mm param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = client.field_A ? 1 : 0;
        try {
          var5_int = param4.a(param0);
          if (var5_int <= param2 &&
            param0.indexOf("<br>") == -1) {
            param3[0] = param0;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (param2 + var5_int - 1) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param0.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param0.charAt(var9);
            if (32 == var10 ||
              45 == var10) {
              var11 = param0.substring(var7, var9 + 1).trim();
              var12 = param4.a(var11);
              if (param2 <= var12) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param0.substring(var7, var8).trim();
          }
          if (param1 <= 65) {
            field_t = (String) null;
          }
          stackIn_28_0 = var6Lifetime1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("te.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final tb b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        tb stackIn_2_0 = null;
        tb stackIn_5_0 = null;
        tb stackIn_10_0 = null;
        tb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_s.field_E.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = vm.field_u;
            return stackIn_2_0;
          }
          if (!gf.a(-118, var3, var4)) {
            stackIn_5_0 = vm.field_u;
            return stackIn_5_0;
          }
          if (param1 != -40) {
            field_w = -71;
          }
          if (!this.c(param0, (byte) 14)) {
            stackIn_12_0 = dc.field_b;
            return stackIn_12_0;
          }
          stackIn_10_0 = vm.field_u;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("te.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_t = null;
        field_r = -1;
        field_v = new boolean[64];
    }
}
