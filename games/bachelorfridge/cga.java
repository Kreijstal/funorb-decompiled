/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cga extends eo {
    static int field_p;
    static ee field_r;
    boolean field_q;
    boolean field_o;
    volatile boolean field_n;

    abstract byte[] d(byte param0);

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param0 != 255) {
            return true;
          }
          if (param1 != 0) {
            var6 = on.field_s;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (param1 == var4) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "cga.C(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int e(int param0);

    public static void b(boolean param0) {
        if (!param0) {
          field_r = (ee) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    cga() {
        this.field_n = true;
    }

    static {
    }
}
