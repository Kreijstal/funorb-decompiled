/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends tg {
    static jf field_H;
    private nd field_I;
    int field_K;
    private int field_G;
    int field_J;
    static int[] field_F;
    static int field_N;
    static String field_L;
    static String field_M;

    final static void c(byte param0) {
        if (param0 != -44) {
          return;
        } else {
          nk.field_K = si.a(vm.field_d, new double[3], new double[3]);
          pe.field_j = si.b(nk.field_K);
          return;
        }
    }

    public static void e() {
        field_H = null;
        field_M = null;
        field_L = null;
        field_F = null;
    }

    final static boolean g() {
        int discarded$0 = -31609;
        return ak.b();
    }

    final int a(int param0, int param1) {
        if (~param1 <= param0) {
          if (param1 >= ((gb) this).field_I.a(false)) {
            return -1;
          } else {
            return ((gb) this).field_I.a(param1, (byte) -104);
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 >= -19) {
            return 121;
        }
        return ((gb) this).field_I.a(false);
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              L1: {
                var8_int = -((gb) this).field_J + param6 - param3;
                var9 = -(((gb) this).field_J * 2) + ((gb) this).field_g;
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((gb) this).field_G / var9;
                if (param1 != 1) {
                  if (2 == param1) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((gb) this).field_I.a(param2) <= var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((gb) this).field_I.a((byte) 99, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + ((gb) this).field_I.a(var12, (byte) -18);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var10 = var13;
                            var11 = var12;
                            var12++;
                            break L5;
                          } else {
                            var12++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((gb) this).field_I.b(-1, var8_int);
                  break L3;
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("gb.NA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          bd.field_e = param1;
          hm.field_c = param3;
          we.field_l = 0;
          if (!mf.a(param0 ^ -95, hm.field_c)) {
            break L0;
          } else {
            var4 = 0;
            al.field_j[hm.field_c].a((byte) 119, var4, param2);
            break L0;
          }
        }
        L1: {
          if (hm.field_c == -4) {
            em.field_c = 84.0f;
            ec.field_z = 3.1415927410125732f;
            jk.field_c = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != -2) {
          field_H = null;
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 2147483647) {
            ((gb) this).field_G = 123;
            return ((gb) this).field_G;
        }
        return ((gb) this).field_G;
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_N = 9;
        field_M = "Players: <%0>/<%1>";
    }
}
