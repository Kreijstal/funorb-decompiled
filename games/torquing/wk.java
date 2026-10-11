/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk implements si {
    static int field_d;
    private cf field_e;
    static ei field_a;
    private la field_f;
    private int field_g;
    private un[] field_b;
    private la field_c;
    static int field_h;

    public final un a(int param0, byte param1) {
        if (param1 != 98) {
          return (un) null;
        }
        return this.field_b[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var43Lifetime1;
        var47 = Torquing.field_u;
        try {
          var8_int = param6;
          var9 = param7;
          var10 = 0;
          var11 = param5 - param0;
          var12 = -param0 + param7;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 1;
          var18 = var13 << 1;
          var19 = var16 << 1;
          var20 = var15 << 1;
          var21 = param7 << 1;
          var22 = var12 << 1;
          var23 = var17 + var13 * (-var21 + 1);
          var24 = var14 - var18 * (-1 + var21);
          var25 = (1 - var22) * var15 + var19;
          var26 = -((var22 - 1) * var20) + var16;
          var27 = var13 << 2;
          var28 = var14 << 2;
          var29 = var15 << 2;
          var30 = var16 << 2;
          var31 = 3 * var17;
          var32 = (var21 - 3) * var18;
          var33 = var19 * 3;
          var34 = (var22 - 3) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (-1 + var12);
          if (param3 >= j.field_q &&
            qk.field_p >= param3) {
            var57 = qd.field_a[param3];
            var40 = ln.a(qg.field_z, kn.field_e, param4 - param5, 87);
            var41 = ln.a(qg.field_z, kn.field_e, param4 + param5, 105);
            var42 = ln.a(qg.field_z, kn.field_e, param4 - var11, param6 + 88);
            var43 = ln.a(qg.field_z, kn.field_e, param4 + var11, 85);
            di.a(var40, (byte) 92, param1, var57, var42);
            di.a(var42, (byte) 30, param2, var57, var43);
            di.a(var43, (byte) -125, param1, var57, var41);
          }
          while (true) {
            if (var9 <= 0) {
              return;
            }
            stackIn_8_0 = (var9 > var12) ? 0 : 1;
            var39 = stackIn_8_0;
            if (var39 != 0) {
              if (0 > var25) {
                while (var25 < 0) {
                  var25 = var25 + var33;
                  var26 = var26 + var37;
                  var33 = var33 + var30;
                  var10++;
                  var37 = var37 + var30;
                }
              }
              if (var26 < 0) {
                var25 = var25 + var33;
                var26 = var26 + var37;
                var37 = var37 + var30;
                var10++;
                var33 = var33 + var30;
              }
              var26 = var26 - var34;
              var25 = var25 - var38;
              var38 = var38 - var29;
              var34 = var34 - var29;
            }
            if (var23 < 0) {
              while (var23 < 0) {
                var24 = var24 + var35;
                var23 = var23 + var31;
                var8_int++;
                var35 = var35 + var28;
                var31 = var31 + var28;
              }
            }
            if (0 > var24) {
              var23 = var23 + var31;
              var24 = var24 + var35;
              var31 = var31 + var28;
              var8_int++;
              var35 = var35 + var28;
            }
            var23 = var23 - var36;
            var24 = var24 - var32;
            var36 = var36 - var27;
            var9--;
            var32 = var32 - var27;
            var40Lifetime1 = -var9 + param3;
            var41Lifetime1 = var9 + param3;
            if (j.field_q > var41Lifetime1) {
              continue;
            }
            if (qk.field_p < var40Lifetime1) {
              continue;
            }
            var42Lifetime1 = ln.a(qg.field_z, kn.field_e, param4 + var8_int, 111);
            var43Lifetime1 = ln.a(qg.field_z, kn.field_e, -var8_int + param4, 118);
            if (var39 == 0) {
              if (var40Lifetime1 >= j.field_q) {
                di.a(var43Lifetime1, (byte) 66, param1, qd.field_a[var40Lifetime1], var42Lifetime1);
              }
              if (qk.field_p < var41Lifetime1) {
                continue;
              }
              di.a(var43Lifetime1, (byte) 23, param1, qd.field_a[var41Lifetime1], var42Lifetime1);
              continue;
            }
            var44 = ln.a(qg.field_z, kn.field_e, var10 + param4, 104);
            var45 = ln.a(qg.field_z, kn.field_e, -var10 + param4, 70);
            if (j.field_q <= var40Lifetime1) {
              var58 = qd.field_a[var40Lifetime1];
              di.a(var43Lifetime1, (byte) -100, param1, var58, var45);
              di.a(var45, (byte) 59, param2, var58, var44);
              di.a(var44, (byte) -115, param1, var58, var42Lifetime1);
            }
            if (qk.field_p < var41Lifetime1) {
              continue;
            }
            var59 = qd.field_a[var41Lifetime1];
            di.a(var43Lifetime1, (byte) -111, param1, var59, var45);
            di.a(var45, (byte) -96, param2, var59, var44);
            di.a(var44, (byte) -116, param1, var59, var42Lifetime1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var8), "wk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, t[] param1, t[] param2, int param3, int param4, int param5, int param6, boolean param7, int param8, int param9, int param10, uc param11, int param12, int param13, uc param14) {
        t[] var16 = (t[]) null;
        pl.a(param12, 0, param4, (t[]) null, param13, param1, cc.field_c, qa.field_l, param14, param2, param3, param11, param0, 0, param9, param6, param10, 480, uf.field_c, param5, 127);
        if (param8 <= 109) {
          return;
        }
        try {
          Torquing.a(-49, param7);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "wk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0, int param1) {
        wd var3;
        boolean stackIn_6_0 = false;
        if (param1 != 3) {
          return true;
        }
        var3 = this.a((byte) 100, param0);
        stackIn_6_0 = (var3 != null) && (var3.a(param1 + 43, this.field_c, (si) (this)));
        return stackIn_6_0;
    }

    public final int[] a(byte param0, int param1, boolean param2, float param3, int param4, int param5) {
        if (param0 >= -2) {
          return (int[]) null;
        }
        return this.a((byte) 52, param4).a(this.field_b[param4].field_e, this.field_c, param1, (double)param3, param2, 0, (si) (this), param5);
    }

    public static void a(byte param0) {
        if (param0 > -63) {
          uc var2 = (uc) null;
          wk.a(102, (t[]) null, (t[]) null, -29, -22, -52, 122, false, 50, -59, -118, (uc) null, -35, 64, (uc) null);
        }
        field_a = null;
    }

    wd a(byte param0, int param1) {
        ta var3 = this.field_e.a((long)param1, 4604);
        if (var3 != null) {
          return (wd) (var3);
        }
        byte[] var4 = this.field_f.b(param1, (byte) 89);
        if (param0 < 19) {
          this.a(60, (byte) 74);
        }
        if (var4 == null) {
          return null;
        }
        wd var5 = new wd(new fj(var4));
        this.field_e.a((long)param1, var5, 0);
        return var5;
    }

    wk(la param0, la param1, la param2) {
        un stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        un stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        un stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        fj var7 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var5Lifetime9;
        int var5Lifetime10;
        int var5Lifetime11;
        int var5Lifetime12;
        int var5Lifetime13;
        int var5Lifetime14;
        int var5Lifetime15;
        int var5Lifetime16;
        int var5Lifetime17;
        int var5Lifetime18;
        int var5Lifetime19;
        this.field_e = new cf(256);
        try {
          this.field_c = param2;
          this.field_f = param1;
          var7 = new fj(param0.a(0, 100, 0));
          this.field_g = var7.i(7088);
          this.field_b = new un[this.field_g];
          for (var5 = 0; var5 < this.field_g; var5++) {
            if (1 == var7.i((byte) -101)) {
              this.field_b[var5] = new un();
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_g; var5Lifetime1++) {
            if (this.field_b[var5Lifetime1] != null) {
              stackIn_11_0 = this.field_b[var5Lifetime1];
              stackIn_12_1 = (var7.i((byte) -101) == 0);
              stackIn_11_0.field_g = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; this.field_g > var5Lifetime2; var5Lifetime2++) {
            if (this.field_b[var5Lifetime2] != null) {
              stackIn_19_0 = this.field_b[var5Lifetime2];
              stackIn_20_1 = (1 == var7.i((byte) -101));
              stackIn_19_0.field_h = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; var5Lifetime3 < this.field_g; var5Lifetime3++) {
            if (this.field_b[var5Lifetime3] != null) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime4 = 0; var5Lifetime4 < this.field_g; var5Lifetime4++) {
            if (null != this.field_b[var5Lifetime4]) {
              var7.f((byte) 113);
            }
          }
          for (var5Lifetime5 = 0; this.field_g > var5Lifetime5; var5Lifetime5++) {
            if (null != this.field_b[var5Lifetime5]) {
              var7.f((byte) 106);
            }
          }
          for (var5Lifetime6 = 0; this.field_g > var5Lifetime6; var5Lifetime6++) {
            if (null != this.field_b[var5Lifetime6]) {
              var7.f((byte) 80);
            }
          }
          for (var5Lifetime7 = 0; this.field_g > var5Lifetime7; var5Lifetime7++) {
            if (null != this.field_b[var5Lifetime7]) {
              var7.f((byte) 73);
            }
          }
          for (var5Lifetime8 = 0; this.field_g > var5Lifetime8; var5Lifetime8++) {
            if (null != this.field_b[var5Lifetime8]) {
              this.field_b[var5Lifetime8].field_d = (short)var7.i(7088);
            }
          }
          for (var5Lifetime9 = 0; var5Lifetime9 < this.field_g; var5Lifetime9++) {
            if (null != this.field_b[var5Lifetime9]) {
              var7.f((byte) 93);
            }
          }
          for (var5Lifetime10 = 0; this.field_g > var5Lifetime10; var5Lifetime10++) {
            if (null != this.field_b[var5Lifetime10]) {
              var7.f((byte) 30);
            }
          }
          for (var5Lifetime11 = 0; this.field_g > var5Lifetime11; var5Lifetime11++) {
            if (null != this.field_b[var5Lifetime11]) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime12 = 0; this.field_g > var5Lifetime12; var5Lifetime12++) {
            if (null != this.field_b[var5Lifetime12]) {
              stackIn_72_0 = this.field_b[var5Lifetime12];
              stackIn_73_1 = (var7.i((byte) -101) == 1);
              stackIn_72_0.field_e = stackIn_73_1;
            }
          }
          for (var5Lifetime13 = 0; this.field_g > var5Lifetime13; var5Lifetime13++) {
            if (this.field_b[var5Lifetime13] != null) {
              var7.f((byte) 104);
            }
          }
          for (var5Lifetime14 = 0; var5Lifetime14 < this.field_g; var5Lifetime14++) {
            if (this.field_b[var5Lifetime14] != null) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime15 = 0; this.field_g > var5Lifetime15; var5Lifetime15++) {
            if (null != this.field_b[var5Lifetime15]) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime16 = 0; this.field_g > var5Lifetime16; var5Lifetime16++) {
            if (null != this.field_b[var5Lifetime16]) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime17 = 0; var5Lifetime17 < this.field_g; var5Lifetime17++) {
            if (null != this.field_b[var5Lifetime17]) {
              var7.i((byte) -101);
            }
          }
          for (var5Lifetime18 = 0; var5Lifetime18 < this.field_g; var5Lifetime18++) {
            if (null != this.field_b[var5Lifetime18]) {
              var7.c((byte) -56);
            }
          }
          for (var5Lifetime19 = 0; var5Lifetime19 < this.field_g; var5Lifetime19++) {
            if (this.field_b[var5Lifetime19] != null) {
              this.field_b[var5Lifetime19].field_j = var7.i((byte) -101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_113_0 = var4;
          stackIn_113_1 = new StringBuilder().append("wk.<init>(");
          if (param0 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',');
          if (param1 == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          stackIn_119_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',');
          if (param2 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    static {
        field_h = -1;
        field_a = new ei();
    }
}
