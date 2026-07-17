/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dn extends ii implements jo, vg {
    static String[] field_N;
    private boolean field_X;
    private boolean field_P;
    private ck field_K;
    static String field_T;
    private boolean field_M;
    static String field_W;
    private rm field_O;
    static long field_Q;
    static String field_L;
    private ck field_U;
    private String field_S;
    private ck field_V;
    private rm field_R;

    final void i(int param0) {
        ((dn) this).field_O.p(72);
        ((dn) this).field_R.p(50);
        if (param0 != 22377) {
            dn.b(true);
        }
    }

    final void a(int param0, String param1) {
        rm var3 = null;
        String var4 = null;
        if (param0 != -12349) {
            return;
        }
        try {
            var3 = ((dn) this).field_O;
            var4 = param1;
            var3.a(var4, false, (byte) 64);
            ((dn) this).field_R.p(param0 + 12457);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "dn.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
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
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == 98) {
              L1: {
                if (((dn) this).field_U != param0) {
                  if (((dn) this).field_V != param0) {
                    if (((dn) this).field_K == param0) {
                      if (((dn) this).field_X) {
                        wk.a(-1);
                        break L1;
                      } else {
                        if (!((dn) this).field_M) {
                          ue.a(param1 + -178);
                          break L1;
                        } else {
                          li.c(param1 + 218);
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    nh.c(true);
                    break L1;
                  }
                } else {
                  this.j(-24327);
                  break L1;
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
            stackOut_15_1 = new StringBuilder().append("dn.FA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final String a(int param0) {
        if (param0 != -16) {
            return null;
        }
        if (!(((dn) this).field_O.field_w != null)) {
            return "";
        }
        return ((dn) this).field_O.field_w;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_11_0 = false;
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
            L1: {
              if (param3 >= 55) {
                break L1;
              } else {
                String discarded$2 = ((dn) this).a(-70);
                break L1;
              }
            }
            if (super.a(param0, param1, param2, (byte) 61)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_8_0 = ((dn) this).a(param0, (byte) 71);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param2 != 99) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = ((dn) this).a((byte) -5, param0);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("dn.W(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public final void a(rm param0, byte param1) {
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
              if (param0 == ((dn) this).field_O) {
                boolean discarded$2 = ((dn) this).field_R.a(34, (lm) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((dn) this).field_R != param0) {
                break L2;
              } else {
                this.j(-24327);
                break L2;
              }
            }
            L3: {
              if (param1 < -117) {
                break L3;
              } else {
                ((dn) this).field_O = null;
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
            stackOut_8_1 = new StringBuilder().append("dn.L(");
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
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final static void b(boolean param0) {
        if (!tl.field_l) {
            throw new IllegalStateException();
        }
        oj.field_b = true;
        t.a(param0, 0);
        kh.field_n = 0;
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        un var5 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_7_0 = null;
        Object stackOut_3_0 = null;
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
            if (param2 == 48) {
              break L0;
            } else {
              var4 = null;
              byte[] discarded$2 = dn.a((Object) null, true, (byte) 79);
              break L0;
            }
          }
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (!(param0 instanceof un)) {
                throw new IllegalArgumentException();
              } else {
                var5 = (un) param0;
                stackOut_12_0 = var5.b((byte) 60);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              var3 = (byte[]) param0;
              if (!param1) {
                stackOut_9_0 = (byte[]) var3;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_7_0 = gg.a((byte) -92, var3);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          } else {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("dn.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void j(int param0) {
        L0: {
          L1: {
            if (n.a((byte) 118)) {
              break L1;
            } else {
              if (((dn) this).field_O.field_w.length() <= 0) {
                break L0;
              } else {
                if (((dn) this).field_R.field_w.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ck.a(((dn) this).field_R.field_w, 11, ((dn) this).field_O.field_w);
          break L0;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        int var1 = 0;
        field_W = null;
        field_N = null;
        field_T = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((dn) this).field_S == null)) {
            int discarded$0 = lp.field_C.a(((dn) this).field_S, 20 + ((dn) this).field_q + param1, param3 + ((dn) this).field_v + 15, -40 + ((dn) this).field_x, ((dn) this).field_s, 16777215, -1, 1, 0, lp.field_C.field_H);
        }
        if (!(null == ((dn) this).field_V)) {
            gf.b(10 + param1, param3 - -134, ((dn) this).field_x - 20, 4210752);
        }
        super.a(param0, param1, param2 ^ param2, param3);
    }

    dn(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ca) null);
        RuntimeException var6 = null;
        na var6_ref = null;
        se var7 = null;
        String var8 = null;
        ba var9 = null;
        dg var12 = null;
        dg var13 = null;
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
        ck stackIn_17_1 = null;
        ck stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ck stackIn_18_1 = null;
        ck stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ck stackIn_19_1 = null;
        ck stackIn_19_2 = null;
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
        ck stackOut_16_1 = null;
        ck stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        ck stackOut_18_1 = null;
        ck stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        ck stackOut_17_1 = null;
        ck stackOut_17_2 = null;
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
              ((dn) this).field_M = stackIn_4_1 != 0;
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
              ((dn) this).field_X = stackIn_7_1 != 0;
              ((dn) this).field_S = param1;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
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
              ((dn) this).field_P = stackIn_10_1 != 0;
              if (!((dn) this).field_X) {
                break L4;
              } else {
                L5: {
                  if (((dn) this).field_P) {
                    break L5;
                  } else {
                    if (!((dn) this).field_M) {
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
              ((dn) this).field_O = (rm) (Object) new uh(param0, (pg) this, 100);
              ((dn) this).field_R = (rm) (Object) new uh("", (pg) this, 20);
              if (!((dn) this).field_X) {
                L7: {
                  ((dn) this).field_U = new ck(uo.field_e, (pg) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((dn) this).field_M) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = gk.field_O;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = kd.field_b;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((dn) this).field_K = new ck(stackIn_19_3, (pg) null);
                if (!((dn) this).field_P) {
                  break L6;
                } else {
                  ((dn) this).field_V = new ck(qp.field_c, (pg) this);
                  break L6;
                }
              } else {
                ((dn) this).field_U = new ck(kn.field_a, (pg) null);
                ((dn) this).field_K = new ck(db.field_u, (pg) null);
                ((dn) this).field_O.field_B = false;
                break L6;
              }
            }
            L8: {
              ((dn) this).field_O.field_o = (ca) (Object) new mc(10000536);
              ((dn) this).field_R.field_o = (ca) (Object) new ic(10000536);
              var6_ref = new na();
              ((dn) this).field_U.field_o = (ca) (Object) var6_ref;
              if (null == ((dn) this).field_K) {
                break L8;
              } else {
                ((dn) this).field_K.field_o = (ca) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (null == ((dn) this).field_V) {
                break L9;
              } else {
                ((dn) this).field_V.field_o = (ca) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((dn) this).field_O.field_i = rj.field_y;
              if (((dn) this).field_V == null) {
                break L10;
              } else {
                ((dn) this).field_V.field_i = hj.field_U;
                break L10;
              }
            }
            L11: {
              if (!((dn) this).field_X) {
                if (((dn) this).field_M) {
                  ((dn) this).field_K.field_i = oh.field_n;
                  ((dn) this).field_K.field_o = (ca) (Object) new oa();
                  break L11;
                } else {
                  ((dn) this).field_K.field_o = (ca) (Object) new oa();
                  break L11;
                }
              } else {
                ((dn) this).field_K.field_i = gd.field_D;
                break L11;
              }
            }
            L12: {
              ((dn) this).field_v = 15;
              var7 = lp.field_C;
              if (((dn) this).field_S == null) {
                break L12;
              } else {
                ((dn) this).field_v = ((dn) this).field_v + (5 + var7.a(((dn) this).field_S, -40 + ((dn) this).field_x, var7.field_H));
                break L12;
              }
            }
            L13: {
              var8 = cp.field_T;
              var9 = gb.a(m.c(true), -119);
              if (ba.field_e == var9) {
                var8 = me.field_e;
                break L13;
              } else {
                if (var9 != gg.field_c) {
                  break L13;
                } else {
                  var8 = hf.field_ub;
                  break L13;
                }
              }
            }
            L14: {
              dg dupTemp$2 = new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((dn) this).b((byte) -54, (lm) (Object) dupTemp$2);
              ((dn) this).field_v = ((dn) this).field_v + (((lm) (Object) var12).field_s - -5);
              dg dupTemp$3 = new dg(10, ((dn) this).field_v, -20 + ((dn) this).field_x, 25, (lm) (Object) ((dn) this).field_R, false, 80, 3, var7, 16777215, fk.field_r);
              var13 = dupTemp$3;
              ((dn) this).b((byte) -54, (lm) (Object) dupTemp$3);
              ((dn) this).field_U.field_n = (pg) this;
              ((dn) this).field_v = ((dn) this).field_v + (((lm) (Object) var13).field_s + 5);
              if (null == ((dn) this).field_V) {
                break L14;
              } else {
                ((dn) this).field_V.field_n = (pg) this;
                break L14;
              }
            }
            L15: {
              if (((dn) this).field_K == null) {
                break L15;
              } else {
                ((dn) this).field_K.field_n = (pg) this;
                break L15;
              }
            }
            L16: {
              if (((dn) this).field_V != null) {
                ((dn) this).field_U.b(0, -95 + ((dn) this).field_x, ((dn) this).field_v, 85, 30);
                ((dn) this).field_v = ((dn) this).field_v + 60;
                break L16;
              } else {
                ((dn) this).field_U.b(0, ((dn) this).field_x + -16, ((dn) this).field_v, 8, 30);
                ((dn) this).field_v = ((dn) this).field_v + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((dn) this).field_V) {
                break L17;
              } else {
                ((dn) this).field_V.b(0, ((dn) this).field_x - 16, ((dn) this).field_v, 8, 30);
                ((dn) this).field_v = ((dn) this).field_v + 35;
                break L17;
              }
            }
            L18: {
              if (((dn) this).field_K == null) {
                break L18;
              } else {
                L19: {
                  if (((dn) this).field_X) {
                    break L19;
                  } else {
                    if (!((dn) this).field_M) {
                      ((dn) this).field_K.b(0, 40, ((dn) this).field_v, 8, 20);
                      ((dn) this).field_v = ((dn) this).field_v + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((dn) this).field_K.b(0, ((dn) this).field_x - 16, ((dn) this).field_v, 8, 30);
                ((dn) this).field_v = ((dn) this).field_v + 35;
                break L18;
              }
            }
            L20: {
              ((dn) this).b(0, ((dn) this).field_x, 0, 0, ((dn) this).field_v + 3);
              ((dn) this).b((byte) -55, (lm) (Object) ((dn) this).field_U);
              if (null == ((dn) this).field_V) {
                break L20;
              } else {
                ((dn) this).b((byte) -128, (lm) (Object) ((dn) this).field_V);
                break L20;
              }
            }
            L21: {
              if (((dn) this).field_K == null) {
                break L21;
              } else {
                ((dn) this).b((byte) -104, (lm) (Object) ((dn) this).field_K);
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
            stackOut_57_1 = new StringBuilder().append("dn.<init>(");
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
          throw vk.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void a(rm param0, int param1) {
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
              if (param1 == 10000536) {
                break L1;
              } else {
                var4 = null;
                ((dn) this).a((rm) null, (byte) 51);
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
            stackOut_3_1 = new StringBuilder().append("dn.R(");
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
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[]{"Fire Immunity", "Immune to dragonfire."};
        field_W = "Goblin Scout";
        field_T = "MEMBERS ONLY";
        field_L = "<col=2E5D17>Advance</col>";
    }
}
