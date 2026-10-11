/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    private boolean field_c;
    private boolean field_d;
    static int field_b;
    static int field_a;
    static String field_f;
    private String field_e;

    final boolean b(int param0) {
        int var2 = 12 / ((-44 - param0) / 59);
        return this.field_c;
    }

    final static void a(int param0, boolean param1) {
        if (!qb.field_b ||
          fd.field_o[param0] ||
          ck.field_b >= 0) {
          return;
        }
        fd.field_o[param0] = param1;
        uj.field_h = 1;
        ck.field_b = param0;
        jk.field_u = 0;
    }

    final void b(int param0, boolean param1) {
        this.field_c = param1 ? true : false;
        if (param0 != 16564) {
          this.field_d = true;
        }
        this.field_d = true;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          le var3 = (le) null;
          h.a(-89, 11, 65, false, -65, -84, -84, (le) null);
        }
        return this.field_d;
    }

    final static kc a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        Object var7 = null;
        CharSequence var8 = null;
        kc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = 103 / ((param0 + 4) / 54);
          var7 = null;
          if (param3.indexOf('@') == -1) {
            var8 = (CharSequence) ((Object) param3);
            var4_long = sd.a(37, var8);
          } else {
            var7 = param3;
          }
          stackIn_4_0 = sk.a(param2, var4_long, param1, true, (String) (var7));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("h.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -106 / ((36 - param0) / 34);
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        param0 = ((-1431655765 & param0) >>> 1) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993459) >>> 2);
        param0 = 252645135 & param0 + (param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        if (param1 < 98) {
          field_a = 83;
        }
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, le param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        le var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 < ge.field_a) {
            param6 = param6 - (-param2 + ge.field_a);
            param2 = ge.field_a;
          }
          if (param2 + param6 > ge.field_j) {
            param6 = ge.field_j - param2;
          }
          if (ge.field_f > param5) {
            param4 = param4 - (-param5 + ge.field_f);
            param5 = ge.field_f;
          }
          if (ge.field_k < param4 + param5) {
            param4 = ge.field_k - param5;
          }
          if (param6 > 0 &&
            param4 > 0) {
            if (param3) {
              h.a(31, (byte) 107);
            }
            var21 = param7.d();
            var30 = ge.field_i;
            var10 = ge.field_h;
            var11 = ge.field_g;
            var29 = new int[4];
            ge.b(var29);
            param7.e();
            ge.c(var29[0], var29[1], var29[2], var29[3]);
            var13 = param5 * param7.field_k + param2;
            var14 = -param6 + param7.field_k;
            var25 = var21.field_s;
            var22 = var25;
            var15 = var22;
            for (var16 = param5; var16 < param5 + param4; var16++) {
              for (var17 = param2; param2 + param6 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (var17 > 0 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  0 == var15[-param7.field_k + var13] ||
                  param7.field_k - 1 > var17 &&
                  var15[var13 + 1] == 0 ||
                  !(param7.field_j - 1 <= var16) &&
                  var15[var13 + param7.field_k] == 0)) {
                  ge.f(var17, var16, param0, param1);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.c(-param7.field_r, -param7.field_q);
            ge.a(var30, var10, var11);
            ge.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("h.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final String a(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return this.field_e;
    }

    h(String param0) {
        this.field_c = false;
        this.field_d = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Waiting for extra data";
    }
}
