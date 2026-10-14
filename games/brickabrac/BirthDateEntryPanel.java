/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateEntryPanel extends ArrayWidgetGroup implements WidgetActionListener {
    static UiComponent field_R;
    static String field_O;
    private DateFieldsWidget dateFields;
    static String field_N;
    private FocusableWidget continueButton;

    public static void d(boolean param0) {
        field_R = null;
        field_N = null;
        if (param0) {
          BirthDateEntryPanel.d(false);
          field_O = null;
          return;
        }
        field_O = null;
    }

    BirthDateEntryPanel(int x, int y, int width, int height) {
        super(x, y, width, height, (WidgetRenderer) null);
        this.dateFields = new DateFieldsWidget(new TextFieldRenderer(10000536), RasterSnapshot.field_j, 0, 0, 140, 25);
        this.dateFields.setBirthDateValidator(new BirthDateValidator(), (byte) -12);
        this.continueButton = new FocusableWidget(UsernameSuggestionPanel.field_L, (WidgetListener) (this));
        this.children = new Widget[]{(Widget) ((Object) this.dateFields), (Widget) ((Object) this.continueButton)};
        this.continueButton.renderer = (WidgetRenderer) ((Object) new ButtonWidgetRenderer());
        this.relayout(1);
    }

    final void layoutChildren(int obfuscationGuard) {
        int var2 = 250;
        this.dateFields.setBounds(25, -var2 + this.width >> 1, this.height - 5 >> 1, (byte) -119, obfuscationGuard);
        this.continueButton.setBounds(30, 140 + (-var2 + this.width >> 1) + 10, (20 + (this.height - 30) >> 1) + 2, (byte) -119, 100);
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        if (this.dateFields.getValidationSource(-11011).getValidationStatus((byte) -31) != DualLinkIterator.validationValid) {
          return;
        }
        try {
          df.a(this.dateFields.getYear(5390), (byte) 103, this.dateFields.getDay((byte) -125), this.dateFields.getMonthIndex((byte) -117));
          if (obfuscationGuard >= -22) {
            BirthDateEntryPanel.d(true);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mo.Q(" + pointerY + ',' + button + ',' + obfuscationGuard + ',' + pointerX + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.continueButton.enabled = this.dateFields.getValidationSource(-11011).getValidationStatus((byte) -31) == DualLinkIterator.validationValid ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mo.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        QuickChatMenu.field_Yb.drawLeft(MusicEnvelope.field_i, 4 + (this.x + parentX), 4 + parentY + (this.y + QuickChatMenu.field_Yb.ascent), 16777215, -1);
    }

    static {
        field_O = "Single-player game";
        field_N = "You've beaten the game!";
    }
}
