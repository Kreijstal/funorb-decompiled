/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends tj {
    private rl field_n;
    static db field_m;
    private rl field_o;
    static String field_l;

    va(rl param0, rl param1, rl param2) {
        super(param0);
        try {
          this.field_n = param2;
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(char param0, boolean param1) {
        if (!param1) {
          return 107;
        }
        return param0 <= 0 ? -1 : param0;
    }

    public static void d(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 >= -80) {
          field_l = (String) null;
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_o.field_u.toLowerCase();
          if (param0 != -126) {
            var6 = (String) null;
            this.a((byte) -44, (String) null);
          }
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          var5 = var4;
          if (ph.a((byte) 107, var5)) {
            stackIn_8_0 = pe.field_a;
            return stackIn_8_0;
          }
          if (sh.d(var5, (byte) 50)) {
            stackIn_12_0 = rg.field_d;
            return stackIn_12_0;
          }
          if (hd.a(var5, 17)) {
            stackIn_16_0 = td.field_b;
            return stackIn_16_0;
          }
          if (this.a(param1, true)) {
            stackIn_19_0 = rb.field_e;
            return stackIn_19_0;
          }
          if (var7.length() <= 0) {
            stackIn_22_0 = qb.field_a;
            return stackIn_22_0;
          }
          if (bi.a((byte) -124, var7, var5)) {
            stackIn_25_0 = uf.field_l;
            return stackIn_25_0;
          }
          if (pd.a(var7, var5, 95)) {
            stackIn_29_0 = vf.field_s;
            return stackIn_29_0;
          }
          if (!ni.a((byte) 120, var5, var7)) {
            stackIn_34_0 = pe.field_a;
            return stackIn_34_0;
          }
          stackIn_32_0 = uf.field_l;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("va.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final boolean a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = this.field_n.field_u.toLowerCase();
          if (!param1) {
            var8 = (String) null;
            this.a((byte) 48, (String) null);
          }
          var4 = param0.toLowerCase();
          if (var9.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var9.lastIndexOf("@");
            if (var5 >= 0 &&
              -1 + var9.length() > var5) {
              var6 = var9.substring(0, var5);
              var7 = var9.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_15_0 = (var4.indexOf(var7) >= 0);
              return stackIn_15_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("va.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final sc a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sc stackIn_3_0 = null;
        sc stackIn_7_0 = null;
        sc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_o.field_u.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 == var4.length()) {
            stackIn_3_0 = ni.field_b;
            return stackIn_3_0;
          }
          if (!ui.a(var3, var4, (byte) -118)) {
            stackIn_7_0 = ni.field_b;
            return stackIn_7_0;
          }
          if (!this.a(param1, true)) {
            return rh.field_p;
          }
          stackIn_11_0 = ni.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("va.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_l = "OK";
    }
}
