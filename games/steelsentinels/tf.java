/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static StringBuilder field_g;
    static gh field_a;
    static boolean field_b;
    static String field_f;
    static int field_c;
    static wk field_e;
    static String[] field_d;

    final static void a(na param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= uc.field_a) {
                    int dupTemp$4 = param0.a((byte) 58);
                    uf.field_a[dupTemp$4] = uf.field_a[dupTemp$4] + 1;
                    if (param1 < -103) {
                      var2_int = 0;
                      var3 = 0;
                      L3: while (true) {
                        if (uc.field_a <= var3) {
                          uc.field_a = var2_int;
                          int fieldTemp$5 = uc.field_a;
                          uc.field_a = uc.field_a + 1;
                          ph.field_e[fieldTemp$5] = param0;
                          break L0;
                        } else {
                          L4: {
                            L5: {
                              if (ph.field_e[var3].field_k == param0.field_k) {
                                var4 = ph.field_e[var3].a((byte) 58);
                                if (cj.field_h >= uf.field_a[var4]) {
                                  break L5;
                                } else {
                                  uf.field_a[var4] = uf.field_a[var4] - 1;
                                  break L4;
                                }
                              } else {
                                break L5;
                              }
                            }
                            int incrementValue$6 = var2_int;
                            var2_int++;
                            ph.field_e[incrementValue$6] = ph.field_e[var3];
                            break L4;
                          }
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      if (param0.field_k == ph.field_e[var2_int].field_k) {
                        int dupTemp$7 = ph.field_e[var2_int].a((byte) 58);
                        uf.field_a[dupTemp$7] = uf.field_a[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                uf.field_a[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("tf.C(");
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
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != qf.field_e) {
            pb.f(pb.field_i, pb.field_l, -pb.field_i + pb.field_b, pb.field_d - pb.field_l);
            qf.field_e.a(param1, (byte) 127);
        }
        field_a = null;
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32) {
            if (!(param1 > 126)) {
                return true;
            }
        }
        if (param1 >= 160) {
            if (param1 <= 255) {
                return true;
            }
        }
        if (param1 != 8364) {
            if (338 != param1) {
                if (8212 != param1) {
                    if (param1 != 339) {
                        if (param1 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new StringBuilder(80);
        field_f = "Loading music";
        field_d = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
