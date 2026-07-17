/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static boolean field_f;
    static String field_a;
    static int field_b;
    static int field_d;
    static int field_c;
    static eg field_e;

    final static dd[] a(dd[] param0) {
        RuntimeException var2 = null;
        dd[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_0_0 = null;
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
            param0[3].field_y = param0[3].field_A;
            param0[1].field_w = param0[1].field_z;
            param0[5].field_y = param0[5].field_A;
            param0[7].field_w = param0[7].field_z;
            stackOut_0_0 = (dd[]) param0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gn.A(");
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -29 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1) {
        if (wg.field_Nb != null) {
          if (param0 > wg.field_Nb.length) {
            wg.field_Nb = new int[param0 * 2];
            if (kb.field_g == null) {
              kb.field_g = new int[param0 * 2];
              if (null != ob.field_y) {
                if (ob.field_y.length >= param0) {
                  return;
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              } else {
                ob.field_y = new int[param0 * 2];
                return;
              }
            } else {
              if (param0 <= kb.field_g.length) {
                if (null != ob.field_y) {
                  if (ob.field_y.length < param0) {
                    ob.field_y = new int[param0 * 2];
                    return;
                  } else {
                    return;
                  }
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              } else {
                kb.field_g = new int[param0 * 2];
                if (null != ob.field_y) {
                  if (ob.field_y.length >= param0) {
                    return;
                  } else {
                    ob.field_y = new int[param0 * 2];
                    return;
                  }
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              }
            }
          } else {
            if (kb.field_g == null) {
              kb.field_g = new int[param0 * 2];
              if (null != ob.field_y) {
                if (ob.field_y.length < param0) {
                  ob.field_y = new int[param0 * 2];
                  return;
                } else {
                  return;
                }
              } else {
                ob.field_y = new int[param0 * 2];
                return;
              }
            } else {
              if (param0 <= kb.field_g.length) {
                if (null != ob.field_y) {
                  if (ob.field_y.length < param0) {
                    ob.field_y = new int[param0 * 2];
                    return;
                  } else {
                    return;
                  }
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              } else {
                kb.field_g = new int[param0 * 2];
                if (null != ob.field_y) {
                  if (ob.field_y.length < param0) {
                    ob.field_y = new int[param0 * 2];
                    return;
                  } else {
                    return;
                  }
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              }
            }
          }
        } else {
          wg.field_Nb = new int[param0 * 2];
          if (kb.field_g != null) {
            if (param0 > kb.field_g.length) {
              kb.field_g = new int[param0 * 2];
              if (null != ob.field_y) {
                if (ob.field_y.length >= param0) {
                  return;
                } else {
                  ob.field_y = new int[param0 * 2];
                  return;
                }
              } else {
                ob.field_y = new int[param0 * 2];
                return;
              }
            } else {
              L0: {
                L1: {
                  if (null == ob.field_y) {
                    break L1;
                  } else {
                    if (ob.field_y.length >= param0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                ob.field_y = new int[param0 * 2];
                break L0;
              }
              return;
            }
          } else {
            L2: {
              L3: {
                kb.field_g = new int[param0 * 2];
                if (null == ob.field_y) {
                  break L3;
                } else {
                  if (ob.field_y.length >= param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ob.field_y = new int[param0 * 2];
              break L2;
            }
            return;
          }
        }
    }

    final static eg a(eg param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        eg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.field_q.length <= var2_int) {
                int discarded$1 = 38;
                jf.a(param0);
                param0.a();
                stackOut_5_0 = (eg) param0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                param0.field_q[var2_int] = -param0.field_q[var2_int];
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("gn.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 5 + 41);
        }
        return stackIn_6_0;
    }

    public static void a() {
        field_e = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Now you have potted a ball, that group - either spots (balls 1-7) or stripes (balls 9-15) - becomes yours. Your objective is now to pot the rest of the balls of your group, then the black ball. You must always hit one of your balls first!";
        field_c = 50;
    }
}
