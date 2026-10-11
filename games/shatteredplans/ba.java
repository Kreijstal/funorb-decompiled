/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static int field_c;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 0) {
            field_c = 101;
          }
          field_a = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ba.A(" + param0 + ')');
        }
    }

    final static void a(qr param0, qr param1, int param2, qr param3, ur param4, qr param5, qr param6, qr param7, boolean param8, nq param9, qr param10, qr param11) {
        String stackIn_16_0 = null;
        int stackIn_34_0 = 0;
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
        bi var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        bi[] var16 = null;
        qr var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          ke.field_q[4] = 16711935;
          ke.field_q[1] = 6356832;
          ho.field_f = param9;
          ke.field_q[0] = 16764000;
          bh.field_k = param11;
          je.field_e = param8;
          ke.field_q[2] = 9474303;
          ke.field_q[3] = 16736511;
          hd.field_l[1] = 6356832;
          ke.field_q[4] = 16711935;
          ho.field_c = 8421504;
          if (param2 <= 122) {
            field_a = (String) null;
          }
          hd.field_l[3] = 16736511;
          hd.field_l[0] = 16764000;
          hd.field_l[2] = 16736352;
          var12 = new bi(4, 4);
          var13 = var12.field_B;
          var14 = var12.field_B;
          var15 = var12.field_B;
          var12.field_B[15] = 7368816;
          var14[5] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var16 = new bi[9];
          var16[4] = var12;
          tg.field_c = new qr(0L, param7);
          ad.field_c = new qr(0L, param6);
          tg.field_c.a(4, ad.field_c);
          var17 = new qr(0L, (qr) null);
          var17.field_M = new pf();
          ji.field_I = new ub(0L, var17, param1, param4);
          ad.field_c.a(4, ji.field_I);
          hi.field_o = new qr(0L, param3);
          ad.field_c.a(4, hi.field_o);
          uq.field_j = new qr(0L, param10);
          uq.field_j.field_nb = ho.field_f;
          hi.field_o.a(4, uq.field_j);
          hi.field_o.e((byte) -128);
          cg.field_C = new qr(0L, (qr) null);
          cg.field_C.field_F = var16;
          hi.field_o.a(4, cg.field_C);
          mr.field_d = new qr[5];
          tb.field_a = new qr[5];
          n.field_n = new qr[5];
          oq.field_b = new qr[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = -1;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 == ~var18) {
                if (!je.field_e) {
                  stackIn_16_0 = tr.field_Fb;
                } else {
                  stackIn_16_0 = ds.field_a;
                }
                var19 = stackIn_16_0;
              } else if (var18 != 1 ||
                !je.field_e) {
                decompiledFrameRemainder0 = (2 == var18);
                if (decompiledFrameRemainder0) {
                  var19 = jd.field_e;
                }
              } else {
                var19 = jo.field_c;
              }
              if (decompiledFrameRemainder0) {
                oq.field_b[var18] = new qr(0L, param5);
                tb.field_a[var18] = new qr(0L, bh.field_k, var19);
                mr.field_d[var18] = new qr(0L, (qr) null);
                mr.field_d[var18].field_G = 1;
                n.field_n[var18] = new qr(0L, bh.field_k);
                n.field_n[var18].field_G = 1;
                oq.field_b[var18].a(4, tb.field_a[var18]);
                oq.field_b[var18].a(4, mr.field_d[var18]);
                oq.field_b[var18].a(4, n.field_n[var18]);
                oq.field_b[var18].e((byte) -126);
                tg.field_c.a(4, oq.field_b[var18]);
                gq.field_d = gq.field_d + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            pr.field_c = new qr(0L, param0);
            pr.field_c.field_z = dk.field_c;
            tg.field_c.a(4, pr.field_c);
            stackIn_34_0 = cb.b((byte) -121) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !bg.field_g) {
            return;
          }
          wi.field_c = new eh(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_45_0 = var12_ref;
          stackIn_45_1 = new StringBuilder().append("ba.B(");
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
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param4 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param5 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
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
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    static {
        field_b = "Username: ";
        field_a = "Fleet Info";
    }
}
