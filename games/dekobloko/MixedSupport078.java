/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport078 {
    private NodeHashTable nodeHashTableState0002;
    private int integerState0417;
    static int integerState0418;
    static boolean booleanState0097;
    private IterableNodeCollection iterableNodeCollectionState0002;
    static int[] integerArrayState0141;
    private int integerState0419;
    static String stringState0322;

    private final void performAction0942(int integerArgument1, long longArgument2) {
        MixedSupport147 cachedMixedSupport147Local1 = null;
        MixedSupport147 mixedSupport147Local2 = null;
        MixedSupport147 mixedSupport147Local3 = null;
        MixedSupport147 mixedSupport147Local4;
        MixedSupport147 mixedSupport147Local5;
        if (integerArgument1 == 0) {
          cachedMixedSupport147Local1 = (MixedSupport147) (this.nodeHashTableState0002.computeHashNode1529(longArgument2, (byte) -37));
          mixedSupport147Local2 = cachedMixedSupport147Local1;
          mixedSupport147Local3 = cachedMixedSupport147Local1;
          this.performAction0943(-124, mixedSupport147Local2);
          return;
        }
        ResourceArchive resourceArchiveLocal6 = (ResourceArchive) null;
        MixedSupport078.performAction0947((ResourceArchive) null, 118);
        MixedSupport147 cachedMixedSupport147Local7 = (MixedSupport147) (this.nodeHashTableState0002.computeHashNode1529(longArgument2, (byte) -37));
        mixedSupport147Local4 = cachedMixedSupport147Local7;
        mixedSupport147Local5 = cachedMixedSupport147Local7;
        this.performAction0943(-124, mixedSupport147Local4);
    }

    final Object computeObject0944(long longArgument1, byte byteArgument2) {
        MixedSupport132 mixedSupport132Local1 = null;
        MixedSupport147 mixedSupport147Local2 = (MixedSupport147) (this.nodeHashTableState0002.computeHashNode1529(longArgument1, (byte) -37));
        if (mixedSupport147Local2 == null) {
          return null;
        }
        Object objectLocal3 = mixedSupport147Local2.computeObject1653(-1);
        if (byteArgument2 >= -9) {
          this.computeObject0944(69L, (byte) -13);
        }
        if (objectLocal3 != null) {
          if (!mixedSupport147Local2.computeBoolean1654((byte) -83)) {
            this.iterableNodeCollectionState0002.performAction1686((byte) 4, mixedSupport147Local2);
            mixedSupport147Local2.longState0003 = 0L;
          } else {
            mixedSupport132Local1 = new MixedSupport132(objectLocal3, mixedSupport147Local2.integerState0858);
            this.nodeHashTableState0002.performAction1530(mixedSupport147Local2.key, false, mixedSupport132Local1);
            this.iterableNodeCollectionState0002.performAction1686((byte) 4, mixedSupport132Local1);
            ((MixedSupport147) ((Object) mixedSupport132Local1)).longState0003 = 0L;
            mixedSupport147Local2.performAction0149((byte) 106);
            mixedSupport147Local2.performAction0134((byte) 125);
          }
          return objectLocal3;
        }
        mixedSupport147Local2.performAction0149((byte) 119);
        mixedSupport147Local2.performAction0134((byte) 92);
        this.integerState0417 = this.integerState0417 + mixedSupport147Local2.integerState0858;
        return null;
    }

    final void performAction0946(Object objectArgument1, long longArgument2, int integerArgument3) {
        try {
          this.performAction0945(longArgument2, (byte) 77, 1, objectArgument1);
          if (integerArgument3 < 3) {
            this.performAction0942(94, -31L);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "la.D(" + (objectArgument1 != null ? "{...}" : "null") + ',' + longArgument2 + ',' + integerArgument3 + ')');
        }
    }

    private final void performAction0945(long longArgument1, byte byteArgument2, int integerArgument3, Object objectArgument4) {
        MixedSupport147 mixedSupport147Local1 = null;
        MixedSupport132 mixedSupport132Local2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 > this.integerState0419) {
            throw new IllegalStateException();
          }
          this.performAction0942(byteArgument2 - 77, longArgument1);
          this.integerState0417 = this.integerState0417 - integerArgument3;
          while (this.integerState0417 < 0) {
            mixedSupport147Local1 = (MixedSupport147) (this.iterableNodeCollectionState0002.computeDualNode1685((byte) 67));
            this.performAction0943(-122, mixedSupport147Local1);
          }
          mixedSupport132Local2 = new MixedSupport132(objectArgument4, integerArgument3);
          this.nodeHashTableState0002.performAction1530(longArgument1, false, mixedSupport132Local2);
          this.iterableNodeCollectionState0002.performAction1686((byte) 4, mixedSupport132Local2);
          if (byteArgument2 != 77) {
            MixedSupport078.performAction0941((byte) -109);
          }
          ((MixedSupport147) ((Object) mixedSupport132Local2)).longState0003 = 0L;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "la.E(" + longArgument1 + ',' + byteArgument2 + ',' + integerArgument3 + ',' + (objectArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    MixedSupport078(int integerArgument1) {
        this(integerArgument1, integerArgument1);
    }

    final static void performAction0947(ResourceArchive resourceArchiveArgument1, int integerArgument2) {
        SceneWidget sceneWidgetLocal1 = null;
        SceneWidget sceneWidgetLocal2 = null;
        SceneWidget sceneWidgetLocal3 = null;
        try {
          MixedSupport001.rgbSpriteState0001 = UiComponentPart015.computeRgbSprite0713(resourceArchiveArgument1, "display_name_changed", "basic", integerArgument2 ^ 24181);
          MixedSupport070.sceneWidgetPart010State0003 = new SceneWidgetPart010(0L, UiComponentPart015.sceneWidgetPart010State0002, MixedSupport093.stringState0370, MixedSupport042.stringState0184);
          RenderingSupport003.sceneWidgetPart010State0001 = new SceneWidgetPart010(0L, UiComponentPart015.sceneWidgetPart010State0002, UiComponentPart019.stringState0349, GameDomainSupport006.stringState0630);
          ValidationStatus.sceneWidgetState0112 = new SceneWidget(0L, (SceneWidget) null);
          MixedSupport066.sceneWidgetState0060 = new SceneWidget(0L, MixedSupport132.sceneWidgetState0125);
          MixedSupport066.sceneWidgetState0060.integerState0916 = 1;
          SceneWidgetPart011.sceneWidgetState0114 = new SceneWidget(0L, MixedSupport039.sceneWidgetState0029, MixedSupport014.stringState0069);
          TextLayout.sceneWidgetState0010 = new SceneWidget(0L, NetworkSupport003.sceneWidgetState0018, MixedSupport110.stringState0453);
          MixedSupport066.sceneWidgetState0059 = new SceneWidget(0L, UiComponentPart007.sceneWidgetState0019);
          ValidationStatus.sceneWidgetState0112.performAction1799(MixedSupport066.sceneWidgetState0060, -16834);
          ValidationStatus.sceneWidgetState0112.performAction1799(SceneWidgetPart011.sceneWidgetState0114, -16834);
          ValidationStatus.sceneWidgetState0112.performAction1799(TextLayout.sceneWidgetState0010, -16834);
          ValidationStatus.sceneWidgetState0112.performAction1799(MixedSupport070.sceneWidgetPart010State0003, integerArgument2 ^ -16309);
          ValidationStatus.sceneWidgetState0112.performAction1799(MixedSupport066.sceneWidgetState0059, -16834);
          MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.performAction1797(integerArgument2 ^ -32262, MixedSupport132.sceneWidgetState0125);
          MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089.integerState0885 = 1;
          if (integerArgument2 != 32373) {
            MixedSupport078.performAction0941((byte) 92);
          }
          sceneWidgetLocal1 = MixedSupport070.sceneWidgetPart010State0003.sceneWidgetPart008State0005.sceneWidgetState0089;
          sceneWidgetLocal2 = sceneWidgetLocal1;
          sceneWidgetLocal2.integerState0916 = 1;
          RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005.sceneWidgetState0089.performAction1797(integerArgument2 - 32488, MixedSupport132.sceneWidgetState0125);
          RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005.sceneWidgetState0089.integerState0885 = 1;
          sceneWidgetLocal3 = RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005.sceneWidgetState0089;
          sceneWidgetLocal3.integerState0916 = 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "la.G(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public static void performAction0941(byte byteArgument1) {
        stringState0322 = null;
        integerArrayState0141 = null;
        if (byteArgument1 < 36) {
          ResourceArchive resourceArchiveLocal1 = (ResourceArchive) null;
          MixedSupport078.performAction0947((ResourceArchive) null, 120);
        }
    }

    private final void performAction0943(int integerArgument1, MixedSupport147 mixedSupport147Argument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (integerArgument1 > -111) {
            return;
          }
          if (mixedSupport147Argument2 == null) {
            return;
          }
          mixedSupport147Argument2.performAction0149((byte) 105);
          mixedSupport147Argument2.performAction0134((byte) 76);
          this.integerState0417 = this.integerState0417 + mixedSupport147Argument2.integerState0858;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("la.F(").append(integerArgument1).append(',');
          if (mixedSupport147Argument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    private MixedSupport078(int integerArgument1, int integerArgument2) {
        int integerLocal1;
        this.iterableNodeCollectionState0002 = new IterableNodeCollection();
        this.integerState0419 = integerArgument1;
        this.integerState0417 = integerArgument1;
        integerLocal1 = 1;
        while (true) {
          if (integerArgument1 <= integerLocal1 + integerLocal1) {
            this.nodeHashTableState0002 = new NodeHashTable(integerLocal1);
            return;
          }
          if (integerArgument2 > integerLocal1) {
            integerLocal1 = integerLocal1 + integerLocal1;
            continue;
          }
          break;
        }
        this.nodeHashTableState0002 = new NodeHashTable(integerLocal1);
        return;
    }

    static {
        integerState0418 = 0;
        stringState0322 = "End Game";
        integerArrayState0141 = new int[128];
    }
}
