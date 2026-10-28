/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityRequest {
    private String email;
    private boolean available;
    private boolean complete;
    static EmailValidationError field_c;
    static String field_d;
    static String[] field_f;

    final void complete(byte guard, boolean available) {
        this.available = available ? true : false;
        if (guard != -128) {
          return;
        }
        this.complete = true;
    }

    final static boolean a(char param0, int param1) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (TextWidgetPainter.isAsciiAlphanumeric(true, param0)) {
            return true;
          }
          char[] var6 = MenuTitleRenderSupport.field_a;
          char[] var2 = var6;
          for (int var3 = 0; var6.length > var3; var3++) {
            int var4 = var6[var3];
            if (~var4 == ~param0) {
              return true;
            }
          }
          char[] var2Lifetime1 = AccountRequestDialog.field_nb;
          for (int var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            int var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          if (param1 == -11217) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "d.E(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isComplete(int guard) {
        if (guard != 0) {
          return false;
        }
        return this.complete;
    }

    final String email(int guard) {
        if (guard > -24) {
          return (String) null;
        }
        return this.email;
    }

    final boolean isAvailable(int guard) {
        if (guard != 14668) {
          return false;
        }
        return this.available;
    }

    EmailAvailabilityRequest(String param0) {
        this.complete = false;
        this.available = false;
        try {
          this.email = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "d.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        field_d = null;
        if (guard != 65) {
          field_f = (String[]) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_c = new EmailValidationError();
        field_d = "Quit to website";
        field_f = new String[]{"Fly away from the asteroid intact<br>to avoid losing a life.", "Fly away from the moon intact<br>to avoid losing a life.", "Fly away from the planet intact<br>to avoid losing a life."};
    }
}
