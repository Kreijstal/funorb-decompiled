/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    static int field_s;
    static int field_q;
    private String checkedName;
    private boolean nameAvailable;

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final static void e(int param0) {
        int var1 = -27 / ((param0 + 25) / 53);
        if (SecondaryNodeDequeIterator.field_b >= 70) {
          wk.a(80, 80);
          return;
        }
        wk.a(80, 10 + SecondaryNodeDequeIterator.field_b);
    }

    final vh getValidationStatus(int param0, String param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        vh stackIn_2_0 = null;
        vh stackIn_11_0 = null;
        vh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!d.a(-18254, var4)) {
            stackIn_2_0 = u.field_b;
            return stackIn_2_0;
          }
          if (param0 != 8192) {
            AccountNameAvailabilityValidator.e(69);
          }
          if (!param1.equals(this.checkedName)) {
            var3 = PcmResampler.pollAccountNameCheck(param1, param0 ^ 11774);
            if (var3 != null &&
              null == var3.message) {
              this.nameAvailable = var3.success;
              this.checkedName = param1;
            } else {
              stackIn_11_0 = nd.field_P;
              return stackIn_11_0;
            }
          }
          if (!this.nameAvailable) {
            stackIn_16_0 = u.field_b;
          } else {
            stackIn_16_0 = ce.field_e;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("pk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int d(byte param0) {
        if (param0 != 9) {
          return -67;
        }
        return (int)(1000000000L / ma.field_vb);
    }

    final String getValidationMessage(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 47) {
            AccountNameAvailabilityValidator.d((byte) -100);
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = ResourceArchive.getAccountNameValidationError(true, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.checkedName)) {
            var4 = PcmResampler.pollAccountNameCheck(param1, 3582);
            if (var4 == null) {
              return null;
            }
            if (var4.message != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.checkedName = param1;
            this.nameAvailable = var4.success;
          }
          if (this.nameAvailable) {
            return TextHotspotBounds.field_r;
          }
          stackIn_16_0 = FullscreenFocusCanvas.field_g;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("pk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void invalidateCheckedName(byte param0) {
        this.checkedName = null;
        if (param0 != -27) {
          this.nameAvailable = false;
        }
    }

    static {
        field_s = 0;
    }
}
