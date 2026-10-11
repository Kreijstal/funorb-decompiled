/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pw extends ana {
    static String field_A;
    static boolean field_z;
    static uha field_w;
    static kv field_y;
    static int field_x;
    private ak field_v;

    pw(gj param0, ak param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
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
        int[] var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var45 = 0;
        int var46 = 0;
        var47 = BachelorFridge.field_y;
        try {
          var8_int = 0;
          var9 = param5;
          var10 = 0;
          var11 = param1 - param6;
          var12 = param5 - param6;
          var13 = param1 * param1;
          var14 = param5 * param5;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 1;
          var18 = var13 << 1;
          var19 = var16 << 1;
          var20 = var15 << 1;
          var21 = param5 << 1;
          var22 = var12 << 1;
          var23 = var17 + var13 * (1 - var21);
          var24 = -(var18 * (var21 - 1)) + var14;
          var25 = var15 * (1 - var22) + var19;
          var26 = -((-1 + var22) * var20) + var16;
          var27 = var13 << 2;
          var28 = var14 << 2;
          var29 = var15 << 2;
          var30 = var16 << 2;
          var31 = 3 * var17;
          var32 = var18 * (-3 + var21);
          var33 = 3 * var19;
          if (!param0) {
            return;
          }
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param5);
          var37 = var30;
          var38 = (-1 + var12) * var29;
          var49 = tj.field_b[param4];
          var48 = var49;
          var39 = var48;
          hba.a(param2, -param1 + param7, var39, 7, param7 - var11);
          hba.a(param3, param7 - var11, var49, 7, param7 + var11);
          hba.a(param2, param7 + var11, var49, 7, param1 + param7);
          while (true) {
            if (0 >= var9) {
              return;
            }
            stackIn_8_0 = (var9 > var12) ? 0 : 1;
            var40 = stackIn_8_0;
            if (var40 != 0) {
              if (0 > var25) {
                while (var25 < 0) {
                  var25 = var25 + var33;
                  var26 = var26 + var37;
                  var10++;
                  var33 = var33 + var30;
                  var37 = var37 + var30;
                }
              }
              if (0 > var26) {
                var26 = var26 + var37;
                var25 = var25 + var33;
                var37 = var37 + var30;
                var33 = var33 + var30;
                var10++;
              }
              var25 = var25 - var38;
              var26 = var26 - var34;
              var34 = var34 - var29;
              var38 = var38 - var29;
            }
            if (var23 < 0) {
              while (var23 < 0) {
                var24 = var24 + var35;
                var23 = var23 + var31;
                var8_int++;
                var31 = var31 + var28;
                var35 = var35 + var28;
              }
            }
            if (0 > var24) {
              var24 = var24 + var35;
              var23 = var23 + var31;
              var8_int++;
              var35 = var35 + var28;
              var31 = var31 + var28;
            }
            var24 = var24 - var32;
            var23 = var23 - var36;
            var32 = var32 - var27;
            var9--;
            var36 = var36 - var27;
            var41 = param4 - var9;
            var42 = var9 + param4;
            var43 = var8_int + param7;
            var44 = param7 - var8_int;
            if (var40 == 0) {
              hba.a(param2, var44, tj.field_b[var41], 7, var43);
              hba.a(param2, var44, tj.field_b[var42], 7, var43);
              continue;
            }
            var45 = param7 + var10;
            var46 = -var10 + param7;
            hba.a(param2, var44, tj.field_b[var41], 7, var46);
            hba.a(param3, var46, tj.field_b[var41], 7, var45);
            hba.a(param2, var45, tj.field_b[var41], 7, var43);
            hba.a(param2, var44, tj.field_b[var42], 7, var46);
            hba.a(param3, var46, tj.field_b[var42], 7, var45);
            hba.a(param2, var45, tj.field_b[var42], 7, var43);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var8), "pw.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            this.field_q.field_s.field_F = 0;
            this.e((byte) -85);
            this.e(-1);
            return false;
          }
          return false;
        }
        this.f((byte) 61);
        int var2 = -95 % ((71 - param0) / 47);
        return true;
    }

    private final void e(byte param0) {
        int var10 = 0;
        int var11 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var12;
        int var13;
        aca var14;
        int var15;
        op var17;
        int[][] var20;
        var15 = BachelorFridge.field_y;
        al.a(-32, this.field_v.field_k);
        var17 = this.field_q.field_h;
        this.field_v.field_l.a(123, this.field_q.field_h);
        var20 = this.field_v.d(1);
        var4 = this.field_v.field_r;
        var5 = this.field_v.field_s;
        this.a(param0 ^ -27844, new taa(this.field_q, var4, var5));
        this.field_v.a(this.field_q.field_h, false);
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> 1;
        var9 = -1 + var7 >> 1;
        for (var10 = 0; var6 > var10; var10++) {
          for (var11 = 0; var7 > var11; var11++) {
            if (var20[var10][var11] == 1) {
              var12 = var4 + var10 - var8;
              var13 = var11 - var9 + var5;
              if (var12 >= 0 &&
                var17.field_z > var12 &&
                0 <= var13 &&
                var17.field_B > var13) {
                var14 = new aca(this.field_q, var12, var13, true);
                ((kj) ((Object) var14)).a(0);
              }
            }
          }
        }
        if (param0 == -85) {
          return;
        }
        this.c((byte) 19);
    }

    private final void e(int param0) {
        pp var3 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 != -1) {
          return;
        }
        aga var2 = this.field_v.field_l.a(81, this.field_q.field_h);
        if (!var2.i(param0 - 93)) {
          var3 = (pp) (this.field_v.field_o.b((byte) 90));
          al.a(param0 - 69, this.field_v.field_k);
          while (var3 != null) {
            var3.a(var2, this.field_q.field_h, 12);
            var3 = (pp) (this.field_v.field_o.c(0));
          }
          return;
        }
    }

    public static void d(int param0) {
        field_y = null;
        if (param0 > -110) {
          return;
        }
        field_A = null;
        field_w = null;
    }

    private final void f(byte param0) {
        int var2 = 28 % ((param0 + 12) / 40);
    }

    static {
        field_z = true;
        field_x = 100;
    }
}
