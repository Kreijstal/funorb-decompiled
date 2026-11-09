/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexAttribute {
    int sizeBytes;
    static VertexAttribute POSITION;
    int id;
    private int componentCount;
    private GpuDataType dataType;
    static VertexAttribute NORMAL;
    static VertexAttribute COLOR;
    static VertexAttribute TEXCOORD1;
    static VertexAttribute TEXCOORD2;
    static VertexAttribute TEXCOORD3;
    static VertexAttribute TEXCOORD4;
    static int BITS_PER_ATTRIBUTE;
    static String continueText;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        int var1_intLifetime1;
        try {
          jl.field_a.b((byte) 105);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            Js5Client.field_k[var1_int] = 0L;
          }
          for (var1_intLifetime1 = param0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            fa.field_a[var1_intLifetime1] = 0L;
          }
          BurstParticle.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ls.A(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        if (param0 != -62) {
          return (String) null;
        }
        return ig.field_a.readCp1252String(-1);
    }

    final static void a(int param0, int param1, int param2) {
        CheckboxWidget.field_F = param2;
        if (param1 > -42) {
          return;
        }
        GraphicsToolkit.field_b = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static VertexAttribute fromId(int id, byte guard) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = id;
        if (var2 == 0) {
          return POSITION;
        }
        if (var2 == 1) {
          return NORMAL;
        }
        if (var2 == 2) {
          return COLOR;
        }
        if (var2 == 3) {
          return TEXCOORD1;
        }
        if (var2 == 4) {
          return TEXCOORD2;
        }
        if (var2 == 5) {
          return TEXCOORD3;
        }
        if (var2 == 6) {
          return TEXCOORD4;
        }
        if (guard <= -77) {
          return null;
        }
        VertexAttribute.a(88, 28, 105);
        return null;
    }

    final static void fillNoiseSlice(float frequencyZ, float frequencyX, int outputOffset, int height, byte[] output, int slice, float amplitude, int depth, int guard, int width, int octaves, float frequencyY, NoiseSliceGenerator generator, float persistence) {
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        float[] var24 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard > -59) {
            COLOR = (VertexAttribute) null;
          }
          var14_int = height * width;
          var24 = new float[var14_int];
          for (var16 = 0; var16 < octaves; var16++) {
            generator.generateSlice(frequencyX / (float)width, 0, frequencyY / (float)height, frequencyZ / (float)depth, slice, depth, 1, var24, width, amplitude * 127.0f, height);
            var17 = outputOffset;
            for (var18 = 0; var14_int > var18; var18++) {
              output[var17] = (byte)(int)((float)output[var17] + var24[var18]);
              var17++;
            }
            amplitude = amplitude * persistence;
            frequencyX = frequencyX * 2.0f;
            frequencyZ = frequencyZ * 2.0f;
            frequencyY = frequencyY * 2.0f;
          }
          var20 = outputOffset;
          var16Lifetime1 = var20;
          for (var17Lifetime1 = 0; var14_int > var17Lifetime1; var17Lifetime1++) {
            output[var20] = (byte)(output[var20] + 127);
            var20++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("ls.D(").append(frequencyZ).append(',').append(frequencyX).append(',').append(outputOffset).append(',').append(height).append(',');
          if (output == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(slice).append(',').append(amplitude).append(',').append(depth).append(',').append(guard).append(',').append(width).append(',').append(octaves).append(',').append(frequencyY).append(',');
          if (generator == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(persistence).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        COLOR = null;
        TEXCOORD3 = null;
        POSITION = null;
        continueText = null;
        TEXCOORD2 = null;
        NORMAL = null;
        TEXCOORD1 = null;
        TEXCOORD4 = null;
        if (param0 != 2) {
          NoiseSliceGenerator var2 = (NoiseSliceGenerator) null;
          VertexAttribute.fillNoiseSlice(0.4216335117816925f, -2.271651268005371f, -82, -112, (byte[]) null, 106, 0.32911431789398193f, -52, -122, -66, 54, 0.6878315806388855f, (NoiseSliceGenerator) null, -1.019270896911621f);
        }
    }

    private VertexAttribute(int semanticId, int components, GpuDataType type) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.dataType = type;
          this.componentCount = components;
          this.id = semanticId;
          this.sizeBytes = this.dataType.bytesPerComponent * this.componentCount;
          if (this.id < 16) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("ls.<init>(").append(semanticId).append(',').append(components).append(',');
          if (type == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        POSITION = new VertexAttribute(0, 3, GpuDataType.FLOAT);
        NORMAL = new VertexAttribute(1, 3, GpuDataType.FLOAT);
        COLOR = new VertexAttribute(2, 4, GpuDataType.UNSIGNED_BYTE);
        TEXCOORD1 = new VertexAttribute(3, 1, GpuDataType.FLOAT);
        TEXCOORD2 = new VertexAttribute(4, 2, GpuDataType.FLOAT);
        TEXCOORD3 = new VertexAttribute(5, 3, GpuDataType.FLOAT);
        TEXCOORD4 = new VertexAttribute(6, 4, GpuDataType.FLOAT);
        BITS_PER_ATTRIBUTE = HardwareTextureCache.bitLength(16, (byte) -115);
        continueText = "Continue";
    }
}
