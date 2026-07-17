/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends oj {
    int field_z;
    static String field_y;
    int field_E;
    static float field_C;
    static int field_B;
    static boolean field_D;
    static int field_F;

    public static void g(int param0) {
        if (param0 >= -63) {
            q.g(6);
        }
        field_y = null;
    }

    final static void a(boolean param0, String param1) {
        try {
            int discarded$0 = -65;
            fp.a(param1);
            int discarded$1 = -1;
            af.a(false, lo.field_o);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "q.D(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(byte param0, boolean param1) {
        if (param1) {
            System.out.println("Teleport disappear event debug");
            System.out.println("Unit at " + ((q) this).field_z + "," + ((q) this).field_E);
        }
        String var3 = "EventTelepop: pos: (" + ((q) this).field_z + "," + ((q) this).field_E + ")";
        int var4 = -35 % ((param0 - 53) / 51);
        return var3;
    }

    q(int param0, int param1) {
        ((q) this).field_E = param1;
        ((q) this).field_z = param0;
        ((q) this).field_m = 6;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                String discarded$2 = ((q) this).a((byte) -47, true);
                break L1;
              }
            }
            stackOut_2_0 = ((q) this).a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("q.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        try {
            if (param1 != -26661) {
                ((q) this).field_E = -18;
            }
            if (!((q) this).field_w.field_bb) {
                ((q) this).field_w.e(param1 + 26574);
            } else {
                var5 = param0.c(((q) this).field_E, true, ((q) this).field_z);
                var6 = var5;
                var6.field_bb = false;
                ((q) this).field_w.d(param1 ^ 26707);
            }
            fl.a(param0, -112);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "q.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16) {
        int var42 = 0;
        L0: {
          var42 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param11 < 0) {
            break L0;
          } else {
            if (~param15 > ~tm.field_q) {
              L1: {
                if (param14 >= 0) {
                  break L1;
                } else {
                  if (param12 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param9) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (~param14 > ~tm.field_l) {
                  break L2;
                } else {
                  if (tm.field_l > param12) {
                    break L2;
                  } else {
                    if (~tm.field_l >= ~param9) {
                      return;
                    } else {
                      break L2;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has withdrawn a draw offer";
        field_D = false;
    }
}
