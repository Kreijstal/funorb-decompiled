/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateChatEnableForm extends ArrayWidgetContainer implements WidgetActivationListener {
    static int decodedSpriteCanvasHeight;
    private NumericDateInputWidget dateInput;
    static int campaignPacketWord3;
    private InteractiveWidget submitButton;

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        super.drawWidget(originX, originY, (byte) -114, renderLayer);
        if (obfuscationGuard >= -82) {
          Widget var6 = (Widget) null;
          this.updatePointer(51, -1, -80, (Widget) null);
        }
        gl.field_e.drawText(QuickChatMenu.field_Nb, originX - (-this.x - 4), 4 + (originY + this.y) + gl.field_e.maxAscent, 16777215, -1);
    }

    BirthDateChatEnableForm(int x, int y, int width, int height) {
        super(x, y, width, height, (WidgetPainter) null);
        this.dateInput = new NumericDateInputWidget(new TextEntryWidgetPainter(10000536), c.field_c, 0, 0, 140, 25);
        this.dateInput.setDateValidator((byte) -101, new DateOfBirthValidator());
        this.submitButton = new InteractiveWidget(ProgressMessageDialog.field_kb, (WidgetListener) (this));
        this.children = new Widget[]{(Widget) ((Object) this.dateInput), (Widget) ((Object) this.submitButton)};
        this.submitButton.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
        this.refreshLayout(0);
    }

    final void layoutChildren(byte obfuscationGuard) {
        int controlGroupWidth = 250;
        if (obfuscationGuard < 84) {
          this.dateInput = (NumericDateInputWidget) null;
        }
        this.dateInput.setBounds(-controlGroupWidth + this.width >> 1, 140, -25 + (this.height + 20) >> 1, 8192, 25);
        this.submitButton.setBounds(10 + ((-controlGroupWidth + this.width >> 1) + 140), 100, 2 + (-30 + this.height + 20 >> 1), 8192, 30);
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          bw.field_g = true;
          ToggleWidget.field_Q.text = param1;
          var2_int = so.field_b.field_a;
          var3 = so.field_b.field_g;
          var4 = ToggleWidget.field_Q.font.getParagraphHeight(param1, 272, ToggleWidget.field_Q.textLineSpacing);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          if (param0 < 27) {
            decodedSpriteCanvasHeight = -20;
          }
          GameClock.field_c.setBounds(-(var5 * 2) + (-120 + var3), -20500, 320, var5, (var2_int - 320) / 2);
          GameClock.field_c.skinSprites = tq.a(11579568, false, GameClock.field_c.height, 2105376, 3, 8421504);
          ToggleWidget.field_Q.setBounds(-20 + (GameClock.field_c.height - 24), -20500, GameClock.field_c.width - 48, 16, 24);
          LinkButtonPainter.field_g.setBounds(24, -20500, 80, GameClock.field_c.height - 20 - 24, 120);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        if (this.dateInput.getValidationSource(-918933630).getValidationState(false) != oo.validationValid) {
          return;
        }
        if (obfuscationGuard != 11) {
          return;
        }
        try {
          BitmapTextLayout.sendBirthDateForChat(this.dateInput.getDay(obfuscationGuard ^ 35), this.dateInput.getMonthIndex(-26458), this.dateInput.getYear((byte) -77), 30);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.N(" + pointerX + ',' + obfuscationGuard + ',' + button + ',' + pointerY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isTextNavigationSeparator(char character, byte obfuscationGuard) {
        boolean stackIn_8_0 = false;
        if (obfuscationGuard != 95) {
          return false;
        }
        stackIn_8_0 = (character == 32) || (character == 40) || (character == 41);
        return stackIn_8_0;
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          this.submitButton.enabled = this.dateInput.getValidationSource(-918933630).getValidationState(false) == oo.validationValid ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, aj param1, int param2) {
        CipherPacketBuffer var8 = null;
        CipherPacketBuffer var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8 = EmailValidator.outgoingPacket;
          var9 = var8;
          var9.writeCipheredOpcode(32161, param2);
          var9.position = var9.position + 1;
          var4 = var9.position;
          var9.writeByte(1, 1);
          var9.writeShort(true, param1.field_s);
          var9.writeShort(true, param1.field_n);
          var9.writeShort(true, param1.field_q);
          var9.writeInt((byte) -99, param1.field_k);
          var9.writeInt((byte) -92, param1.field_m);
          var9.writeInt((byte) -103, param1.field_o);
          var9.writeInt((byte) -62, param1.field_r);
          var9.writeByte(1, param1.field_l.length);
          for (var5 = 0; var5 < param1.field_l.length; var5++) {
            var8.writeInt((byte) -70, param1.field_l[var5]);
          }
          if (param0 >= -26) {
            aj var7 = (aj) null;
            BirthDateChatEnableForm.a((byte) -126, (aj) null, 112);
          }
          var9.b((byte) -39, var4);
          var9.writeByteLengthPrefix(var9.position - var4, 5930);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
