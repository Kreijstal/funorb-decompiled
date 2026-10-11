/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends qe {
    private rh field_w;
    private cn field_u;
    static md field_s;
    private rh field_r;
    static String field_x;
    private cn field_v;
    static String field_t;

    final void a(boolean param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        rj var7;
        rj var8;
        int var3Lifetime1;
        var5 = DungeonAssault.field_K;
        super.a(param0);
        this.field_e.b(0, 0);
        gf.e(41, 48, 599, 416);
        for (var2 = 41; var2 < 599; var2 = var2 + df.field_c.field_E) {
          df.field_c.c(var2, 48);
        }
        gf.b();
        this.a(117, 122);
        this.a(20, 84, 117);
        var8 = (rj) (this.field_p.e(-24172));
        while (var8 != null) {
          var8.a(126);
          var8 = (rj) (this.field_p.a(4));
        }
        oe.field_m.h(24, 383);
        oe.field_m.j(560, 383);
        if (null != this.field_b) {
          this.field_b.a((byte) -126);
        }
        bg.e();
        this.field_r.d();
        this.field_w.d();
        var7 = (rj) (this.field_p.e(-24172));
        while (var7 != null) {
          var7.d(0);
          var7 = (rj) (this.field_p.a(4));
        }
        if (rb.field_N >= 0 &&
          ao.field_o > rb.field_N) {
          var3 = -vd.field_a + rb.field_N;
          if (var3 >= 0 &&
            var3 < 10) {
            var4 = 121 + var3 * 24;
            this.a(432, rb.field_N, var4, fb.field_d[var3]);
          }
        }
        this.c(1);
        ih.field_x.a(320, 25, 1699);
        if (null != this.field_b) {
          var6 = 0;
          var3Lifetime1 = var6;
          while (gf.field_b.length > var6) {
            gf.field_b[var6] = nb.a(gf.field_b[var6], -50529028) >>> 2;
            var6++;
          }
          this.field_b.b(111);
        }
        if (kn.field_g) {
          ab.a(0);
        }
        oh.a((byte) 125);
    }

    final void c(boolean param0) {
        int var4;
        int stackIn_24_0 = 0;
        int var2;
        ce var5;
        pk var6;
        var4 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        }
        if (!param0) {
          return;
        }
        while (ha.b((byte) 47)) {
          if (mm.field_t == 13) {
            gd.a(g.field_Hb, 0, g.field_Hb, false);
            continue;
          }
          super.f();
        }
        if (kn.field_g) {
          bl.a(0);
        }
        if (this.field_b != null &&
          this.field_b.field_d) {
          var2 = 0;
          if (!(this.field_b instanceof ce)) {
            if (this.field_b instanceof pk) {
              var6 = (pk) (this.field_b);
              stackIn_24_0 = (!var6.field_r) ? 0 : 1;
              var2 = stackIn_24_0;
            } else {
              if (!(this.field_b instanceof fk)) {
              }
            }
          } else {
            var5 = (ce) (this.field_b);
            if (var5.field_u != null) {
              ri.a(var5.field_u.toString(), -109);
            }
          }
          this.field_b.c(-123);
          this.field_b = null;
          if (var2 != 0) {
            this.field_b = (kl) ((Object) new fk(hj.field_Q, li.field_j));
          }
        }
        this.a(5458);
    }

    final void b(boolean param0) {
        int var3 = DungeonAssault.field_K;
        super.b(param0);
        jh.a(this.field_e);
        c.a(0, 640, 0, (byte) 64);
        c.a(0, 640, 40, (byte) 75);
        vf.a(432, true, 33, 114, 48);
        vf.a(432, true, 599, 115, 48);
        vf.a(32, true, 164, -54, 8);
        vf.a(32, true, 468, 107, 8);
        un.a(41, (byte) 63, 558, 416, true);
        this.a(40, 70, 117);
        jh.b();
        fk.a((byte) 121, wj.field_u);
        ao.field_o = 0;
        if (fb.field_d == null) {
          fb.field_d = new di[10];
        }
        bj.field_G = false;
        if (ed.c(true)) {
          oi.f((byte) 100);
        } else {
          ri.a(tc.field_u, -113);
        }
        this.field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        this.field_w = new rh(580, 394, 80, 160, 255, 197376, 240);
        this.a((byte) -111);
        this.a((byte) -124, 0);
        if (!ed.c(true)) {
          gh.a(23, 11);
        } else {
          gh.a(22, 11);
        }
        vl.a(1, (byte) -49);
    }

    private final void a(int param0, int param1, int param2, di param3) {
        int var5_int = 0;
        if (param3 == null) {
          return;
        }
        try {
          if (null == this.field_u) {
            this.a(param3, param0 ^ 461);
          }
          param2 = param2 + (24 - la.field_b.field_H >> 1);
          this.field_u.b(s.field_b[0], param2, 64);
          var5_int = (int)((te.a(mo.field_a) + 1.0) * 128.0);
          if (param0 != 432) {
            di var6 = (di) null;
            this.a(124, (byte) 59, (di) null, 121);
          }
          if (0 > var5_int) {
            var5_int = 0;
          }
          if (var5_int > 256) {
            var5_int = 256;
          }
          this.field_v.b(s.field_b[0], param2, var5_int);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bg.U(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4;
        if (param0 >= s.field_b[0] &&
          s.field_b[4] > param0) {
          if (!param1) {
            field_x = (String) null;
          }
          var4 = (-117 + param2 - 4) / 24;
          if (0 <= var4 &&
            var4 < 10) {
            return var4;
          }
          return -1;
        }
        return -1;
    }

    private final void a(int param0, int param1, int param2, di param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = DungeonAssault.field_K;
        try {
          var7_int = this.a(param3, (byte) -98);
          var8 = var7_int == 0 ? 0 : 10 + var7_int * 5;
          param4 = param4 - var8;
          var9 = ta.a(la.field_b, param3.field_j, param4, param3.field_g, 115);
          var10 = la.field_b.b(var9);
          param1 = param1 - ((var10 >> 1) + 5);
          for (var11 = 0; var11 < var7_int; var11++) {
            fb.field_f.a(param1, -10 + param5);
            param1 += 5;
          }
          if (param2 <= 4) {
            di var13 = (di) null;
            this.a(-30, -105, (di) null, 82);
          }
          param1 += 15;
          la.field_b.b(var9, param1, param5, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = this.a(param2, true, param1);
        if (var4 == -1) {
          return -1;
        }
        if (param0 > -72) {
          field_s = (md) null;
        }
        return vd.field_a + var4;
    }

    private final void a(byte param0) {
        this.b();
        le.field_g = tn.a(-jm.field_i.field_y + 164 >> 1, 8 + (32 - jm.field_i.field_v >> 1), ne.field_c, jm.field_i, -62, l.field_d);
        wf.field_w = tn.a(580 - jm.field_i.field_y, (-jm.field_i.field_v + 56 >> 1) + 424, ne.field_c, jm.field_i, -52, ia.field_Y);
        ic.field_y = tn.a(60, (-jm.field_i.field_v + 56 >> 1) + 424, ne.field_c, jm.field_i, -61, hb.field_l.toUpperCase());
        wf.field_w.field_w = false;
        ic.field_y.field_w = !ed.c(true) ? true : false;
        int var2 = ao.field_o - 10;
        if (var2 < 0) {
          var2 = 0;
        }
        hi.field_c = new pd(552, 84, 0, 295, var2, vd.field_a);
        this.field_p.a(le.field_g, false);
        this.field_p.a(wf.field_w, false);
        this.field_p.a(ic.field_y, false);
        int var3 = -125 / ((param0 - 48) / 56);
        this.field_p.a(hi.field_c, false);
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = DungeonAssault.field_K;
        var4 = param1 + ((db.field_v.field_H + param0 >> 1) + 2);
        if (param2 != 117) {
          return;
        }
        for (var5 = 0; var5 < rb.field_J.length; var5++) {
          var6 = rb.field_J[var5].toUpperCase();
          var7 = s.field_b[var5 + 1] + s.field_b[var5] >> 1;
          var8 = db.field_v.b(var6);
          if (var5 == 1 ||
            3 == var5) {
            var8 -= 18;
          }
          var9 = var7 - (var8 >> 1);
          if (2 == var5) {
            var9 -= 2;
          }
          db.field_v.b(var6, var9, var4, 16629550, -1);
          if (var5 == 1) {
            ue.field_i[0].h(-18 + var9, -12 + var4);
          }
          if (var5 == 3) {
            ue.field_i[1].h(-18 + var9, -12 + var4);
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, di param5, int param6) {
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = DungeonAssault.field_K;
        int var8_int = this.a(param5, (byte) -119);
        int var9 = var8_int != 0 ? 10 + 5 * var8_int : 0;
        param1 = param1 - var9;
        if (param3 < 122) {
          return;
        }
        try {
          var10 = u.a(la.field_b, (byte) 44, param5.field_g, param5.field_j, param2, param1);
          var11 = la.field_b.b(var10);
          param0 = param0 - ((var11 >> 1) + 5);
          for (var12 = 0; var12 < var8_int; var12++) {
            fb.field_f.a(param0, -10 + param4);
            param0 += 5;
          }
          param0 += 15;
          la.field_b.b(var10, param0, param4, param6, -1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bg.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int stackIn_8_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = DungeonAssault.field_K;
        am.field_a.h(41, 48);
        for (var3 = 0; var3 < 4; var3++) {
          bg.b(s.field_b[var3], 85, -2 + (s.field_b[1 + var3] - s.field_b[var3]), 25, 0, 48, 128);
          bg.b(s.field_b[var3], 112, -2 - s.field_b[var3] + s.field_b[1 + var3], 256, 0, 48, 128);
        }
        if (!bj.field_G) {
          var3Lifetime1 = 4 + param0;
          if (ao.field_o > 10 + vd.field_a) {
            stackIn_8_0 = 10;
          } else {
            stackIn_8_0 = -vd.field_a + ao.field_o;
          }
          var4 = stackIn_8_0;
          for (var5 = 0; var4 > var5; var5++) {
            var6 = vd.field_a + var5;
            if (var6 != qc.field_y) {
              this.a(var6, (byte) -79, fb.field_d[var5], var3Lifetime1);
            }
            var3Lifetime1 += 24;
          }
          if (!(qc.field_y < 0) &&
            !(qc.field_y >= ao.field_o)) {
            var5Lifetime1 = qc.field_y - vd.field_a;
            if (var5Lifetime1 >= 0 &&
              var5Lifetime1 < 10) {
              var6Lifetime1 = 4 + (param0 + var5Lifetime1 * 24);
              this.a(var6Lifetime1, 48, fb.field_d[var5Lifetime1], qc.field_y);
            }
          }
        } else {
          la.field_b.c(ac.field_D, 320, 240, 16777215, -1);
        }
        if (param1 < 44) {
          return;
        }
        bg.a(66, 76, 507, 306, 256, 32, 8, 128);
    }

    private final void a(int param0, int param1, di param2, int param3) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        String var13 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        var12 = DungeonAssault.field_K;
        try {
          var5_int = 8421616;
          var6 = new int[32];
          param0 += 2;
          for (var7 = 0; var7 < 32; var7++) {
            var8 = 32 + var7 * 1;
            var6[var7] = 65793 * var8;
          }
          for (var7Lifetime1 = 3; var7Lifetime1 < 24; var7Lifetime1++) {
            gf.d(66, param0 + var7Lifetime1, 490, 1285 * (-var7Lifetime1 + 24) + (14614528 - 131072 * var7Lifetime1), 128);
          }
          gf.b(66, 2 + param0, 490, 7895160);
          gf.b(66, 24 + param0, 490, 6771538);
          if (param1 != 48) {
            var13 = (String) null;
            this.a(false, 22, -55, 111, 82, (String) null);
          }
          param0 -= 2;
          param0 = param0 + (la.field_b.field_H + 24 >> 1);
          if (param2 != null) {
            la.field_b.c(Integer.toString(param2.field_b + 1), s.field_b[0] + s.field_b[1] >> 1, param0, 16777215, -1);
            var7Lifetime2 = -s.field_b[1] + (s.field_b[2] - 5);
            var8Lifetime1 = s.field_b[1] + s.field_b[2] >> 1;
            this.a(var8Lifetime1, var7Lifetime2, 16777215, (byte) 126, param0, param2, var5_int);
            la.field_b.c(gh.a(param2.field_a, (byte) -121), s.field_b[2] + s.field_b[3] >> 1, param0, 16777215, -1);
            if (!param2.field_c.equals("")) {
              var9 = u.a(la.field_b, (byte) -111, param2.field_c, ek.field_c, 16777215, -s.field_b[3] + (s.field_b[4] - 25));
              var10 = s.field_b[3] + 10;
              if (0 < param2.field_f) {
                var11 = ue.field_i[0];
              } else {
                if (param2.field_f < 0) {
                  var11 = ue.field_i[1];
                } else {
                  var11 = ue.field_i[8];
                }
              }
              var11.h(var10, param0 - la.field_b.field_H);
              la.field_b.b(var9, var10 + 20, param0, var5_int, -1);
            } else {
              la.field_b.c("-", s.field_b[3] + s.field_b[4] >> 1, param0, 16777215, -1);
            }
          } else {
            la.field_b.c(nl.field_c, s.field_b[1] + s.field_b[2] >> 1, param0, 16777215, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("bg.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var10 = DungeonAssault.field_K;
        try {
          if (param2 != 0) {
            return;
          }
          hj.field_Q = param5;
          li.field_j = param4;
          if (param0) {
            this.field_b = (kl) ((Object) new pk(ia.field_Y, kc.field_P, 0));
          } else {
            if (param1 == 0) {
              this.field_b = (kl) ((Object) new fk(param5, param4));
            } else {
              var7_int = 25 * param1;
              if (var7_int > 100) {
                var7_int = 100;
              }
              var8 = var7_int + "%";
              var9 = jk.a(param2 + 127, param3);
              this.field_b = (kl) ((Object) new pk(ia.field_Y, jk.a(new String[]{var8, var9}, no.field_e, 30496), 0));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("bg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(di param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -48) {
            this.a(-90, 71);
          }
          if (param0.field_h == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var3_int = (20 * param0.field_h - 1) / gm.field_d.field_N + 1;
          stackIn_8_0 = (3 < var3_int) ? 3 : var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bg.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0) {
        Object var2;
        int var3;
        int var4;
        String var5;
        int var6;
        double var7;
        int var10;
        String var11;
        String var12;
        int var3Lifetime1;
        var10 = DungeonAssault.field_K;
        var2 = null;
        if (0 <= qc.field_y &&
          ao.field_o > qc.field_y) {
          var3 = -vd.field_a + qc.field_y;
          if (var3 >= 0 &&
            10 > var3 &&
            fb.field_d[var3] != null &&
            !eh.a(true, fb.field_d[var3].field_i)) {
            var2 = fb.field_d[var3];
          }
        }
        var3Lifetime1 = 430;
        var4 = gm.field_d.field_N / 40;
        var6 = 16777215;
        if (var2 != null) {
          var7 = ek.a(0, (byte) -127, gm.field_d.field_N, ((di) (var2)).field_a);
          if (((di) (var2)).field_h > 0) {
            if (!(var7 > 0.0)) {
              var5 = jk.a(new String[]{gh.a(((di) (var2)).field_h, (byte) -114)}, mi.field_c, 30496);
            } else {
              var12 = gh.a((int)(1000.0 * var7), (byte) -112);
              var5 = jk.a(new String[]{gh.a(((di) (var2)).field_h, (byte) -112), var12, gh.a(var4, (byte) -109)}, ra.field_a, 30496);
            }
          } else {
            if (!(0.0 < var7)) {
              var5 = jk.a(new String[]{gh.a(var4, (byte) -102)}, le.field_a, 30496);
            } else {
              var11 = gh.a((int)(var7 * 1000.0), (byte) -118);
              var5 = jk.a(new String[]{var11, gh.a(var4, (byte) -108)}, vl.field_l, 30496);
            }
          }
        } else {
          var5 = ai.field_e;
        }
        db.field_v.a(var5, 215, var3Lifetime1, 210, 45, var6, -1, param0, 1, db.field_v.field_H);
    }

    private final void a(di param0, int param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        gp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        String var7 = null;
        int var8 = 0;
        cn var9 = null;
        int var10 = 0;
        gp var11 = null;
        var10 = DungeonAssault.field_K;
        try {
          if (param0 == null) {
            this.field_u = null;
            this.field_v = null;
            return;
          }
          if (param0.field_b != qc.field_y) {
          }
          var11 = la.field_b;
          var3 = var11;
          var4 = -s.field_b[0] + s.field_b[4];
          var5 = ((se) ((Object) var3)).field_E + ((se) ((Object) var3)).field_H;
          var6 = new cn(var4, var5);
          jh.a(var6);
          ((se) ((Object) var3)).c(Integer.toString(param0.field_b + 1), -s.field_b[0] + (s.field_b[1] + s.field_b[0] >> 1), la.field_b.field_H, 12690143, -1);
          this.a(12690143, -s.field_b[0] + (s.field_b[2] + s.field_b[1] >> 1), 120, param0, -5 + s.field_b[2] - s.field_b[1], la.field_b.field_H);
          ((se) ((Object) var3)).c(gh.a(param0.field_a, (byte) -117), -s.field_b[0] + (s.field_b[2] + s.field_b[3] >> 1), la.field_b.field_H, 12690143, -1);
          if (!param0.field_c.equals("")) {
            var7 = u.a(var3, (byte) 124, param0.field_c, ek.field_c, 12690143, -s.field_b[3] + s.field_b[4] - 25);
            var8 = 10 - s.field_b[0] + s.field_b[3];
            if (param0.field_f > 0) {
              var9 = ue.field_i[0];
            } else {
              if (param0.field_f < 0) {
                var9 = ue.field_i[1];
              } else {
                var9 = ue.field_i[8];
              }
            }
            var9.h(var8, 0);
            ((se) ((Object) var3)).b(var7, var8 + 20, ((se) ((Object) var3)).field_H, 12690143, -1);
          } else {
            ((se) ((Object) var11)).c("-", (s.field_b[4] + s.field_b[3] >> 1) - s.field_b[0], la.field_b.field_H, 12690143, -1);
          }
          if (param1 <= 117) {
            return;
          }
          jh.b();
          this.field_u = rb.a(8, var6, 12690143, (byte) -38);
          this.field_v = rb.a(16, var6, 255, (byte) -74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("bg.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static nh a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param3) {
          field_t = (String) null;
        }
        return uo.a(param0, !param4 ? 0 : 1, param2, param1, 27847, false);
    }

    public static void b(int param0) {
        field_x = null;
        field_t = null;
        field_s = null;
        if (param0 != 41) {
          bg.b(-1);
        }
    }

    private final void a(byte param0, int param1) {
        int var7 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var8 = DungeonAssault.field_K;
        if (vd.field_a == param1) {
          return;
        }
        if (param0 >= -96) {
          this.field_w = (rh) null;
        }
        di[] var9 = new di[10];
        di[] var3 = var9;
        int var4 = 0;
        int var5 = vd.field_a - param1;
        int var6 = 10;
        if (var5 < 0) {
          var6 = var6 + var5;
          var4 = var4 - var5;
          var5 = 0;
        }
        if (var5 + var6 > 10) {
          var6 = 10 - var5;
        }
        for (var7 = 0; var7 < var6; var7++) {
          incrementValue$0 = var5;
          var5++;
          incrementValue$1 = var4;
          var4++;
          var9[incrementValue$0] = fb.field_d[incrementValue$1];
        }
        fb.field_d = var3;
        og.field_f = param1;
        vd.field_a = param1;
        if (hi.field_c != null) {
          hi.field_c.field_z = vd.field_a;
          if (!(hi.field_c.field_z <= hi.field_c.field_C)) {
            hi.field_c.field_z = hi.field_c.field_C;
          }
        }
    }

    private final void a(int param0, byte param1, di param2, int param3) {
        int stackIn_4_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          stackIn_4_0 = (param0 == rb.field_N) ? 16760960 : 16777215;
          var5_int = stackIn_4_0;
          var6 = 3446736;
          param3 = param3 + (db.field_v.field_H + 24 >> 1);
          if (param1 > -37) {
            this.a((byte) 111);
          }
          if (param2 == null) {
            la.field_b.c(Integer.toString(1 + param0), s.field_b[0] + s.field_b[1] >> 1, param3, var5_int, -1);
            la.field_b.c(nl.field_c, s.field_b[2] + s.field_b[1] >> 1, param3, var5_int, -1);
          } else {
            la.field_b.c(Integer.toString(1 + param2.field_b), s.field_b[0] + s.field_b[1] >> 1, param3, var5_int, -1);
            var7 = -5 + (-s.field_b[1] + s.field_b[2]);
            var8 = s.field_b[1] + s.field_b[2] >> 1;
            this.a(var8, var7, var5_int, (byte) 125, param3, param2, var6);
            la.field_b.c(gh.a(param2.field_a, (byte) -110), s.field_b[3] + s.field_b[2] >> 1, param3, var5_int, -1);
            if (0 < param2.field_c.length()) {
              var9 = u.a(la.field_b, (byte) -76, param2.field_c, ek.field_c, var5_int, -s.field_b[3] + (s.field_b[4] - 25));
              la.field_b.b(var9);
              var10 = s.field_b[3] + 10;
              if (param2.field_f > 0) {
                var11 = ue.field_i[0];
              } else {
                if (param2.field_f >= 0) {
                  var11 = ue.field_i[8];
                } else {
                  var11 = ue.field_i[1];
                }
              }
              var11.h(var10, param3 - la.field_b.field_H);
              la.field_b.b(var9, 20 + var10, param3, var6, -1);
            } else {
              la.field_b.c("-", s.field_b[4] + s.field_b[3] >> 1, param3, var5_int, -1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("bg.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    bg() {
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        String var6;
        String var7;
        di var8;
        var4 = DungeonAssault.field_K;
        if (kn.field_g &&
          od.a((byte) -116)) {
          return;
        }
        if (super.d()) {
          return;
        }
        if (vd.field_a != hi.field_c.field_z) {
          this.a((byte) -104, hi.field_c.field_z);
          oi.f((byte) 100);
        }
        var2 = this.b(-73, eh.field_h, hj.field_S);
        var3 = -1;
        if (no.field_d == 1) {
          var3 = this.b(-119, hm.field_k, lc.field_c);
        }
        if (hh.field_s == le.field_g) {
          gd.a(dc.field_z, 0, 0, true);
        } else {
          if (hh.field_s != wf.field_w) {
            if (ic.field_y == hh.field_s &&
              !ed.c(true)) {
              this.field_b = (kl) ((Object) new ce(tc.field_u.toLowerCase()));
            }
          } else {
            if (ed.c(true)) {
              var5 = (String) null;
              throw new RuntimeException((String) null);
            }
            if (eh.a(true, k.field_b)) {
              var6 = (String) null;
              throw new RuntimeException((String) null);
            }
            if (null == gm.field_d) {
              var7 = (String) null;
              throw new RuntimeException((String) null);
            }
            if (!gm.field_d.field_H) {
              ac.field_B.d((byte) -112, 58);
            }
            ac.a(k.field_b, 0);
          }
        }
        if (var2 != -1) {
          if (rb.field_N != var2) {
            this.a(fb.field_d[var2 - vd.field_a], 120);
          }
          rb.field_N = var2;
        }
        if (var3 != -1) {
          qc.field_y = var3;
          if (rb.field_N == qc.field_y) {
            this.a(fb.field_d[-vd.field_a + rb.field_N], 125);
          }
          gg.a((byte) -96);
        }
        if (var2 != -1 &&
          0 != pj.field_r) {
          hi.field_c.a(1, pj.field_r);
        }
        if (param0 != 5458) {
          var8 = (di) null;
          this.a((di) null, -127);
        }
        return;
    }

    static {
        field_x = "Buy";
        field_s = new md();
        field_t = "Loading...";
    }
}
