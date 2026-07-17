/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    static long field_e;
    static int[] field_c;
    static wk field_f;
    static String field_a;
    private int[] field_d;
    static String field_g;
    static String field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var3 = -1 + (((pq) this).field_d.length >> 1);
          if (param1 == 1) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = ((pq) this).field_d[var4 + (var4 - -1)];
          if (var5 != -1) {
            if (param0 != ((pq) this).field_d[var4 + var4]) {
              var4 = var3 & var4 + 1;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, boolean param14, int param15, int param16) {
        int var42 = 0;
        L0: {
          var42 = Vertigo2.field_L ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (~param7 > ~oo.field_b) {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (0 <= param12) {
                    break L1;
                  } else {
                    if (param8 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param2 < oo.field_q) {
                  break L2;
                } else {
                  if (~oo.field_q < ~param12) {
                    break L2;
                  } else {
                    if (oo.field_q > param8) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    pq(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((pq) this).field_d = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int - -var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (((pq) this).field_d[var4 + (var4 - -1)] == -1) {
                            ((pq) this).field_d[var4 - -var4] = param0[var3];
                            ((pq) this).field_d[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((pq) this).field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("pq.<init>(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static boolean b() {
        gl.field_k = true;
        aj.field_j = 15000L + gk.a(56);
        return hn.field_w == 11 ? true : false;
    }

    final static void a() {
        pe.field_r = false;
        hj.field_b = id.field_f.h(-11) == 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You are on <%0>";
        field_b = "Updates will sent to the email address you've given";
        field_g = "Open";
    }
}
