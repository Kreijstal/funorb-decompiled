/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    static bi field_l;
    private boolean nameAvailable;
    static String field_n;
    private String checkedName;
    static String field_p;

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final sc getValidationStatus(int param0, String param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        sc stackIn_2_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!bd.a(var4, 3)) {
            stackIn_2_0 = ni.field_b;
            return stackIn_2_0;
          }
          if (!param1.equals(this.checkedName)) {
            var3 = ta.pollAccountNameCheck(250, param1);
            if (var3 != null &&
              null == var3.message) {
              this.checkedName = param1;
              this.nameAvailable = var3.success;
            } else {
              stackIn_8_0 = BufferedRandomAccessFile.field_q;
              return stackIn_8_0;
            }
          }
          if (param0 != 0) {
            this.nameAvailable = false;
          }
          if (this.nameAvailable) {
            stackIn_15_0 = rh.field_p;
          } else {
            stackIn_15_0 = ni.field_b;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ol.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String getValidationMessage(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          var3 = BoundedRandomAccessFile.a(var6, param0 ^ 125);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.checkedName)) {
            var4 = ta.pollAccountNameCheck(250, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.message != null) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
            this.checkedName = param1;
            this.nameAvailable = var4.success;
          }
          if (!this.nameAvailable) {
            stackIn_15_0 = nh.field_b;
            return stackIn_15_0;
          }
          if (param0 != -126) {
            var5 = (String) null;
            this.getValidationStatus(9, (String) null);
          }
          stackIn_19_0 = mh.field_D;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("ol.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void e(int param0) {
        this.checkedName = null;
        if (param0 <= 79) {
          AccountNameAvailabilityValidator.clearStaticReferences(false);
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_l = null;
        if (param0) {
          return;
        }
        field_p = null;
        field_n = null;
    }

    static {
        field_l = new bi();
        field_p = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
