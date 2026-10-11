/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_f;
    private cn field_c;
    static int[] field_b;
    static String field_d;
    private cn field_e;
    static String[] field_a;

    final cn d(int param0) {
        if (param0 > -96) {
          wb.a(79);
        }
        cn var2 = this.field_e;
        if (var2 == this.field_c) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_x;
        return var2;
    }

    final void a(byte param0) {
        cn var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_c.field_x;
          if (this.field_c != var2) {
            var2.f((byte) -62);
            continue;
          }
          break;
        }
        this.field_e = null;
        if (param0 != 112) {
          this.a((byte) 101);
        }
        return;
    }

    final int c(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        cn var3 = this.field_c.field_x;
        while (this.field_c != var3) {
          var3 = var3.field_x;
          var2++;
        }
        if (param0 != -7432) {
          this.c(107);
        }
        return var2;
    }

    final static int[][] a(ln[] param0, int param1) {
        int[][] stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var7_ref_ln = null;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.length;
          var11 = new int[var2_int][var2_int];
          var10 = var11;
          var3 = var10;
          for (var4 = 0; var4 < var2_int; var4++) {
            for (var5 = 0; var5 < var2_int; var5++) {
              var11[var4][var5] = -1;
            }
            var11[var4][var4] = 0;
            var5_ref_ln__ = param0[var4].field_D;
            for (var6 = 0; var5_ref_ln__.length > var6; var6++) {
              var7_ref_ln = var5_ref_ln__[var6];
              if (var7_ref_ln.field_R == param0[var4].field_R) {
                var11[var4][var7_ref_ln.field_p] = 1;
              }
            }
          }
          for (var4Lifetime1 = param1; var2_int > var4Lifetime1; var4Lifetime1++) {
            for (var5Lifetime1 = 0; var5Lifetime1 < var2_int; var5Lifetime1++) {
              var9 = 0;
              var6Lifetime1 = var9;
              while (var9 < var2_int) {
                if (-1 != var11[var5Lifetime1][var4Lifetime1] &&
                  -1 != var11[var4Lifetime1][var9]) {
                  var7 = var11[var4Lifetime1][var9] + var11[var5Lifetime1][var4Lifetime1];
                  if (var11[var5Lifetime1][var9] == -1 ||
                    var7 < var11[var5Lifetime1][var9]) {
                    var11[var5Lifetime1][var9] = var7;
                  }
                }
                var9++;
              }
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("wb.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, cn param1) {
        if (param0 != 9) {
          return;
        }
        try {
          if (null != param1.field_u) {
            param1.f((byte) -62);
          }
          param1.field_x = this.field_c;
          param1.field_u = this.field_c.field_u;
          param1.field_u.field_x = param1;
          param1.field_x.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "wb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -72) {
          field_a = (String[]) null;
        }
    }

    public wb() {
        this.field_c = new cn();
        this.field_c.field_u = this.field_c;
        this.field_c.field_x = this.field_c;
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 79) {
          wb.a(25);
        }
        stackIn_6_0 = (gm.field_i >= 10) && (ma.field_p >= 13);
        return stackIn_6_0;
    }

    final cn e(int param0) {
        cn var2 = this.field_c.field_x;
        if (this.field_c == var2) {
          this.field_e = null;
          return null;
        }
        if (param0 != -31364) {
          field_d = (String) null;
        }
        this.field_e = var2.field_x;
        return var2;
    }

    static {
        field_f = "You cannot add yourself!";
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = new String[255];
    }
}
