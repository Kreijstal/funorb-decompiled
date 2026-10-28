/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends UiContainer implements ButtonListener {
    private TextButton field_J;
    static int field_H;
    private TextButton field_G;
    private TextButton field_I;

    public l() {
        super(0, 0, 476, 225, (WidgetPainter) null);
        this.field_I = new TextButton(pc.field_g, (UiListener) null);
        this.field_G = new TextButton(CipherPacketBuffer.field_p, (UiListener) null);
        this.field_J = new TextButton(cj.field_c, (UiListener) null);
        ThreeSliceButtonPainter var1 = new ThreeSliceButtonPainter();
        this.field_I.painter = (WidgetPainter) ((Object) var1);
        this.field_G.painter = (WidgetPainter) ((Object) var1);
        this.field_J.painter = (WidgetPainter) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_G.setBounds(var4, this.height - (48 + var2), -var3 + this.width >> 1, true, 30);
        this.field_J.setBounds(var4, -48 + (this.height - var2), (this.width - var3 >> 1) + (var4 + var2), true, 30);
        this.field_I.setBounds(var3, -78 + (this.height - 2 * var2), -var3 + this.width >> 1, true, 30);
        this.field_G.listener = (UiListener) (this);
        this.field_I.listener = (UiListener) (this);
        this.field_J.listener = (UiListener) (this);
        this.field_I.tooltip = mm.field_c;
        this.field_J.tooltip = lf.field_G;
        this.b(this.field_G, false);
        this.b(this.field_I, false);
        this.b(this.field_J, false);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (guard > 85) {
          int var5 = this.x + screenX;
          int var6 = screenY + this.y;
          Js5Transport.field_a.drawParagraph(MarkerSlider.field_F, var5 + 20, var6 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, Js5Transport.field_a.maxAscent);
          super.drawLayer(screenY, (byte) 99, layer, screenX);
          return;
        }
        this.field_J = (TextButton) null;
        int var5Lifetime1 = this.x + screenX;
        int var6Lifetime1 = screenY + this.y;
        Js5Transport.field_a.drawParagraph(MarkerSlider.field_F, var5Lifetime1 + 20, var6Lifetime1 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, Js5Transport.field_a.maxAscent);
        super.drawLayer(screenY, (byte) 99, layer, screenX);
    }

    final static boolean a(byte param0) {
        if (param0 >= -30) {
          field_H = -87;
          if (aj.b(-127)) {
            return false;
          }
          if (mg.field_b >= 2) {
            return true;
          }
          return false;
        }
        if (aj.b(-127)) {
          return false;
        }
        if (mg.field_b >= 2) {
          return true;
        }
        return false;
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.field_G == button) {
            GameAppletShell.b(-74);
          } else if (this.field_I == button) {
            fe.a((byte) -83);
          } else if (this.field_J == button) {
            bm.a(4);
          }
          if (guard == 1) {
            return;
          }
          l.a((byte) -64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var6;
          StringBuilder stackIn_13_1 = new StringBuilder().append("l.K(");
          if (button == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_17_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 71)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_6_0 = this.a((byte) 22, root);
            return stackIn_6_0;
          }
          if (guard < 0) {
            return true;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_13_0 = this.a(root, true);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("l.G(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -8462) {
          return -107;
        }
        if (!AchievementRecord.a(param1, -99)) {
          return -1;
        }
        return param1;
    }

    static {
        field_H = 4;
    }
}
