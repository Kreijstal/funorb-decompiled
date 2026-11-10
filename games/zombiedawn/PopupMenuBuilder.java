/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupMenuBuilder {
    static Sprite field_g;
    static boolean field_a;
    static String field_d;
    static String field_f;
    static IndexedSprite[] field_e;
    static Sprite[] field_c;
    static int field_b;

    final static void buildPopupMenu(int param0, int param1, boolean param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        String stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        boolean stackIn_89_2 = false;
        String stackIn_109_0 = null;
        boolean stackIn_109_1 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ZombieDawn.field_J;
        try {
          MainMenuScreen.field_p = param0;
          ValidatedTextWidget.field_U = true;
          if (MainMenuScreen.field_p == 0) {
            var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, NineSliceFrame.field_a, AccountWelcomePanel.field_O, ZombieDawn.field_K);
            var4 = 3 + var3_int;
            IntrusiveDequeCursor.field_h = new String[var4];
            SpriteState.field_s = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              SpriteState.field_s[var5] = -1;
            }
            ArmedHuman.field_Kb = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              IntrusiveDequeCursor.field_h[var5] = HighscoreRequest.field_p[var5];
            }
            IntrusiveDequeCursor.field_h[-3 + var4] = "";
            IntrusiveDequeCursor.field_h[var4 - 2] = DiskArchiveRequest.field_w;
            SpriteState.field_s[var4 - 2] = 0;
            ArmedHuman.field_Kb[0] = 4;
            IntrusiveDequeCursor.field_h[-1 + var4] = FullscreenExitHelpers.field_c;
            SpriteState.field_s[var4 - 1] = 1;
            ArmedHuman.field_Kb[1] = 5;
          } else if (MainMenuScreen.field_p == 1) {
            var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, NineSliceFrame.field_a, AccountWelcomePanel.field_O, ZombieDawn.field_K);
            var4 = 2 + var3_int;
            IntrusiveDequeCursor.field_h = new String[var4];
            SpriteState.field_s = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              SpriteState.field_s[var5] = -1;
            }
            ArmedHuman.field_Kb = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              IntrusiveDequeCursor.field_h[var5] = HighscoreRequest.field_p[var5];
            }
            IntrusiveDequeCursor.field_h[var4 - 2] = "";
            IntrusiveDequeCursor.field_h[var4 - 1] = FullscreenExitHelpers.field_c;
            SpriteState.field_s[-1 + var4] = 0;
            ArmedHuman.field_Kb[0] = 5;
          } else if (MainMenuScreen.field_p != 2) {
            if (MainMenuScreen.field_p == 3) {
              if (SpriteFadeHelpers.field_a.field_t) {
                var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, ArrivingPassenger.field_Cb, AccountWelcomePanel.field_O, ZombieDawn.field_K);
              } else {
                var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, SavedDataRequest.field_n, AccountWelcomePanel.field_O, ZombieDawn.field_K);
              }
              var4 = var3_int + 2;
              IntrusiveDequeCursor.field_h = new String[var4];
              SpriteState.field_s = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                SpriteState.field_s[var5] = -1;
              }
              ArmedHuman.field_Kb = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntrusiveDequeCursor.field_h[var5] = HighscoreRequest.field_p[var5];
              }
              IntrusiveDequeCursor.field_h[-2 + var4] = "";
              IntrusiveDequeCursor.field_h[-1 + var4] = FullscreenExitHelpers.field_c;
              SpriteState.field_s[-1 + var4] = 0;
              ArmedHuman.field_Kb[0] = 5;
            } else if (MainMenuScreen.field_p == 4) {
              var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, TutorialTipHelpers.field_a, AccountWelcomePanel.field_O, ZombieDawn.field_K);
              var4 = var3_int + 2;
              IntrusiveDequeCursor.field_h = new String[var4];
              SpriteState.field_s = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                SpriteState.field_s[var5] = -1;
              }
              ArmedHuman.field_Kb = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntrusiveDequeCursor.field_h[var5] = HighscoreRequest.field_p[var5];
              }
              IntrusiveDequeCursor.field_h[var4 - 2] = "";
              IntrusiveDequeCursor.field_h[var4 - 1] = FullscreenExitHelpers.field_c;
              SpriteState.field_s[-1 + var4] = 0;
              ArmedHuman.field_Kb[0] = 5;
            } else {
              if (MainMenuScreen.field_p != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, AppletHostHelpers.field_c, AccountWelcomePanel.field_O, ZombieDawn.field_K);
              var4 = 3 + var3_int;
              SpriteState.field_s = new int[var4];
              IntrusiveDequeCursor.field_h = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                SpriteState.field_s[var5] = -1;
              }
              ArmedHuman.field_Kb = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                IntrusiveDequeCursor.field_h[var5] = HighscoreRequest.field_p[var5];
              }
              IntrusiveDequeCursor.field_h[var4 - 3] = "";
              IntrusiveDequeCursor.field_h[-2 + var4] = LoadingAndMapHelpers.field_c;
              SpriteState.field_s[-2 + var4] = 0;
              ArmedHuman.field_Kb[0] = 3;
              IntrusiveDequeCursor.field_h[var4 - 1] = FullscreenExitHelpers.field_c;
              SpriteState.field_s[-1 + var4] = 1;
              ArmedHuman.field_Kb[1] = 5;
            }
          } else {
            var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, BlastAffectedObject.substituteTemplateArguments(1938762664, TextFieldValidator.field_e, new String[]{"<br><%0><br>"}), AccountWelcomePanel.field_O, ZombieDawn.field_K);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(HighscoreRequest.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ResizableDialog.field_R = new String[var4];
            ArraySupport.copy(HighscoreRequest.field_p, 0, ResizableDialog.field_R, 0, var4);
            NodeHashTableIterator.field_b = new String[-1 - var4 + var3_int];
            ArraySupport.copy(HighscoreRequest.field_p, 1 + var4, NodeHashTableIterator.field_b, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = LoadingAndMapHelpers.wrapBalancedText((byte) 16, HighscoreRequest.field_p, BlastAffectedObject.substituteTemplateArguments(1938762664, MusicPatch.field_q, new String[]{"<br><%0><br>"}), AccountWelcomePanel.field_O, ZombieDawn.field_K);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(HighscoreRequest.field_p[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            NodeHashTable.field_h = new String[var4];
            ArraySupport.copy(HighscoreRequest.field_p, 0, NodeHashTable.field_h, 0, var4);
            Js5ArchiveManager.field_a = new String[-1 - var4 + var3_int];
            ArraySupport.copy(HighscoreRequest.field_p, var4 + 1, Js5ArchiveManager.field_a, 0, var3_int - (var4 + 1));
            if (NodeHashTable.field_h.length <= ResizableDialog.field_R.length) {
              stackIn_57_0 = ResizableDialog.field_R.length;
            } else {
              stackIn_57_0 = NodeHashTable.field_h.length;
            }
            var5 = stackIn_57_0;
            if (NodeHashTableIterator.field_b.length < Js5ArchiveManager.field_a.length) {
              stackIn_60_0 = Js5ArchiveManager.field_a.length;
            } else {
              stackIn_60_0 = NodeHashTableIterator.field_b.length;
            }
            var6 = stackIn_60_0;
            var7 = var6 + var5 + 7;
            SpriteState.field_s = new int[var7];
            IntrusiveDequeCursor.field_h = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              SpriteState.field_s[var8] = -1;
            }
            SpriteState.field_s[1] = 0;
            IntrusiveDequeCursor.field_h[1] = LevelResultScreen.field_s;
            ArmedHuman.field_Kb = new int[2];
            IntrusiveDequeCursor.field_h[0] = CacheEntry.field_p;
            IntrusiveDequeCursor.field_h[2] = Tree.field_S;
            ArmedHuman.field_Kb[1] = 2;
            ArmedHuman.field_Kb[0] = 5;
            IntrusiveDequeCursor.field_h[3] = ContentTransitionDialog.field_bb;
            IntrusiveDequeCursor.field_h[4] = LevelHud.field_j;
            SpriteState.field_s[3] = 1;
            IntrusiveDequeCursor.field_h[5] = "";
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_67_0 = IntrusiveDequeCursor.field_h;
              stackIn_67_1 = 6 + var8Lifetime2;
              if (var8Lifetime2 + NodeHashTable.field_h.length - var5 < 0) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = NodeHashTable.field_h[-var5 + var8Lifetime2 + NodeHashTable.field_h.length];
              }
              stackIn_67_0[stackIn_67_1] = stackIn_68_2;
            }
            IntrusiveDequeCursor.field_h[var5 + 6] = null;
            SpriteState.field_s[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_72_0 = IntrusiveDequeCursor.field_h;
              stackIn_72_1 = var8Lifetime3 + (var5 + 7);
              stackIn_72_2 = var8Lifetime3;
              stackIn_72_3 = Js5ArchiveManager.field_a.length;
              if (stackIn_72_2 < stackIn_72_3) {
                stackIn_75_2 = Js5ArchiveManager.field_a[var8Lifetime3];
              } else {
                stackIn_75_2 = "";
              }
              stackIn_72_0[stackIn_72_1] = stackIn_75_2;
            }
            AddressHintGlobals.field_f = MonotonicClock.monotonicTimeMillis(-22826);
          }
          FullscreenErrorDialog.field_W.field_h = ArmedHuman.field_Kb.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < IntrusiveDequeCursor.field_h.length; var4Lifetime1++) {
            stackIn_88_0 = IntrusiveDequeCursor.field_h[var4Lifetime1];
            stackIn_88_1 = true;
            stackIn_89_2 = !(SpriteState.field_s[var4Lifetime1] < 0);
            var5Lifetime1 = NameCheckRequest.measureText(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (MainMenuScreen.field_p == 2) {
            var10 = ResizableDialog.field_R;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = NameCheckRequest.measureText(var11, true, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = NodeHashTableIterator.field_b;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = NameCheckRequest.measureText(var12, true, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          SessionSocketHelpers.field_d = FullscreenErrorDialog.field_W.field_h * (AccountTermsPanel.field_H + DisplayState.field_h << 1);
          if (param1 < 49) {
            stackIn_109_0 = (String) null;
            stackIn_109_1 = false;
            PopupMenuBuilder.openLoginProgress(stackIn_109_0, stackIn_109_1, true);
          }
          ScrollViewport.field_E = -(var3_intLifetime1 >> 1) + IntKeyLookup.field_b + var3_intLifetime1;
          RasterCanvasSizeTarget.field_c = IntKeyLookup.field_b - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; IntrusiveDequeCursor.field_h.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_114_0 = SessionSocketHelpers.field_d;
            if (SpriteState.field_s[var4Lifetime2] < 0) {
              stackIn_115_1 = CheckboxPainter.field_r;
            } else {
              stackIn_115_1 = Path.field_f;
            }
            SessionSocketHelpers.field_d = stackIn_114_0 + stackIn_115_1;
          }
          IterableNodeHashTable.field_d = -(SessionSocketHelpers.field_d >> 1) + SettingsCookieHelpers.field_a;
          HotspotTextWidget.field_F = new int[IntrusiveDequeCursor.field_h.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = IterableNodeHashTable.field_d;
          while (IntrusiveDequeCursor.field_h.length > var4Lifetime3) {
            var6Lifetime1 = SpriteState.field_s[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = NameCheckRequest.measureText(IntrusiveDequeCursor.field_h[var4Lifetime3], true, true);
              var5Lifetime3 = var5Lifetime3 + AccountTermsPanel.field_H;
              var8Lifetime1 = IntKeyLookup.field_b - (var7Lifetime2 >> 1);
              HotspotTextWidget.field_F[var4Lifetime3] = new int[4];
              HotspotTextWidget.field_F[var4Lifetime3][0] = var8Lifetime1 - EmailAvailabilityValidator.field_f;
              HotspotTextWidget.field_F[var4Lifetime3][1] = var5Lifetime3;
              HotspotTextWidget.field_F[var4Lifetime3][2] = (EmailAvailabilityValidator.field_f << 1) + var7Lifetime2;
              HotspotTextWidget.field_F[var4Lifetime3][3] = Path.field_f + (DisplayState.field_h << 1);
              var5Lifetime3 = var5Lifetime3 + ((DisplayState.field_h << 1) + AccountTermsPanel.field_H + Path.field_f);
            } else {
              var5Lifetime3 = var5Lifetime3 + CheckboxPainter.field_r;
            }
            var4Lifetime3++;
          }
          if (2 != MainMenuScreen.field_p) {
            FullscreenErrorDialog.field_W.initializeSelection(param2, (byte) -70, GridContainer.hitTestMenuRows(6199969, KeyStateHelpers.field_b, FadingModalPanel.field_K), 0);
          } else {
            FullscreenErrorDialog.field_W.initializeSelection(param2, (byte) -75, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var3), "ti.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_d = null;
        field_g = null;
        field_f = null;
        if (param0 != 4) {
          PopupMenuBuilder.releaseStatics(126);
        }
        field_e = null;
    }

    final static void openLoginProgress(String param0, boolean param1, boolean param2) {
        try {
          DropdownItemList.field_J = param1;
          VisualPropertyNode.field_q = true;
          Point.field_i = new ProgressMessageDialog(MessageDialogContent.field_S, LoginPacketHelpers.field_b, param0, IntRecordReplyHelpers.field_c, DropdownItemList.field_J);
          if (param2) {
            String var4 = (String) null;
            PopupMenuBuilder.openLoginProgress((String) null, false, true);
          }
          MessageDialogContent.field_S.addDialog(Point.field_i, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ti.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new Sprite(540, 140);
        field_d = "SCREECH";
        field_f = "Play free version";
        field_a = false;
        field_b = 0;
    }
}
