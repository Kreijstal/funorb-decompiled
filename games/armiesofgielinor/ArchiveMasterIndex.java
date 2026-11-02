/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveMasterIndex {
    private DiskCacheWorker diskCacheWorker;
    private java.math.BigInteger rsaExponent;
    static String field_g;
    static RgbSprite activeTerrainSample;
    private CachedArchiveProvider[] providers;
    private ResourceProtocolClient protocolClient;
    private NetworkResourceRequest masterIndexRequest;
    private PacketBuffer masterIndex;
    private java.math.BigInteger rsaModulus;
    static boolean field_a;
    static int field_e;

    final CachedArchiveProvider openProvider(boolean flag, SectorCacheStore dataStore, int archiveId, int obfuscationGuard, SectorCacheStore indexStore) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        CachedArchiveProvider var9 = null;
        byte[] var13 = null;
        CachedArchiveProvider stackIn_8_0 = null;
        CachedArchiveProvider stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.masterIndex) {
            throw new RuntimeException();
          }
          if (archiveId >= 0 &&
            this.providers.length > archiveId) {
            if (this.providers[archiveId] != null) {
              stackIn_8_0 = this.providers[archiveId];
              return stackIn_8_0;
            }
            this.masterIndex.position = 72 * archiveId + 6;
            var6_int = this.masterIndex.readInt(1);
            var7 = this.masterIndex.readInt(1);
            var13 = new byte[64];
            this.masterIndex.readBytes(obfuscationGuard, 64, 0, var13);
            var9 = new CachedArchiveProvider(archiveId, dataStore, indexStore, this.protocolClient, this.diskCacheWorker, var6_int, var13, var7, flag);
            this.providers[archiveId] = var9;
            stackIn_10_0 = var9;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("dd.F(").append(flag).append(',');
          if (dataStore == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(archiveId).append(',').append(obfuscationGuard).append(',');
          if (indexStore == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String formatCompactAmount(int amount, int obfuscationGuard) {
        if (obfuscationGuard != 82) {
          return (String) null;
        }
        if (amount < 10000) {
          return Integer.toString(amount);
        }
        if (amount < 1000000) {
          return Integer.toString(amount / 1000) + "K";
        }
        if (amount < 1000000000) {
          return Integer.toString(amount / 1000000) + "M";
        }
        return "A Billion";
    }

    final static int getLoadingProgressPercent(boolean obfuscationGuard) {
        if (StrongCacheEntry.field_E < 2) {
          return 0;
        }
        if (obfuscationGuard) {
          field_a = false;
        }
        if (0 == ConsoleExpression.field_m) {
          if (!DisplayModeOptionPainter.field_u.ensureIndex((byte) 82)) {
            return 20;
          }
          if (!DisplayModeOptionPainter.field_u.ensureGroupAvailableByName(28979, "commonui")) {
            return 40;
          }
          if (!CombatPresentation.field_M.ensureIndex((byte) 82)) {
            return 50;
          }
          if (!CombatPresentation.field_M.ensureGroupAvailableByName(28979, "commonui")) {
            return 60;
          }
          if (!LoginKind.field_g.ensureIndex((byte) 82)) {
            return 70;
          }
          if (!LoginKind.field_g.ensureAllGroupsAvailable(-27927)) {
            return 80;
          }
        } else {
          if (IconTextComponent.field_Nb != null) {
            if (!IconTextComponent.field_Nb.ensureIndex((byte) 82)) {
              return 14;
            }
            if (!IconTextComponent.field_Nb.containsGroupName((byte) -128, "")) {
              return 29;
            }
            if (!IconTextComponent.field_Nb.ensureGroupAvailableByName(28979, "")) {
              return 29;
            }
          }
          if (!DisplayModeOptionPainter.field_u.ensureIndex((byte) 82)) {
            return 43;
          }
          if (!DisplayModeOptionPainter.field_u.ensureGroupAvailableByName(28979, "commonui")) {
            return 57;
          }
          if (!CombatPresentation.field_M.ensureIndex((byte) 82)) {
            return 71;
          }
          if (!CombatPresentation.field_M.ensureGroupAvailableByName(28979, "commonui")) {
            return 80;
          }
          if (!LoginKind.field_g.ensureIndex((byte) 82)) {
            return 82;
          }
          if (!LoginKind.field_g.ensureAllGroupsAvailable(-27927)) {
            return 86;
          }
        }
        return 100;
    }

    final void serviceProviders(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.providers == null) {
          return;
        }
        for (var2 = 0; this.providers.length > var2; var2++) {
          if (null != this.providers[var2]) {
            this.providers[var2].d(-71);
          }
        }
        if (obfuscationGuard != 18199) {
          ArchiveMasterIndex.releaseStatics(30);
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.providers.length) {
          if (this.providers[var4] != null) {
            this.providers[var4].b(-26132);
          }
          var4++;
        }
        return;
    }

    ArchiveMasterIndex(ResourceProtocolClient param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void releaseStatics(int obfuscationGuard) {
        if (obfuscationGuard > -9) {
          return;
        }
        activeTerrainSample = null;
        field_g = null;
    }

    final boolean pollMasterIndex(byte obfuscationGuard) {
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
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.masterIndex) {
          return true;
        }
        if (null == this.masterIndexRequest) {
          if (this.protocolClient.isPriorityFull(obfuscationGuard + 86)) {
            return false;
          }
          this.masterIndexRequest = this.protocolClient.request(255, false, 255, (byte) 0, true);
        }
        if (this.masterIndexRequest.pending) {
          return false;
        }
        var10 = new PacketBuffer(this.masterIndexRequest.getBytes((byte) 43));
        if (obfuscationGuard != 14) {
          return true;
        }
        var10.position = 5;
        var3 = var10.readUnsignedByte(0);
        var10.position = var10.position + var3 * 72;
        var13 = new byte[var10.payload.length - var10.position];
        var11 = var13;
        var4 = var11;
        var10.readBytes(0, var13.length, 0, var13);
        if (null != this.rsaExponent &&
          null != this.rsaModulus) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.rsaExponent, this.rsaModulus);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = SpellCastAction.a(-18423, -5 + (var10.position - var13.length), var10.payload, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[1 + var7] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.providers = new CachedArchiveProvider[var3];
        this.masterIndex = var10;
        return true;
    }

    private ArchiveMasterIndex(ResourceProtocolClient param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.protocolClient = param0;
          this.diskCacheWorker = param1;
          this.rsaExponent = param2;
          this.rsaModulus = param3;
          if (!this.protocolClient.isPriorityFull(119)) {
            this.masterIndexRequest = this.protocolClient.request(255, false, 255, (byte) 0, true);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Equipment";
        field_e = 0;
    }
}
