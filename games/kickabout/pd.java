/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class pd extends wj implements sv, vh {
    private ga field_J;
    private ga field_N;
    private wi field_K;
    private boolean field_C;
    private wi field_F;
    private boolean field_H;
    static Random field_E;
    private wi field_L;
    private String field_D;
    private boolean field_I;
    static ew field_G;
    static int[] field_B;
    static String[] field_M;

    final void h(byte param0) {
        ((pd) this).field_N.i((byte) -55);
        ((pd) this).field_J.i((byte) -70);
        if (param0 >= -65) {
            ((pd) this).field_C = false;
        }
    }

    private final void l() {
        L0: {
          L1: {
            int discarded$4 = 3;
            if (cd.a()) {
              break L1;
            } else {
              if (((pd) this).field_N.field_q.length() <= 0) {
                break L0;
              } else {
                if (((pd) this).field_J.field_q.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ss.a(((pd) this).field_J.field_q, (byte) -118, ((pd) this).field_N.field_q);
          break L0;
        }
    }

    final static void a(ut param0) {
        double[] var3 = null;
        if (ih.field_c == 0) {
            return;
        }
        try {
            var3 = oh.field_a[ih.field_c];
            double[] var2 = var3;
            nh.a(param0, var3[0], var3[1], var3[2]);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pd.A(" + (param0 != null ? "{...}" : "null") + ',' + 20684 + ')');
        }
    }

    final static void a(byte param0, int param1, sm param2) {
        try {
            if (param0 != 70) {
                pd.a((byte) -2);
            }
            ia.field_d.a((gn) (Object) param2, param0 + -67);
            mp.a(125, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pd.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, ga param1) {
        try {
            if (!(((pd) this).field_N != param1)) {
                boolean discarded$0 = ((pd) this).field_J.a((fd) this, 0);
            }
            if (((pd) this).field_J == param1) {
                int discarded$1 = 60;
                this.l();
            }
            int var3_int = 35 / ((param0 - 8) / 47);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(((pd) this).field_D == null)) {
            int discarded$0 = gf.field_a.a(((pd) this).field_D, 20 + param2 - -((pd) this).field_t, 15 + param3 + ((pd) this).field_g, -40 + ((pd) this).field_n, ((pd) this).field_i, 16777215, -1, 1, 0, gf.field_a.field_G);
        }
        if (!(null == ((pd) this).field_L)) {
            on.f(param2 - -10, param3 + 134, -20 + ((pd) this).field_n, 4210752);
        }
        super.a(param0, (int) (char)param1, param2, param3);
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
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
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 != ((pd) this).field_K) {
                if (((pd) this).field_L != param1) {
                  if (((pd) this).field_F == param1) {
                    if (!((pd) this).field_H) {
                      if (((pd) this).field_C) {
                        jk.a((byte) -124);
                        break L1;
                      } else {
                        iw.g(4);
                        break L1;
                      }
                    } else {
                      int discarded$6 = 0;
                      uv.a();
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  fr.a((byte) -76);
                  break L1;
                }
              } else {
                int discarded$7 = 60;
                this.l();
                break L1;
              }
            }
            L2: {
              if (param3 >= 64) {
                break L2;
              } else {
                field_B = null;
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
            stackOut_15_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
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
              if (param1 <= -60) {
                break L1;
              } else {
                ((pd) this).field_H = true;
                break L1;
              }
            }
            if (super.a(param0, (byte) -62, param2, param3)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param3 == 98) {
                stackOut_8_0 = ((pd) this).a(param2, (byte) -100);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param3 != 99) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = ((pd) this).b(param2, (byte) 126);
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
            stackOut_15_1 = new StringBuilder().append("pd.E(").append(param0).append(',').append(param1).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void a(String param0, byte param1) {
        ga var3 = null;
        String var4 = null;
        try {
            var3 = ((pd) this).field_N;
            var4 = param0;
            int var5 = 25 % ((33 - param1) / 48);
            var3.a(var4, (byte) -17, false);
            ((pd) this).field_J.i((byte) -41);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pd.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != -11203) {
            field_E = null;
        }
        field_B = null;
        field_E = null;
        field_G = null;
        field_M = null;
    }

    public final void a(byte param0, ga param1) {
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
              if (param0 >= 65) {
                break L1;
              } else {
                ((pd) this).h((byte) -105);
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
            stackOut_3_1 = new StringBuilder().append("pd.D(").append(param0).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    pd(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (gj) null);
        RuntimeException var6 = null;
        op var6_ref = null;
        hu var7 = null;
        String var8 = null;
        vl var9 = null;
        cg var12 = null;
        cg var13 = null;
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
        wi stackIn_17_1 = null;
        wi stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        wi stackIn_18_1 = null;
        wi stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        wi stackIn_19_1 = null;
        wi stackIn_19_2 = null;
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
        wi stackOut_16_1 = null;
        wi stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        wi stackOut_18_1 = null;
        wi stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        wi stackOut_17_1 = null;
        wi stackOut_17_2 = null;
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
              ((pd) this).field_D = param1;
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
              ((pd) this).field_C = stackIn_4_1 != 0;
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
              ((pd) this).field_I = stackIn_7_1 != 0;
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
              ((pd) this).field_H = stackIn_10_1 != 0;
              if (!((pd) this).field_H) {
                break L4;
              } else {
                L5: {
                  if (((pd) this).field_I) {
                    break L5;
                  } else {
                    if (!((pd) this).field_C) {
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
              ((pd) this).field_N = (ga) (Object) new mr(param0, (jv) this, 100);
              ((pd) this).field_J = (ga) (Object) new mr("", (jv) this, 20);
              if (!((pd) this).field_H) {
                L7: {
                  ((pd) this).field_K = new wi(ju.field_P, (jv) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((pd) this).field_C) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = is.field_f;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = ba.field_o;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((pd) this).field_F = new wi(stackIn_19_3, (jv) null);
                if (!((pd) this).field_I) {
                  break L6;
                } else {
                  ((pd) this).field_L = new wi(dw.field_f, (jv) this);
                  break L6;
                }
              } else {
                ((pd) this).field_K = new wi(bt.field_d, (jv) null);
                ((pd) this).field_F = new wi(bv.field_o, (jv) null);
                ((pd) this).field_N.field_y = false;
                break L6;
              }
            }
            L8: {
              ((pd) this).field_N.field_r = (gj) (Object) new ri(10000536);
              ((pd) this).field_J.field_r = (gj) (Object) new rp(10000536);
              var6_ref = new op();
              ((pd) this).field_K.field_r = (gj) (Object) var6_ref;
              if (((pd) this).field_F == null) {
                break L8;
              } else {
                ((pd) this).field_F.field_r = (gj) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((pd) this).field_N.field_u = mf.field_yb;
              if (null == ((pd) this).field_L) {
                break L9;
              } else {
                ((pd) this).field_L.field_r = (gj) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((pd) this).field_L) {
                break L10;
              } else {
                ((pd) this).field_L.field_u = so.field_c;
                break L10;
              }
            }
            L11: {
              if (!((pd) this).field_H) {
                if (!((pd) this).field_C) {
                  ((pd) this).field_F.field_r = (gj) (Object) new cr();
                  break L11;
                } else {
                  ((pd) this).field_F.field_u = pv.field_G;
                  ((pd) this).field_F.field_r = (gj) (Object) new cr();
                  break L11;
                }
              } else {
                ((pd) this).field_F.field_u = kd.field_x;
                break L11;
              }
            }
            L12: {
              ((pd) this).field_g = 15;
              var7 = gf.field_a;
              if (((pd) this).field_D == null) {
                break L12;
              } else {
                ((pd) this).field_g = ((pd) this).field_g + (5 + var7.c(((pd) this).field_D, -40 + ((pd) this).field_n, var7.field_G));
                break L12;
              }
            }
            L13: {
              var8 = ne.field_J;
              int discarded$3 = -7465;
              var9 = lm.a(so.a(104));
              if (pb.field_F == var9) {
                var8 = uj.field_A;
                break L13;
              } else {
                if (var9 != ae.field_I) {
                  break L13;
                } else {
                  var8 = q.field_c;
                  break L13;
                }
              }
            }
            L14: {
              cg dupTemp$4 = new cg(10, ((pd) this).field_g, -20 + ((pd) this).field_n, 25, (fd) (Object) ((pd) this).field_N, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$4;
              ((pd) this).a(-120, (fd) (Object) dupTemp$4);
              ((pd) this).field_g = ((pd) this).field_g + (((fd) (Object) var12).field_i - -5);
              cg dupTemp$5 = new cg(10, ((pd) this).field_g, -20 + ((pd) this).field_n, 25, (fd) (Object) ((pd) this).field_J, false, 80, 3, var7, 16777215, at.field_Ib);
              var13 = dupTemp$5;
              ((pd) this).a(-55, (fd) (Object) dupTemp$5);
              ((pd) this).field_K.field_k = (jv) this;
              ((pd) this).field_g = ((pd) this).field_g + (((fd) (Object) var13).field_i + 5);
              if (((pd) this).field_L == null) {
                break L14;
              } else {
                ((pd) this).field_L.field_k = (jv) this;
                break L14;
              }
            }
            L15: {
              if (null == ((pd) this).field_F) {
                break L15;
              } else {
                ((pd) this).field_F.field_k = (jv) this;
                break L15;
              }
            }
            L16: {
              if (((pd) this).field_L == null) {
                ((pd) this).field_K.a(30, 1, 8, -10 + (-6 + ((pd) this).field_n), ((pd) this).field_g);
                ((pd) this).field_g = ((pd) this).field_g + 35;
                break L16;
              } else {
                ((pd) this).field_K.a(30, 1, 85, -95 + ((pd) this).field_n, ((pd) this).field_g);
                ((pd) this).field_g = ((pd) this).field_g + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((pd) this).field_L) {
                break L17;
              } else {
                ((pd) this).field_L.a(30, 1, 8, -16 + ((pd) this).field_n, ((pd) this).field_g);
                ((pd) this).field_g = ((pd) this).field_g + 35;
                break L17;
              }
            }
            L18: {
              if (((pd) this).field_F == null) {
                break L18;
              } else {
                L19: {
                  if (((pd) this).field_H) {
                    break L19;
                  } else {
                    if (((pd) this).field_C) {
                      break L19;
                    } else {
                      ((pd) this).field_F.a(20, 1, 8, 40, ((pd) this).field_g);
                      ((pd) this).field_g = ((pd) this).field_g + 25;
                      break L18;
                    }
                  }
                }
                ((pd) this).field_F.a(30, 1, 8, -10 + (((pd) this).field_n - 6), ((pd) this).field_g);
                ((pd) this).field_g = ((pd) this).field_g + 35;
                break L18;
              }
            }
            L20: {
              ((pd) this).a(((pd) this).field_g - -3, 1, 0, ((pd) this).field_n, 0);
              ((pd) this).a(-63, (fd) (Object) ((pd) this).field_K);
              if (null == ((pd) this).field_L) {
                break L20;
              } else {
                ((pd) this).a(-42, (fd) (Object) ((pd) this).field_L);
                break L20;
              }
            }
            L21: {
              if (((pd) this).field_F == null) {
                break L21;
              } else {
                ((pd) this).a(-82, (fd) (Object) ((pd) this).field_F);
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
            stackOut_57_1 = new StringBuilder().append("pd.<init>(");
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
          throw nb.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(int param0) {
        if (param0 <= 84) {
            Object var3 = null;
            boolean discarded$0 = ((pd) this).a('f', (byte) 111, (fd) null, -119);
        }
        if (!(null != ((pd) this).field_N.field_q)) {
            return "";
        }
        return ((pd) this).field_N.field_q;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kg[] var8 = null;
        kg[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        ut var12 = null;
        kg[] stackIn_8_0 = null;
        kg[] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        kg[] stackOut_7_0 = null;
        kg[] stackOut_6_0 = null;
        kg[] stackOut_10_0 = null;
        kg[] stackOut_9_0 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var12 = j.a(param0 ^ 5332);
              var2 = b.c(param0 ^ 62, -var12.field_o + 105);
              var3 = b.c(-54, 10 + var12.field_o * 3 + -15);
              var4 = var12.field_v;
              var5 = 6 * fp.field_f >> 8;
              var6 = -15;
              if (param0 == -79) {
                break L1;
              } else {
                var11 = null;
                pd.a((byte) -91, 14, (sm) null);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= 4) {
                break L0;
              } else {
                L3: {
                  if ((var7 & 1) == 0) {
                    stackOut_7_0 = hl.field_e;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = am.field_h;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_8_0;
                  if ((var7 & 1) != 0) {
                    stackOut_10_0 = ub.field_G;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = hq.field_e;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                var9 = stackIn_11_0;
                wf.a(-840618968, var2, var8[var5], go.a(var6, (byte) -56));
                wf.a(-840618968, var3, var9[var5], go.a(var6, (byte) -56));
                var6 = var6 + var4;
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "pd.F(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new Random();
        field_B = new int[4];
        field_B[1] = 3385873;
        field_B[0] = 30651;
        field_B[3] = 16776960;
        field_B[2] = 13369344;
    }
}
