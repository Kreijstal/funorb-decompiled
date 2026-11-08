/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5ArchiveManager {
    private DiskCacheWorker diskWorker;
    static String[] mustlogin3;
    private java.math.BigInteger rsaExponent;
    private Js5Transport transport;
    static int field_k;
    private java.math.BigInteger rsaModulus;
    private PacketBuffer masterIndex;
    static int field_g;
    private NetworkArchiveRequest masterRequest;
    static String quit;
    private CachedArchiveSource[] providers;
    static ScrollPane field_b;

    final static boolean a(int param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    final CachedArchiveSource archiveProvider(boolean param0, SectorCacheStore param1, int param2, byte param3, SectorCacheStore param4) {
        CachedArchiveSource stackIn_10_0 = null;
        CachedArchiveSource stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        CachedArchiveSource var9 = null;
        byte[] var13 = null;
        try {
          if (this.masterIndex == null) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            this.providers.length > param2) {
            if (this.providers[param2] != null) {
              stackIn_10_0 = this.providers[param2];
              return stackIn_10_0;
            }
            this.masterIndex.position = 6 + param2 * 72;
            var6_int = this.masterIndex.readInt(true);
            var7 = this.masterIndex.readInt(true);
            var13 = new byte[64];
            this.masterIndex.readBytes(0, (byte) -115, var13, 64);
            var9 = new CachedArchiveSource(param2, param1, param4, this.transport, this.diskWorker, var6_int, var13, var7, param0);
            this.providers[param2] = var9;
            if (param3 != 0) {
              this.diskWorker = (DiskCacheWorker) null;
            }
            stackIn_14_0 = var9;
            return stackIn_14_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("qd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void serviceProviders(byte param0) {
        int var2;
        int var3;
        CachedArchiveSource stackIn_18_0 = null;
        int var2Lifetime1;
        var3 = Pool.field_O;
        if (this.providers == null) {
          return;
        }
        for (var2 = 0; this.providers.length > var2; var2++) {
          if (this.providers[var2] != null) {
            this.providers[var2].processRequestedGroups(param0 ^ -67);
          }
        }
        if (param0 != -46) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.providers.length; var2Lifetime1++) {
          if (null != this.providers[var2Lifetime1]) {
            stackIn_18_0 = this.providers[var2Lifetime1];
            ((CachedArchiveSource) (Object) stackIn_18_0).advanceBackgroundLoading((byte) 7);
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        mustlogin3 = null;
        int var1 = 127 % ((param0 - 15) / 58);
        quit = null;
    }

    Js5ArchiveManager(Js5Transport param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean ensureMasterIndex(boolean param0) {
        int var7 = 0;
        PacketBuffer stackIn_13_0 = null;
        PacketBuffer stackIn_13_1 = null;
        NetworkArchiveRequest stackIn_13_2 = null;
        PacketBuffer stackIn_14_0 = null;
        PacketBuffer stackIn_14_1 = null;
        boolean stackIn_14_3 = false;
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
        var8 = Pool.field_O;
        if (!param0) {
          Js5ArchiveManager.a((byte) 17, -69);
        }
        if (null != this.masterIndex) {
          return true;
        }
        if (null == this.masterRequest) {
          if (this.transport.isUrgentCapacityReached((byte) -125)) {
            return false;
          }
          this.masterRequest = this.transport.requestGroup(255, 255, (byte) 0, true, -154018400);
        }
        if (this.masterRequest.pending) {
          return false;
        }
        stackIn_13_0 = null;
        stackIn_13_1 = null;
        stackIn_13_2 = this.masterRequest;
        if (param0) {
          stackIn_14_0 = null;
          stackIn_14_1 = null;
          stackIn_14_3 = false;
        } else {
          stackIn_14_0 = null;
          stackIn_14_1 = null;
          stackIn_14_3 = true;
        }
        var10 = new PacketBuffer(((NetworkArchiveRequest) (Object) stackIn_13_2).getBytes(stackIn_14_3));
        var10.position = 5;
        var3 = var10.readUnsignedByte(-62);
        var10.position = var10.position + var3 * 72;
        var13 = new byte[-var10.position + var10.payload.length];
        var11 = var13;
        var4 = var11;
        var10.readBytes(0, (byte) -125, var4, var13.length);
        if (this.rsaExponent != null &&
          null != this.rsaModulus) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.rsaExponent, this.rsaModulus);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = TikiBallSkin.whirlpoolDigest(var10.position + (-var13.length - 5), (byte) -121, var10.payload, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.providers = new CachedArchiveSource[var3];
        this.masterIndex = var10;
        return true;
    }

    final static void a(byte param0, int param1) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        var2.writeCipheredOpcode(false, param1);
        int var3 = -32 / ((param0 - 16) / 57);
        var2.position = var2.position + 1;
        int var4 = var2.position;
        var2.writeByte(2, false);
        var2.writeBytes(RenderingInitializationSupport.field_c, (byte) 0, 0, RenderingInitializationSupport.field_c.length);
        var2.writeByte(SceneNodeEntry.field_l, false);
        var2.writeByte(FreePlayRules.field_l, false);
        var2.writeBytes(AgeValidator.field_s, (byte) 0, 0, AgeValidator.field_s.length);
        var2.writeByteLengthPrefix(var2.position - var4, true);
    }

    private Js5ArchiveManager(Js5Transport param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.rsaExponent = param2;
          this.diskWorker = param1;
          this.transport = param0;
          this.rsaModulus = param3;
          if (!this.transport.isUrgentCapacityReached((byte) -125)) {
            this.masterRequest = this.transport.requestGroup(255, 255, (byte) 0, true, -154018400);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        quit = "Quit";
        field_g = 0;
        field_k = -1;
        mustlogin3 = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
