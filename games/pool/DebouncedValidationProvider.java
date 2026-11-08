/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationProvider implements ValidationProvider {
    static Sprite[] field_b;
    static boolean[] field_d;
    static int field_f;
    static String youCanJoin;
    private long lastInputChangeMillis;
    static String loggingIn;
    static int field_g;

    abstract String currentValidationMessage(int param0);

    final static byte[] loadNamedFile(byte obfuscationGuard, String name) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 43 / ((obfuscationGuard - 33) / 60);
          stackIn_1_0 = EmailAvailabilityValidator.field_r.getFileByName(false, name, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("gg.I(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          DebouncedValidationProvider.releaseStatics(39);
          if (10 > PlasmaTableScene.field_ab) {
            return false;
          }
          if (QuickChatCategoryDefinition.field_y >= 13) {
            return true;
          }
          return false;
        }
        if (10 > PlasmaTableScene.field_ab) {
          return false;
        }
        if (QuickChatCategoryDefinition.field_y >= 13) {
          return true;
        }
        return false;
    }

    public final void resetValidationDelay(int param0) {
        if (param0 != 11755) {
          this.lastInputChangeMillis = 87L;
          this.lastInputChangeMillis = MonotonicClock.monotonicTimeMillis((byte) -109);
          return;
        }
        this.lastInputChangeMillis = MonotonicClock.monotonicTimeMillis((byte) -109);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_b = null;
        loggingIn = null;
        field_d = null;
        youCanJoin = null;
    }

    final static LoginResponse createLoginErrorResponse(int code, boolean obfuscationGuard, String message) {
        LoginResponse var3 = null;
        RuntimeException var3_ref = null;
        java.applet.Applet var4 = null;
        LoginResponse stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new LoginResponse(false);
          if (!obfuscationGuard) {
            var4 = (java.applet.Applet) null;
            DebouncedValidationProvider.reloadApplet((java.applet.Applet) null, (byte) 49);
          }
          var3.field_g = code;
          var3.field_b = message;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("gg.H(").append(code).append(',').append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final IntegerSyntaxSupport getDebouncedValidationState(int param0) {
        if (this.isInputEmpty(-3)) {
          return ReportAbuseDialog.field_Pb;
        }
        if (param0 != -31873) {
          field_g = -106;
          if ((350L + this.lastInputChangeMillis) <= MonotonicClock.monotonicTimeMillis((byte) -101)) {
            return this.currentValidationState(param0 ^ 17779);
          }
          return ParticleTrail.field_h;
        }
        if ((350L + this.lastInputChangeMillis) <= MonotonicClock.monotonicTimeMillis((byte) -101)) {
          return this.currentValidationState(param0 ^ 17779);
        }
        return ParticleTrail.field_h;
    }

    final static void reloadApplet(java.applet.Applet applet, byte obfuscationGuard) {
        try {
          String var2 = null;
          RuntimeException var2_ref = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = applet.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(applet.getCodeBase(), var4Lifetime2);
              applet.getAppletContext().showDocument(ModelInstance.a((byte) -103, var5, applet), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (obfuscationGuard < -45) {
              return;
            }
            DebouncedValidationProvider.a(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref;
            stackIn_10_1 = new StringBuilder().append("gg.D(");
            if (applet == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract IntegerSyntaxSupport currentValidationState(int param0);

    public final String getDebouncedValidationMessage(int param0) {
        if (this.isInputEmpty(-3)) {
          return null;
        }
        if (MonotonicClock.monotonicTimeMillis((byte) -123) < this.lastInputChangeMillis + 350L) {
          return null;
        }
        if (param0 > 61) {
          return this.currentValidationMessage(-120);
        }
        youCanJoin = (String) null;
        return this.currentValidationMessage(-120);
    }

    static {
        field_f = 0;
        youCanJoin = "You can join this game";
        loggingIn = "Logging in...";
        field_g = -1;
    }
}
