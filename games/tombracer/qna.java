/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qna {
    static jea field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -2) {
          qna.a(-51);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        boolean stackIn_89_2 = false;
        int stackIn_110_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          qoa.field_a = true;
          mq.field_a = param2;
          if (mq.field_a == 0) {
            var3_int = ama.a(bfa.field_c, jba.field_l, rg.field_z, 1, lra.field_c);
            var4 = 3 + var3_int;
            bla.field_H = new int[var4];
            mba.field_g = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              bla.field_H[var5] = -1;
            }
            hb.field_w = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              mba.field_g[var5] = lra.field_c[var5];
            }
            mba.field_g[-3 + var4] = "";
            mba.field_g[-2 + var4] = ae.field_k;
            bla.field_H[-2 + var4] = 0;
            hb.field_w[0] = 4;
            mba.field_g[var4 - 1] = kh.field_j;
            bla.field_H[-1 + var4] = 1;
            hb.field_w[1] = 5;
          } else if (mq.field_a == 1) {
            var3_int = ama.a(bfa.field_c, jba.field_l, rg.field_z, 1, lra.field_c);
            var4 = var3_int + 2;
            bla.field_H = new int[var4];
            mba.field_g = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              bla.field_H[var5] = -1;
            }
            hb.field_w = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              mba.field_g[var5] = lra.field_c[var5];
            }
            mba.field_g[var4 - 2] = "";
            mba.field_g[-1 + var4] = kh.field_j;
            bla.field_H[-1 + var4] = 0;
            hb.field_w[0] = 5;
          } else if (mq.field_a != 2) {
            if (mq.field_a == 3) {
              if (dsa.field_c.field_c) {
                var3_int = ama.a(bfa.field_c, gd.field_G, rg.field_z, 1, lra.field_c);
              } else {
                var3_int = ama.a(bfa.field_c, jma.field_o, rg.field_z, 1, lra.field_c);
              }
              var4 = 2 + var3_int;
              bla.field_H = new int[var4];
              mba.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                bla.field_H[var5] = -1;
              }
              hb.field_w = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                mba.field_g[var5] = lra.field_c[var5];
              }
              mba.field_g[var4 - 2] = "";
              mba.field_g[var4 - 1] = kh.field_j;
              bla.field_H[-1 + var4] = 0;
              hb.field_w[0] = 5;
            } else if (4 == mq.field_a) {
              var3_int = ama.a(bfa.field_c, vca.field_b, rg.field_z, 1, lra.field_c);
              var4 = var3_int + 2;
              mba.field_g = new String[var4];
              bla.field_H = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                bla.field_H[var5] = -1;
              }
              hb.field_w = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                mba.field_g[var5] = lra.field_c[var5];
              }
              mba.field_g[-2 + var4] = "";
              mba.field_g[-1 + var4] = kh.field_j;
              bla.field_H[-1 + var4] = 0;
              hb.field_w[0] = 5;
            } else {
              if (mq.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ama.a(bfa.field_c, th.field_s, rg.field_z, 1, lra.field_c);
              var4 = var3_int + 3;
              bla.field_H = new int[var4];
              mba.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                bla.field_H[var5] = -1;
              }
              hb.field_w = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                mba.field_g[var5] = lra.field_c[var5];
              }
              mba.field_g[var4 - 3] = "";
              mba.field_g[-2 + var4] = sqa.field_a;
              bla.field_H[var4 - 2] = 0;
              hb.field_w[0] = 3;
              mba.field_g[var4 - 1] = kh.field_j;
              bla.field_H[var4 - 1] = 1;
              hb.field_w[1] = 5;
            }
          } else {
            var3_int = ama.a(bfa.field_c, gl.$cfr$intArgs$a$53ce4ab4c593(96, rr.field_G, new String[]{"<br><%0><br>"}), rg.field_z, 1, lra.field_c);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(lra.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            cia.field_a = new String[var4];
            lua.a(lra.field_c, 0, cia.field_a, 0, var4);
            wr.field_o = new String[-var4 + var3_int - 1];
            lua.a(lra.field_c, var4 + 1, wr.field_o, 0, -1 + (-var4 + var3_int));
            var4 = -1;
            var3_int = ama.a(bfa.field_c, gl.$cfr$intArgs$a$53ce4ab4c593(89, lqa.field_g, new String[]{"<br><%0><br>"}), rg.field_z, 1, lra.field_c);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(lra.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            pm.field_d = new String[var4];
            lua.a(lra.field_c, 0, pm.field_d, 0, var4);
            ea.field_k = new String[-1 + var3_int - var4];
            lua.a(lra.field_c, 1 + var4, ea.field_k, 0, var3_int - var4 - 1);
            if (pm.field_d.length <= cia.field_a.length) {
              stackIn_58_0 = cia.field_a.length;
            } else {
              stackIn_58_0 = pm.field_d.length;
            }
            var5 = stackIn_58_0;
            if (ea.field_k.length > wr.field_o.length) {
              stackIn_61_0 = ea.field_k.length;
            } else {
              stackIn_61_0 = wr.field_o.length;
            }
            var6 = stackIn_61_0;
            var7 = 7 + var5 + var6;
            bla.field_H = new int[var7];
            mba.field_g = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              bla.field_H[var8] = -1;
            }
            bla.field_H[1] = 0;
            mba.field_g[1] = vc.field_s;
            mba.field_g[0] = bha.field_B;
            hb.field_w = new int[2];
            mba.field_g[3] = mha.field_F;
            mba.field_g[4] = kka.field_p;
            bla.field_H[3] = 1;
            hb.field_w[1] = 2;
            mba.field_g[5] = "";
            mba.field_g[2] = cq.field_c;
            hb.field_w[0] = 5;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_68_0 = mba.field_g;
              stackIn_68_1 = var8Lifetime2 + 6;
              if (-var5 + (var8Lifetime2 + pm.field_d.length) >= 0) {
                stackIn_69_2 = pm.field_d[pm.field_d.length + var8Lifetime2 - var5];
              } else {
                stackIn_69_2 = "";
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            mba.field_g[6 + var5] = null;
            bla.field_H[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_74_0 = mba.field_g;
              stackIn_74_1 = var8Lifetime3 + 7 + var5;
              if (ea.field_k.length <= var8Lifetime3) {
                stackIn_75_2 = "";
              } else {
                stackIn_75_2 = ea.field_k[var8Lifetime3];
              }
              stackIn_74_0[stackIn_74_1] = stackIn_75_2;
            }
            ln.field_H = bva.b((byte) -107);
          }
          sa.field_r.field_i = hb.field_w.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < mba.field_g.length; var4Lifetime1++) {
            stackIn_88_0 = -116;
            stackIn_88_1 = mba.field_g[var4Lifetime1];
            stackIn_89_2 = !(bla.field_H[var4Lifetime1] < 0);
            var5Lifetime1 = ro.$cfr$intArgs$a$590e95718a07(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (mq.field_a == 2) {
            var10 = cia.field_a;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ro.$cfr$intArgs$a$590e95718a07(-116, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = wr.field_o;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ro.$cfr$intArgs$a$590e95718a07(-116, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          hg.field_f = sa.field_r.field_i * (mha.field_C + pqa.field_p << 1);
          am.field_o = ega.field_c - (var3_intLifetime1 >> 1);
          tia.field_a = var3_intLifetime1 + (ega.field_c - (var3_intLifetime1 >> 1));
          for (var4Lifetime2 = 0; var4Lifetime2 < mba.field_g.length; var4Lifetime2++) {
            stackIn_110_0 = hg.field_f;
            if (bla.field_H[var4Lifetime2] >= 0) {
              stackIn_111_1 = nt.field_d;
            } else {
              stackIn_111_1 = f.field_b;
            }
            hg.field_f = stackIn_110_0 + stackIn_111_1;
          }
          jua.field_d = -(hg.field_f >> 1) + gd.field_L;
          er.field_K = new int[mba.field_g.length][];
          var4Lifetime3 = 0;
          if (param0 != 1) {
            qna.a(-17, true, 122);
          }
          var5Lifetime3 = jua.field_d;
          while (var4Lifetime3 < mba.field_g.length) {
            var6Lifetime1 = bla.field_H[var4Lifetime3];
            if (0 <= var6Lifetime1) {
              var7Lifetime2 = ro.$cfr$intArgs$a$590e95718a07(-116, mba.field_g[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + mha.field_C;
              var8Lifetime1 = ega.field_c - (var7Lifetime2 >> 1);
              er.field_K[var4Lifetime3] = new int[4];
              er.field_K[var4Lifetime3][0] = -nja.field_L + var8Lifetime1;
              er.field_K[var4Lifetime3][1] = var5Lifetime3;
              er.field_K[var4Lifetime3][2] = (nja.field_L << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (nt.field_d + ((pqa.field_p << 1) + mha.field_C));
              er.field_K[var4Lifetime3][3] = nt.field_d + (pqa.field_p << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + f.field_b;
            }
            var4Lifetime3++;
          }
          if (2 == mq.field_a) {
            sa.field_r.a(param1, 29954, -1, -1);
          } else {
            sa.field_r.a(param1, param0 + 29953, 0, wg.a(1541709953, jba.field_j, sta.field_B));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "qna.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Aww! Don't you just want to cuddle them? NO. HEAVENS NO. Avoid skeletons like the plague, or they'll probably give it to you.";
        field_c = "Silver Medal Award";
    }
}
