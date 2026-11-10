/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextFieldValidator {
    private EditableTextWidget field_f;
    static IntrusiveDeque field_i;
    static char[] field_h;
    static BitPacketBuffer field_g;

    final static Sprite renderSpriteWithOutline(Sprite param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ContentTransitionDialog.setRasterTarget((byte) -116, AccountCreationDialog.field_vb);
          if (param2 != 339) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          Rasterizer.clear();
          param0.drawTransparent(3, 3);
          TileOccupancyHelpers.tintStateSprite(AccountCreationDialog.field_vb, param3, param1, -109);
          SingleChildWidget.popRasterState(-21189);
          stackIn_4_0 = AccountCreationDialog.field_vb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fj.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean isClientOptionEnabled(int param0, int param1) {
        int var2 = -102 / ((29 - param1) / 54);
        if (-1 != param0) {
          return (MultiHandleSliderWidget.field_I & 1 << param0) != 0 ? true : false;
        }
        return true;
    }

    MatchingTextValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        try {
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_i = null;
        field_g = null;
        if (param0 >= -120) {
          field_i = (IntrusiveDeque) null;
        }
    }

    final String messageForText(String param0, byte param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f instanceof ValidationSource) {
            var3 = ((ValidationSource) ((Object) this.field_f)).getValidationSource(0);
            if (var3 != null) {
              if (var3.getValidationState((byte) -75) == EmailSyntaxValidator.field_g &&
                !param0.equals(this.field_f.field_o)) {
                stackIn_5_0 = LoginMethodCookieHelpers.field_a;
                return stackIn_5_0;
              }
              stackIn_7_0 = var3.getValidationMessage((byte) -125);
              return stackIn_7_0;
            }
          }
          if (!param0.equals(this.field_f.field_o)) {
            stackIn_10_0 = LoginMethodCookieHelpers.field_a;
            return stackIn_10_0;
          }
          if (param1 < -94) {
            return null;
          }
          var4 = (String) null;
          this.messageForText((String) null, (byte) -42);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fj.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final ValidationState validateText(String param0, int param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f instanceof ValidationSource) {
            var3 = ((ValidationSource) ((Object) this.field_f)).getValidationSource(0);
            if (var3 != null &&
              var3.getValidationState((byte) -105) != EmailSyntaxValidator.field_g) {
              stackIn_5_0 = MouseWheelInput.field_b;
              return stackIn_5_0;
            }
          }
          if (param1 != 2) {
            this.field_f = (EditableTextWidget) null;
          }
          if (!param0.equals(this.field_f.field_o)) {
            stackIn_11_0 = MouseWheelInput.field_b;
          } else {
            stackIn_11_0 = EmailSyntaxValidator.field_g;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fj.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_h = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_i = new IntrusiveDeque();
    }
}
