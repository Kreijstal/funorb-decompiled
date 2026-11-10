/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelFileList {
    static String[] field_c;
    static String field_f;
    static BitmapFont field_d;
    static int field_a;
    private int field_e;
    static String field_h;
    private IntrusiveDeque field_b;
    static String field_g;

    final void addLevelFile(byte param0, byte[] param1) {
        LevelFileEntry var3 = null;
        int fieldTemp$0 = 0;
        try {
          var3 = new LevelFileEntry(param1);
          if (param0 <= 71) {
            field_h = (String) null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var3.field_k = fieldTemp$0;
          if (var3.field_j != 2 &&
            var3.field_j != 4) {
          }
          this.field_b.addFirst(var3, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ci.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1475) {
          return;
        }
        field_d = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final static String describeCurrentPacket(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        String var6 = "(" + PacketBuffer.field_k + " " + ChatPromptHelpers.field_e + " " + CheckboxPainter.field_d + ") " + PortalEntryEvent.field_i;
        String var1 = var6;
        if (param0 >= EmailAvailabilityValidator.field_q) {
        } else {
          var1 = var6 + ":";
          for (var2 = 0; var2 < EmailAvailabilityValidator.field_q; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & StatusAndMeshHelpers.field_e.payload[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (10 > var3) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final byte[] getLevelFileData(byte param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        IntrusiveDeque var3 = this.field_b;
        Object var4 = null;
        if (param0 != -85) {
          return (byte[]) null;
        }
        LevelFileEntry var4_ref = (LevelFileEntry) (var3.last(113));
        while (var4_ref != null) {
          if (var4_ref.field_k == param1) {
            break;
          }
          var4_ref = (LevelFileEntry) (var3.previous(6));
        }
        if (var4_ref == null) {
          return null;
        }
        return var4_ref.field_o;
    }

    final static void layoutLobbyComponents(boolean param0, int param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        UiComponent stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_35_0 = null;
        AlignedIconLabel stackIn_35_1 = null;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        UiComponent var8_ref_cj = null;
        AlignedIconLabel var9 = null;
        int var9_int = 0;
        int var10 = 0;
        AlignedIconLabel var10_ref_mo = null;
        int var12 = 0;
        int var13 = 0;
        UiComponent var14 = null;
        UiComponent var15 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          LobbyPlayer.field_Qb = SoftwareRasterizer.height;
          MessageMenuScreen.field_l = SoftwareRasterizer.width;
          if (param0) {
            stackIn_4_0 = HotspotTextWidget.field_Q;
          } else {
            stackIn_4_0 = InflaterDecompressor.field_a;
          }
          MouseWheelInput.layoutLobbySlidePanels(stackIn_4_0, false);
          BirthDateInputWidget.field_U.layoutSocialPanel(0, JaggrabDownloader.field_i.field_zb, 0, (byte) -74, -2 + (-40 + JaggrabDownloader.field_i.field_z));
          ClientException.field_h.setBounds(UpgradeAccessHelpers.field_f, 0, CipherPacketBuffer.field_r.field_zb, 0, -3344);
          stackIn_6_0 = ContentTransitionDialog.field_jb;
          stackIn_6_1 = 18;
          stackIn_6_2 = 2 + UpgradeAccessHelpers.field_f;
          if (GradientOutlineTextPainter.field_u) {
            stackIn_7_3 = 2 + (40 + DualLinkNode.field_o) + 2;
          } else {
            stackIn_7_3 = 0;
          }
          ((UiComponent) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, -stackIn_7_3 + CipherPacketBuffer.field_r.field_zb, 0, -3344);
          MeltdownPuddle.field_h.setBounds(18, 2 + UpgradeAccessHelpers.field_f, 42 + DualLinkNode.field_o, -42 - DualLinkNode.field_o + CipherPacketBuffer.field_r.field_zb, -3344);
          MeltdownPuddle.field_n.setBoundsAndLayout(DualLinkNode.field_o, 2, CipherPacketBuffer.field_r.field_zb, 0, -2 - UpgradeAccessHelpers.field_f + (CipherPacketBuffer.field_r.field_z - 20), -31465, 20 + (2 + UpgradeAccessHelpers.field_f));
          ChatPromptHelpers.field_b.setBounds(40, JaggrabDownloader.field_i.field_z - 40, JaggrabDownloader.field_i.field_zb, 0, -3344);
          ArchiveLoadStep.field_m.setBounds(30, 0, LevelData.field_a.field_zb, 0, -3344);
          SocketConnector.field_a.setBounds(-2 + LevelData.field_a.field_z - 70, 30, LevelData.field_a.field_zb, 0, -3344);
          var2_int = 3 + FriendListHelpers.field_h;
          if (2 > UiComponentNode.field_r.length) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = -2 + (-10 + SocketConnector.field_a.field_z - (8 - (var2_int + 1) / 2)) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -(var2_int * (var3 + 2)) - 5 + (SocketConnector.field_a.field_z - 5);
          if (var4 > 40) {
            var4 = 40;
          }
          KeyboardStateHelpers.field_d.setBounds(var4, 5, -5 + (SocketConnector.field_a.field_zb - 5), 5, -3344);
          var5 = var4 + 7;
          for (var6 = 0; 4 + FriendListHelpers.field_h > var6; var6++) {
            if ((var6 != 1 ||
              !(2 > UiComponentNode.field_r.length)) && (3 != var6 ||
              !(MusicPatchLoadHelpers.field_f <= 1))) {
              if (!param0 &&
                var6 == 3) {
                var15 = StateIconLabel.field_Ib[var6];
                StateIconLabel.field_Ib[var6].field_z = 0;
                var15.field_zb = 0;
                for (var8 = 0; TextValidationFailure.field_b[var6].length > var8; var8++) {
                  if (null != TextValidationFailure.field_b[var6][var8]) {
                    var9 = TextValidationFailure.field_b[var6][var8];
                    TextValidationFailure.field_b[var6][var8].field_z = 0;
                    var9.field_zb = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var14 = StateIconLabel.field_Ib[var6];
                StateIconLabel.field_Ib[var6].field_z = 0;
                var14.field_zb = 0;
                for (var8 = 0; TextValidationFailure.field_b[var6].length > var8; var8++) {
                  stackIn_35_0 = null;
                  stackIn_35_1 = TextValidationFailure.field_b[var6][var8];
                  if (stackIn_35_0 != stackIn_35_1) {
                    var9 = TextValidationFailure.field_b[var6][var8];
                    TextValidationFailure.field_b[var6][var8].field_z = 0;
                    var9.field_zb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != ValidationMessageWidget.field_ab) {
                      stackIn_50_0 = (ValidationMessageWidget.field_ab[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_50_0 = 0;
                    }
                  } else {
                    stackIn_50_0 = 0;
                  }
                } else {
                  stackIn_50_0 = 0;
                }
                var7 = stackIn_50_0;
                if (var7 != 0) {
                  var8_ref_cj = StateIconLabel.field_Ib[var6];
                  StateIconLabel.field_Ib[var6].field_z = 0;
                  var8_ref_cj.field_zb = 0;
                  for (var9_int = 0; var9_int < TextValidationFailure.field_b[var6].length; var9_int++) {
                    if (TextValidationFailure.field_b[var6][var9_int] != null) {
                      var10_ref_mo = TextValidationFailure.field_b[var6][var9_int];
                      TextValidationFailure.field_b[var6][var9_int].field_z = 0;
                      var10_ref_mo.field_zb = 0;
                    }
                  }
                } else {
                  StateIconLabel.field_Ib[var6].setBounds(var3, var5, 103, 5, -3344);
                  var8 = 110;
                  if (!param0) {
                    if (TextValidationFailure.field_b[var6][0] != null) {
                      var9 = TextValidationFailure.field_b[var6][0];
                      TextValidationFailure.field_b[var6][0].field_z = 0;
                      var9.field_zb = 0;
                    }
                  } else {
                    TextValidationFailure.field_b[var6][0].setIconLabelBounds(LevelFileCatalog.field_c, 2, var3, 38, var8, var5, 2);
                    var8 += 40;
                  }
                  var9_int = 2 + (-var8 + (-5 + LevelData.field_a.field_zb));
                  var10 = TextValidationFailure.field_b[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    TextValidationFailure.field_b[var6][var11 + 1].setIconLabelBounds(LevelFileCatalog.field_c, 2, var3, -var12 + var9_int * (var11 + 1) / var10 - 2, var8 + var12, var5, 2);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          TextPopupHelpers.field_b.setBounds(-10 + (-4 + SoftwareRasterizer.height - 130), 10, 360, SoftwareRasterizer.width - 360 >> 1, -3344);
          AchievementsScreen.field_l.setBounds(24, 0, TextPopupHelpers.field_b.field_zb, 0, -3344);
          LobbyUiSetupHelpers.field_c.setBounds(-24 + TextPopupHelpers.field_b.field_z, 24, TextPopupHelpers.field_b.field_zb, 0, -3344);
          LobbyUiSetupHelpers.field_c.field_ab = AudioPumpThread.createGradientFrameSprites(1, LobbyUiSetupHelpers.field_c.field_z, 8421504, 3, 11579568, 35);
          FramePainter.field_b.setBounds(-26 + (-10 + LobbyUiSetupHelpers.field_c.field_z), 5, -10 + LobbyUiSetupHelpers.field_c.field_zb, 5, -3344);
          ViewFactoryHelpers.field_a.setBounds(24, -24 + LobbyUiSetupHelpers.field_c.field_z - 5, 80, (-80 + LobbyUiSetupHelpers.field_c.field_zb) / 2, -3344);
          if (param1 > -6) {
            return;
          }
          NodeHashTableIterator.layoutLobbySocialPanels(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ci.C(" + param0 + ',' + param1 + ')');
        }
    }

    LevelFileList() {
        this.field_e = 0;
        this.field_b = new IntrusiveDeque();
    }

    static {
        field_a = 0;
        field_h = "Next";
        field_g = "Retry";
        field_c = new String[]{null, null, null, null, "You can tell the zombie where to go by <col=ff0000>right-clicking on the map</col>. Zombies are slow to react, but they'll get there eventually.", null, "Deselect your zombies by left-clicking a vacant spot on the map. Try that now."};
    }
}
