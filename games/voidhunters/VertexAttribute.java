/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexAttribute {
    static VertexAttribute field_k;
    private int componentCount;
    static VertexAttribute field_g;
    int id;
    static VertexAttribute field_d;
    static VertexAttribute field_e;
    int byteSize;
    private GpuDataType dataType;
    static VertexAttribute field_l;
    static VertexAttribute field_h;
    static VertexAttribute field_b;
    static int field_m;
    static String field_n;
    static byte[] gzipHeader;

    public static void clearSharedReferences(byte param0) {
        if (param0 <= -20) {
          gzipHeader = null;
          field_h = null;
          field_n = null;
          field_k = null;
          field_d = null;
          field_l = null;
          field_e = null;
          field_b = null;
          field_g = null;
          return;
        }
        VertexAttribute.fromId((byte) 99, -109);
        gzipHeader = null;
        field_h = null;
        field_n = null;
        field_k = null;
        field_d = null;
        field_l = null;
        field_e = null;
        field_b = null;
        field_g = null;
    }

    final static VertexAttribute fromId(byte param0, int param1) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = param1;
        if (0 == var2) {
          return field_k;
        }
        if (var2 == 1) {
          return field_g;
        }
        if (2 == var2) {
          return field_d;
        }
        if (var2 == 3) {
          return field_e;
        }
        if (var2 == 4) {
          return field_l;
        }
        if (var2 == 5) {
          return field_h;
        }
        if (6 == var2) {
          return field_b;
        }
        if (param0 < -107) {
          return null;
        }
        return (VertexAttribute) null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private VertexAttribute(int param0, int param1, GpuDataType param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.componentCount = param1;
          this.dataType = param2;
          this.id = param0;
          this.byteSize = this.componentCount * this.dataType.byteSize;
          if (16 > this.id) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_k = new VertexAttribute(0, 3, GpuDataType.FLOAT);
        field_g = new VertexAttribute(1, 3, GpuDataType.FLOAT);
        field_d = new VertexAttribute(2, 4, GpuDataType.UNSIGNED_BYTE);
        field_e = new VertexAttribute(3, 1, GpuDataType.FLOAT);
        field_l = new VertexAttribute(4, 2, GpuDataType.FLOAT);
        field_h = new VertexAttribute(5, 3, GpuDataType.FLOAT);
        field_b = new VertexAttribute(6, 4, GpuDataType.FLOAT);
        field_m = SetMutatorVotes.a(16, -111);
        gzipHeader = new byte[]{(byte)31, (byte)-117, (byte)8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_n = "Launches a fighter for harrassment";
    }
}
