/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends me {
    static bc field_l;
    private int field_k;
    private int[] field_n;
    static volatile long field_m;
    private int[] field_o;
    static int field_p;

    final static void a(java.applet.Applet param0, int param1, int param2, byte param3, String[] param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          hn.field_d = param0.getParameter("overxgames");
          if (hn.field_d == null) {
            hn.field_d = "0";
          }
          ja.field_j = param0.getParameter("overxachievements");
          if (null == ja.field_j) {
            ja.field_j = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 != null &&
            go.a(0, (CharSequence) ((Object) var6))) {
            ma.a((CharSequence) ((Object) var6), param3 + 5);
          }
          ge.field_l = new bi[param4.length];
          if (param3 != -3) {
            nh.b((byte) -94);
          }
          for (var7 = 0; var7 < param4.length; var7++) {
            ge.field_l[var7] = new bi(317, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_18_0 = var6_ref;
          stackIn_18_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 >= -72) {
          return false;
        }
        return param1 >= 0 ? true : false;
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
        String var10;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
          var10 = (String) null;
          nh.a(-33, (nq) null, 126, 13, -76, 49, (String) null, true, -106, 108, -72, 85);
        }
        if (null != this.field_g) {
          return this.field_g;
        }
        var2 = 0;
        var3 = 1.7976931348623157e+308;
        for (var5_int = 0; var5_int < this.field_i.length; var5_int++) {
          if (this.field_n[var5_int] != 0 &&
            this.field_o[var5_int] != 0) {
            var6_double = (double)(this.field_k - this.field_o[var5_int]) / (double)this.field_n[var5_int];
            if (var3 == var6_double) {
              var2++;
            } else {
              if (var3 > var6_double) {
                var3 = var6_double;
                var2 = 1;
              }
            }
          }
        }
        if (var2 == 0) {
          return new fs[]{};
        }
        var5 = new fs[var2];
        for (var6 = 0; this.field_i.length > var6; var6++) {
          if (this.field_n[var6] != 0) {
            var7 = (double)(this.field_k - this.field_o[var6]) / (double)this.field_n[var6];
            if (var7 == var3) {
              var2--;
              var5[var2] = this.field_i[var6];
            }
          }
        }
        return var5;
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_k = param0.a(16711680);
          if (param1 != -109) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_o.length; var3_int++) {
            this.field_o[var3_int] = param0.a(16711680);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nh.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, nq param1, int param2, int param3, int param4, int param5, String param6, boolean param7, int param8, int param9, int param10, int param11) {
        bi var13 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var12 = null;
        try {
          cl.a(param5, param8, -22466, param0, param9, param4, param2, param3, param11);
          param1.c(param6, param5 + (param0 >> 1), param3 + (param1.field_J + param9 >> 1), 16777215, param10);
          if (param7) {
            var13 = new bi(param0, param9);
            bs.a(var13, 98);
            param1.c(param6, (param0 >> 1) + 1, param9 + param1.field_J >> 1, 16777215, -1);
            param1.c(param6, (param0 >> 1) - 1, param1.field_J + param9 >> 1, 16777215, -1);
            param1.c(param6, param0 >> 1, (param9 + param1.field_J >> 1) + 1, 16777215, -1);
            param1.c(param6, param0 >> 1, -1 + (param1.field_J + param9 >> 1), 16777215, -1);
            cg.i(0);
            var13.c(param5, param3, 64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_6_0 = var12;
          stackIn_6_1 = new StringBuilder().append("nh.K(").append(param0).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    nh(fs[] param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_k = 0;
        try {
          this.field_o = new int[this.field_i.length];
          this.field_n = new int[this.field_i.length];
          for (var2_int = 0; var2_int < this.field_i.length; var2_int++) {
            this.field_n[var2_int] = 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nh.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 != 59) {
          field_m = -92L;
        }
    }

    final int b(boolean param0) {
        if (param0) {
          nh.a((byte) 114, 82);
        }
        return cc.field_n * this.field_o.length + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        int var6 = 0;
        int var7 = 0;
        dc var8 = null;
        int var9 = 0;
        sd var10 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (super.a(param0, (byte) 116)) {
            return true;
          }
          if (this.field_k == 0) {
            var3_int = param0.field_g.field_e.length / this.field_i.length;
            for (var4 = 0; hp.field_k.length > var4; var4++) {
              if (~md.field_J[var4] != ~var3_int) {
                continue;
              }
              this.field_k = hp.field_k[var4];
              break;
            }
            if (this.field_k == 0) {
              throw new RuntimeException("No points settings for galaxy size of " + var3_int + " stars per player.");
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < this.field_i.length; var3_intLifetime1++) {
            this.field_n[var3_intLifetime1] = 0;
            var10 = (sd) (this.field_i[var3_intLifetime1].field_i.d(0));
            while (var10 != null) {
              var5_ref_ln = var10.j(18229);
              while (var5_ref_ln != null) {
                L13: {
                  var6 = var5_ref_ln.field_L;
                  if (var6 != 0 &&
                    1 != var6) {
                    if (2 == var6) {
                      this.field_n[var3_intLifetime1] = this.field_n[var3_intLifetime1] + 2;
                      break L13;
                    }
                    if (var6 == 3) {
                      this.field_n[var3_intLifetime1] = this.field_n[var3_intLifetime1] + 3;
                      break L13;
                    }
                    var5_ref_ln = var10.h(-23410);
                    continue;
                  }
                  this.field_n[var3_intLifetime1] = this.field_n[var3_intLifetime1] + 1;
                }
                var5_ref_ln = var10.h(-23410);
              }
              var10 = (sd) (this.field_i[var3_intLifetime1].field_i.a((byte) -71));
            }
            this.field_o[var3_intLifetime1] = this.field_o[var3_intLifetime1] + this.field_n[var3_intLifetime1];
          }
          if (param1 < 23) {
            var8 = (dc) null;
            this.a((dc) null, (byte) -96);
          }
          var3_intLifetime2 = 0;
          var4Lifetime1 = 0;
          var5 = 0;
          while (var5 < this.field_o.length) {
            stackIn_41_0 = ~(1 << var5 & param0.field_w);
            stackIn_41_1 = -1;
            if (stackIn_41_0 == stackIn_41_1) {
              if (this.field_k <= this.field_o[var5]) {
                if (this.field_o[var5] > var4Lifetime1) {
                  var3_intLifetime2 = 1;
                  var4Lifetime1 = this.field_o[var5];
                } else {
                  if (var4Lifetime1 == this.field_o[var5]) {
                    var3_intLifetime2++;
                  }
                }
              }
            } else {
              this.field_o[var5] = -1;
            }
            var5++;
          }
          if (var3_intLifetime2 != 0) {
            this.field_g = new fs[var3_intLifetime2];
            var9 = 0;
            var5Lifetime1 = var9;
            while (this.field_i.length > var9) {
              if (this.field_o[var9] == var4Lifetime1) {
                var3_intLifetime2--;
                this.field_g[var3_intLifetime2] = this.field_i[var9];
              }
              var9++;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("nh.F(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        vh.field_b = param2;
        fe.field_A = param3;
        we.field_c = param0;
        if (param4 != 2) {
          return;
        }
        sp.field_r = param1;
    }

    final void a(byte param0, dc param1, kq param2) {
        int var7_int = 0;
        int var10_int = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
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
        int var5Lifetime2;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 == this.field_k) {
            var4_int = param1.field_g.field_e.length / this.field_i.length;
            for (var5 = 0; var5 < hp.field_k.length; var5++) {
              if (md.field_J[var5] != var4_int) {
                continue;
              }
              this.field_k = hp.field_k[var5];
              break;
            }
            if (this.field_k == 0) {
              throw new RuntimeException("No points settings for galaxy size of " + var4_int + " stars per player.");
            }
          }
          var24 = new int[this.field_i.length];
          var18 = var24;
          var16 = var18;
          var26 = var16;
          var20 = var26;
          var4 = var20;
          for (var5Lifetime1 = 0; var5Lifetime1 < var24.length; var5Lifetime1++) {
            var24[var5Lifetime1] = var5Lifetime1;
          }
          var5Lifetime2 = 0;
          if (param0 >= -9) {
            nh.a(56, -93, 96, 4, 73);
          }
          var25 = this.field_o;
          var19 = var25;
          var17 = var19;
          var6 = var17;
          for (var7_int = 0; var25.length > var7_int; var7_int++) {
            var8_int = var25[var7_int];
            var5Lifetime2 = var5Lifetime2 + var8_int;
          }
          if (var5Lifetime2 > 0) {
            lh.a((byte) -93, var4, (int[]) ((Object) this.field_o.clone()));
          }
          var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[]{Integer.toString(this.field_k)}))};
          var7 = new fs[this.field_i.length];
          var28 = new int[this.field_i.length];
          var22 = var28;
          var8 = var22;
          var27 = new int[this.field_i.length];
          var21 = var27;
          var9 = var21;
          for (var10_int = 0; this.field_i.length > var10_int; var10_int++) {
            var7[var10_int] = this.field_i[var26[var10_int]];
            var8[var10_int] = this.field_o[var26[var10_int]];
            var9[var10_int] = this.field_n[var26[var10_int]];
          }
          var10 = this.b(0);
          if (null == this.field_g &&
            0 != var10.length) {
            var12 = var10[0].field_x;
            var13 = (double)(-this.field_o[var12] + this.field_k) / (double)this.field_n[var12];
            var11 = (int)Math.ceil(var13);
          } else {
            var11 = 0;
          }
          param2.a(this.field_k, var7, var27, var28, var10, var23, (byte) -47, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("nh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3_intLifetime1;
        try {
          param1.e(11135, this.field_k);
          for (var3_int = 0; var3_int < this.field_o.length; var3_int++) {
            param1.e(11135, this.field_o[var3_int]);
          }
          var3_intLifetime1 = 23 / ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "nh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 0L;
        field_p = 0;
    }
}
