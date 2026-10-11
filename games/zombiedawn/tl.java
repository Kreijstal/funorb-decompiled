/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl implements ug {
    private long field_l;
    static int[] field_g;
    private String field_d;
    private boolean field_c;
    float field_b;
    private boolean field_i;
    boolean field_n;
    private int field_o;
    static String field_k;
    private int field_a;
    private int field_p;
    private int field_f;
    private boolean field_j;
    private boolean field_m;
    private lo[] field_q;
    static String field_e;
    private dj field_h;
    private int[] field_r;

    final void b(int param0, int param1) {
        int var3 = 26 / ((-33 - param0) / 58);
        if (param1 == 1) {
          a.field_h.a(-1, "menusuk");
          this.a(false, 12);
        }
    }

    final boolean a(int param0, int param1) {
        if (bb.field_a[param1]) {
          return true;
        }
        this.field_n = true;
        if (ul.field_b == (long)param0) {
          ul.field_b = pd.a(-22826);
        }
        if (!this.a(false, param1, param0 ^ 95)) {
          return false;
        }
        pd.a(-22826);
        ul.field_b = 0L;
        this.field_n = !this.c((byte) 126) ? true : false;
        bb.field_a[param1] = true;
        ep.c((byte) -50);
        return true;
    }

    public static void d(int param0) {
        int var1 = 56 / ((param0 - 0) / 50);
        field_e = null;
        field_k = null;
        field_g = null;
    }

    public final void b(int param0) {
        if (param0 < 72) {
          this.a(-0.6271905303001404f, 80, -50, -1.1520227193832397f);
        }
        if (aa.field_f != null) {
          gl.a(aa.field_f, 734);
          aa.field_f = null;
          ep.c((byte) -50);
        }
        if (ng.field_e) {
          nl.field_p = mm.a(0, (byte) -113);
          gj.field_i = mm.a(1, (byte) -115);
        }
        a.field_h = pb.a(true, false, 2, true, 1);
        ZombieDawn.field_H = mm.a(3, (byte) -115);
        nm.field_e = pb.a(true, true, 8, true, 1);
        gm.field_h = pb.a(true, false, 4, true, 1);
        qn.field_i = pb.a(true, false, 5, true, 1);
        an.field_B = pb.a(true, false, 6, true, 1);
        this.field_h = pb.a(true, false, 7, true, 1);
        bp.field_h = new jk(50);
        dj var4 = nl.field_p;
        dj var3 = gj.field_i;
        bp.field_h.a("basic", nb.field_o, el.field_m, var4, (byte) -84);
        bp.field_h.a("arialish12", nb.field_o, el.field_m, var4, (byte) -84);
        bp.field_h.a("arialish12", nb.field_o, el.field_m, var3, (byte) -84);
        bp.field_h.a((byte) -113, nm.field_e, ap.field_w, ea.field_d);
        bp.field_h.a(ao.field_I, qn.field_i, 1);
        bp.field_h.a(ao.field_I, gm.field_h, 1);
        bp.field_h.a(u.field_f, an.field_B, 1);
        bp.field_h.a(u.field_f, this.field_h, 1);
        bp.field_h.a((byte) -98, ZombieDawn.field_H, ba.field_e, nd.field_d);
    }

    private final void c(int param0) {
        int var9 = 0;
        dj var3 = null;
        int var4_int = 0;
        int var11 = 0;
        dj var15 = null;
        boolean stackIn_102_1 = false;
        Throwable decompiledCaughtException = null;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        IllegalArgumentException var5_ref_IllegalArgumentException = null;
        int var6 = 0;
        IllegalArgumentException var6_ref_IllegalArgumentException = null;
        v[] var7 = null;
        vn[] var7_array = null;
        int var8 = 0;
        vn[] var8_ref_vn__ = null;
        vn var10 = null;
        int var12 = 0;
        String var13 = null;
        ml var14 = null;
        v[] var16 = null;
        vn[] var17 = null;
        int var8Lifetime1;
        var11 = ZombieDawn.field_J;
        oh.d((byte) -95);
        var15 = nl.field_p;
        var3 = gj.field_i;
        if (param0 != 75) {
          this.a(60, -55);
        }
        if (!rm.field_f &&
          null != gm.field_h) {
          oh.d((byte) -111);
          this.a(53.0f, 127, am.field_m);
          ph.field_a = new ka(gm.field_h, qn.field_i);
          for (var4_int = 0; tc.field_t > var4_int; var4_int++) {
            if (0 == tc.field_y[var4_int]) {
              var5_int = tc.field_s[var4_int];
              if ((var5_int == 69 ||
                var5_int == 68 ||
                47 == var5_int) && null == vb.field_D[var5_int]) {
                var13 = "sfx";
                var14 = ml.a(gm.field_h, var13, tc.field_x[var4_int]);
                if (var14 == null) {
                  return;
                }
                vb.field_D[tc.field_s[var4_int]] = var14.b();
              }
            }
          }
          rm.field_f = true;
          ep.c((byte) -50);
          return;
        }
        if (!ti.field_a &&
          null != qn.field_i) {
          ti.field_a = true;
          ep.c((byte) -50);
          return;
        }
        if (!sa.field_T &&
          null != this.field_h) {
          this.a(eo.field_h[15], e.field_I, 55.0f, false, 20.0f);
          if (!this.a("zombie dawn titlescreen", 0, 0)) {
            return;
          }
          if (!this.a("zombie dawn instructions loop", 0, 9)) {
            return;
          }
          sa.field_T = true;
          this.a(0, 75.0f);
          ep.c((byte) -50);
          return;
        }
        if (sa.field_T &&
          !eh.field_x &&
          an.field_B != null) {
          eh.field_x = true;
          return;
        }
        if (null != nm.field_e) {
          this.a(800, ji.field_a, 75.0f, false, 3.0f);
          if (!ng.field_e) {
            for (var4_int = 0; var4_int < 8; var4_int++) {
              for (var5_int = 0; var5_int < 6; var5_int++) {
                try {
                  cl.field_c[var4_int][var5_int] = nm.field_e.a(var5_int + ".zdl", param0 - 163, "" + var4_int + "/");
                  this.a(800, ji.field_a, 75.0f, false, 3.0f);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref_IllegalArgumentException = (IllegalArgumentException) (Object) decompiledCaughtException;
                }
              }
              try {
                cl.field_c[var4_int][6] = nm.field_e.a("BONUS.zdl", -110, "" + var4_int + "/");
              } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_IllegalArgumentException = (IllegalArgumentException) (Object) decompiledCaughtException;
              }
            }
            this.a(800, ji.field_a, 75.0f, false, 3.0f);
            np.field_E = new vn(nm.field_e.a("map.jpg", param0 ^ -26, "jpg/"), (java.awt.Component) ((Object) cj.field_d));
          }
          nm.field_e = null;
          this.a(param0 ^ 75, 78.0f);
          ep.c((byte) -50);
          return;
        }
        if (var15 != null) {
          this.a(78.0f, 127, dh.field_g);
          pc.field_k = gb.a("", -1, var3, "arialish12", var15);
          hf.field_E = vm.a((byte) -94, "locked", "basic", var15)[0];
          wd.field_y = hf.field_E;
          e.field_G = vm.a((byte) 126, "unachieved", "basic", var15)[0];
          hm.field_E = gf.a(var15, "orbcoin", 8, "basic");
          bd.a(hm.field_E, false);
          if (be.field_j <= 0) {
            lc.a(var15, var3, (byte) 80);
          }
          gj.field_i = null;
          nl.field_p = null;
          this.field_d = dh.field_g;
          ep.c((byte) -50);
          return;
        }
        if (!r.field_F &&
          null != a.field_h) {
          var4 = 80.0f;
          var5 = 19.0f;
          var6 = 29000;
          this.a(var5, 0, var6, var4);
          sg.field_jb = hf.a(ZombieDawn.field_H, "basic", "font", a.field_h, (byte) -70);
          if (sg.field_jb == null) {
            return;
          }
          b.field_j = ra.a(ZombieDawn.field_H, "basic", "font_title", 0, a.field_h);
          bj.field_q = gb.a("font_medium", -1, ZombieDawn.field_H, "basic", a.field_h);
          rg.a(bj.field_q, false);
          tf.a((byte) 119);
          if (be.field_j <= 0) {
            var16 = dd.a("membersexpansion", "screenshots", -1864, a.field_h);
            var7 = var16;
            if (var7 == null) {
              return;
            }
            jp.field_c = new o(sa.field_Y, qc.field_b, var16, false, kl.field_o);
          }
          this.a(var5, 0, var6, var4);
          qk.field_Hb[0] = gf.a(a.field_h, "background1", 8, "basic");
          qk.field_Hb[1] = gf.a(a.field_h, "background2", 8, "basic");
          qk.field_Hb[2] = gf.a(a.field_h, "background3", 8, "basic");
          qk.field_Hb[3] = gf.a(a.field_h, "background4", 8, "basic");
          qk.field_Hb[4] = gf.a(a.field_h, "background5", 8, "basic");
          this.a(var5, 0, var6, var4);
          lo.field_i = gf.a(a.field_h, "menu_pipe1", 8, "basic");
          mo.field_a = gf.a(a.field_h, "menu_pipe2", 8, "basic");
          hk.field_H = gf.a(a.field_h, "menu_pipebox", 8, "basic");
          pf.field_f = gf.a(a.field_h, "menu_pipebox2", 8, "basic");
          ql.field_g = gf.a(a.field_h, "menu_title", 8, "basic");
          fb.field_w = vm.a((byte) 113, "menu_risinghands", "basic", a.field_h);
          cn.field_a = vm.a((byte) 110, "menu_hand", "basic", a.field_h);
          lb.field_eb = vm.a((byte) 120, "engine_icons", "basic", a.field_h);
          ch.field_a = gf.a(a.field_h, "frameh", 8, "basic");
          hi.field_x = gf.a(a.field_h, "framev", 8, "basic");
          vo.field_a = vm.a((byte) -8, "framecorners", "basic", a.field_h);
          this.a(var5, 0, var6, var4);
          ad.field_g[0] = vm.a((byte) -53, "character_zombie0", "basic", a.field_h);
          ad.field_g[1] = vm.a((byte) -15, "character_zombie1", "basic", a.field_h);
          bd.field_i[0] = vm.a((byte) -50, "levelselect_icons", "basic", a.field_h);
          jo.field_Tb[0] = vm.a((byte) 125, "levelselect_icons_alt", "basic", a.field_h);
          af.field_d = gf.a(a.field_h, "levelselect_arrow", 8, "basic");
          dc.field_a[0] = gf.a(a.field_h, "levelselect", 8, "basic");
          nc.field_k = gf.a(a.field_h, "pipeframe_levelselect", param0 - 67, "basic");
          ah.field_tb = af.field_d;
          kb.field_i = vm.a((byte) -18, "powerups", "basic", a.field_h);
          nb.field_k = vm.a((byte) 127, "character_common", "basic", a.field_h);
          tp.a(vm.a((byte) -120, "hud", "basic", a.field_h), -10);
          w.a(vm.a((byte) 125, "popup", "basic", a.field_h), (byte) -97);
          this.a(var5, 0, var6, var4);
          le.field_a = vm.a((byte) -124, "instructions_controls", "basic", a.field_h);
          qn.field_k = vm.a((byte) -42, "instructions_survivors", "basic", a.field_h);
          l.field_b = vm.a((byte) 2, "instructions_zombies", "basic", a.field_h);
          this.a(var5, 0, var6, var4);
          bj.a("basic", -118, a.field_h, "frame");
          ca.field_b = bj.a("basic", -122, a.field_h, "button_frame");
          ti.field_c = bj.a("basic", param0 - 201, a.field_h, "button_raised");
          bj.a("basic", -120, a.field_h, "button_depressed");
          jb.field_a = vm.a((byte) -104, "pin_flags", "basic", a.field_h);
          this.a(var5, param0 - 75, var6, var4);
          ed.field_a = new vn[32];
          var17 = vm.a((byte) 126, "all_achievements", "basic", a.field_h);
          var7_array = var17;
          for (var8 = 0; var8 < 32; var8++) {
            ed.field_a[var8] = var17[var8];
          }
          this.a(var5, 0, var6, var4);
          this.field_n = true;
          if (!this.a(0, 11)) {
            return;
          }
          if (!(be.field_j <= 0) ||
            !(lo.field_j < 2)) {
            this.field_n = true;
            if (!this.a(0, 12)) {
              return;
            }
          }
          this.a(var5, 0, var6, var4);
          var8_ref_vn__ = var17;
          for (var9 = 0; var9 < var8_ref_vn__.length; var9++) {
            var10 = var8_ref_vn__[var9];
            bd.a(var10, false);
          }
          bd.a(e.field_G, false);
          ed.field_b = new vn[f.field_j.length];
          var12 = 0;
          var8Lifetime1 = var12;
          while (var12 < ed.field_b.length) {
            if (null != f.field_j[var12]) {
              ed.field_b[var12] = sn.a(var12, 1.0, (byte) -110);
            }
            var12++;
          }
          ZombieDawn.field_H = null;
          r.field_F = true;
          this.a(0, var5 + var4);
          ep.c((byte) -50);
          return;
        }
        stackIn_102_1 = (r.field_F) && (rm.field_f) && (sa.field_T) && (eh.field_x) && (ti.field_a);
        this.field_j = stackIn_102_1;
        if (this.field_j) {
          this.a(99.0f, 126, jh.field_l);
        }
    }

    final void c(int param0, int param1) {
        int var3 = 6 % ((param0 - 55) / 45);
        boolean discarded$0 = this.a(true, param1, 70);
        bb.field_a[param1] = false;
    }

    public final boolean a(byte param0) {
        boolean stackIn_47_0 = false;
        boolean decompiledFrameRemainder0 = true;
        if (!this.field_i) {
          if (vm.c(1)) {
            this.field_i = true;
            if (this.field_c) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!mm.a(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!this.b((byte) -110)) {
                if ((!(this.field_m)) &&
                  ((this.field_i)) &&
                  (!(!mm.a(true)))) {
                  this.field_m = true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_c = true;
              }
            }
          } else {
            if (this.field_c) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!mm.a(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!this.b((byte) -110)) {
                if ((!(this.field_m)) &&
                  ((this.field_i)) &&
                  (!(!mm.a(true)))) {
                  this.field_m = true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_c = true;
              }
            }
          }
        } else {
          if (this.field_c) {
            if ((!(this.field_m)) &&
              ((this.field_i)) &&
              (!(!mm.a(true)))) {
              this.field_m = true;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!this.b((byte) -110)) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!mm.a(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_c = true;
            }
          }
        }
        if ((decompiledFrameRemainder0) && (!this.field_m &&
          this.field_i &&
          mm.a(true))) {
          this.field_m = true;
        }
        if (param0 != 19) {
          this.c(59);
        }
        stackIn_47_0 = (this.field_i) && (this.field_c) && (this.field_m);
        return stackIn_47_0;
    }

    final boolean c(byte param0) {
        if (param0 < 84) {
          this.b(102);
        }
        return this.field_f == 0 ? true : false;
    }

    private final boolean a(String param0, int param1, int param2) {
        IllegalArgumentException var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == w.field_a[param2]) {
            this.field_d = e.field_I;
            w.field_a[param2] = wj.a(this.field_h, param0, "");
            return false;
          }
          if (!cc.field_c[param2]) {
            this.field_d = d.field_c;
            cc.field_c[param2] = uh.field_o.a(w.field_a[param2], (byte) 20, an.field_B, 88200, ph.field_a);
          }
          if (param1 != 0) {
            this.field_p = 29;
          }
          stackIn_10_0 = cc.field_c[param2];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("tl.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(float param0, int param1, int param2, float param3) {
        if (param1 != 0) {
          return;
        }
        this.a(param2, (String) null, param3, false, param0);
    }

    private final void a(float param0, int param1, String param2) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_b = Math.min(100.0f, Math.max(0.0f, param0));
          if (param2 != null) {
            this.field_d = param2;
          } else {
            if (null == this.field_d) {
              this.field_d = jh.field_l;
            }
          }
          eh.a(this.field_d, this.field_b, -1);
          if (param1 <= 122) {
            discarded$1 = this.b((byte) 10);
            sa.field_Y.c((byte) 81);
          } else {
            sa.field_Y.c((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("tl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean b(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var2Lifetime1;
        var4 = ZombieDawn.field_J;
        if (null == this.field_q) {
          this.field_q = new lo[2];
          for (var2 = 0; var2 < 2; var2++) {
            this.field_q[var2] = m.a((byte) -119, 1, 5, var2);
          }
        }
        if (param0 != -110) {
          this.field_b = -1.1267826557159424f;
        }
        var2Lifetime1 = 1;
        for (var3 = 0; var3 < 2; var3++) {
          if (null != this.field_q[var3]) {
            if (this.field_q[var3].field_h) {
              if (this.field_q[var3].field_o[0] > to.field_b[var3]) {
                to.field_b[var3] = this.field_q[var3].field_o[0];
              }
              if (be.field_j <= 0) {
                if (0 < var3) {
                  to.field_b[var3] = 0;
                  this.field_q[var3] = null;
                } else {
                  this.field_q[var3] = null;
                }
              }
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        return var2Lifetime1 != 0;
    }

    final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (bb.field_a[param1]) {
          return false;
        }
        if (param0) {
          this.field_h = (dj) null;
        }
        for (var3 = 0; this.field_f > var3; var3++) {
          if (param1 == this.field_r[var3]) {
            return false;
          }
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_r[fieldTemp$0] = param1;
        this.field_p = this.field_p + eo.field_h[param1];
        return true;
    }

    private final void a(int param0, String param1, float param2, boolean param3, float param4) {
        long dupTemp$0 = 0L;
        long var6_long = 0L;
        long var8 = 0L;
        float var10 = 0.0f;
        float var11 = 0.0f;
        if (param3) {
          return;
        }
        try {
          if (0L == vj.field_n) {
            dupTemp$0 = pd.a(-22826);
            vj.field_n = dupTemp$0;
            ap.field_m = dupTemp$0;
          }
          var6_long = pd.a(-22826);
          var8 = var6_long - ap.field_m;
          vj.field_n = var6_long;
          var10 = (float)var8 / (float)param0;
          var10 = Math.min(Math.max(var10, 0.0f), 1.0f);
          var11 = param2 + var10 * param4;
          this.a(var11, 124, param1);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "tl.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final boolean a(boolean param0) {
        boolean discarded$0 = false;
        ac.c(-32435);
        if (!this.field_j) {
          this.c(75);
          return false;
        }
        if (param0) {
          String var3 = (String) null;
          discarded$0 = this.a((String) null, 113, -12);
        }
        ep.c((byte) -50);
        return true;
    }

    public final void a(int param0) {
        sa.field_Y.g(false);
        if (param0 != 22833) {
          this.b(-52);
        }
        pm.a(gj.field_f, bd.field_f, ro.field_b, ui.field_d, sm.field_c, lc.field_h, a.field_m, 0, ca.field_b, hn.field_l, ti.field_c, sg.field_jb, ca.field_b, (byte) -63, 0);
    }

    final void e(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        long var4_long;
        int var6;
        boolean decompiledFrameRemainder0 = true;
        var6 = ZombieDawn.field_J;
        if (0 < this.field_f) {
          this.field_n = true;
          var2 = this.field_r[0];
          if (this.field_a == 0) {
            this.field_a = this.field_p;
            this.field_l = pd.a(-22826);
            this.a(0.0f, 127, (String) null);
          }
          if (this.field_o == 0) {
            this.field_o = eo.field_h[var2];
          }
          var3 = this.field_p;
          if (this.field_o < eo.field_h[var2]) {
            var3 = var3 + (this.field_o - eo.field_h[var2]);
          }
          this.a((-((float)var3 / (float)this.field_a) + 1.0f) * 100.0f, 127, (String) null);
          pd.a(-22826);
          if (this.a(0, var2)) {
            this.field_p = this.field_p - eo.field_h[var2];
            for (var4 = 0; var4 < -1 + this.field_f; var4++) {
              this.field_r[var4] = this.field_r[var4 + 1];
            }
            this.field_f = this.field_f - 1;
            this.field_o = 0;
            if (!(this.field_f > 0)) {
              this.field_n = false;
              this.field_a = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var4_long = pd.a(-22826);
            this.field_o = (int)((long)this.field_o - (var4_long - this.field_l));
            if (this.field_o < 1) {
              this.field_o = 1;
            }
            this.field_l = var4_long;
          }
        }
        if (param0 <= 37) {
          tl.d(2);
        }
    }

    private final void a(int param0, float param1) {
        ap.field_m = 0L;
        vj.field_n = (long)param0;
        this.a(param1, param0 ^ 125, this.field_d);
    }

    private final boolean a(boolean param0, int param1, int param2) {
        String stackIn_12_0 = null;
        int stackIn_56_0 = 0;
        String stackIn_107_0 = null;
        boolean stackIn_116_0 = false;
        int var4;
        int var5;
        String var5_ref_String;
        int var6;
        String var7_ref_String;
        int var7;
        ml var8;
        mb var8_ref;
        int var9;
        mb var10;
        ml var11;
        String var12;
        int var5Lifetime1;
        int var6Lifetime1;
        String var5_ref_StringLifetime1;
        var9 = ZombieDawn.field_J;
        var4 = 12 % ((param2 + 2) / 56);
        if (!param0) {
          for (var5 = 0; tc.field_t > var5; var5++) {
            var6 = tc.field_s[var5];
            if (vb.field_D[var6] == null &&
              param1 == tc.field_w[var5]) {
              if (1 == tk.a(param1, 101)) {
                stackIn_12_0 = "uk";
              } else {
                stackIn_12_0 = "sfx";
              }
              var7_ref_String = stackIn_12_0;
              if (tc.field_y[var5] == 0) {
                var11 = ml.a(gm.field_h, var7_ref_String, tc.field_x[var5]);
                var8 = var11;
                if (var8 == null) {
                  gm.field_h.a(-1, var7_ref_String);
                  return false;
                }
                vb.field_D[tc.field_s[var5]] = var11.b();
              } else {
                var10 = mb.a(qn.field_i, var7_ref_String, tc.field_x[var5]);
                var8_ref = var10;
                if (var8_ref == null) {
                  qn.field_i.a(-1, var7_ref_String);
                  return false;
                }
                vb.field_D[tc.field_s[var5]] = var10.b();
              }
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = param1;
        if (13 == var7) {
          this.field_d = dh.field_g;
          if (param0) {
            for (var7 = 0; ld.field_l.length > var7; var7++) {
              ld.field_l[var7] = null;
            }
            for (var7 = 0; ad.field_g.length > var7; var7++) {
              ad.field_g[var7] = null;
            }
            for (var7 = 0; w.field_a.length > var7; var7++) {
              w.field_a[var7] = null;
            }
            return true;
          }
          stackIn_56_0 = (!fj.a(0, 117)) ? 0 : 1;
          var6Lifetime1 = stackIn_56_0;
          var5_ref_String = "game";
          ld.field_l[0] = vm.a((byte) 108, "character_human0", "game", a.field_h);
          if (var6Lifetime1 != 0) {
            var5_ref_String = "halloween";
          }
          ld.field_l[1] = vm.a((byte) -4, "character_human1", var5_ref_String, a.field_h);
          if (null != ld.field_l[0] &&
            null != ld.field_l[1]) {
            if (!this.a("zombie dawn countup part 1", 0, 5)) {
              return false;
            }
            if (!this.a("zombie dawn countup part 2", 0, 6)) {
              return false;
            }
            if (!this.a("zombie dawn bonus level", 0, 7)) {
              return false;
            }
            ld.field_l[2] = vm.a((byte) -123, "character_human2", "game", a.field_h);
            ld.field_l[3] = vm.a((byte) -25, "character_human3", "game", a.field_h);
            ld.field_l[4] = vm.a((byte) 13, "character_human4", var5_ref_String, a.field_h);
            ld.field_l[5] = vm.a((byte) 117, "character_human5", "game", a.field_h);
            ld.field_l[6] = vm.a((byte) -5, "character_human6", "game", a.field_h);
            ld.field_l[7] = vm.a((byte) 112, "character_human7", "game", a.field_h);
            ld.field_l[8] = vm.a((byte) 118, "character_human8", "game", a.field_h);
            ld.field_l[9] = vm.a((byte) 118, "character_human9", "game", a.field_h);
            ld.field_l[10] = vm.a((byte) 111, "character_human10", "game", a.field_h);
            ld.field_l[11] = vm.a((byte) 126, "character_human11", "game", a.field_h);
            ld.field_l[12] = vm.a((byte) 113, "character_human12", "game", a.field_h);
            ld.field_l[13] = vm.a((byte) 109, "character_human13", "game", a.field_h);
            ld.field_l[14] = vm.a((byte) 119, "character_human14", "game", a.field_h);
            ld.field_l[15] = vm.a((byte) 127, "character_human15", "game", a.field_h);
            ld.field_l[16] = vm.a((byte) 123, "character_human16", "game", a.field_h);
            ld.field_l[17] = vm.a((byte) -110, "character_human17", "game", a.field_h);
            ld.field_l[18] = vm.a((byte) 108, "character_human18", "game", a.field_h);
            ld.field_l[19] = vm.a((byte) 3, "character_human19", "game", a.field_h);
            ld.field_l[20] = vm.a((byte) -52, "character_human20", "game", a.field_h);
            o.field_d = vm.a((byte) 112, "blood", "game", a.field_h);
            jc.field_t = vm.a((byte) -76, "headlight", "game", a.field_h);
            s.field_j = gf.a(a.field_h, "tutorial", 8, "game");
            ag.field_h = gf.a(a.field_h, "minigun", 8, "game");
            sl.field_c = vm.a((byte) -20, "hatch", "game", a.field_h);
            oj.field_f = gf.a(a.field_h, "grenade", 8, "game");
            tc.field_z = vm.a((byte) 121, "explosion", "game", a.field_h);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == ld.field_l[0]) {
              a.field_h.a(-1, "game");
            }
            if (var6Lifetime1 == 0) {
              return false;
            }
            a.field_h.a(-1, var5_ref_String);
            return false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (var7 == 14) {
            this.field_d = dh.field_g;
            ld.field_l[21] = vm.a((byte) 108, "character_human21", "gameuk", a.field_h);
            if (ld.field_l[21] == null) {
              a.field_h.a(-1, "gameuk");
              return false;
            }
            ld.field_l[22] = vm.a((byte) 17, "character_human22", "gameuk", a.field_h);
            ld.field_l[23] = vm.a((byte) -17, "character_human23", "gameuk", a.field_h);
            ld.field_l[24] = vm.a((byte) 124, "character_human24", "gameuk", a.field_h);
            ld.field_l[25] = vm.a((byte) 18, "character_human25", "gameuk", a.field_h);
            ld.field_l[26] = vm.a((byte) -3, "character_human26", "gameuk", a.field_h);
            ld.field_l[27] = vm.a((byte) -18, "character_human27", "gameuk", a.field_h);
            ld.field_l[28] = vm.a((byte) 124, "character_human28", "gameuk", a.field_h);
            ld.field_l[29] = vm.a((byte) 112, "character_human29", "gameuk", a.field_h);
            ld.field_l[30] = vm.a((byte) -10, "character_human30", "gameuk", a.field_h);
            bg.field_o = vm.a((byte) 9, "miasma", "gameuk", a.field_h);
            wh.field_a[0] = vm.a((byte) -128, "tentacle_unravel", "gameuk", a.field_h);
            wh.field_a[1] = vm.a((byte) -75, "tentacle_grab", "gameuk", a.field_h);
            wh.field_a[2] = vm.a((byte) -114, "tentacle_drag", "gameuk", a.field_h);
            wh.field_a[3] = vm.a((byte) 126, "tentacle_small", "gameuk", a.field_h);
            nh.field_R = vm.a((byte) -103, "treeshadow", "gameuk", a.field_h);
            ip.field_p = vm.a((byte) -43, "keycard", "gameuk", a.field_h);
          } else {
            if (var7 != 10) {
              if (var7 != 4 &&
                var7 != 1 &&
                var7 != 2 &&
                15 != var7 &&
                7 != var7 &&
                var7 != 5) {
                if (8 == var7) {
                  if (lc.field_k == null) {
                    lc.field_k = vm.a((byte) -90, "spotlight", "gameuk", a.field_h);
                  }
                  if (null == ob.field_c) {
                    ob.field_c = vm.a((byte) -77, "glass", "gameuk", a.field_h);
                  }
                  tf.field_b = vm.a((byte) 20, "bulletcasing", "gameuk", a.field_h);
                } else {
                  if (var7 != 6 &&
                    var7 != 0 &&
                    12 == var7) {
                    this.field_d = dh.field_g;
                    f.field_d = gf.a(a.field_h, "pin_lit", 8, "menusuk");
                    if (f.field_d == null) {
                      this.field_d = c.a(a.field_h, el.field_m, nb.field_o, "menusuk", (byte) -32);
                      this.a(this.field_b, 125, this.field_d);
                      return false;
                    }
                    j.field_e = vm.a((byte) 115, "instructions_uk_enemies", "menusuk", a.field_h);
                    cn.field_c = vm.a((byte) -119, "instructions_keycard", "menusuk", a.field_h);
                    dc.field_a[1] = gf.a(a.field_h, "uk_level_select_map", 8, "menusuk");
                    bd.field_i[1] = vm.a((byte) -12, "uk_level_select_icons", "menusuk", a.field_h);
                    jo.field_Tb[1] = vm.a((byte) -106, "uk_level_select_icons_alt", "menusuk", a.field_h);
                  }
                }
              }
            } else {
              if (!param0) {
                if (!a.field_h.a(-1, "intro")) {
                  return false;
                }
                if (null == nn.field_j) {
                  nn.field_j = gf.a(a.field_h, "intro_background", 8, "intro");
                }
                if (we.field_Ub == null) {
                  we.field_Ub = gf.a(a.field_h, "intro_1", 8, "intro");
                }
                if (null == pg.field_t) {
                  pg.field_t = gf.a(a.field_h, "intro_2", 8, "intro");
                }
                decompiledFrameRemainder0 = (nn.field_j == null ||
                  we.field_Ub == null ||
                  pg.field_t == null);
                if (decompiledFrameRemainder0) {
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                nn.field_j = null;
                we.field_Ub = null;
                pg.field_t = null;
              }
            }
          }
        }
        if (9 > param1) {
          if (param0) {
            ll.a(param1, 4767999);
          } else {
            if (tk.a(param1, 126) == 1) {
              stackIn_107_0 = "gameuk";
            } else {
              stackIn_107_0 = "game";
            }
            var12 = stackIn_107_0;
            var5_ref_StringLifetime1 = var12;
            ab.a(vm.a((byte) -104, we.field_Sb[param1] + "_floor", var12, a.field_h), (byte) 112, param1);
            gk.a(param1, vm.a((byte) -18, we.field_Sb[param1] + "_tiles", var12, a.field_h), true);
            qj.field_j[param1] = vm.a((byte) 107, "dimming" + param1, "basic", a.field_h);
          }
        }
        if (param1 >= 15 &&
          param1 < 29) {
          var5Lifetime1 = param1 - 15;
          if (!param0) {
            stackIn_116_0 = !(!this.a(tc.field_v[var5Lifetime1], 0, var5Lifetime1));
            return stackIn_116_0;
          }
        }
        return true;
    }

    tl() {
        this.field_n = false;
        this.field_o = 0;
        this.field_p = 0;
        this.field_a = 0;
        this.field_r = new int[29];
        this.field_f = 0;
    }

    static {
        field_k = "SHACKLES";
        field_g = new int[]{};
        field_e = "Invalid password.";
    }
}
