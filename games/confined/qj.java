/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static bi field_b;
    static int[] field_c;
    static String field_d;
    static String field_a;

    final static void a(int param0, boolean param1) {
        fb.field_a.a(param1, 64187);
        int var2 = 0;
    }

    public static void b() {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void a(nf[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  L2: {
                    var6_int = param0[0].field_t;
                    var7 = param0[2].field_t;
                    var8 = param0[1].field_t;
                    param0[0].b(param4, param1, param5);
                    param0[2].b(-var7 + param4 + param2, param1, param5);
                    fn.b(hj.field_l);
                    if (param3 > 43) {
                      break L2;
                    } else {
                      var12 = null;
                      qj.a((nf[]) null, 54, 102, 49, -15, -58);
                      break L2;
                    }
                  }
                  fn.f(param4 + var6_int, param1, -var7 + param2 + param4, param1 + param0[1].field_x);
                  var9 = var6_int + param4;
                  var10 = -var7 + (param2 + param4);
                  param4 = var9;
                  L3: while (true) {
                    if (var10 <= param4) {
                      fn.a(hj.field_l);
                      break L0;
                    } else {
                      param0[1].b(param4, param1, param5);
                      param4 = param4 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("qj.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static String a() {
        if (oe.field_Q == wh.field_fb) {
            return rd.field_Jb;
        }
        if (!fb.field_a.c(17237)) {
            return fb.field_a.a(108);
        }
        if (!(na.field_S != wh.field_fb)) {
            return fb.field_a.a(81);
        }
        return kj.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Start Game";
        field_c = new int[12];
        field_a = "<col=FFFFFF>Click and hold</col> to fire your basic energy weapon!";
    }
}
