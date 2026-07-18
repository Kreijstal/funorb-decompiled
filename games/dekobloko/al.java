/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al implements gl {
    static String field_a;
    private int field_i;
    private int field_f;
    static String field_j;
    private int field_d;
    private mm field_g;
    private int field_c;
    private int field_b;
    private int field_e;
    static ha field_h;
    private int field_k;

    public static void a() {
        field_a = null;
        field_h = null;
        field_j = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) ik.field_f);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ik.field_f);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) ik.field_f);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "al.D(" + -2204 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ai var14 = null;
        ce stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ce stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof ai)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ce) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ce) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (ai) (Object) stackIn_3_0;
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              hk.a(param1 + param4.field_u, param2 + param4.field_D, param4.field_t, param4.field_y, ((al) this).field_d);
              var7 = param1 - (-param4.field_u + -var14.field_O);
              var8 = param2 - -param4.field_D - -var14.field_V;
              hk.e(var7, var8, var14.field_K, ((al) this).field_f);
              if (var14.field_S == -1) {
                break L3;
              } else {
                var9 = 3.141592653589793 * (double)var14.field_S * 2.0 / (double)var14.field_Q;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
                var12 = (int)(Math.cos(var9) * (double)var14.field_K);
                hk.e(var11 + var7, var8 - -var12, 1, ((al) this).field_e);
                break L3;
              }
            }
            L4: {
              hk.e(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_R * 2.0 / (double)var14.field_Q;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
              var12 = (int)(Math.cos(var9) * (double)var14.field_K);
              hk.b(var7, var8, var11 + var7, var8 - -var12, 1);
              if (((al) this).field_g != null) {
                var13 = ((al) this).field_k + (var14.field_K + var14.field_O);
                int discarded$1 = ((al) this).field_g.a(param4.field_E, param1 - (-param4.field_u - var13), param4.field_D + (param2 + ((al) this).field_b), -((al) this).field_k - (var13 - param4.field_t), param4.field_y + -(((al) this).field_k << 1), ((al) this).field_c, ((al) this).field_i, 1, 1, 0);
                break L4;
              } else {
                break L4;
              }
            }
            if (param3 <= -60) {
              break L0;
            } else {
              field_j = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("al.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        d.field_f = null;
        hd.field_n = 0;
        rk.field_L = null;
        var2 = cb.field_c;
        cb.field_c = gm.field_H;
        if (51 != param1) {
          if (param1 != 50) {
            ta.field_k.field_o = 1;
            ta.field_k.field_j = ta.field_k.field_j + 1;
            gm.field_H = var2;
            if (ta.field_k.field_j < 2) {
              L0: {
                if (2 > ta.field_k.field_j) {
                  break L0;
                } else {
                  if (param1 != 50) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (ta.field_k.field_j < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (51 == param1) {
                return 2;
              } else {
                L1: {
                  if (2 > ta.field_k.field_j) {
                    break L1;
                  } else {
                    if (param1 != 50) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ta.field_k.field_j < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            ta.field_k.field_o = 5;
            ta.field_k.field_j = ta.field_k.field_j + 1;
            gm.field_H = var2;
            if (ta.field_k.field_j < 2) {
              L2: {
                if (2 > ta.field_k.field_j) {
                  break L2;
                } else {
                  if (param1 != 50) {
                    break L2;
                  } else {
                    return 5;
                  }
                }
              }
              if (ta.field_k.field_j < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (51 == param1) {
                return 2;
              } else {
                L3: {
                  if (2 > ta.field_k.field_j) {
                    break L3;
                  } else {
                    if (param1 != 50) {
                      break L3;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ta.field_k.field_j < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          ta.field_k.field_o = 2;
          ta.field_k.field_j = ta.field_k.field_j + 1;
          gm.field_H = var2;
          if (ta.field_k.field_j >= 2) {
            if (51 == param1) {
              return 2;
            } else {
              if (2 <= ta.field_k.field_j) {
                if (param1 != 50) {
                  if (ta.field_k.field_j < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (ta.field_k.field_j < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (2 <= ta.field_k.field_j) {
              if (param1 == 50) {
                return 5;
              } else {
                if (ta.field_k.field_j < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              if (ta.field_k.field_j < 4) {
                return -1;
              } else {
                return 1;
              }
            }
          }
        }
    }

    al(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((al) this).field_g = param0;
            ((al) this).field_i = param4;
            ((al) this).field_c = param3;
            ((al) this).field_e = param6;
            ((al) this).field_d = param7;
            ((al) this).field_f = param5;
            ((al) this).field_b = param2;
            ((al) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Friends";
        field_j = "Updates will sent to the email address you've given";
    }
}
