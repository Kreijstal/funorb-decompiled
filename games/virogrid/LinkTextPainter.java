/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkTextPainter implements WidgetListener {
    private int field_f;
    static String field_a;
    static BitmapFont field_g;
    private int field_e;
    static String field_c;
    static SpriteWidget field_h;
    static DualLinkHashTable field_i;
    private BitmapFont field_d;
    static int field_b;

    public static void releaseStatics(int param0) {
        field_i = null;
        int var1 = 108 % ((58 - param0) / 55);
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
    }

    final static void resetReflectionCheckQueue(int param0) {
        IntrusiveNode.field_c = new IntrusiveDeque();
        int var1 = -112 / ((-57 - param0) / 39);
    }

    final static String readIncomingString(int param0) {
        int var1 = 89 % ((53 - param0) / 57);
        return ProgressMessageDialog.field_qb.readString(-121);
    }

    final static void requestFullscreen(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (NameCharacterHelpers.field_d <= 0) {
          if (!VerticalScrollbar.isGuestSession(param1 ^ -1502464331)) {
            var2 = 1;
          } else {
            var2 = 0;
          }
        } else {
          if (null != AgeValidator.field_q) {
            FullscreenState.field_b = AgeValidator.field_q.enterFullscreen(11);
            MarkerSliderPainter.notifyBrowserResize(2, (byte) -92);
            if (null != FullscreenState.field_b) {
              var2 = 2;
              ChatSettingsHelpers.detachInputListeners(FullscreenState.field_b, (byte) -54);
            } else {
              var2 = 3;
            }
          } else {
            FullscreenState.field_b = TriangleMesh.openFullscreenCanvas(640, 0, 480, 0, param1 + 1502469767, MusicPlaybackHelpers.field_c);
            if (null != FullscreenState.field_b) {
              var2 = 2;
              ChatSettingsHelpers.detachInputListeners(FullscreenState.field_b, (byte) -54);
            } else {
              var2 = 3;
            }
          }
        }
        if (AgeValidator.field_q == null &&
          ViewControlStrings.field_c) {
          PopupMenuHelpers.buildPopupMenu(param0, var2, (byte) 33);
        }
        if (param1 == -1502464351) {
          return;
        }
        field_g = (BitmapFont) null;
    }

    public final void drawWidget(int param0, UiWidget param1, boolean param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param1.field_p &&
            !param1.isFocused(true)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          if (param4 != -23294) {
            return;
          }
          this.field_d.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_n + "</u>", param0 + param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6_int, -1, this.field_e, this.field_f, this.field_d.field_H + this.field_d.field_G);
          if (param1.isFocused(true)) {
            var7 = this.field_d.textWidth(param1.field_n);
            var8 = this.field_d.field_G + this.field_d.field_H;
            var9 = param0 + param1.field_l;
            var10 = param3 + param1.field_u;
            if (this.field_e != 2) {
              if (this.field_e == 1) {
                var9 = var9 + (param1.field_g - var7 >> 1);
              }
            } else {
              var9 = var9 + (param1.field_g - var7);
            }
            if (this.field_f == 2) {
              var10 = var10 + (-var8 + param1.field_m);
            } else {
              if (this.field_f == 1) {
                var10 = var10 + (param1.field_m - var8 >> 1);
              }
            }
            RegistrationRequestDialog.drawDottedRectangle(2 + var10, (byte) 58, -2 + var9, var7 + 4, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public LinkTextPainter() {
        this.field_d = PlayerContextMenu.arezzo14Font;
        this.field_f = 1;
        this.field_e = 1;
    }

    LinkTextPainter(BitmapFont param0, int param1, int param2) {
        try {
          this.field_e = param1;
          this.field_d = param0;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Names should contain a maximum of 12 characters";
        field_c = "You have declined the invitation.";
    }
}
