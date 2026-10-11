/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lj {
    private wa field_A;
    static String field_D;
    static boolean[] field_B;
    private int field_C;

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = param0; param1.length() > var3; var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ve.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String f(int param0) {
        if (param0 != 4) {
          qg var3 = (qg) null;
          this.a((qg) null, 58);
          if (this.field_g) {
            return this.field_A.c(param0 + 30519);
          }
          return null;
        }
        if (this.field_g) {
          return this.field_A.c(param0 + 30519);
        }
        return null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ti var16 = null;
        ti var17 = null;
        ti var14 = null;
        ti var13 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = Transmogrify.field_A ? 1 : 0;
        int var10Lifetime1;
        int var11Lifetime1;
        super.a(param0, param1, param2, (byte) 111);
        if (param2 != 0) {
          return;
        }
        int var5 = this.field_p + (param0 + (this.field_l >> 1));
        int var6 = param1 - (-this.field_n - (this.field_h >> 1));
        int var9 = -100 % ((param3 - 77) / 34);
        rc var8 = this.field_A.a(27835);
        if (var8 == ek.field_a) {
          var16 = ai.field_b[0];
          var10 = var16.field_r << 1;
          var11 = var16.field_s << 1;
          if (null == vh.field_l) {
            vh.field_l = new ti(var10, var11);
            oj.a(vh.field_l, 256);
            var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          if (var10 > vh.field_l.field_n) {
            vh.field_l = new ti(var10, var11);
            oj.a(vh.field_l, 256);
            var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          if (vh.field_l.field_m < var11) {
            vh.field_l = new ti(var10, var11);
            oj.a(vh.field_l, 256);
            var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
            return;
          }
          oj.a(vh.field_l, 256);
          sb.c();
          var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -this.field_C << 10, 4096);
          fi.c(true);
          vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
          return;
        }
        if (var8 == fi.field_u) {
          var17 = ai.field_b[0];
          var10Lifetime1 = var17.field_r << 1;
          var11Lifetime1 = var17.field_s << 1;
          if (null == vh.field_l) {
            vh.field_l = new ti(var10Lifetime1, var11Lifetime1);
            oj.a(vh.field_l, 256);
            var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          if (var10Lifetime1 > vh.field_l.field_n) {
            vh.field_l = new ti(var10Lifetime1, var11Lifetime1);
            oj.a(vh.field_l, 256);
            var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          if (vh.field_l.field_m < var11Lifetime1) {
            vh.field_l = new ti(var10Lifetime1, var11Lifetime1);
            oj.a(vh.field_l, 256);
            var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
            fi.c(true);
            vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
            return;
          }
          oj.a(vh.field_l, 256);
          sb.c();
          var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -this.field_C << 10, 4096);
          fi.c(true);
          vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
          return;
        }
        if (var8 == ec.field_d) {
          var14 = ai.field_b[2];
          var14.c(var5 - (var14.field_n >> 1), var6 - (var14.field_m >> 1), 256);
          return;
        }
        if (hi.field_b == var8) {
          var13 = ai.field_b[1];
          var13.c(var5 - (var13.field_n >> 1), var6 - (var13.field_m >> 1), 256);
          return;
        }
    }

    public static void a(byte param0) {
        field_B = null;
        field_D = null;
        if (param0 > -58) {
          ve.a((byte) 42);
        }
    }

    final static uj a(String[] args, byte param1) {
        uj var2 = null;
        RuntimeException var2_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -98) {
            field_D = (String) null;
          }
          var2 = new uj(false);
          var2.field_j = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ve.C(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        String[] var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -11) {
            return false;
          }
          var4 = (String[]) null;
          ve.a((String[]) null, (byte) -44);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ve.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ve(wa param0) {
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
          this.field_C = this.field_C + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_B = new boolean[112];
        field_D = "Total";
    }
}
