/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static String field_a;
    static ck field_b;
    static int field_d;
    static RgbSprite[] field_c;
    static String field_f;
    static RgbSprite[][] field_e;

    public static void a(boolean param0) {
        field_e = (RgbSprite[][]) null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (!param0) {
          bq.a(false, 57, (byte) -48);
        }
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param0 != -6) {
          field_c = (RgbSprite[]) null;
        }
        return go.a(param4, param3, false, param1, param2, true);
    }

    final static MenuScreen a(int param0, int param1) {
        if (param1 != 28472) {
          return (MenuScreen) null;
        }
        return pg.menuScreens[param0];
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        String stackIn_84_2 = null;
        boolean stackIn_93_0 = false;
        int stackIn_118_0 = 0;
        int stackIn_119_1 = 0;
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
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          ik.field_j = true;
          ih.field_p = param1;
          if (0 == ih.field_p) {
            var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, up.field_x);
            var4 = 3 + var3_int;
            BrickABrac.field_K = new int[var4];
            qh.field_i = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              BrickABrac.field_K[var5] = -1;
            }
            ri.field_I = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              qh.field_i[var5] = kg.field_h[var5];
            }
            qh.field_i[var4 - 3] = "";
            qh.field_i[var4 - 2] = g.field_q;
            BrickABrac.field_K[var4 - 2] = 0;
            ri.field_I[0] = 4;
            qh.field_i[-1 + var4] = LevelSequence.field_a;
            BrickABrac.field_K[-1 + var4] = 1;
            ri.field_I[1] = 5;
          } else if (1 == ih.field_p) {
            var3_int = qb.a(kg.field_h, m.field_b, param2 ^ -87, ni.field_Wb, up.field_x);
            var4 = 2 + var3_int;
            BrickABrac.field_K = new int[var4];
            qh.field_i = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              BrickABrac.field_K[var5] = -1;
            }
            ri.field_I = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              qh.field_i[var5] = kg.field_h[var5];
            }
            qh.field_i[var4 - 2] = "";
            qh.field_i[-1 + var4] = LevelSequence.field_a;
            BrickABrac.field_K[-1 + var4] = 0;
            ri.field_I[0] = 5;
          } else if (2 != ih.field_p) {
            if (3 == ih.field_p) {
              if (lp.field_ub.field_i) {
                var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, ff.field_a);
              } else {
                var3_int = qb.a(kg.field_h, m.field_b, param2 ^ -87, ni.field_Wb, df.field_d);
              }
              var4 = 2 + var3_int;
              qh.field_i = new String[var4];
              BrickABrac.field_K = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                BrickABrac.field_K[var5] = -1;
              }
              ri.field_I = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                qh.field_i[var5] = kg.field_h[var5];
              }
              qh.field_i[var4 - 2] = "";
              qh.field_i[var4 - 1] = LevelSequence.field_a;
              BrickABrac.field_K[-1 + var4] = 0;
              ri.field_I[0] = 5;
            } else if (ih.field_p == 4) {
              var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, oo.field_s);
              var4 = var3_int + 2;
              qh.field_i = new String[var4];
              BrickABrac.field_K = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                BrickABrac.field_K[var5] = -1;
              }
              ri.field_I = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                qh.field_i[var5] = kg.field_h[var5];
              }
              qh.field_i[var4 - 2] = "";
              qh.field_i[var4 - 1] = LevelSequence.field_a;
              BrickABrac.field_K[-1 + var4] = 0;
              ri.field_I[0] = 5;
            } else {
              if (ih.field_p != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, eo.field_h);
              var4 = 3 + var3_int;
              BrickABrac.field_K = new int[var4];
              qh.field_i = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                BrickABrac.field_K[var5] = -1;
              }
              ri.field_I = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                qh.field_i[var5] = kg.field_h[var5];
              }
              qh.field_i[var4 - 3] = "";
              qh.field_i[var4 - 2] = ja.field_b;
              BrickABrac.field_K[var4 - 2] = 0;
              ri.field_I[0] = 3;
              qh.field_i[var4 - 1] = LevelSequence.field_a;
              BrickABrac.field_K[-1 + var4] = 1;
              ri.field_I[1] = 5;
            }
          } else {
            var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(PowerUp.field_x, new String[]{"<br><%0><br>"}, (byte) 103));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(kg.field_h[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            rg.field_k = new String[var4];
            pm.a(kg.field_h, 0, rg.field_k, 0, var4);
            h.field_F = new String[-1 - var4 + var3_int];
            pm.a(kg.field_h, 1 + var4, h.field_F, 0, -1 + (-var4 + var3_int));
            var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(u.field_e, new String[]{"<br><%0><br>"}, (byte) 103));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(kg.field_h[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ik.field_b = new String[var4];
            pm.a(kg.field_h, 0, ik.field_b, 0, var4);
            fk.field_h = new String[var3_int - (var4 + 1)];
            pm.a(kg.field_h, var4 + 1, fk.field_h, 0, -1 + (var3_int - var4));
            if (ik.field_b.length > rg.field_k.length) {
              stackIn_66_0 = ik.field_b.length;
            } else {
              stackIn_66_0 = rg.field_k.length;
            }
            var5 = stackIn_66_0;
            if (fk.field_h.length <= h.field_F.length) {
              stackIn_69_0 = h.field_F.length;
            } else {
              stackIn_69_0 = fk.field_h.length;
            }
            var6 = stackIn_69_0;
            var7 = var6 + (var5 + 7);
            BrickABrac.field_K = new int[var7];
            qh.field_i = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              BrickABrac.field_K[var8] = -1;
            }
            qh.field_i[0] = dg.field_k;
            qh.field_i[1] = c.field_c;
            BrickABrac.field_K[1] = 0;
            ri.field_I = new int[2];
            BrickABrac.field_K[3] = 1;
            ri.field_I[1] = 2;
            qh.field_i[4] = u.field_f;
            ri.field_I[0] = 5;
            qh.field_i[2] = rf.field_e;
            qh.field_i[5] = "";
            qh.field_i[3] = di.field_c;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_76_0 = qh.field_i;
              stackIn_76_1 = 6 + var8Lifetime2;
              if (0 > var8Lifetime2 - (-ik.field_b.length + var5)) {
                stackIn_77_2 = "";
              } else {
                stackIn_77_2 = ik.field_b[-var5 + (ik.field_b.length + var8Lifetime2)];
              }
              stackIn_76_0[stackIn_76_1] = stackIn_77_2;
            }
            qh.field_i[6 + var5] = null;
            BrickABrac.field_K[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_81_0 = qh.field_i;
              stackIn_81_1 = 7 + (var5 + var8Lifetime3);
              stackIn_81_2 = ~fk.field_h.length;
              stackIn_81_3 = ~var8Lifetime3;
              if (stackIn_81_2 >= stackIn_81_3) {
                stackIn_84_2 = "";
              } else {
                stackIn_84_2 = fk.field_h[var8Lifetime3];
              }
              stackIn_81_0[stackIn_81_1] = stackIn_84_2;
            }
            un.field_g = ue.a(false);
          }
          mh.field_H.itemCount = ri.field_I.length;
          var3_intLifetime1 = 0;
          if (param2 != 104) {
            return;
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < qh.field_i.length; var4Lifetime1++) {
            stackIn_93_0 = !(BrickABrac.field_K[var4Lifetime1] < 0);
            var5Lifetime1 = hm.a(stackIn_93_0, qh.field_i[var4Lifetime1], 0);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ih.field_p == 2) {
            var10 = rg.field_k;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = hm.a(false, var11, param2 - 104);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = h.field_F;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = hm.a(false, var12, 0);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          jj.field_c = mh.field_H.itemCount * (kn.field_y + jb.field_H << 1);
          np.field_b = wi.field_k - (var3_intLifetime1 >> 1);
          ci.field_u = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + wi.field_k);
          for (var4Lifetime2 = 0; qh.field_i.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_118_0 = jj.field_c;
            if (BrickABrac.field_K[var4Lifetime2] >= 0) {
              stackIn_119_1 = b.field_c;
            } else {
              stackIn_119_1 = pe.field_s;
            }
            jj.field_c = stackIn_118_0 + stackIn_119_1;
          }
          jq.field_r = -(jj.field_c >> 1) + w.field_k;
          ce.field_a = new int[qh.field_i.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = jq.field_r;
          while (var4Lifetime3 < qh.field_i.length) {
            var6Lifetime1 = BrickABrac.field_K[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = hm.a(true, qh.field_i[var4Lifetime3], param2 - 104);
              var8Lifetime1 = wi.field_k - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + kn.field_y;
              ce.field_a[var4Lifetime3] = new int[4];
              ce.field_a[var4Lifetime3][0] = -cn.field_c + var8Lifetime1;
              ce.field_a[var4Lifetime3][1] = var5Lifetime3;
              ce.field_a[var4Lifetime3][2] = (cn.field_c << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (kn.field_y + ((jb.field_H << 1) + b.field_c));
              ce.field_a[var4Lifetime3][3] = (jb.field_H << 1) + b.field_c;
            } else {
              var5Lifetime3 = var5Lifetime3 + pe.field_s;
            }
            var4Lifetime3++;
          }
          if (ih.field_p != 2) {
            mh.field_H.initializeSelection(qo.b(120, po.pointerY, pq.pointerX), 0, param0, (byte) -127);
          } else {
            mh.field_H.initializeSelection(-1, -1, param0, (byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "bq.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Open";
        field_f = "Crumbs!";
        field_d = 0;
    }
}
