/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends vo {
    static RenderSprite titleImage;
    static String field_e;
    private boolean nameAvailable;
    static volatile int field_g;
    private String checkedName;

    final pt a(String param0, int param1) {
        pt stackIn_17_0 = null;
        String stackIn_21_2 = null;
        try {
          CharSequence var5 = (CharSequence) ((Object) param0);
          if (!SmokeParticle.a(var5, 0)) {
            pt stackIn_3_0 = bt.field_a;
            return stackIn_3_0;
          }
          if (param1 != 8192) {
            String var4 = (String) null;
            this.a((String) null, (byte) -114);
          }
          if (!param0.equals(this.checkedName)) {
            AccountServiceResult var3 = hg.pollAccountNameCheck(param1 ^ 2147475455, param0);
            if (var3 != null &&
              var3.message == null) {
              this.nameAvailable = var3.success;
              this.checkedName = param0;
            } else {
              pt stackIn_12_0 = ce.field_t;
              return stackIn_12_0;
            }
          }
          if (!this.nameAvailable) {
            stackIn_17_0 = bt.field_a;
          } else {
            stackIn_17_0 = fd.field_a;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("mp.DA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    AccountNameAvailabilityValidator(bm param0) {
        super(param0);
        this.nameAvailable = false;
    }

    public static void c(byte param0) {
        if (param0 != -11) {
          AccountNameAvailabilityValidator.c((byte) -28);
          field_e = null;
          titleImage = null;
          return;
        }
        field_e = null;
        titleImage = null;
    }

    final void e(int param0) {
        this.checkedName = null;
        if (param0 >= -86) {
          AccountNameAvailabilityValidator.c((byte) 34);
        }
    }

    final String a(String param0, byte param1) {
        String stackIn_22_2 = null;
        try {
          if (param1 != 72) {
            String stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          CharSequence var5 = (CharSequence) ((Object) param0);
          String var3 = ee.a(var5, 0);
          if (var3 != null) {
            String stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param0.equals(this.checkedName)) {
            AccountServiceResult var4 = hg.pollAccountNameCheck(2147483647, param0);
            if (var4 == null) {
              return null;
            }
            if (var4.message != null) {
              Object stackIn_12_0 = null;
              return (String) (stackIn_12_0);
            }
            this.nameAvailable = var4.success;
            this.checkedName = param0;
          }
          if (this.nameAvailable) {
            String stackIn_18_0 = DiskCacheWorker.field_k;
            return stackIn_18_0;
          }
          String stackIn_16_0 = HudMessage.field_e;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("mp.EA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Loading...";
        field_g = 0;
    }
}
