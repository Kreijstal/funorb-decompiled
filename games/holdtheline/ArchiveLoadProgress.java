/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadProgress {
    private ArchiveLoadStage[] field_h;
    float field_j;
    static String[] field_a;
    String field_b;
    private int field_i;
    static SpriteAsset field_c;
    static String field_g;
    private int field_f;
    private int field_d;
    static int field_e;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != -3646) {
          ArchiveLoadProgress.clearSharedReferences(-56);
          field_c = null;
          field_g = null;
          return;
        }
        field_c = null;
        field_g = null;
    }

    final boolean pollLoaded(int param0) {
        int var3;
        ArchiveLoadStage var4;
        var3 = HoldTheLine.field_D;
        while (this.field_f < this.field_i) {
          var4 = this.field_h[this.field_f];
          if (!var4.field_e.ensureIndexLoaded((byte) -85)) {
            this.updateProgress((byte) -52, 0, var4);
            return false;
          }
          if (0 <= var4.field_b &&
            !var4.field_e.tryLoadGroup(var4.field_b, -124)) {
            this.updateProgress((byte) -52, var4.field_e.getGroupLoadPercent(108, var4.field_b), var4);
            return false;
          }
          if (var4.field_a != null &&
            !var4.field_e.tryLoadNamedGroup(var4.field_a, -104)) {
            this.updateProgress((byte) -52, var4.field_e.getNamedGroupLoadPercent(var4.field_a, 0), var4);
            return false;
          }
          if (var4.field_b < 0 &&
            var4.field_a == null &&
            null != var4.field_c &&
            !var4.field_e.tryLoadAllGroups((byte) -52)) {
            this.updateProgress((byte) -52, var4.field_e.getLoadPercent(param0 + 1), var4);
            return false;
          }
          this.field_f = this.field_f + 1;
        }
        if (param0 != -1) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, IsaacPacketBuffer param3) {
        try {
          eg.a(hk.field_c[param2][param1], 14, true, param3);
          eg.a(QuickChatPhraseDefinition.field_v[param2][param1], 13, true, param3);
          if (param0 >= -87) {
            IsaacPacketBuffer var5 = (IsaacPacketBuffer) null;
            ArchiveLoadProgress.a(61, 25, -81, (IsaacPacketBuffer) null);
          }
          param3.writeBits(91, 2, BoundaryIntersection.field_j[param2][param1]);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ac.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private ArchiveLoadProgress() throws Throwable {
        throw new Error();
    }

    private final void updateProgress(byte param0, int param1, ArchiveLoadStage param2) {
        float var4_float = 0.0f;
        try {
          if (param0 != -52) {
            String[] var5 = (String[]) null;
            ArchiveLoadProgress.addTutorialCalloutAnchor((TutorialPage) null, (String[]) null, -128, -113);
          }
          var4_float = (float)param1 / 100.0f + (float)(this.field_f + 1);
          if (param1 != 0) {
            this.field_b = param2.field_c + " - " + param1 + "%";
          } else {
            this.field_b = param2.field_g;
          }
          this.field_j = (float)this.field_d * var4_float / (float)(this.field_i + 1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ac.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void addTutorialCalloutAnchor(TutorialPage param0, String[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (param1.length != 4) {
            throw new IllegalArgumentException();
          }
          var4_int = ka.a((byte) -127, param1[0]);
          var5 = ka.a((byte) -116, param1[param2]);
          var6 = ka.a((byte) 39, param1[2]);
          var7 = ka.a((byte) -120, param1[3]);
          param0.field_g = param0.field_j;
          param0.field_j = new TutorialCalloutAnchor(param3, var4_int, var5, var6, var7);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ac.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_g = "(Player 1)";
        field_e = -1;
        field_a = new String[]{null, "<col=2>You must win the Classic championship to qualify.</col>", "<col=2>You must win the Desert championship to qualify.</col>", "<col=2>You must win the Alpine championship to qualify.</col>"};
    }
}
