/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetLayerStack extends SingleChildWidget {
    private IntrusiveDeque field_F;
    static boolean[] field_J;
    static String field_E;
    static String field_G;
    static String field_I;
    static String[] field_B;
    static String field_H;

    final static ConditionalTextValue createLoginUsernameField(boolean param0) {
        if (!param0) {
          field_I = (String) null;
        }
        String var1 = StatusAndUrlHelpers.getStatusMessage((byte) -52);
        if (var1 != null &&
          0 <= var1.indexOf('@')) {
          var1 = "";
        }
        return new ConditionalTextValue(StatusAndUrlHelpers.getStatusMessage((byte) -52), Bzip2State.isNameCheckPending(16));
    }

    public WidgetLayerStack() {
        super(0, 0, IsaacRandom.field_i, DrawOfferMenuHelpers.field_a, (WidgetListener) null, (UiListener) null);
        this.field_F = new IntrusiveDeque();
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_E = null;
        field_B = null;
        if (param0 != -202) {
          field_G = (String) null;
        }
        field_G = null;
        field_I = null;
        field_J = null;
    }

    final static void insertLobbyPlayerSorted(LobbyPlayerEntry param0, byte param1) {
        LobbyPlayerEntry var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 <= 87) {
            field_J = (boolean[]) null;
          }
          param0.unlink(false);
          var2 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.first((byte) -64));
          while (var2 != null) {
            if (var2.sortsBefore(37, param0)) {
              var2 = (LobbyPlayerEntry) (PasswordConfirmationValidator.field_o.next(16213));
              continue;
            }
            break;
          }
          if (var2 != null) {
            CanvasPresentHelpers.insertAfter(var2, (byte) -73, param0);
          } else {
            PasswordConfirmationValidator.field_o.addFirst(param0, (byte) -91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("je.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void layoutLobbySlidePanels(int param0) {
        int var1 = (-640 + IterableDualLinkDeque.field_f) / 2;
        int var2 = EmailValidator.field_t * EmailValidator.field_t;
        int var3 = var2 - ClientServiceHelpers.field_d * ClientServiceHelpers.field_d;
        WidgetContainer.field_y.setGeometry(-(199 * var3 / var2) + var1, -124 + Rasterizer.field_f - 90, 199, (byte) -115, 90);
        if (param0 != -17491) {
          WidgetLayerStack.releaseStatics(84);
        }
        CipherPacketBuffer.field_p.setGeometry(var1 - (-202 - 438 * var3 / var2), -120 + (Rasterizer.field_f - 4), 438, (byte) -42, 0);
    }

    final void updateLayers(int param0) {
        int var5 = Virogrid.field_F ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_F);
        FadingModalPanel var3 = (FadingModalPanel) (var2.next(12677));
        while (var3 != null) {
          if (var3.tickLayerAndCheckHidden(3)) {
            var3.unlink(false);
          }
          var3 = (FadingModalPanel) (var2.nextBackward(41));
        }
        int var4 = 91 / ((param0 - 65) / 38);
        this.field_x = (UiWidget) ((Object) this.getTopVisibleLayer((byte) 51));
    }

    final FadingModalPanel getTopVisibleLayer(byte param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 != 51) {
          field_H = (String) null;
        }
        var2 = new IntrusiveDequeCursor(this.field_F);
        var3 = (FadingModalPanel) (var2.next(12677));
        while (var3 != null) {
          if (var3.field_G) {
            return var3;
          }
          var3 = (FadingModalPanel) (var2.nextBackward(41));
        }
        return null;
    }

    final void closeDismissedLayers(int param0) {
        int var5 = Virogrid.field_F ? 1 : 0;
        int var2 = -32 % ((param0 + 40) / 48);
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.field_F);
        FadingModalPanel var4 = (FadingModalPanel) (var3.next(12677));
        while (var4 != null) {
          if (var4.finishFadeAndCheckHidden((byte) -75)) {
            var4.unlink(false);
          }
          var4 = (FadingModalPanel) (var3.nextBackward(41));
        }
    }

    final void pushLayer(int param0, UiWidget param1) {
        FadingModalPanel var3 = null;
        try {
          if (!(param1 instanceof FadingModalPanel)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingModalPanel) (param1);
          if (param0 != 0) {
            WidgetLayerStack.releaseStatics(112);
          }
          this.field_F.addLast(var3, (byte) -45);
          var3.field_G = true;
          var3.focusNext((UiWidget) (this), param0 ^ -8515);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "je.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void hideAllLayers(byte param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_F);
        FadingModalPanel var3 = (FadingModalPanel) (var2.next(12677));
        if (param0 != 76) {
          this.getFocusedChild(true);
        }
        while (var3 != null) {
          var3.field_G = false;
          var3 = (FadingModalPanel) (var2.nextBackward(41));
        }
        this.field_x = null;
    }

    final UiWidget getFocusedChild(boolean param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_F);
        var3 = (FadingModalPanel) (var2.next(12677));
        if (param0) {
          this.hideAllLayers((byte) -34);
        }
        while (var3 != null) {
          if (var3.field_G) {
            return var3.findFocusedChild((byte) -3);
          }
          var3 = (FadingModalPanel) (var2.nextBackward(41));
        }
        return null;
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        int var7 = Virogrid.field_F ? 1 : 0;
        if (null != this.listener) {
          this.listener.drawWidget(param1, (UiWidget) (this), true, param2, -23294);
        }
        if (param0 != 37) {
          return;
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_F);
        UiWidget var6 = (UiWidget) (var5.first((byte) 48));
        while (var6 != null) {
          var6.drawLayer((byte) 37, this.field_l + param1, param2 + this.field_u, param3);
          var6 = (UiWidget) (var5.nextForward(-1));
        }
    }

    static {
        field_E = "Cancel draw";
        field_G = "Quick Chat Help";
        field_B = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_I = "Close";
        field_H = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
