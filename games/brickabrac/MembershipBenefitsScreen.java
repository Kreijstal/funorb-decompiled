/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipBenefitsScreen extends MenuScreen {
    static cd field_v;
    private IndexedSprite[] screenshots;
    static mh field_t;
    private ResourceArchive archive;
    static int clientTick;
    static RgbSprite field_s;
    static int renderTimeCursor;

    public static void g(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 2) {
          MembershipBenefitsScreen.g(47);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final void drawScreen(byte obfuscationGuard) {
        Rasterizer2D.clear();
        if (obfuscationGuard <= -14) {
          if (ff.field_c != null) {
            ff.field_c.e((byte) -93);
          }
          return;
        }
        MembershipBenefitsScreen.g(61);
        if (ff.field_c != null) {
          ff.field_c.e((byte) -93);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          if (null != MusicCrossfadeStream.field_m) {
            MusicCrossfadeStream.field_m.a(true, param0);
          }
          return;
        }
        MembershipBenefitsScreen.f(-8);
        if (null != MusicCrossfadeStream.field_m) {
          MusicCrossfadeStream.field_m.a(true, param0);
        }
    }

    final static long f(int param0) {
        if (param0 != -6792) {
          field_s = (RgbSprite) null;
          return MonotonicTime.nowMillis(false) - oj.lastGameReadMillis;
        }
        return MonotonicTime.nowMillis(false) - oj.lastGameReadMillis;
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        if (param0 != 460) {
          return false;
        }
        if (param1 == 0) {
          return false;
        }
        if (3 != param1) {
          var3 = param1 == 2 ? 1 : 0;
          ng.requestScreen(var3 != 0, param0 - 386, this.getParentScreenId(true));
          return var3 == 0 ? true : false;
        }
        return false;
    }

    MembershipBenefitsScreen(ResourceArchive archive) {
        super(12, 180, 460, 150, 35, (int[]) null);
        try {
          this.archive = archive;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "de.<init>(" + (archive != null ? "{...}" : "null") + ')');
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        boolean discarded$0 = false;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard >= -52) {
          return;
        }
        if (null == this.screenshots) {
          this.screenshots = PacketBuffer.a("benefits", this.archive, "members_benefits_screenshots", -946715356);
          return;
        }
        if (ff.field_c != null) {
          discarded$0 = this.c(460, ff.field_c.a(false, inputEnabled));
          return;
        }
        ff.field_c = new w(sl.field_C, oc.field_u, this.screenshots, false, SaveResultsPromptScreen.field_u);
    }

    final boolean handleKey(char character, int obfuscationGuard, int keyCode) {
        if (obfuscationGuard <= 98) {
          return false;
        }
        if (null != ff.field_c) {
          return this.c(460, ff.field_c.a((byte) -93));
        }
        return false;
    }

    static {
        field_v = new cd(2);
    }
}
