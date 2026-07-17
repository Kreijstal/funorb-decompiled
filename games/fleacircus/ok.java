/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends wi {
    private int field_N;
    static boolean field_w;
    private int field_K;
    private int field_t;
    private int field_q;
    int field_G;
    private int field_D;
    private int field_O;
    static int[] field_s;
    static int field_L;
    private int field_E;
    private int field_M;
    private int field_u;
    private String field_v;
    int field_H;
    int field_z;
    int field_J;
    private int field_F;
    static bd field_x;
    private int field_r;
    private fa field_I;
    static String field_B;
    int field_C;
    private boolean field_A;
    static dd field_y;

    final boolean a(byte param0) {
        if (param0 >= 67) {
          if (((ok) this).field_C <= ag.field_f) {
            if (((ok) this).field_H <= kc.field_b) {
              if (ag.field_f <= ((ok) this).field_C - -((ok) this).field_G) {
                if (((ok) this).field_H + ((ok) this).field_z < kc.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((ok) this).c(-58);
          if (((ok) this).field_C <= ag.field_f) {
            if (((ok) this).field_H <= kc.field_b) {
              if (ag.field_f <= ((ok) this).field_C - -((ok) this).field_G) {
                if (((ok) this).field_H + ((ok) this).field_z < kc.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void d(int param0) {
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        if (!((ok) this).field_k) {
          ((ok) this).field_c = false;
          ((ok) this).field_J = 0;
          return;
        } else {
          L0: {
            if (!((ok) this).a((byte) 70)) {
              break L0;
            } else {
              if (!((ok) this).field_A) {
                L1: {
                  stackOut_37_0 = this;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_38_0 = stackOut_37_0;
                  if (((ok) this).field_J >= 0) {
                    stackOut_39_0 = this;
                    stackOut_39_1 = ((ok) this).field_J;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L1;
                  } else {
                    stackOut_38_0 = this;
                    stackOut_38_1 = -50;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L1;
                  }
                }
                ((ok) this).field_J = stackIn_40_1;
                break L0;
              } else {
                if (((ok) this).field_A) {
                  if (!((ok) this).a((byte) 71)) {
                    L2: {
                      stackOut_25_0 = this;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (((ok) this).field_J <= 50) {
                        stackOut_27_0 = this;
                        stackOut_27_1 = ((ok) this).field_J;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        break L2;
                      } else {
                        stackOut_26_0 = this;
                        stackOut_26_1 = 50;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        break L2;
                      }
                    }
                    ((ok) this).field_J = stackIn_28_1;
                    if (!((ok) this).a((byte) 77)) {
                      ((ok) this).field_J = ((ok) this).field_J - 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        ((ok) this).field_A = ((ok) this).a((byte) 112);
                        return;
                      }
                    } else {
                      ((ok) this).field_J = ((ok) this).field_J + 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        ((ok) this).field_A = ((ok) this).a((byte) 112);
                        return;
                      }
                    }
                  } else {
                    if (!((ok) this).a((byte) 77)) {
                      ((ok) this).field_J = ((ok) this).field_J - 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        ((ok) this).field_A = ((ok) this).a((byte) 112);
                        return;
                      }
                    } else {
                      ((ok) this).field_J = ((ok) this).field_J + 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        ((ok) this).field_A = ((ok) this).a((byte) 112);
                        return;
                      }
                    }
                  }
                } else {
                  if (!((ok) this).a((byte) 77)) {
                    ((ok) this).field_J = ((ok) this).field_J - 1;
                    if (param0 < 63) {
                      return;
                    } else {
                      ((ok) this).field_A = ((ok) this).a((byte) 112);
                      return;
                    }
                  } else {
                    ((ok) this).field_J = ((ok) this).field_J + 1;
                    if (param0 < 63) {
                      return;
                    } else {
                      ((ok) this).field_A = ((ok) this).a((byte) 112);
                      return;
                    }
                  }
                }
              }
            }
          }
          if (((ok) this).field_A) {
            if (!((ok) this).a((byte) 71)) {
              L3: {
                stackOut_59_0 = this;
                stackIn_61_0 = stackOut_59_0;
                stackIn_60_0 = stackOut_59_0;
                if (((ok) this).field_J <= 50) {
                  stackOut_61_0 = this;
                  stackOut_61_1 = ((ok) this).field_J;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  break L3;
                } else {
                  stackOut_60_0 = this;
                  stackOut_60_1 = 50;
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  break L3;
                }
              }
              ((ok) this).field_J = stackIn_62_1;
              if (!((ok) this).a((byte) 77)) {
                ((ok) this).field_J = ((ok) this).field_J - 1;
                if (param0 >= 63) {
                  ((ok) this).field_A = ((ok) this).a((byte) 112);
                  return;
                } else {
                  return;
                }
              } else {
                ((ok) this).field_J = ((ok) this).field_J + 1;
                if (param0 >= 63) {
                  ((ok) this).field_A = ((ok) this).a((byte) 112);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!((ok) this).a((byte) 77)) {
                ((ok) this).field_J = ((ok) this).field_J - 1;
                if (param0 >= 63) {
                  ((ok) this).field_A = ((ok) this).a((byte) 112);
                  return;
                } else {
                  return;
                }
              } else {
                ((ok) this).field_J = ((ok) this).field_J + 1;
                if (param0 >= 63) {
                  ((ok) this).field_A = ((ok) this).a((byte) 112);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (!((ok) this).a((byte) 77)) {
              ((ok) this).field_J = ((ok) this).field_J - 1;
              if (param0 < 63) {
                return;
              } else {
                ((ok) this).field_A = ((ok) this).a((byte) 112);
                return;
              }
            } else {
              ((ok) this).field_J = ((ok) this).field_J + 1;
              if (param0 < 63) {
                return;
              } else {
                ((ok) this).field_A = ((ok) this).a((byte) 112);
                return;
              }
            }
          }
        }
    }

    public static void b() {
        field_y = null;
        field_s = null;
        field_B = null;
        field_x = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 5 * ((ok) this).field_J;
          var3 = 123 % ((-41 - param0) / 48);
          if (var2 >= 0) {
            break L0;
          } else {
            var2 = 0;
            break L0;
          }
        }
        L1: {
          if (255 < var2) {
            var2 = 255;
            break L1;
          } else {
            break L1;
          }
        }
        if (0 == var2) {
          return;
        } else {
          gb.a(ia.field_q);
          gb.a(((ok) this).field_l, ((ok) this).field_a, ((ok) this).field_l + ((ok) this).field_n, ((ok) this).field_a + ((ok) this).field_d);
          gb.g(1 + ((ok) this).field_l, 1 + ((ok) this).field_a, -2 + ((ok) this).field_n, -2 + ((ok) this).field_d, k.field_a & ((ok) this).field_E, (((ok) this).field_E >>> ii.field_b) * var2 >>> 8);
          int discarded$1 = ((ok) this).field_I.a(((ok) this).field_v, ((ok) this).field_l + ((ok) this).field_O, 1 + ((ok) this).field_a - -((ok) this).field_t, -((ok) this).field_O + (-((ok) this).field_q + ((ok) this).field_n), -2 + ((ok) this).field_d, ((ok) this).field_N & k.field_a, ((ok) this).field_r & k.field_a, (((ok) this).field_N >>> ii.field_b) * var2 >>> 8, ((ok) this).field_u, ((ok) this).field_K, ((ok) this).field_D);
          gb.e(((ok) this).field_l, ((ok) this).field_a, ((ok) this).field_n, ((ok) this).field_d, ((ok) this).field_F & k.field_a, (((ok) this).field_F >>> ii.field_b) * var2 >>> 8);
          gb.b(ia.field_q);
          gb.g(((ok) this).field_l, ((ok) this).field_a - -((ok) this).field_d, ((ok) this).field_n, k.field_a & ((ok) this).field_M, (((ok) this).field_M >>> ii.field_b) * var2 >>> 8);
          gb.c(((ok) this).field_l + ((ok) this).field_n, ((ok) this).field_a, ((ok) this).field_d - 1, k.field_a & ((ok) this).field_M, (((ok) this).field_M >>> ii.field_b) * var2 >>> 8);
          return;
        }
    }

    ok(int param0, int param1, String param2, fa param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((ok) this).field_K = 0;
        ((ok) this).field_N = -16777216;
        ((ok) this).field_O = 5;
        ((ok) this).field_E = -63;
        ((ok) this).field_u = 0;
        ((ok) this).field_M = -2147483648;
        ((ok) this).field_t = 0;
        ((ok) this).field_J = 0;
        ((ok) this).field_F = -16777216;
        ((ok) this).field_r = -1;
        ((ok) this).field_q = 5;
        try {
          L0: {
            ((ok) this).field_I = param3;
            ((ok) this).field_a = param1;
            ((ok) this).field_v = param2;
            ((ok) this).field_l = param0;
            ((ok) this).field_n = ((ok) this).field_q - (-((ok) this).field_O + (-(((ok) this).field_I.b(((ok) this).field_v) / 3) - 5));
            ((ok) this).field_D = ((ok) this).field_I.field_N;
            ((ok) this).field_d = (int)((double)((ok) this).field_I.field_N * ((double)((ok) this).field_I.a(((ok) this).field_v, -((ok) this).field_O + -((ok) this).field_q + ((ok) this).field_n) + 0.5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var5;
            stackOut_3_1 = new StringBuilder().append("ok.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[150];
        field_w = false;
        field_B = "Connection timed out. Please try using a different server.";
    }
}
