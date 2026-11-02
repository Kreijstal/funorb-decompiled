/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PotEvent extends IntrusiveNode {
    static String tutorialLoseNineBallGame;
    static int[] field_p;
    static int field_l;
    static String gameoptMoreratedgames;
    int pocketIndex;
    static Sprite field_m;
    int ballIndex;
    static PcmSample field_o;
    static String mbAchievementCount2;

    final static int a(int param0, double param1) {
        if (param0 != 4885) {
          PotEvent.a((byte) -24, 59L);
          return ud.a(param1, 3, 1);
        }
        return ud.a(param1, 3, 1);
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          iq.field_j = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          if (param0 != 16) {
            field_p = (int[]) null;
          }
          var4 = -1L;
          nn.a(var4, (byte) -120, param1, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 >= 45) {
          mbAchievementCount2 = null;
          field_m = null;
          tutorialLoseNineBallGame = null;
          gameoptMoreratedgames = null;
          return;
        }
        field_o = (PcmSample) null;
        mbAchievementCount2 = null;
        field_m = null;
        tutorialLoseNineBallGame = null;
        gameoptMoreratedgames = null;
    }

    final static double a(byte param0, long param1) {
        if (param0 != 89) {
          PotEvent.a(-26, 0.6233354276237926);
          return bb.a((byte) -107, 16, param1);
        }
        return bb.a((byte) -107, 16, param1);
    }

    PotEvent(int param0, int param1) {
        this.pocketIndex = param1;
        this.ballIndex = param0;
    }

    static {
        gameoptMoreratedgames = "You need to play <%0> more rated games to unlock this option.";
        tutorialLoseNineBallGame = "You potted the 9 ball illegally. I will re-spot it for you so you can continue.";
        mbAchievementCount2 = "achievements to collect";
    }
}
