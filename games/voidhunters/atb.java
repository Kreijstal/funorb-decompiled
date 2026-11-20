/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class atb {
    static int field_d;
    static Sprite[] field_b;
    private SoftLruCache field_c;
    private GpuToolkit field_a;
    private TextureProvider field_e;

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          atb.clearSharedReferences(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final GpuTexture2D a(int param0, int param1) {
        int stackIn_8_0 = 0;
        GpuToolkit stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        GpuToolkit stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        GpuToolkit stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_27_2 = false;
        GpuToolkit stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean stackIn_38_2 = false;
        GpuToolkit stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_44_2 = false;
        GpuToolkit stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        GpuToolkit stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        float[] stackIn_56_3;
        boolean stackIn_57_4 = false;
        Object var3;
        GpuTexture2D var4;
        TextureMetadata var5;
        int var6;
        float[] var7;
        int var8;
        float[] var9;
        GpuTexture2D var11;
        GpuTexture2D var13;
        GpuTexture2D var15;
        GpuTexture2D var17;
        GpuTexture2D var19;
        GpuTexture2D var21;
        GpuTexture2D var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        var8 = VoidHunters.field_G;
        var3 = this.field_c.get(0, (long)param1);
        if (var3 != null) {
          return (GpuTexture2D) (var3);
        }
        if (!this.field_e.isTextureReady(param1, (byte) -49)) {
          return null;
        }
        var5 = this.field_e.getTextureMetadata(-20292, param1);
        if (var5.field_h) {
          stackIn_8_0 = 64;
        } else {
          stackIn_8_0 = this.field_a.field_n;
        }
        var6 = stackIn_8_0;
        if (!var5.field_i) {
          if (var5.field_q == 2) {
            var23 = this.field_e.generateArgbPixels(103, var6, var6, false, param1, 0.699999988079071f);
            stackIn_14_0 = this.field_a;
            stackIn_14_1 = var6;
            stackIn_15_2 = (var5.field_j == 0) ? false : true;
            var11 = ((GpuToolkit) (Object) stackIn_14_0).createTexture2DFromPixels(stackIn_14_1, stackIn_15_2, var6, (byte) -84, var23);
            if (param0 != -1) {
              this.a(100, 49);
            }
            var11.setRepeat(var5.field_k, (byte) -98, var5.field_s);
            this.field_c.put(var11, (long)param1, (byte) -117);
            return var11;
          }
          if (!SoftwareGlyphMask.a(param0 ^ 2, (int) var5.field_c)) {
            var24 = this.field_e.generateArgbPixels(103, var6, var6, false, param1, 0.699999988079071f);
            stackIn_20_0 = this.field_a;
            stackIn_20_1 = var6;
            stackIn_21_2 = (var5.field_j == 0) ? false : true;
            var13 = ((GpuToolkit) (Object) stackIn_20_0).createTexture2DFromPixels(stackIn_20_1, stackIn_21_2, var6, (byte) -84, var24);
            if (param0 != -1) {
              this.a(100, 49);
            }
            var13.setRepeat(var5.field_k, (byte) -98, var5.field_s);
            this.field_c.put(var13, (long)param1, (byte) -117);
            return var13;
          }
          var25 = this.field_e.generateRgbPixels(var6, 0.699999988079071f, true, param1, var6, true);
          stackIn_26_0 = this.field_a;
          stackIn_26_1 = var6;
          stackIn_27_2 = (var5.field_j == 0) ? false : true;
          var15 = ((GpuToolkit) (Object) stackIn_26_0).createTexture2DFromPixels(stackIn_26_1, stackIn_27_2, var6, (byte) -84, var25);
          var4 = var15;
          if (param0 != -1) {
            this.a(100, 49);
          }
          var15.setRepeat(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.put(var15, (long)param1, (byte) -117);
          return var15;
        }
        if (this.field_a.isBloomEnabled()) {
          var9 = this.field_e.generateFloatRgba(0.699999988079071f, var6, param1, var6, 117, false);
          var7 = var9;
          stackIn_56_0 = this.field_a;
          stackIn_56_1 = var6;
          stackIn_56_2 = var6;
          stackIn_56_3 = var9;
          stackIn_57_4 = (var5.field_j == 0) ? false : true;
          var22 = ((GpuToolkit) (Object) stackIn_56_0).createTexture2DFromFloats(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_57_4, param0 + 0, ComponentAttachmentPlan.field_d);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var22.setRepeat(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.put(var22, (long)param1, (byte) -117);
          return var22;
        }
        if (var5.field_q == 2) {
          var26 = this.field_e.generateArgbPixels(103, var6, var6, false, param1, 0.699999988079071f);
          stackIn_37_0 = this.field_a;
          stackIn_37_1 = var6;
          stackIn_38_2 = (var5.field_j == 0) ? false : true;
          var17 = ((GpuToolkit) (Object) stackIn_37_0).createTexture2DFromPixels(stackIn_37_1, stackIn_38_2, var6, (byte) -84, var26);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var17.setRepeat(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.put(var17, (long)param1, (byte) -117);
          return var17;
        }
        if (!SoftwareGlyphMask.a(param0 ^ 2, (int) var5.field_c)) {
          var27 = this.field_e.generateArgbPixels(103, var6, var6, false, param1, 0.699999988079071f);
          stackIn_43_0 = this.field_a;
          stackIn_43_1 = var6;
          stackIn_44_2 = (var5.field_j == 0) ? false : true;
          var19 = ((GpuToolkit) (Object) stackIn_43_0).createTexture2DFromPixels(stackIn_43_1, stackIn_44_2, var6, (byte) -84, var27);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var19.setRepeat(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.put(var19, (long)param1, (byte) -117);
          return var19;
        }
        var28 = this.field_e.generateRgbPixels(var6, 0.699999988079071f, true, param1, var6, true);
        stackIn_49_0 = this.field_a;
        stackIn_49_1 = var6;
        stackIn_50_2 = (var5.field_j == 0) ? false : true;
        var21 = ((GpuToolkit) (Object) stackIn_49_0).createTexture2DFromPixels(stackIn_49_1, stackIn_50_2, var6, (byte) -84, var28);
        if (param0 != -1) {
          this.a(100, 49);
        }
        var21.setRepeat(var5.field_k, (byte) -98, var5.field_s);
        this.field_c.put(var21, (long)param1, (byte) -117);
        return var21;
    }

    final void a(byte param0) {
        if (param0 == -106) {
          this.field_c.age(true, 5);
          return;
        }
        this.field_a = (GpuToolkit) null;
        this.field_c.age(true, 5);
    }

    atb(GpuToolkit param0, TextureProvider param1) {
        this.field_c = new SoftLruCache(256);
        try {
          this.field_e = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "atb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
