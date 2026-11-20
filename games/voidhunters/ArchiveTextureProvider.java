/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveTextureProvider implements TextureProvider {
    static String field_g;
    static GameStateFactory field_d;
    private TextureMetadata[] metadata;
    private LruNodeCache field_f;
    private ResourceArchive spriteArchive;
    private ResourceArchive textureArchive;
    static boolean field_h;
    private int textureCount;
    static String field_a;

    public final float[] generateFloatRgba(float param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 121 / ((param4 - 31) / 41);
        return this.getProceduralTexture(-2, param2).generateFloatRgba(2, param3, (TextureProvider) (this), this.metadata[param2].field_e, this.spriteArchive, param1);
    }

    public final int getTextureCount(int param0) {
        if (param0 != 11316) {
          this.getTextureMetadata(51, 52);
        }
        return this.textureCount;
    }

    public final int[] generateArgbPixels(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        if (param0 <= 78) {
          this.spriteArchive = (ResourceArchive) null;
        }
        return this.getProceduralTexture(-2, param4).generateArgbPixels(param1, false, param2, this.metadata[param4].field_e, this.spriteArchive, (TextureProvider) (this), (double)param5);
    }

    public final TextureMetadata getTextureMetadata(int param0, int param1) {
        if (param0 != -20292) {
          this.textureArchive = (ResourceArchive) null;
        }
        return this.metadata[param1];
    }

    private final ProceduralTexture getProceduralTexture(int param0, int param1) {
        DualLinkNode var3 = this.field_f.get((long)param1, 77);
        if (param0 != -2) {
          this.isTextureReady(-32, (byte) 119);
        }
        if (var3 != null) {
          return (ProceduralTexture) (var3);
        }
        byte[] var4 = this.textureArchive.fetchSingleFile((byte) 9, param1);
        if (var4 == null) {
          return null;
        }
        ProceduralTexture var5 = new ProceduralTexture(new PacketBuffer(var4));
        this.field_f.put((long)param1, (byte) -22, var5);
        return var5;
    }

    public final boolean isTextureReady(int param0, byte param1) {
        ProceduralTexture var3;
        boolean stackIn_6_0 = false;
        var3 = this.getProceduralTexture(-2, param0);
        if (param1 > -30) {
          return false;
        }
        stackIn_6_0 = (var3 != null) && (var3.isReady(0, this.spriteArchive, (TextureProvider) (this)));
        return stackIn_6_0;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 25498) {
          ArchiveTextureProvider.clearSharedReferences(116);
        }
    }

    public final int[] generateRgbPixels(int param0, float param1, boolean param2, int param3, int param4, boolean param5) {
        if (!param2) {
          field_h = true;
        }
        return this.getProceduralTexture(-2, param3).generateRgbPixels(param5, (TextureProvider) (this), this.spriteArchive, 0, this.metadata[param3].field_e, param4, (double)param1, param0);
    }

    ArchiveTextureProvider(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2) {
        TextureMetadata stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        TextureMetadata stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        TextureMetadata stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        TextureMetadata stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        TextureMetadata stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        TextureMetadata stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        TextureMetadata stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        TextureMetadata stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        PacketBuffer var7 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var5Lifetime9;
        int var5Lifetime10;
        int var5Lifetime11;
        int var5Lifetime12;
        int var5Lifetime13;
        int var5Lifetime14;
        int var5Lifetime15;
        int var5Lifetime16;
        int var5Lifetime17;
        int var5Lifetime18;
        int var5Lifetime19;
        this.field_f = new LruNodeCache(256);
        try {
          this.spriteArchive = param2;
          this.textureArchive = param1;
          var7 = new PacketBuffer(param0.fetchFile(0, 0, (byte) 13));
          this.textureCount = var7.readUnsignedShort(1869);
          this.metadata = new TextureMetadata[this.textureCount];
          for (var5 = 0; var5 < this.textureCount; var5++) {
            if (var7.readUnsignedByte((byte) -99) == 1) {
              this.metadata[var5] = new TextureMetadata();
            }
          }
          for (var5Lifetime1 = 0; this.textureCount > var5Lifetime1; var5Lifetime1++) {
            if (null != this.metadata[var5Lifetime1]) {
              stackIn_11_0 = this.metadata[var5Lifetime1];
              stackIn_12_1 = (0 == var7.readUnsignedByte((byte) -119));
              stackIn_11_0.field_r = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; this.textureCount > var5Lifetime2; var5Lifetime2++) {
            if (null != this.metadata[var5Lifetime2]) {
              stackIn_19_0 = this.metadata[var5Lifetime2];
              stackIn_20_1 = (var7.readUnsignedByte((byte) -123) == 1);
              stackIn_19_0.field_h = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; this.textureCount > var5Lifetime3; var5Lifetime3++) {
            if (null != this.metadata[var5Lifetime3]) {
              stackIn_27_0 = this.metadata[var5Lifetime3];
              stackIn_28_1 = (1 == var7.readUnsignedByte((byte) -87));
              stackIn_27_0.field_m = stackIn_28_1;
            }
          }
          for (var5Lifetime4 = 0; var5Lifetime4 < this.textureCount; var5Lifetime4++) {
            if (this.metadata[var5Lifetime4] != null) {
              this.metadata[var5Lifetime4].field_g = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime5 = 0; var5Lifetime5 < this.textureCount; var5Lifetime5++) {
            if (this.metadata[var5Lifetime5] != null) {
              this.metadata[var5Lifetime5].field_b = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime6 = 0; var5Lifetime6 < this.textureCount; var5Lifetime6++) {
            if (this.metadata[var5Lifetime6] != null) {
              this.metadata[var5Lifetime6].field_c = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime7 = 0; this.textureCount > var5Lifetime7; var5Lifetime7++) {
            if (null != this.metadata[var5Lifetime7]) {
              this.metadata[var5Lifetime7].field_n = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime8 = 0; var5Lifetime8 < this.textureCount; var5Lifetime8++) {
            if (this.metadata[var5Lifetime8] != null) {
              this.metadata[var5Lifetime8].field_l = (short)var7.readUnsignedShort(1869);
            }
          }
          for (var5Lifetime9 = 0; this.textureCount > var5Lifetime9; var5Lifetime9++) {
            if (null != this.metadata[var5Lifetime9]) {
              this.metadata[var5Lifetime9].field_p = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime10 = 0; this.textureCount > var5Lifetime10; var5Lifetime10++) {
            if (null != this.metadata[var5Lifetime10]) {
              this.metadata[var5Lifetime10].field_d = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime11 = 0; var5Lifetime11 < this.textureCount; var5Lifetime11++) {
            if (null != this.metadata[var5Lifetime11]) {
              stackIn_70_0 = this.metadata[var5Lifetime11];
              stackIn_71_1 = (var7.readUnsignedByte((byte) -122) == 1);
              stackIn_70_0.field_a = stackIn_71_1;
            }
          }
          for (var5Lifetime12 = 0; var5Lifetime12 < this.textureCount; var5Lifetime12++) {
            if (null != this.metadata[var5Lifetime12]) {
              stackIn_78_0 = this.metadata[var5Lifetime12];
              stackIn_79_1 = (var7.readUnsignedByte((byte) -87) == 1);
              stackIn_78_0.field_e = stackIn_79_1;
            }
          }
          for (var5Lifetime13 = 0; this.textureCount > var5Lifetime13; var5Lifetime13++) {
            if (this.metadata[var5Lifetime13] != null) {
              this.metadata[var5Lifetime13].field_j = var7.readByte((byte) -114);
            }
          }
          for (var5Lifetime14 = 0; this.textureCount > var5Lifetime14; var5Lifetime14++) {
            if (this.metadata[var5Lifetime14] != null) {
              stackIn_91_0 = this.metadata[var5Lifetime14];
              stackIn_92_1 = (var7.readUnsignedByte((byte) -95) == 1);
              stackIn_91_0.field_k = stackIn_92_1;
            }
          }
          for (var5Lifetime15 = 0; this.textureCount > var5Lifetime15; var5Lifetime15++) {
            if (this.metadata[var5Lifetime15] != null) {
              stackIn_99_0 = this.metadata[var5Lifetime15];
              stackIn_100_1 = (var7.readUnsignedByte((byte) -121) == 1);
              stackIn_99_0.field_s = stackIn_100_1;
            }
          }
          for (var5Lifetime16 = 0; var5Lifetime16 < this.textureCount; var5Lifetime16++) {
            if (null != this.metadata[var5Lifetime16]) {
              stackIn_107_0 = this.metadata[var5Lifetime16];
              stackIn_108_1 = (1 == var7.readUnsignedByte((byte) -115));
              stackIn_107_0.field_i = stackIn_108_1;
            }
          }
          for (var5Lifetime17 = 0; var5Lifetime17 < this.textureCount; var5Lifetime17++) {
            if (null != this.metadata[var5Lifetime17]) {
              this.metadata[var5Lifetime17].field_f = var7.readUnsignedByte((byte) -101);
            }
          }
          for (var5Lifetime18 = 0; var5Lifetime18 < this.textureCount; var5Lifetime18++) {
            if (null != this.metadata[var5Lifetime18]) {
              this.metadata[var5Lifetime18].field_o = var7.readInt(36);
            }
          }
          for (var5Lifetime19 = 0; var5Lifetime19 < this.textureCount; var5Lifetime19++) {
            if (null != this.metadata[var5Lifetime19]) {
              this.metadata[var5Lifetime19].field_q = var7.readUnsignedByte((byte) -98);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_128_0 = var4;
          stackIn_128_1 = new StringBuilder().append("ii.<init>(");
          if (param0 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          stackIn_131_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',');
          if (param1 == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          stackIn_134_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(',');
          if (param2 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(')').toString());
        }
    }

    static {
        field_g = "Next event";
        field_d = (GameStateFactory) ((Object) new ShipComponentFactory());
        field_a = "Assault";
    }
}
