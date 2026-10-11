/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static String field_h;
    static cr field_e;
    static nj field_b;
    static String field_c;
    static String field_a;
    static int field_d;
    static er field_g;
    static String field_f;

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 72) {
          return;
        }
        try {
          field_b = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fm.A(" + param0 + ')');
        }
    }

    final static void a(cr param0, cr param1, cr param2, ie param3, int param4, cc param5, cr param6, boolean param7, cr param8, cr param9, cr param10, cr param11) {
        String stackIn_16_0 = null;
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
        er var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        er[] var16 = null;
        cr var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = Vertigo2.field_L ? 1 : 0;
        try {
          gg.field_n[0] = 16764000;
          gg.field_n[1] = 6356832;
          gg.field_n[3] = 16736511;
          gg.field_n[2] = 9474303;
          fq.field_i = param7;
          gg.field_n[4] = 16711935;
          np.field_Ib = param9;
          cg.field_f = param5;
          wc.field_q[3] = 16736511;
          wc.field_q[1] = 6356832;
          wc.field_q[0] = 16764000;
          gg.field_n[4] = 16711935;
          lj.field_p = 8421504;
          wc.field_q[2] = 16736352;
          var12 = new er(4, 4);
          var13 = var12.field_F;
          var14 = var12.field_F;
          var12.field_F[15] = 7368816;
          var15 = var12.field_F;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new er[9];
          if (param4 != 12895) {
            fm.a((cr) null, (cr) null, (cr) null, (ie) null, -50, (cc) null, (cr) null, false, (cr) null, (cr) null, (cr) null, (cr) null);
          }
          var16[4] = var12;
          td.field_c = new cr(0L, param6);
          ad.field_f = new cr(0L, param0);
          td.field_c.b(ad.field_f, param4 - 12771);
          var17 = new cr(0L, (cr) null);
          var17.field_M = new nj();
          mg.field_R = new od(0L, var17, param1, param3);
          ad.field_f.b(mg.field_R, 119);
          bp.field_C = new cr(0L, param11);
          ad.field_f.b(bp.field_C, 125);
          dj.field_d = new cr(0L, param8);
          dj.field_d.field_z = cg.field_f;
          bp.field_C.b(dj.field_d, 120);
          bp.field_C.i(-2147483648);
          ui.field_b = new cr(0L, (cr) null);
          ui.field_b.field_Bb = var16;
          bp.field_C.b(ui.field_b, 121);
          hl.field_q = new cr[5];
          w.field_C = new cr[5];
          gh.field_d = new cr[5];
          mg.field_M = new cr[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (5 <= var18))) {
            stackIn_34_0 = ~var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 == -1) {
                if (!fq.field_i) {
                  stackIn_16_0 = ua.field_f;
                } else {
                  stackIn_16_0 = fb.field_A;
                }
                var19 = stackIn_16_0;
              } else if (var18 != 1 ||
                !fq.field_i) {
                decompiledFrameRemainder0 = (var18 == 2);
                if (decompiledFrameRemainder0) {
                  var19 = ji.field_q;
                }
              } else {
                var19 = or.field_k;
              }
              if (decompiledFrameRemainder0) {
                hl.field_q[var18] = new cr(0L, param2);
                gh.field_d[var18] = new cr(0L, np.field_Ib, var19);
                w.field_C[var18] = new cr(0L, (cr) null);
                w.field_C[var18].field_ab = 1;
                mg.field_M[var18] = new cr(0L, np.field_Ib);
                mg.field_M[var18].field_ab = 1;
                hl.field_q[var18].b(gh.field_d[var18], 125);
                hl.field_q[var18].b(w.field_C[var18], param4 ^ 12837);
                hl.field_q[var18].b(mg.field_M[var18], 120);
                hl.field_q[var18].i(-2147483648);
                td.field_c.b(hl.field_q[var18], param4 ^ 12834);
                sd.field_L = sd.field_L + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ea.field_c = new cr(0L, param10);
            ea.field_c.field_S = ad.field_c;
            td.field_c.b(ea.field_c, param4 - 12774);
            stackIn_34_0 = oe.q(76) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !pe.field_r) {
            return;
          }
          lq.field_a = new ql(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_44_0 = var12_ref;
          stackIn_44_1 = new StringBuilder().append("fm.B(");
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
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
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
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param11 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    static {
        field_h = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = "Open in popup window";
        field_a = "Elapsed time";
        field_d = -1;
        field_b = new nj();
        field_f = "You have not yet unlocked this option for use.";
    }
}
