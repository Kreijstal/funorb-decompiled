/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    static IntrusiveDeque field_c;
    int field_h;
    int[] field_f;
    int field_d;
    java.awt.Image field_g;
    static String field_b;
    static int field_a;
    static String field_i;
    static String field_e;

    final static Boolean b(byte param0) {
        Boolean var1 = gh.field_c;
        gh.field_c = null;
        if (param0 >= -21) {
          field_e = (String) null;
        }
        return var1;
    }

    abstract void a(byte param0, int param1, java.awt.Component param2, int param3);

    final static boolean a(char param0, boolean param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (kl.a(param0, param1)) {
          return true;
        }
        if (45 == param0) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        if (param0 != 75) {
          RasterBuffer.a((byte) -6);
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    final static void a(int param0, int param1, Sprite param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = param7 + param6 + (param2.offsetX - param8);
          var10 = param7 + (param6 + (param2.offsetX + param0));
          var11 = (param2.height >> 1) + (param5 + param2.offsetY);
          SoftwareRasterizer.intersectClip(var9_int, param3, var10, var11 + param1);
          param2.a(-1 + param6, param5 - 1, param4);
          param2.a(param6 - 1, 1 + param5, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          SoftwareRasterizer.intersectClip(var9_int + 1, 0, var10 + 1, param1 + var11);
          param2.a(1 + param6, param5 - 1, param4);
          param2.a(param6 + 1, 1 + param5, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          var10Lifetime1 = -param7 + param2.offsetX + param2.width + param6 - param8;
          var9_intLifetime1 = param6 + param2.width + (param2.offsetX - (param7 + param0));
          SoftwareRasterizer.intersectClip(var9_intLifetime1, var11 - param1, var10Lifetime1, 480);
          param2.a(-1 + param6, -1 + param5, param4);
          param2.a(param6 - 1, param5 + 1, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          SoftwareRasterizer.intersectClip(var9_intLifetime1 + 1, -param1 + var11, 1 + var10Lifetime1, 480);
          param2.a(1 + param6, param5 - 1, param4);
          param2.a(1 + param6, param5 + 1, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "df.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(int param0) {
        if (param0 <= 19) {
          field_a = -35;
        }
        SoftwareRasterizer.setTarget(this.field_f, this.field_d, this.field_h);
    }

    final static void a(int param0) {
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_57_1 = false;
        int stackIn_65_0 = 0;
        boolean stackIn_66_1 = false;
        RuntimeException decompiledCaughtException = null;
        Sprite var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
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
        var10 = wizardrun.field_H;
        try {
          if (qk.field_j != null &&
            qk.field_j.b(param0 + 17818) &&
            qk.field_j.a((byte) 29, "benefits") &&
            null != pj.field_M &&
            pj.field_M.b(param0 + 17818) &&
            pj.field_M.a((byte) 29, "benefits")) {
            ab.field_c = vg.loadSprite(15, "headline", qk.field_j, "benefits");
            MouseWheelInput.field_b = vg.loadSprite(15, "blurbpane", qk.field_j, "benefits");
            mj.field_b = vg.loadSprite(15, "button", qk.field_j, "benefits");
            ei.field_l = vg.loadSprite(15, "signup_text", qk.field_j, "benefits");
            ae.field_c = vg.loadSprite(15, "menu_text", qk.field_j, "benefits");
            ef.field_H = vg.loadSprite(15, "button_frame", qk.field_j, "benefits");
            ra.field_p = vg.loadSprite(param0 + 13, "arrow", qk.field_j, "benefits");
            v.field_b = (BitmapFont) ((Object) IsaacRandom.loadFont(800863586, "benefits", qk.field_j, "large_font", pj.field_M));
            bk.field_a = (BitmapFont) ((Object) IsaacRandom.loadFont(800863586, "benefits", qk.field_j, "small_font", pj.field_M));
            var27 = SoftwareRasterizer.pixels;
            var2 = SoftwareRasterizer.width;
            var3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var11 = new Sprite(4 + ra.field_p.width, ra.field_p.height + 4);
            var11.bindAsRasterTarget();
            ra.field_p.e(2, 2, ug.field_H);
            oh.a(var11.height, var11, 0, var11.width, 2, (byte) 45, 0, 1);
            ra.field_p = var11;
            IntrusiveDequeCursor.field_b = ra.field_p.flipHorizontal();
            var12 = new Sprite(195, 221);
            var6 = var12.width / 2;
            var12.bindAsRasterTarget();
            v.field_b.drawStringCentered(di.a(new String[]{td.field_d}, (byte) 53, of.field_l), var6, 40, 16777215, -1);
            bk.field_a.drawStringCentered(di.a(new String[]{td.field_d}, (byte) 43, i.field_g), var6, 60, 16777215, -1);
            v.field_b.drawStringCentered(di.a(new String[]{dc.field_n}, (byte) 96, bc.field_b), var6, 110, 16777215, -1);
            bk.field_a.drawStringCentered(di.a(new String[]{dc.field_n}, (byte) 58, nh.field_q), var6, 130, 16777215, -1);
            v.field_b.drawStringCentered(jg.field_p, var6, 180, 16777215, -1);
            bk.field_a.drawStringCentered(ra.field_i, var6, 200, 16777215, -1);
            oh.a(var12.height, var12, 0, var12.width, 3, (byte) 82, 0, 1);
            MouseWheelInput.field_b.bindAsRasterTarget();
            var12.e(18 - MouseWheelInput.field_b.offsetX, -MouseWheelInput.field_b.offsetY + 241);
            for (var7 = 0; SpriteState.field_w.length > var7; var7++) {
              dc.field_s[var7].bindAsRasterTarget();
              bk.field_a.a(SpriteState.field_w[var7], 3, 3, dc.field_s[var7].width - 6, -6 + dc.field_s[var7].height, ug.field_H, -1, 1, 1, bk.field_a.field_B + bk.field_a.field_M);
              oh.a(dc.field_s[var7].height, dc.field_s[var7], 0, dc.field_s[var7].width, 3, (byte) 37, 0, 1);
            }
            SpriteState.field_w = null;
            pa.field_a = ei.field_l.copy();
            pa.field_a.bindAsRasterTarget();
            l.a(2 * SoftwareRasterizer.height / 3, (byte) -105, 0, 0, SoftwareRasterizer.width, 64);
            SoftwareRasterizer.setTarget(var27, var2, var3);
            SoftwareRasterizer.restoreClip(ld.field_b);
            wk.field_c = 231 + (-ef.field_H.width + mj.field_b.width) / 2;
            qc.field_L = 390 + (-ef.field_H.height + mj.field_b.height) / 2;
            qk.field_j = null;
            hf.field_b = (mj.field_b.height - ef.field_H.height) / 2 + 390;
            hj.field_f = (-ef.field_H.width + mj.field_b.width) / 2 + 434;
          }
          if (od.field_f == null) {
            return;
          }
          if (uk.field_b != null &&
            null != v.field_b) {
            var28 = SoftwareRasterizer.pixels;
            var2Lifetime1 = SoftwareRasterizer.width;
            var3Lifetime1 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var14 = di.a(new String[]{uc.field_d[bb.field_k]}, (byte) 49, si.field_b);
            var5 = v.field_b.maxLineWidth(var14, MouseWheelInput.field_a);
            var6Lifetime1 = v.field_b.a(var14, MouseWheelInput.field_a, v.field_b.field_B + v.field_b.field_M);
            var7Lifetime1 = (MouseWheelInput.field_a - var5) / 2 + jg.field_m;
            var7Lifetime1 -= 3;
            var8 = cb.field_a + (r.field_a - var6Lifetime1) / 2;
            var5 += 6;
            var6Lifetime1 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              sl.field_r = sl.field_r - var9_int;
              uk.field_b.offsetX = uk.field_b.offsetX + var9_int;
              var5 = var5 + 2 * var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              uk.field_b.fullWidth = uk.field_b.fullWidth + var9_int * 2;
              jg.field_m = jg.field_m + var9_int;
            }
            var8 -= 3;
            if (var5 + var7Lifetime1 > uk.field_b.fullWidth) {
              var9_intLifetime1 = -uk.field_b.fullWidth + (var7Lifetime1 + var5);
              var5 = var5 + 2 * var9_intLifetime1;
              uk.field_b.fullWidth = uk.field_b.fullWidth + var9_intLifetime1 * 2;
              sl.field_r = sl.field_r - var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              jg.field_m = jg.field_m + var9_intLifetime1;
              uk.field_b.offsetX = uk.field_b.offsetX + var9_intLifetime1;
            }
            if (0 > var8) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              uk.field_b.offsetY = uk.field_b.offsetY + var9_intLifetime2;
              uk.field_b.fullHeight = uk.field_b.fullHeight + 2 * var9_intLifetime2;
              cb.field_a = cb.field_a + var9_intLifetime2;
              ka.field_i = ka.field_i - var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
            }
            if (uk.field_b.fullHeight < var6Lifetime1 + var8) {
              var9_intLifetime3 = var8 + var6Lifetime1 - uk.field_b.fullHeight;
              uk.field_b.fullHeight = uk.field_b.fullHeight + 2 * var9_intLifetime3;
              ka.field_i = ka.field_i - var9_intLifetime3;
              uk.field_b.offsetY = uk.field_b.offsetY + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
              cb.field_a = cb.field_a + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
            }
            uk.field_b.expandToFullSize();
            var9 = new Sprite(uk.field_b.fullWidth, uk.field_b.fullHeight);
            var9.bindAsRasterTarget();
            v.field_b.a(var14, jg.field_m, cb.field_a, MouseWheelInput.field_a, r.field_a, 16777215, -1, 1, 1, v.field_b.field_M + v.field_b.field_B);
            oh.a(var9.fullHeight, var9, 0, var9.fullWidth, 3, (byte) 98, 0, 1);
            uk.field_b.bindAsRasterTarget();
            var9.e(0, 0);
            ac.field_s = new Sprite(640, 480);
            ac.field_s.bindAsRasterTarget();
            uk.field_b.b(sl.field_r + (uk.field_b.fullWidth >> 1), ka.field_i + (uk.field_b.fullHeight >> 1), kk.field_xb, 4096);
            uk.field_b = null;
            ac.field_s.a();
            SoftwareRasterizer.setTarget(var28, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(ld.field_b);
          }
          if (null != pc.field_r &&
            bk.field_a != null) {
            var29 = SoftwareRasterizer.pixels;
            var2Lifetime2 = SoftwareRasterizer.width;
            var3Lifetime2 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var16 = new Sprite(412, 43);
            var5_ref_String = di.a(new String[]{pc.field_r}, (byte) 79, field_b);
            pc.field_r = null;
            var16.bindAsRasterTarget();
            bk.field_a.a(var5_ref_String, 3, 3, var16.width - 6, -6 + var16.height, 16777215, -1, 0, 1, bk.field_a.field_B + bk.field_a.field_M);
            oh.a(var16.height, var16, 0, var16.width, 3, (byte) 60, 0, 1);
            od.field_f.bindAsRasterTarget();
            var16.e(199 - od.field_f.offsetX, 83 - od.field_f.offsetY);
            SoftwareRasterizer.setTarget(var29, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(ld.field_b);
          }
          if (null != ag.field_v &&
            bk.field_a != null) {
            var30 = SoftwareRasterizer.pixels;
            var2Lifetime3 = SoftwareRasterizer.width;
            var3Lifetime3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var4 = 6 + bk.field_a.maxLineWidth(lg.field_b, 640);
            var5Lifetime1 = ag.field_v.fullWidth + (var4 + 20);
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = 20 + var6Lifetime2 + ag.field_v.fullWidth;
            od.field_f.bindAsRasterTarget();
            bk.field_a.drawString(lg.field_b, var7Lifetime2 - od.field_f.offsetX, -od.field_f.offsetY + (155 + (bk.field_a.field_M + bk.field_a.field_B)), 16777215, -1);
            oh.a(50, od.field_f, var7Lifetime2 - od.field_f.offsetX - 4, var4, 3, (byte) 90, -od.field_f.offsetY + 155, 1);
            var8Lifetime1 = -((-bk.field_a.field_B - bk.field_a.field_M - 3 + ag.field_v.fullHeight) / 2) + 155 - od.field_f.offsetY;
            ag.field_v.e(var6Lifetime2 - od.field_f.offsetX, var8Lifetime1);
            SoftwareRasterizer.setTarget(var30, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(ld.field_b);
            ag.field_v = null;
          }
          SoftwareRasterizer.saveClip(ld.field_b);
          SoftwareRasterizer.a(16, 16, 608, 112, 15, nh.field_n, wd.field_g);
          SoftwareRasterizer.a(231, 144, 393, 232, 15, nh.field_n, wd.field_g);
          if (null != ab.field_c) {
            ab.field_c.e(0, 0);
          }
          if (MouseWheelInput.field_b != null) {
            MouseWheelInput.field_b.e(0, 0);
          }
          if (param0 != 2) {
            RasterBuffer.b((byte) -119);
          }
          od.field_f.e(0, 0);
          if (null != ac.field_s) {
            ac.field_s.e(0, 0);
          }
          if (null != mj.field_b &&
            null != ef.field_H) {
            mj.field_b.e(231, 390);
            var1 = ei.field_l;
            if (GameGraphicsResources.field_d.field_g == 0) {
              var1 = pa.field_a;
            }
            var1.e(0, 0);
            stackIn_50_0 = 40;
            stackIn_50_1 = hj.field_c;
            if (GameGraphicsResources.field_d.field_g == 0) {
              stackIn_51_2 = 4;
            } else {
              stackIn_51_2 = 3;
            }
            var2Lifetime4 = (stackIn_50_0 * hg.b(stackIn_50_1 << stackIn_51_2, (byte) -89) >> 16) + 40;
            if (var2Lifetime4 > 0) {
              mj.field_b.a(230, 389, var2Lifetime4);
              mj.field_b.a(232, 389, var2Lifetime4);
              mj.field_b.a(232, 391, var2Lifetime4);
              mj.field_b.a(230, 391, var2Lifetime4);
              var1.a(1, 1, var2Lifetime4);
              var1.a(-1, 1, var2Lifetime4);
              var1.a(1, -1, var2Lifetime4);
              var1.a(-1, -1, var2Lifetime4);
            }
            stackIn_56_0 = 2;
            stackIn_57_1 = (GameGraphicsResources.field_d.field_g == 0);
            SecondaryNodeDeque.a(stackIn_56_0, stackIn_57_1, wk.field_c, qc.field_L);
          }
          if (mj.field_b != null &&
            null != ef.field_H) {
            mj.field_b.e(434, 390);
            ae.field_c.e(0, 0);
            if (GameGraphicsResources.field_d.field_g == 1) {
              l.a(7 * mj.field_b.height / 12, (byte) -105, 392, 436, mj.field_b.width - 4, 64);
            }
            stackIn_65_0 = 2;
            stackIn_66_1 = (1 == GameGraphicsResources.field_d.field_g);
            SecondaryNodeDeque.a(stackIn_65_0, stackIn_66_1, hj.field_f, hf.field_b);
          }
          if (ra.field_p != null) {
            var1_int = -(ra.field_p.fullHeight / 2) + 357;
            ra.field_p.e(-ra.field_p.fullWidth + 269, var1_int);
            IntrusiveDequeCursor.field_b.e(586, var1_int);
            if (fi.field_B > var1_int &&
              var1_int + ra.field_p.height > fi.field_B) {
              var2Lifetime5 = 40 + (40 * hg.b(hj.field_c << 4, (byte) -89) >> 16);
              if (var2Lifetime5 > 0) {
                if (pg.field_n > 269 - ra.field_p.width &&
                  269 > pg.field_n) {
                  ra.field_p.a(269 + (-ra.field_p.fullWidth - 1), -1 + var1_int, var2Lifetime5);
                  ra.field_p.a(270 - ra.field_p.fullWidth, -1 + var1_int, var2Lifetime5);
                  ra.field_p.a(268 - ra.field_p.fullWidth, var1_int + 1, var2Lifetime5);
                  ra.field_p.a(-ra.field_p.fullWidth + 269 + 1, var1_int + 1, var2Lifetime5);
                } else {
                  if (pg.field_n > 586 &&
                    pg.field_n < 586 + ra.field_p.width) {
                    IntrusiveDequeCursor.field_b.a(585, var1_int - 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.a(587, var1_int - 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.a(585, var1_int + 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.a(587, var1_int + 1, var2Lifetime5);
                  }
                }
              }
            }
          }
          qh.b(true);
          dc.field_s[ej.field_c].e(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "df.E(" + param0 + ')');
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    static {
        field_c = new IntrusiveDeque();
        field_b = "(Including <%0>)";
        field_e = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_i = "Confirm Password: ";
    }
}
