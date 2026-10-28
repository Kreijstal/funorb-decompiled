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
          AchievementQuery.d(71);
          field_k = null;
          field_j = null;
          return;
        }
        field_k = null;
        field_j = null;
    }

    final static boolean d(int param0) {
        if (param0 != -4292) {
          String var2 = (String) null;
          AchievementQuery.a(false, (String) null, true, (String) null);
          return LoginStage.field_a;
        }
        return LoginStage.field_a;
    }

    final static void a(boolean param0, String param1, boolean param2, String param3) {
        try {
          bm.field_g = param3;
          StrongCacheEntry.field_v = param1;
          UiTheme.a((byte) 71, mm.field_a, param0);
          if (param2) {
            AchievementQuery.releaseStatics(true);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
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
