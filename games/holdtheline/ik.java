/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_e;
    byte[] field_g;
    int field_c;
    int field_j;
    int field_m;
    byte[] field_l;
    int field_b;
    int field_n;
    static int field_a;
    int field_d;
    static int field_i;
    static boolean field_f;
    static String field_k;
    int field_h;

    final static String[] a(byte[] param0, int param1) {
        tn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = ta.a((byte) 72);
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (param0.length <= var4) {
                stackOut_14_0 = var2.c(3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: while (true) {
                  L3: {
                    if (var4 >= param0.length) {
                      break L3;
                    } else {
                      if (param0[var4] == 13) {
                        break L3;
                      } else {
                        if (param0[var4] == 10) {
                          break L3;
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                  var2.a((byte) 112, sm.a(-var3 + var4, var3, -129, param0));
                  L4: while (true) {
                    L5: {
                      if (param0.length <= var4) {
                        break L5;
                      } else {
                        L6: {
                          if (param0[var4] == 13) {
                            break L6;
                          } else {
                            if (param0[var4] != 10) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4++;
                        continue L4;
                      }
                    }
                    var3 = var4;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("ik.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 41);
        }
        return stackIn_15_0;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ne.a(10, param0, true, 106);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ik.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 1 + 41);
        }
        return stackIn_1_0;
    }

    final static vj a(int param0, vj param1, float param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        gj var5 = null;
        lb var6 = null;
        gj stackIn_4_0 = null;
        lb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_5_0 = null;
        gj stackOut_3_0 = null;
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
              if (param0 > 63) {
                break L1;
              } else {
                var4 = null;
                vj discarded$2 = ik.a(-87, (vj) null, -0.22468635439872742f);
                break L1;
              }
            }
            if (param1 instanceof lb) {
              var6 = (lb) (Object) param1;
              stackOut_5_0 = new lb(var6.a(false, param2), var6.field_s, param1.field_k, param1.field_p, param1.field_q);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              var5 = (gj) (Object) param1;
              stackOut_3_0 = new gj(var5.field_t, var5.field_u, (-var5.field_r + var5.field_w) * param2 + var5.field_r, var5.field_w, param1.field_k, param1.field_p, param1.field_q);
              stackIn_4_0 = stackOut_3_0;
              return (vj) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ik.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return (vj) (Object) stackIn_6_0;
    }

    public static void a(byte param0) {
        if (param0 != 109) {
            ik.a((byte) 7);
        }
        field_e = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Start Race";
        field_a = 48;
        field_k = "Powerups have the following effects:";
        field_i = -1;
    }
}
