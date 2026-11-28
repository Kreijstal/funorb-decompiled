/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static NodeDeque nodeDequeState0007;
    private DualNode dualNodeState0005;
    static RgbSprite[][] rgbSpriteArrayArrayState0005;
    private IterableNodeCollection iterableNodeCollectionState0001;
    private DualNode dualNodeState0006;
    static PcmStreamMixer pcmStreamMixerState0001;
    static int integerState0138;

    public final Object next() {
        Object objectLocal1 = this.dualNodeState0006;
        if (this.iterableNodeCollectionState0001.dualNodeState0009 != objectLocal1) {
          this.dualNodeState0006 = ((DualNode) (objectLocal1)).dualNodeState0003;
        } else {
          objectLocal1 = null;
          this.dualNodeState0006 = null;
        }
        this.dualNodeState0005 = (DualNode) (objectLocal1);
        return objectLocal1;
    }

    public final void remove() {
        if (this.dualNodeState0005 == null) {
          throw new IllegalStateException();
        }
        this.dualNodeState0005.unlinkSecondary((byte) 81);
        this.dualNodeState0005 = null;
    }

    public static void clearStaticReferences(int integerArgument1) {
        nodeDequeState0007 = null;
        rgbSpriteArrayArrayState0005 = (RgbSprite[][]) null;
        if (integerArgument1 != 8) {
          rgbSpriteArrayArrayState0005 = (RgbSprite[][]) null;
          pcmStreamMixerState0001 = null;
          return;
        }
        pcmStreamMixerState0001 = null;
    }

    final static void performAction0362(int integerArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3) {
        try {
          if (sceneWidgetArgument3.nodeDequeState0034 == null) {
            sceneWidgetArgument3.nodeDequeState0034 = new NodeDeque();
          }
          if (null == sceneWidgetArgument2.nodeDequeState0034) {
            sceneWidgetArgument2.nodeDequeState0034 = new NodeDeque();
          }
          if (null == MixedSupport081.secondaryNodeHashTableState0003) {
            MixedSupport081.secondaryNodeHashTableState0003 = new SecondaryNodeHashTable(64);
          }
          if (null == MixedSupport054.secondaryNodeHashTableState0001) {
            MixedSupport054.secondaryNodeHashTableState0001 = new SecondaryNodeHashTable(64);
          }
          CipherPacketBuffer.nodeDequeState0033 = sceneWidgetArgument2.nodeDequeState0034;
          if (integerArgument1 != 21014) {
            pcmStreamMixerState0001 = (PcmStreamMixer) null;
          }
          RichTextWidget.nodeDequeState0027 = sceneWidgetArgument3.nodeDequeState0034;
          MixedSupport021.performAction0325(true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "dg.A(" + integerArgument1 + ',' + (sceneWidgetArgument2 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0361(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport072 mixedSupport072Local2 = null;
        MixedSupport068 mixedSupport068Local3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport072Local2 = (MixedSupport072) (GameDomainSupport005.nodeDequeState0023.beginBackward((byte) -80));
          while (mixedSupport072Local2 != null) {
            MixedSupport043.performAction0541((byte) -125, integerArgument2, mixedSupport072Local2);
            mixedSupport072Local2 = (MixedSupport072) (GameDomainSupport005.nodeDequeState0023.nextBackward(true));
          }
          if (integerArgument1 > -47) {
            integerState0138 = 100;
          }
          mixedSupport068Local3 = (MixedSupport068) (nodeDequeState0007.beginBackward((byte) -121));
          while (mixedSupport068Local3 != null) {
            SceneWidgetPart014.performAction1783(mixedSupport068Local3, integerArgument2, 60);
            mixedSupport068Local3 = (MixedSupport068) (nodeDequeState0007.nextBackward(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal5), "dg.C(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    public final boolean hasNext() {
        return this.dualNodeState0006 != this.iterableNodeCollectionState0001.dualNodeState0009;
    }

    final static boolean computeBoolean0363(int integerArgument1) {
        if (integerArgument1 >= -34) {
          return false;
        }
        return MixedSupport109.computeBoolean1436(DraggableWidgetContainer.computeApplet1485(25144), (byte) -78);
    }

    SecondaryNodeDequeIterator(IterableNodeCollection iterableNodeCollectionArgument1) {
        this.dualNodeState0005 = null;
        try {
          this.iterableNodeCollectionState0001 = iterableNodeCollectionArgument1;
          this.dualNodeState0006 = this.iterableNodeCollectionState0001.dualNodeState0009.dualNodeState0003;
          this.dualNodeState0005 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "dg.<init>(" + (iterableNodeCollectionArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rgbSpriteArrayArrayState0005 = new RgbSprite[8][];
        nodeDequeState0007 = new NodeDeque();
    }
}
