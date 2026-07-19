/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ti {
    static String field_g;
    static boolean field_d;
    static tc field_b;
    static rk field_a;
    static hl[] field_e;
    static vi field_f;
    static int field_c;

    abstract byte[] b(int param0, boolean param1);

    final static int b(int param0, int param1) {
        if (param1 != 2047) {
            field_f = (vi) null;
            return gl.field_b[param0 & 2047];
        }
        return gl.field_b[param0 & 2047];
    }

    public static void a(byte param0) {
        int discarded$2 = 0;
        field_f = null;
        if (param0 != 13) {
          discarded$2 = ti.b(-127, 29);
          field_b = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        rh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            var4 = (rh) ((Object) a.field_f.c(-3905));
            L1: while (true) {
              if (var4 == null) {
                if (param0 > 32) {
                  break L0;
                } else {
                  field_d = false;
                  return;
                }
              } else {
                ha.a(param1, 121, var4);
                var4 = (rh) ((Object) a.field_f.a(-16913));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "ti.B(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int a(int param0, boolean param1);

    abstract ak b(byte param0);

    static {
        field_g = "Connection timed out. Please try using a different server.";
        field_d = false;
        field_c = -1;
    }
}
