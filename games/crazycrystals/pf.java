/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends pn implements Cloneable {
    static String[] field_m;
    transient int field_w;
    private transient boolean field_t;
    transient int field_p;
    transient int field_u;
    private boolean field_y;
    static int field_n;
    private transient int field_o;
    private transient int field_s;
    transient int field_v;
    transient boolean field_r;
    private transient int field_q;
    private transient int field_x;

    final boolean b(byte param0) {
        if (param0 < 43) {
          return false;
        }
        return true;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l.a(param0, param1, param2, param3, (byte) -108, param5, param6);
          if (param4 >= -87) {
            this.a(52, (byte) 78, 42);
          }
          stackIn_3_0 = super.a(param0, param1, param2, param3, (byte) -108, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("pf.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    pf(int param0, int param1, f param2) {
        super(param2);
        this.field_p = 0;
        this.field_t = false;
        this.field_r = false;
        this.field_q = 0;
        this.field_x = 0;
        try {
          this.field_s = 3 & param1;
          this.field_o = param0 & 3;
          this.a((byte) 94, param2);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(f[][] param0, int param1, int param2, boolean param3) {
        try {
          this.field_p = this.field_x;
          this.field_r = this.field_t;
          this.field_t = param3 ? true : false;
          if (this.field_y) {
            param0[param2][-1 + param1] = param0[param2][-1 + param1].a(param2, (byte) -110, -1 + param1);
            param0[param2][param1 + 1] = param0[param2][1 + param1].a(param2, (byte) -110, 1 + param1);
            param0[param2 - 1][param1] = param0[param2 - 1][param1].a(-1 + param2, (byte) -110, param1);
            param0[param2 + 1][param1] = param0[param2 + 1][param1].a(param2 + 1, (byte) -110, param1);
            this.field_y = false;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pf.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          return (f) null;
        }
        if (512 > this.field_q) {
          this.field_q = this.field_q + 1;
        }
        return (f) (this);
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16736352) {
            field_m = (String[]) null;
          }
          stackIn_3_0 = this.field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("pf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(')').toString());
        }
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        ig stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == null) {
            return (f) (this);
          }
          fn.field_j = fn.field_j + wd.field_j;
          ob.field_l = ob.field_l - 1;
          fp.field_a = fp.field_a + 32;
          we.field_h = we.field_h + 32;
          je.field_j = je.field_j + 16;
          b.field_a = b.field_a + 16;
          fn.field_j = fn.field_j + 16;
          mb.field_g = mb.field_g + 16;
          if (param5 != -87) {
            this.field_x = -110;
          }
          dd.field_c.a(32, param2 * 12, 12 * param1, 0, (byte) -111);
          stackIn_7_0 = new ig(param0, param4, (f) (this), false);
          return (f) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_m = null;
        if (param0 != 33) {
          field_m = (String[]) null;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          if (param0 < 92) {
            field_m = (String[]) null;
          }
          if (this.field_q >= 64) {
            if (param1 <= this.field_x) {
              return;
            }
            this.field_x = param1;
            this.field_u = param6;
            b.field_a = b.field_a + 20;
            fp.field_a = fp.field_a + 40;
            je.field_j = je.field_j + 20;
            we.field_h = we.field_h + 40;
            this.field_t = true;
            this.field_v = param2;
            this.field_w = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("pf.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.field_l.a(false, param1, param2);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(fq param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_q >= 64) {
            this.field_v = 0;
            this.field_u = 0;
            this.field_t = true;
            this.field_x = tm.field_e;
            this.field_w = param0.field_u;
          }
          if (param1 <= 126) {
            this.field_y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pf.LB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.field_y &&
            this.field_q >= 256) {
            this.field_y = true;
            param0[param3][param1 - 1].a(param0, -1 + param1, (byte) 40, param3);
            param0[param3][param1 + 1].a(param0, param1 + 1, (byte) 40, param3);
            param0[param3 - 1][param1].a(param0, param1, (byte) 40, param3 - 1);
            param0[param3 + 1][param1].a(param0, param1, (byte) 40, 1 + param3);
          }
          if (param2 != 40) {
            this.a(-67, (ea) null, -94, -97, (byte) 87, 72, (f[][]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pf.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = CrazyCrystals.field_B;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (ja.a(param1, (byte) 0)) {
            return true;
          }
          var6 = ff.field_e;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
              return true;
            }
          }
          var2Lifetime1 = s.field_d;
          var3Lifetime1 = 0;
          while (var3Lifetime1 < var2Lifetime1.length) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            stackIn_19_0 = ~var4Lifetime1;
            stackIn_19_1 = ~param1;
            if (stackIn_19_0 != stackIn_19_1) {
              var3Lifetime1++;
              continue;
            }
            return true;
          }
          if (param0 > -93) {
            field_n = 11;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "pf.K(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21) {
            this.field_r = true;
          }
          stackIn_3_0 = this.field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("pf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          var4_int = -1;
          for (var5 = param0; param2 > var5; var5++) {
            var4_int = oe.field_b[(var4_int ^ param1[var5]) & 255] ^ var4_int >>> 8;
          }
          var4_int = var4_int ^ param3;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("pf.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final static void e(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        pp var4 = null;
        int var4_int = 0;
        int var5 = 0;
        we var5_ref_we = null;
        int[] var6 = null;
        int var8 = 0;
        md var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = CrazyCrystals.field_B;
        try {
          var9 = kd.field_n;
          var2 = var9.h(255);
          if (param0 < 19) {
            field_m = (String[]) null;
          }
          var3 = var9.h(255);
          if (0 == var2) {
            var4 = (pp) (nh.field_A.g(32073));
            if (var4 == null) {
              jj.a(4);
              return;
            }
            var5 = -var9.field_f + rk.field_b;
            var11 = var4.field_g;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.h(255) << pf.b(var7 << 8, 768));
            }
            var4.field_h = true;
            var4.a(false);
            return;
          }
          if (var2 == 1) {
            var4_int = var9.f(0);
            var5_ref_we = (we) (tb.field_b.g(32073));
            while (var5_ref_we != null) {
              if (var5_ref_we.field_j != var3 ||
                var5_ref_we.field_g != var4_int) {
                var5_ref_we = (we) (tb.field_b.a(false));
                continue;
              }
              break;
            }
            if (var5_ref_we != null) {
              var5_ref_we.a(false);
              return;
            }
            jj.a(4);
            return;
          }
          wp.a((Throwable) null, "LR1: " + ug.a(-1815), 21862);
          jj.a(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "pf.R(" + param0 + ')');
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        this.field_s = param3 & 3;
        if (param0 != -35) {
          return;
        }
        try {
          this.field_q = 0;
          this.field_o = 3 & param2;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pf.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        double var8_double;
        double var10;
        int var12;
        int var8;
        var12 = CrazyCrystals.field_B;
        if (param3) {
          var7 = 64;
        } else {
          var7 = this.field_q / 8;
          if (this.field_r) {
            var8_double = 0.39269908169872414 * (double)(15 & this.field_p);
            var10 = 1.0 + (1.0 - Math.cos(var8_double)) * 0.25;
            var7 = (int)(var10 * (double)var7 + 0.5);
          }
        }
        if (param1 == 24 &&
          param2 == 24) {
          wl.field_p[this.field_s][this.field_o].d(param4, param5, var7);
        } else {
          wl.field_p[this.field_s][this.field_o].a(param4, param5, 2 * param1, 2 * param2, var7);
        }
        var8 = 76 % ((74 - param0) / 41);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
          return false;
        }
        return this.field_l.e(-4128);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          return 88;
        }
        return this.field_l.a(true, param1);
    }

    final nj a(int param0, nj param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        pf var4 = null;
        nj stackIn_3_0 = null;
        nj stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.a(param0, param1);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = new pf(this.field_o, this.field_s, new kp(-1));
          var4.field_q = 1024;
          stackIn_5_0 = ng.a(tn.field_m, param1, var4, (byte) -83, ae.field_C);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("pf.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 76 % ((param2 + 43) / 51);
          if (this.field_r) {
            fn.field_j = fn.field_j + wd.field_j;
            ob.field_l = ob.field_l - 1;
            fp.field_a = fp.field_a + 2;
            je.field_j = je.field_j + 1;
            b.field_a = b.field_a + 1;
            we.field_h = we.field_h + 2;
            param0[param1][param3 - 1].a(120, this.field_p, 0, param0, this.field_w, param1, 1, param3 - 1);
            param0[param1][param3 + 1].a(95, this.field_p, 0, param0, this.field_w, param1, -1, 1 + param3);
            param0[param1 - 1][param3].a(115, this.field_p, 1, param0, this.field_w, -1 + param1, 0, param3);
            param0[param1 + 1][param3].a(94, this.field_p, -1, param0, this.field_w, param1 + 1, 0, param3);
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pf.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_m = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
