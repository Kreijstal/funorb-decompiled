/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5ArchiveManager {
    private java.math.BigInteger rsaModulus;
    static SystemTask field_d;
    private CachedArchiveProvider[] providers;
    private PacketBuffer masterIndex;
    private Js5NetworkRequest masterRequest;
    private DiskCacheWorker diskWorker;
    private Js5Transport transport;
    private java.math.BigInteger rsaExponent;

    public static void releaseStatics(boolean guard) {
        if (!guard) {
          field_d = (SystemTask) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void serviceProviders(byte guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.providers == null) {
          return;
        }
        for (int var2 = 0; this.providers.length > var2; var2++) {
          if (null != this.providers[var2]) {
            this.providers[var2].servicePrefetchQueue(guard - 13);
          }
        }
        int var4 = 0;
        int var2Lifetime1 = var4;
        while (this.providers.length > var4) {
          if (this.providers[var4] != null) {
            this.providers[var4].serviceBackgroundRequests(-26);
          }
          var4++;
        }
        if (guard == 12) {
          return;
        }
        this.ensureMasterIndex(false);
        return;
    }

    final CachedArchiveProvider archiveProvider(boolean param0, int param1, SectorCacheStore param2, int param3, SectorCacheStore param4) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (this.masterIndex == null) {
            throw new RuntimeException();
          }
          if (0 <= param3 &&
            param3 < this.providers.length) {
            if (this.providers[param3] != null) {
              CachedArchiveProvider stackIn_8_0 = this.providers[param3];
              return stackIn_8_0;
            }
            this.masterIndex.position = 6 + param3 * 72;
            int var6_int = this.masterIndex.readInt(param1 ^ -4932);
            int var7 = this.masterIndex.readInt(-5053);
            byte[] var13 = new byte[64];
            this.masterIndex.readBytes(var13, (byte) -96, 0, 64);
            CachedArchiveProvider var9 = new CachedArchiveProvider(param3, param4, param2, this.transport, this.diskWorker, var6_int, var13, var7, param0);
            if (param1 != 255) {
              CachedArchiveProvider stackIn_11_0 = (CachedArchiveProvider) null;
              return stackIn_11_0;
            }
            this.providers[param3] = var9;
            CachedArchiveProvider stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var6;
          StringBuilder stackIn_16_1 = new StringBuilder().append("sk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    Js5ArchiveManager(Js5Transport param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean ensureMasterIndex(boolean guard) {
        byte[] var5;
        int var8 = EscapeVector.obfuscationControl;
        if (null != this.masterIndex) {
          return true;
        }
        if (null == this.masterRequest) {
          if (this.transport.isUrgentCapacityReached(20)) {
            return false;
          }
          this.masterRequest = this.transport.requestGroup(255, true, (byte) 0, 255, (byte) 0);
        }
        if (this.masterRequest.pending) {
          return false;
        }
        PacketBuffer var10 = new PacketBuffer(this.masterRequest.getBytes(true));
        var10.position = 5;
        int var3 = var10.readUnsignedByte(0);
        var10.position = var10.position + 72 * var3;
        byte[] var13 = new byte[var10.payload.length - var10.position];
        byte[] var11 = var13;
        byte[] var4 = var11;
        var10.readBytes(var4, (byte) -96, 0, var13.length);
        if (this.rsaExponent == null) {
          var5 = var4;
        } else {
          if (null == this.rsaModulus) {
            var5 = var4;
            if (65 != var5.length) {
              throw new RuntimeException();
            }
            if (guard) {
              return true;
            }
            byte[] var16 = RasterBuffer.whirlpoolDigest(var10.payload, 5, -5 + (-var13.length + var10.position), 0);
            for (int var7 = 0; var7 < 64; var7++) {
              if (var5[1 + var7] != var16[var7]) {
                throw new RuntimeException();
              }
            }
            this.providers = new CachedArchiveProvider[var3];
            this.masterIndex = var10;
            return true;
          }
          java.math.BigInteger var12 = new java.math.BigInteger(var13);
          java.math.BigInteger var7_ref_java_math_BigInteger = var12.modPow(this.rsaExponent, this.rsaModulus);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        if (guard) {
          return true;
        }
        byte[] var17 = RasterBuffer.whirlpoolDigest(var10.payload, 5, -5 + (-var13.length + var10.position), 0);
        for (int var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
          if (var5[1 + var7Lifetime1] != var17[var7Lifetime1]) {
            throw new RuntimeException();
          }
        }
        this.providers = new CachedArchiveProvider[var3];
        this.masterIndex = var10;
        return true;
    }

    private Js5ArchiveManager(Js5Transport param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          this.diskWorker = param1;
          this.transport = param0;
          this.rsaModulus = param3;
          this.rsaExponent = param2;
          if (this.transport.isUrgentCapacityReached(20)) {
            return;
          }
          this.masterRequest = this.transport.requestGroup(255, true, (byte) 0, 255, (byte) 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("sk.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
