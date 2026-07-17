/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wj extends ud {
    private int field_O;
    private boolean field_W;
    private int field_P;
    static int field_T;
    private int field_Q;
    static String field_U;
    static int field_V;
    private int field_R;
    private boolean field_N;
    static String[] field_S;

    final static void a(int param0, boolean param1) {
        if (hb.field_a > 0) {
          if (tf.field_d) {
            qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
            ln.field_q.a((byte) -79, param1);
            if (uf.field_z > 0) {
              if (!nr.field_bb) {
                return;
              } else {
                qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                de.field_b.a((byte) -79, param1);
                return;
              }
            } else {
              if (nj.field_b > 0) {
                L0: {
                  if (nr.field_bb) {
                    qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                    de.field_b.a((byte) -79, param1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            if (uf.field_z > 0) {
              if (!nr.field_bb) {
                return;
              } else {
                qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                de.field_b.a((byte) -79, param1);
                return;
              }
            } else {
              if (nj.field_b > 0) {
                L1: {
                  if (nr.field_bb) {
                    qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                    de.field_b.a((byte) -79, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (uf.field_z > 0) {
            if (!nr.field_bb) {
              return;
            } else {
              qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
              de.field_b.a((byte) -79, param1);
              return;
            }
          } else {
            if (nj.field_b > 0) {
              L2: {
                if (nr.field_bb) {
                  qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                  de.field_b.a((byte) -79, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final void f(byte param0) {
        super.f(param0);
        ((wj) this).field_L.a(((wj) this).field_l, 0, ((wj) this).field_y, false, 0);
        ((wj) this).field_Q = ((wj) this).field_D;
        ((wj) this).field_P = ((wj) this).field_C;
    }

    final static void a() {
        ap.field_E = 200;
        g.field_l = new int[3];
        wb.field_e = new pn[3000];
        aa.field_e = 0;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
              if (param3 >= 13) {
                break L1;
              } else {
                field_U = null;
                break L1;
              }
            }
            L2: {
              if (((wj) this).b(param1, param2, param0, -1)) {
                ((wj) this).a(1, param2, param0, param1);
                ((wj) this).a(param2, 3, param0, param1);
                StringBuilder discarded$26 = param0.append(" revert=").append(((wj) this).field_N);
                if (((wj) this).field_P == 2147483647) {
                  break L2;
                } else {
                  if (((wj) this).field_Q == 2147483647) {
                    break L2;
                  } else {
                    StringBuilder discarded$27 = param0.append(" to ").append(((wj) this).field_P).append(44).append(((wj) this).field_Q);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("wj.EA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
        return stackIn_8_0;
    }

    public static void h() {
        field_S = null;
        field_U = null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        if (param4 < 62) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3, (byte) 124, param5);
            ((wj) this).field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wj.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    private wj(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((wj) this).field_P = 2147483647;
        ((wj) this).field_Q = 2147483647;
        try {
            ((wj) this).field_L = param6;
            ((wj) this).field_W = param8 ? true : false;
            ((wj) this).field_N = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(di param0, int param1, boolean param2, ai param3) {
        try {
            cl.field_h = param1 * up.a(-21282) / 1000;
            int discarded$0 = 102;
            q.a(param0);
            int discarded$1 = -106;
            oj.a(param0);
            dr.a((byte) -65, param0);
            int discarded$2 = -257;
            wk.a();
            int discarded$3 = 23;
            lm.i();
            im.field_fc = -cl.field_h;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wj.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((wj) this).field_W) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((wj) this).a(param1, param5, param6, -1, param4)) {
              ((wj) this).field_n = param3;
              if (param3 != 1) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                ((wj) this).field_O = -param5 + -((wj) this).field_D + param4;
                ((wj) this).field_R = -param1 + (param6 + -((wj) this).field_C);
                uh.field_u = (wj) this;
                return true;
              }
            } else {
              stackOut_4_0 = var8_int;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("wj.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((wj) this).field_L instanceof fe)) {
                    break L3;
                  } else {
                    if (!((fe) (Object) ((wj) this).field_L).field_I) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((wj) this).field_n != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -((wj) this).field_R + wn.field_i + -param2;
                    var6 = gg.field_f + -((wj) this).field_O - param3;
                    if (var5_int != ((wj) this).field_C) {
                      break L4;
                    } else {
                      if (((wj) this).field_D != var6) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((wj) this).field_D = var6;
                  ((wj) this).field_C = var5_int;
                  if (!(((wj) this).field_t instanceof gb)) {
                    break L1;
                  } else {
                    ((gb) (Object) ((wj) this).field_t).a((wj) this, (byte) 81, param3, param2);
                    break L1;
                  }
                }
              }
              if (((wj) this).field_N) {
                L5: {
                  if (((wj) this).field_P != ((wj) this).field_C) {
                    L6: {
                      var5_int = -((wj) this).field_C + ((wj) this).field_P;
                      stackOut_13_0 = this;
                      stackOut_13_1 = ((wj) this).field_C;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (Math.abs(var5_int) <= 2) {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (0 < var5_int) {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          stackIn_18_2 = stackOut_17_2;
                          break L6;
                        } else {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = -1;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          break L6;
                        }
                      } else {
                        stackOut_14_0 = this;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = var5_int >> 1;
                        stackIn_18_0 = stackOut_14_0;
                        stackIn_18_1 = stackOut_14_1;
                        stackIn_18_2 = stackOut_14_2;
                        break L6;
                      }
                    }
                    ((wj) this).field_C = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((wj) this).field_Q != ((wj) this).field_D) {
                  L7: {
                    var5_int = -((wj) this).field_D + ((wj) this).field_Q;
                    stackOut_21_0 = this;
                    stackOut_21_1 = ((wj) this).field_D;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (Math.abs(var5_int) <= 2) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (var5_int <= 0) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        break L7;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        break L7;
                      }
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = var5_int >> 1;
                      stackIn_26_0 = stackOut_22_0;
                      stackIn_26_1 = stackOut_22_1;
                      stackIn_26_2 = stackOut_22_2;
                      break L7;
                    }
                  }
                  ((wj) this).field_D = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1 == 958) {
              super.a(param0, param1, param2, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("wj.S(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean i() {
        return null != sa.field_f || fm.field_H;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "You<%0> have all resigned!";
    }
}
