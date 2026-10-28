/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    DualLinkNode secondaryNext;
    long secondaryKey;
    static String field_h;
    static String field_l;
    DualLinkNode secondaryPrevious;
    static int field_o;
    static int[] field_m;
    static int[] field_k;
    static ArchivePreloader field_n;
    static String field_g;

    final void unlinkSecondary(int guard) {
        int var2 = 125 / ((guard - 31) / 57);
        if (this.secondaryPrevious == null) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryPrevious = null;
        this.secondaryNext = null;
    }

    final static String e(int param0) {
        if (EmailAvailabilityValidator.field_o == InstructionsScreen.field_q) {
          return PauseMenuScreen.field_h;
        }
        if (EmailAvailabilityValidator.field_o == MeshMaterial.field_b) {
          return SpriteStrip.field_j;
        }
        if (!HighscorePlayerRecord.field_g.isComplete(param0)) {
          return SpriteStrip.field_j;
        }
        return StrongCacheEntry.field_v;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != -1) {
          field_k = (int[]) null;
        }
        boolean stackIn_8_0 = (param0 >= param4) && (param5 + param4 > param0) && (param6 >= param3) && (param3 + param1 > param6);
        return stackIn_8_0;
    }

    final static void a(int param0, int param1) {
        int var9 = EscapeVector.obfuscationControl;
        boolean var2_int = (4 == param1);
        Sprite[] var3 = AchievementThresholdRule.objectSprites;
        if (var2_int) {
          var3 = ArchiveProvider.field_b;
        }
        if (var3 == null) {
          return;
        }
        Sprite[] var4 = StripedProgressBar.objectGlowSprites;
        if (param0 != -1) {
          field_h = (String) null;
        }
        if (var4 == null) {
          return;
        }
        try {
          if (null == AccountRegistrationPanel.field_M) {
            AccountRegistrationPanel.field_M = new ObjectSpriteSet[var3.length];
          }
          for (int var5 = 0; var5 < var3.length; var5++) {
            Sprite var6 = var3[var5];
            Sprite var7 = var4[var5];
            SpriteOffset var8 = new SpriteOffset(ClientException.field_b[var5], ClientException.field_f[var5]);
            AccountRegistrationPanel.field_M[var5] = new ObjectSpriteSet(var6, var7, var8);
          }
          TerrainMaskSupport.a(105);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fl.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, SystemTaskService param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        IntPoint.field_d = param1;
        SeekerPulseStream.field_l = param7;
        AgeValidator.field_n = param8;
        if (param3 != -22183) {
          return;
        }
        try {
          NameSuggestionsPanel.field_N = param2;
          StatefulTextPainter.field_y = param4;
          TrackerMusicDefinition.field_j = param5;
          ReflectionCheck.field_n = param6;
          SpriteArchiveSupport.field_c = param0;
          SelfDestructEffects.field_j = (Js5Transport) ((Object) new SocketJs5Transport());
          ShipHullGeometry.field_b = new DiskCacheWorker(param1);
          FullscreenFocusCanvas.field_e = new Js5ArchiveManager(SelfDestructEffects.field_j, ShipHullGeometry.field_b);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fl.W(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    protected DualLinkNode() {
    }

    public static void releaseStatics(byte guard) {
        field_h = null;
        int var1 = 126 % ((guard - 50) / 35);
        field_n = null;
        field_m = null;
        field_k = null;
        field_l = null;
        field_g = null;
    }

    static {
        field_l = "Connection timed out. Please try using a different server.";
        field_h = "Connection lost - attempting to reconnect";
        field_g = "Shield bonus: ";
        field_m = new int[]{-1, -1, -1, 0};
    }
}
