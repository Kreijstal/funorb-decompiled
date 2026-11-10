/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NoticeMenuHelpers {
    static int field_c;
    static String field_a;
    static int field_b;

    final static MenuScreen lookupMenuScreen(int param0, int param1) {
        if (param0 != 2) {
          field_c = 127;
        }
        return ScrollBar.field_Hb[param1];
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 38) {
          return;
        }
        field_a = null;
    }

    final static void closeChatContext(byte param0) {
        DualLinkNodeHashTable.closeChatContextState((byte) 87);
        if (param0 != 16) {
          NoticeMenuHelpers.releaseStatics(-7);
        }
    }

    final static void showNoticeMenu(boolean param0, int param1, String param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        boolean stackIn_26_0 = false;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          LevelUpgradeHelpers.field_a = true;
          LoginCredentials.field_d = param3;
          var11 = param2;
          if (param4) {
            stackIn_4_0 = PowerupEvent.field_n;
          } else {
            stackIn_4_0 = ObjectFactoryHelpers.field_b;
          }
          var6 = stackIn_4_0;
          if (LoginCredentials.field_d == 0) {
            var7 = MusicVoice.wrapBalancedText(SecondaryNodeDeque.field_c, false, var11, ClickMarker.field_t, 480);
            var8 = 3 + var7;
            PackedArrayHelpers.field_a = new int[var8];
            KeyboardListenerHelpers.field_e = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              PackedArrayHelpers.field_a[var9] = -1;
            }
            ThreeSliceButtonPainter.field_x = new int[2];
            for (var9 = 0; var7 > var9; var9++) {
              KeyboardListenerHelpers.field_e[var9] = ClickMarker.field_t[var9];
            }
            KeyboardListenerHelpers.field_e[-3 + var8] = "";
            KeyboardListenerHelpers.field_e[-2 + var8] = var6;
            PackedArrayHelpers.field_a[-2 + var8] = 0;
            ThreeSliceButtonPainter.field_x[0] = 1;
            KeyboardListenerHelpers.field_e[var8 - 1] = LoginCredentials.field_f;
            PackedArrayHelpers.field_a[-1 + var8] = 1;
            ThreeSliceButtonPainter.field_x[1] = 2;
          } else {
            if (1 != LoginCredentials.field_d) {
              throw new IllegalArgumentException();
            }
            var7 = MusicVoice.wrapBalancedText(SecondaryNodeDeque.field_c, false, var11, ClickMarker.field_t, 480);
            var8 = var7 + 2;
            PackedArrayHelpers.field_a = new int[var8];
            KeyboardListenerHelpers.field_e = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              PackedArrayHelpers.field_a[var9] = -1;
            }
            ThreeSliceButtonPainter.field_x = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              KeyboardListenerHelpers.field_e[var9] = ClickMarker.field_t[var9];
            }
            KeyboardListenerHelpers.field_e[var8 - 2] = "";
            KeyboardListenerHelpers.field_e[-1 + var8] = LoginCredentials.field_f;
            PackedArrayHelpers.field_a[var8 - 1] = 0;
            ThreeSliceButtonPainter.field_x[0] = 2;
          }
          AlignedIconLabel.field_Jb.field_c = ThreeSliceButtonPainter.field_x.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < KeyboardListenerHelpers.field_e.length; var8Lifetime1++) {
            stackIn_26_0 = !(PackedArrayHelpers.field_a[var8Lifetime1] < 0);
            var9Lifetime1 = ColourPickerWidget.measureText(stackIn_26_0, -36, KeyboardListenerHelpers.field_e[var8Lifetime1]);
            if (-1 != PackedArrayHelpers.field_a[var8Lifetime1]) {
              var9Lifetime1 = var9Lifetime1 + GameCharacter.field_db * 2;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          ArrayWidgetGroup.field_F = AlignedIconLabel.field_Jb.field_c * (MessageDialog.field_tb + EffectAudioHelpers.field_b << 1);
          RandomAccessCacheFile.field_e = NetworkGameClient.field_x - (-var7Lifetime1 + (var7Lifetime1 >> 1));
          IntrusiveDequeCursor.field_i = -(var7Lifetime1 >> 1) + NetworkGameClient.field_x;
          var8Lifetime2 = 0;
          while (var8Lifetime2 < KeyboardListenerHelpers.field_e.length) {
            stackIn_38_0 = ArrayWidgetGroup.field_F;
            stackIn_38_1 = PackedArrayHelpers.field_a[var8Lifetime2];
            if (stackIn_38_1 < 0) {
              stackIn_41_1 = ImageProducerRasterBuffer.field_l;
            } else {
              stackIn_41_1 = MusicPatch.field_n;
            }
            ArrayWidgetGroup.field_F = stackIn_38_0 + stackIn_41_1;
            var8Lifetime2++;
          }
          if (param1 != 2) {
            NoticeMenuHelpers.closeChatContext((byte) -33);
          }
          PopupMenuBuilder.field_M = -(ArrayWidgetGroup.field_F >> 1) + TextInputWidget.field_Q;
          AlignedIconLabel.field_Jb.initializeSelection(0, param0, -31458, EffectResistedEvent.findMenuOptionAt(LoginMethod.field_d, false, MouseInputHandler.field_g));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_48_0 = var5;
          stackIn_48_1 = new StringBuilder().append("gk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "Cancel";
    }
}
