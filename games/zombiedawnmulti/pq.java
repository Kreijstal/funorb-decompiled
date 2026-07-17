/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends br {
    private int field_n;
    private int field_k;
    private int field_h;
    static ip field_p;
    private int field_j;
    private int field_g;
    private uj field_q;
    private int field_l;
    static ri field_o;
    private int field_i;
    static int field_f;
    static int[] field_m;

    final void c(int param0) {
        ((pq) this).field_j = 0;
        if (param0 != -24421) {
          field_o = null;
          ((pq) this).field_k = ((pq) this).field_i;
          return;
        } else {
          ((pq) this).field_k = ((pq) this).field_i;
          return;
        }
    }

    final void a(int param0, nm param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.c(((pq) this).field_g, -20126);
              var4 = param1.d(((pq) this).field_l, param0 ^ 130);
              ((pq) this).field_q.h(sd.b(12, var4, var3_int));
              if (param0 < var3_int) {
                break L1;
              } else {
                if (255 > var4) {
                  break L1;
                } else {
                  if (var3_int > 896) {
                    break L1;
                  } else {
                    if (var4 > 736) {
                      break L1;
                    } else {
                      L2: {
                        if (((pq) this).field_j < 256) {
                          stackOut_8_0 = (-((pq) this).field_h + 256) * ((pq) this).field_j >> 10;
                          stackIn_9_0 = stackOut_8_0;
                          break L2;
                        } else {
                          stackOut_7_0 = 256 + -((pq) this).field_h >> 2;
                          stackIn_9_0 = stackOut_7_0;
                          break L2;
                        }
                      }
                      var5 = stackIn_9_0;
                      oo.d(var3_int, var4, ((pq) this).field_h, 0, var5);
                      g.a(ud.field_P, var3_int + -256, -256 + var4, ((pq) this).field_j);
                      break L0;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("pq.F(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1) {
          L0: {
            pq.a((byte) -103);
            var4 = param0 + -((pq) this).field_g;
            var5 = -((pq) this).field_l + param2;
            if (67600 <= var4 * var4 - -(var5 * var5)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            var4 = param0 + -((pq) this).field_g;
            var5 = -((pq) this).field_l + param2;
            if (67600 <= var4 * var4 - -(var5 * var5)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((pq) this).field_l = param0;
        ((pq) this).field_g = param1;
        if (param2 != 0) {
            ((pq) this).field_h = 113;
        }
    }

    final static void b(boolean param0) {
        ia.field_x = new hn[]{};
    }

    public static void a(byte param0) {
        field_o = null;
        field_m = null;
        field_p = null;
        if (param0 <= 27) {
            field_m = null;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (((pq) this).d(107)) {
          return;
        } else {
          ((pq) this).field_h = ((pq) this).field_h + 7;
          if (((pq) this).field_h <= 256) {
            if (((pq) this).field_k < ((pq) this).field_i) {
              ((pq) this).field_k = ((pq) this).field_k + 1;
              if (((pq) this).field_j >= 256) {
                var2 = 2 / ((53 - param0) / 35);
                if (256 >= ((pq) this).field_j) {
                  if (((pq) this).field_j >= 0) {
                    return;
                  } else {
                    ((pq) this).field_j = 0;
                    return;
                  }
                } else {
                  ((pq) this).field_j = 256;
                  if (((pq) this).field_j >= 0) {
                    return;
                  } else {
                    ((pq) this).field_j = 0;
                    return;
                  }
                }
              } else {
                ((pq) this).field_j = ((pq) this).field_j + ((pq) this).field_n;
                var2 = 2 / ((53 - param0) / 35);
                if (256 >= ((pq) this).field_j) {
                  if (((pq) this).field_j >= 0) {
                    return;
                  } else {
                    ((pq) this).field_j = 0;
                    return;
                  }
                } else {
                  ((pq) this).field_j = 256;
                  if (((pq) this).field_j >= 0) {
                    return;
                  } else {
                    ((pq) this).field_j = 0;
                    return;
                  }
                }
              }
            } else {
              ((pq) this).field_j = ((pq) this).field_j - ((pq) this).field_n;
              var2 = 2 / ((53 - param0) / 35);
              if (256 >= ((pq) this).field_j) {
                if (((pq) this).field_j < 0) {
                  ((pq) this).field_j = 0;
                  return;
                } else {
                  return;
                }
              } else {
                ((pq) this).field_j = 256;
                if (((pq) this).field_j < 0) {
                  ((pq) this).field_j = 0;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            ((pq) this).field_h = 0;
            if (((pq) this).field_k < ((pq) this).field_i) {
              ((pq) this).field_k = ((pq) this).field_k + 1;
              if (((pq) this).field_j < 256) {
                ((pq) this).field_j = ((pq) this).field_j + ((pq) this).field_n;
                var2 = 2 / ((53 - param0) / 35);
                if (256 < ((pq) this).field_j) {
                  ((pq) this).field_j = 256;
                  if (((pq) this).field_j < 0) {
                    ((pq) this).field_j = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((pq) this).field_j < 0) {
                    ((pq) this).field_j = 0;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var2 = 2 / ((53 - param0) / 35);
                if (256 >= ((pq) this).field_j) {
                  if (((pq) this).field_j < 0) {
                    ((pq) this).field_j = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((pq) this).field_j = 256;
                  if (((pq) this).field_j < 0) {
                    ((pq) this).field_j = 0;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              ((pq) this).field_j = ((pq) this).field_j - ((pq) this).field_n;
              var2 = 2 / ((53 - param0) / 35);
              if (256 < ((pq) this).field_j) {
                ((pq) this).field_j = 256;
                if (((pq) this).field_j < 0) {
                  ((pq) this).field_j = 0;
                  return;
                } else {
                  return;
                }
              } else {
                if (((pq) this).field_j < 0) {
                  ((pq) this).field_j = 0;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final boolean d(int param0) {
        if (param0 > 66) {
          if (((pq) this).field_k >= ((pq) this).field_i) {
            if (0 != ((pq) this).field_j) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((pq) this).field_h = 27;
          if (((pq) this).field_k >= ((pq) this).field_i) {
            if (0 != ((pq) this).field_j) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    pq(int param0, int param1, int param2) {
        ((pq) this).field_q = null;
        ((pq) this).field_l = param1;
        ((pq) this).field_k = 0;
        ((pq) this).field_n = 3;
        ((pq) this).field_g = param0;
        ((pq) this).field_j = 0;
        ((pq) this).field_h = 0;
        ((pq) this).field_i = param2;
        ((pq) this).field_q = nm.b(-128, 17);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ip();
        field_m = new int[5];
        field_f = 0;
    }
}
