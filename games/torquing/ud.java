/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends q {
    boolean field_p;
    static int[] field_k;
    lm field_m;
    static String field_l;
    private ti field_n;
    static String field_j;
    long[] field_o;

    final static String b(int param0) {
        if (!jd.field_E &&
          lp.field_b >= um.field_l &&
          um.field_l + uf.field_g > lp.field_b) {
          return wb.field_t;
        }
        if (param0 == 0) {
          return null;
        }
        ud.b(-7);
        return null;
    }

    final ud a(boolean param0, ti param1) {
        ud var3 = null;
        RuntimeException var3_ref = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ud(param1, this.field_m);
          var3.field_p = this.field_p;
          if (!param0) {
            ud.a((byte) -23);
          }
          var3.field_o = this.field_o;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ud.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_k = null;
        int var1 = 99 % ((param0 + 48) / 61);
        field_j = null;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        long var5;
        long var7;
        int var9;
        int var10;
        var10 = Torquing.field_u;
        this.field_o = ee.b(-124);
        this.field_p = true;
        var2 = 57;
        this.field_m.a(this.field_n.field_b, this.field_n.field_h, this.field_n.field_a, -6 + var2);
        var3 = -48 % ((22 - param0) / 54);
        var4 = this.field_n.field_c;
        if (var4 == 2) {
          for (var4 = 0; var4 < 64; var4++) {
            var5 = this.field_m.a(var2 - var4, var4);
            if (var5 != 0L) {
              this.field_p = false;
              this.field_o[var4] = var5;
            }
          }
        } else if (var4 == 3) {
          for (var4 = 0; var4 < 64; var4++) {
            var5 = 1L << 63 - var4;
            var7 = this.field_m.a(var2 - var4, var4);
            if (var7 != 0L) {
              this.field_p = false;
              for (var9 = 0; 64 > var9; var9++) {
                if ((var7 & 1L << var9) != 0L) {
                  this.field_o[var9] = this.field_o[var9] + var5;
                }
              }
            }
          }
        } else if (var4 == 1) {
          for (var4 = 0; var4 < 64; var4++) {
            var5 = this.field_m.a(var4 - 6, 63 - var4);
            if (0L != var5) {
              this.field_p = false;
              this.field_o[var4] = ag.a(var5, -109);
            }
          }
        } else {
          if (var4 == 0) {
            for (var4 = 0; 64 > var4; var4++) {
              var5 = 1L << 63 - var4;
              var7 = this.field_m.a(var4 - 6, 63 - var4);
              if (var7 != 0L) {
                this.field_p = false;
                for (var9 = 63; 0 <= var9; var9--) {
                  if ((1L & var7) != 0L) {
                    this.field_o[var9] = this.field_o[var9] + var5;
                  }
                  var7 = var7 >>> 1;
                }
              }
            }
          }
        }
    }

    ud(ti param0, lm param1) {
        try {
          this.field_m = param1;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ud(long[] param0) {
        try {
          this.field_m = null;
          this.field_n = null;
          this.field_p = false;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new int[8192];
        field_j = "Type your password again to make sure it's correct";
        field_l = "Try again";
    }
}
