/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingSubmission extends IntrusiveNode {
    static SpriteWidget field_n;
    static String tutorial3;
    static long field_l;
    static double field_k;
    int field_i;
    static String field_j;
    byte[] field_g;
    static String field_m;

    final static SpriteWidget getDisplayNamePanelWidget(int param0) {
        if (param0 != 16777215) {
          PendingSubmission.releaseStatics(64);
        }
        return SpriteState.getSecondaryPanelContent(true);
    }

    public static void releaseStatics(int param0) {
        tutorial3 = null;
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_m = null;
        field_j = null;
    }

    final static void drawViewModePanel(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var9 = null;
        int var10 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (DropTargetWidget.field_I != null) {
            stackIn_6_0 = DropTargetWidget.field_I.online ? 1 : 0;
          } else {
            stackIn_6_0 = (MusicPlaybackHelpers.field_b == null) ? 0 : 1;
          }
          var1_int = stackIn_6_0;
          if (param0 != -30265) {
            field_l = -90L;
          }
          if (var1_int != 0) {
            stackIn_11_0 = ClientEnvironmentHelpers.field_c.field_J;
          } else {
            stackIn_11_0 = 480;
          }
          var2 = stackIn_11_0;
          if (MidiPcmStream.field_y == 10) {
            return;
          }
          if (LobbyGame.field_ec != 0 ||
            MidiNote.field_C != 0) {
            var3_int = 1141646;
            if (LobbyGame.field_ec == 0) {
            }
            if (MidiNote.field_C != 0) {
            }
            if (PacketRequestHelpers.field_e == 0) {
              var3_int = 16777215;
            }
            var4 = (int)EmailAvailabilityValidator.field_t;
            var5 = 21;
            if (2 == LobbyGame.field_ec ||
              MidiNote.field_C == 2) {
              var5 += 19;
            }
            if (var5 > PlayingSound.field_k) {
              PlayingSound.field_k = PlayingSound.field_k + 8;
              if (PlayingSound.field_k > var5) {
                PlayingSound.field_k = var5;
              }
            } else {
              if (var5 < PlayingSound.field_k) {
                PlayingSound.field_k = PlayingSound.field_k - 1;
              }
            }
            Rasterizer.fillRoundedRectangleBlended(651 + (-var4 - 8), -PlayingSound.field_k + var2, 8 + var4, 52, 4, 0, 200);
            var6 = (int)EmailAvailabilityValidator.field_t - 8;
            var7 = 16;
            if (var6 > 8 &&
              var7 > 8) {
              Rasterizer.drawRoundedRectangle(646 - (int)EmailAvailabilityValidator.field_t, 2 + (var2 - 20), var6, var7, 4, 1141646);
            }
            var8 = null;
            if (LobbyGame.field_ec == 1) {
              var8 = RequestResendSupport.textSwitch3d.toUpperCase();
            }
            if (LobbyGame.field_ec == 2) {
              var8 = WeightedLruCache.textSwitch2d.toUpperCase();
            }
            if (0 == ContextMenuHelpers.field_f) {
              DropTargetWidget.smallFont.drawLeft((String) (var8), -((int)EmailAvailabilityValidator.field_t >> 1) + (642 - (DropTargetWidget.smallFont.textWidth((String) (var8)) >> 1)), -DropTargetWidget.smallFont.field_G + (var2 - 2 - 2), var3_int, -1);
            } else {
              var9 = null;
              if (MidiNote.field_C == 1) {
                var9 = RequestResendSupport.textSwitch3d.toUpperCase();
              }
              if (2 == MidiNote.field_C) {
                var9 = WeightedLruCache.textSwitch2d.toUpperCase();
              }
              DropTargetWidget.smallFont.drawLeftAlpha((String) (var8), 642 - ((int)EmailAvailabilityValidator.field_t >> 1) - (DropTargetWidget.smallFont.textWidth((String) (var8)) >> 1), -2 - DropTargetWidget.smallFont.field_G + (var2 - 2), var3_int, -1, 256 - ContextMenuHelpers.field_f);
              DropTargetWidget.smallFont.drawLeftAlpha((String) (var9), -((int)EmailAvailabilityValidator.field_t >> 1) + 642 - (DropTargetWidget.smallFont.textWidth((String) (var8)) >> 1), -2 - DropTargetWidget.smallFont.field_G + (-2 + var2), var3_int, -1, ContextMenuHelpers.field_f);
            }
          }
          if (LobbyGame.field_ec == 2 ||
            MidiNote.field_C == 2) {
            var2 -= 20;
            var3_intLifetime1 = 256;
            if (LobbyGame.field_ec != 2) {
              var3_intLifetime1 = ContextMenuHelpers.field_f;
            }
            if (MidiNote.field_C != 2) {
              var3_intLifetime1 = 256 - ContextMenuHelpers.field_f;
            }
            for (var4Lifetime1 = 0; var4Lifetime1 < 5; var4Lifetime1++) {
              var5Lifetime1 = 1141646;
              if (~PacketRequestHelpers.field_e == ~(1 + var4Lifetime1)) {
                var5Lifetime1 = 16777215;
              }
              var6Lifetime1 = 26 * var4Lifetime1 + 764 - (int)EmailAvailabilityValidator.field_t * 2 + 10;
              Rasterizer.drawRoundedRectangle(6 + var6Lifetime1, var2 - 16, 22, 16, 4, 1141646);
              if (var3_intLifetime1 != 256) {
                EmailAvailabilityValidator.viewIcons[var4Lifetime1].drawTintedGrayscale(var6Lifetime1 + 12, var2 - 13, var5Lifetime1);
              } else {
                EmailAvailabilityValidator.viewIcons[var4Lifetime1].drawTintedGrayscale(12 + var6Lifetime1, -13 + var2, var5Lifetime1);
              }
            }
          }
          if (0 != PacketRequestHelpers.field_e) {
            if (0 > PacketRequestHelpers.field_e) {
              return;
            }
            if (2 != MidiNote.field_C) {
              return;
            }
          }
          var3 = "";
          var4Lifetime2 = PacketRequestHelpers.field_e;
          if (var4Lifetime2 == 0) {
            var3 = ScrollPane.textViewcontrolsMode;
          } else {
            if (var4Lifetime2 == 1) {
              var3 = PopupInputHelpers.textViewcontrolsLeft;
            } else {
              if (2 == var4Lifetime2) {
                var3 = SocketJs5Transport.textViewcontrolsRight;
              } else {
                if (3 == var4Lifetime2) {
                  var3 = TextMetricsGlobals.textViewcontrolsZoomout;
                } else {
                  if (4 == var4Lifetime2) {
                    var3 = MouseWheelInput.textViewcontrolsZoomin;
                  } else {
                    if (var4Lifetime2 == 5) {
                      var3 = ViewControlStrings.textViewcontrolsCentre;
                    }
                  }
                }
              }
            }
          }
          var4Lifetime3 = 16 + DropTargetWidget.smallFont.textWidth(var3);
          var5Lifetime2 = 20;
          var6Lifetime2 = StatefulWidgetPainter.field_u - var4Lifetime3;
          var7Lifetime1 = IconTextComponent.field_Jb;
          Rasterizer.fillRoundedRectangle(var6Lifetime2, -var5Lifetime2 + (var7Lifetime1 + 2), var4Lifetime3, var5Lifetime2, 4, 0);
          Rasterizer.drawRoundedRectangle(var6Lifetime2 + 3, -16 + var7Lifetime1, var4Lifetime3 - 6, 16, 4, 1141646);
          DropTargetWidget.smallFont.drawLeft(var3, 8 + var6Lifetime2, -2 + var7Lifetime1 - DropTargetWidget.smallFont.field_G, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "fa.A(" + param0 + ')');
        }
    }

    private PendingSubmission() throws Throwable {
        throw new Error();
    }

    static {
        tutorial3 = "Capture opposing pieces<br>by moving adjacent to them";
        field_m = "Waiting for models";
        field_j = "Public chat is unavailable while setting up a rated game.";
    }
}
