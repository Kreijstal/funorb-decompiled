/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static boolean field_f;
    private TextInputWidget field_e;

    final jg evaluateValidationStatus(byte param0) {
        if (param0 == 35) {
          return this.getValidationStatus(this.field_e.text, false);
        }
        field_f = true;
        return this.getValidationStatus(this.field_e.text, false);
    }

    public final boolean hasMissingInput(byte param0) {
        if (param0 != 5) {
          field_f = true;
          if (null != this.field_e.text) {
            return this.field_e.text.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_e.text) {
          return true;
        }
        if (this.field_e.text.length() != 0) {
          return false;
        }
        return true;
    }

    final static Sprite[] a(Sprite param0, boolean param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite var3 = null;
        Sprite[] var4 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var3 = (Sprite) null;
            TextFieldValidator.a((Sprite) null, true);
          }
          var4 = new Sprite[9];
          var2 = var4;
          var4[4] = param0;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("aba.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onTextChanged(TextInputWidget param0, byte param1) {
        try {
          int var3_int = 96 % ((param1 - 0) / 49);
          this.recordInputChange(574);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aba.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String evaluateValidationMessage(byte param0) {
        if (param0 < 97) {
          return (String) null;
        }
        return this.getValidationMessage((byte) 112, this.field_e.text);
    }

    final static void a(byte param0, int param1) {
        int var2 = 84 % ((param0 + 18) / 34);
        ol.a(PizzaPartyAnimation.field_y[param1], true);
    }

    public final void onTextSubmitted(TextInputWidget param0, int param1) {
        try {
          if (param1 != 0) {
            this.evaluateValidationStatus((byte) 6);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aba.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static EventEffect a(PacketBuffer param0, int param1) {
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        SnowEffect stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            var3 = (PacketBuffer) null;
            TextFieldValidator.a((PacketBuffer) null, 85);
          }
          stackIn_3_0 = new SnowEffect();
          return (EventEffect) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aba.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract jg getValidationStatus(String param0, boolean param1);

    abstract String getValidationMessage(byte param0, String param1);

    TextFieldValidator(TextInputWidget param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
