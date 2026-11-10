/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SpriteSampleOperator extends TextureOperator {
    private int field_o;
    int field_m;
    int[] field_p;
    static mla field_s;
    static String field_n;
    int field_r;
    static int[] field_q;

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 107) {
            this.field_r = -60;
          }
          if (0 == param2) {
            this.field_o = param1.readUnsignedShort(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("coa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public SpriteSampleOperator() {
        super(0, false);
        this.field_o = -1;
    }

    final int a(int param0) {
        if (param0 < 96) {
          this.b(-44);
        }
        return this.field_o;
    }

    final void b(int param0) {
        super.b(-77);
        if (param0 >= -32) {
          return;
        }
        this.field_p = null;
    }

    int[][] getColourRow(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        var11 = TombRacer.field_G ? 1 : 0;
        var14 = this.field_h.a(param0, (byte) -66);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param1 != -1) {
          return (int[][]) null;
        }
        if (this.field_h.field_f &&
          this.a(false)) {
          var4 = var14[0];
          var5 = var14[1];
          var6 = var14[2];
          stackIn_6_0 = this.field_m;
          if (ArchiveNetworkClient.textureHeight != this.field_r) {
            stackIn_7_1 = this.field_r * param0 / ArchiveNetworkClient.textureHeight;
          } else {
            stackIn_7_1 = param0;
          }
          var7 = stackIn_6_0 * stackIn_7_1;
          if (this.field_m != ns.textureWidth) {
            for (var8 = 0; var8 < ns.textureWidth; var8++) {
              var9 = this.field_m * var8 / ns.textureWidth;
              var10 = this.field_p[var7 + var9];
              var6[var8] = SnakePitBehaviour.bitwiseAnd(4080, var10 << 4);
              var5[var8] = SnakePitBehaviour.bitwiseAnd(var10, 65280) >> 4;
              var4[var8] = SnakePitBehaviour.bitwiseAnd(16711680, var10) >> 12;
            }
          } else {
            for (var8 = 0; ns.textureWidth > var8; var8++) {
              incrementValue$0 = var7;
              var7++;
              var9 = this.field_p[incrementValue$0];
              var6[var8] = SnakePitBehaviour.bitwiseAnd(4080, var9 << 4);
              var5[var8] = SnakePitBehaviour.bitwiseAnd(4080, var9 >> 4);
              var4[var8] = SnakePitBehaviour.bitwiseAnd(var9, 16711680) >> 12;
            }
          }
        }
        return var3;
    }

    final boolean a(boolean param0) {
        if (null != this.field_p) {
          return true;
        }
        if (param0) {
          return true;
        }
        if (this.field_o < 0) {
          return false;
        }
        SpriteData var2 = BevelOperator.field_m >= 0 ? SpriteData.loadSprite(np.field_m, BevelOperator.field_m, this.field_o) : SpriteData.loadSprite(np.field_m, this.field_o);
        var2.d();
        this.field_p = var2.e();
        this.field_r = var2.field_a;
        this.field_m = var2.field_i;
        return true;
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        if (param0 != 16711680) {
          SpriteSampleOperator.releaseStatics(90);
        }
        field_n = null;
        field_q = null;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_n = "<%0> chose character: <%1>";
        field_s = new mla();
        field_q = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_q[var1] = var0;
        }
    }
}
