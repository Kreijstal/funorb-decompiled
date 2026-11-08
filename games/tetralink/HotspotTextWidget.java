/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class HotspotTextWidget extends TextButton {
    private TextHighlightSpan field_X;
    private IntrusiveDeque field_T;
    static LoginProgressHelpers field_Q;
    private String[] field_P;
    static UiComponent field_V;
    static int field_S;
    static String field_Y;
    static Archive field_U;
    static int field_W;
    static String field_R;

    boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -384169950) {
            return false;
          }
          field_R = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fk.EB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void rebuildHotspots(int param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        WidgetTextLayout var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLayoutLine var12;
        int var13;
        int var14;
        TextHighlightSpan var15;
        int var16;
        int var7Lifetime1;
        var16 = TetraLink.field_J;
        this.field_T = new IntrusiveDeque();
        var2 = 0;
        var3 = (WidgetTextLayout) ((Object) this.field_H);
        if (param0 != -1) {
          return;
        }
        var4 = var3.getTextLayout((UiWidget) (this), false);
        while (true) {
          var5 = this.field_A.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_A.indexOf(">", var5);
          var6 = this.field_A.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_A.indexOf("</hotspot>", var5);
          var8 = var4.lineIndexForCharacter(var5, 112);
          var9 = var4.lineIndexForCharacter(var2, param0 ^ -122);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var11 != var8) {
              stackIn_9_0 = var12.field_j[0];
            } else {
              stackIn_9_0 = var4.characterX(var5, true);
            }
            var13 = stackIn_9_0;
            if (var11 != var9) {
              if (var12 == null) {
                stackIn_14_0 = 0;
              } else {
                stackIn_14_0 = var12.field_j[-1 + var12.field_j.length];
              }
            } else {
              stackIn_14_0 = var4.characterX(var2, true);
            }
            var14 = stackIn_14_0;
            var15 = new TextHighlightSpan(var7Lifetime1, var13, var12.field_h, -var13 + var14, Math.max(var3.getLineInkHeight(true), var12.field_a - var12.field_h));
            if (var10 != null) {
              ((TextHighlightSpan) (var10)).field_v = var15;
            }
            this.field_T.addLast(var15, false);
            var10 = var15;
          }
        }
    }

    final void setBoundsToPreferredHeight(int param0, int param1, int param2, int param3) {
        this.setBounds(((WidgetTextLayout) ((Object) this.field_H)).getPreferredTextHeight((UiWidget) (this), 80), param2, 23, param1, param0);
        if (param3 >= -13) {
          field_S = -14;
        }
    }

    private final TextHighlightSpan hotspotAt(int param0, byte param1, int param2) {
        TextHighlightSpan var4;
        TextHighlightSpan var5;
        int var6;
        var6 = TetraLink.field_J;
        var4 = (TextHighlightSpan) (this.field_T.first(false));
        if (param1 < 92) {
          return (TextHighlightSpan) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_o <= param0 &&
              var5.field_s <= param2 &&
              var5.field_o + var5.field_r > param0 &&
              var5.field_x + var5.field_s >= param2) {
              return var4;
            }
            var5 = var5.field_v;
          }
          var4 = (TextHighlightSpan) (this.field_T.next((byte) -70));
        }
        return null;
    }

    final static void closeQuickChatMenuIfOpen(byte param0) {
        if (param0 != -8) {
          return;
        }
        if (TextLayout.field_a) {
          GzipDecompressor.closeQuickChatMenu((byte) 42);
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(param0 ^ 0, param1, param2, param3);
        if (param3 != param0) {
          return;
        }
        WidgetTextLayout var9 = (WidgetTextLayout) ((Object) this.field_H);
        TextHighlightSpan var6 = this.field_X;
        if (var6 == null) {
        } else {
          var7 = var9.textOriginY(param1, param0 ^ 0, (UiWidget) (this));
          var8 = var9.getTextOriginX((UiWidget) (this), param2, true);
          do {
            TriangleMesh.drawDottedRectangle(var6.field_r + 2, var6.field_s + var8 - 2, 0, var6.field_x + 2, -2 + (var6.field_o + var7));
            var6 = var6.field_v;
          } while (var6 != null);
        }
    }

    String getTooltip(int param0) {
        if (param0 != 0) {
          field_V = (UiComponent) null;
        }
        if (null == this.field_X) {
          return null;
        }
        if (null == this.field_P) {
          return null;
        }
        if (this.field_P.length <= this.field_X.field_w) {
          return null;
        }
        return this.field_P[this.field_X.field_w];
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -21 / ((-61 - param2) / 51);
        super.setBounds(param0, param1, -126, param3, param4);
        this.rebuildHotspots(-1);
    }

    final static boolean isValidDate(int param0, byte param1, int param2, int param3) {
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (param2 >= 1 &&
          IsaacCipher.getDaysInMonth(param3, param0, 10121) >= param2) {
          if (param1 != -40) {
            field_R = (String) null;
          }
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_R = null;
        if (param0 != -24314) {
          field_R = (String) null;
        }
        field_Q = null;
        field_U = null;
        field_V = null;
        field_Y = null;
    }

    final static int[] buildRotationTransform(int param0, byte param1, int param2) {
        if (param1 != -67) {
          return (int[]) null;
        }
        int var3 = QuickChatMenu.sineFixed(param2, -28583);
        int var4 = CommonUiHelpers.sineFixed(param1 ^ 61, param2);
        int var5 = QuickChatMenu.sineFixed(param0, -28583);
        int var6 = CommonUiHelpers.sineFixed(109, param0);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_X = null;
          if (!param3) {
            HotspotTextWidget.isValidDate(-113, (byte) -121, 13, -15);
          }
          if (this.field_r) {
            var5_int = -this.field_t + ContextMenu.field_Nb - param1;
            var6 = ClientProtocolStage.field_a - param2 - this.field_w;
            this.field_X = this.hotspotAt(var5_int, (byte) 126, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fk.MA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void activate(int param0, int param1, int param2, int param3) {
        super.activate(param0, param1, param2, param3);
        int var5 = param1 - this.field_t;
        int var6 = -this.field_w + param0;
        TextHighlightSpan var7 = this.hotspotAt(var5, (byte) 119, var6);
        if (var7 != null &&
          this.field_s != null) {
          ((HotspotListener) ((Object) this.field_s)).onHotspotAction(var7.field_w, (byte) -103, this, param3);
        }
    }

    HotspotTextWidget(String param0, WidgetPainter param1) {
        super(param0, (WidgetListener) null);
        this.field_X = null;
        try {
          this.field_H = param1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setHotspotTooltip(int param0, String param1, byte param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = TetraLink.field_J;
        try {
          if (this.field_P == null ||
            this.field_P.length <= param0) {
            var7 = new String[1 + param0];
            var8 = var7;
            var4 = var8;
            if (this.field_P != null) {
              for (var5 = 0; this.field_P.length > var5; var5++) {
                var7[var5] = this.field_P[var5];
              }
            }
            this.field_P = var8;
          }
          this.field_P[param0] = param1;
          if (param2 != -127) {
            field_W = -57;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("fk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void reportClientError(int param0, Throwable param1, String param2) {
        try {
          PlatformTaskDispatcher stackIn_15_0;
          boolean stackIn_15_1;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          java.net.URL stackIn_15_4;
          StringBuilder stackIn_15_5;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          String stackIn_16_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          AsyncRequest var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = TetraLink.field_J;
          try {
            if (param0 >= -38) {
              field_V = (UiComponent) null;
            }
            var3 = "";
            if (param1 != null) {
              var3 = CanvasAndErrorHelpers.formatThrowable((byte) 118, param1);
            }
            if (param2 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            ErrorPrintHelpers.printError((byte) 127, var3);
            var7 = NameSuggestionsPanel.replaceAll(true, ":", "%3a", var3);
            var8 = NameSuggestionsPanel.replaceAll(true, "@", "%40", var7);
            var9 = NameSuggestionsPanel.replaceAll(true, "&", "%26", var8);
            var10 = NameSuggestionsPanel.replaceAll(true, "#", "%23", var9);
            if (ChatPanelSlideHelpers.field_h == null) {
              return;
            }
            stackIn_15_0 = TopLevelContainerHelpers.field_b;
            stackIn_15_1 = false;
            stackIn_15_2 = null;
            stackIn_15_3 = null;
            stackIn_15_4 = ChatPanelSlideHelpers.field_h.getCodeBase();
            stackIn_15_5 = new StringBuilder().append("clienterror.ws?c=").append(DialWidgetPainter.field_f).append("&u=");
            if (null == TextFieldValidator.field_m) {
              stackIn_16_2 = null;
              stackIn_16_3 = null;
              stackIn_16_6 = "" + MarkerSlider.field_U;
            } else {
              stackIn_16_2 = null;
              stackIn_16_3 = null;
              stackIn_16_6 = TextFieldValidator.field_m;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_15_0).requestUrlStream(stackIn_15_1, new java.net.URL(stackIn_15_4, ((StringBuilder) (Object) stackIn_15_5).append(stackIn_16_6).append("&v1=").append(PlatformTaskDispatcher.field_v).append("&v2=").append(PlatformTaskDispatcher.field_x).append("&e=").append(var10).toString()));
            while (var4.field_d == 0) {
              AnimationSequence.sleepMillis(false, 1L);
            }
            if (var4.field_d == 1) {
              var5 = (DataInputStream) (var4.field_f);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_Q = new LoginProgressHelpers();
        field_Y = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_W = -1;
        field_R = "Invalid password.";
    }
}
