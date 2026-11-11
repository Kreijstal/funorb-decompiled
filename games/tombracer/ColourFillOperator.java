/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColourFillOperator extends TextureOperator {
    private int field_n;
    private int field_q;
    static int[] field_r;
    static ToolkitSprite field_m;
    static String field_o;
    private int field_s;
    static SpriteData[] field_p;

    public ColourFillOperator() {
        this(0);
    }

    private ColourFillOperator(int param0) {
        super(0, false);
        this.setColour(param0, (byte) -55);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 7438) {
          return;
        }
        field_m = null;
        field_r = null;
        field_p = null;
        field_o = null;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        PacketBuffer var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.setColour(param1.readUnsignedMedium(param0 ^ -32661), (byte) -55);
          }
          if (param0 != 107) {
            var5 = (PacketBuffer) null;
            this.decodeParameter((byte) -48, (PacketBuffer) null, 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("lm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] getColourRow(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        int[][] var9 = this.colourCache.getRow(param0, (byte) 100);
        int[][] var3 = var9;
        if (this.colourCache.field_f) {
          var4 = var9[0];
          var5 = var9[1];
          var6 = var9[2];
          for (var7 = 0; var7 < LegacyOpenGlTurbulentTextureEffect.textureWidth; var7++) {
            var4[var7] = this.field_n;
            var5[var7] = this.field_q;
            var6[var7] = this.field_s;
          }
        }
        if (param1 != -1) {
          this.setColour(84, (byte) -17);
        }
        return var3;
    }

    private final void setColour(int param0, byte param1) {
        this.field_n = (param0 & 16711680) >> 12;
        if (param1 != -55) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.decodeParameter((byte) 12, (PacketBuffer) null, 20);
        }
        this.field_s = 4080 & param0 << 4;
        this.field_q = (65280 & param0) >> 4;
    }

    static {
        field_o = "Spectate <%0>'s game";
    }
}
