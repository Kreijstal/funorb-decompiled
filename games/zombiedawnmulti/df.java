/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class df extends se {
    static ul field_M;
    static volatile boolean field_P;
    private int field_K;
    static String field_G;
    static boolean field_I;
    private vk field_N;
    boolean field_R;
    static String field_J;
    static boolean field_H;
    static String field_L;
    static ja[] field_Q;
    static String field_O;

    boolean h(int param0) {
        ((df) this).field_K = this.a((byte) -20);
        if (param0 == -6134) {
          if (((df) this).field_K == 0) {
            if (((df) this).field_R) {
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
    }

    df(vk param0, int param1, int param2) {
        super(ub.field_wb - param1 >> 522697857, -param2 + kc.field_a >> 1892845985, param1, param2, (nl) null);
        ((df) this).field_N = param0;
        ((df) this).field_R = false;
        ((df) this).field_K = 0;
    }

    abstract void a(boolean param0, int param1, int param2);

    public static void g(byte param0) {
        field_Q = null;
        field_G = null;
        field_O = null;
        if (param0 < 44) {
          field_M = null;
          field_M = null;
          field_L = null;
          field_J = null;
          return;
        } else {
          field_M = null;
          field_L = null;
          field_J = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (!((param1 ^ -1) == -1)) {
            jh.field_ic = param1;
        }
        io.field_g = qj.field_p;
        if (param0 != -17306) {
            return;
        }
        hg.field_rb = param1;
    }

    final static String a(int param0) {
        int var1 = -20 % ((-50 - param0) / 60);
        if (qj.field_p) {
            return vi.field_a[0];
        }
        return vi.field_a[1];
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var2 = this.a((byte) -55);
        var3 = -((df) this).field_K + var2;
        if (param0 == -27388) {
          L0: {
            if (0 < var3) {
              ((df) this).field_K = ((df) this).field_K + (-1 + (8 + var3)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 < (var3 ^ -1)) {
            L1: {
              L2: {
                ((df) this).field_K = ((df) this).field_K + (var3 - 15) / 16;
                if (((df) this).field_K != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((df) this).field_R) {
                      break L2;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (((df) this).field_K != 0) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((df) this).field_R) {
                      break L4;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            ((df) this).field_N = null;
            if (0 < var3) {
              ((df) this).field_K = ((df) this).field_K + (-1 + (8 + var3)) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (-1 < (var3 ^ -1)) {
            ((df) this).field_K = ((df) this).field_K + (var3 - 15) / 16;
            if (((df) this).field_K == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (((df) this).field_R) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (((df) this).field_K == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((df) this).field_R) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L7;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L7;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9, int param10, boolean param11) {
        ee.a(16777215, true, param7, param10, param4, param0, param2, param5, param11, 16777215, param8, param1, param9, param6);
        int var12 = 115 / ((param3 - -15) / 53);
    }

    final void b(int param0, int param1, int param2) {
        if (param2 < 48) {
          df.g((byte) -100);
          ((df) this).b(ub.field_wb + -param0 >> 509927361, -param1 + kc.field_a >> -415988927, 28972, param0, param1);
          return;
        } else {
          ((df) this).b(ub.field_wb + -param0 >> 509927361, -param1 + kc.field_a >> -415988927, 28972, param0, param1);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != ((df) this).field_K) {
          if (-257 <= ((df) this).field_K) {
            if (param2 != 0) {
              return;
            } else {
              ((df) this).a(true, param3 + ((df) this).field_y, param1 - -((df) this).field_i);
              super.a(param0 ^ 0, param1, param2, param3);
              return;
            }
          } else {
            if (null != ej.field_g) {
              if (ej.field_g.field_x >= ((df) this).field_n) {
                if (ej.field_g.field_w >= ((df) this).field_w) {
                  r.a(0, ej.field_g);
                  oo.b();
                  ((df) this).a(true, 0, 0);
                  super.a(param0 ^ 0, -((df) this).field_i + -param1, param2, -param3 - ((df) this).field_y);
                  ql.a(true);
                  ej.field_g.c(param3 + ((df) this).field_y, param1 - -((df) this).field_i, ((df) this).field_K);
                  if (param0 != -2) {
                    cf discarded$4 = ((df) this).g(76);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ej.field_g = new ja(((df) this).field_n, ((df) this).field_w);
                  r.a(0, ej.field_g);
                  oo.b();
                  ((df) this).a(true, 0, 0);
                  super.a(param0 ^ 0, -((df) this).field_i + -param1, param2, -param3 - ((df) this).field_y);
                  ql.a(true);
                  ej.field_g.c(param3 + ((df) this).field_y, param1 - -((df) this).field_i, ((df) this).field_K);
                  if (param0 != -2) {
                    cf discarded$5 = ((df) this).g(76);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ej.field_g = new ja(((df) this).field_n, ((df) this).field_w);
                r.a(0, ej.field_g);
                oo.b();
                ((df) this).a(true, 0, 0);
                super.a(param0 ^ 0, -((df) this).field_i + -param1, param2, -param3 - ((df) this).field_y);
                ql.a(true);
                ej.field_g.c(param3 + ((df) this).field_y, param1 - -((df) this).field_i, ((df) this).field_K);
                if (param0 != -2) {
                  cf discarded$6 = ((df) this).g(76);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ej.field_g = new ja(((df) this).field_n, ((df) this).field_w);
              r.a(0, ej.field_g);
              oo.b();
              ((df) this).a(true, 0, 0);
              super.a(param0 ^ 0, -((df) this).field_i + -param1, param2, -param3 - ((df) this).field_y);
              ql.a(true);
              ej.field_g.c(param3 + ((df) this).field_y, param1 - -((df) this).field_i, ((df) this).field_K);
              if (param0 != -2) {
                cf discarded$7 = ((df) this).g(76);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var2 = 25 % ((param0 - 19) / 37);
          if (!((df) this).field_R) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if ((Object) (Object) ((df) this).field_N.j((byte) -121) == this) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    final cf g(int param0) {
        cf var2 = super.g(110);
        if (!(var2 == null)) {
            return var2;
        }
        if (param0 < 88) {
            return null;
        }
        return (cf) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = true;
        field_G = "Hostile";
        field_J = "Accept";
        field_L = "Graphics: ";
        field_H = false;
        field_O = "And you thought your zombies were hungry before.";
    }
}
