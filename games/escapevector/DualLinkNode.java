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

    final static String currentAccountIdentifier(int guard) {
        if (EmailAvailabilityValidator.field_o == InstructionsScreen.field_q) {
          return PauseMenuScreen.field_h;
        }
        if (EmailAvailabilityValidator.field_o == MeshMaterial.field_b) {
          return SpriteStrip.field_j;
        }
        if (!HighscorePlayerRecord.field_g.isComplete(guard)) {
          return SpriteStrip.field_j;
        }
        return StrongCacheEntry.field_v;
    }

    final static boolean pointInRectangle(int x, int height, int guard, int top, int left, int width, int y) {
        if (guard != -1) {
          field_k = (int[]) null;
        }
        boolean stackIn_8_0 = (x >= left) && (width + left > x) && (y >= top) && (top + height > y);
        return stackIn_8_0;
    }

    final static void initializeObjectSpriteSets(int guard, int theme) {
        int var9 = EscapeVector.obfuscationControl;
        boolean var2_int = (4 == theme);
        Sprite[] var3 = AchievementThresholdRule.objectSprites;
        if (var2_int) {
          var3 = ArchiveProvider.field_b;
        }
        if (var3 == null) {
          return;
        }
        Sprite[] var4 = StripedProgressBar.objectGlowSprites;
        if (guard != -1) {
          field_h = (String) null;
        }
        if (var4 == null) {
          return;
        }
        try {
          if (null == AccountRegistrationPanel.objectSpriteSets) {
            AccountRegistrationPanel.objectSpriteSets = new ObjectSpriteSet[var3.length];
          }
          for (int var5 = 0; var5 < var3.length; var5++) {
            Sprite var6 = var3[var5];
            Sprite var7 = var4[var5];
            SpriteOffset var8 = new SpriteOffset(ClientException.field_b[var5], ClientException.field_f[var5]);
            AccountRegistrationPanel.objectSpriteSets[var5] = new ObjectSpriteSet(var6, var7, var8);
          }
          TerrainMaskSupport.initializeRotatedObjectOffsets(105);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fl.CA(" + guard + ',' + theme + ')');
        }
    }

    final static void initializeJs5(String serverHost, SystemTaskService taskService, int handshakeValue, int guard, int language, int serverNumber, int gameCrc, int secondaryPort, int primaryPort) {
        IntPoint.field_d = taskService;
        SeekerPulseStream.field_l = secondaryPort;
        AgeValidator.field_n = primaryPort;
        if (guard != -22183) {
          return;
        }
        try {
          NameSuggestionsPanel.field_N = handshakeValue;
          StatefulTextPainter.field_y = language;
          TrackerMusicDefinition.field_j = serverNumber;
          ReflectionCheck.field_n = gameCrc;
          SpriteArchiveSupport.field_c = serverHost;
          SelfDestructEffects.field_j = (Js5Transport) ((Object) new SocketJs5Transport());
          ShipHullGeometry.field_b = new DiskCacheWorker(taskService);
          FullscreenFocusCanvas.field_e = new Js5ArchiveManager(SelfDestructEffects.field_j, ShipHullGeometry.field_b);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fl.W(" + (serverHost != null ? "{...}" : "null") + ',' + (taskService != null ? "{...}" : "null") + ',' + handshakeValue + ',' + guard + ',' + language + ',' + serverNumber + ',' + gameCrc + ',' + secondaryPort + ',' + primaryPort + ')');
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
