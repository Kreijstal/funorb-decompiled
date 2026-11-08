/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HighscoresScreen extends MenuScreen {
    static String tickerHintShotModeAim;
    static int field_I;
    static boolean field_K;
    static LobbyGame field_L;
    static int field_P;
    static ScrollPaneWithFooter field_J;
    static boolean field_N;
    static Sprite field_M;

    private final boolean g(int param0, int param1) {
        int var3;
        int var4;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackIn_30_0 = false;
        var4 = Pool.field_O;
        if (param1 != 53) {
          return true;
        }
        var3 = this.itemIds[param0];
        if (14 == var3) {
          stackIn_14_0 = (MembershipBenefitsScreen.field_J == 0);
          return stackIn_14_0;
        }
        if (var3 == 15) {
          stackIn_18_0 = (MembershipBenefitsScreen.field_J == 1);
          return stackIn_18_0;
        }
        if (var3 == 16) {
          stackIn_22_0 = (MembershipBenefitsScreen.field_J == 2);
          return stackIn_22_0;
        }
        if (52 == var3) {
          stackIn_26_0 = (0 == StrongCacheEntry.field_O);
          return stackIn_26_0;
        }
        stackIn_30_0 = (var3 == 53) && (1 == StrongCacheEntry.field_O);
        return stackIn_30_0;
    }

    private final void drawHighscoreTable(int param0) {
        int stackIn_13_0;
        int stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        int stackIn_14_4 = 0;
        String var2;
        String[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        String var10;
        int var11;
        int[] var15;
        int var7Lifetime1;
        var11 = Pool.field_O;
        if (null == DateInputWidget.field_V) {
          DateInputWidget.field_V = ImageProducerRasterBuffer.a(-112, 1, StrongCacheEntry.field_O, 3, 10);
        }
        regionExit1: {
          if (DateInputWidget.field_V.field_u) {
            if (null != DateInputWidget.field_V.field_m) {
              LogoMaterial.drawNineSlice(MidiPcmStream.field_y, (byte) -87, 320, 160, 160, 165 + ModernTableScene.field_Z.baselineHeight + 16);
              var2 = ModernTableScene.noHighscores;
              var3 = DateInputWidget.field_V.field_m[MembershipBenefitsScreen.field_J];
              var15 = DateInputWidget.field_V.field_z[MembershipBenefitsScreen.field_J];
              var5 = 180;
              ModernTableScene.field_Z.drawCentered(Cp1252CharacterSupport.highscoreHeaderTime, 438, var5, 15658734, -1);
              var5 = var5 + (ModernTableScene.field_Z.maxAscent + 8);
              var6 = ValidationIconWidget.a(MembershipBenefitsScreen.field_J, param0 ^ -3, DateInputWidget.field_V, DebugSliderInputSupport.field_d);
              for (var7 = 0; var7 < 10; var7++) {
                if (null != var3[var7]) {
                  stackIn_13_0 = 162;
                  stackIn_13_1 = -CollisionContact.field_h.maxAscent + var5;
                  stackIn_13_2 = 316;
                  stackIn_13_3 = 15;
                  if ((1 & var7) == 0) {
                    stackIn_14_4 = 4475508;
                  } else {
                    stackIn_14_4 = 4146281;
                  }
                  SoftwareRasterizer.fillRectangle(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_14_4);
                  var8 = 15658734;
                  var9 = var15[var7];
                  if (var7 == var6) {
                    var8 = 16764057;
                  }
                  var10 = var3[var7];
                  CollisionContact.field_h.c(var7 + 1 + ". ", 190, var5, var8, -1);
                  CollisionContact.field_h.d(var10, 190, var5, var8, -1);
                  var2 = "";
                  CollisionContact.field_h.drawCentered(ArchiveProvider.formatTimeSpan(-var9, (byte) -80), 440, var5, var8, -1);
                }
                var5 += 15;
              }
              if (((null != DebugSliderInputSupport.field_d)) &&
                (!(0 <= var6)) &&
                ((DebugSliderInputSupport.field_d.field_l == StrongCacheEntry.field_O))) {
                var7Lifetime1 = DebugSliderInputSupport.field_d.field_z[0];
                CollisionContact.field_h.d(ResourceArchive.field_j, 190, var5, 16764057, -1);
                CollisionContact.field_h.drawCentered(ArchiveProvider.formatTimeSpan(-var7Lifetime1, (byte) -80), 440, var5, 16764057, -1);
              }
              break regionExit1;
            }
            var2 = ArchiveFactory.serviceunavailable;
          } else {
            var2 = ProjectedLineSupport.pleasewaitDotdotdot;
          }
        }
        CollisionContact.field_h.drawCentered(var2, SoftwareRasterizer.width >> 1, 202, 16777215, -1);
        if (param0 != -3) {
          field_P = -127;
        }
    }

    final int getLabelOffsetY(int param0, int param1) {
        if (param1 != 6402) {
          field_K = true;
        }
        if (param0 >= 3) {
          return super.getLabelOffsetY(param0, 6402);
        }
        return 0;
    }

    private final void validateHighscoresGuard(int param0) {
        if (param0 != 2931) {
          field_N = false;
        }
    }

    HighscoresScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(ChatMessageLine.field_w, param0, param1, param2, param3, param4, param5);
    }

    final void onExit(byte param0) {
        DateInputWidget.field_V = null;
        if (param0 != -6) {
          field_J = (ScrollPaneWithFooter) null;
        }
    }

    final int getButtonLeft(int param0, int param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 != 0) {
          return 97;
        }
        regionExit1: {
          if (!NanoTickClock.isClientConnected(35)) {
            var3 = param1;
            if (var3 != 0 &&
              1 != var3) {
              switch (var3) {
                case 2:
                  return param1 * 140 + 120;
                case 3:
                  return 60;
                case 4:
                  return 170;
                default:
                  break regionExit1;
                case 5:
                  return 380;
              }
            }
            return param1 * 140 + 120;
          }
        }
        return param1 * 350 + 80;
    }

    final void handleNavigationKey(int param0) {
        if (NanoTickClock.isClientConnected(param0 + 37)) {
          super.handleNavigationKey(-34);
        } else {
          if (IterableDualLinkDeque.field_a == 96) {
            this.selection.a(this.selection.selectedIndex / 3 * 3 + (this.selection.selectedIndex + 2) % 3, (byte) 1);
          }
          if (IterableDualLinkDeque.field_a == 97) {
            this.selection.a(3 * (this.selection.selectedIndex / 3) + (this.selection.selectedIndex + 1) % 3, (byte) 1);
          }
          if (IterableDualLinkDeque.field_a == 99 ||
            IterableDualLinkDeque.field_a == 98) {
            this.selection.a((this.selection.selectedIndex + 3) % 6, (byte) 1);
          }
          this.selection.a(false);
        }
        if (param0 != -34) {
          field_I = -119;
        }
    }

    final static int a(float param0, int param1) {
        if (param1 != -4) {
          field_P = -95;
        }
        return ButtonPainter.floatToFixed(16, param0, (byte) 127);
    }

    final int getButtonHeight(byte param0, int param1) {
        if (param0 != 69) {
          HighscoresScreen.a(93, (byte) -1, 126);
        }
        if (!NanoTickClock.isClientConnected(param0 - 178) &&
          param1 < 3) {
          return 24;
        }
        return 36;
    }

    final static void a(byte param0, boolean param1, int param2, String param3) {
        if (param0 < 116) {
          return;
        }
        try {
          LabeledChildWidget.a(8, param3, param1 ? 13421772 : 16762114, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "em.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(int param0) {
        if (param0 != 36) {
          HighscoresScreen.a(4, (byte) -14, 28);
        }
        return 1900 + new Date().getYear();
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener(ReflectionReplySupport.field_a);
        if (param1 != -39) {
          return;
        }
        try {
          param0.removeFocusListener(ReflectionReplySupport.field_a);
          MessageDialog.field_xb = -1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "em.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Sprite createButtonLabel(String param0, int param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        Sprite stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_N = false;
          }
          if (!NanoTickClock.isClientConnected(36) &&
            3 > param3) {
            var6 = FreePlayRules.field_e.field_U[param1];
            var5 = var6;
            stackIn_5_0 = ScreenProjectionSupport.createTextLabelSprite((byte) 89, var6[var6.length >> 1], param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = super.createButtonLabel(param0, param1, 0, param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("em.PA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int getButtonRight(boolean param0, int param1) {
        if (!NanoTickClock.isClientConnected(72)) {
          if (param1 < 3) {
            return 120 + this.getButtonLeft(0, param1);
          }
          if (param1 == 3) {
            return this.getButtonLeft(0, param1) + 100;
          }
          return this.getButtonLeft(0, param1) + 200;
        }
        if (param0) {
          return -81;
        }
        if (param1 == 0) {
          return 340 + this.getButtonLeft(0, param1);
        }
        if (1 == param1) {
          return this.getButtonLeft(0, param1) + 130;
        }
        return this.getButtonLeft(0, param1) + 140;
    }

    final int getButtonTop(byte param0, int param1) {
        if (param0 != 6) {
          field_K = true;
        }
        if (!NanoTickClock.isClientConnected(-5)) {
          if (param1 < 3) {
            return 130;
          }
          return 390;
        }
        return 390;
    }

    final static void a(int param0, byte param1, int param2) {
        CipherPacketBuffer var3 = JaggrabDownloader.field_j;
        var3.writeCipheredOpcode(false, param2);
        if (param1 > -103) {
          HighscoresScreen.a(-22, (byte) -114, 4);
        }
        var3.writeByte(3, false);
        var3.writeByte(8, false);
        var3.writeShort((byte) -81, param0);
    }

    final void drawScreen(int param0) {
        super.drawScreen(105);
        if (NanoTickClock.isClientConnected(95)) {
          this.validateHighscoresGuard(2931);
        } else {
          this.drawHighscoreTable(-3);
        }
        if (param0 <= 36) {
          field_P = -120;
        }
        String var2 = !NanoTickClock.isClientConnected(66) ? MultiHandleSliderWidget.hsFriendTip : IntegerRecordProtocolSupport.createtouse;
        CollisionContact.field_h.drawCentered(var2, 320, 380, 15658734, -1);
    }

    final void handleMenuAction(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.itemIds[param2];
        if (var4 == 14) {
          if (this.selection.isPressActivated((byte) 84)) {
            MembershipBenefitsScreen.field_J = 0;
          }
        } else {
          if (var4 == 15) {
            if (this.selection.isPressActivated((byte) 59)) {
              MembershipBenefitsScreen.field_J = 1;
            }
          } else {
            if (var4 == 16) {
              if (this.selection.isPressActivated((byte) 91)) {
                MembershipBenefitsScreen.field_J = 2;
              }
            } else {
              if (52 == var4) {
                if (this.selection.isPressActivated((byte) 82)) {
                  DateInputWidget.field_V = null;
                  StrongCacheEntry.field_O = 0;
                }
              } else {
                if (53 == var4) {
                  if (this.selection.isPressActivated((byte) 62)) {
                    StrongCacheEntry.field_O = 1;
                    DateInputWidget.field_V = null;
                  }
                } else {
                  if (var4 != 23) {
                    super.handleMenuAction(-16470, param1, param2);
                  } else {
                    if (this.selection.isPressActivated((byte) 93)) {
                      TranslatedUiText.a(VertexProjectionSupport.pleaselogin, this.screenId, (byte) 83);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 != -16470) {
          tickerHintShotModeAim = (String) null;
        }
    }

    final static void a(String[] args, int param1, int param2, boolean param3, ResourceArchive param4, int param5, ResourceArchive param6, byte[] param7, int[] param8, ResourceArchive param9, String[][] param10, String[] param11, byte[] param12, IndexedSprite[] param13, String[] param14, Sprite[][] param15, String[][] param16, byte param17, Sprite[][] param18, int[] param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var20_int = 0;
        RuntimeException var20 = null;
        try {
          QuickChatPhraseDefinition.loadLobbyTheme(param4, false, param13, param8, param9);
          DualLinkDeque.initializeSocialListPanels(1, param9);
          DiskCacheWorker.a(param10, param14, args, param2, (byte) 60, param12, param18, param15, param1, param5, param11, param19, param16, param7, param9);
          CueStick.a(param3, false, param9, param6);
          FaceNormal.initializeRuleDescriptions(-74);
          var20_int = -118 % ((26 - param17) / 52);
          DelegatingCanvas.initializeLobbyChatPanels(-119);
          ReflectionCheck.c((byte) -22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("em.SA(");
          if (args == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param8 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param9 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param10 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param11 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param12 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param13 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param16 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param19 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final Sprite[] getButtonFrameSprites(int param0, int param1) {
        if (param1 != -34) {
          field_J = (ScrollPaneWithFooter) null;
        }
        return this.g(param0, 53) ? ModelOriginSupport.field_s : super.getButtonFrameSprites(param0, -34);
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 31 % ((param0 + 47) / 54);
        field_M = null;
        field_J = null;
        field_L = null;
        tickerHintShotModeAim = null;
    }

    static {
        field_I = 0;
        tickerHintShotModeAim = "To aim, drag <img=2> or <img=9><img=0>, or use <img=5>/<img=6>, or <img=13>/<img=15>.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c9c3307e6488(int param0, boolean param1, int param2, String param3) {
        if (param0 < 116) {
          return;
        }
        try {
          LabeledChildWidget.a(8, param3, param1 ? 13421772 : 16762114, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "em.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }
}
