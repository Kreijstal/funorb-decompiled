/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    DiskArchiveCache diskCache;
    int operationType;
    byte[] bytes;

    final int getProgress(int methodGuard) {
        if (methodGuard != 0) {
            this.diskCache = (DiskArchiveCache) null;
            if (!this.pending) {
                return 100;
            }
            return 0;
        }
        if (!this.pending) {
            return 100;
        }
        return 0;
    }

    final static void writeCrcAcknowledgementPacket(int opcode, CrcAcknowledgedPacket acknowledgementPacket, int crcReadbackDistance) {
        PacketBuffer outgoingBuffer = null;
        int payloadStart = 0;
        try {
            outgoingBuffer = CacheReference.outgoingSessionBuffer;
            PacketBuffer unusedOutgoingBufferAlias = outgoingBuffer;
            outgoingBuffer.writeCipherByte(opcode, (byte) -107);
            outgoingBuffer.position = outgoingBuffer.position + 1;
            payloadStart = outgoingBuffer.position;
            outgoingBuffer.writeByte((byte) 127, 1);
            if (null != acknowledgementPacket.payload) {
                outgoingBuffer.writeByte((byte) -124, acknowledgementPacket.payload.length);
                outgoingBuffer.writeBytes(acknowledgementPacket.payload.length, -97, acknowledgementPacket.payload, 0);
            } else {
                outgoingBuffer.writeByte((byte) 121, 0);
            }
            outgoingBuffer.appendCrc32(110, payloadStart);
            outgoingBuffer.position = outgoingBuffer.position - crcReadbackDistance;
            acknowledgementPacket.acknowledgementCrc = outgoingBuffer.readIntBE((byte) -54);
            outgoingBuffer.backpatchLengthByte(crcReadbackDistance ^ 11696, outgoingBuffer.position - payloadStart);
        } catch (RuntimeException packetFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) packetFailure), "o.E(" + opcode + ',' + (acknowledgementPacket != null ? "{...}" : "null") + ',' + crcReadbackDistance + ')');
        }
    }

    final byte[] getBytes(int methodGuard) {
        if (methodGuard != 397) {
            return (byte[]) null;
        }
        if ((this.pending)) {
            throw new RuntimeException();
        }
        return this.bytes;
    }

    DiskArchiveRequest() {
    }

    static {
    }
}
