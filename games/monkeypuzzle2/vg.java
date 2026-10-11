/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends jj {
    private kf field_H;
    static int field_J;
    private String field_N;
    private int field_L;
    private le field_I;
    static int[] field_K;
    static le field_M;

    final static boolean c(boolean param0) {
        if (param0) {
          return false;
        }
        if (k.field_g < 10) {
          return false;
        }
        if (mc.field_a >= 13) {
          return true;
        }
        return false;
    }

    final String a(byte param0) {
        if (param0 == 54) {
          return null;
        }
        field_K = (int[]) null;
        return null;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
          this.field_L = this.field_L + 1;
          if (param3 > -13) {
            field_M = (le) null;
          }
          super.a(param0, param1, param2, (byte) -89);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vg.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    vg(kf param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, bk.a(true));
        try {
          this.field_N = param1;
          this.field_H = param0;
          this.a(param5, 13361, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        na var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        le var16;
        String var17;
        Object var18;
        le var19;
        le var20;
        le var21;
        Object var22;
        le var23;
        le var24;
        le var25;
        le var26;
        Object var28;
        le var29;
        le var30;
        le var31;
        ui var32;
        ui var33;
        ui var34;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime2;
        int var12Lifetime3;
        na var6Lifetime1;
        var18 = null;
        var22 = null;
        var28 = null;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = this.field_H.b(false);
        if (ke.field_d != var6 &&
          var6 != f.field_g) {
          var5 = this.field_H.b((byte) -123);
          if (var5 == null) {
            var5 = this.field_N;
          }
          if (var5.equals(this.field_s)) {
            super.a(param0, param1, param2, param3);
            var6 = this.field_H.b(false);
            var34 = (ui) ((Object) this.field_h);
            var9 = this.field_r + param3;
            var10 = var34.a((we) (this), -73, param2) + (var34.a(-1, (we) (this)).b(62) >> 1);
            if (var6 != ke.field_d &&
              var6 != f.field_g) {
              if (ol.field_h == var6) {
                var30 = hk.field_i[2];
                var30.c(var9, var10 - (var30.field_j >> 1), 256);
                return;
              }
              if (var6 != wj.field_i) {
                return;
              }
              var29 = hk.field_i[1];
              var29.c(var9, var10 - (var29.field_j >> 1), 256);
              return;
            }
            var31 = hk.field_i[0];
            var11 = var31.field_m << 1;
            var12 = var31.field_n << 1;
            if (this.field_I == null) {
              this.field_I = new le(var11, var12);
              mc.a(param0 ^ -8495, this.field_I);
            } else {
              if (this.field_I.field_k < var11) {
                this.field_I = new le(var11, var12);
                mc.a(param0 ^ -8495, this.field_I);
              } else {
                if (this.field_I.field_j < var12) {
                  this.field_I = new le(var11, var12);
                  mc.a(param0 ^ -8495, this.field_I);
                } else {
                  mc.a(-8497, this.field_I);
                  ge.d();
                }
              }
            }
            var31.b(112, 144, var31.field_m << 4, var31.field_n << 4, -this.field_L << 10, 4096);
            tj.b(param0 ^ 659);
            this.field_I.c(-(var31.field_m >> 1) + var9, var10 - var31.field_n, 256);
            return;
          }
          this.field_s = var5;
          this.a(true);
          super.a(param0, param1, param2, param3);
          var6 = this.field_H.b(false);
          var33 = (ui) ((Object) this.field_h);
          var9Lifetime2 = this.field_r + param3;
          var10Lifetime2 = var33.a((we) (this), -73, param2) + (var33.a(-1, (we) (this)).b(62) >> 1);
          if (var6 == ke.field_d) {
            var23 = hk.field_i[0];
            var11Lifetime2 = var23.field_m << 1;
            var12Lifetime2 = var23.field_n << 1;
            if (this.field_I != null &&
              this.field_I.field_k >= var11Lifetime2 &&
              this.field_I.field_j >= var12Lifetime2) {
              mc.a(-8497, this.field_I);
              ge.d();
            } else {
              this.field_I = new le(var11Lifetime2, var12Lifetime2);
              mc.a(param0 ^ -8495, this.field_I);
            }
            var23.b(112, 144, var23.field_m << 4, var23.field_n << 4, -this.field_L << 10, 4096);
            tj.b(param0 ^ 659);
            this.field_I.c(-(var23.field_m >> 1) + var9Lifetime2, var10Lifetime2 - var23.field_n, 256);
            return;
          }
          if (var6 != f.field_g) {
            if (ol.field_h == var6) {
              var25 = hk.field_i[2];
              var25.c(var9Lifetime2, var10Lifetime2 - (var25.field_j >> 1), 256);
              return;
            }
            if (var6 != wj.field_i) {
              return;
            }
            var24 = hk.field_i[1];
            var24.c(var9Lifetime2, var10Lifetime2 - (var24.field_j >> 1), 256);
            return;
          }
          var26 = hk.field_i[0];
          var16 = var26;
          var11Lifetime3 = var26.field_m << 1;
          var12Lifetime3 = var26.field_n << 1;
          if (this.field_I == null) {
            this.field_I = new le(var11Lifetime3, var12Lifetime3);
            mc.a(param0 ^ -8495, this.field_I);
          } else {
            if (this.field_I.field_k < var11Lifetime3) {
              this.field_I = new le(var11Lifetime3, var12Lifetime3);
              mc.a(param0 ^ -8495, this.field_I);
            } else {
              if (this.field_I.field_j < var12Lifetime3) {
                this.field_I = new le(var11Lifetime3, var12Lifetime3);
                mc.a(param0 ^ -8495, this.field_I);
              } else {
                mc.a(-8497, this.field_I);
                ge.d();
              }
            }
          }
          var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -this.field_L << 10, 4096);
          tj.b(param0 ^ 659);
          this.field_I.c(-(var26.field_m >> 1) + var9Lifetime2, var10Lifetime2 - var26.field_n, 256);
          return;
        }
        var17 = w.field_a;
        if (!var17.equals(this.field_s)) {
          this.field_s = var17;
          this.a(true);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_H.b(false);
        var32 = (ui) ((Object) this.field_h);
        var9Lifetime1 = this.field_r + param3;
        var10Lifetime1 = var32.a((we) (this), -73, param2) + (var32.a(-1, (we) (this)).b(62) >> 1);
        if (var6Lifetime1 == ke.field_d) {
          var21 = hk.field_i[0];
          var11Lifetime1 = var21.field_m << 1;
          var12Lifetime1 = var21.field_n << 1;
          if (this.field_I != null &&
            this.field_I.field_k >= var11Lifetime1 &&
            this.field_I.field_j >= var12Lifetime1) {
            mc.a(-8497, this.field_I);
            ge.d();
          } else {
            this.field_I = new le(var11Lifetime1, var12Lifetime1);
            mc.a(param0 ^ -8495, this.field_I);
          }
        } else {
          if (var6Lifetime1 != f.field_g) {
            if (ol.field_h == var6Lifetime1) {
              var20 = hk.field_i[2];
              var20.c(var9Lifetime1, var10Lifetime1 - (var20.field_j >> 1), 256);
              return;
            }
            if (var6Lifetime1 != wj.field_i) {
              return;
            }
            var19 = hk.field_i[1];
            var19.c(var9Lifetime1, var10Lifetime1 - (var19.field_j >> 1), 256);
            return;
          }
          var21 = hk.field_i[0];
          var11Lifetime1 = var21.field_m << 1;
          var12Lifetime1 = var21.field_n << 1;
          if (this.field_I != null &&
            this.field_I.field_k >= var11Lifetime1 &&
            this.field_I.field_j >= var12Lifetime1) {
            mc.a(-8497, this.field_I);
            ge.d();
          } else {
            this.field_I = new le(var11Lifetime1, var12Lifetime1);
            mc.a(param0 ^ -8495, this.field_I);
          }
        }
        var21.b(112, 144, var21.field_m << 4, var21.field_n << 4, -this.field_L << 10, 4096);
        tj.b(param0 ^ 659);
        this.field_I.c(-(var21.field_m >> 1) + var9Lifetime1, var10Lifetime1 - var21.field_n, 256);
    }

    final static boolean a(int param0, hb param1) {
        RuntimeException var2 = null;
        hb var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 59) {
            var3 = (hb) null;
            vg.a(122, (hb) null);
          }
          stackIn_5_0 = (param1.f(8, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("vg.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_M = null;
        field_K = null;
        if (param0 != -3114) {
          vg.k(-104);
        }
    }

    final static void a(int param0) {
        if (param0 < 108) {
          return;
        }
        if (ol.field_e > 32) {
          w.a(-1, -32 + ol.field_e);
          return;
        }
        w.a(-1, 0);
    }

    static {
        field_J = 200;
        field_K = new int[]{12348480, 16059704, 16770581, 7783495, 4555448};
    }
}
