/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends tc {
    static ec field_B;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var2 = param0 * (param0 * param0 >> -901373652) >> 285548268;
        if (param1 <= 63) {
          jm.a(-123, 65);
          var3 = 6 * param0 + -61440;
          var4 = (var3 * param0 >> -123943188) + 40960;
          return var2 * var4 >> -1975494484;
        } else {
          var3 = 6 * param0 + -61440;
          var4 = (var3 * param0 >> -123943188) + 40960;
          return var2 * var4 >> -1975494484;
        }
    }

    final static void a(String param0, String param1, int param2) {
        if (kk.field_i != null) {
            kk.field_i.h((byte) -34);
        }
        he.field_a = new ih(param1, param0, false, true, true);
        if (param2 != -901373652) {
            return;
        }
        try {
            bm.field_d.b(20, he.field_a);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String b(int param0, ga param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 12307) {
                break L1;
              } else {
                field_B = (ec) null;
                break L1;
              }
            }
            stackIn_3_0 = mo.a(95, param1.field_o.length(), '*');
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    jm(int param0) {
        this(ia.field_e, param0);
    }

    private jm(rb param0, int param1) {
        super(param0, param1);
    }

    public static void a(boolean param0) {
        field_B = null;
        if (param0) {
            field_B = (ec) null;
        }
    }

    static {
    }
}
