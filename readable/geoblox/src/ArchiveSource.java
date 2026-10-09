/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveSource {
    static String loadingText;
    static char[] additionalNameCharacters;
    static SecondaryNodeHashTable primarySocialEntriesByNameHash;

    abstract int getGroupProgress(int methodGuard, int groupId);

    public static void releaseStaticReferences(boolean methodGuard) {
        if (!methodGuard) {
            byte[] unusedNullSignatureSnapshot = (byte[]) null;
            ArchiveSource.writeEncryptedPayload((java.math.BigInteger) null, (java.math.BigInteger) null, 127, (ByteArrayBuffer) null, (byte[]) null, -60, false);
        }
        additionalNameCharacters = null;
        primarySocialEntriesByNameHash = null;
        loadingText = null;
    }

    abstract ArchiveIndex getIndex(byte methodGuard);

    abstract byte[] getPackedGroup(int methodGuard, int groupId);

    final static void writeEncryptedPayload(java.math.BigInteger rsaModulus, java.math.BigInteger rsaExponent, int sourceOffset, ByteArrayBuffer destination, byte[] payloadBytes, int payloadLength, boolean appendEncryptedPayload) {
        RuntimeException encryptionFailureBeforeDescription = null;
        StringBuilder encryptionMessagePrefix = null;
        String modulusDescription = null;
        StringBuilder messageBeforeExponent = null;
        String exponentDescription = null;
        StringBuilder messageBeforeDestination = null;
        String destinationDescription = null;
        StringBuilder messageBeforePayload = null;
        String payloadDescription = null;
        RuntimeException caughtEncryptionFailure = null;
        int paddedPayloadLength = 0;
        RuntimeException encryptionFailureForContext = null;
        int[] workingXteaKey = null;
        int keyIndexThenUnusedZeroSnapshot = 0;
        int writtenKeyIndex = 0;
        int[] keyBeforeWorkingAlias = null;
        int[] xteaKey = null;
        int keyIndexThenUnusedZeroSnapshotLiteralPhase1;
        try {
          paddedPayloadLength = GameplayEntity.roundUpToMultipleOfEight(1221916132, payloadLength);
          if (UsernameQuerySupport.payloadKeyRandom == null) {
            UsernameQuerySupport.payloadKeyRandom = new java.security.SecureRandom();
          }
          xteaKey = new int[4];
          keyBeforeWorkingAlias = xteaKey;
          workingXteaKey = keyBeforeWorkingAlias;
          for (keyIndexThenUnusedZeroSnapshot = 0; keyIndexThenUnusedZeroSnapshot < 4; keyIndexThenUnusedZeroSnapshot++) {
            workingXteaKey[keyIndexThenUnusedZeroSnapshot] = UsernameQuerySupport.payloadKeyRandom.nextInt();
          }
          if (null == MessageDialogSupport.encryptedPayloadScratchBuffer ||
                !(MessageDialogSupport.encryptedPayloadScratchBuffer.bytes.length >= paddedPayloadLength)) {
            MessageDialogSupport.encryptedPayloadScratchBuffer = new ByteArrayBuffer(paddedPayloadLength);
          }
          MessageDialogSupport.encryptedPayloadScratchBuffer.position = 0;
          MessageDialogSupport.encryptedPayloadScratchBuffer.writeBytes(payloadLength, -97, payloadBytes, sourceOffset);
          MessageDialogSupport.encryptedPayloadScratchBuffer.padZerosToPosition((byte) -84, paddedPayloadLength);
          MessageDialogSupport.encryptedPayloadScratchBuffer.encryptXteaBlocks(xteaKey, (byte) -33);
          if (HotspotTextWidget.encryptedPayloadKeyScratchBuffer == null ||
              !(HotspotTextWidget.encryptedPayloadKeyScratchBuffer.bytes.length >= 100)) {
            HotspotTextWidget.encryptedPayloadKeyScratchBuffer = new ByteArrayBuffer(100);
          }
          HotspotTextWidget.encryptedPayloadKeyScratchBuffer.position = 0;
          HotspotTextWidget.encryptedPayloadKeyScratchBuffer.writeByte((byte) -69, 10);
          writtenKeyIndex = 0;
          keyIndexThenUnusedZeroSnapshotLiteralPhase1 = writtenKeyIndex;
          while (writtenKeyIndex < 4) {
            HotspotTextWidget.encryptedPayloadKeyScratchBuffer.writeIntBE((byte) 95, xteaKey[writtenKeyIndex]);
            writtenKeyIndex++;
          }
          if (!appendEncryptedPayload) {
            return;
          }
          HotspotTextWidget.encryptedPayloadKeyScratchBuffer.writeShortBE(payloadLength, 28695);
          HotspotTextWidget.encryptedPayloadKeyScratchBuffer.replaceWithModPowResult(0, rsaModulus, rsaExponent);
          destination.writeBytes(HotspotTextWidget.encryptedPayloadKeyScratchBuffer.position, -97, HotspotTextWidget.encryptedPayloadKeyScratchBuffer.bytes, 0);
          destination.writeBytes(MessageDialogSupport.encryptedPayloadScratchBuffer.position, -97, MessageDialogSupport.encryptedPayloadScratchBuffer.bytes, 0);
          return;
        } catch (java.lang.RuntimeException encryptionFailure) {
          caughtEncryptionFailure = encryptionFailure;
          encryptionFailureForContext = caughtEncryptionFailure;
          encryptionFailureBeforeDescription = encryptionFailureForContext;
          encryptionMessagePrefix = new StringBuilder().append("nh.K(");
          if (rsaModulus == null) {
            modulusDescription = "null";
          } else {
            modulusDescription = "{...}";
          }
          messageBeforeExponent = ((StringBuilder) (Object) encryptionMessagePrefix).append(modulusDescription).append(',');
          if (rsaExponent == null) {
            exponentDescription = "null";
          } else {
            exponentDescription = "{...}";
          }
          messageBeforeDestination = ((StringBuilder) (Object) messageBeforeExponent).append(exponentDescription).append(',').append(sourceOffset).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          messageBeforePayload = ((StringBuilder) (Object) messageBeforeDestination).append(destinationDescription).append(',');
          if (payloadBytes == null) {
            payloadDescription = "null";
          } else {
            payloadDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) encryptionFailureBeforeDescription), ((StringBuilder) (Object) messageBeforePayload).append(payloadDescription).append(',').append(payloadLength).append(',').append(appendEncryptedPayload).append(')').toString());
        }
    }

    static {
        loadingText = "Loading...";
        additionalNameCharacters = new char[]{(char)91, (char)93, (char)35};
    }
}
