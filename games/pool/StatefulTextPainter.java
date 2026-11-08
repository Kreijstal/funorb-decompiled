/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulTextPainter extends TextWidgetPainter {
    static String fsNonmember;
    static String changedisplayname;
    static PlatformTaskDispatcher field_s;
    private WidgetStyleLayer workingLayer;
    static int field_x;
    static String playfreeversion;
    private WidgetStyleLayer[] stateLayers;
    static String createAlertNameleadingspace;

    private final void copyStatesTo(boolean param0, StatefulTextPainter param1, byte param2) {
        int var4_int = 0;
        WidgetStyleLayer dupTemp$0 = null;
        WidgetStyleLayer stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        WidgetStyleLayer stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetStyleLayer var5 = null;
        WidgetStyleLayer var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          super.copyStyleTo(-1177150015, param1);
          if (param2 < 59) {
            return;
          }
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.stateLayers[var4_int];
              if (var5 == null) {
                param1.stateLayers[var4_int] = null;
              } else {
                var6 = param1.stateLayers[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = 288;
                if (var6 == null) {
                  dupTemp$0 = new WidgetStyleLayer();
                  param1.stateLayers[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                } else {
                  stackIn_11_2 = var6;
                }
                ((WidgetStyleLayer) (Object) stackIn_10_0).copyTo(stackIn_10_1, stackIn_11_2);
              }
            }
            return;
          }
          ArrayOperations.copy(this.stateLayers, 0, param1.stateLayers, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("lg.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public StatefulTextPainter() {
        this.stateLayers = new WidgetStyleLayer[6];
        this.workingLayer = new WidgetStyleLayer();
        WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
        this.stateLayers[0] = dupTemp$0;
        WidgetStyleLayer var1 = dupTemp$0;
        var1.reset(-51);
    }

    final void setSpriteForAllStates(Sprite param0, int param1) {
        int var4 = 0;
        WidgetStyleLayer[] var3 = null;
        int var5 = 0;
        WidgetStyleLayer var6 = null;
        int var7 = 0;
        WidgetStyleLayer[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Pool.field_O;
        try {
          var8 = this.stateLayers;
          var3 = var8;
          var5 = 78 / ((29 - param1) / 36);
          for (var4 = 0; var4 < var8.length; var4++) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.sprite = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("lg.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setStateFrameSprites(byte param0, int param1, Sprite[] param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (this.stateLayers[var4_int] == null) {
            this.stateLayers[var4_int] = new WidgetStyleLayer();
          }
          if (param0 != -79) {
            StatefulTextPainter.createAccountNameValue(-45);
          }
          this.stateLayers[param1].frameSprites = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lg.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final WidgetStyleLayer createStateLayer(int param0, int param1) {
        if (param1 != 0) {
          Sprite var4 = (Sprite) null;
          this.setSpriteForAllStates((Sprite) null, -125);
        }
        WidgetStyleLayer dupTemp$0 = new WidgetStyleLayer();
        this.stateLayers[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void releaseStatics(boolean param0) {
        fsNonmember = null;
        if (!param0) {
          playfreeversion = (String) null;
        }
        playfreeversion = null;
        createAlertNameleadingspace = null;
        changedisplayname = null;
        field_s = null;
    }

    final void setFrameSpritesForAllStates(Sprite[] param0, int param1) {
        int var4 = 0;
        WidgetStyleLayer[] var3 = null;
        WidgetStyleLayer var5 = null;
        int var6 = 0;
        WidgetStyleLayer[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Pool.field_O;
        try {
          var7 = this.stateLayers;
          var3 = var7;
          if (param1 != 6) {
            return;
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.frameSprites = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("lg.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paintWidget(boolean param0, int param1, byte param2, int param3, UiWidget param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetStyleLayer var7 = null;
        int var8 = 0;
        WidgetStyleLayer var10 = null;
        ButtonWidget var11 = null;
        WidgetStyleLayer var12 = null;
        WidgetStyleLayer var13 = null;
        WidgetStyleLayer var14 = null;
        WidgetStyleLayer var15 = null;
        try {
          if (!(param4 instanceof ButtonWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (param4);
          }
          var11 = (ButtonWidget) (stackIn_3_0);
          QuickChatPhraseRegistry.pushRasterClip(param1 + param4.widgetX, param4.widgetY + param3, param4.widgetWidth + (param4.widgetX + param1), (byte) 85, param4.widgetHeight + (param4.widgetY + param3));
          if (var11 != null) {
            param0 = param0 & var11.enabled;
          }
          var8 = -10 / ((param2 - 2) / 41);
          var7 = this.stateLayers[0];
          this.workingLayer.reset(-107);
          var7.applyTo(this, param3, this.workingLayer, -116, param4, param1);
          if (var11 != null) {
            if (var11.active) {
              var12 = this.stateLayers[1];
              if (var12 != null) {
                var12.applyTo(this, param3, this.workingLayer, -103, param4, param1);
              }
            }
            if (var11.pointerInside) {
              var13 = this.stateLayers[3];
              if (var11.pressedPointerButton != 0 &&
                var13 != null) {
                var13.applyTo(this, param3, this.workingLayer, -113, param4, param1);
              } else {
                var10 = this.stateLayers[2];
                if (var10 != null) {
                  var10.applyTo(this, param3, this.workingLayer, -108, param4, param1);
                }
              }
            }
          }
          if (param4.hasKeyboardFocus(66)) {
            var14 = this.stateLayers[5];
            if (var14 != null) {
              var14.applyTo(this, param3, this.workingLayer, -128, param4, param1);
            }
          }
          if (!param0) {
            var15 = this.stateLayers[4];
            if (var15 != null) {
              var15.applyTo(this, param3, this.workingLayer, -112, param4, param1);
            }
          }
          this.workingLayer.draw(param3, param1, param4, this, 110);
          TriangleMesh.a(121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("lg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    StatefulTextPainter(StatefulTextPainter param0, boolean param1) {
        this();
        try {
          param0.copyStatesTo(param1, this, (byte) 89);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static LoginTextValue createAccountNameValue(int obfuscationGuard) {
        if (obfuscationGuard != 5) {
          StatefulTextPainter.createAccountNameValue(-37);
        }
        return new LoginTextValue(LoginTextSupport.getAccountName(true), DualLinkDequeIterator.isAccountNameInputIncomplete(true));
    }

    static {
        changedisplayname = "Change display name";
        fsNonmember = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        playfreeversion = "Play free version";
        createAlertNameleadingspace = "Names cannot start or end with space or underscore";
    }
}
