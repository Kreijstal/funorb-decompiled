/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    int field_h;
    int[] field_l;
    int field_a;
    private kg field_q;
    private static int[] field_e;
    int field_m;
    hj[] field_g;
    static th field_n;
    boolean field_d;
    static uf field_i;
    boolean field_c;
    static int[] field_p;
    private uf field_k;
    private go field_j;
    private va field_o;
    int field_b;
    mg[] field_f;

    private final void a(int param0, go param1) {
        try {
          this.field_j = param1;
          this.field_c = false;
          if (param0 != 1) {
            fl var4 = (fl) null;
            om.a(74, (fl) null, -105);
          }
          this.field_g = null;
          this.field_l = null;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, uf param1) {
        try {
          this.field_l = null;
          int var3_int = 125 % ((param0 + 14) / 34);
          this.field_k = param1;
          this.field_g = null;
          this.field_f = null;
          this.field_c = false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        mg var5 = null;
        mg var3 = null;
        mg[] var7 = null;
        hj[] var8 = null;
        int var4 = HoldTheLine.field_D;
        if (this.field_c) {
          return true;
        }
        int var2 = -8 / ((-92 - param0) / 34);
        if (this.field_k == null) {
          if (this.field_j != null) {
            var5 = this.field_j.c((byte) -105);
            var3 = var5;
            if (var3 != null) {
              this.field_f = new mg[]{var5};
              this.field_c = true;
              return this.field_c;
            }
            return this.field_c;
          }
          if (null == this.field_o) {
            if (null == this.field_q) {
              return this.field_c;
            }
            var7 = this.field_q.a(16);
            mg[] var3_array = var7;
            if (var7 != null) {
              this.field_f = var7;
              this.field_c = true;
              return this.field_c;
            }
            return this.field_c;
          }
          var8 = this.field_o.a(180);
          hj[] var3_array2 = var8;
          if (var8 != null) {
            this.field_g = var8;
            this.field_c = true;
            return this.field_c;
          }
          return this.field_c;
        }
        hj var6 = this.field_k.a(8192);
        hj var3_ref = var6;
        if (var3_ref != null) {
          this.field_g = new hj[]{var6};
          this.field_c = true;
          return this.field_c;
        }
        return this.field_c;
    }

    public static void a(byte param0) {
        field_p = null;
        field_n = null;
        if (param0 != -6) {
          return;
        }
        field_e = null;
        field_i = null;
    }

    final static void a(String[][] param0, int param1, int param2) {
        try {
          ra.field_ab = -1;
          ik.field_i = param2;
          qj.field_I = -1;
          mc.field_b = param0;
          mn.field_b = -1;
          nh.h(0);
          if (param1 <= 10) {
            gn var4 = (gn) null;
            om.a((String) null, (gn) null, (String) null, 14, (gn) null);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(va param0, int[] param1, boolean param2) {
        this.field_l = param1;
        this.field_c = false;
        this.field_o = param0;
        if (!param2) {
          return;
        }
        try {
          this.field_g = null;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ql a(String param0, gn param1, String param2, int param3, gn param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ql stackIn_2_0 = null;
        ql stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 8192) {
            stackIn_2_0 = (ql) null;
            return stackIn_2_0;
          }
          var5_int = param4.c(param0, 3);
          var6 = param4.a(var5_int, param2, false);
          stackIn_4_0 = ta.a(var5_int, var6, param4, param1, -105);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("om.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, fl param1, int param2) {
        da var6 = null;
        int var4 = 0;
        try {
          if (param0 != 27391) {
            fl var5 = (fl) null;
            om.a(-52, (fl) null, -89);
          }
          var6 = da.field_p;
          var6.c((byte) 33, param2);
          var6.field_l = var6.field_l + 1;
          var4 = var6.field_l;
          var6.f(111, 1);
          if (null != param1.field_l) {
            var6.f(param0 - 27280, param1.field_l.length);
            var6.a(param1.field_l.length, 86, param1.field_l, 0);
          } else {
            var6.f(param0 ^ 27280, 0);
          }
          var6.a(var4, (byte) 118);
          var6.field_l = var6.field_l - 4;
          param1.field_k = var6.a(62);
          var6.a(-268435456, var6.field_l - var4);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        if (param0 == 32768) {
          this.field_d = false;
          this.field_a = param1;
          return;
        }
        field_i = (uf) null;
        this.field_d = false;
        this.field_a = param1;
    }

    private final void a(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_m = param2;
        this.field_d = true;
        if (param0 == 92682) {
          this.field_a = (int)Math.sqrt((double)(this.field_m * this.field_m + this.field_h * this.field_h));
          return;
        }
        int[] var5 = (int[]) null;
        this.a((va) null, (int[]) null, true);
        this.field_a = (int)Math.sqrt((double)(this.field_m * this.field_m + this.field_h * this.field_h));
    }

    private final void a(int param0, kg param1, int[] param2) {
        this.field_l = param2;
        this.field_g = null;
        this.field_q = param1;
        this.field_c = false;
        if (param0 != 4) {
          return;
        }
        try {
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    om(int param0, int param1, va param2, int[] param3, int param4) {
        try {
          this.field_b = param1;
          this.a(32768, param0);
          this.a(param2, param3, true);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lh.a((java.awt.Component) ((Object) param1), false);
          ic.a(23147, (java.awt.Component) ((Object) param1));
          if (lb.field_u != null) {
            lb.field_u.a((java.awt.Component) ((Object) param1), -1);
          }
          if (param0 == -46342) {
            return;
          }
          var3 = (java.awt.Canvas) null;
          om.a(93, (java.awt.Canvas) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("om.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    om(int param0, int param1, kg param2, int[] param3, int param4) {
        try {
          this.field_b = param1;
          this.a(32768, param0);
          this.a(4, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    om(int param0, int param1, int param2, kg param3, int[] param4, int param5) {
        try {
          this.field_b = param2;
          this.a(92682, param1, param0);
          this.a(4, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    om(int param0, int param1, uf param2, int param3) {
        try {
          this.field_b = param1;
          this.a(32768, param0);
          this.a(-103, param2);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    om(int param0, int param1, int param2, uf param3, int param4) {
        try {
          this.field_b = param2;
          this.a(92682, param1, param0);
          this.a(-57, param3);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    om(int param0, int param1, go param2, int param3) {
        try {
          this.field_b = param1;
          this.a(32768, param0);
          this.a(1, param2);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    om(int param0, int param1, int param2, go param3, int param4) {
        try {
          this.field_b = param2;
          this.a(92682, param1, param0);
          this.a(1, param3);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    om(int param0, int param1, int param2, int param3) {
        this.field_b = param2;
        this.a(92682, param1, param0);
        this.field_g = null;
        this.field_f = null;
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_e = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)(-1 + (var0 << 1));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (var3 >= field_e.length) {
            var3 = field_e.length - 1;
          }
          for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
            field_e[var1] = var0;
          }
        }
        field_p = new int[8192];
    }
}
