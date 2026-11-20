/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextureOperation extends IntrusiveNode {
    int field_h;
    ColorRowCache field_d;
    boolean field_g;
    TextureOperation[] field_e;
    MonochromeRowCache field_f;

    final int[][] getInputColorRow(byte param0, int param1, int param2) {
        if (param0 < 30) {
          return (int[][]) null;
        }
        if (!this.field_e[param1].field_g) {
          return this.field_e[param1].getColorRow(255, param2);
        }
        int[] var6 = this.field_e[param1].getMonochromeRow(param2, true);
        int[] var4 = var6;
        int[][] var5 = new int[3][];
        var5[1] = var6;
        var5[2] = var6;
        var5[0] = var6;
        return var5;
    }

    void clearCache(int param0) {
        if (!this.field_g) {
          this.field_d.clear(1);
          this.field_d = null;
          if (param0 > -23) {
            this.field_g = true;
            return;
          }
          return;
        }
        this.field_f.clear(false);
        this.field_f = null;
        if (param0 > -23) {
          this.field_g = true;
          return;
        }
    }

    void initializeCache(int param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 != -9163) {
          this.getColorRow(-12, 12);
          var4 = 255 != this.field_h ? this.field_h : param2;
          if (this.field_g) {
            this.field_f = new MonochromeRowCache(var4, param2, param1);
            return;
          }
          this.field_d = new ColorRowCache(var4, param2, param1);
          return;
        }
        var4Lifetime1 = 255 != this.field_h ? this.field_h : param2;
        if (this.field_g) {
          this.field_f = new MonochromeRowCache(var4Lifetime1, param2, param1);
          return;
        }
        this.field_d = new ColorRowCache(var4Lifetime1, param2, param1);
    }

    final int[] getInputMonochromeRow(int param0, int param1, int param2) {
        if (param2 != 255) {
          this.d((byte) -6);
          if (this.field_e[param0].field_g) {
            return this.field_e[param0].getMonochromeRow(param1, true);
          }
          return this.field_e[param0].getColorRow(255, param1)[0];
        }
        if (this.field_e[param0].field_g) {
          return this.field_e[param0].getMonochromeRow(param1, true);
        }
        return this.field_e[param0].getColorRow(255, param1)[0];
    }

    int d(byte param0) {
        if (param0 <= 62) {
          this.field_d = (ColorRowCache) null;
          return -1;
        }
        return -1;
    }

    int a(int param0) {
        if (param0 != -1) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.decodeParameter(97, 76, (PacketBuffer) null);
          return -1;
        }
        return -1;
    }

    int[] getMonochromeRow(int param0, boolean param1) {
        if (!param1) {
          this.a(-12);
          throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    void postDecode(byte param0) {
        if (param0 >= -35) {
          this.postDecode((byte) -62);
        }
    }

    int[][] getColorRow(int param0, int param1) {
        if (param0 == 255) {
          throw new IllegalStateException("This operation does not have a colour output");
        }
        PacketBuffer var4 = (PacketBuffer) null;
        this.decodeParameter(-96, -51, (PacketBuffer) null);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    final static SoftwareMonochromeBitmapFont a(ResourceArchive param0, byte param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        Object stackIn_4_0 = null;
        SoftwareMonochromeBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -21) {
            var6 = (ResourceArchive) null;
            TextureOperation.a((ResourceArchive) null, (byte) 32, (ResourceArchive) null, -82, 9);
          }
          if (pa.decodeSpriteArchiveFile(param4, 2, param0, param3)) {
            stackIn_6_0 = ServerInfo.createFontFromDecodedSprites(param2.fetchFile(param4, param3, (byte) 13), 11);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (SoftwareMonochromeBitmapFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("le.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    TextureOperation(int param0, boolean param1) {
        this.field_e = new TextureOperation[param0];
        this.field_g = param1 ? true : false;
    }

    void decodeParameter(int param0, int param1, PacketBuffer param2) {
        try {
          if (param1 > -60) {
            this.field_g = false;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "le.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
