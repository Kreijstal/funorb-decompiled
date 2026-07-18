/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends tm {
    static String field_D;
    static String field_E;
    static String field_B;
    static int[] field_A;
    static double[][][] field_C;

    public static void g(int param0) {
        field_D = null;
        field_E = null;
        field_A = null;
        field_B = null;
        field_C = null;
    }

    uc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int h(byte param0) {
        return -nb.field_k + so.field_e;
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            stackOut_2_0 = new li(hm.a((byte) 120, param1[0].b(-30368)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("uc.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int h(int param0) {
        int var1 = (int)(nj.a(-109) % 1440L) - 1000;
        if (!(var1 <= 0)) {
            return 256 - (var1 % 220 << 8) / 220;
        }
        return -1;
    }

    final static void a(tf param0, int param1) {
        RuntimeException var2 = null;
        gn var2_ref = null;
        gn var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (ia.field_c) {
              ov.a(param0, 0);
              return;
            } else {
              stackOut_5_0 = -27054;
              stackIn_7_0 = stackOut_5_0;
              L1: while (true) {
                if (kk.a(stackIn_7_0, param0)) {
                  if (param1 == -22488) {
                    break L0;
                  } else {
                    var5 = null;
                    uc.a((tf) null, 81);
                    return;
                  }
                } else {
                  var2_ref = param0.g(24009);
                  L2: while (true) {
                    L3: {
                      if (!(var2_ref instanceof ak)) {
                        break L3;
                      } else {
                        if (!(var2_ref.field_d instanceof ak)) {
                          break L3;
                        } else {
                          L4: {
                            var3 = var2_ref.field_d;
                            if (((ak) (Object) var2_ref).a((byte) -13) <= ((ak) (Object) var3).a((byte) 124)) {
                              break L4;
                            } else {
                              var2_ref.c((byte) -109);
                              pa.a(var2_ref, var3, (byte) 126);
                              break L4;
                            }
                          }
                          var2_ref = var3;
                          continue L2;
                        }
                      }
                    }
                    stackOut_6_0 = -27054;
                    stackIn_7_0 = stackOut_6_0;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("uc.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        ml var4 = or.field_d;
        var4.b(param1, (byte) -94);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(108, 6);
        var4.a(param0, -1781890008);
        var4.c(62, var4.field_n - var5);
    }

    final static void g(byte param0) {
        ou.a(0);
        hk.field_G = true;
        po.field_f = true;
        wd.field_l.k(103);
        ku.a(ul.field_a, 4, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_B = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_C = new double[33][33][33];
        field_A = new int[256];
    }
}
