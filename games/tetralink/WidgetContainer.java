/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetContainer extends SingleChildWidget {
    static RasterBuffer field_O;
    private IntrusiveDeque field_N;

    final void hideAllLayers(int param0) {
        int var4 = TetraLink.field_J;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(true));
        if (param0 != 0) {
          return;
        }
        while (var3 != null) {
          var3.field_K = false;
          var3 = (FadingModalPanel) (var2.next((byte) -58));
        }
        this.field_J = null;
    }

    final void pushLayer(UiWidget param0, boolean param1) {
        FadingModalPanel var3 = null;
        try {
          if (!(param0 instanceof FadingModalPanel)) {
            throw new IllegalArgumentException();
          }
          if (param1) {
            field_O = (RasterBuffer) null;
          }
          var3 = (FadingModalPanel) (param0);
          this.field_N.addFirst(var3, -25);
          var3.field_K = true;
          var3.focusNext((UiWidget) (this), -384169950);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "pk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void animateAndRemoveHiddenLayers(int param0) {
        int var4 = TetraLink.field_J;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        if (param0 != 0) {
          return;
        }
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(true));
        while (var3 != null) {
          if (var3.tickLayerAndCheckHidden(~param0)) {
            var3.unlink(false);
          }
          var3 = (FadingModalPanel) (var2.next((byte) -58));
        }
        this.field_J = (UiWidget) ((Object) this.getTopOpenLayer(false));
    }

    final FadingModalPanel getTopOpenLayer(boolean param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = new IntrusiveDequeCursor(this.field_N);
        var3 = (FadingModalPanel) (var2.first(true));
        if (param0) {
          this.hideAllLayers(85);
        }
        while (var3 != null) {
          if (var3.field_K) {
            return var3;
          }
          var3 = (FadingModalPanel) (var2.next((byte) -58));
        }
        return null;
    }

    final static byte[] decompressContainer(byte[] param0, byte param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (param1 < 65) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var9 = new PacketBuffer(param0);
          var3 = var9.readUnsignedByte((byte) -99);
          var4 = var9.readInt(-123);
          if (0 <= var4 && (0 == FlaggedTextValue.field_g ||
            !(FlaggedTextValue.field_g < var4))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(var4, 0, var13, 2);
              stackIn_24_0 = var5;
              return stackIn_24_0;
            }
            var5_int = var9.readInt(89);
            if (0 <= var5_int && (0 == FlaggedTextValue.field_g ||
              !(FlaggedTextValue.field_g < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                Bzip2Decoder.decompressInto(var12, var5_int, param0, var4, 9);
              } else {
                var7 = MidiNote.field_z;
                synchronized (var7) {
                  MidiNote.field_z.decompress((byte) 114, var12, var9);
                }
              }
              stackIn_22_0 = var6;
              return stackIn_22_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("pk.M(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    public WidgetContainer() {
        super(0, 0, ViewportController.field_e, PendingMove.field_a, (WidgetPainter) null, (WidgetListener) null);
        this.field_N = new IntrusiveDeque();
    }

    public static void releaseStatics(int param0) {
        field_O = null;
        if (param0 != -2) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          WidgetContainer.readUsernameParameter(-112, (java.applet.Applet) null);
        }
    }

    final static void readUsernameParameter(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        java.applet.Applet var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 >= -32) {
            var3 = (java.applet.Applet) null;
            WidgetContainer.readUsernameParameter(35, (java.applet.Applet) null);
          }
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (0L != OpacityWidget.encodeBase37(-23718, var4)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("pk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final UiWidget getFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        FadingModalPanel var3;
        int var4;
        UiWidget var5;
        var4 = TetraLink.field_J;
        var2 = new IntrusiveDequeCursor(this.field_N);
        var3 = (FadingModalPanel) (var2.first(true));
        if (param0 != 9) {
          var5 = (UiWidget) null;
          this.pushLayer((UiWidget) null, true);
        }
        while (var3 != null) {
          if (var3.field_K) {
            return var3.findFocusedChild((byte) 5);
          }
          var3 = (FadingModalPanel) (var2.next((byte) -58));
        }
        return null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = TetraLink.field_J;
        if (null != this.field_H) {
          this.field_H.drawWidget((UiWidget) (this), param1, param2, true, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_N);
        if (param0 != 0) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.last(param0 ^ -115));
        while (var6 != null) {
          var6.drawLayer(0, param1 + this.field_t, param2 + this.field_w, param3);
          var6 = (UiWidget) (var5.previous((byte) -66));
        }
    }

    final void removeHiddenLayers(byte param0) {
        int var4 = TetraLink.field_J;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        if (param0 != -110) {
          this.drawLayer(18, -69, -122, 50);
        }
        FadingModalPanel var3 = (FadingModalPanel) (var2.first(true));
        while (var3 != null) {
          if (var3.isFullyFadedOut(param0 ^ -652390206)) {
            var3.unlink(false);
          }
          var3 = (FadingModalPanel) (var2.next((byte) -58));
        }
    }

    static {
    }
}
