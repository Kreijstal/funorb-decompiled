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
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (((hl) this).field_Q == null) {
                break L1;
              } else {
                ((hl) this).field_Q.b(57);
                break L1;
              }
            }
            L2: {
              if (param0 == -6142) {
                break L2;
              } else {
                ((hl) this).field_R = null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param1 != null) {
                  break L4;
                } else {
                  ((hl) this).field_Q = new jj();
                  if (!OrbDefence.field_D) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param1.a(6, ((hl) this).field_S + 6, param1.field_r, (byte) -90, param1.field_m);
              ((hl) this).field_Q = new jj(param1);
              break L3;
            }
            ((hl) this).a((pj) (Object) ((hl) this).field_Q, (byte) 74);
            ((hl) this).field_V = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("hl.SA(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    void a(boolean param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((hl) this).field_V = param1;
            if (!param0) {
              L1: {
                L2: {
                  if (((hl) this).field_R == pd.field_w) {
                    break L2;
                  } else {
                    if (ji.field_d != ((hl) this).field_R) {
                      ((hl) this).field_U = 0;
                      ((hl) this).field_R = ji.field_d;
                      if (!OrbDefence.field_D) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                ((hl) this).a(((hl) this).field_P, ((hl) this).field_V.field_m + 12, 12 + ((hl) this).field_S + ((hl) this).field_V.field_r, (byte) 114);
                ((hl) this).field_U = 0;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hl.H(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void p(int param0) {
        if (param0 != 0) {
            return;
        }
        try {
            field_N = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hl.UA(" + param0 + ')');
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
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
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
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
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("hl.I(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void n(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 6630) {
                break L1;
              } else {
                ((hl) this).field_U = -124;
                break L1;
              }
            }
            if (ji.field_d == ((hl) this).field_R) {
              return;
            } else {
              ((hl) this).field_U = 0;
              ((hl) this).field_R = qd.field_b;
              this.b(-6142, ((hl) this).field_V);
              ((hl) this).field_V = null;
              ((hl) this).field_Q.field_A = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) (Object) runtimeException, "hl.W(" + param0 + ')');
        }
    }

    final boolean l(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          L0: {
            ((hl) this).m(param0 ^ param0);
            stackOut_0_0 = super.l(194);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "hl.S(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    boolean d(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((hl) this).field_R) {
                break L1;
              } else {
                L2: {
                  if (((hl) this).field_R == ji.field_d) {
                    break L2;
                  } else {
                    if (((hl) this).field_R != qd.field_b) {
                      break L1;
                    } else {
                      L3: {
                        int fieldTemp$2 = ((hl) this).field_U + 1;
                        ((hl) this).field_U = ((hl) this).field_U + 1;
                        if (((hl) this).field_O != fieldTemp$2) {
                          break L3;
                        } else {
                          ((hl) this).field_R = null;
                          ((hl) this).field_Q.field_A = 256;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((hl) this).field_Q.field_A = (((hl) this).field_U << -1863735768) / ((hl) this).field_O;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  int fieldTemp$3 = ((hl) this).field_U + 1;
                  ((hl) this).field_U = ((hl) this).field_U + 1;
                  if (fieldTemp$3 == ((hl) this).field_T) {
                    break L4;
                  } else {
                    ((hl) this).field_Q.field_A = -((((hl) this).field_U << 1292945384) / ((hl) this).field_T) + 256;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((hl) this).field_R = pd.field_w;
                ((hl) this).a(((hl) this).field_P, 12 - -((hl) this).field_V.field_m, ((hl) this).field_V.field_r + (12 - -((hl) this).field_S), (byte) 114);
                ((hl) this).field_U = 0;
                ((hl) this).field_Q.field_A = 0;
                break L1;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                hl.p(-91);
                break L5;
              }
            }
            stackOut_28_0 = super.d(false);
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "hl.R(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_34_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                if (tl.field_d[param2] > tl.field_d[param3]) {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                } else {
                  if (tl.field_d[param2] >= tl.field_d[param3]) {
                    if (~rh.field_c[param3] <= ~rh.field_c[param2]) {
                      if (rh.field_c[param3] <= rh.field_c[param2]) {
                        break L1;
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      }
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                }
              } else {
                if (rh.field_c[param3] < rh.field_c[param2]) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  if (~rh.field_c[param3] >= ~rh.field_c[param2]) {
                    if (tl.field_d[param3] >= tl.field_d[param2]) {
                      if (tl.field_d[param2] < tl.field_d[param3]) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
            }
            if (param1 < -91) {
              var4_int = vl.field_g[param3] - -th.field_f[param3] + ld.field_b[param3];
              var5 = th.field_f[param2] + (vl.field_g[param2] - -ld.field_b[param2]);
              if (var5 > var4_int) {
                stackOut_39_0 = 1;
                stackIn_40_0 = stackOut_39_0;
                return stackIn_40_0 != 0;
              } else {
                if (var5 < var4_int) {
                  stackOut_44_0 = 0;
                  stackIn_45_0 = stackOut_44_0;
                  return stackIn_45_0 != 0;
                } else {
                  L2: {
                    if (~param3 <= ~param2) {
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L2;
                    } else {
                      stackOut_47_0 = 1;
                      stackIn_50_0 = stackOut_47_0;
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            } else {
              stackOut_34_0 = 1;
              stackIn_35_0 = stackOut_34_0;
              return stackIn_35_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "hl.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_50_0 != 0;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            L2: {
              cb.a(5000, (java.awt.Component) (Object) param0);
              if (mj.field_i == null) {
                break L2;
              } else {
                mj.field_i.a(108, (java.awt.Component) (Object) param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("hl.VA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((hl) this).field_R == null) {
                break L1;
              } else {
                L2: {
                  if (qd.field_b == ((hl) this).field_R) {
                    break L2;
                  } else {
                    ((hl) this).a(12 - (-((hl) this).field_S - ((hl) this).field_V.field_r), (byte) -81, 12 - -((hl) this).field_V.field_m);
                    this.b(-6142, ((hl) this).field_V);
                    break L2;
                  }
                }
                ((hl) this).field_R = null;
                ((hl) this).field_Q.field_A = 256;
                break L1;
              }
            }
            super.m(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "hl.T(" + param0 + ')');
        }
    }

    hl(sk param0, pj param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param2 + (12 + param1.field_r));
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((hl) this).field_S = param2;
            ((hl) this).field_P = param4;
            ((hl) this).field_O = param3;
            ((hl) this).field_T = param3;
            this.b(-6142, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hl.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
