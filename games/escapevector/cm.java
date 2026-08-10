/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends oa {
    int field_z;
    byte[] field_y;
    jg field_x;

    final int g(int param0) {
        if (this.field_u) {
            return 0;
        }
        if (param0 != 100) {
            this.field_z = 124;
            return 100;
        }
        return 100;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            va.a("", -121, param0);
            de.a(false, param0);
            if (param1 != 21027) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                cm.a((java.applet.Applet) null, 73);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "cm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        java.applet.Applet var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param2 == 96) {
                break L1;
              } else {
                var5 = (java.applet.Applet) null;
                cm.a((java.applet.Applet) null, 108);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param1 <= 0) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = var3_int << 1837538433 | param0 & 1;
                param1--;
                param0 = param0 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "cm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    cm() {
    }

    final byte[] a(boolean param0) {
        if (!param0) {
            this.g(81);
            if (!(!this.field_u)) {
                throw new RuntimeException();
            }
            return this.field_y;
        }
        if (!(!this.field_u)) {
            throw new RuntimeException();
        }
        return this.field_y;
    }

    static {
    }
}
