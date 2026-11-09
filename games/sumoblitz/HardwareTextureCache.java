/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareTextureCache {
    static CompactMeshGeometry[] introMeshes;
    static ToolkitSprite[] field_e;
    static HiscoreRequest field_f;
    private TextureProvider provider;
    private SoftLruCache textures;
    private HardwareGraphicsToolkit toolkit;

    public static void releaseStatics(byte param0) {
        introMeshes = null;
        field_f = null;
        field_e = null;
        if (param0 >= -101) {
          field_f = (HiscoreRequest) null;
        }
    }

    final void ageTextures(int guard) {
        if (guard > 80) {
          this.textures.age(5, 22663);
          return;
        }
        HardwareTextureCache.bitLength(47, (byte) -69);
        this.textures.age(5, 22663);
    }

    final Texture2D getTexture(int guard, int textureId) {
        Object var3;
        Texture2D var4;
        TextureMetadata var5;
        int var6;
        int[] var7;
        int var8;
        TextureMetadata var12;
        float[] var39;
        int stackIn_9_0 = 0;
        HardwareGraphicsToolkit stackIn_13_0;
        int stackIn_13_1;
        TextureFormat stackIn_13_2;
        int stackIn_13_3;
        boolean stackIn_14_4 = false;
        HardwareGraphicsToolkit stackIn_23_0 = null;
        int[] stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        boolean stackIn_24_3 = false;
        HardwareGraphicsToolkit stackIn_29_0 = null;
        int[] stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        boolean stackIn_30_3 = false;
        HardwareGraphicsToolkit stackIn_34_0 = null;
        int[] stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        boolean stackIn_35_3;
        HardwareGraphicsToolkit stackIn_40_0 = null;
        int[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        boolean stackIn_41_3 = false;
        int stackIn_48_0 = 0;
        HardwareGraphicsToolkit stackIn_52_0;
        int stackIn_52_1;
        TextureFormat stackIn_52_2;
        int stackIn_52_3;
        boolean stackIn_53_4 = false;
        HardwareGraphicsToolkit stackIn_57_0 = null;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        boolean stackIn_58_3 = false;
        HardwareGraphicsToolkit stackIn_62_0 = null;
        int[] stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        boolean stackIn_63_3 = false;
        HardwareGraphicsToolkit stackIn_66_0 = null;
        int[] stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        boolean stackIn_67_3 = false;
        HardwareGraphicsToolkit stackIn_72_0 = null;
        int[] stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        boolean stackIn_73_3 = false;
        HardwareGraphicsToolkit stackIn_77_0 = null;
        int[] stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        boolean stackIn_78_3;
        HardwareGraphicsToolkit stackIn_83_0 = null;
        int[] stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        boolean stackIn_84_3 = false;
        Texture2D var13;
        Texture2D var18;
        Texture2D var23;
        TextureMetadata var29;
        Texture2D var30;
        Texture2D var31;
        Texture2D var32;
        Texture2D var33;
        Texture2D var34;
        float[] var40;
        int var6Lifetime1;
        Texture2D var4Lifetime1;
        Texture2D var4Lifetime2;
        int[] var7Lifetime1;
        int[] var7Lifetime2;
        int[] var7Lifetime3;
        int[] var7Lifetime4;
        Texture2D var4Lifetime3;
        int[] var7Lifetime5;
        int[] var7Lifetime6;
        int[] var7Lifetime7;
        int[] var7Lifetime1Lifetime1;
        int[] var7Lifetime1Lifetime2;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = this.textures.get((long)textureId, 112);
        if (var3 != null) {
          return (Texture2D) (var3);
        }
        if (guard <= 81) {
          HardwareTextureCache.releaseStatics((byte) -13);
          if (!this.provider.b(-29912, textureId)) {
            return null;
          }
          var12 = this.provider.a(-29193, textureId);
          var5 = var12;
          if (!var12.field_n) {
            stackIn_9_0 = this.toolkit.field_tc;
          } else {
            stackIn_9_0 = 64;
          }
          var6 = stackIn_9_0;
          if (var12.field_s) {
            if (this.toolkit.a()) {
              var39 = this.provider.a(var6, false, 0.699999988079071f, textureId, var6, -70);
              stackIn_13_0 = this.toolkit;
              stackIn_13_1 = var6;
              stackIn_13_2 = BeveledTextInputRenderer.RGBA;
              stackIn_13_3 = 110;
              stackIn_14_4 = (var12.field_k == 0) ? false : true;
              var4 = ((HardwareGraphicsToolkit) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, (byte) stackIn_13_3, stackIn_14_4, var6, var39);
              var4.setWrap(var12.field_i, var12.field_l, true);
              this.textures.put((long)textureId, var4, (byte) 19);
              return var4;
            }
            if (2 == var12.field_p) {
              var7 = this.provider.a(-25069, var6, var6, false, 0.699999988079071f, textureId);
            } else {
              if (PlayingSound.a(108, (int) var12.field_d)) {
                var7 = this.provider.a(true, var6, (byte) -81, var6, 0.699999988079071f, textureId);
              } else {
                var7 = this.provider.a(-25069, var6, var6, false, 0.699999988079071f, textureId);
              }
            }
            stackIn_23_0 = this.toolkit;
            stackIn_23_1 = var7;
            stackIn_23_2 = var6;
            stackIn_24_3 = (var12.field_k == 0) ? false : true;
            var13 = ((HardwareGraphicsToolkit) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, stackIn_24_3, -97, var6);
            var13.setWrap(var12.field_i, var12.field_l, true);
            this.textures.put((long)textureId, var13, (byte) 19);
            return var13;
          }
          if (2 == var12.field_p) {
            var7Lifetime5 = this.provider.a(-25069, var6, var6, false, 0.699999988079071f, textureId);
            stackIn_29_0 = this.toolkit;
            stackIn_29_1 = var7Lifetime5;
            stackIn_29_2 = var6;
            stackIn_30_3 = (var12.field_k == 0) ? false : true;
            var18 = ((HardwareGraphicsToolkit) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_30_3, -97, var6);
            var18.setWrap(var12.field_i, var12.field_l, true);
            this.textures.put((long)textureId, var18, (byte) 19);
            return var18;
          }
          if (!PlayingSound.a(108, (int) var12.field_d)) {
            var7Lifetime6 = this.provider.a(-25069, var6, var6, false, 0.699999988079071f, textureId);
            stackIn_40_0 = this.toolkit;
            stackIn_40_1 = var7Lifetime6;
            stackIn_40_2 = var6;
            stackIn_41_3 = (var12.field_k == 0) ? false : true;
            var23 = ((HardwareGraphicsToolkit) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_41_3, -97, var6);
            var23.setWrap(var12.field_i, var12.field_l, true);
            this.textures.put((long)textureId, var23, (byte) 19);
            return var23;
          }
          var7Lifetime7 = this.provider.a(true, var6, (byte) -81, var6, 0.699999988079071f, textureId);
          stackIn_34_0 = this.toolkit;
          stackIn_34_1 = var7Lifetime7;
          stackIn_34_2 = var6;
          stackIn_35_3 = (var12.field_k == 0) ? false : true;
          var4Lifetime3 = ((HardwareGraphicsToolkit) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_35_3, -97, var6);
          var4Lifetime3.setWrap(var12.field_i, var12.field_l, true);
          this.textures.put((long)textureId, var4Lifetime3, (byte) 19);
          return var4Lifetime3;
        }
        if (!this.provider.b(-29912, textureId)) {
          return null;
        }
        var29 = this.provider.a(-29193, textureId);
        if (!var29.field_n) {
          stackIn_48_0 = this.toolkit.field_tc;
        } else {
          stackIn_48_0 = 64;
        }
        var6Lifetime1 = stackIn_48_0;
        if (!var29.field_s) {
          if (2 == var29.field_p) {
            var7Lifetime1 = this.provider.a(-25069, var6Lifetime1, var6Lifetime1, false, 0.699999988079071f, textureId);
            stackIn_72_0 = this.toolkit;
            stackIn_72_1 = var7Lifetime1;
            stackIn_72_2 = var6Lifetime1;
            stackIn_73_3 = (var29.field_k == 0) ? false : true;
            var33 = ((HardwareGraphicsToolkit) (Object) stackIn_72_0).a(stackIn_72_1, stackIn_72_2, stackIn_73_3, -97, var6Lifetime1);
            var33.setWrap(var29.field_i, var29.field_l, true);
            this.textures.put((long)textureId, var33, (byte) 19);
            return var33;
          }
          if (!PlayingSound.a(108, (int) var29.field_d)) {
            var7Lifetime1Lifetime1 = this.provider.a(-25069, var6Lifetime1, var6Lifetime1, false, 0.699999988079071f, textureId);
            stackIn_83_0 = this.toolkit;
            stackIn_83_1 = var7Lifetime1Lifetime1;
            stackIn_83_2 = var6Lifetime1;
            stackIn_84_3 = (var29.field_k == 0) ? false : true;
            var34 = ((HardwareGraphicsToolkit) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, stackIn_84_3, -97, var6Lifetime1);
            var34.setWrap(var29.field_i, var29.field_l, true);
            this.textures.put((long)textureId, var34, (byte) 19);
            return var34;
          }
          var7Lifetime1Lifetime2 = this.provider.a(true, var6Lifetime1, (byte) -81, var6Lifetime1, 0.699999988079071f, textureId);
          stackIn_77_0 = this.toolkit;
          stackIn_77_1 = var7Lifetime1Lifetime2;
          stackIn_77_2 = var6Lifetime1;
          stackIn_78_3 = (var29.field_k == 0) ? false : true;
          var4Lifetime1 = ((HardwareGraphicsToolkit) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2, stackIn_78_3, -97, var6Lifetime1);
          var4Lifetime1.setWrap(var29.field_i, var29.field_l, true);
          this.textures.put((long)textureId, var4Lifetime1, (byte) 19);
          return var4Lifetime1;
        }
        if (this.toolkit.a()) {
          var40 = this.provider.a(var6Lifetime1, false, 0.699999988079071f, textureId, var6Lifetime1, -70);
          stackIn_52_0 = this.toolkit;
          stackIn_52_1 = var6Lifetime1;
          stackIn_52_2 = BeveledTextInputRenderer.RGBA;
          stackIn_52_3 = 110;
          stackIn_53_4 = (var29.field_k == 0) ? false : true;
          var4Lifetime2 = ((HardwareGraphicsToolkit) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, (byte) stackIn_52_3, stackIn_53_4, var6Lifetime1, var40);
          var4Lifetime2.setWrap(var29.field_i, var29.field_l, true);
          this.textures.put((long)textureId, var4Lifetime2, (byte) 19);
          return var4Lifetime2;
        }
        if (2 == var29.field_p) {
          var7Lifetime2 = this.provider.a(-25069, var6Lifetime1, var6Lifetime1, false, 0.699999988079071f, textureId);
          stackIn_57_0 = this.toolkit;
          stackIn_57_1 = var7Lifetime2;
          stackIn_57_2 = var6Lifetime1;
          stackIn_58_3 = (var29.field_k == 0) ? false : true;
          var30 = ((HardwareGraphicsToolkit) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_58_3, -97, var6Lifetime1);
          var30.setWrap(var29.field_i, var29.field_l, true);
          this.textures.put((long)textureId, var30, (byte) 19);
          return var30;
        }
        if (!PlayingSound.a(108, (int) var29.field_d)) {
          var7Lifetime3 = this.provider.a(-25069, var6Lifetime1, var6Lifetime1, false, 0.699999988079071f, textureId);
          stackIn_66_0 = this.toolkit;
          stackIn_66_1 = var7Lifetime3;
          stackIn_66_2 = var6Lifetime1;
          stackIn_67_3 = (var29.field_k == 0) ? false : true;
          var31 = ((HardwareGraphicsToolkit) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, stackIn_67_3, -97, var6Lifetime1);
          var31.setWrap(var29.field_i, var29.field_l, true);
          this.textures.put((long)textureId, var31, (byte) 19);
          return var31;
        }
        var7Lifetime4 = this.provider.a(true, var6Lifetime1, (byte) -81, var6Lifetime1, 0.699999988079071f, textureId);
        stackIn_62_0 = this.toolkit;
        stackIn_62_1 = var7Lifetime4;
        stackIn_62_2 = var6Lifetime1;
        stackIn_63_3 = (var29.field_k == 0) ? false : true;
        var32 = ((HardwareGraphicsToolkit) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_62_2, stackIn_63_3, -97, var6Lifetime1);
        var32.setWrap(var29.field_i, var29.field_l, true);
        this.textures.put((long)textureId, var32, (byte) 19);
        return var32;
    }

    final static int bitLength(int value, byte guard) {
        int var2;
        var2 = 0;
        if (guard != -115) {
          return 23;
        }
        if (0 > value) {
          value = value >>> 16;
          var2 += 16;
        } else {
          if (value >= 65536) {
            value = value >>> 16;
            var2 += 16;
          }
        }
        if (value >= 256) {
          var2 += 8;
          value = value >>> 8;
        }
        if (value >= 16) {
          value = value >>> 4;
          var2 += 4;
        }
        if (value >= 4) {
          var2 += 2;
          value = value >>> 2;
        }
        if (1 <= value) {
          value = value >>> 1;
          var2++;
        }
        return var2 + value;
    }

    final static byte[] generateNoiseVolume(float amplitude, float persistence, int width, int guard, NoiseSliceGenerator generator, float frequencyX, float frequencyY, float frequencyZ, int depth, int octaves, int height) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -30865) {
            introMeshes = (CompactMeshGeometry[]) null;
          }
          var12 = new byte[height * (width * depth)];
          var11 = var12;
          SocialContact.fillNoiseVolume(frequencyZ, generator, 0, var12, octaves, amplitude, frequencyY, persistence, 24046, frequencyX, height, depth, width);
          stackIn_3_0 = var12;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_6_0 = var11_ref;
          stackIn_6_1 = new StringBuilder().append("mr.B(").append(amplitude).append(',').append(persistence).append(',').append(width).append(',').append(guard).append(',');
          if (generator == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(frequencyX).append(',').append(frequencyY).append(',').append(frequencyZ).append(',').append(depth).append(',').append(octaves).append(',').append(height).append(')').toString());
        }
    }

    HardwareTextureCache(HardwareGraphicsToolkit owner, TextureProvider textureProvider) {
        this.textures = new SoftLruCache(256);
        try {
          this.toolkit = owner;
          this.provider = textureProvider;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mr.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textureProvider != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = null;
    }
}
