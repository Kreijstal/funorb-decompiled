/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextWidget extends EditableTextWidget implements ValidationSource {
    private TextValidator field_fb;
    static String field_db;
    static String field_eb;
    private int field_gb;

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        super.updatePointer(param0, param1, param2, param3);
        if (!param3) {
          return;
        }
        try {
          this.field_gb = ContextMenu.field_Nb - this.field_t - param1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fo.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ValidatedTextWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final void notifyTextChanged(int param0) {
        super.notifyTextChanged(param0);
        if (this.field_fb != null) {
          this.field_fb.restartDebounce(118);
        }
    }

    final void setValidationSource(byte param0, TextValidator param1) {
        try {
          this.field_fb = param1;
          int var3_int = -96 % ((-9 - param0) / 48);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fo.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(int param0) {
        if (!this.field_r) {
          return null;
        }
        if (null == this.field_C) {
          return null;
        }
        if (param0 == 0) {
          IntroFinalFrameHelpers.setPointerAnchor((byte) -77, this.field_F - this.field_gb + ContextMenu.field_Nb, ClientProtocolStage.field_a);
          return this.field_C;
        }
        return (String) null;
    }

    public static void releaseStatics(int param0) {
        field_db = null;
        field_eb = null;
        if (param0 != 29790) {
          field_db = (String) null;
        }
    }

    public final TextValidator getValidationSource(int param0) {
        if (param0 >= -100) {
          TextValidator var3 = (TextValidator) null;
          this.setValidationSource((byte) -21, (TextValidator) null);
          return this.field_fb;
        }
        return this.field_fb;
    }

    static {
        field_db = "Rankings";
        field_eb = "Visit the Account Management section on the main site to view.";
    }
}
