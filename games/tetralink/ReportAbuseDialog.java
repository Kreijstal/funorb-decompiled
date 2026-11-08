/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ReportAbuseDialog extends UiComponent {
    private UiComponent field_Vb;
    private UiComponent field_bc;
    private UiComponent field_Ub;
    static String field_Zb;
    private UiComponent field_Wb;
    private int field_Tb;
    private UiComponent field_Mb;
    private LabelPairWidget field_ac;
    private StringBuilder field_Kb;
    static int[] field_Yb;
    static int field_Nb;
    static int field_Rb;
    private UiComponent field_Sb;
    static String field_Lb;
    private UiComponent[] field_Qb;
    static String field_Pb;
    long field_Ob;
    static String field_Xb;

    final static boolean precedesSocialRow(SocialListEntry param0, byte param1, SocialListEntry param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var3_int = param0.field_Rb - param2.field_Rb;
          if (param1 < 98) {
            field_Nb = -127;
          }
          if (SpriteCheckboxPainter.field_e != param0.field_Ub) {
            if (null == param0.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2.field_Ub != SpriteCheckboxPainter.field_e) {
            if (param2.field_Ub == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("om.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean handleEscape(int param0) {
        if (param0 != 5) {
          return true;
        }
        if (this.field_Tb != -2) {
          return false;
        }
        if (WidgetStyleLayer.field_e != 13) {
          return true;
        }
        this.field_Tb = -1;
        return true;
    }

    private final int appendLabelRow(int param0, int param1, UiComponent param2, UiComponent param3, String param4, int param5) {
        UiComponent var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new UiComponent(0L, param2, 0, param0, param5, 24, param4);
          param0 += 32;
          param3.addChild((byte) -89, var7);
          var8 = 105 / ((param1 + 48) / 59);
          stackIn_1_0 = param0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("om.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean isMuteSelected(byte param0) {
        String var3;
        boolean stackIn_6_0 = false;
        if (param0 <= 85) {
          var3 = (String) null;
          ReportAbuseDialog.openLoginProgressWithTexts(false, true, (String) null, (String) null);
        }
        stackIn_6_0 = (this.field_ac != null) && (this.field_ac.field_zb);
        return stackIn_6_0;
    }

    final static void buildFullscreenDialog(boolean param0, int param1, int param2) {
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_61_2 = null;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        String stackIn_68_2 = null;
        boolean stackIn_89_0 = false;
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
        var9 = TetraLink.field_J;
        try {
          AnimationFrameSet.field_z = param2;
          RasterStackHelpers.field_d = true;
          if (AnimationFrameSet.field_z == 0) {
            var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, 121, LobbyResourceHelpers.field_b, LoadingStageHook.field_f, LoginMethod.field_d);
            var4 = 3 + var3_int;
            ContentTransitionDialog.field_mb = new int[var4];
            TopLevelContainerHelpers.field_h = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ContentTransitionDialog.field_mb[var5] = -1;
            }
            StartupFlagsHelpers.field_g = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              TopLevelContainerHelpers.field_h[var5] = LoadingStageHook.field_f[var5];
            }
            TopLevelContainerHelpers.field_h[-3 + var4] = "";
            TopLevelContainerHelpers.field_h[-2 + var4] = LoadingProgressDialog.field_X;
            ContentTransitionDialog.field_mb[-2 + var4] = 0;
            StartupFlagsHelpers.field_g[0] = 4;
            TopLevelContainerHelpers.field_h[var4 - 1] = DebouncedValidator.field_a;
            ContentTransitionDialog.field_mb[var4 - 1] = 1;
            StartupFlagsHelpers.field_g[1] = 5;
          } else if (AnimationFrameSet.field_z == 1) {
            var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, -12, LobbyResourceHelpers.field_b, LoadingStageHook.field_f, LoginMethod.field_d);
            var4 = var3_int + 2;
            ContentTransitionDialog.field_mb = new int[var4];
            TopLevelContainerHelpers.field_h = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ContentTransitionDialog.field_mb[var5] = -1;
            }
            StartupFlagsHelpers.field_g = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              TopLevelContainerHelpers.field_h[var5] = LoadingStageHook.field_f[var5];
            }
            TopLevelContainerHelpers.field_h[var4 - 2] = "";
            TopLevelContainerHelpers.field_h[var4 - 1] = DebouncedValidator.field_a;
            ContentTransitionDialog.field_mb[var4 - 1] = 0;
            StartupFlagsHelpers.field_g[0] = 5;
          } else if (AnimationFrameSet.field_z != 2) {
            if (AnimationFrameSet.field_z == 3) {
              if (!QuickChatHelpDialog.field_Pb.field_e) {
                var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, -103, MusicPatchPcmStream.field_v, LoadingStageHook.field_f, LoginMethod.field_d);
              } else {
                var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, 119, ChatPanelSlideHelpers.field_b, LoadingStageHook.field_f, LoginMethod.field_d);
              }
              var4 = var3_int + 2;
              TopLevelContainerHelpers.field_h = new String[var4];
              ContentTransitionDialog.field_mb = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ContentTransitionDialog.field_mb[var5] = -1;
              }
              StartupFlagsHelpers.field_g = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                TopLevelContainerHelpers.field_h[var5] = LoadingStageHook.field_f[var5];
              }
              TopLevelContainerHelpers.field_h[-2 + var4] = "";
              TopLevelContainerHelpers.field_h[-1 + var4] = DebouncedValidator.field_a;
              ContentTransitionDialog.field_mb[var4 - 1] = 0;
              StartupFlagsHelpers.field_g[0] = 5;
            } else if (AnimationFrameSet.field_z == 4) {
              var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, -72, MiscTextGlobals.field_c, LoadingStageHook.field_f, LoginMethod.field_d);
              var4 = var3_int + 2;
              ContentTransitionDialog.field_mb = new int[var4];
              TopLevelContainerHelpers.field_h = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ContentTransitionDialog.field_mb[var5] = -1;
              }
              StartupFlagsHelpers.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                TopLevelContainerHelpers.field_h[var5] = LoadingStageHook.field_f[var5];
              }
              TopLevelContainerHelpers.field_h[var4 - 2] = "";
              TopLevelContainerHelpers.field_h[-1 + var4] = DebouncedValidator.field_a;
              ContentTransitionDialog.field_mb[-1 + var4] = 0;
              StartupFlagsHelpers.field_g[0] = 5;
            } else {
              if (AnimationFrameSet.field_z != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, param1 ^ -91, PendingSubmission.field_p, LoadingStageHook.field_f, LoginMethod.field_d);
              var4 = var3_int + 3;
              ContentTransitionDialog.field_mb = new int[var4];
              TopLevelContainerHelpers.field_h = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ContentTransitionDialog.field_mb[var5] = -1;
              }
              StartupFlagsHelpers.field_g = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                TopLevelContainerHelpers.field_h[var5] = LoadingStageHook.field_f[var5];
              }
              TopLevelContainerHelpers.field_h[-3 + var4] = "";
              TopLevelContainerHelpers.field_h[-2 + var4] = PasswordValidator.field_q;
              ContentTransitionDialog.field_mb[-2 + var4] = 0;
              StartupFlagsHelpers.field_g[0] = 3;
              TopLevelContainerHelpers.field_h[-1 + var4] = DebouncedValidator.field_a;
              ContentTransitionDialog.field_mb[var4 - 1] = 1;
              StartupFlagsHelpers.field_g[1] = 5;
            }
          } else {
            var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, param1 ^ -59, SectorCacheStore.formatTemplate(new String[]{"<br><%0><br>"}, RsaKeyAndTextGlobals.field_g, 126), LoadingStageHook.field_f, LoginMethod.field_d);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(LoadingStageHook.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            AccountCreationDialog.field_Ab = new String[var4];
            ArraySupport.copy(LoadingStageHook.field_f, 0, AccountCreationDialog.field_Ab, 0, var4);
            FullscreenErrorDialog.field_db = new String[-var4 + var3_int - 1];
            ArraySupport.copy(LoadingStageHook.field_f, 1 + var4, FullscreenErrorDialog.field_db, 0, -1 + (var3_int - var4));
            var3_int = ArchiveIndex.wrapBalancedText(LoginProgressHelpers.field_f, param1 ^ -125, SectorCacheStore.formatTemplate(new String[]{"<br><%0><br>"}, DualLinkNode.field_p, 124), LoadingStageHook.field_f, LoginMethod.field_d);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(LoadingStageHook.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            InputDetachHelpers.field_b = new String[var4];
            ArraySupport.copy(LoadingStageHook.field_f, 0, InputDetachHelpers.field_b, 0, var4);
            Archive.field_j = new String[-1 + (-var4 + var3_int)];
            ArraySupport.copy(LoadingStageHook.field_f, var4 + 1, Archive.field_j, 0, -var4 + (var3_int - 1));
            if (AccountCreationDialog.field_Ab.length < InputDetachHelpers.field_b.length) {
              stackIn_50_0 = InputDetachHelpers.field_b.length;
            } else {
              stackIn_50_0 = AccountCreationDialog.field_Ab.length;
            }
            var5 = stackIn_50_0;
            if (FullscreenErrorDialog.field_db.length >= Archive.field_j.length) {
              stackIn_53_0 = FullscreenErrorDialog.field_db.length;
            } else {
              stackIn_53_0 = Archive.field_j.length;
            }
            var6 = stackIn_53_0;
            var7 = var6 + var5 + 7;
            ContentTransitionDialog.field_mb = new int[var7];
            TopLevelContainerHelpers.field_h = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              ContentTransitionDialog.field_mb[var8] = -1;
            }
            TopLevelContainerHelpers.field_h[1] = TriangleSpanHelpers.field_g;
            ContentTransitionDialog.field_mb[1] = 0;
            StartupFlagsHelpers.field_g = new int[2];
            TopLevelContainerHelpers.field_h[0] = HighscoreSubmission.field_n;
            ContentTransitionDialog.field_mb[3] = 1;
            TopLevelContainerHelpers.field_h[5] = "";
            StartupFlagsHelpers.field_g[0] = 5;
            StartupFlagsHelpers.field_g[1] = 2;
            TopLevelContainerHelpers.field_h[4] = MenuReturnHelpers.field_b;
            TopLevelContainerHelpers.field_h[3] = AccountCreationForm.field_Q;
            TopLevelContainerHelpers.field_h[2] = IndexedSpriteState.field_g;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_60_0 = TopLevelContainerHelpers.field_h;
              stackIn_60_1 = var8Lifetime2 + 6;
              if (var8Lifetime2 + InputDetachHelpers.field_b.length - var5 >= 0) {
                stackIn_61_2 = InputDetachHelpers.field_b[-var5 + var8Lifetime2 + InputDetachHelpers.field_b.length];
              } else {
                stackIn_61_2 = "";
              }
              stackIn_60_0[stackIn_60_1] = stackIn_61_2;
            }
            TopLevelContainerHelpers.field_h[var5 + 6] = null;
            ContentTransitionDialog.field_mb[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_65_0 = TopLevelContainerHelpers.field_h;
              stackIn_65_1 = var5 + 7 + var8Lifetime3;
              stackIn_65_2 = ~Archive.field_j.length;
              stackIn_65_3 = ~var8Lifetime3;
              if (stackIn_65_2 >= stackIn_65_3) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = Archive.field_j[var8Lifetime3];
              }
              stackIn_65_0[stackIn_65_1] = stackIn_68_2;
            }
            IntrusiveDequeCursor.field_a = ClockAndTextHelpers.monotonicMillis(param1 ^ 10);
          }
          QuickChatMenuFactory.field_h.field_g = StartupFlagsHelpers.field_g.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; TopLevelContainerHelpers.field_h.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_89_0 = !(ContentTransitionDialog.field_mb[var4Lifetime1] < 0);
            var5Lifetime1 = AccountCreationDialog.measureText(stackIn_89_0, TopLevelContainerHelpers.field_h[var4Lifetime1], (byte) -77);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == AnimationFrameSet.field_z) {
            var10 = AccountCreationDialog.field_Ab;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = AccountCreationDialog.measureText(false, var11, (byte) -111);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = FullscreenErrorDialog.field_db;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = AccountCreationDialog.measureText(false, var12, (byte) -106);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          StripedProgressBar.field_X = (ChatLayoutHelpers.field_c + CanvasAndErrorHelpers.field_e << 1) * QuickChatMenuFactory.field_h.field_g;
          AccountTermsPanel.field_K = -(var3_intLifetime1 >> 1) + var3_intLifetime1 + NameEntryPopup.field_Lb;
          DateOfBirthPanel.field_V = NameEntryPopup.field_Lb - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < TopLevelContainerHelpers.field_h.length; var4Lifetime2++) {
            stackIn_114_0 = StripedProgressBar.field_X;
            if (ContentTransitionDialog.field_mb[var4Lifetime2] >= 0) {
              stackIn_115_1 = LobbyUpdateHelpers.field_d;
            } else {
              stackIn_115_1 = DirectByteStorage.field_e;
            }
            StripedProgressBar.field_X = stackIn_114_0 + stackIn_115_1;
          }
          TopLevelContainerHelpers.field_e = LruTextureCache.field_i - (StripedProgressBar.field_X >> 1);
          VerticalScrollbar.field_Ob = new int[TopLevelContainerHelpers.field_h.length][];
          if (param1 != 10) {
            return;
          }
          var4Lifetime3 = 0;
          var5Lifetime3 = TopLevelContainerHelpers.field_e;
          while (var4Lifetime3 < TopLevelContainerHelpers.field_h.length) {
            var6Lifetime1 = ContentTransitionDialog.field_mb[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + DirectByteStorage.field_e;
            } else {
              var7Lifetime2 = AccountCreationDialog.measureText(true, TopLevelContainerHelpers.field_h[var4Lifetime3], (byte) -83);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + NameEntryPopup.field_Lb;
              var5Lifetime3 = var5Lifetime3 + ChatLayoutHelpers.field_c;
              VerticalScrollbar.field_Ob[var4Lifetime3] = new int[4];
              VerticalScrollbar.field_Ob[var4Lifetime3][0] = var8Lifetime1 - StartupFlagsHelpers.field_a;
              VerticalScrollbar.field_Ob[var4Lifetime3][1] = var5Lifetime3;
              VerticalScrollbar.field_Ob[var4Lifetime3][2] = var7Lifetime2 + (StartupFlagsHelpers.field_a << 1);
              VerticalScrollbar.field_Ob[var4Lifetime3][3] = (CanvasAndErrorHelpers.field_e << 1) + LobbyUpdateHelpers.field_d;
              var5Lifetime3 = var5Lifetime3 + ((CanvasAndErrorHelpers.field_e << 1) + ChatLayoutHelpers.field_c + LobbyUpdateHelpers.field_d);
            }
            var4Lifetime3++;
          }
          if (AnimationFrameSet.field_z == 2) {
            QuickChatMenuFactory.field_h.initializeSelection(-1, -1, param0, 101);
          } else {
            QuickChatMenuFactory.field_h.initializeSelection(LobbyPlayerEntry.hitTestMenuOption(ContextMenu.field_Nb, ClientProtocolStage.field_a, 8395), 0, param0, 99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "om.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String getEnteredText(byte param0) {
        int var2 = -124 % ((-17 - param0) / 43);
        return this.field_Kb.toString();
    }

    ReportAbuseDialog(int param0, int param1, int param2, int param3, int param4, UiComponent param5, UiComponent param6, UiComponent param7, UiComponent param8, LabelPairWidget param9, UiComponent param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object stackIn_7_0;
        LabelPairWidget stackIn_7_1;
        LabelPairWidget stackIn_7_2;
        long stackIn_7_3;
        LabelPairWidget stackIn_7_4;
        Object stackIn_8_0;
        Object stackIn_9_0;
        LabelPairWidget stackIn_9_1;
        LabelPairWidget stackIn_9_2;
        String stackIn_9_5;
        UiComponent stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiComponent[] var15 = null;
        RuntimeException var15_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        UiComponent[] var28 = null;
        Object stackIn_7_0Lifetime1;
        Object stackIn_9_0Lifetime1;
        LabelPairWidget stackIn_9_1Lifetime1;
        LabelPairWidget stackIn_9_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_Tb = -2;
        try {
          this.field_Ob = param12;
          this.field_Ub = new UiComponent(0L, param6, CanvasAndErrorHelpers.field_h.toUpperCase());
          this.field_Ub.field_xb = 1;
          this.addChild((byte) 43, this.field_Ub);
          this.field_Wb = new UiComponent(0L, param7);
          this.field_Ub.addChild((byte) 106, this.field_Wb);
          this.field_Mb = new UiComponent(0L, (UiComponent) null);
          this.addChild((byte) 19, this.field_Mb);
          if (param11 != null) {
            this.field_Vb = new UiComponent(0L, param8, InterfaceTextLoader.field_b);
            this.field_Vb.field_N = 11184810;
            this.field_Vb.field_xb = 1;
            this.field_Mb.addChild((byte) -94, this.field_Vb);
            this.field_Sb = new UiComponent(0L, param8, BackgroundSparkle.field_p);
            this.field_Sb.field_xb = 1;
            this.field_Sb.field_N = 11184810;
            this.field_Mb.addChild((byte) 100, this.field_Sb);
            this.field_bc = new UiComponent(0L, param8);
            this.field_bc.field_N = 16764006;
            this.field_Mb.addChild((byte) -120, this.field_bc);
            this.field_bc.field_O = "|";
            if (!(5 > CacheEntry.field_z) ||
              !(SettingsCookieHelpers.field_c < 2)) {
              regionExit1: {
                stackIn_7_0 = this;
                stackIn_7_1 = null;
                stackIn_7_2 = null;
                stackIn_7_3 = 0L;
                stackIn_7_4 = (LabelPairWidget) (param9);
                if (7 > CacheEntry.field_z) {
                  stackIn_8_0 = this;
                  stackIn_7_0Lifetime1 = stackIn_8_0;
                  if (2 > SettingsCookieHelpers.field_c) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = StripedProgressBar.field_I;
                    break regionExit1;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = TextureCache.field_e;
              }
              this.field_ac = new LabelPairWidget(stackIn_7_3, stackIn_7_4, stackIn_9_5);
              this.field_Mb.addChild((byte) 19, this.field_ac);
            }
            var28 = new UiComponent[3];
            var15 = var28;
            var28[0] = new UiComponent(0L, (UiComponent) null);
            this.field_Mb.addChild((byte) 106, var28[0]);
            var28[1] = new UiComponent(0L, (UiComponent) null);
            this.field_Mb.addChild((byte) -88, var28[1]);
            var28[2] = new UiComponent(0L, (UiComponent) null);
            this.field_Mb.addChild((byte) 57, var28[2]);
            this.field_Qb = new UiComponent[PendingReplyNode.field_q];
            for (var16 = 0; var16 < PendingReplyNode.field_q; var16++) {
              if (null != MenuReturnHelpers.field_d[var16]) {
                this.field_Qb[var16] = new UiComponent(0L, param10, MenuReturnHelpers.field_d[var16]);
                this.field_Qb[var16].field_xb = 0;
                stackIn_15_0 = this.field_Qb[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.field_S = stackIn_16_1;
                this.field_Mb.addChild((byte) 106, this.field_Qb[var16]);
              }
            }
            this.field_Kb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Kb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_Ib.textWidth(GameOptionTextTables.field_b);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_Ib.textWidth(DirectByteStorage.field_j);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_Ib.textWidth(RasterStackHelpers.field_f);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; PendingReplyNode.field_q > var17Lifetime4; var17Lifetime4++) {
              if (null != this.field_Qb[var17Lifetime4]) {
                var18 = this.field_Qb[var17Lifetime4].measureUnconstrainedWidth(-82);
                if (var18 > var16Lifetime2) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.appendLabelRow(var18Lifetime3, -124, param6, var28[0], GameOptionTextTables.field_b, var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-50, this.field_Qb[6], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-113, this.field_Qb[9], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-119, this.field_Qb[5], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-107, this.field_Qb[7], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-56, this.field_Qb[15], var18Lifetime3, var28[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(-51, this.field_Qb[4], var18Lifetime3, var28[0], var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.appendLabelRow(var18Lifetime4, -127, param6, var28[1], DirectByteStorage.field_j, var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(-116, this.field_Qb[16], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(-103, this.field_Qb[17], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(-80, this.field_Qb[18], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(-38, this.field_Qb[19], var18Lifetime4, var28[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(-35, this.field_Qb[20], var18Lifetime4, var28[1], var16Lifetime2);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.appendLabelRow(var18Lifetime5, 102, param6, var28[2], RasterStackHelpers.field_f, var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(-122, this.field_Qb[13], var18Lifetime5, var28[2], var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(-74, this.field_Qb[21], var18Lifetime5, var28[2], var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(-41, this.field_Qb[11], var18Lifetime5, var28[2], var16Lifetime2);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + 3 * var16Lifetime2;
            var20 = this.field_Ub.measureUnconstrainedWidth(-40);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.field_ac) {
              var20Lifetime2 = this.field_ac.measureRowWidth(-122, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Ub.setBounds((byte) -111, 13 + var19 + 13, 0, 24, 0);
            this.field_Wb.setBounds((byte) -109, 15, 5, 15, -20 + this.field_Ub.field_Hb);
            var21 = 10;
            this.field_Vb.setBounds((byte) -125, var19, var21, GameKeyHandler.field_d * 2, 13);
            var21 = var21 + GameKeyHandler.field_d * 2;
            this.field_Sb.setBounds((byte) -127, var19, var21, 2 * GameKeyHandler.field_d, 13);
            var21 = var21 + (GameKeyHandler.field_d * 2 + 10);
            this.field_bc.setBounds((byte) -79, 0, var21, GameKeyHandler.field_d, 0);
            var21 = var21 + (GameKeyHandler.field_d + 10);
            if (this.field_ac != null) {
              var20Lifetime3 = this.field_ac.measureRowWidth(-127, 4);
              this.field_ac.setBoundsAndLayout((-var20Lifetime3 + var19) / 2 + 13, var20Lifetime3, 3, GameKeyHandler.field_d, 4, var21);
              var21 = var21 + (10 + GameKeyHandler.field_d);
            }
            var28[0].setBounds((byte) -103, var16Lifetime2, var21, var17Lifetime5, 13);
            var28[1].setBounds((byte) -92, var16Lifetime2, var21, var17Lifetime5, var16Lifetime2 + 13 + 13);
            var28[2].setBounds((byte) -79, var16Lifetime2, var21, var17Lifetime5, 13 + var16Lifetime2 * 2 + 26);
            var22 = var21;
            this.field_Mb.setBounds((byte) -90, var19 + 13 + 13, 24, 10 + (var22 + var17Lifetime5), 0);
            this.field_Mb.field_Eb = Archive.buildNineSliceSprites(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
            var23 = 13 + var19 + 13;
            var24 = var17Lifetime5 + (var22 + 24 + 10);
            var25 = CameraAndChatHelpers.clampPopupX(var23, (byte) 97, param0, param2);
            var26 = GameRoomPanelHelpers.placePopupVertically(param3, param1, var24, -8748);
            this.setBounds((byte) -85, var23, var26, var24, var25);
            return;
          }
          this.field_Vb = new UiComponent(0L, param8, StringPadHelpers.field_d);
          this.field_Vb.field_xb = 1;
          this.field_Vb.field_N = 11184810;
          this.field_Mb.addChild((byte) -105, this.field_Vb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Vb.field_Ib.wrappedLineCount(this.field_Vb.field_jb, var15_int);
          this.field_Vb.setBounds((byte) -114, var15_int, var16Lifetime1, GameKeyHandler.field_d * var17Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + GameKeyHandler.field_d * var17Lifetime1;
          this.field_Mb.setBounds((byte) -99, 13 + var15_int + 13, 24, var16Lifetime1 + 10, 0);
          this.field_Mb.field_Eb = Archive.buildNineSliceSprites(2105376, 3, 8421504, 16, 11579568, this.field_Mb.field_R);
          var18Lifetime1 = 13 + (var15_int + 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = CameraAndChatHelpers.clampPopupX(var18Lifetime1, (byte) 89, param0, param2);
          var21Lifetime1 = GameRoomPanelHelpers.placePopupVertically(param3, param1, var19Lifetime1, -8748);
          this.setBounds((byte) -116, var18Lifetime1, var21Lifetime1, var19Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("om.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static boolean pollGameSocketConnection(boolean param0, byte param1) {
        try {
          BitPacketBuffer var4 = null;
          BitPacketBuffer var5 = null;
          if (PendingStatQuery.field_p == null) {
            PendingStatQuery.field_p = IndexedSpriteState.field_l.requestSocket(PointerTrailBubble.field_t, SocketJs5Transport.field_r, (byte) 104);
          }
          if (param1 > -37) {
            return true;
          }
          if (0 == PendingStatQuery.field_p.field_d) {
            return false;
          }
          long dupTemp$0 = ClockAndTextHelpers.monotonicMillis(0);
          FlaggedTextValue.field_n = dupTemp$0;
          AccountServerResult.field_k = dupTemp$0;
          if (PendingStatQuery.field_p.field_d != 1) {
            SparkParticle.field_p = GameOptionControls.field_d;
          } else {
            try {
              TriangleSpanHelpers.field_e = new BufferedSocket((java.net.Socket) (PendingStatQuery.field_p.field_f), IndexedSpriteState.field_l);
              var4 = BackgroundSparkle.field_q;
              var5 = var4;
              QuickChatHelpDialog.field_Lb.position = 0;
              GameRoomPanelHelpers.field_g = param0 ? -2 : -1;
              ProgressMessageDialog.field_sb = param0 ? -2 : -1;
              SpriteState.field_A = param0 ? -2 : -1;
              var5.position = 0;
              SparkParticle.field_p = BitPacketBuffer.field_z;
              IntrusiveDeque.writeSessionHeader(-85, ChatMessageReader.field_c, QuickChatHelpDialog.field_Lb, StrongCacheEntry.field_I, KeyHandlerHelpers.field_a);
              PacketFlushHelpers.flushPackets((byte) -60, -1);
            } catch (IOException iOException) {
              SparkParticle.field_p = GameOptionControls.field_d;
            }
          }
          PendingStatQuery.field_p = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int appendReasonButton(int param0, UiComponent param1, int param2, UiComponent param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -31) {
            stackIn_2_0 = -86;
            return stackIn_2_0;
          }
          param2 += 8;
          var6_int = param1.field_Ib.paragraphHeight(param1.field_jb, param4 - param1.field_V * 2, param1.field_Q);
          param1.setBounds((byte) -86, param4, param2, var6_int, 0);
          param2 = param2 + (0 + var6_int);
          param3.addChild((byte) -96, param1);
          stackIn_4_0 = param2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("om.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final int updateAndPollReason(boolean param0, boolean param1) {
        int var3 = 0;
        LabelPairWidget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        UiComponent stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = TetraLink.field_J;
        this.updateInput(0, param0);
        if (null != this.field_bc) {
          this.field_bc.field_jb = this.field_Kb.toString();
          this.field_bc.field_M = (this.field_Hb - this.field_bc.field_Ib.textWidth(this.field_bc.field_jb)) / 2;
          if (null != this.field_ac &&
            this.field_ac.field_F != 0) {
            stackIn_7_0 = this.field_ac;
            stackIn_8_1 = !(this.field_ac.field_zb);
            stackIn_7_0.field_zb = stackIn_8_1;
          }
          this.field_bc.field_Hb = this.field_Hb - this.field_bc.field_M;
          for (var3 = 0; var3 < PendingReplyNode.field_q; var3++) {
            if (null != this.field_Qb[var3]) {
              stackIn_16_0 = this.field_Qb[var3];
              stackIn_17_1 = !(this.field_Kb.length() <= 0);
              stackIn_16_0.field_S = stackIn_17_1;
              if (this.field_Qb[var3].field_S &&
                this.field_Qb[var3].field_F != 0) {
                return var3;
              }
            }
          }
        }
        if (param1) {
          field_Xb = (String) null;
        }
        if (this.field_Wb.field_F != 0) {
          return -1;
        }
        if (param0 &&
          NameAvailabilityValidator.field_t != 0 &&
          0 == this.field_F) {
          return -1;
        }
        return this.field_Tb;
    }

    final static void openLoginProgressWithTexts(boolean param0, boolean param1, String param2, String param3) {
        try {
          SocialTabsPanel.field_d = param3;
          ArchiveRequest.field_w = param2;
          LoginProgressHelpers.openLoginProgress(WeightedLruCache.field_d, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "om.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean comesBeforeRankingRow(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (param0) {
          if (DateOfBirthPanel.field_P[param3] < DateOfBirthPanel.field_P[param1]) {
            return true;
          }
          if (DateOfBirthPanel.field_P[param1] < DateOfBirthPanel.field_P[param3]) {
            return false;
          }
          if (MusicTrackHelpers.field_b[param3] < MusicTrackHelpers.field_b[param1]) {
            return true;
          }
          if (MusicTrackHelpers.field_b[param1] < MusicTrackHelpers.field_b[param3]) {
            return false;
          }
        } else {
          if (MusicTrackHelpers.field_b[param1] > MusicTrackHelpers.field_b[param3]) {
            return true;
          }
          if (MusicTrackHelpers.field_b[param1] < MusicTrackHelpers.field_b[param3]) {
            return false;
          }
          if (DateOfBirthPanel.field_P[param3] < DateOfBirthPanel.field_P[param1]) {
            return true;
          }
          if (DateOfBirthPanel.field_P[param1] < DateOfBirthPanel.field_P[param3]) {
            return false;
          }
        }
        if (param2 < 112) {
          ReportAbuseDialog.comesBeforeRankingRow(false, -3, -111, 88);
        }
        var4 = ScreenSwitchHelpers.field_b[param3] + ArchiveFactoryHelpers.field_g[param3] + AlternateLongAndTextCredentials.field_n[param3];
        var5 = ArchiveFactoryHelpers.field_g[param1] + (ScreenSwitchHelpers.field_b[param1] + AlternateLongAndTextCredentials.field_n[param1]);
        if (var5 > var4) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        return !(param1 <= param3);
    }

    final static boolean isNameCharacter(char param0, boolean param1) {
        if (param1) {
          return true;
        }
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (LongAndTextCredentials.isAsciiAlphanumeric(65, param0)) {
          return true;
        }
        if (param0 != 45 &&
          param0 != 160 &&
          param0 != 32) {
          if (95 != param0) {
            return false;
          }
          return true;
        }
        return true;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_Yb = (int[]) null;
        }
        field_Xb = null;
        field_Yb = null;
        field_Zb = null;
        field_Pb = null;
        field_Lb = null;
    }

    static {
        field_Zb = "Yes";
        field_Pb = "Confirm Email:";
        field_Lb = "Mouse over an icon for details";
        field_Xb = "Waiting for <%0> to start the game...";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean socialRowPrecedesIntArgs(SocialListEntry param0, int param1, SocialListEntry param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var3_int = param0.field_Rb - param2.field_Rb;
          if (param1 < 98) {
            field_Nb = -127;
          }
          if (SpriteCheckboxPainter.field_e != param0.field_Ub) {
            if (null == param0.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2.field_Ub != SpriteCheckboxPainter.field_e) {
            if (param2.field_Ub == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("om.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }
}
