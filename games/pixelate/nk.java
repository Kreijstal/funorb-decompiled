/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int[] field_d;
    static String field_c;
    static ak field_f;
    static ak field_e;
    static String field_b;
    static String field_g;
    static String field_h;
    static int field_i;
    static bb field_a;

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            nk.a((ak) null, (jl) null, (vp) null, (ak) null, (byte) 7, (ak) null, (ak) null, (ak) null, (ak) null, true, (ak) null, (ak) null);
          }
          field_d = null;
          field_g = null;
          field_h = null;
          field_f = null;
          field_a = null;
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nk.E(" + param0 + ')');
        }
    }

    final static void a(ak param0, jl param1, vp param2, ak param3, byte param4, ak param5, ak param6, ak param7, ak param8, boolean param9, ak param10, ak param11) {
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_44_0 = null;
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
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        tf[] var16 = null;
        ak var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = Pixelate.field_H ? 1 : 0;
        try {
          ib.field_i[4] = 16711935;
          ib.field_i[1] = 6356832;
          ib.field_i[2] = 9474303;
          ib.field_i[3] = 16736511;
          ge.field_f = param9;
          oi.field_e = param6;
          vl.field_Q = param1;
          ib.field_i[0] = 16764000;
          ib.field_i[4] = 16711935;
          qp.field_P[3] = 16736511;
          qp.field_P[1] = 6356832;
          qp.field_P[2] = 16736352;
          vp.field_Ib = 8421504;
          qp.field_P[0] = 16764000;
          var12 = new tf(4, 4);
          var13 = var12.field_G;
          var14 = var12.field_G;
          var15 = var12.field_G;
          var12.field_G[15] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var16 = new tf[9];
          var16[4] = var12;
          ui.field_i = new ak(0L, param0);
          ki.field_k = new ak(0L, param3);
          ui.field_i.a(ki.field_k, (byte) 26);
          var17 = new ak(0L, (ak) null);
          var17.field_L = new bb();
          l.field_p = new gp(0L, var17, param8, param2);
          ki.field_k.a(l.field_p, (byte) 26);
          oc.field_U = new ak(0L, param5);
          ki.field_k.a(oc.field_U, (byte) 26);
          nf.field_d = new ak(0L, param10);
          nf.field_d.field_Db = vl.field_Q;
          oc.field_U.a(nf.field_d, (byte) 26);
          oc.field_U.h(-257);
          rh.field_y = new ak(0L, (ak) null);
          rh.field_y.field_zb = var16;
          if (param4 <= 69) {
            nk.a(-96);
          }
          oc.field_U.a(rh.field_y, (byte) 26);
          hk.field_e = new ak[5];
          jo.field_n = new ak[5];
          fm.field_f = new ak[5];
          fm.field_h = new ak[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 != ~var18) {
                if (var18 == 1 &&
                  ge.field_f) {
                  var19 = fb.field_Gb;
                } else {
                  decompiledFrameRemainder0 = (2 == var18);
                  if (decompiledFrameRemainder0) {
                    var19 = mc.field_n;
                  }
                }
              } else {
                if (ge.field_f) {
                  stackIn_30_0 = ul.field_m;
                } else {
                  stackIn_30_0 = em.field_c;
                }
                var19 = stackIn_30_0;
              }
              if (decompiledFrameRemainder0) {
                fm.field_f[var18] = new ak(0L, param11);
                jo.field_n[var18] = new ak(0L, oi.field_e, var19);
                fm.field_h[var18] = new ak(0L, (ak) null);
                fm.field_h[var18].field_kb = 1;
                hk.field_e[var18] = new ak(0L, oi.field_e);
                hk.field_e[var18].field_kb = 1;
                fm.field_f[var18].a(jo.field_n[var18], (byte) 26);
                fm.field_f[var18].a(fm.field_h[var18], (byte) 26);
                fm.field_f[var18].a(hk.field_e[var18], (byte) 26);
                fm.field_f[var18].h(-257);
                ui.field_i.a(fm.field_f[var18], (byte) 26);
                qm.field_F = qm.field_F + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            gh.field_u = new ak(0L, param7);
            gh.field_u.field_cb = nd.field_a;
            ui.field_i.a(gh.field_u, (byte) 26);
            stackIn_34_0 = ol.b(true) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !ln.field_q) {
            return;
          }
          td.field_b = new oj(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_44_0 = var12_ref;
          stackIn_44_1 = new StringBuilder().append("nk.C(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param4).append(',');
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
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param8 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param11 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 16711935) {
            nk.a(true);
          }
          kn.field_J = vi.field_o.h(5);
          eq.field_Hb = dh.a((CharSequence) ((Object) kn.field_J), (byte) 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nk.G(" + param0 + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = param0.length();
          param0.setLength(param1);
          var5 = var4_int;
          do {
            if (param1 <= var5) {
              if (param3 != 16736352) {
                nk.a((StringBuilder) null, 4, 'ﾧ', 43);
              }
              break;
            }
            param0.setCharAt(var5, param2);
            var5++;
          } while (var6 == 0);
          stackIn_11_0 = (StringBuilder) (param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nk.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        cm var2 = null;
        int var3 = 0;
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        cm var2Lifetime1;
        boolean stackIn_22_0Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 93) {
            field_i = -74;
          }
          ia.field_h = param1;
          var2 = (cm) (bo.field_d.c(param0 ^ 1504642236));
          while (null != var2) {
            stackIn_22_0 = var2.field_k.b(param0 - 93);
            if (var3 != 0) {
              while (true) {
                if (!stackIn_22_0) {
                  var2.c(2779);
                }
                var2.field_n.h(var2.field_p * ia.field_h + 128 >> 8);
                var2 = (cm) (rg.field_b.f(1504642273));
                return;
              }
            }
            if (!stackIn_22_0) {
              var2.c(2779);
            }
            if (stackIn_22_0 ||
              var3 != 0) {
              var2.field_n.h(128 + var2.field_p * ia.field_h >> 8);
            }
            var2 = (cm) (bo.field_d.f(param0 + 1504642180));
            if (var3 == 0) {
              continue;
            }
            break;
          }
          if (rg.field_b != null) {
            var2Lifetime1 = (cm) (rg.field_b.c(1504642273));
            while (null != var2Lifetime1) {
              if (var3 != 0) {
                return;
              }
              stackIn_22_0Lifetime1 = var2Lifetime1.field_k.b(0);
              if (!stackIn_22_0Lifetime1) {
                var2Lifetime1.c(2779);
              } else {
                var2Lifetime1.field_n.h(var2Lifetime1.field_p * ia.field_h + 128 >> 8);
              }
              var2Lifetime1 = (cm) (rg.field_b.f(1504642273));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "nk.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        try {
          an.field_e.a(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        try {
          h.field_Q = param0;
          fh.field_L = param1;
          if (param2 != 5818) {
            field_a = (bb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Players";
        field_g = "Breaking real-world laws";
        field_h = "Offensive account name";
        field_i = 0;
    }
}
