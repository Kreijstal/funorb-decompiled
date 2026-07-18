/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cl extends kn implements wg, sh {
    static int field_T;
    private hc field_S;
    private hc field_J;
    private boolean field_K;
    private boolean field_N;
    private boolean field_O;
    private ui field_L;
    static int field_I;
    private String field_R;
    private ui field_P;
    static String field_M;
    private hc field_Q;

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
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
            try {
              L1: {
                var4 = param0.getGraphics();
                bj.field_e.a(0, 113, var4, 0);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param0.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("cl.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 0 + ',' + 0 + ',' + 310 + ')');
        }
    }

    final void n(int param0) {
        if (param0 != -6) {
            ((cl) this).n(68);
        }
        ((cl) this).field_P.f((byte) 112);
        ((cl) this).field_L.f((byte) 112);
    }

    final void a(String param0, int param1) {
        ui var3 = ((cl) this).field_P;
        String var4 = param0;
        var3.a(false, false, var4);
        if (param1 < 50) {
            return;
        }
        try {
            ((cl) this).field_L.f((byte) 112);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "cl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (dl.a(55)) {
              break L1;
            } else {
              if (((cl) this).field_P.field_s.length() <= 0) {
                break L0;
              } else {
                if (0 < ((cl) this).field_L.field_s.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          sj.a(((cl) this).field_L.field_s, 19260, ((cl) this).field_P.field_s);
          break L0;
        }
        var2 = 33 % ((param0 - 78) / 45);
    }

    public final void b(ui param0, int param1) {
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
              if (param1 == 60) {
                break L1;
              } else {
                var4 = null;
                ((cl) this).a(-73, (byte) -46, (hc) null, -35, 115);
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
            stackOut_3_1 = new StringBuilder().append("cl.L(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void o(int param0) {
        field_M = null;
    }

    final String a(byte param0) {
        if (!(null != ((cl) this).field_P.field_s)) {
            return "";
        }
        int var2 = 25 / ((param0 - 61) / 46);
        return ((cl) this).field_P.field_s;
    }

    cl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ad) null);
        RuntimeException var6 = null;
        wi var6_ref = null;
        we var7 = null;
        String var8 = null;
        sj var9 = null;
        am var12 = null;
        am var13 = null;
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
        hc stackIn_17_1 = null;
        hc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hc stackIn_18_1 = null;
        hc stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        hc stackIn_19_1 = null;
        hc stackIn_19_2 = null;
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
        hc stackOut_16_1 = null;
        hc stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        hc stackOut_18_1 = null;
        hc stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        hc stackOut_17_1 = null;
        hc stackOut_17_2 = null;
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
              if (!param2) {
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
              ((cl) this).field_N = stackIn_4_1 != 0;
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
              ((cl) this).field_K = stackIn_7_1 != 0;
              ((cl) this).field_R = param1;
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
              ((cl) this).field_O = stackIn_10_1 != 0;
              if (!((cl) this).field_N) {
                break L4;
              } else {
                L5: {
                  if (((cl) this).field_K) {
                    break L5;
                  } else {
                    if (!((cl) this).field_O) {
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
              ((cl) this).field_P = (ui) (Object) new ke(param0, (rm) this, 100);
              ((cl) this).field_L = (ui) (Object) new ke("", (rm) this, 20);
              if (!((cl) this).field_N) {
                L7: {
                  ((cl) this).field_S = new hc(lj.field_o, (rm) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((cl) this).field_O) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = hj.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = hk.field_d;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((cl) this).field_Q = new hc(stackIn_19_3, (rm) null);
                if (!((cl) this).field_K) {
                  break L6;
                } else {
                  ((cl) this).field_J = new hc(u.field_a, (rm) this);
                  break L6;
                }
              } else {
                ((cl) this).field_S = new hc(af.field_s, (rm) null);
                ((cl) this).field_Q = new hc(o.field_b, (rm) null);
                ((cl) this).field_P.field_E = false;
                break L6;
              }
            }
            L8: {
              ((cl) this).field_P.field_A = (ad) (Object) new gk(10000536);
              ((cl) this).field_L.field_A = (ad) (Object) new mn(10000536);
              var6_ref = new wi();
              ((cl) this).field_S.field_A = (ad) (Object) var6_ref;
              if (null == ((cl) this).field_Q) {
                break L8;
              } else {
                ((cl) this).field_Q.field_A = (ad) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (null == ((cl) this).field_J) {
                break L9;
              } else {
                ((cl) this).field_J.field_A = (ad) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((cl) this).field_P.field_n = in.field_a;
              if (null == ((cl) this).field_J) {
                break L10;
              } else {
                ((cl) this).field_J.field_n = ha.field_f;
                break L10;
              }
            }
            L11: {
              if (((cl) this).field_N) {
                ((cl) this).field_Q.field_n = eb.field_c;
                break L11;
              } else {
                if (!((cl) this).field_O) {
                  ((cl) this).field_Q.field_A = (ad) (Object) new nc();
                  break L11;
                } else {
                  ((cl) this).field_Q.field_n = si.field_c;
                  ((cl) this).field_Q.field_A = (ad) (Object) new nc();
                  break L11;
                }
              }
            }
            L12: {
              ((cl) this).field_t = 15;
              var7 = bn.field_d;
              if (null == ((cl) this).field_R) {
                break L12;
              } else {
                ((cl) this).field_t = ((cl) this).field_t + (5 + var7.b(((cl) this).field_R, ((cl) this).field_v - 40, var7.field_I));
                break L12;
              }
            }
            L13: {
              var8 = oe.field_c;
              var9 = hm.a(28, bm.c(-83));
              if (var9 != ak.field_b) {
                if (var9 != hj.field_e) {
                  break L13;
                } else {
                  var8 = ka.field_b;
                  break L13;
                }
              } else {
                var8 = bg.field_b;
                break L13;
              }
            }
            L14: {
              am dupTemp$2 = new am(10, ((cl) this).field_t, ((cl) this).field_v - 20, 25, (fe) (Object) ((cl) this).field_P, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((cl) this).a(-1, (fe) (Object) dupTemp$2);
              ((cl) this).field_t = ((cl) this).field_t + (((fe) (Object) var12).field_q + 5);
              am dupTemp$3 = new am(10, ((cl) this).field_t, ((cl) this).field_v - 20, 25, (fe) (Object) ((cl) this).field_L, false, 80, 3, var7, 16777215, tk.field_c);
              var13 = dupTemp$3;
              ((cl) this).a(-1, (fe) (Object) dupTemp$3);
              ((cl) this).field_S.field_y = (rm) this;
              ((cl) this).field_t = ((cl) this).field_t + (((fe) (Object) var13).field_q - -5);
              if (null == ((cl) this).field_J) {
                break L14;
              } else {
                ((cl) this).field_J.field_y = (rm) this;
                break L14;
              }
            }
            L15: {
              if (((cl) this).field_Q == null) {
                break L15;
              } else {
                ((cl) this).field_Q.field_y = (rm) this;
                break L15;
              }
            }
            L16: {
              if (null != ((cl) this).field_J) {
                ((cl) this).field_S.a(30, -102, 85, -95 + ((cl) this).field_v, ((cl) this).field_t);
                ((cl) this).field_t = ((cl) this).field_t + 60;
                break L16;
              } else {
                ((cl) this).field_S.a(30, -127, 8, -6 + ((cl) this).field_v - 10, ((cl) this).field_t);
                ((cl) this).field_t = ((cl) this).field_t + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((cl) this).field_J) {
                break L17;
              } else {
                ((cl) this).field_J.a(30, -115, 8, ((cl) this).field_v + -16, ((cl) this).field_t);
                ((cl) this).field_t = ((cl) this).field_t + 35;
                break L17;
              }
            }
            L18: {
              if (((cl) this).field_Q == null) {
                break L18;
              } else {
                L19: {
                  if (((cl) this).field_N) {
                    break L19;
                  } else {
                    if (!((cl) this).field_O) {
                      ((cl) this).field_Q.a(20, -115, 8, 40, ((cl) this).field_t);
                      ((cl) this).field_t = ((cl) this).field_t + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((cl) this).field_Q.a(30, -124, 8, ((cl) this).field_v - 16, ((cl) this).field_t);
                ((cl) this).field_t = ((cl) this).field_t + 35;
                break L18;
              }
            }
            L20: {
              ((cl) this).a(((cl) this).field_t + 3, -84, 0, ((cl) this).field_v, 0);
              ((cl) this).a(-1, (fe) (Object) ((cl) this).field_S);
              if (null == ((cl) this).field_J) {
                break L20;
              } else {
                ((cl) this).a(-1, (fe) (Object) ((cl) this).field_J);
                break L20;
              }
            }
            L21: {
              if (null == ((cl) this).field_Q) {
                break L21;
              } else {
                ((cl) this).a(-1, (fe) (Object) ((cl) this).field_Q);
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
            stackOut_57_1 = new StringBuilder().append("cl.<init>(");
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
          throw lj.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param3) {
                stackOut_5_0 = ((cl) this).b(param1, 0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param3 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((cl) this).a(param1, (byte) 12);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
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
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("cl.K(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void p(int param0) {
        int var1 = 0;
        if (ee.field_J <= 32) {
            fc.a(0, (byte) 44);
        } else {
            var1 = ee.field_J % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            fc.a(-var1 + ee.field_J, (byte) 112);
        }
    }

    final static void q(int param0) {
        pj.a(u.b(-4440) < mk.b(45) ? true : false, (byte) -119);
        if (param0 > -59) {
            field_I = 80;
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var3 <= var2_int) {
                  break L1;
                } else {
                  if (!ra.a(122, param1.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!ra.a(122, param1.charAt(-1 + var3))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = -var2_int + var3;
                if (1 <= var4) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var3 <= var6) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var7 = param1.charAt(var6);
                          if (wj.a((char) var7, 96)) {
                            var8 = ha.a(242, (char) var7);
                            if (0 == var8) {
                              break L5;
                            } else {
                              StringBuilder discarded$1 = var5.append((char) var8);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (String) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("cl.D(").append(-95).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
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
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 != ((cl) this).field_S) {
                if (param2 == ((cl) this).field_J) {
                  fe.e(param1 ^ 26319);
                  break L1;
                } else {
                  if (param2 == ((cl) this).field_Q) {
                    if (((cl) this).field_N) {
                      ta.f((byte) 67);
                      break L1;
                    } else {
                      if (!((cl) this).field_O) {
                        nm.a(-6145);
                        break L1;
                      } else {
                        hk.c(-121);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                this.r(125);
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                ((cl) this).field_L = null;
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
            stackOut_15_1 = new StringBuilder().append("cl.B(").append(param0).append(',').append(param1).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((cl) this).field_R != null) {
            int discarded$0 = bn.field_d.a(((cl) this).field_R, 20 + param1 + ((cl) this).field_u, 15 + ((cl) this).field_t + param2, ((cl) this).field_v + -40, ((cl) this).field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
        }
        if (!(null == ((cl) this).field_J)) {
            eh.e(10 + param1, 134 + param2, -20 + ((cl) this).field_v, 4210752);
        }
        if (param0 != 4) {
            Object var6 = null;
            ((cl) this).a((String) null, 73);
        }
        super.a((byte) 4, param1, param2, param3);
    }

    public final void a(ui param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 == -7802) {
              L1: {
                if (param0 == ((cl) this).field_P) {
                  boolean discarded$3 = ((cl) this).field_L.a((fe) this, param1 ^ -7687);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((cl) this).field_L == param0) {
                  this.r(param1 ^ 7749);
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cl.J(");
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
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "These platinum climbing hooks let you hold on to rock faces while mining them. Jump onto a wall to hold on and press down or turn away to fall off.";
    }
}
