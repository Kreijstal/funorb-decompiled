/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthEntryPanel extends UiArrayContainer implements UiActionListener {
    private DateOfBirthTextFields dateFields;
    private UiFocusableComponent continueButton;
    static GpuProjectionMode field_x;

    public static void clearSharedReferences(int param0) {
        int var1 = -60 / ((-23 - param0) / 52);
        field_x = null;
    }

    final void layoutChildren(int param0) {
        int var2 = 250;
        if (param0 == 16777215) {
          this.dateFields.setBounds(-var2 + this.width >> 1, 140, 25, param0 - 16777214, this.height + 20 - 25 >> 1);
          this.continueButton.setBounds((-var2 + this.width >> 1) + 150, 100, 30, 1, (20 + (this.height - 30) >> 1) + 2);
          return;
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.continueButton.enabled = this.dateFields.getValidator(param2 ^ 782443887).getValidationState((byte) 35) == GetShipPersistence.validInput ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    DateOfBirthEntryPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (UiRenderer) null);
        this.dateFields = new DateOfBirthTextFields(new GradientBorderTextStyle(10000536), SetMissilesHitSourceTeam.field_p, 0, 0, 140, 25);
        this.dateFields.setValidator(99, new DateOfBirthValidator());
        this.continueButton = new UiFocusableComponent(NativeModelIntValue.field_b, (UiListener) (this));
        this.children = new UiComponent[]{(UiComponent) ((Object) this.dateFields), (UiComponent) ((Object) this.continueButton)};
        this.continueButton.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
        this.refreshLayout(false);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, 80, param3);
        SetTorpedoProjectileLife.field_o.draw(PlayerContextMenus.field_c, 4 + (param0 + this.x), 4 + param3 + (this.y + SetTorpedoProjectileLife.field_o.maxAscent), 16777215, -1);
        if (param2 < 47) {
          UiFocusableComponent var6 = (UiFocusableComponent) null;
          this.onAction(46, -102, -40, (UiFocusableComponent) null, -107);
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        if (param0 != 11) {
          this.dateFields = (DateOfBirthTextFields) null;
        }
        if (this.dateFields.getValidator(param0 ^ -782444209).getValidationState((byte) 35) != GetShipPersistence.validInput) {
          return;
        }
        try {
          SetArmageddonWarning.b(0, this.dateFields.getDayOfMonth(-5), this.dateFields.getMonthIndex(true), this.dateFields.getYear(3476));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "pia.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_x = new GpuProjectionMode();
    }
}
