/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenStatusDialog extends ResizableModalDialog implements WidgetActivationListener {
    static String field_Y;
    static String field_Z;
    static String field_W;
    static RgbSprite[] field_X;
    static String field_ab;
    private InteractiveWidget closeButton;

    final static void setChatFilter(int filterValue, boolean obfuscationGuard, int channelId, int packetOpcode) {
        if (obfuscationGuard) {
          field_X = (RgbSprite[]) null;
          if (channelId != 0) {
            if (channelId == 1) {
              if (QuickChatCategory.field_D == filterValue) {
                if (2 == channelId &&
                  cd.field_c != filterValue) {
                  cd.field_c = filterValue;
                  MoveEvent.field_J = true;
                  SocketResourceClient.a(896, packetOpcode);
                }
                return;
              }
              QuickChatCategory.field_D = filterValue;
              MoveEvent.field_J = true;
              SocketResourceClient.a(896, packetOpcode);
            }
          } else {
            if (filterValue != MaskedTextEntryPainter.field_B) {
              MaskedTextEntryPainter.field_B = filterValue;
              MoveEvent.field_J = true;
              SocketResourceClient.a(896, packetOpcode);
            }
            if (channelId == 1 &&
              QuickChatCategory.field_D != filterValue) {
              QuickChatCategory.field_D = filterValue;
              MoveEvent.field_J = true;
              SocketResourceClient.a(896, packetOpcode);
            }
          }
        } else {
          if (channelId == 0 &&
            filterValue != MaskedTextEntryPainter.field_B) {
            MaskedTextEntryPainter.field_B = filterValue;
            MoveEvent.field_J = true;
            SocketResourceClient.a(896, packetOpcode);
          }
          if (channelId == 1 &&
            QuickChatCategory.field_D != filterValue) {
            QuickChatCategory.field_D = filterValue;
            MoveEvent.field_J = true;
            SocketResourceClient.a(896, packetOpcode);
          }
        }
        if (2 != channelId) {
          return;
        }
        if (cd.field_c == filterValue) {
          return;
        }
        cd.field_c = filterValue;
        MoveEvent.field_J = true;
        SocketResourceClient.a(896, packetOpcode);
    }

    private final InteractiveWidget createCloseButton(String text, WidgetListener listener, int obfuscationGuard) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        InteractiveWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(text, listener);
          var4.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(15, -16 + (-14 + this.width), var5, 8192, 30);
          this.addChild((byte) 10, (Widget) (var4));
          this.refreshLayout(0);
          var6 = -126 / ((-6 - obfuscationGuard) / 40);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ud.E(");
          if (text == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    FullscreenStatusDialog(ModalDialogHost host, jl statusToken) {
        super(host, 200, 150);
        Object var3 = null;
        Widget var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (statusToken != PlayerProfile.field_h) {
            if (SocialListPanel.field_Mb == statusToken) {
              this.height = this.height + 10;
              var3 = MoveAttackRequest.field_y;
              if (PaletteRegionMap.b(-108)) {
                this.height = this.height + 20;
                var3 = field_W;
              }
            } else {
              if (statusToken == FullscreenMembershipDialog.field_cb) {
                this.height = this.height + 30;
                var3 = hb.field_a;
              }
            }
          } else {
            var3 = NodeHashIterator.field_a;
          }
          var4 = new Widget((String) (var3), (WidgetListener) null);
          var4.x = 0;
          var4.y = 50;
          var4.width = this.width;
          var4.height = 80;
          var4.painter = (WidgetPainter) ((Object) new BitmapTextWidgetPainter(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) 10, var4);
          this.closeButton = this.createCloseButton(pd.field_f, (WidgetListener) (this), 93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ud.<init>(");
          if (host == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (statusToken == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11) {
            field_Z = (String) null;
          }
          if (widget != this.closeButton) {
            return;
          }
          this.closeStatusNotice((byte) 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ud.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        if (param0 == 12213) {
          field_X = null;
          field_Y = null;
          field_Z = null;
          field_W = null;
          field_ab = null;
          return;
        }
        FullscreenStatusDialog.n(4);
        field_X = null;
        field_Y = null;
        field_Z = null;
        field_W = null;
        field_ab = null;
    }

    private final void closeStatusNotice(byte obfuscationGuard) {
        if (obfuscationGuard != 60) {
          FullscreenStatusDialog.n(-98);
          if (!this.open) {
            return;
          }
          this.open = false;
          return;
        }
        if (!this.open) {
          return;
        }
        this.open = false;
    }

    static {
        field_Y = "This unit has an attack range of <%0>";
        field_Z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_W = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_ab = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
