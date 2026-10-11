/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma extends sh {
    private lka field_N;
    private lka field_Q;
    static kv[] field_J;
    private boolean field_K;
    static String field_O;
    private lka field_L;
    static eaa field_M;
    static kga[] field_P;

    uma(qda param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param2, param5, (byte) 59, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(gl param0, byte param1) {
        super.a(param0, (byte) 114);
        this.field_Q.field_k = (pl) ((Object) param0);
        if (param1 < 111) {
          return;
        }
        try {
          this.field_N.field_k = (pl) ((Object) param0);
          this.field_L.field_k = (pl) ((Object) param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uma.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, kv param3, int param4, int[] param5) {
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        try {
          param4 -= 3;
          if (param3.field_q < param0) {
            param0 = param3.field_q;
          }
          var6_int = 0;
          for (var7 = param2; param3.field_p > var7; var7++) {
            var8 = param5[param5.length * var7 / param3.field_p];
            for (var9 = 0; var9 < param0; var9++) {
              if (param3.field_v[var6_int] >= 0) {
                tla.a(param1 + var9, -1898743704, var8, var7 + param4, param3.field_v[var6_int] & 255);
              }
              var6_int++;
            }
            var6_int = var6_int + (-param0 + param3.field_q);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("uma.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 < 20) {
            field_J = (kv[]) null;
          }
          stackIn_3_0 = Integer.parseInt(this.field_N.field_w) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        hw var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var1_intLifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != 1) {
            field_O = (String) null;
          }
          for (var1_int = 0; var1_int < bf.field_g.length; var1_int++) {
            bf.field_g[var1_int] = new hw(ko.field_f.field_b[var1_int]);
            var2 = ica.field_r[var1_int][0];
            var3 = ica.field_r[var1_int][1];
            bf.field_g[var1_int].field_kb = -16 + var2;
            bf.field_g[var1_int].field_rb = -16 + var3;
            bf.field_g[var1_int].field_sb = 32;
            bf.field_g[var1_int].field_p = 32;
          }
          var6 = 0;
          var1_intLifetime1 = var6;
          while (hha.field_w.length > var6) {
            hha.field_w[var6] = new hw(-1);
            if (-1 != rn.field_s.field_g.field_m[var6]) {
              hha.field_w[var6].field_vb = rn.field_s.field_g.field_m[var6];
            }
            var2Lifetime1 = od.field_A[var6][0];
            var3Lifetime1 = od.field_A[var6][1];
            hha.field_w[var6].field_kb = -16 + var2Lifetime1;
            hha.field_w[var6].field_rb = var3Lifetime1 - 16;
            var4 = hha.field_w[var6];
            hha.field_w[var6].field_p = 32;
            var4.field_sb = 32;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "uma.F(" + param0 + ')');
        }
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -1) {
          return 121;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_L.field_w);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 59, param3, param4);
        int var6 = -130 + param3 >> 1;
        if (!this.field_K) {
          this.field_Q.a(var6, param1, (byte) 59, 25, 0);
          this.field_N.a(var6 + 45, param1, (byte) 59, 25, 0);
        } else {
          this.field_N.a(var6, param1, (byte) 59, 25, 0);
          this.field_Q.a(45 + var6, param1, (byte) 59, 25, 0);
        }
        this.field_L.a(var6 + 90, param1, param2, 40, 0);
    }

    private final void a(byte param0, wj param1, String param2, int param3, int param4) {
        if (param0 != -68) {
          return;
        }
        try {
          oc.field_l.a(param2, param4 + param1.field_s + (param1.field_p >> 1), -5 + param1.field_v + param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uma.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private uma(qda param0, boolean param1) {
        super(0, 0, 0, 0, (qda) null);
        try {
          this.field_Q = (lka) ((Object) new vn("", (pl) null, 2));
          this.field_N = (lka) ((Object) new vn("", (pl) null, 2));
          this.field_L = (lka) ((Object) new vn("", (pl) null, 4));
          this.field_L.field_f = param0;
          this.field_N.field_f = param0;
          this.field_Q.field_f = param0;
          this.field_K = param1 ? true : false;
          if (this.field_K) {
            this.c(this.field_N, 42);
            this.c(this.field_Q, -127);
          } else {
            this.c(this.field_Q, -120);
            this.c(this.field_N, -126);
          }
          this.c(this.field_L, -128);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void m(int param0) {
        field_O = null;
        if (param0 != -30829) {
          return;
        }
        field_P = null;
        field_J = null;
        field_M = null;
    }

    final String c(byte param0) {
        String var2 = this.field_N.c(param0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_t) {
          return this.field_h != null ? this.field_h : this.field_w;
        }
        return null;
    }

    final boolean k(int param0) {
        if (null == this.field_Q.field_w) {
          return true;
        }
        if (0 == this.field_Q.field_w.length()) {
          return true;
        }
        if (param0 >= -54) {
          return true;
        }
        if (null != this.field_N.field_w &&
          0 != this.field_N.field_w.length()) {
          if (this.field_L.field_w != null &&
            0 != this.field_L.field_w.length()) {
            return false;
          }
          return true;
        }
        return true;
    }

    final int d(byte param0) {
        int stackIn_1_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        NumberFormatException var2 = null;
        try {
          var2_int = -108 % ((-64 - param0) / 56);
          stackIn_1_0 = Integer.parseInt(this.field_Q.field_w);
          return stackIn_1_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 107, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        param1 = param1 + this.field_v;
        int var5 = 83 % ((param0 + 20) / 54);
        param3 = param3 + this.field_s;
        this.a((byte) -68, this.field_Q, tca.field_b, param1, param3);
        this.a((byte) -68, this.field_N, ao.field_c, param1, param3);
        this.a((byte) -68, this.field_L, ca.field_d, param1, param3);
    }

    static {
        field_O = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_P = new kga[8];
    }
}
