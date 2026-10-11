/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends da {
    static String field_n;
    long field_l;
    w field_i;
    static String field_j;
    static int field_m;
    static boolean field_o;
    w field_k;

    final static int a(int param0, CharSequence param1, char param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.length();
          var5 = 74 % ((param0 - 75) / 36);
          for (var6 = 0; var4 > var6; var6++) {
            if (param1.charAt(var6) == param2) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("w.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 68) {
          w.c(46);
        }
        field_n = null;
        field_j = null;
    }

    final static ge a(byte param0, int param1, int param2, lj param3) {
        RuntimeException var4 = null;
        ge stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!lk.a(160, param3, param1, param2)) {
            return null;
          }
          if (param0 != 61) {
            field_n = (String) null;
          }
          stackIn_6_0 = sh.d(-128);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("w.CC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (this.field_i == null) {
          return;
        }
        this.field_i.field_k = this.field_k;
        this.field_k.field_i = this.field_i;
        this.field_i = null;
        this.field_k = null;
        if (param0 != 12695) {
          w.b((byte) -41);
        }
    }

    protected w() {
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        ka var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        ka var7Lifetime1;
        ka var7Lifetime2;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          qg.b(243, 197, 369, 143, 16777215);
          qg.f(244, 198, 367, 141, 0);
          if (null == gi.field_f) {
            if (ek.field_G != null) {
              ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = gi.field_f[oi.field_j];
          var7 = var6;
          var7Lifetime1 = var6;
          var1 = var6;
          if (var6 != null) {
            var6.g(245, 199);
          } else {
            if (ek.field_G != null) {
              ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (eh.field_k > ll.field_d) {
            var7Lifetime2 = gi.field_f[p.field_b];
            if (var7Lifetime2 != null) {
              var2 = (60 + var7Lifetime2.field_q) * ll.field_d / eh.field_k;
              var3 = var2 - 30;
              if (!bh.field_r) {
                c.a(-256 * var3 / 30, 199, 245, 256 * (var7Lifetime2.field_q - var3) / 30, var7Lifetime2, 107);
              } else {
                c.a((var7Lifetime2.field_q - var3) * 256 / 30, 199, 245, var3 * -256 / 30, var7Lifetime2, 121);
              }
            }
          }
          if (null != ek.field_G) {
            var2_ref = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < gi.field_f.length) {
              var8 = gi.field_f[var5];
              if (var8 != null && (365 != var8.field_q ||
                var8.field_v != 139)) {
                if (var2_ref != null) {
                  var2_ref = (String) (var2_ref) + ", " + var5;
                } else {
                  var2_ref = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2_ref != null) {
              ek.field_G.a("Screenshot(s) " + (String) (var2_ref) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            }
          }
          var2Lifetime1 = 106 / ((param0 - 2) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "w.BC(" + param0 + ')');
        }
    }

    static {
        field_n = "(Including <%0>)";
        field_o = false;
        field_j = "Time: ";
    }
}
