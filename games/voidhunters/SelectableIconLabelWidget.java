/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SelectableIconLabelWidget extends Widget {
    static int field_wb;
    static int field_yb;
    private Widget labelWidget;
    private Widget iconWidget;

    private SelectableIconLabelWidget(long param0, Widget param1, Widget param2, String param3) {
        super(param0, (Widget) null);
        try {
          this.iconWidget = new Widget(0L, param1);
          this.labelWidget = new Widget(0L, param2);
          this.labelWidget.text = param3;
          this.addChild(-561, this.iconWidget);
          this.addChild(-561, this.labelWidget);
          this.inheritInteractionStateInDescendants(123);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void pushClip(int param0, int param1, int param2, boolean param3, int param4) {
        if (param3) {
          SetOndamageParticleSpeed.pushRasterState(3);
          SoftwareRasterizer2D.intersectClip(param2, param4, param0, param1);
          return;
        }
        field_yb = 104;
        SetOndamageParticleSpeed.pushRasterState(3);
        SoftwareRasterizer2D.intersectClip(param2, param4, param0, param1);
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
          return;
        }
        this.setBounds(param0, 121, param4, param3, param1);
        this.layoutContents(param2, 64);
    }

    private final void layoutContents(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 == 64) {
          this.iconWidget.setBounds(0, -57, this.iconWidget.getPreferredWidth(78), 0, this.height);
          var3 = param0 + this.iconWidget.width;
          this.labelWidget.setBounds(var3, 120, this.width - var3, 0, this.height);
          return;
        }
        field_wb = -46;
        this.iconWidget.setBounds(0, -57, this.iconWidget.getPreferredWidth(78), 0, this.height);
        var3Lifetime1 = param0 + this.iconWidget.width;
        this.labelWidget.setBounds(var3Lifetime1, 120, this.width - var3Lifetime1, 0, this.height);
    }

    SelectableIconLabelWidget(long param0, SelectableIconLabelWidget param1, String param2) {
        this(param0, param1.iconWidget, param1.labelWidget, param2);
    }

    final int measurePreferredWidth(int param0, int param1) {
        if (param1 == 0) {
          return this.iconWidget.getPreferredWidth(param1 ^ 80) + (param0 + this.labelWidget.getPreferredWidth(param1 ^ 61));
        }
        field_yb = -94;
        return this.iconWidget.getPreferredWidth(param1 ^ 80) + (param0 + this.labelWidget.getPreferredWidth(param1 ^ 61));
    }

    SelectableIconLabelWidget(long param0, Sprite param1, Sprite param2, int param3, Widget param4, String param5) {
        this(param0, (Widget) null, param4, param5);
        try {
          this.iconWidget.field_q = param1;
          this.iconWidget.field_tb = param2;
          this.iconWidget.field_B = param3;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_wb = 64;
        field_yb = 0;
    }
}
