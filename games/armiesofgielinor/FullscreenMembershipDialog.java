/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenMembershipDialog extends ResizableModalDialog implements WidgetActivationListener {
    private InteractiveWidget closeButton;
    static rn field_ab;
    private InteractiveWidget membersButton;
    static RgbSprite[] activeFoliageShadows;
    static jl field_cb;
    static byte[] field_db;
    static ClientContextMenu activeContextMenu;
    static String field_X;
    static String field_Y;
    static int[][] field_W;

    public static void n(int param0) {
        field_ab = null;
        activeFoliageShadows = null;
        field_db = null;
        field_X = null;
        activeContextMenu = null;
        field_W = (int[][]) null;
        if (param0 != 0) {
          return;
        }
        field_Y = null;
        field_cb = null;
    }

    FullscreenMembershipDialog(ModalDialogHost host) {
        super(host, 200, 130);
        Widget var2 = null;
        try {
          var2 = new Widget(SummonRequest.field_z, (WidgetListener) null);
          var2.height = 80;
          var2.width = this.width;
          var2.x = 0;
          var2.y = 50;
          var2.painter = (WidgetPainter) ((Object) new BitmapTextWidgetPainter(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) 10, var2);
          if (DamageEvent.isGuestSession(98)) {
            this.membersButton = this.createNoticeButton((WidgetListener) (this), true, ClientContextMenu.field_j);
          }
          this.closeButton = this.createNoticeButton((WidgetListener) (this), true, pd.field_f);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tn.<init>(" + (host != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (obfuscationGuard != 11) {
            field_W = (int[][]) null;
          }
          if (widget != this.membersButton) {
            if (widget == this.closeButton) {
              this.closeMembershipNotice(1);
            }
          } else {
            ed.a(false);
            this.closeMembershipNotice(obfuscationGuard - 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tn.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void closeMembershipNotice(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          CipherPacketBuffer var3 = (CipherPacketBuffer) null;
          FullscreenMembershipDialog.readTaggedInteger(false, 35, (CipherPacketBuffer) null);
        }
        if (!this.open) {
          return;
        }
        this.open = false;
    }

    private final InteractiveWidget createNoticeButton(WidgetListener listener, boolean obfuscationGuard, String text) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(text, listener);
          if (!obfuscationGuard) {
            FullscreenMembershipDialog.a(false, -22, 101);
          }
          var4.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
          var5 = -6 + this.height;
          this.height = this.height + 38;
          var4.setBounds(15, -14 + this.width - 16, var5, 8192, 30);
          this.addChild((byte) 10, (Widget) (var4));
          this.refreshLayout(0);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("tn.G(");
          if (listener == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (98 == keyCode) {
            if (this.membersButton == null) {
              this.closeButton.takeFocus(11, (Widget) (this));
              return true;
            }
            this.membersButton.takeFocus(11, (Widget) (this));
            return true;
          }
          if (obfuscationGuard != -12215) {
            return true;
          }
          if (keyCode != 99) {
            stackIn_12_0 = super.handleKey(rootWidget, keyCode, character, obfuscationGuard + 0);
            return stackIn_12_0;
          }
          this.closeButton.takeFocus(11, (Widget) (this));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tn.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(byte param0, RgbSprite[] param1) {
        int var3 = 0;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 < 67) {
            field_ab = (rn) null;
          }
          var2_int = 0;
          if (param1.length != 6) {
            if (param1.length != 7) {
              return;
            }
          } else {
            var2_int = 1;
          }
          for (var3 = 0; var3 < param1.length; var3++) {
            var15 = param1[var3].pixels;
            var14 = var15;
            var4 = var14;
            var5 = 16711680 & TutorialLayout.field_g[var2_int + var3];
            var6 = 65280 & TutorialLayout.field_g[var2_int + var3];
            var7 = 255 & TutorialLayout.field_g[var3 + var2_int];
            for (var8 = 0; var15.length > var8; var8++) {
              var9 = var15[var8] & 16711680;
              var10 = 65280 & var15[var8];
              var11 = 255 & var15[var8];
              var12 = var15[var8] & -16777216;
              if (var10 == var9 >> 8 &&
                var10 >> 8 == var11) {
                if (var11 < 128) {
                  var11 = var11 << 1;
                  var4[var8] = AccountRegistrationDialog.bitwiseOr(var12, AccountRegistrationDialog.bitwiseOr(AccountRegistrationDialog.bitwiseOr(rn.bitwiseAnd(var5 * var11, -16777164) >>> 8, rn.bitwiseAnd(var11 * var6, 16711832) >>> 8), rn.bitwiseAnd(var7 * var11 >>> 8, 754974975)));
                } else {
                  var4[var8] = AccountRegistrationDialog.bitwiseOr(AccountRegistrationDialog.bitwiseOr(AccountRegistrationDialog.bitwiseOr(rn.bitwiseAnd((256 - var11) * var5 + var11 * 16711680 - 2139095040 >>> 7, 1727987712), rn.bitwiseAnd(8355863, (-var11 + 256) * var6 + (var11 - 128) * 65280) >>> 7), (256 - var11) * var7 + 255 * var11 - 32640 >>> 7), var12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("tn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static long readTaggedInteger(boolean obfuscationGuard, int encodedLength, CipherPacketBuffer packet) {
        RuntimeException var3 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            stackIn_4_0 = (long)de.readTieredSignedInt(-111, packet, 4, 14, 30, 20);
            return stackIn_4_0;
          }
          stackIn_2_0 = 100L;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tn.C(").append(obfuscationGuard).append(',').append(encodedLength).append(',');
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static RgbSprite[] a(boolean param0, int param1, int param2) {
        if (!param0) {
          CipherPacketBuffer var4 = (CipherPacketBuffer) null;
          FullscreenMembershipDialog.readTaggedInteger(false, 58, (CipherPacketBuffer) null);
        }
        return IntPair.a(param1, (byte) -114, param2, 1);
    }

    static {
        field_ab = new rn();
        field_cb = new jl();
        field_Y = "You must play 1 more rated game before playing with the current options.";
        field_X = "Email (Login):";
        field_db = new byte[520];
        field_W = new int[][]{new int[]{100, 100, 100, 400, 400}, new int[]{200, 200, 700}, new int[]{200}};
    }
}
