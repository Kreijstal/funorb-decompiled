/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qm extends se implements fi, in {
    static String field_I;
    private pm field_M;
    private boolean field_L;
    private gn field_P;
    private gn field_J;
    private boolean field_K;
    static String field_N;
    private pm field_H;
    private gn field_G;
    private boolean field_Q;
    private String field_O;

    final void a(int param0, String param1) {
        pm var4 = null;
        String var5 = null;
        try {
            int var3_int = 62 / ((-46 - param0) / 51);
            var4 = ((qm) this).field_H;
            var5 = param1;
            var4.a(false, var5, (byte) 119);
            ((qm) this).field_M.b(true);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jh param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        jb var7 = null;
        String var8 = null;
        jb var9 = null;
        String var10 = null;
        jb var11 = null;
        String var12 = null;
        jb var13 = null;
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
        try {
          L0: {
            L1: {
              ve.a(0L, 196, (String) null, ek.field_H, (String) null, (cj) (Object) param0, -1, (int[]) null, param0.i(6));
              if (!param0.field_Fb) {
                break L1;
              } else {
                L2: {
                  if (param0.field_fc == 2) {
                    break L2;
                  } else {
                    if (kj.field_q < 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = pk.field_b;
                var8 = vl.a(wj.field_f, new String[1], 2);
                var7.field_j.a((byte) -118, var8, 10);
                break L1;
              }
            }
            L3: {
              pk.field_b.a((byte) -120);
              if (ao.field_e == pk.field_b.field_b) {
                var11 = pk.field_b;
                var12 = vl.a(ag.field_g, new String[1], 2);
                var11.field_j.a((byte) -118, var12, 16);
                break L3;
              } else {
                var9 = pk.field_b;
                var10 = vl.a(kj.field_f, new String[1], 2);
                var9.field_j.a((byte) -118, var10, 15);
                break L3;
              }
            }
            var13 = pk.field_b;
            var5 = vb.field_f;
            var6 = ka.field_t;
            var13.field_j.b(4542, var5, 0, var6, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("qm.K(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(true).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -123 + ')');
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 < -83) {
              L1: {
                if (((qm) this).field_G == param2) {
                  this.a((byte) -95);
                  break L1;
                } else {
                  if (((qm) this).field_P == param2) {
                    int discarded$30 = 0;
                    hb.a();
                    break L1;
                  } else {
                    if (param2 == ((qm) this).field_J) {
                      if (!((qm) this).field_K) {
                        if (!((qm) this).field_L) {
                          qi.a(false);
                          break L1;
                        } else {
                          dq.c(-118);
                          break L1;
                        }
                      } else {
                        int discarded$31 = -124;
                        oi.a();
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("qm.E(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((qm) this).field_O) {
            int discarded$0 = ke.field_h.a(((qm) this).field_O, param3 - (-((qm) this).field_y + -20), 15 + (((qm) this).field_i + param1), ((qm) this).field_n - 40, ((qm) this).field_w, 16777215, -1, 1, 0, ke.field_h.field_C);
        }
        if (null != ((qm) this).field_P) {
            oo.b(param3 + 10, param1 - -134, -20 + ((qm) this).field_n, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String h(int param0) {
        if (param0 != 6728) {
            return null;
        }
        if (!(null != ((qm) this).field_H.field_j)) {
            return "";
        }
        return ((qm) this).field_H.field_j;
    }

    final void g(byte param0) {
        ((qm) this).field_H.b(true);
        if (param0 < 101) {
            Object var3 = null;
            boolean discarded$0 = ((qm) this).a(39, '￟', (cf) null, 8);
        }
        ((qm) this).field_M.b(true);
    }

    qm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nl) null);
        RuntimeException var6 = null;
        oq var6_ref = null;
        fm var7 = null;
        String var8 = null;
        bo var9 = null;
        el var12 = null;
        el var13 = null;
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
        gn stackIn_17_1 = null;
        gn stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        gn stackIn_18_1 = null;
        gn stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        gn stackIn_19_1 = null;
        gn stackIn_19_2 = null;
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
        gn stackOut_16_1 = null;
        gn stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        gn stackOut_18_1 = null;
        gn stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        gn stackOut_17_1 = null;
        gn stackOut_17_2 = null;
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
              ((qm) this).field_Q = stackIn_4_1 != 0;
              ((qm) this).field_O = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param4) {
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
              ((qm) this).field_L = stackIn_7_1 != 0;
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
              ((qm) this).field_K = stackIn_10_1 != 0;
              if (!((qm) this).field_K) {
                break L4;
              } else {
                L5: {
                  if (((qm) this).field_Q) {
                    break L5;
                  } else {
                    if (!((qm) this).field_L) {
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
              ((qm) this).field_H = (pm) (Object) new on(param0, (bj) this, 100);
              ((qm) this).field_M = (pm) (Object) new on("", (bj) this, 20);
              if (!((qm) this).field_K) {
                L7: {
                  ((qm) this).field_G = new gn(qo.field_s, (bj) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((qm) this).field_L) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = sn.field_Zb;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = gf.field_a;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((qm) this).field_J = new gn(stackIn_19_3, (bj) null);
                if (!((qm) this).field_Q) {
                  break L6;
                } else {
                  ((qm) this).field_P = new gn(en.field_a, (bj) this);
                  break L6;
                }
              } else {
                ((qm) this).field_G = new gn(ci.field_g, (bj) null);
                ((qm) this).field_J = new gn(oe.field_b, (bj) null);
                ((qm) this).field_H.field_F = false;
                break L6;
              }
            }
            L8: {
              ((qm) this).field_H.field_h = (nl) (Object) new tb(10000536);
              ((qm) this).field_M.field_h = (nl) (Object) new m(10000536);
              var6_ref = new oq();
              ((qm) this).field_G.field_h = (nl) (Object) var6_ref;
              if (((qm) this).field_J == null) {
                break L8;
              } else {
                ((qm) this).field_J.field_h = (nl) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (null == ((qm) this).field_P) {
                break L9;
              } else {
                ((qm) this).field_P.field_h = (nl) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((qm) this).field_H.field_x = lh.field_e;
              if (null == ((qm) this).field_P) {
                break L10;
              } else {
                ((qm) this).field_P.field_x = field_I;
                break L10;
              }
            }
            L11: {
              if (((qm) this).field_K) {
                ((qm) this).field_J.field_x = gi.field_p;
                break L11;
              } else {
                if (((qm) this).field_L) {
                  ((qm) this).field_J.field_x = de.field_a;
                  ((qm) this).field_J.field_h = (nl) (Object) new he();
                  break L11;
                } else {
                  ((qm) this).field_J.field_h = (nl) (Object) new he();
                  break L11;
                }
              }
            }
            L12: {
              ((qm) this).field_i = 15;
              var7 = ke.field_h;
              if (null == ((qm) this).field_O) {
                break L12;
              } else {
                ((qm) this).field_i = ((qm) this).field_i + (var7.a(((qm) this).field_O, ((qm) this).field_n - 40, var7.field_C) - -5);
                break L12;
              }
            }
            L13: {
              var8 = sh.field_M;
              var9 = me.a(-57, jl.b(0));
              if (wp.field_b != var9) {
                if (l.field_c != var9) {
                  break L13;
                } else {
                  var8 = lj.field_f;
                  break L13;
                }
              } else {
                var8 = fa.field_Gb;
                break L13;
              }
            }
            L14: {
              el dupTemp$2 = new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((qm) this).b((byte) 112, (cf) (Object) dupTemp$2);
              ((qm) this).field_i = ((qm) this).field_i + (((cf) (Object) var12).field_w + 5);
              el dupTemp$3 = new el(10, ((qm) this).field_i, -20 + ((qm) this).field_n, 25, (cf) (Object) ((qm) this).field_M, false, 80, 3, var7, 16777215, gn.field_D);
              var13 = dupTemp$3;
              ((qm) this).b((byte) 108, (cf) (Object) dupTemp$3);
              ((qm) this).field_i = ((qm) this).field_i + (5 + ((cf) (Object) var13).field_w);
              ((qm) this).field_G.field_A = (bj) this;
              if (null == ((qm) this).field_P) {
                break L14;
              } else {
                ((qm) this).field_P.field_A = (bj) this;
                break L14;
              }
            }
            L15: {
              if (null == ((qm) this).field_J) {
                break L15;
              } else {
                ((qm) this).field_J.field_A = (bj) this;
                break L15;
              }
            }
            L16: {
              if (((qm) this).field_P == null) {
                ((qm) this).field_G.b(8, ((qm) this).field_i, 28972, ((qm) this).field_n - 16, 30);
                ((qm) this).field_i = ((qm) this).field_i + 35;
                break L16;
              } else {
                ((qm) this).field_G.b(85, ((qm) this).field_i, 28972, ((qm) this).field_n + -95, 30);
                ((qm) this).field_i = ((qm) this).field_i + 60;
                break L16;
              }
            }
            L17: {
              if (((qm) this).field_P == null) {
                break L17;
              } else {
                ((qm) this).field_P.b(8, ((qm) this).field_i, 28972, -10 + (-6 + ((qm) this).field_n), 30);
                ((qm) this).field_i = ((qm) this).field_i + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((qm) this).field_J) {
                break L18;
              } else {
                L19: {
                  if (((qm) this).field_K) {
                    break L19;
                  } else {
                    if (((qm) this).field_L) {
                      break L19;
                    } else {
                      ((qm) this).field_J.b(8, ((qm) this).field_i, 28972, 40, 20);
                      ((qm) this).field_i = ((qm) this).field_i + 25;
                      break L18;
                    }
                  }
                }
                ((qm) this).field_J.b(8, ((qm) this).field_i, 28972, -10 + (((qm) this).field_n + -6), 30);
                ((qm) this).field_i = ((qm) this).field_i + 35;
                break L18;
              }
            }
            L20: {
              ((qm) this).b(0, 0, 28972, ((qm) this).field_n, 3 + ((qm) this).field_i);
              ((qm) this).b((byte) 70, (cf) (Object) ((qm) this).field_G);
              if (null == ((qm) this).field_P) {
                break L20;
              } else {
                ((qm) this).b((byte) 71, (cf) (Object) ((qm) this).field_P);
                break L20;
              }
            }
            L21: {
              if (((qm) this).field_J == null) {
                break L21;
              } else {
                ((qm) this).b((byte) 126, (cf) (Object) ((qm) this).field_J);
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
            stackOut_57_1 = new StringBuilder().append("qm.<init>(");
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
          throw fa.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        int var1 = 0;
        field_N = null;
        field_I = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
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
              if (param0 != 98) {
                if (param0 == 99) {
                  stackOut_9_0 = ((qm) this).a(66, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((qm) this).a((byte) -1, param2);
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
            stackOut_11_1 = new StringBuilder().append("qm.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final static ae a(ga param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uo stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        uo stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param0.d((byte) 69);
            var3 = param0.d((byte) 69);
            var4 = param0.d((byte) 69);
            var5 = param0.d((byte) 69);
            var6 = param0.d((byte) 69);
            stackOut_0_0 = fn.a(var6, var4, var3, (byte) 104, var2_int, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qm.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
        return (ae) (Object) stackIn_1_0;
    }

    public final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                var4 = null;
                qm.a(-1.2370823621749878f, -17, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("qm.G(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(pm param0, boolean param1) {
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
              if (((qm) this).field_H == param0) {
                boolean discarded$2 = ((qm) this).field_M.a((cf) this, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((qm) this).field_M != param0) {
                break L2;
              } else {
                this.a((byte) -99);
                break L2;
              }
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                ((qm) this).field_G = null;
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
            stackOut_8_1 = new StringBuilder().append("qm.I(");
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static vg b() {
        vg var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (vg) (Object) ag.field_i.c(78);
        L0: while (true) {
          if (var4 != null) {
            if (0 == var4.field_i) {
              return var4;
            } else {
              var4 = (vg) (Object) ag.field_i.b(6);
              continue L0;
            }
          } else {
            var4 = new vg();
            var4.field_p = 10;
            var4.field_i = 0;
            ag.field_i.a((br) (Object) var4, false);
            vi.a(7, var4, (byte) -126);
            return var4;
          }
        }
    }

    final static void a(float param0, int param1, String param2) {
        try {
            lh.field_i = param0;
            if (param1 != 80) {
                Object var4 = null;
                qm.a(-1.1143913269042969f, -113, (String) null);
            }
            od.field_Bb = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qm.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 12 % ((param0 - 8) / 49);
            int discarded$4 = 0;
            if (aa.e()) {
              break L1;
            } else {
              if (((qm) this).field_H.field_j.length() <= 0) {
                break L0;
              } else {
                if (((qm) this).field_M.field_j.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          hq.a(((qm) this).field_H.field_j, (byte) -125, ((qm) this).field_M.field_j);
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Create your own free Jagex account";
        field_N = "TRAITS";
    }
}
