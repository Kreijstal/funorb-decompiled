/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static int field_l;
    private java.nio.ByteBuffer field_g;
    static String field_f;
    static String field_h;
    static int field_i;
    static String field_k;
    static String field_e;
    static String field_j;

    DirectByteStorage() {
    }

    final static void updateCameraOrbit(float param0, boolean param1, float param2) {
        if (param1) {
          return;
        }
        if (BitCountAndDialogHelpers.field_c == 2 ||
          1 == MidiNote.field_C) {
          return;
        }
        CheckboxPainter.field_r = CheckboxPainter.field_r + param0;
        if (BitCountAndDialogHelpers.field_c == 1) {
          BitCountAndDialogHelpers.field_c = 0;
        }
        if (CheckboxPainter.field_r < 116.0f) {
          if (BitCountAndDialogHelpers.field_c == 2) {
            CommonUiHelpers.field_c = CommonUiHelpers.field_c + param2;
            if (!(CheckboxPainter.field_r > 295.0f)) {
              if (!ResizableDialog.field_Y[25]) {
                SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
                SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
                MarkerSlider.updateCameraMatrix((byte) -44);
                DraggableWidget.field_E = UiTheme.field_r;
                return;
              }
              CommonUiHelpers.field_c = 3.1415927410125732f;
              SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
              SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
              MarkerSlider.updateCameraMatrix((byte) -44);
              DraggableWidget.field_E = UiTheme.field_r;
              return;
            }
            CheckboxPainter.field_r = 295.0f;
            if (ResizableDialog.field_Y[25]) {
              CommonUiHelpers.field_c = 3.1415927410125732f;
              SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
              SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
              MarkerSlider.updateCameraMatrix((byte) -44);
              DraggableWidget.field_E = UiTheme.field_r;
              return;
            }
            SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
            SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
            MarkerSlider.updateCameraMatrix((byte) -44);
            DraggableWidget.field_E = UiTheme.field_r;
            return;
          }
          CheckboxPainter.field_r = 116.0f;
        }
        CommonUiHelpers.field_c = CommonUiHelpers.field_c + param2;
        if (CheckboxPainter.field_r > 295.0f) {
          CheckboxPainter.field_r = 295.0f;
          if (!ResizableDialog.field_Y[25]) {
            SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
            SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
            MarkerSlider.updateCameraMatrix((byte) -44);
            DraggableWidget.field_E = UiTheme.field_r;
            return;
          }
          CommonUiHelpers.field_c = 3.1415927410125732f;
          SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
          SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
          MarkerSlider.updateCameraMatrix((byte) -44);
          DraggableWidget.field_E = UiTheme.field_r;
          return;
        }
        if (!ResizableDialog.field_Y[25]) {
          SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
          SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
          MarkerSlider.updateCameraMatrix((byte) -44);
          DraggableWidget.field_E = UiTheme.field_r;
          return;
        }
        CommonUiHelpers.field_c = 3.1415927410125732f;
        SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
        SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
        MarkerSlider.updateCameraMatrix((byte) -44);
        DraggableWidget.field_E = UiTheme.field_r;
    }

    final void setBytes(byte[] param0, byte param1) {
        try {
          this.field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_g.position(0);
          this.field_g.put(param0);
          if (param1 != -4) {
            this.toByteArray(105);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "tl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] toByteArray(int param0) {
        byte[] var3 = null;
        byte[] var2 = null;
        byte[] var3Lifetime1;
        byte[] var2Lifetime1;
        if (param0 >= 73) {
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
          return var3;
        }
        this.field_g = (java.nio.ByteBuffer) null;
        var3Lifetime1 = new byte[this.field_g.capacity()];
        var2Lifetime1 = var3Lifetime1;
        this.field_g.position(0);
        this.field_g.get(var3Lifetime1);
        return var3Lifetime1;
    }

    public static void releaseStatics(byte param0) {
        int var1 = -62 % ((param0 - 26) / 42);
        field_k = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_f = null;
    }

    static {
        field_f = "Player";
        field_h = "Name";
        field_k = "Ignore";
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
