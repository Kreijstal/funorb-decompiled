/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends qe {
    private gd field_L;
    private nn field_M;
    private tf field_E;
    private gd field_C;
    private gd field_A;
    private int field_z;
    private gd field_w;
    static String field_K;
    private int field_F;
    private cl field_u;
    private gd field_P;
    private boolean field_s;
    static int[] field_x;
    private gd field_y;
    private gd field_t;
    private pp field_Q;
    private cp[] field_v;
    private pp field_O;
    private cp[] field_D;
    private nn field_R;
    static String[] field_J;
    static cn[] field_G;
    private rh field_N;
    private rh field_I;
    static String field_r;
    private wd field_H;

    private final static cn[] a(cn[] param0, int param1) {
        cn[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cn var4 = null;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn var9 = null;
        cn var10 = null;
        cn[] stackIn_10_0 = null;
        cn[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var2 = new cn[param0.length];
          jh.c();
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param0.length <= var3))) {
            var7 = param0[var3];
            var4 = var7;
            if (var6 == 0) {
              if (var4 != null) {
                var8 = new cn(27 * var7.field_E / 16, var7.field_G * 20 / 12);
                var8.e();
                var4.c(-(var7.field_w * 27) / 16, -(var7.field_A * 27) / 16, var8.field_E, var8.field_G);
                var9 = var8;
                var10 = new cn(var9.field_E / 2, var9.field_G / 2);
                var10.e();
                var9.e(var10.field_E / 2, var10.field_G / 2, 0, 2048);
                var10.field_A = var9.field_A * 27 >> 5;
                var4 = var10;
                var10.c();
                var2[var3] = var4;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            jh.b();
          }
          if (param1 == 400) {
            stackIn_12_0 = var2;
            return stackIn_12_0;
          }
          stackIn_10_0 = (cn[]) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("p.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(gd param0, String param1, byte param2, String param3, String param4) {
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        String var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        try {
          if (param2 < 109) {
            this.a((byte) -82);
          }
          jh.c();
          var6_int = 130;
          var7 = db.field_v.field_H + db.field_v.field_E;
          var8 = new cn(var6_int, var7);
          var8.e();
          db.field_v.b(param4, 0, db.field_v.field_H, 12632256, -1);
          db.field_v.a(param3, var6_int, db.field_v.field_H, 12632256, -1);
          var9 = new cn(var6_int, var7);
          var9.e();
          db.field_v.b(param4, 0, db.field_v.field_H, 12690143, -1);
          db.field_v.a(param3, var6_int, db.field_v.field_H, 12690143, -1);
          if (!param0.field_B) {
            stackIn_5_0 = (String) (param3);
          } else {
            stackIn_5_0 = (String) (param1);
          }
          var10 = stackIn_5_0;
          var11 = new cn(var6_int, var7);
          var11.e();
          db.field_v.b(param4, 0, db.field_v.field_H, 16744448, -1);
          db.field_v.a(var10, var6_int, db.field_v.field_H, 16744448, -1);
          jh.b();
          var12 = rb.a(8, var9, 255, (byte) -13);
          var13 = rb.a(8, var11, 16711680, (byte) 78);
          param0.a(var11, var8, var13, var9, (byte) 126, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("p.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final gd a(String param0, String param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        cn var9 = null;
        cn var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        gd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jh.c();
          var7_int = 130;
          var8 = db.field_v.field_E + db.field_v.field_H;
          var9 = new cn(var7_int, var8);
          var9.e();
          db.field_v.b(param1, 0, db.field_v.field_H, 12632256, -1);
          db.field_v.a(param0, var7_int, db.field_v.field_H, 12632256, param3);
          var10 = new cn(var7_int, var8);
          var10.e();
          db.field_v.b(param1, 0, db.field_v.field_H, 12690143, -1);
          db.field_v.a(param0, var7_int, db.field_v.field_H, 12690143, -1);
          var11 = new cn(var7_int, var8);
          var11.e();
          db.field_v.b(param1, 0, db.field_v.field_H, 16744448, -1);
          db.field_v.a(param5, var7_int, db.field_v.field_H, 16744448, -1);
          jh.b();
          var12 = rb.a(8, var10, 255, (byte) 92);
          var13 = rb.a(8, var11, 16711680, (byte) -8);
          stackIn_1_0 = new gd(var9, var10, var12, var11, var13, param2, (-var8 + 30 >> 1) + param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("p.R(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ac var4 = null;
        cp var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        if (param0 != 26) {
          return;
        }
        this.field_v = new cp[gh.field_i.length];
        var2 = 0;
        var3 = 0;
        while (var3 < gh.field_i.length) {
          var4 = gh.field_i[var3];
          if (var6 == 0) {
            if (var4 != null && var4.field_j != -1 && (0 != var4.field_g &&
              var4.field_z != null &&
              var4.field_i <= gm.field_d.field_m)) {
              var5 = new cp(10, var2, var4);
              var2 = var2 + (var5.field_x + 10);
              this.field_v[var3] = var5;
              this.field_R.a((gd) (var5), (byte) -20);
            }
            var3++;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        lb var5;
        int var6;
        cn var7_ref_cn;
        int var7;
        int var8;
        int var9;
        lb var10;
        if (param2 < 126) {
          return;
        }
        var10 = gm.field_d;
        var5 = var10;
        var6 = var10.field_L[param3].field_a;
        if (qj.field_c[param3] != null) {
          var6 = qj.field_c[param3].field_a;
        }
        if (var6 != 0) {
          this.a(param1, 124, param3, -dm.field_a[var6].field_v + 56 + param0, dm.field_a[var6]);
          if (gh.field_i[var6].field_g == 2) {
            var7_ref_cn = jb.a((byte) -70, var6);
            if (var7_ref_cn != null) {
              var8 = var7_ref_cn.field_E * 5 >> 3;
              var9 = var7_ref_cn.field_G * 5 >> 3;
              var7_ref_cn.c(param1 + (-var8 + 48 >> 1), 40 + param0 - var9, var8, var9);
            }
            if (DungeonAssault.field_K != 0) {
              var7 = 0;
              if (param3 % 7 != 0 &&
                gm.field_d.field_k.a(-1 + param3 - param3 / 7, (byte) 72)) {
                var7 = var7 | 1;
              }
              if (param3 % 7 != 6 &&
                gm.field_d.field_k.a(param3 - param3 / 7, (byte) 73)) {
                var7 = var7 | 2;
              }
              if (param3 > 6 &&
                gm.field_d.field_k.a(param3 + 35, (byte) 119)) {
                var7 = var7 | 4;
              }
              if (param3 < 42 &&
                gm.field_d.field_k.a(param3 + 42, (byte) 80)) {
                var7 = var7 | 8;
              }
              id.field_m[var7].h(param1, param0 + 12);
            }
          }
        } else {
          var7 = 0;
          if (param3 % 7 != 0 &&
            gm.field_d.field_k.a(-1 + param3 - param3 / 7, (byte) 72)) {
            var7 = var7 | 1;
          }
          if (param3 % 7 != 6 &&
            gm.field_d.field_k.a(param3 - param3 / 7, (byte) 73)) {
            var7 = var7 | 2;
          }
          if (param3 > 6 &&
            gm.field_d.field_k.a(param3 + 35, (byte) 119)) {
            var7 = var7 | 4;
          }
          if (param3 < 42 &&
            gm.field_d.field_k.a(param3 + 42, (byte) 80)) {
            var7 = var7 | 8;
          }
          id.field_m[var7].h(param1, param0 + 12);
        }
    }

    final void a(boolean param0) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        Object var2 = null;
        Object var3 = null;
        rj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        gg var16 = null;
        String var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var11Lifetime1;
        var15 = DungeonAssault.field_K;
        super.a(param0);
        this.field_e.b(0, 0);
        var2 = null;
        if (-1 != this.field_F) {
          var2 = qj.field_c[this.field_F];
          if (var2 == null) {
            var2 = gm.field_d.field_L[this.field_F];
          }
        }
        var3 = null;
        if (var2 == null) {
          if (this.field_R.field_l != null) {
            var3 = ((cp) (this.field_R.field_l)).field_S;
          }
        } else {
          var3 = ((ai) (var2)).field_h;
        }
        p.a(200, 65, (ac) (var3));
        if (var2 != null) {
          p.a(488, 54, (ai) (var2));
          if (var15 != 0) {
            p.a(488, 54, this.field_H, kc.field_V);
          }
        } else {
          p.a(488, 54, this.field_H, kc.field_V);
        }
        this.a(false, 484, 327);
        var4 = (rj) (this.field_p.e(-24172));
        do {
          if (var4 == null) {
            ad.field_e.h(187, 48);
            ad.field_e.i(187, -ad.field_e.field_b + 40);
            ad.field_e.f(604 - ad.field_e.field_d, 40 - ad.field_e.field_b);
            oe.field_m.h(171, 382);
            oe.field_m.j(580, 99);
            break;
          }
          var4.a(68);
          var4 = (rj) (this.field_p.a(4));
        } while (var15 == 0);
        if (gl.field_Lb) {
          this.field_u.b((byte) -55);
          if (var15 != 0) {
            this.a(8, 80, 394);
          }
        } else {
          this.a(8, 80, 394);
        }
        if (null != this.field_b) {
          this.field_b.a((byte) -91);
        }
        p.e();
        this.field_q.a((byte) -61);
        boolean decompiledSharedTail0 = !(!gl.field_Lb);
        if (!decompiledSharedTail0) {
          var5 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 128.0);
          wm.field_c.b(205, 83, 256);
          wm.field_c.b(205, 83, var5);
          if (this.field_w.field_B) {
            ec.a(95, 205, (byte) -95, im.field_e, 16744448, 192);
          }
          decompiledSharedTail0 = (var15 != 0);
        }
        if (decompiledSharedTail0) {
          var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo.field_a / 20.0f))));
          wm.field_c.b(-(im.field_e.field_y >> 1) + 356, -(im.field_e.field_v >> 1) + 267, 256);
          wm.field_c.b(356 - (im.field_e.field_y >> 1), 267 - (im.field_e.field_v >> 1), var5);
          if (this.field_w.field_B) {
            ec.a(-(im.field_e.field_v >> 1) + 265, -(im.field_e.field_y >> 1) + 354, (byte) -86, im.field_e, 16744448, 96);
          }
        }
        var4 = (rj) (this.field_p.e(-24172));
        while (true) {
          if (var4 != null) {
            var4.d(0);
            var4 = (rj) (this.field_p.a(4));
            if (var15 == 0) {
              continue;
            }
          } else {
            if (this.field_F != -1 &&
              null != this.field_R.field_l) {
              var5Lifetime1 = 0;
              if (qj.field_c[this.field_F] == null) {
                if (null != gm.field_d.field_L[this.field_F]) {
                  var5Lifetime1 = gm.field_d.field_L[this.field_F].field_h.field_c >> 1;
                  if (var15 != 0) {
                    var5Lifetime1 = qj.field_c[this.field_F].field_h.field_c;
                  }
                }
              } else {
                var5Lifetime1 = qj.field_c[this.field_F].field_h.field_c;
              }
              if (var5Lifetime1 != 0) {
                var6 = this.field_F / 7;
                var7 = this.field_F % 7;
                var8 = 421 - (189 - (var7 + var6) * 27);
                var9 = 80 + 20 * (-var7 + (var6 + 7));
                if (gl.field_Lb) {
                  var16 = this.field_u.b(this.field_F, -15390);
                  var8 = -1 + var16.field_f;
                  var9 = 7 + var16.field_b;
                }
                boolean decompiledFrameCompleted1 = true;
                if (t.field_a != var5Lifetime1) {
                  var17 = "+" + var5Lifetime1 / 10;
                  var11 = db.field_v.b(var17);
                  var12 = db.field_v.field_E + db.field_v.field_H;
                  jn.field_a = new cn(var11, var12);
                  jh.a(jn.field_a);
                  db.field_v.b(var17, 0, db.field_v.field_H, 16744512, -1);
                  jh.b();
                  dm.field_f = dd.a((byte) -112, 12, jn.field_a);
                  var19 = dm.field_f.field_B;
                  var18 = var19;
                  var13 = var18;
                  var14 = 0;
                  while (var14 < var19.length) {
                    var13[var14] = nb.a(var19[var14], 255);
                    stackIn_60_0 = -1;
                    stackIn_60_1 = ~var19[var14];
                    if (var15 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_60_0 == stackIn_60_1) {
                      var19[var14] = 1;
                    }
                    var14++;
                  }
                  if (decompiledFrameCompleted1) {
                    t.field_a = var5Lifetime1;
                  }
                }
                if (decompiledFrameCompleted1) {
                  stackIn_60_0 = var8;
                  stackIn_60_1 = jn.field_a.field_y >> 1;
                }
                var10 = stackIn_60_0 - stackIn_60_1;
                var11Lifetime1 = -jn.field_a.field_v + var9;
                bp.a(var11Lifetime1, dm.field_f, var10, (byte) 99);
                jn.field_a.h(var10, var11Lifetime1);
              }
            }
            this.field_N.d();
            this.field_I.d();
          }
          break;
        }
        boolean decompiledFrameCompleted0 = true;
        if (null != this.field_b) {
          var5Lifetime2 = 0;
          while (var5Lifetime2 < gf.field_b.length) {
            gf.field_b[var5Lifetime2] = nb.a(gf.field_b[var5Lifetime2] >>> 2, 1061109567);
            var5Lifetime2++;
            if (var15 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_b.b(112);
          }
        }
        if (kn.field_g) {
          ab.a(0);
        }
        oh.a((byte) 54);
        return;
    }

    final static void a(nh param0, int param1, nh param2, nh param3) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        q[] var5 = null;
        q[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        q[] var10 = null;
        int var11_int = 0;
        cn var11 = null;
        cn var12 = null;
        int var13 = 0;
        q[] var14 = null;
        cn var15 = null;
        int[][] var16 = null;
        cn var17 = null;
        cn var18 = null;
        int[][] var19 = null;
        var13 = DungeonAssault.field_K;
        try {
          gn.field_i = kn.a(param3, "commonui", "frame_top", -62);
          di.field_l = kn.a(param3, "commonui", "frame_bottom", -91);
          bl.field_e = oh.a(param3, "commonui", 11091, "jagex_logo_grey");
          na.field_C = kn.a(param3, "commonui", "button", -94);
          sl.field_c = da.a("commonui", "validation", 0, param3);
          ta.field_e = (se) ((Object) kk.a(param2, param3, "arezzo12", 0, "commonui"));
          lp.field_C = (se) ((Object) kk.a(param2, param3, "arezzo14", 0, "commonui"));
          hc.field_f = (se) ((Object) kk.a(param2, param3, "arezzo14bold", 0, "commonui"));
          var17 = new cn(param0.a("button.gif", "", (byte) -116), (java.awt.Component) ((Object) c.field_h));
          pa.a((byte) -94, param3, "commonui", "dropdown");
          var5 = qa.a(15322, "screen_options", "commonui", param3);
          d.field_c = new q[4];
          nf.field_v = new q[4];
          wo.field_a = new q[4];
          var6 = new q[][]{d.field_c, nf.field_v, wo.field_a};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_i;
          var8 = 1;
          do {
            if (var19.length <= var8) {
              var8 = var5[0].field_j[0];
              var19[2][var8] = 16777215;
              var19[1][var8] = 2394342;
              var19[3][var8] = 4767999;
              break;
            }
            var7[var8] = (int[]) ((Object) var19[0].clone());
            var8++;
          } while (var13 == 0);
          var9 = 0;
          L3: while (true) {
            if (var9 < 3) {
              var14 = var6[var9];
              var10 = var14;
              stackIn_18_0 = 0;
              if (var13 != 0) {
                break L3;
              }
              var11_int = stackIn_18_0;
              while (var11_int < var14.length) {
                var14[var11_int] = pi.a(1, var5[var9], var19[var11_int]);
                var11_int++;
              }
              var9++;
              continue L3;
            }
            var9 = var17.field_v;
            ie.a(95);
            var17.e();
            stackIn_18_0 = 0;
            break;
          }
          gf.d(stackIn_18_0, 0, gf.field_i, gf.field_c);
          var15 = new cn(var9, var9);
          var18 = var15;
          var18.e();
          var17.c(0, 0);
          var11 = new cn(var9, var9);
          var11.e();
          if (param1 < 2) {
            return;
          }
          var17.c(-var17.field_y + var9, 0);
          var12 = new cn(var17.field_y - var9 * 2, var9);
          var12.e();
          var17.c(-var9, 0);
          ti.c(true);
          na.field_C = new cn[]{var15, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("p.Q(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static vk a(int param0, String param1, int param2) {
        vk var3 = null;
        RuntimeException var3_ref = null;
        vk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new vk(false);
          var3.field_g = param1;
          if (param2 != -28323) {
            field_G = (cn[]) null;
          }
          var3.field_d = param0;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var4 = param2 + (8 + la.field_b.field_H);
        db.field_v.b(pb.field_I, 7 + param1, var4, 16777215, -1);
        db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param1, var4, 16777215, -1);
        int var5 = jj.field_c <= 0 ? 0 : jj.field_c / 10;
        var4 += 37;
        if (!param0) {
          var6 = gm.field_d.field_s < jj.field_c ? 16711680 : 16777215;
          db.field_v.b(ef.field_f, 7 + param1, var4, var6, -1);
          db.field_v.a(Integer.toString(var5), param1 + 133, var4, var6, -1);
          return;
        }
    }

    private final void d(int param0) {
        int discarded$0 = 0;
        ai var2_ref_ai;
        int var2;
        ac var3;
        int var4;
        ac var5;
        var4 = DungeonAssault.field_K;
        this.field_F = -1;
        if (kn.field_g &&
          od.a((byte) -91)) {
          return;
        }
        if (super.d()) {
          return;
        }
        this.field_F = this.b(hj.field_S, eh.field_h, 162);
        if (this.field_F != -1) {
          var2_ref_ai = qj.field_c[this.field_F];
          if (var2_ref_ai == null) {
            var2_ref_ai = gm.field_d.field_L[this.field_F];
          }
          if (var2_ref_ai != null) {
            if (var2_ref_ai != rd.field_x) {
              hh.field_r = (en) ((Object) new bd(var2_ref_ai.field_h));
              rd.field_x = var2_ref_ai;
            }
            uj.a(hh.field_r, 95);
          }
        }
        boolean decompiledFrameRemainder1 = true;
        if (this.field_Q == hh.field_s) {
          this.c(param0 + 1380862290);
          this.a(true, (byte) -27);
          decompiledFrameRemainder1 = (var4 != 0);
        }
        if (decompiledFrameRemainder1) {
          if (this.field_O != hh.field_s) {
            if (this.field_L != hh.field_s) {
              if (hh.field_s == this.field_A) {
                this.a((byte) -47, 0);
                decompiledFrameRemainder1 = (var4 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (this.field_C != hh.field_s) {
                  if (hh.field_s == this.field_y) {
                    this.a((byte) -88, 4);
                    decompiledFrameRemainder1 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (this.field_P != hh.field_s) {
                      if (hh.field_s == this.field_w ||
                        this.field_t == hh.field_s) {
                        this.a((byte) -121);
                        decompiledFrameRemainder1 = (var4 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        if ((!(hh.field_s instanceof cp)) &&
                          (decompiledFrameRemainder1 = (0 != no.field_d))) {
                          var2 = this.b(lc.field_c, hm.field_k, param0 + 1380862337);
                          if (var2 != -1 &&
                            var2 != 0 &&
                            var2 != 6 &&
                            var2 != 24 &&
                            var2 != 42 &&
                            var2 != 48) {
                            boolean decompiledFrameRemainder0 = true;
                            if ((no.field_d != 1) &&
                              (decompiledFrameRemainder0 = (2 == no.field_d))) {
                              if (null != qj.field_c[var2]) {
                                jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                if (gm.field_d.field_L[var2] != null) {
                                  jj.field_c = jj.field_c + (gm.field_d.field_L[var2].field_h.field_c >> 1);
                                }
                              }
                              qj.field_c[var2] = null;
                              this.field_H = null;
                              decompiledFrameRemainder0 = (var4 != 0);
                            }
                            if ((decompiledFrameRemainder0) &&
                              (this.field_R.field_l != null)) {
                              var3 = ((cp) (this.field_R.field_l)).field_S;
                              if (qj.field_c[var2] == null ||
                                var3 != qj.field_c[var2].field_h) {
                                if (null != qj.field_c[var2]) {
                                  jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                  if ((var4 != 0) &&
                                    (gm.field_d.field_L[var2] != null)) {
                                    jj.field_c = jj.field_c - (gm.field_d.field_L[var2].field_h.field_c >> 1);
                                  }
                                } else {
                                  if (gm.field_d.field_L[var2] != null) {
                                    jj.field_c = jj.field_c - (gm.field_d.field_L[var2].field_h.field_c >> 1);
                                  }
                                }
                                qj.field_c[var2] = new ai(var3.field_v);
                                if (null == qj.field_c[var2].field_c ||
                                  qj.field_c[var2].field_c.field_i != var3.field_d) {
                                  qj.field_c[var2].field_c = new wd(var3.field_d);
                                }
                                jj.field_c = jj.field_c + var3.field_c;
                                qh.a(param0 ^ 1380875597, this.field_Q, 19);
                                if (var3.field_u != qj.field_c[var2].field_c.field_n) {
                                  if (null != var3.field_u) {
                                    qj.field_c[var2].field_c.a(rf.field_M, var3.field_u, -10872);
                                  }
                                  if (var3.field_a != null) {
                                    gd.a(64, var3.field_a);
                                  }
                                }
                              }
                            }
                            jk.j((byte) 59);
                            this.c((byte) -118);
                          }
                          decompiledFrameRemainder1 = (var4 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          var5 = ((cp) (hh.field_s)).field_S;
                          this.field_H = new wd(var5.field_d);
                          if (null != var5.field_u) {
                            this.field_H.a(rf.field_M, var5.field_u, -10872);
                          }
                          decompiledFrameRemainder1 = (var4 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      this.a((byte) -52, 3);
                      if (var4 != 0) {
                        this.a((byte) -82, 2);
                        this.a((byte) -50, 1);
                        this.d((byte) -76);
                        this.a(true, (byte) -11);
                      }
                    }
                  }
                } else {
                  this.a((byte) -82, 2);
                  if (var4 != 0) {
                    this.a((byte) -50, 1);
                    this.d((byte) -76);
                    this.a(true, (byte) -11);
                  }
                }
              }
            } else {
              this.a((byte) -50, 1);
              if (var4 != 0) {
                this.d((byte) -76);
                this.a(true, (byte) -11);
              }
            }
          } else {
            this.d((byte) -76);
            this.a(true, (byte) -11);
          }
        }
        if (param0 != -1380862175) {
          discarded$0 = this.b(-120, -24, -127);
        }
    }

    private final void a(byte param0, int param1) {
        boolean stackIn_64_1 = false;
        int[] var3 = null;
        int var4 = 0;
        cp[] var5 = null;
        int var6 = 0;
        cp var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameRemainder4 = true;
        boolean decompiledFrameCompleted5 = true;
        boolean decompiledFrameCompleted4 = true;
        boolean decompiledFrameCompleted3 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var8 = DungeonAssault.field_K;
        var11 = new int[gh.field_i.length];
        var10 = var11;
        var9 = var10;
        var3 = var9;
        var4 = param1;
        if ((0 != var4 ||
          var8 != 0) &&
          (decompiledFrameRemainder0 = (var4 != 1 ||
          var8 != 0)) &&
          (decompiledFrameRemainder1 = (var4 != 2)) &&
          (decompiledFrameRemainder2 = (3 != var4 ||
          var8 != 0))) {
          decompiledFrameRemainder4 = (4 == var4);
          if ((decompiledFrameRemainder4) &&
            (var8 == 0)) {
            var9 = var3;
            var11 = var10;
            var4 = 0;
            while (var11.length > var4) {
              if (gh.field_i[var4] != null) {
                var9[var4] = gh.field_i[var4].field_r;
              }
              var4++;
            }
            decompiledFrameRemainder4 = false;
          }
        }
        if ((decompiledFrameRemainder4) &&
          (decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          var9 = var3;
          var11 = var10;
          var4 = 0;
          while (var4 < var11.length) {
            if (var8 != 0) {
              decompiledFrameCompleted5 = false;
              break;
            }
            if (null != gh.field_i[var4]) {
              var9[var4] = gh.field_i[var4].field_c;
            }
            var4++;
          }
          if (decompiledFrameCompleted5) {
            decompiledFrameRemainder4 = (var8 != 0);
          }
        }
        if ((decompiledFrameRemainder4) &&
          (decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameCompleted5)) {
          var9 = var3;
          var11 = var10;
          var4 = 0;
          while (var11.length > var4) {
            if (var8 != 0) {
              decompiledFrameCompleted4 = false;
              break;
            }
            if (gh.field_i[var4] != null) {
              var9[var4] = gh.field_i[var4].field_A;
            }
            var4++;
          }
          if (decompiledFrameCompleted4) {
            decompiledFrameRemainder4 = (var8 != 0);
          }
        }
        if ((decompiledFrameRemainder4) &&
          (decompiledFrameRemainder2) &&
          (decompiledFrameCompleted5) &&
          (decompiledFrameCompleted4)) {
          var9 = var3;
          var11 = var10;
          var4 = 0;
          while (var11.length > var4) {
            if (var8 != 0) {
              decompiledFrameCompleted3 = false;
              break;
            }
            if (null != gh.field_i[var4]) {
              var9[var4] = gh.field_i[var4].field_k;
            }
            var4++;
          }
          if (decompiledFrameCompleted3) {
            decompiledFrameRemainder4 = (var8 != 0);
          }
        }
        if ((decompiledFrameRemainder4) &&
          (decompiledFrameCompleted5) &&
          (decompiledFrameCompleted4) &&
          (decompiledFrameCompleted3)) {
          var9 = var3;
          var11 = var10;
          var4Lifetime3 = 0;
          while (var4Lifetime3 < var11.length) {
            if (var8 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            if (gh.field_i[var4Lifetime3] != null) {
              var9[var4Lifetime3] = gh.field_i[var4Lifetime3].field_y;
            }
            var4Lifetime3++;
          }
          if ((decompiledFrameCompleted2) &&
            (var8 != 0)) {
            var4Lifetime3 = 0;
            while (var11.length > var4Lifetime3) {
              if (var8 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (gh.field_i[var4Lifetime3] != null) {
                var9[var4Lifetime3] = gh.field_i[var4Lifetime3].field_r;
              }
              var4Lifetime3++;
            }
          }
        }
        if ((decompiledFrameCompleted1) &&
          (this.field_z != param1)) {
          this.field_s = false;
          decompiledFrameRemainder3 = (var8 != 0);
        }
        if (decompiledFrameRemainder3) {
          stackIn_64_1 = !(this.field_s);
          this.field_s = stackIn_64_1;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_z = param1;
        if (!this.field_s) {
          var4Lifetime1 = 0;
          while (var4Lifetime1 < var11.length) {
            var9[var4Lifetime1] = -var11[var4Lifetime1];
            var4Lifetime1++;
            if (var8 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (this.field_v != null)) {
          this.field_D = (cp[]) ((Object) this.field_v.clone());
          ik.a(this.field_D, -111, var11);
        }
        if (param0 >= -42) {
          this.field_R = (nn) null;
        }
        hf.field_nb.field_J = null;
        hf.field_nb.e(true);
        var4Lifetime2 = 0;
        var5 = this.field_D;
        var6 = 0;
        while (var6 < var5.length) {
          var7 = var5[var6];
          if (var8 == 0) {
            if (var7 != null) {
              ((gd) ((Object) var7)).b(10, var4Lifetime2, (byte) 4);
              var4Lifetime2 = var4Lifetime2 + (8 + ((gd) ((Object) var7)).field_x);
              hf.field_nb.a(var7, (byte) -48);
            }
            var6++;
            continue;
          }
          break;
        }
    }

    final void c(boolean param0) {
        int stackIn_18_0 = 0;
        ai[] var2;
        int var3;
        ai var4;
        int var5;
        ai[] var6;
        lf var7;
        ai var8;
        ai var9;
        int var3Lifetime1;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        }
        if (!param0) {
          return;
        }
        while (true) {
          if (!ha.b((byte) 47)) {
            if (null != this.field_b &&
              this.field_b.field_d) {
              var7 = (lf) (this.field_b);
              if (!var7.field_u) {
                this.d((byte) -76);
                if (var5 != 0) {
                  this.c(65);
                }
              } else {
                this.c(65);
              }
              this.field_b.c(-127);
              this.field_b = null;
              this.a(true, (byte) -11);
            }
            this.d(-1380862175);
            stackIn_18_0 = kn.field_g ? 1 : 0;
            break;
          }
          stackIn_18_0 = mm.field_t;
          if (var5 == 0) {
            if (stackIn_18_0 == 13) {
              this.a(false, (byte) -94);
              continue;
            }
            super.f();
            continue;
          }
          break;
        }
        if (stackIn_18_0 != 0) {
          bl.a(0);
        }
        if (this.field_H != null) {
          this.field_H.a((byte) 109, 20);
        }
        var6 = gm.field_d.field_L;
        var2 = var6;
        var3 = 0;
        while (true) {
          if (var3 >= var6.length) {
            var2 = qj.field_c;
            break;
          }
          var8 = var6[var3];
          if (var5 == 0) {
            if (var8 != null) {
              var8.field_c.a((byte) 109, 20);
            }
            var3++;
            continue;
          }
          break;
        }
        var3Lifetime1 = 0;
        while (var3Lifetime1 < var2.length) {
          var9 = var2[var3Lifetime1];
          var4 = var9;
          if (var5 == 0) {
            if (var4 != null) {
              var9.field_c.a((byte) 109, 20);
            }
            var3Lifetime1++;
            continue;
          }
          break;
        }
        return;
    }

    public static void d(boolean param0) {
        field_r = null;
        field_G = null;
        field_K = null;
        field_x = null;
        field_J = null;
        if (!param0) {
          field_K = (String) null;
        }
    }

    private final void c(byte param0) {
        this.field_Q.field_w = gm.field_d.field_s >= jj.field_c ? true : false;
        int var2 = -29 % ((-32 - param0) / 39);
    }

    private final int b(int param0, int param1, int param2) {
        if (this.field_u != null) {
          return this.field_u.b(param0, 19091, param1);
        }
        param1 -= 98;
        param0 -= 394;
        int var4 = ((189 + param0) * 3 + 560 - param1 * 4) / 162;
        int var5 = (3 * param0 + param1 * 4) / param2;
        if (var4 < 0) {
          return -1;
        }
        if (var5 < 0) {
          return -1;
        }
        if (var4 >= 7) {
          return -1;
        }
        if (var5 >= 7) {
          return -1;
        }
        return 7 * var5 + var4;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        var2 = 0;
        do {
          if (var2 >= 49) {
            jj.field_c = 0;
            break;
          }
          qj.field_c[var2] = null;
          var2++;
        } while (var3 == 0);
        if (param0 != -76) {
          this.b(-63);
        }
        this.c((byte) 34);
        return;
    }

    private final void a(boolean param0, byte param1) {
        int var3;
        String var4;
        int var5;
        String var6;
        var5 = DungeonAssault.field_K;
        var3 = 0;
        if (param1 > -3) {
          this.c((byte) 76);
        }
        L2: while (true) {
          if (var3 < 49) {
            if (var5 != 0) {
              break L2;
            }
            if (null == qj.field_c[var3] ||
              var5 != 0) {
              var3++;
              continue;
            }
          }
          if (var3 == 49) {
            if (!ed.c(true) &&
              !gm.field_d.field_H) {
              ac.field_B.d((byte) -106, 58);
            }
            if (kn.field_g) {
              gd.a(g.field_Hb, 0, 5, param0);
              return;
            }
            gd.a(g.field_Hb, 0, g.field_Hb, param0);
            return;
          }
          break;
        }
        var6 = wj.field_x;
        var4 = var6;
        if (!gm.field_d.field_H) {
          var4 = var6 + dh.field_c;
        }
        this.field_b = (kl) ((Object) new lf(oa.field_h, var4));
        return;
    }

    private final void a(byte param0) {
        this.a(this.field_w, dc.field_k, (byte) 125, ob.field_Kb, mm.field_s);
        this.a(this.field_t, dc.field_k, (byte) 122, ob.field_Kb, cf.field_d);
        if (param0 > -65) {
          this.c();
        }
        if (gl.field_Lb == this.field_t.field_B) {
          gl.field_Lb = !this.field_t.field_B ? true : false;
          this.a(14);
        }
    }

    private final void b(int param0) {
        rl.field_d = p.a(ri.field_d, 400);
        dm.field_a = p.a(i.field_r, 400);
        id.field_m = p.a(mc.field_w, param0 - 2398);
        int var2 = 390;
        int var3 = 300;
        bd.field_g = new cn(var2, var3);
        if (param0 != 2798) {
          this.field_N = (rh) null;
        }
        jh.a(bd.field_g);
        nb.field_d.a(0, 0, var2, var3);
        jh.b();
    }

    private final void e(int param0) {
        this.b();
        this.field_R = new nn(true);
        this.field_M = new nn(false);
        hf.field_nb = new ed(8, 90, 180, 382);
        this.field_Q = tn.a(16, 12, ne.field_c, jm.field_i, param0 ^ -18245, lk.field_P);
        this.field_O = tn.a(472, 12, ne.field_c, jm.field_i, param0 ^ -18248, be.field_r.toUpperCase());
        this.field_A = sj.a(24, 87, 66, uj.field_c, this.field_M);
        this.field_L = sj.a(55, 96, 66, gd.field_E, this.field_M);
        this.field_C = sj.a(86, 110, 66, jj.field_b, this.field_M);
        this.field_P = sj.a(117, 87, 66, tb.field_c, this.field_M);
        this.field_y = sj.a(148, 91, 66, kd.field_f, this.field_M);
        this.field_p.a(hf.field_nb, false);
        this.field_p.a(this.field_Q, false);
        this.field_p.a(this.field_O, false);
        this.field_p.a(this.field_A, false);
        this.field_p.a(this.field_L, false);
        this.field_p.a(this.field_C, false);
        this.field_p.a(this.field_P, false);
        this.field_p.a(this.field_y, false);
        this.field_A.field_n = (en) ((Object) new e(jk.a(new String[]{tn.field_U}, tp.field_w, 30496)));
        this.field_L.field_n = (en) ((Object) new e(jk.a(new String[]{qk.field_d}, tp.field_w, param0 + 12257)));
        this.field_C.field_n = (en) ((Object) new e(jk.a(new String[]{dj.field_c}, tp.field_w, param0 + 12257)));
        this.field_P.field_n = (en) ((Object) new e(jk.a(new String[]{rk.field_a}, tp.field_w, 30496)));
        this.field_y.field_n = (en) ((Object) new e(jk.a(new String[]{eg.field_f}, tp.field_w, 30496)));
        this.field_O.field_n = (en) ((Object) new e((String) null, pm.field_o, nk.field_Lb));
        this.field_Q.field_n = (en) ((Object) new e((String) null, ud.field_u, oi.field_M));
        this.b((byte) 26);
        this.field_z = 0;
        this.field_s = false;
        this.field_M.a(this.field_A, -256);
        this.a((byte) -124, 0);
        this.field_w = this.a(ob.field_Kb, mm.field_s, 491, param0 ^ -18240, 438, dc.field_k);
        this.field_w.field_B = true;
        this.field_p.a(this.field_w, false);
        this.field_t = this.a(ob.field_Kb, cf.field_d, 491, -1, 401, dc.field_k);
        this.field_t.field_B = !gl.field_Lb ? true : false;
        this.field_p.a(this.field_t, false);
        if (param0 == 18239) {
          this.field_q = new sa(186, 401, 288, 71);
          this.field_q.a(true, f.field_c, (byte) 91, wh.field_c, 16777215);
          return;
        }
    }

    private final void a(int param0) {
        ol.field_a = new cn[4];
        ol.field_a[0] = me.a(32, param0, 14, 0, 14);
        ol.field_a[1] = me.a(32, 14, 0, 14, 14);
        ol.field_a[2] = me.a(md.b(param0, 46), 0, 14, 14, 14);
        ol.field_a[3] = me.a(32, 14, 14, 14, 0);
        if (!gl.field_Lb) {
          ol.field_a = p.a(wk.a(ol.field_a, param0 - 14), 400);
        }
        if (gl.field_Lb) {
          this.field_u = (cl) ((Object) new sf((go) null, 350, 261));
          if (DungeonAssault.field_K != 0) {
            this.field_u = null;
          }
        } else {
          this.field_u = null;
        }
        jk.j((byte) 59);
    }

    final void c() {
        im.field_e = null;
        rl.field_d = null;
        dm.field_a = null;
        rd.field_x = null;
        jn.field_a = null;
        dm.field_f = null;
        ol.field_a = null;
        wm.field_c = null;
        bd.field_g = null;
        id.field_m = null;
        hh.field_r = null;
        bn.field_f = null;
        super.c();
        System.gc();
    }

    private final void c(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_56_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        var3 = DungeonAssault.field_K;
        if (param0 < 56) {
          this.a(-105, -4, 26);
        }
        if (gm.field_d.field_s >= jj.field_c) {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted2 = true;
          if (!ed.c(true)) {
            ac.field_B.d((byte) -127, 57);
            var2 = 0;
            while (var2 < 49) {
              stackIn_23_0 = 0;
              stackIn_23_1 = var2;
              if (var3 == 0) {
                if (stackIn_23_0 != stackIn_23_1 &&
                  6 != var2 &&
                  var2 != 24 &&
                  var2 != 42 && var2 != 48) {
                  if (null != qj.field_c[var2]) {
                    ac.field_B.a(6, qj.field_c[var2].field_a);
                  } else {
                    ac.field_B.a(6, 0);
                  }
                }
                var2++;
                continue;
              }
              if (stackIn_23_0 <= stackIn_23_1) {
                decompiledFrameCompleted2 = false;
                break;
              }
              stackIn_56_0 = -1;
              decompiledFrameCompleted1 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            if (jj.field_c > 0) {
              gm.field_d.field_s = gm.field_d.field_s - jj.field_c;
            }
            var2Lifetime1 = 0;
            while (49 > var2Lifetime1) {
              stackIn_56_0 = -1;
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_56_0 != ~var2Lifetime1 &&
                var2Lifetime1 != 6 &&
                24 != var2Lifetime1 &&
                var2Lifetime1 != 42 && (var2Lifetime1 != 48 ||
                var3 != 0) && null != qj.field_c[var2Lifetime1]) {
                gm.field_d.field_L[var2Lifetime1] = new ai(qj.field_c[var2Lifetime1].field_a);
                gm.field_d.field_L[var2Lifetime1].field_c = qj.field_c[var2Lifetime1].field_c;
                qj.field_c[var2Lifetime1] = null;
              }
              var2Lifetime1++;
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_56_0 = 0;
          }
          jj.field_c = stackIn_56_0;
          this.c((byte) -91);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, cn param4) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_15_0Lifetime1;
        int stackIn_15_1Lifetime1;
        var20 = DungeonAssault.field_K;
        try {
          var6_int = 256;
          if (0 == gm.field_d.field_L[param2].field_a) {
            var6_int = 128;
          }
          var7 = 10066329;
          var8 = var6_int * (192 + ((var7 & 16711680) >> 18)) / 255;
          var9 = (((var7 & 65280) >> 10) + 192) * var6_int / 255;
          var10 = (((var7 & 255) >> 2) + 192) * var6_int / 255;
          var11 = 0;
          var12 = (param4.field_A + param3) * gf.field_i + (param0 + param4.field_w);
          var13 = -param4.field_y + gf.field_i;
          var15 = -param4.field_v;
          if (param1 <= 54) {
            this.a((gd) null, (String) null, (byte) -123, (String) null, (String) null);
          }
          while (var15 < 0) {
            if (var20 != 0) {
              return;
            }
            var14 = -param4.field_y;
            while (var14 < 0) {
              var16 = param4.field_B[var11];
              stackIn_15_0 = 0;
              stackIn_15_1 = var16;
              if (stackIn_15_0 != stackIn_15_1) {
                var17 = var16 & 16711680;
                var18 = var16 & 65280;
                var19 = var16 & 255;
                var18 = var18 * var9;
                var17 = var17 * var8;
                var19 = var19 * var10;
                var16 = var17 & -16777216 | var18 & 16711680 | var19 & 65280;
                gf.field_b[var12] = var16 >>> 8;
              }
              var12++;
              var11++;
              var14++;
            }
            stackIn_15_0Lifetime1 = var12;
            stackIn_15_1Lifetime1 = var13;
            var12 = stackIn_15_0Lifetime1 + stackIn_15_1Lifetime1;
            var15++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("p.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        lb var14 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var13 = DungeonAssault.field_K;
        bd.field_g.h(-(bd.field_g.field_y >> 1) + param2 + 2, param1 + 12);
        var14 = gm.field_d;
        if (param0 != 8) {
          field_x = (int[]) null;
        }
        var5 = 0;
        do {
          if (var5 > 140) {
            var5 = 0;
            break;
          }
          gf.b(-(var5 * 4 / 3) + param2, var5 + 18 + param1, var5 * 8 / 3, 0);
          gf.b(param2 - var5 * 4 / 3, -var5 + 280 + param1 + 18, var5 * 8 / 3, 0);
          var5++;
        } while (var13 == 0);
        while (true) {
          stackIn_9_0 = var5;
          stackIn_9_1 = 7;
          if (stackIn_9_0 < stackIn_9_1) {
            var6 = param2 - (1 + var5) * 27;
            var7 = 20 * var5 + param1;
            var8 = 6 - var5;
            stackIn_40_0 = 0;
            if (var13 == 0) {
              var9 = stackIn_40_0;
              while (var9 < 1 + var5) {
                stackIn_9_0 = -1;
                stackIn_9_1 = ~var9;
                if (stackIn_9_0 == stackIn_9_1) {
                  if (0 != var8 &&
                    var8 != 6) {
                    this.a(var6, 92, var8, var7 + 4, rl.field_d[5]);
                  }
                } else {
                  var10 = var14.field_k.a(35 + var8, (byte) 109) ? 1 : 0;
                  var11 = 5;
                  if (var10 != 0) {
                    var12 = 0;
                    stackIn_23_0 = (var12 != 0) ? 1 : 3;
                    var11 = stackIn_23_0;
                  }
                  this.a(var6, 97, var8, 4 + var7, rl.field_d[var11]);
                }
                if (var5 == var9) {
                  if (var8 != 6 &&
                    var8 != 48) {
                    this.a(27 + var6, 119, var8, var7 + 4, rl.field_d[4]);
                  }
                } else {
                  var10Lifetime2 = var14.field_k.a(var8 - var8 / 7, (byte) 125) ? 1 : 0;
                  var11Lifetime2 = 4;
                  if (var10Lifetime2 != 0) {
                    var12Lifetime2 = 0;
                    stackIn_35_0 = (var12Lifetime2 != 0) ? 0 : 2;
                    var11Lifetime2 = stackIn_35_0;
                  }
                  this.a(27 + var6, 110, var8, 4 + var7, rl.field_d[var11Lifetime2]);
                }
                this.a(var7, var6, (byte) 127, var8);
                var6 += 54;
                var9++;
                var8 += 8;
              }
              var5++;
              continue;
            }
          } else {
            stackIn_40_0 = 7;
          }
          var5 = stackIn_40_0;
          while (true) {
            stackIn_42_0 = 13;
            if (stackIn_42_0 > var5) {
              var6Lifetime1 = -((13 - var5) * 27) + param2;
              var7Lifetime1 = param1 + var5 * 20;
              var8Lifetime1 = 7 * var5 - 42;
              if (var13 == 0) {
                var9Lifetime1 = 0;
                while (13 - var5 > var9Lifetime1) {
                  var10Lifetime1 = var14.field_k.a(var8Lifetime1 + 35, (byte) 86) ? 1 : 0;
                  var11Lifetime1 = 5;
                  stackIn_42_0 = var10Lifetime1;
                  if (stackIn_42_0 != 0) {
                    var12Lifetime1 = 0;
                    stackIn_51_0 = (var12Lifetime1 != 0) ? 1 : 3;
                    var11Lifetime1 = stackIn_51_0;
                  }
                  this.a(var6Lifetime1, 57, var8Lifetime1, 4 + var7Lifetime1, rl.field_d[var11Lifetime1]);
                  var10Lifetime1Lifetime1 = var14.field_k.a(var8Lifetime1 - var8Lifetime1 / 7, (byte) 110) ? 1 : 0;
                  var11Lifetime1Lifetime1 = 4;
                  if (var10Lifetime1Lifetime1 != 0) {
                    var12Lifetime1Lifetime1 = 0;
                    stackIn_57_0 = (var12Lifetime1Lifetime1 == 0) ? 2 : 0;
                    var11Lifetime1Lifetime1 = stackIn_57_0;
                  }
                  this.a(27 + var6Lifetime1, 124, var8Lifetime1, var7Lifetime1 + 4, rl.field_d[var11Lifetime1Lifetime1]);
                  this.a(var7Lifetime1, var6Lifetime1, (byte) 127, var8Lifetime1);
                  if (0 == var9Lifetime1) {
                    if (var8Lifetime1 != 0) {
                      if (42 != var8Lifetime1) {
                        rl.field_d[4].h(var6Lifetime1, 20 + (4 + var7Lifetime1));
                        if (-var5 + 12 == var9Lifetime1 &&
                          42 != var8Lifetime1 &&
                          var8Lifetime1 != 48) {
                          rl.field_d[5].h(27 + var6Lifetime1, 24 + var7Lifetime1);
                        }
                      } else {
                        if (-var5 + 12 == var9Lifetime1 &&
                          42 != var8Lifetime1 &&
                          var8Lifetime1 != 48) {
                          rl.field_d[5].h(27 + var6Lifetime1, 24 + var7Lifetime1);
                        }
                      }
                    } else {
                      if (-var5 + 12 == var9Lifetime1 &&
                        42 != var8Lifetime1 &&
                        var8Lifetime1 != 48) {
                        rl.field_d[5].h(27 + var6Lifetime1, 24 + var7Lifetime1);
                      }
                    }
                  } else {
                    if (-var5 + 12 == var9Lifetime1 &&
                      42 != var8Lifetime1 &&
                      var8Lifetime1 != 48) {
                      rl.field_d[5].h(27 + var6Lifetime1, 24 + var7Lifetime1);
                    }
                  }
                  var8Lifetime1 += 8;
                  var6Lifetime1 += 54;
                  var9Lifetime1++;
                }
                var5++;
                continue;
              }
            }
            return;
          }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        fk.a((byte) 121, lf.field_w);
        p.a(this.field_e, 188, 48, 605, 400, 394, 220);
        jh.a(this.field_e);
        p.b(8, 46, 180, 427, 16777215, 32, 128);
        h.a(false, 388, 15, true, 80);
        h.a(false, 426, 617, true, 46);
        p.a(8, 47, 172, 425, 256, 32, 8, 128);
        p.a(8, 8, 172, 32, 256, 64, 4, 128);
        p.a(460, 8, 172, 32, 256, 64, 4, 128);
        p.a(188, 8, 264, 32, 256, 64, 4, 128);
        this.field_E.b(12, 32, 320 - (this.field_E.field_i >> 1));
        ke.a(-116, 0, 480, 0);
        ke.a(48, 180, 480, 0);
        ke.a(-93, 605, 480, 48);
        jc.a(32, 452, 8, 1, 2, 1);
        ke.a(-112, -be.field_o.field_d + 640, 480, 0);
        c.a(0, 640, 0, (byte) 53);
        c.a(0, 640, 40, (byte) 91);
        c.a(0, 640, -bk.field_e.field_b + 480, (byte) 102);
        p.a(14, 55, 161, 36);
        p.b(188, 55, 418, 83, 8421504, 128, 128);
        p.a(188, 55, 418, 83, 256, 64, 4, 32);
        p.a(188, 55, 418, 11184810, 255, 128);
        p.a(188, 137, 418, 11184810, 255, 128);
        p.b(186, 400, 418, 87, 8421504, 32, 64);
        p.a(186, 399, 418, 0, 255, 128);
        p.a(186, 400, 418, 11184810, 255, 128);
        p.a(186, 402, 420, 70, 256, 64, 4, 32);
        p.a(484, 327, 144, 30);
        p.a(484, 364, 144, 30);
        p.a(484, 401, 144, 30);
        p.a(484, 438, 144, 30);
        jh.b();
        this.b(2798);
        jj.field_c = 0;
        qj.field_c = new ai[49];
        t.field_a = -1;
        bl.a((byte) 124);
        this.e(18239);
        this.a(14);
        this.field_H = null;
        this.field_N = new rh(204, 394, 80, 160, 16711680, 768, 249);
        this.field_I = new rh(600, 111, 80, 160, 16711680, 768, 249);
        qh.a(-13716, this.field_v[15], 18);
    }

    p() {
        this.field_E = new tf(ne.field_c, f.field_c, cm.field_M);
    }

    static {
        field_K = "Please wait...";
        field_x = new int[8192];
        field_J = new String[]{null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability."};
        field_r = "Raids: ";
    }
}
