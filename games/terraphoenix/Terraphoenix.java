/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Terraphoenix extends GameShell {
    boolean field_J;
    private int field_pb;
    static int field_O;
    int field_vb;
    int field_Fb;
    int field_jb;
    boolean field_Y;
    private IndexedSprite field_U;
    int field_D;
    boolean field_fb;
    private int field_P;
    private IndexedSprite field_T;
    private int field_xb;
    private BattleState field_X;
    private Sprite[] field_ab;
    private int field_cb;
    int field_Bb;
    private boolean field_Gb;
    private ol field_S;
    private IndexedSprite field_sb;
    private String field_bb;
    String[] field_Eb;
    boolean field_yb;
    private int field_kb;
    boolean field_db;
    private int field_W;
    private int field_K;
    int field_M;
    private int field_R;
    private ol field_F;
    int field_eb;
    private LevelEditor field_Cb;
    private int field_mb;
    private vl field_N;
    rk field_I;
    TutorialController field_wb;
    private Sprite field_Q;
    boolean field_H;
    boolean field_E;
    int field_rb;
    private int field_tb;
    private boolean field_Db;
    boolean field_ob;
    int field_ub;
    int field_qb;
    int field_gb;
    private int field_Z;
    private int field_ib;
    private ch field_zb;
    boolean field_Ab;
    int field_hb;
    int field_G;
    ga[] field_nb;
    private Sprite field_lb;
    public static int field_V;

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        try {
          SoftwareRasterizer.drawRectangleOutline(param1 - 3, -3 + param3, param4 + 6, 6 + param2, 10066329);
          SoftwareRasterizer.drawRectangleOutline(param1 - 2, param3 - 2, 4 + param4, 4 + param2, param0);
          SoftwareRasterizer.drawRectangleOutline(-1 + param1, -1 + param3, 2 + param4, param2 + 2, 6645093);
          SoftwareRasterizer.fillRectangle(param1, param3, param4, param2, 0);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void m(byte param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_27_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_272_0 = 0;
        BinaryBitmapFont stackIn_272_1 = null;
        StringBuilder stackIn_272_2 = null;
        boolean stackIn_273_3 = false;
        int stackIn_276_4;
        boolean stackIn_277_5 = false;
        int stackIn_296_0 = 0;
        boolean stackIn_297_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        g var3_ref_g = null;
        int var4 = 0;
        g var4_ref_g = null;
        g var5 = null;
        int var5_int = 0;
        Sprite var6 = null;
        int var6_int = 0;
        Sprite var7 = null;
        int var8 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var6_intLifetime1;
        int var3Lifetime4;
        int var4Lifetime3;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var5_intLifetime1Lifetime1;
        int var6_intLifetime1Lifetime1;
        var8 = field_V;
        try {
          nd.field_k = nd.field_k + 1;
          oh.field_e = oh.field_e + 1;
          if (50 < nd.field_k) {
            nd.field_k = 0;
          }
          ArchiveIndex.field_e = ArchiveIndex.field_e + bh.field_a;
          if (oh.field_f != 0) {
            ArchiveIndex.field_e = ArchiveIndex.field_e + (oh.field_e + ef.field_j);
            bh.field_a = bh.field_a + 1;
            oe.field_c = oe.field_c + ef.field_j;
          }
          if (a.field_b != null &&
            a.field_b.field_d) {
            ga.b((byte) 20);
          }
          if (null != ga.field_k.beginBackward(9272)) {
            fieldTemp$0 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$0 == 335) {
              this.field_R = 0;
              ga.field_k.removeLast((byte) 57);
            }
          }
          if (!uk.field_b.hasMidiData(-112)) {
            stackIn_26_0 = false;
            if (ja.field_i == 0) {
              stackIn_27_1 = 7;
            } else {
              stackIn_27_1 = 0;
            }
            DraggableWidgetContainer.a(stackIn_26_0, stackIn_27_1);
          }
          var2_int = 87 % ((param0 + 26) / 41);
          if (null != this.field_Cb) {
            this.C(0);
            return;
          }
          if (TextLayout.field_b) {
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!DefaultTextWidgetRenderer.d(1)))) {
              stackIn_70_0 = ~ProxyAuthenticationRequiredException.field_g;
              if (var8 == 0) {
                if (stackIn_70_0 <= -10) {
                  continue;
                }
                if (lf.field_c == 84 ||
                  lf.field_c == 13) {
                  ProxyAuthenticationRequiredException.field_g = 20;
                  TextLayout.field_b = false;
                  MusicPatch.playIndexedSoundEffectWithIntGuard(79, 34);
                }
                if (lf.field_c == 97 ||
                  lf.field_c == 99) {
                  MusicPatch.playIndexedSoundEffectWithIntGuard(53, 24);
                  ProxyAuthenticationRequiredException.field_g = 20;
                  ea.field_o = ea.field_o + 1;
                  if (ea.field_o >= gh.g(-118)) {
                    ea.field_o = ea.field_o - gh.g(-125);
                  }
                }
                if (lf.field_c != 96 &&
                  lf.field_c != 98) {
                  continue;
                }
                MusicPatch.playIndexedSoundEffectWithIntGuard(68, 25);
                ProxyAuthenticationRequiredException.field_g = 20;
                ea.field_o = ea.field_o - 1;
                if (0 <= ea.field_o) {
                  continue;
                }
                ea.field_o = ea.field_o + gh.g(-128);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_70_0 = 29;
            }
            var5_int = stackIn_70_0;
            var4 = 446;
            var3 = 484;
            var6_int = 29;
            if (var3 <= ef.field_j &&
              var4 <= MouseWheelInput.field_b &&
              (var3 + var5_int) >= ef.field_j &&
              MouseWheelInput.field_b <= var4 + var6_int &&
              1 == DiskArchiveRequest.field_I &&
              ProxyAuthenticationRequiredException.field_g < 10) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(48, 24);
              ProxyAuthenticationRequiredException.field_g = 20;
              ea.field_o = ea.field_o + 1;
              if (ea.field_o >= gh.g(-123)) {
                ea.field_o = ea.field_o - gh.g(-125);
              }
            }
            if (ArchiveRequest.field_B[7].field_d) {
              var3Lifetime4 = 127;
              var4Lifetime3 = 447;
              var5_intLifetime1 = 29;
              var6_intLifetime1 = 29;
              if (var3Lifetime4 <= ef.field_j &&
                var4Lifetime3 <= MouseWheelInput.field_b &&
                ef.field_j <= (var5_intLifetime1 + var3Lifetime4) &&
                (var6_intLifetime1 + var4Lifetime3) >= MouseWheelInput.field_b &&
                1 == DiskArchiveRequest.field_I &&
                ProxyAuthenticationRequiredException.field_g < 10) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(94, 25);
                ProxyAuthenticationRequiredException.field_g = 20;
                ea.field_o = ea.field_o - 1;
                if (ea.field_o < 0) {
                  ea.field_o = ea.field_o + gh.g(-124);
                }
              }
              var5_intLifetime1Lifetime1 = 101;
              var6_intLifetime1Lifetime1 = 29;
              var3Lifetime4 = 531;
              var4Lifetime3 = 446;
              if (ef.field_j >= var3Lifetime4 &&
                MouseWheelInput.field_b >= var4Lifetime3 &&
                (var3Lifetime4 + var5_intLifetime1Lifetime1) >= ef.field_j &&
                MouseWheelInput.field_b <= var6_intLifetime1Lifetime1 + var4Lifetime3 &&
                DiskArchiveRequest.field_I == 1) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(26, 34);
                ProxyAuthenticationRequiredException.field_g = 20;
                TextLayout.field_b = false;
              }
            }
            if (oh.field_f == 2) {
              TextLayout.field_b = false;
              ProxyAuthenticationRequiredException.field_g = 20;
              MusicPatch.playIndexedSoundEffectWithIntGuard(53, 34);
            }
            return;
          }
          mm.field_f = mm.field_f + 0.1;
          if (6.28 < mm.field_f) {
            mm.field_f = mm.field_f - 6.28;
          }
          if (ja.field_i == 12) {
            this.k((byte) 120);
            return;
          }
          if (this.field_W < 480) {
            this.field_W = this.field_W + 8;
          }
          if (this.field_wb != null) {
            this.field_wb.field_c = MouseWheelInput.field_b;
            this.field_wb.field_g = ef.field_j;
            this.field_wb.field_z = DiskArchiveRequest.field_I;
          }
          if (this.field_N != null) {
            this.field_N = this.field_N.a(this, 11803);
            if (null != this.field_N &&
              !this.field_N.field_b &&
              this.field_N.field_f < 0) {
              if (this.field_zb != null &&
                this.field_zb.field_a) {
                this.field_zb = this.field_zb.a((byte) -29, this);
              }
              return;
            }
          }
          if (null != this.field_zb) {
            this.field_zb = this.field_zb.a((byte) -29, this);
            if (this.field_zb != null &&
              !this.field_zb.field_a &&
              this.field_zb.field_i < 0) {
              return;
            }
          }
          if (this.field_wb != null &&
            !this.field_wb.b(0)) {
            return;
          }
          boolean decompiledFrameRemainder2 = true;
          if (15 == ja.field_i) {
            nb.a(0);
            ja.field_i = 16;
            decompiledFrameRemainder2 = (var8 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (16 == ja.field_i)) {
            boolean decompiledSharedTail3 = !(bk.c(-25704));
            if (!decompiledSharedTail3) {
              ja.field_i = nb.field_g;
              decompiledSharedTail3 = (var8 != 0);
            }
            if (decompiledSharedTail3) {
              GuestPlayConfirmationForm.field_K = hf.a(4, (byte) 49);
              ja.field_i = wj.field_a;
              if (ja.field_i == 16) {
                ja.field_i = 10;
                ProxyAuthenticationRequiredException.field_g = 20;
                if (0 == ge.field_e) {
                  ja.field_i = 0;
                }
                if (TutorialText.field_a > 0) {
                  ja.field_i = 11;
                }
                this.b(false, ge.field_e);
              }
            }
          }
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          regionExit1: {
            boolean decompiledFrameRemainder1 = true;
            var3Lifetime1 = ja.field_i;
            if (var3Lifetime1 != 14) {
              if (var3Lifetime1 == 13) {
                break regionExit1;
              }
              decompiledFrameRemainder3 = (9 != var3Lifetime1 ||
                var8 != 0);
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder4 = (0 != var3Lifetime1))) {
                if (var3Lifetime1 == 12) {
                  return;
                }
                decompiledFrameRemainder5 = (var3Lifetime1 != 1);
                if ((decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder6 = (var3Lifetime1 != 2 ||
                  var8 != 0)) &&
                  (decompiledFrameRemainder7 = (var3Lifetime1 != 3)) &&
                  (decompiledFrameRemainder8 = (var3Lifetime1 != 4)) &&
                  (decompiledFrameRemainder9 = (5 != var3Lifetime1)) &&
                  (decompiledFrameRemainder10 = (6 != var3Lifetime1)) &&
                  (decompiledFrameRemainder11 = (7 != var3Lifetime1)) &&
                  (decompiledFrameRemainder12 = (var3Lifetime1 != 8 ||
                  var8 != 0))) {
                  if (10 == var3Lifetime1 &&
                    var8 == 0) {
                    if (bh.field_e[13]) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(25, 34);
                      ja.field_i = 0;
                      ProxyAuthenticationRequiredException.field_g = 20;
                      if (!se.field_h) {
                        this.n(16777215);
                      }
                      GameShell.field_y = null;
                    }
                    if (DiskArchiveRequest.field_I == 1 &&
                      bk.c(-25704)) {
                      var3Lifetime1 = FrameTimer.field_f.stringWidth(FullscreenFocusCanvas.field_c);
                      if ((320 - var3Lifetime1 / 2) <= ef.field_j &&
                        ef.field_j <= var3Lifetime1 / 2 + 320 &&
                        MouseWheelInput.field_b >= 280 &&
                        (280 + FrameTimer.field_f.field_s) >= MouseWheelInput.field_b) {
                        MusicPatch.playIndexedSoundEffectWithIntGuard(86, 33);
                        WidgetContainer.a(10, -25786, 10);
                      }
                    }
                    if (1 == DiskArchiveRequest.field_I) {
                      var3Lifetime1 = 320;
                      if (var3Lifetime1 - qh.field_b.field_r / 2 <= ef.field_j &&
                        ef.field_j <= (var3Lifetime1 + qh.field_b.field_r / 2) &&
                        (476 - qh.field_b.field_t) <= MouseWheelInput.field_b &&
                        MouseWheelInput.field_b <= 476 &&
                        1 == oh.field_f) {
                        MusicPatch.playIndexedSoundEffectWithIntGuard(102, 34);
                        ProxyAuthenticationRequiredException.field_g = 20;
                        ja.field_i = 0;
                        GameShell.field_y = null;
                      }
                    }
                    if (ProxyAuthenticationRequiredException.field_g != 0) {
                      return;
                    }
                    if (bh.field_e[84]) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(87, 34);
                      ProxyAuthenticationRequiredException.field_g = 20;
                      ja.field_i = 0;
                      if (!se.field_h) {
                        this.n(16777215);
                      }
                      GameShell.field_y = null;
                    }
                    if (bh.field_e[96] &&
                      DiskArchiveRequest.field_J > 0) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(22, 33);
                      DiskArchiveRequest.field_J = DiskArchiveRequest.field_J - 1;
                      ProxyAuthenticationRequiredException.field_g = 10;
                    }
                    if (!bh.field_e[97]) {
                      return;
                    }
                    if (DiskArchiveRequest.field_J >= 2) {
                      return;
                    }
                    MusicPatch.playIndexedSoundEffectWithIntGuard(114, 33);
                    ProxyAuthenticationRequiredException.field_g = 10;
                    DiskArchiveRequest.field_J = DiskArchiveRequest.field_J + 1;
                    return;
                  } else {
                    if (var3Lifetime1 != 11) {
                      return;
                    }
                    decompiledFrameRemainder1 = (var8 == 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (DiskArchiveRequest.field_I == 1) {
                      if (ab.field_i != -1) {
                        if (~ab.field_i != ~wf.field_t) {
                          wf.field_t = ab.field_i;
                        } else {
                          wf.field_t = -1;
                        }
                      }
                      if (-1 == wf.field_t &&
                        bk.c(-25704)) {
                        var3Lifetime1 = FrameTimer.field_f.stringWidth(FullscreenFocusCanvas.field_c);
                        if (ef.field_j >= (-(var3Lifetime1 / 2) + 320) &&
                          (var3Lifetime1 / 2 + 320) >= ef.field_j &&
                          MouseWheelInput.field_b >= 240 &&
                          MouseWheelInput.field_b <= 240 + FrameTimer.field_f.field_s) {
                          MusicPatch.playIndexedSoundEffectWithIntGuard(98, 33);
                          WidgetContainer.a(11, -25786, 11);
                        }
                      }
                      var3Lifetime1 = 320;
                      if ((var3Lifetime1 - qh.field_b.field_r / 2) <= ef.field_j &&
                        ef.field_j <= (var3Lifetime1 + qh.field_b.field_r / 2) &&
                        MouseWheelInput.field_b >= (-qh.field_b.field_t + 476) &&
                        MouseWheelInput.field_b <= 476) {
                        MusicPatch.playIndexedSoundEffectWithIntGuard(87, 34);
                        ProxyAuthenticationRequiredException.field_g = 20;
                        ja.field_i = 0;
                        GameShell.field_y = null;
                        if (!se.field_h) {
                          this.n(16777215);
                        }
                        if (0 < TutorialText.field_a) {
                          TutorialText.field_a = 0;
                          ja.field_i = 10;
                        }
                      }
                    }
                    if (!bh.field_e[13]) {
                      if (!bh.field_e[84]) {
                        return;
                      }
                      if (ProxyAuthenticationRequiredException.field_g != 0) {
                        return;
                      }
                    }
                    MusicPatch.playIndexedSoundEffectWithIntGuard(54, 34);
                    ja.field_i = 0;
                    ProxyAuthenticationRequiredException.field_g = 20;
                    if (!se.field_h) {
                      this.n(16777215);
                    }
                    if (0 >= TutorialText.field_a) {
                      return;
                    }
                    TutorialText.field_a = 0;
                    ja.field_i = 10;
                    return;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder12) &&
              (decompiledFrameRemainder11) &&
              (decompiledFrameRemainder10) &&
              (decompiledFrameRemainder9) &&
              (decompiledFrameRemainder8) &&
              (decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              var3Lifetime1 = 100;
              stackIn_272_0 = var3Lifetime1;
              stackIn_272_1 = AccountRequestState.field_f;
              stackIn_272_2 = new StringBuilder().append(FullscreenNoticeType.field_a).append("<br><br>");
              stackIn_273_3 = (ge.field_e != 0);
              stackIn_276_4 = 98;
              stackIn_277_5 = (TutorialText.field_a != 0);
              var3Lifetime1 = stackIn_272_0 + ((BinaryBitmapFont) (Object) stackIn_272_1).lineCount(((StringBuilder) (Object) stackIn_272_2).append(oe.getSaveResultsLoginPromptWithIntGuard(stackIn_273_3, stackIn_276_4, stackIn_277_5, false)).toString(), 310) * 14;
              var3Lifetime1 += 24;
              if (this.a(false, 224, (byte) -44, var3Lifetime1, FullscreenFocusCanvas.field_c) &&
                1 == DiskArchiveRequest.field_I) {
                WidgetContainer.a(14, -25786, 16);
              }
              var3Lifetime1 += 80;
              var3Lifetime1 += 24;
              if (this.a(false, 224, (byte) -44, var3Lifetime1, vf.field_b) &&
                DiskArchiveRequest.field_I == 1) {
                oe.field_c = oe.field_c - ge.field_e;
                TutorialText.field_a = 0;
                ge.field_e = 0;
                DisplayNameSelectionPanel.field_H = 0;
                ja.field_i = 13;
                ll.a((byte) 49, true);
              }
              if (var8 == 0) {
                return;
              }
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            stackIn_296_0 = -102;
            stackIn_297_1 = !(FullscreenNoticeType.a(true));
            var3Lifetime1 = ResizableModalDialog.updateMembershipSlidesWithIntGuard(stackIn_296_0, stackIn_297_1);
            if (var3Lifetime1 == 3) {
              NodeHashTableIterator.openSubscriptionPage((byte) -110, dg.a(false));
            }
            if (var3Lifetime1 == 1) {
              this.field_xb = 0;
              ja.field_i = 0;
              se.field_h = true;
            }
            if (var3Lifetime1 == 2) {
              se.field_h = true;
              ja.field_i = 0;
              this.field_xb = -1;
            }
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            ja.field_i = 8;
            ConfirmedEmailAvailabilityValidator.field_q = 0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.w(117);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.p(113);
            this.q((byte) -80);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            if (this.field_X == null) {
              this.field_pb = this.field_pb + 1;
              this.field_X = new BattleState(this);
            }
            while (true) {
              if (DefaultTextWidgetRenderer.d(1)) {
                if (lf.field_c != 13) {
                  continue;
                }
                if (this.field_Bb != 0 &&
                  this.field_Bb != 13) {
                  ProxyAuthenticationRequiredException.field_g = 20;
                  if (null != this.field_X) {
                    this.field_X = null;
                    this.field_pb = this.field_pb - 1;
                  }
                  ja.field_i = 1;
                }
                if (this.field_Bb != 0) {
                  continue;
                }
                ja.field_i = 0;
                this.field_Gb = false;
                ProxyAuthenticationRequiredException.field_g = 20;
                se.field_h = true;
                if (var8 == 0) {
                  continue;
                }
              } else {
                if (this.field_F != null) {
                  this.field_F.a(-85, true);
                  var3Lifetime1Lifetime1 = 12;
                  if (this.field_F.e((byte) -85) ||
                    bh.field_e[98]) {
                    gi.field_h = gi.field_h - var3Lifetime1Lifetime1;
                  }
                  var4Lifetime1 = 64;
                  if (this.field_F.d((byte) -113) ||
                    bh.field_e[99]) {
                    gi.field_h = gi.field_h + var3Lifetime1Lifetime1;
                  }
                  if (0 != RichTextWidget.field_P) {
                    gi.field_h = gi.field_h + var3Lifetime1Lifetime1 * RichTextWidget.field_P;
                  }
                  if (this.field_F.e(-1) ||
                    bh.field_e[102] ||
                    bh.field_e[104]) {
                    gi.field_h = gi.field_h - var4Lifetime1;
                  }
                  if (this.field_F.f((byte) -128) ||
                    bh.field_e[103] ||
                    bh.field_e[105]) {
                    gi.field_h = gi.field_h + var4Lifetime1;
                  }
                  if (gi.field_h > bc.field_a - EditableTextField.field_V) {
                    gi.field_h = -EditableTextField.field_V + bc.field_a;
                  }
                  if (gi.field_h < 0) {
                    gi.field_h = 0;
                  }
                  if (this.field_F.f(-1)) {
                    gi.field_h = this.field_F.a(-123, bc.field_a, EditableTextField.field_V);
                  }
                  this.field_F.a((byte) 88, EditableTextField.field_V, gi.field_h, bc.field_a);
                }
              }
              break;
            }
            if ((this.field_Bb != 0 ||
              Archive.field_a == 1 &&
              !(0 < (ef.field_i & 512))) && 13 != this.field_Bb) {
              if (ef.field_j >= 64 &&
                256 >= ef.field_j &&
                MouseWheelInput.field_b >= 340 &&
                MouseWheelInput.field_b <= 390) {
                this.field_Eb = new String[1];
                this.field_Eb[0] = va.field_f;
                if (0 == this.field_Bb) {
                  this.field_Eb[0] = g.field_qb;
                }
                if (DiskArchiveRequest.field_I == 1) {
                  ProxyAuthenticationRequiredException.field_g = 20;
                  ja.field_i = 1;
                  if (this.field_X != null) {
                    this.field_pb = this.field_pb - 1;
                    this.field_X = null;
                  }
                  if (this.field_Bb == 0) {
                    ja.field_i = 0;
                    this.field_Gb = false;
                  }
                }
              }
              if (384 > ef.field_j) {
                return;
              }
              if (ef.field_j > 576) {
                return;
              }
              if (MouseWheelInput.field_b < 340) {
                return;
              }
              if (MouseWheelInput.field_b > 390) {
                return;
              }
              this.field_Eb = new String[1];
              this.field_Eb[0] = od.field_f;
              if (DiskArchiveRequest.field_I != 1) {
                return;
              }
              MusicPatch.playIndexedSoundEffectWithIntGuard(92, 33);
              ProxyAuthenticationRequiredException.field_g = 20;
              ja.field_i = 5;
              DraggableWidgetContainer.a(false, this.field_X.field_i);
              var3Lifetime1Lifetime2 = 0;
              while (var3Lifetime1Lifetime2 < 12) {
                if (var8 != 0) {
                  return;
                }
                if (null != this.field_nb[var3Lifetime1Lifetime2]) {
                  if (this.field_nb[var3Lifetime1Lifetime2].field_b != null &&
                    5 < this.field_nb[var3Lifetime1Lifetime2].field_b.field_g &&
                    18 > this.field_nb[var3Lifetime1Lifetime2].field_b.field_g) {
                    this.field_fb = false;
                  }
                  if (null != this.field_nb[var3Lifetime1Lifetime2].field_A &&
                    this.field_nb[var3Lifetime1Lifetime2].field_A.field_g > 5 &&
                    18 > this.field_nb[var3Lifetime1Lifetime2].field_A.field_g) {
                    this.field_fb = false;
                  }
                  if (null != this.field_nb[var3Lifetime1Lifetime2].field_i &&
                    this.field_nb[var3Lifetime1Lifetime2].field_i.field_g == 11) {
                    this.field_fb = false;
                  }
                  if (this.field_nb[var3Lifetime1Lifetime2].field_m != null &&
                    this.field_nb[var3Lifetime1Lifetime2].field_m.field_f > 1) {
                    this.field_fb = false;
                  }
                }
                var3Lifetime1Lifetime2++;
              }
              if (var8 == 0) {
                return;
              }
            }
            if (224 > ef.field_j) {
              return;
            }
            if (ef.field_j > 416) {
              return;
            }
            if (MouseWheelInput.field_b < 340) {
              return;
            }
            if (MouseWheelInput.field_b > 390) {
              return;
            }
            this.field_Eb = new String[1];
            this.field_Eb[0] = od.field_f;
            if (DiskArchiveRequest.field_I != 1) {
              return;
            }
            MusicPatch.playIndexedSoundEffectWithIntGuard(63, 33);
            ja.field_i = 5;
            ProxyAuthenticationRequiredException.field_g = 20;
            DraggableWidgetContainer.a(false, this.field_X.field_i);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            if (this.field_zb.field_a) {
              return;
            }
            this.p((byte) -124);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            if (this.field_N.field_b) {
              return;
            }
            this.y(90);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10)) {
            this.A(255);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11)) {
            this.field_xb = -1;
            this.r((byte) 126);
            if (var8 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder12) {
            this.field_xb = -1;
            this.e(true);
            if (var8 == 0) {
              return;
            }
          }
          if (0 == ConfirmedEmailAvailabilityValidator.field_q) {
            if (gd.field_c == 0) {
              this.field_bb = jh.field_l[0];
            }
            if (1 == gd.field_c) {
              this.field_bb = jh.field_l[1];
            }
            if (gd.field_c == 2) {
              this.field_bb = jh.field_l[2];
            }
            if (gd.field_c == 3) {
              this.field_bb = jh.field_l[3];
            }
            if (gd.field_c == 4) {
              this.field_bb = jh.field_l[4];
            }
          }
          if (1 == ConfirmedEmailAvailabilityValidator.field_q) {
            boolean decompiledSharedTail2 = !(0 >= me.field_o);
            if (!decompiledSharedTail2) {
              this.field_bb = jh.field_l[9];
              decompiledSharedTail2 = (var8 != 0);
            }
            if (decompiledSharedTail2) {
              if (gd.field_c == 0) {
                this.field_bb = jh.field_l[5];
              }
              if (1 == gd.field_c) {
                this.field_bb = jh.field_l[6];
              }
              if (gd.field_c == 2) {
                this.field_bb = jh.field_l[7];
              }
              if (gd.field_c == 3) {
                this.field_bb = jh.field_l[8];
              }
            }
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
            if (gd.field_c == 0) {
              this.field_bb = jh.field_l[10];
            }
            if (gd.field_c == 1) {
              this.field_bb = jh.field_l[11];
            }
          }
          if (3 == ConfirmedEmailAvailabilityValidator.field_q) {
            if (gd.field_c == 0) {
              this.field_bb = jh.field_l[12];
            }
            if (gd.field_c == 1) {
              this.field_bb = jh.field_l[13];
            }
            if (gd.field_c == 2) {
              this.field_bb = jh.field_l[14];
            }
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 4) {
            if (0 == gd.field_c &&
              500 > this.field_mb) {
              this.field_mb = 500;
            }
            this.field_bb = "";
            if (gd.field_c == 1) {
              this.field_mb = this.field_mb + 1;
              if (this.field_mb < 500 &&
                this.field_mb > 256) {
                this.field_mb = 500;
              }
            }
            if (gd.field_c == 3) {
              this.field_bb = jh.field_l[15];
            }
            if (gd.field_c == 2) {
            }
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == -1) {
            this.field_bb = jh.field_l[16];
          }
          if (-2 == ConfirmedEmailAvailabilityValidator.field_q) {
            this.field_bb = jh.field_l[17];
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == -3) {
            this.field_bb = jh.field_l[18];
          }
          if (-4 == ConfirmedEmailAvailabilityValidator.field_q) {
            this.field_bb = jh.field_l[19];
          }
          PcmPlayerPump.field_h = 8 + 16 * AccountRequestState.field_f.lineCount(this.field_bb, 484);
          if (ProxyAuthenticationRequiredException.field_f < PcmPlayerPump.field_h) {
            PcmPlayerPump.field_h = 8 + 16 * AccountRequestState.field_f.lineCount(this.field_bb, 475);
          }
          if (this.field_S != null &&
            ProxyAuthenticationRequiredException.field_f >= PcmPlayerPump.field_h) {
            this.field_S = null;
          }
          if (null == this.field_S &&
            ProxyAuthenticationRequiredException.field_f < PcmPlayerPump.field_h) {
            ByteArrayPoolSupport.field_a = 0;
            var3_ref_g = new g(0L, (g) null);
            var3_ref_g.field_X = SingleChildWidgetContainer.field_G;
            var4_ref_g = new g(0L, (g) null);
            var4_ref_g.field_X = sl.field_b;
            var5 = new g(0L, (g) null);
            var5.field_V = sj.field_e;
            var5.field_X = SingleChildWidgetContainer.field_G;
            var5.field_eb = sj.field_e;
            var6 = sl.field_b[4];
            var7 = sj.field_e[4];
            this.field_S = new ol(0L, var3_ref_g, var6, var7, var4_ref_g, var5);
            this.field_S.a(416, ByteArrayPoolSupport.field_a, 11, PcmPlayerPump.field_h, -689, 511, ProxyAuthenticationRequiredException.field_f, ProxyAuthenticationRequiredException.field_f);
          }
          if (this.field_S != null) {
            PcmPlayerPump.field_h = 16 * AccountRequestState.field_f.lineCount(this.field_bb.substring(0, this.field_cb), 475) + 8;
            this.field_S.a(-92, true);
            var3Lifetime2 = 12;
            if (this.field_S.e((byte) -96) ||
              bh.field_e[98]) {
              ByteArrayPoolSupport.field_a = ByteArrayPoolSupport.field_a - var3Lifetime2;
            }
            var4Lifetime2 = 64;
            if (this.field_S.d((byte) 16) ||
              bh.field_e[99]) {
              ByteArrayPoolSupport.field_a = ByteArrayPoolSupport.field_a + var3Lifetime2;
            }
            if (RichTextWidget.field_P != 0) {
              ByteArrayPoolSupport.field_a = ByteArrayPoolSupport.field_a + var3Lifetime2 * RichTextWidget.field_P;
            }
            if (this.field_S.e(-1) ||
              bh.field_e[102] ||
              bh.field_e[104]) {
              ByteArrayPoolSupport.field_a = ByteArrayPoolSupport.field_a - var4Lifetime2;
            }
            if (this.field_S.f((byte) -121) ||
              bh.field_e[103] ||
              bh.field_e[105]) {
              ByteArrayPoolSupport.field_a = ByteArrayPoolSupport.field_a + var4Lifetime2;
            }
            if (ByteArrayPoolSupport.field_a > -ProxyAuthenticationRequiredException.field_f + PcmPlayerPump.field_h) {
              ByteArrayPoolSupport.field_a = PcmPlayerPump.field_h - ProxyAuthenticationRequiredException.field_f;
            }
            if (ByteArrayPoolSupport.field_a < 0) {
              ByteArrayPoolSupport.field_a = 0;
            }
            if (this.field_S.f(-1)) {
              ByteArrayPoolSupport.field_a = this.field_S.a(74, PcmPlayerPump.field_h, ProxyAuthenticationRequiredException.field_f);
            }
            this.field_S.a((byte) 79, ProxyAuthenticationRequiredException.field_f, ByteArrayPoolSupport.field_a, PcmPlayerPump.field_h);
          }
          if (this.field_ib < 256) {
            this.field_ib = this.field_ib + 1;
          }
          if (500 > this.field_mb) {
            this.field_mb = this.field_mb + 1;
          }
          if (this.field_cb < this.field_bb.length()) {
            var3Lifetime3 = 2;
            if (this.field_cb > 0) {
              if (this.field_bb.charAt(-1 + this.field_cb) == 44) {
                var3Lifetime3 = 25;
              }
              if (this.field_bb.charAt(-1 + this.field_cb) == 59) {
                var3Lifetime3 = 30;
              }
              if (this.field_bb.charAt(this.field_cb - 1) == 58) {
                var3Lifetime3 = 40;
              }
              if (this.field_bb.charAt(-1 + this.field_cb) == 46) {
                var3Lifetime3 = 50;
              }
              if (this.field_bb.charAt(this.field_cb - 1) == 33) {
                var3Lifetime3 = 50;
              }
            }
            if (var3Lifetime3 < this.field_mb) {
              this.field_cb = this.field_cb + 1;
              this.field_mb = 0;
              if (PcmPlayerPump.field_h - ProxyAuthenticationRequiredException.field_f <= ByteArrayPoolSupport.field_a) {
                PcmPlayerPump.field_h = AccountRequestState.field_f.lineCount(this.field_bb.substring(0, this.field_cb), 475) * 16 + 8;
                ByteArrayPoolSupport.field_a = -ProxyAuthenticationRequiredException.field_f + PcmPlayerPump.field_h;
                if (0 > ByteArrayPoolSupport.field_a) {
                  ByteArrayPoolSupport.field_a = 0;
                }
              }
              if (this.field_bb.charAt(this.field_cb - 1) != 32) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(123, 22);
              }
            }
          }
          if (DiskArchiveRequest.field_I != 0) {
            if (532 <= ef.field_j &&
              (488 - PcmResampler.field_g.field_t) <= MouseWheelInput.field_b &&
              632 > ef.field_j &&
              MouseWheelInput.field_b < (516 - PcmResampler.field_g.field_t)) {
              boolean decompiledSharedTail1 = !(this.field_cb < this.field_bb.length());
              if (!decompiledSharedTail1) {
                this.field_mb = this.field_mb - (this.field_bb.length() - this.field_cb) * 5;
                this.field_cb = this.field_bb.length();
                this.field_ib = 256;
                MusicPatch.playIndexedSoundEffectWithIntGuard(55, 33);
                decompiledSharedTail1 = (var8 != 0);
              }
              if ((decompiledSharedTail1) &&
                (500 > this.field_mb)) {
                this.field_mb = 500;
                MusicPatch.playIndexedSoundEffectWithIntGuard(19, 33);
              }
            }
            if (ef.field_j >= 532 &&
              MouseWheelInput.field_b >= (520 - PcmResampler.field_g.field_t) &&
              ef.field_j < 632 &&
              (548 - PcmResampler.field_g.field_t) > MouseWheelInput.field_b) {
              this.field_mb = 500;
              gd.field_c = 10;
              MusicPatch.playIndexedSoundEffectWithIntGuard(64, 33);
            }
          }
          if (500 <= this.field_mb) {
            boolean decompiledSharedTail0 = (ConfirmedEmailAvailabilityValidator.field_q == 4);
            if (!decompiledSharedTail0) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(55, 24);
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              if (0 == gd.field_c) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(40, 81);
              }
              if (gd.field_c == 1) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(23, 49);
              }
              if (1 <= gd.field_c) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(26, 24);
              }
            }
            this.field_cb = 0;
            this.field_mb = 0;
            this.field_ib = 0;
            gd.field_c = gd.field_c + 1;
            if (null != TextHotspotBounds.field_m) {
              TextHotspotBounds.field_m.bindAsRenderTarget();
              SoftwareRasterizer.clearRaster();
              k.field_f.setAsRasterTarget(0);
            }
            rk.field_c = 32;
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c >= 5) {
              ja.field_i = 0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (1 == ConfirmedEmailAvailabilityValidator.field_q) {
              if (me.field_o <= 0) {
                ConfirmedEmailAvailabilityValidator.field_q = 0;
                decompiledFrameRemainder0 = !(1 > gd.field_c);
                if (decompiledFrameRemainder0) {
                  ja.field_i = 10;
                  if (ge.field_e == 0) {
                    ja.field_i = 0;
                  }
                  ProxyAuthenticationRequiredException.field_g = 20;
                  if (TutorialText.field_a > 0) {
                    ja.field_i = 11;
                  }
                  this.b(false, ge.field_e);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (gd.field_c >= 4)) {
                ja.field_i = 1;
                if (this.field_jb > 0) {
                  this.field_zb = new ch();
                  this.field_D = 0;
                  this.field_hb = 1;
                  if (Archive.field_a == 0) {
                    this.field_wb = new TutorialController(2);
                    this.field_wb.field_i = this;
                  }
                }
              }
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 2 &&
              gd.field_c >= 2) {
              ja.field_i = 1;
              if (this.field_jb > 0) {
                this.field_zb = new ch();
                this.field_D = 0;
                this.field_hb = 1;
              }
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 3 &&
              gd.field_c >= 3) {
              ja.field_i = 1;
              if (this.field_jb > 0) {
                this.field_zb = new ch();
                this.field_D = 0;
                this.field_hb = 1;
              }
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 4 &&
              gd.field_c >= 4) {
              ja.field_i = 10;
              ProxyAuthenticationRequiredException.field_g = 20;
              if (ge.field_e == 0) {
                ja.field_i = 0;
              }
              if (TutorialText.field_a > 0) {
                ja.field_i = 11;
              }
              this.b(false, ge.field_e);
            }
            if (0 > ConfirmedEmailAvailabilityValidator.field_q) {
              ConfirmedEmailAvailabilityValidator.field_q = -(ConfirmedEmailAvailabilityValidator.field_q + 1);
              ja.field_i = 10;
              if (ge.field_e == 0) {
                ja.field_i = 0;
              }
              ProxyAuthenticationRequiredException.field_g = 20;
              if (0 < TutorialText.field_a) {
                ja.field_i = 11;
              }
              this.b(false, ge.field_e);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.GC(" + param0 + ')');
        }
    }

    private final int a(byte param0, byte[] param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 86) {
            this.field_Y = true;
          }
          stackIn_4_0 = this.b(param1, 1, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == ConfirmedEmailAvailabilityValidator.field_q) {
            jh.field_q[12].drawOpaque(0, 0);
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
            jh.field_q[14].drawOpaque(0, 0);
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
            jh.field_q[17].drawOpaque(0, 0);
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
            jh.field_q[19].drawOpaque(0, 0);
          }
          if (!param0) {
            this.a(10, (byte[]) null, 90);
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 4) {
            jh.field_q[4].drawOpaque(0, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.W(" + param0 + ')');
        }
    }

    private final void B(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (bi.field_b != null) {
            bl.loadGameInterfaceText((byte) 96, bi.field_b);
            bi.field_b = null;
            ea.a((byte) 47);
          }
          ab.field_a = va.a(1, -117);
          var2_int = -77 / ((param0 - 56) / 62);
          GrowableIntArray.field_a = va.a(2, -117);
          ee.field_G = va.a(3, -128);
          mi.field_h = va.a(4, -118);
          h.field_j = va.a(5, -125);
          IntrusiveDeque.field_c = va.a(6, -119);
          aj.field_b = va.a(7, -128);
          NanoFrameTimer.a(109, ByteStorage.field_d, TextFieldValidator.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_Bb;
          if (ConfirmedEmailAvailabilityValidator.field_q == 0) {
            var3_int++;
          }
          if (1 == ConfirmedEmailAvailabilityValidator.field_q) {
            var3_int -= 2;
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
            var3_int -= 7;
          }
          if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
            var3_int -= 10;
          }
          this.field_Eb = new String[2];
          this.field_Eb[0] = InteractiveWidget.field_G;
          if (param0 != 7) {
            return;
          }
          this.field_Eb[1] = var3_int + " " + p.field_f[param1];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final void w(int param0) {
        int stackIn_51_0 = 0;
        boolean stackIn_64_0 = false;
        boolean stackIn_89_0 = false;
        int stackIn_103_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_218_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_V;
        try {
          TutorialText.field_a = 0;
          if (0 != (512 & ef.field_i)) {
            this.field_kb = 2;
          }
          if ((1024 & ef.field_i) != 0) {
            this.field_kb = 3;
          }
          if (0 != (ef.field_i & 2048)) {
            this.field_kb = 4;
          }
          if ((ef.field_i & 4096) != 0) {
            this.field_K = 3;
          }
          if (0 >= me.field_o) {
            this.field_kb = 1;
          }
          TextFieldValidator.field_k = null;
          if (param0 < 80) {
            this.a((String) null, 127, 65, -65, -32);
          }
          var2_int = -1;
          var3 = 0;
          if (DiskArchiveRequest.field_I == 1) {
            var2_int = this.field_xb;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!DefaultTextWidgetRenderer.d(1)))) {
            if (34 == lf.field_c &&
              mm.field_e >= 2) {
              this.field_Cb = new LevelEditor();
            }
            if (lf.field_c == 84) {
              var2_int = this.field_xb;
              var3 = 0;
              MusicPatch.playIndexedSoundEffectWithIntGuard(77, 33);
            }
            if (97 == lf.field_c) {
              var3 = 1;
              var2_int = this.field_xb;
            }
            if (lf.field_c == 96) {
              var2_int = this.field_xb;
              var3 = -1;
            }
            if (98 == lf.field_c) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(68, 25);
              var4 = -1;
            }
            if (99 != lf.field_c) {
              continue;
            }
            var4 = 1;
            stackIn_51_0 = 80;
            if (var6 == 0) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(stackIn_51_0, 24);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_51_0 = 0;
          }
          var5 = stackIn_51_0;
          if (null != ProgressMessageDialog.field_ib) {
            if (~var5 == ~var2_int &&
              var3 == 0) {
              this.n((byte) -121);
              this.a(ProgressMessageDialog.field_ib, false, true);
              stackIn_64_0 = !(me.field_o <= 0);
              se.field_h = stackIn_64_0;
              ConfirmedEmailAvailabilityValidator.field_q = 0;
              ja.field_i = 1;
              if (this.field_Bb >= 3) {
                ConfirmedEmailAvailabilityValidator.field_q = 1;
              }
              if (this.field_Bb >= 8) {
                ConfirmedEmailAvailabilityValidator.field_q = 2;
              }
              ProxyAuthenticationRequiredException.field_g = 20;
              if (this.field_Bb >= 11) {
                ConfirmedEmailAvailabilityValidator.field_q = 3;
              }
            }
            var5++;
          }
          if (var5 == var2_int &&
            0 == var3 &&
            var3 == 0) {
            this.n((byte) 42);
            stackIn_89_0 = !(me.field_o <= 0);
            se.field_h = stackIn_89_0;
          }
          var5++;
          if (this.field_kb > 1) {
            if (~var5 == ~var2_int) {
              if (var3 == 0) {
                stackIn_103_0 = (ef.field_j > 320) ? 1 : -1;
                var3 = stackIn_103_0;
              }
              if (var3 == 1 &&
                ConfirmedEmailAvailabilityValidator.field_q == -1 + this.field_kb) {
                var3 = 0;
              }
              if (var3 == -1 && (ConfirmedEmailAvailabilityValidator.field_q == 0 ||
                ConfirmedEmailAvailabilityValidator.field_q == 4)) {
                var3 = 0;
              }
              if (1 == var3) {
                ConfirmedEmailAvailabilityValidator.field_q = (1 + (ConfirmedEmailAvailabilityValidator.field_q + this.field_kb)) % this.field_kb;
                MusicPatch.playIndexedSoundEffectWithIntGuard(51, 24);
              }
              if (var3 == -1) {
                ConfirmedEmailAvailabilityValidator.field_q = (-1 + this.field_kb + ConfirmedEmailAvailabilityValidator.field_q) % this.field_kb;
                MusicPatch.playIndexedSoundEffectWithIntGuard(24, 25);
              }
            }
            var5++;
          }
          if (var5 == var2_int) {
            if (0 == var3) {
              stackIn_139_0 = (ef.field_j <= 320) ? -1 : 1;
              var3 = stackIn_139_0;
            }
            if (var3 == 1 &&
              Archive.field_a < this.field_K - 1) {
              Archive.field_a = Archive.field_a + 1;
              MusicPatch.playIndexedSoundEffectWithIntGuard(113, 24);
            }
            if (var3 == -1 &&
              0 < Archive.field_a) {
              Archive.field_a = Archive.field_a - 1;
              MusicPatch.playIndexedSoundEffectWithIntGuard(33, 25);
            }
          }
          var5++;
          if (0 != oh.field_f &&
            ~var5 == ~this.field_xb) {
            var2_int = this.field_xb;
          }
          if (~var5 == ~var2_int) {
            if (var3 == 0) {
              if ((328 + SectorCacheStore.field_e * 100 / 128) < ef.field_j) {
                stackIn_175_0 = 1;
              } else {
                stackIn_175_0 = ((320 + SectorCacheStore.field_e * 100 / 128 - 8) > ef.field_j) ? -1 : 0;
              }
              var3 = stackIn_175_0;
            }
            if (var3 == -1) {
              SectorCacheStore.field_e = SectorCacheStore.field_e - 16;
            }
            if (var3 == 1) {
              SectorCacheStore.field_e = SectorCacheStore.field_e + 16;
            }
            if (SectorCacheStore.field_e < 0) {
              SectorCacheStore.field_e = 0;
            }
            if (128 < SectorCacheStore.field_e) {
              SectorCacheStore.field_e = 128;
            }
            if (ai.field_g <= 0) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(31, 70);
              ai.field_g = 25;
            }
          }
          var5++;
          if (ai.field_g > 0) {
            ai.field_g = ai.field_g - 1;
          }
          if (oh.field_f != 0 &&
            ~var5 == ~this.field_xb) {
            var2_int = this.field_xb;
          }
          if (~var5 == ~var2_int) {
            if (var3 == 0) {
              if (ef.field_j <= 320 + (AccountCreationResultPanel.field_sb * 100 / 128 + 8)) {
                stackIn_218_0 = (ef.field_j >= 312 + 100 * AccountCreationResultPanel.field_sb / 128) ? 0 : -1;
              } else {
                stackIn_218_0 = 1;
              }
              var3 = stackIn_218_0;
            }
            if (-1 == var3) {
              AccountCreationResultPanel.field_sb = AccountCreationResultPanel.field_sb - 16;
            }
            if (1 == var3) {
              AccountCreationResultPanel.field_sb = AccountCreationResultPanel.field_sb + 16;
            }
            if (0 > AccountCreationResultPanel.field_sb) {
              AccountCreationResultPanel.field_sb = 0;
            }
            if (AccountCreationResultPanel.field_sb > 128) {
              AccountCreationResultPanel.field_sb = 128;
            }
            uk.field_b.setMasterVolume(2 * AccountCreationResultPanel.field_sb, -103);
          }
          var5++;
          if (~var5 == ~var2_int &&
            0 == var3) {
            this.r(109);
          }
          var5++;
          if (~var2_int == ~var5 &&
            var3 == 0) {
            ProxyAuthenticationRequiredException.field_g = 20;
            wf.field_h = false;
            TextLayout.field_b = true;
            ea.field_o = 0;
          }
          var5++;
          if (!this.field_Gb) {
            if (~var5 == ~var2_int &&
              0 == var3) {
              ProxyAuthenticationRequiredException.field_g = 20;
              ja.field_i = 10;
            }
            var5++;
            if (var2_int == var5 &&
              var3 == 0) {
              ProxyAuthenticationRequiredException.field_g = 20;
              wf.field_t = -1;
              ja.field_i = 11;
            }
            var5++;
            if (var5 == var2_int &&
              0 == var3) {
              if (null != a.field_b) {
                ga.b((byte) 60);
              }
              GrowableIntArray.a(dg.a(false), 100);
            }
            var5++;
          }
          this.field_xb = this.field_xb + var4;
          if (this.field_xb < 0 &&
            var4 != 0) {
            this.field_xb = this.field_xb + var5;
          }
          if (this.field_xb > (-1 + var5)) {
            this.field_xb = this.field_xb - var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.QB(" + param0 + ')');
        }
    }

    private final void d(byte[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -39) {
            return;
          }
          this.a(param2, param0, 7, 117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("Terraphoenix.GA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        hd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_V;
        try {
          var2 = (hd) (ga.field_k.beginBackward(9272));
          if (param0) {
            return;
          }
          if (var2 != null) {
            var4 = this.field_R;
            if (var4 < 80) {
              var3 = -16 + -var4 / 2 + 480;
              if (var5 != 0) {
                if (var4 < 230) {
                  var3 = 424;
                  var3 = -48 + (357 + var4 / 2);
                } else {
                  var3 = -48 + (357 + var4 / 2);
                }
              }
            } else {
              if (var4 < 230) {
                var3 = 424;
                if (var5 != 0) {
                  var3 = -48 + (357 + var4 / 2);
                }
              } else {
                var3 = -48 + (357 + var4 / 2);
              }
            }
            var3 += 16;
            SoftwareRasterizer.fillRectangleAlpha(592 + (-FrameTimer.field_f.stringWidth(RandomAccessCacheFile.field_g[var2.field_n]) - 2), var3 - 2, 44 + FrameTimer.field_f.stringWidth(RandomAccessCacheFile.field_g[var2.field_n]), 40, 0, 64);
            hf.field_w[var2.field_n].drawScaled(600, var3, 32, 32);
            FrameTimer.field_f.drawRightAligned(RandomAccessCacheFile.field_g[var2.field_n], 592, FrameTimer.field_f.field_s + var3, 16776960, -1);
            AlphaWidgetContainer.a(SingleChildWidgetContainer.field_G, 43, -5 + var3, 40 + FrameTimer.field_f.stringWidth(RandomAccessCacheFile.field_g[var2.field_n]) + 7, (byte) -101, 592 - FrameTimer.field_f.stringWidth(RandomAccessCacheFile.field_g[var2.field_n]) - 5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2_ref), "Terraphoenix.LB(" + param0 + ')');
        }
    }

    private final void b(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        SoundCache var3 = null;
        Object var3_ref = null;
        int var3_int = 0;
        RuntimeException var3_ref2 = null;
        PcmResampler var4 = null;
        Object var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = field_V;
        try {
          mi.clearStaticReferences(param1 ^ 22369);
          if (param0) {
            BitPacketBuffer.pumpClientUi(3795, RichTextWidget.field_P);
          }
          if (ab.field_a != null) {
            if (ee.field_G.ensureIndexLoaded(0) &&
              ee.field_G.tryLoadAllGroups((byte) -128)) {
              if (mi.field_h.ensureIndexLoaded(param1 ^ -107) &&
                mi.field_h.tryLoadAllGroups((byte) -128)) {
                if (h.field_j.ensureIndexLoaded(0) &&
                  h.field_j.tryLoadAllGroups((byte) -128)) {
                  if (IntrusiveDeque.field_c.ensureIndexLoaded(0) &&
                    IntrusiveDeque.field_c.tryLoadAllGroups((byte) -128)) {
                    if (ab.field_a.ensureIndexLoaded(0) &&
                      ab.field_a.tryLoadAllGroups((byte) -128)) {
                      if (GrowableIntArray.field_a.ensureIndexLoaded(0) &&
                        GrowableIntArray.field_a.tryLoadAllGroups((byte) -128)) {
                        if (ByteStorage.field_d.ensureIndexLoaded(0) &&
                          ByteStorage.field_d.tryLoadGroupByName(-3, "basic")) {
                          if (me.field_o <= 0 && (!ByteStorage.field_d.ensureIndexLoaded(param1 + 107) ||
                            !ByteStorage.field_d.tryLoadGroupByName(-3, "benefits"))) {
                            DualLinkNode.a(vf.a("benefits", bl.field_d, ByteStorage.field_d, be.field_w, 4650), (byte) 88, 40.0f);
                            return;
                          }
                          if (aj.field_b.ensureIndexLoaded(param1 + 107) &&
                            aj.field_b.tryLoadAllGroups((byte) -128)) {
                            DualLinkNode.a(IsaacCipher.field_h, (byte) 58, 50.0f);
                            this.renderClientFrame((byte) -89);
                            if (!param0) {
                              return;
                            }
                            lk.b(9407);
                            this.t(-2020);
                            ea.a((byte) 47);
                            return;
                          }
                          DualLinkNode.a(vf.a("", ValidationStatusWidget.field_S, aj.field_b, vb.field_a, param1 + 4757), (byte) -84, 45.0f);
                          return;
                        }
                        DualLinkNode.a(vf.a("basic", bl.field_d, ByteStorage.field_d, be.field_w, 4650), (byte) -88, 35.0f);
                        return;
                      }
                      DualLinkNode.a(vf.a("", TutorialText.field_b, GrowableIntArray.field_a, EditableTextField.field_R, 4650), (byte) -124, 30.0f);
                      return;
                    }
                    DualLinkNode.a(vf.a("", q.field_Nb, ab.field_a, be.field_w, 4650), (byte) 110, 25.0f);
                    return;
                  }
                  DualLinkNode.a("", (byte) -82, 20.0f);
                  return;
                }
                DualLinkNode.a(vf.a("", q.field_Nb, h.field_j, od.field_b, 4650), (byte) 64, 15.0f);
                return;
              }
              DualLinkNode.a(vf.a("", rk.field_b, mi.field_h, me.field_h, 4650), (byte) -95, 10.0f);
              return;
            }
            DualLinkNode.a(vf.a("", rk.field_b, ee.field_G, me.field_h, 4650), (byte) -121, 5.0f);
            return;
          }
          if (param1 != -107) {
            this.a((String) null, -98, 101, 14, 104);
          }
          if (GrowableIntArray.field_a != null) {
            DualLinkNode.a(u.field_f, (byte) -122, 60.0f);
            this.renderClientFrame((byte) -89);
            ImageProducerRasterBuffer.field_k = new byte[PasswordValidator.field_n.length][];
            var3_int = 0;
            while (PasswordValidator.field_n.length > var3_int) {
              ImageProducerRasterBuffer.field_k[var3_int] = GrowableIntArray.field_a.getFileByName("", PasswordValidator.field_n[var3_int] + ".lev", -21653);
              var3_int++;
              if (var6 != 0) {
                return;
              }
            }
            GrowableIntArray.field_a = null;
            ea.a((byte) 47);
            return;
          }
          if (h.field_j != null) {
            DualLinkNode.a(IndexedSpriteState.field_e, (byte) -119, 70.0f);
            this.renderClientFrame((byte) -89);
            ca.field_a = new MusicTrack[8];
            ca.field_a[7] = MusicTrack.load(h.field_j, "", "terraphoenix_music_title");
            ca.field_a[0] = MusicTrack.load(h.field_j, "", "terraphoenix_music_title(no voices)");
            ca.field_a[1] = MusicTrack.load(h.field_j, "", "terraphoenix_music_ingame_rural");
            ca.field_a[2] = MusicTrack.load(h.field_j, "", "terraphoenix_music_ingame_urban");
            ca.field_a[3] = MusicTrack.load(h.field_j, "", "terraphoenix_music_ingame_alienbase");
            ca.field_a[4] = MusicTrack.load(h.field_j, "", "terraphoenix_jingle_success_high_scores");
            ca.field_a[5] = MusicTrack.load(h.field_j, "", "terraphoenix_jingle_fail_high_scores");
            ca.field_a[6] = MusicTrack.load(h.field_j, "", "terraphoenix_jingle_mission_completed");
            h.field_j = null;
            ea.a((byte) 47);
            return;
          }
          if (null == IntrusiveDeque.field_c) {
            DualLinkNode.a(AccountNameAvailabilityValidator.field_q, (byte) -88, 90.0f);
            this.renderClientFrame((byte) -89);
            be.field_u = new Sprite(64, 32);
            be.field_u.bindAsRenderTarget();
            var3_int = 0;
            do {
              if (32 <= var3_int) {
                MessageKeys.field_b = new Sprite(64, 80);
                MessageKeys.field_b.bindAsRenderTarget();
                break;
              }
              SoftwareRasterizer.drawHorizontalLine(0, var3_int, 64, var3_int);
              var3_int++;
            } while (var6 == 0);
            var3_int = 0;
            do {
              if (var3_int >= 64) {
                k.field_f.setAsRasterTarget(param1 ^ -107);
                ja.field_i = 8;
                fh.a(62, 50);
                DraggableWidgetContainer.a(false, 7);
                break;
              }
              SoftwareRasterizer.drawHorizontalLine(0, var3_int, 64, 16 - var3_int / 2);
              var3_int++;
            } while (var6 == 0);
            if (!bk.c(-25704)) {
              GuestPlayConfirmationForm.field_K = hf.a(4, (byte) -117);
              EditableTextField.field_M = ok.a(false, 6);
            }
            ba.field_h = true;
            ea.a((byte) 47);
            return;
          }
          DualLinkNode.a(AccountNameAvailabilityValidator.field_q, (byte) -74, 80.0f);
          this.renderClientFrame((byte) -89);
          var3 = new SoundCache(ee.field_G, mi.field_h);
          var4 = new PcmResampler(22050, PcmPlayerService.field_u);
          mi.field_h = null;
          ee.field_G = null;
          var5 = 0;
          do {
            if (!(ca.field_a.length > var5)) {
              uk.field_b.releasePatchSampleIds(-32499);
              IntrusiveDeque.field_c = null;
              GameApplet.field_g = new PcmSample[92];
              break;
            }
            uk.field_b.prepareTrackSamples(IntrusiveDeque.field_c, var3, ca.field_a[var5], 128, 0);
            var5++;
          } while (var6 == 0);
          var5 = 0;
          while (var5 < 92) {
            if ((var5 < 1 ||
              var5 > 21) &&
              (var5 != 82 &&
              83 != var5)) {
              GameApplet.field_g[var5] = var3.getSoundEffectByName(sk.field_b[var5], param1 + 107).resample(var4);
            }
            if (var5 >= 1 &&
              var5 <= 21 ||
              (var5 == 82 ||
              83 == var5) || var6 != 0) {
              GameApplet.field_g[var5] = var3.getMusicSampleByName(-1, sk.field_b[var5]).resample(var4);
            }
            var5++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var4_ref = null;
          var3_ref = null;
          ea.a((byte) 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var3_ref2), "Terraphoenix.FC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte[] param0, boolean param1, boolean param2) {
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        ga stackIn_31_0 = null;
        byte[] stackIn_31_2 = null;
        boolean stackIn_32_3 = false;
        ga stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_3 = false;
        pc stackIn_64_0 = null;
        boolean stackIn_65_2 = false;
        int stackIn_81_0 = 0;
        ga stackIn_91_0 = null;
        boolean stackIn_92_2 = false;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        boolean stackIn_125_0 = false;
        int stackIn_136_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        boolean stackIn_178_1 = false;
        boolean stackIn_182_1 = false;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        String stackIn_188_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_124_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_123_0Lifetime1;
        int stackIn_123_1Lifetime1;
        boolean stackIn_125_0Lifetime1;
        boolean stackOut_124_0Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        int var7Lifetime2;
        var8 = field_V;
        try {
          pj.field_t = 0;
          this.field_Db = false;
          RandomAccessCacheFile.field_b = 0;
          this.field_pb = this.a(param0, 126);
          this.field_Bb = this.a(param0, -26);
          sj.field_a[2].field_e = param2;
          od.field_c[1].field_q = true;
          if (3 <= this.field_Bb) {
            od.field_c[2].field_q = false;
          }
          if (this.field_Bb >= 7) {
            sj.field_a[1].field_e = false;
          }
          stackIn_12_0 = (this.a((byte) 86, param0) != 1) ? 0 : 1;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameRemainder0 = true;
          var4_int = stackIn_12_0;
          if (var4_int == 0 &&
            !param1) {
            var5 = 0;
            while (12 > var5) {
              stackIn_123_0 = ~this.a((byte) 86, param0);
              stackIn_123_1 = -2;
              if (var8 != 0) {
                if (stackIn_123_0 < stackIn_123_1) {
                  stackOut_124_0 = od.field_c[var5].field_f;
                  stackIn_143_0 = stackOut_124_0 ? 1 : 0;
                  stackIn_125_0 = stackOut_124_0;
                  decompiledFrameCompleted2 = false;
                  break;
                }
                decompiledFrameCompleted1 = false;
                break;
              }
              stackIn_25_0 = (stackIn_123_0 != stackIn_123_1) ? 0 : 1;
              var6 = stackIn_25_0;
              if (var6 != 0) {
                this.field_nb[var5] = new ga();
                stackIn_31_0 = this.field_nb[var5];
                stackIn_31_2 = (byte[]) (param0);
                stackIn_32_3 = !(param2);
                stackIn_31_0.field_t = this.a(stackIn_31_2, stackIn_32_3) + 25;
                stackIn_35_0 = this.field_nb[var5];
                stackIn_35_1 = 40;
                stackIn_36_3 = !(param2);
                stackIn_35_0.field_w = stackIn_35_1 + this.b(stackIn_36_3, param0);
                this.field_nb[var5].field_v = this.a(param0, false);
                this.field_nb[var5].field_B = this.a(param0, false) + 25;
                this.field_nb[var5].field_e = this.a(param0, (byte) -113);
                this.field_nb[var5].field_h = this.a(false, param0);
                this.field_nb[var5].field_g = this.a(param0, (byte) -113);
                this.field_nb[var5].field_f = this.a(param0, false);
                this.field_nb[var5].c(50);
                this.field_nb[var5].c((byte) -118);
                var7 = this.a(15418, param0);
                if (var7 != 19) {
                  this.field_nb[var5].field_b = new oh(var7);
                } else {
                  this.field_nb[var5].field_b = null;
                }
                var7 = this.a(15418, param0);
                if (var7 != 19) {
                  this.field_nb[var5].field_A = new oh(var7);
                } else {
                  this.field_nb[var5].field_A = new oh(0);
                }
                var7 = this.a(false, param0);
                if (var7 != 0) {
                  if (var7 == 1) {
                    this.field_nb[var5].field_i = new oh(5);
                  }
                  if (var7 == 2) {
                    this.field_nb[var5].field_i = new oh(11);
                  }
                  this.field_nb[var5].field_i.field_d = this.b(param0, 3) + 1;
                } else {
                  this.field_nb[var5].field_i = null;
                }
                this.field_nb[var5].field_m = new pc();
                stackIn_64_0 = this.field_nb[var5].field_m;
                stackIn_65_2 = !(param2);
                stackIn_64_0.field_f = this.a(stackIn_65_2, param0);
                this.field_nb[var5].d((byte) -123);
              } else {
                this.field_nb[var5] = null;
              }
              var5++;
            }
            if ((decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1)) {
              decompiledFrameRemainder0 = (var8 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            var5 = 0;
            while (var5 < 12) {
              var6 = var4_int;
              stackIn_121_0 = var5;
              if (var8 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (stackIn_121_0 > 0) {
                stackIn_81_0 = (this.a((byte) 86, param0) != 1) ? 0 : 1;
                var6 = stackIn_81_0;
              }
              if (var6 == 0) {
                this.field_nb[var5] = null;
              } else {
                this.field_nb[var5] = new ga();
                this.field_nb[var5].field_t = this.a(param0, false) + 25;
                this.field_nb[var5].field_w = this.b(false, param0) + 40;
                this.field_nb[var5].field_v = this.a(param0, false);
                this.field_nb[var5].field_B = 25 + this.a(param0, false);
                this.field_nb[var5].field_e = this.a(param0, (byte) -113);
                stackIn_91_0 = this.field_nb[var5];
                stackIn_92_2 = !(param2);
                stackIn_91_0.field_h = this.a(stackIn_92_2, param0);
                this.field_nb[var5].field_g = this.a(param0, false);
                this.field_nb[var5].field_f = this.a(param0, false);
                this.field_nb[var5].c(50);
                this.field_nb[var5].c((byte) -92);
                var7 = this.a(15418, param0);
                if (var7 != 19) {
                  this.field_nb[var5].field_b = new oh(var7);
                } else {
                  this.field_nb[var5].field_b = null;
                }
                var7 = this.a(15418, param0);
                if (var7 == 19) {
                  this.field_nb[var5].field_A = new oh(0);
                } else {
                  this.field_nb[var5].field_A = new oh(var7);
                }
                var7 = this.a(false, param0);
                if (var7 != 0) {
                  if (var7 == 1) {
                    this.field_nb[var5].field_i = new oh(5);
                  }
                  if (var7 == 2) {
                    this.field_nb[var5].field_i = new oh(11);
                  }
                  this.field_nb[var5].field_i.field_d = 1 + this.b(param0, 3);
                } else {
                  this.field_nb[var5].field_i = null;
                }
                this.field_nb[var5].field_m = new pc();
                this.field_nb[var5].field_m.field_f = this.a(false, param0);
                this.field_nb[var5].d((byte) 68);
              }
              var5++;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_121_0 = 0;
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            var5Lifetime2 = stackIn_121_0;
            while (true) {
              stackIn_123_0Lifetime1 = ~this.field_I.field_a.length;
              stackIn_123_1Lifetime1 = ~var5Lifetime2;
              if (stackIn_123_0Lifetime1 >= stackIn_123_1Lifetime1) {
                break;
              }
              stackOut_124_0Lifetime1 = od.field_c[var5Lifetime2].field_f;
              stackIn_143_0 = stackOut_124_0Lifetime1 ? 1 : 0;
              stackIn_125_0Lifetime1 = stackOut_124_0Lifetime1;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_125_0Lifetime1) {
                stackIn_136_0 = (this.a((byte) 86, param0) != 1) ? 0 : 1;
                var6Lifetime2 = stackIn_136_0;
                var7Lifetime2 = this.a(param0, 124);
                od.field_c[var5Lifetime2].field_t = var6Lifetime2 != 0;
                this.field_I.field_a[var5Lifetime2] = var7Lifetime2;
              } else {
                if (od.field_c[var5Lifetime2].field_q) {
                  var6Lifetime2 = this.a(param0, -87);
                  this.field_I.field_a[var5Lifetime2] = var6Lifetime2;
                }
              }
              var5Lifetime2++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted0)) {
            stackIn_143_0 = 0;
          }
          var5Lifetime1 = stackIn_143_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var5Lifetime1 < this.field_I.field_d.length)))) {
            stackIn_162_0 = 1;
            stackIn_162_1 = var5Lifetime1;
            if (var8 == 0) {
              if (stackIn_162_0 != stackIn_162_1) {
                if (var5Lifetime1 > 1) {
                  stackIn_158_0 = (this.a((byte) 86, param0) != 1) ? 0 : 1;
                  var6Lifetime1 = stackIn_158_0;
                  var7Lifetime1 = this.a(param0, 124);
                  sj.field_a[var5Lifetime1].field_l = var6Lifetime1 != 0;
                  this.field_I.field_d[var5Lifetime1] = var7Lifetime1;
                }
              } else {
                var6Lifetime1 = this.a(param0, -101);
                this.field_I.field_d[var5Lifetime1] = var6Lifetime1;
              }
              var5Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            Archive.field_a = this.a(false, param0);
            oe.field_c = oe.field_c - ge.field_e;
            ge.field_e = this.b(param0, 20, -1);
            ArchiveIndex.field_e = ArchiveIndex.field_e - ge.field_e;
            qc.field_c = this.a(param0, 127);
            this.field_Fb = this.a(param0, 121);
            this.field_ub = this.a(false, param0);
            this.field_vb = this.a(false, param0);
            stackIn_162_0 = -1;
            stackIn_162_1 = ~this.a((byte) 86, param0);
          }
          if (stackIn_162_0 == stackIn_162_1) {
            this.field_jb = 0;
          }
          if (stackIn_162_0 != stackIn_162_1 ||
            var8 != 0) {
            this.field_zb = new ch();
            this.field_jb = 1;
          }
          if (123 > param0.length) {
            this.field_ob = false;
            this.field_fb = false;
            if (var8 == 0) {
              return;
            }
          }
          stackIn_178_1 = (this.a((byte) 86, param0) == 1);
          this.field_fb = stackIn_178_1;
          stackIn_182_1 = (1 == this.a((byte) 86, param0));
          this.field_ob = stackIn_182_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_187_0 = var4;
          stackIn_187_1 = new StringBuilder().append("Terraphoenix.VA(");
          if (param0 == null) {
            stackIn_188_2 = "null";
          } else {
            stackIn_188_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_187_0), ((StringBuilder) (Object) stackIn_187_1).append(stackIn_188_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void initializeClient(int param0) {
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_V;
        try {
          this.initializeFramework(8, 5000, 9, 0, 10, false, 26, 11);
          RichTextWidget.g(0);
          ByteStorage.b(false);
          wi.h(-4168);
          var2_int = 49 % ((-60 - param0) / 46);
          vl.field_a = new int[256];
          bj.field_d = new int[256];
          hf.field_B = new int[256];
          var3 = 0;
          while (256 > var3) {
            if (var4 != 0) {
              return;
            }
            stackIn_9_0 = vl.field_a;
            stackIn_9_1 = var3;
            if (var3 >= 128) {
              stackIn_10_2 = -32896 + 257 * var3;
            } else {
              stackIn_10_2 = 0;
            }
            stackIn_9_0[stackIn_9_1] = stackIn_10_2 + var3 * 65536;
            stackIn_13_0 = bj.field_d;
            stackIn_13_1 = var3;
            if (var3 >= 128) {
              stackIn_14_2 = var3 * 65537 - 8388736;
            } else {
              stackIn_14_2 = 0;
            }
            stackIn_13_0[stackIn_13_1] = stackIn_14_2 + 256 * var3;
            stackIn_17_0 = hf.field_B;
            stackIn_17_1 = var3;
            if (128 > var3) {
              stackIn_18_2 = 0;
            } else {
              stackIn_18_2 = (-128 + var3) * 65792;
            }
            stackIn_17_0[stackIn_17_1] = stackIn_18_2 + var3 * 1;
            var3++;
          }
          PcmPlayerService.configureAudio(22050, true, 10);
          ModalDialogHost.field_I = PcmPlayerService.createOutput(DirectByteStorage.field_l, (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_G), 0, 4096);
          WidgetContainer.field_E = new PcmStreamMixer();
          ModalDialogHost.field_I.setRootStream(WidgetContainer.field_E);
          uk.field_b = new MidiPcmStream();
          uk.field_b.setChannelProgram(9, 128, -51);
          WidgetContainer.field_E.addChildStream(uk.field_b);
          this.configureOptionalPacketHandlers(true, false, 13, true, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.I(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int discarded$0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_275_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var14_ref = null;
        int var15 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        int var8Lifetime8;
        var15 = field_V;
        try {
          this.f(true);
          var2_int = 400;
          this.a(true, var2_int);
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var3 = 320;
            var4 = 240;
            this.a(-3407, var4, var3);
            SoftwareRasterizer.setClip(320 - (rk.field_c >> 1), 0, (rk.field_c >> 1) + 320, 480);
            var5 = this.field_xb;
            if (1 != oh.field_f &&
              this.field_Z == ef.field_j &&
              this.field_tb == MouseWheelInput.field_b) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = 1;
            }
            var6 = stackIn_12_0;
            this.field_Z = ef.field_j;
            if (var6 != 0) {
              this.field_xb = -1;
            }
            this.field_tb = MouseWheelInput.field_b;
            if ((320 - rk.field_c / 2) <= ef.field_j &&
              ef.field_j < (320 + rk.field_c / 2)) {
              stackIn_22_0 = 1;
            } else {
              stackIn_22_0 = 0;
            }
            var7 = stackIn_22_0;
            if (var7 == 0) {
              var6 = 0;
            }
            var9 = 125;
            var10 = 30;
            var11 = 0;
            var12 = -wa.field_s + 16776960;
            if (ProgressMessageDialog.field_ib != null) {
              boolean decompiledFrameRemainder8 = true;
              if (this.field_xb != var11 && (!(MouseWheelInput.field_b >= (4 + var9 - var10)) ||
                !(MouseWheelInput.field_b < (var9 + 4)) ||
                var6 == 0)) {
                stackIn_40_0 = 16777215;
                decompiledFrameRemainder8 = false;
              }
              else {
                stackIn_40_0 = var12;
              }
              var8 = stackIn_40_0;
              if (var12 == var8) {
                this.field_xb = var11;
              }
              pj.field_t = 0;
              RandomAccessCacheFile.field_b = 0;
              discarded$0 = this.a(ProgressMessageDialog.field_ib, -23);
              var13 = this.a(ProgressMessageDialog.field_ib, -26);
              if (var13 > 0) {
                var14 = null;
                if (var13 < 3) {
                  var14_ref = ef.field_b + wj.field_e + (var13 + 1);
                } else {
                  if (var13 < 8) {
                    var14_ref = bh.field_b + wj.field_e + (-2 + var13);
                  } else {
                    if (var13 >= 11) {
                      var14_ref = IterableNodeHashTable.field_d + wj.field_e + (-10 + var13);
                    } else {
                      var14_ref = jh.field_h + wj.field_e + (-7 + var13);
                    }
                  }
                }
                FrameTimer.field_f.drawString(var14_ref, 320, var9, var8, 0);
                AccountRequestState.field_f.drawParagraph(qc.field_e, -FrameTimer.field_f.stringWidth(var14_ref) + 320, -20 + var9, -16 + FrameTimer.field_f.stringWidth(var14_ref), 24, var8, 0, 2, 1, 12);
              }
              if (var13 <= 0 ||
                var15 != 0) {
                this.a(qc.field_e, 320, var8, var9, param0 ^ 122);
              }
              var9 = var9 + var10;
              var11++;
              if (var15 != 0) {
                var9 = var9 + var10 / 2;
              }
            } else {
              var9 = var9 + var10 / 2;
            }
            boolean decompiledFrameRemainder7 = true;
            if (~var11 != ~this.field_xb && (!((4 - var10 + var9) <= MouseWheelInput.field_b) ||
              !((var9 + 4) > MouseWheelInput.field_b) ||
              var6 == 0)) {
              stackIn_74_0 = 16777215;
              decompiledFrameRemainder7 = false;
            }
            else {
              stackIn_74_0 = var12;
            }
            var8Lifetime1 = stackIn_74_0;
            if (var12 == var8Lifetime1) {
              this.field_xb = var11;
            }
            this.a(MessageKeys.field_e, 320, var8Lifetime1, var9, 124);
            var9 = var9 + var10;
            var11++;
            if (this.field_kb > 1) {
              boolean decompiledFrameRemainder6 = true;
              if (var11 != this.field_xb && (!(MouseWheelInput.field_b >= -var10 + (var9 + 4)) ||
                !(4 + var9 > MouseWheelInput.field_b) ||
                var6 == 0)) {
                stackIn_93_0 = 16777215;
                decompiledFrameRemainder6 = false;
              }
              else {
                stackIn_93_0 = var12;
              }
              var8Lifetime2 = stackIn_93_0;
              if (var8Lifetime2 == var12) {
                this.field_xb = var11;
              }
              if (0 == ConfirmedEmailAvailabilityValidator.field_q) {
                this.a(MidiNoteMask.field_n, 320, var8Lifetime2, var9, 105);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
                this.a(ah.field_D, 320, var8Lifetime2, var9, 108);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
                this.a(lk.field_b, 320, var8Lifetime2, var9, 103);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
                this.a(va.field_h, 320, var8Lifetime2, var9, param0 ^ 115);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q == 4) {
                this.a(MidiNoteMask.field_n, 320, var8Lifetime2, var9, param0 ^ 116);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q > 0 &&
                ConfirmedEmailAvailabilityValidator.field_q != 4) {
                this.a("<lt>", 170, var8Lifetime2, var9, param0 ^ 117);
              }
              if (ConfirmedEmailAvailabilityValidator.field_q != this.field_kb - 1) {
                this.a(">", 470, var8Lifetime2, var9, 105);
              }
              var9 = var9 + var10;
              var11++;
            }
            boolean decompiledFrameRemainder5 = true;
            if (~var11 != ~this.field_xb && (!(MouseWheelInput.field_b >= 4 + var9 - var10) ||
              !(4 + var9 > MouseWheelInput.field_b) ||
              var6 == 0)) {
              stackIn_137_0 = 16777215;
              decompiledFrameRemainder5 = false;
            }
            else {
              stackIn_137_0 = var12;
            }
            var8Lifetime3 = stackIn_137_0;
            if (var8Lifetime3 == var12) {
              this.field_xb = var11;
            }
            if (Archive.field_a == 0) {
              this.a(UiWidget.field_i, 320, var8Lifetime3, var9, param0 ^ 122);
            }
            if (1 == Archive.field_a) {
              this.a(ta.field_b, 320, var8Lifetime3, var9, 103);
            }
            if (2 == Archive.field_a) {
              this.a(bi.field_a, 320, var8Lifetime3, var9, 104);
            }
            if (0 < Archive.field_a) {
              this.a("<lt>", 195, var8Lifetime3, var9, 120);
            }
            if (Archive.field_a < this.field_K - 1) {
              this.a(">", 445, var8Lifetime3, var9, 105);
            }
            boolean decompiledFrameRemainder4 = true;
            var9 = var9 + var10;
            var11++;
            if (~var11 != ~this.field_xb && (!((var9 - var10) <= MouseWheelInput.field_b) ||
              !(var9 + 4 > MouseWheelInput.field_b) ||
              var6 == 0)) {
              stackIn_171_0 = 16777215;
              decompiledFrameRemainder4 = false;
            }
            else {
              stackIn_171_0 = var12;
            }
            var8Lifetime4 = stackIn_171_0;
            if (~var12 == ~var8Lifetime4) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder3 = true;
            FrameTimer.field_f.drawRightAligned(sk.field_d, 320, var9, var8Lifetime4, 1);
            FrameTimer.field_f.drawString("--------------", 320, var9, var8Lifetime4, 1);
            this.a("|", 100 * SectorCacheStore.field_e / 128 + 320, var8Lifetime4, var9, 118);
            var9 = var9 + var10;
            var11++;
            if (~this.field_xb != ~var11 && (!(MouseWheelInput.field_b >= var9 - var10 + 4) ||
              !(MouseWheelInput.field_b < (var9 + 4)) ||
              var6 == 0)) {
              stackIn_188_0 = 16777215;
              decompiledFrameRemainder3 = false;
            }
            else {
              stackIn_188_0 = var12;
            }
            var8Lifetime5 = stackIn_188_0;
            if (~var12 == ~var8Lifetime5) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder2 = true;
            FrameTimer.field_f.drawRightAligned(qb.field_d, 320, var9, var8Lifetime5, 1);
            FrameTimer.field_f.drawString("--------------", 320, var9, var8Lifetime5, 1);
            this.a("|", 320 + AccountCreationResultPanel.field_sb * 100 / 128, var8Lifetime5, var9, 106);
            var11++;
            var9 = var9 + var10;
            if (var11 != this.field_xb && (!(4 - var10 + var9 <= MouseWheelInput.field_b) ||
              !(MouseWheelInput.field_b < (4 + var9)) ||
              var6 == 0)) {
              stackIn_204_0 = 16777215;
              decompiledFrameRemainder2 = false;
            }
            else {
              stackIn_204_0 = var12;
            }
            var8Lifetime6 = stackIn_204_0;
            if (~var12 == ~var8Lifetime6) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder1 = true;
            this.a(uj.field_a, 320, var8Lifetime6, var9, 103);
            var11++;
            var9 = var9 + var10;
            if (~var11 != ~this.field_xb && (!(MouseWheelInput.field_b >= -var10 + (var9 + 4)) ||
              !((4 + var9) > MouseWheelInput.field_b) ||
              var6 == 0)) {
              stackIn_221_0 = 16777215;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_221_0 = var12;
            }
            var8Lifetime7 = stackIn_221_0;
            if (~var8Lifetime7 == ~var12) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder0 = true;
            this.a(a.field_e, 320, var8Lifetime7, var9, 125);
            var11++;
            var9 = var9 + var10;
            if (~this.field_xb != ~var11 && (!((var9 + (-var10 + 4)) <= MouseWheelInput.field_b) ||
              !(MouseWheelInput.field_b < 4 + var9) ||
              var6 == 0)) {
              stackIn_238_0 = 16777215;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_238_0 = var12;
            }
            var8Lifetime8 = stackIn_238_0;
            if (~var8Lifetime8 == ~var12) {
              this.field_xb = var11;
            }
            if (!this.field_Gb) {
              boolean decompiledFrameRemainder10 = true;
              this.a(bj.field_h, 320, var8Lifetime8, var9, 107);
              var11++;
              var9 = var9 + var10;
              if (var11 != this.field_xb && (!(MouseWheelInput.field_b >= 4 + (-var10 + var9)) ||
                !((var9 + 4) > MouseWheelInput.field_b) ||
                var6 == 0)) {
                stackIn_258_0 = 16777215;
                decompiledFrameRemainder10 = false;
              }
              else {
                stackIn_258_0 = var12;
              }
              var8Lifetime8 = stackIn_258_0;
              if (~var8Lifetime8 == ~var12) {
                this.field_xb = var11;
              }
              boolean decompiledFrameRemainder9 = true;
              this.a(ra.field_j, 320, var8Lifetime8, var9, param0 + 117);
              var9 = var9 + var10;
              var11++;
              if (var11 != this.field_xb && (!(MouseWheelInput.field_b >= (4 + (-var10 + var9))) ||
                !(MouseWheelInput.field_b < var9 + 4) ||
                var6 == 0)) {
                stackIn_275_0 = 16777215;
                decompiledFrameRemainder9 = false;
              }
              else {
                stackIn_275_0 = var12;
              }
              var8Lifetime8 = stackIn_275_0;
              if (~var8Lifetime8 == ~var12) {
                this.field_xb = var11;
              }
              this.a(ModalDialog.field_I, 320, var8Lifetime8, var9, param0 + 103);
              var11++;
              var9 = var9 + var10;
            }
            if (~this.field_xb != ~var5) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(24, 22);
            }
            SoftwareRasterizer.resetClip();
            k.field_f.setAsRasterTarget(0);
          }
          this.v(param0 ^ param0);
          this.i((byte) 108);
          TutorialText.field_e.drawOpaque(0, 0);
          FrameTimer.field_e.drawOpaque(0, 439);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.GB(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        Object stackIn_77_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12_int = 0;
        Sprite var12 = null;
        int var13 = 0;
        Sprite var12Lifetime1;
        Sprite var12Lifetime2;
        Sprite var12Lifetime3;
        var13 = field_V;
        try {
          var2_int = 611;
          this.a(true, var2_int);
          this.f(true);
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var3 = 320;
            var4 = 240;
            this.a(-3407, var4, var3);
            this.field_X.a(true, false);
            if (!this.field_X.field_u) {
              var6 = 110;
              var8 = 1;
              var9 = 1;
              var10 = 0;
              var11 = null;
              this.a(0, 355, 284, 92, 95);
              var5 = 0;
              while (true) {
                if (var5 < 12) {
                  stackIn_77_0 = null;
                  if (var13 == 0) {
                    if (stackIn_77_0 != this.field_X.units[var5] &&
                      this.field_X.units[var5].field_Z != null) {
                      var7 = this.field_X.units[var5].field_Z.a(-1426, 87);
                      var12_int = 8421504;
                      if (var8 > 0) {
                        var12_int = wa.field_s;
                        var8--;
                      }
                      if (null == this.field_X.units[var5].tile) {
                        if (null == var11) {
                          var11 = this.field_X.units[var5].field_Z;
                        }
                        var9 = 0;
                      } else {
                        var8 = 1;
                        var12_int = (4144959 & wa.field_s >> 2) + ((16711422 & wa.field_s) >> 1);
                        var10 = 1;
                      }
                      AccountRequestState.field_f.drawString(var7, 360, var6, var12_int, -1);
                      var6 += 20;
                    }
                    var5++;
                    continue;
                  }
                } else {
                  this.a(0, 461, 150, 92, 160);
                  if (var10 != 0) {
                    this.field_lb.draw(351, 386);
                    if (ef.field_j >= 351 &&
                      ef.field_j < this.field_lb.field_r + 351 &&
                      386 <= MouseWheelInput.field_b &&
                      MouseWheelInput.field_b < (386 + this.field_lb.field_t)) {
                      SoftwareRasterizer.fillRectangleAlpha(351, 386, this.field_lb.field_r, this.field_lb.field_t, 16777215, 64);
                    }
                  }
                  if (var10 != 0) {
                    if (var9 == 0) {
                      AccountRequestState.field_f.drawParagraph(bl.field_g + "<br><br>" + SocketConnector.field_c, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                      if (var13 != 0) {
                        AccountRequestState.field_f.drawParagraph(SocketConnector.field_c, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                        AccountRequestState.field_f.drawParagraph(bl.field_g, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                      }
                    } else {
                      AccountRequestState.field_f.drawParagraph(SocketConnector.field_c, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                      if (var13 != 0) {
                        AccountRequestState.field_f.drawParagraph(bl.field_g, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                      }
                    }
                  } else {
                    AccountRequestState.field_f.drawParagraph(bl.field_g, 466, 92, 150, 150, 16777215, -1, 1, 1, 12);
                  }
                  if (var9 != 0) {
                    this.field_Q.draw(456, 329);
                    if (456 > ef.field_j) {
                      break;
                    }
                    if (ef.field_j >= 624) {
                      break;
                    }
                    if (MouseWheelInput.field_b < 329) {
                      break;
                    }
                    if (MouseWheelInput.field_b >= 413) {
                      break;
                    }
                    SoftwareRasterizer.fillRectangleAlpha(456, 329, 168, 84, 16777215, 128);
                    if (var13 == 0) {
                      break;
                    }
                  }
                  this.a(0, 461, 159, 252, 160);
                  AccountRequestState.field_f.drawString(((ga) (var11)).a(-1426, 160), 470, 263, 65280, -1);
                  if (((ga) (var11)).field_m != null) {
                    var12 = Bzip2State.field_a[((ga) (var11)).field_m.field_f];
                    var12.drawScaled(509, 281, 64, 64);
                  }
                  stackIn_77_0 = null;
                }
                if (stackIn_77_0 != ((ga) (var11)).field_b) {
                  var12Lifetime1 = cc.field_i[((ga) (var11)).field_b.field_g];
                  var12Lifetime1.drawScaled(25 + (-(var12Lifetime1.field_p / 2) + (-(var12Lifetime1.field_r / 4) + 460)), 50 - var12Lifetime1.field_v / 2 + 281 - var12Lifetime1.field_t / 4, 50, 100);
                }
                if (null != ((ga) (var11)).field_A) {
                  var12Lifetime2 = cc.field_i[((ga) (var11)).field_A.field_g];
                  var12Lifetime2.drawScaled(25 + (-(var12Lifetime2.field_r / 4) + 570) - var12Lifetime2.field_p / 2, -(var12Lifetime2.field_t / 4) + 281 - (var12Lifetime2.field_v / 2 - 50), 50, 100);
                }
                if (((ga) (var11)).field_i == null) {
                  break;
                }
                var12Lifetime3 = cc.field_i[((ga) (var11)).field_i.field_g];
                var12Lifetime3.draw(523, 352);
                break;
              }
            }
            k.field_f.setAsRasterTarget(0);
          }
          this.v(0);
          this.i((byte) 58);
          TutorialText.field_e.drawOpaque(0, 0);
          FrameTimer.field_e.drawOpaque(0, 439);
          if (param0 > -95) {
            this.field_Db = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.CB(" + param0 + ')');
        }
    }

    private final void a(int param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = field_V;
        try {
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param2 <= 0))) {
            stackIn_13_0 = 0;
            stackIn_13_1 = 1 & param0;
            if (var6 == 0) {
              if (stackIn_13_0 < stackIn_13_1) {
                param1[pj.field_t] = (byte)ResizableModalDialog.bitwiseOr((int) param1[pj.field_t], 1 << RandomAccessCacheFile.field_b);
              }
              param2--;
              RandomAccessCacheFile.field_b = RandomAccessCacheFile.field_b + 1;
              param0 = param0 >> 1;
              if (RandomAccessCacheFile.field_b < 8) {
                continue;
              }
              pj.field_t = pj.field_t + 1;
              RandomAccessCacheFile.field_b = 0;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = param3;
            stackIn_13_1 = 108;
          }
          if (stackIn_13_0 < stackIn_13_1) {
            this.field_eb = -96;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("Terraphoenix.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void disposeClient(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (a.field_b != null) {
            ga.b((byte) 125);
          }
          if (ModalDialogHost.field_I != null) {
            ModalDialogHost.field_I.dispose();
          }
          var2_int = 117 / ((-52 - param0) / 56);
          AgeValidator.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.C(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = field_V;
        try {
          var4_int = 0;
          do {
            if (var4_int >= 192) {
              var4_int = 191;
              break;
            }
            MusicPatchNode.field_E[var4_int] = (dg.bitwiseAnd(var4_int * dg.bitwiseAnd(16646399, wa.field_s), -33423668) >>> 9) + (dg.bitwiseAnd(33423514, dg.bitwiseAnd(65280, wa.field_s) * var4_int) >> 9);
            var4_int++;
          } while (var6 == 0);
          if (rk.field_c > 449) {
            var4_int = 640 - rk.field_c;
          }
          SoftwareRasterizer.addRadialGlow(param2 << 4, param1 << 4, 2900, var4_int, MusicPatchNode.field_E);
          AccountRequestState.field_f.drawParagraphAlpha(cc.field_l, -(rk.field_c / 2) + 320, -600 - (-(24 * ((0 + nd.field_k) % 50)) - 120), 12, 240, wa.field_s, 0, 64, 1, 1, 24);
          AccountRequestState.field_f.drawParagraphAlpha(cc.field_l, -(rk.field_c / 2) + 320, 120 + (-25 + (nd.field_k + 25) % 50) * 24, 12, 240, wa.field_s, 0, 64, 1, 1, 24);
          AccountRequestState.field_f.drawParagraphAlpha(cc.field_l, 320 - (-(rk.field_c / 2) + 12), 120 + (nd.field_k + 12) % 50 * 24 - 600, 12, 240, wa.field_s, 0, 64, 1, 1, 24);
          AccountRequestState.field_f.drawParagraphAlpha(cc.field_l, rk.field_c / 2 + 320 - 12, 120 + (-25 + (nd.field_k + 37) % 50) * 24, 12, 240, wa.field_s, 0, 64, 1, 1, 24);
          var5 = 0;
          do {
            if (var5 >= 640) {
              var5 = 0;
              break;
            }
            SoftwareRasterizer.drawVerticalLineAlpha(var5, 0, 480, wa.field_s, 64);
            var5 += 4;
          } while (var6 == 0);
          if (param0 != -3407) {
            return;
          }
          while (480 > var5) {
            SoftwareRasterizer.drawHorizontalLineAlpha(0, var5, 640, wa.field_s, 64);
            var5 += 4;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var4), "Terraphoenix.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.c(false);
          }
          stackIn_4_0 = this.b(param1, 2, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_V;
        try {
          boolean decompiledFrameCompleted0 = true;
          ng.field_x = ng.field_x + 1;
          if (Math.random() * 10.0 < (double)(10 - Math.abs(-10 + ProxyAuthenticationRequiredException.field_g))) {
            var2_int = 0;
            while (var2_int < 480) {
              SoftwareRasterizer.setClip(-(rk.field_c >> 1) + 320, var2_int, (rk.field_c >> 1) + 320, 1 + var2_int);
              var3 = (int)(Math.sin((double)(ng.field_x + var2_int) * 0.02) * (double)(640 - rk.field_c >> 2));
              TextHotspotBounds.field_m.drawAdditive(var3, 0, 256);
              SoftwareRasterizer.resetClip();
              var2_int++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var4 != 0)) {
              SoftwareRasterizer.setClip(-(rk.field_c >> 1) + 320, 0, 320 + (rk.field_c >> 1), 480);
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 192);
              TextHotspotBounds.field_m.drawAdditive(0, 0, 256);
              SoftwareRasterizer.resetClip();
            }
          } else {
            SoftwareRasterizer.setClip(-(rk.field_c >> 1) + 320, 0, 320 + (rk.field_c >> 1), 480);
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 192);
            TextHotspotBounds.field_m.drawAdditive(0, 0, 256);
            SoftwareRasterizer.resetClip();
          }
          if (param0 < 54) {
            this.field_Q = (Sprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.AC(" + param0 + ')');
        }
    }

    private final void a(int param0, byte[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, param1, 6, 121);
          if (param2 != 16419) {
            this.A(117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Terraphoenix.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ja.field_i = 13;
          if (param0 != 16777215) {
            this.a((String) null, -96, -14, -93, -127);
          }
          ll.a((byte) 49, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.VB(" + param0 + ')');
        }
    }

    private final void c(byte[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param2, param0, 2, param1 - 522);
          if (param1 != 640) {
            this.field_rb = 39;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Terraphoenix.IA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_V;
        try {
          this.field_nb[param0] = new ga();
          this.field_nb[param0].field_b = null;
          this.field_nb[param0].field_A = new oh(0);
          if (param1 >= -67) {
            this.x(-79);
          }
          boolean decompiledFrameRemainder1 = true;
          this.field_nb[param0].field_i = null;
          this.field_qb = param0;
          if (this.field_I.field_d[3] > 0) {
            this.field_nb[param0].field_m.field_f = 3;
            this.field_I.field_d[3] = this.field_I.field_d[3] - 1;
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_I.field_d[2] <= 0) {
              if (!(0 >= this.field_I.field_d[1])) {
                this.field_nb[param0].field_m.field_f = 1;
                this.field_I.field_d[1] = this.field_I.field_d[1] - 1;
                if (var4 != 0) {
                  this.field_nb[param0].field_m.field_f = 2;
                  this.field_I.field_d[2] = this.field_I.field_d[2] - 1;
                }
              }
            } else {
              this.field_nb[param0].field_m.field_f = 2;
              this.field_I.field_d[2] = this.field_I.field_d[2] - 1;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var3_int = -sj.field_a[this.field_nb[param0].field_m.field_f].field_f + this.field_nb[param0].field_v;
          if (!(this.field_I.field_a[16] > 0) ||
            !(var3_int >= od.field_c[16].field_s)) {
            if (this.field_I.field_a[10] > 0 &&
              var3_int >= od.field_c[10].field_s) {
              this.field_nb[param0].field_b = new oh(10);
              this.field_I.field_a[10] = this.field_I.field_a[10] - 1;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!(this.field_I.field_a[7] > 0) ||
                !(od.field_c[7].field_s <= var3_int)) {
                if (this.field_I.field_a[18] > 0 &&
                  var3_int >= od.field_c[18].field_s) {
                  this.field_nb[param0].field_b = new oh(18);
                  this.field_I.field_a[18] = this.field_I.field_a[18] - 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_I.field_a[2] > 0 &&
                    var3_int >= od.field_c[2].field_s) {
                    this.field_nb[param0].field_b = new oh(2);
                    this.field_I.field_a[2] = this.field_I.field_a[2] - 1;
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (!(0 < this.field_I.field_a[3]) ||
                      !(od.field_c[3].field_s <= var3_int)) {
                      if ((!(this.field_I.field_a[1] <= 0)) &&
                        (!(od.field_c[1].field_s > var3_int))) {
                        this.field_nb[param0].field_b = new oh(1);
                        this.field_I.field_a[1] = this.field_I.field_a[1] - 1;
                        if (var4 != 0) {
                          this.field_nb[param0].field_A = new oh(3);
                          this.field_I.field_a[3] = this.field_I.field_a[3] - 1;
                          this.field_nb[param0].field_b = new oh(7);
                          this.field_I.field_a[7] = this.field_I.field_a[7] - 1;
                          this.field_nb[param0].field_b = new oh(16);
                          this.field_I.field_a[16] = this.field_I.field_a[16] - 1;
                        }
                      }
                    } else {
                      this.field_nb[param0].field_A = new oh(3);
                      this.field_I.field_a[3] = this.field_I.field_a[3] - 1;
                      if (var4 != 0) {
                        this.field_nb[param0].field_b = new oh(7);
                        this.field_I.field_a[7] = this.field_I.field_a[7] - 1;
                        this.field_nb[param0].field_b = new oh(16);
                        this.field_I.field_a[16] = this.field_I.field_a[16] - 1;
                      }
                    }
                  }
                }
              } else {
                this.field_nb[param0].field_b = new oh(7);
                this.field_I.field_a[7] = this.field_I.field_a[7] - 1;
                if (var4 != 0) {
                  this.field_nb[param0].field_b = new oh(16);
                  this.field_I.field_a[16] = this.field_I.field_a[16] - 1;
                }
              }
            }
          } else {
            this.field_nb[param0].field_b = new oh(16);
            this.field_I.field_a[16] = this.field_I.field_a[16] - 1;
          }
          if (null != this.field_nb[param0].field_b) {
            var3_int = var3_int - od.field_c[this.field_nb[param0].field_b.field_g].field_s;
          }
          if (this.field_nb[param0].field_A != null) {
            var3_int = var3_int - od.field_c[this.field_nb[param0].field_A.field_g].field_s;
          }
          if (!(this.field_I.field_a[11] > 0) ||
            !(var3_int >= od.field_c[11].field_s) ||
            !od.field_c[11].field_t) {
            if ((!(this.field_I.field_a[5] <= 0)) &&
              (!(od.field_c[5].field_s > var3_int))) {
              this.field_nb[param0].field_i = new oh(5);
              this.field_nb[param0].field_i.field_d = 1;
              this.field_I.field_a[5] = this.field_I.field_a[5] - 1;
              var3_int = var3_int - od.field_c[5].field_s;
              if (var4 != 0) {
                this.field_nb[param0].field_i = new oh(11);
                this.field_nb[param0].field_i.field_d = 1;
                this.field_I.field_a[11] = this.field_I.field_a[11] - 1;
                var3_int = var3_int - od.field_c[11].field_s;
              }
            }
          } else {
            this.field_nb[param0].field_i = new oh(11);
            this.field_nb[param0].field_i.field_d = 1;
            this.field_I.field_a[11] = this.field_I.field_a[11] - 1;
            var3_int = var3_int - od.field_c[11].field_s;
          }
          if (null == this.field_nb[param0].field_b &&
            var3_int >= od.field_c[17].field_s &&
            this.field_I.field_a[17] > 0 &&
            od.field_c[17].field_t) {
            this.field_nb[param0].field_b = new oh(17);
            this.field_I.field_a[17] = this.field_I.field_a[17] - 1;
          }
          boolean decompiledSharedTail0 = (null == this.field_nb[param0].field_b);
          if (!decompiledSharedTail0) {
            MusicPatch.playIndexedSoundEffectWithIntGuard(88, od.field_c[this.field_nb[param0].field_b.field_g].field_n);
            decompiledSharedTail0 = (var4 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.field_nb[param0].field_A != null)) {
            MusicPatch.playIndexedSoundEffectWithIntGuard(16, od.field_c[this.field_nb[param0].field_A.field_g].field_n);
          }
          if (this.field_nb[param0].field_m != null) {
            if (this.field_nb[param0].field_m.field_f == 1) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(68, 36);
            }
            if (2 == this.field_nb[param0].field_m.field_f) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(110, 35);
            }
            if (3 == this.field_nb[param0].field_m.field_f) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(28, 39);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var3), "Terraphoenix.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        oh dupTemp$5 = null;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int dupTemp$12 = 0;
        oh dupTemp$13 = null;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        oh dupTemp$16 = null;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        ga stackIn_478_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        rk var7 = null;
        int var8 = 0;
        int var9 = 0;
        ga stackIn_478_0Lifetime1;
        rk var7Lifetime1;
        int fieldTemp$0Lifetime1;
        int fieldTemp$1Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var4Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = field_V;
        try {
          if (ef.field_j >= (-qh.field_b.field_r + 624) &&
            ef.field_j <= 624 &&
            (-qh.field_b.field_t + (464 - this.field_N.field_f)) <= MouseWheelInput.field_b &&
            MouseWheelInput.field_b <= 464 - this.field_N.field_f) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = nd.field_h;
            if (DiskArchiveRequest.field_I == 1) {
              this.field_N.field_b = true;
              ja.field_i = 1;
              MusicPatch.playIndexedSoundEffectWithIntGuard(70, 27);
              if (null != this.field_X) {
                ja.field_i = 2;
              }
            }
          }
          if (!od.field_c[18].field_t &&
            this.field_I.field_a[18] > 0) {
            od.field_c[18].field_t = true;
          }
          if (!od.field_c[4].field_t &&
            this.field_I.field_a[4] > 0) {
            od.field_c[4].field_t = true;
          }
          if (od.field_c[8].field_t &&
            !od.field_c[9].field_t &&
            this.field_I.field_a[9] > 0) {
            od.field_c[9].field_t = true;
          }
          if (od.field_c[12].field_t &&
            !od.field_c[13].field_t &&
            0 < this.field_I.field_a[13]) {
            od.field_c[13].field_t = true;
          }
          var3 = 4;
          if (this.field_Bb > 0) {
            var3 = 8;
          }
          if (this.field_Bb > 3) {
            var3 = 12;
          }
          if (this.field_Bb > 12) {
            var3 = 0;
          }
          var4 = 0;
          var5 = 0;
          var6 = 0;
          while (var6 < 12) {
            stackIn_478_0 = this.field_nb[var6];
            if (var9 != 0) {
              while (true) {
                if (stackIn_478_0 != null) {
                  MusicPatch.playIndexedSoundEffectWithIntGuard(62, 24);
                  while (true) {
                    if (lf.field_c == 96) {
                      while (true) {
                        fieldTemp$0 = this.field_qb - 1;
                        this.field_qb = this.field_qb - 1;
                        if (fieldTemp$0 < 0) {
                          this.field_qb = 11;
                        }
                        if (null == this.field_nb[this.field_qb]) {
                          continue;
                        }
                        break;
                      }
                      MusicPatch.playIndexedSoundEffectWithIntGuard(65, 25);
                    }
                    if (lf.field_c == 13) {
                      ja.field_i = 1;
                      this.field_N.field_b = true;
                      MusicPatch.playIndexedSoundEffectWithIntGuard(105, 27);
                      return;
                    }
                    if (!DefaultTextWidgetRenderer.d(1)) {
                      return;
                    }
                    if (lf.field_c == 97) {
                      break;
                    }
                    if (lf.field_c == 69) {
                      break;
                    }
                  }
                }
                fieldTemp$1 = this.field_qb + 1;
                this.field_qb = this.field_qb + 1;
                if (fieldTemp$1 >= 12) {
                  this.field_qb = 0;
                }
                stackIn_478_0 = this.field_nb[this.field_qb];
              }
            }
            if (stackIn_478_0 != null) {
              var5++;
            }
            var6++;
            if (var9 == 0) {
              continue;
            }
            break;
          }
          if (var5 < var3) {
            var5 = var3;
          }
          if (1 < var5) {
            var6 = 570 / (-1 + var5);
          }
          if (1 >= var5 ||
            var9 != 0) {
            var6 = 90;
          }
          if (param0 < var6) {
            var6 = 90;
          }
          var7_int = -1 + var5;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7_int < 0))) {
            var8 = var6;
            stackIn_121_0 = this.field_qb;
            stackIn_121_1 = var7_int;
            if (var9 == 0) {
              if (stackIn_121_0 == stackIn_121_1) {
                var8 = 90;
              }
              var4Lifetime1 = var7_int * var6;
              if (var7_int > this.field_qb) {
                var4Lifetime1 = var4Lifetime1 + (-var6 + 90);
              }
              if (ef.field_j >= var4Lifetime1 &&
                MouseWheelInput.field_b >= 371 &&
                394 >= MouseWheelInput.field_b &&
                var4Lifetime1 + var8 >= ef.field_j) {
                var2_int = this.field_D - 1;
                this.field_Eb = new String[1];
                if (null == this.field_nb[var7_int]) {
                  this.field_Eb[0] = kf.field_c;
                } else {
                  this.field_Eb[0] = SecondaryNodeDequeIterator.field_b + this.field_nb[var7_int].b(1);
                }
                if (1 == DiskArchiveRequest.field_I) {
                  MusicPatch.playIndexedSoundEffectWithIntGuard(80, 33);
                  if (null != this.field_nb[var7_int]) {
                    this.field_qb = var7_int;
                  } else {
                    this.field_ob = false;
                    this.a(var7_int, (byte) -104);
                  }
                }
              }
              var7_int--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_121_0 = -1;
            stackIn_121_1 = ~this.field_gb;
          }
          if (stackIn_121_0 > stackIn_121_1) {
            this.field_Eb = new String[1];
            var2_intLifetime1 = this.field_gb - 1;
            this.field_Eb[0] = EmailFormatValidator.field_n + od.field_c[var2_intLifetime1].field_j;
          }
          if (0 > this.field_gb) {
            this.field_Eb = new String[1];
            var2_intLifetime2 = -1 - this.field_gb;
            this.field_Eb[0] = EmailFormatValidator.field_n + sj.field_a[var2_intLifetime2].field_m;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_gb > 0) {
            var2_intLifetime3 = -1 + this.field_gb;
            var7 = this.field_I;
            if ((!this.field_yb) &&
              (decompiledFrameRemainder1 = (DiskArchiveRequest.field_I != 0)) &&
              (decompiledFrameRemainder1 = (null != this.field_nb[this.field_qb]))) {
              if (var2_intLifetime3 != 0 &&
                3 != var2_intLifetime3 &&
                8 != var2_intLifetime3 &&
                var2_intLifetime3 != 12 &&
                var2_intLifetime3 != 5 &&
                var2_intLifetime3 != 11) {
                if (null == this.field_nb[this.field_qb].field_b) {
                  this.field_nb[this.field_qb].field_b = new oh(var2_intLifetime3);
                  MusicPatch.playIndexedSoundEffectWithIntGuard(31, od.field_c[var2_intLifetime3].field_n);
                  var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                  decompiledFrameRemainder1 = (var9 != 0);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (this.field_nb[this.field_qb].field_b.field_g != var2_intLifetime3))) {
                  dupTemp$2 = this.field_nb[this.field_qb].field_b.field_g;
                  var7.field_a[dupTemp$2] = var7.field_a[dupTemp$2] + 1;
                  this.field_nb[this.field_qb].field_b = new oh(var2_intLifetime3);
                  MusicPatch.playIndexedSoundEffectWithIntGuard(99, od.field_c[var2_intLifetime3].field_n);
                  var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                  decompiledFrameRemainder1 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if (var2_intLifetime3 == 0 ||
                  var2_intLifetime3 == 3 ||
                  var2_intLifetime3 == 8 ||
                  var2_intLifetime3 == 12) {
                  if (null == this.field_nb[this.field_qb].field_A) {
                    this.field_nb[this.field_qb].field_A = new oh(var2_intLifetime3);
                    MusicPatch.playIndexedSoundEffectWithIntGuard(61, od.field_c[var2_intLifetime3].field_n);
                    var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                    decompiledFrameRemainder1 = (var9 != 0);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder1 = (~var2_intLifetime3 != ~this.field_nb[this.field_qb].field_A.field_g))) {
                    dupTemp$3 = this.field_nb[this.field_qb].field_A.field_g;
                    var7.field_a[dupTemp$3] = var7.field_a[dupTemp$3] + 1;
                    this.field_nb[this.field_qb].field_A = new oh(var2_intLifetime3);
                    MusicPatch.playIndexedSoundEffectWithIntGuard(25, od.field_c[var2_intLifetime3].field_n);
                    var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                    decompiledFrameRemainder1 = (var9 != 0);
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (5 == var2_intLifetime3 ||
                  var2_intLifetime3 == 11))) {
                  if (this.field_nb[this.field_qb].field_i == null) {
                    this.field_nb[this.field_qb].field_i = new oh(var2_intLifetime3);
                    MusicPatch.playIndexedSoundEffectWithIntGuard(49, od.field_c[var2_intLifetime3].field_n);
                    this.field_nb[this.field_qb].field_i.field_d = 1;
                    var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                    decompiledFrameRemainder1 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (var2_intLifetime3 != this.field_nb[this.field_qb].field_i.field_g) {
                      dupTemp$4 = this.field_nb[this.field_qb].field_i.field_g;
                      var7.field_a[dupTemp$4] = var7.field_a[dupTemp$4] + this.field_nb[this.field_qb].field_i.field_d;
                      this.field_nb[this.field_qb].field_i = new oh(var2_intLifetime3);
                      MusicPatch.playIndexedSoundEffectWithIntGuard(34, od.field_c[var2_intLifetime3].field_n);
                      this.field_nb[this.field_qb].field_i.field_d = 1;
                      var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                      decompiledFrameRemainder1 = (var9 != 0);
                    }
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder1 = !(this.field_nb[this.field_qb].field_i.field_d >= 8))) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(114, od.field_c[var2_intLifetime3].field_n);
                      dupTemp$5 = this.field_nb[this.field_qb].field_i;
                      dupTemp$5.field_d = dupTemp$5.field_d + 1;
                      var7.field_a[var2_intLifetime3] = var7.field_a[var2_intLifetime3] - 1;
                      decompiledFrameRemainder1 = (var9 != 0);
                    }
                  }
                }
              }
            }
            if (decompiledFrameRemainder1) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = NodeHashTableIterator.field_b + od.field_c[var2_intLifetime3].field_j;
              if (DiskArchiveRequest.field_I != 0 &&
                this.field_Fb > 0 &&
                this.field_I.field_a[var2_intLifetime3] <= 50) {
                this.field_Fb = this.field_Fb - 1;
                var8Lifetime1 = 1;
                if (var2_intLifetime3 == 3) {
                  var8Lifetime1 = 2;
                }
                if (var2_intLifetime3 == 5) {
                  var8Lifetime1 = 4;
                }
                if (5 == var2_intLifetime3 &&
                  od.field_c[11].field_t) {
                  var8Lifetime1 = 8;
                }
                if (2 == var2_intLifetime3 &&
                  od.field_c[10].field_t) {
                  var8Lifetime1 = 2;
                }
                if (var2_intLifetime3 == 18 &&
                  od.field_c[10].field_t) {
                  var8Lifetime1 = 2;
                }
                if (var2_intLifetime3 == 7 &&
                  od.field_c[16].field_t) {
                  var8Lifetime1 = 2;
                }
                if (var2_intLifetime3 == 6 &&
                  od.field_c[16].field_t) {
                  var8Lifetime1 = 2;
                }
                if (var2_intLifetime3 == 2 &&
                  od.field_c[16].field_t) {
                  var8Lifetime1 = 4;
                }
                if (var2_intLifetime3 == 18 &&
                  od.field_c[16].field_t) {
                  var8Lifetime1 = 4;
                }
                this.field_I.field_a[var2_intLifetime3] = this.field_I.field_a[var2_intLifetime3] + var8Lifetime1;
                MusicPatch.playIndexedSoundEffectWithIntGuard(106, 24);
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_gb < 0) {
            var2_intLifetime4 = -1 - this.field_gb;
            var7Lifetime1 = this.field_I;
            if (this.field_yb) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = NodeHashTableIterator.field_b + sj.field_a[var2_intLifetime4].field_m;
              decompiledFrameRemainder0 = (DiskArchiveRequest.field_I != 0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(0 >= this.field_Fb))) {
                this.field_Fb = this.field_Fb - 1;
                var8Lifetime2 = 1;
                if (1 == var2_intLifetime4 &&
                  sj.field_a[2].field_l) {
                  var8Lifetime2 = 2;
                }
                if (1 == var2_intLifetime4 &&
                  sj.field_a[3].field_l) {
                  var8Lifetime2 = 4;
                }
                if (var2_intLifetime4 == 2 &&
                  sj.field_a[3].field_l) {
                  var8Lifetime2 = 2;
                }
                this.field_I.field_d[var2_intLifetime4] = this.field_I.field_d[var2_intLifetime4] + var8Lifetime2;
                MusicPatch.playIndexedSoundEffectWithIntGuard(60, 24);
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (DiskArchiveRequest.field_I != 0)) {
              if (null == this.field_nb[this.field_qb].field_m) {
                this.field_nb[this.field_qb].field_m = new pc();
                if (var9 != 0) {
                  dupTemp$6 = this.field_nb[this.field_qb].field_m.field_f;
                  var7Lifetime1.field_d[dupTemp$6] = var7Lifetime1.field_d[dupTemp$6] + 1;
                }
              } else {
                dupTemp$6 = this.field_nb[this.field_qb].field_m.field_f;
                var7Lifetime1.field_d[dupTemp$6] = var7Lifetime1.field_d[dupTemp$6] + 1;
              }
              this.field_nb[this.field_qb].field_m.field_f = var2_intLifetime4;
              if (var2_intLifetime4 == 1) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(78, 36);
              }
              if (2 == var2_intLifetime4) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(119, 35);
              }
              if (var2_intLifetime4 == 3) {
                MusicPatch.playIndexedSoundEffectWithIntGuard(72, 39);
              }
              var7Lifetime1.field_d[var2_intLifetime4] = var7Lifetime1.field_d[var2_intLifetime4] - 1;
            }
          }
          if (ef.field_j >= 361 &&
            138 <= MouseWheelInput.field_b &&
            ef.field_j <= 436 &&
            288 >= MouseWheelInput.field_b &&
            null != this.field_nb[this.field_qb].field_b) {
            if (this.field_nb[this.field_qb].field_b != null) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = gi.field_q + od.field_c[this.field_nb[this.field_qb].field_b.field_g].field_j;
            }
            if (DiskArchiveRequest.field_I != 0) {
              dupTemp$7 = this.field_nb[this.field_qb].field_b.field_g;
              this.field_I.field_a[dupTemp$7] = this.field_I.field_a[dupTemp$7] + 1;
              this.field_nb[this.field_qb].field_b = null;
              MusicPatch.playIndexedSoundEffectWithIntGuard(120, 34);
            }
          }
          if (ef.field_j >= 556 &&
            MouseWheelInput.field_b >= 138 &&
            631 >= ef.field_j &&
            250 >= MouseWheelInput.field_b &&
            this.field_nb[this.field_qb].field_A != null) {
            if (this.field_nb[this.field_qb].field_A.field_g != 0) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = gi.field_q + od.field_c[this.field_nb[this.field_qb].field_A.field_g].field_j;
            }
            if (DiskArchiveRequest.field_I != 0) {
              dupTemp$8 = this.field_nb[this.field_qb].field_A.field_g;
              this.field_I.field_a[dupTemp$8] = this.field_I.field_a[dupTemp$8] + 1;
              this.field_nb[this.field_qb].field_A = null;
              if (0 < this.field_I.field_a[0]) {
                this.field_nb[this.field_qb].field_A = new oh(0);
                dupTemp$9 = this.field_nb[this.field_qb].field_A.field_g;
                this.field_I.field_a[dupTemp$9] = this.field_I.field_a[dupTemp$9] - 1;
              }
              MusicPatch.playIndexedSoundEffectWithIntGuard(37, 34);
            }
          }
          if (ef.field_j >= 453 &&
            MouseWheelInput.field_b >= 138 &&
            ef.field_j <= 540 &&
            MouseWheelInput.field_b <= 225 &&
            null != this.field_nb[this.field_qb].field_m) {
            if (0 != this.field_nb[this.field_qb].field_m.field_f) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = gi.field_q + sj.field_a[this.field_nb[this.field_qb].field_m.field_f].field_m;
            }
            if (DiskArchiveRequest.field_I != 0) {
              dupTemp$10 = this.field_nb[this.field_qb].field_m.field_f;
              this.field_I.field_d[dupTemp$10] = this.field_I.field_d[dupTemp$10] + 1;
              this.field_nb[this.field_qb].field_m.field_f = 0;
              if (0 < this.field_I.field_d[0]) {
                this.field_I.field_d[0] = this.field_I.field_d[0] - 1;
              }
              MusicPatch.playIndexedSoundEffectWithIntGuard(81, 34);
            }
          }
          if (ef.field_j >= 578 &&
            MouseWheelInput.field_b >= 272 &&
            ef.field_j <= 628 &&
            MouseWheelInput.field_b <= 322 &&
            null != this.field_nb[this.field_qb].field_i) {
            if (this.field_nb[this.field_qb].field_i != null) {
              this.field_Eb = new String[1];
              this.field_Eb[0] = gi.field_q + od.field_c[this.field_nb[this.field_qb].field_i.field_g].field_j;
            }
            if (DiskArchiveRequest.field_I != 0) {
              dupTemp$11 = this.field_nb[this.field_qb].field_i.field_g;
              this.field_I.field_a[dupTemp$11] = this.field_I.field_a[dupTemp$11] + this.field_nb[this.field_qb].field_i.field_d;
              this.field_nb[this.field_qb].field_i = null;
              MusicPatch.playIndexedSoundEffectWithIntGuard(22, 34);
            }
          }
          if (578 <= ef.field_j &&
            MouseWheelInput.field_b >= 312 &&
            ef.field_j <= 590 &&
            MouseWheelInput.field_b <= 334 &&
            this.field_nb[this.field_qb].field_i != null) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = lf.field_b;
            if (0 != DiskArchiveRequest.field_I) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(65, 25);
              dupTemp$12 = this.field_nb[this.field_qb].field_i.field_g;
              this.field_I.field_a[dupTemp$12] = this.field_I.field_a[dupTemp$12] + 1;
              dupTemp$13 = this.field_nb[this.field_qb].field_i;
              fieldTemp$14 = dupTemp$13.field_d - 1;
              dupTemp$13.field_d = dupTemp$13.field_d - 1;
              if (fieldTemp$14 <= 0) {
                this.field_nb[this.field_qb].field_i = null;
              }
            }
          }
          if (ef.field_j >= 616 &&
            312 <= MouseWheelInput.field_b &&
            ef.field_j <= 628 &&
            MouseWheelInput.field_b <= 334 &&
            null != this.field_nb[this.field_qb].field_i &&
            this.field_I.field_a[this.field_nb[this.field_qb].field_i.field_g] > 0 &&
            8 > this.field_nb[this.field_qb].field_i.field_d) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = PcmResampler.field_a;
            if (DiskArchiveRequest.field_I != 0) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(23, 24);
              dupTemp$15 = this.field_nb[this.field_qb].field_i.field_g;
              this.field_I.field_a[dupTemp$15] = this.field_I.field_a[dupTemp$15] - 1;
              dupTemp$16 = this.field_nb[this.field_qb].field_i;
              dupTemp$16.field_d = dupTemp$16.field_d + 1;
            }
          }
          while (true) {
            if (!DefaultTextWidgetRenderer.d(1)) {
              return;
            }
            if (lf.field_c == 97 ||
              lf.field_c == 69) {
              while (true) {
                fieldTemp$1Lifetime1 = this.field_qb + 1;
                this.field_qb = this.field_qb + 1;
                if (fieldTemp$1Lifetime1 >= 12) {
                  this.field_qb = 0;
                }
                stackIn_478_0Lifetime1 = this.field_nb[this.field_qb];
                if (stackIn_478_0Lifetime1 == null) {
                  continue;
                }
                break;
              }
              MusicPatch.playIndexedSoundEffectWithIntGuard(62, 24);
            }
            if (lf.field_c == 96) {
              while (true) {
                fieldTemp$0Lifetime1 = this.field_qb - 1;
                this.field_qb = this.field_qb - 1;
                if (fieldTemp$0Lifetime1 < 0) {
                  this.field_qb = 11;
                }
                if (null == this.field_nb[this.field_qb]) {
                  continue;
                }
                break;
              }
              MusicPatch.playIndexedSoundEffectWithIntGuard(65, 25);
            }
            if (lf.field_c != 13) {
              continue;
            }
            ja.field_i = 1;
            this.field_N.field_b = true;
            MusicPatch.playIndexedSoundEffectWithIntGuard(105, 27);
            if (var9 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.NA(" + param0 + ')');
        }
    }

    private final int a(byte[] param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -113) {
            stackIn_4_0 = this.b(param0, 8, -1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 69;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void l(byte param0) {
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        var13 = field_V;
        try {
          if (TextFieldValidator.field_k != null) {
            TextFieldValidator.field_k.drawOpaque(0, 0);
            if (var13 != 0) {
              this.f(true);
            }
          } else {
            this.f(true);
          }
          var2_int = 280;
          this.a(true, var2_int);
          ab.field_i = -1;
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var3 = 320;
            var4 = 240;
            this.a(-3407, var4, var3);
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 192);
            var5 = this.field_xb;
            if (oh.field_f != 1 &&
              this.field_Z == ef.field_j &&
              this.field_tb == MouseWheelInput.field_b) {
              stackIn_20_0 = 0;
            } else {
              stackIn_20_0 = 1;
            }
            var6 = stackIn_20_0;
            this.field_tb = MouseWheelInput.field_b;
            if (var6 != 0) {
              this.field_xb = -1;
            }
            this.field_Z = ef.field_j;
            if (320 - rk.field_c / 2 <= ef.field_j &&
              320 + rk.field_c / 2 > ef.field_j) {
              stackIn_30_0 = 1;
            } else {
              stackIn_30_0 = 0;
            }
            var7 = stackIn_30_0;
            this.a("<u=ffffff>" + NodeHashTableIterator.field_d, 320, 16777215, 120, 119);
            if (var7 == 0) {
              var6 = 0;
            }
            boolean decompiledFrameRemainder5 = true;
            var9 = 200;
            var10 = 34;
            var11 = 0;
            var12 = 16776960 - wa.field_s;
            if (var11 != this.field_xb && (!(var9 - var10 + 4 <= MouseWheelInput.field_b) ||
              !(MouseWheelInput.field_b < (var9 + 4)) ||
              var6 == 0)) {
              stackIn_47_0 = 16777215;
              decompiledFrameRemainder5 = false;
            }
            else {
              stackIn_47_0 = var12;
            }
            var8 = stackIn_47_0;
            if (~var12 == ~var8) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder4 = true;
            this.a(va.field_c, 320, var8, var9, 116);
            var9 = var9 + var10;
            var11++;
            if (~var11 != ~this.field_xb && (!(MouseWheelInput.field_b >= (4 + (-var10 + var9))) ||
              !(MouseWheelInput.field_b < var9 + 4) ||
              var6 == 0)) {
              stackIn_63_0 = 16777215;
              decompiledFrameRemainder4 = false;
            }
            else {
              stackIn_63_0 = var12;
            }
            var8Lifetime1 = stackIn_63_0;
            if (~var12 == ~var8Lifetime1) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder3 = true;
            FrameTimer.field_f.drawRightAligned(sk.field_d, 320, var9, var8Lifetime1, 1);
            FrameTimer.field_f.drawString("--------------", 320, var9, var8Lifetime1, 1);
            this.a("|", 320 + 100 * SectorCacheStore.field_e / 128, var8Lifetime1, var9, 120);
            var11++;
            var9 = var9 + var10;
            if (var11 != this.field_xb && (!(4 + (var9 - var10) <= MouseWheelInput.field_b) ||
              !(MouseWheelInput.field_b < 4 + var9) ||
              var6 == 0)) {
              stackIn_79_0 = 16777215;
              decompiledFrameRemainder3 = false;
            }
            else {
              stackIn_79_0 = var12;
            }
            var8Lifetime2 = stackIn_79_0;
            if (var12 == var8Lifetime2) {
              this.field_xb = var11;
            }
            FrameTimer.field_f.drawRightAligned(qb.field_d, 320, var9, var8Lifetime2, 1);
            FrameTimer.field_f.drawString("--------------", 320, var9, var8Lifetime2, 1);
            this.a("|", 320 + 100 * AccountCreationResultPanel.field_sb / 128, var8Lifetime2, var9, 111);
            var9 = var9 + var10;
            if (me.field_o > 0) {
              boolean decompiledFrameRemainder2 = true;
              var11++;
              if (~var11 != ~this.field_xb && (!(MouseWheelInput.field_b >= (var9 + (-var10 + 4))) ||
                !(MouseWheelInput.field_b < 4 + var9) ||
                var6 == 0)) {
                stackIn_98_0 = 16777215;
                decompiledFrameRemainder2 = false;
              }
              else {
                stackIn_98_0 = var12;
              }
              var8Lifetime3 = stackIn_98_0;
              if (var12 == var8Lifetime3) {
                this.field_xb = var11;
              }
              this.a(uj.field_a, 320, var8Lifetime3, var9, 107);
              var9 = var9 + var10;
            }
            boolean decompiledFrameRemainder1 = true;
            var11++;
            if (var11 != this.field_xb && (!(MouseWheelInput.field_b >= var9 - var10 + 4) ||
              !((var9 + 4) > MouseWheelInput.field_b) ||
              var6 == 0)) {
              stackIn_115_0 = 16777215;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_115_0 = var12;
            }
            var8Lifetime4 = stackIn_115_0;
            if (~var12 == ~var8Lifetime4) {
              this.field_xb = var11;
            }
            boolean decompiledFrameRemainder0 = true;
            this.a(a.field_e, 320, var8Lifetime4, var9, 113);
            var9 = var9 + var10;
            var11++;
            if (var11 != this.field_xb && (!(4 + (var9 - var10) <= MouseWheelInput.field_b) ||
              !(MouseWheelInput.field_b < (var9 + 4)) ||
              var6 == 0)) {
              stackIn_131_0 = 16777215;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_131_0 = var12;
            }
            var8Lifetime5 = stackIn_131_0;
            if (~var12 == ~var8Lifetime5) {
              this.field_xb = var11;
            }
            if (TutorialText.field_c != 6) {
              this.a(GrowableIntArray.field_g, 320, var8Lifetime5, var9, 113);
              if (var13 != 0) {
                this.a(je.field_b, 320, var8Lifetime5, var9, 111);
              }
            } else {
              this.a(je.field_b, 320, var8Lifetime5, var9, 111);
            }
            var11++;
            var9 = var9 + var10;
            if (~var5 != ~this.field_xb) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(86, 22);
            }
            k.field_f.setAsRasterTarget(0);
          }
          this.v(0);
          if (param0 > -61) {
            this.b(true, -113);
          }
          this.i((byte) 95);
          TutorialText.field_e.drawOpaque(0, 0);
          FrameTimer.field_e.drawOpaque(0, 439);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.JB(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, int param3, String param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          SoftwareRasterizer.fillRectangleAlpha(param1, param3, 192, 50, 0, 128);
          var6_int = 16776960 - wa.field_s;
          if (param2 != -44) {
            this.field_sb = (IndexedSprite) null;
          }
          if (param0 &&
            nd.field_k < 25) {
            var6_int = 16776960;
          }
          if (param1 <= ef.field_j &&
            (param1 + 192) >= ef.field_j &&
            MouseWheelInput.field_b >= param3 &&
            MouseWheelInput.field_b <= (50 + param3)) {
            var6_int = 16777215;
          }
          FrameTimer.field_f.drawParagraph(param4, param1, param3, 192, 50, var6_int, 0, 1, 1, FrameTimer.field_f.field_s);
          SoftwareRasterizer.drawRectangleOutline(param1 - 1, -1 + param3, 194, 52, 0);
          SoftwareRasterizer.drawRectangleOutline(1 + param1, param3 + 1, 190, 48, 0);
          SoftwareRasterizer.drawRectangleOutline(param1, param3, 192, 50, var6_int);
          if (var6_int == 16777215) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("Terraphoenix.BC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void a(byte[] param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param2, param0, 8, 111);
          if (param1 != 16777215) {
            discarded$1 = this.b((byte[]) null, 52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Terraphoenix.IB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 320) {
            field_O = 14;
          }
          kj.field_f = LevelEditor.field_j.readString(-1);
          IntrusiveDeque.field_e = StripedProgressWidget.a((byte) 125, (CharSequence) ((Object) kj.field_f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var1), "Terraphoenix.MA(" + param0 + ')');
        }
    }

    private final void z(int param0) {
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var13Lifetime1;
        int var5Lifetime1Lifetime1;
        var14 = field_V;
        try {
          var2_int = 480;
          this.a(true, var2_int);
          this.f(true);
          ab.field_i = -1;
          if (10 > ProxyAuthenticationRequiredException.field_g) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var3 = 320;
            var4 = 240;
            this.a(-3407, var4, var3);
            qb.field_c.drawOpaque(0, 0);
            var5 = 120 + 4 * FrameTimer.field_f.field_s / 2;
            SoftwareRasterizer.drawRectangleOutline(139, 345, 362, 82, 0);
            SoftwareRasterizer.drawRectangleOutlineAlpha(140, 346, 360, 80, wa.field_s, 128);
            SoftwareRasterizer.drawRectangleOutline(111, 6 + (111 - FrameTimer.field_f.field_s), 418, -6 + (8 + var5) + (18 + FrameTimer.field_f.field_s), 0);
            SoftwareRasterizer.drawRectangleOutlineAlpha(112, -FrameTimer.field_f.field_s + 112 + 6, 416, -6 + (FrameTimer.field_f.field_s + (-120 + (var5 + 128 + 16))), wa.field_s, 128);
            var6 = 40;
            var6Lifetime1 = 144;
            var7 = 350;
            if (TutorialText.field_a <= 0) {
              if (bk.c(-25704)) {
                stackIn_11_0 = 0;
              } else {
                stackIn_11_0 = ef.field_i;
              }
            } else {
              stackIn_11_0 = TutorialText.field_a;
            }
            var8 = stackIn_11_0;
            var9 = 0;
            var10 = 1;
            var11 = mb.b(0, -42) ? 1 : 0;
            var12 = 0;
            scanLoop1: while (true) {
              if (RandomAccessCacheFile.field_g.length > var12) {
                stackIn_160_0 = 0;
                stackIn_160_1 = var8 & 1 << var12;
                if (var14 == 0) {
                  regionExit2: {
                    if (stackIn_160_0 == stackIn_160_1) {
                      if (0 < TutorialText.field_a) {
                        break regionExit2;
                      }
                      if (var12 == 15) {
                        break regionExit2;
                      }
                      if (16 == var12 &&
                        var11 == 0) {
                        break regionExit2;
                      }
                      if (!(me.field_o <= 0) ||
                        var12 == 0 ||
                        1 == var12 ||
                        2 == var12 ||
                        var12 == 3 ||
                        9 == var12) {
                        fh.field_c.drawQuarterSize(var6Lifetime1, var7);
                      } else {
                        ByteStorage.field_b.drawQuarterSize(var6Lifetime1, var7);
                      }
                    } else {
                      hf.field_w[var12].drawQuarterSize(var6Lifetime1, var7);
                    }
                    if (var6Lifetime1 <= ef.field_j &&
                      ef.field_j <= (32 + var6Lifetime1) &&
                      MouseWheelInput.field_b >= var7 &&
                      MouseWheelInput.field_b <= (32 + var7)) {
                      ab.field_i = var12;
                    }
                    if (~ab.field_i == ~var12) {
                      SoftwareRasterizer.drawCircleOutline(15 + var6Lifetime1, var7 + 15, 17, 0);
                      SoftwareRasterizer.drawCircleOutline(var6Lifetime1 + 15, 15 + var7, 15, 0);
                      SoftwareRasterizer.drawCircleOutline(var6Lifetime1 + 15, 15 + var7, 16, 8355711 & wa.field_s >> 1);
                    }
                    if (~wf.field_t == ~var12) {
                      SoftwareRasterizer.drawCircleOutline(var6Lifetime1 + 15, 15 + var7, 18, 0);
                      SoftwareRasterizer.drawCircleOutline(var6Lifetime1 + 15, 15 + var7, 17, wa.field_s);
                    }
                    if (var6Lifetime1 <= ef.field_j &&
                      (32 + var6Lifetime1) >= ef.field_j &&
                      var7 <= MouseWheelInput.field_b &&
                      MouseWheelInput.field_b <= var7 + 32) {
                      ab.field_i = var12;
                    }
                    if (wf.field_t == -1 &&
                      var6Lifetime1 <= ef.field_j &&
                      (32 + var6Lifetime1) >= ef.field_j &&
                      MouseWheelInput.field_b >= var7 &&
                      var7 + 32 >= MouseWheelInput.field_b ||
                      wf.field_t == var12) {
                      FrameTimer.field_f.drawCentred(RandomAccessCacheFile.field_g[var12], 320, 120, 16777215, 0);
                      var10 = 0;
                      if ((var8 & 1 << var12) == 0) {
                        FrameTimer.field_f.drawCentred(hf.field_z, 320, FrameTimer.field_f.field_s + 120, -wa.field_s + 16776960, 0);
                      } else {
                        FrameTimer.field_f.drawCentred(GameKeyHandler.field_b, 320, 120 + FrameTimer.field_f.field_s, 16777215, 0);
                      }
                      var5Lifetime1 = FrameTimer.field_f.field_s * 4 / 2 + 120;
                      if ((1 << var12 & var8) == 0) {
                        if (!(me.field_o <= 0) ||
                          0 == var12 ||
                          1 == var12 ||
                          var12 == 2 ||
                          var12 == 3 ||
                          9 == var12) {
                          fh.field_c.draw(120, var5Lifetime1);
                        } else {
                          ByteStorage.field_b.draw(120, var5Lifetime1);
                        }
                      } else {
                        hf.field_w[var12].draw(120, var5Lifetime1);
                      }
                      var5Lifetime1 = var5Lifetime1 + (AccountRequestState.field_f.field_w + AccountRequestState.field_f.field_w * AccountRequestState.field_f.drawParagraph(InteractiveWidget.field_J[var12].toUpperCase() + "<br>" + "<br>" + i.field_e + ModalDialogHost.field_L[var12] + "<br>" + RichTextWidget.field_L + ImageProducerRasterBuffer.field_m[var12], 268, var5Lifetime1, 252, 480, 16777215, -1, 0, 0, AccountRequestState.field_f.field_w));
                      var13 = 0;
                      while (!(ImageProducerRasterBuffer.field_m[var12] <= var13)) {
                        IsaacCipher.field_k.drawQuarterSize(460 + var13 * -8, 250);
                        var13++;
                      }
                    }
                    incrementValue$0 = var9;
                    var9++;
                    if (incrementValue$0 != 8) {
                      var6Lifetime1 += 40;
                    } else {
                      var6Lifetime1 = 40;
                      var7 += 40;
                      var6Lifetime1 = 184;
                      if (0 == (var8 & 1 << var12)) {
                        var6Lifetime1 += 20;
                      }
                      if (var11 != 0) {
                        var6Lifetime1 -= 20;
                      }
                    }
                  }
                  var12++;
                  continue;
                }
              } else {
                if (var10 == 0) {
                  break scanLoop1;
                }
                var5Lifetime1 = 120 + 5 * FrameTimer.field_f.field_s / 2;
                stackIn_160_0 = var5Lifetime1;
                stackIn_160_1 = FrameTimer.field_f.field_s / 2;
              }
              var5Lifetime1Lifetime1 = stackIn_160_0 + stackIn_160_1;
              FrameTimer.field_f.drawParagraph(kk.field_a, 120, 140, 400, 128, 16777215, 0, 1, 0, FrameTimer.field_f.field_s);
              if (bk.c(-25704)) {
                var12 = FrameTimer.field_f.stringWidth(FullscreenFocusCanvas.field_c);
                var13Lifetime1 = -wa.field_s + 16776960;
                if (ef.field_j >= 320 - var12 / 2 &&
                  ef.field_j <= (320 + var12 / 2) &&
                  240 <= MouseWheelInput.field_b &&
                  (FrameTimer.field_f.field_s + 240) >= MouseWheelInput.field_b) {
                  nd.field_k = nd.field_k + 25;
                  var13Lifetime1 = 16777215;
                  if (nd.field_k > 50) {
                    nd.field_k = nd.field_k - 50;
                  }
                  SoftwareRasterizer.drawVerticalLineAlpha(320 - (var12 / 2 + 50) + nd.field_k, 240, FrameTimer.field_f.field_s, var13Lifetime1, -(5 * nd.field_k) + 255);
                  SoftwareRasterizer.drawVerticalLineAlpha(50 + var12 / 2 + 320 - nd.field_k, 240, FrameTimer.field_f.field_s, var13Lifetime1, 255 - nd.field_k * 5);
                  nd.field_k = nd.field_k - 25;
                  if (!(nd.field_k >= 0)) {
                    nd.field_k = nd.field_k + 50;
                    if (var14 != 0) {
                      SoftwareRasterizer.drawHorizontalLineAlpha(-(var12 / 2) + 320, 240 - (-FrameTimer.field_f.field_s - (50 - nd.field_k) / 2), var12, 16776960 - wa.field_s, -(5 * nd.field_k) + 255);
                      SoftwareRasterizer.drawHorizontalLineAlpha(-(var12 / 2) + 320, 240 - (-nd.field_k + 50) / 2, var12, 16776960 - wa.field_s, 255 - 5 * nd.field_k);
                    }
                  }
                } else {
                  SoftwareRasterizer.drawHorizontalLineAlpha(-(var12 / 2) + 320, 240 - (-FrameTimer.field_f.field_s - (50 - nd.field_k) / 2), var12, 16776960 - wa.field_s, -(5 * nd.field_k) + 255);
                  SoftwareRasterizer.drawHorizontalLineAlpha(-(var12 / 2) + 320, 240 - (-nd.field_k + 50) / 2, var12, 16776960 - wa.field_s, 255 - 5 * nd.field_k);
                }
                FrameTimer.field_f.drawCentred(FullscreenFocusCanvas.field_c, 320, 260, var13Lifetime1, 0);
                SoftwareRasterizer.drawVerticalLineAlpha(-(var12 / 2) + 320 - (50 - nd.field_k), 240, FrameTimer.field_f.field_s, var13Lifetime1, -(nd.field_k * 5) + 255);
                SoftwareRasterizer.drawVerticalLineAlpha(-nd.field_k + 50 + (320 + var12 / 2), 240, FrameTimer.field_f.field_s, var13Lifetime1, -(5 * nd.field_k) + 255);
              }
              break;
            }
            k.field_f.setAsRasterTarget(0);
          }
          this.v(0);
          if (param0 <= 122) {
            this.a(-64, 40, -86, -39, -72);
          }
          this.i((byte) 122);
          qb.field_c.drawOpaque(0, 0);
          FrameTimer.field_e.drawOpaque(0, 439);
          var3Lifetime1 = 320;
          qh.field_b.draw(-(qh.field_b.field_r / 2) + var3Lifetime1, -qh.field_b.field_t + 476);
          if ((-(qh.field_b.field_r / 2) + var3Lifetime1) <= ef.field_j &&
            ef.field_j <= (var3Lifetime1 + qh.field_b.field_r / 2) &&
            MouseWheelInput.field_b >= 476 - qh.field_b.field_t &&
            MouseWheelInput.field_b <= 476) {
            SoftwareRasterizer.fillRectangleAlpha(-(qh.field_b.field_r / 2) + var3Lifetime1, -qh.field_b.field_t + 476, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.EC(" + param0 + ')');
        }
    }

    final void clearClientResources(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          GameKeyHandler.clearStaticReferences(true);
          if (param0 <= 64) {
            this.j((byte) 120);
          }
          re.clearStaticReferences(52);
          lg.resetStaticState(-2);
          hd.clearStaticReferences((byte) 107);
          IntrusiveDeque.clearStaticReferences(-22208);
          MidiPcmStream.c((byte) 107);
          PcmResampler.clearStaticReferences((byte) 89);
          PcmPlayerService.clearStaticReferences();
          SoundCache.clearStaticReferences(18210);
          qa.clearStaticReferences(-79);
          ta.clearStaticReferences(false);
          bi.clearStaticReferences(-89);
          lm.clearStaticReferences(false);
          ie.a((byte) -15);
          lb.clearStaticReferences((byte) -22);
          h.clearStaticReferences(true);
          DiskCacheWorker.a((byte) 110);
          BufferedRandomAccessFile.clearStaticReferences(false);
          BufferedSocket.resetStaticState((byte) 102);
          Archive.clearStaticReferences(127);
          GameShell.clearStaticReferences(-119);
          ClientException.resetStaticState(0);
          GameApplet.c(-25);
          bh.b((byte) 67);
          MouseInputHandler.clearStaticReferences((byte) 110);
          MouseWheelInput.resetStaticState(false);
          SoftwareRasterizer.clearStaticReferences();
          dg.b(true);
          ll.b(1000);
          i.clearStaticReferences(-21307);
          qb.clearStaticReferences(-115);
          fg.clearStaticReferences((byte) -67);
          ed.clearStaticReferences((byte) 63);
          qc.b(16711680);
          ai.clearStaticReferences(134217727);
          dc.clearStaticReferences((byte) -117);
          mm.clearStaticReferences(12797);
          ag.clearStaticReferences((byte) 96);
          a.clearStaticReferences(40);
          pe.clearStaticReferences((byte) -107);
          FrameTimer.c(0);
          RasterBuffer.clearStaticReferences((byte) -116);
          wg.clearStaticReferences((byte) 113);
          FullscreenFocusCanvas.clearStaticReferences(-8917);
          pj.clearStaticReferences(126);
          wj.clearStaticReferences((byte) 24);
          nc.clearStaticReferences(1);
          vl.clearStaticReferences(-1);
          ch.b(6195);
          ga.clearStaticReferences(false);
          rk.clearStaticReferences(0);
          BattleState.b(20);
          LevelEditor.clearStaticReferences((byte) 19);
          TutorialController.clearStaticReferences((byte) -108);
          ol.discardDeclaredStaticReferences(20);
          IntrusiveNode.clearDeclaredStaticReferences(71);
          SpriteState.clearStaticReferences((byte) -55);
          DualLinkNode.clearStaticReferences(7229);
          BitPacketBuffer.clearStaticReferences(-113);
          kk.a((byte) 121);
          oh.clearStaticReferences(6);
          pc.clearStaticReferences(12653);
          BattleUnit.clearStaticReferences(1);
          se.clearStaticReferences(-1);
          MapTile.b(-32);
          rl.clearStaticReferences(-19959);
          PcmPlayerPump.clearStaticReferences((byte) -120);
          il.clearStaticReferences((byte) 113);
          MusicPatchNode.clearStaticReferences(-96);
          MidiFileReader.clearStaticReferences();
          MusicPatchPcmStream.clearStaticReferences((byte) 41);
          p.clearStaticReferences(-24869);
          mh.clearStaticReferences(1);
          BitmapFont.clearStaticReferences();
          fl.clearStaticReferences(827399017);
          ca.clearStaticReferences(109);
          QuickChatMenu.a(-3864);
          li.a(-394132240);
          sj.clearStaticReferences(0);
          rb.clearStaticReferences(-61);
          ModalDialogHost.clearStaticReferences((byte) -57);
          AccountCreationResultPanel.p(38);
          ProgressDialog.resetDeclaredStaticState(true);
          StandardContentDialog.clearDeclaredStaticReferences(true);
          ProgressMessageDialog.discardDeclaredStaticReferences(8);
          AccountRegistrationPanel.clearStaticReferences((byte) 123);
          GuestPlayConfirmationForm.clearStaticReferences(4);
          LoginPanel.a(8);
          DisplayNameSelectionPanel.clearStaticReferences(-13271);
          gd.clearStaticReferences(25284);
          fh.resetStaticState((byte) 81);
          ArchiveIndex.resetStaticState((byte) 13);
          GzipDecompressor.clearStaticReferences(126);
          uj.clearStaticReferences((byte) -92);
          pf.clearStaticReferences(6650);
          bj.a(0);
          u.clearStaticReferences(-78);
          cm.clearStaticReferences((byte) -121);
          nb.b(0);
          LevelMap.b(22120);
          bk.clearStaticReferences(6144);
          gi.clearStaticReferences(-50);
          ug.clearStaticReferences(-11978);
          IndexedSpriteState.clearStaticReferences(-21697);
          AdminCheatOverlay.clearStaticReferences((byte) -121);
          hk.a(true);
          ab.clearStaticReferences(0);
          wa.releaseDeclaredStaticReferences(21834);
          bm.a((byte) 73);
          sl.clearStaticReferences((byte) -58);
          je.clearStaticReferences((byte) -123);
          g.resetStaticState(-1);
          MidiNoteMask.clearStaticReferences((byte) 29);
          MusicPatch.clearStaticReferences((byte) 103);
          MusicPatchEnvelope.clearStaticReferences(8192);
          TutorialText.clearStaticReferences(true);
          RandomAccessCacheFile.clearStaticReferences(1);
          SynthesizerVoice.clearStaticReferences();
          VorbisDecoder.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          kg.clearStaticReferences(7087);
          hl.clearStaticReferences(54);
          NetworkArchiveRequest.d(30937);
          SectorCacheStore.clearStaticReferences(8);
          tb.clearStaticReferences(-18440);
          mc.b((byte) 53);
          ArchiveRequest.a(true);
          IsaacCipher.a(true);
          SocketConnector.clearStaticReferences(11147);
          ProxyAuthenticationRequiredException.clearStaticReferences(-122);
          tg.clearStaticReferences(23);
          bc.clearStaticReferences(false);
          ByteStorage.clearStaticReferences(false);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences((byte) -105);
          MessageKeys.a(77);
          FullscreenStatusDialog.l(0);
          kd.clearStaticReferences(true);
          DefaultTextWidgetRenderer.resetStaticState(69);
          ob.clearStaticReferences();
          nl.clearStaticReferences(true);
          dj.resetStaticState(-81);
          ee.b((byte) 20);
          aj.clearStaticReferences(false);
          ik.clearStaticReferences((byte) 118);
          uk.resetStaticState(-84);
          s.clearStaticReferences((byte) 47);
          vk.clearStaticReferences(10417);
          dm.a(false);
          vb.clearStaticReferences((byte) 79);
          DelegatingCanvas.resetStaticState(6453);
          lk.a(5540);
          ea.clearStaticReferences(true);
          hf.clearStaticReferences((byte) 54);
          f.resetStaticState(-108911807);
          sk.clearStaticReferences(true);
          TextLayout.a((byte) -115);
          UiWidget.resetStaticState(true);
          InteractiveWidget.clearStaticReferences((byte) -82);
          SingleChildWidgetContainer.clearDeclaredStaticReferences((byte) 47);
          ModalDialog.clearStaticReferences(-195);
          WidgetContainer.clearStaticReferences(false);
          k.clearStaticReferences(false);
          va.clearStaticReferences(-65);
          od.a(21);
          mb.clearStaticReferences(true);
          vf.a(29227);
          oe.clearStaticReferences(-82);
          qk.clearStaticReferences(1);
          lf.b(true);
          sa.clearStaticReferences(false);
          ge.resetStaticState(-114);
          pb.a(-22970);
          NanoFrameTimer.clearStaticReferences(1);
          ImageProducerRasterBuffer.clearStaticReferences(77);
          ve.clearStaticReferences(0);
          ef.clearStaticReferences(31955);
          LabeledWidgetContainer.resetStaticState(-5981);
          ValidatedTextField.b(false);
          EditableTextField.m(14653);
          ContentTransitionDialog.releaseDeclaredStaticReferences(-22);
          StripedProgressWidget.clearStaticReferences(true);
          NameSuggestionsPanel.clearStaticReferences((byte) 114);
          RichTextWidget.h(-32015);
          ValidationStatusIcon.clearDeclaredStaticReferences((byte) 121);
          ValidationStatusWidget.clearDeclaredStaticReferences((byte) -112);
          df.clearDeclaredStaticReferences((byte) -106);
          TextFieldValidator.clearStaticReferences((byte) 125);
          fm.clearStaticReferences(-19266);
          RegistrationAgreementPane.g((byte) 123);
          gh.a(-58);
          ig.clearStaticReferences(123);
          SoundFilter.clearStaticReferences();
          ProxySocketConnector.b(-5);
          DirectByteStorage.clearStaticReferences(0);
          RichTextLayout.clearStaticReferences(125);
          GrowableIntArray.clearStaticReferences((byte) -114);
          DraggableWidgetContainer.clearStaticReferences(true);
          DropTargetWidgetContainer.clearStaticReferences((byte) -120);
          rh.clearStaticReferences(33);
          IterableNodeHashTable.a(-1);
          SecondaryNodeDeque.clearStaticReferences(-112);
          be.clearStaticReferences((byte) 100);
          bl.a(false);
          NodeHashTableIterator.a(1);
          SecondaryNodeDequeIterator.clearStaticReferences(55);
          ji.clearStaticReferences(19061);
          nd.c(105);
          fb.clearStaticReferences(6);
          ba.clearStaticReferences(-113);
          ic.clearStaticReferences(true);
          qh.a((byte) -25);
          ng.clearStaticReferences(48);
          ah.a(false);
          kj.clearStaticReferences(-122);
          AlphaWidgetContainer.clearStaticReferences((byte) -128);
          q.resetDeclaredStaticState(0);
          ja.clearStaticReferences(3);
          bb.a(-1);
          eg.resetStaticState((byte) 29);
          jh.d((byte) -122);
          cc.clearStaticReferences((byte) -17);
          th.clearStaticReferences(102);
          AccountRequestState.clearStaticReferences(8934);
          AccountServiceResult.a((byte) 122);
          ec.clearStaticReferences((byte) -82);
          o.resetStaticState(0);
          ra.clearStaticReferences(7876);
          DialogMessagePane.clearStaticReferences((byte) 124);
          kf.clearStaticReferences((byte) -77);
          hb.resetStaticState(-127);
          ml.clearStaticReferences((byte) 53);
          mi.clearStaticReferences((byte) -118);
          FullscreenNoticeType.a(127);
          aa.clearStaticReferences(true);
          me.resetStaticState(true);
          vi.clearStaticReferences((byte) -113);
          bd.clearStaticReferences(-103);
          TextLineMetrics.clearStaticReferences(-119);
          AccountNameAvailabilityValidator.f((byte) -48);
          PasswordValidator.clearStaticReferences(104682000);
          EmailFormatValidator.clearStaticReferences(true);
          ConfirmedEmailAvailabilityValidator.g(0);
          AgeValidator.clearDeclaredStaticReferences((byte) -76);
          MatchingFieldValidator.e((byte) -27);
          rj.b(0);
          TextHotspotBounds.clearStaticReferences(255);
          im.clearStaticReferences(false);
          DebouncedFieldValidator.b(8191);
          oa.clearStaticReferences(7463);
          this.field_bb = null;
          this.field_nb = null;
          this.field_wb = null;
          this.field_zb = null;
          this.field_I = null;
          this.field_sb = null;
          this.field_X = null;
          this.field_w = null;
          this.field_S = null;
          this.field_ab = null;
          this.field_Cb = null;
          this.field_lb = null;
          this.field_T = null;
          this.field_F = null;
          this.field_N = null;
          this.field_Q = null;
          this.field_U = null;
          this.field_Eb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.A(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        Object stackIn_212_0 = null;
        ga stackIn_212_1 = null;
        ga stackIn_215_0 = null;
        int stackIn_239_0 = 0;
        int stackIn_240_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        cc var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_212_0Lifetime1;
        ga stackIn_212_1Lifetime1;
        ga stackIn_215_0Lifetime1;
        var7 = field_V;
        try {
          boolean decompiledFrameRemainder1 = true;
          var3 = 0;
          var4 = 0;
          if ((this.field_X.field_f == 2 && (this.field_X.field_e.field_i != -1 ||
            this.field_X.field_e.field_e == this.field_X.field_e.field_f + this.field_X.field_e.field_h + this.field_X.field_e.field_k)) &&
            (decompiledFrameRemainder1 = !(ef.field_j < 384)) &&
            (decompiledFrameRemainder1 = !(ef.field_j > 576)) &&
            (decompiledFrameRemainder1 = !(MouseWheelInput.field_b < 340)) &&
            (decompiledFrameRemainder1 = !(MouseWheelInput.field_b > 390))) {
            this.field_Eb = new String[1];
            if (DiskArchiveRequest.field_I == 1) {
              var3 = 1;
            }
            this.field_Eb[0] = qa.field_b;
            decompiledFrameRemainder1 = (var7 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (!bk.c(-25704)) {
              if ((12 <= this.field_Bb) &&
                (decompiledFrameRemainder1 = !(ef.field_j < 384)) &&
                (decompiledFrameRemainder1 = !(ef.field_j > 576)) &&
                (decompiledFrameRemainder1 = !(340 > MouseWheelInput.field_b)) &&
                (decompiledFrameRemainder1 = !(MouseWheelInput.field_b > 390))) {
                this.field_Eb = new String[1];
                if (DiskArchiveRequest.field_I == 1) {
                  var3 = 1;
                }
                this.field_Eb[0] = qa.field_b;
                decompiledFrameRemainder1 = (var7 != 0);
              }
              if ((decompiledFrameRemainder1) &&
                (!(12 <= this.field_Bb))) {
                if (ef.field_j >= 384 &&
                  ef.field_j <= 464 &&
                  364 <= MouseWheelInput.field_b &&
                  MouseWheelInput.field_b <= 414) {
                  this.field_Eb = new String[1];
                  if (DiskArchiveRequest.field_I == 1) {
                    var3 = 1;
                    var4 = 1;
                  }
                  this.field_Eb[0] = eg.field_n;
                }
                if ((!(ef.field_j < 496)) &&
                  (!(ef.field_j > 576)) &&
                  (!(364 > MouseWheelInput.field_b)) &&
                  (!(MouseWheelInput.field_b > 414))) {
                  this.field_Eb = new String[1];
                  if (DiskArchiveRequest.field_I == 1) {
                    var3 = 1;
                  }
                  this.field_Eb[0] = rj.field_c;
                  if (var7 != 0) {
                    if (64 <= ef.field_j &&
                      ef.field_j <= 256 &&
                      370 <= MouseWheelInput.field_b &&
                      MouseWheelInput.field_b <= 420 &&
                      DiskArchiveRequest.field_I == 1) {
                      WidgetContainer.a(7, -25786, 7);
                    }
                    if (ef.field_j >= 384 &&
                      ef.field_j <= 576 &&
                      MouseWheelInput.field_b >= 370 &&
                      MouseWheelInput.field_b <= 420) {
                      this.field_Eb = new String[1];
                      this.field_Eb[0] = rj.field_c;
                      if (DiskArchiveRequest.field_I == 1) {
                        var3 = 1;
                      }
                    }
                  }
                }
              }
            } else {
              if (64 <= ef.field_j &&
                ef.field_j <= 256 &&
                370 <= MouseWheelInput.field_b &&
                MouseWheelInput.field_b <= 420 &&
                DiskArchiveRequest.field_I == 1) {
                WidgetContainer.a(7, -25786, 7);
              }
              if (ef.field_j >= 384 &&
                ef.field_j <= 576 &&
                MouseWheelInput.field_b >= 370 &&
                MouseWheelInput.field_b <= 420) {
                this.field_Eb = new String[1];
                this.field_Eb[0] = rj.field_c;
                if (DiskArchiveRequest.field_I == 1) {
                  var3 = 1;
                }
              }
            }
          }
          if (var3 != 0) {
            ProxyAuthenticationRequiredException.field_g = 20;
            MusicPatch.playIndexedSoundEffectWithIntGuard(89, 33);
            ge.field_e = ge.field_e + this.field_X.field_H;
            if (0 != (1 & ef.field_j)) {
              ArchiveIndex.field_e = ArchiveIndex.field_e - this.field_X.field_H;
              if (var7 != 0) {
                oe.field_c = oe.field_c + this.field_X.field_H;
              }
            } else {
              oe.field_c = oe.field_c + this.field_X.field_H;
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted0 = true;
            regionExit1: {
              boolean decompiledFrameCompleted1 = true;
              if (this.field_X.field_f == 2) {
                var5_int = 1;
                var2_int = 0;
                while (var2_int < this.field_nb.length) {
                  stackIn_215_0 = this.field_nb[var2_int];
                  if (var7 != 0) {
                    while (true) {
                      ((ga) (Object) stackIn_215_0).a(this.field_I, -1);
                      while (true) {
                        var2_int++;
                        break regionExit1;
                      }
                    }
                  }
                  if (stackIn_215_0 != null) {
                    var5_int = 0;
                  }
                  var2_int++;
                  if (var7 == 0) {
                    continue;
                  }
                  break;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var5_int != 0 ||
                  !this.field_db &&
                  4 != this.field_Bb &&
                  this.field_Bb != 6 &&
                  (this.field_Bb != 8 ||
                  this.field_vb == 1) &&
                  (this.field_Bb != 10 ||
                  this.field_vb == 2)) {
                  ja.field_i = 8;
                  this.field_cb = 0;
                  this.field_ib = 0;
                  this.field_bb = null;
                  ConfirmedEmailAvailabilityValidator.field_q = -(ConfirmedEmailAvailabilityValidator.field_q + 1);
                  this.field_mb = 0;
                  decompiledFrameRemainder0 = (var7 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var2_int = 0;
                  ja.field_i = 1;
                  var6 = 0;
                  scanLoop2: while (true) {
                    if (var2_int < 12) {
                      while (true) {
                        stackIn_180_0 = ~var2_int;
                        stackIn_180_1 = -13;
                        if (var7 != 0) {
                          break scanLoop2;
                        }
                        if (stackIn_180_0 > stackIn_180_1) {
                          stackIn_212_0 = null;
                          stackIn_212_1 = this.field_nb[var2_int];
                          if (stackIn_212_0 == stackIn_212_1) {
                            var2_int++;
                            continue;
                          }
                        }
                        break;
                      }
                      if (var2_int < 12) {
                        this.field_nb[var6] = this.field_nb[var2_int];
                      }
                      var2_int++;
                      var6++;
                      continue;
                    }
                    stackIn_180_0 = 1;
                    stackIn_180_1 = var6;
                    break;
                  }
                  var2_int = stackIn_180_0 + stackIn_180_1;
                  while (var2_int < 12) {
                    this.field_nb[var2_int] = null;
                    var2_int++;
                    if (var7 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (var7 != 0)) {
                  ja.field_i = 1;
                }
              } else {
                ja.field_i = 1;
              }
              if (decompiledFrameCompleted1) {
                this.field_Db = false;
              }
              decompiledFrameRemainder2 = (ja.field_i == 1);
              if (decompiledFrameRemainder2) {
                if (this.field_Bb == 0 &&
                  Archive.field_a == 0) {
                  this.field_wb = new TutorialController(1);
                  this.field_wb.field_i = this;
                }
                var2_int = 0;
                do {
                  if (var2_int >= 19) {
                    var2_int = 0;
                    break;
                  }
                  this.field_I.field_a[var2_int] = this.field_I.field_a[var2_int] + this.field_X.field_e.field_l.field_a[var2_int];
                  var2_int++;
                } while (var7 == 0);
                while (var2_int < 12) {
                  if (var7 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_212_0Lifetime1 = null;
                  stackIn_212_1Lifetime1 = this.field_nb[var2_int];
                  if (stackIn_212_0Lifetime1 != stackIn_212_1Lifetime1) {
                    stackIn_215_0Lifetime1 = this.field_nb[var2_int];
                    ((ga) (Object) stackIn_215_0Lifetime1).a(this.field_I, -1);
                  }
                  var2_int++;
                }
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameCompleted0)) {
              this.field_Db = false;
            }
            if (decompiledFrameRemainder2) {
              if (!this.field_X.field_r) {
                if (2 <= this.field_Bb &&
                  !this.field_db &&
                  this.field_X.field_f == 1 &&
                  this.field_Bb < 12) {
                  if (11 == this.field_Bb) {
                    stackIn_239_0 = 0;
                    if (this.field_X.field_v) {
                      stackIn_240_1 = 0;
                    } else {
                      stackIn_240_1 = 1;
                    }
                    if (stackIn_239_0 != stackIn_240_1) {
                      this.field_jb = this.field_jb + 1;
                    }
                  } else {
                    this.field_jb = this.field_jb + 1;
                  }
                }
                if (0 < this.field_jb) {
                  ja.field_i = 3;
                }
              }
              if (!this.field_db &&
                !this.field_X.field_r) {
                this.field_Bb = this.field_Bb + 1;
                if (this.field_Bb == 3 ||
                  this.field_Bb == 8 ||
                  11 == this.field_Bb ||
                  this.field_Bb == 14) {
                  ja.field_i = 8;
                  this.field_ib = 0;
                  this.field_cb = 0;
                  gd.field_c = 0;
                  ConfirmedEmailAvailabilityValidator.field_q = ConfirmedEmailAvailabilityValidator.field_q + 1;
                  this.field_mb = 0;
                  this.field_bb = null;
                }
                if (this.field_Bb == 13) {
                  this.field_Db = true;
                  ja.field_i = 2;
                }
              }
            }
            this.field_X = null;
            this.field_db = false;
            if (ja.field_i == 3) {
              this.field_zb = new ch();
              ja.field_i = 1;
              this.field_D = 7;
              this.field_hb = 4;
            }
            if (8 == ja.field_i &&
              ConfirmedEmailAvailabilityValidator.field_q != 4 &&
              ConfirmedEmailAvailabilityValidator.field_q >= 0) {
              DraggableWidgetContainer.a(false, 0);
            }
            if ((8 != ja.field_i ||
              !(me.field_o <= 0)) && var4 != 0) {
              ProgressMessageDialog.field_ib = this.o((byte) -61);
              var5 = new cc(ProgressMessageDialog.field_ib);
              if (!bk.c(-25704)) {
                ga.a((byte) 7, 6, var5);
              }
            }
          }
          if (!param0) {
            this.a(-22, (byte) 21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.CC(" + param0 + ')');
        }
    }

    private final int a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15418) {
            this.q((byte) -31);
          }
          stackIn_4_0 = this.b(param1, 5, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          FrameTimer.field_f.drawCentred(param0, param1, param3, param2, 1);
          if (param4 <= 102) {
            this.field_gb = 25;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Terraphoenix.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void A(int param0) {
        BattleUnit stackIn_49_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        BattleUnit stackIn_49_0Lifetime1;
        var5 = field_V;
        try {
          if (param0 != 255) {
            return;
          }
          if (this.field_X == null) {
            this.field_X = new BattleState(this);
          }
          if (!this.field_X.field_u) {
            this.field_X.field_j = MouseWheelInput.field_b;
            this.field_X.field_N = DiskArchiveRequest.field_I;
            this.field_X.field_y = ef.field_j;
            var2_int = 1;
            var3 = 0;
            var4 = 0;
            scanLoop1: while (true) {
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder0 = true;
              regionExit2: {
                if (var4 < 12) {
                  stackIn_49_0 = this.field_X.units[var4];
                  if (var5 != 0) {
                    while (true) {
                      if (stackIn_49_0.field_Z != null &&
                        null != this.field_X.units[var4].tile) {
                        this.field_X.units[var4].tile.unit = null;
                        this.field_X.units[var4].tile = null;
                      }
                      while (true) {
                        var4--;
                        break regionExit2;
                      }
                    }
                  }
                  if (stackIn_49_0 != null &&
                    this.field_X.units[var4].field_Z != null) {
                    sj.field_b = this.field_X.units[var4].field_F;
                    lg.field_c = this.field_X.units[var4].field_H;
                    if (this.field_X.units[var4].tile == null) {
                      var2_int = 0;
                      if (var5 != 0) {
                        var3 = 1;
                      }
                    } else {
                      var3 = 1;
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue;
                  }
                }
                decompiledFrameRemainder0 = (var3 != 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(ef.field_j < 351)) &&
                  (decompiledFrameRemainder0 = !(ef.field_j >= (351 + this.field_lb.field_r))) &&
                  (decompiledFrameRemainder0 = !(MouseWheelInput.field_b < 386)) &&
                  (decompiledFrameRemainder0 = !((this.field_lb.field_t + 386) <= MouseWheelInput.field_b))) {
                  this.field_Eb = new String[1];
                  this.field_X.field_N = 0;
                  this.field_Eb[0] = ArchiveRequest.field_t;
                  decompiledFrameRemainder0 = (DiskArchiveRequest.field_I == 1);
                  if (decompiledFrameRemainder0) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(46, 34);
                    var4 = 11;
                    while (var4 >= 0) {
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (null != this.field_X.units[var4]) {
                        stackIn_49_0Lifetime1 = this.field_X.units[var4];
                        if (stackIn_49_0Lifetime1.field_Z != null &&
                          null != this.field_X.units[var4].tile) {
                          this.field_X.units[var4].tile.unit = null;
                          this.field_X.units[var4].tile = null;
                          break;
                        }
                      }
                      var4--;
                    }
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var2_int == 0)) {
                break scanLoop1;
              }
              if (ef.field_j >= 456 &&
                ef.field_j < 624 &&
                MouseWheelInput.field_b >= 329 &&
                MouseWheelInput.field_b < 413) {
                this.field_X.field_N = 0;
                this.field_Eb = new String[1];
                this.field_Eb[0] = LabeledWidgetContainer.field_K;
                if (1 == DiskArchiveRequest.field_I) {
                  this.field_X.field_u = true;
                  this.field_X.c((byte) -76);
                  while (DefaultTextWidgetRenderer.d(param0 ^ 254)) {
                  }
                }
              }
              break;
            }
            if (IntrusiveNode.field_c == -1) {
              this.field_X.field_N = 0;
            }
            this.field_X.b(param0 - 256, this);
            while (true) {
              if (!DefaultTextWidgetRenderer.d(param0 ^ 254)) {
                return;
              }
              if (var5 != 0) {
                return;
              }
              if (lf.field_c != 13) {
              }
              this.field_X.a((byte) -106, lf.field_c);
            }
          }
          ja.field_i = 6;
          this.field_X.field_q = this.field_X.units[0];
          sj.field_b = 32 * (this.field_X.field_q.field_F - this.field_X.field_q.field_H);
          lg.field_c = (this.field_X.field_q.field_F + this.field_X.field_q.field_H) * 16;
          eg.field_p = this.field_X.field_q.field_E;
          this.field_X.a(-1);
          this.field_X.field_m = false;
          this.field_X.field_L = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.SA(" + param0 + ')');
        }
    }

    private final int a(byte[] param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.a(111, 71, (byte[]) null);
          }
          stackIn_4_0 = this.b(param0, 7, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.QA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void C(int param0) {
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_61_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_V;
        try {
          this.field_Cb.field_g = DiskArchiveRequest.field_I;
          this.field_Cb.field_k = ef.field_j;
          this.field_Cb.field_e = oh.field_f;
          if (param0 != 0) {
            return;
          }
          this.field_Cb.field_d = MouseWheelInput.field_b;
          this.field_Cb.b(76);
          while (DefaultTextWidgetRenderer.d(param0 + 1)) {
            if (bh.field_e[96]) {
              sj.field_b = sj.field_b - 48;
            }
            if (bh.field_e[97]) {
              sj.field_b = sj.field_b + 48;
            }
            if (bh.field_e[98]) {
              lg.field_c = lg.field_c - 48;
            }
            if (lf.field_c == 40) {
              tg.field_l = tg.field_l - 1;
              if (-1 > tg.field_l) {
                tg.field_l = -1;
              }
              if (tg.field_l == -1) {
                ll.field_c = true;
                PacketBuffer.field_j = true;
              }
            }
            if (bh.field_e[99]) {
              lg.field_c = lg.field_c + 48;
            }
            if (lf.field_c == 41) {
              tg.field_l = tg.field_l + 1;
              if (5 < tg.field_l) {
                tg.field_l = 5;
              }
            }
            if (lf.field_c == 50) {
              this.field_Cb.b((byte) 124);
            }
            if (lf.field_c == 32) {
              stackIn_45_0 = !(PacketBuffer.field_j);
              PacketBuffer.field_j = stackIn_45_0;
            }
            if (lf.field_c == rh.field_c) {
              stackIn_53_0 = !(ll.field_c);
              ll.field_c = stackIn_53_0;
            }
            if (lf.field_c == 34) {
              stackIn_61_0 = !(MouseWheelInput.field_a);
              MouseWheelInput.field_a = stackIn_61_0;
            }
            if (lf.field_c == 24) {
              this.field_Cb.b(-1, 124);
            }
            if (lf.field_c == 25) {
              this.field_Cb.b(1, 92);
            }
            if (lf.field_c == 64) {
              this.field_Cb.field_b = this.field_Cb.field_b - 1;
            }
            if (fl.field_b == lf.field_c) {
              this.field_Cb.field_a = this.field_Cb.field_a - 1;
            }
            if (lf.field_c == 65) {
              this.field_Cb.field_b = this.field_Cb.field_b + 1;
            }
            if (lf.field_c == 49) {
              this.field_Cb.field_a = this.field_Cb.field_a + 1;
            }
            if (lf.field_c == 55) {
              this.field_Cb.c(-13859);
            }
            if (lf.field_c == 56) {
              this.field_Cb.a((byte) -121);
            }
            if (lf.field_c == 42) {
              this.field_Cb.a(param0 ^ 23172, -1);
            }
            if (lf.field_c != 43) {
              continue;
            }
            this.field_Cb.a(23172, 1);
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.SB(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var7 = field_V;
        try {
          var4 = 107 % ((64 - param0) / 45);
          var2_int = 13;
          var3 = 441;
          var5 = 198;
          var6 = 26;
          if (var2_int <= ef.field_j &&
            ef.field_j < var2_int + var5 &&
            MouseWheelInput.field_b >= var3 &&
            MouseWheelInput.field_b < var6 + var3) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = IndexedSpriteState.field_h;
            if (DiskArchiveRequest.field_I == 1) {
              this.field_zb = new ch();
              this.field_D = 0;
              this.field_hb = 0;
            }
          }
          var2_intLifetime1 = 221;
          if (ef.field_j >= var2_intLifetime1 &&
            ef.field_j < (var2_intLifetime1 + var5) &&
            MouseWheelInput.field_b >= var3 &&
            var3 + var6 > MouseWheelInput.field_b) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = LabeledWidgetContainer.field_I;
            if (1 == DiskArchiveRequest.field_I) {
              this.field_hb = 0;
              this.field_N = new vl();
            }
          }
          var2_intLifetime2 = 429;
          if (ef.field_j >= var2_intLifetime2 &&
            ef.field_j < (var2_intLifetime2 + var5) &&
            MouseWheelInput.field_b >= var3 &&
            MouseWheelInput.field_b < (var3 + var6)) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = va.field_i;
            if (!this.field_Db) {
              this.field_Eb = new String[2];
              this.field_Eb[1] = nl.field_c;
              this.field_Eb[0] = lb.field_e;
            }
            if (DiskArchiveRequest.field_I == 1 &&
              this.field_Db) {
              ProxyAuthenticationRequiredException.field_g = 20;
              ja.field_i = 2;
            }
          }
          while (DefaultTextWidgetRenderer.d(1)) {
            if (lf.field_c != 13) {
              continue;
            }
            if (ProxyAuthenticationRequiredException.field_g >= 10) {
              continue;
            }
            TutorialText.field_c = ja.field_i;
            ProxyAuthenticationRequiredException.field_g = 20;
            TextFieldValidator.field_k = null;
            ja.field_i = 12;
            MusicPatch.playIndexedSoundEffectWithIntGuard(59, 33);
            if (var7 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.BA(" + param0 + ')');
        }
    }

    private final void x(int param0) {
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        BinaryBitmapFont var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8_int = 0;
        String[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        long[] var9_ref_long__ = null;
        String var9_ref_String = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        fb var12_ref_fb = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        BinaryBitmapFont var6Lifetime1;
        int var3Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var17 = field_V;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          var2_int = 580;
          this.a(true, var2_int);
          this.f(true);
          ab.field_i = -1;
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            boolean decompiledFrameRemainder0 = true;
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var3 = 320;
            var4 = 240;
            this.a(-3407, var4, var3);
            fg.field_f.drawOpaque(0, 0);
            if (bk.c(-25704)) {
              var6 = FrameTimer.field_f;
              var7_ref_String = ValidationStatusIcon.field_N;
              var8_int = 90 + var6.field_s + 126;
              var6.drawCentred(var7_ref_String, 320, var8_int, 16777215, 0);
              if (bk.c(param0 - 16802664)) {
                var9 = FrameTimer.field_f.stringWidth(FullscreenFocusCanvas.field_c);
                var10 = 16776960 - wa.field_s;
                boolean decompiledSharedTail0 = (((-(var9 / 2) + 320) <= ef.field_j) &&
                  (ef.field_j <= var9 / 2 + 320) &&
                  (MouseWheelInput.field_b >= 280) &&
                  (MouseWheelInput.field_b <= 280 + FrameTimer.field_f.field_s));
                if (!decompiledSharedTail0) {
                  SoftwareRasterizer.drawHorizontalLineAlpha(320 - var9 / 2, FrameTimer.field_f.field_s + 280 + (50 - nd.field_k) / 2, var9, 16776960 - wa.field_s, -(nd.field_k * 5) + 255);
                  SoftwareRasterizer.drawHorizontalLineAlpha(320 - var9 / 2, -((-nd.field_k + 50) / 2) + 280, var9, 16776960 - wa.field_s, -(5 * nd.field_k) + 255);
                  decompiledSharedTail0 = (var17 != 0);
                }
                if (decompiledSharedTail0) {
                  var10 = 16777215;
                  nd.field_k = nd.field_k + 25;
                  if (50 < nd.field_k) {
                    nd.field_k = nd.field_k - 50;
                  }
                  SoftwareRasterizer.drawVerticalLineAlpha(270 + (-(var9 / 2) + nd.field_k), 280, FrameTimer.field_f.field_s, var10, 255 - 5 * nd.field_k);
                  SoftwareRasterizer.drawVerticalLineAlpha(-nd.field_k + (320 + (var9 / 2 + 50)), 280, FrameTimer.field_f.field_s, var10, -(5 * nd.field_k) + 255);
                  nd.field_k = nd.field_k - 25;
                  if (nd.field_k < 0) {
                    nd.field_k = nd.field_k + 50;
                  }
                }
                FrameTimer.field_f.drawCentred(FullscreenFocusCanvas.field_c, 320, 300, var10, 0);
                SoftwareRasterizer.drawVerticalLineAlpha(320 - var9 / 2 + (-50 + nd.field_k), 280, FrameTimer.field_f.field_s, var10, -(nd.field_k * 5) + 255);
                SoftwareRasterizer.drawVerticalLineAlpha(320 + (var9 / 2 + 50 - nd.field_k), 280, FrameTimer.field_f.field_s, var10, 255 - 5 * nd.field_k);
              }
              decompiledFrameRemainder0 = (var17 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (GameShell.field_y == null) {
                GameShell.field_y = aa.a(8166, 1, 23, 3, 10);
              }
              var6Lifetime1 = FrameTimer.field_f;
              var7 = 0;
              if (GameShell.field_y.field_m &&
                null != GameShell.field_y.field_p) {
                var8 = GameShell.field_y.field_p[DiskArchiveRequest.field_J];
                var9_ref_long__ = GameShell.field_y.field_l[DiskArchiveRequest.field_J];
                var10_ref_int__ = GameShell.field_y.field_q[DiskArchiveRequest.field_J];
                var11 = 0;
                var12_ref_fb = hd.field_q;
                var13 = 90 + var6Lifetime1.field_s;
                var5 = 0;
                while (10 > var5) {
                  stackIn_128_0 = -10;
                  stackIn_128_1 = ~var5;
                  if (var17 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_128_0 != stackIn_128_1 ||
                    var11 != 0 ||
                    0 == DisplayNameSelectionPanel.field_H) {
                    if (var8[var5] != null) {
                      var14 = 16777215;
                      if (var11 == 0 &&
                        var12_ref_fb != null &&
                        me.a(122, var8[var5]) &&
                        ~var9_ref_long__[var5] == ~var12_ref_fb.field_p &&
                        ~DisplayNameSelectionPanel.field_H == ~var10_ref_int__[var5]) {
                        var11 = 1;
                        var14 = -wa.field_s + 16776960;
                      }
                      var15 = var8[var5];
                      var6Lifetime1.drawRightAligned(var5 + 1 + ". ", 128, var13, var14, 0);
                      var6Lifetime1.drawString(var15, 128, var13, var14, 0);
                      if (var10_ref_int__[var5] < 10000) {
                        var6Lifetime1.drawRightAligned(Integer.toString(var10_ref_int__[var5]), 512, var13, var14, 0);
                      } else {
                        var16 = var10_ref_int__[var5] % 1000;
                        if (var16 < 100) {
                          if (var16 > 10) {
                            var6Lifetime1.drawRightAligned(var10_ref_int__[var5] / 1000 + ng.field_w + "0" + var16, 512, var13, var14, 0);
                          } else {
                            var6Lifetime1.drawRightAligned(var10_ref_int__[var5] / 1000 + ng.field_w + "00" + var16, 512, var13, var14, 0);
                          }
                        } else {
                          var6Lifetime1.drawRightAligned(var10_ref_int__[var5] / 1000 + ng.field_w + var16, 512, var13, var14, 0);
                        }
                      }
                      var7 = 1;
                    } else {
                      var6Lifetime1.drawRightAligned(var5 + 1 + ". ", 128, var13, 8355711, 0);
                    }
                  } else {
                    var14 = 16777215;
                    var15 = kj.field_f;
                    var6Lifetime1.drawString(var15, 128, var13, var14, -1);
                    var7 = 1;
                    var6Lifetime1.drawRightAligned(Integer.toString(DisplayNameSelectionPanel.field_H), 512, var13, var14, 0);
                  }
                  var13 += 28;
                  var5++;
                }
              }
              if (decompiledFrameCompleted1) {
                if (var7 != 0) {
                  AccountRequestState.field_f.drawCentred(sl.field_a, 320, 400, 16777215, 0);
                  var8_intLifetime1 = 0;
                  while (3 > var8_intLifetime1) {
                    var9_ref_String = rb.field_b[var8_intLifetime1];
                    var10Lifetime1 = var8_intLifetime1 * 160 + 160;
                    var11Lifetime1 = 432;
                    var12 = 16776960 - wa.field_s;
                    stackIn_128_0 = var8_intLifetime1;
                    stackIn_128_1 = DiskArchiveRequest.field_J;
                    if (var17 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_128_0 == stackIn_128_1) {
                      var12 = 16777088;
                    }
                    if (ef.field_j > (var10Lifetime1 - 80) &&
                      (var10Lifetime1 + 80) > ef.field_j &&
                      MouseWheelInput.field_b > (-FrameTimer.field_f.field_s + var11Lifetime1) &&
                      (var11Lifetime1 + FrameTimer.field_f.field_p) > MouseWheelInput.field_b) {
                      var12 = 16777215;
                      if (oh.field_f == 1 &&
                        ~var8_intLifetime1 != ~DiskArchiveRequest.field_J) {
                        DiskArchiveRequest.field_J = var8_intLifetime1;
                        ProxyAuthenticationRequiredException.field_g = 10;
                      }
                    }
                    FrameTimer.field_f.drawCentred(var9_ref_String, var10Lifetime1, var11Lifetime1, var12, 0);
                    var8_intLifetime1++;
                  }
                }
                if ((decompiledFrameCompleted0) &&
                  (var7 == 0 ||
                  var17 != 0)) {
                  if (GameShell.field_y.field_m) {
                    if (GameShell.field_y.field_p != null) {
                      var8_ref = ie.field_a;
                      if (var17 != 0) {
                        var8_ref = BattleUnit.field_bb;
                        var8_ref = IntrusiveDeque.field_d;
                      }
                    } else {
                      var8_ref = BattleUnit.field_bb;
                      if (var17 != 0) {
                        var8_ref = IntrusiveDeque.field_d;
                      }
                    }
                  } else {
                    var8_ref = IntrusiveDeque.field_d;
                  }
                  var9Lifetime1 = var6Lifetime1.field_s + 216;
                  var6Lifetime1.drawCentred(var8_ref, 320, var9Lifetime1, -wa.field_s + 16776960, -1);
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              k.field_f.setAsRasterTarget(param0 - 16776960);
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_128_0 = param0;
            stackIn_128_1 = 16776960;
          }
          if (stackIn_128_0 != stackIn_128_1) {
            return;
          }
          this.v(0);
          this.i((byte) 105);
          fg.field_f.drawOpaque(0, 0);
          FrameTimer.field_e.drawOpaque(0, 439);
          var3Lifetime1 = 320;
          qh.field_b.draw(-(qh.field_b.field_r / 2) + var3Lifetime1, 476 - qh.field_b.field_t);
          if ((var3Lifetime1 - qh.field_b.field_r / 2) <= ef.field_j &&
            (qh.field_b.field_r / 2 + var3Lifetime1) >= ef.field_j &&
            -qh.field_b.field_t + 476 <= MouseWheelInput.field_b &&
            MouseWheelInput.field_b <= 476) {
            SoftwareRasterizer.fillRectangleAlpha(var3Lifetime1 - qh.field_b.field_r / 2, -qh.field_b.field_t + 476, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.T(" + param0 + ')');
        }
    }

    private final void n(byte param0) {
        ga dupTemp$0 = null;
        ga dupTemp$1 = null;
        ga dupTemp$2 = null;
        ga dupTemp$3 = null;
        ga dupTemp$4 = null;
        ga dupTemp$5 = null;
        ga dupTemp$6 = null;
        ga dupTemp$7 = null;
        ga dupTemp$8 = null;
        ga dupTemp$9 = null;
        ga dupTemp$10 = null;
        ga dupTemp$11 = null;
        boolean stackIn_5_1 = false;
        boolean stackIn_9_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_V;
        try {
          this.field_Gb = true;
          this.field_D = 0;
          kg.field_q = false;
          this.field_hb = 0;
          this.field_wb = null;
          stackIn_5_1 = (ConfirmedEmailAvailabilityValidator.field_q == 0);
          this.field_ob = stackIn_5_1;
          stackIn_9_1 = (ConfirmedEmailAvailabilityValidator.field_q == 0);
          this.field_fb = stackIn_9_1;
          if (ConfirmedEmailAvailabilityValidator.field_q == 4) {
            ConfirmedEmailAvailabilityValidator.field_q = 0;
          }
          RichTextWidget.g(0);
          var2_int = 17 / ((param0 + 75) / 37);
          ByteStorage.b(false);
          wi.h(-4168);
          this.field_cb = 0;
          oe.field_c = oe.field_c - ge.field_e;
          this.field_ib = 0;
          hd.field_q = null;
          this.field_mb = 0;
          this.field_pb = 0;
          this.field_M = 2;
          ge.field_e = 0;
          if (Archive.field_a == 0) {
            this.field_M = 3;
          }
          od.field_c[2].field_q = true;
          sj.field_a[1].field_e = true;
          if (Archive.field_a == 2) {
            this.field_M = 1;
          }
          this.field_nb[0] = new ga();
          this.field_nb[0].field_b = new oh(2);
          if (this.field_nb[0].field_v < 32) {
            dupTemp$0 = this.field_nb[0];
            dupTemp$0.field_v = dupTemp$0.field_v + 20;
          }
          if (this.field_nb[0].field_v < 32) {
            dupTemp$1 = this.field_nb[0];
            dupTemp$1.field_v = dupTemp$1.field_v + 20;
          }
          if (50 > this.field_nb[0].field_B) {
            dupTemp$2 = this.field_nb[0];
            dupTemp$2.field_B = dupTemp$2.field_B + 20;
          }
          if (this.field_nb[0].field_B < 50) {
            dupTemp$3 = this.field_nb[0];
            dupTemp$3.field_B = dupTemp$3.field_B + 20;
          }
          this.field_nb[1] = new ga();
          this.field_nb[1].field_b = new oh(2);
          if (this.field_nb[1].field_v < 32) {
            dupTemp$4 = this.field_nb[1];
            dupTemp$4.field_v = dupTemp$4.field_v + 20;
          }
          if (this.field_nb[1].field_v < 32) {
            dupTemp$5 = this.field_nb[1];
            dupTemp$5.field_v = dupTemp$5.field_v + 20;
          }
          if (this.field_nb[1].field_B < 50) {
            dupTemp$6 = this.field_nb[1];
            dupTemp$6.field_B = dupTemp$6.field_B + 20;
          }
          if (this.field_nb[1].field_B < 50) {
            dupTemp$7 = this.field_nb[1];
            dupTemp$7.field_B = dupTemp$7.field_B + 20;
          }
          this.field_nb[2] = new ga();
          this.field_nb[2].field_b = null;
          this.field_nb[2].field_A = new oh(3);
          if (50 > this.field_nb[2].field_B) {
            dupTemp$8 = this.field_nb[2];
            dupTemp$8.field_B = dupTemp$8.field_B + 20;
          }
          if (this.field_nb[2].field_v > 30) {
            dupTemp$9 = this.field_nb[2];
            dupTemp$9.field_v = dupTemp$9.field_v - 20;
          }
          this.field_nb[3] = new ga();
          this.field_nb[3].field_b = null;
          this.field_nb[3].field_A = new oh(3);
          if (this.field_nb[3].field_B < 50) {
            dupTemp$10 = this.field_nb[3];
            dupTemp$10.field_B = dupTemp$10.field_B + 20;
          }
          if (this.field_nb[3].field_v > 30) {
            dupTemp$11 = this.field_nb[3];
            dupTemp$11.field_v = dupTemp$11.field_v - 20;
          }
          var3 = 4;
          do {
            if (var3 >= 12) {
              this.field_I = new rk(Archive.field_a);
              qc.field_c = 0;
              this.field_Fb = 0;
              this.field_Bb = 0;
              this.field_jb = 0;
              this.field_Db = false;
              this.field_ub = 0;
              break;
            }
            this.field_nb[var3] = null;
            var3++;
          } while (var4 == 0);
          if (Archive.field_a == 0) {
            ArchiveRequest.field_B[0].field_d = false;
            ArchiveRequest.field_B[1].field_d = false;
            ArchiveRequest.field_B[2].field_d = false;
            ArchiveRequest.field_B[3].field_d = true;
            ArchiveRequest.field_B[4].field_d = true;
            ArchiveRequest.field_B[5].field_d = false;
            ArchiveRequest.field_B[6].field_d = true;
            ArchiveRequest.field_B[7].field_d = true;
            ArchiveRequest.field_B[8].field_d = false;
          }
          this.field_vb = 0;
          if (ConfirmedEmailAvailabilityValidator.field_q == 0) {
            this.field_P = 0;
          }
          if (1 <= ConfirmedEmailAvailabilityValidator.field_q) {
            od.field_c[6].field_t = true;
            this.field_Bb = 3;
            this.field_P = -1;
            this.field_ub = 0;
            this.field_jb = 0;
            this.field_vb = 0;
            this.s((byte) 39);
            ArchiveRequest.field_B[0].field_d = true;
            ArchiveRequest.field_B[1].field_d = true;
            ArchiveRequest.field_B[2].field_d = true;
            ArchiveRequest.field_B[3].field_d = true;
            ArchiveRequest.field_B[4].field_d = true;
            ArchiveRequest.field_B[6].field_d = true;
            ArchiveRequest.field_B[7].field_d = true;
            ArchiveRequest.field_B[8].field_d = true;
          }
          if (ConfirmedEmailAvailabilityValidator.field_q >= 2) {
            this.field_I.field_a[6] = this.field_I.field_a[6] + 1;
            this.field_I.field_a[4] = this.field_I.field_a[4] + 1;
            this.field_I.field_a[1] = this.field_I.field_a[1] + 1;
            this.field_I.field_a[8] = this.field_I.field_a[8] + 8;
            this.field_I.field_a[9] = this.field_I.field_a[9] + 4;
            this.field_I.field_a[17] = this.field_I.field_a[17] + 2;
            this.field_I.field_a[11] = this.field_I.field_a[11] + 4;
            this.field_Bb = 8;
            this.field_ub = (int)(2.0 * Math.random()) + 1;
            this.field_jb = 4;
            this.field_vb = 0;
          }
          if (ConfirmedEmailAvailabilityValidator.field_q >= 3) {
            this.field_nb[0].field_m.field_f = 1;
            ArchiveRequest.field_B[5].field_d = true;
            this.field_nb[1].field_m.field_f = 1;
            this.field_nb[2].field_m.field_f = 1;
            this.field_nb[3].field_m.field_f = 1;
            this.field_I.field_a[13] = this.field_I.field_a[13] + 2;
            this.field_I.field_a[12] = this.field_I.field_a[12] + 4;
            this.field_I.field_a[14] = this.field_I.field_a[14] + 1;
            this.field_I.field_a[15] = this.field_I.field_a[15] + 1;
            this.field_Bb = 11;
            this.field_ub = (int)(2.0 * Math.random()) + 1;
            this.field_vb = (int)(Math.random() * 2.0) + 1;
            od.field_c[7].field_t = true;
            od.field_c[8].field_t = true;
            od.field_c[9].field_t = true;
            this.field_jb = 5;
          }
          gd.field_c = 0;
          ja.field_i = 8;
          if (ConfirmedEmailAvailabilityValidator.field_q == 0) {
            ProxyAuthenticationRequiredException.field_g = 20;
            ja.field_i = 2;
            this.field_Db = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.UA(" + param0 + ')');
        }
    }

    private final void r(byte param0) {
        boolean stackIn_22_0 = false;
        BattleState stackIn_141_0 = null;
        boolean stackIn_142_1 = false;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime1Lifetime2;
        var6 = field_V;
        try {
          if (this.field_X.field_b &&
            null != this.field_wb) {
            this.field_wb = null;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_X.field_K) {
            var2_int = 32 * this.field_X.field_a - 32 * this.field_X.field_x;
            var3 = -(eg.field_p * 48) + (16 * this.field_X.field_x + 16 * this.field_X.field_a);
            sj.field_b = (var2_int + 9 * sj.field_b) / 10;
            if (null != AgeValidator.field_q) {
              AgeValidator.field_q.field_g = ef.field_j;
              AgeValidator.field_q.field_c = MouseWheelInput.field_b;
              AgeValidator.field_q.field_z = DiskArchiveRequest.field_I;
            }
            if (0 != DiskArchiveRequest.field_I) {
              this.field_X.field_M = true;
            }
            lg.field_c = (lg.field_c * 9 + var3) / 10;
            if (oh.field_f == 0) {
              stackIn_22_0 = !(this.field_X.field_M);
              if (!stackIn_22_0) {
                this.field_X.field_M = false;
                eg.field_p = this.field_X.field_E;
                lg.field_c = this.field_X.field_k;
                DelegatingCanvas.field_h = 0;
                this.field_X.field_K = null;
                sj.field_b = this.field_X.field_c;
              }
            }
            while (DefaultTextWidgetRenderer.d(1)) {
              stackIn_163_0 = -85;
              stackIn_163_1 = ~lf.field_c;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_163_0 != stackIn_163_1 &&
                lf.field_c != 83) {
                continue;
              }
              this.field_X.field_K = null;
              eg.field_p = this.field_X.field_E;
              sj.field_b = this.field_X.field_c;
              this.field_X.field_M = false;
              lg.field_c = this.field_X.field_k;
              DelegatingCanvas.field_h = 0;
            }
            if (decompiledFrameCompleted1) {
              decompiledFrameRemainder0 = (var6 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted1)) {
            if ((!ConfirmedEmailAvailabilityValidator.field_o ||
              !(this.field_X.field_B < 6)) &&
              this.field_X.field_J) {
              if (bh.field_e[96]) {
                sj.field_b = sj.field_b - 8;
                if (this.field_X.field_w) {
                  lg.field_c = lg.field_c - 4;
                }
                if (this.field_X.field_B == 6) {
                  this.field_X.field_B = 7;
                }
              }
              if (bh.field_e[97]) {
                if (this.field_X.field_B == 6) {
                  this.field_X.field_B = 7;
                }
                sj.field_b = sj.field_b + 8;
                if (this.field_X.field_w) {
                  lg.field_c = lg.field_c + 4;
                }
              }
              if (bh.field_e[98]) {
                lg.field_c = lg.field_c - 8;
                if (this.field_X.field_w) {
                  sj.field_b = sj.field_b + 8;
                  lg.field_c = lg.field_c + 4;
                }
                if (this.field_X.field_B == 6) {
                  this.field_X.field_B = 7;
                }
              }
              if (bh.field_e[99]) {
                lg.field_c = lg.field_c + 8;
                if (this.field_X.field_B == 6) {
                  this.field_X.field_B = 7;
                }
                if (this.field_X.field_w) {
                  lg.field_c = lg.field_c - 4;
                  sj.field_b = sj.field_b - 8;
                }
              }
              var2_intLifetime1 = 2 * -(16 * this.field_X.map.field_b - Math.abs(-(this.field_X.map.field_b * 16) + lg.field_c));
              var3Lifetime1 = 2 * (this.field_X.map.field_b * 16 - Math.abs(-(16 * this.field_X.map.field_b) + lg.field_c));
              var4 = 0;
              var5 = 32 * this.field_X.map.field_b;
              if (sj.field_b < var2_intLifetime1) {
                sj.field_b = var2_intLifetime1;
              }
              if (lg.field_c < var4) {
                lg.field_c = var4;
              }
              if (sj.field_b > var3Lifetime1) {
                sj.field_b = var3Lifetime1;
              }
              if (lg.field_c > var5) {
                lg.field_c = var5;
              }
            }
            this.field_X.field_y = ef.field_j;
            this.field_X.field_j = MouseWheelInput.field_b;
            this.field_X.field_N = DiskArchiveRequest.field_I;
            this.field_X.b(param0 - 127, this);
            while (DefaultTextWidgetRenderer.d(param0 ^ 127)) {
              stackIn_163_0 = lf.field_c;
              stackIn_163_1 = 13;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_163_0 == stackIn_163_1) {
                TutorialText.field_c = ja.field_i;
                ja.field_i = 12;
                TextHotspotBounds.field_m.bindAsRenderTarget();
                SoftwareRasterizer.clearRaster();
                rk.field_c = 32;
                TextFieldValidator.field_k = new Sprite(640, 480);
                var2_intLifetime1Lifetime1 = 0;
                while (var2_intLifetime1Lifetime1 < TextFieldValidator.field_k.pixels.length) {
                  TextFieldValidator.field_k.pixels[var2_intLifetime1Lifetime1] = k.field_f.pixels[var2_intLifetime1Lifetime1];
                  var2_intLifetime1Lifetime1++;
                }
                k.field_f.setAsRasterTarget(0);
                MusicPatch.playIndexedSoundEffectWithIntGuard(37, 33);
                return;
              }
              this.field_X.a((byte) -106, lf.field_c);
            }
            if ((decompiledFrameCompleted0) &&
              (this.field_X.field_J)) {
              if (BufferedSocket.a(70, (byte) -110, 7, 7, false, 28)) {
                this.field_Eb = new String[1];
                this.field_Eb[0] = ee.field_z;
                if (DiskArchiveRequest.field_I == 1) {
                  ProxyAuthenticationRequiredException.field_g = 20;
                  TextLayout.field_b = true;
                  TextHotspotBounds.field_m.bindAsRenderTarget();
                  SoftwareRasterizer.clearRaster();
                  k.field_f.setAsRasterTarget(0);
                  rk.field_c = 32;
                  MusicPatch.playIndexedSoundEffectWithIntGuard(22, 33);
                }
              }
              if (BufferedSocket.a(70, (byte) 110, 7, 85, false, 28)) {
                this.field_Eb = new String[1];
                if (this.field_X.field_w) {
                  this.field_Eb[0] = od.field_d;
                  if (var6 != 0) {
                    this.field_Eb[0] = pf.field_d;
                  }
                } else {
                  this.field_Eb[0] = pf.field_d;
                }
                if (DiskArchiveRequest.field_I == 1) {
                  stackIn_141_0 = this.field_X;
                  stackIn_142_1 = !(this.field_X.field_w);
                  stackIn_141_0.field_w = stackIn_142_1;
                  if (!this.field_X.field_w) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(16, 34);
                    if (var6 != 0) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(115, 33);
                    }
                  } else {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(115, 33);
                  }
                }
              }
              if (BufferedSocket.a(100, (byte) -123, 7, 533, false, 28)) {
                this.field_Eb = new String[1];
                this.field_Eb[0] = ja.field_h;
                if (DiskArchiveRequest.field_I == 1) {
                  TutorialText.field_c = ja.field_i;
                  ja.field_i = 12;
                  TextHotspotBounds.field_m.bindAsRenderTarget();
                  SoftwareRasterizer.clearRaster();
                  TextFieldValidator.field_k = new Sprite(640, 480);
                  var2_intLifetime1Lifetime2 = 0;
                  while (true) {
                    if (TextFieldValidator.field_k.pixels.length > var2_intLifetime1Lifetime2) {
                      TextFieldValidator.field_k.pixels[var2_intLifetime1Lifetime2] = k.field_f.pixels[var2_intLifetime1Lifetime2];
                      var2_intLifetime1Lifetime2++;
                      if (var6 == 0) {
                        continue;
                      }
                    } else {
                      k.field_f.setAsRasterTarget(0);
                      rk.field_c = 32;
                    }
                    break;
                  }
                  MusicPatch.playIndexedSoundEffectWithIntGuard(82, 33);
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_163_0 = param0;
            stackIn_163_1 = 126;
          }
          if (stackIn_163_0 != stackIn_163_1) {
            this.field_Y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.RA(" + param0 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          GameShell.field_y = null;
          if (bk.c(-25704)) {
            this.field_Gb = false;
            ja.field_i = 14;
            if (param1 == 0) {
              this.n(16777215);
            }
            return;
          }
          DisplayNameSelectionPanel.field_H = param1;
          this.field_Gb = param0;
          if (param1 > 0 &&
            !bk.c(-25704) &&
            !kg.field_q) {
            hd.field_q = bm.a(oe.field_c, 23, new int[]{param1}, 3, (byte) 93, 65512, ArchiveIndex.field_e, bh.field_a, oh.field_e);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var3), "Terraphoenix.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(BinaryBitmapFont param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          param0.drawCentred(param6, -1 + param4, param1, param3, -1);
          if (param5 != -31335) {
            this.field_K = -23;
          }
          param0.drawCentred(param6, param4 + 1, param1, param3, -1);
          param0.drawCentred(param6, param4, param1 - 1, param3, -1);
          param0.drawCentred(param6, param4, param1 + 1, param3, -1);
          param0.drawCentred(param6, param4, param1, param2, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.WA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte[] param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 >= -126) {
            this.field_E = true;
          }
          this.a(param0, param2, 4, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (0 < ProxyAuthenticationRequiredException.field_g) {
            param1 -= 20;
          }
          if (~rk.field_c != ~param1) {
            rk.field_c = rk.field_c * 15 + param1 >> 4;
            if (param1 > rk.field_c) {
              rk.field_c = rk.field_c + 1;
            }
            if (rk.field_c > param1) {
              rk.field_c = rk.field_c - 1;
            }
          }
          if (TextHotspotBounds.field_m == null) {
            TextHotspotBounds.field_m = new Sprite(640, 480);
          }
          if (ProxyAuthenticationRequiredException.field_g > 0) {
            ProxyAuthenticationRequiredException.field_g = ProxyAuthenticationRequiredException.field_g - 1;
          }
          if (!param0) {
            this.field_Y = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var3), "Terraphoenix.HB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, param2, param0, 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("Terraphoenix.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void s(int param0) {
        Object stackIn_537_0 = null;
        int stackIn_591_0 = 0;
        int stackIn_591_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        Object var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = field_V;
        try {
          var2_int = 610;
          this.a(true, var2_int);
          this.f(true);
          if (param0 != -7843) {
            return;
          }
          ab.field_i = -1;
          var3 = ic.field_x[0];
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var4 = 320;
            var5 = 240;
            this.a(-3407, var5, var4);
            SoftwareRasterizer.setClip(25, 89, 448, 412);
            od.field_e.drawOpaque(0, 0);
            SoftwareRasterizer.resetClip();
            SoftwareRasterizer.drawRectangleOutline(24, 88, 425, 325, 16776960 - wa.field_s);
            if (0 == ConfirmedEmailAvailabilityValidator.field_q) {
              FrameTimer.field_f.drawString(ef.field_b + " " + var3 + " " + (this.field_Bb + 1), 32, 112, wa.field_s, 0);
            }
            if (1 == ConfirmedEmailAvailabilityValidator.field_q) {
              FrameTimer.field_f.drawString(bh.field_b + " " + var3 + " " + (this.field_Bb - 2), 32, 112, wa.field_s, 0);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
              FrameTimer.field_f.drawString(jh.field_h + " " + var3 + " " + (-7 + this.field_Bb), 32, 112, wa.field_s, 0);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
              FrameTimer.field_f.drawString(IterableNodeHashTable.field_d + " " + var3 + " " + (-10 + this.field_Bb), 32, 112, wa.field_s, 0);
            }
            if (this.field_P != -1) {
              this.field_ab[this.field_P].draw(453, 89);
              SoftwareRasterizer.drawRectangleOutline(452, 88, 169, 169, -wa.field_s + 16776960);
            }
            var8 = (int[][]) null;
            if (1 == this.field_Bb) {
              var8 = new int[1][3];
              var8[0][2] = 0;
              var8[0][0] = 114;
              var8[0][1] = 195;
            }
            var9 = null;
            if (this.field_Bb == 2 ||
              this.field_Bb == 7) {
              var7 = 223;
              var6 = 165;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.sin(mm.field_f)), 65280);
              if (ef.field_j >= -10 + var6 &&
                (var6 + 10) > ef.field_j &&
                (var7 - 10) <= MouseWheelInput.field_b &&
                MouseWheelInput.field_b < (var7 + 10)) {
                if (this.field_Bb == 2) {
                  this.a(7, 2);
                }
                if (this.field_Bb == 7) {
                  this.a(7, 7);
                }
                if (0 != oh.field_f) {
                  this.field_db = false;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(69, 31);
                  }
                  this.field_P = 2;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(Math.sin(mm.field_f) * -5.0 + 15.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.cos(mm.field_f) * 5.0), 16777215);
                if (this.field_Bb == 2) {
                  var9 = kk.field_b[1];
                }
                if (this.field_Bb == 7) {
                  var9 = kk.field_b[2];
                }
              }
            }
            boolean decompiledFrameRemainder4 = true;
            if ((this.field_Bb != 3 && (this.field_Bb != 5 ||
              this.field_ub != 1)) &&
              (decompiledFrameRemainder4 = (9 == this.field_Bb))) {
              decompiledFrameRemainder4 = (this.field_ub == 2);
            }
            if (decompiledFrameRemainder4) {
              var7 = 297;
              var6 = 214;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.sin(mm.field_f)), 65280);
              if (ef.field_j >= var6 - 10 &&
                ef.field_j < (var6 + 10) &&
                MouseWheelInput.field_b >= var7 - 10 &&
                MouseWheelInput.field_b < (var7 + 10)) {
                if (this.field_Bb == 3) {
                  this.a("B", 3, (byte) 82);
                  if (var15 != 0) {
                    if (this.field_Bb == 5) {
                      this.a(7, 5);
                      this.a(7, 10);
                    } else {
                      this.a(7, 10);
                    }
                  }
                } else {
                  if (this.field_Bb == 5) {
                    this.a(7, 5);
                    if (var15 != 0) {
                      this.a(7, 10);
                    }
                  } else {
                    this.a(7, 10);
                  }
                }
                if (0 != oh.field_f) {
                  if (this.field_Bb == 3) {
                    this.field_ub = 2;
                  }
                  this.field_db = false;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(116, 31);
                  }
                  this.field_P = 3;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(-5.0 * Math.sin(mm.field_f) + 15.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db && (this.field_ub == 2 ||
                this.field_Bb != 3)) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.cos(mm.field_f) + 15.0), 16777215);
                if (this.field_Bb == 3) {
                  var9 = kk.field_b[3];
                }
                if (this.field_Bb == 5) {
                  var9 = kk.field_b[4];
                }
                if (this.field_Bb == 9) {
                  var9 = kk.field_b[5];
                }
              }
            }
            boolean decompiledFrameRemainder3 = true;
            if ((this.field_Bb != 3 && (this.field_Bb != 5 ||
              this.field_ub != 2)) &&
              (decompiledFrameRemainder3 = (this.field_Bb == 9))) {
              decompiledFrameRemainder3 = (this.field_ub == 1);
            }
            if (decompiledFrameRemainder3) {
              var6 = 126;
              var7 = 197;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(Math.sin(mm.field_f) * 5.0 + 15.0), 65280);
              if ((var6 - 10) <= ef.field_j &&
                ef.field_j < (var6 + 10) &&
                MouseWheelInput.field_b >= (var7 - 10) &&
                10 + var7 > MouseWheelInput.field_b) {
                if (this.field_Bb != 3) {
                  if (this.field_Bb != 5) {
                    this.a(7, 10);
                    if (var15 != 0) {
                      this.a(7, 5);
                      this.a("A", 3, (byte) 114);
                    }
                  } else {
                    this.a(7, 5);
                    if (var15 != 0) {
                      this.a("A", 3, (byte) 114);
                    }
                  }
                } else {
                  this.a("A", 3, (byte) 114);
                }
                if (oh.field_f != 0) {
                  if (this.field_Bb == 3) {
                    this.field_ub = 1;
                  }
                  this.field_Db = true;
                  this.field_db = false;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(75, 31);
                  }
                  this.field_P = 4;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db && (this.field_ub == 1 ||
                this.field_Bb != 3)) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(Math.cos(mm.field_f) * 5.0 + 15.0), 16777215);
                if (this.field_Bb == 3) {
                  var9 = kk.field_b[6];
                }
                if (this.field_Bb == 5) {
                  var9 = kk.field_b[7];
                }
                if (this.field_Bb == 9) {
                  var9 = kk.field_b[8];
                }
              }
            }
            if (this.field_Bb == 4) {
              var6 = 295;
              var7 = 204;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.sin(mm.field_f) + 15.0), 65280);
              if ((-10 + var6) <= ef.field_j &&
                ef.field_j < 10 + var6 &&
                MouseWheelInput.field_b >= -10 + var7 &&
                MouseWheelInput.field_b < (var7 + 10)) {
                this.a(7, 4);
                if (0 != oh.field_f) {
                  this.field_Db = true;
                  this.field_db = false;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(25, 31);
                  }
                  this.field_P = 5;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.cos(mm.field_f) + 15.0), 16777215);
                var9 = kk.field_b[9];
              }
            }
            if (6 == this.field_Bb) {
              var7 = 282;
              var6 = 383;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * 5.0), 65280);
              if (ef.field_j >= var6 - 10 &&
                ef.field_j < (var6 + 10) &&
                var7 - 10 <= MouseWheelInput.field_b &&
                10 + var7 > MouseWheelInput.field_b) {
                this.a(7, 6);
                if (oh.field_f != 0) {
                  this.field_Db = true;
                  this.field_db = false;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(76, 31);
                  }
                  this.field_P = 6;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.cos(mm.field_f)), 16777215);
                var9 = kk.field_b[10];
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if ((this.field_Bb != 8) &&
              (decompiledFrameRemainder2 = (this.field_Bb == 10))) {
              decompiledFrameRemainder2 = (this.field_vb == 1);
            }
            if (decompiledFrameRemainder2) {
              var6 = 85;
              var7 = 308;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.sin(mm.field_f)), 65280);
              if (var6 - 10 <= ef.field_j &&
                10 + var6 > ef.field_j &&
                MouseWheelInput.field_b >= -10 + var7 &&
                MouseWheelInput.field_b < 10 + var7) {
                if (8 != this.field_Bb) {
                  this.a(7, 9);
                  if (var15 != 0) {
                    this.a("A", 9, (byte) -70);
                  }
                } else {
                  this.a("A", 9, (byte) -70);
                }
                if (0 != oh.field_f) {
                  if (this.field_Bb == 8) {
                    this.field_vb = 2;
                  }
                  this.field_Db = true;
                  this.field_db = false;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(124, 31);
                  }
                  this.field_P = 7;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db && (this.field_vb == 2 ||
                this.field_Bb == 10)) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.cos(mm.field_f)), 16777215);
                var9 = kk.field_b[11];
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if ((this.field_Bb != 8) &&
              (decompiledFrameRemainder1 = (this.field_Bb == 10))) {
              decompiledFrameRemainder1 = (2 == this.field_vb);
            }
            if (decompiledFrameRemainder1) {
              var6 = 300;
              var7 = 134;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.sin(mm.field_f) + 15.0), 65280);
              if (ef.field_j >= (-10 + var6) &&
                (10 + var6) > ef.field_j &&
                (-10 + var7) <= MouseWheelInput.field_b &&
                (var7 + 10) > MouseWheelInput.field_b) {
                if (this.field_Bb != 8) {
                  this.a(param0 + 7850, 8);
                  if (var15 != 0) {
                    this.a("B", 8, (byte) -72);
                  }
                } else {
                  this.a("B", 8, (byte) -72);
                }
                if (oh.field_f != 0) {
                  if (this.field_Bb == 8) {
                    this.field_vb = 1;
                  }
                  this.field_db = false;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(125, 31);
                  }
                  this.field_P = 9;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(-5.0 * Math.sin(mm.field_f) + 15.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db && (this.field_vb == 1 ||
                10 == this.field_Bb)) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.cos(mm.field_f) + 15.0), 16777215);
                var9 = kk.field_b[12];
              }
            }
            if (this.field_Bb == 11) {
              var6 = 277;
              var7 = 99;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(Math.sin(mm.field_f) * 5.0 + 15.0), 65280);
              if (ef.field_j >= (var6 - 10) &&
                ef.field_j < (var6 + 10) &&
                (-10 + var7) <= MouseWheelInput.field_b &&
                (10 + var7) > MouseWheelInput.field_b) {
                this.a(7, 11);
                if (oh.field_f != 0) {
                  this.field_db = false;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(61, 31);
                  }
                  this.field_P = 8;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.cos(mm.field_f) * 5.0), 16777215);
                var9 = kk.field_b[13];
              }
            }
            if (this.field_Bb == 12) {
              var6 = 427;
              var7 = 199;
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * 5.0), 65280);
              if (var6 - 10 <= ef.field_j &&
                var6 + 10 > ef.field_j &&
                -10 + var7 <= MouseWheelInput.field_b &&
                MouseWheelInput.field_b < 10 + var7) {
                this.a(7, 12);
                if (oh.field_f != 0) {
                  this.field_db = false;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(77, 31);
                  }
                  this.field_P = 9;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
              }
              if (this.field_Db &&
                !this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.cos(mm.field_f) + 15.0), 16777215);
                var9 = kk.field_b[14];
              }
            }
            if (qc.field_c < this.field_Bb && (this.field_Bb == 4 ||
              6 == this.field_Bb ||
              8 == this.field_Bb ||
              this.field_Bb == 10)) {
              var6 = 140;
              var7 = 224;
              if ((this.field_Bb + qc.field_c) % 5 == 1) {
                var7 = 290;
                var6 = 120;
              }
              if (2 == (this.field_Bb + qc.field_c) % 5) {
                var6 = 257;
                var7 = 282;
              }
              if ((qc.field_c + this.field_Bb) % 5 == 3) {
                var7 = 380;
                var6 = 171;
              }
              if (4 == (this.field_Bb + qc.field_c) % 5) {
                var6 = 407;
                var7 = 152;
              }
              SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.sin(mm.field_f)), 65280);
              if (ef.field_j >= -10 + var6 &&
                var6 + 10 > ef.field_j &&
                MouseWheelInput.field_b >= -10 + var7 &&
                10 + var7 > MouseWheelInput.field_b) {
                var10 = this.field_Bb;
                if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
                  var10 -= 2;
                }
                if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
                  var10 -= 7;
                }
                this.field_Eb = new String[2];
                if (3 == ConfirmedEmailAvailabilityValidator.field_q) {
                  var10 -= 10;
                }
                this.field_Eb[0] = InteractiveWidget.field_G;
                this.field_Eb[1] = var10 + " " + p.field_f[14];
                if (0 != oh.field_f) {
                  this.field_db = true;
                  this.field_Db = true;
                  if (!this.field_Db) {
                    MusicPatch.playIndexedSoundEffectWithIntGuard(75, 31);
                  }
                  this.field_P = 11;
                }
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(Math.sin(mm.field_f) * -5.0 + 15.0), 65280);
              }
              if (this.field_Db &&
                this.field_db) {
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.cos(mm.field_f) * 5.0), 16777215);
                var9 = kk.field_b[15];
              }
            }
            var10 = 8;
            if (this.field_Bb > 3) {
              var10 = 12;
            }
            var11 = 0;
            while (true) {
              if (12 > var11) {
                stackIn_537_0 = null;
                if (var15 == 0) {
                  if (stackIn_537_0 != this.field_nb[var11]) {
                    var10--;
                  }
                  var11++;
                  continue;
                }
              } else {
                if (!this.field_Db) {
                  if (0 >= this.field_Fb) {
                    if (var10 <= 0) {
                      ji.a(462, 13, 16777215, 264, kk.field_b[18], (byte) 84, 621);
                      if (var15 != 0) {
                        ji.a(462, 13, 16777215, 264, kk.field_b[17], (byte) 72, 621);
                        ji.a(462, 13, 16777215, 264, kk.field_b[16], (byte) 62, 621);
                      }
                    } else {
                      ji.a(462, 13, 16777215, 264, kk.field_b[17], (byte) 72, 621);
                      if (var15 != 0) {
                        ji.a(462, 13, 16777215, 264, kk.field_b[16], (byte) 62, 621);
                      }
                    }
                  } else {
                    ji.a(462, 13, 16777215, 264, kk.field_b[16], (byte) 62, 621);
                  }
                }
                var11 = 384;
                if (0 < var10) {
                  nb.field_d[6].draw(452, var11);
                  if (var10 > 1) {
                    AccountRequestState.field_f.drawParagraph(var10 + kk.field_b[19], 486, var11 + 1, 138, 30, 16777215, -1, 0, 1, 14);
                  }
                  if (var10 == 1) {
                    AccountRequestState.field_f.drawParagraph(var10 + kk.field_b[20], 486, -19 + (var11 + 20), 138, 30, 16777215, -1, 0, 1, 14);
                  }
                  var11 -= 34;
                }
                if (this.field_Fb > 0) {
                  qc.field_f[7].drawScaled(452, var11, -1 + nb.field_d[6].field_r, -1 + nb.field_d[6].field_t);
                  if (this.field_Fb > 1) {
                    AccountRequestState.field_f.drawParagraph(this.field_Fb + kk.field_b[21], 486, -19 + (20 + var11), 138, 30, 16777215, -1, 0, 1, 14);
                  }
                  if (1 == this.field_Fb) {
                    AccountRequestState.field_f.drawParagraph(this.field_Fb + kk.field_b[22], 486, -19 + (var11 + 20), 138, 30, 16777215, -1, 0, 1, 14);
                  }
                  var11 -= 34;
                }
                stackIn_537_0 = null;
              }
              break;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (stackIn_537_0 != var8) {
              var10 = 0;
              while (var8.length > var10) {
                var7 = var8[var10][1];
                var6 = var8[var10][0];
                SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(5.0 * Math.sin(mm.field_f) + 15.0), 65280);
                stackIn_591_0 = ~ef.field_j;
                stackIn_591_1 = ~(var6 - 10);
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_591_0 <= stackIn_591_1 &&
                  ef.field_j < 10 + var6 &&
                  MouseWheelInput.field_b >= -10 + var7 &&
                  (10 + var7) > MouseWheelInput.field_b) {
                  this.a(7, 1);
                  if (oh.field_f != 0 && (null == this.field_wb ||
                    this.field_wb.field_l == 12 &&
                    !(ef.field_j < this.field_wb.field_k) &&
                    !(this.field_wb.field_t < ef.field_j) &&
                    !(this.field_wb.field_q > MouseWheelInput.field_b) &&
                    !(MouseWheelInput.field_b > this.field_wb.field_y))) {
                    this.field_Db = true;
                    this.field_db = false;
                    this.field_P = 1;
                    if (!this.field_Db) {
                      MusicPatch.playIndexedSoundEffectWithIntGuard(20, 31);
                    }
                  }
                  SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + Math.sin(mm.field_f) * -5.0), 65280);
                }
                if (this.field_Db &&
                  !this.field_db) {
                  SoftwareRasterizer.drawCircleOutline(var6, var7, (int)(15.0 + 5.0 * Math.cos(mm.field_f)), 16777215);
                  var9 = kk.field_b[var8[var10][2]];
                }
                var10++;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (decompiledFrameRemainder0 = (var9 != null))) {
              stackIn_591_0 = 16777215;
              stackIn_591_1 = 20;
            }
            if (decompiledFrameRemainder0) {
              sj.a(stackIn_591_0, stackIn_591_1, 284, 621, 13, 452, (String) (var9), 0);
            }
            SoftwareRasterizer.setClip(25, 89, 448, 412);
            var10 = nd.field_k + 16;
            if (25 < nd.field_k) {
              var10 = 66 - nd.field_k;
            }
            var11 = 25;
            do {
              if (var11 >= 448) {
                var11 = 89;
                break;
              }
              SoftwareRasterizer.drawVerticalLineAlpha(var11, 0, 480, 65280, var10);
              var11 += 18;
            } while (var15 == 0);
            do {
              if (var11 >= 412) {
                if (25 < ef.field_j &&
                  MouseWheelInput.field_b > 89 &&
                  ef.field_j < 448 &&
                  MouseWheelInput.field_b < 412) {
                  var11 = (ef.field_j - 25) % 18;
                  var12 = (MouseWheelInput.field_b - 89) % 18;
                  var13 = (ef.field_j + (-25 - var11)) / 18;
                  var14 = (-89 + (MouseWheelInput.field_b - var12)) / 18;
                  SoftwareRasterizer.drawLineAlpha(25 + var13 * 18, 0, 25 + var13 * 18, 480, 65280, -(255 * var11 / 18) + 255);
                  SoftwareRasterizer.drawLineAlpha((1 + var13) * 18 + 25, 0, 25 + 18 * var13 + 18, 480, 65280, 255 * var11 / 18);
                  SoftwareRasterizer.drawLineAlpha(0, 18 * var14 + 89, 640, 18 * var14 + 89, 65280, 255 - 255 * var12 / 18);
                  SoftwareRasterizer.drawLineAlpha(0, (var14 + 1) * 18 + 89, 640, 107 + 18 * var14, 65280, 255 * var12 / 18);
                  SoftwareRasterizer.resetClip();
                }
                SoftwareRasterizer.resetClip();
                break;
              }
              SoftwareRasterizer.drawHorizontalLineAlpha(0, var11, 640, 65280, var10);
              var11 += 18;
            } while (var15 == 0);
            k.field_f.setAsRasterTarget(param0 ^ -7843);
          }
          this.v(0);
          this.i((byte) 109);
          ValidationStatusWidget.field_ab.drawOpaque(0, 0);
          SoftwareRasterizer.setClip(0, 425, 640, 480);
          od.field_e.drawOpaque(0, 0);
          SoftwareRasterizer.resetClip();
          var4 = 13;
          var5 = 441;
          var6 = 198;
          var7 = 26;
          if (var4 <= ef.field_j &&
            ef.field_j < (var6 + var4) &&
            var5 <= MouseWheelInput.field_b &&
            var7 + var5 > MouseWheelInput.field_b) {
            SoftwareRasterizer.fillRectangleAlpha(var4, var5, var6, var7, 16777215, 64);
          }
          var4 = 221;
          if (var4 <= ef.field_j &&
            ef.field_j < var4 + var6 &&
            MouseWheelInput.field_b >= var5 &&
            (var7 + var5) > MouseWheelInput.field_b) {
            SoftwareRasterizer.fillRectangleAlpha(var4, var5, var6, var7, 16777215, 64);
          }
          var4 = 429;
          if (this.field_Db) {
            if (ef.field_j < var4) {
              return;
            }
            if ((var6 + var4) <= ef.field_j) {
              return;
            }
            if (MouseWheelInput.field_b < var5) {
              return;
            }
            if (var7 + var5 <= MouseWheelInput.field_b) {
              return;
            }
            SoftwareRasterizer.fillRectangleAlpha(var4, var5, var6, var7, 16777215, 64);
            if (var15 == 0) {
              return;
            }
          }
          this.field_P = -1;
          SoftwareRasterizer.fillRectangleAlpha(var4, var5, var6, var7, 0, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.R(" + param0 + ')');
        }
    }

    private final int b(byte[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = field_V;
        try {
          if (param2 != -1) {
            this.s((byte) -35);
          }
          var4_int = 0;
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param1 <= 0))) {
            stackIn_16_0 = ~(param0[pj.field_t] & 1 << RandomAccessCacheFile.field_b);
            if (var6 == 0) {
              if (stackIn_16_0 < -1) {
                var4_int = var4_int | 1 << var5;
              }
              param1--;
              RandomAccessCacheFile.field_b = RandomAccessCacheFile.field_b + 1;
              var5++;
              if (8 > RandomAccessCacheFile.field_b) {
                continue;
              }
              RandomAccessCacheFile.field_b = 0;
              pj.field_t = pj.field_t + 1;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = var4_int;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("Terraphoenix.JA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int b(byte[] param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            stackIn_4_0 = this.b(param0, 3, -1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -117;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.KA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void r(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (a.field_b != null) {
            ga.b((byte) 52);
            if (field_V != 0) {
              wj.a(2, false);
            }
          } else {
            wj.a(2, false);
          }
          if (param0 < 96) {
            this.field_ub = -38;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.MB(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.startWithDefaultSize(-68, "terraphoenix", 32);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.init()");
        }
    }

    private final void a(byte[] param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, param0, 1, 121);
          if (param2 > -15) {
            this.b(true, (byte) -43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Terraphoenix.TB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -56 / ((60 - param1) / 61);
          stackIn_1_0 = this.b(param0, 4, -1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("Terraphoenix.HC(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void s(byte param0) {
        try {
          int var2_int = 18 % ((-17 - param0) / 47);
          this.field_Fb = this.field_Fb + this.field_M;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.OB(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        try {
          ValidationStatusWidget.field_T.drawOpaque(-(rk.field_c >> 1) + 305, 77);
          SoftwareRasterizer.fillRectangleAlpha(-(rk.field_c >> 1) + 320, 77, rk.field_c, 362, param0, 192);
          ValidationStatusWidget.field_T.drawOpaque(320 + (rk.field_c >> 1), 77);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.BB(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        g var10_ref_g = null;
        int var11_int = 0;
        g var11 = null;
        g var12 = null;
        Sprite var13 = null;
        Sprite var14 = null;
        int var15 = 0;
        var15 = field_V;
        try {
          var2_int = 610;
          this.a(param0, var2_int);
          this.f(true);
          ab.field_i = -1;
          var3 = ic.field_x[0];
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var4 = 320;
            var5 = 240;
            this.field_U.drawScaled(0, 77, 640, 362);
            SoftwareRasterizer.fillRectangleAlpha(0, 77, 640, 362, 0, 160);
            this.a(-3407, var5, var4);
            var6 = 127;
            if (this.field_Bb == 13) {
              this.field_P = 10;
            }
            if (this.field_P != -1) {
              SoftwareRasterizer.drawRectangleOutline(444, 99, 170, 170, 0);
              SoftwareRasterizer.drawRectangleOutline(443, 98, 172, 172, 16777215);
              SoftwareRasterizer.drawRectangleOutline(442, 97, 174, 174, 0);
              this.field_ab[this.field_P].draw(445, 100);
            }
            var7 = null;
            var8 = null;
            var9 = 1 + this.field_Bb;
            if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
              var9 -= 3;
            }
            if (2 == ConfirmedEmailAvailabilityValidator.field_q) {
              var9 -= 8;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
              var9 -= 11;
            }
            if (this.field_X == null) {
              this.g(true);
              return;
            }
            regionExit1: {
              if (this.field_db) {
                var8 = new int[]{4, 5};
                var3 = ModalDialog.field_L + var9 + p.field_f[14];
                var7 = new int[]{2};
                if (this.field_X.field_n == null) {
                  this.field_X.a(1, ic.field_x[5], -104);
                }
                eg.field_p = 0;
              } else {
                var10 = this.field_Bb;
                if (var10 != 0 ||
                  var15 != 0) {
                  if (var10 == 1) {
                    var8 = new int[]{13, 14, 9};
                    var3 = ModalDialog.field_L + var9 + p.field_f[1];
                    var7 = new int[]{11, 12};
                    if (null == this.field_X.field_n) {
                      this.field_X.a(0, ic.field_x[15], -51);
                      this.field_X.a(1, ic.field_x[16], -7);
                      this.field_X.a(2, ic.field_x[10], -97);
                    }
                    eg.field_p = 0;
                    break regionExit1;
                  }
                  if (var10 == 2 &&
                    var15 == 0) {
                    var8 = new int[]{20, 21};
                    var7 = new int[]{17, 18, 19};
                    var3 = ModalDialog.field_L + var9 + p.field_f[2];
                    if (null == this.field_X.field_n) {
                      this.field_X.a(0, ic.field_x[22], -36);
                      this.field_X.a(2, ic.field_x[10], -48);
                    }
                    eg.field_p = 0;
                    SoftwareRasterizer.resetClip();
                    break regionExit1;
                  }
                  if (var10 == 3) {
                    var3 = ModalDialog.field_L + var9 + p.field_f[3];
                    if (this.field_ub != 1) {
                      var7 = new int[]{28, 29, 30};
                      if (this.field_X.field_n == null) {
                        this.field_X.a(1, ic.field_x[27], -94);
                        this.field_X.a(2, ic.field_x[10], -68);
                      }
                      var8 = new int[]{20, 26, 9};
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                    } else {
                      var7 = new int[]{23, 24, 25};
                      var8 = new int[]{20, 26, 9};
                      if (null == this.field_X.field_n) {
                        this.field_X.a(1, ic.field_x[27], -116);
                        this.field_X.a(2, ic.field_x[10], -13);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                    }
                    break regionExit1;
                  }
                  if (var10 == 4) {
                    var7 = new int[]{32, 33, 34, 35};
                    var3 = ModalDialog.field_L + var9 + p.field_f[4];
                    var8 = new int[]{36, 37};
                    if (1 == this.field_ub) {
                      ((int[]) (var7))[0] = 31;
                    }
                    if (this.field_X.field_n == null) {
                      this.field_X.a(0, ic.field_x[38], -41);
                      this.field_X.a(8, ic.field_x[39], -97);
                    }
                    eg.field_p = 0;
                    SoftwareRasterizer.resetClip();
                    break regionExit1;
                  }
                  if (var10 == 5 &&
                    var15 == 0) {
                    var8 = new int[]{43};
                    var3 = ModalDialog.field_L + var9 + p.field_f[5];
                    var7 = new int[]{41, 42};
                    if (1 == this.field_ub) {
                      ((int[]) (var7))[0] = 40;
                    }
                    if (null == this.field_X.field_n) {
                      this.field_X.a(1, ic.field_x[44], -9);
                    }
                    eg.field_p = 0;
                    SoftwareRasterizer.resetClip();
                    break regionExit1;
                  }
                  if (var10 == 6 &&
                    var15 == 0) {
                    var7 = new int[]{45, 46, 47};
                    var8 = new int[]{36, 37};
                    var3 = ModalDialog.field_L + var9 + p.field_f[6];
                    if (this.field_X.field_n == null) {
                      this.field_X.a(0, ic.field_x[38], -4);
                      this.field_X.a(8, ic.field_x[39], -114);
                    }
                    eg.field_p = 0;
                    SoftwareRasterizer.resetClip();
                    break regionExit1;
                  }
                  switch (var10) {
                    case 7:
                      var3 = ModalDialog.field_L + var9 + p.field_f[7];
                      var8 = new int[]{43};
                      var7 = new int[]{48, 49};
                      if (null == this.field_X.field_n) {
                        this.field_X.a(1, ic.field_x[44], -93);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    case 8:
                      if (this.field_vb == 1) {
                        var8 = new int[]{53, 54};
                        var3 = ModalDialog.field_L + var9 + p.field_f[8];
                        var7 = new int[]{50, 51, 52};
                        if (null == this.field_X.field_n) {
                          this.field_X.a(3, ic.field_x[55], -77);
                        }
                        eg.field_p = 0;
                        SoftwareRasterizer.resetClip();
                      }
                      if (2 != this.field_vb) {
                        break regionExit1;
                      }
                      var7 = new int[]{56, 57, 58};
                      var8 = new int[]{36, 59, 60, 61};
                      var3 = ModalDialog.field_L + var9 + p.field_f[9];
                      if (null == this.field_X.field_n) {
                        this.field_X.a(3, ic.field_x[62], -100);
                        this.field_X.a(8, ic.field_x[39], -23);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    case 9:
                      var7 = new int[]{63, 64};
                      var3 = ModalDialog.field_L + var9 + p.field_f[10];
                      var8 = new int[]{65};
                      if (null == this.field_X.field_n) {
                        this.field_X.a(1, ic.field_x[44], -76);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    case 10:
                      if (this.field_vb == 2) {
                        var7 = new int[]{66, 51, 52};
                        var3 = ModalDialog.field_L + var9 + p.field_f[8];
                        var8 = new int[]{53, 54};
                        if (null == this.field_X.field_n) {
                          this.field_X.a(3, ic.field_x[55], -105);
                        }
                        eg.field_p = 0;
                        SoftwareRasterizer.resetClip();
                      }
                      if (1 != this.field_vb) {
                        break regionExit1;
                      }
                      var8 = new int[]{36, 59, 50};
                      var7 = new int[]{67, 57, 58};
                      var3 = ModalDialog.field_L + var9 + p.field_f[9];
                      if (this.field_X.field_n == null) {
                        this.field_X.a(3, ic.field_x[51], -38);
                        this.field_X.a(8, ic.field_x[39], -95);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    case 11:
                      var7 = new int[]{68, 69, 70};
                      var3 = ModalDialog.field_L + var9 + p.field_f[11];
                      var8 = new int[]{71, 72};
                      if (null == this.field_X.field_n) {
                        this.field_X.a(5, ic.field_x[73], -4);
                        this.field_X.a(5, ic.field_x[74], -18);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    case 12:
                      var7 = new int[]{75};
                      var3 = ModalDialog.field_L + var9 + p.field_f[12];
                      var8 = new int[]{76};
                      if (null == this.field_X.field_n) {
                        this.field_X.a(6, ic.field_x[77], -125);
                      }
                      eg.field_p = 0;
                      SoftwareRasterizer.resetClip();
                      break regionExit1;
                    default:
                      break regionExit1;
                    case 13:
                      if (var15 == 0) {
                        var8 = new int[]{80, 81};
                        var3 = ModalDialog.field_L + var9 + p.field_f[13];
                        var7 = new int[]{78};
                        if (this.field_X.field_n == null) {
                          this.field_X.a(7, ic.field_x[79], -37);
                        }
                        eg.field_p = 0;
                        SoftwareRasterizer.resetClip();
                        break regionExit1;
                      }
                      break;
                  }
                }
                var3 = ModalDialog.field_L + var9 + p.field_f[0];
                var8 = new int[]{8, 9};
                var7 = new int[]{6, 7};
                if (this.field_X.field_n == null) {
                  this.field_X.a(2, ic.field_x[10], -61);
                }
                eg.field_p = 0;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (null != var8) {
              var10 = 340 - (1 + java.lang.reflect.Array.getLength(var8)) * 13 - 22;
              if (-22 + var10 - 96 != EditableTextField.field_V) {
                this.field_F = null;
                EditableTextField.field_V = -22 + (var10 - 96);
                gi.field_h = 0;
              }
              var10 = var10 + 13 * ji.a(45, 13, 16777215, var10, ic.field_x[3], (byte) 62, 420);
              var10 += 8;
              var11_int = 0;
              while (!(var11_int >= java.lang.reflect.Array.getLength(var8))) {
                var10 = var10 + 13 * ji.a(50, 13, 16777215, var10, ic.field_x[((int[]) (var8))[var11_int]], (byte) 114, 415);
                var11_int++;
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var7 != null)) {
              var6 = 114;
              bc.field_a = var6;
              SoftwareRasterizer.setClip(0, 96, 640, EditableTextField.field_V + 96);
              var10 = 0;
              do {
                if (!(var10 < java.lang.reflect.Array.getLength(var7))) {
                  var6 = bc.field_a;
                  SoftwareRasterizer.setClip(0, 94, 640, 96);
                  break;
                }
                var6 = var6 + ji.a(45, 13, 16777088, -gi.field_h + var6, "   " + ic.field_x[((int[]) (var7))[var10]], (byte) 83, 420) * 13;
                var6 += 8;
                var10++;
              } while (var15 == 0);
              var10 = 0;
              do {
                if (!(var10 < java.lang.reflect.Array.getLength(var7))) {
                  var6 = bc.field_a;
                  SoftwareRasterizer.setClip(0, EditableTextField.field_V + 96, 640, 96 + EditableTextField.field_V + 2);
                  break;
                }
                var6 = var6 + ji.a(45, 13, 8355648, -gi.field_h + var6, "   " + ic.field_x[((int[]) (var7))[var10]], (byte) 86, 420) * 13;
                var6 += 8;
                var10++;
              } while (var15 == 0);
              var10 = 0;
              do {
                if (!(var10 < java.lang.reflect.Array.getLength(var7))) {
                  SoftwareRasterizer.resetClip();
                  break;
                }
                var6 = var6 + 13 * ji.a(45, 13, 8355648, -gi.field_h + var6, "   " + ic.field_x[((int[]) (var7))[var10]], (byte) 121, 420);
                var6 += 8;
                var10++;
              } while (var15 == 0);
              bc.field_a = var6 + (-bc.field_a - 8);
            }
            boolean decompiledFrameRemainder1 = true;
            if ((this.field_F != null ||
              !(EditableTextField.field_V < bc.field_a)) &&
              (decompiledFrameRemainder1 = !(bc.field_a > EditableTextField.field_V))) {
              this.field_F = null;
              decompiledFrameRemainder1 = (var15 != 0);
            }
            if (decompiledFrameRemainder1) {
              gi.field_h = 0;
              var10_ref_g = new g(0L, (g) null);
              var10_ref_g.field_X = SingleChildWidgetContainer.field_G;
              var11 = new g(0L, (g) null);
              var11.field_X = sl.field_b;
              var12 = new g(0L, (g) null);
              var12.field_eb = sj.field_e;
              var12.field_X = SingleChildWidgetContainer.field_G;
              var12.field_V = sj.field_e;
              var13 = sl.field_b[4];
              var14 = sj.field_e[4];
              this.field_F = new ol(0L, var10_ref_g, var13, var14, var11, var12);
              this.field_F.a(96, gi.field_h, 11, bc.field_a, -689, 420, EditableTextField.field_V, EditableTextField.field_V);
            }
            if (null != this.field_F) {
              this.field_F.a((byte) -99, EditableTextField.field_V, gi.field_h, bc.field_a);
              this.field_F.a((byte) -36, false);
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_Bb == 0 &&
              (Archive.field_a != 1 ||
              (ef.field_i & 512) > 0) ||
              this.field_Bb == 13) {
              SoftwareRasterizer.fillRectangleAlpha(224, 340, 192, 50, 0, 128);
              var10 = -wa.field_s + 16776960;
              if (25 > nd.field_k) {
                var10 = 16776960;
              }
              if (ef.field_j >= 224 &&
                ef.field_j <= 416 &&
                MouseWheelInput.field_b >= 340 &&
                MouseWheelInput.field_b <= 390) {
                var10 = 16777215;
              }
              FrameTimer.field_f.drawParagraph(lk.field_c, 224, 340, 192, 50, var10, 0, 1, 1, FrameTimer.field_f.field_s);
              SoftwareRasterizer.drawRectangleOutline(223, 339, 194, 52, 0);
              SoftwareRasterizer.drawRectangleOutline(225, 341, 190, 48, 0);
              SoftwareRasterizer.drawRectangleOutline(224, 340, 192, 50, var10);
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_Bb == 0) {
                SoftwareRasterizer.fillRectangleAlpha(64, 340, 192, 50, 0, 128);
                var10 = -wa.field_s + 16776960;
                if (64 <= ef.field_j &&
                  ef.field_j <= 256 &&
                  MouseWheelInput.field_b >= 340 &&
                  MouseWheelInput.field_b <= 390) {
                  var10 = 16777215;
                }
                FrameTimer.field_f.drawParagraph(g.field_qb, 64, 340, 192, 50, var10, 0, 1, 1, FrameTimer.field_f.field_s);
                SoftwareRasterizer.drawRectangleOutline(63, 339, 194, 52, 0);
                SoftwareRasterizer.drawRectangleOutline(65, 341, 190, 48, 0);
                SoftwareRasterizer.drawRectangleOutline(64, 340, 192, 50, var10);
                SoftwareRasterizer.fillRectangleAlpha(384, 340, 192, 50, 0, 128);
                if (16777215 != var10) {
                  var10 = -wa.field_s + 16776960;
                  if (!(nd.field_k >= 25)) {
                    var10 = 16776960;
                    if (var15 != 0) {
                      var10 = -wa.field_s + 16776960;
                    }
                  }
                } else {
                  var10 = -wa.field_s + 16776960;
                }
                if (ef.field_j >= 384 &&
                  576 >= ef.field_j &&
                  MouseWheelInput.field_b >= 340 &&
                  390 >= MouseWheelInput.field_b) {
                  var10 = 16777215;
                }
                AccountRequestState.field_f.drawParagraph(dj.field_f, 352, 280, 256, 50, 7829367 | var10, -1, 1, 1, AccountRequestState.field_f.field_s);
                FrameTimer.field_f.drawParagraph(lk.field_c, 384, 340, 192, 50, var10, 0, 1, 1, FrameTimer.field_f.field_s);
                SoftwareRasterizer.drawRectangleOutline(383, 339, 194, 52, 0);
                SoftwareRasterizer.drawRectangleOutline(385, 341, 190, 48, 0);
                SoftwareRasterizer.drawRectangleOutline(384, 340, 192, 50, var10);
                decompiledFrameRemainder0 = (var15 != 0);
              }
              if (decompiledFrameRemainder0) {
                SoftwareRasterizer.fillRectangleAlpha(64, 340, 192, 50, 0, 128);
                var10 = -wa.field_s + 16776960;
                if (64 <= ef.field_j &&
                  ef.field_j <= 256 &&
                  MouseWheelInput.field_b >= 340 &&
                  390 >= MouseWheelInput.field_b) {
                  var10 = 16777215;
                }
                FrameTimer.field_f.drawParagraph(hd.field_m, 64, 340, 192, 50, var10, 0, 1, 1, FrameTimer.field_f.field_s);
                SoftwareRasterizer.drawRectangleOutline(63, 339, 194, 52, 0);
                SoftwareRasterizer.drawRectangleOutline(65, 341, 190, 48, 0);
                SoftwareRasterizer.drawRectangleOutline(64, 340, 192, 50, var10);
                SoftwareRasterizer.fillRectangleAlpha(384, 340, 192, 50, 0, 128);
                if (var10 != 16777215) {
                  var10 = -wa.field_s + 16776960;
                  if (!(nd.field_k >= 25)) {
                    var10 = 16776960;
                    if (var15 != 0) {
                      var10 = -wa.field_s + 16776960;
                    }
                  }
                } else {
                  var10 = -wa.field_s + 16776960;
                }
                if (384 <= ef.field_j &&
                  576 >= ef.field_j &&
                  MouseWheelInput.field_b >= 340 &&
                  MouseWheelInput.field_b <= 390) {
                  var10 = 16777215;
                }
                FrameTimer.field_f.drawParagraph(lk.field_c, 384, 340, 192, 50, var10, 0, 1, 1, FrameTimer.field_f.field_s);
                SoftwareRasterizer.drawRectangleOutline(383, 339, 194, 52, 0);
                SoftwareRasterizer.drawRectangleOutline(385, 341, 190, 48, 0);
                SoftwareRasterizer.drawRectangleOutline(384, 340, 192, 50, var10);
              }
            }
            FrameTimer.field_f.drawCentred(var3, 320, 468, 13881286, 0);
            k.field_f.setAsRasterTarget(0);
          }
          this.v(0);
          bj.field_e.drawOpaque(0, 439);
          this.i((byte) 96);
          pc.field_e.drawOpaque(0, 0);
          SoftwareRasterizer.setClip(0, 0, 158, 480);
          FrameTimer.field_e.drawOpaque(0, 439);
          SoftwareRasterizer.setClip(158, 0, 482, 480);
          bj.field_e.draw(0, 439);
          SoftwareRasterizer.setClip(482, 0, 640, 480);
          FrameTimer.field_e.drawOpaque(0, 439);
          SoftwareRasterizer.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.WB(" + param0 + ')');
        }
    }

    private final void a(String param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = this.field_Bb;
          if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
            var4_int -= 2;
          }
          if (2 == ConfirmedEmailAvailabilityValidator.field_q) {
            var4_int -= 7;
          }
          if (3 == ConfirmedEmailAvailabilityValidator.field_q) {
            var4_int -= 10;
          }
          this.field_Eb = new String[2];
          this.field_Eb[0] = InteractiveWidget.field_G;
          var5 = 113 / ((param2 - 31) / 34);
          this.field_Eb[1] = var4_int + param0 + " " + p.field_f[param1];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("Terraphoenix.DB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final byte[] o(byte param0) {
        byte[] stackIn_10_0 = null;
        boolean stackIn_57_0 = false;
        byte[] stackIn_73_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_77_0 = 0;
        byte[] stackIn_94_1 = null;
        int stackIn_95_2 = 0;
        byte[] stackIn_101_1 = null;
        int stackIn_102_2 = 0;
        byte[] stackIn_105_1 = null;
        int stackIn_106_2 = 0;
        byte[] stackIn_109_1 = null;
        int stackIn_110_2 = 0;
        byte[] stackIn_111_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_56_0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = field_V;
        try {
          pj.field_t = 0;
          var2 = new byte[123];
          RandomAccessCacheFile.field_b = 0;
          this.a(this.field_pb, -128, var2);
          this.a(this.field_Bb, -127, var2);
          sj.field_a[2].field_e = true;
          od.field_c[1].field_q = true;
          if (3 <= this.field_Bb) {
            od.field_c[2].field_q = false;
          }
          if (this.field_Bb >= 7) {
            sj.field_a[1].field_e = false;
          }
          if (param0 > -16) {
            stackIn_10_0 = (byte[]) null;
            return stackIn_10_0;
          }
          this.a(var2, 0, (byte) -47);
          var3 = 0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (12 <= var3))) {
            if (var4 == 0) {
              if (null == this.field_nb[var3]) {
                this.a(var2, 0, (byte) -47);
              } else {
                this.a(var2, 1, (byte) -121);
                this.d(var2, -85, this.field_nb[var3].field_t - 25);
                this.a(this.field_nb[var3].field_w - 40, var2, 16419);
                this.d(var2, -68, this.field_nb[var3].field_v);
                this.d(var2, -57, -25 + this.field_nb[var3].field_B);
                this.a(var2, 16777215, this.field_nb[var3].field_e);
                this.c(var2, 640, this.field_nb[var3].field_h);
                this.a(var2, 16777215, this.field_nb[var3].field_g);
                this.d(var2, -115, this.field_nb[var3].field_f);
                if (this.field_nb[var3].field_b != null) {
                  this.b(this.field_nb[var3].field_b.field_g, var2, 5);
                } else {
                  this.b(19, var2, 5);
                }
                if (this.field_nb[var3].field_A != null) {
                  this.b(this.field_nb[var3].field_A.field_g, var2, 5);
                } else {
                  this.b(19, var2, 5);
                }
                if (this.field_nb[var3].field_i != null) {
                  if (this.field_nb[var3].field_i.field_g == 5) {
                    this.c(var2, 640, 1);
                  } else if (this.field_nb[var3].field_i.field_g == 11) {
                    this.c(var2, 640, 2);
                  } else {
                    System.out.println("OMGHSH!!! HAXXXX");
                  }
                  this.b(3, -1 + this.field_nb[var3].field_i.field_d, var2);
                } else {
                  this.c(var2, 640, 0);
                }
                this.c(var2, 640, this.field_nb[var3].field_m.field_f);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            var3 = 0;
          }
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var3 < this.field_I.field_a.length)))) {
            stackOut_56_0 = od.field_c[var3].field_f;
            stackIn_77_0 = stackOut_56_0 ? 1 : 0;
            stackIn_57_0 = stackOut_56_0;
            if (var4 == 0) {
              if (!stackIn_57_0) {
                if (od.field_c[var3].field_q) {
                  this.a(this.field_I.field_a[var3], -128, var2);
                }
              } else {
                stackIn_73_1 = var2;
                if (!od.field_c[var3].field_t) {
                  stackIn_74_2 = 0;
                } else {
                  stackIn_74_2 = 1;
                }
                this.a(stackIn_73_1, stackIn_74_2, (byte) -62);
                this.a(this.field_I.field_a[var3], -127, var2);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_77_0 = 0;
          }
          var3Lifetime1 = stackIn_77_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(this.field_I.field_d.length > var3Lifetime1)))) {
            if (var4 == 0) {
              if (1 == var3Lifetime1) {
                this.a(this.field_I.field_d[var3Lifetime1], -127, var2);
              } else {
                if (var3Lifetime1 > 1) {
                  stackIn_94_1 = var2;
                  if (!sj.field_a[var3Lifetime1].field_l) {
                    stackIn_95_2 = 0;
                  } else {
                    stackIn_95_2 = 1;
                  }
                  this.a(stackIn_94_1, stackIn_95_2, (byte) -46);
                  this.a(this.field_I.field_d[var3Lifetime1], -127, var2);
                }
              }
              var3Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.c(var2, 640, Archive.field_a);
            this.a(ge.field_e, var2, 20, 126);
            this.a(qc.field_c, -127, var2);
            this.a(this.field_Fb, -127, var2);
            this.c(var2, 640, this.field_ub);
            this.c(var2, 640, this.field_vb);
          }
          stackIn_101_1 = var2;
          if (this.field_jb > 0) {
            stackIn_102_2 = 1;
          } else {
            stackIn_102_2 = 0;
          }
          this.a(stackIn_101_1, stackIn_102_2, (byte) -83);
          stackIn_105_1 = var2;
          if (!this.field_fb) {
            stackIn_106_2 = 0;
          } else {
            stackIn_106_2 = 1;
          }
          this.a(stackIn_105_1, stackIn_106_2, (byte) -47);
          stackIn_109_1 = var2;
          if (!this.field_ob) {
            stackIn_110_2 = 0;
          } else {
            stackIn_110_2 = 1;
          }
          this.a(stackIn_109_1, stackIn_110_2, (byte) -96);
          stackIn_111_0 = var2;
          return stackIn_111_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2_ref), "Terraphoenix.AB(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        int stackIn_31_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_95_0 = 0;
        BattleState stackIn_154_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_V;
        try {
          var2_int = -1;
          var3 = 0;
          if (DiskArchiveRequest.field_I == 1) {
            var2_int = this.field_xb;
          }
          var4 = 0;
          while (true) {
            if (DefaultTextWidgetRenderer.d(1)) {
              if (lf.field_c == 84) {
                var2_int = this.field_xb;
                var3 = 0;
              }
              if (97 == lf.field_c) {
                var3 = 1;
                var2_int = this.field_xb;
              }
              if (96 == lf.field_c) {
                var2_int = this.field_xb;
                var3 = -1;
              }
              if (lf.field_c == 98) {
                var4 = -1;
              }
              if (lf.field_c == 99) {
                var4 = 1;
              }
              if (lf.field_c != 13) {
                continue;
              }
              stackIn_31_0 = 10;
              if (var8 == 0) {
                if (stackIn_31_0 <= ProxyAuthenticationRequiredException.field_g) {
                  continue;
                }
                ProxyAuthenticationRequiredException.field_g = 20;
                ja.field_i = TutorialText.field_c;
                return;
              }
              break;
            }
            stackIn_31_0 = 0;
            break;
          }
          var5 = stackIn_31_0;
          var6 = -10 % ((74 - param0) / 43);
          if (~var2_int == ~var5) {
            ja.field_i = TutorialText.field_c;
            ProxyAuthenticationRequiredException.field_g = 20;
            return;
          }
          var5++;
          if (oh.field_f != 0 &&
            this.field_xb == var5) {
            var2_int = this.field_xb;
          }
          if (var5 == var2_int) {
            if (0 == var3) {
              if ((320 + 100 * SectorCacheStore.field_e / 128 + 8) >= ef.field_j) {
                stackIn_52_0 = (ef.field_j < (320 + SectorCacheStore.field_e * 100 / 128 - 8)) ? -1 : 0;
              } else {
                stackIn_52_0 = 1;
              }
              var3 = stackIn_52_0;
            }
            if (var3 == -1) {
              SectorCacheStore.field_e = SectorCacheStore.field_e - 16;
            }
            if (1 == var3) {
              SectorCacheStore.field_e = SectorCacheStore.field_e + 16;
            }
            if (SectorCacheStore.field_e < 0) {
              SectorCacheStore.field_e = 0;
            }
            if (128 < SectorCacheStore.field_e) {
              SectorCacheStore.field_e = 128;
            }
            if (0 >= ai.field_g) {
              MusicPatch.playIndexedSoundEffectWithIntGuard(34, 70);
              ai.field_g = 25;
            }
          }
          var5++;
          if (ai.field_g > 0) {
            ai.field_g = ai.field_g - 1;
          }
          if (0 != oh.field_f &&
            this.field_xb == var5) {
            var2_int = this.field_xb;
          }
          if (~var2_int == ~var5) {
            if (var3 == 0) {
              if ((8 + AccountCreationResultPanel.field_sb * 100 / 128 + 320) < ef.field_j) {
                stackIn_95_0 = 1;
              } else {
                stackIn_95_0 = ((100 * AccountCreationResultPanel.field_sb / 128 + 320 - 8) > ef.field_j) ? -1 : 0;
              }
              var3 = stackIn_95_0;
            }
            if (var3 == -1) {
              AccountCreationResultPanel.field_sb = AccountCreationResultPanel.field_sb - 16;
            }
            if (var3 == 1) {
              AccountCreationResultPanel.field_sb = AccountCreationResultPanel.field_sb + 16;
            }
            if (AccountCreationResultPanel.field_sb < 0) {
              AccountCreationResultPanel.field_sb = 0;
            }
            if (AccountCreationResultPanel.field_sb > 128) {
              AccountCreationResultPanel.field_sb = 128;
            }
            uk.field_b.setMasterVolume(AccountCreationResultPanel.field_sb * 2, -119);
          }
          var5++;
          if (me.field_o > 0) {
            if (var2_int == var5) {
              this.r(115);
            }
            var5++;
          }
          if (~var2_int == ~var5) {
            wf.field_h = false;
            TextLayout.field_b = true;
            ea.field_o = 0;
            ProxyAuthenticationRequiredException.field_g = 20;
          }
          boolean decompiledFrameRemainder0 = true;
          var5++;
          if (var5 == var2_int) {
            if (TutorialText.field_c != 6) {
              this.field_xb = -1;
              if (7 == ja.field_i) {
                oh.field_e = oh.field_e + 1;
                ArchiveIndex.field_e = ArchiveIndex.field_e + (-ge.field_e + bh.field_a);
                oh.field_e = oh.field_e + this.field_X.field_H;
                ge.field_e = ge.field_e + this.field_X.field_H;
              }
              ProxyAuthenticationRequiredException.field_g = 20;
              ja.field_i = 10;
              if (ge.field_e == 0) {
                ja.field_i = 0;
              }
              if (TutorialText.field_a > 0) {
                ja.field_i = 11;
              }
              this.b(false, ge.field_e);
              DraggableWidgetContainer.a(false, 0);
              this.field_wb = null;
              this.field_zb = null;
              this.field_N = null;
              this.field_X = null;
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              var7 = 0;
              while (true) {
                if (var7 < 12) {
                  stackIn_154_0 = this.field_X;
                  if (var8 == 0) {
                    if (stackIn_154_0.units[var7] != null &&
                      null != this.field_X.units[var7].field_Z) {
                      this.field_X.units[var7].field_P = 0;
                    }
                    var7++;
                    continue;
                  }
                } else {
                  stackIn_154_0 = this.field_X;
                }
                break;
              }
              ((BattleState) (Object) stackIn_154_0).a(70, this);
            }
          }
          var5++;
          if (var4 == -1 &&
            -1 == this.field_xb) {
            this.field_xb = 0;
          }
          this.field_xb = this.field_xb + var4;
          if (this.field_xb < 0 &&
            0 != var4) {
            this.field_xb = this.field_xb + var5;
          }
          if ((var5 - 1) < this.field_xb) {
            this.field_xb = this.field_xb - var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.RB(" + param0 + ')');
        }
    }

    final void renderClientFrame(byte param0) {
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_184_0;
        int stackIn_184_1;
        BinaryBitmapFont stackIn_184_2;
        StringBuilder stackIn_184_3;
        boolean stackIn_185_4 = false;
        int stackIn_188_5;
        boolean stackIn_189_6 = false;
        BinaryBitmapFont stackIn_193_0 = null;
        boolean stackIn_193_1 = false;
        boolean stackIn_194_2 = false;
        boolean stackIn_198_3 = false;
        BinaryBitmapFont stackIn_202_0 = null;
        boolean stackIn_203_1 = false;
        boolean stackIn_207_2 = false;
        int stackIn_519_0 = 0;
        int stackIn_519_1 = 0;
        int stackIn_551_0 = 0;
        int stackIn_552_1 = 0;
        boolean stackIn_571_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        Runtime var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        BinaryBitmapFont var7_ref_ud = null;
        String var7_ref_String = null;
        Runtime var8_ref_Runtime = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime3;
        int var7Lifetime2;
        int var5Lifetime1Lifetime1;
        var10 = field_V;
        try {
          var2 = mb.d(param0 + 160);
          if (NodeHashTableIterator.b(-127)) {
            sl.a(var2, qc.a((byte) -128), (byte) 80);
            return;
          }
          if (!ba.field_h) {
            EditableTextField.a(param0 ^ 13053, var2);
            return;
          }
          if (GuestPlayConfirmationForm.field_K != null) {
            EditableTextField.a(-12966, var2);
            return;
          }
          if (EditableTextField.field_M != null) {
            EditableTextField.a(-12966, var2);
            return;
          }
          SoftwareRasterizer.clearRaster();
          if (this.field_Cb != null) {
            SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 16777215);
            this.field_Cb.c((byte) -107);
            this.c(false);
            AccountNameAvailabilityValidator.a(0, var2, 0, (byte) 116);
            return;
          }
          if (Archive.field_a == 2) {
            if ((16711680 & wa.field_s) < 16711680) {
              wa.field_s = wa.field_s + 65536;
            }
            if (!((wa.field_s & 65280) <= 0)) {
              wa.field_s = wa.field_s - 256;
              if (var10 != 0) {
                if ((wa.field_s & 16711680) > 0) {
                  wa.field_s = wa.field_s - 65536;
                }
                if (65280 > (65280 & wa.field_s)) {
                  wa.field_s = wa.field_s + 256;
                }
              }
            }
          } else {
            if ((wa.field_s & 16711680) > 0) {
              wa.field_s = wa.field_s - 65536;
            }
            if (65280 > (65280 & wa.field_s)) {
              wa.field_s = wa.field_s + 256;
            }
          }
          if (TextLayout.field_b) {
            stackIn_50_0 = 1;
            if (wf.field_h) {
              stackIn_51_1 = 0;
            } else {
              stackIn_51_1 = 1;
            }
            if (stackIn_50_0 == stackIn_51_1) {
              var3_int = 610;
              this.a(true, var3_int);
              if (null == TextFieldValidator.field_k) {
                this.f(true);
                if (var10 != 0) {
                  TextFieldValidator.field_k.drawOpaque(0, 0);
                }
              } else {
                TextFieldValidator.field_k.drawOpaque(0, 0);
              }
              bj.field_e.drawOpaque(0, 439);
              ab.field_i = -1;
              if (10 > ProxyAuthenticationRequiredException.field_g) {
                TextHotspotBounds.field_m.bindAsRenderTarget();
                SoftwareRasterizer.clearRaster();
                var4 = 320;
                var5 = 240;
                this.a(-3407, var5, var4);
                dj.b(-28186);
                k.field_f.setAsRasterTarget(0);
              }
              this.v(0);
              this.i((byte) 125);
              lm.field_g.drawOpaque(0, 0);
              bj.field_e.draw(0, 439);
              var6 = 29;
              var5Lifetime3 = 446;
              var4Lifetime4 = 484;
              var7 = 29;
              if (var4Lifetime4 <= ef.field_j &&
                var5Lifetime3 <= MouseWheelInput.field_b &&
                (var4Lifetime4 + var6) >= ef.field_j &&
                MouseWheelInput.field_b <= (var7 + var5Lifetime3)) {
                SoftwareRasterizer.fillRectangleAlpha(var4Lifetime4, var5Lifetime3, var6, var7, 16777215, 128);
              }
              if (ArchiveRequest.field_B[7].field_d) {
                var6Lifetime3 = 29;
                var5Lifetime4 = 447;
                var7Lifetime2 = 29;
                var4Lifetime5 = 127;
                if (ef.field_j >= var4Lifetime5 &&
                  MouseWheelInput.field_b >= var5Lifetime4 &&
                  ef.field_j <= var4Lifetime5 + var6Lifetime3 &&
                  (var7Lifetime2 + var5Lifetime4) >= MouseWheelInput.field_b) {
                  SoftwareRasterizer.fillRectangleAlpha(var4Lifetime5, var5Lifetime4, var6Lifetime3, var7Lifetime2, 16777215, 128);
                }
                var6Lifetime3 = 101;
                var5Lifetime4 = 446;
                var4Lifetime5 = 531;
                var7Lifetime2 = 29;
                if (var4Lifetime5 <= ef.field_j &&
                  var5Lifetime4 <= MouseWheelInput.field_b &&
                  ef.field_j <= var6Lifetime3 + var4Lifetime5 &&
                  (var7Lifetime2 + var5Lifetime4) >= MouseWheelInput.field_b) {
                  SoftwareRasterizer.fillRectangleAlpha(var4Lifetime5, var5Lifetime4, var6Lifetime3, var7Lifetime2, 16777215, 128);
                }
              }
              AccountNameAvailabilityValidator.a(0, var2, 0, (byte) 125);
              if (mm.field_e >= 2) {
                var8_ref_Runtime = Runtime.getRuntime();
                var9 = (int)(var8_ref_Runtime.totalMemory() - var8_ref_Runtime.freeMemory()) >> 20;
                FrameTimer.field_f.drawString(UiWidget.field_k + "fps, " + var9 + "MiB", 20, 20, 16777215, 0);
                if (this.field_ob) {
                  AccountRequestState.field_f.drawString("NO RECRUITING", 20, 50, 16777215, 0);
                }
                if (this.field_fb) {
                  AccountRequestState.field_f.drawString("NO RESEARCHED ITEMS", 20, 80, 16777215, 0);
                }
              }
              this.c(false);
              return;
            }
          }
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder1 = true;
          var5Lifetime1 = ja.field_i;
          if ((var5Lifetime1 != 14) &&
            (decompiledFrameRemainder1 = (var5Lifetime1 != 13 ||
            var10 != 0)) &&
            (decompiledFrameRemainder3 = (12 != var5Lifetime1)) &&
            (decompiledFrameRemainder4 = (var5Lifetime1 != 0 ||
            var10 != 0)) &&
            (decompiledFrameRemainder5 = (1 != var5Lifetime1))) {
            decompiledFrameRemainder12 = (var5Lifetime1 != 4 ||
              var10 != 0);
            if (((decompiledFrameRemainder12) &&
              (decompiledFrameRemainder12 = (var5Lifetime1 != 3 ||
              var10 != 0))) &&
              (decompiledFrameRemainder6 = (var5Lifetime1 != 2 ||
              var10 != 0)) &&
              (decompiledFrameRemainder7 = (var5Lifetime1 != 5 ||
              var10 != 0)) &&
              (decompiledFrameRemainder8 = (var5Lifetime1 != 6)) &&
              (decompiledFrameRemainder9 = (var5Lifetime1 != 7 ||
              var10 != 0)) &&
              (decompiledFrameRemainder10 = (var5Lifetime1 != 8)) &&
              (decompiledFrameRemainder11 = (var5Lifetime1 != 10 ||
              var10 != 0)) &&
              (decompiledFrameRemainder12 = (11 == var5Lifetime1))) {
              decompiledFrameRemainder2 = (var10 != 0);
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.f(true);
            var3_intLifetime1 = 320;
            this.a(true, var3_intLifetime1);
            ab.field_i = -1;
            if (ProxyAuthenticationRequiredException.field_g < 10) {
              TextHotspotBounds.field_m.bindAsRenderTarget();
              SoftwareRasterizer.clearRaster();
              var5Lifetime1 = 320;
              var6Lifetime1 = 240;
              this.a(param0 ^ 3350, var6Lifetime1, var5Lifetime1);
              var7_ref_ud = AccountRequestState.field_f;
              var8 = 100;
              var9Lifetime1 = 12;
              stackIn_184_0 = var8;
              stackIn_184_1 = 14;
              stackIn_184_2 = var7_ref_ud;
              stackIn_184_3 = new StringBuilder().append(FullscreenNoticeType.field_a).append("<br><br>");
              stackIn_185_4 = (ge.field_e != 0);
              stackIn_188_5 = 119;
              stackIn_189_6 = (0 != TutorialText.field_a);
              var8 = stackIn_184_0 + stackIn_184_1 * ((BinaryBitmapFont) (Object) stackIn_184_2).drawParagraph(((StringBuilder) (Object) stackIn_184_3).append(oe.getSaveResultsLoginPromptWithIntGuard(stackIn_185_4, stackIn_188_5, stackIn_189_6, false)).toString(), 330 - var3_intLifetime1 / 2, var8, var3_intLifetime1 - 10, 128, 16777215, 0, 1, 0, 14);
              var8 += 24;
              if (!this.a(false, 224, (byte) -44, var8, FullscreenFocusCanvas.field_c)) {
              }
              var8 += 80;
              stackIn_193_0 = var7_ref_ud;
              stackIn_193_1 = false;
              stackIn_194_2 = (ge.field_e != 0);
              stackIn_198_3 = (TutorialText.field_a != 0);
              ((BinaryBitmapFont) (Object) stackIn_193_0).drawCentred(MessageKeys.a(stackIn_193_1, stackIn_194_2, stackIn_198_3, 2), 320, var8, 16777215, 0);
              var8 += 24;
              if (this.a(false, 224, (byte) -44, var8, vf.field_b)) {
              }
              var8 += 80;
              stackIn_202_0 = var7_ref_ud;
              stackIn_203_1 = (0 != TutorialText.field_a);
              stackIn_207_2 = (0 != ge.field_e);
              ((BinaryBitmapFont) (Object) stackIn_202_0).drawCentred(dg.a(stackIn_203_1, stackIn_207_2, (byte) -76, false), 320, var8 - (-(var9Lifetime1 * 5) - 64), 65535, -1);
              k.field_f.setAsRasterTarget(param0 ^ -89);
            }
            this.v(0);
            this.i((byte) 111);
            TutorialText.field_e.drawOpaque(0, 0);
            FrameTimer.field_e.drawOpaque(0, 439);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            ValidationStatusWidget.i(param0 ^ -28507);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder2)) {
            this.l((byte) -86);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder2)) {
            this.m(param0 + 90);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder2)) {
            this.s(param0 - 7754);
            this.j((byte) -62);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder2)) {
            this.d(true);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder2)) {
            this.o(-117);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder2)) {
            this.field_X.a(true, false);
            if (this.field_X.field_J) {
              BufferedSocket.a(70, (byte) -108, 7, 7, true, 28);
              BufferedSocket.a(70, (byte) -103, 7, 85, true, 28);
              BufferedSocket.a(100, (byte) -70, 7, 533, true, 28);
            }
            this.field_Eb = null;
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder2)) {
            this.u(0);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder2)) {
            var4Lifetime1 = gd.field_c;
            if (0 == ConfirmedEmailAvailabilityValidator.field_q) {
              var4Lifetime1 += 8;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
              var4Lifetime1 += 13;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 2) {
              var4Lifetime1 += 17;
            }
            if (3 == ConfirmedEmailAvailabilityValidator.field_q) {
              var4Lifetime1 += 19;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 4) {
              var4Lifetime1 += 4;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == -1) {
              var4Lifetime1 = 0;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == -2) {
              var4Lifetime1 = 1;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == -3) {
              var4Lifetime1 = 2;
            }
            if (-4 == ConfirmedEmailAvailabilityValidator.field_q) {
              var4Lifetime1 = 3;
            }
            jh.field_q[var4Lifetime1].drawOpaque(0, 0);
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              1 == gd.field_c &&
              this.field_ib < 256) {
              jh.field_q[var4Lifetime1 - 1].drawWithOpacity(0, 0, 256 - this.field_ib);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              1 == gd.field_c &&
              this.field_mb > 468) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, -3744 + this.field_mb * 8);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c == 2 &&
              this.field_ib < 32) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, -(this.field_ib * 8) + 256);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c == 2 &&
              468 < this.field_mb) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, (-468 + this.field_mb) * 8);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c == 3 &&
              32 > this.field_ib) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, -(8 * this.field_ib) + 256);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c == 3 &&
              372 < this.field_mb) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 16777215, -744 + 2 * this.field_mb);
            }
            if (0 == ConfirmedEmailAvailabilityValidator.field_q &&
              gd.field_c == 4 &&
              32 > this.field_ib) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 16777215, 256 - this.field_ib * 8);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 0 &&
              gd.field_c == 4 &&
              this.field_mb > 468) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, this.field_mb * 8 - 3744);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q >= 1 &&
              ConfirmedEmailAvailabilityValidator.field_q < 4 &&
              this.field_ib < 32) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, -(this.field_ib * 8) + 256);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q >= 1 &&
              4 > ConfirmedEmailAvailabilityValidator.field_q &&
              this.field_mb > 468) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, this.field_mb * 8 - 3744);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 4 &&
              gd.field_c == 1 &&
              this.field_ib < 256) {
              jh.field_q[var4Lifetime1 - 1].drawWithOpacity(0, 0, 256 - this.field_ib);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 4 &&
              gd.field_c == 2 &&
              this.field_ib < 256) {
              jh.field_q[var4Lifetime1 - 1].drawWithOpacity(0, 0, -this.field_ib + 256);
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 4 &&
              gd.field_c >= 3 &&
              this.field_ib < 32) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, -(8 * this.field_ib) + 256);
            }
            if (4 == ConfirmedEmailAvailabilityValidator.field_q &&
              gd.field_c >= 2 &&
              468 < this.field_mb) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 8 * this.field_mb - 3744);
            }
            PcmResampler.field_g.drawOpaque(0, 480 - PcmResampler.field_g.field_t);
            if (this.field_bb != null) {
              var5Lifetime1Lifetime1 = 16776960;
              var6_ref_String = this.field_bb.substring(0, this.field_cb);
              var7_ref_String = this.field_bb.substring(this.field_cb);
              var8Lifetime1 = 484;
              if (this.field_S != null) {
                var8Lifetime1 = 475;
              }
              SoftwareRasterizer.setClip(9, 415, 512, 472);
              AccountRequestState.field_f.drawParagraph(var6_ref_String + "<trans=0>" + var7_ref_String, 17, -ByteArrayPoolSupport.field_a + 420, 12 + var8Lifetime1, 480, var5Lifetime1Lifetime1, 0, 3, 0, 16);
              SoftwareRasterizer.resetClip();
              if (this.field_S != null) {
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 415, 512, 0, 192);
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 416, 512, 0, 128);
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 416, 512, 0, 64);
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 470, 512, 0, 64);
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 471, 512, 0, 128);
                SoftwareRasterizer.drawHorizontalLineAlpha(9, 472, 512, 0, 192);
                this.field_S.a((byte) 74, ProxyAuthenticationRequiredException.field_f, ByteArrayPoolSupport.field_a, PcmPlayerPump.field_h);
                this.field_S.a((byte) -36, false);
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (ConfirmedEmailAvailabilityValidator.field_q == 1 &&
              me.field_o <= 0 &&
              this.field_cb > 20) {
              if ((!(this.field_cb < this.field_bb.length()) ||
                this.field_cb % 4 >= 2) &&
                this.field_cb <= 30) {
                FrameTimer.field_f.drawCentred(MouseWheelInput.field_c, 320, 128, 0, -1);
                FrameTimer.field_f.drawCentred(Integer.toString(ge.field_e), 320, 152, 0, -1);
                decompiledFrameRemainder0 = (var10 != 0);
              }
              if (decompiledFrameRemainder0) {
                FrameTimer.field_f.drawCentred(MouseWheelInput.field_c, 320, 128, 16776960, -1);
                FrameTimer.field_f.drawCentred(Integer.toString(ge.field_e), 320, 152, 16776960, -1);
                decompiledFrameRemainder0 = (var10 != 0);
              }
            }
            if ((decompiledFrameRemainder0) && (ConfirmedEmailAvailabilityValidator.field_q == 4 &&
              3 <= gd.field_c &&
              this.field_cb > 20)) {
              if ((!(this.field_cb < this.field_bb.length()) ||
                this.field_cb % 4 >= 2) &&
                30 >= this.field_cb) {
                FrameTimer.field_f.drawCentred(MouseWheelInput.field_c, 320, 128, 0, -1);
                FrameTimer.field_f.drawCentred(Integer.toString(ge.field_e), 320, 152, 0, -1);
                if (!(Archive.field_a >= 2)) {
                  FrameTimer.field_f.drawCentred(AccountServiceResult.field_f, 320, 200, 0, -1);
                  if (var10 != 0) {
                    FrameTimer.field_f.drawCentred(MouseWheelInput.field_c, 320, 128, 16776960, -1);
                    FrameTimer.field_f.drawCentred(Integer.toString(ge.field_e), 320, 152, 16776960, -1);
                    if (2 > Archive.field_a) {
                      FrameTimer.field_f.drawCentred(AccountServiceResult.field_f, 320, 200, 16776960, -1);
                    }
                  }
                }
              } else {
                FrameTimer.field_f.drawCentred(MouseWheelInput.field_c, 320, 128, 16776960, -1);
                FrameTimer.field_f.drawCentred(Integer.toString(ge.field_e), 320, 152, 16776960, -1);
                if (2 > Archive.field_a) {
                  FrameTimer.field_f.drawCentred(AccountServiceResult.field_f, 320, 200, 16776960, -1);
                }
              }
            }
            TutorialText.field_e.drawOpaque(0, 0);
            if (ef.field_j >= 532 &&
              488 - PcmResampler.field_g.field_t <= MouseWheelInput.field_b &&
              632 > ef.field_j &&
              MouseWheelInput.field_b < 516 - PcmResampler.field_g.field_t) {
              SoftwareRasterizer.fillRectangleAlpha(532, 488 - PcmResampler.field_g.field_t, 100, 28, 16777215, 128);
            }
            decompiledFrameRemainder12 = !(ef.field_j < 532);
            if ((decompiledFrameRemainder12) &&
              (decompiledFrameRemainder12 = !(520 - PcmResampler.field_g.field_t > MouseWheelInput.field_b)) &&
              (decompiledFrameRemainder12 = !(632 <= ef.field_j)) &&
              (decompiledFrameRemainder12 = !((548 - PcmResampler.field_g.field_t) <= MouseWheelInput.field_b))) {
              SoftwareRasterizer.fillRectangleAlpha(532, 520 - PcmResampler.field_g.field_t, 100, 28, 16777215, 128);
              decompiledFrameRemainder12 = (var10 != 0);
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder2)) {
            this.x(16776960);
            decompiledFrameRemainder12 = (var10 != 0);
          }
          if (decompiledFrameRemainder12) {
            this.z(125);
          }
          if (this.field_N != null &&
            12 != ja.field_i) {
            this.field_N.a(-101, this);
          }
          if (null != this.field_zb &&
            ja.field_i != 12) {
            this.field_zb.a(-3250, this);
          }
          boolean decompiledFrameCompleted0 = true;
          if (null != this.field_Eb &&
            !TextLayout.field_b) {
            var3_intLifetime2 = 0;
            var4Lifetime2 = 4;
            var5Lifetime2 = 0;
            while (true) {
              if (this.field_Eb.length > var5Lifetime2) {
                var4Lifetime2 += 12;
                stackIn_519_0 = ~var3_intLifetime2;
                stackIn_519_1 = ~AccountRequestState.field_f.stringWidth(this.field_Eb[var5Lifetime2]);
                if (var10 == 0) {
                  if (stackIn_519_0 > stackIn_519_1) {
                    var3_intLifetime2 = AccountRequestState.field_f.stringWidth(this.field_Eb[var5Lifetime2]);
                  }
                  var5Lifetime2++;
                  continue;
                }
              } else {
                var3_intLifetime2 += 2;
                var5Lifetime2 = ef.field_j;
                stackIn_519_0 = MouseWheelInput.field_b;
                stackIn_519_1 = var4Lifetime2;
              }
              break;
            }
            var6Lifetime2 = stackIn_519_0 - stackIn_519_1;
            if (ja.field_i == 6) {
              if (this.field_Bb != 0 ||
                !(MouseWheelInput.field_b >= 365)) {
                var5Lifetime2 = 640;
              }
              var6Lifetime2 = 365 - var4Lifetime2 - 14;
            }
            if (var5Lifetime2 < 1 + var3_intLifetime2 / 2) {
              var5Lifetime2 = 1 + var3_intLifetime2 / 2;
            }
            if (var6Lifetime2 < 0) {
              var6Lifetime2 = 0;
            }
            if (480 - var4Lifetime2 < var6Lifetime2) {
              var6Lifetime2 = 480 - var4Lifetime2;
            }
            if ((639 - var3_intLifetime2 / 2) < var5Lifetime2) {
              var5Lifetime2 = 640 - var3_intLifetime2 / 2 - 1;
            }
            SoftwareRasterizer.fillRectangleAlpha(-1 - var3_intLifetime2 / 2 + var5Lifetime2, var6Lifetime2, var3_intLifetime2 + 2, var4Lifetime2, 0, 128);
            SoftwareRasterizer.drawRectangleOutlineAlpha(var5Lifetime2 - var3_intLifetime2 / 2 - 1, var6Lifetime2, 2 + var3_intLifetime2, var4Lifetime2, 16777215, 128);
            var6Lifetime2 += 2;
            var7Lifetime1 = 0;
            while (this.field_Eb.length > var7Lifetime1) {
              var6Lifetime2 += 12;
              AccountRequestState.field_f.drawCentred(this.field_Eb[var7Lifetime1], var5Lifetime2, -2 + var6Lifetime2, 16777215, -1);
              var7Lifetime1++;
              if (var10 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_Eb = null;
            }
          }
          if (TextLayout.field_b) {
            stackIn_551_0 = 1;
            if (wf.field_h) {
              stackIn_552_1 = 0;
            } else {
              stackIn_552_1 = 1;
            }
            if (stackIn_551_0 != stackIn_552_1) {
              nl.a(75);
            }
          }
          if (null != this.field_wb &&
            12 != ja.field_i) {
            this.field_wb.a((byte) -100);
          }
          this.c(false);
          if (!ValidatedTextField.p(param0 ^ -44)) {
            if (rl.b(0)) {
              stackIn_571_0 = (null != a.field_b);
              PcmPlayerPump.a(stackIn_571_0, -1260);
              if (var10 != 0) {
                SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
                SoftwareRasterizer.fillRectangle(320 - (LevelEditor.a(-1) / 2 + 12), 240 - mc.a(param0 ^ 45) / 2 - 12, LevelEditor.a(param0 ^ 88) + 24, mc.a(40) + 24, 0);
                ga.d(-6513);
              }
            }
          } else {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
            SoftwareRasterizer.fillRectangle(320 - (LevelEditor.a(-1) / 2 + 12), 240 - mc.a(param0 ^ 45) / 2 - 12, LevelEditor.a(param0 ^ 88) + 24, mc.a(40) + 24, 0);
            ga.d(-6513);
          }
          if (mm.field_e >= 2) {
            var3 = Runtime.getRuntime();
            var4Lifetime3 = (int)(var3.totalMemory() - var3.freeMemory()) >> 20;
            FrameTimer.field_f.drawString(UiWidget.field_k + "fps, " + var4Lifetime3 + "MiB", 20, 20, 16777215, 0);
            if (this.field_ob) {
              AccountRequestState.field_f.drawString("NO RECRUITING", 20, 50, 16777215, 0);
            }
            if (this.field_fb) {
              AccountRequestState.field_f.drawString("NO RESEARCHED ITEMS", 20, 80, 16777215, 0);
            }
            if (this.field_E) {
              AccountRequestState.field_f.drawString("GRENADES", 20, 100, 16777215, 0);
            }
            if (this.field_H) {
              AccountRequestState.field_f.drawString("PISTOLS", 20, 120, 16777215, 0);
            }
            if (this.field_Ab) {
              AccountRequestState.field_f.drawString("LAUNCHERS", 20, 140, 16777215, 0);
            }
          }
          AccountNameAvailabilityValidator.a(0, var2, 0, (byte) 125);
          if (param0 != -89) {
            this.field_S = (ol) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2_ref), "Terraphoenix.B(" + param0 + ')');
        }
    }

    private final int b(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a((byte[]) null, 83, (byte) -33);
          }
          stackIn_4_0 = this.b(param1, 6, -1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("Terraphoenix.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void t(int param0) {
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        RuntimeException runtimeException = null;
        Sprite[] var2 = null;
        IndexedSprite[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var5 = field_V;
        try {
          AccountRequestState.field_f = ByteArrayPoolSupport.a((byte) 94, aj.field_b, "", ab.field_a, "b12");
          FrameTimer.field_f = ByteArrayPoolSupport.a((byte) 94, aj.field_b, "", ab.field_a, "b24");
          var2 = ig.a(ab.field_a, 0, "screenshots", "member_benefits");
          if (me.field_o <= 0) {
            NanoFrameTimer.a(112, ByteStorage.field_d, TextFieldValidator.field_i);
            wa.a(il.a("mbfg", "member_benefits", ab.field_a, -1), (byte) 27, RandomAccessCacheFile.field_c);
            pc.a(TutorialText.field_e, 40);
            va.a(0, 0, 16777215, il.a("mbpb", "member_benefits", ab.field_a, -1), FrameTimer.field_f, 135, 0, 0, false, 135, 1500);
            QuickChatMenu.a(true, var2);
            li.a(22957, dc.field_e, 0, -1, 16777215, (java.applet.Applet) (this));
          }
          TextFieldValidator.field_i = null;
          kk.a(50, 100);
          var3 = new IndexedSprite[1];
          var3[0] = qb.a("sightingpic", (byte) -36, "", ab.field_a);
          AccountRequestState.field_f.setInlineSprites(var3, (int[]) null);
          wg.field_f = il.a("options", "", ab.field_a, -1);
          il.a("help", "", ab.field_a, -1);
          aa.field_j = il.a("next", "", ab.field_a, param0 + 2019);
          DiskCacheWorker.field_e = il.a("prev", "", ab.field_a, -1);
          jh.field_q = new IndexedSprite[22];
          var4 = 0;
          incrementValue$22 = var4;
          var4++;
          jh.field_q[incrementValue$22] = qb.a("deathact1", (byte) -36, "", ab.field_a);
          incrementValue$23 = var4;
          var4++;
          jh.field_q[incrementValue$23] = qb.a("deathact2", (byte) -36, "", ab.field_a);
          incrementValue$24 = var4;
          var4++;
          jh.field_q[incrementValue$24] = qb.a("deathact3", (byte) -36, "", ab.field_a);
          incrementValue$25 = var4;
          var4++;
          jh.field_q[incrementValue$25] = qb.a("deathact4", (byte) -36, "", ab.field_a);
          incrementValue$26 = var4;
          var4++;
          jh.field_q[incrementValue$26] = qb.a("finale_1", (byte) -36, "", ab.field_a);
          incrementValue$27 = var4;
          var4++;
          jh.field_q[incrementValue$27] = qb.a("finale_2", (byte) -36, "", ab.field_a);
          incrementValue$28 = var4;
          var4++;
          jh.field_q[incrementValue$28] = qb.a("finale_3", (byte) -36, "", ab.field_a);
          incrementValue$29 = var4;
          var4++;
          jh.field_q[incrementValue$29] = qb.a("victory", (byte) -36, "", ab.field_a);
          incrementValue$30 = var4;
          var4++;
          jh.field_q[incrementValue$30] = qb.a("intro1", (byte) -36, "", ab.field_a);
          incrementValue$31 = var4;
          var4++;
          jh.field_q[incrementValue$31] = qb.a("intro2", (byte) -36, "", ab.field_a);
          incrementValue$32 = var4;
          var4++;
          jh.field_q[incrementValue$32] = qb.a("intro3", (byte) -36, "", ab.field_a);
          incrementValue$33 = var4;
          var4++;
          jh.field_q[incrementValue$33] = qb.a("intro4", (byte) -36, "", ab.field_a);
          incrementValue$34 = var4;
          var4++;
          jh.field_q[incrementValue$34] = qb.a("intro5", (byte) -36, "", ab.field_a);
          incrementValue$35 = var4;
          var4++;
          jh.field_q[incrementValue$35] = qb.a("act2start1", (byte) -36, "", ab.field_a);
          incrementValue$36 = var4;
          var4++;
          jh.field_q[incrementValue$36] = qb.a("act2start2", (byte) -36, "", ab.field_a);
          incrementValue$37 = var4;
          var4++;
          jh.field_q[incrementValue$37] = qb.a("act2start3", (byte) -36, "", ab.field_a);
          incrementValue$38 = var4;
          var4++;
          jh.field_q[incrementValue$38] = qb.a("act2start4", (byte) -36, "", ab.field_a);
          incrementValue$39 = var4;
          var4++;
          jh.field_q[incrementValue$39] = qb.a("act3start1", (byte) -36, "", ab.field_a);
          incrementValue$40 = var4;
          var4++;
          jh.field_q[incrementValue$40] = qb.a("act3start2", (byte) -36, "", ab.field_a);
          incrementValue$41 = var4;
          var4++;
          jh.field_q[incrementValue$41] = qb.a("act4start1", (byte) -36, "", ab.field_a);
          incrementValue$42 = var4;
          var4++;
          jh.field_q[incrementValue$42] = qb.a("act4start2", (byte) -36, "", ab.field_a);
          incrementValue$43 = var4;
          var4++;
          jh.field_q[incrementValue$43] = qb.a("act4start3", (byte) -36, "", ab.field_a);
          bj.field_e = il.a("instructionbbar", "menu_graphics", ab.field_a, -1);
          FrameTimer.field_e = il.a("interfacebbar", "menu_graphics", ab.field_a, param0 ^ 2019);
          ValidationStatusWidget.field_T = il.a("interfacevbar", "menu_graphics", ab.field_a, -1);
          SectorCacheStore.field_b = il.a("ingametop", "", ab.field_a, -1);
          fh.field_c = il.a("unachieved", "basic", ByteStorage.field_d, param0 + 2019);
          ByteStorage.field_b = il.a("locked", "basic", ByteStorage.field_d, param0 + 2019);
          IsaacCipher.field_k = il.a("orbcoin", "basic", ByteStorage.field_d, param0 ^ 2019);
          ByteStorage.field_d = null;
          this.field_ab = ig.a(ab.field_a, 0, "icon_missions", "");
          this.field_U = qb.a("icon_briefing", (byte) -36, "", ab.field_a);
          this.field_T = qb.a("icon_loss", (byte) -36, "", ab.field_a);
          this.field_sb = qb.a("icon_victory", (byte) -36, "", ab.field_a);
          this.field_lb = il.a("icon_undo", "", ab.field_a, -1);
          this.field_Q = il.a("icon_beginmission", "", ab.field_a, param0 ^ 2019);
          pf.field_a = new Sprite[8];
          pf.field_a[0] = il.a("instr0", "", ab.field_a, -1);
          pf.field_a[1] = il.a("instr1", "", ab.field_a, sl.bitwiseXor(param0, 2019));
          pf.field_a[2] = il.a("instr2", "", ab.field_a, param0 + 2019);
          pf.field_a[3] = il.a("instr3", "", ab.field_a, -1);
          pf.field_a[7] = il.a("instr7", "", ab.field_a, -1);
          od.field_e = qb.a("map0", (byte) -36, "menu_graphics", ab.field_a);
          s.field_b = il.a("shield", "", ab.field_a, param0 ^ 2019);
          qh.field_b = il.a("exitgfx", "", ab.field_a, -1);
          TutorialText.field_e = il.a("titlebig", "menu_graphics", ab.field_a, -1);
          fg.field_f = qb.a("title_highscores", (byte) -36, "menu_graphics", ab.field_a);
          lm.field_g = qb.a("title_instructions", (byte) -36, "menu_graphics", ab.field_a);
          qb.field_c = qb.a("title_achievements", (byte) -36, "menu_graphics", ab.field_a);
          pc.field_e = qb.a("title_missionbrief", (byte) -36, "menu_graphics", ab.field_a);
          ValidationStatusWidget.field_ab = qb.a("title_missionselect", (byte) -36, "menu_graphics", ab.field_a);
          AgeValidator.field_p = qb.a("title_debriefing", (byte) -36, "menu_graphics", ab.field_a);
          PcmResampler.field_g = il.a("introbase", "menu_graphics", ab.field_a, -1);
          u.field_e = ig.a(ab.field_a, param0 ^ -2020, "zmasks", "");
          nb.field_d = ig.a(ab.field_a, 0, "combatbuttons", "");
          bl.field_b = ig.a(ab.field_a, 0, "researchbuttons", "menu_graphics");
          hf.field_w = ig.a(ab.field_a, 0, "achievements", "menu_graphics");
          vk.field_d = il.a("soldierscreen", "menu_graphics", ab.field_a, -1);
          BattleState.field_g = il.a("equipbox", "menu_graphics", ab.field_a, param0 ^ 2019);
          bj.field_g = il.a("researchbox", "menu_graphics", ab.field_a, -1);
          StandardContentDialog.field_hb = il.a("equipslider", "menu_graphics", ab.field_a, -1);
          qc.field_f = ig.a(ab.field_a, 0, "equipbuttons", "menu_graphics");
          hb.field_p = ig.a(ab.field_a, 0, "selectors", "");
          tg.field_e = il.a("equipbar", "menu_graphics", ab.field_a, -1);
          SingleChildWidgetContainer.field_G = ig.a(ab.field_a, 0, "frame", "");
          sl.field_b = ig.a(ab.field_a, 0, "framedark", "");
          sj.field_e = ig.a(ab.field_a, param0 ^ -2020, "framelight", "");
          wa.field_r = lf.a(true, "", "armour0", ab.field_a);
          f.field_i = lf.a(true, "", "armour1", ab.field_a);
          pc.field_c = lf.a(true, "", "armour2", ab.field_a);
          DualLinkNode.field_k = lf.a(true, "", "aimdir", ab.field_a);
          ModalDialogHost.field_N = lf.a(true, "", "menaimdir", ab.field_a);
          me.field_l = lf.a(true, "", "weaponsdir", ab.field_a);
          GrowableIntArray.field_i = lf.a(true, "", "weaponsdiralien", ab.field_a);
          TextFieldValidator.field_f = lf.a(true, "", "aimshield", ab.field_a);
          FullscreenStatusDialog.field_W = lf.a(true, "", "alienwalk_aliens", ab.field_a);
          ba.field_e = lf.a(true, "", "alienwalk_brutes", ab.field_a);
          ByteStorage.field_a = lf.a(true, "", "manwalk", ab.field_a);
          nb.field_f = lf.a(true, "", "menwalk", ab.field_a);
          if (mb.b(0, 108)) {
            rk.field_e = lf.a(true, "", "zombiewalk", ab.field_a);
            ProxyAuthenticationRequiredException.field_h = lf.a(true, "", "zombie_deaths", ab.field_a);
          }
          AdminCheatOverlay.field_a = lf.a(true, "", "aliens_deaths", ab.field_a);
          lf.field_e = lf.a(true, "", "men_deaths", ab.field_a);
          gi.field_j = lf.a(true, "", "explosion", ab.field_a);
          BattleUnit.field_M = lf.a(true, "", "alienaimdir", ab.field_a);
          th.field_i = il.a("darktab", "", ab.field_a, -1);
          vl.field_c = il.a("lighttab", "", ab.field_a, -1);
          cc.field_i = ig.a(ab.field_a, 0, "weapons", "");
          Bzip2State.field_a = ig.a(ab.field_a, param0 ^ -2020, "armour", "");
          TextLineMetrics.field_c = il.a("researchscreen", "menu_graphics", ab.field_a, param0 ^ 2019);
          aj.field_a = ig.a(ab.field_a, 0, "floors", "");
          dm.field_a = ig.a(ab.field_a, 0, "testwall", "");
          se.field_c = ig.a(ab.field_a, 0, "trees", "");
          ji.field_j = ig.a(ab.field_a, 0, "debris", "");
          bk.field_a = new Sprite[dm.field_a.length];
          var4Lifetime1 = 0;
          while (dm.field_a.length > var4Lifetime1) {
            bk.field_a[var4Lifetime1] = dm.field_a[var4Lifetime1].copyMirroredHorizontally();
            var4Lifetime1++;
            if (var5 != 0) {
              return;
            }
          }
          kg.field_r = ig.a(ab.field_a, param0 + 2020, "objects", "");
          rh.field_b = ig.a(ab.field_a, param0 + 2020, "icons", "");
          PcmPlayerPump.field_g = ig.a(ab.field_a, param0 ^ param0, "faces", "");
          ic.field_t = il.a("combatview", "", ab.field_a, -1);
          ab.field_a = null;
          aj.field_b = null;
          MatchingFieldValidator.a(12, 12, SingleChildWidgetContainer.field_G, 12, 240, 88, 16777215, 12, 16711680, SingleChildWidgetContainer.field_G, 16744576, 6, FrameTimer.field_f, 320, SingleChildWidgetContainer.field_G);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.OA(" + param0 + ')');
        }
    }

    final void updateClient(boolean param0) {
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        RuntimeException decompiledCaughtException = null;
        eg var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        var3 = field_V;
        try {
          ModalDialogHost.field_I.serviceOutput();
          stackIn_4_1 = -107;
          stackIn_5_2 = (null != a.field_b);
          this.serviceFramework(stackIn_4_1, stackIn_5_2);
          if (rh.field_d) {
            this.B(-37);
            rh.field_d = false;
          }
          if (null != a.field_b &&
            a.field_b.field_d) {
            BattleState.a((byte) 115);
            ga.b((byte) 65);
          }
          if (!NodeHashTableIterator.b(-84)) {
            if (fh.field_f) {
              if (ValidatedTextField.p(101)) {
                wj.a(2, false);
              }
              fh.field_f = false;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (ba.field_h) {
              if (GuestPlayConfirmationForm.field_K != null) {
                DualLinkNode.a(li.field_b, (byte) 44, 100.0f);
                decompiledFrameRemainder0 = !(!GuestPlayConfirmationForm.field_K.field_k);
                if (decompiledFrameRemainder0) {
                  ef.field_i = ef.field_i | GuestPlayConfirmationForm.field_K.field_m;
                  TutorialText.field_a = TutorialText.field_a & ~GuestPlayConfirmationForm.field_K.field_m;
                  GuestPlayConfirmationForm.field_K = null;
                  lk.b(9407);
                  var2 = (eg) (u.field_c.beginBackward(9272));
                  while (var2 != null) {
                    ConfirmedEmailAvailabilityValidator.a(var2, 4, (byte) 80);
                    var2 = (eg) (u.field_c.nextBackward((byte) -119));
                    if (var3 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                if (EditableTextField.field_M != null) {
                  DualLinkNode.a(li.field_b, (byte) 102, 100.0f);
                  decompiledFrameRemainder0 = !(!EditableTextField.field_M.field_i);
                  if (decompiledFrameRemainder0) {
                    ProgressMessageDialog.field_ib = EditableTextField.field_M.field_j;
                    this.field_I = new rk(Archive.field_a);
                    try {
                      if (null != ProgressMessageDialog.field_ib) {
                        this.a(ProgressMessageDialog.field_ib, false, true);
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var2_ref = decompiledCaughtException;
                      bd.reportClientError((Throwable) ((Object) var2_ref), "TP Sgc", 88);
                      ProgressMessageDialog.field_ib = null;
                    }
                    this.field_zb = null;
                    EditableTextField.field_M = null;
                    lk.b(9407);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (!ValidatedTextField.p(126)) {
                    if (!rl.b(0)) {
                      this.m((byte) 120);
                      decompiledFrameRemainder0 = (var3 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_65_1 = 127;
                      stackIn_66_2 = (null != a.field_b);
                      var2_int = hb.a((GameShell) (this), stackIn_65_1, stackIn_66_2);
                      switch (var2_int) {
                        default:
                          break;
                        case 2364824:
                          lk.d(81);
                          if (var3 == 0) {
                            break;
                          }
                        case 2:
                          if (a.field_b != null) {
                            ga.b((byte) 61);
                          }
                          GrowableIntArray.a(dg.a(false), 100);
                          if (var3 == 0) {
                            break;
                          }
                        case 1:
                          if (a.field_b != null) {
                            ga.b((byte) 59);
                          }
                          break;
                      }
                      if (var3 != 0) {
                        var2_int = AccountServiceResult.a(false);
                        if (var2_int == 2 &&
                          null != a.field_b) {
                          ga.b((byte) 121);
                        }
                        if (var2_int == 3) {
                          wj.a(2, false);
                        }
                        if (var2_int == 4) {
                          nc.b(0);
                          fh.field_f = true;
                        }
                        this.b(true, (byte) -107);
                      }
                    }
                  } else {
                    var2_int = AccountServiceResult.a(false);
                    if (var2_int == 2 &&
                      null != a.field_b) {
                      ga.b((byte) 121);
                    }
                    if (var2_int == 3) {
                      wj.a(2, false);
                    }
                    if (var2_int == 4) {
                      nc.b(0);
                      fh.field_f = true;
                    }
                    if (var3 != 0) {
                      this.b(true, (byte) -107);
                    }
                  }
                }
              }
            } else {
              this.b(true, (byte) -107);
            }
            while (true) {
              if (rj.a(-1491050718, LevelMap.field_j)) {
                this.dispatchCommonPacket(43);
                if (var3 == 0) {
                  continue;
                }
              } else {
                bc.a(0, 0);
              }
              break;
            }
            if (FullscreenNoticeType.a((byte) 76)) {
              var2_int = this.reconnectAndResendRequests((byte) -13);
              if (2 == var2_int) {
                o.a(50, 320, 240, AccountRequestState.field_f, 10, 12);
              }
              if (var3 != 0) {
                this.updateLoginFlow(-20858);
                if (wf.a(31996)) {
                  this.b(false, (byte) -107);
                }
              }
            }
          } else {
            this.updateLoginFlow(-20858);
            if (wf.a(31996)) {
              this.b(false, (byte) -107);
            }
          }
          if (!param0) {
            this.field_Z = -35;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2_ref), "Terraphoenix.F(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        int stackIn_171_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_222_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var14Lifetime3Lifetime1;
        var16 = field_V;
        try {
          var2_int = 610;
          this.a(true, var2_int);
          this.f(true);
          ab.field_i = -1;
          var3 = ic.field_x[0];
          if (ProxyAuthenticationRequiredException.field_g < 10) {
            TextHotspotBounds.field_m.bindAsRenderTarget();
            SoftwareRasterizer.clearRaster();
            var4 = 320;
            if (this.field_X.field_f == 1) {
              this.field_sb.drawScaled(0, 77, 640, 362);
            }
            var5 = 240;
            if (this.field_X.field_f == 2) {
              this.field_T.drawScaled(0, 77, 640, 362);
            }
            SoftwareRasterizer.fillRectangleAlpha(0, 77, 640, 362, 0, 160);
            this.a(-3407, var5, var4);
            var6 = 60;
            var7 = 430;
            var8 = 300;
            var9 = AccountRequestState.field_f.stringWidth("%") + var8;
            var10 = 1 + this.field_Bb;
            if (ConfirmedEmailAvailabilityValidator.field_q == 1) {
              var10 -= 3;
            }
            if (2 == ConfirmedEmailAvailabilityValidator.field_q) {
              var10 -= 8;
            }
            if (ConfirmedEmailAvailabilityValidator.field_q == 3) {
              var10 -= 11;
            }
            if (this.field_P != -1) {
              boolean decompiledFrameRemainder1 = true;
              SoftwareRasterizer.drawRectangleOutline(444, 99, 170, 170, 0);
              SoftwareRasterizer.drawRectangleOutline(443, 98, 172, 172, 16777215);
              SoftwareRasterizer.drawRectangleOutline(442, 97, 174, 174, 0);
              this.field_ab[this.field_P].draw(445, 100);
              if (8 <= this.field_Bb &&
                this.field_Bb <= 10) {
                if (this.field_Bb != 8) {
                  if ((this.field_Bb != 9) &&
                    (decompiledFrameRemainder1 = (this.field_Bb == 10))) {
                    if (this.field_vb != 2) {
                      var3 = ModalDialog.field_L + var10 + p.field_f[9];
                      decompiledFrameRemainder1 = (var16 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      var3 = ModalDialog.field_L + var10 + p.field_f[8];
                      decompiledFrameRemainder1 = (var16 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    var3 = ModalDialog.field_L + var10 + p.field_f[10];
                    decompiledFrameRemainder1 = (var16 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (this.field_vb == 1) {
                    var3 = ModalDialog.field_L + var10 + p.field_f[8];
                    if (var16 != 0) {
                      var3 = ModalDialog.field_L + var10 + p.field_f[9];
                      var3 = ModalDialog.field_L + var10 + p.field_f[this.field_Bb];
                    }
                  } else {
                    var3 = ModalDialog.field_L + var10 + p.field_f[9];
                    if (var16 != 0) {
                      var3 = ModalDialog.field_L + var10 + p.field_f[this.field_Bb];
                    }
                  }
                }
              } else {
                var3 = ModalDialog.field_L + var10 + p.field_f[this.field_Bb];
              }
              if (this.field_db) {
                var3 = ModalDialog.field_L + var10 + p.field_f[14];
              }
            }
            var11 = 105;
            if (this.field_X.field_f == 1) {
              FrameTimer.field_f.drawString(StripedProgressWidget.field_J, 48, var11, 16776960 - wa.field_s, 0);
            }
            if (this.field_X.field_f == 2) {
              FrameTimer.field_f.drawString(sk.field_a, 48, var11, 16776960 - wa.field_s, 0);
            }
            var11 += 32;
            var12 = 0;
            if (this.field_X.field_e.field_g > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[0], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_g), 300, var11, wa.field_s, 0);
              if (!bk.c(-25704)) {
                AccountRequestState.field_f.drawRightAligned(this.field_X.field_e.field_g * 100 + TextHotspotBounds.field_l, var7, var11, wa.field_s, 0);
              }
              var11 += 12;
              var12 = var12 + this.field_X.field_e.field_g * 100;
            }
            if (this.field_X.field_e.field_j > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[1], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_j), 300, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(this.field_X.field_e.field_j * 500 + TextHotspotBounds.field_l, var7, var11, wa.field_s, 0);
              var12 = var12 + 500 * this.field_X.field_e.field_j;
              var11 += 12;
            }
            if (this.field_X.field_e.field_m > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[28], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_m), 300, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(this.field_X.field_e.field_m * 100 + TextHotspotBounds.field_l, var7, var11, wa.field_s, 0);
              var11 += 12;
              var12 = var12 + this.field_X.field_e.field_m * 100;
            }
            if (0 < this.field_X.field_e.field_b) {
              AccountRequestState.field_f.drawString(pe.field_c[2], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_b), 300, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(1000 * this.field_X.field_e.field_b + TextHotspotBounds.field_l, var7, var11, wa.field_s, 0);
              var12 = var12 + 1000 * this.field_X.field_e.field_b;
              var11 += 12;
            }
            if (1 == this.field_X.field_e.field_i) {
              AccountRequestState.field_f.drawString(pe.field_c[3], var6, var11, wa.field_s, 0);
              if (!bk.c(param0 - 25704)) {
                AccountRequestState.field_f.drawRightAligned(DelegatingCanvas.field_e, var7, var11, wa.field_s, 0);
              }
              var11 += 12;
              var12 += 1000;
            }
            if (this.field_X.field_e.field_i == 2) {
              AccountRequestState.field_f.drawString(pe.field_c[4], var6, var11, wa.field_s, 0);
              if (!bk.c(-25704)) {
                AccountRequestState.field_f.drawRightAligned(mb.field_u, var7, var11, wa.field_s, 0);
              }
              var12 += 2500;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == 3) {
              AccountRequestState.field_f.drawString(pe.field_c[5], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(mb.field_u, var7, var11, wa.field_s, 0);
              var12 += 2500;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == 4) {
              AccountRequestState.field_f.drawString(pe.field_c[6], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(mb.field_u, var7, var11, wa.field_s, 0);
              var12 += 2500;
              var11 += 12;
            }
            if (5 == this.field_X.field_e.field_i) {
              AccountRequestState.field_f.drawString(pe.field_c[7], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(ee.field_N, var7, var11, wa.field_s, 0);
              var12 += 3000;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == 6) {
              AccountRequestState.field_f.drawString(pe.field_c[8], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(NodeHashTableIterator.field_c, var7, var11, wa.field_s, 0);
              var11 += 12;
              var12 += 6000;
            }
            if (this.field_X.field_e.field_i == 7) {
              AccountRequestState.field_f.drawString(pe.field_c[9], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(oa.field_b, var7, var11, wa.field_s, 0);
              var11 += 12;
              var12 += 10000;
            }
            if (8 == this.field_X.field_e.field_i) {
              AccountRequestState.field_f.drawString(pe.field_c[10], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(oa.field_b, var7, var11, wa.field_s, 0);
              var12 += 10000;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == 9) {
              AccountRequestState.field_f.drawString(pe.field_c[11], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(fh.field_l, var7, var11, wa.field_s, 0);
              var11 += 12;
              var12 += 5000;
            }
            if (this.field_X.field_e.field_i == 10) {
              AccountRequestState.field_f.drawString(pe.field_c[12], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(fh.field_l, var7, var11, wa.field_s, 0);
              var12 += 5000;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == 11) {
              AccountRequestState.field_f.drawString(pe.field_c[13], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(bj.field_a, var7, var11, wa.field_s, 0);
              var11 += 12;
              var12 += 25000;
            }
            if (this.field_X.field_e.field_i == 12) {
              AccountRequestState.field_f.drawString(pe.field_c[14], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawRightAligned(DelegatingCanvas.field_e, var7, var11, wa.field_s, 0);
              var12 += 1000;
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == -1) {
              AccountRequestState.field_f.drawString(pe.field_c[15], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == -2) {
              AccountRequestState.field_f.drawString(pe.field_c[16], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == -3) {
              AccountRequestState.field_f.drawString(pe.field_c[17], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == -4) {
              AccountRequestState.field_f.drawString(pe.field_c[18], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (-5 == this.field_X.field_e.field_i) {
              AccountRequestState.field_f.drawString(pe.field_c[19], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_i == -6) {
              AccountRequestState.field_f.drawString(pe.field_c[20], var6, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_f > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[21], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_f), 300, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_k > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[22], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_k), 300, var11, wa.field_s, 0);
              var11 += 12;
            }
            if (this.field_X.field_e.field_h > 0) {
              AccountRequestState.field_f.drawString(pe.field_c[23], var6, var11, wa.field_s, 0);
              AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_h), 300, var11, wa.field_s, 0);
              var11 += 12;
            }
            var11 += 12;
            var13 = 1;
            var14 = 0;
            scanLoop1: while (true) {
              if (19 > var14) {
                stackIn_180_0 = 0;
                stackIn_180_1 = this.field_X.field_e.field_l.field_a[var14];
                if (var16 == 0) {
                  if (stackIn_180_0 < stackIn_180_1) {
                    if (var13 == 0) {
                      AccountRequestState.field_f.drawString(od.field_c[var14].field_j, 240, var11, wa.field_s, 0);
                      AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_l.field_a[var14]), 400, var11, wa.field_s, 0);
                    } else {
                      AccountRequestState.field_f.drawString(od.field_c[var14].field_j, 40, var11, wa.field_s, 0);
                      AccountRequestState.field_f.drawString(Integer.toString(this.field_X.field_e.field_l.field_a[var14]), 200, var11, wa.field_s, 0);
                    }
                    stackIn_171_0 = (var13 != 0) ? 0 : 1;
                    var13 = stackIn_171_0;
                    if (var13 != 0) {
                      var11 += 12;
                    }
                  }
                  var14++;
                  continue;
                }
              } else {
                var11 += 12;
                var11 = 300;
                if (bk.c(-25704)) {
                  break scanLoop1;
                }
                var14 = this.field_X.field_e.field_e * 4;
                stackIn_180_0 = var14 - (this.field_X.field_e.field_h + this.field_X.field_e.field_k) * 2;
                stackIn_180_1 = -this.field_X.field_e.field_f;
              }
              var15 = stackIn_180_0 + stackIn_180_1;
              if (var14 > 0) {
                AccountRequestState.field_f.drawString(PcmResampler.field_b, var6, var11, 16777215, 0);
                AccountRequestState.field_f.drawRightAligned(100 * var15 / var14 + "%", var9, var11, 16777215, 0);
                var12 = var12 * var15 / var14;
              }
              var11 += 12;
              AccountRequestState.field_f.drawString(MapTile.field_o, var6, var11, 16777215, 0);
              AccountRequestState.field_f.drawRightAligned(Integer.toString(var12), var8, var11, 16777215, 0);
              var11 += 12;
              break;
            }
            if (Archive.field_a == 1) {
              if (!bk.c(param0 - 25704)) {
                AccountRequestState.field_f.drawString(pe.field_c[24], var6, var11, 16777215, 0);
                AccountRequestState.field_f.drawRightAligned(Integer.toString(var12 / 2), var8, var11, 16777215, 0);
              }
              var12 = var12 + var12 / 2;
              var11 += 12;
              if (this.field_X.field_e.field_b + this.field_X.field_e.field_j > 0 &&
                this.field_X.field_d > 0) {
                AccountRequestState.field_f.drawString(pe.field_c[25], var6, var11, 16777215, 0);
                var14Lifetime1 = this.field_Bb * ((this.field_X.field_e.field_b + this.field_X.field_e.field_j) * 250) / this.field_X.field_d;
                AccountRequestState.field_f.drawRightAligned(Integer.toString(var14Lifetime1), var8, var11, 16777215, 0);
                var12 = var12 + var14Lifetime1;
                var11 += 12;
              }
            }
            if (2 == Archive.field_a) {
              AccountRequestState.field_f.drawString(pe.field_c[24], var6, var11, 16777215, 0);
              AccountRequestState.field_f.drawRightAligned(Integer.toString(var12), var8, var11, 16777215, 0);
              var12 = var12 + var12;
              var11 += 12;
              if (this.field_X.field_e.field_j + this.field_X.field_e.field_b > 0 &&
                this.field_X.field_d > 0) {
                AccountRequestState.field_f.drawString(pe.field_c[25], var6, var11, 16777215, 0);
                var14Lifetime2 = 500 * ((this.field_X.field_e.field_j + this.field_X.field_e.field_b) * this.field_Bb) / this.field_X.field_d;
                AccountRequestState.field_f.drawRightAligned(Integer.toString(var14Lifetime2), var8, var11, 16777215, 0);
                var12 = var12 + var14Lifetime2;
                var11 += 12;
              }
            }
            this.field_X.field_H = var12;
            if (!bk.c(-25704)) {
              var11 += 2;
              AccountRequestState.field_f.drawString(pe.field_c[26], var6, var11, 16777215, 0);
              AccountRequestState.field_f.drawRightAligned(Integer.toString(var12), var8, var11, 16777215, 0);
              var11 += 14;
              var11 += 14;
              FrameTimer.field_f.drawString(pe.field_c[27], 60, var11, 16777215, 0);
              FrameTimer.field_f.drawRightAligned(Integer.toString(var12 + ge.field_e), var8, var11, 16777215, 0);
              var11 += 12;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_X.field_f != 2 ||
              -1 == this.field_X.field_e.field_i &&
              this.field_X.field_e.field_e != this.field_X.field_e.field_f + this.field_X.field_e.field_k + this.field_X.field_e.field_h) {
              if (bk.c(-25704)) {
                AccountRequestState.field_f.drawParagraph(BitPacketBuffer.field_q, 16, 290, 288, 60, 16777215, 0, 1, 2, AccountRequestState.field_f.field_s);
                AccountRequestState.field_f.drawParagraph(DisplayNameSelectionPanel.field_L, 336, 290, 288, 60, 16777215, 0, 1, 2, AccountRequestState.field_f.field_s);
                stackIn_222_0 = (this.a(false, 384, (byte) -44, 370, ba.field_c)) ? 0 : 1;
                var14Lifetime3 = stackIn_222_0;
                discarded$0 = this.a(var14Lifetime3 != 0, 64, (byte) -44, 370, FullscreenFocusCanvas.field_c);
                decompiledFrameRemainder0 = (var16 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (12 <= this.field_Bb) {
                  discarded$1 = this.a(true, 384, (byte) -44, 340, ba.field_c);
                  decompiledFrameRemainder0 = (this.field_Bb == 12);
                  if (decompiledFrameRemainder0) {
                    AccountRequestState.field_f.drawParagraph(vb.field_c, 352, 290, 256, 50, 16777215, 0, 1, 1, AccountRequestState.field_f.field_s);
                    decompiledFrameRemainder0 = (var16 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!(12 <= this.field_Bb))) {
                  var14Lifetime3Lifetime1 = -wa.field_s + 16776960;
                  var15Lifetime1 = 24;
                  FrameTimer.field_f.drawParagraph(me.field_n, 384, 270, 192, 50, var14Lifetime3Lifetime1, 0, 1, 1, FrameTimer.field_f.field_s);
                  SoftwareRasterizer.fillRectangleAlpha(384, 340 + var15Lifetime1, 80, 50, 0, 128);
                  var14Lifetime3Lifetime1 = -wa.field_s + 16776960;
                  if (384 <= ef.field_j &&
                    464 >= ef.field_j &&
                    MouseWheelInput.field_b >= 340 + var15Lifetime1 &&
                    340 + var15Lifetime1 + 50 >= MouseWheelInput.field_b) {
                    var14Lifetime3Lifetime1 = 16777215;
                  }
                  FrameTimer.field_f.drawParagraph(ClientException.field_c, 384, var15Lifetime1 + 340, 80, 50, var14Lifetime3Lifetime1, 0, 1, 1, FrameTimer.field_f.field_s);
                  SoftwareRasterizer.drawRectangleOutline(383, 340 + var15Lifetime1 - 1, 82, 52, 0);
                  SoftwareRasterizer.drawRectangleOutline(385, 1 + var15Lifetime1 + 340, 78, 48, 0);
                  SoftwareRasterizer.drawRectangleOutline(384, var15Lifetime1 + 340, 80, 50, var14Lifetime3Lifetime1);
                  SoftwareRasterizer.fillRectangleAlpha(496, var15Lifetime1 + 340, 80, 50, 0, 128);
                  var14Lifetime3Lifetime1 = 16776960 - wa.field_s;
                  if (ef.field_j >= 496 &&
                    ef.field_j <= 576 &&
                    MouseWheelInput.field_b >= (var15Lifetime1 + 340) &&
                    MouseWheelInput.field_b <= (50 + (var15Lifetime1 + 340))) {
                    var14Lifetime3Lifetime1 = 16777215;
                  }
                  FrameTimer.field_f.drawParagraph(bc.field_b, 496, var15Lifetime1 + 340, 80, 50, var14Lifetime3Lifetime1, 0, 1, 1, FrameTimer.field_f.field_s);
                  SoftwareRasterizer.drawRectangleOutline(495, -1 + var15Lifetime1 + 340, 82, 52, 0);
                  SoftwareRasterizer.drawRectangleOutline(497, 340 + (var15Lifetime1 + 1), 78, 48, 0);
                  SoftwareRasterizer.drawRectangleOutline(496, 340 + var15Lifetime1, 80, 50, var14Lifetime3Lifetime1);
                  boolean decompiledSharedTail0 = (null == ProgressMessageDialog.field_ib);
                  if (!decompiledSharedTail0) {
                    AccountRequestState.field_f.drawParagraph(UiWidget.field_t, 352, 310, 256, 50, 16777215, 0, 1, 1, AccountRequestState.field_f.field_s);
                    decompiledSharedTail0 = (var16 != 0);
                  }
                  if (decompiledSharedTail0) {
                    AccountRequestState.field_f.drawParagraph(rj.field_d, 352, 310, 256, 50, 16777215, 0, 1, 1, AccountRequestState.field_f.field_s);
                  }
                  if (var16 != 0) {
                    discarded$2 = this.a(true, 384, (byte) -44, 340, ba.field_c);
                  }
                }
              }
            } else {
              discarded$2 = this.a(true, 384, (byte) -44, 340, ba.field_c);
            }
            FrameTimer.field_f.drawCentred(var3, 320, 468, 13881286, 0);
            k.field_f.setAsRasterTarget(0);
          }
          this.v(param0 + 0);
          bj.field_e.drawOpaque(0, 439);
          this.i((byte) 86);
          AgeValidator.field_p.drawOpaque(0, 0);
          SoftwareRasterizer.setClip(0, param0, 158, 480);
          FrameTimer.field_e.drawOpaque(0, 439);
          SoftwareRasterizer.setClip(158, 0, 482, 480);
          bj.field_e.draw(0, 439);
          SoftwareRasterizer.setClip(482, 0, 640, 480);
          FrameTimer.field_e.drawOpaque(0, 439);
          SoftwareRasterizer.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.DC(" + param0 + ')');
        }
    }

    private final void p(byte param0) {
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        StringBuilder stackIn_63_2 = null;
        String stackIn_64_3;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        StringBuilder stackIn_69_2 = null;
        String stackIn_70_3;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var2_intLifetime2;
        int var2_intLifetime3;
        var4 = field_V;
        try {
          if (od.field_c[8].field_t &&
            !od.field_c[9].field_t &&
            0 < this.field_I.field_a[9]) {
            od.field_c[9].field_t = true;
          }
          if (od.field_c[12].field_t &&
            !od.field_c[13].field_t &&
            this.field_I.field_a[13] > 0) {
            od.field_c[13].field_t = true;
          }
          if (od.field_c[9].field_t &&
            !od.field_c[8].field_t &&
            this.field_I.field_a[8] > 0) {
            od.field_c[8].field_t = true;
          }
          if (od.field_c[13].field_t &&
            !od.field_c[12].field_t &&
            this.field_I.field_a[12] > 0) {
            od.field_c[12].field_t = true;
          }
          if ((-qh.field_b.field_r + 624) <= ef.field_j &&
            ef.field_j <= 624 &&
            MouseWheelInput.field_b >= -qh.field_b.field_t - this.field_zb.field_i + 464 &&
            (464 - this.field_zb.field_i) >= MouseWheelInput.field_b &&
            this.field_jb <= 0) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = AccountNameAvailabilityValidator.field_n;
            if (DiskArchiveRequest.field_I == 1) {
              ja.field_i = 1;
              MusicPatch.playIndexedSoundEffectWithIntGuard(33, 27);
              this.field_zb.field_a = true;
            }
          }
          if (0 != this.field_gb) {
            this.field_Eb = new String[1];
            var2_int = 0;
            if (0 < this.field_gb) {
              var2_intLifetime2 = this.field_gb - 1;
              stackIn_63_0 = this.field_Eb;
              stackIn_63_1 = 0;
              stackIn_63_2 = new StringBuilder().append(SecondaryNodeDequeIterator.field_b);
              if (od.field_c[var2_intLifetime2].field_t) {
                stackIn_64_3 = od.field_c[var2_intLifetime2].field_j;
              } else {
                stackIn_64_3 = od.field_c[var2_intLifetime2].field_k;
              }
              stackIn_63_0[stackIn_63_1] = ((StringBuilder) (Object) stackIn_63_2).append(stackIn_64_3).toString();
            }
            if (0 > this.field_gb) {
              var2_intLifetime3 = -1 - this.field_gb;
              stackIn_69_0 = this.field_Eb;
              stackIn_69_1 = 0;
              stackIn_69_2 = new StringBuilder().append(SecondaryNodeDequeIterator.field_b);
              if (!sj.field_a[var2_intLifetime3].field_l) {
                stackIn_70_3 = sj.field_a[var2_intLifetime3].field_b;
              } else {
                stackIn_70_3 = sj.field_a[var2_intLifetime3].field_m;
              }
              stackIn_69_0[stackIn_69_1] = ((StringBuilder) (Object) stackIn_69_2).append(stackIn_70_3).toString();
            }
            if (DiskArchiveRequest.field_I == 1) {
              this.field_D = this.field_gb;
              MusicPatch.playIndexedSoundEffectWithIntGuard(84, 33);
            }
          }
          var2_intLifetime1 = 31 % ((param0 - 68) / 38);
          if (this.field_zb.field_b &&
            0 < this.field_jb) {
            this.field_Eb = new String[1];
            this.field_Eb[0] = MidiNoteMask.field_k;
          }
          if (1 == DiskArchiveRequest.field_I &&
            this.field_zb.field_b &&
            this.field_jb > 0) {
            var3 = 0;
            if (this.field_D > 0) {
              var3Lifetime1 = this.field_D - 1;
              if (!od.field_c[var3Lifetime1].field_t) {
                od.field_c[var3Lifetime1].field_t = true;
                this.s((byte) 106);
                this.field_jb = this.field_jb - 1;
                MusicPatch.playIndexedSoundEffectWithIntGuard(39, 32);
              }
            }
            if (this.field_D < 0) {
              var3Lifetime2 = -this.field_D - 1;
              if (!sj.field_a[var3Lifetime2].field_l) {
                sj.field_a[var3Lifetime2].field_l = true;
                this.s((byte) -68);
                this.field_jb = this.field_jb - 1;
                MusicPatch.playIndexedSoundEffectWithIntGuard(94, 32);
              }
            }
          }
          while (DefaultTextWidgetRenderer.d(1)) {
            if (lf.field_c != 13) {
              continue;
            }
            if (this.field_jb != 0) {
              continue;
            }
            ja.field_i = 1;
            this.field_zb.field_a = true;
            MusicPatch.playIndexedSoundEffectWithIntGuard(80, 27);
            if (var4 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.NB(" + param0 + ')');
        }
    }

    private final void g(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_V;
        try {
          SoftwareRasterizer.setClip(6, 1 + this.field_W, 459, 419);
          if (null == fh.field_s) {
            SoftwareRasterizer.fillRectangle(5, 58, 459, 419, 0);
            if (var3 != 0) {
              fh.field_s.drawOpaque(6, 58);
            }
          } else {
            fh.field_s.drawOpaque(6, 58);
          }
          if (!param0) {
            return;
          }
          SoftwareRasterizer.setClip(6, 58, 459, 419);
          var2_int = 0;
          while (var2_int < 25) {
            SoftwareRasterizer.drawHorizontalLineAlpha(0, this.field_W - var2_int, 640, 65280, -(var2_int * 10) + 250);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          SoftwareRasterizer.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) runtimeException), "Terraphoenix.KB(" + param0 + ')');
        }
    }

    private final void q(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_V;
        try {
          if (param0 >= -18) {
            return;
          }
          if (DiskArchiveRequest.field_I == 1 &&
            ef.field_j > 540 &&
            MouseWheelInput.field_b <= 28) {
            boolean decompiledFrameCompleted0 = true;
            TutorialText.field_c = ja.field_i;
            ja.field_i = 12;
            ProxyAuthenticationRequiredException.field_g = 20;
            if (TutorialText.field_c != 1) {
              TextFieldValidator.field_k = new Sprite(640, 480);
              var2_int = 0;
              while (var2_int < TextFieldValidator.field_k.pixels.length) {
                TextFieldValidator.field_k.pixels[var2_int] = k.field_f.pixels[var2_int];
                var2_int++;
                if (var3 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var3 != 0)) {
                TextFieldValidator.field_k = null;
              }
            } else {
              TextFieldValidator.field_k = null;
            }
            if (decompiledFrameCompleted0) {
              k.field_f.setAsRasterTarget(0);
            }
            MusicPatch.playIndexedSoundEffectWithIntGuard(66, 33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.PB(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -19) {
            this.field_hb = 4;
          }
          if (!TextLayout.field_b) {
            wg.field_f.draw(533, 7);
            if (ef.field_j >= 533 &&
              MouseWheelInput.field_b <= 35 &&
              ef.field_j <= 633 &&
              MouseWheelInput.field_b >= 7) {
              SoftwareRasterizer.fillRectangleAlpha(533, 8, 100, 26, 16777215, 128);
              this.field_Eb = new String[1];
              this.field_Eb[0] = ja.field_h;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2), "Terraphoenix.TA(" + param0 + ')');
        }
    }

    private final void b(int param0, byte[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, param1, param2, 118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("Terraphoenix.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    public Terraphoenix() {
        this.field_J = false;
        this.field_cb = 0;
        this.field_bb = null;
        this.field_Eb = null;
        this.field_D = 0;
        this.field_W = 0;
        this.field_eb = 0;
        this.field_xb = 0;
        this.field_db = false;
        this.field_R = 0;
        this.field_K = 2;
        this.field_mb = 0;
        this.field_Gb = false;
        this.field_qb = 0;
        this.field_P = -1;
        this.field_gb = 0;
        this.field_ib = 0;
        this.field_kb = 1;
        this.field_hb = 0;
        this.field_rb = 0;
        this.field_M = 2;
        this.field_G = 0;
        this.field_nb = new ga[12];
    }

    static {
        field_O = 0;
    }
}
