/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends ic {
    static int field_p;
    static od field_n;
    private ug field_s;
    vd field_q;
    static int field_l;
    ec field_r;
    static String field_m;
    static nh field_o;

    final int d() {
        return 0;
    }

    final ic c() {
        cc var1;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (true) {
          var1 = (cc) (this.field_q.e(0));
          if (var1 == null) {
            return null;
          }
          if (var1.field_D != null) {
            return (ic) ((Object) var1.field_D);
          }
        }
    }

    final ic a() {
        cc var1 = (cc) (this.field_q.h(-11151));
        if (var1 == null) {
          return null;
        }
        if (var1.field_D == null) {
          return this.c();
        }
        return (ic) ((Object) var1.field_D);
    }

    final static void a(int param0, int param1, int param2, nh[] param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (0 < param2 &&
            0 < param1) {
            if (null == param3[3]) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3[3].field_z;
            }
            var6_int = stackIn_11_0;
            if (null == param3[5]) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param3[5].field_z;
            }
            var7 = stackIn_14_0;
            if (param4 != 14673) {
              field_n = (od) null;
            }
            if (param3[1] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param3[1].field_C;
            }
            var8 = stackIn_19_0;
            if (null == param3[7]) {
              stackIn_22_0 = 0;
            } else {
              stackIn_22_0 = param3[7].field_C;
            }
            var9 = stackIn_22_0;
            var10 = param2 + param5;
            var11 = param0 + param1;
            var12 = var6_int + param5;
            var13 = var10 - var7;
            var14 = param0 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param2 * var6_int / (var7 + var6_int) + param5;
              var16 = param2 * var6_int / (var7 + var6_int) + param5;
            }
            var18 = var14;
            var19 = var15;
            wj.b(tg.field_i);
            if (var18 > var19) {
              var19 = var8 * param1 / (var8 + var9) + param0;
              var18 = var8 * param1 / (var8 + var9) + param0;
            }
            if (param3[0] != null) {
              wj.d(param5, param0, var16, var18);
              param3[0].d(param5, param0);
              wj.a(tg.field_i);
            }
            if (param3[2] != null) {
              wj.d(var17, param0, var10, var18);
              param3[2].d(var13, param0);
              wj.a(tg.field_i);
            }
            if (null != param3[6]) {
              wj.d(param5, var19, var16, var11);
              param3[6].d(param5, var15);
              wj.a(tg.field_i);
            }
            if (null != param3[8]) {
              wj.d(var17, var19, var10, var11);
              param3[8].d(var13, var15);
              wj.a(tg.field_i);
            }
            if (param3[1] != null &&
              0 != param3[1].field_z) {
              wj.d(var16, param0, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param3[1].field_z) {
                param3[1].d(var20, param0);
              }
              wj.a(tg.field_i);
            }
            if (param3[7] != null &&
              param3[7].field_z != 0) {
              wj.d(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param3[7].field_z) {
                param3[7].d(var20Lifetime1, var15);
              }
              wj.a(tg.field_i);
            }
            if (null != param3[3] &&
              param3[3].field_C != 0) {
              wj.d(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param3[3].field_C) {
                param3[3].d(param5, var20Lifetime2);
              }
              wj.a(tg.field_i);
            }
            if (null != param3[5] &&
              param3[5].field_C != 0) {
              wj.d(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param3[5].field_C) {
                param3[5].d(var13, var20Lifetime3);
              }
              wj.a(tg.field_i);
            }
            if (null != param3[4] &&
              param3[4].field_z != 0 &&
              param3[4].field_C != 0) {
              wj.d(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param3[4].field_C) {
                for (var21 = var12; var21 < var13; var21 = var21 + param3[4].field_z) {
                  param3[4].d(var21, var20Lifetime4);
                }
              }
              wj.a(tg.field_i);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("am.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String h(int param0) {
        if (null == oa.field_d) {
          return "";
        }
        if (param0 != 0) {
          return (String) null;
        }
        return oa.field_d;
    }

    final static void g(int param0) {
        oa.field_d = dh.field_N.b((byte) -53);
        CharSequence var2 = (CharSequence) ((Object) oa.field_d);
        tf.field_pb = rh.a(119, var2);
        if (param0 != 11) {
          am.g(-127);
        }
    }

    private final void a(int param0, int param1, cc param2, byte param3, int[] param4, int param5) {
        ug stackIn_13_0 = null;
        cc stackIn_13_1 = null;
        boolean stackIn_14_2 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ag var11 = null;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 != 97) {
            field_l = -91;
          }
          if ((4 & this.field_s.field_C[param2.field_u]) != 0 &&
            param2.field_k < 0) {
            var7_int = this.field_s.field_B[param2.field_u] / id.field_d;
            while (true) {
              var8 = (-param2.field_i + 1048575 + var7_int) / var7_int;
              if (param1 < var8) {
                param2.field_i = param2.field_i + param1 * var7_int;
                break;
              }
              param2.field_D.b(param4, param0, var8);
              param0 = param0 + var8;
              param2.field_i = param2.field_i + (var8 * var7_int - 1048576);
              param1 = param1 - var8;
              var9 = id.field_d / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param2.field_D;
              if (this.field_s.field_E[param2.field_u] == 0) {
                param2.field_D = ag.b(param2.field_C, var11.j(), var11.e(), var11.h());
              } else {
                param2.field_D = ag.b(param2.field_C, var11.j(), 0, var11.h());
                stackIn_13_0 = this.field_s;
                stackIn_13_1 = (cc) (param2);
                stackIn_14_2 = !(param2.field_o.field_p[param2.field_F] >= 0);
                ((ug) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2, (byte) -88);
                param2.field_D.e(var9, var11.e());
              }
              if (param2.field_o.field_p[param2.field_F] < 0) {
                param2.field_D.f(-1);
              }
              var11.k(var9);
              var11.b(param4, param0, param5 - param0);
              if (!var11.g()) {
                continue;
              }
              this.field_r.a(var11);
            }
          }
          param2.field_D.b(param4, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("am.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, cc param1, int param2) {
        ug stackIn_9_0 = null;
        cc stackIn_9_1 = null;
        boolean stackIn_10_2 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_s.field_C[param1.field_u] & 4) != 0 &&
            0 > param1.field_k) {
            var4_int = this.field_s.field_B[param1.field_u] / id.field_d;
            var5 = (var4_int + (1048575 - param1.field_i)) / var4_int;
            param1.field_i = param2 * var4_int + param1.field_i & 1048575;
            if (var5 <= param2) {
              if (this.field_s.field_E[param1.field_u] != 0) {
                param1.field_D = ag.b(param1.field_C, param1.field_D.j(), 0, param1.field_D.h());
                stackIn_9_0 = this.field_s;
                stackIn_9_1 = (cc) (param1);
                stackIn_10_2 = !(0 <= param1.field_o.field_p[param1.field_F]);
                ((ug) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2, (byte) -102);
              } else {
                param1.field_D = ag.b(param1.field_C, param1.field_D.j(), param1.field_D.e(), param1.field_D.h());
              }
              if (0 > param1.field_o.field_p[param1.field_F]) {
                param1.field_D.f(-1);
              }
              param2 = param1.field_i / var4_int;
            }
          }
          if (param0 >= -24) {
            return;
          }
          param1.field_D.d(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("am.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        cc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          this.field_r.b(param0, param1, param2);
          var6 = (cc) (this.field_q.h(-11151));
          while (var6 != null) {
            if (!this.field_s.a(-128, var6)) {
              var4_int = param1;
              var5 = param2;
              do {
                if (var6.field_l >= var5) {
                  this.a(var4_int, var5, var6, (byte) 97, param0, var5 + var4_int);
                  var6.field_l = var6.field_l - var5;
                  break;
                }
                this.a(var4_int, var6.field_l, var6, (byte) 97, param0, var4_int + var5);
                var5 = var5 - var6.field_l;
                var4_int = var4_int + var6.field_l;
              } while (!this.field_s.a(var4_int, param0, -128, var6, var5));
            }
            var6 = (cc) (this.field_q.e(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("am.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_o = null;
        field_m = null;
        if (param0 >= -108) {
          return;
        }
        field_n = null;
    }

    final void d(int param0) {
        int var2;
        cc var3;
        int var4;
        boolean stackIn_3_0 = false;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_r.d(param0);
        var3 = (cc) (this.field_q.h(-11151));
        while (var3 != null) {
          stackIn_3_0 = this.field_s.a(-124, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_3_0) {
            var2 = param0;
            while (var3.field_l < var2) {
              this.a(-127, var3, var3.field_l);
              var2 = var2 - var3.field_l;
              if (this.field_s.a(0, (int[]) null, -128, var3, var2)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(-59, var3, var2);
              var3.field_l = var3.field_l - var2;
            }
          }
          var3 = (cc) (this.field_q.e(0));
        }
    }

    final static void e(int param0) {
        if (param0 != 11) {
          am.g(115);
        }
        if (af.field_b == 10 ||
          !hc.a(true)) {
          re.a(true);
          af.field_b = 11;
        }
        kl.field_S = true;
    }

    am(ug param0) {
        this.field_q = new vd();
        this.field_r = new ec();
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 75;
        field_p = field_l / 2;
        field_n = new od(256);
    }
}
