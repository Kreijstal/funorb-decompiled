/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uh extends gb implements pa, n {
    private boolean field_O;
    static String[] field_L;
    static String[] field_J;
    private boolean field_Q;
    private eb field_G;
    static int field_P;
    private eb field_K;
    static int field_H;
    private ej field_N;
    private ej field_R;
    private eb field_F;
    private boolean field_M;
    private String field_I;

    final void g(byte param0) {
        ((uh) this).field_N.k(-1);
        ((uh) this).field_R.k(-1);
        if (param0 >= -78) {
            field_L = null;
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, int param4, int param5) {
        hi.field_ab = param3;
        if (param4 >= -125) {
            return;
        }
        try {
            pj.field_q = param1;
            se.field_j = param5;
            dc.field_b = param2;
            sa.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "uh.S(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 != 98) {
                L1: {
                  if (param2 == 30) {
                    break L1;
                  } else {
                    field_H = -39;
                    break L1;
                  }
                }
                if (param3 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((uh) this).a(param1, (byte) 84);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_5_0 = ((uh) this).a(48, param1);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("uh.K(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    uh(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cj) null);
        RuntimeException var6 = null;
        ic var6_ref = null;
        pk var7 = null;
        String var8 = null;
        kf var9 = null;
        j var12 = null;
        j var13 = null;
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
        Object stackIn_16_0 = null;
        eb stackIn_16_1 = null;
        eb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        eb stackIn_17_1 = null;
        eb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        eb stackIn_18_1 = null;
        eb stackIn_18_2 = null;
        String stackIn_18_3 = null;
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
        Object stackOut_15_0 = null;
        eb stackOut_15_1 = null;
        eb stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        eb stackOut_17_1 = null;
        eb stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        eb stackOut_16_1 = null;
        eb stackOut_16_2 = null;
        String stackOut_16_3 = null;
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
              if (!param4) {
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
              ((uh) this).field_Q = stackIn_4_1 != 0;
              ((uh) this).field_I = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
              ((uh) this).field_M = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
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
              ((uh) this).field_O = stackIn_10_1 != 0;
              if (!((uh) this).field_O) {
                break L4;
              } else {
                L5: {
                  if (((uh) this).field_M) {
                    break L5;
                  } else {
                    if (!((uh) this).field_Q) {
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
              ((uh) this).field_N = (ej) (Object) new ib(param0, (sc) this, 100);
              ((uh) this).field_R = (ej) (Object) new ib("", (sc) this, 20);
              if (((uh) this).field_O) {
                ((uh) this).field_F = new eb(rb.field_c, (sc) null);
                ((uh) this).field_G = new eb(ed.field_c, (sc) null);
                ((uh) this).field_N.field_A = false;
                break L6;
              } else {
                L7: {
                  ((uh) this).field_F = new eb(ik.field_a, (sc) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!((uh) this).field_Q) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = gd.field_b;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = aj.field_c;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((uh) this).field_G = new eb(stackIn_18_3, (sc) null);
                if (!((uh) this).field_M) {
                  break L6;
                } else {
                  ((uh) this).field_K = new eb(td.field_j, (sc) this);
                  break L6;
                }
              }
            }
            L8: {
              ((uh) this).field_N.field_l = (cj) (Object) new ng(10000536);
              ((uh) this).field_R.field_l = (cj) (Object) new ah(10000536);
              var6_ref = new ic();
              ((uh) this).field_F.field_l = (cj) (Object) var6_ref;
              if (null == ((uh) this).field_G) {
                break L8;
              } else {
                ((uh) this).field_G.field_l = (cj) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((uh) this).field_K == null) {
                break L9;
              } else {
                ((uh) this).field_K.field_l = (cj) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((uh) this).field_N.field_x = hi.field_Z;
              if (((uh) this).field_K == null) {
                break L10;
              } else {
                ((uh) this).field_K.field_x = sj.field_d;
                break L10;
              }
            }
            L11: {
              if (((uh) this).field_O) {
                ((uh) this).field_G.field_x = ie.field_c;
                break L11;
              } else {
                if (((uh) this).field_Q) {
                  ((uh) this).field_G.field_x = qf.field_b;
                  ((uh) this).field_G.field_l = (cj) (Object) new qh();
                  break L11;
                } else {
                  ((uh) this).field_G.field_l = (cj) (Object) new qh();
                  break L11;
                }
              }
            }
            L12: {
              ((uh) this).field_u = 15;
              var7 = qk.field_e;
              if (null == ((uh) this).field_I) {
                break L12;
              } else {
                ((uh) this).field_u = ((uh) this).field_u + (var7.a(((uh) this).field_I, ((uh) this).field_p - 40, var7.field_s) - -5);
                break L12;
              }
            }
            L13: {
              var8 = gb.field_D;
              var9 = vk.a(false, dg.a(false));
              if (var9 == te.field_g) {
                var8 = ed.field_b;
                break L13;
              } else {
                if (gf.field_u != var9) {
                  break L13;
                } else {
                  var8 = mm.field_a;
                  break L13;
                }
              }
            }
            L14: {
              j dupTemp$2 = new j(10, ((uh) this).field_u, ((uh) this).field_p - 20, 25, (gl) (Object) ((uh) this).field_N, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((uh) this).b((byte) 95, (gl) (Object) dupTemp$2);
              ((uh) this).field_u = ((uh) this).field_u + (((gl) (Object) var12).field_n - -5);
              j dupTemp$3 = new j(10, ((uh) this).field_u, ((uh) this).field_p + -20, 25, (gl) (Object) ((uh) this).field_R, false, 80, 3, var7, 16777215, eb.field_E);
              var13 = dupTemp$3;
              ((uh) this).b((byte) 95, (gl) (Object) dupTemp$3);
              ((uh) this).field_F.field_r = (sc) this;
              ((uh) this).field_u = ((uh) this).field_u + (((gl) (Object) var13).field_n + 5);
              if (null == ((uh) this).field_K) {
                break L14;
              } else {
                ((uh) this).field_K.field_r = (sc) this;
                break L14;
              }
            }
            L15: {
              if (null == ((uh) this).field_G) {
                break L15;
              } else {
                ((uh) this).field_G.field_r = (sc) this;
                break L15;
              }
            }
            L16: {
              if (null != ((uh) this).field_K) {
                ((uh) this).field_F.a(((uh) this).field_u, (byte) 83, -95 + ((uh) this).field_p, 85, 30);
                ((uh) this).field_u = ((uh) this).field_u + 60;
                break L16;
              } else {
                ((uh) this).field_F.a(((uh) this).field_u, (byte) 94, -10 + (-6 + ((uh) this).field_p), 8, 30);
                ((uh) this).field_u = ((uh) this).field_u + 35;
                break L16;
              }
            }
            L17: {
              if (((uh) this).field_K == null) {
                break L17;
              } else {
                ((uh) this).field_K.a(((uh) this).field_u, (byte) 83, -10 + (-6 + ((uh) this).field_p), 8, 30);
                ((uh) this).field_u = ((uh) this).field_u + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((uh) this).field_G) {
                break L18;
              } else {
                L19: {
                  if (((uh) this).field_O) {
                    break L19;
                  } else {
                    if (!((uh) this).field_Q) {
                      ((uh) this).field_G.a(((uh) this).field_u, (byte) 99, 40, 8, 20);
                      ((uh) this).field_u = ((uh) this).field_u + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((uh) this).field_G.a(((uh) this).field_u, (byte) 94, -10 + (((uh) this).field_p - 6), 8, 30);
                ((uh) this).field_u = ((uh) this).field_u + 35;
                break L18;
              }
            }
            L20: {
              ((uh) this).a(0, (byte) 93, ((uh) this).field_p, 0, 3 + ((uh) this).field_u);
              ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_F);
              if (((uh) this).field_K == null) {
                break L20;
              } else {
                ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_K);
                break L20;
              }
            }
            L21: {
              if (((uh) this).field_G == null) {
                break L21;
              } else {
                ((uh) this).b((byte) 95, (gl) (Object) ((uh) this).field_G);
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
            stackOut_57_1 = new StringBuilder().append("uh.<init>(");
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
          throw qk.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_L = null;
        if (param0 != 8) {
            Object var2 = null;
            uh.a((bm) null, (bm) null, 103, -96, 28, 84);
        }
        field_J = null;
    }

    public final void a(ej param0, boolean param1) {
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((uh) this).g((byte) 36);
                break L1;
              }
            }
            L2: {
              if (((uh) this).field_N == param0) {
                boolean discarded$2 = ((uh) this).field_R.a((byte) 17, (gl) this);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((uh) this).field_R != param0) {
                break L3;
              } else {
                this.f((byte) 121);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("uh.T(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void a(ej param0, byte param1) {
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
              if (param1 == 83) {
                break L1;
              } else {
                uh.a(-1);
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
            stackOut_3_1 = new StringBuilder().append("uh.N(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String d(boolean param0) {
        if (!(((uh) this).field_N.field_o != null)) {
            return "";
        }
        if (param0) {
            return null;
        }
        return ((uh) this).field_N.field_o;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (0L != qd.a(-82, var3)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("uh.M(").append(-31312).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, int param1) {
        ej var3 = null;
        String var4 = null;
        try {
            var3 = ((uh) this).field_N;
            var4 = param0;
            var3.a(false, (byte) -128, var4);
            ((uh) this).field_R.k(param1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "uh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(null == ((uh) this).field_I)) {
            int discarded$0 = qk.field_e.a(((uh) this).field_I, ((uh) this).field_w + param0 + 20, ((uh) this).field_u + (param3 - -15), -40 + ((uh) this).field_p, ((uh) this).field_n, 16777215, -1, 1, 0, qk.field_e.field_s);
        }
        if (!(((uh) this).field_K == null)) {
            l.d(param0 + 10, param3 - -134, ((uh) this).field_p - 20, 4210752);
        }
        if (param1 > -106) {
            ((uh) this).field_R = null;
        }
        super.a(param0, -118, param2, param3);
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param0 != ((uh) this).field_F) {
                if (param0 != ((uh) this).field_K) {
                  if (((uh) this).field_G != param0) {
                    break L1;
                  } else {
                    if (((uh) this).field_O) {
                      int discarded$1 = -74;
                      si.m();
                      break L1;
                    } else {
                      if (((uh) this).field_Q) {
                        fd.c(-24);
                        break L1;
                      } else {
                        ie.a(4);
                        break L1;
                      }
                    }
                  }
                } else {
                  oe.a(-110);
                  break L1;
                }
              } else {
                this.f((byte) 112);
                break L1;
              }
            }
            var6_int = -66 % ((-5 - param4) / 57);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("uh.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void f(byte param0) {
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            ((uh) this).a(-35, 9, -77, 87);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ja.a(true)) {
              break L2;
            } else {
              if (((uh) this).field_N.field_o.length() <= 0) {
                break L1;
              } else {
                if (((uh) this).field_R.field_o.length() > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          ae.a(((uh) this).field_R.field_o, (byte) 75, ((uh) this).field_N.field_o);
          break L1;
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_P = 0;
        field_L = new String[]{"Pistol", "Shotgun", "Automatic Rifle", "Submachine Gun", "Rocket Launcher", "Grenade", "Laser Cannon", "Miniturised Laser", "Pulse Pistol", "Pulse Gun", "Pulse Carbine", "Pulse Grenade", "Fusion Pistol", "Fusion Gun", "Fusion Cannon", "Fusion Launcher", "Fusion Rifle", "Shield Module", "Light Machine Gun", "", ""};
    }
}
