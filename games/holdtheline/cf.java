/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cf extends jj {
    static el field_r;
    static boolean field_y;
    static int field_v;
    static ah field_z;
    private Object field_x;
    static int field_q;
    static va field_u;
    static int field_w;
    static oa field_s;
    static String field_t;

    final boolean g(int param0) {
        int var2 = 119 % ((param0 - 1) / 61);
        return false;
    }

    final Object b(byte param0) {
        if (param0 != 66) {
            field_z = null;
        }
        return ((cf) this).field_x;
    }

    public static void c(byte param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        field_u = null;
        field_z = null;
        if (param0 != 109) {
            cf.c((byte) -112);
        }
    }

    final static String a(CharSequence param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          var3 = ld.a(false, false, param0);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 >= param0.length()) {
                return null;
              } else {
                if (vb.a(332243496, param0.charAt(var4))) {
                  var4++;
                  continue L0;
                } else {
                  stackOut_8_0 = od.field_r;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("cf.I(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -28 + ',' + false + ')');
        }
    }

    final static void h() {
        int var1 = -63;
        go.a(0, 17);
    }

    cf(Object param0, int param1) {
        super(param1);
        try {
            ((cf) this).field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = false;
        field_v = 0;
        field_z = new ah();
        field_t = "Steer right";
    }
}
