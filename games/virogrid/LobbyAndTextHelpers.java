/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyAndTextHelpers {
    static ArchiveLoadSequence field_c;
    static ScoreSubmissionHelpers field_a;
    static String[] field_b;

    final static void initializeKeyCodeMap(int param0) {
        try {
          MathAndCookieHelpers.field_c[47] = 73;
          MathAndCookieHelpers.field_c[59] = 57;
          MathAndCookieHelpers.field_c[91] = param0;
          MathAndCookieHelpers.field_c[93] = 43;
          MathAndCookieHelpers.field_c[45] = 26;
          MathAndCookieHelpers.field_c[61] = 27;
          MathAndCookieHelpers.field_c[222] = 58;
          MathAndCookieHelpers.field_c[192] = 28;
          MathAndCookieHelpers.field_c[520] = 59;
          MathAndCookieHelpers.field_c[44] = 71;
          MathAndCookieHelpers.field_c[46] = 72;
          MathAndCookieHelpers.field_c[92] = 74;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "lb.E(" + param0 + ')');
        }
    }

    final static void updateLobbyGamePlayerList(int param0, int param1, ScrollPane param2, boolean param3, int param4) {
        ScrollPane stackIn_69_0;
        int stackIn_69_1;
        boolean stackIn_69_2;
        boolean stackIn_69_3;
        int stackIn_69_4;
        int stackIn_69_5;
        boolean stackIn_70_6;
        Object stackIn_73_0 = null;
        int stackIn_91_0 = 0;
        SpriteWidget stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        int stackIn_160_3 = 0;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_378_2 = null;
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
        LobbyPlayerEntry var12 = null;
        int var13 = 0;
        SpriteWidget var14 = null;
        SpriteWidget var15 = null;
        SpriteWidget var16 = null;
        SpriteWidget var17 = null;
        SpriteWidget var18 = null;
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
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          if (param4 != 21547) {
            LobbyAndTextHelpers.hasOpenDialogLayer((byte) -34);
          }
          boolean decompiledFrameCompleted0 = true;
          var7 = 0;
          var8 = 0;
          if (AudioSetupHelpers.field_d != null && (null != TriangleSortHelpers.field_i ||
            FadingModalPanel.field_E != null ||
            null != TriangleMesh.field_B ||
            ContentTransitionDialog.field_db != null)) {
            var9 = 0;
            while (!(var9 >= TextMetricsGlobals.field_h)) {
              var10_int = 255 & AudioSetupHelpers.field_d.field_Pb[var9];
              if (var31 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (TriangleSortHelpers.field_i != null &&
                null != TriangleSortHelpers.field_i[var9] &&
                TriangleSortHelpers.field_i[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != FadingModalPanel.field_E &&
                null != FadingModalPanel.field_E[var9]) {
                var11_int = FadingModalPanel.field_E[var9][var10_int];
                if (var11_int > var6) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !ArchiveBytesHelpers.field_a) {
                  var5_int = 1;
                }
              }
              if (ContentTransitionDialog.field_db != null &&
                null != ContentTransitionDialog.field_db[var9]) {
                var8 = var8 | ContentTransitionDialog.field_db[var9][var10_int];
              }
              if (null != TriangleMesh.field_B &&
                null != TriangleMesh.field_B[var9]) {
                var11_intLifetime1 = TriangleMesh.field_B[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !ArchiveBytesHelpers.field_a) {
                  var5_int = 1;
                }
              }
              var9++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_69_0 = (ScrollPane) (param2);
            stackIn_69_1 = 4 + LobbySortHelpers.field_e * 2;
            stackIn_69_2 = param3;
            stackIn_69_3 = false;
            stackIn_69_4 = 2;
            stackIn_69_5 = (LobbySortHelpers.field_e + 2) * (4 * param0);
            stackIn_70_6 = (param2 == RasterBuffer.field_d);
            var9 = ((ScrollPane) (Object) stackIn_69_0).updateContentLayout(stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_69_4, stackIn_69_5, stackIn_70_6) ? 1 : 0;
          }
          var10 = param2.field_Jb.field_W;
          var11 = null;
          var12 = (LobbyPlayerEntry) (var10.first((byte) -36));
          scanLoop1: while (true) {
            stackIn_73_0 = null;
            if (stackIn_73_0 != var12) {
              var13 = 0;
              if (var31 != 0) {
                return;
              }
              if (null == var12.field_W) {
                var12.field_Lb = new SpriteWidget(0L, FadingModalPanel.field_F);
                var12.addChild(0, var12.field_Lb);
                var12.field_Kb = new SpriteWidget(0L, GzipDecompressor.field_d);
                if (DialWidgetPainter.field_d) {
                  var12.addChild(0, var12.field_Kb);
                }
                var12.field_Kb.field_lb = 2;
                var12.field_Yb = new SpriteWidget(0L, LinkTextPainter.field_h);
                var12.addChild(param4 - 21547, var12.field_Yb);
                var12.markTreeDirty((byte) 42);
                var12.field_Hb = new SpriteWidget(0L, UiTheme.field_a);
                var12.addChild(param4 ^ 21547, var12.field_Hb);
                var12.field_Mb = new SpriteWidget(0L, DualLinkHashTable.field_g);
                var13 = 1;
                var12.addChild(0, var12.field_Mb);
              }
              var12.field_Lb.field_V = null;
              var12.field_Lb.field_ub = 0;
              var14 = var12.field_Lb;
              var12.field_Kb.field_V = null;
              var14.field_K = 0;
              var12.field_Kb.field_ub = 0;
              var15 = var12.field_Kb;
              var15.field_K = 0;
              var12.field_Hb.field_V = null;
              var16 = var12.field_Hb;
              var12.field_Hb.field_ub = 0;
              var16.field_K = 0;
              var12.field_Mb.field_V = null;
              var12.field_Mb.field_ub = 0;
              var17 = var12.field_Mb;
              var12.field_Yb.field_V = null;
              var17.field_K = 0;
              var18 = var12.field_Yb;
              var12.field_Yb.field_ub = 0;
              var18.field_K = 0;
              var12.field_K = param2.field_Jb.field_K;
              var19 = 0;
              var20 = var12.field_Eb;
              var21 = 72;
              if (GameBoard.field_j == param2) {
                var21 += 42;
              }
              var20 = BitmapFont.truncateWithEllipsis(var12.field_Lb.field_C, var20, var21);
              stackIn_91_0 = (var20.equals(var12.field_Eb)) ? 0 : 1;
              var22 = stackIn_91_0;
              if (4 <= var12.field_Ub) {
                var20 = "<img=" + (-4 + var12.field_Ub + ClientEnvironmentHelpers.field_a) + ">" + var20;
              } else {
                if (var12.field_Ub > 0) {
                  var20 = "<img=" + (var12.field_Ub - 1) + ">" + var20;
                }
              }
              boolean decompiledFrameRemainder1 = true;
              var12.field_Lb.field_V = var20;
              if (!var12.isUnlinkedFromIndex(param4 ^ 21547)) {
                var23_int = 16764006;
                var24_int = 16777215;
                if (var5_int != 0 &&
                  !var12.field_Jb ||
                  (!(var12.field_Vb >= var6) ||
                  !(var7 <= var12.field_Rb) ||
                  !(0 >= (var8 & ~var12.field_Fb)))) {
                  var23_int = 8414771;
                  var24_int = 8421504;
                }
                var12.field_Hb.field_E = var23_int;
                var12.field_Kb.field_E = var23_int;
                var12.field_Lb.field_E = var23_int;
                var12.field_Lb.field_bb = var24_int;
                var12.field_Lb.field_A = var24_int;
                var12.field_Lb.field_ab = var24_int;
                var12.field_Kb.field_bb = var24_int;
                var12.field_Kb.field_A = var24_int;
                var12.field_Kb.field_ab = var24_int;
                var12.field_Hb.field_bb = var24_int;
                var12.field_Hb.field_A = var24_int;
                var12.field_Hb.field_ab = var24_int;
                if (param2 != TriangleMesh.field_r) {
                  if (var12.field_Xb) {
                    var12.field_Lb.field_V = MenuScreen.formatIndexedText(new String[]{var20}, MarkerSliderPainter.field_j, 2);
                    var12.field_Mb.field_V = TextMetricsGlobals.field_g;
                  } else if (!var12.field_Sb) {
                    var12.field_Hb.field_V = DisplayNameHelpers.field_c;
                  } else {
                    var12.field_Lb.field_V = MenuScreen.formatIndexedText(new String[]{var20}, SocketJs5Transport.field_A, 2);
                    var12.field_Hb.field_V = AgeValidator.field_p;
                    var12.field_Mb.field_V = EmailAvailabilityValidator.field_r;
                  }
                } else {
                  if (!AudioSetupHelpers.field_d.field_kc) {
                    var12.field_Mb.field_V = LobbyGameListHelpers.field_c;
                  }
                }
                var25_int = 0;
                if (AudioSetupHelpers.field_d != null &&
                  GameEntryHelpers.isCurrentGameEntry(1000) &&
                  LogoAndLoginHelpers.field_d != var12.field_Ob) {
                  if (var12.field_Hb.field_V != null) {
                    var26 = var12.field_Hb.measureNaturalWidth((byte) 93) + 2 * PopupMenuDrawHelpers.field_d;
                    var12.field_Hb.setGeometry(var25_int, LobbySortHelpers.field_e, var26, (byte) -64, var19);
                    var25_int = var25_int + var26;
                  }
                  if (var12.field_Mb.field_V != null) {
                    if (param2 != TriangleMesh.field_r) {
                      var26Lifetime2 = var12.field_Mb.measureNaturalWidth((byte) 122) + PopupMenuDrawHelpers.field_d * 2;
                    } else {
                      var26Lifetime2 = 40;
                    }
                    var12.field_Mb.setGeometry(var25_int, LobbySortHelpers.field_e, var26Lifetime2, (byte) -108, var19);
                    var25_int = var25_int + var26Lifetime2;
                  }
                }
                stackIn_159_0 = var12.field_Lb;
                stackIn_159_1 = var25_int;
                stackIn_159_2 = LobbySortHelpers.field_e;
                if (!DialWidgetPainter.field_d) {
                  stackIn_160_3 = 0;
                } else {
                  stackIn_160_3 = 42;
                }
                ((SpriteWidget) (Object) stackIn_159_0).setGeometry(stackIn_159_1, stackIn_159_2, -stackIn_160_3 + (var12.field_K - var25_int), (byte) -50, var19);
                var12.field_Kb.field_V = Integer.toString(var12.field_Vb);
                var12.field_Kb.setGeometry(-40 + var12.field_K, LobbySortHelpers.field_e, 40, (byte) -51, var19);
                var19 = var19 + LobbySortHelpers.field_e;
                if (!var12.field_Lb.field_S ||
                  var22 == 0) {
                  if ((!(!var12.field_Lb.field_S)) &&
                    ((null != WidgetContainer.field_A)) &&
                    ((WidgetContainer.field_A[var12.field_Ub] != null))) {
                    QuickChatCategoryCache.field_g = WidgetContainer.field_A[var12.field_Ub];
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  QuickChatCategoryCache.field_g = var12.field_Eb;
                  if (WidgetContainer.field_A != null &&
                    WidgetContainer.field_A[var12.field_Ub] != null) {
                    QuickChatCategoryCache.field_g = QuickChatCategoryCache.field_g + " - " + WidgetContainer.field_A[var12.field_Ub];
                  }
                }
              }
              var23 = LobbyGame.formatLobbyEventMessage(var20, var12.field_Wb, true);
              if (var23 != null) {
                var24_intLifetime1 = var12.field_Yb.field_C.wrappedLineCount(var23, var12.field_K - PopupMenuDrawHelpers.field_d - PopupMenuDrawHelpers.field_d);
                var12.field_Yb.field_V = var23;
                var12.field_Yb.field_H = var12.field_Gb * 256 / LobbySessionHelpers.field_c;
                var12.field_Yb.setGeometry(PopupMenuDrawHelpers.field_d, LobbySortHelpers.field_e * var24_intLifetime1, -(PopupMenuDrawHelpers.field_d * 2) + var12.field_K, (byte) -122, var19);
                var19 = var19 + LobbySortHelpers.field_e * var24_intLifetime1;
              }
              if (var9 == 0) {
                var12.field_kb = var19 - var12.field_ub;
              }
              if (var13 != 0) {
                param2.field_Jb.positionAfter(2, var12, (SpriteWidget) (var11), (byte) 108);
              }
              boolean decompiledFrameRemainder0 = true;
              if (var12.field_nb != 0 &&
                !var12.isUnlinkedFromIndex(0)) {
                if (0 == var12.field_Hb.field_nb) {
                  if (var12.field_Mb.field_nb != 0) {
                    ValidationIndicator.writePlayerAdmissionCancellation((byte) 74, var12.field_Ob, param1);
                  } else {
                    IntrusiveDeque.openPlayerContextMenu(0, HuffmanCodec.field_b, false, PasswordFieldPainter.field_y, 0, var12, param2);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  MarkerSliderPainter.writePlayerAdmissionRequest(param1, false, var12.field_Ob);
                }
              }
              if (var12.field_G &&
                !var12.isUnlinkedFromIndex(0)) {
                var24 = null;
                if (~LogoAndLoginHelpers.field_d == ~var12.field_Ob) {
                  if (var5_int != 0 &&
                    !var12.field_Jb) {
                    var24 = CanvasPresentHelpers.field_c;
                  } else {
                    if (var12.field_Rb < var7) {
                      var25_int = var7 - var12.field_Rb;
                      if (1 == var25_int) {
                        var24 = OverlayDrawHelpers.field_c;
                      }
                      var24 = MenuScreen.formatIndexedText(new String[]{null, Integer.toString(var25_int)}, SharedTextGlobals.field_c, 2);
                    } else {
                      if (var6 <= var12.field_Vb) {
                        if ((var8 & ~var12.field_Fb) != 0) {
                          var25_int = TextFieldValidator.highestOneBit(-728240159, ~var12.field_Fb & var8);
                          var24 = WidgetNode.field_o;
                          if (var25_int > 0 &&
                            MouseInputHandler.field_a != null &&
                            var25_int <= MouseInputHandler.field_a.length &&
                            null != MouseInputHandler.field_a[-1 + var25_int]) {
                            var24 = MouseInputHandler.field_a[var25_int - 1][1];
                          }
                        }
                      } else {
                        var24 = MenuScreen.formatIndexedText(new String[]{null, Integer.toString(var6)}, RankingsRequest.field_p, param4 ^ 21545);
                      }
                    }
                  }
                } else {
                  if (var5_int != 0 &&
                    !var12.field_Jb) {
                    var24 = MenuScreen.formatIndexedText(new String[]{var20}, CacheReference.field_q, 2);
                  } else {
                    if (var12.field_Rb >= var7) {
                      if (var12.field_Vb >= var6) {
                        if (0 != (~var12.field_Fb & var8)) {
                          var25_int = TextFieldValidator.highestOneBit(-728240159, var8 & ~var12.field_Fb);
                          var24 = MenuScreen.formatIndexedText(new String[]{var20}, PasswordConfirmationValidator.field_n, 2);
                          if (var25_int > 0 &&
                            null != MouseInputHandler.field_a &&
                            MouseInputHandler.field_a.length >= var25_int &&
                            MouseInputHandler.field_a[var25_int - 1] != null) {
                            var24 = MenuScreen.formatIndexedText(new String[]{var20}, MouseInputHandler.field_a[-1 + var25_int][2], 2);
                          }
                        }
                      } else {
                        var24 = MenuScreen.formatIndexedText(new String[]{var20, Integer.toString(var6)}, QuickChatPhraseRegistry.field_a, 2);
                      }
                    } else {
                      var25_int = var7 - var12.field_Rb;
                      if (var25_int == 1) {
                        var24 = MenuScreen.formatIndexedText(new String[]{var20}, ArchiveBytesHelpers.field_b, 2);
                      }
                      var24 = MenuScreen.formatIndexedText(new String[]{var20, Integer.toString(var25_int)}, NodeHashTable.field_c, 2);
                    }
                  }
                }
                if (var24 != null) {
                  var24 = "<col=A00000>" + (String) (var24);
                  var25 = null;
                  var26Lifetime1 = 0;
                  var27_int = 0;
                  while (var27_int < TextMetricsGlobals.field_h) {
                    var28 = 255 & AudioSetupHelpers.field_d.field_Pb[var27_int];
                    var29 = 0;
                    stackIn_73_0 = null;
                    if (stackIn_73_0 != TriangleSortHelpers.field_i &&
                      null != TriangleSortHelpers.field_i[var27_int] &&
                      TriangleSortHelpers.field_i[var27_int][var28] &&
                      !var12.field_Jb) {
                      var29 = 1;
                    }
                    if (FadingModalPanel.field_E != null &&
                      FadingModalPanel.field_E[var27_int] != null) {
                      var30_int = FadingModalPanel.field_E[var27_int][var28];
                      if (var30_int != 0 &&
                        !ArchiveBytesHelpers.field_a &&
                        !var12.field_Jb) {
                        var29 = 1;
                      }
                      if (var12.field_Vb < var30_int) {
                        var29 = 1;
                      }
                    }
                    if (TriangleMesh.field_B != null &&
                      TriangleMesh.field_B[var27_int] != null) {
                      var30_intLifetime1 = TriangleMesh.field_B[var27_int][var28];
                      if (var30_intLifetime1 != 0 &&
                        !ArchiveBytesHelpers.field_a &&
                        !var12.field_Jb) {
                        var29 = 1;
                      }
                      if (var30_intLifetime1 > var12.field_Rb) {
                        var29 = 1;
                      }
                    }
                    if (null != ContentTransitionDialog.field_db &&
                      ContentTransitionDialog.field_db[var27_int] != null &&
                      (~var12.field_Fb & ContentTransitionDialog.field_db[var27_int][var28]) != 0) {
                      var29 = 1;
                    }
                    if (var29 != 0) {
                      var30 = "<col=A00000>" + LoginMethodHelpers.field_a[var27_int] + "</col>";
                      if (null == var25) {
                        var25 = var30;
                      } else {
                        var26Lifetime1 = 1;
                        var25 = (String) (var25) + ", " + var30;
                      }
                    }
                    var27_int++;
                  }
                  if (param2 != TriangleMesh.field_r ||
                    !GameEntryHelpers.isCurrentGameEntry(1000)) {
                    if (var26Lifetime1 == 0) {
                      var24 = (String) (var24) + "<br>" + MenuScreen.formatIndexedText(new String[]{(String) (var25)}, PatchNoteUsage.field_k, 2);
                    } else {
                      var24 = (String) (var24) + "<br>" + UsernameAvailabilityValidator.field_q + (String) (var25);
                    }
                  } else if (var26Lifetime1 != 0) {
                    var24 = (String) (var24) + "<br>" + AccountDialogHelpers.field_e + (String) (var25);
                  } else {
                    var24 = (String) (var24) + "<br>" + MenuScreen.formatIndexedText(new String[]{(String) (var25)}, CacheReference.field_o, 2);
                  }
                  if (TriangleMesh.field_r == param2 &&
                    !GameEntryHelpers.isCurrentGameEntry(1000)) {
                    var27 = AudioSetupHelpers.field_d.field_Qb;
                    var24 = (String) (var24) + "<br>" + MenuScreen.formatIndexedText(new String[]{var27}, OverlayDrawHelpers.field_b, 2);
                  }
                  QuickChatCategoryCache.field_g = (String) (var24);
                }
              }
              var11 = var12;
              var12 = (LobbyPlayerEntry) (var10.next(16213));
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_377_0 = var5;
          stackIn_377_1 = new StringBuilder().append("lb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_378_2 = "null";
          } else {
            stackIn_378_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_377_0), ((StringBuilder) (Object) stackIn_377_1).append(stackIn_378_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_a = null;
          field_b = null;
          field_c = null;
          if (param0 != 7) {
            field_c = (ArchiveLoadSequence) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "lb.C(" + param0 + ')');
        }
    }

    final static boolean hasOpenDialogLayer(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -20) {
            field_c = (ArchiveLoadSequence) null;
          }
          stackIn_10_0 = (LogoIntroHelpers.field_c != null) && (null != LogoIntroHelpers.field_c.getTopVisibleLayer((byte) 51));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "lb.D(" + param0 + ')');
        }
    }

    final static void loadTextTable(int param0, Js5Archive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2620_0;
            StringBuilder stackIn_2620_1;
            String stackIn_2621_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int param0;
            Js5Archive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, Js5Archive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2620_0 = null;
                this.stackIn_2620_1 = null;
                this.stackIn_2621_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                PacketBuffer.field_k = param1;
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loginm3", (byte) -114);
                if (var2 != null) {
                  EditableTextWidget.field_L = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loginm2", (byte) -105);
                if (null != var2) {
                  TextJoinHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loginm1", (byte) -102);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("idlemessage20min", (byte) -100);
                if (null != var2) {
                  WidgetLayerStack.field_H = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("error_js5crc", (byte) -88);
                if (null != var2) {
                  ArchiveIndex.field_k = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("error_js5io", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.field_v = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("error_js5connect_full", (byte) -108);
                if (null != var2) {
                  MarkerSlider.field_L = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("error_js5connect", (byte) -66);
                if (var2 != null) {
                  ViewportController.field_b = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_gameupdated", (byte) -76);
                if (null != var2) {
                  CachedTextLayout.field_g = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_unable", (byte) -119);
                if (null != var2) {
                  RasterBuffer.field_a = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_ineligible", (byte) -72);
                if (null != var2) {
                  IntrusiveDequeCursor.field_d = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("usernameprompt", (byte) -66);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("passwordprompt", (byte) -87);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("andagainprompt", (byte) -62);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_read", (byte) -93);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_ignore", (byte) -71);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_oneunread", (byte) -126);
                if (null != var2) {
                  BoundedUrlRequest.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_xunread", (byte) -109);
                if (var2 != null) {
                  UsernameAvailabilityValidator.field_t = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_gotowebsite", (byte) -116);
                if (var2 != null) {
                  TextLayout.field_c = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ticketing_waitingformessages", (byte) -90);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_on", (byte) -69);
                if (var2 != null) {
                  Js5Archive.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_friends", (byte) -65);
                if (null != var2) {
                  ValidationMessageWidget.field_Y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_off", (byte) -74);
                if (var2 != null) {
                  BitCountAndDialogHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_lobby", (byte) -86);
                if (null != var2) {
                  RankingArraySupport.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_public", (byte) -99);
                if (null != var2) {
                  LogoRenderHelpers.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_ignore", (byte) -77);
                if (var2 != null) {
                  DirectByteStorage.field_k = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_tips", (byte) -110);
                if (var2 != null) {
                  ArrayWidgetContainer.field_A = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_game", (byte) -90);
                if (var2 != null) {
                  StrongCacheReference.field_A = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_private", (byte) -68);
                if (var2 != null) {
                  DateOfBirthValidator.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_entered_game", (byte) -98);
                if (var2 != null) {
                  StrongCacheReference.field_y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_joined_your_game", (byte) -112);
                if (null != var2) {
                  QueuedListRequest.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_entered_other_game", (byte) -74);
                if (var2 != null) {
                  MusicCrossfadeStream.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_left_lobby", (byte) -62);
                if (var2 != null) {
                  ScrollPaneWithFooter.field_Jb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_lost_con", (byte) -124);
                if (var2 != null) {
                  PopupInputHelpers.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_cannot_join_full", (byte) -104);
                if (null != var2) {
                  DisplayModeInfo.field_h = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_cannot_join_inprogress", (byte) -104);
                if (null != var2) {
                  StateToken.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_declined_invite", (byte) -70);
                if (null != var2) {
                  ArchiveFactoryHelpers.field_c = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_withdrew_request", (byte) -107);
                if (null != var2) {
                  AccountTermsPanel.field_E = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_removed", (byte) -63);
                if (null != var2) {
                  DiskArchiveRequest.field_G = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_x_dropped_out", (byte) -68);
                if (var2 != null) {
                  CheckboxPainter.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_entered_other_game", (byte) -109);
                if (var2 != null) {
                  PopupMenuHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_game_is_full", (byte) -105);
                if (null != var2) {
                  HelpPopup.field_Eb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_game_has_started", (byte) -105);
                if (null != var2) {
                  CipherPacketBuffer.field_o = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_you_declined_invite", (byte) -106);
                if (var2 != null) {
                  LinkTextPainter.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_invite_withdrawn", (byte) -68);
                if (var2 != null) {
                  QuickChatCategoryCache.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_request_declined", (byte) -113);
                if (var2 != null) {
                  LobbyJoinTextGlobals.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_request_withdrawn", (byte) -66);
                if (null != var2) {
                  MusicPatchEnvelope.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_all_players_have_left", (byte) -93);
                if (var2 != null) {
                  SessionSeedHelpers.field_d = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_name", (byte) -121);
                if (var2 != null) {
                  DirectByteStorage.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_rating", (byte) -116);
                if (null != var2) {
                  AudioSetupHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_friend_add", (byte) -80);
                if (null != var2) {
                  ResizableDialog.field_Z = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_friend_rm", (byte) -104);
                if (var2 != null) {
                  GameClock.field_a = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_name_add", (byte) -74);
                if (null != var2) {
                  ClientServiceHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_name_rm", (byte) -90);
                if (null != var2) {
                  PasswordFieldPainter.field_A = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_lobby_location", (byte) -108);
                if (var2 != null) {
                  WidgetNode.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_all_games", (byte) -69);
                if (null != var2) {
                  GameBoard.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_status", (byte) -111);
                if (null != var2) {
                  LobbyGameListHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_owner", (byte) -107);
                if (var2 != null) {
                  RasterBuffer.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_players", (byte) -96);
                if (var2 != null) {
                  MouseHandlerSupport.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_avg_rating", (byte) -96);
                if (null != var2) {
                  QuickChatPhraseDefinition.field_r = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_options", (byte) -68);
                if (var2 != null) {
                  CameraAndLogoHelpers.field_d = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gamelist_elapsed_time", (byte) -60);
                if (null != var2) {
                  ReflectionCheck.field_k = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_play_rated", (byte) -110);
                if (var2 != null) {
                  CacheReference.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_create_unrated", (byte) -61);
                if (var2 != null) {
                  ClientEnvironmentHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options", (byte) -87);
                if (var2 != null) {
                  UrlRewriteHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options_whocanjoin", (byte) -70);
                if (var2 != null) {
                  LoginCredentialType.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options_players", (byte) -107);
                if (null != var2) {
                  FrameSkin.field_d = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options_dontmind", (byte) -109);
                if (var2 != null) {
                  CheckboxButton.field_I = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options_allow_spectate", (byte) -128);
                if (var2 != null) {
                  QueuedListRequest.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_options_ratedgametype", (byte) -75);
                if (null != var2) {
                  LoadingProgressHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("yes", (byte) -108);
                if (null != var2) {
                  LabeledChildWidget.field_F = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("no", (byte) -60);
                if (var2 != null) {
                  PasswordLoginCredentials.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_invite_players", (byte) -89);
                if (var2 != null) {
                  TypeCode.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("close", (byte) -93);
                if (null != var2) {
                  StateToken.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("add_x_to_friends", (byte) -112);
                if (var2 != null) {
                  UiLayerInputHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("add_x_to_ignore", (byte) -101);
                if (var2 != null) {
                  BoundedUrlRequest.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rm_x_from_friends", (byte) -96);
                if (null != var2) {
                  ArchiveRequest.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rm_x_from_ignore", (byte) -78);
                if (var2 != null) {
                  ReflectionCheckHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("send_pm_to_x", (byte) -74);
                if (var2 != null) {
                  Js5ArchiveManager.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("send_qc_to_x", (byte) -100);
                if (var2 != null) {
                  BoundedUrlRequest.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("send_pm", (byte) -81);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invite_accept_xs_game", (byte) -62);
                if (var2 != null) {
                  MidiPcmStream.field_D = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invite_decline_xs_game", (byte) -71);
                if (var2 != null) {
                  UsernameAvailabilityValidator.field_u = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("join_xs_game", (byte) -83);
                if (null != var2) {
                  ScoreSubmissionHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("join_request_xs_game", (byte) -127);
                if (null != var2) {
                  QueuedRequest.field_i = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("join_withdraw_request_xs_game", (byte) -110);
                if (null != var2) {
                  TextButton.field_y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gameopt_kick_x_from_this_game", (byte) -93);
                if (var2 != null) {
                  FallingParticle.field_k = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gameopt_withdraw_invite_to_x", (byte) -82);
                if (null != var2) {
                  RegistrationRequestDialog.field_Cb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gameopt_accept_x_into_game", (byte) -78);
                if (var2 != null) {
                  WidgetFactoryHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gameopt_reject_x_from_game", (byte) -122);
                if (null != var2) {
                  SessionSeedHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_gameopt_invite_x_to_game", (byte) -124);
                if (var2 != null) {
                  VerticalScrollbar.field_Hb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("report_x_for_abuse", (byte) -92);
                if (null != var2) {
                  Bzip2State.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_send_message_password_a", (byte) -69);
                if (null != var2) {
                  FullscreenSupport.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_send_message_password_b", (byte) -69);
                if (var2 != null) {
                  SpriteState.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_lobby_show_all", (byte) -120);
                if (var2 != null) {
                  TextMetricsGlobals.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_lobby_friends_only", (byte) -98);
                if (var2 != null) {
                  BufferedSocket.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_lobby_friends", (byte) -62);
                if (var2 != null) {
                  DialWidgetPainter.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_lobby_hide", (byte) -96);
                if (null != var2) {
                  DualLinkDequeIterator.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_game_show_all", (byte) -66);
                if (var2 != null) {
                  SpriteLoadHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_game_friends_only", (byte) -92);
                if (var2 != null) {
                  ValidationIndicator.field_F = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_game_friends", (byte) -100);
                if (null != var2) {
                  CachedArchiveSource.field_u = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_game_hide", (byte) -63);
                if (null != var2) {
                  QueuedRequest.field_m = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_pm_show_all", (byte) -67);
                if (var2 != null) {
                  ReflectionCheck.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_pm_friends_only", (byte) -109);
                if (var2 != null) {
                  SpriteState.field_v = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_pm_friends", (byte) -106);
                if (var2 != null) {
                  DialWidgetPainter.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mu_chat_invisible_and_silent_mode", (byte) -115);
                if (null != var2) {
                  DebouncedValidator.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_have_been_removed_from_xs_game", (byte) -119);
                if (null != var2) {
                  StatSubmission.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("your_rating_is_x", (byte) -95);
                if (var2 != null) {
                  StatSubmission.field_m = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_are_on_x_server", (byte) -80);
                if (null != var2) {
                  FadingModalPanel.field_J = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rated_game", (byte) -92);
                if (var2 != null) {
                  IconTextComponent.field_Ib = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unrated_game", (byte) -88);
                if (null != var2) {
                  LogoRenderHelpers.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rated_game_tips", (byte) -85);
                if (null != var2) {
                  DiskArchiveRequest.field_A = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("searching_for_opponent_singular", (byte) -81);
                if (var2 != null) {
                  IntrusiveDequeCursor.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("searching_for_opponents_plural", (byte) -113);
                if (null != var2) {
                  ConditionalTextValue.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("find_opponent_singular", (byte) -112);
                if (null != var2) {
                  ArrayWidgetContainer.field_x = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("find_opponents_plural", (byte) -119);
                if (var2 != null) {
                  IntrusiveDeque.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rated_game_tips_setup_singular", (byte) -103);
                if (null != var2) {
                  FullscreenFocusCanvas.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rated_game_tips_setup_plural", (byte) -96);
                if (null != var2) {
                  AccountTermsPanel.field_K = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waiting_to_start_hint", (byte) -66);
                if (null != var2) {
                  StatefulWidgetPainter.field_v = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("your_game", (byte) -109);
                if (var2 != null) {
                  TextLayoutLine.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("game_full", (byte) -73);
                if (null != var2) {
                  PendingScoreQuery.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("join_requests_one", (byte) -69);
                if (null != var2) {
                  ValidationIndicator.field_M = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("join_requests_many", (byte) -102);
                if (var2 != null) {
                  IntrusiveNode.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("xs_game", (byte) -99);
                if (null != var2) {
                  ScoreSubmissionHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waiting_for_x_to_start_game", (byte) -61);
                if (null != var2) {
                  WhirlpoolDigest.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("game_options_changed", (byte) -115);
                if (var2 != null) {
                  ArchiveFactoryHelpers.field_a = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("players_x_of_y", (byte) -66);
                if (null != var2) {
                  MarkerSlider.field_M = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("message_lobby", (byte) -92);
                if (var2 != null) {
                  BufferedFile.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_lobby", (byte) -114);
                if (var2 != null) {
                  ConnectionStage.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("message_game", (byte) -66);
                if (null != var2) {
                  RasterEffectHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("message_team", (byte) -120);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_game", (byte) -112);
                if (null != var2) {
                  ChatFilterHelpers.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("kick", (byte) -85);
                if (var2 != null) {
                  LobbyGameListHelpers.field_c = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("inviting_x", (byte) -118);
                if (null != var2) {
                  MarkerSliderPainter.field_j = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("x_wants_to_join", (byte) -69);
                if (null != var2) {
                  SocketJs5Transport.field_A = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("accept", (byte) -96);
                if (null != var2) {
                  AgeValidator.field_p = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reject", (byte) -123);
                if (var2 != null) {
                  EmailAvailabilityValidator.field_r = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invite", (byte) -75);
                if (null != var2) {
                  DisplayNameHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_concluded", (byte) -73);
                if (var2 != null) {
                  WeightedLruCache.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_spectate", (byte) -85);
                if (null != var2) {
                  BufferedFile.field_a = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_playing", (byte) -107);
                if (var2 != null) {
                  RasterBuffer.field_k = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_join", (byte) -86);
                if (null != var2) {
                  FrameSkin.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_private", (byte) -64);
                if (var2 != null) {
                  IconTextComponent.field_Eb = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("status_full", (byte) -75);
                if (null != var2) {
                  BufferedSocket.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("players_in_game", (byte) -88);
                if (var2 != null) {
                  LogoIntroHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_are_invited_to_xs_game", (byte) -102);
                if (var2 != null) {
                  CredentialHelpers.field_e = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("asking_to_join_xs_game", (byte) -66);
                if (var2 != null) {
                  IndexedSpriteState.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("who_can_join", (byte) -91);
                if (var2 != null) {
                  HelpPopup.field_Gb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_can_join", (byte) -115);
                if (null != var2) {
                  PendingScoreQuery.field_i = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_can_ask_to_join", (byte) -92);
                if (var2 != null) {
                  MusicCrossfadeStream.field_z = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_cannot_join_in_progress", (byte) -78);
                if (null != var2) {
                  AccountCreationSupport.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_can_spectate", (byte) -127);
                if (var2 != null) {
                  Js5Transport.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("you_can_not_spectate", (byte) -92);
                if (var2 != null) {
                  BackgroundParticle.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("spectate_xs_game", (byte) -118);
                if (var2 != null) {
                  LobbyJoinTextGlobals.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hide_players_in_xs_game", (byte) -97);
                if (var2 != null) {
                  AsyncCheckResult.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("show_players_in_xs_game", (byte) -78);
                if (null != var2) {
                  VerticalScrollbar.field_Gb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("connecting_to_friend_server_twoline", (byte) -122);
                if (var2 != null) {
                  DraggableWidget.field_H = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading", (byte) -86);
                if (var2 != null) {
                  LoginCredentialType.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("offline", (byte) -84);
                if (null != var2) {
                  NodeHashTable.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("multiconst_invite_only", (byte) -84);
                if (null != var2) {
                  PasswordLoginCredentials.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("multiconst_clan", (byte) -64);
                if (var2 != null) {
                  StateToken.field_a = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("multiconst_friends", (byte) -93);
                if (var2 != null) {
                  RasterBuffer.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("multiconst_similar_rating", (byte) -126);
                if (null != var2) {
                  LoginPanel.field_R = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("multiconst_open", (byte) -109);
                if (var2 != null) {
                  TextEncodingHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("no_options_available", (byte) -122);
                if (var2 != null) {
                  OverlayDrawHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reportabuse", (byte) -66);
                if (var2 != null) {
                  ChatPanelUpdateHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("presstabtochat", (byte) -85);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pressf10toquickchat", (byte) -113);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("dob_chatdisabled", (byte) -61);
                if (null != var2) {
                  TextureCache.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("dob_enterforchat", (byte) -98);
                if (var2 != null) {
                  NameCharacterHelpers.field_c = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("tab_hidechattemporarily", (byte) -110);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("esc_cancelprivatemessage", (byte) -128);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("esc_cancelthisline", (byte) -91);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("privatequickchat_from_x", (byte) -68);
                if (var2 != null) {
                  NanoTickClock.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("privatequickchat_to_x", (byte) -92);
                if (var2 != null) {
                  AudioPumpThread.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("privatechat_blankarea_explanation", (byte) -114);
                if (var2 != null) {
                  MathAndCookieHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("publicchat_unavailable_ratedgame", (byte) -106);
                if (null != var2) {
                  PendingSubmission.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("privatechat_friend_offline", (byte) -68);
                if (var2 != null) {
                  CameraAndLogoHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("privatechat_friend_notlisted", (byte) -78);
                if (var2 != null) {
                  FallingParticle.field_g = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("chatviewscrolledup", (byte) -71);
                if (var2 != null) {
                  DialWidgetPainter.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("thisisrunescapeclan", (byte) -125);
                if (var2 != null) {
                  SocketJs5Transport.field_y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("thisisrunescapeclan_notowner", (byte) -119);
                if (var2 != null) {
                  TriangleSortHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("runescapeclan", (byte) -119);
                if (var2 != null) {
                  DualLinkDequeIterator.field_g = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rated_membersonly", (byte) -123);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_membersonly", (byte) -116);
                if (var2 != null) {
                  LoginPanel.field_L = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_1moreratedgame", (byte) -124);
                if (null != var2) {
                  ChecksumHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_moreratedgames", (byte) -82);
                if (var2 != null) {
                  SocketConnector.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_needrating", (byte) -99);
                if (var2 != null) {
                  MenuInputState.field_j = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_unratedonly", (byte) -63);
                if (var2 != null) {
                  ChatAndIgnoreHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_notunlocked", (byte) -71);
                if (var2 != null) {
                  BufferedSocket.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_cannotbecombined1", (byte) -116);
                if (null != var2) {
                  BitwiseHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_cannotbecombined2", (byte) -85);
                if (null != var2) {
                  BirthDateEntryPanel.field_I = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playernotmember", (byte) -115);
                if (var2 != null) {
                  CacheReference.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_younotmember", (byte) -86);
                if (null != var2) {
                  CanvasPresentHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playerneedsrating", (byte) -119);
                if (var2 != null) {
                  QuickChatPhraseRegistry.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_youneedrating", (byte) -116);
                if (var2 != null) {
                  RankingsRequest.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playerneedsratedgames", (byte) -105);
                if (var2 != null) {
                  NodeHashTable.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_youneedratedgames", (byte) -67);
                if (var2 != null) {
                  SharedTextGlobals.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playerneeds1ratedgame", (byte) -105);
                if (null != var2) {
                  ArchiveBytesHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_youneed1ratedgame", (byte) -62);
                if (null != var2) {
                  OverlayDrawHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playerhasntunlocked", (byte) -70);
                if (null != var2) {
                  PasswordConfirmationValidator.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_youhaventunlocked", (byte) -93);
                if (var2 != null) {
                  WidgetNode.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_trychanging1", (byte) -117);
                if (null != var2) {
                  CacheReference.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_trychanging2", (byte) -117);
                if (null != var2) {
                  AccountDialogHelpers.field_e = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_needchanging1", (byte) -69);
                if (var2 != null) {
                  PatchNoteUsage.field_k = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_needchanging2", (byte) -113);
                if (null != var2) {
                  UsernameAvailabilityValidator.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_mightchange", (byte) -65);
                if (null != var2) {
                  OverlayDrawHelpers.field_b = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playersdontqualify", (byte) -95);
                if (var2 != null) {
                  FullscreenSupport.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_playersdontqualify_selectgametab", (byte) -105);
                if (null != var2) {
                  SessionSeedHelpers.field_a = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_unselectedoptions", (byte) -73);
                if (null != var2) {
                  CheckboxPainter.field_k = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_pleaseselectoption1", (byte) -128);
                if (null != var2) {
                  Js5Transport.field_r = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_pleaseselectoption2", (byte) -82);
                if (var2 != null) {
                  ReflectionCheckHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_badnumplayers", (byte) -110);
                if (var2 != null) {
                  PacketRequestHelpers.field_a = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_inviteplayers_or_trychanging1", (byte) -96);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  MouseTrailPoint.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_inviteplayers_or_trychanging2", (byte) -106);
                if (null != var2) {
                  InputSetupHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_novalidcombos", (byte) -93);
                if (null != var2) {
                  MusicCrossfadeStream.field_F = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameopt_pleasetrychanging", (byte) -76);
                if (null != var2) {
                  BackgroundParticle.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_title", (byte) -123);
                if (null != var2) {
                  ClientEnvironmentHelpers.field_i = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_mutethisplayer", (byte) -72);
                if (null != var2) {
                  StatusAndUrlHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_suggestmute", (byte) -100);
                if (var2 != null) {
                  ContextMenuHelpers.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_intro", (byte) -61);
                if (null != var2) {
                  PacketRequestHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_intro_no_name", (byte) -102);
                if (var2 != null) {
                  BoundedRandomAccessFile.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ra_explanation", (byte) -84);
                if (var2 != null) {
                  GameOptions.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_pillar_0", (byte) -119);
                if (null != var2) {
                  SoundCache.field_c = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_0", (byte) -92);
                if (null != var2) {
                  MouseTrailPoint.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_1", (byte) -77);
                if (null != var2) {
                  GameKeyHandler.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_2", (byte) -89);
                if (var2 != null) {
                  MusicCrossfadeStream.field_G = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_3", (byte) -128);
                if (var2 != null) {
                  EmailAvailabilityValidator.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_4", (byte) -121);
                if (var2 != null) {
                  FullscreenErrorDialog.field_fb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_0_5", (byte) -108);
                if (null != var2) {
                  InputSetupHelpers.field_h = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_pillar_1", (byte) -113);
                if (null != var2) {
                  PendingHighscoreRequest.field_s = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_1_0", (byte) -107);
                if (var2 != null) {
                  BufferedSocket.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_1_1", (byte) -65);
                if (null != var2) {
                  OverlayDrawHelpers.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_1_2", (byte) -103);
                if (null != var2) {
                  TriangleMesh.field_Q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_1_3", (byte) -74);
                if (var2 != null) {
                  RasterEffectHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_1_4", (byte) -62);
                if (var2 != null) {
                  ArrayWidgetContainer.field_D = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_pillar_2", (byte) -80);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_2_0", (byte) -102);
                if (var2 != null) {
                  LabeledChildWidget.field_H = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_2_1", (byte) -106);
                if (var2 != null) {
                  FadeLayer.field_F = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rule_2_2", (byte) -123);
                if (null != var2) {
                  DialWidgetPainter.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("createafreeaccount", (byte) -121);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("cancel", (byte) -85);
                if (var2 != null) {
                  TextMetricsGlobals.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleaselogintoplay", (byte) -91);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleaselogin", (byte) -69);
                if (null != var2) {
                  TextFieldValidator.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleaselogin_member", (byte) -104);
                if (null != var2) {
                  PacketBuffer.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invaliduserorpass", (byte) -126);
                if (var2 != null) {
                  DualLinkNode.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleasetryagain", (byte) -61);
                if (null != var2) {
                  BitwiseHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleasereenterpass", (byte) -85);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("playfreeversion", (byte) -80);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reloadgame", (byte) -71);
                if (null != var2) {
                  SocketConnector.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("toserverlist", (byte) -110);
                if (null != var2) {
                  AccountCreationForm.field_N = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("tocustomersupport", (byte) -120);
                if (var2 != null) {
                  RequestResendSupport.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("changedisplayname", (byte) -71);
                if (null != var2) {
                  EmailValidator.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntohomepage", (byte) -106);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("justplay", (byte) -71);
                if (var2 != null) {
                  DecodedSpriteHelpers.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("justplay_excl", (byte) -98);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login", (byte) -116);
                if (null != var2) {
                  TextWidgetPainter.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("goback", (byte) -120);
                if (var2 != null) {
                  DialWidgetPainter.field_o = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("otheroptions", (byte) -76);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("proceed", (byte) -119);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("connectingtoserver", (byte) -93);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleasewait", (byte) -61);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("logging_in", (byte) -78);
                if (var2 != null) {
                  NameCharacterHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect", (byte) -97);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("backtoerror", (byte) -62);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleasecheckinternet", (byte) -90);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("attemptingtoreconnect", (byte) -120);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("connectionlost_reconnecting", (byte) -92);
                if (null != var2) {
                  LobbyLayout.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("connectionlost_withreason", (byte) -93);
                if (null != var2) {
                  RasterEffectHelpers.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("passwordverificationrequired", (byte) -108);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invalidpass", (byte) -119);
                if (null != var2) {
                  DecodedSpriteHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("retry", (byte) -95);
                if (null != var2) {
                  MenuInputState.field_e = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("back", (byte) -76);
                if (null != var2) {
                  AccountChoicePanel.field_D = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("exitfullscreenmode", (byte) -96);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quittowebsite", (byte) -74);
                if (var2 != null) {
                  BoundedUrlRequest.field_k = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("connectionrestored", (byte) -126);
                if (var2 != null) {
                  GrowableIntList.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("warning_ifyouquit", (byte) -95);
                if (null != var2) {
                  RenderTargetHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("warning_ifyouquitorleavepage", (byte) -81);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("resubscribe_withoutlosing_fs", (byte) -62);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("resubscribe_withoutlosing", (byte) -111);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("customersupport_withoutlosing_fs", (byte) -62);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("customersupport_withoutlosing", (byte) -91);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("js5help_withoutlosing_fs", (byte) -103);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("js5help_withoutlosing", (byte) -103);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("checkinternet_withoutlosing_fs", (byte) -120);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("checkinternet_withoutlosing", (byte) -71);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_intro", (byte) -111);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_sameaccounttip_unnamed", (byte) -97);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("dateofbirthprompt", (byte) -80);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fetchingcountrylist", (byte) -117);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("countryprompt", (byte) -101);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("countrylisterror", (byte) -69);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("theonlypersonalquestions", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_submittingdata", (byte) -89);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("check", (byte) -115);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_pleasechooseausername", (byte) -88);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_usernameblurb", (byte) -126);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("checkingavailability", (byte) -80);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("checking", (byte) -66);
                if (null != var2) {
                  MusicCrossfadeStream.field_s = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_namealreadytaken", (byte) -100);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_sameaccounttip_named", (byte) -106);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_nosuggestions", (byte) -117);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alternativelygoback", (byte) -82);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_available", (byte) -112);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_willnowshowtermsandconditions", (byte) -81);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fetchingterms", (byte) -120);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("termserror", (byte) -86);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_iagree", (byte) -125);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_idisagree", (byte) -87);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_pleasescrolldowntoaccept", (byte) -128);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_linkaddress", (byte) -96);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("openinpopupwindow", (byte) -99);
                if (var2 != null) {
                  DateOfBirthValidator.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create", (byte) -115);
                if (null != var2) {
                  TextureCache.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_pleasechooseapassword", (byte) -75);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_passwordblurb", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_nevergivepassword", (byte) -118);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("creatingyouraccount", (byte) -65);
                if (var2 != null) {
                  TextWidgetPainter.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_youmustaccept", (byte) -124);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_passwordsdifferent", (byte) -82);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_success", (byte) -71);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("day", (byte) -121);
                if (var2 != null) {
                  MusicCrossfadeStream.field_t = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("month", (byte) -124);
                if (null != var2) {
                  Js5Transport.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("year", (byte) -116);
                if (null != var2) {
                  ChecksumHelpers.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,0", (byte) -77);
                if (var2 != null) {
                  WidgetLayerStack.field_B[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,1", (byte) -117);
                if (var2 != null) {
                  WidgetLayerStack.field_B[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,2", (byte) -118);
                if (null != var2) {
                  WidgetLayerStack.field_B[2] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,3", (byte) -89);
                if (null != var2) {
                  WidgetLayerStack.field_B[3] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,4", (byte) -100);
                if (var2 != null) {
                  WidgetLayerStack.field_B[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,5", (byte) -85);
                if (var2 != null) {
                  WidgetLayerStack.field_B[5] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,6", (byte) -62);
                if (var2 != null) {
                  WidgetLayerStack.field_B[6] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,7", (byte) -72);
                if (var2 != null) {
                  WidgetLayerStack.field_B[7] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,8", (byte) -81);
                if (null != var2) {
                  WidgetLayerStack.field_B[8] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,9", (byte) -112);
                if (null != var2) {
                  WidgetLayerStack.field_B[9] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,10", (byte) -66);
                if (var2 != null) {
                  WidgetLayerStack.field_B[10] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("monthnames,11", (byte) -113);
                if (null != var2) {
                  WidgetLayerStack.field_B[11] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_welcome", (byte) -66);
                if (null != var2) {
                  PendingRequest.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13_welcome", (byte) -102);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_createanaccount", (byte) -73);
                if (var2 != null) {
                  DelayedPacket.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_username", (byte) -112);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_displayname", (byte) -85);
                if (var2 != null) {
                  AudioPumpThread.field_g = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_password", (byte) -121);
                if (null != var2) {
                  GameClock.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_password_confirm", (byte) -109);
                if (var2 != null) {
                  ArchiveFactoryHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_email", (byte) -102);
                if (var2 != null) {
                  SpriteLoadHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_email_confirm", (byte) -105);
                if (null != var2) {
                  HotspotTextWidget.field_J = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_age", (byte) -118);
                if (var2 != null) {
                  LoginDialog.field_qb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13_email", (byte) -101);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13_email_confirm", (byte) -66);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_dob", (byte) -90);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_country", (byte) -110);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alternatives_header", (byte) -117);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alternatives_select", (byte) -63);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_suggestions", (byte) -105);
                if (var2 != null) {
                  ReportAbuseDialog.field_Pb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_more_suggestions", (byte) -69);
                if (var2 != null) {
                  MarkerSliderPainter.field_i = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_select_alternative", (byte) -88);
                if (var2 != null) {
                  WidgetStyleLayer.field_i = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_optin_news", (byte) -63);
                if (null != var2) {
                  ArchiveProvider.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_agreeterms", (byte) -90);
                if (null != var2) {
                  Js5Archive.field_m = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13terms", (byte) -97);
                if (null != var2) {
                  SocialListEntry.field_Kb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_username_email", (byte) -80);
                if (null != var2) {
                  ConditionalTextValue.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_username", (byte) -123);
                if (var2 != null) {
                  TextJoinHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_email", (byte) -77);
                if (null != var2) {
                  ArrayWidgetContainer.field_y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_username_tooltip", (byte) -106);
                if (var2 != null) {
                  PasswordValidator.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_password_tooltip", (byte) -85);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_login_tooltip", (byte) -104);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_create_tooltip", (byte) -119);
                if (var2 != null) {
                  LongAndTextCredentials.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_justplay_tooltip", (byte) -85);
                if (var2 != null) {
                  LobbySessionHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_back_tooltip", (byte) -97);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_no_displayname", (byte) -70);
                if (var2 != null) {
                  GameKeyHandler.field_e = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_username_tooltip", (byte) -74);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_username_hint", (byte) -123);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_displayname_tooltip", (byte) -124);
                if (null != var2) {
                  ChatFilterHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_displayname_hint", (byte) -123);
                if (var2 != null) {
                  LoginCredentialType.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_password_tooltip", (byte) -74);
                if (null != var2) {
                  NameEntryPopup.field_Kb = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_password_hint", (byte) -128);
                if (var2 != null) {
                  TextHotspot.field_n = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_password_confirm_tooltip", (byte) -120);
                if (var2 != null) {
                  AccountCreationSupport.field_j = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_email_tooltip", (byte) -119);
                if (null != var2) {
                  SocketJs5Transport.field_w = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_email_confirm_tooltip", (byte) -88);
                if (var2 != null) {
                  SocketConnector.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_age_tooltip", (byte) -81);
                if (null != var2) {
                  QueuedResultSubmission.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_optin_news_tooltip", (byte) -76);
                if (null != var2) {
                  LoginCredentials.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13_email_tooltip", (byte) -96);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_u13_email_confirm_tooltip", (byte) -88);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_dob_tooltip", (byte) -60);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_country_tooltip", (byte) -93);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_optin_tooltip", (byte) -122);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_continue", (byte) -120);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_username_unavailable", (byte) -116);
                if (null != var2) {
                  CacheReference.field_t = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_username_available", (byte) -95);
                if (null != var2) {
                  ProgressMessageDialog.field_sb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_namelength", (byte) -116);
                if (var2 != null) {
                  LinkTextPainter.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_namechars", (byte) -89);
                if (null != var2) {
                  DialogMessagePane.field_K = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_nameleadingspace", (byte) -77);
                if (null != var2) {
                  EditableTextWidget.field_H = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_doublespace", (byte) -74);
                if (var2 != null) {
                  SpriteWidget.field_P = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passchars", (byte) -67);
                if (var2 != null) {
                  EmailValidator.field_z = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passrepeated", (byte) -72);
                if (var2 != null) {
                  ValidatedTextWidget.field_V = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passlength", (byte) -64);
                if (var2 != null) {
                  BufferedFile.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passcontainsname", (byte) -69);
                if (var2 != null) {
                  SingleChildWidget.field_A = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passcontainsemail", (byte) -97);
                if (null != var2) {
                  MusicVolumeAndOverlayHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_passcontainsname_partial", (byte) -61);
                if (null != var2) {
                  FadeLayer.field_G = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_checkname", (byte) -94);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_invalidemail", (byte) -77);
                if (var2 != null) {
                  IntrusiveDequeCursor.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_email_unavailable", (byte) -100);
                if (null != var2) {
                  PatchNoteUsage.field_g = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_invaliddate", (byte) -63);
                if (null != var2) {
                  ArrayWidgetContainer.field_C = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_invalidage", (byte) -106);
                if (null != var2) {
                  ContentTransitionDialog.field_gb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_yearrange", (byte) -75);
                if (var2 != null) {
                  LongAndTextLoginPayload.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_alert_mismatch", (byte) -90);
                if (var2 != null) {
                  NetworkGameClient.field_t = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_passwordvalid", (byte) -92);
                if (var2 != null) {
                  StatusAndUrlHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_emailvalid", (byte) -75);
                if (null != var2) {
                  LoginCredentials.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("create_account_success", (byte) -103);
                if (var2 != null) {
                  Js5ArchiveManager.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("invalid_name", (byte) -110);
                if (var2 != null) {
                  StatSubmission.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("cannot_add_yourself", (byte) -92);
                if (null != var2) {
                  DialWidgetPainter.field_k = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_add_friend", (byte) -126);
                if (var2 != null) {
                  AccountChoicePanel.field_F = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_add_ignore", (byte) -81);
                if (var2 != null) {
                  StatSubmission.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_delete_friend", (byte) -86);
                if (null != var2) {
                  FullscreenSupport.field_c = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unable_to_delete_ignore", (byte) -110);
                if (var2 != null) {
                  RankingsRequest.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("friendlistfull", (byte) -107);
                if (null != var2) {
                  PopupMenuDrawHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("friendlistdupe", (byte) -114);
                if (var2 != null) {
                  BoundedUrlRequest.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("friendnotfound", (byte) -126);
                if (null != var2) {
                  BoundedRandomAccessFile.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ignorelistfull", (byte) -82);
                if (var2 != null) {
                  LogoIntroHelpers.field_a = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ignorelistdupe", (byte) -114);
                if (null != var2) {
                  TypeCode.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ignorenotfound", (byte) -81);
                if (var2 != null) {
                  PasswordFieldPainter.field_z = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("removeignorefirst", (byte) -109);
                if (null != var2) {
                  AgeValidator.field_o = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("removefriendfirst", (byte) -85);
                if (var2 != null) {
                  RequestResendSupport.field_c = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("enterfriend_add", (byte) -116);
                if (var2 != null) {
                  GzipDecompressor.field_e = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("enterfriend_del", (byte) -100);
                if (var2 != null) {
                  SingleChildWidget.field_D = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("enterignore_add", (byte) -82);
                if (null != var2) {
                  TextDecodeHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("enterignore_del", (byte) -111);
                if (null != var2) {
                  TypeCode.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("text_removed_from_game", (byte) -76);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("text_lobby_pleaselogin_free", (byte) -101);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("opengl", (byte) -83);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("sse", (byte) -84);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("purejava", (byte) -98);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_graphics", (byte) -115);
                if (null != var2) {
                  QuickChatHelpHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_models", (byte) -118);
                if (var2 != null) {
                  PendingSubmission.field_m = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_fonts", (byte) -126);
                if (null != var2) {
                  IsaacRandom.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_soundeffects", (byte) -73);
                if (var2 != null) {
                  CachedTextLayout.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_music", (byte) -105);
                if (null != var2) {
                  ProxyAuthenticationRequiredException.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_instruments", (byte) -70);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_levels", (byte) -119);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_extradata", (byte) -91);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  SectorCacheStore.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_languages", (byte) -127);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_textures", (byte) -94);
                if (null != var2) {
                  CheckboxButton.field_H = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("waitingfor_animations", (byte) -112);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_graphics", (byte) -78);
                if (var2 != null) {
                  DiskCacheWorker.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_models", (byte) -122);
                if (var2 != null) {
                  CredentialHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_fonts", (byte) -122);
                if (var2 != null) {
                  ClientEnvironmentHelpers.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_soundeffects", (byte) -102);
                if (var2 != null) {
                  GuestPlayHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_music", (byte) -76);
                if (null != var2) {
                  BufferedFile.field_r = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_instruments", (byte) -65);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_levels", (byte) -71);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_extradata", (byte) -97);
                if (null != var2) {
                  LoadingTextGlobals.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_languages", (byte) -114);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_textures", (byte) -68);
                if (var2 != null) {
                  TextureCache.field_m = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("loading_animations", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_graphics", (byte) -116);
                if (null != var2) {
                  TextWidgetPainter.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_models", (byte) -126);
                if (var2 != null) {
                  SectorCacheStore.field_i = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_soundeffects", (byte) -62);
                if (null != var2) {
                  PendingHighscoreRequest.field_u = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_music", (byte) -98);
                if (null != var2) {
                  DebouncedValidator.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_levels", (byte) -75);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_languages", (byte) -128);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_animations", (byte) -82);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unpacking_toolkit", (byte) -96);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("instructions", (byte) -61);
                if (var2 != null) {
                  LobbyGameListHelpers.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("tutorial", (byte) -82);
                if (null != var2) {
                  RankingsRequest.field_v = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("playtutorial", (byte) -103);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("sound_colon", (byte) -63);
                if (var2 != null) {
                  LoadingTextGlobals.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("music_colon", (byte) -95);
                if (null != var2) {
                  ChatFilterHelpers.field_d = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fullscreen", (byte) -78);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("screensize", (byte) -85);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("highscores", (byte) -60);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rankings", (byte) -109);
                if (var2 != null) {
                  NodeHashTableIterator.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achievements", (byte) -117);
                if (null != var2) {
                  GameBoard.field_F = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achievementsthisgame", (byte) -77);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achievementsthissession", (byte) -83);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("watchintroduction", (byte) -110);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quit", (byte) -70);
                if (null != var2) {
                  LobbyLayout.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("login_createaccount", (byte) -69);
                if (null != var2) {
                  MidiNote.field_z = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("tohighscores", (byte) -117);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntomainmenu", (byte) -85);
                if (null != var2) {
                  ScrollPane.field_Ib = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntopausemenu", (byte) -121);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntooptionsmenu_notpaused", (byte) -105);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mainmenu", (byte) -110);
                if (null != var2) {
                  MouseHandlerSupport.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pausemenu", (byte) -115);
                if (null != var2) {
                  PasswordValidator.field_p = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("optionsmenu_notpaused", (byte) -96);
                if (null != var2) {
                  DialWidgetPainter.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("menu", (byte) -110);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("selectlevel", (byte) -106);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("nextlevel", (byte) -114);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("startgame", (byte) -107);
                if (null != var2) {
                  ProxyAuthenticationRequiredException.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("newgame", (byte) -82);
                if (null != var2) {
                  DualLinkNode.field_l = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("resumegame", (byte) -75);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("resumetutorial", (byte) -123);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("skip", (byte) -101);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("skiptutorial", (byte) -117);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("skipending", (byte) -81);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("restartlevel", (byte) -89);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("endtest", (byte) -70);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("endgame", (byte) -82);
                if (var2 != null) {
                  AsyncCheckResult.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("endtutorial", (byte) -108);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ok", (byte) -112);
                if (var2 != null) {
                  ChatPanelSetupHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("on", (byte) -116);
                if (null != var2) {
                  QuickChatPhraseRegistry.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("off", (byte) -101);
                if (var2 != null) {
                  FullscreenSupport.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("previous", (byte) -88);
                if (null != var2) {
                  IconLabelWidget.field_Eb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("prev", (byte) -106);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("next", (byte) -89);
                if (var2 != null) {
                  IconTextComponent.field_Gb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_colon", (byte) -120);
                if (var2 != null) {
                  ClientEnvironmentHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hotseatmultiplayer", (byte) -116);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("entermultiplayerlobby", (byte) -123);
                if (var2 != null) {
                  Js5ArchiveManager.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("singleplayergame", (byte) -69);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntogame", (byte) -115);
                if (var2 != null) {
                  ChatMessage.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("endgameresign", (byte) -123);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("offerdraw", (byte) -95);
                if (null != var2) {
                  CommonUiHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("canceldraw", (byte) -111);
                if (var2 != null) {
                  WidgetLayerStack.field_E = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("acceptdraw", (byte) -93);
                if (null != var2) {
                  LobbyControlHelpers.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("resign", (byte) -119);
                if (null != var2) {
                  QuickChatPhraseDefinition.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("returntolobby", (byte) -105);
                if (null != var2) {
                  NanoTickClock.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("cont", (byte) -63);
                if (null != var2) {
                  IntKeyLookup.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("continue_spectating", (byte) -100);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("messages", (byte) -85);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_fastest", (byte) -127);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_medium", (byte) -71);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_best", (byte) -71);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_directx", (byte) -97);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_opengl", (byte) -111);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_java", (byte) -63);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_quality_high", (byte) -107);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_quality_low", (byte) -86);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_mode", (byte) -112);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_quality", (byte) -73);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mode", (byte) -86);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quality", (byte) -96);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("keys", (byte) -60);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("objective", (byte) -105);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("currentobjective", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pressescforpausemenu", (byte) -93);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pressescforpausemenuortoskiptutorial", (byte) -91);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pressescforoptionsmenu_doesntpause", (byte) -89);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pressescforoptionsmenu_doesntpause_short", (byte) -87);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("powerups", (byte) -125);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("latestlevel_suffix", (byte) -100);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_name", (byte) -74);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_cannotplayreason", (byte) -97);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_cannotplayreason_shorter", (byte) -86);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedworld_cannotplayreason", (byte) -95);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("memberslevel_name", (byte) -68);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("memberslevel_cannotplayreason", (byte) -86);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("membersworld_cannotplayreason", (byte) -91);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_createtip", (byte) -112);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_createtip_line1", (byte) -85);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_createtip_line2", (byte) -66);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("unreachedlevel_logintip", (byte) -97);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("memberslevel_logintip", (byte) -63);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("displayname_none", (byte) -79);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("levelxofy1", (byte) -89);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("levelxofy2", (byte) -70);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("levelxofy", (byte) -70);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ingame_level", (byte) -106);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mouseoveranicon", (byte) -69);
                if (var2 != null) {
                  FadeLayer.field_L = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("notyetachieved", (byte) -106);
                if (var2 != null) {
                  RasterEffectHelpers.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achieved", (byte) -120);
                if (null != var2) {
                  FallingParticle.field_j = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("orbpoints", (byte) -124);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("orbcoins", (byte) -116);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("orbpoints_colon", (byte) -91);
                if (var2 != null) {
                  RasterSnapshot.field_m = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("orbcoins_colon", (byte) -87);
                if (null != var2) {
                  DualLinkNode.field_i = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achieved_colon_description", (byte) -103);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("secretachievement", (byte) -100);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("no_highscores", (byte) -109);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_name", (byte) -111);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_level", (byte) -112);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_fromlevel", (byte) -88);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_tolevel", (byte) -64);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_score", (byte) -99);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_end", (byte) -65);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("ingame_score", (byte) -67);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("score_colon", (byte) -108);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_leavegame", (byte) -85);
                if (null != var2) {
                  ArchiveIndex.field_d = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_offerrematch", (byte) -102);
                if (var2 != null) {
                  IterableDualLinkDeque.field_g = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_offerrematch_unrated", (byte) -74);
                if (null != var2) {
                  MusicPlaybackHelpers.field_e = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_acceptrematch", (byte) -80);
                if (null != var2) {
                  TriangleSortHelpers.field_g = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_acceptrematch_unrated", (byte) -65);
                if (var2 != null) {
                  TextHotspot.field_m = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_cancelrematch", (byte) -84);
                if (null != var2) {
                  GameSession.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_cancelrematch_unrated", (byte) -128);
                if (null != var2) {
                  GameSession.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_rematchnewgame", (byte) -126);
                if (var2 != null) {
                  DualLinkDequeIterator.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_rematchnewgame_unrated", (byte) -97);
                if (null != var2) {
                  HotspotTextWidget.field_M = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_wantstodraw", (byte) -66);
                if (var2 != null) {
                  EditableTextWidget.field_S = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_offersrematch", (byte) -101);
                if (null != var2) {
                  DiskArchiveRequest.field_H = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_offersrematch_unrated", (byte) -67);
                if (var2 != null) {
                  SharedTextGlobals.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youofferrematch", (byte) -116);
                if (null != var2) {
                  FallingParticle.field_r = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youofferrematch_unrated", (byte) -123);
                if (null != var2) {
                  QuickChatCategory.field_u = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youofferdraw", (byte) -75);
                if (var2 != null) {
                  CredentialHelpers.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youresigned", (byte) -117);
                if (null != var2) {
                  FullscreenFocusCanvas.field_d = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youresigned_rematch", (byte) -85);
                if (var2 != null) {
                  GrowableIntList.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_hasresignedandleft", (byte) -97);
                if (null != var2) {
                  LongAndTextCredentials.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_hasresigned_rematch", (byte) -98);
                if (null != var2) {
                  DisplayNameHelpers.field_f = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_hasresigned", (byte) -125);
                if (var2 != null) {
                  DialWidget.field_L = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_hasleft", (byte) -122);
                if (var2 != null) {
                  TextDecodeHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_haswon", (byte) -89);
                if (var2 != null) {
                  TriangleSortHelpers.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_youhavewon", (byte) -107);
                if (var2 != null) {
                  FadingModalPanel.field_N = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_gamedrawn", (byte) -117);
                if (var2 != null) {
                  StatusAndUrlHelpers.field_b = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_timeremaining", (byte) -105);
                if (var2 != null) {
                  LabeledChildWidget.field_O = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_x_turn", (byte) -124);
                if (null != var2) {
                  SingleChildWidget.field_y = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_yourturn", (byte) -62);
                if (null != var2) {
                  DropTargetWidget.field_E = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("gameover", (byte) -88);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_hidechat", (byte) -115);
                if (var2 != null) {
                  InputDetachHelpers.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_showchat_nounread", (byte) -73);
                if (var2 != null) {
                  DualLinkNode.field_n = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_showchat_unread1", (byte) -70);
                if (var2 != null) {
                  ChatMessage.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mp_showchat_unread2", (byte) -99);
                if (var2 != null) {
                  ArchiveIndex.field_e = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("click_to_quickchat", (byte) -120);
                if (null != var2) {
                  PendingHighscoreRequest.field_p = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("autorespond", (byte) -100);
                if (var2 != null) {
                  CachedTextLayout.field_o = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_help", (byte) -89);
                if (null != var2) {
                  WidgetLayerStack.field_G = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_help_title", (byte) -88);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_q = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,0", (byte) -82);
                if (var2 != null) {
                  ConnectionStage.field_a[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,1", (byte) -62);
                if (var2 != null) {
                  ConnectionStage.field_a[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,2", (byte) -98);
                if (null != var2) {
                  ConnectionStage.field_a[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,3", (byte) -86);
                if (var2 != null) {
                  ConnectionStage.field_a[3] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,4", (byte) -94);
                if (var2 != null) {
                  ConnectionStage.field_a[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_help,5", (byte) -79);
                if (var2 != null) {
                  ConnectionStage.field_a[5] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,0", (byte) -121);
                if (var2 != null) {
                  field_b[0] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,1", (byte) -110);
                if (null != var2) {
                  field_b[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,2", (byte) -128);
                if (var2 != null) {
                  field_b[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,3", (byte) -86);
                if (var2 != null) {
                  field_b[3] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,4", (byte) -128);
                if (var2 != null) {
                  field_b[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("quickchat_shortcut_keys,5", (byte) -101);
                if (null != var2) {
                  field_b[5] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("keychar_the_character_under_questionmark", (byte) -65);
                if (null != var2) {
                  StatusAndUrlHelpers.field_a = IsaacRandom.decodeExtendedByteChar(114, var2[0]);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_noratings", (byte) -121);
                if (var2 != null) {
                  RasterSnapshot.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_rating", (byte) -114);
                if (var2 != null) {
                  TextFieldValidator.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_played", (byte) -106);
                if (var2 != null) {
                  TextWidgetPainter.field_h = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_won", (byte) -115);
                if (var2 != null) {
                  SpriteState.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_lost", (byte) -61);
                if (null != var2) {
                  DialWidgetPainter.field_s = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_drawn", (byte) -118);
                if (null != var2) {
                  SpriteState.field_o = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("benefits_fullscreen", (byte) -115);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("benefits_noadverts", (byte) -126);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("benefits_price", (byte) -104);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("members_expansion_benefits,0", (byte) -128);
                if (var2 != null) {
                  CheckboxTickPainter.field_b[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("members_expansion_benefits,1", (byte) -66);
                if (var2 != null) {
                  CheckboxTickPainter.field_b[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("members_expansion_benefits,2", (byte) -84);
                if (var2 != null) {
                  CheckboxTickPainter.field_b[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("members_expansion_price_top", (byte) -91);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("members_expansion_price_bottom", (byte) -116);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_lost_seq,0", (byte) -64);
                if (null != var2) {
                  NetworkGameClient.field_n[0] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_lost_seq,1", (byte) -76);
                if (null != var2) {
                  NetworkGameClient.field_n[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_lost_seq,2", (byte) -85);
                if (var2 != null) {
                  NetworkGameClient.field_n[2] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_lost_seq,3", (byte) -60);
                if (var2 != null) {
                  NetworkGameClient.field_n[3] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_lost", (byte) -77);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_restored", (byte) -64);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_please_check", (byte) -86);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_wait", (byte) -89);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_retry", (byte) -119);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_resume", (byte) -121);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_or", (byte) -98);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_exitfs", (byte) -74);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_exitfs_quit", (byte) -64);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_quit", (byte) -88);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_check_fs", (byte) -118);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("reconnect_check_nonfs", (byte) -112);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_accept_beforeaccept", (byte) -63);
                if (var2 != null) {
                  IsaacRandom.field_b = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_button_accept", (byte) -101);
                if (null != var2) {
                  WeightedLruCache.field_c = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_accept_afteraccept", (byte) -71);
                if (null != var2) {
                  Js5Transport.field_u = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_button_cancel", (byte) -95);
                if (var2 != null) {
                  IterableDualLinkDeque.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_accept_aftercancel", (byte) -67);
                if (null != var2) {
                  ViewModeNoticeGlobals.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_accept_countdown_sing", (byte) -84);
                if (null != var2) {
                  BoundedRandomAccessFile.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_accept_countdown_pl", (byte) -72);
                if (var2 != null) {
                  LongAndTextCredentials.field_e = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_nonmember", (byte) -77);
                if (null != var2) {
                  LongAndTextLoginPayload.field_n = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_button_close", (byte) -84);
                if (var2 != null) {
                  WidgetLayerStack.field_I = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_button_members", (byte) -77);
                if (null != var2) {
                  PasswordLoginCredentials.field_m = MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_unavailable", (byte) -93);
                if (var2 != null) {
                  Js5Archive.field_h = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_unavailable_try_signed_applet", (byte) -81);
                if (var2 != null) {
                  WidgetContainer.field_x = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_focus", (byte) -73);
                if (null != var2) {
                  DirectByteStorage.field_j = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_focus_or_resolution", (byte) -102);
                if (var2 != null) {
                  StateToken.field_d = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_timeout", (byte) -102);
                if (null != var2) {
                  BufferedSocket.field_i = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("fs_button_tryagain", (byte) -62);
                if (null != var2) {
                  EmailDomainValidationHelpers.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_ui_fs_countdown", (byte) -121);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_caption_title", (byte) -79);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_including_gamename", (byte) -113);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_full_access_1", (byte) -84);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_full_access_2", (byte) -82);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_achievement_count_1", (byte) -67);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_achievement_count_2", (byte) -101);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_exclusive_1", (byte) -125);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mb_exclusive_2", (byte) -126);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("me_extra_benefits", (byte) -75);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_friend_tip", (byte) -97);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_friend_tip_multi", (byte) -93);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_mode_name,0", (byte) -94);
                if (var2 != null) {
                  TooltipAndOptionsHelpers.field_f[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_mode_name,1", (byte) -124);
                if (null != var2) {
                  TooltipAndOptionsHelpers.field_f[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("hs_mode_name,2", (byte) -125);
                if (var2 != null) {
                  TooltipAndOptionsHelpers.field_f[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_mode_name,0", (byte) -126);
                if (null != var2) {
                  BoundedUrlRequest.field_t[0] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_mode_name,1", (byte) -68);
                if (null != var2) {
                  BoundedUrlRequest.field_t[1] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_mode_long_name,0", (byte) -89);
                if (null != var2) {
                  DropTargetWidget.field_J[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("rating_mode_long_name,1", (byte) -104);
                if (var2 != null) {
                  DropTargetWidget.field_J[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_fixed_size", (byte) -105);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_resizable", (byte) -107);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_fullscreen", (byte) -72);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_done", (byte) -63);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_apply", (byte) -70);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_title", (byte) -63);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_instruction", (byte) -76);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("graphics_config_need_memory", (byte) -118);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("pleasewait_dotdotdot", (byte) -68);
                if (null != var2) {
                  QuickChatCategoryCache.field_b = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("serviceunavailable", (byte) -82);
                if (var2 != null) {
                  ProxyAuthenticationRequiredException.field_a = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("createtouse", (byte) -62);
                if (null != var2) {
                  ContentTransitionDialog.field_mb = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("achievementsoffline", (byte) -89);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 ^ 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("warning", (byte) -78);
                if (null != var2) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                if (param0 != -1) {
                  finished = true; return;
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("DEFAULT_PLAYER_NAME", (byte) -107);
                if (null != var2) {
                  DirectByteStorage.field_f = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin1", (byte) -62);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,1", (byte) -106);
                if (null != var2) {
                  GameOptionHelpers.field_a[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,2", (byte) -92);
                if (null != var2) {
                  GameOptionHelpers.field_a[2] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,3", (byte) -84);
                if (null != var2) {
                  GameOptionHelpers.field_a[3] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,4", (byte) -81);
                if (null != var2) {
                  GameOptionHelpers.field_a[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,5", (byte) -117);
                if (null != var2) {
                  GameOptionHelpers.field_a[5] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,6", (byte) -79);
                if (var2 != null) {
                  GameOptionHelpers.field_a[6] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin2,7", (byte) -123);
                if (var2 != null) {
                  GameOptionHelpers.field_a[7] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,1", (byte) -95);
                if (null != var2) {
                  BoundedUrlRequest.field_o[1] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,2", (byte) -71);
                if (var2 != null) {
                  BoundedUrlRequest.field_o[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,3", (byte) -126);
                if (null != var2) {
                  BoundedUrlRequest.field_o[3] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,4", (byte) -78);
                if (null != var2) {
                  BoundedUrlRequest.field_o[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,5", (byte) -78);
                if (null != var2) {
                  BoundedUrlRequest.field_o[5] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,6", (byte) -81);
                if (null != var2) {
                  BoundedUrlRequest.field_o[6] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin3,7", (byte) -115);
                if (var2 != null) {
                  BoundedUrlRequest.field_o[7] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("discard", (byte) -67);
                if (null != var2) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,1", (byte) -85);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_d[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,2", (byte) -100);
                if (null != var2) {
                  DrawOfferMenuHelpers.field_d[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,3", (byte) -61);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_d[3] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,4", (byte) -104);
                if (null != var2) {
                  DrawOfferMenuHelpers.field_d[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,5", (byte) -89);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_d[5] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,6", (byte) -85);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_d[6] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin4,7", (byte) -74);
                if (var2 != null) {
                  DrawOfferMenuHelpers.field_d[7] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_notloggedin", (byte) -102);
                if (var2 != null) {
                  MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,1", (byte) -122);
                if (var2 != null) {
                  TabbedPanel.field_Kb[1] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,2", (byte) -67);
                if (null != var2) {
                  TabbedPanel.field_Kb[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,3", (byte) -126);
                if (null != var2) {
                  TabbedPanel.field_Kb[3] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,4", (byte) -95);
                if (null != var2) {
                  TabbedPanel.field_Kb[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,5", (byte) -62);
                if (var2 != null) {
                  TabbedPanel.field_Kb[5] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,6", (byte) -64);
                if (null != var2) {
                  TabbedPanel.field_Kb[6] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("mustlogin_alternate,7", (byte) -69);
                if (var2 != null) {
                  TabbedPanel.field_Kb[7] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,0", (byte) -88);
                if (null != var2) {
                  SectorCacheStore.field_g[0] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,1", (byte) -97);
                if (null != var2) {
                  SectorCacheStore.field_g[1] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,2", (byte) -70);
                if (null != var2) {
                  SectorCacheStore.field_g[2] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,3", (byte) -110);
                if (var2 != null) {
                  SectorCacheStore.field_g[3] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,4", (byte) -78);
                if (var2 != null) {
                  SectorCacheStore.field_g[4] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,5", (byte) -95);
                if (null != var2) {
                  SectorCacheStore.field_g[5] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,6", (byte) -74);
                if (var2 != null) {
                  SectorCacheStore.field_g[6] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,7", (byte) -126);
                if (null != var2) {
                  SectorCacheStore.field_g[7] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,8", (byte) -107);
                if (var2 != null) {
                  SectorCacheStore.field_g[8] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,9", (byte) -77);
                if (var2 != null) {
                  SectorCacheStore.field_g[9] = MidiPcmStream.decodeText(-2022, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,10", (byte) -119);
                if (null != var2) {
                  SectorCacheStore.field_g[10] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,11", (byte) -92);
                if (null != var2) {
                  SectorCacheStore.field_g[11] = MidiPcmStream.decodeText(GzipDecompressor.bitXor(param0, 2021), var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("subscription_cost_monthly,12", (byte) -94);
                if (null != var2) {
                  SectorCacheStore.field_g[12] = MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                var2 = NamedTextResourceHelpers.readNamedArchiveFile("sentence_separator", (byte) -84);
                if (var2 != null) {
                  MidiPcmStream.decodeText(param0 - 2021, var2);
                }
                PacketBuffer.field_k = null;
            }
            void run() {
                var3 = Virogrid.field_F ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2620_0 = (RuntimeException) (var2_ref);
                  stackIn_2620_1 = new StringBuilder().append("lb.B(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2621_2 = "null";
                  } else {
                    stackIn_2621_2 = "{...}";
                  }
                  throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_2620_0), ((StringBuilder) (Object) stackIn_2620_1).append(stackIn_2621_2).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = GameApplet.field_f;
                  var4++;
                  GameApplet.field_f = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_a = new ScoreSubmissionHelpers();
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
