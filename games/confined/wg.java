/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;
import java.applet.Applet;

final class wg {
    static boolean field_b;
    static int field_c;
    static int field_e;
    static long[] field_d;
    static int field_a;

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        java.applet.Applet stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Frame stackOut_3_0 = null;
        java.applet.Applet stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (null != wh.field_cb) {
              stackOut_3_0 = wh.field_cb;
              stackIn_4_0 = stackOut_3_0;
              return (java.awt.Container) (Object) stackIn_4_0;
            } else {
              if (param0 == -62) {
                stackOut_8_0 = ii.b(false);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (java.awt.Container) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "wg.B(" + param0 + ')');
        }
        return (java.awt.Container) (Object) stackIn_9_0;
    }

    public static void a(byte param0) {
        try {
            field_d = null;
            int var1_int = -12 / ((param0 - -4) / 44);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "wg.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
    }
}
