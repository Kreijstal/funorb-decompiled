/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rkb extends rqa {
    static int field_o;

    rkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, tv param1, faa param2, int param3) {
        int var4_int = 0;
        try {
            param2.h(24335, param3);
            param2.field_e = param2.field_e + 1;
            if (param0 != 0) {
                field_o = -13;
            }
            var4_int = param2.field_e;
            param2.q(-127);
            param1.b(param2, -112);
            param2.r(32712);
            param2.e(param2.field_e + -var4_int, -129);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rkb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              hba.field_o = param0[0].a(123);
              if (param1 < -119) {
                break L1;
              } else {
                field_o = 30;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rkb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = nl.field_m;
            L1: while (true) {
              if (var3_int >= db.field_o.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var5 = aka.field_o[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + whb.field_a;
                    break L2;
                  } else {
                    var6 = lsa.a(db.field_o[var3_int], -118, true);
                    var4 = var4 + pva.field_g;
                    var7 = -(var6 >> 1) + alb.field_b;
                    if (cta.a(var4, (ih.field_e << 1) + var6, (hwa.field_q << 1) + tba.field_o, param2, (byte) -65, -ih.field_e + var7, param0)) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    } else {
                      var4 = var4 + (tba.field_o + pva.field_g + (hwa.field_q << 1));
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "rkb.B(" + param0 + ',' + 3841 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 8;
    }
}
