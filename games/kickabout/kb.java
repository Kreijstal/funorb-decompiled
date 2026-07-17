/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends tm {
    static boolean field_C;
    static ut[] field_E;
    static String field_D;
    static eg[] field_B;

    public static void g(int param0) {
        field_D = null;
        field_B = null;
        field_E = null;
    }

    kb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 84) {
              stackOut_3_0 = new li((Object) (Object) wi.a(-31182, (int[]) param1[0].field_d));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (li) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kb.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(param0 <= 0)) {
            var2 = 1;
            if (!(65535 >= param0)) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!(param0 <= 255)) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (param0 > 15) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(1 >= param0)) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (param0 < -2) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ut[][] var4 = null;
        ut var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (ae.field_C == null) {
              return;
            } else {
              var1_int = cq.field_g;
              if (param0 < -49) {
                var2 = 0;
                L1: while (true) {
                  if (2 <= var2) {
                    break L0;
                  } else {
                    L2: {
                      var3 = 102 * var2 + 20;
                      on.a(var1_int, var3, 160, 92, 12, 65793, 128);
                      un.field_d.d(ao.field_f[var2].toLowerCase(), 80 + var1_int, var3 - -20, 16777215, -1);
                      var4 = ae.field_C[var2];
                      var4[0][1].b(14 + var1_int, 49 + var3, 20, 20);
                      var4[1][1].b(var1_int + 52, var3 + 49, 20, 20);
                      var4[2][1].b(19 + (14 + var1_int), 1 + (var3 + 29), 20, 20);
                      var4[3][1].b(20 + (var1_int - -13), 49 + var3, 20, 20);
                      pb.field_C.d(tj.field_g, 14 + (var1_int - -20) - -10, 20 + var3 + 65, 16777215, -1);
                      if (ks.field_e > 1) {
                        pb.field_C.d(nr.field_k, 115 + var1_int, 20 + (var3 + 65), 16777215, -1);
                        var5 = kd.field_y[var2][1];
                        var6 = 180 * var5.field_o >> 8;
                        var7 = 180 * var5.field_v >> 8;
                        var5.b(-(var6 >> 1) + (160 + cq.field_g - 46), var3 + 50, var6, var7);
                        var2++;
                        break L2;
                      } else {
                        var2++;
                        break L2;
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "kb.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please select an option in the '<%0>' row.";
        field_B = new eg[5];
    }
}
