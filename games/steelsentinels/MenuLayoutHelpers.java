/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuLayoutHelpers {
    static int field_a;
    static QuickChatParameterType field_b;
    static int field_d;
    static String field_c;

    final static int getPopupMenuWidth(int param0) {
        int var1 = 124 % ((param0 - 17) / 56);
        return PatchNoteUsage.field_r - MusicPatchPcmStream.field_D;
    }

    final static void drawTitleBar(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -16088) {
          MenuLayoutHelpers.getPopupMenuWidth(11);
        }
        param3--;
        param2++;
        SoftwareRaster.setClip(param4, param3, param4 + param1, param3 + param2);
        MidiPcmStream.field_db.drawOpaque(param4, param3 - 17);
        SoftwareRaster.resetClip();
        SoftwareRaster.drawHorizontalLineAlpha(param4, param3, param1, 0, 128);
        SoftwareRaster.drawHorizontalLineAlpha(param4, param3 + 1, param1, 0, 96);
        SoftwareRaster.drawHorizontalLineAlpha(param4, param3 + 2, param1, 0, 64);
        SoftwareRaster.drawHorizontalLineAlpha(param4, param3 + 3, param1, 0, 32);
    }

    final static void applyMenuSelection(int param0, boolean param1, boolean param2) {
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var4Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          OptionMaskHelpers.field_g = 10;
          IconTextComponent.field_Yb = 0;
          var3_int = -13 % ((param0 + 87) / 35);
          if (DirectByteStorage.field_j != 0) {
            var4 = 0;
            var5 = (DirectByteStorage.field_j - 1) * 10;
            for (var6 = 0; var6 < QuickChatParameterType.field_f[DirectByteStorage.field_j]; var6++) {
              if (~QuickChatHelpDialog.field_Ub != ~var6) {
                var4 = var4 + TrigonometryHelpers.field_a[var6 + var5];
              }
            }
            LabeledField.field_V = var4;
          } else {
            var4 = QuickChatHelpDialog.field_Ub;
            if (var4 == 0) {
              OptionMaskHelpers.field_g = 0;
            } else {
              if (var4 != 1) {
                if (3 != var4) {
                  if (var4 != 5) {
                    if (var4 != 7) {
                      if (9 == var4) {
                        OptionMaskHelpers.field_g = 9;
                      }
                    } else {
                      OptionMaskHelpers.field_g = 7;
                    }
                  } else {
                    OptionMaskHelpers.field_g = 5;
                  }
                } else {
                  OptionMaskHelpers.field_g = 3;
                }
              } else {
                OptionMaskHelpers.field_g = 1;
              }
            }
          }
          if (param2) {
            if (!ChatPanelHelpers.areBaseAssetsLoaded(-78)) {
              ClientGlobals.field_a = InterfaceTextHelpers.field_e;
            } else {
              var4Lifetime1 = param1 ? 1 : 0;
              IterableNodeHashTable.switchScreen(-3, var4Lifetime1 != 0, -1, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var3), "sh.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static LoginMethod[] getLoginMethods(int param0) {
        if (param0 > -9) {
          field_c = (String) null;
        }
        return new LoginMethod[]{PartInstruction.field_o, TabbedPanel.field_Vb, DraggableWidget.field_Y};
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3274) {
          MenuLayoutHelpers.getPopupMenuWidth(63);
        }
    }

    static {
        field_b = new QuickChatParameterType(14, 0, 4, 1);
        field_c = "Orb points: ";
    }
}
