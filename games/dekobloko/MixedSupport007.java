/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport007 {
    static String stringState0035;
    static RenderingSupport007 renderingSupport007State0001;
    static String stringState0036;
    static boolean booleanState0005;

    final static MixedSupport068 computeMixedSupport0680070(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        NodeDeque stackNodeDequeLocal1 = null;
        boolean stackBooleanLocal2 = false;
        NodeDeque stackNodeDequeLocal3 = null;
        boolean stackBooleanLocal4 = false;
        Object objectLocal5;
        MixedSupport068 mixedSupport068Local6;
        int integerLocal7;
        MixedSupport068 mixedSupport068Local8;
        MixedSupport068 mixedSupport068Local9;
        MixedSupport068 mixedSupport068Local10;
        objectLocal5 = null;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument2) {
          mixedSupport068Local6 = (MixedSupport068) (SecondaryNodeDequeIterator.nodeDequeState0007.beginBackward((byte) 49));
          while (mixedSupport068Local6 != null) {
            if (integerArgument4 == mixedSupport068Local6.integerState0358) {
              return mixedSupport068Local6;
            }
            stackNodeDequeLocal3 = SecondaryNodeDequeIterator.nodeDequeState0007;
            stackBooleanLocal4 = !(booleanArgument2);
            mixedSupport068Local6 = (MixedSupport068) (((NodeDeque) (Object) stackNodeDequeLocal3).nextBackward(stackBooleanLocal4));
          }
          mixedSupport068Local9 = new MixedSupport068();
          mixedSupport068Local9.integerState0358 = integerArgument4;
          mixedSupport068Local9.integerState0359 = integerArgument5;
          mixedSupport068Local9.integerState0357 = integerArgument3;
          SecondaryNodeDequeIterator.nodeDequeState0007.addFirst(mixedSupport068Local9, 2777);
          SceneWidgetPart014.performAction1783(mixedSupport068Local9, integerArgument1, 60);
          return mixedSupport068Local9;
        }
        MixedSupport007.computeMixedSupport0680070(9, false, 66, -99, 40);
        mixedSupport068Local10 = (MixedSupport068) (SecondaryNodeDequeIterator.nodeDequeState0007.beginBackward((byte) 49));
        while (mixedSupport068Local10 != null) {
          if (integerArgument4 == mixedSupport068Local10.integerState0358) {
            return mixedSupport068Local10;
          }
          stackNodeDequeLocal1 = SecondaryNodeDequeIterator.nodeDequeState0007;
          stackBooleanLocal2 = !(booleanArgument2);
          mixedSupport068Local10 = (MixedSupport068) (((NodeDeque) (Object) stackNodeDequeLocal1).nextBackward(stackBooleanLocal2));
        }
        mixedSupport068Local8 = new MixedSupport068();
        mixedSupport068Local8.integerState0358 = integerArgument4;
        mixedSupport068Local8.integerState0359 = integerArgument5;
        mixedSupport068Local8.integerState0357 = integerArgument3;
        SecondaryNodeDequeIterator.nodeDequeState0007.addFirst(mixedSupport068Local8, 2777);
        SceneWidgetPart014.performAction1783(mixedSupport068Local8, integerArgument1, 60);
        return mixedSupport068Local8;
    }

    final static int computeInteger0071(int integerArgument1) {
        if (integerArgument1 > 69) {
          return PacketBuffer.integerState0936 + (MixedSupport146.integerState0932 << 2) + (BufferedSocket.integerState0667 << 4);
        }
        MixedSupport007.computeInteger0071(-17);
        return PacketBuffer.integerState0936 + (MixedSupport146.integerState0932 << 2) + (BufferedSocket.integerState0667 << 4);
    }

    public static void clearStaticReferences(int integerArgument1) {
        if (integerArgument1 < 77) {
          return;
        }
        stringState0035 = null;
        stringState0036 = null;
        renderingSupport007State0001 = null;
    }

    static {
        stringState0035 = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        stringState0036 = "The following settings need to be changed:  ";
    }
}
