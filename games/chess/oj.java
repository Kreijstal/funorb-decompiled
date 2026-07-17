/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    int field_d;
    static ci field_c;
    static String field_g;
    int field_e;
    static String field_b;
    int field_f;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (0 != param0) {
            break L0;
          } else {
            if (sg.field_d != param2) {
              sg.field_d = param2;
              tj.field_l = true;
              pj.b(-6446, param3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1 != param0) {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(-6446, param3);
                break L1;
              }
            }
          } else {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(-6446, param3);
                break L1;
              }
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        int var1 = 5;
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static sa a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        sa var7 = null;
        int var8 = 0;
        sa stackIn_4_0 = null;
        sa stackIn_8_0 = null;
        sa stackIn_11_0 = null;
        sa stackIn_16_0 = null;
        sa stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_3_0 = null;
        sa stackOut_7_0 = null;
        sa stackOut_18_0 = null;
        sa stackOut_15_0 = null;
        sa stackOut_10_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = ef.field_j;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = ok.field_Ob;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = gl.a((byte) -118, '.', param0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      int discarded$4 = 0;
                      stackOut_18_0 = ib.a(var3[var3.length + -1]);
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      int discarded$5 = -55;
                      var7 = ie.a(var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_15_0 = (sa) var7;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = ef.field_j;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("oj.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 86 + 41);
        }
        return stackIn_19_0;
    }

    final static void a(int param0) {
        if (!(ua.field_d == null)) {
            ua.field_d.k((byte) -112);
        }
        hn.field_u = new s();
        nj.field_w.c((mf) (Object) hn.field_u, 78);
    }

    oj(int param0, int param1, int param2) {
        ((oj) this).field_d = param1;
        ((oj) this).field_f = param0;
        ((oj) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Invalid date";
        field_a = "Username: ";
        field_b = "Game full";
    }
}
