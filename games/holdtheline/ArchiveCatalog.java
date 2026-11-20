/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveCatalog {
    private java.math.BigInteger field_e;
    private DiskCacheWorker field_m;
    static int field_n;
    static int field_b;
    static boolean field_o;
    static boolean field_h;
    static int field_d;
    private PacketBuffer field_a;
    private CachedArchiveProvider[] field_i;
    private java.math.BigInteger field_f;
    private Js5Transport field_g;
    static RotatedSpriteAsset field_l;
    static SpriteAsset field_k;
    private NetworkArchiveRequest field_c;
    static int field_j;

    final CachedArchiveProvider getArchiveProvider(int param0, boolean param1, int param2, DiskCacheStore param3, DiskCacheStore param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        CachedArchiveProvider var9 = null;
        byte[] var13 = null;
        CachedArchiveProvider stackIn_9_0 = null;
        CachedArchiveProvider stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            this.field_i.length > param0) {
            if (this.field_i[param0] != null) {
              stackIn_9_0 = this.field_i[param0];
              return stackIn_9_0;
            }
            this.field_a.position = param0 * 72 + 6;
            var6_int = this.field_a.readInt(-101);
            if (param2 < 102) {
              field_l = (RotatedSpriteAsset) null;
            }
            var7 = this.field_a.readInt(-73);
            var13 = new byte[64];
            this.field_a.readBytes(64, 0, (byte) 68, var13);
            var9 = new CachedArchiveProvider(param0, param4, param3, this.field_g, this.field_m, var6_int, var13, var7, param1);
            this.field_i[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ci.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void processArchiveProviders(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = HoldTheLine.field_D;
        if (!param0) {
          return;
        }
        if (null == this.field_i) {
          return;
        }
        for (var2 = 0; this.field_i.length > var2; var2++) {
          if (null != this.field_i[var2]) {
            this.field_i[var2].processQueuedPrefetch(2);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_i.length) {
          if (this.field_i[var4] != null) {
            this.field_i[var4].processBackgroundRequests(2);
          }
          var4++;
        }
        return;
    }

    public static void clearSharedReferences(byte param0) {
        field_l = null;
        if (param0 != 100) {
          return;
        }
        field_k = null;
    }

    final static TrackObjectDefinition a(int param0, byte param1) {
        if (param1 != 17) {
          field_k = (SpriteAsset) null;
        }
        return mc.field_a[param0];
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 49) {
          ArchiveCatalog.b((byte) 95);
        }
        if (MusicPatchEnvelope.field_i != param2) {
          return;
        }
        if (param3 < -1) {
          throw new RuntimeException();
        }
        if (LoadProgressDialog.field_ab != param3 ||
          SoundCache.field_b != param0) {
          DialogLayer.field_I = -1;
        }
        SoundCache.field_b = param0;
        LoadProgressDialog.field_ab = param3;
    }

    final static void b(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        IsaacPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ih var11 = null;
        IsaacPacketBuffer var12 = null;
        ma var13 = null;
        int[] var14 = null;
        ma var15 = null;
        int[] var16 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 > -121) {
            field_n = -46;
          }
          var12 = RoadStripRenderer.field_e;
          var2 = var12.readUnsignedByte((byte) -84);
          if (0 == var2) {
            var10 = vd.c(1023);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte((byte) -31);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(-67);
            }
            var15 = (ma) (RaceWorld.field_v.first((byte) 106));
            if (var15 == null) {
              r.a(-28036);
              return;
            }
            var15.field_j = var3;
            var15.field_i = true;
            var15.field_m = var16[0];
            var15.unlink(0);
            return;
          }
          if (var2 == 1) {
            var11 = (ih) (AccountFormText.field_c.first((byte) 116));
            if (var11 == null) {
              r.a(-28036);
              return;
            }
            var11.unlink(0);
          } else {
            if (var2 == 2) {
              var13 = (ma) (RaceWorld.field_v.first((byte) 112));
              if (var13 == null) {
                r.a(-28036);
                return;
              }
              var13.field_j = vd.c(1023);
              var13.field_m = var13.field_j[0];
              var13.field_i = true;
              var13.unlink(0);
            } else {
              MusicPatchPcmStream.a((Throwable) null, (byte) -52, "A1: " + AgeValidator.b(false));
              r.a(-28036);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "ci.D(" + param0 + ')');
        }
    }

    final boolean loadMasterIndex(int param0) {
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
        var8 = HoldTheLine.field_D;
        if (this.field_a != null) {
          return true;
        }
        if (null == this.field_c) {
          if (this.field_g.c(115)) {
            return false;
          }
          this.field_c = this.field_g.a(255, true, (byte) 0, (byte) -60, 255);
        }
        if (this.field_c.field_u) {
          return false;
        }
        var10 = new PacketBuffer(this.field_c.getData(-20324));
        var10.position = 5;
        var3 = var10.readUnsignedByte((byte) -40);
        var10.position = var10.position + var3 * 72;
        if (param0 > -31) {
          ArchiveCatalog.clearSharedReferences((byte) -98);
        }
        var13 = new byte[-var10.position + var10.payload.length];
        var11 = var13;
        var4 = var11;
        var10.readBytes(var13.length, 0, (byte) 71, var13);
        if (null != this.field_e &&
          null != this.field_f) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_f);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = TrackCurve.a(var10.payload, -6408, 5, -5 + (var10.position - var13.length));
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[var7 + 1] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_a = var10;
        this.field_i = new CachedArchiveProvider[var3];
        return true;
    }

    private ArchiveCatalog(Js5Transport param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param1;
          this.field_f = param3;
          this.field_g = param0;
          this.field_e = param2;
          if (!this.field_g.c(78)) {
            this.field_c = this.field_g.a(255, true, (byte) 0, (byte) -60, 255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ci.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ArchiveCatalog(Js5Transport param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        field_d = 5;
        field_h = true;
    }
}
