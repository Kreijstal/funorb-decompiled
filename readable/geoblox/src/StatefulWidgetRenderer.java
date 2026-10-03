/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetRenderer extends TextWidgetRenderer {
    static byte[][] byteArrayPool5000;
    static int field_u;
    static TextTemplateDefinitionLoader field_r;
    static int field_v;
    static String field_w;
    private WidgetSkinState workingSkin;
    private WidgetSkinState[] stateSkins;

    final WidgetSkinState a(int param0, int param1) {
        if (param0 >= -93) {
            return (WidgetSkinState) null;
        }
        WidgetSkinState dupTemp$0 = new WidgetSkinState();
        this.stateSkins[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, Sprite[] param1) {
        int var4 = 0;
        WidgetSkinState[] var3 = null;
        WidgetSkinState var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        WidgetSkinState[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != 124) {
            var7 = (UiWidget) null;
            this.drawWidget(-125, -66, 53, true, (UiWidget) null);
          }
          var8 = this.stateSkins;
          var3 = var8;
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.panelSprites = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("rd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(boolean param0, StatefulWidgetRenderer param1, boolean param2) {
        int var4_int = 0;
        WidgetSkinState dupTemp$0 = null;
        WidgetSkinState stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        WidgetSkinState stackIn_9_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetSkinState var5 = null;
        WidgetSkinState var6 = null;
        int var7 = 0;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          super.a(param1, param0);
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.stateSkins[var4_int];
              if (var5 == null) {
                param1.stateSkins[var4_int] = null;
              } else {
                var6 = param1.stateSkins[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = 2;
                if (var6 == null) {
                  dupTemp$0 = new WidgetSkinState();
                  param1.stateSkins[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                } else {
                  stackIn_9_2 = var6;
                }
                ((WidgetSkinState) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              }
            }
            return;
          }
          ArrayOperations.copyReferences(this.stateSkins, 0, param1.stateSkins, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rd.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, Sprite param1) {
        int var4 = 0;
        WidgetSkinState[] var3 = null;
        WidgetSkinState var5 = null;
        int var6 = 0;
        WidgetSkinState[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          var7 = this.stateSkins;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.icon = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != 520) {
            String var2 = (String) null;
            StatefulWidgetRenderer.a(38, (String) null);
        }
        kd.field_e.hideAllDialogs(10936);
        if (!(null != SecondaryNodeHashTable.field_i)) {
            SecondaryNodeHashTable.field_i = new ProgressDialog(kd.field_e, TextWidgetRenderer.field_d);
        }
        kd.field_e.showDialog(false, SecondaryNodeHashTable.field_i);
    }

    final static void b(int param0) {
        ResizableDialog.awtKeyCodeToInternalCode[45] = 26;
        ResizableDialog.awtKeyCodeToInternalCode[44] = 71;
        ResizableDialog.awtKeyCodeToInternalCode[520] = 59;
        ResizableDialog.awtKeyCodeToInternalCode[222] = 58;
        ResizableDialog.awtKeyCodeToInternalCode[192] = param0;
        ResizableDialog.awtKeyCodeToInternalCode[46] = 72;
        ResizableDialog.awtKeyCodeToInternalCode[47] = 73;
        ResizableDialog.awtKeyCodeToInternalCode[92] = 74;
        ResizableDialog.awtKeyCodeToInternalCode[91] = 42;
        ResizableDialog.awtKeyCodeToInternalCode[93] = 43;
        ResizableDialog.awtKeyCodeToInternalCode[61] = 27;
        ResizableDialog.awtKeyCodeToInternalCode[59] = 57;
    }

    public StatefulWidgetRenderer() {
        this.stateSkins = new WidgetSkinState[6];
        this.workingSkin = new WidgetSkinState();
        WidgetSkinState dupTemp$0 = new WidgetSkinState();
        this.stateSkins[0] = dupTemp$0;
        WidgetSkinState var1 = dupTemp$0;
        var1.a((byte) -3);
    }

    public static void a(byte param0) {
        int var1 = -71 / ((32 - param0) / 50);
        field_r = null;
        byteArrayPool5000 = (byte[][]) null;
        field_w = null;
    }

    final void a(Sprite[] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1;
          if (this.stateSkins[var4_int] == null) {
            this.stateSkins[var4_int] = new WidgetSkinState();
          }
          this.stateSkins[param1].panelSprites = param0;
          if (param2 <= 38) {
            field_r = (TextTemplateDefinitionLoader) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rd.GA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetSkinState var7 = null;
        WidgetSkinState var9 = null;
        ButtonWidget var10 = null;
        WidgetSkinState var11 = null;
        WidgetSkinState var12 = null;
        WidgetSkinState var13 = null;
        WidgetSkinState var14 = null;
        try {
          if (!(widget instanceof ButtonWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (widget);
          }
          var10 = (ButtonWidget) ((Object) stackIn_3_0);
          PasswordWidgetRenderer.a(widget.widgetY + parentY, widget.widgetX + parentX, -14045, widget.widgetHeight + (parentY + widget.widgetY), widget.widgetWidth + (parentX + widget.widgetX));
          if (var10 != null) {
            widgetEnabled = widgetEnabled & var10.enabled;
          }
          var7 = this.stateSkins[0];
          if (methodGuard >= -5) {
            byteArrayPool5000 = (byte[][]) null;
          }
          this.workingSkin.a((byte) -28);
          var7.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
          if (var10 != null) {
            if (var10.active) {
              var11 = this.stateSkins[1];
              if (var11 != null) {
                var11.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
              }
            }
            if (var10.pointerInside) {
              var12 = this.stateSkins[3];
              if ((var10.pressedPointerButton != 0) &&
                  (var12 != null)) {
                var12.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
              } else {
                var9 = this.stateSkins[2];
                if (var9 != null) {
                  var9.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
                }
              }
            }
          }
          if (widget.hasKeyboardFocus((byte) 54)) {
            var13 = this.stateSkins[5];
            if (var13 != null) {
              var13.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
            }
          }
          if (!widgetEnabled) {
            var14 = this.stateSkins[4];
            if (var14 != null) {
              var14.a(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
            }
          }
          this.workingSkin.a((StatefulWidgetRenderer) (this), parentX, parentY, widget, 0);
          id.restoreRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("rd.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -116) {
            return;
        }
        try {
            GameSoundResources.optionalLoginText = param1;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "rd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    StatefulWidgetRenderer(StatefulWidgetRenderer param0, boolean param1) {
        this();
        try {
            param0.a(true, (StatefulWidgetRenderer) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -61) {
            byteArrayPool5000 = (byte[][]) null;
          }
          if (mf.decodeSpritesFromArchive(param2, param0, 114, param3)) {
            return SpriteConstructionSupport.buildSpritesWithDecodedAlpha(104);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rd.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        byteArrayPool5000 = new byte[250][];
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
