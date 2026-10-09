/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiTrackReader {
    private ByteArrayBuffer input;
    private int[] trackPositions;
    int[] trackTicks;
    int tickDivision;
    private static byte[] statusDataByteCounts;
    private int[] trackStarts;
    private int tempoMicrosPerQuarter;
    private int[] trackRunningStatuses;
    private long tickTimeOffset;

    final void readTrackDelta(int trackIndex) {
        int deltaTicks = this.input.readVariableIntBE((byte) -122);
        this.trackTicks[trackIndex] = this.trackTicks[trackIndex] + deltaTicks;
    }

    final void markCurrentTrackEnded() {
        this.input.position = -1;
    }

    final void saveTrackPosition(int trackIndex) {
        this.trackPositions[trackIndex] = this.input.position;
    }

    final boolean areAllTracksEnded() {
        int trackIndex = 0;
        int trackCount = this.trackPositions.length;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
            if (this.trackPositions[trackIndex] >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void clearStatusDataByteCounts() {
        statusDataByteCounts = null;
    }

    final void restartTracks(long tickTimeOffset) {
        int trackIndex = 0;
        this.tickTimeOffset = tickTimeOffset;
        int trackCount = this.trackPositions.length;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
            this.trackTicks[trackIndex] = 0;
            this.trackRunningStatuses[trackIndex] = 0;
            this.input.position = this.trackStarts[trackIndex];
            this.readTrackDelta(trackIndex);
            this.trackPositions[trackIndex] = this.input.position;
        }
    }

    final void unload() {
        this.input.bytes = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackTicks = null;
        this.trackRunningStatuses = null;
    }

    final long getTickTime(int tick) {
        return this.tickTimeOffset + (long)tick * (long)this.tempoMicrosPerQuarter;
    }

    private final int readEventPayload(int trackIndex, int status) {
        int newTempo = 0;
        int tempoChangeTick = 0;
        int metaTypeOrDataByteCount = 0;
        int remainingMetaLengthOrPackedEvent = 0;
        if (status == 255) {
            metaTypeOrDataByteCount = this.input.readUnsignedByte((byte) 34);
            remainingMetaLengthOrPackedEvent = this.input.readVariableIntBE((byte) -110);
            if (metaTypeOrDataByteCount == 47) {
                this.input.position = this.input.position + remainingMetaLengthOrPackedEvent;
                return 1;
            }
            if (metaTypeOrDataByteCount == 81) {
                newTempo = this.input.readUnsignedMediumBE(110);
                remainingMetaLengthOrPackedEvent -= 3;
                tempoChangeTick = this.trackTicks[trackIndex];
                this.tickTimeOffset = this.tickTimeOffset + (long)tempoChangeTick * (long)(this.tempoMicrosPerQuarter - newTempo);
                this.tempoMicrosPerQuarter = newTempo;
                this.input.position = this.input.position + remainingMetaLengthOrPackedEvent;
                return 2;
            }
            this.input.position = this.input.position + remainingMetaLengthOrPackedEvent;
            return 3;
        }
        metaTypeOrDataByteCount = statusDataByteCounts[status - 128];
        remainingMetaLengthOrPackedEvent = status;
        if (metaTypeOrDataByteCount >= 1) {
            remainingMetaLengthOrPackedEvent = remainingMetaLengthOrPackedEvent | this.input.readUnsignedByte((byte) 34) << 8;
        }
        if (metaTypeOrDataByteCount >= 2) {
            remainingMetaLengthOrPackedEvent = remainingMetaLengthOrPackedEvent | this.input.readUnsignedByte((byte) 34) << 16;
        }
        return remainingMetaLengthOrPackedEvent;
    }

    final boolean isLoaded() {
        return this.input.bytes != null;
    }

    final int selectEarliestTrack() {
        int trackIndex = 0;
        int trackCount;
        int selectedTrack;
        int earliestTick;
        trackCount = this.trackPositions.length;
        selectedTrack = -1;
        earliestTick = 2147483647;
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          if (this.trackPositions[trackIndex] < 0) {
            continue;
          }
          if (this.trackTicks[trackIndex] >= earliestTick) {
            continue;
          }
          selectedTrack = trackIndex;
          earliestTick = this.trackTicks[trackIndex];
        }
        return selectedTrack;
    }

    final void seekTrack(int trackIndex) {
        this.input.position = this.trackPositions[trackIndex];
    }

    final int readTrackEvent(int trackIndex) {
        int event = this.readEventWithRunningStatus(trackIndex);
        return event;
    }

    final int getTrackCount() {
        return this.trackPositions.length;
    }

    final void load(byte[] midiBytes) {
        int chunkType = 0;
        int chunkLength = 0;
        this.input.bytes = midiBytes;
        this.input.position = 10;
        int trackCount = this.input.readUnsignedShortBE(true);
        this.tickDivision = this.input.readUnsignedShortBE(true);
        this.tempoMicrosPerQuarter = 500000;
        this.trackStarts = new int[trackCount];
        int trackIndex = 0;
        while (trackIndex < trackCount) {
            chunkType = this.input.readIntBE((byte) -98);
            chunkLength = this.input.readIntBE((byte) -87);
            if (chunkType == 1297379947) {
                this.trackStarts[trackIndex] = this.input.position;
                trackIndex++;
            }
            this.input.position = this.input.position + chunkLength;
        }
        this.tickTimeOffset = 0L;
        this.trackPositions = new int[trackCount];
        int positionInitializationIndex = 0;
        trackIndex = positionInitializationIndex;
        while (positionInitializationIndex < trackCount) {
            this.trackPositions[positionInitializationIndex] = this.trackStarts[positionInitializationIndex];
            positionInitializationIndex++;
        }
        this.trackTicks = new int[trackCount];
        this.trackRunningStatuses = new int[trackCount];
    }

    private final int readEventWithRunningStatus(int trackIndex) {
        int status;
        int systemExclusiveLength;
        int escapedStatus;
        status = this.input.bytes[this.input.position];
        if (status >= 0) {
          status = this.trackRunningStatuses[trackIndex];
        } else {
          status = status & 255;
          this.trackRunningStatuses[trackIndex] = status;
          this.input.position = this.input.position + 1;
        }
        if (status != 240 &&
            status != 247) {
          return this.readEventPayload(trackIndex, status);
        }
        systemExclusiveLength = this.input.readVariableIntBE((byte) -109);
        if (status == 247 &&
            systemExclusiveLength > 0) {
          escapedStatus = this.input.bytes[this.input.position] & 255;
          if (!(escapedStatus < 241) &&
              !(escapedStatus > 243) || (escapedStatus == 246 ||
          escapedStatus == 248) || !(escapedStatus < 250) &&
            !(escapedStatus > 252) || escapedStatus == 254) {
            this.input.position = this.input.position + 1;
            this.trackRunningStatuses[trackIndex] = escapedStatus;
            return this.readEventPayload(trackIndex, escapedStatus);
          }
        }
        this.input.position = this.input.position + systemExclusiveLength;
        return 0;
    }

    MidiTrackReader() {
        this.input = new ByteArrayBuffer((byte[]) null);
    }

    MidiTrackReader(byte[] midiBytes) {
        this.input = new ByteArrayBuffer((byte[]) null);
        this.load(midiBytes);
    }

    static {
        statusDataByteCounts = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }
}
