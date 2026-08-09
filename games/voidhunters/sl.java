/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl implements dja {
    static cda[] field_c;
    static boolean field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = 108 / ((param0 - -48) / 59);
        field_c = null;
    }

    final static ha a(d param0, byte param1, int param2, java.awt.Canvas param3) {
        RuntimeException var4 = null;
        ha stackIn_2_0 = null;
        qfa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 16) {
              stackIn_4_0 = new qfa(param3, param0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ha) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("sl.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ha) ((Object) stackIn_4_0);
        }
    }

    final static void a(byte param0, tjb param1) {
        if (!(param1 != null)) {
            return;
        }
        try {
            if (param0 != -28) {
                field_a = 99;
            }
            fkb.field_m = param1;
            tra.field_o.field_lb.e(param0 + 128);
            tra.field_o.b(-561, fkb.field_m);
            uga.field_d = true;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = 91 % ((param0 - -64) / 50);
        return (tv) ((Object) new aib());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = 110;
            return (tv[]) ((Object) new aib[param1]);
        }
        return (tv[]) ((Object) new aib[param1]);
    }

    static {
        field_c = new cda[256];
        field_b = false;
        field_a = 1;
    }
}
