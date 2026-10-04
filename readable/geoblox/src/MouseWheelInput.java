/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static int primarySocialListState;
    static AchievementQuery achievementStateQuery;
    static Sprite[] commonButtonSprites;
    static DisplayNamePanel activeDisplayNamePanel;
    static int[] secondVertexTransformedZ;

    abstract void detachWheelListener(java.awt.Component component, byte methodGuard);

    abstract void attachWheelListener(int methodGuard, java.awt.Component component);

    abstract int drainWheelRotation(boolean drainGuard);

    final static byte[] readPackedByteArray(byte[] destination, PacketBuffer buffer, int lengthBitCount, int baseBitCount) {
        int arrayLength = 0;
        int deltaBitCount = 0;
        int signedBaseValue = 0;
        int elementIndex = 0;
        int unusedClientControlSnapshot = 0;
        Object nullArrayBeforeReturn = null;
        byte[] arrayBeforeReturn = null;
        RuntimeException readFailureBeforeDescriptions = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        StringBuilder readMessageBeforeBufferDescription = null;
        String bufferDescription = null;
        RuntimeException caughtReadFailure = null;
        RuntimeException readFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          arrayLength = buffer.readBits((byte) -17, lengthBitCount);
          if (arrayLength == 0) {
            nullArrayBeforeReturn = null;
            return (byte[]) (nullArrayBeforeReturn);
          }
          if (!((destination != null) &&
                (destination.length == arrayLength))) {
            destination = new byte[arrayLength];
          }
          deltaBitCount = buffer.readBits((byte) -17, 3);
          signedBaseValue = (byte)buffer.readBits((byte) -17, baseBitCount);
          if (0 >= deltaBitCount) {
            for (elementIndex = 0; arrayLength > elementIndex; elementIndex++) {
              destination[elementIndex] = (byte)signedBaseValue;
            }
          } else {
            for (elementIndex = 0; arrayLength > elementIndex; elementIndex++) {
              destination[elementIndex] = (byte)(buffer.readBits((byte) -17, deltaBitCount) + signedBaseValue);
            }
          }
          arrayBeforeReturn = (byte[]) (destination);
          return arrayBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeDescriptions = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("vk.E(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          readMessageBeforeBufferDescription = ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',');
          if (buffer == null) {
            bufferDescription = "null";
          } else {
            bufferDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeDescriptions), ((StringBuilder) (Object) readMessageBeforeBufferDescription).append(bufferDescription).append(',').append(lengthBitCount).append(',').append(baseBitCount).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        secondVertexTransformedZ = null;
        commonButtonSprites = null;
        achievementStateQuery = null;
        if (methodGuard >= -9) {
            return;
        }
        activeDisplayNamePanel = null;
    }

    static {
        secondVertexTransformedZ = new int[8192];
    }
}
