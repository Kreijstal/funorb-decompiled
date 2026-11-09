/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class Js5Client {
    static String achievementsText;
    static long[] field_k;
    SecondaryNodeQueue urgentQueued;
    static String field_a;
    SecondaryNodeQueue urgentInFlight;
    SecondaryNodeQueue backgroundQueued;
    SecondaryNodeQueue backgroundInFlight;
    long lastServiceMillis;
    int idleMillis;
    PacketBuffer requestBuffer;
    PacketBuffer responseHeader;
    volatile int failureCount;
    volatile int failureCode;
    byte xorKey;
    NetworkResourceRequest currentResponse;

    final static FontMetrics a(ResourceArchive param0, byte param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        FontMetrics stackIn_5_0 = null;
        FontMetrics stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.fetchNamedFile(param2, param3, -1);
          var4 = var5;
          if (var5 == null) {
            stackIn_2_0 = null;
            return (FontMetrics) (stackIn_2_0);
          }
          if (param1 < -1) {
            stackIn_7_0 = new FontMetrics(var5);
            return stackIn_7_0;
          }
          stackIn_5_0 = (FontMetrics) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("gd.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final NetworkResourceRequest requestGroup(int archiveId, boolean urgent, int groupId, byte guard, byte paddingBytes) {
        long var6 = (long)groupId + ((long)archiveId << 32);
        NetworkResourceRequest var8 = new NetworkResourceRequest();
        var8.urgent = urgent ? true : false;
        var8.secondaryKey = var6;
        var8.paddingBytes = paddingBytes;
        int var9 = -16 % ((0 - guard) / 43);
        if (urgent) {
          if (!(this.urgentRequestCount(-2115911413) < 20)) {
            throw new RuntimeException();
          }
          this.urgentQueued.addLast((DualLinkNode) (var8), (byte) -118);
        } else {
          if (!(this.backgroundRequestCount((byte) -120) < 20)) {
            throw new RuntimeException();
          }
          this.backgroundQueued.addLast((DualLinkNode) (var8), (byte) -107);
        }
        return var8;
    }

    abstract void invalidateConnection(int guard);

    final static void a(int param0, int param1, IntrusiveDeque param2, int param3, int param4, int param5) {
        float[] dupTemp$0 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var8Lifetime1;
        float[] var8Lifetime2;
        float[] var8Lifetime1Lifetime1;
        int var7Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 < 59) {
            return;
          }
          stackIn_6_0 = (ul.field_f != 1) ? 0 : 1;
          var6_int = stackIn_6_0;
          var7 = 0;
          while (true) {
            stackIn_10_0 = (var6_int == 0) ? 50 : 25;
            if (stackIn_10_0 > var7) {
              var8 = new float[]{0.0f, (float)(-(ExpandingRingEffect.nextRandomInt(param0, HardwareGraphicsHeap.field_o, (byte) -96) + 1))};
              var13 = kt.a((byte) -81, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
              var12 = var13;
              var10 = var12;
              var8Lifetime2 = var10;
              param2.addLast((IntrusiveNode) (new InwardSparkParticle(64, ((int)var13[0] << 11) + param4, ((int)var13[1] << 11) + param1, param5, -(int)var13[0] << 8, -(int)var13[1] << 8, 0)), (byte) 39);
              var7++;
              continue;
            }
            break;
          }
          var7Lifetime1 = 0;
          while (true) {
            stackIn_16_0 = (var6_int == 0) ? 30 : 25;
            if (stackIn_16_0 <= var7Lifetime1) {
              return;
            }
            var8Lifetime1 = new float[]{0.0f, (float)(-(1 + ExpandingRingEffect.nextRandomInt(param0, HardwareGraphicsHeap.field_o, (byte) -96)))};
            dupTemp$0 = kt.a((byte) -20, var8Lifetime1, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7Lifetime1) + 0.0));
            var11 = dupTemp$0;
            var8Lifetime1Lifetime1 = dupTemp$0;
            param2.addLast((IntrusiveNode) (new InwardSparkParticle(64, param4 + ((int)var11[0] << 11), ((int)var11[1] << 11) + param1, param5, -(int)var11[0] << 8, -(int)var11[1] << 8, 1)), (byte) 39);
            var7Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("gd.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean urgentQueueFull(int guard) {
        int var2 = 111 / ((guard - 76) / 32);
        return this.urgentRequestCount(-2115911413) >= 20 ? true : false;
    }

    abstract void attachConnection(boolean loggedIn, byte guard, Object connection);

    final static boolean nextReflectionCheckReady(byte guard) {
        int var2 = 0;
        ReflectionCheck var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ReflectionCheck var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard <= 118) {
            field_k = (long[]) null;
          }
          var4 = (ReflectionCheck) (AccountConnectionPhase.reflectionChecks.first(100));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.size > var2; var2++) {
            if (null != var4.fieldTasks[var2] &&
              var4.fieldTasks[var2].status == 0) {
              return false;
            }
            if (var4.methodTasks[var2] != null &&
              var4.methodTasks[var2].status == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "gd.K(" + guard + ')');
        }
    }

    final int urgentRequestCount(int guard) {
        if (guard == -2115911413) {
          return this.urgentQueued.size((byte) 2) + this.urgentInFlight.size((byte) 2);
        }
        this.backgroundQueueFull(true);
        return this.urgentQueued.size((byte) 2) + this.urgentInFlight.size((byte) 2);
    }

    final static ServerDataReadRequest requestServerData(byte guard, int opcode) {
        ServerDataReadRequest var2 = null;
        ServerDataReadRequest var2Lifetime1;
        if (guard == -82) {
          var2 = new ServerDataReadRequest();
          no.field_d.addLast((IntrusiveNode) (var2), (byte) 39);
          GzipDecompressor.sendServerDataRead(guard + 11126, opcode);
          return var2;
        }
        field_k = (long[]) null;
        var2Lifetime1 = new ServerDataReadRequest();
        no.field_d.addLast((IntrusiveNode) (var2Lifetime1), (byte) 39);
        GzipDecompressor.sendServerDataRead(guard + 11126, opcode);
        return var2Lifetime1;
    }

    final boolean backgroundQueueFull(boolean guard) {
        if (guard) {
          return this.backgroundRequestCount((byte) -100) >= 20 ? true : false;
        }
        String var3 = (String) null;
        Js5Client.a((ResourceArchive) null, (byte) -79, (String) null, (String) null);
        return this.backgroundRequestCount((byte) -100) >= 20 ? true : false;
    }

    final int backgroundRequestCount(byte guard) {
        if (guard < -82) {
          return this.backgroundQueued.size((byte) 2) + this.backgroundInFlight.size((byte) 2);
        }
        this.requestBuffer = (PacketBuffer) null;
        return this.backgroundQueued.size((byte) 2) + this.backgroundInFlight.size((byte) 2);
    }

    public static void releaseStatics(boolean param0) {
        achievementsText = null;
        if (param0) {
          Js5Client.requestServerData((byte) -88, 27);
          field_a = null;
          field_k = null;
          return;
        }
        field_a = null;
        field_k = null;
    }

    abstract void closeConnection(int guard);

    abstract boolean service(byte guard);

    Js5Client() {
        this.urgentQueued = new SecondaryNodeQueue();
        this.urgentInFlight = new SecondaryNodeQueue();
        this.backgroundQueued = new SecondaryNodeQueue();
        this.backgroundInFlight = new SecondaryNodeQueue();
        this.requestBuffer = new PacketBuffer(6);
        this.failureCount = 0;
        this.failureCode = 0;
        this.xorKey = (byte) 0;
        this.responseHeader = new PacketBuffer(10);
    }

    static {
        field_k = new long[32];
        achievementsText = "ACHIEVEMENTS";
    }
}
