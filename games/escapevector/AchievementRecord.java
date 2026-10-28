/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementRecord extends IntrusiveNode {
    int field_j;
    int field_k;
    int field_i;
    int field_h;
    int field_m;
    static IntrusiveDeque field_n;
    int field_g;
    static volatile boolean field_l;

    final static boolean isModeAvailable(int mode, int guard) {
        if (guard >= -85) {
          field_n = (IntrusiveDeque) null;
          int var2 = GzipDecoder.field_e.length;
          if (0 > mode) {
            return false;
          }
          if (var2 <= mode) {
            return false;
          }
          int var3 = GzipDecoder.field_e[mode];
          if (var3 != 2) {
            return true;
          }
          if (UiContainer.hasMembership((byte) -56)) {
            return true;
          }
          return false;
        }
        int var2Lifetime1 = GzipDecoder.field_e.length;
        if (0 > mode) {
          return false;
        }
        if (var2Lifetime1 <= mode) {
          return false;
        }
        int var3Lifetime1 = GzipDecoder.field_e[mode];
        if (var3Lifetime1 != 2) {
          return true;
        }
        if (!UiContainer.hasMembership((byte) -56)) {
          return false;
        }
        return true;
    }

    final static void a(int param0, String param1) {
        try {
          MouseWheelInput.field_d = param1;
          WhirlpoolHasher.a(param0, 39);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "qd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        if (guard) {
          return;
        }
        field_n = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param2 != -8) {
          field_l = false;
        }
        if (param0) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (!param1) {
          return NineSliceFrame.field_f[var4];
        }
        var4++;
        return NineSliceFrame.field_f[var4];
    }

    final static void a(boolean param0) {
        int var1;
        int var2 = EscapeVector.obfuscationControl;
        AccountPanelInputSupport.field_b = null;
        if (param0) {
          SavedDataQuery.field_i = false;
          if (DialWidget.field_H) {
            SavedDataRequestSupport.requestDialog.showConnectionRestoredMessage(94);
            return;
          }
          var1 = LaserGateSpan.field_g;
          if (var1 > 0) {
            if (var1 == 1) {
              AccountPanelInputSupport.field_b = MeshProjectionSupport.field_a;
            } else {
              AccountPanelInputSupport.field_b = SingleChildContainer.a(RasterSnapshot.field_j, -63, new String[]{Integer.toString(var1)});
            }
            AccountPanelInputSupport.field_b = Js5NetworkRequest.joinText((byte) -31, new CharSequence[]{(CharSequence) ((Object) AccountPanelInputSupport.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) DropTargetWidget.field_I)});
          }
          SavedDataRequestSupport.requestDialog.closeDialog(-18861);
          ImageProducerRasterBuffer.showLoadingProgressDialog(32);
          return;
        }
        field_n = (IntrusiveDeque) null;
        SavedDataQuery.field_i = false;
        if (DialWidget.field_H) {
          SavedDataRequestSupport.requestDialog.showConnectionRestoredMessage(94);
        } else {
          var1 = LaserGateSpan.field_g;
          if (var1 > 0) {
            if (var1 == 1) {
              AccountPanelInputSupport.field_b = MeshProjectionSupport.field_a;
            } else {
              AccountPanelInputSupport.field_b = SingleChildContainer.a(RasterSnapshot.field_j, -63, new String[]{Integer.toString(var1)});
            }
            AccountPanelInputSupport.field_b = Js5NetworkRequest.joinText((byte) -31, new CharSequence[]{(CharSequence) ((Object) AccountPanelInputSupport.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) DropTargetWidget.field_I)});
          }
          SavedDataRequestSupport.requestDialog.closeDialog(-18861);
          ImageProducerRasterBuffer.showLoadingProgressDialog(32);
        }
    }

    AchievementRecord(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param4;
        this.field_i = param3;
        this.field_g = param5;
        this.field_k = param2;
        this.field_h = param1;
        this.field_m = param0;
    }

    static {
        field_n = new IntrusiveDeque();
        field_l = true;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String chooseAlternateClickPromptWithIntGuard(boolean firstFlag, boolean secondFlag, int guard, boolean thirdFlag) {
        int var4 = 0;
        if (guard != -8) {
          field_l = false;
        }
        if (firstFlag) {
          var4 += 4;
        }
        if (thirdFlag) {
          var4 += 2;
        }
        if (!secondFlag) {
          return NineSliceFrame.field_f[var4];
        }
        var4++;
        return NineSliceFrame.field_f[var4];
    }
}
