/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayHelpers {
    static String textEndgameEntrapment;
    static String tutorial1;
    static SpriteWidget field_e;
    static ModelMesh field_a;
    static AudioSetupHelpers field_c;
    static String field_d;

    final static boolean isValidNameText(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -10 / ((param0 + 24) / 60);
          stackIn_1_0 = FullscreenFocusCanvas.isValidNameText(-4623, false, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ee.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void advanceIntroClock(boolean param0) {
        if (DualLinkHashTable.field_e == 0 - LobbyControlHelpers.field_a) {
          DualLinkHashTable.field_e = DualLinkHashTable.field_e + 1;
          if (param0) {
            return;
          }
          field_a = (ModelMesh) null;
          return;
        }
        if (-LobbyControlHelpers.field_a + 250 == DualLinkHashTable.field_e) {
          DualLinkHashTable.field_e = DualLinkHashTable.field_e + 1;
          if (param0) {
            return;
          }
          field_a = (ModelMesh) null;
          return;
        }
        DualLinkHashTable.field_e = DualLinkHashTable.field_e + 1;
        if (param0) {
          return;
        }
        field_a = (ModelMesh) null;
    }

    final static void pollStoredFlagsRequest(boolean param0) {
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_52_0 = false;
        boolean stackIn_58_0 = false;
        if (TextMeasureHelpers.field_b) {
          return;
        }
        if (AudioSetupHelpers.field_e != null) {
          if (!AudioSetupHelpers.field_e.field_l) {
            if (!param0) {
              if (TextMeasureHelpers.field_b) {
                stackIn_52_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_52_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            } else {
              field_c = (AudioSetupHelpers) null;
              if (TextMeasureHelpers.field_b) {
                stackIn_58_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_58_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            }
          } else {
            SocketConnector.field_c = SocketConnector.field_c | AudioSetupHelpers.field_e.field_g;
            TextMeasureHelpers.field_b = true;
            AudioSetupHelpers.field_e = null;
            if (!param0) {
              if (TextMeasureHelpers.field_b) {
                stackIn_38_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_38_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            } else {
              field_c = (AudioSetupHelpers) null;
              if (TextMeasureHelpers.field_b) {
                stackIn_44_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_44_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            }
          }
        } else {
          AudioSetupHelpers.field_e = CellAnimator.createPendingRequest((byte) 106, 4);
          if (!AudioSetupHelpers.field_e.field_l) {
            if (!param0) {
              if (TextMeasureHelpers.field_b) {
                stackIn_9_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_9_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            } else {
              field_c = (AudioSetupHelpers) null;
              if (TextMeasureHelpers.field_b) {
                stackIn_15_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_15_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            }
          } else {
            SocketConnector.field_c = SocketConnector.field_c | AudioSetupHelpers.field_e.field_g;
            TextMeasureHelpers.field_b = true;
            AudioSetupHelpers.field_e = null;
            if (!param0) {
              if (TextMeasureHelpers.field_b) {
                stackIn_29_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_29_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            } else {
              field_c = (AudioSetupHelpers) null;
              if (TextMeasureHelpers.field_b) {
                stackIn_23_0 = ((1 & SocketConnector.field_c) == 0);
                RegistrationRequestDialog.field_Db = stackIn_23_0;
                AccountDialogHelpers.closeAccountDialogs(18887);
                MidiNote.registerScreens((byte) 96);
              }
            }
          }
        }
    }

    final static void showGuestPlayConfirmation(byte param0) {
        if (param0 < 15) {
          return;
        }
        UiWidget.field_t.transitionToContent(new AccountChoicePanel(), (byte) -53);
    }

    public static void releaseStatics(byte param0) {
        tutorial1 = null;
        field_c = null;
        field_d = null;
        field_a = null;
        textEndgameEntrapment = null;
        if (param0 <= 53) {
          return;
        }
        field_e = null;
    }

    static {
        textEndgameEntrapment = "<%0> cannot move";
        tutorial1 = "These are your pieces<br>Click to select one";
        field_d = "Loading sound effects";
        field_c = new AudioSetupHelpers();
    }
}
