/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uca {
    int field_e;
    static double field_b;
    static qea field_c;
    static int field_a;
    static int field_d;
    static iu[] field_f;

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mu var7 = null;
        mu var8 = null;
        kh var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        Object stackOut_15_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            if (fs.a(true, var10)) {
              if (ae.field_g == 2) {
                var8 = wp.a(94, param0);
                if (var8 == null) {
                  stackOut_9_0 = gl.a((byte) 88, hoa.field_m, new String[1]);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  vg discarded$2 = fla.field_f.a(-13854, (vg) (Object) var8);
                  L1: while (true) {
                    var7 = (mu) (Object) fla.field_f.e(115);
                    if (var7 != null) {
                      var7.field_Db = var7.field_Db - 1;
                      continue L1;
                    } else {
                      var8.p(19);
                      var8.c(-7975);
                      ii.field_a = ii.field_a - 1;
                      var9 = ql.field_k;
                      var9.k(param2, -2988);
                      var9.field_h = var9.field_h + 1;
                      var5 = var9.field_h;
                      var9.i(1, 0);
                      var9.a(param0, false);
                      var9.d(var9.field_h - var5, (byte) -113);
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = dga.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = pk.field_v;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("uca.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 102 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_16_0;
    }

    public static void a(int param0) {
        int var1 = -39;
        field_f = null;
        field_c = null;
    }

    final static void a(int param0, toa param1, byte param2) {
        kh var5 = null;
        int var4 = 0;
        try {
            var5 = ql.field_k;
            var5.k(5, -2988);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.i(1, 0);
            var5.i(param1.field_i, 0);
            var5.e(-5338, param1.field_k);
            var5.a(param1.field_h, (byte) -22);
            var5.a(param1.field_m, (byte) 102);
            var5.a(param1.field_l, (byte) -1);
            var5.a(param1.field_g, (byte) -90);
            int discarded$0 = var5.g(var4, 64);
            var5.d(-var4 + var5.field_h, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uca.C(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + 93 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.atan2(1.0, 0.0);
        field_c = new qea(new int[1]);
        field_a = -1;
    }
}
