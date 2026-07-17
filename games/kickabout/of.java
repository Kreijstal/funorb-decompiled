/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class of {
    static int field_e;
    static hd[] field_d;
    static vn field_f;
    static String field_b;
    static String field_c;
    static int field_a;

    public static void a() {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static String a(int param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        gg var7 = null;
        gg var8 = null;
        ml var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_17_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            int discarded$4 = -9907;
            if (!ef.a(var10)) {
              stackOut_3_0 = kq.field_Ib;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (ts.field_d == 2) {
                int discarded$5 = 40;
                var8 = tr.a(param2);
                if (var8 == null) {
                  stackOut_10_0 = vo.a((byte) -18, af.field_c, new String[1]);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  gn discarded$6 = ne.field_I.b(-7584, (gn) (Object) var8);
                  L1: while (true) {
                    var7 = (gg) (Object) ne.field_I.c(33);
                    if (var7 == null) {
                      L2: {
                        var8.c((byte) -109);
                        var8.f(25);
                        bc.field_d = bc.field_d - 1;
                        var9 = or.field_d;
                        var9.b(param0, (byte) -85);
                        var9.field_n = var9.field_n + 1;
                        var5 = var9.field_n;
                        var9.a(123, 1);
                        var9.a(14190, param2);
                        if (param1 >= 4) {
                          break L2;
                        } else {
                          int discarded$7 = 0;
                          of.a();
                          break L2;
                        }
                      }
                      var9.c(62, var9.field_n - var5);
                      stackOut_17_0 = null;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var7.field_Cb = var7.field_Cb - 1;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_6_0 = kh.field_t;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("of.B(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return (String) (Object) stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "lost";
        field_b = "<%0> is already on your ignore list.";
    }
}
