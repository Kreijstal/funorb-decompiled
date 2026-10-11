/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport147 extends DualNode {
    int integerState0858;
    static PacketBuffer packetBufferState0008;
    static RgbSprite[] rgbSpriteArrayState0031;

    public static void performAction1958(byte byteArgument1) {
        packetBufferState0008 = null;
        rgbSpriteArrayState0031 = null;
        if (byteArgument1 != 46) {
          String stringLocal1 = (String) null;
          MixedSupport147.computeRenderingSupport0121955((ResourceArchive) null, (ResourceArchive) null, (String) null, (byte) -124, (String) null);
        }
    }

    abstract Object computeObject1839(int integerArgument1);

    abstract boolean computeBoolean1841(byte byteArgument1);

    MixedSupport147(int integerArgument1) {
        this.integerState0858 = integerArgument1;
    }

    final static RenderingSupport012 computeRenderingSupport0121955(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2, String stringArgument3, byte byteArgument4, String stringArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RenderingSupport012 stackRenderingSupport012Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        try {
          integerLocal1 = resourceArchiveArgument2.computeInteger0926(-1, stringArgument3);
          integerLocal4 = -37 % ((byteArgument4 - 39) / 44);
          integerLocal3 = resourceArchiveArgument2.computeInteger0913(integerLocal1, 13030, stringArgument5);
          stackRenderingSupport012Local5 = MixedSupport027.computeRenderingSupport0120426(resourceArchiveArgument1, integerLocal1, integerLocal3, (byte) -75, resourceArchiveArgument2);
          return stackRenderingSupport012Local5;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal15 = caughtParameterLocal16;
          runtimeExceptionLocal2 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("vi.I(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          stackStringBuilderLocal13 = ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(byteArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(')').toString());
        }
    }

    final static int computeInteger1957(int integerArgument1) {
        if (integerArgument1 != 1) {
          rgbSpriteArrayState0031 = (RgbSprite[]) null;
          return 1;
        }
        return 1;
    }

    final static boolean computeBoolean1956(int[] integerArrayArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        long longLocal7 = 0L;
        RuntimeException runtimeExceptionLocal8 = null;
        RenderingSupport001 renderingSupport001Local9 = null;
        int integerLocal10 = 0;
        RenderingSupport001 renderingSupport001Local11 = null;
        int integerLocal12 = 0;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (SoftwareFramebuffer.mixedSupport139State0012 != UiComponentPart023.mixedSupport139State0009) {
            return false;
          }
          longLocal7 = MixedSupport063.computeLong0827(integerArgument2 + 4);
          if (MixedSupport133.integerState0792 != 0 &&
            UiComponentPart009.integerState0150 < 0) {
            renderingSupport001Local9 = (RenderingSupport001) (MixedSupport018.nodeDequeState0006.computeHashNode1970((byte) -98));
            if (renderingSupport001Local9 != null &&
              renderingSupport001Local9.longState0004 < longLocal7) {
              renderingSupport001Local9.performAction0161((byte) 112);
              NetworkSupport012.integerState0759 = renderingSupport001Local9.byteArrayState0003.length;
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              for (integerLocal1 = 0; integerLocal1 < NetworkSupport012.integerState0759; integerLocal1++) {
                UiComponentPart006.cipherPacketBufferState0001.payload[integerLocal1] = renderingSupport001Local9.byteArrayState0003[integerLocal1];
              }
              UiComponentPart017.integerState0438 = GameDomainSupport001.integerState0051;
              GameDomainSupport001.integerState0051 = ComponentContainer.integerState0378;
              ComponentContainer.integerState0378 = HashNode.integerState0070;
              HashNode.integerState0070 = renderingSupport001Local9.integerState0063;
              return true;
            }
          }
          if (integerArgument2 != 0) {
            MixedSupport147.computeInteger1957(-63);
          }
          while (true) {
            if (0 > UiComponentPart009.integerState0150) {
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              if (!MixedSupport103.computeBoolean1398(integerArgument2 + 25973, 1)) {
                return false;
              }
              UiComponentPart009.integerState0150 = UiComponentPart006.cipherPacketBufferState0001.computeInteger1864((byte) 81);
              UiComponentPart006.cipherPacketBufferState0001.position = 0;
              NetworkSupport012.integerState0759 = integerArrayArgument1[UiComponentPart009.integerState0150];
            }
            if (!MixedSupport039.computeBoolean0580((byte) 116)) {
              return false;
            }
            if (MixedSupport133.integerState0792 == 0) {
              UiComponentPart017.integerState0438 = GameDomainSupport001.integerState0051;
              GameDomainSupport001.integerState0051 = ComponentContainer.integerState0378;
              ComponentContainer.integerState0378 = HashNode.integerState0070;
              HashNode.integerState0070 = UiComponentPart009.integerState0150;
              UiComponentPart009.integerState0150 = -1;
              return true;
            }
            integerLocal10 = MixedSupport133.integerState0792;
            if (0.0 != MixedSupport105.doubleState0002) {
              integerLocal10 = (int)((double)integerLocal10 + RenderingSupport004.randomState0002.nextGaussian() * MixedSupport105.doubleState0002);
              if (integerLocal10 < 0) {
                integerLocal10 = 0;
              }
            }
            renderingSupport001Local11 = new RenderingSupport001(longLocal7 + (long)integerLocal10, UiComponentPart009.integerState0150, new byte[NetworkSupport012.integerState0759]);
            for (integerLocal2 = 0; NetworkSupport012.integerState0759 > integerLocal2; integerLocal2++) {
              renderingSupport001Local11.byteArrayState0003[integerLocal2] = UiComponentPart006.cipherPacketBufferState0001.payload[integerLocal2];
            }
            MixedSupport018.nodeDequeState0006.performAction1963(renderingSupport001Local11, integerArgument2 ^ 2777);
            UiComponentPart009.integerState0150 = -1;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal6 = caughtParameterLocal13;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("vi.L(");
          if (integerArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    static {
        packetBufferState0008 = new PacketBuffer(256);
    }
}
