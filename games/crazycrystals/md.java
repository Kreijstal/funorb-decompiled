/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends ng {
    static int field_q;
    static sj field_u;
    private int field_l;
    static db field_p;
    static int[] field_k;
    static String[] field_t;
    private bm field_r;
    static long field_m;
    static String field_s;
    static String field_o;
    static String field_n;

    md(int param0) {
        super(param0);
    }

    final static boolean l(int param0) {
        if (param0 >= -59) {
          return false;
        }
        if (null == kf.field_h) {
          return false;
        }
        if (null == kf.field_h.j(0)) {
          return false;
        }
        return true;
    }

    final int d(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        int var3 = this.field_l >> 3;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 >= -47) {
          this.k(-102);
        } else {
          var4 = -(7 & this.field_l) + 8;
          this.field_l = this.field_l + param1;
          var5 = 0;
          while (param1 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_h[incrementValue$0] & kd.field_j[var4]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
          }
          if (param1 == var4) {
            var5 = var5 + (this.field_h[var3] & kd.field_j[var4]);
          } else {
            var5 = var5 + (this.field_h[var3] >> -param1 + var4 & kd.field_j[param1]);
          }
          return var5;
        }
        var4Lifetime1 = -(7 & this.field_l) + 8;
        this.field_l = this.field_l + param1;
        var5Lifetime1 = 0;
        while (param1 > var4Lifetime1) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((this.field_h[incrementValue$1] & kd.field_j[var4Lifetime1]) << param1 - var4Lifetime1);
          param1 = param1 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (param1 == var4Lifetime1) {
          var5Lifetime1 = var5Lifetime1 + (this.field_h[var3] & kd.field_j[var4Lifetime1]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.field_h[var3] >> -param1 + var4Lifetime1 & kd.field_j[param1]);
        }
        return var5Lifetime1;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_h[fieldTemp$0] = (byte)(this.field_r.a(false) + param1);
        if (param0 != 8) {
          field_q = -127;
        }
    }

    final void a(int[] param0, boolean param1) {
        try {
          this.field_r = new bm(param0);
          if (!param1) {
            this.d(42, 32);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "md.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static f[][] a(int param0, boolean param1, int param2, int param3, f[][] param4) {
        int var6 = 0;
        f[][] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        f[][] var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        f[][] var9 = null;
        int var7Lifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          var9 = new f[param0 * 2 + param4.length][2 * param2 + param4[0].length];
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            for (var7 = 0; var9[0].length > var7; var7++) {
              if (var7 >= param2 &&
                var7 < param4[0].length + param2 &&
                var6 >= param0 &&
                var6 < param4.length + param0) {
                var9[var6][var7] = (f) (param4[-param0 + var6][-param2 + var7].clone());
              } else {
                var9[var6][var7] = (f) (param4[0][0].clone());
              }
              var9[var6][var7].a(393989, var6, var7, var9);
              var9[var6][var7].b(true, param1);
            }
          }
          var7Lifetime1 = 116 % ((param3 - 8) / 32);
          stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("md.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int e(boolean param0) {
        int fieldTemp$0 = 0;
        if (!param0) {
          this.e(false);
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          return 255 & this.field_h[fieldTemp$0] - this.field_r.a(!param0 ? true : false);
        }
        int fieldTemp$1 = this.field_f;
        this.field_f = this.field_f + 1;
        return 255 & this.field_h[fieldTemp$1] - this.field_r.a(!param0 ? true : false);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          if (param2 != 29712) {
            field_t = (String[]) null;
          }
          for (var5_int = 0; var5_int < param0; var5_int++) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            param3[var5_int + param1] = (byte)(this.field_h[fieldTemp$0] - this.field_r.a(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void k(int param0) {
        if (param0 != -2321) {
          db var3 = (db) null;
          md.a(6, -104, (db) null);
          this.field_f = (this.field_l + 7) / 8;
          return;
        }
        this.field_f = (this.field_l + 7) / 8;
    }

    public static void j(int param0) {
        field_o = null;
        if (param0 != 0) {
          return;
        }
        field_s = null;
        field_u = null;
        field_k = null;
        field_n = null;
        field_t = null;
        field_p = null;
    }

    md(byte[] param0) {
        super(param0);
    }

    final static dk a(int param0, int param1, db param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        dk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param2.d(-113, param0);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (dk) (stackIn_2_0);
          }
          if (param1 < 74) {
            md.a(-108, true, 93, 119, (f[][]) null);
          }
          stackIn_6_0 = new dk(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("md.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void f(byte param0) {
        int var2 = 121 % ((param0 + 48) / 50);
        this.field_l = 8 * this.field_f;
    }

    static {
        field_u = new sj(11, 0, 1, 2);
        field_k = new int[3];
        field_t = new String[]{"Doable", "Insane", "Theoretically Possible", "Bonus Levels"};
        field_o = "Play the game without logging in just yet";
        field_n = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
