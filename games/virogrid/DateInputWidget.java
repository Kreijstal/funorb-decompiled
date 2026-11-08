/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends WidgetContainer implements ValidationProvider {
    private DateOfBirthValidator field_D;

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetListener param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final TextValidator getValidationSource(int param0) {
        if (param0 != -1) {
          return (TextValidator) null;
        }
        return (TextValidator) ((Object) this.field_D);
    }

    abstract int getMonthIndex(int param0);

    abstract int getYear(boolean param0);

    abstract boolean isDateIncomplete(int param0);

    void setBirthDateValidator(int param0, DateOfBirthValidator param1) {
        try {
          this.field_D = param1;
          this.field_D.field_h = this;
          if (param0 != 2) {
            this.getValidationSource(-16);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "rd.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int getDay(int param0);

    static {
    }
}
