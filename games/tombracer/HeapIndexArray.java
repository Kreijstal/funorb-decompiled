/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HeapIndexArray extends ora implements IndexArray {
    private int field_c;
    static BinaryBitmapFont field_d;

    public final long getPointer(int param0) {
        if (param0 != 19135) {
          this.field_c = 80;
          return this.field_b.getAddress();
        }
        return this.field_b.getAddress();
    }

    public final void setIndices(int param0, int param1, byte[] param2, int param3) {
        try {
          this.setData(param2, param0);
          if (param1 != -11783) {
            this.getBufferId(100);
          }
          this.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "o.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int getBufferId(int param0) {
        if (param0 != 9624) {
          this.field_c = 12;
          return 0;
        }
        return 0;
    }

    final static boolean hasAnyMask540800(int param0, int param1, int param2) {
        if (param0 != -1) {
          return true;
        }
        return (540800 & param2) != 0 ? true : false;
    }

    final static boolean e(int param0) {
        if (param0 != 540800) {
          return false;
        }
        if (OpenGlTransform3D.field_e == null) {
          return false;
        }
        if (ProceduralTexture.field_p != LegacyOpenGlTexture1D.field_n) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_d = (BinaryBitmapFont) null;
        }
    }

    public final int getIndexType(int param0) {
        if (param0 != -1771) {
          this.field_c = -125;
          return this.field_c;
        }
        return this.field_c;
    }

    HeapIndexArray(OpenGlToolkit param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
        try {
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
