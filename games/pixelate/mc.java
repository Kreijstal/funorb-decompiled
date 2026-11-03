/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mc extends IntrusiveNode {
    boolean field_p;
    int field_s;
    int[] field_l;
    static KeyboardInputHandler field_r;
    static String field_t;
    static String field_n;
    static int field_m;
    static PlatformTaskDispatcher field_k;
    static String field_o;
    static long field_q;

    final static Puzzle a(Random param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        rk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite[] var10 = null;
        Puzzle var11 = null;
        ib var12 = null;
        rk stackIn_3_0 = null;
        Puzzle stackIn_5_0 = null;
        Puzzle stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          UiTheme.field_f = param0;
          var12 = SecondaryNodeHashTable.a((byte) 96, param3);
          if (!param2) {
            stackIn_3_0 = GameModeCard.a(param3, 10);
          } else {
            stackIn_3_0 = AchievementsScreen.b(param3, (byte) 73);
          }
          var6 = stackIn_3_0;
          var7 = el.a(param3, (byte) -24);
          if (param4 >= -31) {
            stackIn_5_0 = (Puzzle) null;
            return stackIn_5_0;
          }
          var8 = SpriteState.a(false, param3);
          var9 = GameResultsScreen.a((byte) 124, param3);
          var10 = mi.a(var12.field_d, param1, var12.field_j, 20);
          var11 = new Puzzle(var12.field_j, var12.field_d, var7, var6.field_a, var6.field_b, var6.field_c, var9, var8, var10);
          var11.shufflePictures((byte) 58, UiTheme.field_f);
          stackIn_7_0 = var11;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void e(int param0) {
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
        Random var11 = null;
        Sprite var12 = null;
        Sprite var13 = null;
        String var15 = null;
        Sprite var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
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
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (PictureStrip.field_n != null &&
            PictureStrip.field_n.ensureIndex(-3) &&
            PictureStrip.field_n.ensureGroupAvailableByName("benefits", -1) &&
            TimerBarDemo.field_p != null &&
            TimerBarDemo.field_p.ensureIndex(param0 - 15) &&
            TimerBarDemo.field_p.ensureGroupAvailableByName("benefits", -1)) {
            EmailCredentials.field_i = bi.a("benefits", "headline", PictureStrip.field_n, (byte) -79);
            SpriteCheckboxPainter.field_a = bi.a("benefits", "blurbpane", PictureStrip.field_n, (byte) -97);
            wo.field_c = bi.a("benefits", "button", PictureStrip.field_n, (byte) -57);
            ro.field_b = bi.a("benefits", "signup_text", PictureStrip.field_n, (byte) -119);
            ResizableModalPanel.field_P = bi.a("benefits", "menu_text", PictureStrip.field_n, (byte) -20);
            AccountChoicePanel.field_O = bi.a("benefits", "button_frame", PictureStrip.field_n, (byte) -63);
            ScrollContainer.field_Kb = bi.a("benefits", "arrow", PictureStrip.field_n, (byte) -125);
            EmailConfirmationValidator.field_r = (BitmapFont) ((Object) PicturePreview.a(0, TimerBarDemo.field_p, "large_font", PictureStrip.field_n, "benefits"));
            QuickChatCategory.field_A = (BitmapFont) ((Object) PicturePreview.a(0, TimerBarDemo.field_p, "small_font", PictureStrip.field_n, "benefits"));
            var28 = SoftwareRasterizer.field_k;
            var2 = SoftwareRasterizer.field_j;
            var3 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(ClientContextMenu.field_f);
            var12 = new Sprite(4 + ScrollContainer.field_Kb.field_F, ScrollContainer.field_Kb.field_E + 4);
            var12.makeRasterTarget();
            ScrollContainer.field_Kb.c(2, 2, ug.field_k);
            MenuScreen.a(0, 0, 1, var12, var12.field_F, -1, 2, var12.field_E);
            ScrollContainer.field_Kb = var12;
            hf.field_m = ScrollContainer.field_Kb.copyFlippedHorizontal();
            var13 = new Sprite(195, 221);
            var6 = var13.field_F / 2;
            var13.makeRasterTarget();
            EmailConfirmationValidator.field_r.drawCentered(AlphaContainer.a(MusicCrossfadeStream.field_s, param0 + 24, new String[]{FallingPieceView.field_g}), var6, 40, 16777215, -1);
            QuickChatCategory.field_A.drawCentered(AlphaContainer.a(TimerBarDemo.field_n, 76, new String[]{FallingPieceView.field_g}), var6, 60, 16777215, -1);
            EmailConfirmationValidator.field_r.drawCentered(AlphaContainer.a(ab.field_d, 73, new String[]{bl.field_g}), var6, 110, 16777215, -1);
            QuickChatCategory.field_A.drawCentered(AlphaContainer.a(BoardView.field_l, 44, new String[]{bl.field_g}), var6, 130, 16777215, -1);
            EmailConfirmationValidator.field_r.drawCentered(UiComponent.field_w, var6, 180, 16777215, -1);
            QuickChatCategory.field_A.drawCentered(ri.field_d, var6, 200, 16777215, -1);
            MenuScreen.a(0, 0, 1, var13, var13.field_F, -1, 3, var13.field_E);
            SpriteCheckboxPainter.field_a.makeRasterTarget();
            var13.b(-SpriteCheckboxPainter.field_a.field_D + 18, 241 - SpriteCheckboxPainter.field_a.field_y);
            for (var7 = 0; MarkerSlider.field_S.length > var7; var7++) {
              li.field_a[var7].makeRasterTarget();
              QuickChatCategory.field_A.drawParagraph(MarkerSlider.field_S[var7], 3, 3, -6 + li.field_a[var7].field_F, li.field_a[var7].field_E - 6, ug.field_k, -1, 1, 1, QuickChatCategory.field_A.maxDescent + QuickChatCategory.field_A.maxAscent);
              MenuScreen.a(0, 0, 1, li.field_a[var7], li.field_a[var7].field_F, -1, 3, li.field_a[var7].field_E);
            }
            MarkerSlider.field_S = null;
            ph.field_n = ro.field_b.a();
            ph.field_n.makeRasterTarget();
            nh.a(SoftwareRasterizer.field_d * 2 / 3, 64, 0, 0, 126, SoftwareRasterizer.field_j);
            SoftwareRasterizer.a(var28, var2, var3);
            SoftwareRasterizer.restoreClip(ClientContextMenu.field_f);
            PictureStrip.field_n = null;
            JaggrabDownloader.field_a = (wo.field_c.field_F - AccountChoicePanel.field_O.field_F) / 2 + 434;
            DraggableWidget.field_Q = (wo.field_c.field_E - AccountChoicePanel.field_O.field_E) / 2 + 390;
            ui.field_b = (wo.field_c.field_E - AccountChoicePanel.field_O.field_E) / 2 + 390;
            AlphaContainer.field_K = 231 + (wo.field_c.field_F - AccountChoicePanel.field_O.field_F) / 2;
          }
          if (qf.field_c == null) {
            return;
          }
          if (null != FullscreenFocusCanvas.field_d &&
            null != EmailConfirmationValidator.field_r) {
            var29 = SoftwareRasterizer.field_k;
            var2Lifetime1 = SoftwareRasterizer.field_j;
            var3Lifetime1 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(ClientContextMenu.field_f);
            var15 = AlphaContainer.a(jm.field_p, 93, new String[]{wp.field_b[gb.field_c]});
            var5 = EmailConfirmationValidator.field_r.getWrappedWidth(var15, mp.field_f);
            var6Lifetime1 = EmailConfirmationValidator.field_r.paragraphHeight(var15, mp.field_f, EmailConfirmationValidator.field_r.maxAscent + EmailConfirmationValidator.field_r.maxDescent);
            var7Lifetime1 = (mp.field_f - var5) / 2 + bl.field_c;
            var5 += 6;
            var8 = (VerticalScrollbar.field_Lb - var6Lifetime1) / 2 + cl.field_d;
            var7Lifetime1 -= 3;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              var5 = var5 + var9_int * 2;
              FullscreenFocusCanvas.field_d.field_D = FullscreenFocusCanvas.field_d.field_D + var9_int;
              r.field_a = r.field_a - var9_int;
              bl.field_c = bl.field_c + var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              FullscreenFocusCanvas.field_d.field_A = FullscreenFocusCanvas.field_d.field_A + var9_int * 2;
            }
            var6Lifetime1 += 6;
            var8 -= 3;
            if (var7Lifetime1 + var5 > FullscreenFocusCanvas.field_d.field_A) {
              var9_intLifetime1 = -FullscreenFocusCanvas.field_d.field_A + (var7Lifetime1 + var5);
              bl.field_c = bl.field_c + var9_intLifetime1;
              FullscreenFocusCanvas.field_d.field_A = FullscreenFocusCanvas.field_d.field_A + 2 * var9_intLifetime1;
              FullscreenFocusCanvas.field_d.field_D = FullscreenFocusCanvas.field_d.field_D + var9_intLifetime1;
              var5 = var5 + var9_intLifetime1 * 2;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              r.field_a = r.field_a - var9_intLifetime1;
            }
            if (0 > var8) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              ImageProducerRasterBuffer.field_l = ImageProducerRasterBuffer.field_l - var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
              cl.field_d = cl.field_d + var9_intLifetime2;
              FullscreenFocusCanvas.field_d.field_y = FullscreenFocusCanvas.field_d.field_y + var9_intLifetime2;
              FullscreenFocusCanvas.field_d.field_B = FullscreenFocusCanvas.field_d.field_B + var9_intLifetime2 * 2;
            }
            if (FullscreenFocusCanvas.field_d.field_B < var8 + var6Lifetime1) {
              var9_intLifetime3 = -FullscreenFocusCanvas.field_d.field_B + var8 + var6Lifetime1;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
              cl.field_d = cl.field_d + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              FullscreenFocusCanvas.field_d.field_B = FullscreenFocusCanvas.field_d.field_B + var9_intLifetime3 * 2;
              ImageProducerRasterBuffer.field_l = ImageProducerRasterBuffer.field_l - var9_intLifetime3;
              FullscreenFocusCanvas.field_d.field_y = FullscreenFocusCanvas.field_d.field_y + var9_intLifetime3;
            }
            FullscreenFocusCanvas.field_d.normalizeCanvas();
            var9 = new Sprite(FullscreenFocusCanvas.field_d.field_A, FullscreenFocusCanvas.field_d.field_B);
            var9.makeRasterTarget();
            EmailConfirmationValidator.field_r.drawParagraph(var15, bl.field_c, cl.field_d, mp.field_f, VerticalScrollbar.field_Lb, 16777215, -1, 1, 1, EmailConfirmationValidator.field_r.maxAscent + EmailConfirmationValidator.field_r.maxDescent);
            MenuScreen.a(0, 0, 1, var9, var9.field_A, -1, 3, var9.field_B);
            FullscreenFocusCanvas.field_d.makeRasterTarget();
            var9.b(0, 0);
            ni.field_m = new Sprite(640, 480);
            ni.field_m.makeRasterTarget();
            FullscreenFocusCanvas.field_d.b((FullscreenFocusCanvas.field_d.field_A >> 1) + r.field_a, ImageProducerRasterBuffer.field_l + (FullscreenFocusCanvas.field_d.field_B >> 1), aq.field_a, 4096);
            FullscreenFocusCanvas.field_d = null;
            ni.field_m.trimTransparentBorders();
            SoftwareRasterizer.a(var29, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(ClientContextMenu.field_f);
          }
          if (IntrusiveNode.field_i != null &&
            QuickChatCategory.field_A != null) {
            var30 = SoftwareRasterizer.field_k;
            var2Lifetime2 = SoftwareRasterizer.field_j;
            var3Lifetime2 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(ClientContextMenu.field_f);
            var17 = new Sprite(412, 43);
            var5_ref_String = AlphaContainer.a(dk.field_f, param0 + 18, new String[]{IntrusiveNode.field_i});
            IntrusiveNode.field_i = null;
            var17.makeRasterTarget();
            QuickChatCategory.field_A.drawParagraph(var5_ref_String, 3, 3, var17.field_F - 6, -6 + var17.field_E, 16777215, -1, 0, 1, QuickChatCategory.field_A.maxAscent + QuickChatCategory.field_A.maxDescent);
            MenuScreen.a(0, 0, 1, var17, var17.field_F, -1, 3, var17.field_E);
            qf.field_c.makeRasterTarget();
            var17.b(199 - qf.field_c.field_D, -qf.field_c.field_y + 83);
            SoftwareRasterizer.a(var30, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(ClientContextMenu.field_f);
          }
          if (null != jf.field_a &&
            QuickChatCategory.field_A != null) {
            var31 = SoftwareRasterizer.field_k;
            var2Lifetime3 = SoftwareRasterizer.field_j;
            var3Lifetime3 = SoftwareRasterizer.field_d;
            SoftwareRasterizer.saveClip(ClientContextMenu.field_f);
            var4 = 6 + QuickChatCategory.field_A.getWrappedWidth(ri.field_i, 640);
            var5Lifetime1 = jf.field_a.field_A + var4 + 20;
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 - (-jf.field_a.field_A - 20);
            qf.field_c.makeRasterTarget();
            QuickChatCategory.field_A.drawText(ri.field_i, -qf.field_c.field_D + var7Lifetime2, 155 - qf.field_c.field_y + QuickChatCategory.field_A.maxAscent + QuickChatCategory.field_A.maxDescent, 16777215, -1);
            MenuScreen.a(-qf.field_c.field_D + (var7Lifetime2 - 4), 155 - qf.field_c.field_y, 1, qf.field_c, var4, -1, 3, 50);
            var8Lifetime1 = 155 - qf.field_c.field_y - (-QuickChatCategory.field_A.maxDescent - QuickChatCategory.field_A.maxAscent + (-3 + jf.field_a.field_B)) / 2;
            jf.field_a.b(var6Lifetime2 - qf.field_c.field_D, var8Lifetime1);
            SoftwareRasterizer.a(var31, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(ClientContextMenu.field_f);
            jf.field_a = null;
          }
          SoftwareRasterizer.saveClip(ClientContextMenu.field_f);
          SoftwareRasterizer.a(16, 16, 608, 112, 15, MusicPatchNode.field_t, gq.field_n);
          SoftwareRasterizer.a(231, 144, 393, 232, 15, MusicPatchNode.field_t, gq.field_n);
          if (EmailCredentials.field_i != null) {
            EmailCredentials.field_i.b(0, 0);
          }
          if (SpriteCheckboxPainter.field_a != null) {
            SpriteCheckboxPainter.field_a.b(0, 0);
          }
          if (param0 != 12) {
            var11 = (Random) null;
            mc.a((Random) null, 44, true, 73, 110);
          }
          qf.field_c.b(0, 0);
          if (ni.field_m != null) {
            ni.field_m.b(0, 0);
          }
          if (null != wo.field_c &&
            AccountChoicePanel.field_O != null) {
            wo.field_c.b(231, 390);
            var1 = ro.field_b;
            if (NameSuggestionsPanel.field_I.field_j == 0) {
              var1 = ph.field_n;
            }
            var1.b(0, 0);
            stackIn_51_0 = 40;
            stackIn_51_1 = qk.field_e;
            if (NameSuggestionsPanel.field_I.field_j == 0) {
              stackIn_52_2 = 4;
            } else {
              stackIn_52_2 = 3;
            }
            var2Lifetime4 = stackIn_51_0 + (GrowableIntList.b(stackIn_51_1 << stackIn_52_2, 0) * 40 >> 16);
            if (var2Lifetime4 > 0) {
              wo.field_c.drawAdditive(230, 389, var2Lifetime4);
              wo.field_c.drawAdditive(232, 389, var2Lifetime4);
              wo.field_c.drawAdditive(232, 391, var2Lifetime4);
              wo.field_c.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_57_0 = ui.field_b;
            stackIn_57_1 = AlphaContainer.field_K;
            stackIn_58_2 = (NameSuggestionsPanel.field_I.field_j == 0);
            r.a(stackIn_57_0, stackIn_57_1, stackIn_58_2, param0 ^ -44);
          }
          if (wo.field_c != null &&
            AccountChoicePanel.field_O != null) {
            wo.field_c.b(434, 390);
            ResizableModalPanel.field_P.b(0, 0);
            if (NameSuggestionsPanel.field_I.field_j == 1) {
              nh.a(wo.field_c.field_E * 7 / 12, 64, 436, 392, 121, wo.field_c.field_F - 4);
            }
            stackIn_66_0 = DraggableWidget.field_Q;
            stackIn_66_1 = JaggrabDownloader.field_a;
            stackIn_67_2 = (NameSuggestionsPanel.field_I.field_j == 1);
            r.a(stackIn_66_0, stackIn_66_1, stackIn_67_2, -40);
          }
          if (ScrollContainer.field_Kb != null) {
            var1_int = 357 - ScrollContainer.field_Kb.field_B / 2;
            ScrollContainer.field_Kb.b(-ScrollContainer.field_Kb.field_A + 269, var1_int);
            hf.field_m.b(586, var1_int);
            if (StatusBar.field_k > var1_int &&
              ScrollContainer.field_Kb.field_E + var1_int > StatusBar.field_k) {
              var2Lifetime5 = (40 * GrowableIntList.b(qk.field_e << 4, 0) >> 16) + 40;
              if (var2Lifetime5 > 0) {
                if (ProxyAuthenticationException.field_d > -ScrollContainer.field_Kb.field_F + 269 &&
                  ProxyAuthenticationException.field_d < 269) {
                  ScrollContainer.field_Kb.drawAdditive(269 - (ScrollContainer.field_Kb.field_A + 1), var1_int - 1, var2Lifetime5);
                  ScrollContainer.field_Kb.drawAdditive(269 + (-ScrollContainer.field_Kb.field_A + 1), var1_int - 1, var2Lifetime5);
                  ScrollContainer.field_Kb.drawAdditive(268 - ScrollContainer.field_Kb.field_A, var1_int + 1, var2Lifetime5);
                  ScrollContainer.field_Kb.drawAdditive(1 + (-ScrollContainer.field_Kb.field_A + 269), 1 + var1_int, var2Lifetime5);
                } else {
                  if (ProxyAuthenticationException.field_d > 586) {
                    if (ScrollContainer.field_Kb.field_F + 586 <= ProxyAuthenticationException.field_d) {
                      CachedTextLayout.e(param0 - 19320);
                      li.field_a[Vector3.field_b].b(269, 340);
                      return;
                    }
                    hf.field_m.drawAdditive(585, -1 + var1_int, var2Lifetime5);
                    hf.field_m.drawAdditive(587, -1 + var1_int, var2Lifetime5);
                    hf.field_m.drawAdditive(585, 1 + var1_int, var2Lifetime5);
                    hf.field_m.drawAdditive(587, var1_int + 1, var2Lifetime5);
                  }
                }
              }
            }
          }
          CachedTextLayout.e(param0 - 19320);
          li.field_a[Vector3.field_b].b(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1_ref), "mc.D(" + param0 + ')');
        }
    }

    final static PcmSampleStream a(int param0, int param1) {
        ln var2 = null;
        if (SoundCache.field_b.i(0) < 5) {
          if (param1 >= -117) {
            mc.a(17, -35);
          }
          var2 = new ln(param0);
          SoundCache.field_b.addFirst(22125, var2);
          return var2.field_o;
        }
        return null;
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        if (param0 != -1) {
          field_n = (String) null;
        }
        field_o = null;
        field_r = null;
        field_t = null;
        field_n = null;
    }

    mc() {
        this.field_p = false;
    }

    static {
        field_r = new KeyboardInputHandler();
        field_t = "Please enter your age in years";
        field_n = "Private";
        field_o = "Updates will sent to the email address you've given";
        field_m = 0;
    }
}
