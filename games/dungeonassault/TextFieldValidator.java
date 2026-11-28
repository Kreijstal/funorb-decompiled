/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static String field_j;
    static int[] field_l;
    static String field_i;
    private EditableTextField field_h;
    static String field_k;

    abstract od getValidationStatus(String param0, int param1);

    final static ab a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ab stackIn_3_0 = null;
        ab stackIn_6_0 = null;
        ab stackIn_16_0 = null;
        ab stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = DungeonAssault.field_K;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = ri.field_e;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = ta.field_d;
            return stackIn_6_0;
          }
          for (var3 = param0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == var2_int - 1) {
                stackIn_16_0 = np.field_E;
                return stackIn_16_0;
              }
            } else {
              if (qj.field_b.indexOf(var4) == -1) {
                stackIn_20_0 = np.field_E;
                return stackIn_20_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ip.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_l = null;
        field_j = null;
        field_k = null;
        if (param0 != 19) {
          String var2 = (String) null;
          TextFieldValidator.a(-122, (String) null);
        }
    }

    public final void onTextSubmitted(EditableTextField param0, byte param1) {
        try {
          if (param1 >= -117) {
            field_j = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "ip.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean hasMissingInput(int param0) {
        int var2 = -78 % ((param0 - 8) / 40);
        if (null == this.field_h.field_w) {
          return true;
        }
        if (this.field_h.field_w.length() != 0) {
          return false;
        }
        return true;
    }

    abstract String getValidationMessage(byte param0, String param1);

    final od evaluateValidationStatus(boolean param0) {
        if (!param0) {
          return this.getValidationStatus(this.field_h.field_w, -92);
        }
        this.evaluateValidationStatus(true);
        return this.getValidationStatus(this.field_h.field_w, -92);
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 == 63) {
          return this.getValidationMessage((byte) 48, this.field_h.field_w);
        }
        field_j = (String) null;
        return this.getValidationMessage((byte) 48, this.field_h.field_w);
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          this.recordInputChange(2899);
          if (param1 != 10000536) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "ip.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_i = "To Customer Support";
        field_k = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";
    }
}
