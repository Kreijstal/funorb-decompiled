/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl extends ej {
    private int field_S;
    private int field_T;
    private li field_R;
    static ki field_N;
    private int field_P;
    private pj field_V;
    private jj field_Q;
    private int field_U;
    private int field_O;

    private final void b(int param0, pj param1) {
        try {
            if (((hl) this).field_Q != null) {
                ((hl) this).field_Q.b(57);
            }
            if (param0 != -6142) {
                ((hl) this).field_R = null;
            }
            if (param1 == null) {
                ((hl) this).field_Q = new jj();
            } else {
                param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
                ((hl) this).field_Q = new jj(param1);
            }
            ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
            ((hl) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hl.SA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(boolean param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          ((hl) this).field_V = param1;
          if (!param0) {
            if (((hl) this).field_R == pd.field_w) {
              ((hl) this).a(((hl) this).field_P, ((hl) this).field_V.field_m + 12, 12 + ((hl) this).field_S + ((hl) this).field_V.field_r, (byte) 114);
              ((hl) this).field_U = 0;
              return;
            } else {
              if (ji.field_d != ((hl) this).field_R) {
                ((hl) this).field_U = 0;
                ((hl) this).field_R = ji.field_d;
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hl.H(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void p(int param0) {
        if (param0 != 0) {
            return;
        }
        field_N = null;
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, 0)) {
              L1: {
                if (((hl) this).field_Q == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param1) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((hl) this).field_Q.a(-81, param2);
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((hl) this).field_Q.a(-81, param2);
                    return false;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("hl.I(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final void n(int param0) {
        if (param0 != 6630) {
            ((hl) this).field_U = -124;
            if (!(ji.field_d != ((hl) this).field_R)) {
                return;
            }
            ((hl) this).field_U = 0;
            ((hl) this).field_R = qd.field_b;
            this.b(-6142, ((hl) this).field_V);
            ((hl) this).field_V = null;
            ((hl) this).field_Q.field_A = 0;
            return;
        }
        if (!(ji.field_d != ((hl) this).field_R)) {
            return;
        }
        ((hl) this).field_U = 0;
        ((hl) this).field_R = qd.field_b;
        this.b(-6142, ((hl) this).field_V);
        ((hl) this).field_V = null;
        ((hl) this).field_Q.field_A = 0;
    }

    final boolean l(int param0) {
        ((hl) this).m(param0 ^ param0);
        return super.l(194);
    }

    boolean d(boolean param0) {
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null != ((hl) this).field_R) {
          if (((hl) this).field_R == ji.field_d) {
            int fieldTemp$2 = ((hl) this).field_U + 1;
            ((hl) this).field_U = ((hl) this).field_U + 1;
            if (fieldTemp$2 == ((hl) this).field_T) {
              ((hl) this).field_R = pd.field_w;
              ((hl) this).a(((hl) this).field_P, 12 - -((hl) this).field_V.field_m, ((hl) this).field_V.field_r + (12 - -((hl) this).field_S), (byte) 114);
              ((hl) this).field_U = 0;
              ((hl) this).field_Q.field_A = 0;
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            } else {
              ((hl) this).field_Q.field_A = -((((hl) this).field_U << 8) / ((hl) this).field_T) + 256;
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            }
          } else {
            if (((hl) this).field_R == qd.field_b) {
              int fieldTemp$3 = ((hl) this).field_U + 1;
              ((hl) this).field_U = ((hl) this).field_U + 1;
              if (((hl) this).field_O != fieldTemp$3) {
                ((hl) this).field_Q.field_A = (((hl) this).field_U << 8) / ((hl) this).field_O;
                if (param0) {
                  hl.p(-91);
                  return super.d(false);
                } else {
                  return super.d(false);
                }
              } else {
                ((hl) this).field_R = null;
                ((hl) this).field_Q.field_A = 256;
                if (param0) {
                  hl.p(-91);
                  return super.d(false);
                } else {
                  return super.d(false);
                }
              }
            } else {
              if (param0) {
                hl.p(-91);
                return super.d(false);
              } else {
                return super.d(false);
              }
            }
          }
        } else {
          if (param0) {
            hl.p(-91);
            return super.d(false);
          } else {
            return super.d(false);
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        if (param0) {
          if (tl.field_d[param2] > tl.field_d[param3]) {
            return true;
          } else {
            if (tl.field_d[param2] >= tl.field_d[param3]) {
              if (rh.field_c[param3] >= rh.field_c[param2]) {
                if (rh.field_c[param3] <= rh.field_c[param2]) {
                  if (param1 < -91) {
                    var4 = vl.field_g[param3] - -th.field_f[param3] + ld.field_b[param3];
                    var5 = th.field_f[param2] + (vl.field_g[param2] - -ld.field_b[param2]);
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param2) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L0;
                          } else {
                            stackOut_41_0 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            break L0;
                          }
                        }
                        return stackIn_43_0 != 0;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (rh.field_c[param3] < rh.field_c[param2]) {
            return true;
          } else {
            if (rh.field_c[param3] <= rh.field_c[param2]) {
              if (tl.field_d[param3] >= tl.field_d[param2]) {
                if (tl.field_d[param2] >= tl.field_d[param3]) {
                  if (param1 < -91) {
                    var4 = vl.field_g[param3] - -th.field_f[param3] + ld.field_b[param3];
                    var5 = th.field_f[param2] + (vl.field_g[param2] - -ld.field_b[param2]);
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        if (param3 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              fg.a((byte) 51, (java.awt.Component) (Object) param0);
              if (param1 >= 104) {
                break L1;
              } else {
                field_N = null;
                break L1;
              }
            }
            cb.a(5000, (java.awt.Component) (Object) param0);
            if (mj.field_i == null) {
              break L0;
            } else {
              mj.field_i.a(108, (java.awt.Component) (Object) param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("hl.VA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final void m(int param0) {
        if (((hl) this).field_R != null) {
          if (qd.field_b == ((hl) this).field_R) {
            ((hl) this).field_R = null;
            ((hl) this).field_Q.field_A = 256;
            super.m(param0);
            return;
          } else {
            ((hl) this).a(12 - (-((hl) this).field_S - ((hl) this).field_V.field_r), (byte) -81, 12 - -((hl) this).field_V.field_m);
            this.b(-6142, ((hl) this).field_V);
            ((hl) this).field_R = null;
            ((hl) this).field_Q.field_A = 256;
            super.m(param0);
            return;
          }
        } else {
          super.m(param0);
          return;
        }
    }

    hl(sk param0, pj param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param2 + (12 + param1.field_r));
        try {
            ((hl) this).field_S = param2;
            ((hl) this).field_P = param4;
            ((hl) this).field_O = param3;
            ((hl) this).field_T = param3;
            this.b(-6142, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
