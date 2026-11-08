/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements io {
    static Sprite field_a;

    public final void a(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        try {
          if (param0 != 16777215) {
            field_a = (Sprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "kh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static PcmSampleStream a(int param0, boolean param1) {
        tm var2 = new tm(param0);
        kn.field_L.addFirst(0, var2);
        if (param1) {
          return (PcmSampleStream) null;
        }
        return var2.field_j;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        int var1 = -5 % ((-18 - param0) / 41);
    }

    static {
    }
}
