/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends sh {
    static boolean[] decodedSpriteHasNonOpaqueAlpha;
    private IntrusiveDeque field_C;
    static int rotatedEntityScreenX;
    static BitmapFont field_F;

    final void f(int param0) {
        int var4 = Geoblox.clientControlFlowFlag;
        gb var2 = new gb(this.field_C);
        FadingDialog var3 = (FadingDialog) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.dialogVisible = false;
            var3 = (FadingDialog) ((Object) var2.a((byte) 125));
        }
        if (param0 != 10936) {
            return;
        }
        this.field_A = null;
    }

    final void a(boolean param0, el param1) {
        FadingDialog var3 = null;
        try {
            if (!(param1 instanceof FadingDialog)) {
                throw new IllegalArgumentException();
            }
            var3 = (FadingDialog) ((Object) param1);
            this.field_C.addFirst(var3, param0);
            var3.dialogVisible = true;
            var3.a((byte) -37, (el) (this));
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ng.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var8 = Geoblox.clientControlFlowFlag;
        if (null != this.field_q) {
            this.field_q.a(parentX, -70, parentY, true, (el) (this));
        }
        int var6 = 75 / ((1 - methodGuard) / 43);
        gb var5 = new gb(this.field_C);
        el var7 = (el) ((Object) var5.d(1));
        while (var7 != null) {
            var7.renderWidget(parentX + this.widgetX, parentY + this.widgetY, (byte) -106, renderPass);
            var7 = (el) ((Object) var5.c(26));
        }
    }

    final static void g(int param0) {
        if (param0 != -13912) {
            return;
        }
        sl.field_k = new IntrusiveDeque();
    }

    final static void h(int param0) {
        fj.field_p.b();
        oh.field_a.b();
        if (param0 <= 9) {
            rotatedEntityScreenX = -2;
        }
    }

    final void l(int param0) {
        int var4 = Geoblox.clientControlFlowFlag;
        gb var2 = new gb(this.field_C);
        if (param0 != 0) {
            return;
        }
        FadingDialog var3 = (FadingDialog) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.settleDialogAnimation(229)) {
                var3.unlinkNode(false);
            }
            var3 = (FadingDialog) ((Object) var2.a((byte) 112));
        }
    }

    public ng() {
        super(0, 0, kb.field_b, fa.field_i, (dh) null, (bb) null);
        this.field_C = new IntrusiveDeque();
    }

    final el e(int param0) {
        int var4 = Geoblox.clientControlFlowFlag;
        gb var2 = new gb(this.field_C);
        FadingDialog var3 = (FadingDialog) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (!(!var3.dialogVisible)) {
                return var3.f((byte) -79);
            }
            var3 = (FadingDialog) ((Object) var2.a((byte) 119));
        }
        if (param0 == -4863) {
            return null;
        }
        rotatedEntityScreenX = 111;
        return null;
    }

    final void i(int param0) {
        int var4 = Geoblox.clientControlFlowFlag;
        gb var2 = new gb(this.field_C);
        FadingDialog var3 = (FadingDialog) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.advanceDialogAnimation(-1)) {
                var3.unlinkNode(false);
            }
            var3 = (FadingDialog) ((Object) var2.a((byte) 115));
        }
        this.field_A = (el) ((Object) this.j(100));
        if (param0 >= -14) {
            field_F = (BitmapFont) null;
        }
    }

    public static void k(int param0) {
        field_F = null;
        decodedSpriteHasNonOpaqueAlpha = null;
        if (param0 >= -53) {
            decodedSpriteHasNonOpaqueAlpha = (boolean[]) null;
        }
    }

    final FadingDialog j(int param0) {
        int var4 = Geoblox.clientControlFlowFlag;
        gb var2 = new gb(this.field_C);
        FadingDialog var3 = (FadingDialog) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            if (var3.dialogVisible) {
                return var3;
            }
            var3 = (FadingDialog) ((Object) var2.a((byte) 111));
        }
        if (param0 >= 57) {
            return null;
        }
        this.e(89);
        return null;
    }

    static {
    }
}
