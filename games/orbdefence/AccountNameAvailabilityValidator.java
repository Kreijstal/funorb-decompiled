/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    private String checkedName;
    static int[] field_o;
    static String[] field_t;
    static RgbSprite[] field_q;
    private boolean nameAvailable;
    static String field_s;
    static int field_r;

    final qd getValidationStatus(String param0, byte param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qd stackIn_3_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!dk.a(var4, 5408)) {
            stackIn_3_0 = vh.field_h;
            return stackIn_3_0;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = lf.pollAccountNameCheck(param0, true);
            if (var3 != null &&
              var3.message == null) {
              this.nameAvailable = var3.success;
              this.checkedName = param0;
            } else {
              stackIn_9_0 = uj.field_b;
              return stackIn_9_0;
            }
          }
          if (param1 != -99) {
            this.invalidateCheckedName((byte) -37);
          }
          if (this.nameAvailable) {
            stackIn_16_0 = nc.field_bb;
          } else {
            stackIn_16_0 = vh.field_h;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("bc.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final String getValidationMessage(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11300) {
            field_s = (String) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = ResourceArchive.getAccountNameValidationError(-1, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.checkedName)) {
            var4 = lf.pollAccountNameCheck(param1, true);
            if (var4 == null) {
              return null;
            }
            if (var4.message != null) {
              return null;
            }
            this.nameAvailable = var4.success;
            this.checkedName = param1;
          }
          if (this.nameAvailable) {
            return kf.field_b;
          }
          stackIn_15_0 = j.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("bc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != -97) {
          return;
        }
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
    }

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final void invalidateCheckedName(byte param0) {
        this.checkedName = null;
        if (param0 <= 59) {
          field_t = (String[]) null;
        }
    }

    static {
        field_s = "Type your email address again to make sure it's correct";
    }
}
