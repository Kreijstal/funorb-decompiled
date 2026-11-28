/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RichTextWidget extends InteractiveComponent {
    private TextHotspotBounds networkSupport010State0002;
    static String stringState0449;
    private String[] stringArrayState0034;
    private NodeDeque nodeDequeState0025;
    static NodeDeque nodeDequeState0026;
    static NodeDeque nodeDequeState0027;
    static String stringState0450;
    static String stringState0451;
    static RgbSprite rgbSpriteState0045;
    static boolean booleanState0152;

    String getTooltipText(byte byteArgument1) {
        if (null == this.networkSupport010State0002) {
          return null;
        }
        if (null == this.stringArrayState0034) {
          return null;
        }
        if (this.stringArrayState0034.length <= this.networkSupport010State0002.integerState0587) {
          return null;
        }
        if (byteArgument1 != 113) {
          return (String) null;
        }
        return this.stringArrayState0034[this.networkSupport010State0002.integerState0587];
    }

    final void performAction1364(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = -125 % ((-61 - integerArgument1) / 43);
        this.setBounds(((TextWidgetRenderer) ((Object) this.callbackContract004State0006)).getPreferredHeight((UiComponent) (this), -125), integerArgument4, integerArgument2, integerArgument3, -16555);
    }

    final static void performAction1363(boolean booleanArgument1, byte byteArgument2) {
        if (BucketBoard.booleanState0109) {
          MixedSupport051.renderingSupport007State0005 = IterableNodeCollection.computeRenderingSupport0071657(MixedSupport063.integerArrayState0111, booleanArgument1, !ProgressMessageDialog.booleanState0059 ? 1 : 2, -104);
          return;
        }
        if (SceneWidgetPart007.booleanState0114) {
          MixedSupport020.renderingSupport007State0003 = MixedSupport105.computeRenderingSupport0071369(-21, booleanArgument1);
          return;
        }
        if (MixedSupport043.booleanState0048) {
          MixedSupport007.renderingSupport007State0001 = FullscreenStatusDialog.computeRenderingSupport0070696((byte) -108, booleanArgument1);
          return;
        }
        if (LoginPanel.booleanState0066) {
          PlayerNameAvailabilityValidator.performAction0825(0, booleanArgument1);
          LoginPanel.booleanState0066 = false;
          return;
        }
        if (MixedSupport090.booleanState0124) {
          SceneWidgetPart012.performAction1608(booleanArgument1, 111);
          MixedSupport049.booleanState0058 = true;
          MixedSupport090.booleanState0124 = false;
          return;
        }
        ComponentContainer.renderingSupport007State0006.performAction0865(-1, booleanArgument1);
        if (byteArgument2 >= -99) {
          RichTextWidget.performAction1367(-32);
        }
    }

    void updatePointer(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        try {
          super.updatePointer(uiComponentArgument1, 48, integerArgument3, integerArgument4);
          this.networkSupport010State0002 = null;
          if (this.booleanState0018) {
            integerLocal1 = -this.integerState0110 + (HashNode.integerState0069 - integerArgument4);
            integerLocal2 = MixedSupport101.integerState0590 - (integerArgument3 + this.integerState0104);
            this.networkSupport010State0002 = this.findHotspotAt(1, integerLocal2, integerLocal1);
          }
          if (integerArgument2 < 38) {
            this.stringArrayState0034 = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("qi.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final void performAction1362(String stringArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeException = null;
        String[] stringArrayLocal3 = null;
        int integerLocal4 = 0;
        String[] stringArrayLocal5 = null;
        String[] stringArrayLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 != 1) {
            return;
          }
          if (null == this.stringArrayState0034 ||
            integerArgument2 >= this.stringArrayState0034.length) {
            stringArrayLocal5 = new String[integerArgument2 + 1];
            stringArrayLocal6 = stringArrayLocal5;
            stringArrayLocal3 = stringArrayLocal6;
            if (null != this.stringArrayState0034) {
              for (integerLocal1 = 0; this.stringArrayState0034.length > integerLocal1; integerLocal1++) {
                stringArrayLocal5[integerLocal1] = this.stringArrayState0034[integerLocal1];
              }
            }
            this.stringArrayState0034 = stringArrayLocal6;
          }
          this.stringArrayState0034[integerArgument2] = stringArgument1;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeException = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeException;
          stackStringBuilderLocal8 = new StringBuilder().append("qi.J(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    void drawWidget(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        super.drawWidget(integerArgument1, -128, integerArgument3, integerArgument4);
        if (integerArgument2 >= -103) {
          this.rebuildHotspotBounds(112);
        }
        if (integerArgument3 != 0) {
          return;
        }
        TextWidgetRenderer callbackContract012Local3 = (TextWidgetRenderer) ((Object) this.callbackContract004State0006);
        TextHotspotBounds networkSupport010Local4 = this.networkSupport010State0002;
        if (networkSupport010Local4 == null) {
        } else {
          integerLocal1 = callbackContract012Local3.getTextOriginX((byte) 24, (UiComponent) (this), integerArgument1);
          integerLocal2 = callbackContract012Local3.getTextOriginY(integerArgument4, 0, (UiComponent) (this));
          do {
            AgeValidator.drawDottedRectangle(2 + networkSupport010Local4.integerState0584, networkSupport010Local4.integerState0588 + (integerLocal1 - 2), (byte) -128, -2 + (networkSupport010Local4.integerState0586 + integerLocal2), networkSupport010Local4.integerState0583 + 2);
            networkSupport010Local4 = networkSupport010Local4.networkSupport010State0001;
          } while (networkSupport010Local4 != null);
        }
    }

    final static SceneWidget computeSceneWidget1365(byte byteArgument1) {
        int integerLocal1 = 48 / ((64 - byteArgument1) / 52);
        return MixedSupport103.computeSceneWidget1284(5);
    }

    final static void performAction1359(float floatArgument1, int integerArgument2, String stringArgument3) {
        try {
          RenderingSupport002.floatState0002 = floatArgument1;
          LoginPanel.stringState0227 = stringArgument3;
          int integerLocal1 = 79 / ((-18 - integerArgument2) / 58);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "qi.O(" + floatArgument1 + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    private final TextHotspotBounds findHotspotAt(int integerArgument1, int integerArgument2, int integerArgument3) {
        TextHotspotBounds networkSupport010Local1;
        TextHotspotBounds networkSupport010Local2;
        int integerLocal3;
        UiComponent uiComponentLocal4;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        networkSupport010Local1 = (TextHotspotBounds) (this.nodeDequeState0025.beginBackward((byte) 49));
        if (integerArgument1 != 1) {
          uiComponentLocal4 = (UiComponent) null;
          this.updatePointer((UiComponent) null, 8, -16, -10);
        }
        while (networkSupport010Local1 != null) {
          networkSupport010Local2 = networkSupport010Local1;
          while (networkSupport010Local2 != null) {
            if (integerArgument3 >= networkSupport010Local2.integerState0588 &&
              networkSupport010Local2.integerState0586 <= integerArgument2 &&
              integerArgument3 < networkSupport010Local2.integerState0584 + networkSupport010Local2.integerState0588 &&
              networkSupport010Local2.integerState0586 + networkSupport010Local2.integerState0583 >= integerArgument2) {
              return networkSupport010Local1;
            }
            networkSupport010Local2 = networkSupport010Local2.networkSupport010State0001;
          }
          networkSupport010Local1 = (TextHotspotBounds) (this.nodeDequeState0025.nextBackward(true));
        }
        return null;
    }

    public static void clearStaticReferences(byte byteArgument1) {
        rgbSpriteState0045 = null;
        nodeDequeState0027 = null;
        stringState0449 = null;
        int integerLocal1 = -63 % ((-30 - byteArgument1) / 38);
        stringState0451 = null;
        stringState0450 = null;
        nodeDequeState0026 = null;
    }

    boolean takeFocus(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!booleanArgument1) {
            return false;
          }
          stringState0450 = (String) null;
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("qi.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static void performAction1367(int integerArgument1) {
        MouseWheelInput.performAction0670(integerArgument1, (byte) -104);
    }

    final void activateFromInput(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super.activateFromInput(integerArgument1, integerArgument2, integerArgument3, integerArgument4);
        int integerLocal1 = -this.integerState0110 + integerArgument1;
        int integerLocal2 = integerArgument2 - this.integerState0104;
        TextHotspotBounds networkSupport010Local3 = this.findHotspotAt(1, integerLocal2, integerLocal1);
        if (networkSupport010Local3 != null) {
          if (null != this.callbackContract006State0001) {
            ((TextHotspotListener) ((Object) this.callbackContract006State0001)).onTextHotspotActivated(this, integerArgument3, -118, networkSupport010Local3.integerState0587);
          } else {
          }
        }
    }

    final void setBounds(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        super.setBounds(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5);
        this.rebuildHotspotBounds(2874);
    }

    final void rebuildHotspotBounds(int integerArgument1) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int integerLocal4;
        TextWidgetRenderer callbackContract012Local5;
        TextLayout textLayoutLocal6;
        int integerLocal7;
        String stringLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        Object objectLocal12;
        TextLineMetrics textLineMetricsLocal13;
        int integerLocal14;
        int integerLocal15;
        TextHotspotBounds networkSupport010Local16;
        int integerLocal17;
        int integerLocal18;
        integerLocal17 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.nodeDequeState0025 = new NodeDeque();
        integerLocal4 = 0;
        if (integerArgument1 != 2874) {
          nodeDequeState0027 = (NodeDeque) null;
        }
        callbackContract012Local5 = (TextWidgetRenderer) ((Object) this.callbackContract004State0006);
        textLayoutLocal6 = callbackContract012Local5.getTextLayout((UiComponent) (this), (byte) 117);
        while (true) {
          integerLocal7 = this.stringState0078.indexOf("<hotspot=", integerLocal4);
          if (integerLocal7 == -1) {
            return;
          }
          integerLocal9 = this.stringState0078.indexOf(">", integerLocal7);
          stringLocal8 = this.stringState0078.substring(9 + integerLocal7, integerLocal9);
          integerLocal18 = Integer.parseInt(stringLocal8);
          integerLocal4 = this.stringState0078.indexOf("</hotspot>", integerLocal7);
          integerLocal10 = textLayoutLocal6.getLineIndexForTextOffset(false, integerLocal7);
          integerLocal11 = textLayoutLocal6.getLineIndexForTextOffset(false, integerLocal4);
          objectLocal12 = null;
          for (integerLocal1 = integerLocal10; integerLocal1 <= integerLocal11; integerLocal1++) {
            textLineMetricsLocal13 = textLayoutLocal6.lines[integerLocal1];
            if (integerLocal1 != integerLocal10) {
              stackIntegerLocal2 = textLineMetricsLocal13.characterXPositions[0];
            } else {
              stackIntegerLocal2 = textLayoutLocal6.getXForTextOffset((byte) -94, integerLocal7);
            }
            integerLocal14 = stackIntegerLocal2;
            if (integerLocal11 != integerLocal1) {
              if (textLineMetricsLocal13 != null) {
                stackIntegerLocal3 = textLineMetricsLocal13.characterXPositions[textLineMetricsLocal13.characterXPositions.length - 1];
              } else {
                stackIntegerLocal3 = 0;
              }
            } else {
              stackIntegerLocal3 = textLayoutLocal6.getXForTextOffset((byte) -94, integerLocal4);
            }
            integerLocal15 = stackIntegerLocal3;
            networkSupport010Local16 = new TextHotspotBounds(integerLocal18, integerLocal14, textLineMetricsLocal13.topY, integerLocal15 - integerLocal14, Math.max(callbackContract012Local5.getFontLineHeight((byte) -120), -textLineMetricsLocal13.topY + textLineMetricsLocal13.bottomY));
            if (objectLocal12 != null) {
              ((TextHotspotBounds) (objectLocal12)).networkSupport010State0001 = networkSupport010Local16;
            }
            this.nodeDequeState0025.addFirst(networkSupport010Local16, 2777);
            objectLocal12 = networkSupport010Local16;
          }
        }
    }

    RichTextWidget(String stringArgument1, WidgetRenderer callbackContract004Argument2) {
        super(stringArgument1, (WidgetEventListener) null);
        this.networkSupport010State0002 = null;
        try {
          this.callbackContract004State0006 = callbackContract004Argument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "qi.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (callbackContract004Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0450 = "to over <%0> great games";
        stringState0449 = "Fast Drop Bonus: ";
        stringState0451 = "Checking";
        nodeDequeState0026 = new NodeDeque();
        rgbSpriteState0045 = new RgbSprite(270, 70);
    }
}
