/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResourceProtocolClient {
    static String field_m;
    static RgbSprite[] field_d;
    static je[] field_j;
    static int field_e;
    static String field_k;
    DualNodeDeque queuedPriority;
    static int field_c;
    DualNodeDeque inFlightPriority;
    DualNodeDeque queuedNormal;
    DualNodeDeque inFlightNormal;
    PacketBuffer outgoingRecord;
    int idleMillis;
    long lastPollMillis;
    PacketBuffer incomingHeader;
    volatile int errorCount;
    volatile int errorCode;
    byte xorByte;
    NetworkResourceRequest activeResponse;

    final boolean isNormalFull(byte obfuscationGuard) {
        if (obfuscationGuard != 51) {
          this.isPriorityFull(100);
        }
        return this.getNormalCount(obfuscationGuard - 179) >= 20 ? true : false;
    }

    final NetworkResourceRequest request(int groupId, boolean obfuscationGuard, int archiveId, byte paddingBytes, boolean priority) {
        long requestKey = ((long)archiveId << 32) + (long)groupId;
        NetworkResourceRequest request = new NetworkResourceRequest();
        request.secondaryKey = requestKey;
        request.paddingBytes = paddingBytes;
        if (obfuscationGuard) {
          field_c = 46;
        }
        request.requestFlag = priority ? true : false;
        if (!priority) {
          if (!(this.getNormalCount(-120) < 20)) {
            throw new RuntimeException();
          }
          this.queuedNormal.addLast(request, false);
        } else {
          if (this.getPriorityCount(116) >= 20) {
            throw new RuntimeException();
          }
          this.queuedPriority.addLast(request, false);
        }
        return request;
    }

    abstract boolean poll(boolean checkWriteError);

    final boolean isPriorityFull(int obfuscationGuard) {
        if (obfuscationGuard <= 14) {
          field_m = (String) null;
        }
        return this.getPriorityCount(88) >= 20 ? true : false;
    }

    public static void c(byte param0) {
        if (param0 != 35) {
          return;
        }
        field_d = null;
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final int getNormalCount(int obfuscationGuard) {
        if (obfuscationGuard >= -105) {
          return -114;
        }
        return this.queuedNormal.size(30578) + this.inFlightNormal.size(30578);
    }

    final int getPriorityCount(int obfuscationGuard) {
        if (obfuscationGuard < 84) {
          return 64;
        }
        return this.queuedPriority.size(30578) + this.inFlightPriority.size(30578);
    }

    final static void a(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 > -96) {
            ResourceProtocolClient.a(-87, 28, 102);
          }
          var11 = dr.field_v[param0];
          var10 = var11;
          var9 = var10;
          var3 = var9;
          for (var4 = 0; var4 < var11.length; var4++) {
            var11[var4] = param1;
            var5 = gq.a(var11[var4]);
            var6 = (524092 & var5) >> 8;
            var6 = var6 + 5 * var4 / var11.length;
            var7 = 255 & var5;
            if (var7 > 6) {
              var7 = 6;
            }
            var5 = var6 << 8 | -524033 & var5;
            var5 = -256 & var5 | var7;
            var9[var4] = gq.b(var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3_ref), "bp.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void invalidateTransport(byte obfuscationGuard);

    abstract void close(int obfuscationGuard);

    abstract void attachTransport(Object transport, boolean sessionFlag, int obfuscationGuard);

    ResourceProtocolClient() {
        this.queuedPriority = new DualNodeDeque();
        this.inFlightPriority = new DualNodeDeque();
        this.queuedNormal = new DualNodeDeque();
        this.inFlightNormal = new DualNodeDeque();
        this.outgoingRecord = new PacketBuffer(6);
        this.errorCount = 0;
        this.errorCode = 0;
        this.xorByte = (byte) 0;
        this.incomingHeader = new PacketBuffer(10);
    }

    static {
        field_e = 256;
        field_m = "Unfortunately you are not eligible to create an account.";
        field_k = "Waiting for sound effects";
        field_c = -1;
    }
}
