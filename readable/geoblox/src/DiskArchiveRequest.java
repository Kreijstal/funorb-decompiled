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

    final static void a(int param0, wc param1, int param2) {
        PacketBuffer var5 = null;
        int var4 = 0;
        try {
            var5 = CacheReference.field_q;
            PacketBuffer var3 = var5;
            var5.writeCipherByte(param0, (byte) -107);
            var5.position = var5.position + 1;
            var4 = var5.position;
            var5.writeByte((byte) 127, 1);
            if (null != param1.field_f) {
                var5.writeByte((byte) -124, param1.field_f.length);
                var5.writeBytes(param1.field_f.length, -97, param1.field_f, 0);
            } else {
                var5.writeByte((byte) 121, 0);
            }
            var5.appendCrc32(110, var4);
            var5.position = var5.position - param2;
            param1.field_h = var5.readIntBE((byte) -54);
            var5.backpatchLengthByte(param2 ^ 11696, var5.position - var4);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "o.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte[] getBytes(int methodGuard) {
        if (methodGuard != 397) {
            return (byte[]) null;
        }
        if (!(!this.pending)) {
            throw new RuntimeException();
        }
        return this.bytes;
    }

    DiskArchiveRequest() {
    }

    static {
    }
}
