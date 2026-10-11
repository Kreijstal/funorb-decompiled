/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends mh {
    static ko field_W;
    private dd field_U;
    private String field_X;
    private int field_V;
    static String[] field_R;
    static String[] field_T;
    private ip field_S;
    static ko[] field_Y;

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 103 % ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ck.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
          this.field_V = this.field_V + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ck.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ck(ip param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ub.c(4));
        try {
          this.field_S = param0;
          this.field_X = param1;
          this.a(param4, param2, param5, false, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5;
        na var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        String var18;
        Object var19;
        dd var20;
        dd var21;
        dd var22;
        dd var23;
        String var24;
        Object var25;
        dd var26;
        dd var27;
        dd var28;
        dd var29;
        Object var30;
        dd var31;
        dd var32;
        dd var33;
        dd var34;
        io var35;
        io var36;
        io var37;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var12Lifetime4;
        int var13Lifetime4;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        na var6Lifetime1;
        var19 = null;
        var25 = null;
        var30 = null;
        var14 = Pool.field_O;
        var6 = this.field_S.c(-31873);
        if (var6 == ji.field_h) {
          var18 = oi.field_r;
          if (!var18.equals(this.field_m)) {
            this.field_m = var18;
            this.g((byte) 33);
          }
          super.a(param0, (byte) 112, param2, param3);
          var6 = this.field_S.c(-31873);
          var35 = (io) ((Object) this.field_z);
          var10 = -91 % ((-42 - param1) / 53);
          var9 = this.field_C + param2;
          var11 = var35.a(param3, (ei) (this), (byte) -7) + (var35.b(0, (ei) (this)).a((byte) 66) >> 1);
          if (ji.field_h == var6) {
            var21 = bo.field_a[0];
            var12 = var21.field_w << 1;
            var13 = var21.field_y << 1;
            if (this.field_U == null) {
              this.field_U = new dd(var12, var13);
              kj.a(81, this.field_U);
            } else {
              if (this.field_U.field_z < var12) {
                this.field_U = new dd(var12, var13);
                kj.a(81, this.field_U);
              } else {
                if (var13 <= this.field_U.field_A) {
                  kj.a(53, this.field_U);
                  qh.d();
                } else {
                  this.field_U = new dd(var12, var13);
                  kj.a(81, this.field_U);
                }
              }
            }
            var21.b(112, 144, var21.field_w << 4, var21.field_y << 4, -this.field_V << 10, 4096);
            oc.a(126);
            this.field_U.c(var9 - (var21.field_w >> 1), var11 - var21.field_y, 256);
            return;
          }
          if (no.field_k != var6) {
            if (gp.field_d == var6) {
              var22 = bo.field_a[2];
              var22.c(var9, var11 - (var22.field_A >> 1), 256);
              return;
            }
            if (kr.field_e != var6) {
              return;
            }
            var23 = bo.field_a[1];
            var23.c(var9, var11 - (var23.field_A >> 1), 256);
            return;
          }
          var20 = bo.field_a[0];
          var12Lifetime4 = var20.field_w << 1;
          var13Lifetime4 = var20.field_y << 1;
          if (this.field_U != null &&
            this.field_U.field_z >= var12Lifetime4 &&
            var13Lifetime4 <= this.field_U.field_A) {
            kj.a(53, this.field_U);
            qh.d();
          } else {
            this.field_U = new dd(var12Lifetime4, var13Lifetime4);
            kj.a(81, this.field_U);
          }
          var20.b(112, 144, var20.field_w << 4, var20.field_y << 4, -this.field_V << 10, 4096);
          oc.a(126);
          this.field_U.c(var9 - (var20.field_w >> 1), var11 - var20.field_y, 256);
          return;
        }
        if (var6 == no.field_k) {
          var24 = oi.field_r;
          if (!var24.equals(this.field_m)) {
            this.field_m = var24;
            this.g((byte) 33);
          }
          super.a(param0, (byte) 112, param2, param3);
          var6 = this.field_S.c(-31873);
          var36 = (io) ((Object) this.field_z);
          var10Lifetime1 = -91 % ((-42 - param1) / 53);
          var9Lifetime1 = this.field_C + param2;
          var11Lifetime1 = var36.a(param3, (ei) (this), (byte) -7) + (var36.b(0, (ei) (this)).a((byte) 66) >> 1);
          if (ji.field_h == var6) {
            var27 = bo.field_a[0];
            var12Lifetime1 = var27.field_w << 1;
            var13Lifetime1 = var27.field_y << 1;
            if (this.field_U == null) {
              this.field_U = new dd(var12Lifetime1, var13Lifetime1);
              kj.a(81, this.field_U);
            } else {
              if (this.field_U.field_z < var12Lifetime1) {
                this.field_U = new dd(var12Lifetime1, var13Lifetime1);
                kj.a(81, this.field_U);
              } else {
                if (var13Lifetime1 <= this.field_U.field_A) {
                  kj.a(53, this.field_U);
                  qh.d();
                } else {
                  this.field_U = new dd(var12Lifetime1, var13Lifetime1);
                  kj.a(81, this.field_U);
                }
              }
            }
            var27.b(112, 144, var27.field_w << 4, var27.field_y << 4, -this.field_V << 10, 4096);
            oc.a(126);
            this.field_U.c(var9Lifetime1 - (var27.field_w >> 1), var11Lifetime1 - var27.field_y, 256);
            return;
          }
          if (no.field_k != var6) {
            if (gp.field_d == var6) {
              var28 = bo.field_a[2];
              var28.c(var9Lifetime1, var11Lifetime1 - (var28.field_A >> 1), 256);
              return;
            }
            if (kr.field_e != var6) {
              return;
            }
            var29 = bo.field_a[1];
            var29.c(var9Lifetime1, var11Lifetime1 - (var29.field_A >> 1), 256);
            return;
          }
          var26 = bo.field_a[0];
          var12Lifetime1Lifetime1 = var26.field_w << 1;
          var13Lifetime1Lifetime1 = var26.field_y << 1;
          if (this.field_U != null &&
            this.field_U.field_z >= var12Lifetime1Lifetime1 &&
            var13Lifetime1Lifetime1 <= this.field_U.field_A) {
            kj.a(53, this.field_U);
            qh.d();
          } else {
            this.field_U = new dd(var12Lifetime1Lifetime1, var13Lifetime1Lifetime1);
            kj.a(81, this.field_U);
          }
          var26.b(112, 144, var26.field_w << 4, var26.field_y << 4, -this.field_V << 10, 4096);
          oc.a(126);
          this.field_U.c(var9Lifetime1 - (var26.field_w >> 1), var11Lifetime1 - var26.field_y, 256);
          return;
        }
        var5 = this.field_S.a(126);
        if (var5 == null) {
          var5 = this.field_X;
        }
        if (!var5.equals(this.field_m)) {
          this.field_m = var5;
          this.g((byte) 33);
        }
        super.a(param0, (byte) 112, param2, param3);
        var6Lifetime1 = this.field_S.c(-31873);
        var37 = (io) ((Object) this.field_z);
        var10Lifetime2 = -91 % ((-42 - param1) / 53);
        var9Lifetime2 = this.field_C + param2;
        var11Lifetime2 = var37.a(param3, (ei) (this), (byte) -7) + (var37.b(0, (ei) (this)).a((byte) 66) >> 1);
        if (ji.field_h == var6Lifetime1) {
          var32 = bo.field_a[0];
          var12Lifetime2 = var32.field_w << 1;
          var13Lifetime2 = var32.field_y << 1;
          if (this.field_U == null) {
            this.field_U = new dd(var12Lifetime2, var13Lifetime2);
            kj.a(81, this.field_U);
          } else {
            if (this.field_U.field_z < var12Lifetime2) {
              this.field_U = new dd(var12Lifetime2, var13Lifetime2);
              kj.a(81, this.field_U);
            } else {
              if (var13Lifetime2 > this.field_U.field_A) {
                this.field_U = new dd(var12Lifetime2, var13Lifetime2);
                kj.a(81, this.field_U);
              } else {
                kj.a(53, this.field_U);
                qh.d();
              }
            }
          }
          var32.b(112, 144, var32.field_w << 4, var32.field_y << 4, -this.field_V << 10, 4096);
          oc.a(126);
          this.field_U.c(var9Lifetime2 - (var32.field_w >> 1), var11Lifetime2 - var32.field_y, 256);
          return;
        }
        if (no.field_k != var6Lifetime1) {
          if (gp.field_d == var6Lifetime1) {
            var33 = bo.field_a[2];
            var33.c(var9Lifetime2, var11Lifetime2 - (var33.field_A >> 1), 256);
            return;
          }
          if (kr.field_e != var6Lifetime1) {
            return;
          }
          var34 = bo.field_a[1];
          var34.c(var9Lifetime2, var11Lifetime2 - (var34.field_A >> 1), 256);
          return;
        }
        var31 = bo.field_a[0];
        var12Lifetime3 = var31.field_w << 1;
        var13Lifetime3 = var31.field_y << 1;
        if (this.field_U != null &&
          this.field_U.field_z >= var12Lifetime3 &&
          var13Lifetime3 <= this.field_U.field_A) {
          kj.a(53, this.field_U);
          qh.d();
        } else {
          this.field_U = new dd(var12Lifetime3, var13Lifetime3);
          kj.a(81, this.field_U);
        }
        var31.b(112, 144, var31.field_w << 4, var31.field_y << 4, -this.field_V << 10, 4096);
        oc.a(126);
        this.field_U.c(var9Lifetime2 - (var31.field_w >> 1), var11Lifetime2 - var31.field_y, 256);
    }

    public static void a(int param0) {
        field_Y = null;
        field_T = null;
        if (param0 > -52) {
          return;
        }
        field_R = null;
        field_W = null;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (param0 < -123) {
          param3 = -param3 + param2;
          return -(param3 * param3 * param1 / param2 / param2) + param1;
        }
        return -104;
    }

    final String e(int param0) {
        if (param0 <= -10) {
          return null;
        }
        ei var3 = (ei) null;
        this.a((ei) null, (byte) -51);
        return null;
    }

    static {
        field_T = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
