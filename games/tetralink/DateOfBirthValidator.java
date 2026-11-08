/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthValidator extends DebouncedValidator implements TextInputListener, TextInputMarker {
    static boolean field_k;
    DateInputWidget field_m;
    static int field_n;
    static String field_l;

    final String computeMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_m.getYear((byte) 12);
          if (param0 != 0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var3 = this.field_m.getMonthIndex(false);
          var4 = this.field_m.getDay((byte) 94);
          var5 = LoginCredentialType.getCurrentYear(true);
          if (var4 >= 1890 &&
            var4 <= var5 - 3) {
            if (HotspotTextWidget.isValidDate(var4, (byte) -40, var2_int, var3)) {
              return null;
            }
          } else {
            stackIn_7_0 = SectorCacheStore.formatTemplate(new String[]{"1890", Integer.toString(-3 + var5)}, ConfirmPasswordTextGlobals.field_d, param0 + 122);
            return stackIn_7_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return ReflectionCheck.field_y;
    }

    public final void onTextEdited(byte param0, EditableTextWidget param1) {
        try {
          int var3_int = -10 / ((-18 - param0) / 63);
          this.restartDebounce(125);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "qh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean processOverlayInput(int param0, int param1, byte param2, int param3, int param4, boolean param5, int param6) {
        if (PacketFlushHelpers.hasBlockingPopup(3058)) {
          CachedTextLayout.updateOverlays(param5, param0, param2 + 28, param4);
          if (null != EmailAvailabilityValidator.field_s &&
            EmailAvailabilityValidator.field_s.processInput(param4, param1, param5, (byte) 53, param6)) {
            param5 = false;
            PasswordLoginCredentials.closePlayerContextMenu((byte) 43);
          }
          PieceDropAnimation.handleNameEntryPopupResult(param5, param4, (byte) 107);
          ChatLayoutHelpers.updateReportAbuseDialog(param5, -1, param3);
          param5 = false;
        }
        if (param2 == -30) {
          return param5;
        }
        return true;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -34) {
          field_k = false;
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static void openSocialEntryMenu(LobbyPlayerEntry param0, int param1, int param2, int param3, int param4, int param5, ScrollPane param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ScrollPane var12 = null;
        PlayerContextMenu var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          LobbyPlayerEntry.openPlayerContextMenu(param0.field_Rb, 255, param0.field_Yb, -1, param6, (int[]) null, param0.field_Nb, param0, -1);
          EmailAvailabilityValidator.field_s.addGameSetupMenuItems(19, true);
          EmailAvailabilityValidator.field_s.addSocialActions(0, (int[]) null, true);
          EmailAvailabilityValidator.field_s.addReportAbuseAction(true);
          var13 = EmailAvailabilityValidator.field_s;
          var8 = param1;
          var9 = param4;
          var10 = param5;
          var11 = param2;
          var13.field_j.openAt(var10, var9, -74, var11, var8);
          if (param3 < -48) {
            return;
          }
          var12 = (ScrollPane) null;
          DateOfBirthValidator.openSocialEntryMenu((LobbyPlayerEntry) null, 6, 79, 49, 30, -92, (ScrollPane) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final boolean isEmpty(int param0) {
        if (param0 != 13074) {
          return false;
        }
        return this.field_m.isDateIncomplete(-30886);
    }

    final static void playMusicTrack(boolean param0, byte param1, int param2, MusicTrack param3, int param4) {
        try {
          ProxyAuthenticationRequiredException.field_c.switchTrack(param3, param2, !param0 ? true : false, param4, 1000000, (byte) -128);
          int var5_int = 120 / ((param1 + 1) / 47);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "qh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void drawOverlays(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ValidationMessageWidget.field_bb.setBounds((byte) -85, param2, param6, param3, param0);
        if (param4 != 1000000) {
          ScrollPane var8 = (ScrollPane) null;
          DateOfBirthValidator.openSocialEntryMenu((LobbyPlayerEntry) null, -102, -101, -48, -5, -49, (ScrollPane) null);
          if (AlternateLongAndTextCredentials.field_o != null) {
            AlternateLongAndTextCredentials.field_o.layoutMenu(param5, param3, param5 - DebouncedValidator.field_e, param1, param3, 0);
            return;
          }
          return;
        }
        if (AlternateLongAndTextCredentials.field_o == null) {
          return;
        }
        AlternateLongAndTextCredentials.field_o.layoutMenu(param5, param3, param5 - DebouncedValidator.field_e, param1, param3, 0);
    }

    public final void onTextSubmitted(EditableTextWidget param0, byte param1) {
        try {
          if (param1 != 101) {
            this.field_m = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "qh.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ValidationState computeState(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_m.getYear((byte) 12);
          var3 = this.field_m.getMonthIndex(param0);
          var4 = this.field_m.getDay((byte) 66);
          var5 = LoginCredentialType.getCurrentYear(true);
          if (var4 < 1890) {
            stackIn_3_0 = QuickChatCommandType.field_h;
            return stackIn_3_0;
          }
          if (var4 > -3 + var5) {
            stackIn_7_0 = QuickChatCommandType.field_h;
            return stackIn_7_0;
          }
          if (!HotspotTextWidget.isValidDate(var4, (byte) -40, var2_int, var3)) {
            stackIn_10_0 = QuickChatCommandType.field_h;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return QuickChatCommandType.field_h;
        }
        return PlayerContextMenu.field_a;
    }

    public DateOfBirthValidator() {
    }

    static {
        field_l = "<%0> wants to join";
    }
}
