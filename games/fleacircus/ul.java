/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ul extends gj implements nk, da {
    private boolean field_K;
    private bb field_N;
    static String field_F;
    private boolean field_P;
    private bb field_I;
    private boolean field_M;
    private String field_O;
    private c field_H;
    private bb field_L;
    private c field_J;
    static pl field_G;

    final String j(int param0) {
        if (!(((ul) this).field_H.field_i != null)) {
            return "";
        }
        if (param0 != -1) {
            return null;
        }
        return ((ul) this).field_H.field_i;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (null != ((ul) this).field_O) {
            int discarded$0 = ug.field_e.a(((ul) this).field_O, 20 + ((ul) this).field_y + param1, 15 + ((ul) this).field_z + param0, -40 + ((ul) this).field_u, ((ul) this).field_j, 16777215, -1, 1, 0, ug.field_e.field_H);
        }
        if (!(((ul) this).field_N == null)) {
            gb.b(param1 + 10, param0 + 134, ((ul) this).field_u + -20, 4210752);
        }
        super.b(param0, param1, param2, param3);
    }

    private final void e() {
        L0: {
          L1: {
            int discarded$4 = 39;
            if (o.c()) {
              break L1;
            } else {
              if (((ul) this).field_H.field_i.length() <= 0) {
                break L0;
              } else {
                if (0 >= ((ul) this).field_J.field_i.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          pc.a(false, ((ul) this).field_H.field_i, ((ul) this).field_J.field_i);
          break L0;
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((ul) this).b(param2, -28533);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 == 99) {
                  stackOut_10_0 = ((ul) this).a(32, param2);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ul.N(").append(param0).append(',').append(param1).append(',');
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
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    public final void a(int param0, c param1) {
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
              if (param1 == ((ul) this).field_H) {
                boolean discarded$4 = ((ul) this).field_J.a((qa) this, -123);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ul) this).field_J != param1) {
                break L2;
              } else {
                int discarded$5 = -32;
                this.e();
                break L2;
              }
            }
            L3: {
              if (param0 == -31825) {
                break L3;
              } else {
                ((ul) this).field_N = null;
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
            stackOut_8_1 = new StringBuilder().append("ul.DA(").append(param0).append(',');
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        nf.field_K = (param1 & 48) >> 4;
        if (nf.field_K > 2) {
            nf.field_K = 2;
        }
    }

    public final void b(int param0, c param1) {
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
              if (param0 == 40) {
                break L1;
              } else {
                ((ul) this).field_M = true;
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
            stackOut_3_1 = new StringBuilder().append("ul.BA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void c(boolean param0) {
        kb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var6 = null;
        fa var7 = null;
        var5 = fleas.field_A ? 1 : 0;
        var6 = tl.field_p;
        var7 = var6;
        if (!param0) {
          return;
        } else {
          L0: {
            var2 = (kb) (Object) pb.field_f.c((byte) 47);
            if (var2 != null) {
              L1: {
                var4 = hi.field_q;
                if (var4 >= 80) {
                  if (var4 >= 230) {
                    var3 = 123 - var4 / 2;
                    break L1;
                  } else {
                    var3 = 8;
                    break L1;
                  }
                } else {
                  var3 = var4 / 2 + -32;
                  break L1;
                }
              }
              gb.g(0, -4 + var3, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16755200, 128);
              gb.e(0, var3 + -4, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16746496, 128);
              il.field_d[var2.field_q].c(8, var3);
              var6.c(wa.field_f[var2.field_q], 48, var3 + var7.field_H, 0, -1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void k(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 16777215) {
            ul.k(-9);
        }
    }

    final void a(byte param0, String param1) {
        c var3 = null;
        String var4 = null;
        try {
            var3 = ((ul) this).field_H;
            var4 = param1;
            if (param0 > -100) {
                ((ul) this).field_P = false;
            }
            var3.a(false, (byte) -127, var4);
            ((ul) this).field_J.r(32);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ul.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
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
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 248) {
              L1: {
                if (((ul) this).field_I != param4) {
                  if (((ul) this).field_N != param4) {
                    if (((ul) this).field_L != param4) {
                      break L1;
                    } else {
                      if (!((ul) this).field_P) {
                        if (((ul) this).field_K) {
                          ej.a(param3 ^ 232);
                          break L1;
                        } else {
                          td.g(param3 ^ 252);
                          break L1;
                        }
                      } else {
                        int discarded$9 = -124;
                        vi.c();
                        break L1;
                      }
                    }
                  } else {
                    int discarded$10 = 0;
                    oh.d();
                    break L1;
                  }
                } else {
                  int discarded$11 = -32;
                  this.e();
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
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ul.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void a(int param0) {
        ((ul) this).field_H.r(32);
        int var2 = 38 / ((29 - param0) / 45);
        ((ul) this).field_J.r(32);
    }

    ul(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ch) null);
        RuntimeException var6 = null;
        ri var6_ref = null;
        fa var7 = null;
        String var8 = null;
        wh var9 = null;
        ml var12 = null;
        ml var13 = null;
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
        bb stackIn_16_1 = null;
        bb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        bb stackIn_17_1 = null;
        bb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        bb stackIn_18_1 = null;
        bb stackIn_18_2 = null;
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
        bb stackOut_15_1 = null;
        bb stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        bb stackOut_17_1 = null;
        bb stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        bb stackOut_16_1 = null;
        bb stackOut_16_2 = null;
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
              ((ul) this).field_M = stackIn_4_1 != 0;
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
              ((ul) this).field_K = stackIn_7_1 != 0;
              ((ul) this).field_O = param1;
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
              ((ul) this).field_P = stackIn_10_1 != 0;
              if (!((ul) this).field_P) {
                break L4;
              } else {
                L5: {
                  if (((ul) this).field_M) {
                    break L5;
                  } else {
                    if (!((ul) this).field_K) {
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
              ((ul) this).field_H = (c) (Object) new bc(param0, (kd) this, 100);
              ((ul) this).field_J = (c) (Object) new bc("", (kd) this, 20);
              if (((ul) this).field_P) {
                ((ul) this).field_I = new bb(uh.field_o, (kd) null);
                ((ul) this).field_L = new bb(vk.field_K, (kd) null);
                ((ul) this).field_H.field_D = false;
                break L6;
              } else {
                L7: {
                  ((ul) this).field_I = new bb(wi.field_h, (kd) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!((ul) this).field_K) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = mi.field_k;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = tc.field_g;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((ul) this).field_L = new bb(stackIn_18_3, (kd) null);
                if (!((ul) this).field_M) {
                  break L6;
                } else {
                  ((ul) this).field_N = new bb(qk.field_h, (kd) this);
                  break L6;
                }
              }
            }
            L8: {
              ((ul) this).field_H.field_p = (ch) (Object) new aa(10000536);
              ((ul) this).field_J.field_p = (ch) (Object) new mh(10000536);
              var6_ref = new ri();
              ((ul) this).field_I.field_p = (ch) (Object) var6_ref;
              if (((ul) this).field_L == null) {
                break L8;
              } else {
                ((ul) this).field_L.field_p = (ch) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((ul) this).field_H.field_m = uf.field_l;
              if (((ul) this).field_N == null) {
                break L9;
              } else {
                ((ul) this).field_N.field_p = (ch) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (((ul) this).field_N == null) {
                break L10;
              } else {
                ((ul) this).field_N.field_m = se.field_f;
                break L10;
              }
            }
            L11: {
              if (!((ul) this).field_P) {
                if (((ul) this).field_K) {
                  ((ul) this).field_L.field_m = ga.field_n;
                  ((ul) this).field_L.field_p = (ch) (Object) new me();
                  break L11;
                } else {
                  ((ul) this).field_L.field_p = (ch) (Object) new me();
                  break L11;
                }
              } else {
                ((ul) this).field_L.field_m = db.field_F;
                break L11;
              }
            }
            L12: {
              ((ul) this).field_z = 15;
              var7 = ug.field_e;
              if (((ul) this).field_O == null) {
                break L12;
              } else {
                ((ul) this).field_z = ((ul) this).field_z + (var7.b(((ul) this).field_O, ((ul) this).field_u + -40, var7.field_H) + 5);
                break L12;
              }
            }
            L13: {
              var8 = se.field_e;
              var9 = hd.a(true, rl.a((byte) -107));
              if (ml.field_F != var9) {
                if (wd.field_b != var9) {
                  break L13;
                } else {
                  var8 = l.field_a;
                  break L13;
                }
              } else {
                var8 = ck.field_q;
                break L13;
              }
            }
            L14: {
              ml dupTemp$2 = new ml(10, ((ul) this).field_z, ((ul) this).field_u + -20, 25, (qa) (Object) ((ul) this).field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((ul) this).a((qa) (Object) dupTemp$2, (byte) -61);
              ((ul) this).field_z = ((ul) this).field_z + (5 + ((qa) (Object) var12).field_j);
              ml dupTemp$3 = new ml(10, ((ul) this).field_z, ((ul) this).field_u - 20, 25, (qa) (Object) ((ul) this).field_J, false, 80, 3, var7, 16777215, kc.field_g);
              var13 = dupTemp$3;
              ((ul) this).a((qa) (Object) dupTemp$3, (byte) -118);
              ((ul) this).field_I.field_s = (kd) this;
              ((ul) this).field_z = ((ul) this).field_z + (((qa) (Object) var13).field_j - -5);
              if (null == ((ul) this).field_N) {
                break L14;
              } else {
                ((ul) this).field_N.field_s = (kd) this;
                break L14;
              }
            }
            L15: {
              if (null == ((ul) this).field_L) {
                break L15;
              } else {
                ((ul) this).field_L.field_s = (kd) this;
                break L15;
              }
            }
            L16: {
              if (null == ((ul) this).field_N) {
                ((ul) this).field_I.a(8, -6 + ((ul) this).field_u + -10, ((ul) this).field_z, 30, 80);
                ((ul) this).field_z = ((ul) this).field_z + 35;
                break L16;
              } else {
                ((ul) this).field_I.a(85, -95 + ((ul) this).field_u, ((ul) this).field_z, 30, 80);
                ((ul) this).field_z = ((ul) this).field_z + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((ul) this).field_N) {
                break L17;
              } else {
                ((ul) this).field_N.a(8, -6 + ((ul) this).field_u - 10, ((ul) this).field_z, 30, 80);
                ((ul) this).field_z = ((ul) this).field_z + 35;
                break L17;
              }
            }
            L18: {
              if (((ul) this).field_L == null) {
                break L18;
              } else {
                L19: {
                  if (((ul) this).field_P) {
                    break L19;
                  } else {
                    if (((ul) this).field_K) {
                      break L19;
                    } else {
                      ((ul) this).field_L.a(8, 40, ((ul) this).field_z, 20, 80);
                      ((ul) this).field_z = ((ul) this).field_z + 25;
                      break L18;
                    }
                  }
                }
                ((ul) this).field_L.a(8, -6 + ((ul) this).field_u + -10, ((ul) this).field_z, 30, 80);
                ((ul) this).field_z = ((ul) this).field_z + 35;
                break L18;
              }
            }
            L20: {
              ((ul) this).a(0, ((ul) this).field_u, 0, ((ul) this).field_z + 3, 80);
              ((ul) this).a((qa) (Object) ((ul) this).field_I, (byte) -76);
              if (null == ((ul) this).field_N) {
                break L20;
              } else {
                ((ul) this).a((qa) (Object) ((ul) this).field_N, (byte) -42);
                break L20;
              }
            }
            L21: {
              if (null == ((ul) this).field_L) {
                break L21;
              } else {
                ((ul) this).a((qa) (Object) ((ul) this).field_L, (byte) -33);
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
            stackOut_57_1 = new StringBuilder().append("ul.<init>(");
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
          throw pf.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
