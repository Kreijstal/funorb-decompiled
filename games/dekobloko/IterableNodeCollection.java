/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeCollection implements Iterable {
    static SceneWidget sceneWidgetState0126;
    DualNode dualNodeState0009;
    static boolean booleanState0193;
    static int integerState0802;

    final static RenderingSupport008 computeRenderingSupport0081877(int[] integerArrayArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4) {
        RenderingSupport008 stackRenderingSupport008Local1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        GameDomainSupport002 gameDomainSupport002Local7 = null;
        RenderingSupport008 renderingSupport008Local8 = null;
        GameDomainSupport002 gameDomainSupport002Local9 = null;
        GameDomainSupport002 gameDomainSupport002Local10 = null;
        GameDomainSupport002 gameDomainSupport002Local11 = null;
        GameDomainSupport002 gameDomainSupport002Local12 = null;
        try {
          renderingSupport008Local8 = new RenderingSupport008(3);
          renderingSupport008Local8.integerArrayState0121 = integerArrayArgument1;
          renderingSupport008Local8.integerState0366 = integerArgument3;
          if (UiComponentPart023.computeBoolean1421(-30146)) {
            gameDomainSupport002Local7 = new GameDomainSupport002(20, UiComponentPart026.stringState0461, MixedSupport001.renderingSupport010State0001);
            gameDomainSupport002Local7.integerState0178 = 387;
            gameDomainSupport002Local7.integerState0174 = 320 - gameDomainSupport002Local7.integerState0176 / 2;
            renderingSupport008Local8.performAction0969(gameDomainSupport002Local7, 100);
          }
          if (SceneWidgetPart007.booleanState0114) {
            gameDomainSupport002Local9 = new GameDomainSupport002(10, SceneWidgetPart006.stringState0276, MixedSupport001.renderingSupport010State0001);
            gameDomainSupport002Local9.integerState0174 = -(gameDomainSupport002Local9.integerState0176 / 2) + 320;
            gameDomainSupport002Local9.integerState0178 = 387;
            renderingSupport008Local8.performAction0969(gameDomainSupport002Local9, 101);
          }
          if (MixedSupport043.booleanState0048) {
            gameDomainSupport002Local10 = new GameDomainSupport002(19, SceneWidgetPart006.stringState0276, MixedSupport001.renderingSupport010State0001);
            gameDomainSupport002Local10.integerState0178 = 387;
            gameDomainSupport002Local10.integerState0174 = -(gameDomainSupport002Local10.integerState0176 / 2) + 320;
            renderingSupport008Local8.performAction0969(gameDomainSupport002Local10, 100);
          }
          if (UiComponentPart013.booleanState0066) {
            gameDomainSupport002Local11 = new GameDomainSupport002(3, MixedSupport094.stringState0373, MixedSupport001.renderingSupport010State0001);
            gameDomainSupport002Local11.integerState0174 = -(gameDomainSupport002Local11.integerState0176 / 2) + 320;
            gameDomainSupport002Local11.integerState0178 = 387;
            renderingSupport008Local8.performAction0969(gameDomainSupport002Local11, 123);
          }
          gameDomainSupport002Local12 = new GameDomainSupport002(13, MixedSupport101.stringState0411, MixedSupport001.renderingSupport010State0001);
          if (integerArgument4 > -103) {
            IterableNodeCollection.performAction1876(-120);
          }
          gameDomainSupport002Local12.integerState0174 = 320 - gameDomainSupport002Local12.integerState0176 / 2;
          gameDomainSupport002Local12.integerState0178 = 415;
          renderingSupport008Local8.performAction0969(gameDomainSupport002Local12, 106);
          if (renderingSupport008Local8.mixedSupport121State0002.integerState0756 >= 3) {
            renderingSupport008Local8.performAction0966(387, 320, true, -118, 24);
          }
          renderingSupport008Local8.integerState0368 = 520;
          renderingSupport008Local8.integerState0372 = 215;
          renderingSupport008Local8.integerState0375 = 166;
          renderingSupport008Local8.integerState0374 = 62;
          renderingSupport008Local8.performAction0968(0, booleanArgument2, -129);
          stackRenderingSupport008Local1 = renderingSupport008Local8;
          return stackRenderingSupport008Local1;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal5 = caughtParameterLocal13;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("uh.E(");
          if (integerArrayArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final DualNode computeDualNode1874(byte byteArgument1) {
        DualNode dualNodeLocal1 = this.dualNodeState0009.dualNodeState0003;
        if (dualNodeLocal1 == this.dualNodeState0009) {
          return null;
        }
        dualNodeLocal1.performAction0145((byte) 97);
        if (byteArgument1 < 51) {
          int[] integerArrayLocal2 = (int[]) null;
          IterableNodeCollection.computeRenderingSupport0081877((int[]) null, true, 58, 67);
        }
        return dualNodeLocal1;
    }

    final static void performAction1876(int integerArgument1) {
        MixedSupport151 cachedMixedSupport151Local1 = (MixedSupport151) (MixedSupport123.nodeDequeState0032.computeHashNode1973(-89));
        MixedSupport151 mixedSupport151Local2 = cachedMixedSupport151Local1;
        MixedSupport151 mixedSupport151Local3 = cachedMixedSupport151Local1;
        if (integerArgument1 != -9074) {
          return;
        }
        if (mixedSupport151Local2 == null) {
          mixedSupport151Local3 = new MixedSupport151();
        }
        mixedSupport151Local3.performAction2016((byte) 37, SoftwareRaster.integerState0284, SoftwareRaster.integerArrayState0063, SoftwareRaster.integerState0285, SoftwareRaster.integerState0281, SoftwareRaster.integerState0282, SoftwareRaster.integerState0280, SoftwareRaster.integerState0283);
        MixedSupport018.nodeDequeState0005.performAction1963(mixedSupport151Local3, 2777);
    }

    final static void performAction1878(IndexedSprite[] indexedSpriteArrayArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3;
        try {
          if (indexedSpriteArrayArgument1 != null) {
            for (integerLocal1 = 0; indexedSpriteArrayArgument1.length > integerLocal1; integerLocal1++) {
              indexedSpriteArrayArgument1[integerLocal1].performAction1422();
            }
          }
          integerLocal3 = -73 / ((byteArgument2 - 53) / 55);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "uh.D(" + (indexedSpriteArrayArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    final static void performAction1880(int integerArgument1) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        String stackStringLocal3 = null;
        boolean stackBooleanLocal4 = false;
        MixedSupport015 stackMixedSupport015Local5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        String stringLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        MixedSupport015 mixedSupport015Local15 = null;
        int integerLocal16 = 0;
        IndexedSprite[] indexedSpriteArrayLocal17 = null;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal7 = -ResourceSupport001.integerState0021 + MixedSupport035.integerState0219;
          ResourceSupport001.integerState0021 = -(integerLocal7 >> 1) + MixedSupport004.integerState0029;
          if (integerArgument1 != 32659) {
            indexedSpriteArrayLocal17 = (IndexedSprite[]) null;
            IterableNodeCollection.performAction1878((IndexedSprite[]) null, (byte) 12);
          }
          MixedSupport035.integerState0219 = ResourceSupport001.integerState0021 + integerLocal7;
          MixedSupport116.integerState0721 = -(MixedSupport003.integerState0018 >> 1) + MixedSupport074.integerState0402;
          integerLocal9 = MixedSupport116.integerState0721;
          for (integerLocal1 = 0; integerLocal1 < UiComponentPart010.stringArrayState0012.length; integerLocal1++) {
            integerLocal10 = MixedSupport136.integerArrayState0211[integerLocal1];
            if (integerLocal10 >= 0) {
              if (UiComponentPart033.mixedSupport121State0004.integerState0754 == integerLocal10) {
                integerLocal11 = MixedSupport053.integerState0271;
              } else {
                integerLocal11 = MixedSupport057.integerState0296;
              }
            } else {
              integerLocal11 = MixedSupport059.integerState0320;
            }
            stringLocal12 = UiComponentPart010.stringArrayState0012[integerLocal1];
            stackIntegerLocal2 = 0;
            stackStringLocal3 = stringLocal12;
            stackBooleanLocal4 = !(integerLocal10 < 0);
            integerLocal13 = NetworkArchiveRequestManager.computeInteger1467(stackIntegerLocal2, stackStringLocal3, stackBooleanLocal4);
            integerLocal14 = -(integerLocal13 >> 1) + MixedSupport004.integerState0029;
            if (integerLocal10 >= 0) {
              integerLocal9 = integerLocal9 + AudioSupport002.integerState0344;
              if (integerLocal10 != UiComponentPart033.mixedSupport121State0004.integerState0754) {
                stackMixedSupport015Local5 = PlatformSupport006.mixedSupport015State0004;
              } else {
                stackMixedSupport015Local5 = MixedSupport047.mixedSupport015State0002;
              }
              mixedSupport015Local15 = stackMixedSupport015Local5;
              if (mixedSupport015Local15 != null) {
                mixedSupport015Local15.performAction0220(integerLocal13 + (ResourceSupport002.integerState0050 << 1), 97, -ResourceSupport002.integerState0050 + integerLocal14, integerLocal9, (MixedSupport080.integerState0433 << 1) + UiComponentPart032.integerState0835);
              }
              integerLocal9 = integerLocal9 + MixedSupport080.integerState0433;
            }
            if (integerLocal10 >= 0) {
              NetworkSupport001.bitmapFontState0003.performAction1211(stringLocal12, integerLocal14, UiComponentPart022.integerState0576 + integerLocal9, integerLocal11, -1);
              integerLocal9 = integerLocal9 + (MixedSupport080.integerState0433 + AudioSupport002.integerState0344 + UiComponentPart032.integerState0835);
            } else {
              SoftwareFramebuffer.bitmapFontState0021.performAction1211(stringLocal12, integerLocal14, SceneWidgetPart004.integerState0267 + integerLocal9, integerLocal11, -1);
              integerLocal9 = integerLocal9 + ComponentDecorator.integerState0497;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal6 = caughtParameterLocal18;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal8), "uh.A(" + integerArgument1 + ')');
        }
    }

    public static void performAction1879(byte byteArgument1) {
        sceneWidgetState0126 = null;
        if (byteArgument1 <= 44) {
          IterableNodeCollection.performAction1880(-20);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new CollectionSupport002(this));
    }

    final void performAction1875(byte byteArgument1, DualNode dualNodeArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (dualNodeArgument2.dualNodeState0004 != null) {
            dualNodeArgument2.performAction0145((byte) 85);
          }
          dualNodeArgument2.dualNodeState0004 = this.dualNodeState0009.dualNodeState0004;
          dualNodeArgument2.dualNodeState0003 = this.dualNodeState0009;
          dualNodeArgument2.dualNodeState0004.dualNodeState0003 = dualNodeArgument2;
          dualNodeArgument2.dualNodeState0003.dualNodeState0004 = dualNodeArgument2;
          if (byteArgument1 != 4) {
            sceneWidgetState0126 = (SceneWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("uh.B(").append(byteArgument1).append(',');
          if (dualNodeArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    IterableNodeCollection() {
        this.dualNodeState0009 = new DualNode();
        this.dualNodeState0009.dualNodeState0003 = this.dualNodeState0009;
        this.dualNodeState0009.dualNodeState0004 = this.dualNodeState0009;
    }

    static {
    }
}
