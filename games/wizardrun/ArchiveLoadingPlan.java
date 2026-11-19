/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadingPlan {
    private ArchiveLoadingStage[] stages;
    static String field_e;
    private int progressScale;
    float progress;
    private int stageCount;
    String statusMessage;
    private int stageIndex;
    static IntrusiveDeque field_b;
    static int field_a;
    static int field_g;
    static String[] field_d;

    final static void setMembershipOffer(int param0, String param1, Sprite param2) {
        try {
          WidgetTheme.field_f = param2;
          Js5Index.field_r = param1;
          if (param0 != -1) {
            ArchiveLoadingPlan.releaseStatics((byte) 54);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "uc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceLoading(boolean param0) {
        ArchiveLoadingStage var2;
        int var3;
        ArchiveLoadingStage var4;
        var3 = wizardrun.field_H;
        if (!param0) {
          return false;
        }
        while (this.stageIndex < this.stageCount) {
          var4 = this.stages[this.stageIndex];
          var2 = var4;
          if (!var4.archive.ensureIndex(17820)) {
            this.updateStageProgress((byte) -7, var4, 0);
            return false;
          }
          if (var4.groupId >= 0 &&
            !var4.archive.ensureGroupLoaded(false, var4.groupId)) {
            this.updateStageProgress((byte) -68, var2, var4.archive.getGroupProgress((byte) -105, var4.groupId));
            return false;
          }
          if (var4.groupName != null &&
            !var4.archive.ensureNamedGroupLoaded((byte) 29, var4.groupName)) {
            this.updateStageProgress((byte) -53, var2, var4.archive.getNamedGroupProgress(0, var4.groupName));
            return false;
          }
          if (var4.groupId < 0 &&
            var4.groupName == null &&
            var4.loadingMessage != null &&
            !var4.archive.areAllGroupsAvailable(61)) {
            this.updateStageProgress((byte) -10, var2, var4.archive.getLoadProgress((byte) 75));
            return false;
          }
          this.stageIndex = this.stageIndex + 1;
        }
        return true;
    }

    final static void drawLoadingScreen(boolean param0, java.awt.Canvas param1) {
        try {
          if (param0) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            ArchiveLoadingPlan.drawLoadingScreen(true, (java.awt.Canvas) null);
          }
          if (11 == ArchiveRequest.field_t) {
            SpriteTextStyle.prepareLoadingOverlay((byte) 124);
          }
          ValidatedTextField.drawProgressBar((byte) 67, ArchiveContainerHelpers.loadingMessage, BeveledFrameFactory.field_c, ValidationState.loadingProgress);
          DateFormattingHelpers.presentRaster((byte) 80, 0, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "uc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_e = null;
        if (param0 != 37) {
          return;
        }
        field_b = null;
    }

    private final void updateStageProgress(byte param0, ArchiveLoadingStage param1, int param2) {
        float var4_float = (float)param2 / 100.0f + (float)(1 + this.stageIndex);
        if (param0 > -5) {
          return;
        }
        try {
          if (param2 == 0) {
            this.statusMessage = param1.waitingMessage;
          } else {
            this.statusMessage = param1.loadingMessage + " - " + param2 + "%";
          }
          this.progress = var4_float * (float)this.progressScale / (float)(this.stageCount + 1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "uc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private ArchiveLoadingPlan() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "That name is not available";
        field_b = new IntrusiveDeque();
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = -1;
    }
}
