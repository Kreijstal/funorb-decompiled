/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    static IntrusiveDeque field_v;
    static boolean field_o;
    private boolean nameAvailable;
    static cb field_t;
    private String checkedName;
    static int field_s;
    static RgbSprite field_q;
    static String[] field_p;

    final bm getValidationStatus(String param0, byte param1) {
        AccountServiceResult var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        bm stackIn_3_0 = null;
        bm stackIn_9_0 = null;
        bm stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!GridPoint.validateAccountName(var4, 1)) {
            stackIn_3_0 = bi.field_d;
            return stackIn_3_0;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = InteractiveWidget.pollAccountNameCheck(param0, -79);
            if (var3 != null &&
              null == var3.message) {
              this.checkedName = param0;
              this.nameAvailable = var3.success;
            } else {
              stackIn_9_0 = m.field_n;
              return stackIn_9_0;
            }
          }
          var3_int = -71 % ((param1 - 3) / 42);
          if (this.nameAvailable) {
            stackIn_14_0 = nd.field_d;
          } else {
            stackIn_14_0 = bi.field_d;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("n.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -69) {
          AccountNameAvailabilityValidator.clearStaticReferences((byte) 14);
          field_v = null;
          return;
        }
        field_v = null;
    }

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final String getValidationMessage(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        AccountServiceResult var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          var3 = ml.a((byte) -110, var6);
          var4 = -71 / ((param0 + 24) / 35);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.checkedName)) {
            var5 = InteractiveWidget.pollAccountNameCheck(param1, -86);
            if (var5 == null) {
              return null;
            }
            if (null != var5.message) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
            this.checkedName = param1;
            this.nameAvailable = var5.success;
          }
          if (this.nameAvailable) {
            stackIn_16_0 = SecondaryNodeDequeIterator.field_a;
            return stackIn_16_0;
          }
          stackIn_14_0 = om.field_f;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("n.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void b(boolean param0, byte param1) {
        if (param1 >= -86) {
          return;
        }
        RichTextLayout.field_s.a(500, 8000);
        if (FullscreenStatusDialog.field_ab != 1) {
          return;
        }
        AlphaWidgetContainer.l(0);
        if (param0) {
          PasswordValidator.a(true, 256, vg.field_h);
        } else {
          PasswordValidator.a(false, 256, ProgressMessageDialog.field_tb);
          return;
        }
        PasswordValidator.a(false, 256, ProgressMessageDialog.field_tb);
    }

    final void invalidateCheckedName(int param0) {
        this.checkedName = null;
        if (param0 != -2) {
          AccountNameAvailabilityValidator.clearStaticReferences((byte) 54);
        }
    }

    static {
        field_o = false;
        field_v = new IntrusiveDeque();
        field_p = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
