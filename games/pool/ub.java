/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends se {
    static vh field_q;
    static String field_o;
    static vh field_n;
    static boolean field_p;

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
          return;
        }
        try {
          field_o = null;
          field_q = null;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ub.J(" + param0 + ')');
        }
    }

    final static void a(eh param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        oq var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ej.field_j;
          var3.b(false, param1);
          var3.a(5, false);
          var3.a(0, false);
          if (param2 >= -113) {
            field_p = false;
          }
          var3.a((byte) -81, param0.field_A);
          var3.a(param0.field_r, false);
          var3.a(param0.field_v, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ub.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final tf b(byte param0) {
        tf stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -87 % ((-54 - param0) / 43);
          stackIn_1_0 = vk.field_db;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ub.A(" + param0 + ')');
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            stackIn_4_0 = ti.field_a;
            return stackIn_4_0;
          }
          if (param1 == 6) {
            stackIn_9_0 = ql.field_a;
            return stackIn_9_0;
          }
          if (param1 == 7) {
            stackIn_12_0 = wb.field_d;
            return stackIn_12_0;
          }
          if (param1 == 8) {
            stackIn_15_0 = af.field_h;
            return stackIn_15_0;
          }
          if (param1 == 9) {
            stackIn_20_0 = up.field_K;
            return stackIn_20_0;
          }
          if (!param2) {
            stackIn_23_0 = (String) null;
            return stackIn_23_0;
          }
          if (param1 == 10) {
            stackIn_28_0 = hr.field_s;
            return stackIn_28_0;
          }
          if (param1 == 11) {
            stackIn_33_0 = vl.field_o;
            return stackIn_33_0;
          }
          if (param1 != 14) {
            stackIn_38_0 = null;
            return (String) (stackIn_38_0);
          }
          stackIn_36_0 = nr.a(new String[]{param0}, -1, ge.field_x);
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("ub.N(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, int param2, String param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        oq var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 125 % ((param0 + 54) / 62);
          var7 = ej.field_j;
          var7.b(false, param2);
          var7.field_v = var7.field_v + 1;
          var8 = var7.field_v;
          var7.a(param4, false);
          if (2 == param4) {
            var7.a(-9946, param3);
          }
          if (param1 == null) {
            var7.a((byte) -81, param5);
          } else {
            im.a(var7, (byte) 75, param1);
          }
          var7.b(-var8 + var7.field_v, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ub.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static am c(int param0) {
        RuntimeException var1 = null;
        am stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            field_p = false;
          }
          if (ok.field_mb == null) {
            ok.field_mb = new am(qk.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, qk.field_a.field_C, -1, 2147483647, true);
          }
          stackIn_8_0 = ok.field_mb;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ub.M(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          var3_int = param2;
          var4 = uh.field_n;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3_int < dq.field_j.length)))) {
            var5 = bm.field_c[var3_int];
            stackIn_16_0 = ~var5;
            if (var8 == 0) {
              if (stackIn_16_0 > -1) {
                var4 = var4 + qe.field_y;
              } else {
                var6 = ch.a(dq.field_j[var3_int], true, false);
                var7 = nn.field_c - (var6 >> 1);
                var4 = var4 + qi.field_e;
                if (tj.a(param0, -23, (fj.field_h << 1) + ch.field_I, param1, (rm.field_b << 1) + var6, var4, var7 - rm.field_b)) {
                  stackIn_12_0 = var5;
                  return stackIn_12_0;
                }
                var4 = var4 + ((fj.field_h << 1) + qi.field_e + ch.field_I);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = -1;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "ub.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(vh param0, lr param1, vh param2, db param3, vh param4, vh param5, vh param6, vh param7, boolean param8, vh param9, vh param10, byte param11) {
        String stackIn_13_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        dd[] var16 = null;
        vh var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int var18Lifetime1;
        var20 = Pool.field_O;
        try {
          pq.field_F[0] = 16764000;
          m.field_c = param1;
          kb.field_h = param5;
          pq.field_F[2] = 9474303;
          pq.field_F[3] = 16736511;
          ej.field_l = param8;
          pq.field_F[4] = 16711935;
          pq.field_F[1] = 6356832;
          ng.field_A[2] = 16736352;
          pq.field_F[4] = 16711935;
          ng.field_A[0] = 16764000;
          ng.field_A[1] = 6356832;
          mc.field_g = 8421504;
          ng.field_A[3] = 16736511;
          var12 = new dd(4, 4);
          var13 = var12.field_D;
          var14 = var12.field_D;
          var12.field_D[15] = 7368816;
          var15 = var12.field_D;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var14[5] = 7368816;
          var16 = new dd[9];
          var16[4] = var12;
          fl.field_q = new vh(0L, param0);
          wa.field_hb = new vh(0L, param10);
          fl.field_q.a(-1, wa.field_hb);
          var17 = new vh(0L, (vh) null);
          var17.field_T = new ko();
          qd.field_b = new of(0L, var17, param9, param3);
          wa.field_hb.a(15, qd.field_b);
          ph.field_d = new vh(0L, param6);
          wa.field_hb.a(-3, ph.field_d);
          pa.field_J = new vh(0L, param4);
          pa.field_J.field_I = m.field_c;
          ph.field_d.a(-125, pa.field_J);
          ph.field_d.d((byte) -128);
          fj.field_j = new vh(0L, (vh) null);
          fj.field_j.field_F = var16;
          ph.field_d.a(17, fj.field_j);
          uo.field_Mb = new vh[5];
          il.field_g = new vh[5];
          ln.field_v = new vh[5];
          ta.field_b = new vh[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_35_0 = -1;
            stackIn_35_1 = ~var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_35_0 == stackIn_35_1) {
                if (ej.field_l) {
                  stackIn_13_0 = sn.field_l;
                } else {
                  stackIn_13_0 = ud.field_K;
                }
                var19 = stackIn_13_0;
              } else if (var18 == 1 &&
                ej.field_l) {
                var19 = mm.field_l;
              } else {
                decompiledFrameRemainder0 = (var18 == 2);
                if (decompiledFrameRemainder0) {
                  var19 = vk.field_P;
                }
              }
              if (decompiledFrameRemainder0) {
                il.field_g[var18] = new vh(0L, param2);
                ln.field_v[var18] = new vh(0L, kb.field_h, var19);
                uo.field_Mb[var18] = new vh(0L, (vh) null);
                uo.field_Mb[var18].field_cb = 1;
                ta.field_b[var18] = new vh(0L, kb.field_h);
                ta.field_b[var18].field_cb = 1;
                il.field_g[var18].a(-98, ln.field_v[var18]);
                il.field_g[var18].a(68, uo.field_Mb[var18]);
                il.field_g[var18].a(72, ta.field_b[var18]);
                il.field_g[var18].d((byte) -126);
                fl.field_q.a(104, il.field_g[var18]);
                bq.field_m = bq.field_m + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            d.field_e = new vh(0L, param7);
            d.field_e.field_nb = rk.field_f;
            fl.field_q.a(25, d.field_e);
            if (!mg.a(61) ||
              ea.field_z) {
              sg.field_J = new jj(0, 0, 0, 0);
            }
            stackIn_35_0 = -31;
            stackIn_35_1 = (-73 - param11) / 49;
          }
          var18Lifetime1 = stackIn_35_0 / stackIn_35_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_40_0 = var12_ref;
          stackIn_40_1 = new StringBuilder().append("ub.L(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',');
          if (param5 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param6 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param7 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param11).append(')').toString());
        }
    }

    ub(long param0, String param1) {
        super(param0, param1);
    }

    static {
        field_o = "<%0><br>versus<br><%1>";
    }
}
