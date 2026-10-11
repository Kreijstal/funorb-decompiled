/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static int field_f;
    static bi field_a;
    static boolean field_b;
    private df field_e;
    static String field_d;
    private df field_c;

    final int c(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        df var3 = this.field_e.field_h;
        int var4 = -48 / ((param0 + 34) / 39);
        while (var3 != this.field_e) {
          var2++;
          var3 = var3.field_h;
        }
        return var2;
    }

    public static void d(int param0) {
        if (param0 != 31992) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, int param1) {
        if (param0 <= 26) {
          field_d = (String) null;
        }
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param1 & ~var2;
    }

    final df b(int param0) {
        df var2 = this.field_c;
        if (param0 != 32) {
          return (df) null;
        }
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final void b(byte param0) {
        df var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_e.field_h;
          if (var2 == this.field_e) {
            break;
          }
          var2.a(16);
        }
        this.field_c = null;
        if (param0 < 23) {
          field_f = -54;
        }
    }

    final df a(int param0) {
        df var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          return null;
        }
        var2.a(16);
        int var3 = 32 / ((49 - param0) / 38);
        return var2;
    }

    final boolean a(byte param0) {
        if (param0 != 25) {
          return true;
        }
        return this.field_e.field_h == this.field_e ? true : false;
    }

    final void a(df param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param0.field_j) {
            param0.a(16);
          }
          param0.field_h = this.field_e;
          param0.field_j = this.field_e.field_j;
          param0.field_j.field_h = param0;
          param0.field_h.field_j = param0;
          if (param1 != 32) {
            this.field_e = (df) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("db.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final df c(int param0) {
        df var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        if (param0 >= -126) {
          String[] var3 = (String[]) null;
          db.a(95, (nq) null, (String) null, (String[]) null, 64);
        }
        return var2;
    }

    final static int a(int param0, nq param1, String param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
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
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = param1.c(param2);
          if (param4 != 3) {
            field_d = (String) null;
          }
          if (var5_int <= param0 &&
            -1 == param2.indexOf("<br>")) {
            param3[0] = param2;
            stackIn_7_0 = 1;
            return stackIn_7_0;
          }
          var6 = (-1 + param0 + var5_int) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param2.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param2.charAt(var9);
            if (32 == var10 ||
              45 == var10) {
              var11 = param2.substring(var7, 1 + var9).trim();
              var12 = param1.c(var11);
              if (var12 >= param0) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param2.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param2.substring(var7, var9 - 3).trim();
              var7 = 1 + var9;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param2.substring(var7, var8).trim();
          }
          stackIn_30_0 = var6Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("db.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    public db() {
        this.field_e = new df();
        this.field_e.field_h = this.field_e;
        this.field_e.field_j = this.field_e;
    }

    static {
        field_d = "C: Hide Chat";
    }
}
