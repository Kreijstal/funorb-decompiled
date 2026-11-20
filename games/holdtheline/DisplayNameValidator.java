/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameValidator extends TextFieldValidator {
    private boolean field_m;
    static volatile int field_j;
    private String field_k;
    static boolean field_i;
    static int field_l;

    DisplayNameValidator(EditableTextField param0) {
        super(param0);
        this.field_m = false;
    }

    final static String formatPreciseRaceTime(int param0, int param1) {
        if (param1 < 0) {
          return "--:--.--";
        }
        int var2 = param1 / 50;
        int var3 = 2 * (param1 % 50);
        int var4 = var2 / 60;
        var2 = var2 % 60;
        char[] var7 = new char[8];
        char[] var6 = var7;
        char[] var5 = var6;
        var5[7] = (char)(var3 % 10 + 48);
        var5[4] = (char)(48 + var2 % 10);
        var5[6] = (char)(var3 / 10 + 48);
        var5[2] = (char)58;
        var5[5] = (char)46;
        var5[3] = (char)(48 + var2 / 10);
        var5[0] = (char)(48 + var4 / 10 % 10);
        if (param0 >= 36) {
          var5[1] = (char)(48 + var4 % 10);
          return new String(var7);
        }
        DisplayNameValidator.formatPreciseRaceTime(125, 106);
        var5[1] = (char)(48 + var4 % 10);
        return new String(var7);
    }

    final void invalidateAvailability(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_k = null;
    }

    final String getTextValidationMessage(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        NameAvailabilityResult var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.field_k = (String) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = GameKeyHandler.a(12260, var5);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param0.equals(this.field_k)) {
            var4 = BoundaryCurve.checkNameAvailability(0, param0);
            if (var4 == null) {
              return null;
            }
            if (var4.field_d != null) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
            this.field_k = param0;
            this.field_m = var4.field_f;
          }
          if (this.field_m) {
            stackIn_16_0 = TextHotspotRange.field_m;
            return stackIn_16_0;
          }
          stackIn_14_0 = BufferedRandomAccessFile.field_j;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("cb.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final ValidationState validateText(String param0, byte param1) {
        NameAvailabilityResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_12_0 = null;
        ValidationState stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 52) {
            field_i = true;
          }
          var4 = (CharSequence) ((Object) param0);
          if (!ArchiveProvider.isValidDisplayName(var4, 8192)) {
            stackIn_5_0 = LinearPointPath.field_k;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_k)) {
            var3 = BoundaryCurve.checkNameAvailability(0, param0);
            if (var3 != null &&
              null == var3.field_d) {
              this.field_k = param0;
              this.field_m = var3.field_f;
            } else {
              stackIn_12_0 = um.field_a;
              return stackIn_12_0;
            }
          }
          if (!this.field_m) {
            stackIn_17_0 = LinearPointPath.field_k;
          } else {
            stackIn_17_0 = PointPath.field_d;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("cb.N(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = false;
        field_j = 0;
        field_l = 0;
    }
}
