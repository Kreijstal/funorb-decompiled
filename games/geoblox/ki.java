/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static dm field_c;
    static rh field_b;
    static int field_d;
    static String field_a;
    static String field_e;

    final static void a(vd param0) {
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
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= oj.field_b) {
                    int dupTemp$4 = param0.c(125);
                    p.field_o[dupTemp$4] = p.field_o[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (oj.field_b <= var3) {
                        oj.field_b = var2_int;
                        int fieldTemp$5 = oj.field_b;
                        oj.field_b = oj.field_b + 1;
                        n.field_k[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param0.field_f == n.field_k[var3].field_f) {
                              var4 = n.field_k[var3].c(124);
                              if (p.field_o[var4] > pc.field_v) {
                                p.field_o[var4] = p.field_o[var4] - 1;
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
                          n.field_k[incrementValue$6] = n.field_k[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (n.field_k[var2_int].field_f != param0.field_f) {
                        break L6;
                      } else {
                        int dupTemp$7 = n.field_k[var2_int].c(124);
                        p.field_o[dupTemp$7] = p.field_o[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                p.field_o[var2_int] = 0;
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
            stackOut_22_1 = new StringBuilder().append("ki.B(");
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 31274 + 41);
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        r.a(rh.field_i, (byte) -61, true, oj.field_a);
        int var1 = -30 % ((param0 - -30) / 36);
        mi.field_I = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dm(540, 140);
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
