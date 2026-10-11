/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformSupport006 extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame frameState0003;
    static String stringState0454;
    static MixedSupport015 mixedSupport015State0004;
    volatile boolean booleanState0156;
    static int integerState0670;
    static String stringState0455;
    static int[] integerArrayState0198;

    public final void focusLost(java.awt.event.FocusEvent focusEventArgument1) {
        try {
          this.booleanState0156 = true;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ql.focusLost(" + (focusEventArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent focusEventArgument1) {
    }

    final static RenderingSupport010 computeRenderingSupport0101567(ResourceArchive resourceArchiveArgument1, byte byteArgument2, int integerArgument3, int integerArgument4, ResourceArchive resourceArchiveArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        RenderingSupport010 stackRenderingSupport010Local2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (byteArgument2 != 41) {
            stringState0454 = (String) null;
          }
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument4, resourceArchiveArgument1, integerArgument3, 56)) {
            return null;
          }
          stackRenderingSupport010Local2 = SceneWidget.computeRenderingSupport0102003(resourceArchiveArgument5.computeByteArray0912(integerArgument3, -117, integerArgument4), (byte) -5);
          return stackRenderingSupport010Local2;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ql.C(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (resourceArchiveArgument5 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    PlatformSupport006() {
    }

    public final void update(java.awt.Graphics graphicsArgument1) {
    }

    final static void performAction1565(int integerArgument1, byte byteArgument2) {
        int integerLocal1 = -50 % ((byteArgument2 + 51) / 49);
        MixedSupport111.computeInteger1571((byte) 57);
    }

    final static boolean computeBoolean1564(int integerArgument1) {
        if (integerArgument1 != 2) {
          return false;
        }
        return !PacketBuffer.booleanState0228 ? true : false;
    }

    final static void performAction1568(NodeDeque nodeDequeArgument1, int integerArgument2, int integerArgument3) {
        HashNode hashNodeLocal1 = null;
        int integerLocal2 = 0;
        NodeDeque nodeDequeLocal3 = null;
        HashNode hashNodeLocal4 = null;
        HashNode hashNodeLocal5 = null;
        AnimatedTileRegion animatedTileRegionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 <= 1) {
            return;
          }
          hashNodeLocal1 = nodeDequeArgument1.hashNodeState0009.previous;
          integerLocal2 = 0;
          if (integerArgument2 >= -114) {
            return;
          }
          while (integerArgument3 > integerLocal2) {
            hashNodeLocal1 = hashNodeLocal1.previous;
            integerLocal2 += 2;
          }
          nodeDequeLocal3 = new NodeDeque();
          nodeDequeArgument1.performAction1962(-128, hashNodeLocal1, nodeDequeLocal3);
          PlatformSupport006.performAction1568(nodeDequeArgument1, -117, (1 + integerArgument3) / 2);
          PlatformSupport006.performAction1568(nodeDequeLocal3, -127, integerArgument3 / 2);
          hashNodeLocal4 = nodeDequeArgument1.hashNodeState0009.previous;
          scanLoop1: while (true) {
            hashNodeLocal5 = nodeDequeLocal3.hashNodeState0009.previous;
            if (nodeDequeLocal3.hashNodeState0009 == hashNodeLocal5) {
              return;
            }
            animatedTileRegionLocal6 = (AnimatedTileRegion) (hashNodeLocal5);
            while (nodeDequeArgument1.hashNodeState0009 != hashNodeLocal4) {
              if (animatedTileRegionLocal6.integerState0812 <= ((AnimatedTileRegion) (hashNodeLocal4)).integerState0812) {
                MixedSupport043.performAction0598(113, animatedTileRegionLocal6, hashNodeLocal4);
                continue scanLoop1;
              }
              hashNodeLocal4 = hashNodeLocal4.previous;
            }
            MixedSupport043.performAction0598(113, animatedTileRegionLocal6, hashNodeLocal4);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal11 = caughtParameterLocal13;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal12;
          stackStringBuilderLocal9 = new StringBuilder().append("ql.D(");
          if (nodeDequeArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    public static void performAction1569(int integerArgument1) {
        stringState0455 = null;
        if (integerArgument1 > -70) {
          return;
        }
        mixedSupport015State0004 = null;
        integerArrayState0198 = null;
        stringState0454 = null;
    }

    final static void performAction1570(int integerArgument1) {
        Throwable caughtExceptionLocal1 = null;
        Object objectLocal2 = null;
        objectLocal2 = MixedSupport063.mouseInputState0001;
        synchronized (objectLocal2) {
          MixedSupport104.integerState0579 = MixedSupport104.integerState0579 + 1;
          DualNode.integerState0062 = UiComponentPart022.integerState0572;
          HashNode.integerState0069 = Sprite.integerState0424;
          if (integerArgument1 != -2) {
            PlatformSupport006.performAction1570(-55);
          }
          MixedSupport106.integerState0590 = MixedSupport126.integerState0775;
          MixedSupport106.booleanState0135 = TranslatedUiText.booleanState0115;
          TranslatedUiText.booleanState0115 = false;
          SceneWidgetPart005.integerState0328 = CollectionSupport003.integerState0544;
          UiComponentPart013.integerState0276 = RenderingSupport003.integerState0253;
          TextLineMetrics.integerState0535 = MixedSupport108.integerState0597;
          CollectionSupport003.integerState0544 = 0;
        }
    }

    final void performAction1566(PlatformService platformServiceArgument1, int integerArgument2) {
        try {
          if (integerArgument2 <= 4) {
            PlatformService platformServiceLocal1 = (PlatformService) null;
            this.performAction1566((PlatformService) null, 55);
          }
          UiComponentPart033.performAction2050(true, this.frameState0003, platformServiceArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ql.F(" + (platformServiceArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public final void paint(java.awt.Graphics graphicsArgument1) {
    }

    static {
        stringState0454 = "Month";
        stringState0455 = "Reject";
    }
}
