/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenTransitionHelpers {
    static ConnectionState field_f;
    static IndexedSprite[] field_e;
    static Sprite[] field_c;
    static String field_h;
    static String field_i;
    static String field_d;
    static AudioOutput field_a;
    static SceneScrollPane field_b;
    static int field_g;

    final static void switchToRequestedScreen(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (~MatchingFieldValidator.field_r == ~CheckboxPainter.field_g) {
            return;
          }
          if (SceneTabbedPanel.isNonNegative(CheckboxPainter.field_g, 10)) {
            ArchiveProvider.field_f[CheckboxPainter.field_g].leaveScreen((byte) 103);
          }
          var1_int = CheckboxPainter.field_g;
          CheckboxPainter.field_g = MatchingFieldValidator.field_r;
          GameListSortHelpers.field_b = MusicCrossfadeStream.field_A;
          NameCheckRequest.field_c = 0;
          if (CheckboxPainter.field_g == -1 &&
            5 == var1_int &&
            null != SpriteState.field_z) {
            SpriteState.field_z.field_z = SpriteState.field_z.field_z - (250 - MusicPatchNode.field_s);
          }
          if (CheckboxPainter.field_g == 0 ||
            CheckboxPainter.field_g == -4 ||
            -1 == CheckboxPainter.field_g ||
            -2 == CheckboxPainter.field_g ||
            CheckboxPainter.field_g == -5 ||
            CheckboxPainter.field_g == -3 ||
            CheckboxPainter.field_g == 14) {
            for (var2 = 1; var2 < PaddedContainer.field_H.length; var2++) {
              PaddedContainer.field_H[var2] = null;
            }
          }
          if (CheckboxPainter.field_g == 3) {
            MusicPatchNode.field_s = 0;
          }
          if (CheckboxPainter.field_g == 5) {
            MusicPatchNode.field_s = 0;
          }
          if (-1 == CheckboxPainter.field_g) {
            MusicPatchNode.field_s = 0;
          }
          if (0 == CheckboxPainter.field_g) {
            HotspotRegion.sendStatusBlock((byte) 112);
          }
          if (DecimalCheckHelpers.field_h) {
            if (null != SpriteState.field_z ||
              OverlayHelpers.field_b != null) {
              SpellProjectile.playMusic(DelegatingCanvas.field_c[0], 3);
            }
            OverlayHelpers.field_b = null;
            SpriteState.field_z = null;
            System.gc();
            DecimalCheckHelpers.field_h = false;
          }
          if (SceneTabStrip.field_Cb) {
            PaletteSpriteHelpers.field_h = new IntrusiveDeque();
            SceneTabStrip.field_Cb = false;
            SpellbookCaptionGlobals.field_f = new int[8];
          }
          if (param0 != 80) {
            return;
          }
          if (PlayerInfoPanel.field_Kb) {
            ServerMessage.closeOverlays(0);
            EditableTextWidget.disconnectLobby((byte) -123);
            MessageDialog.clearLobbyEntries(param0 ^ 110);
            PlayerInfoPanel.field_Kb = false;
          }
          EmailValidationHelpers.field_c = (int)(480.0 * Math.random());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "lf.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != -15) {
          return;
        }
        field_h = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_i = null;
    }

    final static void updateScrollAndTransition(int param0) {
        if (param0 != -4) {
          field_d = (String) null;
        }
        NameValidator.updateScrollAnimation((byte) -74);
        BitHelpers.updateTransitionCounters(true);
    }

    static {
        field_f = new ConnectionState();
        field_h = "Buying or selling an account";
        field_d = "Spell types 1/2:";
        field_i = "This entry doesn't match";
    }
}
