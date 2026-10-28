/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementQuery extends IntrusiveNode {
    boolean complete;
    boolean unavailable;
    static PcmSample field_k;
    static String field_j;
    int[] achievementWords;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          AchievementQuery.receiveNewsSelected(71);
          field_k = null;
          field_j = null;
          return;
        }
        field_k = null;
        field_j = null;
    }

    final static boolean receiveNewsSelected(int guard) {
        if (guard != -4292) {
          String var2 = (String) null;
          AchievementQuery.requestLogin(false, (String) null, true, (String) null);
          return LoginStage.field_a;
        }
        return LoginStage.field_a;
    }

    final static void requestLogin(boolean option, String identifier, boolean guard, String password) {
        try {
          NameAvailabilityResultSupport.field_g = password;
          StrongCacheEntry.field_v = identifier;
          UiTheme.showAccountRequest((byte) 71, ThemeAssetSupport.field_a, option);
          if (guard) {
            AchievementQuery.releaseStatics(true);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "jh.B(" + option + ',' + (identifier != null ? "{...}" : "null") + ',' + guard + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    AchievementQuery() {
        this.complete = false;
        this.unavailable = true;
    }

    static {
        field_j = "Accept";
    }
}
