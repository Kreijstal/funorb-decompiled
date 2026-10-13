/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextFieldValidator {
    static AccountRequestResult accountNameCheckResult;
    static int field_j;
    static String field_o;
    static CipherPacketBuffer outgoingPacket;
    static String field_l;
    static String currentLocationLabel;
    static String[] battleHintMessages;

    final static String a(ResourceArchive param0, int param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param0.ensureIndex((byte) 82)) {
            stackIn_6_0 = (String) (param4);
            return stackIn_6_0;
          }
          stackIn_8_0 = param2 + " - " + param0.getGroupProgressByName(param3, (byte) 87) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("vl.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final ValidationState validateText(int obfuscationGuard, String text) {
        int syntaxValid = 0;
        RuntimeException failure = null;
        int syntaxResult = 0;
        ValidationState invalidState = null;
        ValidationState validState = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -3137) {
            field_l = (String) null;
          }
          syntaxResult = (null != gt.b(text, (byte) -24)) ? 0 : 1;
          syntaxValid = syntaxResult;
          if (syntaxValid != 0) {
            validState = oo.validationValid;
            return validState;
          }
          invalidState = rn.validationInvalid;
          return invalidState;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_12_0 = failure;
          stackIn_12_1 = new StringBuilder().append("vl.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        outgoingPacket = null;
        battleHintMessages = null;
        currentLocationLabel = null;
        field_o = null;
        field_l = null;
        accountNameCheckResult = null;
    }

    EmailValidator(EditableTextWidget input) {
        super(input);
    }

    final static void c(byte param0) {
        if (param0 == 91) {
          ProgressMessageDialog.field_vb = c.field_d + " <b>" + DualNodeDeque.field_e + "</b> " + od.field_e + " <b>" + WeightedScoreStrategy.field_m + "</b> " + TextLineLayout.field_f + "<br>" + "<br>" + FullscreenDisplayMode.field_d;
          return;
        }
    }

    final String describeText(byte obfuscationGuard, String text) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 89) {
            EmailValidator.c((byte) -118);
          }
          if (this.validateText(-3137, text) != rn.validationInvalid) {
            stackIn_6_0 = CampaignRewardPreview.field_a;
            return stackIn_6_0;
          }
          stackIn_4_0 = ArmiesOfGielinor.field_H;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vl.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_o = "Show all lobby chat";
        field_l = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4> (<%5>-<%6>)</col>  Cost:<nbsp><col=ff0000><%7></col>";
    }
}
