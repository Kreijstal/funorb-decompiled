/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends aba {
    private String checkedName;
    static String field_h;
    private boolean nameAvailable;

    AccountNameAvailabilityValidator(TextInputWidget param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final void d(int param0) {
        this.checkedName = null;
        if (param0 >= -106) {
          this.nameAvailable = false;
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        if (param0 != 84) {
          AccountNameAvailabilityValidator.e(110);
        }
    }

    final static String e(int param0) {
        if (FridgeScreen.field_p == kq.field_j) {
          return sc.field_n;
        }
        if (!ut.field_m.a(false)) {
          return ut.field_m.b(25477);
        }
        if (param0 != 21240) {
          return (String) null;
        }
        if (kq.field_j == ReportAbusePanel.field_G) {
          return ut.field_m.b(25477);
        }
        return IncomingSpecial.field_p;
    }

    final jg a(String param0, boolean param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!SlowAllAnimation.a((byte) -60, var4)) {
            stackIn_3_0 = FoodShopPanel.field_f;
            return stackIn_3_0;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = du.pollAccountNameCheck(param0, (byte) -43);
            if (var3 != null &&
              var3.message == null) {
              this.checkedName = param0;
              this.nameAvailable = var3.success;
            } else {
              stackIn_10_0 = ji.field_f;
              return stackIn_10_0;
            }
          }
          if (param1) {
            field_h = (String) null;
          }
          if (!this.nameAvailable) {
            stackIn_17_0 = FoodShopPanel.field_f;
          } else {
            stackIn_17_0 = cm.field_u;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tt.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountServiceResult var4_ref_eq = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = hp.a(var5, 0);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.checkedName)) {
            var4_ref_eq = du.pollAccountNameCheck(param1, (byte) -43);
            if (var4_ref_eq == null) {
              return null;
            }
            if (null != var4_ref_eq.message) {
              return null;
            }
            this.nameAvailable = var4_ref_eq.success;
            this.checkedName = param1;
          }
          if (!this.nameAvailable) {
            stackIn_12_0 = FullHealAnimation.field_A;
            return stackIn_12_0;
          }
          var4 = -59 % ((-8 - param0) / 45);
          stackIn_14_0 = su.field_a;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("tt.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_h = "Reload game";
    }
}
