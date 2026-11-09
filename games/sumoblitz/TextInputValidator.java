/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends DebouncedInputValidator implements TextInputListener {
    static jj field_c;
    private TextInputWidget input;

    abstract ValidationStatus validateText(byte guard, String text);

    public final void onTextSubmitted(TextInputWidget source, int guard) {
        try {
          if (guard >= -41) {
            this.input = (TextInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.H(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public final boolean isEmpty(int guard) {
        if (guard != -8003) {
          return true;
        }
        if (null == this.input.text) {
          return true;
        }
        if (0 != this.input.text.length()) {
          return false;
        }
        return true;
    }

    final String evaluateMessage(int guard) {
        if (guard > -93) {
          return (String) null;
        }
        return this.messageForText(0, this.input.text);
    }

    public final void onTextChanged(TextInputWidget source, byte guard) {
        try {
          this.markChanged((byte) -101);
          if (guard > -127) {
            ResourceArchive var4 = (ResourceArchive) null;
            TextInputValidator.a(-98, -50, (ResourceArchive) null, -100);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.I(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static Sprite a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Sprite stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param0, param3, param1 ^ 30429)) {
            return null;
          }
          if (param1 == -11481) {
            stackIn_7_0 = InstrumentNoteMask.c((byte) -8);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("na.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final ValidationStatus evaluateStatus(byte guard) {
        if (guard == 114) {
          return this.validateText((byte) 26, this.input.text);
        }
        field_c = (jj) null;
        return this.validateText((byte) 26, this.input.text);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    abstract String messageForText(int guard, String text);

    TextInputValidator(TextInputWidget field) {
        try {
          this.input = field;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.<init>(" + (field != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new jj("");
    }
}
