/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport007 {
    static String stringState0035;
    static RenderingSupport008 renderingSupport008State0001;
    static String stringState0036;
    static boolean booleanState0005;

    final static MixedSupport072 computeMixedSupport0720079(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        NodeDeque stackNodeDequeLocal1 = null;
        boolean stackBooleanLocal2 = false;
        NodeDeque stackNodeDequeLocal3 = null;
        boolean stackBooleanLocal4 = false;
        Object objectLocal5;
        MixedSupport072 mixedSupport072Local6;
        int integerLocal7;
        MixedSupport072 mixedSupport072Local8;
        MixedSupport072 mixedSupport072Local9;
        MixedSupport072 mixedSupport072Local10;
        objectLocal5 = null;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument2) {
          mixedSupport072Local6 = (MixedSupport072) (CollectionSupport002.nodeDequeState0007.computeHashNode1970((byte) 49));
          while (mixedSupport072Local6 != null) {
            if (integerArgument4 == mixedSupport072Local6.integerState0358) {
              return mixedSupport072Local6;
            }
            stackNodeDequeLocal3 = CollectionSupport002.nodeDequeState0007;
            stackBooleanLocal4 = !(booleanArgument2);
            mixedSupport072Local6 = (MixedSupport072) (((NodeDeque) (Object) stackNodeDequeLocal3).computeHashNode1974(stackBooleanLocal4));
          }
          mixedSupport072Local9 = new MixedSupport072();
          mixedSupport072Local9.integerState0358 = integerArgument4;
          mixedSupport072Local9.integerState0359 = integerArgument5;
          mixedSupport072Local9.integerState0357 = integerArgument3;
          CollectionSupport002.nodeDequeState0007.performAction1963(mixedSupport072Local9, 2777);
          SceneWidgetPart014.performAction2013(mixedSupport072Local9, integerArgument1, 60);
          return mixedSupport072Local9;
        }
        MixedSupport007.computeMixedSupport0720079(9, false, 66, -99, 40);
        mixedSupport072Local10 = (MixedSupport072) (CollectionSupport002.nodeDequeState0007.computeHashNode1970((byte) 49));
        while (mixedSupport072Local10 != null) {
          if (integerArgument4 == mixedSupport072Local10.integerState0358) {
            return mixedSupport072Local10;
          }
          stackNodeDequeLocal1 = CollectionSupport002.nodeDequeState0007;
          stackBooleanLocal2 = !(booleanArgument2);
          mixedSupport072Local10 = (MixedSupport072) (((NodeDeque) (Object) stackNodeDequeLocal1).computeHashNode1974(stackBooleanLocal2));
        }
        mixedSupport072Local8 = new MixedSupport072();
        mixedSupport072Local8.integerState0358 = integerArgument4;
        mixedSupport072Local8.integerState0359 = integerArgument5;
        mixedSupport072Local8.integerState0357 = integerArgument3;
        CollectionSupport002.nodeDequeState0007.performAction1963(mixedSupport072Local8, 2777);
        SceneWidgetPart014.performAction2013(mixedSupport072Local8, integerArgument1, 60);
        return mixedSupport072Local8;
    }

    final static int computeInteger0080(int integerArgument1) {
        if (integerArgument1 > 69) {
          return PacketBuffer.integerState0936 + (MixedSupport153.integerState0932 << 2) + (BufferedSocket.integerState0667 << 4);
        }
        MixedSupport007.computeInteger0080(-17);
        return PacketBuffer.integerState0936 + (MixedSupport153.integerState0932 << 2) + (BufferedSocket.integerState0667 << 4);
    }

    public static void performAction0078(int integerArgument1) {
        if (integerArgument1 < 77) {
          return;
        }
        stringState0035 = null;
        stringState0036 = null;
        renderingSupport008State0001 = null;
    }

    static {
        stringState0035 = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        stringState0036 = "The following settings need to be changed:  ";
    }
}
