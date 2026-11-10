/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ada extends ArrayWidgetGroup implements tsa {
    static ura field_z;
    private DateFieldsWidget field_x;
    static int[] field_y;
    private FocusableWidget field_B;

    public static void releaseStatics(int param0) {
        if (param0 >= -122) {
          field_z = (ura) null;
          field_y = null;
          field_z = null;
          return;
        }
        field_y = null;
        field_z = null;
    }

    public final void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        if (param4 < 44) {
          UiWidget var7 = (UiWidget) null;
          this.updatePointerState(-16, -96, (UiWidget) null, 107);
        }
        if (this.field_x.a((byte) 124).b(-4666) != uh.field_k) {
          return;
        }
        try {
          kv.a(this.field_x.getYear(22829), this.field_x.a(109), 95, this.field_x.getDay((byte) 110));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ada.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        super.renderLayer(param0, param1, param2, param3);
        eka.field_o.c(mca.field_d, this.field_i + (param0 + 4), 4 + (eka.field_o.field_w + (this.field_n + param1)), 16777215, -1);
    }

    ada(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (isa) null);
        this.field_x = new DateFieldsWidget(new hga(10000536), GraphicsToolkit.field_b, 0, 0, 140, 25);
        this.field_x.a((byte) 111, new uba());
        this.field_B = new FocusableWidget(aua.field_d, (qc) (this));
        this.children = new UiWidget[]{(UiWidget) ((Object) this.field_x), (UiWidget) ((Object) this.field_B)};
        this.field_B.field_r = (isa) ((Object) new td());
        this.refreshLayout((byte) 127);
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_B.field_y = this.field_x.a((byte) 47).b(-4666) == uh.field_k ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ada.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int b(boolean param0) {
        if (param0) {
          ada.releaseStatics(-7);
          return tu.field_h;
        }
        return tu.field_h;
    }

    final void layoutChildren(byte param0) {
        int var2 = 250;
        if (param0 == 88) {
          this.field_x.setBounds((byte) -31, 140, 25, this.field_m - var2 >> 1, this.field_p + 20 - 25 >> 1);
          this.field_B.setBounds((byte) -31, 100, 30, 10 + (140 + (this.field_m - var2 >> 1)), (-30 + this.field_p + 20 >> 1) + 2);
          return;
        }
        field_y = (int[]) null;
        this.field_x.setBounds((byte) -31, 140, 25, this.field_m - var2 >> 1, this.field_p + 20 - 25 >> 1);
        this.field_B.setBounds((byte) -31, 100, 30, 10 + (140 + (this.field_m - var2 >> 1)), (-30 + this.field_p + 20 >> 1) + 2);
    }

    static {
        field_z = new ura();
        field_y = new int[8192];
    }
}
