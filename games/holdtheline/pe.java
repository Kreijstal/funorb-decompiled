/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_d;
    static int field_e;
    static oa field_b;
    static int[] field_g;
    static String field_c;
    static int field_f;
    static int[] field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var9 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var13 = HoldTheLine.field_D;
        try {
          var4_int = param0 / 2;
          var5 = param0 * 15 / 16;
          var6 = param0 / 32;
          var7 = param0 * 15 / 16;
          var8 = param0 * 115 / 128;
          for (var9 = 0; var8 > var9; var9++) {
            var10 = var4_int + (-var4_int + var6) * var9 / var8;
            var11 = var5 + var9 * (var7 - var5) / var8;
            var12 = -96 * var9 / var8 + 160;
            tc.c(var10 + (-(param0 / 2) + param2), -(param0 / 2) + param3 + var9, var11 - var10, 16777088, var12);
          }
          if (param1 != 4209) {
            field_d = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "pe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_47_2 = null;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        String stackIn_54_2 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        boolean stackIn_89_2 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
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
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          oi.field_f = true;
          pa.field_h = param0;
          if (pa.field_h == 0) {
            var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) 115, p.field_j);
            var4 = var3_int + 3;
            cd.field_f = new int[var4];
            ii.field_b = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              cd.field_f[var5] = -1;
            }
            ii.field_e = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ii.field_b[var5] = an.field_c[var5];
            }
            ii.field_b[var4 - 3] = "";
            ii.field_b[var4 - 2] = mg.field_e;
            cd.field_f[-2 + var4] = 0;
            ii.field_e[0] = 4;
            ii.field_b[-1 + var4] = h.field_f;
            cd.field_f[var4 - 1] = 1;
            ii.field_e[1] = 5;
          } else if (pa.field_h == 1) {
            var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) -95, p.field_j);
            var4 = 2 + var3_int;
            cd.field_f = new int[var4];
            ii.field_b = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              cd.field_f[var5] = -1;
            }
            ii.field_e = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              ii.field_b[var5] = an.field_c[var5];
            }
            ii.field_b[var4 - 2] = "";
            ii.field_b[-1 + var4] = h.field_f;
            cd.field_f[var4 - 1] = 0;
            ii.field_e[0] = 5;
          } else if (pa.field_h != 2) {
            if (pa.field_h == 3) {
              if (wi.field_b.field_f) {
                var3_int = mg.a(sj.field_G, sj.field_J, an.field_c, (byte) -60, p.field_j);
              } else {
                var3_int = mg.a(sj.field_G, ek.field_w, an.field_c, (byte) -70, p.field_j);
              }
              var4 = var3_int + 2;
              cd.field_f = new int[var4];
              ii.field_b = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                cd.field_f[var5] = -1;
              }
              ii.field_e = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ii.field_b[var5] = an.field_c[var5];
              }
              ii.field_b[-2 + var4] = "";
              ii.field_b[-1 + var4] = h.field_f;
              cd.field_f[-1 + var4] = 0;
              ii.field_e[0] = 5;
            } else if (pa.field_h == 4) {
              var3_int = mg.a(sj.field_G, dk.field_m, an.field_c, (byte) 106, p.field_j);
              var4 = 2 + var3_int;
              cd.field_f = new int[var4];
              ii.field_b = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cd.field_f[var5] = -1;
              }
              ii.field_e = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                ii.field_b[var5] = an.field_c[var5];
              }
              ii.field_b[var4 - 2] = "";
              ii.field_b[var4 - 1] = h.field_f;
              cd.field_f[-1 + var4] = 0;
              ii.field_e[0] = 5;
            } else {
              if (5 != pa.field_h) {
                throw new IllegalArgumentException();
              }
              var3_int = mg.a(sj.field_G, hc.field_c, an.field_c, (byte) 119, p.field_j);
              var4 = var3_int + 3;
              ii.field_b = new String[var4];
              cd.field_f = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cd.field_f[var5] = -1;
              }
              ii.field_e = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                ii.field_b[var5] = an.field_c[var5];
              }
              ii.field_b[var4 - 3] = "";
              ii.field_b[-2 + var4] = vk.field_i;
              cd.field_f[var4 - 2] = 0;
              ii.field_e[0] = 3;
              ii.field_b[-1 + var4] = h.field_f;
              cd.field_f[-1 + var4] = 1;
              ii.field_e[1] = 5;
            }
          } else {
            var3_int = mg.a(sj.field_G, sd.a(qg.field_a, new String[]{"<br><%0><br>"}, true), an.field_c, (byte) -59, p.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(an.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            qg.field_b = new String[var4];
            bc.a(an.field_c, 0, qg.field_b, 0, var4);
            aa.field_j = new String[-1 + (var3_int - var4)];
            bc.a(an.field_c, var4 + 1, aa.field_j, 0, -var4 + var3_int - 1);
            var3_int = mg.a(sj.field_G, sd.a(b.field_b, new String[]{"<br><%0><br>"}, true), an.field_c, (byte) 118, p.field_j);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(an.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            dg.field_b = new String[var4];
            bc.a(an.field_c, 0, dg.field_b, 0, var4);
            pb.field_a = new String[-1 + (-var4 + var3_int)];
            bc.a(an.field_c, 1 + var4, pb.field_a, 0, var3_int - var4 - 1);
            if (dg.field_b.length > qg.field_b.length) {
              stackIn_36_0 = dg.field_b.length;
            } else {
              stackIn_36_0 = qg.field_b.length;
            }
            var5 = stackIn_36_0;
            if (pb.field_a.length > aa.field_j.length) {
              stackIn_39_0 = pb.field_a.length;
            } else {
              stackIn_39_0 = aa.field_j.length;
            }
            var6 = stackIn_39_0;
            var7 = var5 + (7 + var6);
            ii.field_b = new String[var7];
            cd.field_f = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              cd.field_f[var8] = -1;
            }
            ii.field_e = new int[2];
            ii.field_b[1] = eb.field_k;
            cd.field_f[1] = 0;
            ii.field_b[0] = rc.field_b;
            cd.field_f[3] = 1;
            ii.field_b[2] = mg.field_k;
            ii.field_e[0] = 5;
            ii.field_b[5] = "";
            ii.field_b[3] = d.field_d;
            ii.field_e[1] = 2;
            ii.field_b[4] = wl.field_d;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_46_0 = ii.field_b;
              stackIn_46_1 = var8Lifetime2 + 6;
              if (-var5 + (var8Lifetime2 + dg.field_b.length) < 0) {
                stackIn_47_2 = "";
              } else {
                stackIn_47_2 = dg.field_b[-var5 + var8Lifetime2 + dg.field_b.length];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_47_2;
            }
            ii.field_b[6 + var5] = null;
            cd.field_f[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_51_0 = ii.field_b;
              stackIn_51_1 = var5 + 7 + var8Lifetime3;
              stackIn_51_2 = ~var8Lifetime3;
              stackIn_51_3 = ~pb.field_a.length;
              if (stackIn_51_2 > stackIn_51_3) {
                stackIn_54_2 = pb.field_a[var8Lifetime3];
              } else {
                stackIn_54_2 = "";
              }
              stackIn_51_0[stackIn_51_1] = stackIn_54_2;
            }
            cg.field_g = bb.b(-1);
          }
          kl.field_q.field_b = ii.field_e.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < ii.field_b.length; var4Lifetime1++) {
            stackIn_88_0 = ii.field_b[var4Lifetime1];
            stackIn_88_1 = -113;
            stackIn_89_2 = !(cd.field_f[var4Lifetime1] < 0);
            var5Lifetime1 = h.$cfr$intArgs$a$1694234bddb3(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == pa.field_h) {
            var11 = qg.field_b;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < var11.length; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = h.$cfr$intArgs$a$1694234bddb3(var12, -113, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = aa.field_j;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = h.$cfr$intArgs$a$1694234bddb3(var13, -113, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          var4Lifetime2 = 95 / ((-38 - param2) / 48);
          mk.field_d = mk.field_i - (var3_intLifetime1 >> 1);
          vf.field_t = var3_intLifetime1 + (mk.field_i - (var3_intLifetime1 >> 1));
          lb.field_v = (vf.field_w + dc.field_bb << 1) * kl.field_q.field_b;
          for (var5Lifetime3 = 0; var5Lifetime3 < ii.field_b.length; var5Lifetime3++) {
            stackIn_113_0 = lb.field_v;
            if (0 <= cd.field_f[var5Lifetime3]) {
              stackIn_114_1 = w.field_b;
            } else {
              stackIn_114_1 = hn.field_M;
            }
            lb.field_v = stackIn_113_0 + stackIn_114_1;
          }
          ie.field_j = in.field_i - (lb.field_v >> 1);
          fi.field_lb = new int[ii.field_b.length][];
          var5Lifetime4 = 0;
          var6Lifetime1 = ie.field_j;
          while (var5Lifetime4 < ii.field_b.length) {
            var7Lifetime2 = cd.field_f[var5Lifetime4];
            if (0 <= var7Lifetime2) {
              var8Lifetime1 = h.$cfr$intArgs$a$1694234bddb3(ii.field_b[var5Lifetime4], -113, true);
              var6Lifetime1 = var6Lifetime1 + dc.field_bb;
              var9 = -(var8Lifetime1 >> 1) + mk.field_i;
              fi.field_lb[var5Lifetime4] = new int[4];
              fi.field_lb[var5Lifetime4][0] = var9 - pg.field_G;
              fi.field_lb[var5Lifetime4][1] = var6Lifetime1;
              fi.field_lb[var5Lifetime4][2] = (pg.field_G << 1) + var8Lifetime1;
              fi.field_lb[var5Lifetime4][3] = (vf.field_w << 1) + w.field_b;
              var6Lifetime1 = var6Lifetime1 + (dc.field_bb + ((vf.field_w << 1) + w.field_b));
            } else {
              var6Lifetime1 = var6Lifetime1 + hn.field_M;
            }
            var5Lifetime4++;
          }
          if (pa.field_h == 2) {
            kl.field_q.a(-1, 0, param1, -1);
          } else {
            kl.field_q.a(cm.a((byte) 110, rf.field_X, nc.field_g), 0, param1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "pe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "<col=1><%0></col><br><br>Power: <%1><br>Speed: <%2><br>Grip: <%3>";
        field_e = 480;
        field_f = 2;
        field_a = new int[8192];
    }
}
