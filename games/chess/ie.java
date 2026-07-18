/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int field_a;
    static le field_b;
    static String field_c;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    final static void b() {
        km var1 = null;
        km var2 = null;
        int var3 = 0;
        int var4 = Chess.field_G;
        try {
            var1 = new km(540, 140);
            tl.a((byte) -67, var1);
            nh.a();
            wb.b();
            sl.field_a = 0;
            int discarded$0 = 9;
            di.k();
            var2 = var1.c();
            for (var3 = 0; var3 < 15; var3++) {
                var2.c(-2, -2, 16777215);
                wb.e(4, 4, 0, 0, 540, 140);
            }
            tg.field_u.e();
            var1.c(0, 0);
            int discarded$1 = 28773;
            fd.a();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ie.C(" + 540 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = Chess.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0 <= 0) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = param2 & 1 | var3_int << 1;
                param2 = param2 >>> 1;
                param0--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "ie.B(" + param0 + ',' + -1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static sa a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sa stackIn_6_0 = null;
        sa stackIn_9_0 = null;
        sa stackIn_19_0 = null;
        sa stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_5_0 = null;
        sa stackOut_18_0 = null;
        sa stackOut_21_0 = null;
        sa stackOut_8_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = Chess.field_G;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_5_0 = ef.field_j;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            if (63 >= var2_int) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (var3 == -1 + var2_int) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_18_0 = wh.field_b;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (-1 != oc.field_m.indexOf(var4)) {
                        break L1;
                      } else {
                        stackOut_21_0 = wh.field_b;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_8_0 = ok.field_Ob;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("ie.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + -55 + ')');
        }
    }

    final static void a(boolean param0, byte param1, int param2) {
        dh var4_ref_dh = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        int discarded$0 = -128;
        ve var3 = ca.a(param0, param2);
        if (!(var3 == null)) {
            pi.field_d.a(0, false);
            var4_ref_dh = pi.field_d;
            var5_ref_String = ef.field_m;
            var4_ref_dh.field_b.a((byte) -12, var5_ref_String, 5);
            var4_ref_dh = pi.field_d;
            var5 = re.field_m;
            var6 = ag.field_f;
            var4_ref_dh.field_b.a(true, var5, 0, var6, 0);
        }
        int var4 = -89;
        vc.a((byte) 68, param0, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email is valid";
        field_a = 0;
    }
}
