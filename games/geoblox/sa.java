/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends RuntimeException {
    static int field_b;
    Throwable field_a;
    String field_d;
    static double field_c;

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (-1 != k.field_g) {
              break L0;
            } else {
              if (gb.field_e != -1) {
                break L0;
              } else {
                k.field_g = qa.field_a;
                gb.field_e = ue.field_e;
                break L0;
              }
            }
          }
          L1: {
            L2: {
              oe.field_V = oe.field_V + 1;
              if (param0 != null) {
                if (param0.equals((Object) (Object) tc.field_a)) {
                  break L1;
                } else {
                  break L2;
                }
              } else {
                if (null != tc.field_a) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!vl.field_q) {
                if (wg.field_e <= oe.field_V) {
                  if (oe.field_V < ue.field_j + wg.field_e) {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_16_0 = stackOut_13_0;
                    break L3;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_16_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_16_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var2_int = stackIn_16_0;
              if (param0 == null) {
                oe.field_V = 0;
                break L4;
              } else {
                if (vl.field_q) {
                  oe.field_V = wg.field_e;
                  break L4;
                } else {
                  if (var2_int == 0) {
                    oe.field_V = 0;
                    break L4;
                  } else {
                    oe.field_V = wg.field_e;
                    break L4;
                  }
                }
              }
            }
            nj.field_g = gb.field_e;
            bc.field_a = k.field_g;
            if (param0 == null) {
              if (var2_int == 0) {
                break L1;
              } else {
                vl.field_q = true;
                break L1;
              }
            } else {
              vl.field_q = false;
              break L1;
            }
          }
          L5: {
            if (vl.field_q) {
              break L5;
            } else {
              if (wg.field_e <= oe.field_V) {
                break L5;
              } else {
                if (!wb.field_a) {
                  break L5;
                } else {
                  oe.field_V = 0;
                  bc.field_a = k.field_g;
                  nj.field_g = gb.field_e;
                  break L5;
                }
              }
            }
          }
          tc.field_a = param0;
          if (!vl.field_q) {
            gb.field_e = -1;
            k.field_g = -1;
            return;
          } else {
            if (cl.field_a == oe.field_V) {
              vl.field_q = false;
              oe.field_V = 0;
              gb.field_e = -1;
              k.field_g = -1;
              return;
            } else {
              gb.field_e = -1;
              k.field_g = -1;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("sa.B(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L6;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + 72 + 41);
        }
    }

    final static void b(boolean param0) {
        int var1 = (int)(201.0f / og.field_r * ij.field_ab + 0.5f);
        kb.field_c = var1;
        if (!param0) {
            field_b = -10;
            return;
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
            return null;
        }
        if (!(kd.field_b != tf.field_d)) {
            return oj.field_a;
        }
        return hg.field_d;
    }

    final static boolean a(d param0, byte param1) {
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
            stackOut_0_0 = param0.b(-26098);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sa.D(");
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 37 + 41);
        }
        return stackIn_1_0;
    }

    sa(Throwable param0, String param1) {
        ((sa) this).field_d = param1;
        ((sa) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
    }
}
