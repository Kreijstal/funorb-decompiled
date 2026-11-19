/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends TimedValidator implements TextChangeListener {
    static String[] field_g;
    static byte[][] field_j;
    static int[] field_h;
    private EditableTextWidget field_i;

    abstract ValidationState validateText(int param0, String param1);

    public final void onTextChanged(int param0, EditableTextWidget param1) {
        try {
          if (param0 > -111) {
            this.getCurrentValidationMessage((byte) -122);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "mf.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean isEmpty(int param0) {
        if (param0 != 7245) {
          this.isEmpty(-4);
          if (null != this.field_i.text) {
            return this.field_i.text.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_i.text) {
          return true;
        }
        if (this.field_i.text.length() != 0) {
          return false;
        }
        return true;
    }

    abstract String getTextValidationMessage(String param0, int param1);

    final ValidationState validateCurrentText(boolean param0) {
        if (!param0) {
          return (ValidationState) null;
        }
        return this.validateText(-1, this.field_i.text);
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        if (param0 > 18) {
          field_j = (byte[][]) null;
          field_g = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        TextFieldValidator.loadNamedIndexedSprite((String) null, (String) null, (ResourceArchive) null, (byte) 23);
        field_j = (byte[][]) null;
        field_g = null;
    }

    final String getCurrentValidationMessage(byte param0) {
        if (param0 < -12) {
          return this.getTextValidationMessage(this.field_i.text, -1);
        }
        EditableTextWidget var3 = (EditableTextWidget) null;
        this.onTextChanged(-1, (EditableTextWidget) null);
        return this.getTextValidationMessage(this.field_i.text, -1);
    }

    public final void onTextSubmitted(EditableTextWidget param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 5) {
            this.field_i = (EditableTextWidget) null;
            this.invalidate((byte) -112);
          } else {
            this.invalidate((byte) -112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mf.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static IndexedSprite loadNamedIndexedSprite(String param0, String param1, ResourceArchive param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 91 / ((-19 - param3) / 54);
          var4_int = param2.getGroupId(-1, param0);
          var6 = param2.getFileId(var4_int, param1, -11986);
          stackIn_1_0 = of.loadIndexedSprite(param2, var6, (byte) -128, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("mf.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    TextFieldValidator(EditableTextWidget param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new int[8192];
    }
}
