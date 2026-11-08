/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextInputValidator {
    static int field_v;
    private boolean cachedUsernameAvailable;
    static Sprite field_u;
    static String multiconstClan;
    static Sprite field_r;
    static int[] field_t;
    static int field_o;
    static String chatButton;
    private String cachedUsernameCandidate;
    static String startgame;

    final String validationMessageForText(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        LoginResponse var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = NameNormalizationSupport.validateAccountName(var5, param1 - 89);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (param1 != 0) {
            field_u = (Sprite) null;
          }
          if (!param0.equals(this.cachedUsernameCandidate)) {
            var4 = PasswordInputPainter.pollUsernameAvailability(param0, 118);
            if (var4 == null) {
              return null;
            }
            if (var4.field_b != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.cachedUsernameCandidate = param0;
            this.cachedUsernameAvailable = var4.field_f;
          }
          if (this.cachedUsernameAvailable) {
            stackIn_17_0 = DimmedPauseMenu.createUsernameAvailable;
            return stackIn_17_0;
          }
          stackIn_15_0 = TextHotspotRegion.createUsernameUnavailable;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ua.L(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntegerSyntaxSupport validationStateForText(String param0, boolean param1) {
        LoginResponse var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        IntegerSyntaxSupport stackIn_2_0 = null;
        IntegerSyntaxSupport stackIn_5_0 = null;
        IntegerSyntaxSupport stackIn_11_0 = null;
        IntegerSyntaxSupport stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!IterableDualLinkDeque.isValidAccountName((byte) -64, var4)) {
            stackIn_2_0 = AchievementProtocolSupport.field_d;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (IntegerSyntaxSupport) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.cachedUsernameCandidate)) {
            var3 = PasswordInputPainter.pollUsernameAvailability(param0, -51);
            if (var3 != null &&
              var3.field_b == null) {
              this.cachedUsernameCandidate = param0;
              this.cachedUsernameAvailable = var3.field_f;
            } else {
              stackIn_11_0 = Js5Transport.field_k;
              return stackIn_11_0;
            }
          }
          if (this.cachedUsernameAvailable) {
            stackIn_16_0 = ProxySocketConnector.field_e;
          } else {
            stackIn_16_0 = AchievementProtocolSupport.field_d;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ua.K(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    UsernameAvailabilityValidator(TextInputWidget param0) {
        super(param0);
        this.cachedUsernameAvailable = false;
    }

    final void invalidateCachedUsernameAvailability(int param0) {
        if (param0 != 18) {
          return;
        }
        this.cachedUsernameCandidate = null;
    }

    public static void releaseStatics(int param0) {
        multiconstClan = null;
        field_r = null;
        field_u = null;
        if (param0 < -51) {
          chatButton = null;
          field_t = null;
          startgame = null;
          return;
        }
        multiconstClan = (String) null;
        chatButton = null;
        field_t = null;
        startgame = null;
    }

    final static void drawDecisionDialog(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          startgame = (String) null;
          if (GzipDecoder.field_h) {
            LobbyGame.field_Vb.drawRoot((byte) -79, false);
            return;
          }
          return;
        }
        if (!GzipDecoder.field_h) {
          return;
        }
        LobbyGame.field_Vb.drawRoot((byte) -79, false);
    }

    static {
        multiconstClan = "Clan";
        field_v = 0;
        field_t = new int[]{17, 18, 8};
        chatButton = "Chat";
        field_o = 0;
        startgame = "Start Game";
    }
}
