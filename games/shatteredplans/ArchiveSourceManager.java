/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveSourceManager {
    private CachedArchiveSource[] field_a;
    private PacketBuffer field_i;
    private ArchiveNetworkClient field_e;
    static ValidationState field_b;
    private DiskCacheWorker field_d;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_j;
    static AnimatedPanel field_f;
    private NetworkArchiveRequest field_c;
    static int field_h;

    public static void clearStatics(byte param0) {
        field_f = null;
        int var1 = -35 / ((param0 - 66) / 45);
        field_b = null;
    }

    final CachedArchiveSource a(boolean param0, int param1, SectorCacheStore param2, SectorCacheStore param3, boolean param4) {
        CachedArchiveSource stackIn_9_0 = null;
        CachedArchiveSource stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        CachedArchiveSource var9 = null;
        byte[] var13 = null;
        try {
          if (this.field_i == null) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            this.field_a.length > param1) {
            if (null != this.field_a[param1]) {
              stackIn_9_0 = this.field_a[param1];
              return stackIn_9_0;
            }
            this.field_i.position = 72 * param1 + 6;
            var6_int = this.field_i.readInt(16711680);
            if (param0) {
              this.field_j = (java.math.BigInteger) null;
            }
            var7 = this.field_i.readInt(16711680);
            var13 = new byte[64];
            this.field_i.readBytes(64, 0, 17469032, var13);
            var9 = new CachedArchiveSource(param1, param3, param2, this.field_e, this.field_d, var6_int, var13, var7, param4);
            this.field_a[param1] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static Sprite[] a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5) {
        Sprite var13 = null;
        Sprite var14 = null;
        int[] var16 = SoftwareRasterizer.field_h;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRasterizer.field_b;
        int var8 = SoftwareRasterizer.field_k;
        Sprite var9 = new Sprite(16, param3);
        var9.bindAsRenderTarget();
        SoftwareRasterizer.fillRectGradient(0, 0, 16, param3, param4, param1);
        Object var10 = null;
        if (param0) {
          var13 = var9.copy();
          var10 = var13;
          var13.bindAsRenderTarget();
          SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
        }
        if (param5 >= -22) {
          field_b = (ValidationState) null;
        }
        Object var11 = null;
        if (param2) {
          var14 = var9.copy();
          var11 = var14;
          var14.bindAsRenderTarget();
          SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
        }
        SoftwareRasterizer.setTarget(var16, var7, var8);
        return new Sprite[]{null, null, null, (Sprite) (var10), var9, (Sprite) (var11), null, null, null};
    }

    final static int getTargetFrameRate(int param0) {
        if (param0 != 0) {
          field_f = (AnimatedPanel) null;
        }
        return (int)(1000000000L / UiWidget.field_i);
    }

    ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, long param2) {
        CipherPacketBuffer var4 = js.field_f;
        var4.h(param1, 255);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        int var6 = 1 % ((30 - param0) / 59);
        var4.writeByte(6, (byte) -72);
        var4.writeLong(-16426, param2);
        var4.patchLengthByte(-var5 + var4.position, (byte) 118);
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_a) {
          return;
        }
        var3 = -3 % ((-53 - param0) / 38);
        for (var2 = 0; this.field_a.length > var2; var2++) {
          if (this.field_a[var2] != null) {
            this.field_a[var2].a((byte) 65);
          }
        }
        for (var2Lifetime1 = 0; this.field_a.length > var2Lifetime1; var2Lifetime1++) {
          if (null != this.field_a[var2Lifetime1]) {
            this.field_a[var2Lifetime1].b(false);
          }
        }
    }

    final boolean b(int param0) {
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_i) {
          return true;
        }
        if (null == this.field_c) {
          if (this.field_e.c(27356)) {
            return false;
          }
          this.field_c = this.field_e.a(true, 255, (byte) 0, -2057056416, 255);
        }
        if (this.field_c.field_u) {
          return false;
        }
        var10 = new PacketBuffer(this.field_c.e((byte) 91));
        var10.position = 5;
        var3 = var10.readUnsignedByte(-120);
        var10.position = var10.position + 72 * var3;
        var13 = new byte[-var10.position + var10.payload.length];
        var11 = var13;
        var4 = var11;
        var10.readBytes(var13.length, 0, 17469032, var13);
        if (null != this.field_g &&
          null != this.field_j) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = QuickChatCategoryDefinition.a(var10.payload, -5 - var13.length + var10.position, -26131, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (~var5[var7 + 1] != ~var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_a = new CachedArchiveSource[var3];
        this.field_i = var10;
        if (param0 >= 86) {
          return true;
        }
        field_h = -8;
        return true;
    }

    private ArchiveSourceManager(ArchiveNetworkClient param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_d = param1;
          this.field_j = param3;
          this.field_e = param0;
          this.field_g = param2;
          if (!this.field_e.c(27356)) {
            this.field_c = this.field_e.a(true, 255, (byte) 0, -2057056416, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new ValidationState();
    }
}
