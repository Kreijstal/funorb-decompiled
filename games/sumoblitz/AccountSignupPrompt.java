/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountSignupPrompt extends WidgetContainer implements WidgetActionListener {
    private InteractiveWidget field_C;
    private InteractiveWidget field_A;
    private InteractiveWidget field_B;

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        if (guard <= -35) {
          var5 = this.x + parentX;
          var6 = parentY + this.y;
          kw.field_b.a(qn.creatingAJagexAccountText, 20 + var5, var6 + 20, this.width - 40, -50 + this.height, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.renderLayer(parentX, parentY, (byte) -96, layer);
          return;
        }
        this.field_B = (InteractiveWidget) null;
        var5Lifetime1 = this.x + parentX;
        var6Lifetime1 = parentY + this.y;
        kw.field_b.a(qn.creatingAJagexAccountText, 20 + var5Lifetime1, var6Lifetime1 + 20, this.width - 40, -50 + this.height, 16777215, -1, 1, 0, kw.field_b.field_s);
        super.renderLayer(parentX, parentY, (byte) -96, layer);
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (source == this.field_A) {
            SpriteState.e(0);
          } else {
            if (source != this.field_B) {
              if (this.field_C == source) {
                SlowBurstParticle.e(4);
              }
            } else {
              rv.a((byte) 114);
            }
          }
          if (guard == 710) {
            return;
          }
          this.field_A = (InteractiveWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("fo.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    public AccountSignupPrompt() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_B = new InteractiveWidget(IntrusiveNode.createAFreeAccountText, (WidgetListener) null);
        this.field_A = new InteractiveWidget(AgeValidator.goBackText, (WidgetListener) null);
        this.field_C = new InteractiveWidget(EmptyWidgetRenderer.field_b, (WidgetListener) null);
        SpriteStripButtonRenderer var1 = new SpriteStripButtonRenderer();
        this.field_B.renderer = (WidgetRenderer) ((Object) var1);
        this.field_A.renderer = (WidgetRenderer) ((Object) var1);
        this.field_C.renderer = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_A.setBounds(97, this.width - var3 >> 1, -var2 + (-48 + this.height), 30, var4);
        this.field_C.setBounds(-86, (this.width - var3 >> 1) + var4 + var2, -48 + this.height - var2, 30, var4);
        this.field_B.setBounds(-112, -var3 + this.width >> 1, -(var2 * 2) + this.height - 78, 30, var3);
        this.field_A.listener = (WidgetListener) (this);
        this.field_B.listener = (WidgetListener) (this);
        this.field_B.tooltip = DroneDebris.createYourOwnFreeText;
        this.field_C.listener = (WidgetListener) (this);
        this.field_C.tooltip = hg.playTheGameWithoutText;
        this.addChild(this.field_A, 120);
        this.addChild(this.field_B, 70);
        this.addChild(this.field_C, 83);
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            this.renderLayer(-128, -68, (byte) -69, -31);
          }
          if (super.onKey(root, character, (byte) 20, keyCode)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_8_0 = this.focusPrevious((byte) 123, root);
            return stackIn_8_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNext(root, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("fo.KA(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    static {
    }
}
