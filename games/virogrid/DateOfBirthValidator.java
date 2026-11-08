/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DateOfBirthValidator extends DebouncedValidator implements TextInputListener, PanelMarker {
    static String field_i;
    static MenuScreen[] field_j;
    static String field_g;
    DateInputWidget field_h;

    public final boolean isEmpty(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_h.isDateIncomplete(54);
    }

    final static boolean isAllSameCharacter(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        String[] var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (~param0.charAt(var3) != ~var2_int) {
              return false;
            }
          }
          if (param1 < 123) {
            var5 = (String[]) null;
            DateOfBirthValidator.handleAccountRequestResult((String) null, -75, (String[]) null, -81);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("al.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void handleAccountRequestResult(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          MouseWheelInput.field_c = ClientException.field_d;
          if (param3 != 100) {
            var6 = (String) null;
            DateOfBirthValidator.setLoadingProgress((String) null, -66, 0.017817853018641472f);
          }
          if (param1 != 255) {
            if (param1 >= 100 &&
              105 >= param1) {
              var4 = param2;
              StatefulWidgetPainter.showReplyMessageLines(-22063, var4);
              LoginDialog.field_ob = IntKeyLookup.createStringArrayMessage(param2, 7655);
              return;
            }
            LoginDialog.field_ob = TypeCode.createSuggestedUsernameQuery(param1, param0, param3 ^ 29521);
          } else {
            stackIn_6_0 = -32;
            stackIn_7_1 = !(13 <= TextDecodeHelpers.field_d);
            LoginDialog.field_ob = Virogrid.createDobResultReply(stackIn_6_0, stackIn_7_1);
            var7 = (String[]) null;
            StatefulWidgetPainter.showReplyMessageLines(-22063, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("al.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final AudioSetupHelpers computeState(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        AudioSetupHelpers stackIn_2_0 = null;
        AudioSetupHelpers stackIn_5_0 = null;
        AudioSetupHelpers stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        NumberFormatException var2 = null;
        try {
          var2_int = this.field_h.getDay(-2);
          var3 = this.field_h.getMonthIndex(param0 ^ 843083348);
          var4 = this.field_h.getYear(true);
          var5 = PendingHighscoreRequest.getCurrentYear(false);
          if (var4 < 1890) {
            stackIn_2_0 = GuestPlayHelpers.field_c;
            return stackIn_2_0;
          }
          if (-3 + var5 < var4) {
            stackIn_5_0 = GuestPlayHelpers.field_c;
            return stackIn_5_0;
          }
          if (!QuickChatPhraseDefinition.isValidDate((byte) 127, var4, var2_int, var3)) {
            stackIn_9_0 = GuestPlayHelpers.field_c;
            return stackIn_9_0;
          }
          if (param0 != -843083384) {
            field_i = (String) null;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return GuestPlayHelpers.field_c;
        }
        return CachedTextLayout.field_i;
    }

    final static void orderFacesByGroup(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var6 = 22 % ((54 - param4) / 42);
          var5_int = 0;
          while (true) {
            if (var5_int >= QueuedResultSubmission.field_g.length) {
              return;
            }
            param2 = QueuedResultSubmission.field_g[var5_int];
            var7 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var7;
              var7++;
              param3 = ReflectionCheck.field_m[incrementValue$1];
              dupTemp$2 = param0[param3];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              ReflectionCheck.field_m[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("al.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void flushPackets(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != QuickChatMenu.field_Ub && (0 > param1 ||
            ClientServiceHelpers.field_c == DigestHelpers.field_a)) {
            if (IterableNodeHashTable.field_g.position == 0 &&
              (ViewModeNoticeGlobals.field_a + 10000L) < ClockAndTextHelpers.monotonicMillis(-9986)) {
              IterableNodeHashTable.field_g.writeCipheredOpcode(param1, 8);
            }
            if (param0 != -1) {
              field_i = (String) null;
            }
            if (0 < IterableNodeHashTable.field_g.position) {
              try {
                QuickChatMenu.field_Ub.write(IterableNodeHashTable.field_g.payload, param0 + 1, 0, IterableNodeHashTable.field_g.position);
                ViewModeNoticeGlobals.field_a = ClockAndTextHelpers.monotonicMillis(-9986);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                MenuInputState.closeGameConnection(false);
              }
              IterableNodeHashTable.field_g.position = 0;
            }
            return;
          }
          IterableNodeHashTable.field_g.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void shutdownAudioPlayers(int param0) {
        if (CheckboxTickPainter.field_g != null) {
          CheckboxTickPainter.field_g.shutdown();
        }
        if (ChatPanelUpdateHelpers.field_c != null) {
          ChatPanelUpdateHelpers.field_c.shutdown();
        }
        if (param0 != 100) {
          DateOfBirthValidator.flushPackets(89, -96);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          DateOfBirthValidator.shutdownAudioPlayers(-50);
        }
        field_i = null;
        field_j = null;
        field_g = null;
    }

    final static boolean isPublicChatInputOpen(int param0) {
        if (param0 < 25) {
          DateOfBirthValidator.releaseStatics(78);
        }
        if (!ArchiveLoadSequence.field_h) {
          return false;
        }
        if (ChatFilterHelpers.field_e == 0) {
          return true;
        }
        return false;
    }

    public final void onTextSubmitted(boolean param0, EditableTextWidget param1) {
        try {
          if (param0) {
            this.field_h = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "al.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String computeMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_h.getDay(-2);
          var3 = this.field_h.getMonthIndex(-39);
          var4 = this.field_h.getYear(true);
          var5 = PendingHighscoreRequest.getCurrentYear(false);
          if (var4 >= 1890 &&
            var4 <= -3 + var5) {
            if (QuickChatPhraseDefinition.isValidDate((byte) -41, var4, var2_int, var3)) {
              return null;
            }
          } else {
            stackIn_4_0 = MenuScreen.formatIndexedText(new String[]{"1890", Integer.toString(var5 - 3)}, LongAndTextLoginPayload.field_p, 2);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        if (param0 >= -86) {
          field_g = (String) null;
        }
        return ArrayWidgetContainer.field_C;
    }

    final static void setLoadingProgress(String param0, int param1, float param2) {
        try {
          StatusAndUrlHelpers.field_g = param0;
          NodeHashTableIterator.field_i = param2;
          if (param1 != 13) {
            DateOfBirthValidator.releaseStatics(-11);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "al.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        try {
          this.restartDebounce(false);
          if (param1 != 13) {
            this.field_h = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "al.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public DateOfBirthValidator() {
    }

    static {
        field_j = new MenuScreen[12];
        field_i = "Private";
        field_g = "Open in popup window";
    }
}
