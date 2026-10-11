/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends g {
    static String field_Lb;
    private g field_Jb;
    private g field_Fb;
    private g field_Gb;
    private g field_Ib;
    private int field_Db;
    static byte[][][] field_Kb;
    private g field_Mb;
    static String field_Hb;
    private g field_Eb;

    public static void g(int param0) {
        field_Hb = null;
        if (param0 != 20) {
          field_Lb = (String) null;
          field_Lb = null;
          field_Kb = (byte[][][]) null;
          return;
        }
        field_Lb = null;
        field_Kb = (byte[][][]) null;
    }

    final boolean f(int param0) {
        if (param0 == -1) {
          return this.field_Ib.field_N != 0 ? true : false;
        }
        this.field_Fb = (g) null;
        return this.field_Ib.field_N != 0 ? true : false;
    }

    final boolean e(byte param0) {
        if (param0 > -84) {
          this.f((byte) 105);
          if (this.field_Gb.field_pb != 0) {
            this.field_Db = 20;
            return true;
          }
          if (this.field_Gb.field_N == 0) {
            return false;
          }
          if (this.field_Db > 0) {
            this.field_Db = this.field_Db - 1;
          }
          if (this.field_Db == 0) {
            this.field_Db = 3;
            return true;
          }
          return false;
        }
        if (this.field_Gb.field_pb != 0) {
          this.field_Db = 20;
          return true;
        }
        if (this.field_Gb.field_N == 0) {
          return false;
        }
        if (this.field_Db > 0) {
          this.field_Db = this.field_Db - 1;
        }
        if (this.field_Db != 0) {
          return false;
        }
        this.field_Db = 3;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param4 == -689) {
          this.field_lb = param6;
          this.field_x = param2;
          this.field_ib = param0;
          this.field_R = param5;
          this.a((byte) -94, param7, param1, param3);
          return;
        }
        field_Hb = (String) null;
        this.field_lb = param6;
        this.field_x = param2;
        this.field_ib = param0;
        this.field_R = param5;
        this.a((byte) -94, param7, param1, param3);
    }

    final boolean f(byte param0) {
        if (0 != this.field_Mb.field_pb) {
          this.field_Db = 20;
          return true;
        }
        if (this.field_Mb.field_N != 0) {
          if (this.field_Db > 0) {
            this.field_Db = this.field_Db - 1;
          }
          if (this.field_Db == 0 &&
            this.field_Ib.field_W + (this.field_Ib.field_lb + this.field_Ib.field_gb + this.field_Ib.field_Bb) <= jb.field_b) {
            this.field_Db = 3;
            return true;
          }
        }
        if (param0 < -119) {
          return false;
        }
        this.a((byte) 23, 81, 34, -99);
        return false;
    }

    ol(long param0, g param1, ci param2, ci param3, g param4, g param5) {
        this(param0, param1, param1, param4, param5);
        try {
          this.field_Gb.field_ob = param2;
          this.field_Jb.field_ob = param3;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ol.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, byte param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = -this.field_Ib.field_lb + this.field_Fb.field_lb;
        if (var6 > 0) {
          var7 = this.field_Ib.field_ib;
          var8 = -param0 + param1;
          var5 = (var6 / 2 + var7 * var8) / var6;
        }
        if (param3) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > -param0 + param1) {
            var5 = param1 - param0;
          }
        } else {
          if (-param0 + param1 < var5) {
            var5 = param1 - param0;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        }
        if (param2 == -123) {
          return var5;
        }
        this.a((byte) -11, -26, -77, -82);
        return var5;
    }

    private ol(long param0, g param1, g param2, g param3, g param4) {
        super(param0, (g) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        g var9 = null;
        g var10 = null;
        try {
          this.field_Gb = new g(0L, param1);
          this.field_Jb = new g(0L, param2);
          this.a(this.field_Gb, -14951);
          this.a(this.field_Jb, -14951);
          this.field_Fb = new g(0L, (g) null);
          this.a(this.field_Fb, -14951);
          this.field_Eb = new g(0L, param3);
          this.field_Mb = new g(0L, param3);
          var9 = this.field_Eb;
          var10 = var9;
          this.field_Mb.field_z = true;
          var10.field_z = true;
          this.field_Fb.a(this.field_Eb, -14951);
          this.field_Fb.a(this.field_Mb, -14951);
          this.field_Ib = new g(0L, param4);
          this.field_Ib.field_kb = true;
          this.field_Fb.a(this.field_Ib, -14951);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ol.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (~this.field_Eb.field_pb != param0) {
          this.field_Db = 20;
          return true;
        }
        if (this.field_Eb.field_N == 0) {
          return false;
        }
        if (this.field_Db > 0) {
          this.field_Db = this.field_Db - 1;
        }
        if (this.field_Db != 0) {
          return false;
        }
        if (this.field_Ib.field_Bb + this.field_Ib.field_gb > jb.field_b) {
          this.field_Db = 3;
          return true;
        }
        return false;
    }

    final boolean d(byte param0) {
        if (this.field_Jb.field_pb != 0) {
          this.field_Db = 20;
          return true;
        }
        int var2 = 71 / ((-30 - param0) / 43);
        if (this.field_Jb.field_N == 0) {
          return false;
        }
        if (0 < this.field_Db) {
          this.field_Db = this.field_Db - 1;
        }
        if (this.field_Db != 0) {
          return false;
        }
        this.field_Db = 3;
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        g var15 = null;
        g var16 = null;
        g var17 = null;
        g var18 = null;
        g var19 = null;
        g var20 = null;
        int var14 = 0;
        g var15Lifetime1;
        g var15Lifetime2;
        g var16Lifetime1;
        g var16Lifetime2;
        g var17Lifetime1;
        g var17Lifetime2;
        g var18Lifetime1;
        g var18Lifetime2;
        g var19Lifetime1;
        g var19Lifetime2;
        g var20Lifetime1;
        g var20Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        if (this.field_lb < this.field_x * 2) {
          var6 = this.field_lb / 2;
          var5 = this.field_lb / 2;
        } else {
          var5 = this.field_x;
          var6 = this.field_lb - this.field_x;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (param3 <= 0) {
          var9 = param3 - param1;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param2 * var10) / var9;
          }
          var12 = var8 / 2 + var11;
          var15 = this.field_Gb;
          var15.field_x = this.field_x;
          var15.field_R = 0;
          var15.field_lb = var5;
          var15.field_ib = 0;
          var16 = this.field_Jb;
          var16.field_x = this.field_x;
          var16.field_lb = -var6 + this.field_lb;
          var16.field_R = 0;
          var16.field_ib = var6;
          var17 = this.field_Fb;
          var17.field_x = this.field_x;
          var17.field_lb = var7;
          var17.field_ib = var5;
          var17.field_R = 0;
          var18 = this.field_Eb;
          var18.field_R = 0;
          var18.field_lb = var12;
          var18.field_x = this.field_x;
          var18.field_ib = 0;
          var19 = this.field_Mb;
          var19.field_x = this.field_x;
          var19.field_lb = var7 - var12;
          var19.field_R = 0;
          var19.field_ib = var12;
          var20 = this.field_Ib;
          this.field_Fb.field_zb = param1 < param3 ? true : false;
          this.field_Jb.field_zb = param1 < param3 ? true : false;
          this.field_Gb.field_zb = param1 < param3 ? true : false;
          var20.field_lb = var8;
          var20.field_ib = var11;
          var20.field_x = this.field_x;
          var14 = 21 / ((param0 + 5) / 50);
          var20.field_R = 0;
          return;
        }
        var8 = var8 * param1 / param3;
        if (!(this.field_x <= var8)) {
          var8 = this.field_x;
        }
        if (var7 < var8) {
          var8 = var7;
          var9Lifetime1 = param3 - param1;
          var10Lifetime1 = -var8 + var7;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (var9Lifetime1 / 2 + param2 * var10Lifetime1) / var9Lifetime1;
          }
          var12Lifetime1 = var8 / 2 + var11Lifetime1;
          var15Lifetime1 = this.field_Gb;
          var15Lifetime1.field_x = this.field_x;
          var15Lifetime1.field_R = 0;
          var15Lifetime1.field_lb = var5;
          var15Lifetime1.field_ib = 0;
          var16Lifetime1 = this.field_Jb;
          var16Lifetime1.field_x = this.field_x;
          var16Lifetime1.field_lb = -var6 + this.field_lb;
          var16Lifetime1.field_R = 0;
          var16Lifetime1.field_ib = var6;
          var17Lifetime1 = this.field_Fb;
          var17Lifetime1.field_x = this.field_x;
          var17Lifetime1.field_lb = var7;
          var17Lifetime1.field_ib = var5;
          var17Lifetime1.field_R = 0;
          var18Lifetime1 = this.field_Eb;
          var18Lifetime1.field_R = 0;
          var18Lifetime1.field_lb = var12Lifetime1;
          var18Lifetime1.field_x = this.field_x;
          var18Lifetime1.field_ib = 0;
          var19Lifetime1 = this.field_Mb;
          var19Lifetime1.field_x = this.field_x;
          var19Lifetime1.field_lb = var7 - var12Lifetime1;
          var19Lifetime1.field_R = 0;
          var19Lifetime1.field_ib = var12Lifetime1;
          var20Lifetime1 = this.field_Ib;
          this.field_Fb.field_zb = param1 < param3 ? true : false;
          this.field_Jb.field_zb = param1 < param3 ? true : false;
          this.field_Gb.field_zb = param1 < param3 ? true : false;
          var20Lifetime1.field_lb = var8;
          var20Lifetime1.field_ib = var11Lifetime1;
          var20Lifetime1.field_x = this.field_x;
          var14Lifetime1 = 21 / ((param0 + 5) / 50);
          var20Lifetime1.field_R = 0;
          return;
        }
        var9Lifetime2 = param3 - param1;
        var10Lifetime2 = -var8 + var7;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (var9Lifetime2 / 2 + param2 * var10Lifetime2) / var9Lifetime2;
        }
        var12Lifetime2 = var8 / 2 + var11Lifetime2;
        var15Lifetime2 = this.field_Gb;
        var15Lifetime2.field_x = this.field_x;
        var15Lifetime2.field_R = 0;
        var15Lifetime2.field_lb = var5;
        var15Lifetime2.field_ib = 0;
        var16Lifetime2 = this.field_Jb;
        var16Lifetime2.field_x = this.field_x;
        var16Lifetime2.field_lb = -var6 + this.field_lb;
        var16Lifetime2.field_R = 0;
        var16Lifetime2.field_ib = var6;
        var17Lifetime2 = this.field_Fb;
        var17Lifetime2.field_x = this.field_x;
        var17Lifetime2.field_lb = var7;
        var17Lifetime2.field_ib = var5;
        var17Lifetime2.field_R = 0;
        var18Lifetime2 = this.field_Eb;
        var18Lifetime2.field_R = 0;
        var18Lifetime2.field_lb = var12Lifetime2;
        var18Lifetime2.field_x = this.field_x;
        var18Lifetime2.field_ib = 0;
        var19Lifetime2 = this.field_Mb;
        var19Lifetime2.field_x = this.field_x;
        var19Lifetime2.field_lb = var7 - var12Lifetime2;
        var19Lifetime2.field_R = 0;
        var19Lifetime2.field_ib = var12Lifetime2;
        var20Lifetime2 = this.field_Ib;
        this.field_Fb.field_zb = param1 < param3 ? true : false;
        this.field_Jb.field_zb = param1 < param3 ? true : false;
        this.field_Gb.field_zb = param1 < param3 ? true : false;
        var20Lifetime2.field_lb = var8;
        var20Lifetime2.field_ib = var11Lifetime2;
        var20Lifetime2.field_x = this.field_x;
        var14Lifetime2 = 21 / ((param0 + 5) / 50);
        var20Lifetime2.field_R = 0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 43 % ((-30 - param0) / 61);
        return this.a(param2, param1, (byte) -123, false);
    }

    static {
        field_Lb = "You have 1 unread message!";
    }
}
