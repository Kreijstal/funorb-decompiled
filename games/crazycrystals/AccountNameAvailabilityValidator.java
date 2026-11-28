/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameAvailabilityValidator extends TextFieldValidator {
    static String field_i;
    static int field_m;
    private boolean nameAvailable;
    static int field_k;
    private String checkedName;

    public static void clearStaticReferences(boolean param0) {
        if (!param0) {
          AccountNameAvailabilityValidator.clearStaticReferences(true);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final void invalidateCheckedName(int param0) {
        if (param0 != -31626) {
          field_m = -99;
          this.checkedName = null;
          return;
        }
        this.checkedName = null;
    }

    final String getValidationMessage(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        AccountServiceResult var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 15 % ((41 - param1) / 49);
          var6 = (CharSequence) ((Object) param0);
          var4 = RichTextWidget.a(var6, -63);
          if (var4 != null) {
            stackIn_2_0 = var4;
            return stackIn_2_0;
          }
          if (!param0.equals(this.checkedName)) {
            var5 = aj.pollAccountNameCheck(-112, param0);
            if (var5 == null) {
              return null;
            }
            if (var5.message != null) {
              return null;
            }
            this.checkedName = param0;
            this.nameAvailable = var5.success;
          }
          if (this.nameAvailable) {
            stackIn_14_0 = ao.field_c;
            return stackIn_14_0;
          }
          stackIn_12_0 = ResourceArchive.field_f;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("no.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, PuzzleTile[][] param3) {
        try {
          LevelCompleteScene.updateSpecialTileNeighbors(param0, param3, param2, false, 1);
          if (param1 != -8383) {
            AccountNameAvailabilityValidator.e((byte) -125);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "no.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    AccountNameAvailabilityValidator(EditableTextField param0) {
        super(param0);
        this.nameAvailable = false;
    }

    final oi getValidationStatus(String param0, byte param1) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        oi stackIn_5_0 = null;
        oi stackIn_12_0 = null;
        oi stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -122) {
            this.invalidateCheckedName(70);
          }
          var4 = (CharSequence) ((Object) param0);
          if (!MouseInputHandler.a(-30, var4)) {
            stackIn_5_0 = rk.field_c;
            return stackIn_5_0;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = aj.pollAccountNameCheck(-114, param0);
            if (var3 != null &&
              null == var3.message) {
              this.nameAvailable = var3.success;
              this.checkedName = param0;
            } else {
              stackIn_12_0 = ec.field_h;
              return stackIn_12_0;
            }
          }
          if (!this.nameAvailable) {
            stackIn_17_0 = rk.field_c;
          } else {
            stackIn_17_0 = GzipDecompressor.field_b;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("no.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (ph.field_E == null) {
          return;
        }
        fq.a(-32, ph.field_E);
        ph.field_E.exitFullscreen(ResultScene.field_a, (byte) -92);
        ph.field_E = null;
        if (ne.field_f != null) {
          ne.field_f.a((byte) 96);
          if (param0 != -23) {
            field_i = (String) null;
            jd.field_D.requestFocus();
            return;
          }
          jd.field_D.requestFocus();
          return;
        }
        if (param0 == -23) {
          jd.field_D.requestFocus();
          return;
        }
        field_i = (String) null;
        jd.field_D.requestFocus();
    }

    static {
        field_m = 2;
        field_i = "Logging in...";
    }
}
