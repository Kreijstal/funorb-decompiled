/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static f field_a;
    static fa field_c;
    static sf field_f;
    static int field_g;
    static int[] field_d;
    static int field_i;
    static int field_b;
    static String field_e;
    static int field_h;

    final static void a(boolean param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          if (param0) {
            nb.a((byte) -101);
          }
          if (!qh.c((byte) 65)) {
            if (!vc.field_b) {
              if (fg.field_x == null) {
                fg.field_x = ed.a(16777215, 4);
              }
              if (fg.field_x.field_n) {
                fleas.field_L = fleas.field_L & ~fg.field_x.field_k;
                kh.field_b = kh.field_b | fg.field_x.field_k;
                vc.field_b = true;
                fg.field_x = null;
              }
            }
            if (mf.field_a != null) {
              var1_int = 0;
              for (var2 = 0; var2 < 2; var2++) {
                if (mf.field_a[var2] == null) {
                  mf.field_a[var2] = pi.a(var2, 1, 5, 124);
                }
                if (mf.field_a[var2] != null &&
                  mf.field_a[var2].field_p) {
                  if (mf.field_a[var2].field_m[0] > hj.field_a[var2]) {
                    hj.field_a[var2] = mf.field_a[var2].field_m[0];
                  }
                  var1_int++;
                }
              }
              if (var1_int != 2) {
                return;
              }
              mf.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "nb.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 33) {
          return;
        }
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    final static double a(double param0, int param1) {
        int var3 = 70 / ((-56 - param1) / 63);
        return tg.field_c[65535 & (int)(32768.0 * param0 / 3.141592653589793)];
    }

    final static int a(String param0, int param1, fa param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
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
        var13 = fleas.field_A ? 1 : 0;
        try {
          var5_int = param2.b(param0);
          if (var5_int <= param1 &&
            param0.indexOf("<br>") == -1) {
            param3[0] = param0;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (var5_int + (param1 - param4)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param0.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param0.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param0.substring(var7, 1 + var9).trim();
              var12 = param2.b(var11);
              if (param1 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
                var7 = var9 + 1;
              }
            }
            if (var10 == 62 &&
              param0.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param0.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("nb.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_d = new int[8192];
        field_b = 40;
        field_e = "Members only";
    }
}
