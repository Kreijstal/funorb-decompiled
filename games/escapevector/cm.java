/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends oa {
    int field_z;
    byte[] field_y;
    jg field_x;

    final int g(int param0) {
        if (((cm) this).field_u) {
            return 0;
        }
        if (param0 != 100) {
            ((cm) this).field_z = 124;
            return 100;
        }
        return 100;
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              va.a("", -121, param0);
              de.a(false, param0);
              if (param1 == 21027) {
                break L1;
              } else {
                var3 = null;
                cm.a((java.applet.Applet) null, 73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cm.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param0 & 1;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "cm.B(" + param0 + 44 + param1 + 44 + 96 + 41);
        }
        return stackIn_5_0;
    }

    cm() {
    }

    final byte[] a(boolean param0) {
        if (!param0) {
            int discarded$8 = ((cm) this).g(81);
            if (!(!((cm) this).field_u)) {
                throw new RuntimeException();
            }
            return ((cm) this).field_y;
        }
        if (!(!((cm) this).field_u)) {
            throw new RuntimeException();
        }
        return ((cm) this).field_y;
    }

    static {
    }
}
