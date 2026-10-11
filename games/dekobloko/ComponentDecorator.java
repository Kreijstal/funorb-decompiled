/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ComponentDecorator extends UiComponent implements CallbackContract014 {
    static SceneWidget sceneWidgetState0077;
    static String[] stringArrayState0020;
    static SceneWidget sceneWidgetState0078;
    static int integerState0497;
    UiComponent uiComponentState0002;
    static RgbSprite rgbSpriteState0034;

    void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        boolean discarded$1 = false;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (integerArgument2 != 64) {
            discarded$1 = this.computeBoolean1140((UiComponent) null, (byte) -1);
          }
          if (this.uiComponentState0002 != null) {
            this.uiComponentState0002.performAction0232(integerArgument1, 64, integerArgument3 + this.integerState0110, uiComponentArgument4, this.integerState0104 + integerArgument5, integerArgument6);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("ma.IB(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (integerArgument3 == 0 &&
            this.callbackContract004State0006 != null) {
            this.callbackContract004State0006.performAction0018(true, integerArgument1, integerArgument4, (byte) -98, (UiComponent) (this));
          }
          if (this.uiComponentState0002 != null) {
            this.uiComponentState0002.performAction0175(integerArgument1 + this.integerState0110, -119, integerArgument3, integerArgument4 + this.integerState0104);
          }
          if (integerArgument2 > -103) {
            sceneWidgetState0078 = (SceneWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.C(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final void performAction0241(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        try {
          super.performAction0241(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5);
          this.performAction1142(true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ma.DA(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final int computeInteger0245(int integerArgument1) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException caughtExceptionLocal4 = null;
        try {
          integerLocal1 = 99 / ((36 - integerArgument1) / 51);
          if (this.uiComponentState0002 == null) {
            stackIntegerLocal3 = 0;
          } else {
            stackIntegerLocal3 = this.uiComponentState0002.computeInteger0245(125);
          }
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal5) {
          caughtExceptionLocal4 = caughtParameterLocal5;
          runtimeExceptionLocal2 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.DC(" + integerArgument1 + ')');
        }
    }

    String computeString0242(byte byteArgument1) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        String stackStringLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          stringLocal1 = super.computeString0242(byteArgument1);
          if (this.uiComponentState0002 != null) {
            stringLocal3 = this.uiComponentState0002.computeString0242((byte) 113);
            if (stringLocal3 != null) {
              stackStringLocal4 = stringLocal3;
              return stackStringLocal4;
            }
          }
          stackStringLocal5 = stringLocal1;
          return stackStringLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.R(" + byteArgument1 + ')');
        }
    }

    UiComponent computeUiComponent0946(int integerArgument1) {
        UiComponent uiComponentLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent stackUiComponentLocal3 = null;
        UiComponent stackUiComponentLocal4 = null;
        Object stackObjectLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          uiComponentLocal1 = this.uiComponentState0002;
          if (uiComponentLocal1 != null &&
            uiComponentLocal1.computeBoolean0239(true)) {
            stackUiComponentLocal3 = uiComponentLocal1;
            return stackUiComponentLocal3;
          }
          if (integerArgument1 == 14) {
            stackObjectLocal5 = null;
            return (UiComponent) (stackObjectLocal5);
          }
          stackUiComponentLocal4 = (UiComponent) null;
          return stackUiComponentLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.N(" + integerArgument1 + ')');
        }
    }

    void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          super.performAction0237(uiComponentArgument1, 119, integerArgument3, integerArgument4);
          if (this.uiComponentState0002 != null) {
            this.uiComponentState0002.performAction0237(uiComponentArgument1, 110, integerArgument3 + this.integerState0104, this.integerState0110 + integerArgument4);
          }
          if (integerArgument2 <= 38) {
            this.performAction1142(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("ma.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    private final boolean computeBoolean1140(UiComponent uiComponentArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument2 != -112) {
            this.computeBoolean0062(112, -42, (UiComponent) null, -60, 72, 122, (byte) 63);
          }
          stackBooleanLocal2 = (this.uiComponentState0002 != null) && (!this.uiComponentState0002.computeBoolean0239(true)) && (this.uiComponentState0002.computeBoolean0240(false, uiComponentArgument1));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ma.H(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (booleanArgument1) {
            return true;
          }
          stackBooleanLocal2 = (null != this.uiComponentState0002) && (this.uiComponentState0002.computeBoolean0240(false, uiComponentArgument2));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ma.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final boolean computeBoolean0233(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent stackUiComponentLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (booleanArgument7) {
            this.uiComponentState0002 = (UiComponent) null;
          }
          boolean frameRemainderLocal9 = true;
          if (this.uiComponentState0002 != null) {
            stackUiComponentLocal2 = this.uiComponentState0002;
            stackBooleanLocal3 = !(booleanArgument7);
            if (((UiComponent) (Object) stackUiComponentLocal2).computeBoolean0239(stackBooleanLocal3) &&
              this.uiComponentState0002.computeBoolean0233(integerArgument1, integerArgument2, integerArgument3, uiComponentArgument4, integerArgument5, integerArgument6, false)) {
              stackBooleanLocal4 = true;
              frameRemainderLocal9 = false;
            }
          }
          if (frameRemainderLocal9) {
            stackBooleanLocal4 = false;
          }
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("ma.FC(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (uiComponentArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(booleanArgument7).append(')').toString());
        }
    }

    final static SceneWidgetPart014 computeSceneWidgetPart0141139(int integerArgument1, boolean booleanArgument2, byte byteArgument3) {
        SceneWidgetPart008 stackSceneWidgetPart008Local1;
        int stackIntegerLocal2;
        int stackIntegerLocal3;
        int stackIntegerLocal4;
        boolean stackBooleanLocal5 = false;
        SceneWidgetPart014 stackSceneWidgetPart014Local6 = null;
        SceneWidget stackSceneWidgetLocal7 = null;
        String stackStringLocal8 = null;
        SceneWidget stackSceneWidgetLocal9 = null;
        String stackStringLocal10 = null;
        int stackIntegerLocal11 = 0;
        Object stackObjectLocal12 = null;
        Object stackObjectLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        SceneWidgetPart014 stackOut_20_0;
        int integerLocal16 = 0;
        RuntimeException runtimeExceptionLocal17 = null;
        NodeDeque nodeDequeLocal18 = null;
        Object objectLocal19 = null;
        Object objectLocal20 = null;
        SceneWidgetPart014 sceneWidgetPart014Local21 = null;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        String stringLocal30 = null;
        MixedSupport104 mixedSupport104Local31 = null;
        String stringLocal32 = null;
        int integerLocal33 = 0;
        MixedSupport104 mixedSupport104Local34;
        String stringLocal35;
        integerLocal33 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument3 <= 54) {
            ComponentDecorator.performAction1144((byte) -34);
          }
          stackSceneWidgetPart008Local1 = MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005;
          stackIntegerLocal2 = ComponentContainer.integerState0377 + 2;
          stackIntegerLocal3 = (ComponentContainer.integerState0377 + 2) * (3 * integerArgument1);
          stackIntegerLocal4 = -15230;
          stackBooleanLocal5 = (MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005 == NetworkSupport005.sceneWidgetPart008State0004);
          boolean frameRemainderLocal36 = true;
          integerLocal16 = ((SceneWidgetPart008) (Object) stackSceneWidgetPart008Local1).computeBoolean1291(stackIntegerLocal2, stackIntegerLocal3, stackIntegerLocal4, stackBooleanLocal5, 2, booleanArgument2) ? 1 : 0;
          nodeDequeLocal18 = MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0108.nodeDequeState0034;
          objectLocal19 = null;
          if (ThemeTips.integerState0351 != 2) {
            RenderingSupport015.sceneWidgetState0112.booleanState0212 = false;
            MixedSupport066.sceneWidgetState0060.stringState0598 = MixedSupport155.stringState0633;
            if (1 == ThemeTips.integerState0351) {
              MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = NodeHashTable.stringState0510;
              if (integerLocal33 != 0) {
                MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = SoftwareFramebuffer.stringState0616;
              }
            } else {
              MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = SoftwareFramebuffer.stringState0616;
            }
            UiComponentPart012.performAction0653(MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0108, true);
            frameRemainderLocal36 = (integerLocal33 != 0);
          }
          if (frameRemainderLocal36) {
            RenderingSupport015.sceneWidgetState0112.booleanState0212 = true;
            MixedSupport066.sceneWidgetState0060.stringState0598 = CollectionSupport001.computeString0336(98, SceneWidgetPart013.stringState0587, new String[]{MixedSupport033.stringState0159});
            MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = null;
            objectLocal20 = null;
            sceneWidgetPart014Local21 = (SceneWidgetPart014) (nodeDequeLocal18.computeHashNode1970((byte) -108));
            while (true) {
              if (null != sceneWidgetPart014Local21) {
                integerLocal22 = 0;
                stackOut_20_0 = sceneWidgetPart014Local21;
                stackObjectLocal12 = stackOut_20_0;
                stackSceneWidgetPart014Local6 = stackOut_20_0;
                if (integerLocal33 == 0) {
                  if (stackSceneWidgetPart014Local6.nodeDequeState0034 == null) {
                    sceneWidgetPart014Local21.sceneWidgetState0147 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                    sceneWidgetPart014Local21.performAction1998(sceneWidgetPart014Local21.sceneWidgetState0147, -16834);
                    sceneWidgetPart014Local21.sceneWidgetState0149 = new SceneWidget(0L, MixedSupport036.sceneWidgetState0027);
                    sceneWidgetPart014Local21.performAction1998(sceneWidgetPart014Local21.sceneWidgetState0149, -16834);
                    sceneWidgetPart014Local21.sceneWidgetState0148 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                    sceneWidgetPart014Local21.performAction1998(sceneWidgetPart014Local21.sceneWidgetState0148, -16834);
                    sceneWidgetPart014Local21.sceneWidgetState0149.integerState0916 = 2;
                    sceneWidgetPart014Local21.performAction2004(-112);
                    integerLocal22 = 1;
                  }
                  sceneWidgetPart014Local21.integerState0896 = MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0108.integerState0896;
                  integerLocal23 = 0;
                  if (sceneWidgetPart014Local21.stringState0604 == null) {
                    integerLocal24 = 13369344;
                    integerLocal25 = 16737894;
                  } else if (MixedSupport033.stringState0159 == sceneWidgetPart014Local21.stringState0604) {
                    integerLocal24 = 52224;
                    integerLocal25 = 6750054;
                  } else {
                    integerLocal25 = 16777062;
                    integerLocal24 = 13421568;
                  }
                  integerLocal26 = 0;
                  if (sceneWidgetPart014Local21.stringState0605 != null &&
                    !sceneWidgetPart014Local21.stringState0605.equals("")) {
                    sceneWidgetPart014Local21.sceneWidgetState0148.integerState0889 = integerLocal25;
                    sceneWidgetPart014Local21.sceneWidgetState0148.rgbSpriteState0070 = MixedSupport001.rgbSpriteState0001;
                    sceneWidgetPart014Local21.sceneWidgetState0148.performAction1994(3 + MixedSupport001.rgbSpriteState0001.integerState0254, 0, integerLocal23, ComponentContainer.integerState0377, 0);
                    integerLocal26 = 1;
                  }
                  sceneWidgetPart014Local21.sceneWidgetState0149.integerState0910 = integerLocal24;
                  sceneWidgetPart014Local21.sceneWidgetState0147.integerState0910 = integerLocal24;
                  sceneWidgetPart014Local21.sceneWidgetState0149.integerState0899 = integerLocal25;
                  sceneWidgetPart014Local21.sceneWidgetState0147.integerState0899 = integerLocal25;
                  sceneWidgetPart014Local21.sceneWidgetState0149.integerState0906 = integerLocal25;
                  sceneWidgetPart014Local21.sceneWidgetState0147.integerState0906 = integerLocal25;
                  sceneWidgetPart014Local21.sceneWidgetState0149.integerState0889 = integerLocal25;
                  sceneWidgetPart014Local21.sceneWidgetState0147.integerState0889 = integerLocal25;
                  integerLocal27 = 0;
                  integerLocal28 = -2 + (sceneWidgetPart014Local21.integerState0896 - 80);
                  if (integerLocal26 != 0) {
                    integerLocal27 = MixedSupport001.rgbSpriteState0001.integerState0254 + 3;
                    integerLocal28 = integerLocal28 - integerLocal27;
                  }
                  stackSceneWidgetLocal7 = sceneWidgetPart014Local21.sceneWidgetState0147;
                  if (0 >= integerLocal28) {
                    stackStringLocal8 = sceneWidgetPart014Local21.stringState0606;
                  } else {
                    stackStringLocal8 = BitmapFont.computeString1216(sceneWidgetPart014Local21.sceneWidgetState0147.bitmapFontState0020, sceneWidgetPart014Local21.stringState0606, integerLocal28);
                  }
                  stackSceneWidgetLocal7.stringState0598 = stackStringLocal8;
                  sceneWidgetPart014Local21.sceneWidgetState0147.performAction1994(integerLocal28, 0, integerLocal23, ComponentContainer.integerState0377, integerLocal27);
                  stackSceneWidgetLocal9 = sceneWidgetPart014Local21.sceneWidgetState0149;
                  if (null != sceneWidgetPart014Local21.stringState0604) {
                    stackStringLocal10 = sceneWidgetPart014Local21.stringState0604;
                  } else {
                    stackStringLocal10 = MixedSupport114.stringState0475;
                  }
                  stackSceneWidgetLocal9.stringState0598 = stackStringLocal10;
                  sceneWidgetPart014Local21.sceneWidgetState0149.performAction1994(80, 0, integerLocal23, ComponentContainer.integerState0377, sceneWidgetPart014Local21.integerState0896 - 80);
                  stackIntegerLocal11 = (sceneWidgetPart014Local21.sceneWidgetState0147.stringState0598.equals(sceneWidgetPart014Local21.stringState0606)) ? 0 : 1;
                  integerLocal29 = stackIntegerLocal11;
                  integerLocal23 = integerLocal23 + ComponentContainer.integerState0377;
                  if (integerLocal16 == 0) {
                    sceneWidgetPart014Local21.integerState0895 = integerLocal23 - sceneWidgetPart014Local21.integerState0915;
                  }
                  if (integerLocal22 != 0) {
                    MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0108.performAction1999((SceneWidget) (objectLocal20), sceneWidgetPart014Local21, 2, 0);
                  }
                  if (sceneWidgetPart014Local21.sceneWidgetState0148 == null ||
                    !sceneWidgetPart014Local21.sceneWidgetState0148.booleanState0218) {
                    if (sceneWidgetPart014Local21.integerState0891 != 0) {
                      stringLocal30 = sceneWidgetPart014Local21.stringState0606;
                      MixedSupport122.performAction1732(stringLocal30, (int[]) null, 101, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005, sceneWidgetPart014Local21, (String) null, 0L, -1, -1);
                      objectLocal19 = sceneWidgetPart014Local21;
                      if (sceneWidgetPart014Local21.stringState0604 != null &&
                        !MixedSupport154.computeBoolean2043(-103, SceneWidget.mixedSupport104State0001.stringState0418) &&
                        !MixedSupport151.booleanState0221) {
                        if (!PacketBuffer.booleanState0228) {
                          mixedSupport104Local31 = SceneWidget.mixedSupport104State0001;
                          stringLocal32 = CollectionSupport001.computeString0336(111, UiComponentPart001.stringState0024, new String[]{stringLocal30});
                          mixedSupport104Local31.sceneWidgetPart002State0002.performAction0620(stringLocal32, 8, 80);
                        }
                        mixedSupport104Local34 = SceneWidget.mixedSupport104State0001;
                        stringLocal35 = CollectionSupport001.computeString0336(99, MixedSupport150.stringState0601, new String[]{stringLocal30});
                        mixedSupport104Local34.sceneWidgetPart002State0002.performAction0620(stringLocal35, 18, 65);
                      }
                    } else if (sceneWidgetPart014Local21.sceneWidgetState0147.booleanState0218 &&
                      integerLocal29 != 0) {
                      MixedSupport122.stringState0515 = sceneWidgetPart014Local21.stringState0606;
                    }
                  } else {
                    MixedSupport122.stringState0515 = sceneWidgetPart014Local21.stringState0605;
                  }
                  objectLocal20 = sceneWidgetPart014Local21;
                  sceneWidgetPart014Local21 = (SceneWidgetPart014) (nodeDequeLocal18.computeHashNode1974(true));
                  continue;
                }
              } else {
                stackObjectLocal12 = MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0106;
              }
              if (((SceneWidget) (stackObjectLocal12)).integerState0891 != 0) {
                MixedSupport146.sceneWidgetPart004State0001 = new SceneWidgetPart004(MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0106.integerState0892, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0106.integerState0886, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0106.integerState0896, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0106.integerState0915, MixedSupport051.stringState0213, MixedSupport005.sceneWidgetState0002, MixedSupport132.sceneWidgetState0125, MixedSupport132.sceneWidgetState0125);
                ResourceSupport003.integerState0555 = 0;
              }
              if (MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0107.integerState0891 == 0) {
                break;
              }
              MixedSupport146.sceneWidgetPart004State0001 = new SceneWidgetPart004(MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0107.integerState0892, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0107.integerState0886, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0107.integerState0896, MixedSupport070.sceneWidgetPart010State0003.sceneWidgetState0107.integerState0915, MixedSupport040.stringState0180, MixedSupport005.sceneWidgetState0002, MixedSupport132.sceneWidgetState0125, MixedSupport132.sceneWidgetState0125);
              ResourceSupport003.integerState0555 = 1;
              break;
            }
          }
          stackObjectLocal13 = objectLocal19;
          return (SceneWidgetPart014) (stackObjectLocal13);
        } catch (java.lang.RuntimeException caughtParameterLocal37) {
          caughtExceptionLocal14 = caughtParameterLocal37;
          runtimeExceptionLocal17 = caughtExceptionLocal14;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal17), "ma.K(" + integerArgument1 + ',' + booleanArgument2 + ',' + byteArgument3 + ')');
        }
    }

    final boolean computeBoolean0239(boolean booleanArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          if (!booleanArgument1) {
            this.computeBoolean0062(-67, 8, (UiComponent) null, -37, -30, 67, (byte) -40);
          }
          stackBooleanLocal2 = (null != this.computeUiComponent0946(14));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "ma.TB(" + booleanArgument1 + ')');
        }
    }

    final static IndexedSprite computeIndexedSprite1141(ResourceArchive resourceArchiveArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        Object stackObjectLocal2 = null;
        IndexedSprite stackIndexedSpriteLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument4 != 21828) {
            ComponentDecorator.computeSceneWidgetPart0141139(-121, true, (byte) -35);
          }
          if (SceneWidgetPart002.computeBoolean0618(integerArgument2, resourceArchiveArgument1, integerArgument3, 78)) {
            stackIndexedSpriteLocal3 = MixedSupport001.computeIndexedSprite0020(0);
            return stackIndexedSpriteLocal3;
          }
          stackObjectLocal2 = null;
          return (IndexedSprite) (stackObjectLocal2);
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ma.J(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (this.uiComponentState0002 != null &&
            this.uiComponentState0002.computeBoolean0239(true) &&
            this.uiComponentState0002.computeBoolean0198(-125, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          integerLocal1 = integerArgument2;
          if (integerLocal1 != 80) {
            integerLocal1 = 24 / ((integerArgument1 + 22) / 49);
            return false;
          }
          if (MixedSupport011.booleanArrayState0002[81]) {
            stackBooleanLocal3 = this.computeBoolean1140(uiComponentArgument3, (byte) -112);
          } else {
            stackBooleanLocal3 = this.computeBoolean1143(false, uiComponentArgument3);
          }
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("ma.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(characterArgument4).append(')').toString());
        }
    }

    private final boolean computeBoolean1143(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent stackUiComponentLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (booleanArgument1) {
            return false;
          }
          boolean frameRemainderLocal9 = true;
          if (null != this.uiComponentState0002) {
            stackUiComponentLocal2 = this.uiComponentState0002;
            stackBooleanLocal3 = !(booleanArgument1);
            if (!((UiComponent) (Object) stackUiComponentLocal2).computeBoolean0239(stackBooleanLocal3) &&
              this.uiComponentState0002.computeBoolean0240(false, uiComponentArgument2)) {
              stackBooleanLocal4 = true;
              frameRemainderLocal9 = false;
            }
          }
          if (frameRemainderLocal9) {
            stackBooleanLocal4 = false;
          }
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("ma.G(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static SceneWidgetPart012 computeSceneWidgetPart0121138(int integerArgument1, long longArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        SceneWidgetPart012 stackSceneWidgetPart012Local2 = null;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          if (integerArgument1 >= -98) {
            sceneWidgetState0078 = (SceneWidget) null;
          }
          stackSceneWidgetPart012Local2 = (SceneWidgetPart012) (MixedSupport095.collectionSupport003State0004.computeDualNode1280(24710, longArgument2));
          return stackSceneWidgetPart012Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "ma.O(" + integerArgument1 + ',' + longArgument2 + ')');
        }
    }

    ComponentDecorator(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5, CallbackContract006 callbackContract006Argument6) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5, callbackContract006Argument6);
    }

    final void performAction1136(byte byteArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, Hashtable hashtableArgument4) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          discarded$12 = stringBuilderArgument3.append('\n');
          if (byteArgument1 > -37) {
            this.computeBoolean0062(36, -51, (UiComponent) null, -111, 8, 107, (byte) -44);
          }
          integerLocal4 = 0;
          do {
            if (integerLocal4 > integerArgument2) {
              if (this.uiComponentState0002 == null) {
                discarded$14 = stringBuilderArgument3.append("null");
                if (integerLocal5 == 0) {
                  return;
                }
              }
              break;
            }
            discarded$13 = stringBuilderArgument3.append(' ');
            integerLocal4++;
          } while (integerLocal5 == 0);
          this.uiComponentState0002.computeStringBuilder0238(hashtableArgument4, integerArgument2 + 1, stringBuilderArgument3, true);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal11 = caughtParameterLocal13;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal12;
          stackStringBuilderLocal7 = new StringBuilder().append("ma.M(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (hashtableArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    void performAction1142(boolean booleanArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (null != this.uiComponentState0002) {
            this.uiComponentState0002.performAction0247(112);
          }
          if (!booleanArgument1) {
            this.computeBoolean0239(true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.KB(" + booleanArgument1 + ')');
        }
    }

    final void performAction0244(byte byteArgument1) {
        if (byteArgument1 != -95) {
          return;
        }
        try {
          if (this.uiComponentState0002 != null) {
            this.uiComponentState0002.performAction0244((byte) -95);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ma.WB(" + byteArgument1 + ')');
        }
    }

    public static void performAction1144(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (byteArgument1 >= -78) {
            stringArrayState0020 = (String[]) null;
          }
          sceneWidgetState0077 = null;
          sceneWidgetState0078 = null;
          stringArrayState0020 = null;
          rgbSpriteState0034 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "ma.I(" + byteArgument1 + ')');
        }
    }

    boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument7 != -55) {
            this.computeUiComponent0946(59);
          }
          stackBooleanLocal2 = (this.uiComponentState0002 != null) && (this.uiComponentState0002.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, this.integerState0104 + integerArgument5, this.integerState0110 + integerArgument6, (byte) -55));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ma.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    StringBuilder computeStringBuilder0238(Hashtable hashtableArgument1, int integerArgument2, StringBuilder stringBuilderArgument3, boolean booleanArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (this.computeBoolean0234(0, integerArgument2, hashtableArgument1, stringBuilderArgument3)) {
            this.performAction0225((byte) 72, stringBuilderArgument3, hashtableArgument1, integerArgument2);
            this.performAction1136((byte) -116, integerArgument2, stringBuilderArgument3, hashtableArgument1);
          }
          if (booleanArgument4) {
            stackStringBuilderLocal3 = (StringBuilder) (stringBuilderArgument3);
            return stackStringBuilderLocal3;
          }
          stackStringBuilderLocal2 = (StringBuilder) null;
          return stackStringBuilderLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ma.MB(");
          if (hashtableArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',');
          if (stringBuilderArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    final static int computeInteger1137(int integerArgument1, byte byteArgument2) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8;
        try {
          if (0 == integerArgument1) {
            stackIntegerLocal1 = 0;
            return stackIntegerLocal1;
          }
          if (integerArgument1 > 0) {
            integerLocal6 = 1;
            if (integerArgument1 > 65535) {
              integerArgument1 = integerArgument1 >> 16;
              integerLocal6 += 16;
            }
            if (integerArgument1 > 255) {
              integerArgument1 = integerArgument1 >> 8;
              integerLocal6 += 8;
            }
            if (integerArgument1 > 15) {
              integerArgument1 = integerArgument1 >> 4;
              integerLocal6 += 4;
            }
            if (integerArgument1 > 3) {
              integerLocal6 += 2;
              integerArgument1 = integerArgument1 >> 2;
            }
            if (1 < integerArgument1) {
              integerArgument1 = integerArgument1 >> 1;
              integerLocal6++;
            }
            stackIntegerLocal2 = integerLocal6;
            return stackIntegerLocal2;
          }
          if (byteArgument2 < 46) {
            stackIntegerLocal3 = 45;
            return stackIntegerLocal3;
          }
          integerLocal8 = 2;
          if (integerArgument1 < -65536) {
            integerArgument1 = integerArgument1 >> 16;
            integerLocal8 += 16;
          }
          if (integerArgument1 < -256) {
            integerArgument1 = integerArgument1 >> 8;
            integerLocal8 += 8;
          }
          if (integerArgument1 < -16) {
            integerLocal8 += 4;
            integerArgument1 = integerArgument1 >> 4;
          }
          if (integerArgument1 < -4) {
            integerLocal8 += 2;
            integerArgument1 = integerArgument1 >> 2;
          }
          if (integerArgument1 < -2) {
            integerArgument1 = integerArgument1 >> 1;
            integerLocal8++;
          }
          stackIntegerLocal4 = integerLocal8;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal5 = caughtParameterLocal9;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal7), "ma.L(" + integerArgument1 + ',' + byteArgument2 + ')');
        }
    }

    static {
        stringArrayState0020 = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
