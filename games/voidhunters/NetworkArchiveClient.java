/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkArchiveClient {
    static String field_l;
    SecondaryNodeQueue priorityQueue;
    SecondaryNodeQueue priorityInFlight;
    SecondaryNodeQueue backgroundQueue;
    SecondaryNodeQueue backgroundInFlight;
    PacketBuffer commandBuffer;
    int idleMillis;
    long lastProcessTime;
    PacketBuffer responseHeader;
    byte responseXorKey;
    volatile int errorStatus;
    volatile int errorCount;
    NetworkArchiveRequest currentRequest;

    abstract void close(int param0);

    public static void clearSharedReferences(int param0) {
        field_l = null;
        if (param0 < 124) {
          field_l = (String) null;
        }
    }

    abstract boolean processRequests(int param0);

    final boolean isPriorityQueueFull(int param0) {
        if (param0 > 38) {
          return this.getPriorityRequestCount(13223) >= 20 ? true : false;
        }
        Object var3 = (Object) null;
        this.setConnection((Object) null, true, false);
        return this.getPriorityRequestCount(13223) >= 20 ? true : false;
    }

    final boolean isBackgroundQueueFull(byte param0) {
        if (param0 == 32) {
          return this.getBackgroundRequestCount(-3666) >= 20 ? true : false;
        }
        NetworkArchiveClient.clearSharedReferences(58);
        return this.getBackgroundRequestCount(-3666) >= 20 ? true : false;
    }

    abstract void setConnection(Object param0, boolean param1, boolean param2);

    final int getPriorityRequestCount(int param0) {
        if (param0 != 13223) {
          return -111;
        }
        return this.priorityQueue.size(0) + this.priorityInFlight.size(param0 - 13223);
    }

    abstract void resetAfterValidationFailure(byte param0);

    final NetworkArchiveRequest requestGroup(boolean param0, int param1, int param2, byte param3, int param4) {
        if (param1 != -21) {
          return (NetworkArchiveRequest) null;
        }
        long var6 = ((long)param4 << 32) + (long)param2;
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.secondaryKey = var6;
        var8.priority = param0 ? true : false;
        var8.padding = param3;
        if (param0) {
          if (!(this.getPriorityRequestCount(13223) < 20)) {
            throw new RuntimeException();
          }
          this.priorityQueue.addLast(var8, -75);
        } else {
          if (this.getBackgroundRequestCount(-3666) < 20) {
            this.backgroundQueue.addLast(var8, -90);
            return var8;
          }
          throw new RuntimeException();
        }
        return var8;
    }

    final int getBackgroundRequestCount(int param0) {
        if (param0 != -3666) {
          return -55;
        }
        return this.backgroundQueue.size(0) + this.backgroundInFlight.size(0);
    }

    NetworkArchiveClient() {
        this.priorityQueue = new SecondaryNodeQueue();
        this.priorityInFlight = new SecondaryNodeQueue();
        this.backgroundQueue = new SecondaryNodeQueue();
        this.backgroundInFlight = new SecondaryNodeQueue();
        this.commandBuffer = new PacketBuffer(6);
        this.responseXorKey = (byte) 0;
        this.errorCount = 0;
        this.errorStatus = 0;
        this.responseHeader = new PacketBuffer(10);
    }

    static {
        field_l = "Report <%0> for abuse";
    }
}
