/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    static BitmapFont field_a;
    static int field_h;
    SecondaryIntrusiveDeque urgentPending;
    static int field_b;
    SecondaryIntrusiveDeque urgentInFlight;
    static String field_i;
    SecondaryIntrusiveDeque prefetchPending;
    SecondaryIntrusiveDeque prefetchInFlight;
    long lastServiceMillis;
    PacketBuffer outgoingControl;
    int idleMillis;
    volatile int lastErrorCode;
    byte xorKey;
    volatile int failureCount;
    PacketBuffer incomingHeader;
    Js5NetworkRequest currentRequest;

    final boolean isUrgentCapacityReached(int guard) {
        if (guard == 20) {
          return 20 <= this.urgentCount(true) ? true : false;
        }
        this.prefetchInFlight = (SecondaryIntrusiveDeque) null;
        return 20 <= this.urgentCount(true) ? true : false;
    }

    final int urgentCount(boolean guard) {
        if (guard) {
          return this.urgentPending.size(0) + this.urgentInFlight.size(0);
        }
        this.close(-59);
        return this.urgentPending.size(0) + this.urgentInFlight.size(0);
    }

    abstract void close(int guard);

    final int prefetchCount(byte guard) {
        if (guard == 88) {
          return this.prefetchPending.size(0) + this.prefetchInFlight.size(0);
        }
        this.outgoingControl = (PacketBuffer) null;
        return this.prefetchPending.size(0) + this.prefetchInFlight.size(0);
    }

    public static void releaseStatics(int guard) {
        field_i = null;
        if (guard != -4470) {
          field_b = 100;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean isPrefetchCapacityReached(int guard) {
        if (guard == 20) {
          return 20 <= this.prefetchCount((byte) 88) ? true : false;
        }
        this.prefetchInFlight = (SecondaryIntrusiveDeque) null;
        return 20 <= this.prefetchCount((byte) 88) ? true : false;
    }

    abstract void resetAfterIntegrityFailure(byte guard);

    abstract void attachConnection(Object connection, boolean loggedIn, byte guard);

    abstract boolean processNetwork(int guard);

    final Js5NetworkRequest requestGroup(int archiveId, boolean urgent, byte guard, int groupId, byte padding) {
        long var6 = (long)groupId + ((long)archiveId << 32);
        if (guard == 0) {
          Js5NetworkRequest var8 = new Js5NetworkRequest();
          var8.paddingBytes = padding;
          Js5NetworkRequest stackIn_16_0 = var8;
          boolean stackIn_17_1 = (!urgent) ? false : true;
          stackIn_16_0.field_r = stackIn_17_1;
          var8.secondaryKey = var6;
          if (urgent) {
            if (this.urgentCount(true) >= 20) {
              throw new RuntimeException();
            }
            this.urgentPending.addLast(-1, var8);
          } else {
            if (this.prefetchCount((byte) 88) >= 20) {
              throw new RuntimeException();
            }
            this.prefetchPending.addLast(~guard, var8);
          }
          return var8;
        }
        this.idleMillis = -16;
        Js5NetworkRequest var8Lifetime1 = new Js5NetworkRequest();
        var8Lifetime1.paddingBytes = padding;
        Js5NetworkRequest stackIn_3_0 = var8Lifetime1;
        boolean stackIn_4_1 = (!urgent) ? false : true;
        stackIn_3_0.field_r = stackIn_4_1;
        var8Lifetime1.secondaryKey = var6;
        if (urgent) {
          if (this.urgentCount(true) >= 20) {
            throw new RuntimeException();
          }
          this.urgentPending.addLast(-1, var8Lifetime1);
        } else {
          if (this.prefetchCount((byte) 88) >= 20) {
            throw new RuntimeException();
          }
          this.prefetchPending.addLast(~guard, var8Lifetime1);
        }
        return var8Lifetime1;
    }

    Js5Transport() {
        this.urgentPending = new SecondaryIntrusiveDeque();
        this.urgentInFlight = new SecondaryIntrusiveDeque();
        this.prefetchPending = new SecondaryIntrusiveDeque();
        this.prefetchInFlight = new SecondaryIntrusiveDeque();
        this.outgoingControl = new PacketBuffer(6);
        this.failureCount = 0;
        this.xorKey = (byte) 0;
        this.lastErrorCode = 0;
        this.incomingHeader = new PacketBuffer(10);
    }

    static {
        field_b = 0;
        field_i = "";
    }
}
