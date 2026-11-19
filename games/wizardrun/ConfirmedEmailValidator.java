/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ConfirmedEmailValidator extends TextFieldValidator {
    private static int[] field_l;
    static int field_o;
    private MatchingTextValidator matchingValidator;
    private boolean emailAvailable;
    private String checkedEmail;

    final static void f(int param0) {
        if (param0 != 92682) {
          field_l = (int[]) null;
        }
        SecondaryNodeDeque.beginLogin((byte) -52, UiSpriteThemeHelpers.field_a, EmailCheckRequest.field_a, true);
        IntegerSyntaxHelpers.field_a = true;
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 != 2098078177) {
          field_l = (int[]) null;
        }
    }

    final static boolean ensureAccountResponseBytes(int param0, int param1) {
        try {
          if (!(AccountCreationForm.field_N.position < param0)) {
            return true;
          }
          if (OpacityWidget.field_H == null) {
            return false;
          }
          int var2_int = OpacityWidget.field_H.available((byte) 89);
          if (param1 != -28266) {
            ConfirmedEmailValidator.f(-28);
          }
          if (var2_int > 0) {
            if (-AccountCreationForm.field_N.position + param0 < var2_int) {
              var2_int = -AccountCreationForm.field_N.position + param0;
            }
            OpacityWidget.field_H.readFully(AccountCreationForm.field_N.payload, 114, var2_int, AccountCreationForm.field_N.position);
            PlatformActor.field_C = MonotonicClockHelpers.monotonicMillis((byte) 29);
            AccountCreationForm.field_N.position = AccountCreationForm.field_N.position + var2_int;
            if (param0 > AccountCreationForm.field_N.position) {
              return false;
            }
            AccountCreationForm.field_N.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              30000L >= MarkerSliderPainter.getAccountConnectionAge(2)) {
              return false;
            }
            HuffmanDecoder.closeAccountConnection(-114);
          } catch (IOException iOException) {
            HuffmanDecoder.closeAccountConnection(param1 ^ 28227);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String getTextValidationMessage(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingValidator.validateText(param1, param0) == DisplayNameSyntaxHelpers.field_c) {
            stackIn_2_0 = this.matchingValidator.getTextValidationMessage(param0, -1);
            return stackIn_2_0;
          }
          if (this.validateText(-1, param0) != DisplayNameSyntaxHelpers.field_c) {
            stackIn_7_0 = MarkerSliderPainter.field_h;
            return stackIn_7_0;
          }
          stackIn_5_0 = IntrusiveNode.field_d;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void refreshPlayerProgress(boolean param0) {
        if (!param0) {
          field_o = 35;
        }
        if (!HighscorePlayerState.field_e) {
          if (null == ValidationState.field_c) {
            ValidationState.field_c = ProgressSubmission.requestAchievementState((byte) 103, 4);
          }
          if (ValidationState.field_c.complete) {
            AgeValidator.field_l = AgeValidator.field_l & ~ValidationState.field_c.firstStateWord;
            IsaacRandom.field_a = IsaacRandom.field_a | ValidationState.field_c.firstStateWord;
            ValidationState.field_c = null;
            HighscorePlayerState.field_e = true;
          }
        }
        if (!ThreePieceFrameHelpers.field_a) {
          if (null == ProgressRefreshState.field_a) {
            ProgressRefreshState.field_a = HotspotTextWidget.requestProgress(5, 1, 2, 0);
          }
          if (ProgressRefreshState.field_a.complete) {
            if (ProgressRefreshState.field_a.values[0] > TextButton.field_A) {
              TextButton.field_A = ProgressRefreshState.field_a.values[0];
            }
            ThreePieceFrameHelpers.field_a = true;
            ProgressRefreshState.field_a = null;
          }
        }
        if (HighscorePlayerState.field_e &&
          ThreePieceFrameHelpers.field_a) {
          WrappedTextLayout.a((byte) 79);
        }
    }

    final static void submitAchievement(AchievementSubmission param0, boolean param1, int param2) {
        try {
          EmailCheckRequest.field_j.addLast(param0, param1);
          AchievementSubmission.writeAchievementSubmission(param2, true, param0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "hc.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ConfirmedEmailValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.emailAvailable = false;
        this.checkedEmail = "";
        try {
          this.matchingValidator = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ValidationState validateText(int param0, String param1) {
        EmailCheckRequest var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingValidator.validateText(param0, param1) == DisplayNameSyntaxHelpers.field_c) {
            stackIn_3_0 = DisplayNameSyntaxHelpers.field_c;
            return stackIn_3_0;
          }
          if (!param1.equals(this.checkedEmail)) {
            var3 = ArchiveCatalog.getEmailCheck(param1, 6);
            if (!var3.isComplete(true)) {
              stackIn_7_0 = ValidationHelpWidget.field_S;
              return stackIn_7_0;
            }
            this.checkedEmail = param1;
            this.emailAvailable = var3.isAvailable(25843);
          }
          if (!this.emailAvailable) {
            stackIn_12_0 = DisplayNameSyntaxHelpers.field_c;
          } else {
            stackIn_12_0 = ContentTransitionDialog.field_V;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_o = 200;
        field_l = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)((var0 << 1) - 1);
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          if (var3 >= field_l.length) {
            var3 = -1 + field_l.length;
          }
          for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
            field_l[var1] = var0;
          }
        }
    }
}
