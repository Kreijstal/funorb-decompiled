/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TertiaryLinkNode extends DualLinkNode {
    static int field_s;
    static String field_u;
    static AntialiasedBitmapFont field_r;
    static String field_q;
    TertiaryLinkNode tertiaryNext;
    TertiaryLinkNode tertiaryPrevious;
    static String field_t;

    final static void f(int param0) {
        int var2 = 0;
        int var1 = bl.getMenuWidth(-42);
        int var2Lifetime1;
        if (param0 == -4604) {
          var2 = ii.getContextMenuHeight((byte) -126);
          qf.field_c.drawFrame(-ic.field_g + eb.field_M, IntrusiveDequeCursor.field_i - SecondaryNodeDeque.field_a, (SecondaryNodeDeque.field_a << 1) + var1, var2 + (ic.field_g << 1), 12018);
          NodeHashTableIterator.b(-125);
          return;
        }
        field_t = (String) null;
        var2Lifetime1 = ii.getContextMenuHeight((byte) -126);
        qf.field_c.drawFrame(-ic.field_g + eb.field_M, IntrusiveDequeCursor.field_i - SecondaryNodeDeque.field_a, (SecondaryNodeDeque.field_a << 1) + var1, var2Lifetime1 + (ic.field_g << 1), 12018);
        NodeHashTableIterator.b(-125);
    }

    final void unlinkTertiary(byte param0) {
        if (null == this.tertiaryPrevious) {
          return;
        }
        if (param0 == -70) {
          this.tertiaryPrevious.tertiaryNext = this.tertiaryNext;
          this.tertiaryNext.tertiaryPrevious = this.tertiaryPrevious;
          this.tertiaryPrevious = null;
          this.tertiaryNext = null;
          return;
        }
        TertiaryLinkNode.f(-48);
        this.tertiaryPrevious.tertiaryNext = this.tertiaryNext;
        this.tertiaryNext.tertiaryPrevious = this.tertiaryPrevious;
        this.tertiaryPrevious = null;
        this.tertiaryNext = null;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        uk.field_S = param0;
        if (MessageDialogContent.field_L == null) {
          var2 = 8 % ((-28 - param1) / 48);
          if (ra.field_m != null) {
            ra.field_m.a(param0, 18813);
          }
          return;
        }
        MessageDialogContent.field_L.setMasterVolume(param0, (byte) 116);
        var2Lifetime1 = 8 % ((-28 - param1) / 48);
        if (ra.field_m != null) {
          ra.field_m.a(param0, 18813);
        }
    }

    protected TertiaryLinkNode() {
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        vg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != 126) {
            TertiaryLinkNode.a(-116, -3);
          }
          var4 = (vg) (GameApplet.field_i.last(param0 - 74));
          while (var4 != null) {
            vi.a(param1, var4, (byte) -123);
            var4 = (vg) (GameApplet.field_i.previous(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ff.IA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_u = null;
        field_t = null;
        if (param0 != -1130232991) {
          field_r = (AntialiasedBitmapFont) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    static {
        field_u = "Auto-respond to <%0>";
        field_q = "Extra knowledge is extra power. Get yourself yet another powerup slot with this trait.";
        field_t = "Create unrated game";
    }
}
