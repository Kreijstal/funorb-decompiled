/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends UiContainer implements TextInputListener, ButtonListener {
    private boolean field_K;
    private TextButton createAccountButton;
    private boolean field_M;
    static String field_O;
    private boolean field_P;
    private EditableTextWidget identifierField;
    private EditableTextWidget passwordField;
    private TextButton submitButton;
    private String message;
    private TextButton secondaryButton;

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_18_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.submitButton == button) {
            this.submitLogin((byte) 103);
          } else if (this.createAccountButton == button) {
            fe.a((byte) -83);
          } else if (this.secondaryButton == button) {
            if (this.field_K) {
              ByteStorage.b(-54);
            } else if (this.field_P) {
              qe.a(true);
            } else {
              ta.m(2);
            }
          }
          if (guard != 1) {
            this.message = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("h.K(");
          if (button == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (null != this.message) {
          Js5Transport.field_a.drawParagraph(this.message, 20 + (this.x + screenX), this.y + (screenY + 15), -40 + this.width, this.height, 16777215, -1, 1, 0, Js5Transport.field_a.maxAscent);
        }
        if (null != this.createAccountButton) {
          SoftwareRasterizer.drawHorizontalLine(10 + screenX, 134 + screenY, this.width - 20, 4210752);
        }
        if (guard < 85) {
          this.message = (String) null;
        }
        super.drawLayer(screenY, (byte) 87, layer, screenX);
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_18_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 60)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_7_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_7_0;
          }
          if (keyCode == 99) {
            boolean stackIn_10_0 = this.focusNextChild(root, true);
            return stackIn_10_0;
          }
          if (guard <= 0) {
            EditableTextWidget var6 = (EditableTextWidget) null;
            this.onTextChanged((EditableTextWidget) null, -39);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("h.G(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    public final void onSubmit(boolean guard, EditableTextWidget field) {
        String stackIn_11_2 = null;
        try {
          if (field == this.identifierField) {
            this.passwordField.focusNext(-4659, (UiComponent) (this));
          }
          if (this.passwordField == field) {
            this.submitLogin((byte) 100);
          }
          if (!guard) {
            this.message = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("h.CA(").append(guard).append(',');
          if (field == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void loadLogoMeshes(ResourceArchive archive, byte guard) {
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var8 = new CipherPacketBuffer(archive.getNamedFile(-4, "", "logo.fo3d"));
          CipherPacketBuffer var10 = var8;
          int var3 = var10.readUnsignedByte(0);
          var10.beginBitReading(-17928);
          DialogueScreen.field_y = IntrusiveNode.a(var10, 22178);
          ByteStorage.logoMeshes = new TriangleMesh[var3];
          SectorCacheStore.field_c = new int[var3][];
          if (guard < 41) {
            LoginForm.a(82, (byte) -78);
          }
          for (int var4 = 0; var3 > var4; var4++) {
            ByteStorage.logoMeshes[var4] = wk.a(-127, var8);
          }
          var10.endBitReading(-3879);
          int var9 = 0;
          int var4Lifetime1 = var9;
          while (var3 > var9) {
            TriangleMesh var5 = ByteStorage.logoMeshes[var9];
            var5.scaleVertices(6, 1, 6, 6, -72);
            var5.updateBounds((byte) 49);
            int[] var6 = new int[]{var5.minX + var5.maxX >> 1, var5.maxY + var5.minY >> 1, var5.maxZ + var5.minZ >> 1};
            SectorCacheStore.field_c[var9] = var6;
            var5.translateVertices(-var6[2], 0, -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("h.D(");
          if (archive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final String identifier(int guard) {
        if (guard != 35) {
          TextButton var3 = (TextButton) null;
          this.onAction((TextButton) null, 35, 44, 83, 31);
        }
        if (null != this.identifierField.text) {
          return this.identifierField.text;
        }
        return "";
    }

    final static int a(int param0, byte param1) {
        int var2 = ua.field_c.a(29386, param0);
        if (param1 != 121) {
          field_O = (String) null;
        }
        int var3 = SpriteFactorySupport.levelCount(false, param0);
        if (var2 >= var3) {
          var2 = 0;
        } else if (var2 == 0) {
          var2 = CheckboxPainter.field_l.field_s;
        }
        return var2;
    }

    public final void onTextChanged(EditableTextWidget field, int guard) {
        try {
          if (guard != 0) {
            this.passwordField = (EditableTextWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "h.W(" + (field != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void clearCredentials(byte guard) {
        if (guard >= -127) {
          this.createAccountButton = (TextButton) null;
        }
        this.identifierField.clearText((byte) -29);
        this.passwordField.clearText((byte) -29);
    }

    private final void submitLogin(byte guard) {
        if (guard <= 88) {
          EditableTextWidget var3 = (EditableTextWidget) null;
          this.onSubmit(true, (EditableTextWidget) null);
        }
        if (gm.b(8192) ||
          !(this.identifierField.text.length() <= 0) &&
          !(this.passwordField.text.length() <= 0)) {
          RasterSnapshot.a(0, this.passwordField.text, this.identifierField.text);
        }
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetPainter) null);
        String stackIn_19_3 = null;
        String stackIn_60_2 = null;
        String stackIn_63_2 = null;
        try {
          boolean stackIn_4_1 = (param4);
          this.field_P = stackIn_4_1;
          boolean stackIn_7_1 = (param3);
          this.field_M = stackIn_7_1;
          this.message = param1;
          boolean stackIn_10_1 = (param2);
          this.field_K = stackIn_10_1;
          if (this.field_K && (this.field_M ||
            this.field_P)) {
            throw new IllegalStateException();
          }
          this.identifierField = (EditableTextWidget) ((Object) new ValidatedTextWidget(param0, (UiListener) (this), 100));
          this.passwordField = (EditableTextWidget) ((Object) new ValidatedTextWidget("", (UiListener) (this), 20));
          if (!this.field_K) {
            this.submitButton = new TextButton(ta.field_g, (UiListener) null);
            TextButton stackIn_18_1 = null;
            TextButton stackIn_18_2 = null;
            if (this.field_P) {
              stackIn_19_3 = cj.field_c;
            } else {
              TextButton stackIn_19_1 = null;
              TextButton stackIn_19_2 = null;
              stackIn_19_3 = Minimap.field_O;
            }
            this.secondaryButton = new TextButton(stackIn_19_3, (UiListener) null);
            if (this.field_M) {
              this.createAccountButton = new TextButton(pc.field_g, (UiListener) (this));
            }
          } else {
            this.submitButton = new TextButton(WeightedCacheEntry.field_s, (UiListener) null);
            this.secondaryButton = new TextButton(EmailAvailabilityRequest.field_d, (UiListener) null);
            this.identifierField.enabled = false;
          }
          this.identifierField.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
          this.passwordField.painter = (WidgetPainter) ((Object) new PasswordFieldPainter(10000536));
          ThreeSliceButtonPainter var6 = new ThreeSliceButtonPainter();
          this.submitButton.painter = (WidgetPainter) ((Object) var6);
          if (this.secondaryButton != null) {
            this.secondaryButton.painter = (WidgetPainter) ((Object) var6);
          }
          if (null != this.createAccountButton) {
            this.createAccountButton.painter = (WidgetPainter) ((Object) var6);
          }
          this.identifierField.tooltip = LegacyStyleNode.field_u;
          if (this.createAccountButton != null) {
            this.createAccountButton.tooltip = mm.field_c;
          }
          if (this.field_K) {
            this.secondaryButton.tooltip = ValidatedTextWidget.field_Z;
          } else if (!this.field_P) {
            this.secondaryButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
          } else {
            this.secondaryButton.tooltip = ValidationHelpWidget.field_G;
            this.secondaryButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
          }
          this.y = 15;
          BitmapFont var7 = Js5Transport.field_a;
          if (null != this.message) {
            this.y = this.y + (var7.paragraphHeight(this.message, -40 + this.width, var7.maxAscent) + 5);
          }
          String var8 = lh.field_b;
          LoginMethod var9 = WeightedCacheEntry.readLastLoginMethod((byte) -1, PointCloudEffect.d((byte) -107));
          if (var9 == NameAvailabilityValidator.field_q) {
            var8 = kg.field_b;
          } else if (var9 == oh.field_n) {
            var8 = TileSpriteCacheEntry.field_c;
          }
          LabeledField dupTemp$0 = new LabeledField(10, this.y, -20 + this.width, 25, this.identifierField, false, 80, 3, var7, 16777215, var8);
          LabeledField var12 = dupTemp$0;
          this.addChild(dupTemp$0, false);
          this.y = this.y + (((UiComponent) ((Object) var12)).height + 5);
          LabeledField dupTemp$1 = new LabeledField(10, this.y, this.width - 20, 25, this.passwordField, false, 80, 3, var7, 16777215, RegistrationRequestDialog.field_vb);
          LabeledField var13 = dupTemp$1;
          this.addChild(dupTemp$1, false);
          this.y = this.y + (((UiComponent) ((Object) var13)).height + 5);
          this.submitButton.listener = (UiListener) (this);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (UiListener) (this);
          }
          if (null != this.secondaryButton) {
            this.secondaryButton.listener = (UiListener) (this);
          }
          if (this.createAccountButton == null) {
            this.submitButton.setBounds(-10 + (-6 + this.width), this.y, 8, true, 30);
            this.y = this.y + 35;
          } else {
            this.submitButton.setBounds(-95 + this.width, this.y, 85, true, 30);
            this.y = this.y + 60;
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.setBounds(this.width - 6 - 10, this.y, 8, true, 30);
            this.y = this.y + 35;
          }
          if (null != this.secondaryButton) {
            if (!this.field_K &&
              !this.field_P) {
              this.secondaryButton.setBounds(40, this.y, 8, true, 20);
              this.y = this.y + 25;
            } else {
              this.secondaryButton.setBounds(-6 + (this.width - 10), this.y, 8, true, 30);
              this.y = this.y + 35;
            }
          }
          this.setBounds(this.width, 0, 0, true, 3 + this.y);
          this.addChild(this.submitButton, false);
          if (this.createAccountButton != null) {
            this.addChild(this.createAccountButton, false);
          }
          if (null != this.secondaryButton) {
            this.addChild(this.secondaryButton, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_59_0 = var6_ref;
          StringBuilder stackIn_59_1 = new StringBuilder().append("h.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          StringBuilder stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard <= 94) {
          field_O = (String) null;
        }
        field_O = null;
    }

    final void setIdentifier(String identifier, byte guard) {
        if (guard <= 105) {
          return;
        }
        try {
          EditableTextWidget var3 = this.identifierField;
          String var4 = identifier;
          var3.setText(var4, false, -33);
          this.passwordField.clearText((byte) -29);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "h.F(" + (identifier != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static {
        field_O = "Rewatch last briefing";
    }
}
