/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends RuntimeException {
    static int field_b;
    Throwable field_a;
    String field_d;
    static double field_c;

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (-1 != k.field_g) {
                break L1;
              } else {
                if (gb.field_e != -1) {
                  break L1;
                } else {
                  k.field_g = qa.field_a;
                  gb.field_e = ue.field_e;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                oe.field_V = oe.field_V + 1;
                if (param0 != null) {
                  if (param0.equals(tc.field_a)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != tc.field_a) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!vl.field_q) {
                  if (wg.field_e <= oe.field_V) {
                    if (oe.field_V < ue.field_j + wg.field_e) {
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  oe.field_V = 0;
                  break L5;
                } else {
                  if (vl.field_q) {
                    oe.field_V = wg.field_e;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      oe.field_V = 0;
                      break L5;
                    } else {
                      oe.field_V = wg.field_e;
                      break L5;
                    }
                  }
                }
              }
              nj.field_g = gb.field_e;
              bc.field_a = k.field_g;
              if (param0 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  vl.field_q = true;
                  break L2;
                }
              } else {
                vl.field_q = false;
                break L2;
              }
            }
            L6: {
              if (vl.field_q) {
                break L6;
              } else {
                if (wg.field_e <= oe.field_V) {
                  break L6;
                } else {
                  if (!wb.field_a) {
                    break L6;
                  } else {
                    oe.field_V = 0;
                    bc.field_a = k.field_g;
                    nj.field_g = gb.field_e;
                    break L6;
                  }
                }
              }
            }
            L7: {
              tc.field_a = param0;
              if (!vl.field_q) {
                break L7;
              } else {
                if (cl.field_a == oe.field_V) {
                  vl.field_q = false;
                  oe.field_V = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            gb.field_e = -1;
            k.field_g = -1;
            if (param1 >= 69) {
              break L0;
            } else {
              sa.a(false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var2);

            stackIn_41_1 = new StringBuilder().append("sa.B(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L8;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
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
            return (String) null;
        }
        if (!(kd.field_b != tf.field_d)) {
            return oj.field_a;
        }
        return hg.field_d;
    }

    final static boolean a(d param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 37) {
                break L1;
              } else {
                field_c = -0.44199917757712387;
                break L1;
              }
            }
            stackIn_3_0 = param0.b(param1 + -26135);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("sa.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    sa(Throwable param0, String param1) {
        this.field_d = param1;
        this.field_a = param0;
    }

    static {
        field_b = 20;
    }
}
