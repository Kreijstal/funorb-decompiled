/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends wm {
    static String field_w;
    static String field_s;
    static String[] field_q;
    static String field_u;
    static int field_v;
    static String field_t;
    private rk field_p;
    static ck field_r;
    static w field_x;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        nb var3_ref = null;
        try {
          if (param1 != -11) {
            this.b((String) null, (byte) -68);
          }
          if (this.field_p instanceof jl) {
            var3_ref = ((jl) ((Object) this.field_p)).a(param1 - 78);
            if (var3_ref != null) {
              if (var3_ref.a(20350) == dc.field_b &&
                !param0.equals(this.field_p.field_E)) {
                stackIn_14_0 = ak.field_f;
                return stackIn_14_0;
              }
              stackIn_16_0 = var3_ref.b((byte) 103);
              return stackIn_16_0;
            }
          }
          if (!param0.equals(this.field_p.field_E)) {
            stackIn_21_0 = ak.field_f;
            return stackIn_21_0;
          }
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("re.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ck param4, int param5, int param6, int param7) {
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck var8 = null;
        RuntimeException var8_ref = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_57_0Lifetime1;
        int stackIn_57_1Lifetime1;
        var19 = client.field_A ? 1 : 0;
        try {
          if (hk.field_c > param2) {
            param6 = param6 - (-param2 + hk.field_c);
            param2 = hk.field_c;
          }
          if (hk.field_g < param2 + param6) {
            param6 = -param2 + hk.field_g;
          }
          if (param5 < hk.field_h) {
            param7 = param7 - (-param5 + hk.field_h);
            param5 = hk.field_h;
          }
          if (hk.field_b < param7 + param5) {
            param7 = hk.field_b - param5;
          }
          if (param6 > 0 &&
            0 < param7) {
            var8 = param4.c();
            var9 = hk.field_l;
            var10 = hk.field_j;
            var11 = hk.field_i;
            var12 = new int[4];
            hk.b(var12);
            param4.a();
            hk.f(var12[0], var12[1], var12[param3], var12[3]);
            var13 = param5 * param4.field_I + param2;
            var14 = param4.field_I - param6;
            var15 = var8.field_D;
            var16 = param5;
            while ((param7 + param5) > var16) {
              if (var19 != 0) {
                return;
              }
              var17 = param2;
              while (var17 < param6 + param2) {
                var18 = var15[var13];
                stackIn_57_0 = 0;
                stackIn_57_1 = var18;
                if (stackIn_57_0 != stackIn_57_1 && (0 < var17 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param4.field_I] == 0 ||
                  var17 < (param4.field_I - 1) &&
                  var15[1 + var13] == 0 ||
                  !(-1 + param4.field_H <= var16) &&
                  var15[param4.field_I + var13] == 0)) {
                  hk.e(var17, var16, param0, param1);
                }
                var13++;
                var17++;
              }
              stackIn_57_0Lifetime1 = var13;
              stackIn_57_1Lifetime1 = var14;
              var13 = stackIn_57_0Lifetime1 + stackIn_57_1Lifetime1;
              var16++;
            }
            var8.c(-param4.field_F, -param4.field_z);
            hk.a(var9, var10, var11);
            hk.a(var12);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_63_0 = var8_ref;
          stackIn_63_1 = new StringBuilder().append("re.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_w = null;
          field_x = null;
          if (param0 >= 0) {
            field_t = (String) null;
          }
          field_q = null;
          field_t = null;
          field_s = null;
          field_r = null;
          field_u = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "re.M(" + param0 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, wl param2, wl param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ri.a(param4, (byte) 115, param3.field_n, param0, param1, param2, param3.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("re.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!oe.a(param1, -6237)) {
            return false;
          }
          if (null == param2) {
            return false;
          }
          var3_int = param2.length();
          if (12 <= var3_int) {
            return false;
          }
          if (ug.a(param1, 32) &&
            0 == var3_int) {
            return false;
          }
          var4 = 110 % ((param0 - 23) / 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("re.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final tb b(String param0, byte param1) {
        nb var3 = null;
        RuntimeException var3_ref = null;
        tb stackIn_6_0 = null;
        tb stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p instanceof jl) {
            var3 = ((jl) ((Object) this.field_p)).a(-87);
            if (var3 != null &&
              var3.a(20350) != dc.field_b) {
              stackIn_6_0 = vm.field_u;
              return stackIn_6_0;
            }
          }
          if (param1 != -40) {
            field_x = (w) null;
          }
          if (param0.equals(this.field_p.field_E)) {
            stackIn_14_0 = dc.field_b;
          } else {
            stackIn_14_0 = vm.field_u;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("re.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    re(rk param0, rk param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_p = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("re.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(w param0, w param1, w param2, w param3, w param4, boolean param5, w param6, w param7, mm param8, w param9, byte param10, jd param11) {
        String stackIn_13_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        ck[] var16 = null;
        w var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = client.field_A ? 1 : 0;
        try {
          tl.field_q[1] = 6356832;
          tl.field_q[0] = 16764000;
          tl.field_q[3] = 16736511;
          tl.field_q[4] = 16711935;
          tl.field_q[2] = 9474303;
          fj.field_g = param1;
          ii.field_q = param5;
          ff.field_o = param8;
          ul.field_c[0] = 16764000;
          tl.field_q[4] = 16711935;
          ul.field_c[3] = 16736511;
          ul.field_c[2] = 16736352;
          ul.field_c[1] = 6356832;
          ij.field_c = 8421504;
          var12 = new ck(4, 4);
          var13 = var12.field_D;
          var14 = var12.field_D;
          var15 = var12.field_D;
          var12.field_D[15] = 7368816;
          var15[8] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var16 = new ck[9];
          var16[4] = var12;
          ea.field_D = new w(0L, param6);
          field_x = new w(0L, param7);
          ea.field_D.a(field_x, -16834);
          var17 = new w(0L, (w) null);
          var17.field_M = new vj();
          dn.field_l = new nm(0L, var17, param4, param11);
          field_x.a(dn.field_l, -16834);
          sk.field_c = new w(0L, param0);
          field_x.a(sk.field_c, -16834);
          wj.field_Mb = new w(0L, param2);
          wj.field_Mb.field_J = ff.field_o;
          sk.field_c.a(wj.field_Mb, -16834);
          sk.field_c.d(-25);
          jb.field_f = new w(0L, (w) null);
          jb.field_f.field_lb = var16;
          sk.field_c.a(jb.field_f, -16834);
          dh.field_c = new w[5];
          ui.field_E = new w[5];
          si.field_b = new w[5];
          le.field_D = new w[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_31_0 = ~var18;
            stackIn_31_1 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 == stackIn_31_1) {
                if (ii.field_q) {
                  stackIn_13_0 = uc.field_b;
                } else {
                  stackIn_13_0 = qm.field_b;
                }
                var19 = stackIn_13_0;
              } else if (1 != var18 ||
                !ii.field_q) {
                decompiledFrameRemainder0 = (2 == var18);
                if (decompiledFrameRemainder0) {
                  var19 = sk.field_m;
                }
              } else {
                var19 = eg.field_b;
              }
              if (decompiledFrameRemainder0) {
                dh.field_c[var18] = new w(0L, param3);
                ui.field_E[var18] = new w(0L, fj.field_g, var19);
                si.field_b[var18] = new w(0L, (w) null);
                si.field_b[var18].field_W = 1;
                le.field_D[var18] = new w(0L, fj.field_g);
                le.field_D[var18].field_W = 1;
                dh.field_c[var18].a(ui.field_E[var18], -16834);
                dh.field_c[var18].a(si.field_b[var18], param10 - 16937);
                dh.field_c[var18].a(le.field_D[var18], -16834);
                dh.field_c[var18].d(-64);
                ea.field_D.a(dh.field_c[var18], param10 ^ -16807);
                dh.field_f = dh.field_f + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = param10;
            stackIn_31_1 = 103;
          }
          if (stackIn_31_0 != stackIn_31_1) {
            re.g((byte) -47);
          }
          qb.field_p = new w(0L, param9);
          qb.field_p.field_Y = hf.field_h;
          ea.field_D.a(qb.field_p, -16834);
          if (si.c(-12851) &&
            !wc.field_n) {
            return;
          }
          bc.field_E = new mf(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_45_0 = var12_ref;
          stackIn_45_1 = new StringBuilder().append("re.L(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param2 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param4 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param7 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param8 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param9 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    static {
        field_s = "Theme:";
        field_u = "Error connecting to server. Please try using a different server.";
        field_w = "Fullscreen";
        field_t = "Quick Chat lobby";
        field_q = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
