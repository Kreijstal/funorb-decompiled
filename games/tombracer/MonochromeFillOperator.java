/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeFillOperator extends TextureOperator {
    static Sprite[] field_n;
    static String field_q;
    static int field_p;
    static String field_o;
    private int field_m;

    private MonochromeFillOperator(int param0) {
        super(0, true);
        this.field_m = 4096;
        this.field_m = param0;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_m = (param1.readUnsignedByte(255) << 12) / 255;
          }
          if (param0 == 107) {
            return;
          }
          this.field_m = -5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nga.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int[] var4 = this.monochromeCache.getRow((byte) 61, param1);
        int[] var3 = var4;
        if (this.monochromeCache.rowMissed) {
          ArrayUtils.fill(var4, 0, LegacyOpenGlTurbulentTextureEffect.textureWidth, this.field_m);
          if (param0 != 1) {
            field_o = (String) null;
            return var4;
          }
          return var4;
        }
        if (param0 == 1) {
          return var4;
        }
        field_o = (String) null;
        return var4;
    }

    final static boolean c(int param0) {
        if (!ni.field_c) {
          return false;
        }
        if (OpenGlUnderwaterEffect.field_q != param0) {
          return false;
        }
        return true;
    }

    public MonochromeFillOperator() {
        this(4096);
    }

    public static void releaseStatics(byte param0) {
        field_q = null;
        int var1 = 51 / ((param0 + 47) / 38);
        field_o = null;
        field_n = null;
    }

    static {
        field_o = "Friends";
        field_q = "Retry";
    }
}
