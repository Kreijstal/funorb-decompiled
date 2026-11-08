/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidator implements TextInputListener {
    private EditableTextWidget field_g;
    static String field_j;
    static boolean field_k;
    static int[] field_h;
    static int[] field_i;
    static int field_m;
    static String field_l;

    public static void releaseStatics(byte param0) {
        field_i = null;
        field_l = null;
        if (param0 == -36) {
          field_h = null;
          field_j = null;
          return;
        }
        TextFieldValidator.releaseStatics((byte) 64);
        field_h = null;
        field_j = null;
    }

    TextFieldValidator(EditableTextWidget param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setSoundEffectVolume(byte param0, int param1) {
        PlayingSound var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        PlayingSound var2Lifetime1;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          DelegatingCanvas.field_c = param1;
          if (param0 < 34) {
            field_i = (int[]) null;
          }
          var2 = (PlayingSound) (LoginMethod.field_a.first((byte) -105));
          while (var2 != null) {
            if (var2.field_h.isLinked(false)) {
              var2.field_g.setVolumeQ6(DelegatingCanvas.field_c * var2.field_i + 128 >> 8);
            } else {
              var2.unlink(false);
            }
            var2 = (PlayingSound) (LoginMethod.field_a.next(16213));
          }
          if (null != IterableNodeHashTable.field_f) {
            var2Lifetime1 = (PlayingSound) (IterableNodeHashTable.field_f.first((byte) -124));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_h.isLinked(false);
              if (!stackIn_14_0) {
                var2Lifetime1.unlink(false);
              } else {
                var2Lifetime1.field_g.setVolumeQ6(128 + var2Lifetime1.field_i * DelegatingCanvas.field_c >> 8);
              }
              var2Lifetime1 = (PlayingSound) (IterableNodeHashTable.field_f.next(16213));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2_ref), "qe.K(" + param0 + ',' + param1 + ')');
        }
    }

    abstract String describeText(int param0, String param1);

    public final void onTextSubmitted(boolean param0, EditableTextWidget param1) {
        try {
          if (param0) {
            this.isEmpty(true);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qe.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final AudioSetupHelpers computeState(int param0) {
        if (param0 != -843083384) {
          return (AudioSetupHelpers) null;
        }
        return this.validationStateForText(this.field_g.field_n, true);
    }

    final static int getCommonUiLoadProgress(int param0) {
        if (PlayerContextMenu.field_n < 2) {
          return 0;
        }
        if (param0 != 11108) {
          return -58;
        }
        if (FullscreenState.field_c == 0) {
          if (!CanvasPresentHelpers.field_a.ensureIndexLoaded(0)) {
            return 20;
          }
          if (!CanvasPresentHelpers.field_a.ensureGroupAvailableByName((byte) -102, "commonui")) {
            return 40;
          }
          if (!GameOptions.field_j.ensureIndexLoaded(param0 ^ 11108)) {
            return 50;
          }
          if (!GameOptions.field_j.ensureGroupAvailableByName((byte) -102, "commonui")) {
            return 60;
          }
          if (!DialWidget.field_I.ensureIndexLoaded(param0 - 11108)) {
            return 70;
          }
          if (DialWidget.field_I.areAllGroupsAvailable(25867)) {
            return 100;
          }
          return 80;
        }
        if (ArchiveIndex.field_l == null) {
          if (!CanvasPresentHelpers.field_a.ensureIndexLoaded(0)) {
            return 43;
          }
          if (!CanvasPresentHelpers.field_a.ensureGroupAvailableByName((byte) -102, "commonui")) {
            return 57;
          }
          if (!GameOptions.field_j.ensureIndexLoaded(0)) {
            return 71;
          }
          if (!GameOptions.field_j.ensureGroupAvailableByName((byte) -102, "commonui")) {
            return 80;
          }
          if (!DialWidget.field_I.ensureIndexLoaded(0)) {
            return 82;
          }
          if (!DialWidget.field_I.areAllGroupsAvailable(25867)) {
            return 86;
          }
          return 100;
        }
        if (!ArchiveIndex.field_l.ensureIndexLoaded(param0 ^ 11108)) {
          return 14;
        }
        if (!ArchiveIndex.field_l.hasGroupName("", true)) {
          return 29;
        }
        if (!ArchiveIndex.field_l.ensureGroupAvailableByName((byte) -102, "")) {
          return 29;
        }
        if (!CanvasPresentHelpers.field_a.ensureIndexLoaded(0)) {
          return 43;
        }
        if (!CanvasPresentHelpers.field_a.ensureGroupAvailableByName((byte) -102, "commonui")) {
          return 57;
        }
        if (!GameOptions.field_j.ensureIndexLoaded(0)) {
          return 71;
        }
        if (!GameOptions.field_j.ensureGroupAvailableByName((byte) -102, "commonui")) {
          return 80;
        }
        if (!DialWidget.field_I.ensureIndexLoaded(0)) {
          return 82;
        }
        if (DialWidget.field_I.areAllGroupsAvailable(25867)) {
          return 100;
        }
        return 86;
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        if (param1 != 13) {
          return;
        }
        try {
          this.restartDebounce(false);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qe.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String computeMessage(int param0) {
        if (param0 >= -86) {
          return (String) null;
        }
        return this.describeText(-26358, this.field_g.field_n);
    }

    final static int highestOneBit(int param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param0 == -728240159) {
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
        field_m = -87;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return ~var2 & param1;
    }

    public final boolean isEmpty(boolean param0) {
        if (!param0) {
          String var3 = (String) null;
          this.validationStateForText((String) null, false);
          if (null != this.field_g.field_n) {
            return 0 == this.field_g.field_n.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_g.field_n) {
          return true;
        }
        if (0 != this.field_g.field_n.length()) {
          return false;
        }
        return true;
    }

    abstract AudioSetupHelpers validationStateForText(String param0, boolean param1);

    static {
        field_j = "Rating";
        field_l = "Please log in to access this feature.";
        field_h = new int[4];
        field_i = new int[8192];
    }
}
