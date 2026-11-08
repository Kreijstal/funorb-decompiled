/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends UiContainer implements ValidationProviderSource {
    private DateOfBirthValidator field_D;
    static String field_F;
    static BitmapFont field_C;
    static ResourceArchive field_E;

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int getDay(int param0);

    public static void releaseStatics(int param0) {
        if (param0 > 34) {
          field_F = null;
          field_C = null;
          field_E = null;
          return;
        }
        field_E = (ResourceArchive) null;
        field_F = null;
        field_C = null;
        field_E = null;
    }

    void setValidator(DateOfBirthValidator param0, byte param1) {
        try {
          this.field_D = param0;
          int var3_int = -119 / ((63 - param1) / 47);
          this.field_D.field_h = this;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "mg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int getMonth(int param0);

    public final ValidationProvider getValidationProvider(int param0) {
        if (param0 != 0) {
          field_C = (BitmapFont) null;
          return (ValidationProvider) ((Object) this.field_D);
        }
        return (ValidationProvider) ((Object) this.field_D);
    }

    abstract int getYear(boolean param0);

    abstract boolean isIncomplete(int param0);

    static {
        field_F = "Curve of Sight";
    }
}
