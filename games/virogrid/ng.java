/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends nk {
    static el field_N;
    static int field_X;
    private String field_W;
    private le field_R;
    static eh field_T;
    private mg field_S;
    static String field_Y;
    static volatile int field_Q;
    static km field_Z;
    static int[] field_O;
    private int field_U;
    static int field_P;

    public static void g(boolean param0) {
        if (!param0) {
          field_N = null;
          field_T = null;
          field_Z = null;
          field_O = null;
          field_Y = null;
          return;
        }
        field_N = (el) null;
        field_N = null;
        field_T = null;
        field_Z = null;
        field_O = null;
        field_Y = null;
    }

    ng(le param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, md.a((byte) -108));
        try {
          this.field_R = param0;
          this.field_W = param1;
          this.a(param5, true, param3, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5;
        wl var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        mg var16;
        String var17;
        Object var18;
        mg var19;
        mg var20;
        mg var21;
        Object var22;
        mg var23;
        mg var24;
        mg var25;
        mg var26;
        Object var27;
        mg var28;
        mg var29;
        mg var30;
        gm var31;
        gm var32;
        gm var33;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        wl var6Lifetime1;
        wl var6Lifetime2;
        var18 = null;
        var22 = null;
        var27 = null;
        var13 = Virogrid.field_F ? 1 : 0;
        var6 = this.field_R.a(-22243);
        if (var6 == gd.field_r) {
          var17 = eg.field_s;
          if (!var17.equals(this.field_n)) {
            this.field_n = var17;
            this.e(-115);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.a(param0 - 22280);
          var31 = (gm) ((Object) this.field_w);
          var9 = this.field_l + param1;
          var10 = var31.b(-587719039, (fi) (this), param2) + (var31.a((fi) (this), (byte) -123).a((byte) 20) >> 1);
          if (gd.field_r != var6 &&
            te.field_d != var6) {
            if (var6 == ee.field_c) {
              var20 = bf.field_p[2];
              var20.e(var9, var10 - (var20.field_p >> 1), 256);
              return;
            }
            if (bm.field_i != var6) {
              return;
            }
            var19 = bf.field_p[1];
            var19.e(var9, var10 - (var19.field_p >> 1), 256);
            return;
          }
          var21 = bf.field_p[0];
          var11 = var21.field_u << 1;
          var12 = var21.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new mg(var11, var12);
            kb.a(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11) {
              this.field_S = new mg(var11, var12);
              kb.a(this.field_S, 16865);
            } else {
              if (var12 > this.field_S.field_p) {
                this.field_S = new mg(var11, var12);
                kb.a(this.field_S, 16865);
              } else {
                kb.a(this.field_S, 16865);
                df.c();
              }
            }
          }
          var21.a(112, 144, var21.field_u << 4, var21.field_z << 4, -this.field_U << 10, 4096);
          ai.a(true);
          this.field_S.e(var9 - (var21.field_u >> 1), -var21.field_z + var10, 256);
          return;
        }
        if (te.field_d != var6) {
          var5 = this.field_R.b(28433);
          if (var5 == null) {
            var5 = this.field_W;
          }
        } else {
          var5 = eg.field_s;
        }
        if (!var5.equals(this.field_n)) {
          this.field_n = var5;
          this.e(-115);
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_R.a(param0 - 22280);
          var33 = (gm) ((Object) this.field_w);
          var9Lifetime1 = this.field_l + param1;
          var10Lifetime1 = var33.b(-587719039, (fi) (this), param2) + (var33.a((fi) (this), (byte) -123).a((byte) 20) >> 1);
          if (gd.field_r != var6Lifetime1 &&
            te.field_d != var6Lifetime1) {
            if (var6Lifetime1 == ee.field_c) {
              var29 = bf.field_p[2];
              var29.e(var9Lifetime1, var10Lifetime1 - (var29.field_p >> 1), 256);
              return;
            }
            if (bm.field_i != var6Lifetime1) {
              return;
            }
            var28 = bf.field_p[1];
            var28.e(var9Lifetime1, var10Lifetime1 - (var28.field_p >> 1), 256);
            return;
          }
          var30 = bf.field_p[0];
          var11Lifetime1 = var30.field_u << 1;
          var12Lifetime1 = var30.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new mg(var11Lifetime1, var12Lifetime1);
            kb.a(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11Lifetime1) {
              this.field_S = new mg(var11Lifetime1, var12Lifetime1);
              kb.a(this.field_S, 16865);
            } else {
              if (var12Lifetime1 <= this.field_S.field_p) {
                kb.a(this.field_S, 16865);
                df.c();
              } else {
                this.field_S = new mg(var11Lifetime1, var12Lifetime1);
                kb.a(this.field_S, 16865);
              }
            }
          }
          var30.a(112, 144, var30.field_u << 4, var30.field_z << 4, -this.field_U << 10, 4096);
          ai.a(true);
          this.field_S.e(var9Lifetime1 - (var30.field_u >> 1), -var30.field_z + var10Lifetime1, 256);
          return;
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_R.a(param0 - 22280);
        var32 = (gm) ((Object) this.field_w);
        var9Lifetime2 = this.field_l + param1;
        var10Lifetime2 = var32.b(-587719039, (fi) (this), param2) + (var32.a((fi) (this), (byte) -123).a((byte) 20) >> 1);
        if (gd.field_r == var6Lifetime2) {
          var23 = bf.field_p[0];
          var11Lifetime2 = var23.field_u << 1;
          var12Lifetime2 = var23.field_z << 1;
          if (this.field_S == null) {
            this.field_S = new mg(var11Lifetime2, var12Lifetime2);
            kb.a(this.field_S, 16865);
          } else {
            if (this.field_S.field_w < var11Lifetime2) {
              this.field_S = new mg(var11Lifetime2, var12Lifetime2);
              kb.a(this.field_S, 16865);
            } else {
              if (var12Lifetime2 > this.field_S.field_p) {
                this.field_S = new mg(var11Lifetime2, var12Lifetime2);
                kb.a(this.field_S, 16865);
              } else {
                kb.a(this.field_S, 16865);
                df.c();
              }
            }
          }
          var23.a(112, 144, var23.field_u << 4, var23.field_z << 4, -this.field_U << 10, 4096);
          ai.a(true);
          this.field_S.e(var9Lifetime2 - (var23.field_u >> 1), -var23.field_z + var10Lifetime2, 256);
          return;
        }
        if (te.field_d != var6Lifetime2) {
          if (var6Lifetime2 == ee.field_c) {
            var26 = bf.field_p[2];
            var26.e(var9Lifetime2, var10Lifetime2 - (var26.field_p >> 1), 256);
            return;
          }
          if (bm.field_i != var6Lifetime2) {
            return;
          }
          var25 = bf.field_p[1];
          var25.e(var9Lifetime2, var10Lifetime2 - (var25.field_p >> 1), 256);
          return;
        }
        var24 = bf.field_p[0];
        var16 = var24;
        var11Lifetime3 = var24.field_u << 1;
        var12Lifetime3 = var24.field_z << 1;
        if (this.field_S == null) {
          this.field_S = new mg(var11Lifetime3, var12Lifetime3);
          kb.a(this.field_S, 16865);
        } else {
          if (this.field_S.field_w < var11Lifetime3) {
            this.field_S = new mg(var11Lifetime3, var12Lifetime3);
            kb.a(this.field_S, 16865);
          } else {
            if (var12Lifetime3 <= this.field_S.field_p) {
              kb.a(this.field_S, 16865);
              df.c();
            } else {
              this.field_S = new mg(var11Lifetime3, var12Lifetime3);
              kb.a(this.field_S, 16865);
            }
          }
        }
        var24.a(112, 144, var24.field_u << 4, var24.field_z << 4, -this.field_U << 10, 4096);
        ai.a(true);
        this.field_S.e(var9Lifetime2 - (var24.field_u >> 1), -var24.field_z + var10Lifetime2, 256);
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -8515) {
            var4 = (fi) null;
            this.a(-119, 56, (fi) null, -7);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ng.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
          this.field_U = this.field_U + 1;
          super.a(param0, 114, param2, param3);
          if (param1 < 113) {
            this.a((byte) -92, -86, 85, 41);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String d(int param0) {
        if (param0 >= 35) {
          return null;
        }
        this.a((byte) 91, -66, 2, -100);
        return null;
    }

    static {
        field_Y = "Friends";
        field_Q = 0;
        field_O = new int[4];
    }
}
