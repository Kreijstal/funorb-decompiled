/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommonUiLoadingProgress {
    static int[] field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 11052) {
          CommonUiLoadingProgress.getCommonUiLoadProgress(true);
        }
    }

    final static int getCommonUiLoadProgress(boolean param0) {
        if (BoundedRandomAccessFile.field_a < 2) {
          return 0;
        }
        if (param0) {
          if (AccountProgressDialog.field_tb == 0) {
            if (!UiWidget.field_x.ensureIndex(17820)) {
              return 20;
            }
            if (!UiWidget.field_x.ensureNamedGroupLoaded((byte) 29, "commonui")) {
              return 40;
            }
            if (!LevelActorSpawner.field_b.ensureIndex(17820)) {
              return 50;
            }
            if (!LevelActorSpawner.field_b.ensureNamedGroupLoaded((byte) 29, "commonui")) {
              return 60;
            }
            if (!IconButtonPainter.field_a.ensureIndex(17820)) {
              return 70;
            }
            if (!IconButtonPainter.field_a.areAllGroupsAvailable(-64)) {
              return 80;
            }
            return 100;
          }
        } else {
          field_a = (int[]) null;
          if (AccountProgressDialog.field_tb == 0) {
            if (!UiWidget.field_x.ensureIndex(17820)) {
              return 20;
            }
            if (!UiWidget.field_x.ensureNamedGroupLoaded((byte) 29, "commonui")) {
              return 40;
            }
            if (!LevelActorSpawner.field_b.ensureIndex(17820)) {
              return 50;
            }
            if (!LevelActorSpawner.field_b.ensureNamedGroupLoaded((byte) 29, "commonui")) {
              return 60;
            }
            if (!IconButtonPainter.field_a.ensureIndex(17820)) {
              return 70;
            }
            if (IconButtonPainter.field_a.areAllGroupsAvailable(-64)) {
              return 100;
            }
            return 80;
          }
        }
        if (GridActor.field_c != null) {
          if (!GridActor.field_c.ensureIndex(17820)) {
            return 14;
          }
          if (!GridActor.field_c.hasNamedGroup(-1, "")) {
            return 29;
          }
          if (!GridActor.field_c.ensureNamedGroupLoaded((byte) 29, "")) {
            return 29;
          }
        }
        if (!UiWidget.field_x.ensureIndex(17820)) {
          return 43;
        }
        if (!UiWidget.field_x.ensureNamedGroupLoaded((byte) 29, "commonui")) {
          return 57;
        }
        if (!LevelActorSpawner.field_b.ensureIndex(17820)) {
          return 71;
        }
        if (!LevelActorSpawner.field_b.ensureNamedGroupLoaded((byte) 29, "commonui")) {
          return 80;
        }
        if (!IconButtonPainter.field_a.ensureIndex(17820)) {
          return 82;
        }
        if (!IconButtonPainter.field_a.areAllGroupsAvailable(49)) {
          return 86;
        }
        return 100;
    }

    static {
        field_a = new int[8192];
    }
}
