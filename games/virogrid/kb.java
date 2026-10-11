/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int[] field_d;
    static hm field_b;
    static boolean field_c;
    static String field_a;

    final static void a(String param0, int param1) {
        System.out.println("Error: " + kn.a(param0, (byte) -33, "\n", "%0a"));
        if (param1 != 0) {
          field_b = (hm) null;
        }
    }

    final static void a(e param0, boolean param1, eh param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        u var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = ih.field_c;
          cm.field_h = new km(0L, (km) null);
          if (null == param2) {
            en.a("QC1", (Throwable) null, 1);
            return;
          }
          param2.field_b = param1;
          param2.field_k = 0;
          dm.field_v = new wc(var3_int, param2, param2);
          cj.field_s = new ad(var3_int, param2, param2, new qa());
          var4 = kn.f(256);
          if (null == var4) {
            en.a("QC2", (Throwable) null, 1);
            return;
          }
          g.a((byte) 124, var4);
          dh.field_k = rb.a(4020342, -4841, 2245737, 1513239, 8947848, 0, 1513239, 1127256, (e) null, 65793, 65793, 65793, 5138823);
          gk.field_e = rb.a(0, -4841, 0, 0, 0, 16764006, 0, 0, param0, 0, 0, 0, 0);
          sd.field_a = rb.a(0, -4841, 0, 0, 0, 16777215, 0, 0, param0, 0, 0, 0, 0);
          var5 = df.field_e;
          var6 = df.field_f;
          var7 = df.field_d;
          da.field_h = new mg(10, 14);
          da.field_h.b();
          var8 = 2;
          while (var8 < 7) {
            df.d(var8, var8 + 1, -(var8 << 1) + 14, 16777215);
            var8++;
            if (var9 != 0) {
              return;
            }
          }
          df.a(var7, var5, var6);
          dc.field_V = wf.a(dh.field_k, sd.field_a, var4, 49, gk.field_e);
          cm.field_h.field_W = new p();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1 &&
            gf.a(-122, param1)) {
            stackIn_7_0 = 29;
            return stackIn_7_0;
          }
          if (param0) {
            kb.a((mg) null, -95);
          }
          stackIn_12_0 = tn.field_l[param2];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(mg param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != 16865) {
            field_b = (hm) null;
          }
          lm.a(param1 - 16865);
          df.a(param0.field_B, param0.field_u, param0.field_z);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(km param0, km param1, qm param2, km param3, km param4, km param5, km param6, km param7, boolean param8, int param9, e param10, km param11) {
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
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
        mg var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        mg[] var16 = null;
        km var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = Virogrid.field_F ? 1 : 0;
        try {
          mk.field_eb[0] = 16764000;
          mk.field_eb[1] = 6356832;
          mk.field_eb[3] = 16736511;
          mk.field_eb[4] = 16711935;
          wh.field_d = param1;
          mk.field_eb[2] = 9474303;
          ch.field_e = param8;
          hk.field_Ob = param10;
          dm.field_w[3] = 16736511;
          dm.field_w[0] = 16764000;
          dm.field_w[2] = 16736352;
          tm.field_n = 8421504;
          dm.field_w[1] = 6356832;
          mk.field_eb[4] = 16711935;
          var12 = new mg(4, 4);
          var13 = var12.field_B;
          var14 = var12.field_B;
          var12.field_B[15] = 7368816;
          var15 = var12.field_B;
          var14[5] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var16 = new mg[9];
          var16[4] = var12;
          we.field_c = new km(0L, param7);
          wc.field_k = new km(0L, param6);
          we.field_c.a(0, wc.field_k);
          var17 = new km(0L, (km) null);
          var17.field_W = new p();
          ne.field_c = new um(0L, var17, param4, param2);
          wc.field_k.a(0, ne.field_c);
          qa.field_d = new km(0L, param5);
          wc.field_k.a(0, qa.field_d);
          di.field_n = new km(0L, param3);
          di.field_n.field_C = hk.field_Ob;
          qa.field_d.a(0, di.field_n);
          qa.field_d.b((byte) 42);
          wa.field_I = new km(0L, (km) null);
          wa.field_I.field_vb = var16;
          qa.field_d.a(0, wa.field_I);
          ak.field_d = new km[5];
          th.field_o = new km[5];
          ln.field_i = new km[5];
          og.field_g = new km[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_31_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 != 0) {
                if (1 != var18 ||
                  !ch.field_e) {
                  decompiledFrameRemainder0 = (2 == var18);
                  if (decompiledFrameRemainder0) {
                    var19 = al.field_i;
                  }
                } else {
                  var19 = mj.field_A;
                }
              } else {
                if (!ch.field_e) {
                  stackIn_27_0 = cm.field_i;
                } else {
                  stackIn_27_0 = fj.field_a;
                }
                var19 = stackIn_27_0;
              }
              if (decompiledFrameRemainder0) {
                ln.field_i[var18] = new km(0L, param11);
                ak.field_d[var18] = new km(0L, wh.field_d, var19);
                og.field_g[var18] = new km(0L, (km) null);
                og.field_g[var18].field_D = 1;
                th.field_o[var18] = new km(0L, wh.field_d);
                th.field_o[var18].field_D = 1;
                ln.field_i[var18].a(0, ak.field_d[var18]);
                ln.field_i[var18].a(0, og.field_g[var18]);
                ln.field_i[var18].a(0, th.field_o[var18]);
                ln.field_i[var18].b((byte) 42);
                we.field_c.a(0, ln.field_i[var18]);
                tn.field_h = tn.field_h + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            af.field_d = new km(0L, param0);
            af.field_d.field_V = ac.field_a;
            we.field_c.a(0, af.field_d);
            stackIn_31_0 = wl.b((byte) -101) ? 1 : 0;
          }
          if (stackIn_31_0 == 0 ||
            wg.field_f) {
            fh.field_c = new ab(0, 0, 0, 0);
          }
          if (param9 > -5) {
            kb.a(true, 76, -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_45_0 = var12_ref;
          stackIn_45_1 = new StringBuilder().append("kb.B(");
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
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param5 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param6 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param11 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_a = null;
          int var1_int = 77 / ((param0 - 0) / 35);
          field_d = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kb.E(" + param0 + ')');
        }
    }

    static {
        field_d = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
        field_a = "OK";
    }
}
