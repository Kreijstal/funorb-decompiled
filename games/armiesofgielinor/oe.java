/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ro implements WidgetActivationListener {
    private boolean field_Ab;
    private kd field_xb;
    static NodeDeque field_Bb;
    private boolean field_yb;
    static ClientUiComponent field_Cb;
    static String field_zb;

    final boolean advanceDialogAnimation(byte obfuscationGuard) {
        AccountNameCheckResult var2;
        AccountNameCheckResult var3;
        AccountNameCheckResult var2Lifetime1;
        if (obfuscationGuard == -1) {
          if (!this.open) {
            return super.advanceDialogAnimation((byte) -1);
          }
          if (this.field_Ab) {
            return super.advanceDialogAnimation((byte) -1);
          }
          var2 = ki.a(-61440);
          if (var2 == null) {
            return super.advanceDialogAnimation((byte) -1);
          }
          this.a(false, (byte) -53, var2);
          return super.advanceDialogAnimation((byte) -1);
        }
        var3 = (AccountNameCheckResult) null;
        this.a(true, (byte) 54, (AccountNameCheckResult) null);
        if (!this.open) {
          return super.advanceDialogAnimation((byte) -1);
        }
        if (this.field_Ab) {
          return super.advanceDialogAnimation((byte) -1);
        }
        var2Lifetime1 = ki.a(-61440);
        if (var2Lifetime1 != null) {
          this.a(false, (byte) -53, var2Lifetime1);
        }
        return super.advanceDialogAnimation((byte) -1);
    }

    public static void j(byte param0) {
        field_Cb = null;
        field_Bb = null;
        field_zb = null;
        int var1 = 18 / ((-35 - param0) / 35);
    }

    final void k(byte param0) {
        this.a(true, (byte) -103, DisplacedUnitMarker.a(-1, 248, ResourceProtocolClient.field_m));
        if (param0 >= -81) {
          this.field_Ab = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -6) {
          return;
        }
        if (param6 >= param4) {
          if (param2 > param6) {
            ManaEvent.a(param6, param4, param7, param2, param1, param5, SoftwareRaster.pixels, param3, (byte) 20);
            return;
          }
          if (param4 >= param2) {
            ManaEvent.a(param4, param2, param1, param6, param3, param5, SoftwareRaster.pixels, param7, (byte) 20);
            return;
          }
          ManaEvent.a(param2, param4, param1, param6, param7, param5, SoftwareRaster.pixels, param3, (byte) 20);
          return;
        }
        if (param2 > param4) {
          ManaEvent.a(param4, param6, param7, param2, param3, param5, SoftwareRaster.pixels, param1, (byte) 20);
          return;
        }
        if (param6 >= param2) {
          ManaEvent.a(param6, param2, param3, param4, param1, param5, SoftwareRaster.pixels, param7, (byte) 20);
          return;
        }
        ManaEvent.a(param2, param6, param3, param4, param7, param5, SoftwareRaster.pixels, param1, (byte) 20);
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        if (this.field_yb) {
          td.a(false, true, 21);
          return;
        }
        try {
          bt.b(obfuscationGuard ^ obfuscationGuard);
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.N(" + pointerX + ',' + obfuscationGuard + ',' + button + ',' + pointerY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, AccountNameCheckResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ad var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_Ab = true;
          if (!param2.accepted) {
            if (null == param2.field_c) {
              var4 = param2.errorText;
              if (param2.field_d == 248) {
                if (!param0) {
                  NumericDateInputWidget.b(false);
                }
                var4 = ResourceProtocolClient.field_m;
                this.field_yb = true;
              }
            } else {
              var4 = AccountNamePrompt.field_Ob;
              if (null != this.field_xb) {
                this.field_xb.a((byte) -116);
              }
            }
          } else {
            var4 = eq.field_i;
          }
          if (param1 >= -2) {
            this.field_xb = (kd) null;
          }
          var5 = new ad((ro) (this), CipherPacketBuffer.field_t, var4);
          if (param2.accepted) {
            if (param2.field_h) {
              this.replaceContent(new qd(this), (byte) -81);
              return;
            }
            var5.a(ro.field_kb, (WidgetListener) (this), (byte) -61);
          } else {
            if (!this.field_yb) {
              if (param2.field_d != 5) {
                var5.a(fj.field_a, -1, 1);
              } else {
                var5.a(QuickChatCommandDefinition.field_d, 11, 1);
                var5.a(dt.field_c, 17, 1);
              }
            } else {
              var5.a(ro.field_kb, (WidgetListener) (this), (byte) 110);
            }
            if (param2.field_d == 3) {
              var5.a(SoundPlaybackHandle.field_m, 7, 1);
            } else {
              if (6 == param2.field_d) {
                var5.a(CombatEvent.field_O, 9, 1);
              }
            }
          }
          this.replaceContent(var5, (byte) -110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("oe.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    oe(ModalDialogHost param0, kd param1) {
        super(param0, CipherPacketBuffer.field_t, wm.field_d, false, false);
        try {
          this.field_xb = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static int bitwiseOr(int left, int right) {
        return left | right;
    }

    final static void a(byte[] param0, int param1) {
        if (param1 > param0[0]) {
          return;
        }
        try {
          AnimationFrameSet.field_E = param0[1];
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oe.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Bb = new NodeDeque();
        field_zb = "Withdraw invitation to <%0> to join this game";
    }
}
