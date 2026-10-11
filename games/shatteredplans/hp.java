/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends me {
    static int[] field_k;
    static ub field_l;
    static fc field_m;
    static bc field_n;
    private int[] field_q;
    private int[] field_o;
    static int field_p;

    final int b(boolean param0) {
        if (param0) {
          hp.b((byte) -59);
        }
        return rs.field_Cb.field_J + this.field_o.length * cc.field_n;
    }

    final boolean a(dc param0, byte param1) {
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        int var6 = 0;
        ln[] var7 = null;
        int var8 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (super.a(param0, (byte) 94)) {
            return true;
          }
          for (var3_int = 0; var3_int < this.field_i.length; var3_int++) {
            this.field_q[var3_int] = 0;
          }
          var7 = param0.field_g.field_e;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5_ref_ln = var7[var4];
            if (2 == var5_ref_ln.field_L &&
              null != var5_ref_ln.field_y) {
              this.field_q[var5_ref_ln.field_y.field_x] = this.field_q[var5_ref_ln.field_y.field_x] - var5_ref_ln.field_G[0];
            }
          }
          if (param1 < 23) {
            this.b(false);
          }
          for (var3_intLifetime1 = 0; this.field_i.length > var3_intLifetime1; var3_intLifetime1++) {
            this.field_o[var3_intLifetime1] = this.field_o[var3_intLifetime1] + this.field_q[var3_intLifetime1];
          }
          var3_intLifetime2 = 0;
          var4Lifetime1 = 0;
          var5 = 0;
          while (this.field_o.length > var5) {
            stackIn_26_0 = -1;
            stackIn_26_1 = ~(param0.field_w & 1 << var5);
            if (stackIn_26_0 == stackIn_26_1) {
              if (50 <= this.field_o[var5]) {
                if (this.field_o[var5] <= var4Lifetime1) {
                  if (var4Lifetime1 == this.field_o[var5]) {
                    var3_intLifetime2++;
                  }
                } else {
                  var4Lifetime1 = this.field_o[var5];
                  var3_intLifetime2 = 1;
                }
              }
            } else {
              this.field_o[var5] = -1;
            }
            var5++;
          }
          if (var3_intLifetime2 != 0) {
            this.field_g = new fs[var3_intLifetime2];
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < this.field_i.length) {
              if (this.field_o[var8] == var4Lifetime1) {
                var3_intLifetime2--;
                this.field_g[var3_intLifetime2] = this.field_i[var8];
              }
              var8++;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_51_0 = var3_ref;
          stackIn_51_1 = new StringBuilder().append("hp.F(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    hp(fs[] param0) {
        super(param0);
        try {
          this.field_o = new int[this.field_i.length];
          this.field_q = new int[this.field_i.length];
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < this.field_o.length; var3_int++) {
            param1.c(this.field_o[var3_int], (byte) -92);
          }
          int var4 = -49 % ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "hp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        int var5_int = 0;
        int var6 = 0;
        int var2;
        double var3;
        fs[] var5;
        double var6_double;
        double var7;
        int var9;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
          field_m = (fc) null;
        }
        if (null != this.field_g) {
          return this.field_g;
        }
        var2 = 0;
        var3 = 1.7976931348623157e+308;
        for (var5_int = 0; this.field_i.length > var5_int; var5_int++) {
          if (this.field_q[var5_int] != 0 &&
            this.field_o[var5_int] != 0) {
            var6_double = (double)(50 - this.field_o[var5_int]) / (double)this.field_q[var5_int];
            if (var6_double != var3) {
              if (var3 > var6_double) {
                var2 = 1;
                var3 = var6_double;
              }
            } else {
              var2++;
            }
          }
        }
        if (var2 == 0) {
          return new fs[]{};
        }
        var5 = new fs[var2];
        for (var6 = 0; var6 < this.field_i.length; var6++) {
          if (this.field_q[var6] != 0) {
            var7 = (double)(50 - this.field_o[var6]) / (double)this.field_q[var6];
            if (var3 == var7) {
              var2--;
              var5[var2] = this.field_i[var6];
            }
          }
        }
        return var5;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            cr.field_d = param2;
            var3 = param1.getParameter("cookieprefix");
            var4 = param1.getParameter("cookiehost");
            var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
            if (param2.length() == 0) {
              var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            ll.a(param1, "document.cookie=\"" + var5 + "\"", (byte) 123);
            if (param0 <= 7) {
              field_n = (bc) null;
            }
            h.a(-1, param1);
          } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        field_l = null;
        int var1 = 29 / ((param0 - 12) / 51);
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = 0; this.field_o.length > var3_int; var3_int++) {
            this.field_o[var3_int] = param0.g(-2852);
          }
          if (param1 != -109) {
            var5 = (String) null;
            hp.a((byte) 83, (java.applet.Applet) null, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hp.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        int var7_int = 0;
        int var10_int = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        fs[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int[] var9 = null;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var5Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var24 = new int[this.field_i.length];
          var18 = var24;
          var16 = var18;
          var26 = var16;
          var20 = var26;
          var4 = var20;
          if (param0 > -9) {
            return;
          }
          for (var5 = 0; var24.length > var5; var5++) {
            var24[var5] = var5;
          }
          var5Lifetime1 = 0;
          var25 = this.field_o;
          var19 = var25;
          var17 = var19;
          var6 = var17;
          for (var7_int = 0; var7_int < var25.length; var7_int++) {
            var8_int = var25[var7_int];
            var5Lifetime1 = var5Lifetime1 + var8_int;
          }
          if (var5Lifetime1 > 0) {
            lh.a((byte) 35, var4, (int[]) ((Object) this.field_o.clone()));
          }
          var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[]{Integer.toString(50)}))};
          var7 = new fs[this.field_i.length];
          var28 = new int[this.field_i.length];
          var22 = var28;
          var8 = var22;
          var27 = new int[this.field_i.length];
          var21 = var27;
          var9 = var21;
          for (var10_int = 0; var10_int < this.field_i.length; var10_int++) {
            var7[var10_int] = this.field_i[var26[var10_int]];
            var8[var10_int] = this.field_o[var26[var10_int]];
            var9[var10_int] = this.field_q[var26[var10_int]];
          }
          var10 = this.b(0);
          if (null == this.field_g &&
            var10.length != 0) {
            var12 = var10[0].field_x;
            var13 = (double)(-this.field_o[var12] + 50) / (double)this.field_q[var12];
            var11 = (int)Math.ceil(var13);
          } else {
            var11 = 0;
          }
          param2.a(50, var7, var27, var28, var10, var23, (byte) -47, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("hp.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_k = new int[]{800, 400, 200, 120, 80};
    }
}
