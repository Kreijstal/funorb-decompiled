/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    static boolean booleanState0128;
    static String stringState0383;
    static int integerState0556;
    private FieldValidator callbackContract011State0002;
    static String stringState0384;
    private int integerState0557;

    final String getTooltipText(byte byteArgument1) {
        if (!this.booleanState0018) {
          return null;
        }
        if (this.stringState0080 == null) {
          return null;
        }
        MixedSupport071.performAction0914(11024, HashNode.integerState0069 - (this.integerState0557 - this.integerState0107), MixedSupport101.integerState0590);
        if (byteArgument1 == 113) {
          return this.stringState0080;
        }
        stringState0383 = (String) null;
        return this.stringState0080;
    }

    final void notifyTextChanged(int integerArgument1) {
        super.notifyTextChanged(integerArgument1);
        if (this.callbackContract011State0002 != null) {
          this.callbackContract011State0002.recordInputChange((byte) -51);
        }
    }

    ValidatedTextField(String stringArgument1, WidgetEventListener callbackContract006Argument2, int integerArgument3) {
        super(stringArgument1, callbackContract006Argument2, integerArgument3);
    }

    public final FieldValidator getFieldValidator(int integerArgument1) {
        if (integerArgument1 > -86) {
          stringState0383 = (String) null;
          return this.callbackContract011State0002;
        }
        return this.callbackContract011State0002;
    }

    final void setFieldValidator(FieldValidator callbackContract011Argument1, int integerArgument2) {
        if (integerArgument2 != -5362) {
          return;
        }
        try {
          this.callbackContract011State0002 = callbackContract011Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "og.S(" + (callbackContract011Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction1167(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3) {
        CacheWorkQueue.booleanState0079 = booleanArgument1 ? true : false;
        if (booleanArgument3) {
          SceneWidgetPart002.integerState0249 = LobbyRoomRow.integerState0847;
          MixedSupport037.integerState0224 = integerArgument2;
          return;
        }
        ValidatedTextField.performAction1167(false, -59, false);
        SceneWidgetPart002.integerState0249 = LobbyRoomRow.integerState0847;
        MixedSupport037.integerState0224 = integerArgument2;
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0383 = null;
        if (byteArgument1 <= 106) {
          stringState0383 = (String) null;
          stringState0384 = null;
          return;
        }
        stringState0384 = null;
    }

    final void updatePointer(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super.updatePointer(uiComponentArgument1, 50, integerArgument3, integerArgument4);
        if (integerArgument2 < 38) {
          return;
        }
        try {
          this.integerState0557 = HashNode.integerState0069 - this.integerState0110 - integerArgument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "og.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    static {
        stringState0383 = "Close";
        booleanState0128 = true;
        stringState0384 = "Next";
    }
}
