/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    private boolean accepted;
    static ClientUiComponent field_n;
    private String checkedName;
    static int[] field_o;
    static ClientUiComponent field_l;
    static int field_j;

    final ValidationState validateText(int obfuscationGuard, String text) {
        AccountRequestResult result = null;
        RuntimeException failure = null;
        CharSequence candidateName = null;
        ValidationState invalidSyntaxState = null;
        ValidationState checkingState = null;
        ValidationState cachedResultState = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        try {
          candidateName = (CharSequence) ((Object) text);
          if (!vq.a(candidateName, true)) {
            invalidSyntaxState = rn.validationInvalid;
            return invalidSyntaxState;
          }
          if (obfuscationGuard != -3137) {
            field_o = (int[]) null;
          }
          if (!text.equals(this.checkedName)) {
            result = ji.pollAccountNameCheck(0, text);
            if (result != null &&
              null == result.errorText) {
              this.checkedName = text;
              this.accepted = result.accepted;
            } else {
              checkingState = so.validationChecking;
              return checkingState;
            }
          }
          if (this.accepted) {
            cachedResultState = oo.validationValid;
          } else {
            cachedResultState = rn.validationInvalid;
          }
          return cachedResultState;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("uj.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(')').toString());
        }
    }

    final String describeText(byte obfuscationGuard, String text) {
        String syntaxMessage = null;
        RuntimeException failure = null;
        AccountRequestResult result = null;
        CharSequence candidateName = null;
        String syntaxDiagnostic = null;
        String rejectedDiagnostic = null;
        String acceptedDiagnostic = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          candidateName = (CharSequence) ((Object) text);
          syntaxMessage = SummonRequest.a(candidateName, false);
          if (syntaxMessage != null) {
            syntaxDiagnostic = syntaxMessage;
            return syntaxDiagnostic;
          }
          if (!text.equals(this.checkedName)) {
            result = ji.pollAccountNameCheck(0, text);
            if (result == null) {
              return null;
            }
            if (result.errorText != null) {
              return null;
            }
            this.accepted = result.accepted;
            this.checkedName = text;
          }
          if (!this.accepted) {
            rejectedDiagnostic = AccountNamePrompt.field_Ob;
            return rejectedDiagnostic;
          }
          if (obfuscationGuard < 89) {
            this.invalidateNameCheck(5);
          }
          acceptedDiagnostic = fa.field_d;
          return acceptedDiagnostic;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_20_0 = failure;
          stackIn_20_1 = new StringBuilder().append("uj.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_n = null;
        field_o = null;
        field_l = null;
        if (param0 != 29151) {
          field_j = -105;
        }
    }

    final void invalidateNameCheck(int obfuscationGuard) {
        if (obfuscationGuard != 50) {
          this.accepted = false;
          this.checkedName = null;
          return;
        }
        this.checkedName = null;
    }

    final static QuickChatCommandDefinition[] getQuickChatCommands(byte obfuscationGuard) {
        if (obfuscationGuard > 100) {
          return new QuickChatCommandDefinition[]{jk.field_b, AccountNameSelectionForm.field_G, ToggleTurnSkipConsoleCommand.field_F, PacketBuffer.field_l, NodeHashIterator.field_i, MovementPlanner.field_c, ab.field_d, lg.field_e, du.field_e, Widget.field_y, MapLayout.field_q, IconTextComponent.field_Ib, rs.field_v, kq.field_M};
        }
        AccountNameAvailabilityValidator.h(67);
        return new QuickChatCommandDefinition[]{jk.field_b, AccountNameSelectionForm.field_G, ToggleTurnSkipConsoleCommand.field_F, PacketBuffer.field_l, NodeHashIterator.field_i, MovementPlanner.field_c, ab.field_d, lg.field_e, du.field_e, Widget.field_y, MapLayout.field_q, IconTextComponent.field_Ib, rs.field_v, kq.field_M};
    }

    AccountNameAvailabilityValidator(EditableTextWidget input) {
        super(input);
        this.accepted = false;
    }

    static {
        field_j = 3;
        field_o = new int[]{53, 52, 49, 50, 51};
    }
}
