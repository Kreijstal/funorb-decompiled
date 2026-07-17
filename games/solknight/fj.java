/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gg {
    static int field_i;
    int[] field_h;
    static String field_j;
    int field_k;

    public static void a(int param0) {
        field_j = null;
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        hd var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            ab.field_s[param5] = param1;
            var8 = 116 / ((-78 - param3) / 48);
            var7_int = 0;
            var9 = ad.field_b;
            var10_ref_int__ = param1;
            var11 = 0;
            L1: while (true) {
              if (var10_ref_int__.length <= var11) {
                var10 = var7_int + 20 >> 1;
                jb.field_a[param5] = 320 - var10;
                bb.field_P[param5] = 320 + var10;
                ah.field_i[param5] = param4;
                si.field_F[param5] = param0;
                if (param5 != 2) {
                  break L0;
                } else {
                  if (!il.b(507)) {
                    jb.field_a[param5] = 30;
                    bb.field_P[param5] = bb.field_P[param5] + 580;
                    ah.field_i[param5] = 399;
                    return;
                  } else {
                    ah.field_i[param5] = 399;
                    return;
                  }
                }
              } else {
                L2: {
                  var12 = var10_ref_int__[var11];
                  var13 = te.field_I[var12];
                  if (var13 != null) {
                    break L2;
                  } else {
                    var13 = "ERROR: missing text";
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (var12 == 12) {
                      break L4;
                    } else {
                      if (var12 != 13) {
                        var14 = var9.b(var13);
                        if (var14 > var7_int) {
                          var7_int = var14;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = 9 + (wb.field_a + 64);
                  if (var7_int < var14) {
                    var7_int = var14;
                    var11++;
                    break L3;
                  } else {
                    var11++;
                    break L3;
                  }
                }
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("fj.C(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a() {
        String var1 = null;
        if (!k.field_b) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != ah.field_e) {
              ah.field_e.f(true);
              break L0;
            } else {
              break L0;
            }
          }
          int discarded$2 = -74;
          var1 = s.o();
          ve.field_a = new bb(var1, (String) null, true, false, false);
          u.field_b.b((rc) (Object) gf.field_cb, 125);
          gf.field_cb.c(-3399, (rc) (Object) ve.field_a);
          gf.field_cb.e(true);
          return;
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Asteroids Approaching <%0><br>Level <%1><br>Get Ready!";
    }
}
