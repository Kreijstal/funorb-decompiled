/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static double[] field_d;
    static int field_c;
    static un field_b;
    static String field_a;
    static boolean field_e;

    final static void a(byte param0, boolean param1) {
        if (0 < kh.field_d) {
          if (ao.field_Gb) {
            df.g(0, 0, df.field_e, we.field_c.field_J);
            jj.field_a.a(param1, 24960);
            if (param0 >= 16) {
              L0: {
                if (0 < hn.field_h) {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  if (th.field_z <= 0) {
                    break L0;
                  } else {
                    L1: {
                      if (ad.field_h) {
                        df.g(0, 0, df.field_e, we.field_c.field_J);
                        pm.field_n.a(param1, 24960);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            } else {
              L2: {
                field_b = null;
                if (0 < hn.field_h) {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  if (th.field_z <= 0) {
                    break L2;
                  } else {
                    L3: {
                      if (ad.field_h) {
                        df.g(0, 0, df.field_e, we.field_c.field_J);
                        pm.field_n.a(param1, 24960);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (param0 >= 16) {
              if (0 < hn.field_h) {
                if (ad.field_h) {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                } else {
                  return;
                }
              } else {
                if (th.field_z > 0) {
                  L4: {
                    if (ad.field_h) {
                      df.g(0, 0, df.field_e, we.field_c.field_J);
                      pm.field_n.a(param1, 24960);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              field_b = null;
              if (0 < hn.field_h) {
                if (!ad.field_h) {
                  return;
                } else {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                }
              } else {
                if (th.field_z > 0) {
                  L5: {
                    if (ad.field_h) {
                      df.g(0, 0, df.field_e, we.field_c.field_J);
                      pm.field_n.a(param1, 24960);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 >= 16) {
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (th.field_z > 0) {
                L6: {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            field_b = null;
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (th.field_z > 0) {
                if (!ad.field_h) {
                  return;
                } else {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static rc a(eh param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        rc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            var4 = param0.b(param2, 27034);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param1 > 41) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              stackOut_5_0 = new rc(var4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("vm.B(");
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
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_6_0;
    }

    final static pe a(byte param0, ml param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_3_0 = null;
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
            if (param0 == 30) {
              stackOut_3_0 = tm.a(jh.a(param1, 100, 96), param0 ^ 65);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pe) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vm.A(").append(param0).append(44);
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
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> resigned";
    }
}
