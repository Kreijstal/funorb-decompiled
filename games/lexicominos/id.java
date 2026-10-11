/*
 * Decompiled by CFR-JS 0.4.0.
 */
class id extends ik {
    static oj[] field_w;
    static int field_v;
    static String field_u;
    static String field_t;

    id(le param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_E, -1, 2147483647, false);
    }

    id(int param0) {
        this(ql.field_Q, param0);
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        try {
          if (param2) {
            ae.a(true, param3.field_j, param3.field_o + param0, param3.field_v, param1 + param3.field_t);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String stackIn_46_2 = null;
        String stackIn_87_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_112_0 = 0;
        int stackIn_113_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var5_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var7Lifetime1;
        int var8Lifetime3;
        int var8Lifetime4;
        int var6Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          sh.field_a = param0;
          sc.field_e = true;
          if (sh.field_a == 0) {
            var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
            var4 = 3 + var3_int;
            ni.field_a = new int[var4];
            ee.field_g = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ni.field_a[var5] = -1;
            }
            ik.field_g = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ee.field_g[var5] = ug.field_r[var5];
            }
            ee.field_g[var4 - 3] = "";
            ee.field_g[-2 + var4] = l.field_E;
            ni.field_a[-2 + var4] = 0;
            ik.field_g[0] = 4;
            ee.field_g[var4 - 1] = vk.field_d;
            ni.field_a[-1 + var4] = 1;
            ik.field_g[1] = 5;
          } else if (sh.field_a == 1) {
            var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
            var4 = var3_int + 2;
            ni.field_a = new int[var4];
            ee.field_g = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ni.field_a[var5] = -1;
            }
            ik.field_g = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              ee.field_g[var5] = ug.field_r[var5];
            }
            ee.field_g[-2 + var4] = "";
            ee.field_g[-1 + var4] = vk.field_d;
            ni.field_a[-1 + var4] = 0;
            ik.field_g[0] = 5;
          } else if (sh.field_a != 2) {
            if (sh.field_a == 3) {
              if (jh.field_a.field_e) {
                var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qb.field_m, nb.field_x);
              } else {
                var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, lb.field_a, nb.field_x);
              }
              var4 = var3_int + 2;
              ni.field_a = new int[var4];
              ee.field_g = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ni.field_a[var5] = -1;
              }
              ik.field_g = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ee.field_g[var5] = ug.field_r[var5];
              }
              ee.field_g[-2 + var4] = "";
              ee.field_g[-1 + var4] = vk.field_d;
              ni.field_a[var4 - 1] = 0;
              ik.field_g[0] = 5;
            } else if (sh.field_a == 4) {
              var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pj.field_B, nb.field_x);
              var4 = var3_int + 2;
              ni.field_a = new int[var4];
              ee.field_g = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ni.field_a[var5] = -1;
              }
              ik.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                ee.field_g[var5] = ug.field_r[var5];
              }
              ee.field_g[-2 + var4] = "";
              ee.field_g[var4 - 1] = vk.field_d;
              ni.field_a[var4 - 1] = 0;
              ik.field_g[0] = 5;
            } else {
              if (sh.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qj.field_db, nb.field_x);
              var4 = 3 + var3_int;
              ni.field_a = new int[var4];
              ee.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ni.field_a[var5] = -1;
              }
              ik.field_g = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                ee.field_g[var5] = ug.field_r[var5];
              }
              ee.field_g[-3 + var4] = "";
              ee.field_g[var4 - 2] = hl.field_p;
              ni.field_a[-2 + var4] = 0;
              ik.field_g[0] = 3;
              ee.field_g[var4 - 1] = vk.field_d;
              ni.field_a[-1 + var4] = 1;
              ik.field_g[1] = 5;
            }
          } else {
            var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, pl.field_a, false), nb.field_x);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ug.field_r[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ed.field_t = new String[var4];
            o.a(ug.field_r, 0, ed.field_t, 0, var4);
            qc.field_e = new String[-1 + (-var4 + var3_int)];
            o.a(ug.field_r, 1 + var4, qc.field_e, 0, -1 + var3_int - var4);
            var4 = -1;
            var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, mg.field_z, false), nb.field_x);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ug.field_r[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            hf.field_b = new String[var4];
            o.a(ug.field_r, 0, hf.field_b, 0, var4);
            nl.field_a = new String[-1 + (-var4 + var3_int)];
            o.a(ug.field_r, 1 + var4, nl.field_a, 0, -1 + var3_int - var4);
            if (ed.field_t.length >= hf.field_b.length) {
              stackIn_29_0 = ed.field_t.length;
            } else {
              stackIn_29_0 = hf.field_b.length;
            }
            var5 = stackIn_29_0;
            if (qc.field_e.length >= nl.field_a.length) {
              stackIn_32_0 = qc.field_e.length;
            } else {
              stackIn_32_0 = nl.field_a.length;
            }
            var6 = stackIn_32_0;
            var7 = var6 + 7 + var5;
            ni.field_a = new int[var7];
            ee.field_g = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              ni.field_a[var8] = -1;
            }
            ee.field_g[1] = pf.field_l;
            ee.field_g[0] = n.field_c;
            ik.field_g = new int[2];
            ni.field_a[1] = 0;
            ik.field_g[1] = 2;
            ee.field_g[5] = "";
            ee.field_g[3] = pa.field_c;
            ik.field_g[0] = 5;
            ee.field_g[4] = sb.field_b;
            ni.field_a[3] = 1;
            ee.field_g[2] = eg.field_F;
            for (var8Lifetime3 = 0; var5 > var8Lifetime3; var8Lifetime3++) {
              stackIn_39_0 = ee.field_g;
              stackIn_39_1 = 6 + var8Lifetime3;
              if (-var5 + var8Lifetime3 + hf.field_b.length < 0) {
                stackIn_40_2 = "";
              } else {
                stackIn_40_2 = hf.field_b[var8Lifetime3 + (hf.field_b.length - var5)];
              }
              stackIn_39_0[stackIn_39_1] = stackIn_40_2;
            }
            ee.field_g[6 + var5] = null;
            ni.field_a[6 + var5] = -2;
            for (var8Lifetime4 = 0; var6 > var8Lifetime4; var8Lifetime4++) {
              stackIn_45_0 = ee.field_g;
              stackIn_45_1 = var5 + (7 + var8Lifetime4);
              if (var8Lifetime4 >= nl.field_a.length) {
                stackIn_46_2 = "";
              } else {
                stackIn_46_2 = nl.field_a[var8Lifetime4];
              }
              stackIn_45_0[stackIn_45_1] = stackIn_46_2;
            }
            ug.field_x = rf.c(0);
          }
          bc.field_H.field_h = ik.field_g.length;
          var3_intLifetime1 = 0;
          var4Lifetime1 = 114 / ((81 - param2) / 34);
          for (var5Lifetime1 = 0; var5Lifetime1 < ee.field_g.length; var5Lifetime1++) {
            stackIn_87_0 = ee.field_g[var5Lifetime1];
            stackIn_88_1 = !(ni.field_a[var5Lifetime1] < 0);
            var6Lifetime1 = ii.a(stackIn_87_0, stackIn_88_1, 0);
            if (var6Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var6Lifetime1;
            }
          }
          if (sh.field_a == 2) {
            var11 = ed.field_t;
            var5_ref_String__ = var11;
            for (var6Lifetime2 = 0; var11.length > var6Lifetime2; var6Lifetime2++) {
              var12 = var11[var6Lifetime2];
              var8Lifetime1 = ii.a(var12, false, 0);
              if (var8Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var8Lifetime1;
              }
            }
            var5_ref_String__Lifetime1 = qc.field_e;
            for (var6Lifetime2Lifetime1 = 0; var5_ref_String__Lifetime1.length > var6Lifetime2Lifetime1; var6Lifetime2Lifetime1++) {
              var13 = var5_ref_String__Lifetime1[var6Lifetime2Lifetime1];
              var8Lifetime1Lifetime1 = ii.a(var13, false, 0);
              if (var8Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var8Lifetime1Lifetime1;
              }
            }
          }
          me.field_v = -(var3_intLifetime1 >> 1) + uh.field_D;
          gd.field_o = -(var3_intLifetime1 >> 1) + uh.field_D + var3_intLifetime1;
          ph.field_b = (oh.field_b + we.field_l << 1) * bc.field_H.field_h;
          for (var5Lifetime2 = 0; var5Lifetime2 < ee.field_g.length; var5Lifetime2++) {
            stackIn_112_0 = ph.field_b;
            if (ni.field_a[var5Lifetime2] < 0) {
              stackIn_113_1 = hc.field_fb;
            } else {
              stackIn_113_1 = fb.field_g;
            }
            ph.field_b = stackIn_112_0 + stackIn_113_1;
          }
          rf.field_c = ij.field_p - (ph.field_b >> 1);
          wd.field_a = new int[ee.field_g.length][];
          var5Lifetime3 = 0;
          var6Lifetime3 = rf.field_c;
          while (ee.field_g.length > var5Lifetime3) {
            var7Lifetime1 = ni.field_a[var5Lifetime3];
            if (var7Lifetime1 < 0) {
              var6Lifetime3 = var6Lifetime3 + hc.field_fb;
            } else {
              var8Lifetime2 = ii.a(ee.field_g[var5Lifetime3], true, 0);
              var9 = -(var8Lifetime2 >> 1) + uh.field_D;
              var6Lifetime3 = var6Lifetime3 + we.field_l;
              wd.field_a[var5Lifetime3] = new int[4];
              wd.field_a[var5Lifetime3][0] = -jh.field_e + var9;
              wd.field_a[var5Lifetime3][1] = var6Lifetime3;
              wd.field_a[var5Lifetime3][2] = (jh.field_e << 1) + var8Lifetime2;
              var6Lifetime3 = var6Lifetime3 + (fb.field_g + we.field_l + (oh.field_b << 1));
              wd.field_a[var5Lifetime3][3] = fb.field_g + (oh.field_b << 1);
            }
            var5Lifetime3++;
          }
          if (sh.field_a == 2) {
            bc.field_H.a(0, param1, -1, -1);
          } else {
            bc.field_H.a(0, param1, rc.a(bk.field_b, 29532, sh.field_e), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "id.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 96) {
          field_w = (oj[]) null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    static {
        field_u = "Please try again in a few minutes.";
        field_t = " <times>?";
    }
}
