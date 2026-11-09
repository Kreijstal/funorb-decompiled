/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareTurbulentWaterNoise extends TurbulenceNoise3D {
    static int field_v;
    static SpriteData[] field_w;
    static String emailLoginText;
    static cp field_x;
    static SpriteData field_t;
    private byte[] pixels;

    HardwareTurbulentWaterNoise() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final byte[] generate(int guard, int width, int height, int depth) {
        this.pixels = new byte[width * (height * depth) * 2];
        this.generateVolume(depth, guard ^ 207, height, width);
        if (guard == 1) {
          return this.pixels;
        }
        HardwareTurbulentWaterNoise.a((byte) -23, -46, 65, -1, 46);
        return this.pixels;
    }

    public static void releaseStatics(int guard) {
        field_w = null;
        if (guard == -11701) {
          field_t = null;
          emailLoginText = null;
          field_x = null;
          return;
        }
        PacketBuffer var2 = (PacketBuffer) null;
        HardwareTurbulentWaterNoise.a((java.math.BigInteger) null, (java.math.BigInteger) null, true, (PacketBuffer) null, (PacketBuffer) null);
        field_t = null;
        emailLoginText = null;
        field_x = null;
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, boolean param2, PacketBuffer param3, PacketBuffer param4) {
        if (param2) {
          return;
        }
        try {
          LimitedRandomAccessFile.a(param0, param4.position, param4.payload, param1, (byte) -29, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ks.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= -5) {
          return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
        }
        field_x = (cp) null;
        return oq.a(param4, param2, 1, 1, 1, param3, (byte) -113, param1, 3);
    }

    final static GraphicsToolkit createToolkitForCanvas(int backend, java.awt.Canvas canvas, TextureProvider textures, boolean guard, int options, ResourceArchive shaders) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        GraphicsToolkit stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 0;
          var7 = 0;
          if (canvas != null) {
            var8 = canvas.getSize();
            var6_int = var8.width;
            var7 = var8.height;
          }
          if (!guard) {
            field_x = (cp) null;
          }
          stackIn_5_0 = GraphicsToolkit.createToolkit(backend, canvas, -1, options, textures, var7, var6_int, shaders);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ks.D(").append(backend).append(',');
          if (canvas == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (textures == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(',').append(options).append(',');
          if (shaders == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void writeVoxel(int index, byte value, int bias) {
        value = (byte)((value >> 1 & 127) + bias);
        int var4 = 2 * index;
        int incrementValue$0 = var4;
        var4++;
        this.pixels[incrementValue$0] = (byte)value;
        this.pixels[var4] = (byte)value;
    }

    static {
        emailLoginText = "Email (Login):";
        field_v = 0;
    }
}
