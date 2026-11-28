/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static String field_e;
    static String field_g;
    static int field_c;
    static boolean field_f;
    static ge field_a;
    static Sprite[] field_b;
    static String[] field_d;

    final static void a(int param0) {
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_53_0 = 0;
        boolean stackIn_54_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_62_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        Sprite var2_ref_hl = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = StarCannon.field_A;
        try {
          if (g.field_a != null &&
            g.field_a.ensureIndexLoaded((byte) 106) &&
            g.field_a.tryLoadGroupByName("benefits", -9883) &&
            null != AccountRequestState.field_a &&
            AccountRequestState.field_a.ensureIndexLoaded((byte) 110) &&
            AccountRequestState.field_a.tryLoadGroupByName("benefits", -9883)) {
            DelayedPcmStream.field_k = DequeWidgetContainer.a("benefits", 32, "headline", g.field_a);
            ConfirmedEmailAvailabilityValidator.field_q = DequeWidgetContainer.a("benefits", 86, "blurbpane", g.field_a);
            pc.field_a = DequeWidgetContainer.a("benefits", 106, "button", g.field_a);
            re.field_f = DequeWidgetContainer.a("benefits", 17, "signup_text", g.field_a);
            SpriteState.field_z = DequeWidgetContainer.a("benefits", 71, "menu_text", g.field_a);
            KeyboardInput.field_c = DequeWidgetContainer.a("benefits", 32, "button_frame", g.field_a);
            ge.field_b = DequeWidgetContainer.a("benefits", 123, "arrow", g.field_a);
            gi.field_b = (BitmapFont) ((Object) od.a("benefits", g.field_a, "large_font", -1, AccountRequestState.field_a));
            ah.field_d = (BitmapFont) ((Object) od.a("benefits", g.field_a, "small_font", -1, AccountRequestState.field_a));
            var28 = SoftwareRasterizer.field_a;
            var2 = SoftwareRasterizer.field_j;
            var3 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.saveClip(wc.field_b);
            var11 = new Sprite(4 + ge.field_b.field_u, 4 + ge.field_b.field_v);
            var11.bindAsRenderTarget();
            ge.field_b.drawGrayModulated(2, 2, ByteArrayPoolSupport.field_c);
            hh.a(0, 0, 2, var11.field_v, false, 1, var11, var11.field_u);
            ge.field_b = var11;
            ma.field_b = ge.field_b.copyMirroredHorizontally();
            var12 = new Sprite(195, 221);
            var6 = var12.field_u / 2;
            var12.bindAsRenderTarget();
            gi.field_b.drawCentred(fb.a(NetworkArchiveRequest.field_x, -103, new String[]{t.field_q}), var6, 40, 16777215, -1);
            ah.field_d.drawCentred(fb.a(ic.field_c, 118, new String[]{t.field_q}), var6, 60, 16777215, -1);
            gi.field_b.drawCentred(fb.a(DequeWidgetContainer.field_t, 118, new String[]{ClientException.field_c}), var6, 110, 16777215, -1);
            ah.field_d.drawCentred(fb.a(vg.field_a, -15, new String[]{ClientException.field_c}), var6, 130, 16777215, -1);
            gi.field_b.drawCentred(be.field_a, var6, 180, 16777215, -1);
            ah.field_d.drawCentred(lj.field_a, var6, 200, 16777215, -1);
            hh.a(0, 0, 3, var12.field_v, false, 1, var12, var12.field_u);
            ConfirmedEmailAvailabilityValidator.field_q.bindAsRenderTarget();
            var12.draw(18 - ConfirmedEmailAvailabilityValidator.field_q.field_w, -ConfirmedEmailAvailabilityValidator.field_q.field_y + 241);
            for (var7 = 0; var7 < va.field_t.length; var7++) {
              ValidationStatusWidget.field_I[var7].bindAsRenderTarget();
              ah.field_d.drawParagraph(va.field_t[var7], 3, 3, ValidationStatusWidget.field_I[var7].field_u - 6, ValidationStatusWidget.field_I[var7].field_v - 6, ByteArrayPoolSupport.field_c, -1, 1, 1, ah.field_d.field_p + ah.field_d.field_q);
              hh.a(0, 0, 3, ValidationStatusWidget.field_I[var7].field_v, false, 1, ValidationStatusWidget.field_I[var7], ValidationStatusWidget.field_I[var7].field_u);
            }
            va.field_t = null;
            jh.field_a = re.field_f.copy();
            jh.field_a.bindAsRenderTarget();
            rh.a(0, SoftwareRasterizer.field_j, 2 * SoftwareRasterizer.field_f / 3, 0, 64, true);
            SoftwareRasterizer.setRasterBuffer(var28, var2, var3);
            SoftwareRasterizer.restoreClip(wc.field_b);
            mf.field_d = (-KeyboardInput.field_c.field_v + pc.field_a.field_v) / 2 + 390;
            TextLineMetrics.field_f = (-KeyboardInput.field_c.field_u + pc.field_a.field_u) / 2 + 231;
            g.field_a = null;
            TextFieldValidator.field_e = (-KeyboardInput.field_c.field_u + pc.field_a.field_u) / 2 + 434;
            ProgressDialog.field_Z = (-KeyboardInput.field_c.field_v + pc.field_a.field_v) / 2 + 390;
          }
          if (ba.field_c == null) {
            return;
          }
          if (re.field_l != null &&
            null != gi.field_b) {
            var29 = SoftwareRasterizer.field_a;
            var2Lifetime1 = SoftwareRasterizer.field_j;
            var3Lifetime1 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.saveClip(wc.field_b);
            var14 = fb.a(u.field_a, 114, new String[]{ResizableModalDialog.field_N[fc.field_c]});
            var5 = gi.field_b.maxLineWidth(var14, AccountNameAvailabilityValidator.field_k);
            var6Lifetime1 = gi.field_b.textHeight(var14, AccountNameAvailabilityValidator.field_k, gi.field_b.field_p + gi.field_b.field_q);
            var7Lifetime1 = BoundedRandomAccessFile.field_f + (AccountNameAvailabilityValidator.field_k - var5) / 2;
            var5 += 6;
            var7Lifetime1 -= 3;
            var8 = ResourceArchive.field_e + (BufferedRandomAccessFile.field_p - var6Lifetime1) / 2;
            var6Lifetime1 += 6;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              w.field_v = w.field_v - var9_int;
              re.field_l.field_x = re.field_l.field_x + var9_int * 2;
              re.field_l.field_w = re.field_l.field_w + var9_int;
              BoundedRandomAccessFile.field_f = BoundedRandomAccessFile.field_f + var9_int;
              var5 = var5 + var9_int * 2;
              var7Lifetime1 = var7Lifetime1 + var9_int;
            }
            var8 -= 3;
            if (var5 + var7Lifetime1 > re.field_l.field_x) {
              var9_intLifetime1 = var7Lifetime1 + var5 - re.field_l.field_x;
              var5 = var5 + var9_intLifetime1 * 2;
              BoundedRandomAccessFile.field_f = BoundedRandomAccessFile.field_f + var9_intLifetime1;
              w.field_v = w.field_v - var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              re.field_l.field_w = re.field_l.field_w + var9_intLifetime1;
              re.field_l.field_x = re.field_l.field_x + var9_intLifetime1 * 2;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              ResourceArchive.field_e = ResourceArchive.field_e + var9_intLifetime2;
              re.field_l.field_y = re.field_l.field_y + var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              re.field_l.field_q = re.field_l.field_q + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
              gi.field_e = gi.field_e - var9_intLifetime2;
            }
            if (re.field_l.field_q < var8 + var6Lifetime1) {
              var9_intLifetime3 = -re.field_l.field_q + var6Lifetime1 + var8;
              var8 = var8 + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
              re.field_l.field_y = re.field_l.field_y + var9_intLifetime3;
              re.field_l.field_q = re.field_l.field_q + 2 * var9_intLifetime3;
              ResourceArchive.field_e = ResourceArchive.field_e + var9_intLifetime3;
              gi.field_e = gi.field_e - var9_intLifetime3;
            }
            re.field_l.normalizeCanvas();
            var9 = new Sprite(re.field_l.field_x, re.field_l.field_q);
            var9.bindAsRenderTarget();
            gi.field_b.drawParagraph(var14, BoundedRandomAccessFile.field_f, ResourceArchive.field_e, AccountNameAvailabilityValidator.field_k, BufferedRandomAccessFile.field_p, 16777215, -1, 1, 1, gi.field_b.field_q + gi.field_b.field_p);
            hh.a(0, 0, 3, var9.field_q, false, 1, var9, var9.field_x);
            re.field_l.bindAsRenderTarget();
            var9.draw(0, 0);
            lh.field_N = new Sprite(640, 480);
            lh.field_N.bindAsRenderTarget();
            re.field_l.drawRotated((re.field_l.field_x >> 1) + w.field_v, (re.field_l.field_q >> 1) + gi.field_e, eh.field_h, 4096);
            re.field_l = null;
            lh.field_N.trimTransparentBorders();
            SoftwareRasterizer.setRasterBuffer(var29, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(wc.field_b);
          }
          if (ArchiveRequest.field_q != null &&
            null != ah.field_d) {
            var30 = SoftwareRasterizer.field_a;
            var2Lifetime2 = SoftwareRasterizer.field_j;
            var3Lifetime2 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.saveClip(wc.field_b);
            var16 = new Sprite(412, 43);
            var17 = fb.a(jh.field_f, -115, new String[]{ArchiveRequest.field_q});
            ArchiveRequest.field_q = null;
            var16.bindAsRenderTarget();
            ah.field_d.drawParagraph(var17, 3, 3, var16.field_u - 6, var16.field_v - 6, 16777215, -1, 0, 1, ah.field_d.field_q + ah.field_d.field_p);
            hh.a(0, 0, 3, var16.field_v, false, 1, var16, var16.field_u);
            ba.field_c.bindAsRenderTarget();
            var16.draw(-ba.field_c.field_w + 199, 83 - ba.field_c.field_y);
            SoftwareRasterizer.setRasterBuffer(var30, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(wc.field_b);
          }
          if (null != SoundCache.field_e &&
            null != ah.field_d) {
            var31 = SoftwareRasterizer.field_a;
            var2Lifetime3 = SoftwareRasterizer.field_j;
            var3Lifetime3 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.saveClip(wc.field_b);
            var4 = ah.field_d.maxLineWidth(RichTextLayout.field_t, 640) + 6;
            var5Lifetime1 = 20 + (SoundCache.field_e.field_x + var4);
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = 20 + (var6Lifetime2 + SoundCache.field_e.field_x);
            ba.field_c.bindAsRenderTarget();
            ah.field_d.drawString(RichTextLayout.field_t, -ba.field_c.field_w + var7Lifetime2, ah.field_d.field_q + ah.field_d.field_p + (155 - ba.field_c.field_y), 16777215, -1);
            hh.a(-4 + (var7Lifetime2 - ba.field_c.field_w), 155 - ba.field_c.field_y, 3, 50, false, 1, ba.field_c, var4);
            var8Lifetime1 = 155 - (ba.field_c.field_y + (-ah.field_d.field_q + (SoundCache.field_e.field_q + (-3 - ah.field_d.field_p))) / 2);
            SoundCache.field_e.draw(var6Lifetime2 - ba.field_c.field_w, var8Lifetime1);
            SoftwareRasterizer.setRasterBuffer(var31, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(wc.field_b);
            SoundCache.field_e = null;
          }
          SoftwareRasterizer.saveClip(wc.field_b);
          SoftwareRasterizer.fillRoundedRectangleAlpha(16, 16, 608, 112, 15, jk.field_l, TextLineMetrics.field_i);
          SoftwareRasterizer.fillRoundedRectangleAlpha(231, 144, 393, 232, 15, jk.field_l, TextLineMetrics.field_i);
          var1_int = -21 % ((param0 - 30) / 35);
          if (DelayedPcmStream.field_k != null) {
            DelayedPcmStream.field_k.draw(0, 0);
          }
          if (null != ConfirmedEmailAvailabilityValidator.field_q) {
            ConfirmedEmailAvailabilityValidator.field_q.draw(0, 0);
          }
          ba.field_c.draw(0, 0);
          if (null != lh.field_N) {
            lh.field_N.draw(0, 0);
          }
          if (pc.field_a != null &&
            null != KeyboardInput.field_c) {
            pc.field_a.draw(231, 390);
            var2_ref_hl = re.field_f;
            if (0 == ea.field_a.field_k) {
              var2_ref_hl = jh.field_a;
            }
            var2_ref_hl.draw(0, 0);
            stackIn_48_0 = 40;
            stackIn_48_1 = Bzip2State.field_a;
            if (ea.field_a.field_k != 0) {
              stackIn_49_2 = 3;
            } else {
              stackIn_49_2 = 4;
            }
            var3Lifetime4 = (stackIn_48_0 * ti.b(stackIn_48_1 << stackIn_49_2, 2047) >> 16) + 40;
            if (var3Lifetime4 > 0) {
              pc.field_a.drawAdditive(230, 389, var3Lifetime4);
              pc.field_a.drawAdditive(232, 389, var3Lifetime4);
              pc.field_a.drawAdditive(232, 391, var3Lifetime4);
              pc.field_a.drawAdditive(230, 391, var3Lifetime4);
              var2_ref_hl.drawAdditive(1, 1, var3Lifetime4);
              var2_ref_hl.drawAdditive(-1, 1, var3Lifetime4);
              var2_ref_hl.drawAdditive(1, -1, var3Lifetime4);
              var2_ref_hl.drawAdditive(-1, -1, var3Lifetime4);
            }
            stackIn_53_0 = 112;
            stackIn_54_1 = (0 == ea.field_a.field_k);
            m.drawBenefitsButtonFrameWithIntGuard(stackIn_53_0, stackIn_54_1, TextLineMetrics.field_f, ProgressDialog.field_Z);
          }
          if (pc.field_a != null &&
            null != KeyboardInput.field_c) {
            pc.field_a.draw(434, 390);
            SpriteState.field_z.draw(0, 0);
            if (ea.field_a.field_k == 1) {
              rh.a(392, -4 + pc.field_a.field_u, 7 * pc.field_a.field_v / 12, 436, 64, true);
            }
            stackIn_61_0 = 112;
            stackIn_62_1 = (ea.field_a.field_k == 1);
            m.drawBenefitsButtonFrameWithIntGuard(stackIn_61_0, stackIn_62_1, TextFieldValidator.field_e, mf.field_d);
          }
          if (ge.field_b != null) {
            var2Lifetime4 = -(ge.field_b.field_q / 2) + 357;
            ge.field_b.draw(-ge.field_b.field_x + 269, var2Lifetime4);
            ma.field_b.draw(586, var2Lifetime4);
            if (var2Lifetime4 < la.field_c &&
              ge.field_b.field_v + var2Lifetime4 > la.field_c) {
              var3Lifetime5 = (ti.b(Bzip2State.field_a << 4, 2047) * 40 >> 16) + 40;
              if (0 < var3Lifetime5) {
                if (269 - ge.field_b.field_u < pe.field_d &&
                  pe.field_d < 269) {
                  ge.field_b.drawAdditive(-1 + (-ge.field_b.field_x + 269), var2Lifetime4 - 1, var3Lifetime5);
                  ge.field_b.drawAdditive(1 + (269 - ge.field_b.field_x), -1 + var2Lifetime4, var3Lifetime5);
                  ge.field_b.drawAdditive(-ge.field_b.field_x + 268, var2Lifetime4 + 1, var3Lifetime5);
                  ge.field_b.drawAdditive(269 - ge.field_b.field_x + 1, var2Lifetime4 + 1, var3Lifetime5);
                } else {
                  if (pe.field_d > 586 &&
                    ge.field_b.field_u + 586 > pe.field_d) {
                    ma.field_b.drawAdditive(585, var2Lifetime4 - 1, var3Lifetime5);
                    ma.field_b.drawAdditive(587, var2Lifetime4 - 1, var3Lifetime5);
                    ma.field_b.drawAdditive(585, var2Lifetime4 + 1, var3Lifetime5);
                    ma.field_b.drawAdditive(587, 1 + var2Lifetime4, var3Lifetime5);
                  }
                }
              }
            }
            RichTextWidget.e(-67);
            ValidationStatusWidget.field_I[NetworkGameClient.field_o].draw(269, 340);
          } else {
            RichTextWidget.e(-67);
            ValidationStatusWidget.field_I[NetworkGameClient.field_o].draw(269, 340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.wrapClientException((Throwable) ((Object) var1), "eb.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_g = null;
        field_b = null;
        if (!param0) {
          eb.a(-99);
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_g = "Passwords must be between 5 and 20 characters long";
        field_b = new Sprite[14];
        field_e = "ESC    Pause and Options";
        field_d = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = new ge();
    }
}
