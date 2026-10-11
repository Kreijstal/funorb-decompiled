/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends um {
    static long field_s;
    static String field_z;
    static int field_y;
    static int field_x;
    static boolean field_w;
    static String[] field_C;
    static boolean field_B;
    static String field_t;
    private di field_u;
    ta field_v;
    static String field_A;
    hg field_r;

    private final void a(int param0, int param1, int param2, cg param3, int[] param4, boolean param5) {
        di stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rc var11 = null;
        int var12 = 0;
        var12 = MinerDisturbance.field_ab;
        try {
          if (param5) {
            return;
          }
          if ((this.field_u.field_v[param3.field_n] & 4) != 0 &&
            param3.field_G < 0) {
            var7_int = this.field_u.field_u[param3.field_n] / fj.field_r;
            while (true) {
              var8 = (-param3.field_B + (1048575 + var7_int)) / var7_int;
              if (param1 < var8) {
                param3.field_B = param3.field_B + var7_int * param1;
                break;
              }
              param3.field_w.a(param4, param0, var8);
              param1 = param1 - var8;
              param0 = param0 + var8;
              param3.field_B = param3.field_B + (-1048576 + var7_int * var8);
              var9 = fj.field_r / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param3.field_w;
              if (this.field_u.field_Y[param3.field_n] == 0) {
                param3.field_w = rc.a(param3.field_D, var11.h(), var11.i(), var11.e());
              } else {
                param3.field_w = rc.a(param3.field_D, var11.h(), 0, var11.e());
                stackIn_14_0 = this.field_u;
                stackIn_14_1 = 255;
                stackIn_15_2 = !(0 <= param3.field_I.field_t[param3.field_F]);
                ((di) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, param3);
                param3.field_w.c(var9, var11.i());
              }
              if (param3.field_I.field_t[param3.field_F] < 0) {
                param3.field_w.i(-1);
              }
              var11.g(var9);
              var11.a(param4, param0, -param0 + param2);
              if (!var11.j()) {
                continue;
              }
              this.field_r.b(var11);
            }
          }
          param3.field_w.a(param4, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("gd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        cg var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        this.field_r.a(param0);
        var3 = (cg) (this.field_v.b(73));
        while (var3 != null) {
          if (!this.field_u.a(var3, -24)) {
            var2 = param0;
            do {
              if (var3.field_M >= var2) {
                this.a((byte) 100, var2, var3);
                var3.field_M = var3.field_M - var2;
                break;
              }
              this.a((byte) 122, var3.field_M, var3);
              var2 = var2 - var3.field_M;
            } while (!this.field_u.a(var2, var3, 1387831944, (int[]) null, 0));
          }
          var3 = (cg) (this.field_v.b((byte) 56));
        }
    }

    final int d() {
        return 0;
    }

    private final void a(byte param0, int param1, cg param2) {
        di stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        short[] var6 = null;
        try {
          if ((4 & this.field_u.field_v[param2.field_n]) != 0 &&
            param2.field_G < 0) {
            var4_int = this.field_u.field_u[param2.field_n] / fj.field_r;
            var5 = (-param2.field_B + (var4_int + 1048575)) / var4_int;
            param2.field_B = 1048575 & var4_int * param1 + param2.field_B;
            if (param1 >= var5) {
              if (this.field_u.field_Y[param2.field_n] == 0) {
                param2.field_w = rc.a(param2.field_D, param2.field_w.h(), param2.field_w.i(), param2.field_w.e());
              } else {
                param2.field_w = rc.a(param2.field_D, param2.field_w.h(), 0, param2.field_w.e());
                stackIn_6_0 = this.field_u;
                stackIn_6_1 = 255;
                stackIn_7_2 = !(param2.field_I.field_t[param2.field_F] >= 0);
                ((di) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_7_2, param2);
              }
              if (param2.field_I.field_t[param2.field_F] < 0) {
                param2.field_w.i(-1);
              }
              param1 = param2.field_B / var4_int;
            }
          }
          param2.field_w.a(param1);
          if (param0 <= 64) {
            var6 = (short[]) null;
            gd.a((ld) null, 110, -27, (short[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("gd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final um c() {
        cg var1_ref = null;
        do {
          var1_ref = (cg) (this.field_v.b((byte) 56));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_w == null);
        return (um) ((Object) var1_ref.field_w);
    }

    final static boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -95) {
          return true;
        }
        stackIn_6_0 = (ci.field_i != null) && (qd.field_Q == pb.field_c);
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        field_t = null;
        if (param0 != -114) {
          return;
        }
        field_C = null;
    }

    final static short[] a(ld param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          if (param2 > -54) {
            field_A = (String) null;
          }
          var4_int = param0.c((byte) -122, param1);
          if (var4_int == 0) {
            return null;
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new short[var4_int];
          }
          var5 = param0.c((byte) -82, 4);
          var6 = (short)param0.c((byte) -123, 16);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)(param0.c((byte) -70, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("gd.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        cg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          this.field_r.a(param0, param1, param2);
          var6 = (cg) (this.field_v.b(90));
          while (var6 != null) {
            if (!this.field_u.a(var6, -75)) {
              var5 = param2;
              var4_int = param1;
              do {
                if (var5 <= var6.field_M) {
                  this.a(var4_int, var5, var4_int + var5, var6, param0, false);
                  var6.field_M = var6.field_M - var5;
                  break;
                }
                this.a(var4_int, var6.field_M, var4_int + var5, var6, param0, false);
                var4_int = var4_int + var6.field_M;
                var5 = var5 - var6.field_M;
              } while (!this.field_u.a(var5, var6, 1387831944, param0, var4_int));
            }
            var6 = (cg) (this.field_v.b((byte) 56));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("gd.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, ob param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 104 % ((-3 - param1) / 48);
          stackIn_1_0 = param2.c(param0, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("gd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final um b() {
        cg var1 = (cg) (this.field_v.b(97));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_w) {
          return (um) ((Object) var1.field_w);
        }
        return this.c();
    }

    gd(di param0) {
        this.field_v = new ta();
        this.field_r = new hg();
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = "3x multiplier: Triples all points. Combines with 2x muliplier to make a 6x multiplier!";
        field_A = "<%0> <times> 250 = <%1>";
        field_t = "Tips: ";
        field_C = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
