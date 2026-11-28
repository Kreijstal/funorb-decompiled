/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareScanlineMask extends GlyphMask {
    static int field_e;
    int[] field_h;
    int[] field_g;
    static qo field_f;

    final static void showLoadingPanel(int param0) {
        AgeValidator.field_f.closeAllDialogs((byte) 116);
        if (fu.field_d != null) {
          AgeValidator.field_f.showDialog(fu.field_d, 0);
          int var1 = -46 / ((11 - param0) / 46);
          return;
        }
        fu.field_d = new ProgressDialog(AgeValidator.field_f, uf.field_e);
        AgeValidator.field_f.showDialog(fu.field_d, 0);
        int var1Lifetime1 = -46 / ((11 - param0) / 46);
    }

    final static void initializeLoginUi(int param0) {
        if (param0 != -8129) {
          return;
        }
        ArchiveRequest.field_n = ka.b((byte) 116);
        AgeValidator.field_f = new ModalDialogHost();
        DraggableWidgetContainer.a(true, true, true);
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != -59) {
          field_f = (qo) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    private SoftwareScanlineMask() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new qo();
    }
}
