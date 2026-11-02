/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends DebouncedValidationProvider implements TextInputListener {
    private TextInputWidget validatedInput;
    static String unableToDeleteIgnore;
    static Sprite field_i;
    static so field_h;
    static qr field_j;

    public final void onTextInputChanged(TextInputWidget param0, int param1) {
        try {
          this.resetValidationDelay(11755);
          int var3_int = -31 % ((-43 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ig.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String currentValidationMessage(int param0) {
        int var2 = -69 % ((param0 + 30) / 45);
        return this.validationMessageForText(this.validatedInput.widgetText, 0);
    }

    public final boolean isInputEmpty(int param0) {
        if (param0 != -3) {
          TextInputWidget var3 = (TextInputWidget) null;
          this.onTextInputSubmitted((TextInputWidget) null, false);
          if (this.validatedInput.widgetText != null) {
            return this.validatedInput.widgetText.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.validatedInput.widgetText == null) {
          return true;
        }
        if (this.validatedInput.widgetText.length() != 0) {
          return false;
        }
        return true;
    }

    abstract na validationStateForText(String param0, boolean param1);

    public final void onTextInputSubmitted(TextInputWidget param0, boolean param1) {
        try {
          if (param1) {
            unableToDeleteIgnore = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ig.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TextInputValidator(TextInputWidget param0) {
        try {
          this.validatedInput = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String validationMessageForText(String param0, int param1);

    final static void a(Sprite param0, byte param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          if ((3 & (param0.field_z | param0.field_A | param0.field_G | param0.field_B)) == 0) {
            return;
          }
          if (param1 != -12) {
            return;
          }
          var2_int = (param0.field_G & 3) + param0.field_z;
          var2_int = 4 - (3 & var2_int) + var2_int;
          var3 = (param0.field_B & 3) + param0.field_A;
          var3 = -(var3 & 3) + 4 + var3;
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = var2_int * (3 & param0.field_B) + (3 & param0.field_G);
          for (var7 = 0; param0.field_A > var7; var7++) {
            for (var8 = 0; param0.field_z > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_D[incrementValue$1];
            }
            var6 = var6 + (var2_int - param0.field_z);
          }
          param0.field_G = param0.field_G & -4;
          param0.field_B = param0.field_B & -4;
          param0.field_D = var4;
          param0.field_z = var2_int;
          param0.field_A = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ig.DA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        unableToDeleteIgnore = null;
        field_j = null;
        if (param0 < 85) {
          return;
        }
        field_h = null;
    }

    final na currentValidationState(int param0) {
        if (param0 == -14836) {
          return this.validationStateForText(this.validatedInput.widgetText, true);
        }
        TextInputWidget var3 = (TextInputWidget) null;
        this.onTextInputChanged((TextInputWidget) null, 41);
        return this.validationStateForText(this.validatedInput.widgetText, true);
    }

    static {
        unableToDeleteIgnore = "Unable to delete name - system busy";
    }
}
