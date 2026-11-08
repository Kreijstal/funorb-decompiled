/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends WidgetContainer implements ValidationProvider {
    static UiLayoutNode field_D;
    private DateInputValidator field_B;
    static String field_H;
    static int field_G;
    static String field_E;
    static String field_F;

    abstract boolean hasMissingDateParts(boolean param0);

    abstract int getYear(int param0);

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6) {
        String var7 = null;
        if (NodeHashTableIterator.field_b == 2) {
          var7 = ModelMaterialDecoder.field_e;
        } else {
          var7 = LoginDialog.field_db;
        }
        if (!param4) {
          TeamSelectionView.a(param0, var7, param6, param3, param2, 73, param5, param1);
          return;
        }
        DateInputWidget.releaseStatics(-38);
        TeamSelectionView.a(param0, var7, param6, param3, param2, 73, param5, param1);
    }

    void setValidator(DateInputValidator param0, int param1) {
        try {
          this.field_B = param0;
          if (param1 != -20274) {
            DateInputWidget.releaseStatics(-16);
          }
          this.field_B.dateInput = this;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "cj.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int getDay(int param0);

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_F = null;
        field_E = null;
        if (param0 > -88) {
          DateInputWidget.k(94);
          field_D = null;
          return;
        }
        field_D = null;
    }

    final static int k(int param0) {
        if (param0 != 256) {
          DateInputWidget.k(38);
          return 256;
        }
        return 256;
    }

    abstract int getMonthIndex(byte param0);

    public final ValidationSource getValidationSource(byte param0) {
        if (param0 > -107) {
          return (ValidationSource) null;
        }
        return (ValidationSource) ((Object) this.field_B);
    }

    static {
        field_E = "Replace";
        field_H = "Respect";
        field_F = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
