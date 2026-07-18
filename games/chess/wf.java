/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wf extends ma implements ha, mj {
    private String field_V;
    static km field_Q;
    private qn field_N;
    private boolean field_Y;
    private fb field_M;
    static pf field_R;
    private fb field_L;
    private boolean field_T;
    static String field_X;
    private fb field_O;
    static String field_S;
    static String field_P;
    private boolean field_K;
    static id field_W;
    private qn field_U;

    public final void b(qn param0, int param1) {
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
          L0: {
            if (param1 == 3) {
              L1: {
                if (((wf) this).field_N != param0) {
                  break L1;
                } else {
                  boolean discarded$3 = ((wf) this).field_U.a(0, (mf) this);
                  break L1;
                }
              }
              L2: {
                if (((wf) this).field_U == param0) {
                  this.h((byte) -85);
                  break L2;
                } else {
                  break L2;
                }
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wf.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    wf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (jm) null);
        RuntimeException var6 = null;
        sf var6_ref = null;
        lh var7 = null;
        String var8 = null;
        jd var9 = null;
        kg var12 = null;
        kg var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        fb stackIn_17_1 = null;
        fb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        fb stackIn_18_1 = null;
        fb stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        fb stackIn_19_1 = null;
        fb stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        fb stackOut_16_1 = null;
        fb stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        fb stackOut_18_1 = null;
        fb stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        fb stackOut_17_1 = null;
        fb stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((wf) this).field_Y = stackIn_4_1 != 0;
              ((wf) this).field_V = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((wf) this).field_T = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((wf) this).field_K = stackIn_10_1 != 0;
              if (!((wf) this).field_T) {
                break L4;
              } else {
                L5: {
                  if (((wf) this).field_Y) {
                    break L5;
                  } else {
                    if (!((wf) this).field_K) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((wf) this).field_N = (qn) (Object) new bg(param0, (rg) this, 100);
              ((wf) this).field_U = (qn) (Object) new bg("", (rg) this, 20);
              if (!((wf) this).field_T) {
                L7: {
                  ((wf) this).field_M = new fb(ua.field_c, (rg) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((wf) this).field_K) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = fa.field_k;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = jd.field_g;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((wf) this).field_O = new fb(stackIn_19_3, (rg) null);
                if (!((wf) this).field_Y) {
                  break L6;
                } else {
                  ((wf) this).field_L = new fb(fd.field_o, (rg) this);
                  break L6;
                }
              } else {
                ((wf) this).field_M = new fb(hl.field_f, (rg) null);
                ((wf) this).field_O = new fb(sn.field_b, (rg) null);
                ((wf) this).field_N.field_H = false;
                break L6;
              }
            }
            L8: {
              ((wf) this).field_N.field_n = (jm) (Object) new wc(10000536);
              ((wf) this).field_U.field_n = (jm) (Object) new hk(10000536);
              var6_ref = new sf();
              ((wf) this).field_M.field_n = (jm) (Object) var6_ref;
              if (null == ((wf) this).field_O) {
                break L8;
              } else {
                ((wf) this).field_O.field_n = (jm) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((wf) this).field_N.field_j = lk.field_b;
              if (null == ((wf) this).field_L) {
                break L9;
              } else {
                ((wf) this).field_L.field_n = (jm) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((wf) this).field_L) {
                break L10;
              } else {
                ((wf) this).field_L.field_j = sl.field_d;
                break L10;
              }
            }
            L11: {
              if (!((wf) this).field_T) {
                if (!((wf) this).field_K) {
                  ((wf) this).field_O.field_n = (jm) (Object) new wj();
                  break L11;
                } else {
                  ((wf) this).field_O.field_j = qd.field_I;
                  ((wf) this).field_O.field_n = (jm) (Object) new wj();
                  break L11;
                }
              } else {
                ((wf) this).field_O.field_j = ao.field_i;
                break L11;
              }
            }
            L12: {
              ((wf) this).field_r = 15;
              var7 = rb.field_b;
              if (((wf) this).field_V == null) {
                break L12;
              } else {
                ((wf) this).field_r = ((wf) this).field_r + (5 + var7.b(((wf) this).field_V, ((wf) this).field_y + -40, var7.field_C));
                break L12;
              }
            }
            L13: {
              var8 = rc.field_e;
              var9 = ja.a((byte) 127, bh.i(81));
              if (var9 != ph.field_g) {
                if (le.field_g != var9) {
                  break L13;
                } else {
                  var8 = oj.field_a;
                  break L13;
                }
              } else {
                var8 = em.field_k;
                break L13;
              }
            }
            L14: {
              kg dupTemp$2 = new kg(10, ((wf) this).field_r, ((wf) this).field_y - 20, 25, (mf) (Object) ((wf) this).field_N, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((wf) this).b((mf) (Object) dupTemp$2, 95);
              ((wf) this).field_r = ((wf) this).field_r + (((mf) (Object) var12).field_C - -5);
              kg dupTemp$3 = new kg(10, ((wf) this).field_r, ((wf) this).field_y - 20, 25, (mf) (Object) ((wf) this).field_U, false, 80, 3, var7, 16777215, di.field_Qb);
              var13 = dupTemp$3;
              ((wf) this).b((mf) (Object) dupTemp$3, 95);
              ((wf) this).field_r = ((wf) this).field_r + (5 + ((mf) (Object) var13).field_C);
              ((wf) this).field_M.field_p = (rg) this;
              if (null == ((wf) this).field_L) {
                break L14;
              } else {
                ((wf) this).field_L.field_p = (rg) this;
                break L14;
              }
            }
            L15: {
              if (((wf) this).field_O == null) {
                break L15;
              } else {
                ((wf) this).field_O.field_p = (rg) this;
                break L15;
              }
            }
            L16: {
              if (null == ((wf) this).field_L) {
                ((wf) this).field_M.a(((wf) this).field_r, 34, 30, -6 + ((wf) this).field_y + -10, 8);
                ((wf) this).field_r = ((wf) this).field_r + 35;
                break L16;
              } else {
                ((wf) this).field_M.a(((wf) this).field_r, 34, 30, -95 + ((wf) this).field_y, 85);
                ((wf) this).field_r = ((wf) this).field_r + 60;
                break L16;
              }
            }
            L17: {
              if (((wf) this).field_L == null) {
                break L17;
              } else {
                ((wf) this).field_L.a(((wf) this).field_r, 34, 30, -6 + ((wf) this).field_y + -10, 8);
                ((wf) this).field_r = ((wf) this).field_r + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((wf) this).field_O) {
                break L18;
              } else {
                L19: {
                  if (((wf) this).field_T) {
                    break L19;
                  } else {
                    if (((wf) this).field_K) {
                      break L19;
                    } else {
                      ((wf) this).field_O.a(((wf) this).field_r, 34, 20, 40, 8);
                      ((wf) this).field_r = ((wf) this).field_r + 25;
                      break L18;
                    }
                  }
                }
                ((wf) this).field_O.a(((wf) this).field_r, 34, 30, -10 + (((wf) this).field_y - 6), 8);
                ((wf) this).field_r = ((wf) this).field_r + 35;
                break L18;
              }
            }
            L20: {
              ((wf) this).a(0, 34, ((wf) this).field_r + 3, ((wf) this).field_y, 0);
              ((wf) this).b((mf) (Object) ((wf) this).field_M, 95);
              if (null == ((wf) this).field_L) {
                break L20;
              } else {
                ((wf) this).b((mf) (Object) ((wf) this).field_L, 95);
                break L20;
              }
            }
            L21: {
              if (((wf) this).field_O == null) {
                break L21;
              } else {
                ((wf) this).b((mf) (Object) ((wf) this).field_O, 95);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("wf.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
            wf.a(-118);
        }
        if (!(((wf) this).field_V == null)) {
            int discarded$0 = rb.field_b.a(((wf) this).field_V, 20 + (((wf) this).field_u + param3), ((wf) this).field_r + param0 + 15, -40 + ((wf) this).field_y, ((wf) this).field_C, 16777215, -1, 1, 0, rb.field_b.field_C);
        }
        if (!(null == ((wf) this).field_L)) {
            wb.a(param3 - -10, 134 + param0, -20 + ((wf) this).field_y, 4210752);
        }
        super.a(param0, param1, -117, param3);
    }

    public static void a(int param0) {
        field_S = null;
        if (param0 != 35) {
            field_W = null;
        }
        field_W = null;
        field_X = null;
        field_Q = null;
        field_R = null;
        field_P = null;
    }

    final static void a(lm param0, int param1) {
        if (param0 == null) {
            return;
        }
        try {
            bj.a(na.a(param0, 100, 96), true);
            int var2_int = -101 % ((param1 - -24) / 39);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "wf.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (dc.a(124)) {
              break L1;
            } else {
              if (-1 <= ((wf) this).field_N.field_v.length()) {
                break L0;
              } else {
                if (-1 >= ((wf) this).field_U.field_v.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          cb.a(82, ((wf) this).field_U.field_v, ((wf) this).field_N.field_v);
          break L0;
        }
        var2 = 39 % ((-30 - param0) / 52);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (((wf) this).field_M != param0) {
                if (((wf) this).field_L != param0) {
                  if (((wf) this).field_O != param0) {
                    break L1;
                  } else {
                    if (((wf) this).field_T) {
                      oa.b(-16586);
                      break L1;
                    } else {
                      if (!((wf) this).field_K) {
                        el.h(-117);
                        break L1;
                      } else {
                        qf.a(108);
                        break L1;
                      }
                    }
                  }
                } else {
                  dc.c((byte) 127);
                  break L1;
                }
              } else {
                this.h((byte) -121);
                break L1;
              }
            }
            L2: {
              if (param4 == -24221) {
                break L2;
              } else {
                ((wf) this).field_K = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("wf.DA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(qn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 10999) {
                break L1;
              } else {
                wf.a(-13);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wf.N(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Frame param0, jk param1, int param2) {
        nl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param0, false);
              L2: while (true) {
                if (0 != var3.field_f) {
                  if (var3.field_f == 1) {
                    if (param2 >= 48) {
                      param0.setVisible(false);
                      param0.dispose();
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    bc.a(100L, (byte) -104);
                    continue L1;
                  }
                } else {
                  bc.a(10L, (byte) 17);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("wf.K(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void g(byte param0) {
        int var2 = -102 % ((param0 - 40) / 38);
        ((wf) this).field_N.i(-12881);
        ((wf) this).field_U.i(-12881);
    }

    final void a(String param0, int param1) {
        qn var3 = null;
        String var4 = null;
        if (param1 != 20) {
            return;
        }
        try {
            var3 = ((wf) this).field_N;
            var4 = param0;
            var3.a(0, false, var4);
            ((wf) this).field_U.i(param1 ^ -12869);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "wf.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String i(byte param0) {
        if (!(((wf) this).field_N.field_v != null)) {
            return "";
        }
        int var2 = 33 % ((param0 - -23) / 48);
        return ((wf) this).field_N.field_v;
    }

    final static int c(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        var7 = Chess.field_G;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!kf.d(18954)) {
                L2: {
                  ol.field_R.a(fe.a(re.field_m, 1, ag.field_f), 99, fe.a(hn.field_k, 1, rf.field_b));
                  if (ol.field_R.d((byte) 124)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (ol.field_R.field_h < 0) {
                        break L4;
                      } else {
                        L5: {
                          var3 = fi.field_c[ol.field_R.field_h];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 != 5) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        mh.b(13);
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (gm.field_f == 2) {
                      break L3;
                    } else {
                      mh.b(13);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (gm.field_f == 2) {
                      var4 = -jg.field_M + ud.a(2);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (0 >= var6) {
                        qh.a(false, true, 5);
                        var3 = 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_27_0 = var3;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                L7: {
                  ol.field_R.c((byte) -42);
                  if (ol.field_R.d((byte) 101)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (13 == vg.field_a) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "wf.J(" + true + ')');
        }
        return stackIn_28_0;
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 == 99) {
                  stackOut_9_0 = ((wf) this).a(param3, (byte) -73);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((wf) this).a(param3, 27964);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("wf.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "Only show private chat from my friends and opponents";
        field_S = "<%0>%";
        field_P = "Bishop";
    }
}
