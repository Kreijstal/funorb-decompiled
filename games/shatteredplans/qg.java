/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends me {
    private int[] field_s;
    static int field_q;
    static String field_o;
    static int[] field_r;
    static int[] field_t;
    static int[] field_l;
    static String field_k;
    static int[][] field_p;
    static int[] field_m;
    private int[] field_n;

    final void a(ob param0, byte param1) {
        try {
          if (param1 != -109) {
            this.b(true);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ob param0, boolean param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          np.field_j = param0.f(-20976) << 5;
          var2_int = param0.j(-101);
          np.field_j = np.field_j + (var2_int >> 3);
          gp.field_c = 1835008 & var2_int << 18;
          if (param1) {
            field_q = 21;
          }
          gp.field_c = gp.field_c + (param0.f(-20976) << 2);
          var2_intLifetime1 = param0.j(-120);
          gp.field_c = gp.field_c + (var2_intLifetime1 >> 6);
          ig.field_d = 2064384 & var2_intLifetime1 << 15;
          ig.field_d = ig.field_d + (param0.j(-122) << 7);
          var2_intLifetime2 = param0.j(-127);
          na.field_L = (1 & var2_intLifetime2) << 16;
          ig.field_d = ig.field_d + (var2_intLifetime2 >> 1);
          na.field_L = na.field_L + param0.f(-20976);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        int var7_int = 0;
        int var10_int = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
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
        double var16 = 0.0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        qk[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int var5Lifetime1;
        int var15Lifetime1;
        double var16Lifetime1;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var28 = new int[this.field_i.length];
          var22 = var28;
          var19 = var22;
          var30 = var19;
          var24 = var30;
          var4 = var24;
          for (var5 = 0; var5 < var28.length; var5++) {
            var28[var5] = var5;
          }
          if (param0 >= -9) {
            qg.c(-41);
          }
          var5Lifetime1 = 0;
          var29 = this.field_n;
          var23 = var29;
          var20 = var23;
          var6 = var20;
          for (var7_int = 0; var7_int < var29.length; var7_int++) {
            var8_int = var29[var7_int];
            var5Lifetime1 = var5Lifetime1 + var8_int;
          }
          if (var5Lifetime1 > 0) {
            lh.a((byte) 50, var4, (int[]) ((Object) this.field_n.clone()));
          }
          var27 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[]{Integer.toString(10)}))};
          var7 = new fs[this.field_i.length];
          var32 = new int[this.field_i.length];
          var26 = var32;
          var8 = var26;
          var31 = new int[this.field_i.length];
          var25 = var31;
          var9 = var25;
          for (var10_int = 0; var10_int < this.field_i.length; var10_int++) {
            var7[var10_int] = this.field_i[var30[var10_int]];
            var8[var10_int] = this.field_n[var30[var10_int]];
            var9[var10_int] = this.field_s[var30[var10_int]];
          }
          if (null == this.field_g) {
            var12 = 0;
            var13 = 1.7976931348623157e+308;
            for (var15 = 0; this.field_i.length > var15; var15++) {
              if (this.field_s[var15] != 0 &&
                this.field_n[var15] != 0) {
                var16 = (double)(-this.field_n[var15] + 10) / (double)this.field_s[var15];
                if (var16 != var13) {
                  if (var13 > var16) {
                    var12 = 1;
                    var13 = var16;
                  }
                } else {
                  var12++;
                }
              }
            }
            if (var12 == 0) {
              var10 = new fs[]{};
              var11 = 0;
            } else {
              var10 = new fs[var12];
              var21 = 0;
              var15Lifetime1 = var21;
              while (var21 < this.field_i.length) {
                if (this.field_s[var21] != 0) {
                  var16Lifetime1 = (double)(-this.field_n[var21] + 10) / (double)this.field_s[var21];
                  if (var16Lifetime1 == var13) {
                    var12--;
                    var10[var12] = this.field_i[var21];
                  }
                }
                var21++;
              }
              var11 = (int)Math.ceil(var13);
            }
          } else {
            var10 = this.field_g;
            var11 = 0;
          }
          param2.a(10, var7, var31, var32, var10, var27, (byte) -47, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_45_0 = var4_ref;
          stackIn_45_1 = new StringBuilder().append("qg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        if (param0) {
          field_p = (int[][]) null;
        }
        return 4 * cc.field_n + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if ((param0.field_w & 1) != 0) {
            this.field_g = new fs[1];
            for (var3_int = 1; param0.field_v.length > var3_int; var3_int++) {
              if ((param0.field_w & 1 << var3_int) == 0) {
                this.field_g[0] = param0.field_v[var3_int];
              }
            }
            return true;
          }
          if (6 > kb.field_x) {
            return false;
          }
          if (param1 < 23) {
            return false;
          }
          if (0 == (4 & param0.field_w)) {
            return false;
          }
          this.field_g = new fs[1];
          this.field_g[0] = param0.field_v[0];
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qg.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    qg(fs[] param0) {
        super(param0);
        try {
          this.field_n = new int[this.field_i.length];
          this.field_s = new int[this.field_i.length];
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        if (param0 != 0) {
          this.field_n = (int[]) null;
        }
        return new fs[]{};
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 >= -93) {
          ub var2 = (ub) null;
          qg.a(-23, (mj) null, -88, (ub) null, -99, 99, (byte) 109);
        }
        field_r = null;
        field_o = null;
        field_t = null;
        field_p = (int[][]) null;
        field_m = null;
        field_l = null;
    }

    final void a(int param0, ob param1) {
        try {
          int var3_int = 1 / ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, mj param1, int param2, ub param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fc var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          tp.a((int[]) null, param1.field_Ib, param1.field_Cb, param1.field_Db, 293, param3, param1, -1, -1);
          hp.field_m.a(true, param6 ^ -16763);
          hp.field_m.a((int[]) null, 0, (byte) -36);
          hp.field_m.b(17);
          var12 = hp.field_m;
          var8 = param0;
          var9 = param2;
          var10 = param4;
          var11 = param5;
          var12.field_j.b(var10, var11, 0, var8, var9);
          if (param6 != 110) {
            field_t = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("qg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_t = new int[14];
        field_l = new int[14];
        field_o = "Remove name";
        field_p = new int[14][];
        field_q = 0;
        field_m = new int[14];
        field_r = new int[14];
        field_k = "This password is part of your Player Name, and would be easy to guess";
        qd.a(25, 0, 400, new int[]{26, 0, 1, 5, 31, 4, 23, 20}, (byte) -5, 200, 0);
        qd.a(25, 0, 320, new int[]{2, 21, 22, 6, 10}, (byte) -5, 150, 1);
        qd.a(25, 0, 320, new int[]{2, 21, 22, 6, 11, 12, 14}, (byte) -5, 150, 2);
        qd.a(25, 0, 370, new int[]{2, 21, 22, 6, 13, 14}, (byte) -5, 150, 3);
        qd.a(25, 0, 320, new int[]{2, 21, 22, 6, 14}, (byte) -5, 150, 4);
        qd.a(25, 0, 400, new int[]{24, 9}, (byte) -5, 380, 5);
        qd.a(25, 320, 500, new int[]{26, 9}, (byte) -5, 70, 6);
        qd.a(25, 320, 500, new int[]{9}, (byte) -5, 50, 7);
        qd.a(25, 0, 500, new int[]{24, 9}, (byte) -5, 400, 8);
        qd.a(25, 0, 500, new int[]{24, 25}, (byte) -5, 200, 9);
        qd.a(25, 0, 320, new int[]{8}, (byte) -5, 400, 10);
        qd.a(25, 0, 0, new int[]{}, (byte) -5, 200, 11);
        qd.a(25, 0, 500, new int[]{30, 28, 29, 9}, (byte) -5, 200, 12);
        qd.a(25, 0, 400, new int[]{21, 22, 32, 7, 27, 9}, (byte) -5, 200, 13);
    }
}
