/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends o {
    int field_n;
    static ci field_l;
    int field_r;
    int field_o;
    static String field_p;
    static int field_k;
    int field_q;
    int field_m;
    int field_s;
    static nb field_j;

    public static void c(byte param0) {
        field_p = null;
        int var1 = -1;
        field_l = null;
        field_j = null;
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ac) this).field_n = param5;
        ((ac) this).field_q = param0;
        ((ac) this).field_m = param1;
        ((ac) this).field_o = param4;
        ((ac) this).field_r = param2;
        ((ac) this).field_s = param3;
    }

    final static em a(nk param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        em stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        em stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            var2_int = param0.e(117, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = r.a(true, param0) ? 1 : 0;
                var4 = r.a(true, param0) ? 1 : 0;
                var5 = new em();
                var5.field_d = (short)param0.e(-58, 16);
                var5.field_z = ml.a(var5.field_z, 16, param0, 119);
                var5.field_a = ml.a(var5.field_a, 16, param0, 78);
                var5.field_H = ml.a(var5.field_H, 16, param0, 50);
                var5.field_e = (short)param0.e(119, 16);
                var5.field_g = ml.a(var5.field_g, 16, param0, 63);
                var5.field_A = ml.a(var5.field_A, 16, param0, 118);
                var5.field_J = ml.a(var5.field_J, 16, param0, 62);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_t = (short)param0.e(-88, 16);
                  var5.field_b = ml.a(var5.field_b, 16, param0, 106);
                  var5.field_f = ml.a(var5.field_f, 16, param0, 42);
                  var5.field_F = ml.a(var5.field_F, 16, param0, 83);
                  var5.field_l = ml.a(var5.field_l, 16, param0, 54);
                  var5.field_C = ml.a(var5.field_C, 16, param0, 52);
                  var5.field_E = ml.a(var5.field_E, 16, param0, 64);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param0.e(-32, 16);
                  var5.field_B = ml.a(var5.field_B, 16, param0, 70);
                  var5.field_N = ml.a(var5.field_N, 16, param0, 89);
                  var5.field_o = ml.a(var5.field_o, 16, param0, 74);
                  var5.field_i = ml.a(var5.field_i, 16, param0, 99);
                  var5.field_R = ml.a(var5.field_R, 16, param0, 116);
                  break L2;
                }
              }
              L3: {
                if (r.a(true, param0)) {
                  var5.field_G = ml.a(var5.field_G, 16, param0, 107);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!r.a(true, param0)) {
                  break L4;
                } else {
                  var5.field_y = rb.a(var5.field_y, (byte) -105, param0, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_y.length) {
                      if (var6 == 0) {
                        var5.field_y = null;
                        break L4;
                      } else {
                        var5.field_j = (byte)(1 + var6);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((255 & var5.field_y[var7]) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_20_0 = (em) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ac.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 1 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "King";
        field_k = -1;
    }
}
