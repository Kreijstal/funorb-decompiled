/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pia extends UiArrayContainer implements UiActionListener {
    private DateOfBirthTextFields field_v;
    private UiFocusableComponent field_w;
    static GpuProjectionMode field_x;

    public static void clearSharedReferences(int param0) {
        int var1 = -60 / ((-23 - param0) / 52);
        field_x = null;
    }

    final void layoutChildren(int param0) {
        int var2 = 250;
        if (param0 == 16777215) {
          this.field_v.setBounds(-var2 + this.width >> 1, 140, 25, param0 - 16777214, this.height + 20 - 25 >> 1);
          this.field_w.setBounds((-var2 + this.width >> 1) + 150, 100, 30, 1, (20 + (this.height - 30) >> 1) + 2);
          return;
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_w.enabled = this.field_v.getValidator(param2 ^ 782443887).getValidationState((byte) 35) == GetShipPersistence.validInput ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pia(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (UiRenderer) null);
        this.field_v = new DateOfBirthTextFields(new GradientBorderTextStyle(10000536), SetMissilesHitSourceTeam.field_p, 0, 0, 140, 25);
        this.field_v.setValidator(99, new DateOfBirthValidator());
        this.field_w = new UiFocusableComponent(tn.field_b, (UiListener) (this));
        this.children = new UiComponent[]{(UiComponent) ((Object) this.field_v), (UiComponent) ((Object) this.field_w)};
        this.field_w.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
        this.refreshLayout(false);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, 80, param3);
        SetTorpedoProjectileLife.field_o.draw(pea.field_c, 4 + (param0 + this.x), 4 + param3 + (this.y + SetTorpedoProjectileLife.field_o.maxAscent), 16777215, -1);
        if (param2 < 47) {
          UiFocusableComponent var6 = (UiFocusableComponent) null;
          this.onAction(46, -102, -40, (UiFocusableComponent) null, -107);
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        if (param0 != 11) {
          this.field_v = (DateOfBirthTextFields) null;
        }
        if (this.field_v.getValidator(param0 ^ -782444209).getValidationState((byte) 35) != GetShipPersistence.validInput) {
          return;
        }
        try {
          SetArmageddonWarning.b(0, this.field_v.getDayOfMonth(-5), this.field_v.getMonthIndex(true), this.field_v.getYear(3476));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pia.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_x = new GpuProjectionMode();
    }
}
