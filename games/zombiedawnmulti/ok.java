/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private int field_j;
    private int field_h;
    static int field_l;
    private int field_b;
    private sg field_u;
    private int field_q;
    private float field_c;
    private int field_s;
    private int field_v;
    static ig field_p;
    private int field_o;
    private int field_d;
    private int field_k;
    static PlatformTaskDispatcher field_m;
    static String field_t;
    static String field_i;
    private int field_x;
    private int field_e;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_w;
    static int[] field_r;
    private boolean field_a;

    public static void e(int param0) {
        if (param0 < 8) {
          field_p = (ig) null;
        }
        field_i = null;
        field_m = null;
        field_r = null;
        field_p = null;
        field_t = null;
    }

    final void b(int param0) {
        if (null != rn.field_f) {
          return;
        }
        if (!(vl.field_h > 0)) {
          this.field_a = false;
        }
        if (this.field_a) {
        } else {
          if (ng.field_d < this.field_b) {
            bl.field_a = (-ng.field_d + this.field_b) / 2;
          } else {
            if (this.field_b > 0) {
              bl.field_a = 0;
            }
          }
          if (this.field_k != ng.field_d ||
            pi.field_i != this.field_w) {
            this.field_u.a((byte) -89, this.field_w, this.field_k);
          }
          return;
        }
        int fieldTemp$0 = this.field_v - 1;
        this.field_v = this.field_v - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_v = this.field_g;
        if (!(this.field_f <= WidgetStyleLayer.field_d)) {
          this.field_a = false;
          return;
        }
        if (param0 == -12371) {
          this.c(0);
          return;
        }
    }

    final static void a(boolean param0) {
        Sprite var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sprite var9 = null;
        int var10 = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        String var14 = null;
        Sprite var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        boolean stackIn_56_3;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        boolean stackIn_64_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ArrayWidgetGroup.field_C != null &&
            ArrayWidgetGroup.field_C.a((byte) -124) &&
            ArrayWidgetGroup.field_C.a(false, "benefits") &&
            lb.field_d != null &&
            lb.field_d.a((byte) -108) &&
            lb.field_d.a(false, "benefits")) {
            GameApplet.field_b = fl.a("benefits", "headline", ArrayWidgetGroup.field_C, 11091);
            pn.field_a = fl.a("benefits", "blurbpane", ArrayWidgetGroup.field_C, 11091);
            ha.field_l = fl.a("benefits", "button", ArrayWidgetGroup.field_C, 11091);
            ig.field_e = fl.a("benefits", "signup_text", ArrayWidgetGroup.field_C, 11091);
            ia.field_y = fl.a("benefits", "menu_text", ArrayWidgetGroup.field_C, 11091);
            er.field_j = fl.a("benefits", "button_frame", ArrayWidgetGroup.field_C, 11091);
            fa.field_Tb = fl.a("benefits", "arrow", ArrayWidgetGroup.field_C, 11091);
            dc.field_Lb = (BitmapFont) ((Object) pj.a(ArrayWidgetGroup.field_C, 4, lb.field_d, "large_font", "benefits"));
            gf.field_e = (BitmapFont) ((Object) pj.a(ArrayWidgetGroup.field_C, 4, lb.field_d, "small_font", "benefits"));
            var27 = SoftwareRasterizer.field_i;
            var2 = SoftwareRasterizer.field_b;
            var3 = SoftwareRasterizer.field_l;
            SoftwareRasterizer.saveClip(b.field_f);
            var11 = new Sprite(fa.field_Tb.width + 4, 4 + fa.field_Tb.height);
            var11.a();
            fa.field_Tb.i(2, 2, PlayerLoadout.field_e);
            sq.a(5, var11.width, 2, var11.height, var11, 1, 0, 0);
            fa.field_Tb = var11;
            mb.field_j = fa.field_Tb.f();
            var12 = new Sprite(195, 221);
            var6 = var12.width / 2;
            var12.a();
            dc.field_Lb.b(vl.a(t.field_b, new String[]{ql.field_e}, 2), var6, 40, 16777215, -1);
            gf.field_e.b(vl.a(ob.field_w, new String[]{ql.field_e}, 2), var6, 60, 16777215, -1);
            dc.field_Lb.b(vl.a(ck.field_c, new String[]{eo.field_b}, 2), var6, 110, 16777215, -1);
            gf.field_e.b(vl.a(wc.field_G, new String[]{eo.field_b}, 2), var6, 130, 16777215, -1);
            dc.field_Lb.b(ContextMenu.field_Yb, var6, 180, 16777215, -1);
            gf.field_e.b(um.field_f, var6, 200, 16777215, -1);
            sq.a(5, var12.width, 3, var12.height, var12, 1, 0, 0);
            pn.field_a.a();
            var12.g(-pn.field_a.offsetX + 18, 241 - pn.field_a.field_y);
            for (var7 = 0; nj.field_a.length > var7; var7++) {
              ao.field_h[var7].a();
              gf.field_e.a(nj.field_a[var7], 3, 3, ao.field_h[var7].width - 6, -6 + ao.field_h[var7].height, PlayerLoadout.field_e, -1, 1, 1, gf.field_e.field_C + gf.field_e.field_r);
              sq.a(5, ao.field_h[var7].width, 3, ao.field_h[var7].height, ao.field_h[var7], 1, 0, 0);
            }
            nj.field_a = null;
            kg.field_j = ig.field_e.c();
            kg.field_j.a();
            pi.a((byte) -115, 0, 64, SoftwareRasterizer.field_b, SoftwareRasterizer.field_l * 2 / 3, 0);
            SoftwareRasterizer.setTarget(var27, var2, var3);
            SoftwareRasterizer.restoreClip(b.field_f);
            jp.field_d = (ha.field_l.width - er.field_j.width) / 2 + 231;
            cr.field_j = (-er.field_j.height + ha.field_l.height) / 2 + 390;
            sq.field_O = (-er.field_j.height + ha.field_l.height) / 2 + 390;
            ArrayWidgetGroup.field_C = null;
            RasterSnapshot.field_k = (ha.field_l.width - er.field_j.width) / 2 + 434;
          }
          if (rq.field_v == null) {
            return;
          }
          if (q.field_c != null &&
            dc.field_Lb != null) {
            var28 = SoftwareRasterizer.field_i;
            var2Lifetime1 = SoftwareRasterizer.field_b;
            var3Lifetime1 = SoftwareRasterizer.field_l;
            SoftwareRasterizer.saveClip(b.field_f);
            var14 = vl.a(HuffmanCodec.field_h, new String[]{vk.field_L[hj.field_f]}, 2);
            var5 = dc.field_Lb.c(var14, ol.field_p);
            var6Lifetime1 = dc.field_Lb.a(var14, ol.field_p, dc.field_Lb.field_C + dc.field_Lb.field_r);
            var7Lifetime1 = (-var5 + ol.field_p) / 2 + pg.field_c;
            var8 = (ai.field_a - var6Lifetime1) / 2 + em.field_bb;
            var7Lifetime1 -= 3;
            var5 += 6;
            var8 -= 3;
            var6Lifetime1 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              pg.field_c = pg.field_c + var9_int;
              var5 = var5 + var9_int * 2;
              q.field_c.offsetX = q.field_c.offsetX + var9_int;
              LevelFileCatalog.field_b = LevelFileCatalog.field_b - var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              q.field_c.fullWidth = q.field_c.fullWidth + 2 * var9_int;
            }
            if (q.field_c.fullWidth < var7Lifetime1 + var5) {
              var9_intLifetime1 = var7Lifetime1 - (-var5 + q.field_c.fullWidth);
              LevelFileCatalog.field_b = LevelFileCatalog.field_b - var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              pg.field_c = pg.field_c + var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              q.field_c.offsetX = q.field_c.offsetX + var9_intLifetime1;
              q.field_c.fullWidth = q.field_c.fullWidth + var9_intLifetime1 * 2;
            }
            if (0 > var8) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              q.field_c.field_y = q.field_c.field_y + var9_intLifetime2;
              pn.field_e = pn.field_e - var9_intLifetime2;
              q.field_c.field_u = q.field_c.field_u + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              em.field_bb = em.field_bb + var9_intLifetime2;
            }
            if (q.field_c.field_u < var6Lifetime1 + var8) {
              var9_intLifetime3 = -q.field_c.field_u + (var8 + var6Lifetime1);
              q.field_c.field_u = q.field_c.field_u + var9_intLifetime3 * 2;
              q.field_c.field_y = q.field_c.field_y + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              pn.field_e = pn.field_e - var9_intLifetime3;
              em.field_bb = em.field_bb + var9_intLifetime3;
            }
            q.field_c.j();
            var9 = new Sprite(q.field_c.fullWidth, q.field_c.field_u);
            var9.a();
            dc.field_Lb.a(var14, pg.field_c, em.field_bb, ol.field_p, ai.field_a, 16777215, -1, 1, 1, dc.field_Lb.field_r + dc.field_Lb.field_C);
            sq.a(5, var9.fullWidth, 3, var9.field_u, var9, 1, 0, 0);
            q.field_c.a();
            var9.g(0, 0);
            BufferedSocket.field_j = new Sprite(640, 480);
            BufferedSocket.field_j.a();
            q.field_c.d(LevelFileCatalog.field_b + (q.field_c.fullWidth >> 1), pn.field_e + (q.field_c.field_u >> 1), GameScreen.field_N, 4096);
            q.field_c = null;
            BufferedSocket.field_j.d();
            SoftwareRasterizer.setTarget(var28, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(b.field_f);
          }
          if (null != ie.field_ib &&
            null != gf.field_e) {
            var29 = SoftwareRasterizer.field_i;
            var2Lifetime2 = SoftwareRasterizer.field_b;
            var3Lifetime2 = SoftwareRasterizer.field_l;
            SoftwareRasterizer.saveClip(b.field_f);
            var16 = new Sprite(412, 43);
            var5_ref_String = vl.a(vk.field_F, new String[]{ie.field_ib}, 2);
            ie.field_ib = null;
            var16.a();
            gf.field_e.a(var5_ref_String, 3, 3, var16.width - 6, -6 + var16.height, 16777215, -1, 0, 1, gf.field_e.field_C + gf.field_e.field_r);
            sq.a(5, var16.width, 3, var16.height, var16, 1, 0, 0);
            rq.field_v.a();
            var16.g(-rq.field_v.offsetX + 199, -rq.field_v.field_y + 83);
            SoftwareRasterizer.setTarget(var29, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(b.field_f);
          }
          if (null != MouseInputHandler.field_e &&
            null != gf.field_e) {
            var30 = SoftwareRasterizer.field_i;
            var2Lifetime3 = SoftwareRasterizer.field_b;
            var3Lifetime3 = SoftwareRasterizer.field_l;
            SoftwareRasterizer.saveClip(b.field_f);
            var4 = 6 + gf.field_e.c(tf.field_Cb, 640);
            var5Lifetime1 = 20 + (var4 + MouseInputHandler.field_e.fullWidth);
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 - (-MouseInputHandler.field_e.fullWidth - 20);
            rq.field_v.a();
            gf.field_e.c(tf.field_Cb, var7Lifetime2 - rq.field_v.offsetX, gf.field_e.field_r + (gf.field_e.field_C - rq.field_v.field_y + 155), 16777215, -1);
            sq.a(5, var4, 3, 50, rq.field_v, 1, -4 + var7Lifetime2 - rq.field_v.offsetX, -rq.field_v.field_y + 155);
            var8Lifetime1 = -rq.field_v.field_y + (155 - (-gf.field_e.field_r + (-gf.field_e.field_C + (-3 + MouseInputHandler.field_e.field_u))) / 2);
            MouseInputHandler.field_e.g(var6Lifetime2 - rq.field_v.offsetX, var8Lifetime1);
            SoftwareRasterizer.setTarget(var30, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(b.field_f);
            MouseInputHandler.field_e = null;
          }
          SoftwareRasterizer.saveClip(b.field_f);
          SoftwareRasterizer.fillRoundedRectAlpha(16, 16, 608, 112, 15, gg.field_c, pf.field_c);
          SoftwareRasterizer.fillRoundedRectAlpha(231, 144, 393, 232, 15, gg.field_c, pf.field_c);
          if (null != GameApplet.field_b) {
            GameApplet.field_b.g(0, 0);
          }
          if (null != pn.field_a) {
            pn.field_a.g(0, 0);
          }
          rq.field_v.g(0, 0);
          if (null != BufferedSocket.field_j) {
            BufferedSocket.field_j.g(0, 0);
          }
          if (ha.field_l != null &&
            er.field_j != null) {
            ha.field_l.g(231, 390);
            var1 = ig.field_e;
            if (gl.field_H.field_d == 0) {
              var1 = kg.field_j;
            }
            var1.g(0, 0);
            stackIn_49_0 = 105;
            stackIn_49_1 = ClientException.field_c;
            if (gl.field_H.field_d != 0) {
              stackIn_50_2 = 3;
            } else {
              stackIn_50_2 = 4;
            }
            var2Lifetime4 = (q.$cfr$intArgs$a$f0c91481eb80(stackIn_49_0, stackIn_49_1 << stackIn_50_2) * 40 >> 16) + 40;
            if (var2Lifetime4 > 0) {
              ha.field_l.e(230, 389, var2Lifetime4);
              ha.field_l.e(232, 389, var2Lifetime4);
              ha.field_l.e(232, 391, var2Lifetime4);
              ha.field_l.e(230, 391, var2Lifetime4);
              var1.e(1, 1, var2Lifetime4);
              var1.e(-1, 1, var2Lifetime4);
              var1.e(1, -1, var2Lifetime4);
              var1.e(-1, -1, var2Lifetime4);
            }
            stackIn_55_0 = jp.field_d;
            stackIn_55_1 = cr.field_j;
            stackIn_55_2 = -59;
            stackIn_56_3 = (gl.field_H.field_d == 0);
            bc.$cfr$intArgs$a$c6021a39f7cf(stackIn_55_0, stackIn_55_1, stackIn_55_2, stackIn_56_3);
          }
          if (null != ha.field_l &&
            er.field_j != null) {
            ha.field_l.g(434, 390);
            ia.field_y.g(0, 0);
            if (1 == gl.field_H.field_d) {
              pi.a((byte) -122, 436, 64, -4 + ha.field_l.width, ha.field_l.height * 7 / 12, 392);
            }
            stackIn_63_0 = RasterSnapshot.field_k;
            stackIn_63_1 = sq.field_O;
            stackIn_63_2 = -59;
            stackIn_64_3 = (1 == gl.field_H.field_d);
            bc.$cfr$intArgs$a$c6021a39f7cf(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_64_3);
          }
          if (null != fa.field_Tb) {
            var1_int = -(fa.field_Tb.field_u / 2) + 357;
            fa.field_Tb.g(269 - fa.field_Tb.fullWidth, var1_int);
            mb.field_j.g(586, var1_int);
            if (var1_int < bo.field_d &&
              bo.field_d < var1_int + fa.field_Tb.height) {
              var2Lifetime5 = 40 + (40 * q.$cfr$intArgs$a$f0c91481eb80(-47, ClientException.field_c << 4) >> 16);
              if (var2Lifetime5 > 0) {
                if (269 - fa.field_Tb.width < MouseInputHandler.field_g &&
                  269 > MouseInputHandler.field_g) {
                  fa.field_Tb.e(-fa.field_Tb.fullWidth + 268, var1_int - 1, var2Lifetime5);
                  fa.field_Tb.e(1 + (-fa.field_Tb.fullWidth + 269), var1_int - 1, var2Lifetime5);
                  fa.field_Tb.e(-fa.field_Tb.fullWidth + 268, 1 + var1_int, var2Lifetime5);
                  fa.field_Tb.e(269 - fa.field_Tb.fullWidth + 1, var1_int + 1, var2Lifetime5);
                } else {
                  if (MouseInputHandler.field_g > 586 &&
                    586 + fa.field_Tb.width > MouseInputHandler.field_g) {
                    mb.field_j.e(585, -1 + var1_int, var2Lifetime5);
                    mb.field_j.e(587, var1_int - 1, var2Lifetime5);
                    mb.field_j.e(585, var1_int + 1, var2Lifetime5);
                    mb.field_j.e(587, 1 + var1_int, var2Lifetime5);
                  }
                }
              }
            }
          }
          cd.c((byte) -57);
          if (!param0) {
            return;
          }
          ao.field_h[gf.field_g].g(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ok.C(" + param0 + ')');
        }
    }

    final FullscreenFocusCanvas f(int param0) {
        this.field_x = pi.field_i;
        this.field_j = ng.field_d;
        this.field_u.a((byte) -26, this.field_q, this.field_e);
        hn.field_h = false;
        FullscreenFocusCanvas var2 = u.a(param0 + 10386, ArrayWidgetGroup.field_J, this.field_q, 0, param0, this.field_e);
        if (var2 == null) {
          this.d(param0 - 44);
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 71 % ((param1 - 20) / 54);
        this.field_b = param0;
        this.field_d = param2;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_b;
        var3 = this.field_d;
        if (!this.a(0)) {
          this.field_a = false;
          return;
        }
        if (var2 <= this.field_o) {
          if (var2 < this.field_s) {
            var2 = this.field_s;
          }
        } else {
          var2 = this.field_o;
        }
        if (var3 > this.field_n) {
          var3 = this.field_n;
        } else {
          if (var3 < this.field_h) {
            var3 = this.field_h;
          }
        }
        if (0.0f < this.field_c) {
          var4 = (int)(0.5f + (float)var3 * this.field_c);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_c);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (var2 != ng.field_d ||
          var3 != pi.field_i) {
          this.field_u.a((byte) -27, var3, var2);
        }
        if (this.field_b > param0) {
          bl.field_a = (-ng.field_d + this.field_b) / 2;
        }
    }

    private ok() throws Throwable {
        throw new Error();
    }

    final void d(int param0) {
        if (param0 > -3) {
          return;
        }
        this.field_u.a((byte) -85, this.field_x, this.field_j);
    }

    final static void a(int param0, int param1, CipherPacketBuffer param2, int param3, int param4, int param5) {
        if (PortalEntryEvent.field_m.field_c) {
          return;
        }
        if (df.field_I) {
          UiWidget.field_s.requestPowerup(param1, -11513, 0, param5, param4);
          return;
        }
        try {
          if (param0 >= -95) {
            ok.e(112);
          }
          param2.b((byte) -35, 59);
          param2.a(param3, (byte) -87);
          param2.a(123, param5);
          param2.a(param4, (byte) -112);
          param2.a(param1, (byte) -50);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ok.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0) {
        boolean stackIn_5_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_5_0 = (WidgetStyleLayer.field_d >= this.field_f) && (0 < vl.field_h);
        return stackIn_5_0;
    }

    static {
        field_t = "Famished";
        field_i = "Your powerups will last longer if you have this trait equipped.";
        field_r = new int[8192];
    }
}
