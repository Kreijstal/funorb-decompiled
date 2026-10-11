/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends j {
    static String field_w;
    static boolean field_x;
    static String field_u;
    static String field_t;
    static String field_v;

    final int a(ln param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_x;
          if (param0.field_u) {
            var3_int = var3_int * 2 + 5;
          }
          var3_int = var3_int + param0.field_D.length;
          if (param1 > -49) {
            field_v = (String) null;
          }
          var3_int = var3_int + this.a((byte) -64, param0);
          if (var3_int < 1) {
            var3_int = 1;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cj.GA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    cj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 2);
    }

    final int b(int param0, int param1) {
        int var7 = 0;
        fs stackIn_9_0 = null;
        fs stackIn_9_1 = null;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int var3;
        ln var4;
        int var5;
        ln[] var6;
        ln var8;
        int var9;
        ln[] var10;
        int var11;
        ln var12;
        int var13;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        if (param1 != -1799) {
          return -61;
        }
        while (true) {
          if (var4 == null) {
            return var3;
          }
          if (param0 == 0) {
            return var3;
          }
          var5 = 0;
          var6 = var4.field_D;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            stackIn_9_0 = var8.field_y;
            stackIn_9_1 = this.field_n;
            if (stackIn_9_0 == stackIn_9_1) {
              var9 = 0;
              var10 = var8.field_D;
              var11 = 0;
              while (true) {
                if (var10.length > var11) {
                  var12 = var10[var11];
                  if (this.field_n != var12.field_y &&
                    null != var12.field_y &&
                    !this.field_n.field_h[var12.field_y.field_x]) {
                    var9 = 1;
                  } else {
                    var11++;
                    continue;
                  }
                }
                break;
              }
              stackIn_26_0 = var5;
              if (var9 == 0) {
                stackIn_27_1 = 1;
              } else {
                stackIn_27_1 = 2;
              }
              var5 = stackIn_26_0 + stackIn_27_1;
            }
          }
          var5 = var5 >> 1;
          if (param0 < var5) {
            var5 = param0;
          }
          wb.field_b[var4.field_p] = wb.field_b[var4.field_p] + var5;
          param0 = param0 - var5;
          var3 = var3 + var5;
          var4 = mj.field_yb.h(-23410);
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        field_t = null;
        field_u = null;
        if (param0) {
          qr var2 = (qr) null;
          cj.a(40, -110, (qr) null);
        }
        field_v = null;
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            cj.c(true);
          }
          var3_int = param0.field_x + param0.field_D.length;
          stackIn_5_0 = (var3_int == 0) ? 1 : var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cj.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int var6 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int var2;
        int var4;
        int var5;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -18484) {
          this.a((byte) -16, -120);
        }
        this.field_k = -1;
        var2 = this.field_g.field_r;
        for (var3 = 0; var3 < var2; var3++) {
          var4 = this.field_g.field_m[var2 - 1 - var3];
          if (this.field_n.field_x != var4 &&
            !this.field_n.field_h[var4] &&
            (this.field_g.field_w & 1 << var4) == 0) {
            var5 = 1;
            for (var6 = 0; this.field_g.field_r > var6; var6++) {
              if (~var3 != ~var6 &&
                this.field_g.field_v[var3].field_h[var6] ||
                (1 << var6 & this.field_g.field_w) != 0) {
                var5 = 0;
              }
            }
            stackIn_27_0 = this.field_b;
            stackIn_27_1 = var3;
            if (var5 == 0) {
              stackIn_28_2 = 4;
            } else {
              stackIn_28_2 = -3;
            }
            stackIn_27_0[stackIn_27_1] = stackIn_28_2;
            if (this.field_g.field_D[this.field_n.field_x] > 2 * this.field_g.field_D[var3]) {
              this.field_b[var3] = 3;
              var5 = 0;
            }
            if (var5 != 0 &&
              -1 == this.field_k) {
              this.field_k = var3;
            }
          }
        }
    }

    final static void a(int param0, int param1, qr param2) {
        fc var11 = null;
        bi var12 = null;
        String var13 = null;
        fc var14 = null;
        bi var15 = null;
        String var16 = null;
        fc var17 = null;
        bi var18 = null;
        String var19 = null;
        fc var20 = null;
        String var22 = null;
        fc var23 = null;
        bi var24 = null;
        String var25 = null;
        fc var26 = null;
        bi var27 = null;
        String var28 = null;
        fc var29 = null;
        String var31 = null;
        fc var32 = null;
        bi var33 = null;
        String var34 = null;
        fc var35 = null;
        bi var36 = null;
        String var37 = null;
        fc var38 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var21 = null;
        bi var30 = null;
        bi var21Lifetime1;
        bi var30Lifetime1;
        bi var30Lifetime2;
        bi var21Lifetime2;
        bi var21Lifetime3;
        bi var21Lifetime4;
        bi var21Lifetime5;
        bi var21Lifetime6;
        bi var30Lifetime3;
        bi var30Lifetime4;
        bi var30Lifetime1Lifetime1;
        bi var30Lifetime1Lifetime2;
        bi var30Lifetime1Lifetime3;
        bi var30Lifetime1Lifetime4;
        bi var30Lifetime1Lifetime5;
        try {
          tp.a((int[]) null, 0L, (String) null, (String) null, 293, (ub) null, param2, param0, -1);
          if (0 == param0) {
            var11 = hp.field_m;
            var12 = bh.field_m[0];
            var21 = var12;
            var30 = var21;
            var21Lifetime2 = var12;
            var13 = wi.field_a;
            var11.field_j.a(false, var12, var13, 11);
            var14 = hp.field_m;
            var15 = bh.field_m[1];
            var21Lifetime3 = var15;
            var30Lifetime3 = var21Lifetime3;
            var21Lifetime4 = var15;
            var16 = ts.field_H;
            var14.field_j.a(false, var15, var16, 12);
            var17 = hp.field_m;
            var18 = bh.field_m[2];
            var21Lifetime5 = var18;
            var30Lifetime4 = var21Lifetime5;
            var21Lifetime6 = var18;
            var19 = ah.field_O;
            var17.field_j.a(false, var18, var19, 13);
          }
          if (param0 == 1) {
            var20 = hp.field_m;
            var21Lifetime1 = bh.field_m[0];
            var30Lifetime1 = var21Lifetime1;
            var30Lifetime1Lifetime1 = var21Lifetime1;
            var22 = hk.field_pb;
            var20.field_j.a(false, var21Lifetime1, var22, 11);
            var23 = hp.field_m;
            var24 = bh.field_m[1];
            var30Lifetime1Lifetime2 = var24;
            var30Lifetime1Lifetime3 = var24;
            var25 = so.field_s;
            var23.field_j.a(false, var24, var25, 12);
            var26 = hp.field_m;
            var27 = bh.field_m[2];
            var30Lifetime1Lifetime4 = var27;
            var30Lifetime1Lifetime5 = var27;
            var28 = gn.field_A;
            var26.field_j.a(false, var27, var28, 13);
          }
          if (2 == param0) {
            var29 = hp.field_m;
            var30Lifetime2 = bh.field_m[0];
            var31 = sj.field_d;
            var29.field_j.a(false, var30Lifetime2, var31, 11);
            var32 = hp.field_m;
            var33 = bh.field_m[1];
            var34 = field_w;
            var32.field_j.a(false, var33, var34, 12);
            var35 = hp.field_m;
            var36 = bh.field_m[2];
            var37 = up.field_c;
            var35.field_j.a(false, var36, var37, 13);
          }
          var38 = hp.field_m;
          if (param1 > -107) {
            field_v = (String) null;
          }
          var4 = param2.field_B;
          var5 = param2.field_N;
          var6 = param2.field_K;
          var7 = param2.field_mb;
          var38.field_j.b(var6, var7, 0, var4, var5);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "cj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var8 = 0;
        int var3;
        ln var4;
        int var5;
        int var6;
        ln[] var7_ref_ln__;
        ln var9;
        int var10;
        int var7;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= -29) {
          this.g(-98);
        }
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        while (var4 != null) {
          var5 = var4.field_p;
          var6 = 0;
          var7_ref_ln__ = var4.field_D;
          for (var8 = 0; var7_ref_ln__.length > var8; var8++) {
            var9 = var7_ref_ln__[var8];
            if (this.field_n != var9.field_y) {
              var6++;
            }
          }
          ja.field_i[var5] = ja.field_i[var5] + var4.field_x;
          wb.field_b[var5] = var6;
          var7 = var6 - var4.field_x;
          var4 = mj.field_yb.h(-23410);
          var3 = var3 + var7;
        }
        return var3;
    }

    static {
        field_w = "Show private chat from my friends and opponents";
        field_t = "Sol is unoccupied";
        field_v = "Menu";
    }
}
