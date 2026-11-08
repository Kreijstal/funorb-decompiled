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

    final static int doubleToFixed3(int obfuscationGuard, double value) {
        if (obfuscationGuard != 4885) {
          PotEvent.fixed16ToDouble((byte) -24, 59L);
          return SingleChildWidget.a(value, 3, 1);
        }
        return SingleChildWidget.a(value, 3, 1);
    }

    final static void setTuhstatbutCookie(int obfuscationGuard, java.applet.Applet applet) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          RasterBuffer.field_j = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          if (obfuscationGuard != 16) {
            field_p = (int[]) null;
          }
          var4 = -1L;
          BrowserCookieWriter.setBrowserCookie(var4, (byte) -120, applet, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cr.D(" + obfuscationGuard + ',' + (applet != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
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

    final static double fixed16ToDouble(byte obfuscationGuard, long value) {
        if (obfuscationGuard != 89) {
          PotEvent.doubleToFixed3(-26, 0.6233354276237926);
          return IndexedSpriteState.fixedToDouble((byte) -107, 16, value);
        }
        return IndexedSpriteState.fixedToDouble((byte) -107, 16, value);
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
