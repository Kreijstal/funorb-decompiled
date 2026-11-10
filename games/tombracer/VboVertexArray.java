/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VboVertexArray extends vo implements LegacyVertexArray {
    private int field_j;
    static jea field_k;
    static ft field_i;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_i = null;
        if (param0 != 34962) {
          VboVertexArray.releaseStatics(53);
        }
    }

    public final int getBufferId(boolean param0) {
        if (!param0) {
          field_k = (jea) null;
          return this.field_e;
        }
        return this.field_e;
    }

    VboVertexArray(OpenGlToolkit param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
        try {
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(int param0) {
        this.field_h.a(101, (LegacyVertexArray) (this));
        if (param0 != 34963) {
          byte[] var3 = (byte[]) null;
          this.upload(-36, 18, (byte) 18, (byte[]) null);
        }
    }

    public final void upload(int param0, int param1, byte param2, byte[] param3) {
        try {
          this.a(-114, param3, param1);
          if (param2 > -109) {
            this.getStride(-43);
          }
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wo.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final long getPointer(int param0) {
        int var2 = -17 / ((30 - param0) / 32);
        return 0L;
    }

    public final int getStride(int param0) {
        if (param0 != 26653) {
          this.field_j = 66;
          return this.field_j;
        }
        return this.field_j;
    }

    static {
        field_i = new ft(2);
    }
}
