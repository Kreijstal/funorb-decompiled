/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends TextInputValidator {
    static boolean field_k;
    static String field_j;
    static boolean field_i;

    final static void h(int param0) {
        sj.a(k.c(108), (byte) 110);
        if (param0 >= -24) {
            field_k = true;
        }
    }

    final lh validationStateForText(int guard, String candidateText) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        lh stackIn_4_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -257) {
            field_k = false;
          }
          var4 = (CharSequence) ((Object) candidateText);
          if (!MessageDialog.isSignedDecimalInt((byte) -123, var4)) {
            stackIn_4_0 = si.field_m;
            return stackIn_4_0;
          }
          var5 = (CharSequence) ((Object) candidateText);
          var3_int = ol.a(false, var5);
          if ((var3_int > 0) &&
              (130 >= var3_int)) {
            stackIn_11_0 = SocketArchiveNetworkClient.field_w;
            return stackIn_11_0;
          }
          stackIn_9_0 = si.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var3);
          stackIn_14_1 = new StringBuilder().append("cf.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -11) {
            field_j = (String) null;
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validationStateForText(-257, candidateText) == si.field_m) {
            stackIn_2_0 = sl.createInvalidAgeAlertText;
            return stackIn_2_0;
          }
          if (guard == 422) {
            return null;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);
          stackIn_10_1 = new StringBuilder().append("cf.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static qi a(int param0, int param1) {
        qi var2 = new qi();
        k.field_e.addLast(-49, var2);
        int var3 = -104 / ((-51 - param1) / 44);
        re.b(-78, param0);
        return var2;
    }

    final static void advanceScorePopups(byte methodGuard) {
        ScorePopup popup = null;
        int controlFlowGuard = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard < 8) {
            cf.c((byte) 121);
          }
          popup = (ScorePopup) ((Object) md.activeScorePopups.firstForIteration(0));
          while (popup != null) {
            if (!(popup.progress >= 1.0f)) {
              popup.progress = popup.progress + (0.03999999910593033f * popup.progress + 0.00004999999873689376f);
            } else {
              if (popup.chainMultiplier != 1) {
                UiWidget.gameplaySession.addPopupPoints(popup.points, -73);
                ue.availableScorePopups.addLast(-35, popup);
              } else {
                UiWidget.gameplaySession.addScore((byte) 127, popup.points);
                ue.availableScorePopups.addLast(-35, popup);
              }
            }
            popup = (ScorePopup) ((Object) md.activeScorePopups.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1_ref), "cf.F(" + methodGuard + ')');
        }
    }

    final static boolean c(byte param0) {
        int var2 = 0;
        eg var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        eg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != -114) {
            return true;
          }
          var4 = (eg) ((Object) sl.field_k.firstForIteration(0));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_f > var2; var2++) {
            if ((null != var4.field_n[var2]) &&
                (var4.field_n[var2].status == 0)) {
              return false;
            }
            if ((var4.field_i[var2] != null) &&
                (var4.field_i[var2].status == 0)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1_ref), "cf.C(" + param0 + ')');
        }
    }

    cf(dj param0) {
        super(param0);
    }

    static {
        field_j = "Restart tutorial";
    }
}
