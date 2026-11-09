/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexBuffer extends OpenGlBuffer implements VertexBuffer {
    static AccountConnectionPhase WAIT_SERVER_SEED;
    private byte stride;
    static int[] field_o;

    final int stride(int guard) {
        if (guard != 34962) {
          this.stride = (byte) -127;
          return this.stride;
        }
        return this.stride;
    }

    public final void close(int guard) {
        super.close(guard);
    }

    public final jaclib.memory.Buffer map(int guard, boolean discard) {
        if (guard == 7454) {
          return super.map(discard, 2, this.toolkit.field_Bc);
        }
        this.stride(127);
        return super.map(discard, 2, this.toolkit.field_Bc);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_o = null;
        WAIT_SERVER_SEED = null;
    }

    public final boolean unmap(int guard) {
        if (guard == 22957) {
          return super.unmap(this.toolkit.field_Bc, (byte) 92);
        }
        WAIT_SERVER_SEED = (AccountConnectionPhase) null;
        return super.unmap(this.toolkit.field_Bc, (byte) 92);
    }

    public final boolean allocate(int stride, byte guard, int sizeBytes) {
        this.stride = (byte)stride;
        if (guard == -35) {
          super.allocate((byte) -103, sizeBytes);
          return true;
        }
        this.stride = (byte) -114;
        super.allocate((byte) -103, sizeBytes);
        return true;
    }

    OpenGlVertexBuffer(OpenGlGraphicsToolkit param0, boolean param1) {
        super(param0, 34962, param1);
    }

    static {
        WAIT_SERVER_SEED = new AccountConnectionPhase();
        field_o = new int[2];
    }
}
