/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class df extends tj implements fb, he {
    private boolean field_H;
    private fw field_O;
    private fn field_Q;
    static int field_E;
    static int field_T;
    private fw field_N;
    static int field_M;
    private fw field_R;
    private boolean field_P;
    private String field_I;
    private fn field_S;
    private boolean field_F;
    static je field_K;

    final void a(int param0, String param1) {
        fn var3 = null;
        String var4 = null;
        try {
            var3 = ((df) this).field_Q;
            var4 = param1;
            var3.a(false, var4, -27934);
            if (param0 != -17376) {
                ((df) this).field_O = null;
            }
            ((df) this).field_S.k(110);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "df.GA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(String param0, int param1) {
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
              if (param1 <= -52) {
                break L1;
              } else {
                df.a(84);
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
            stackOut_3_1 = new StringBuilder().append("df.CA(");
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
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    df(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (kh) null);
        RuntimeException var6 = null;
        nu var6_ref = null;
        ka var7 = null;
        String var8 = null;
        pf var9 = null;
        ta var12 = null;
        ta var13 = null;
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
        fw stackIn_17_1 = null;
        fw stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        fw stackIn_18_1 = null;
        fw stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        fw stackIn_19_1 = null;
        fw stackIn_19_2 = null;
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
        fw stackOut_16_1 = null;
        fw stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        fw stackOut_18_1 = null;
        fw stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        fw stackOut_17_1 = null;
        fw stackOut_17_2 = null;
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
              ((df) this).field_H = stackIn_4_1 != 0;
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
              ((df) this).field_F = stackIn_7_1 != 0;
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
              ((df) this).field_P = stackIn_10_1 != 0;
              ((df) this).field_I = param1;
              if (!((df) this).field_P) {
                break L4;
              } else {
                L5: {
                  if (((df) this).field_H) {
                    break L5;
                  } else {
                    if (!((df) this).field_F) {
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
              ((df) this).field_Q = (fn) (Object) new ma(param0, (qo) this, 100);
              ((df) this).field_S = (fn) (Object) new ma("", (qo) this, 20);
              if (!((df) this).field_P) {
                L7: {
                  ((df) this).field_O = new fw(ks.field_v, (qo) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((df) this).field_F) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = fj.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = pi.field_O;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((df) this).field_N = new fw(stackIn_19_3, (qo) null);
                if (!((df) this).field_H) {
                  break L6;
                } else {
                  ((df) this).field_R = new fw(li.field_p, (qo) this);
                  break L6;
                }
              } else {
                ((df) this).field_O = new fw(a.field_k, (qo) null);
                ((df) this).field_N = new fw(dt.field_c, (qo) null);
                ((df) this).field_Q.field_I = false;
                break L6;
              }
            }
            L8: {
              ((df) this).field_Q.field_k = (kh) (Object) new lu(10000536);
              ((df) this).field_S.field_k = (kh) (Object) new ol(10000536);
              var6_ref = new nu();
              ((df) this).field_O.field_k = (kh) (Object) var6_ref;
              if (((df) this).field_N == null) {
                break L8;
              } else {
                ((df) this).field_N.field_k = (kh) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((df) this).field_R == null) {
                break L9;
              } else {
                ((df) this).field_R.field_k = (kh) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((df) this).field_Q.field_s = de.field_d;
              if (null == ((df) this).field_R) {
                break L10;
              } else {
                ((df) this).field_R.field_s = hb.field_b;
                break L10;
              }
            }
            L11: {
              if (!((df) this).field_P) {
                if (((df) this).field_F) {
                  ((df) this).field_N.field_s = vn.field_e;
                  ((df) this).field_N.field_k = (kh) (Object) new td();
                  break L11;
                } else {
                  ((df) this).field_N.field_k = (kh) (Object) new td();
                  break L11;
                }
              } else {
                ((df) this).field_N.field_s = pe.field_v;
                break L11;
              }
            }
            L12: {
              ((df) this).field_p = 15;
              var7 = ArmiesOfGielinor.field_J;
              if (null == ((df) this).field_I) {
                break L12;
              } else {
                ((df) this).field_p = ((df) this).field_p + (5 + var7.a(((df) this).field_I, ((df) this).field_l + -40, var7.field_H));
                break L12;
              }
            }
            L13: {
              var8 = bh.field_J;
              var9 = ea.a(0, ag.d((byte) 34));
              if (var9 != vn.field_j) {
                if (var9 != ps.field_y) {
                  break L13;
                } else {
                  var8 = ui.field_h;
                  break L13;
                }
              } else {
                var8 = pl.field_t;
                break L13;
              }
            }
            L14: {
              ta dupTemp$2 = new ta(10, ((df) this).field_p, ((df) this).field_l - 20, 25, (kb) (Object) ((df) this).field_Q, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((df) this).a((byte) 10, (kb) (Object) dupTemp$2);
              ((df) this).field_p = ((df) this).field_p + (((kb) (Object) var12).field_w + 5);
              ta dupTemp$3 = new ta(10, ((df) this).field_p, -20 + ((df) this).field_l, 25, (kb) (Object) ((df) this).field_S, false, 80, 3, var7, 16777215, jj.field_h);
              var13 = dupTemp$3;
              ((df) this).a((byte) 10, (kb) (Object) dupTemp$3);
              ((df) this).field_O.field_x = (qo) this;
              ((df) this).field_p = ((df) this).field_p + (5 + ((kb) (Object) var13).field_w);
              if (((df) this).field_R == null) {
                break L14;
              } else {
                ((df) this).field_R.field_x = (qo) this;
                break L14;
              }
            }
            L15: {
              if (((df) this).field_N == null) {
                break L15;
              } else {
                ((df) this).field_N.field_x = (qo) this;
                break L15;
              }
            }
            L16: {
              if (null == ((df) this).field_R) {
                ((df) this).field_O.a(8, -10 + (((df) this).field_l - 6), ((df) this).field_p, 8192, 30);
                ((df) this).field_p = ((df) this).field_p + 35;
                break L16;
              } else {
                ((df) this).field_O.a(85, ((df) this).field_l - 95, ((df) this).field_p, 8192, 30);
                ((df) this).field_p = ((df) this).field_p + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((df) this).field_R) {
                break L17;
              } else {
                ((df) this).field_R.a(8, -10 + (((df) this).field_l + -6), ((df) this).field_p, 8192, 30);
                ((df) this).field_p = ((df) this).field_p + 35;
                break L17;
              }
            }
            L18: {
              if (((df) this).field_N == null) {
                break L18;
              } else {
                L19: {
                  if (((df) this).field_P) {
                    break L19;
                  } else {
                    if (((df) this).field_F) {
                      break L19;
                    } else {
                      ((df) this).field_N.a(8, 40, ((df) this).field_p, 8192, 20);
                      ((df) this).field_p = ((df) this).field_p + 25;
                      break L18;
                    }
                  }
                }
                ((df) this).field_N.a(8, -16 + ((df) this).field_l, ((df) this).field_p, 8192, 30);
                ((df) this).field_p = ((df) this).field_p + 35;
                break L18;
              }
            }
            L20: {
              ((df) this).a(0, ((df) this).field_l, 0, 8192, 3 + ((df) this).field_p);
              ((df) this).a((byte) 10, (kb) (Object) ((df) this).field_O);
              if (((df) this).field_R == null) {
                break L20;
              } else {
                ((df) this).a((byte) 10, (kb) (Object) ((df) this).field_R);
                break L20;
              }
            }
            L21: {
              if (((df) this).field_N == null) {
                break L21;
              } else {
                ((df) this).a((byte) 10, (kb) (Object) ((df) this).field_N);
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
            stackOut_57_1 = new StringBuilder().append("df.<init>(");
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
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void a(fn param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (((df) this).field_Q != param0) {
                break L1;
              } else {
                boolean discarded$3 = ((df) this).field_S.a(11, (kb) this);
                break L1;
              }
            }
            L2: {
              if (param1 == 80) {
                break L2;
              } else {
                var4 = null;
                ((df) this).a((fn) null, -76);
                break L2;
              }
            }
            L3: {
              if (((df) this).field_S == param0) {
                this.c(false);
                break L3;
              } else {
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
            stackOut_8_1 = new StringBuilder().append("df.EA(");
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 > -82) {
            df.a(-77);
        }
        if (!(null == ((df) this).field_I)) {
            int discarded$0 = ArmiesOfGielinor.field_J.a(((df) this).field_I, param0 - (-((df) this).field_B + -20), 15 + param1 + ((df) this).field_p, -40 + ((df) this).field_l, ((df) this).field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
        }
        if (!(((df) this).field_R == null)) {
            qn.e(10 + param0, 134 + param1, -20 + ((df) this).field_l, 4210752);
        }
        super.a(param0, param1, (byte) -104, param3);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                String discarded$2 = ((df) this).m(64);
                break L1;
              }
            }
            L2: {
              if (((df) this).field_O != param4) {
                if (((df) this).field_R != param4) {
                  if (param4 == ((df) this).field_N) {
                    if (((df) this).field_P) {
                      ft.e(17);
                      break L2;
                    } else {
                      if (!((df) this).field_F) {
                        me.a(param1 ^ 26573);
                        break L2;
                      } else {
                        ba.g(89);
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  rq.a(false);
                  break L2;
                }
              } else {
                this.c(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("df.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    public static void b(boolean param0) {
        field_K = null;
    }

    private final static boolean k(int param0) {
        if (param0 != 30) {
            boolean discarded$0 = df.k(105);
        }
        return fh.field_i;
    }

    public final void b(fn param0, int param1) {
        try {
            int var3_int = 14 % ((param1 - -80) / 33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "df.FA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0) {
        if (param0 != -20) {
            Object var2 = null;
            String discarded$0 = df.a((String) null, -20, (kl) null, -114, (String) null);
        }
        kr.field_C = new cv();
        gb.a(30, 21, 220, 420, 440, 470, new int[1], -121);
        gb.a(30, 22, 490, 610, 20, 50, new int[1], param0 + -55);
    }

    final String m(int param0) {
        if (!(((df) this).field_Q.field_v != null)) {
            return "";
        }
        if (param0 != -15056) {
            return null;
        }
        return ((df) this).field_Q.field_v;
    }

    private final void c(boolean param0) {
        L0: {
          L1: {
            if (df.k(30)) {
              break L1;
            } else {
              if (0 >= ((df) this).field_Q.field_v.length()) {
                break L0;
              } else {
                if (0 >= ((df) this).field_S.field_v.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          cm.a(((df) this).field_S.field_v, 0, ((df) this).field_Q.field_v);
          break L0;
        }
    }

    final static void l(int param0) {
        hf.field_a = 0;
    }

    final static String a(String param0, int param1, kl param2, int param3, String param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_1_0 = null;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param3 == -27638) {
              if (!param2.a((byte) 82)) {
                stackOut_5_0 = (String) param4;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                stackOut_7_0 = param0 + " - " + param2.b(param1, (byte) 73) + "%";
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("df.U(");
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
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
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_8_0;
    }

    final void a(byte param0) {
        ((df) this).field_Q.k(104);
        if (param0 >= -2) {
            return;
        }
        ((df) this).field_S.k(-79);
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param1) {
                stackOut_5_0 = ((df) this).a(false, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param1 == 99) {
                  stackOut_9_0 = ((df) this).b((byte) -128, param0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("df.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    static {
    }
}
