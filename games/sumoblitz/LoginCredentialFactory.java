/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialFactory {
    static int field_a;
    static String[] field_b;

    final static LoginCredentials createCredentials(long usernameKey, boolean alternateUsernameType, String email, String password, boolean guard) {
        RuntimeException var6 = null;
        AlternateUsernameCredentials stackIn_8_0 = null;
        EmailCredentials stackIn_10_0 = null;
        UsernameCredentials stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard) {
            LoginCredentialFactory.releaseStatics((byte) 100);
          }
          if (usernameKey == 0L &&
            email != null) {
            stackIn_10_0 = new EmailCredentials(email, password);
            return (LoginCredentials) ((Object) stackIn_10_0);
          }
          if (alternateUsernameType) {
            stackIn_8_0 = new AlternateUsernameCredentials(usernameKey, password);
            return (LoginCredentials) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new UsernameCredentials(usernameKey, password);
          return (LoginCredentials) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ds.C(").append(usernameKey).append(',').append(alternateUsernameType).append(',');
          if (email == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (password == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void initializePlayerFromUpgradeSettings(int guard) {
        if (guard <= 33) {
          LoginCredentialFactory.initializePlayerFromUpgradeSettings(-65);
          SpriteMask.drones[0] = (Drone) ((Object) new PlayerDrone(81920, 61440));
          SpriteMask.drones[0].speedLevel = ResourceArchive.selectedSpeedLevel;
          SpriteMask.drones[0].bounceLevel = hc.selectedBounceLevel;
          SpriteMask.drones[0].tractionLevel = LegacyOpenGlEffectManager.selectedTractionLevel;
          SpriteMask.drones[0].recomputeUpgradeStats((byte) 35);
          AppletTickHistory.field_b = 250;
          if (NextLevelChoiceOverlay.field_d) {
            NextLevelChoiceOverlay.field_d = false;
            AppletTickHistory.field_b = AppletTickHistory.field_b * 2;
            return;
          }
          return;
        }
        SpriteMask.drones[0] = (Drone) ((Object) new PlayerDrone(81920, 61440));
        SpriteMask.drones[0].speedLevel = ResourceArchive.selectedSpeedLevel;
        SpriteMask.drones[0].bounceLevel = hc.selectedBounceLevel;
        SpriteMask.drones[0].tractionLevel = LegacyOpenGlEffectManager.selectedTractionLevel;
        SpriteMask.drones[0].recomputeUpgradeStats((byte) 35);
        AppletTickHistory.field_b = 250;
        if (!NextLevelChoiceOverlay.field_d) {
          return;
        }
        NextLevelChoiceOverlay.field_d = false;
        AppletTickHistory.field_b = AppletTickHistory.field_b * 2;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -1) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
