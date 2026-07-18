/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends q {
    int field_r;
    int field_m;
    static String field_s;
    int field_o;
    static String field_t;
    long field_l;
    int field_p;
    int field_j;
    int[] field_k;
    int field_n;
    int field_q;

    final static void a(int param0, hi param1) {
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
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= kb.field_b) {
                    int dupTemp$4 = param1.a((byte) -72);
                    oc.field_b[dupTemp$4] = oc.field_b[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (kb.field_b <= var3) {
                        kb.field_b = var2_int;
                        int fieldTemp$5 = kb.field_b;
                        kb.field_b = kb.field_b + 1;
                        hi.field_j[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param1.field_f == hi.field_j[var3].field_f) {
                              var4 = hi.field_j[var3].a((byte) -72);
                              if (kl.field_r < oc.field_b[var4]) {
                                oc.field_b[var4] = oc.field_b[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          hi.field_j[incrementValue$6] = hi.field_j[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (hi.field_j[var2_int].field_f != param1.field_f) {
                        break L6;
                      } else {
                        int dupTemp$7 = hi.field_j[var2_int].a((byte) -72);
                        oc.field_b[dupTemp$7] = oc.field_b[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                oc.field_b[var2_int] = 0;
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
            stackOut_22_1 = new StringBuilder().append("wc.C(").append(10842).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                var4 = -59 % ((-3 - param0) / 47);
                stackOut_4_0 = var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = -var3 + ((var3 << 5) - -ka.a(false, param1.charAt(var4)));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 != 0) {
            wc.a(47);
        }
        field_t = null;
    }

    final static boolean a(boolean param0, int param1) {
        if ((fa.field_b & 1 << param1) != 0) {
            return true;
        }
        if (m.field_w[param1] == -1) {
            return true;
        }
        boolean discarded$4 = wc.a(false, -49);
        if (!ia.a(-22426, m.field_w[param1])) {
            return false;
        }
        return true;
    }

    final static void a(qp param0, byte param1, int param2) {
        try {
            tl.field_p.a((byte) 54, (q) (Object) param0);
            l.a(4, param0, 1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "wc.E(" + (param0 != null ? "{...}" : "null") + ',' + 99 + ',' + 4 + ')');
        }
    }

    wc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((wc) this).field_m = param1;
            ((wc) this).field_k = param6;
            ((wc) this).field_r = param3;
            ((wc) this).field_p = param2;
            ((wc) this).field_j = param5;
            ((wc) this).field_o = param4;
            int fieldTemp$0 = cq.field_u;
            cq.field_u = cq.field_u + 1;
            ((wc) this).field_q = 65535 & fieldTemp$0;
            ((wc) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "From only <%0>/month";
    }
}
