/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static RgbSprite[] field_b;
    static String field_a;

    final static void a(boolean param0) {
        if (null != UiWidget.field_u) {
          RichTextLayout.a(!param0 ? true : false, UiWidget.field_u);
          UiWidget.field_u = null;
          SingleChildWidgetContainer.g(-4258);
        }
        ka.field_N = cc.a(1, -14245);
        GameCanvas.field_a = cc.a(2, -14245);
        i.field_u = cc.a(3, -14245);
        PasswordValidator.field_j = cc.a(4, -14245);
        ih.field_d = cc.a(5, -14245);
        EditableTextField.field_U = cc.a(12, -14245);
        oj.field_C = cc.a(6, -14245);
        jd.field_b = cc.a(7, -14245);
        AccountCreationResultPanel.field_Bb = cc.a(8, -14245);
        PrimaryNodeDeque.field_b = cc.a(9, -14245);
        dg.field_n = new ad(50);
        dg.field_n.a(param0, fi.field_b, dl.field_a, pb.field_e, "basic");
        dg.field_n.a((byte) -6, ka.field_N, un.field_b, NameSuggestionsPanel.field_P);
        dg.field_n.a((byte) -6, GameCanvas.field_a, d.field_f, DualLinkNode.field_n);
        dg.field_n.a((byte) -6, i.field_u, d.field_f, DualLinkNode.field_n);
        dg.field_n.a((byte) -6, PasswordValidator.field_j, d.field_f, DualLinkNode.field_n);
        dg.field_n.a((byte) -6, ih.field_d, fi.field_b, dl.field_a);
        dg.field_n.a((byte) -6, EditableTextField.field_U, pb.field_a, ByteStorage.field_d);
        dg.field_n.a((byte) -6, oj.field_C, PrimaryNodeDeque.field_g, vk.field_x);
        dg.field_n.a((byte) -6, jd.field_b, TextLineMetrics.field_g, af.field_U);
        dg.field_n.a((byte) -6, AccountCreationResultPanel.field_Bb, TextLineMetrics.field_g, af.field_U);
        dg.field_n.a((byte) -6, PrimaryNodeDeque.field_b, uc.field_cb, ResizableModalDialog.field_bb);
    }

    final static bn a(byte param0) {
        int var1 = 106 % ((-44 - param0) / 58);
        return new bn(qj.a(1), fa.a((byte) -69));
    }

    public static void clearStaticReferences(int param0) {
        field_a = null;
        if (param0 != 6) {
          return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 >= -98) {
          field_a = (String) null;
          wl.a(-78, param1, false);
          return;
        }
        wl.a(-78, param1, false);
    }

    static {
        field_a = "Retry";
    }
}
