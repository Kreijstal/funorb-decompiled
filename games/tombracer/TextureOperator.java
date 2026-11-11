/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextureOperator extends IntrusiveNode {
    ColourRowCache colourCache;
    boolean monochrome;
    static int field_k;
    MonochromeRowCache monochromeCache;
    static MessageDialog field_l;
    int cacheRowCount;
    TextureOperator[] inputs;

    void createRowCache(int param0, int param1, int param2) {
        int var4 = ~this.cacheRowCount == param2 ? param1 : this.cacheRowCount;
        if (!this.monochrome) {
          this.colourCache = new ColourRowCache(var4, param1, param0);
          return;
        }
        this.monochromeCache = new MonochromeRowCache(var4, param1, param0);
    }

    final int[] getInputMonochromeRow(int param0, int param1, int param2) {
        if (param1 > -3) {
          this.cacheRowCount = 54;
          if (!this.inputs[param0].monochrome) {
            return this.inputs[param0].getColourRow(param2, -1)[0];
          }
          return this.inputs[param0].getMonochromeRow(1, param2);
        }
        if (!this.inputs[param0].monochrome) {
          return this.inputs[param0].getColourRow(param2, -1)[0];
        }
        return this.inputs[param0].getMonochromeRow(1, param2);
    }

    void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        try {
          if (param0 != 107) {
            this.getMonochromeRow(1, -94);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int[][] getInputColourRow(int param0, int param1, int param2) {
        if (param2 != -1) {
          return (int[][]) null;
        }
        if (!this.inputs[param1].monochrome) {
          return this.inputs[param1].getColourRow(param0, -1);
        }
        int[] var6 = this.inputs[param1].getMonochromeRow(1, param0);
        int[] var4 = var6;
        int[][] var5 = new int[3][];
        var5[1] = var6;
        var5[2] = var6;
        var5[0] = var6;
        return var5;
    }

    final static Weapon a(int param0, int param1) {
        Weapon var2 = S2CActionPacket.createWeaponPreset(param1, param0);
        var2.typeId = param0;
        var2.ammo = var2.maxAmmo;
        return var2;
    }

    void b(byte param0) {
        if (param0 != 116) {
          this.getTextureId((byte) 122);
        }
    }

    int[][] getColourRow(int param0, int param1) {
        if (param1 != -1) {
          return (int[][]) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int getSpriteId(int param0) {
        if (param0 <= 96) {
          this.colourCache = (ColourRowCache) null;
          return -1;
        }
        return -1;
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        if (param0 >= -69) {
          byte[] var2 = (byte[]) null;
          TextureOperator.decodeAntialiasedFont((byte[]) null, (byte) 54);
        }
    }

    void releaseRowCache(int param0) {
        if (this.monochrome) {
          this.monochromeCache.release(false);
          this.monochromeCache = null;
          if (param0 >= -32) {
            this.b((byte) 31);
            return;
          }
          return;
        }
        this.colourCache.release(2);
        this.colourCache = null;
        if (param0 >= -32) {
          this.b((byte) 31);
          return;
        }
    }

    int[] getMonochromeRow(int param0, int param1) {
        if (param0 != 1) {
          this.getMonochromeRow(-21, -6);
          throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    TextureOperator(int param0, boolean param1) {
        this.inputs = new TextureOperator[param0];
        this.monochrome = param1 ? true : false;
    }

    final static AntialiasedBitmapFont decodeAntialiasedFont(byte[] param0, byte param1) {
        AntialiasedBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        AntialiasedBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (AntialiasedBitmapFont) (stackIn_2_0);
          }
          var2 = new AntialiasedBitmapFont(param0, LoadLevelCommand.field_p, pg.field_C, mq.field_b, ImageProducerCanvasImageBuffer.field_m, mga.field_g, ck.field_c);
          MazeGenerator.releaseStatics((byte) -70);
          var3 = -23 % ((-28 - param1) / 37);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ci.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    int getTextureId(byte param0) {
        if (param0 != -117) {
          this.b((byte) -6);
          return -1;
        }
        return -1;
    }

    static {
    }
}
