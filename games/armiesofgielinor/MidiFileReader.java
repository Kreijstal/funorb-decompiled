/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiFileReader {
    private PacketBuffer buffer;
    private static byte[] messageDataBytes;
    int division;
    int[] trackTicks;
    private int tempoMicrosPerQuarter;
    private long timeOffset;
    private int[] runningStatuses;
    private int[] trackStarts;
    private int[] trackPositions;

    final long tickTime(int tick) {
        return this.timeOffset + (long)tick * (long)this.tempoMicrosPerQuarter;
    }

    final boolean isReady() {
        return this.buffer.payload != null;
    }

    final void seekTrack(int trackIndex) {
        this.buffer.position = this.trackPositions[trackIndex];
    }

    final void readDelta(int trackIndex) {
        int delta = this.buffer.readVarInt(-30);
        this.trackTicks[trackIndex] = this.trackTicks[trackIndex] + delta;
    }

    final void reset(long timeOffset) {
        int trackIndex = 0;
        this.timeOffset = timeOffset;
        int trackCount = this.trackPositions.length;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          this.trackTicks[trackIndex] = 0;
          this.runningStatuses[trackIndex] = 0;
          this.buffer.position = this.trackStarts[trackIndex];
          this.readDelta(trackIndex);
          this.trackPositions[trackIndex] = this.buffer.position;
        }
    }

    final void saveTrackPosition(int trackIndex) {
        this.trackPositions[trackIndex] = this.buffer.position;
    }

    final int readMessage(int trackIndex) {
        int message = this.readNextMessage(trackIndex);
        return message;
    }

    final boolean isDone() {
        int trackIndex = 0;
        int trackCount = this.trackPositions.length;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          if (this.trackPositions[trackIndex] >= 0) {
            return false;
          }
        }
        return true;
    }

    private final int decodeMessagePayload(int trackIndex, int status) {
        int newTempo = 0;
        int tick = 0;
        int metaType = 0;
        int payloadLength = 0;
        int dataBytes;
        int message;
        if (status == 255) {
          metaType = this.buffer.readUnsignedByte(0);
          payloadLength = this.buffer.readVarInt(92);
          if (metaType == 47) {
            this.buffer.position = this.buffer.position + payloadLength;
            return 1;
          }
          if (metaType == 81) {
            newTempo = this.buffer.readUnsignedMedium((byte) -13);
            payloadLength -= 3;
            tick = this.trackTicks[trackIndex];
            this.timeOffset = this.timeOffset + (long)tick * (long)(this.tempoMicrosPerQuarter - newTempo);
            this.tempoMicrosPerQuarter = newTempo;
            this.buffer.position = this.buffer.position + payloadLength;
            return 2;
          }
          this.buffer.position = this.buffer.position + payloadLength;
          return 3;
        }
        dataBytes = messageDataBytes[status - 128];
        message = status;
        if (dataBytes >= 1) {
          message = message | this.buffer.readUnsignedByte(0) << 8;
        }
        if (dataBytes >= 2) {
          message = message | this.buffer.readUnsignedByte(0) << 16;
        }
        return message;
    }

    final int trackCount() {
        return this.trackPositions.length;
    }

    final void markTrackDone() {
        this.buffer.position = -1;
    }

    final void parse(byte[] midiBytes) {
        int chunkType = 0;
        int chunkLength = 0;
        int initialTrackIndex;
        this.buffer.payload = midiBytes;
        this.buffer.position = 10;
        int trackCount = this.buffer.readUnsignedShort((byte) -104);
        this.division = this.buffer.readUnsignedShort((byte) -104);
        this.tempoMicrosPerQuarter = 500000;
        this.trackStarts = new int[trackCount];
        int trackIndex = 0;
        while (trackIndex < trackCount) {
          chunkType = this.buffer.readInt(1);
          chunkLength = this.buffer.readInt(1);
          if (chunkType == 1297379947) {
            this.trackStarts[trackIndex] = this.buffer.position;
            trackIndex++;
          }
          this.buffer.position = this.buffer.position + chunkLength;
        }
        this.timeOffset = 0L;
        this.trackPositions = new int[trackCount];
        int cursorIndex = 0;
        initialTrackIndex = cursorIndex;
        while (cursorIndex < trackCount) {
          this.trackPositions[cursorIndex] = this.trackStarts[cursorIndex];
          cursorIndex++;
        }
        this.trackTicks = new int[trackCount];
        this.runningStatuses = new int[trackCount];
    }

    final int nextTrack() {
        int trackIndex = 0;
        int trackCount;
        int selectedTrack;
        int minimumTick;
        trackCount = this.trackPositions.length;
        selectedTrack = -1;
        minimumTick = 2147483647;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          if (this.trackPositions[trackIndex] >= 0 &&
            this.trackTicks[trackIndex] < minimumTick) {
            selectedTrack = trackIndex;
            minimumTick = this.trackTicks[trackIndex];
          }
        }
        return selectedTrack;
    }

    private final int readNextMessage(int trackIndex) {
        int status;
        int payloadLength;
        int escapedStatus;
        status = this.buffer.payload[this.buffer.position];
        if (status >= 0) {
          status = this.runningStatuses[trackIndex];
        } else {
          status = status & 255;
          this.runningStatuses[trackIndex] = status;
          this.buffer.position = this.buffer.position + 1;
        }
        if (status != 240 &&
          status != 247) {
          return this.decodeMessagePayload(trackIndex, status);
        }
        payloadLength = this.buffer.readVarInt(-16);
        if (status == 247 &&
          payloadLength > 0) {
          escapedStatus = this.buffer.payload[this.buffer.position] & 255;
          if (!(escapedStatus < 241) &&
            !(escapedStatus > 243) || (escapedStatus == 246 ||
            escapedStatus == 248) || !(escapedStatus < 250) &&
            !(escapedStatus > 252) || escapedStatus == 254) {
            this.buffer.position = this.buffer.position + 1;
            this.runningStatuses[trackIndex] = escapedStatus;
            return this.decodeMessagePayload(trackIndex, escapedStatus);
          }
        }
        this.buffer.position = this.buffer.position + payloadLength;
        return 0;
    }

    public static void releaseMessageTable() {
        messageDataBytes = null;
    }

    final void release() {
        this.buffer.payload = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.runningStatuses = null;
    }

    MidiFileReader() {
        this.buffer = new PacketBuffer((byte[]) null);
    }

    MidiFileReader(byte[] midiBytes) {
        this.buffer = new PacketBuffer((byte[]) null);
        this.parse(midiBytes);
    }

    static {
        messageDataBytes = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
