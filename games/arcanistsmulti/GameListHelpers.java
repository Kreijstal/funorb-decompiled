/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameListHelpers {
    static String[] field_c;
    static String[] field_g;
    static String field_a;
    static String field_h;
    static SceneWidget field_e;
    static String field_i;
    static String field_f;
    static Sprite[] field_b;
    static String field_d;

    final static void layoutChatPanel(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        ValidatedTextWidget.field_U.field_rb = param1;
        if (NameCheckHelpers.field_c == 2) {
          PointerOriginHelpers.field_d.field_rb = CanvasRasterBuffer.field_b;
        } else {
          PointerOriginHelpers.field_d.field_rb = SessionCookieHelpers.field_e;
        }
        int var9_int = 495;
        int var10 = 5;
        MusicVolumeHelpers.field_d.setBounds(-10 + var9_int, 5, var10, param2, (byte) -120);
        SingleChildContainer.field_D.setBounds(-ConfirmScene.field_Cb.field_x + MusicVolumeHelpers.field_d.field_x, 0, 0, param2, (byte) -120);
        if (param4 != -104) {
          return;
        }
        try {
          var10 = var10 + (param6 + param2);
          ConfirmScene.field_Cb.setBounds(ConfirmScene.field_Cb.field_x, SingleChildContainer.field_D.field_x, 0, param2, (byte) -120);
          MembershipOfferScreen.field_f.setBounds(MembershipOfferScreen.field_f.getContentWidth(-25921), 5, var10, param3, (byte) -120);
          var11 = PointerOriginHelpers.field_d.getContentWidth(-25921);
          PointerOriginHelpers.field_d.setBounds(var11, -5 + (var9_int - var11), var10, param3, (byte) -120);
          ValidatedTextWidget.field_U.setBounds(var9_int, 0, 0, param0, (byte) -120);
          var12 = var10 + param3 + 5;
          SceneScrollbar.field_Jb.setBounds(var9_int, 0, param0, var12, (byte) -120);
          SceneScrollbar.field_Jb.field_v = GradientBarPainter.createGradientFrame(3, SceneScrollbar.field_Jb.field_I, 1, 2105376, 11579568, 8421504);
          var12 = var12 + param0;
          IntensityTableHelpers.field_d.setBounds(var9_int, -(var9_int / 2) + param7, param8 - var12 / 2, var12, (byte) -120);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "fn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void resetChatHistory(int param0, byte param1) {
        SecondaryNodeDeque.field_f = 0;
        if (param1 >= -98) {
          return;
        }
        TutorialCaptionGlobals.field_d = new int[3];
        ClientIOException.field_b = param0;
        SupportPageHelpers.field_d = new ChatLine[param0 * 15];
    }

    final static int parseInteger(boolean param0, byte param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (2 <= param3 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param1 != -40) {
              stackIn_7_0 = -17;
              return stackIn_7_0;
            }
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param3 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param3 * var6;
                if (var10 / param3 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_46_0 = var6;
            return stackIn_46_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_49_0 = var4;
          stackIn_49_1 = new StringBuilder().append("fn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void drawLobbyFrame(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9) {
        int var10;
        int var11;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param3 && (SecondaryNodeDequeIterator.field_g != SoftwareRasterizer.field_e ||
          RasterSetupHelpers.field_a != SoftwareRasterizer.field_j) && (SoftwareRasterizer.field_j == GameSelectionHelpers.field_m.field_m &&
          SoftwareRasterizer.field_e == GameSelectionHelpers.field_m.field_e)) {
          if (DirectByteStorage.field_f != null) {
            MusicCrossfadeStream.layoutZoomedLobby(124, false);
          } else {
            if (null == CapsuleBar.field_x) {
              LobbyLayoutHelpers.layoutLobby((byte) -124);
            } else {
              MusicCrossfadeStream.layoutZoomedLobby(13, true);
            }
          }
        }
        if (!param3) {
          ConfirmScene.field_Hb = (SecondaryNodeDequeIterator.field_g - 640) / 2;
        } else {
          ConfirmScene.field_Hb = LoginCredentials.field_a;
        }
        NineSliceHelpers.updateTransitionTimers(param3, 0);
        if (GameSelectionHelpers.field_h > 0) {
          ValidationState.updateStatusTexts(param1, param3, 4, param7);
        }
        NodeHashTableIterator.field_d.field_X = 1;
        NodeHashTableIterator.field_d.field_t = BevelBoxPainter.field_f.field_t;
        if (AudioAndCookieHelpers.field_a > 0) {
          TermsNoticePanel.drawRankingsPanel(param3, param7, param1, 118);
        }
        if (QuickChatCategory.field_y > 0) {
          ChatPanelHelpers.drawChatPanel(param7, param3, param0, 2, param1);
        }
        if (MenuInputState.field_j &&
          DirectByteStorage.field_f.field_Rb >= DirectByteStorage.field_f.field_dc) {
          StatefulTextPainter.field_s.field_ub = false;
          NameCheckHelpers.field_m.field_Hb.field_rb = MusicVolumeHelpers.field_f;
          SpriteDecodeHelpers.resetChildOffsets((byte) -103, NameCheckHelpers.field_m.field_Cb);
        } else {
          NameCheckHelpers.field_m.field_Hb.field_rb = null;
          StatefulTextPainter.field_s.field_ub = true;
          GameListHelpers.drawGameList(param2, NameCheckHelpers.field_m, param6, param7, true);
        }
        var10 = -105 / ((-23 - param9) / 50);
        ContextActionMenu.drawLobby(param7, param2, param5, 0, param4, param8, param6);
        GameListHelpers.drawGameList(param2, ScreenTransitionHelpers.field_b, param6, param7, true);
        AudioShutdownHelpers.field_e = AudioShutdownHelpers.field_e + 1;
    }

    final static SocialListEntry lookupEntry(long param0, int param1) {
        if (param1 < 109) {
          return (SocialListEntry) null;
        }
        return (SocialListEntry) (OptionToggleHelpers.field_c.get(param0, (byte) -63));
    }

    private final static void drawGameList(int param0, SceneScrollPane param1, boolean param2, int param3, boolean param4) {
        int var27_int = 0;
        SceneScrollPane stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        SceneWidget stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        IntrusiveDeque var10 = null;
        int var11_int = 0;
        Object var11 = null;
        SocialListEntry var12 = null;
        int var13 = 0;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        SceneWidget var17 = null;
        SceneWidget var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          if (!param4) {
            GameListHelpers.releaseStatics((byte) -126);
          }
          var8 = 0;
          if (DirectByteStorage.field_f != null && (SceneTextInput.field_Hb != null ||
            ContextActionMenu.field_Fb != null ||
            CanvasRasterBuffer.field_a != null ||
            null != BattleStartHelpers.field_b)) {
            for (var9 = 0; var9 < RawDataNode.field_l; var9++) {
              var10_int = 255 & DirectByteStorage.field_f.field_Wb[var9];
              if (null != SceneTextInput.field_Hb &&
                null != SceneTextInput.field_Hb[var9] &&
                SceneTextInput.field_Hb[var9][var10_int]) {
                var5_int = 1;
              }
              if (ContextActionMenu.field_Fb != null &&
                ContextActionMenu.field_Fb[var9] != null) {
                var11_int = ContextActionMenu.field_Fb[var9][var10_int];
                if (var11_int != 0 &&
                  !LinkButtonPainter.field_c) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (null != CanvasRasterBuffer.field_a &&
                CanvasRasterBuffer.field_a[var9] != null) {
                var11_intLifetime1 = CanvasRasterBuffer.field_a[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (0 != var11_intLifetime1 &&
                  !LinkButtonPainter.field_c) {
                  var5_int = 1;
                }
              }
              if (null != BattleStartHelpers.field_b &&
                BattleStartHelpers.field_b[var9] != null) {
                var8 = var8 | BattleStartHelpers.field_b[var9][var10_int];
              }
            }
          }
          stackIn_43_0 = (SceneScrollPane) (param1);
          stackIn_44_1 = (PasswordCheckHelpers.field_h == param1);
          stackIn_47_0 = (!((SceneScrollPane) (Object) stackIn_43_0).relayout(stackIn_44_1, (byte) 98, 2 * (ImageProducerRasterBuffer.field_r + 2), 2, (8 + 4 * ImageProducerRasterBuffer.field_r) * param0, param2)) ? 0 : 1;
          var9Lifetime1 = stackIn_47_0;
          var10 = param1.field_Cb.field_G;
          var11 = null;
          var12 = (SocialListEntry) (var10.first(12623));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_G == null) {
              var12.field_Fb = new SceneWidget(0L, NoticeHelpers.field_j);
              var12.addChild(var12.field_Fb, 114);
              var12.field_Gb = new SceneWidget(0L, BattleScreen.field_E);
              if (SpriteDecodeHelpers.field_a) {
                var12.addChild(var12.field_Gb, 17);
              }
              var12.field_Gb.field_X = 2;
              var12.field_Cb = new SceneWidget(0L, IntrusiveNode.field_c);
              var12.addChild(var12.field_Cb, 109);
              var12.markTreeDirty((byte) 20);
              var12.field_Hb = new SceneWidget(0L, BattleUnit.field_V);
              var12.addChild(var12.field_Hb, 43);
              var12.field_Ub = new SceneWidget(0L, ScrollContainer.field_S);
              var12.addChild(var12.field_Ub, 107);
              var13 = 1;
            }
            var12.field_Fb.field_rb = null;
            var12.field_Fb.field_I = 0;
            var14 = var12.field_Fb;
            var12.field_Gb.field_rb = null;
            var14.field_x = 0;
            var15 = var12.field_Gb;
            var12.field_Gb.field_I = 0;
            var12.field_Hb.field_rb = null;
            var15.field_x = 0;
            var12.field_Hb.field_I = 0;
            var16 = var12.field_Hb;
            var12.field_Ub.field_rb = null;
            var16.field_x = 0;
            var17 = var12.field_Ub;
            var12.field_Ub.field_I = 0;
            var17.field_x = 0;
            var12.field_Cb.field_rb = null;
            var12.field_Cb.field_I = 0;
            var18 = var12.field_Cb;
            var18.field_x = 0;
            var12.field_x = param1.field_Cb.field_x;
            var19 = 0;
            var32 = var12.field_Qb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (param1 == NameCheckHelpers.field_m) {
              var21 += 42;
            }
            var33 = BitmapFont.truncateWithEllipsis(var12.field_Fb.field_Z, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_61_0 = (var33.equals(var12.field_Qb)) ? 0 : 1;
            var22 = stackIn_61_0;
            if (var12.field_Mb < 4) {
              if (var12.field_Mb > 0) {
                var20 = "<img=" + (-1 + var12.field_Mb) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (var12.field_Mb - 4 + NameValidator.field_u) + ">" + var33;
            }
            boolean decompiledFrameRemainder0 = true;
            var12.field_Fb.field_rb = var20;
            if (!var12.isUnlisted(183874081)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Jb ||
                (!(var6 <= var12.field_Pb) ||
                !(var7 <= var12.field_Vb) ||
                !((~var12.field_Bb & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Hb.field_ob = var23_int;
              var12.field_Gb.field_ob = var23_int;
              var12.field_Fb.field_ob = var23_int;
              var12.field_Fb.field_zb = var24_int;
              var12.field_Fb.field_J = var24_int;
              var12.field_Fb.field_eb = var24_int;
              var12.field_Gb.field_zb = var24_int;
              var12.field_Gb.field_J = var24_int;
              var12.field_Gb.field_eb = var24_int;
              var12.field_Hb.field_zb = var24_int;
              var12.field_Hb.field_J = var24_int;
              var12.field_Hb.field_eb = var24_int;
              if (ScreenTransitionHelpers.field_b == param1) {
                if (!DirectByteStorage.field_f.field_Lb) {
                  var12.field_Ub.field_rb = TextHotspotWidget.field_L;
                }
              } else {
                if (!var12.field_Db) {
                  if (!var12.field_Kb) {
                    var12.field_Hb.field_rb = AccountFlowHelpers.field_a;
                  } else {
                    var12.field_Fb.field_rb = CachedArchiveProvider.formatTemplate(-37, new String[]{var20}, TextFieldValidator.field_n);
                    var12.field_Hb.field_rb = SceneTextInput.field_Nb;
                    var12.field_Ub.field_rb = ViewportSetupHelpers.field_f;
                  }
                } else {
                  var12.field_Fb.field_rb = CachedArchiveProvider.formatTemplate(-123, new String[]{var20}, EffectVolumeHelpers.field_h);
                  var12.field_Ub.field_rb = ConfirmScene.field_Eb;
                }
              }
              var25_int = 0;
              if (null != DirectByteStorage.field_f &&
                ContentTransitionDialog.isOwnGameSelected((byte) 110) &&
                ~MembershipGlobals.field_a != ~var12.field_Nb) {
                if (var12.field_Hb.field_rb != null) {
                  var26 = var12.field_Hb.getContentWidth(-25921) + SceneTextInput.field_Gb * 2;
                  var12.field_Hb.setBounds(var26, var25_int, var19, ImageProducerRasterBuffer.field_r, (byte) -120);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Ub.field_rb) {
                  if (param1 == ScreenTransitionHelpers.field_b) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Ub.getContentWidth(-25921) + SceneTextInput.field_Gb * 2;
                  }
                  var12.field_Ub.setBounds(var26Lifetime2, var25_int, var19, ImageProducerRasterBuffer.field_r, (byte) -120);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_98_0 = var12.field_Fb;
              stackIn_98_1 = -var25_int + var12.field_x;
              if (SpriteDecodeHelpers.field_a) {
                stackIn_99_2 = 42;
              } else {
                stackIn_99_2 = 0;
              }
              ((SceneWidget) (Object) stackIn_98_0).setBounds(stackIn_98_1 - stackIn_99_2, var25_int, var19, ImageProducerRasterBuffer.field_r, (byte) -120);
              var12.field_Gb.field_rb = Integer.toString(var12.field_Pb);
              var12.field_Gb.setBounds(40, -40 + var12.field_x, var19, ImageProducerRasterBuffer.field_r, (byte) -120);
              var19 = var19 + ImageProducerRasterBuffer.field_r;
              if (var12.field_Fb.field_C &&
                var22 != 0) {
                TextLayout.field_c = var12.field_Qb;
                if (((null != HighscoreEntry.field_p)) &&
                  ((HighscoreEntry.field_p[var12.field_Mb] != null))) {
                  TextLayout.field_c = TextLayout.field_c + " - " + HighscoreEntry.field_p[var12.field_Mb];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12.field_Fb.field_C &&
                  HighscoreEntry.field_p != null &&
                  null != HighscoreEntry.field_p[var12.field_Mb]) {
                  TextLayout.field_c = HighscoreEntry.field_p[var12.field_Mb];
                }
              }
            }
            var23 = HuffmanCodec.formatStatusText((byte) -128, var12.field_Sb, var20);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Cb.field_Z.wrappedLineCount(var23, var12.field_x - (SceneTextInput.field_Gb + SceneTextInput.field_Gb));
              var12.field_Cb.field_rb = var23;
              var12.field_Cb.field_u = var12.field_Eb * 256 / TextLine.field_i;
              var12.field_Cb.setBounds(-(SceneTextInput.field_Gb * 2) + var12.field_x, SceneTextInput.field_Gb, var19, ImageProducerRasterBuffer.field_r * var24_intLifetime1, (byte) -120);
              var19 = var19 + var24_intLifetime1 * ImageProducerRasterBuffer.field_r;
            }
            if (var9Lifetime1 == 0) {
              var12.field_B = -var12.field_I + var19;
            }
            if (var13 != 0) {
              param1.field_Cb.positionAfter((byte) 119, (SceneWidget) (var11), var12, 2);
            }
            if (var12.field_U != 0 &&
              !var12.isUnlisted(183874081)) {
              if (var12.field_Hb.field_U != 0) {
                NameHelpers.sendLongRequest(param3, (byte) -85, var12.field_Nb);
              } else {
                if (var12.field_Ub.field_U == 0) {
                  StatefulTextPainter.openSocialEntryMenu(0, var12, 3, QueuedResponse.field_h, param1, 0, ConfirmedNameValidator.field_s);
                } else {
                  LobbyGameEntry.sendNameRequest(var12.field_Nb, -89, param3);
                }
              }
            }
            var11 = var12;
            if (var12.field_A &&
              !var12.isUnlisted(183874081)) {
              var24Lifetime2 = null;
              if (~var12.field_Nb == ~MembershipGlobals.field_a) {
                if (var5_int != 0 &&
                  !var12.field_Jb) {
                  var24Lifetime2 = NumericDateInputWidget.field_P;
                } else {
                  if (var7 > var12.field_Vb) {
                    var25_int = var7 - var12.field_Vb;
                    if (var25_int == 1) {
                      var24Lifetime2 = PendingMessageHelpers.field_a;
                    }
                    var24Lifetime2 = CachedArchiveProvider.formatTemplate(117, new String[]{null, Integer.toString(var25_int)}, UiContainer.field_A);
                    var30Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1;
                    var24Lifetime2 = var25;
                    var30Lifetime1Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1Lifetime1;
                  } else {
                    if (var6 > var12.field_Pb) {
                      var24Lifetime2 = CachedArchiveProvider.formatTemplate(-24, new String[]{null, Integer.toString(var6)}, SceneWidgetNode.field_n);
                    } else {
                      if ((var8 & ~var12.field_Bb) != 0) {
                        var25_int = ButtonMenuDialog.highestOneBit(~var12.field_Bb & var8, (byte) 108);
                        var24Lifetime2 = SocialListEntry.field_Rb;
                        if (var25_int > 0 &&
                          null != Scrollbar.field_P &&
                          var25_int <= Scrollbar.field_P.length &&
                          Scrollbar.field_P[var25_int - 1] != null) {
                          var24Lifetime2 = Scrollbar.field_P[-1 + var25_int][1];
                        }
                      }
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Jb) {
                  var24Lifetime2 = CachedArchiveProvider.formatTemplate(-39, new String[]{var20}, UiComponent.field_p);
                } else {
                  if (var7 > var12.field_Vb) {
                    var25_int = var7 - var12.field_Vb;
                    if (var25_int == 1) {
                      var24Lifetime2 = CachedArchiveProvider.formatTemplate(-115, new String[]{var20}, UrlHelpers.field_g);
                    }
                    var24Lifetime2 = CachedArchiveProvider.formatTemplate(127, new String[]{var20, Integer.toString(var25_int)}, IndexedSpriteState.field_b);
                  } else {
                    if (var12.field_Pb < var6) {
                      var24Lifetime2 = CachedArchiveProvider.formatTemplate(126, new String[]{var20, Integer.toString(var6)}, SessionCookieHelpers.field_c);
                    } else {
                      if ((var8 & ~var12.field_Bb) != 0) {
                        var25_int = ButtonMenuDialog.highestOneBit(~var12.field_Bb & var8, (byte) 96);
                        var24Lifetime2 = CachedArchiveProvider.formatTemplate(116, new String[]{var20}, UrlHelpers.field_a);
                        if (var25_int > 0 &&
                          null != Scrollbar.field_P &&
                          Scrollbar.field_P.length >= var25_int &&
                          null != Scrollbar.field_P[var25_int - 1]) {
                          var24Lifetime2 = CachedArchiveProvider.formatTemplate(-80, new String[]{var20}, Scrollbar.field_P[var25_int - 1][2]);
                        }
                      }
                    }
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < RawDataNode.field_l; var27_int++) {
                  var28 = DirectByteStorage.field_f.field_Wb[var27_int] & 255;
                  var29 = 0;
                  if (null != SceneTextInput.field_Hb &&
                    null != SceneTextInput.field_Hb[var27_int] &&
                    SceneTextInput.field_Hb[var27_int][var28] &&
                    !var12.field_Jb) {
                    var29 = 1;
                  }
                  if (ContextActionMenu.field_Fb != null &&
                    ContextActionMenu.field_Fb[var27_int] != null) {
                    var30_int = ContextActionMenu.field_Fb[var27_int][var28];
                    if (var30_int != 0 &&
                      !LinkButtonPainter.field_c &&
                      !var12.field_Jb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Pb) {
                      var29 = 1;
                    }
                  }
                  if (null != CanvasRasterBuffer.field_a &&
                    null != CanvasRasterBuffer.field_a[var27_int]) {
                    var30_intLifetime1 = CanvasRasterBuffer.field_a[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !LinkButtonPainter.field_c &&
                      !var12.field_Jb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Vb) {
                      var29 = 1;
                    }
                  }
                  if (BattleStartHelpers.field_b != null &&
                    BattleStartHelpers.field_b[var27_int] != null &&
                    (BattleStartHelpers.field_b[var27_int][var28] & ~var12.field_Bb) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ResizableModalPanel.field_bb[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (ScreenTransitionHelpers.field_b == param1 &&
                  ContentTransitionDialog.isOwnGameSelected((byte) 101)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + CachedArchiveProvider.formatTemplate(119, new String[]{(String) (var25)}, MeshModel.field_t);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + StatusDialog.field_Ub + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + LoginCredentials.field_d + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + CachedArchiveProvider.formatTemplate(-18, new String[]{(String) (var25)}, NumericDateInputWidget.field_I);
                  }
                }
                if (ScreenTransitionHelpers.field_b == param1 &&
                  !ContentTransitionDialog.isOwnGameSelected((byte) 72)) {
                  var27 = DirectByteStorage.field_f.field_ic;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + CachedArchiveProvider.formatTemplate(126, new String[]{var27}, ArchiveProvider.field_c);
                }
                TextLayout.field_c = (String) (var24Lifetime2);
              }
            }
            var12 = (SocialListEntry) (var10.next(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_216_0 = var5;
          stackIn_216_1 = new StringBuilder().append("fn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void sendPrivateMessage(int param0, boolean param1, String param2, long param3, int param4, int param5) {
        int var7_int = 0;
        try {
          StatusMessageHelpers.field_e.writeOpcode((byte) -48, param5);
          StatusMessageHelpers.field_e.position = StatusMessageHelpers.field_e.position + 1;
          var7_int = StatusMessageHelpers.field_e.position;
          StatusMessageHelpers.field_e.writeLong(param3, (byte) 85);
          StatusMessageHelpers.field_e.writeString(param2, 23333);
          StatusMessageHelpers.field_e.writeByte(param4, (byte) -84);
          StatusMessageHelpers.field_e.writeByte(!param1 ? 0 : 1, (byte) -52);
          int var8 = 106 % ((param0 - 32) / 56);
          StatusMessageHelpers.field_e.writeByteLengthAtMark(-var7_int + StatusMessageHelpers.field_e.position, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "fn.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_i = null;
        field_h = null;
        field_d = null;
        if (param0 != -60) {
          field_c = (String[]) null;
        }
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_a = "Waiting for sound effects";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_g = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
        field_h = "Invalid name";
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_i = "Public chat is unavailable while setting up a rated game.";
    }
}
