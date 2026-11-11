/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MessageDialog extends ContentTransitionDialog implements ButtonListener {
    private boolean field_W;
    private static String[] field_Z;
    private boolean field_bb;
    private BitmapFont field_ab;
    private boolean field_V;
    private boolean field_Y;
    private ProgressBarWidget field_cb;
    private static String[] field_db;
    static ToolkitSprite field_X;

    public void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 44) {
            this.field_cb = (ProgressBarWidget) null;
          }
          if (!this.field_Y) {
            SimpleHoverMountComponent.openRelativeUrl("tochangedisplayname.ws", ToolkitSelector.getApplet(72), (byte) -68);
            return;
          }
          FormFieldRow.a(false, 3);
          this.dismiss((byte) -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ij.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_X = (ToolkitSprite) null;
          }
          if (13 != param2) {
            stackIn_7_0 = super.handleKeyInput(param0, param1, param2, true);
            return stackIn_7_0;
          }
          this.dismiss((byte) -115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ij.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(boolean param0) {
        MessagePage var2 = null;
        MessagePage var2Lifetime1;
        this.field_cb.setColors(param0, 4210752, 2121792);
        if (param0) {
          var2 = new MessagePage(this, this.field_ab, DropdownButtonPainter.field_e);
          var2.addAction(GameAssetLoader.field_i, 15, -127);
          this.transitionToContent(101, var2);
          return;
        }
        this.field_Y = false;
        var2Lifetime1 = new MessagePage(this, this.field_ab, DropdownButtonPainter.field_e);
        var2Lifetime1.addAction(GameAssetLoader.field_i, 15, -127);
        this.transitionToContent(101, var2Lifetime1);
    }

    final static void j(byte param0) {
        if (ej.field_a != null) {
          ej.field_a.pruneHiddenDialogs(-1);
          if (null != AnimationFrameSet.field_p) {
            AnimationFrameSet.field_p.f(12936);
          }
          if (param0 < -97) {
            jr.resetHoverTooltip((byte) -106);
            return;
          }
          return;
        }
        if (null != AnimationFrameSet.field_p) {
          AnimationFrameSet.field_p.f(12936);
        }
        if (param0 < -97) {
          jr.resetHoverTooltip((byte) -106);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_db = null;
        field_Z = null;
        field_X = null;
        if (param0 != 7707) {
          MessageDialog.fillTranslucentRect(12, -99, 63, -9, 57, 8);
        }
    }

    final static void fillTranslucentRect(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 == 6) {
          tga.field_a.fillRectangleAlpha(SoundEvent.withFullAlpha(false, param4), param0, param2, param3, param5 - 22977, param1);
          return;
        }
        MessageDialog.fillTranslucentRect(-35, -13, -25, -10, -41, -25);
        tga.field_a.fillRectangleAlpha(SoundEvent.withFullAlpha(false, param4), param0, param2, param3, param5 - 22977, param1);
    }

    MessageDialog(DialogStack param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new MessagePage((MessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_ab = param1;
          this.field_bb = param4 ? true : false;
          this.field_W = false;
          this.field_Y = false;
          this.field_V = param3 ? true : false;
          this.field_cb = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_cb.field_D = true;
          this.addChild(this.field_cb, -1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void showResultMessage(int param0, byte param1, String param2) {
        boolean stackIn_9_1 = false;
        MessagePage stackIn_13_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        MessagePage var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        UiWidget var6 = null;
        MessagePage var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_W) {
            return;
          }
          if (param1 < 39) {
            var6 = (UiWidget) null;
            this.handleKeyInput('F', (UiWidget) null, 118, true);
          }
          this.field_W = true;
          stackIn_9_1 = (param0 == 256);
          this.field_Y = stackIn_9_1;
          this.field_cb.setColors(true, 4210752, 8405024);
          var7 = new MessagePage(this, this.field_ab, param2);
          var4 = var7;
          if (param0 == 5) {
            var7.addAction(InvertOperator.field_n, 11, 61);
            var7.addAction(ControllerLocomotor.field_q, 17, 36);
          } else {
            if (param0 == 256) {
              var7.appendButton(MonochromeFillOperator.field_q, (byte) -102, (WidgetListener) (this));
            } else {
              stackIn_13_0 = var7;
              if (this.field_V) {
                stackIn_14_1 = MonochromeFillOperator.field_q;
              } else {
                stackIn_14_1 = KeyLockBehaviour.field_o;
              }
              ((MessagePage) (Object) stackIn_13_0).addAction(stackIn_14_1, -1, 78);
            }
          }
          if (3 == param0) {
            var7.addAction(MovingWallComponent.field_M, 7, 28);
          } else {
            if (param0 != 4) {
              if (param0 != 6) {
                if (param0 != 9) {
                  this.transitionToContent(95, var7);
                  return;
                }
                var7.appendButton(epa.field_q, (byte) -102, (WidgetListener) (this));
              } else {
                var7.addAction(RenderLayer.field_a, 9, -65);
              }
            } else {
              var7.addAction(ApproachPlayerLocomotor.field_p, 8, -83);
            }
          }
          this.transitionToContent(95, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ij.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void dismiss(byte param0) {
        if (!this.field_B) {
          return;
        }
        int var2 = -25 / ((-69 - param0) / 37);
        this.field_B = false;
        if (this.field_V) {
          kla.showLoginForm((byte) -72);
          return;
        }
        if (this.field_bb) {
          IntrusiveNode.reopenLoginForm(30497);
          return;
        }
    }

    static {
        field_db = new String[6];
        field_db[4] = "Pulse (Fast)";
        field_db[2] = "Flicker (Fast)";
        field_Z = new String[3];
        field_db[1] = "Glow";
        field_db[0] = "Flat";
        field_db[3] = "Flicker (Slow)";
        field_db[5] = "Pulse (Slow)";
        field_Z[0] = "Shallow";
        field_Z[1] = "Medium";
        field_Z[2] = "Deep";
    }
}
