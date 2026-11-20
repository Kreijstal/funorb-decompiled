/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndexLoader {
    private ArchiveDiskWorker field_i;
    static llb field_a;
    static ServerInfo field_g;
    private java.math.BigInteger signatureModulus;
    static int field_h;
    private CachedArchiveProvider[] archiveProviders;
    private java.math.BigInteger signatureExponent;
    private NetworkArchiveClient field_j;
    private NetworkArchiveRequest field_d;
    private PacketBuffer masterIndex;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 5) {
          int[] var2 = (int[]) null;
          ArchiveIndexLoader.moveValueToEnd(69, -75, (int[]) null);
        }
        field_g = null;
    }

    final boolean loadMasterIndex(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        PacketBuffer var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = VoidHunters.field_G;
        if (null != this.masterIndex) {
          return true;
        }
        if (null == this.field_d) {
          if (this.field_j.isPriorityQueueFull(74)) {
            return false;
          }
          this.field_d = this.field_j.requestGroup(true, -21, 255, (byte) 0, 255);
        }
        if (this.field_d.pending) {
          return false;
        }
        var10 = new PacketBuffer(this.field_d.getData(-94));
        var10.position = 5;
        var3 = var10.readUnsignedByte((byte) -108);
        var10.position = var10.position + 72 * var3;
        var13 = new byte[var10.payload.length - var10.position];
        var11 = var13;
        var4 = var11;
        var10.readBytes(0, var4, (byte) -59, var13.length);
        if (null != this.signatureExponent &&
          null != this.signatureModulus) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.signatureExponent, this.signatureModulus);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = SetMissileLauncherProjectiles.computeArchiveDigest((byte) 25, -var13.length + (var10.position - 5), var10.payload, 5);
        if (!param0) {
          return true;
        }
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.masterIndex = var10;
        this.archiveProviders = new CachedArchiveProvider[var3];
        return true;
    }

    final void processArchiveRequests(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = VoidHunters.field_G;
        if (this.archiveProviders == null) {
          return;
        }
        for (var2 = param0; this.archiveProviders.length > var2; var2++) {
          if (null != this.archiveProviders[var2]) {
            this.archiveProviders[var2].processQueuedPrefetches(param0 + 0);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.archiveProviders.length) {
          if (this.archiveProviders[var4] != null) {
            this.archiveProviders[var4].processBackgroundRequests(-83);
          }
          var4++;
        }
        return;
    }

    final CachedArchiveProvider getArchiveProvider(int param0, int param1, ArchiveDisk param2, ArchiveDisk param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        CachedArchiveProvider var9 = null;
        byte[] var13 = null;
        CachedArchiveProvider stackIn_8_0 = null;
        CachedArchiveProvider stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.masterIndex == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            this.archiveProviders.length > param0) {
            if (null != this.archiveProviders[param0]) {
              stackIn_8_0 = this.archiveProviders[param0];
              return stackIn_8_0;
            }
            this.masterIndex.position = 6 + 72 * param0;
            var6_int = this.masterIndex.readInt(param1 ^ 20);
            var7 = this.masterIndex.readInt(47);
            var13 = new byte[64];
            this.masterIndex.readBytes(0, var13, (byte) -59, 64);
            var9 = new CachedArchiveProvider(param0, param3, param2, this.field_j, this.field_i, var6_int, var13, var7, param4);
            if (param1 != 5) {
              this.loadMasterIndex(false);
            }
            this.archiveProviders[param0] = var9;
            stackIn_12_0 = var9;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("fwa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean moveValueToEnd(int param0, int param1, int[] param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          if (param2 == null) {
            return false;
          }
          if (param2.length == 0) {
            return false;
          }
          var3_int = -1;
          for (var4 = 0; param2.length > var4; var4++) {
            if (param0 != param2[var4]) {
              continue;
            }
            var3_int = var4;
            break;
          }
          if (-1 == var3_int) {
            return false;
          }
          var6 = var3_int + param1;
          var4Lifetime1 = var6;
          while (param2.length > var6) {
            param2[-1 + var6] = param2[var6];
            var6++;
          }
          param2[param2.length - 1] = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("fwa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    ArchiveIndexLoader(NetworkArchiveClient param0, ArchiveDiskWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ArchiveIndexLoader(NetworkArchiveClient param0, ArchiveDiskWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.signatureModulus = param3;
          this.signatureExponent = param2;
          this.field_i = param1;
          this.field_j = param0;
          if (!this.field_j.isPriorityQueueFull(52)) {
            this.field_d = this.field_j.requestGroup(true, -21, 255, (byte) 0, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fwa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 6;
    }
}
