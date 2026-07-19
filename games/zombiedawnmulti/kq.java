/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends java.awt.Canvas {
    private java.awt.Component field_a;
    static byte[] field_b;

    final static void a(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = nn.field_c;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "kq.A(" + param0 + ')');
        }
    }

    kq(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 60) {
            field_b = (byte[]) null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
