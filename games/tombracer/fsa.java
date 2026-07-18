/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fsa extends vg implements lj, ew, fo, gma, ffa, noa, qn, t {
    private vna field_K;
    static jea field_q;
    static int field_m;
    private gpa field_i;
    private fsa field_X;
    private gpa field_Y;
    private int field_ab;
    private la field_y;
    vna field_B;
    vna field_u;
    private boolean field_v;
    private int field_g;
    private int field_j;
    private int field_Z;
    private int field_w;
    private int field_ib;
    private int field_J;
    private boolean field_M;
    private int field_s;
    private int field_F;
    private int field_f;
    private boolean field_D;
    private int field_n;
    private int field_E;
    private boolean field_p;
    private int field_gb;
    private boolean field_jb;
    private boolean field_T;
    private int field_U;
    private boolean field_eb;
    private boolean[] field_h;
    private int field_bb;
    private int field_mb;
    private int field_lb;
    private boolean field_cb;
    private boolean field_C;
    private boolean[] field_W;
    private vna field_O;
    private int field_t;
    private int field_N;
    private boolean field_r;
    private int field_V;
    private int field_S;
    private int field_L;
    private boolean[] field_k;
    private bca field_o;
    private on field_fb;
    private int field_R;
    private int field_I;
    private boolean field_l;
    private boolean field_P;
    private boolean field_Q;
    private int field_G;
    private int field_H;
    private boolean field_x;
    private int field_z;
    private boolean field_A;
    private int field_hb;
    private int field_kb;
    private int field_db;

    final void a(byte param0, nv param1) {
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
              ((fsa) this).field_u.b((byte) -58, (vg) (Object) param1);
              param1.a(true, (fsa) this);
              if (param0 == 83) {
                break L1;
              } else {
                ((fsa) this).a((wda) null, 39);
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
            stackOut_3_1 = new StringBuilder().append("fsa.WB(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final boolean a(ffa param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
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
            if (param1) {
              if (!(param0 instanceof gma)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = this.a((gma) (Object) param0, (byte) -71);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fsa.PE(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void u() {
        ((fsa) this).field_bb = ((fsa) this).field_mb;
        ((fsa) this).field_s = ((fsa) this).field_Z;
        ((fsa) this).field_U = ((fsa) this).d(3);
        ((fsa) this).field_E = ((fsa) this).e(9648);
    }

    final void a(boolean param0, boolean param1, ui param2, ui param3) {
        RuntimeException var5 = null;
        wda var5_ref = null;
        nv var5_ref2 = null;
        fsa var5_ref3 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                if (((fsa) this).w((byte) -110)) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 1;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              param1 = stackIn_7_0 != 0;
              if (param2 != null) {
                ((fsa) this).field_i = param2.a(-114, param1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 == null) {
                break L3;
              } else {
                ((fsa) this).field_Y = param3.a(-102, false);
                break L3;
              }
            }
            var5_ref = (wda) (Object) ((fsa) this).field_B.f(-80);
            L4: while (true) {
              if (var5_ref == null) {
                L5: {
                  if (param0) {
                    break L5;
                  } else {
                    ((fsa) this).b((byte) -99, -59);
                    break L5;
                  }
                }
                var5_ref2 = (nv) (Object) ((fsa) this).field_u.f(-80);
                L6: while (true) {
                  if (var5_ref2 == null) {
                    var5_ref3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                    L7: while (true) {
                      if (var5_ref3 == null) {
                        break L0;
                      } else {
                        var5_ref3.a(true, param1, param2, param3);
                        var5_ref3 = (fsa) (Object) ((fsa) this).field_K.e(109);
                        continue L7;
                      }
                    }
                  } else {
                    var5_ref2.a(-121, param2, param1, param3);
                    var5_ref2 = (nv) (Object) ((fsa) this).field_u.e(115);
                    continue L6;
                  }
                }
              } else {
                var5_ref.a(param1, (byte) -128, param2, param3);
                var5_ref = (wda) (Object) ((fsa) this).field_B.e(116);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("fsa.W(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final void a(bca param0, byte param1) {
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
              ((fsa) this).field_o = param0;
              if (param1 == 121) {
                break L1;
              } else {
                boolean discarded$2 = this.k(-16, 107);
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
            stackOut_3_1 = new StringBuilder().append("fsa.TC(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0, int param1) {
        ((fsa) this).field_I = param0;
        if (param1 != -1) {
            ((fsa) this).field_eb = true;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            ((fsa) this).g(74, 122);
        }
        if (!param1) {
            return ((fsa) this).field_v;
        }
        return !((fsa) this).field_r ? true : false;
    }

    private final void t(int param0) {
        int var2 = ((fsa) this).d(3);
        int var3 = ((fsa) this).e(param0 + -2087504);
        int var4 = ((fsa) this).g((byte) 115);
        ((fsa) this).field_y.b(false).a((byte) 101, param0 + var4, var2, var3);
    }

    final void h(int param0, int param1) {
        ((fsa) this).field_f = param0;
        if (null != ((fsa) this).field_X) {
            ((fsa) this).field_X.h(param0, 0);
        }
        if (param1 != 0) {
            boolean discarded$0 = this.C(-45);
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!((fsa) this).field_C) {
              L1: {
                boolean discarded$2 = this.C(-76);
                if (param0 > 103) {
                  break L1;
                } else {
                  ((fsa) this).a((ir) null, -117);
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
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("fsa.DB(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final void a(gr param0, byte param1, dg param2) {
        if (param2 == null) {
            return;
        }
        if (param1 != 124) {
            return;
        }
        try {
            ((fsa) this).field_O.b((byte) -74, (vg) (Object) param2);
            param2.a(param0, (gma) this, (byte) 36);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.OE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            if (((fsa) this).field_V == 0) {
              break L1;
            } else {
              if (((fsa) this).d(true)) {
                var3 = ((fsa) this).field_F;
                ((fsa) this).field_F = ((fsa) this).field_F + param1;
                ((fsa) this).field_F = dfa.a(((fsa) this).field_F, 8192, -126);
                ((fsa) this).x((byte) -60);
                if (!this.d(true, -3)) {
                  break L0;
                } else {
                  ((fsa) this).field_F = var3;
                  ((fsa) this).x((byte) -60);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          ((fsa) this).field_F = ((fsa) this).field_F + param1;
          ((fsa) this).field_F = dfa.a(((fsa) this).field_F, 8192, -67);
          ((fsa) this).x((byte) -60);
          break L0;
        }
        if (!param0) {
          ((fsa) this).z(1);
          return;
        } else {
          return;
        }
    }

    private final boolean B(byte param0) {
        if (param0 != -81) {
            String discarded$0 = ((fsa) this).toString();
            return false;
        }
        return false;
    }

    public final boolean j(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((fsa) this).field_l = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fsa) this).field_hb != 0) {
              break L2;
            } else {
              L3: {
                if (!((fsa) this).field_A) {
                  break L3;
                } else {
                  if (((fsa) this).field_X == null) {
                    break L3;
                  } else {
                    if (!((fsa) this).field_X.j(-1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    private final void v() {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var2 = (dg) (Object) ((fsa) this).field_O.f(-80);
        while (var2 != null) {
            var2.i((byte) -30);
            var2 = (dg) (Object) ((fsa) this).field_O.e(126);
        }
        ((fsa) this).field_O.d(8);
    }

    final static void a(int param0, kea param1) {
        if (param0 != 0) {
            return;
        }
        try {
            kh.a(true, la.field_k, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.AF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int i(int param0) {
        if (param0 < 90) {
            ((fsa) this).field_P = true;
        }
        return ((fsa) this).field_U;
    }

    final int i(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        param0 = fs.a((byte) 79, param0, ((fsa) this).field_Z);
        if (param1 >= -100) {
            ((fsa) this).field_db = -42;
        }
        param0 = fs.a((byte) 64, param0, ((fsa) this).field_mb);
        param0 = fs.a((byte) 84, param0, ((fsa) this).field_F);
        wda var3 = (wda) (Object) ((fsa) this).field_B.f(-80);
        while (var3 != null) {
            param0 = var3.a(0, param0);
            var3 = (wda) (Object) ((fsa) this).field_B.e(121);
        }
        nv var3_ref = (nv) (Object) ((fsa) this).field_u.f(-80);
        while (var3_ref != null) {
            param0 = var3_ref.a(param0, -109);
            var3_ref = (nv) (Object) ((fsa) this).field_u.e(115);
        }
        return param0;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (param4 != 0) {
            break L0;
          } else {
            if (param3 == 0) {
              return true;
            } else {
              break L0;
            }
          }
        }
        if (!((fsa) this).a((byte) -55, param1)) {
          return false;
        } else {
          L1: {
            if (param2 != 2) {
              var7 = 0;
              L2: while (true) {
                if (param5 <= var7) {
                  break L1;
                } else {
                  param4 = param4 * 11 / 12;
                  param3 = 11 * param3 / 12;
                  var7++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 > 68) {
            L3: {
              this.b(1 + param5, param4, 123, param2, param3);
              if (((fsa) this).field_s - -param4 == ((fsa) this).field_Z) {
                if (((fsa) this).field_mb == param3 + ((fsa) this).field_bb) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L3;
                } else {
                  stackOut_17_0 = 0;
                  stackIn_20_0 = stackOut_17_0;
                  break L3;
                }
              } else {
                stackOut_15_0 = 0;
                stackIn_20_0 = stackOut_15_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_20_0;
              if (var7 != 0) {
                break L4;
              } else {
                if (param2 != 2) {
                  break L4;
                } else {
                  ((fsa) this).field_l = true;
                  break L4;
                }
              }
            }
            L5: {
              if (param1) {
                break L5;
              } else {
                if (var7 == 0) {
                  break L5;
                } else {
                  if (8192 > ua.a(param4, -124) - -ua.a(param3, -127)) {
                    break L5;
                  } else {
                    if (param5 > 2) {
                      break L5;
                    } else {
                      ((fsa) this).field_y.a(false, ((fsa) this).d(3), 0, 0, ((fsa) this).e(9648), 0);
                      break L5;
                    }
                  }
                }
              }
            }
            return var7 != 0;
          } else {
            return false;
          }
        }
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -11) {
            return;
        }
        ((fsa) this).field_gb = param1;
        ((fsa) this).field_t = param2;
    }

    final void i(boolean param0) {
        dg var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(!((fsa) this).j(-1))) {
            return;
        }
        if (((fsa) this).field_X != null) {
            if (!((fsa) this).field_A) {
            }
        }
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2 != null) {
            if (!(!var2.field_A)) {
                var2.i(true);
            }
            var2 = (fsa) (Object) ((fsa) this).field_K.e(120);
        }
        ((fsa) this).field_hb = 1;
        ((fsa) this).field_f = 0;
        ((fsa) this).field_kb = 0;
        ((fsa) this).field_r = param0 ? true : false;
        uw var5 = ((fsa) this).field_y.j((byte) 104);
        if (var5 != null) {
            var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
            while (var3 != null) {
                var3.a(-65, var5);
                var3 = (dg) (Object) ((fsa) this).field_O.e(123);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          this.F((byte) -116);
          if (((fsa) this).field_V <= 0) {
            ((fsa) this).field_mb = ((fsa) this).field_mb + param4;
            ((fsa) this).field_Z = ((fsa) this).field_Z + param1;
            break L0;
          } else {
            L1: {
              var6 = 0;
              if (param1 != 0) {
                var6 = 1;
                ((fsa) this).field_Z = ((fsa) this).field_Z + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6 == 0) {
                break L2;
              } else {
                if (this.a(((fsa) this).d(3) - ((fsa) this).field_U, 0, -4648, param3, param0) == 2) {
                  ((fsa) this).field_Z = ((fsa) this).field_s;
                  ((fsa) this).field_Q = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6 = 0;
              if (0 == param4) {
                break L3;
              } else {
                ((fsa) this).field_mb = ((fsa) this).field_mb + param4;
                var6 = 1;
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                if (this.a(0, ((fsa) this).e(9648) - ((fsa) this).field_E, -4648, param3, param0) != 2) {
                  break L4;
                } else {
                  ((fsa) this).field_P = true;
                  ((fsa) this).field_mb = ((fsa) this).field_bb;
                  break L4;
                }
              }
            }
            L5: {
              if (!this.d(false, -3)) {
                break L5;
              } else {
                L6: {
                  if (~((fsa) this).field_s == ~((fsa) this).field_Z) {
                    break L6;
                  } else {
                    ((fsa) this).field_Q = true;
                    break L6;
                  }
                }
                L7: {
                  if (~((fsa) this).field_bb != ~((fsa) this).field_mb) {
                    ((fsa) this).field_P = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((fsa) this).field_Z = ((fsa) this).field_s;
                ((fsa) this).field_mb = ((fsa) this).field_bb;
                break L5;
              }
            }
            break L0;
          }
        }
        L8: {
          L9: {
            if (((fsa) this).field_s != ((fsa) this).field_Z) {
              break L9;
            } else {
              if (((fsa) this).field_mb != ((fsa) this).field_bb) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          ((fsa) this).field_M = true;
          ((fsa) this).z(1);
          break L8;
        }
        L10: {
          if (param2 > 109) {
            break L10;
          } else {
            boolean discarded$1 = ((fsa) this).j(109);
            break L10;
          }
        }
    }

    public final boolean a(int param0) {
        int var2 = 14 / ((param0 - 6) / 46);
        return !((fsa) this).field_r ? true : false;
    }

    final void b(int param0, boolean param1) {
        dg var3 = null;
        wda var4 = null;
        nv var4_ref = null;
        fsa var4_ref2 = null;
        int var5 = 0;
        uja var6 = null;
        uja var7 = null;
        uja var8 = null;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!((fsa) this).field_C) {
          L0: {
            ((fsa) this).field_fb.a(86);
            if (((fsa) this).field_l) {
              if (0 == ((fsa) this).field_R) {
                ((fsa) this).field_R = ((fsa) this).field_y.q(-88).a(3, 0);
                break L0;
              } else {
                ((fsa) this).field_R = ((fsa) this).field_R + 1;
                break L0;
              }
            } else {
              ((fsa) this).field_R = 0;
              break L0;
            }
          }
          L1: {
            ((fsa) this).field_l = false;
            if (((fsa) this).field_N <= 0) {
              break L1;
            } else {
              ((fsa) this).field_N = ((fsa) this).field_N - 1;
              if (((fsa) this).field_N == 0) {
                ((fsa) this).v((byte) 109);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((fsa) this).n((byte) 123)) {
              ((fsa) this).D((byte) 118);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param1) {
              if (((fsa) this).x(15470).g(99)) {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L3;
              } else {
                stackOut_17_0 = 0;
                stackIn_20_0 = stackOut_17_0;
                break L3;
              }
            } else {
              stackOut_15_0 = 1;
              stackIn_20_0 = stackOut_15_0;
              break L3;
            }
          }
          L4: {
            param1 = stackIn_20_0 != 0;
            if (param1) {
              break L4;
            } else {
              if (((fsa) this).field_G > 0) {
                ((fsa) this).field_G = ((fsa) this).field_G - 1;
                param1 = true;
                break L4;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (param1) {
              break L5;
            } else {
              if (!((fsa) this).field_v) {
                break L5;
              } else {
                if (!((fsa) this).x(15470).f(8, 10915)) {
                  break L5;
                } else {
                  boolean discarded$1 = ((fsa) this).a(86, true, 1, 131072 - ((fsa) this).field_y.q(90).a(262144, 0), -((fsa) this).field_y.q(85).a(262144, 0) + 131072, 0);
                  break L5;
                }
              }
            }
          }
          L6: {
            if (((fsa) this).j(-1)) {
              break L6;
            } else {
              L7: {
                ((fsa) this).field_Q = false;
                ((fsa) this).field_P = false;
                var6 = new uja(((fsa) this).field_B);
                if (!((fsa) this).field_D) {
                  break L7;
                } else {
                  if (param1) {
                    break L7;
                  } else {
                    var4 = (wda) (Object) var6.a(true);
                    L8: while (true) {
                      if (var4 == null) {
                        break L7;
                      } else {
                        if (!var4.a((byte) 87)) {
                          L9: {
                            if (var4.a(-80)) {
                              var4.b((byte) -121);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var4 = (wda) (Object) var6.a(-1);
                          continue L8;
                        } else {
                          var4.p(126);
                          var4 = (wda) (Object) var6.a(-1);
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
              var4 = (wda) (Object) var6.a(true);
              L10: while (true) {
                if (var4 == null) {
                  var7 = new uja(((fsa) this).field_u);
                  var4_ref = (nv) (Object) var7.a(true);
                  L11: while (true) {
                    if (var4_ref == null) {
                      var8 = new uja(((fsa) this).field_K);
                      var4_ref2 = (fsa) (Object) var8.a(true);
                      L12: while (true) {
                        if (var4_ref2 == null) {
                          break L6;
                        } else {
                          L13: {
                            var4_ref2.b(75, param1);
                            if (!var4_ref2.field_C) {
                              break L13;
                            } else {
                              var4_ref2.p(2);
                              var4_ref2.B(-165);
                              break L13;
                            }
                          }
                          var4_ref2 = (fsa) (Object) var8.a(-1);
                          continue L12;
                        }
                      }
                    } else {
                      L14: {
                        if (!var4_ref.a((byte) 87)) {
                          if (!var4_ref.a(-116)) {
                            break L14;
                          } else {
                            if (param1) {
                              if (var4_ref.p((byte) 120)) {
                                break L14;
                              } else {
                                var4_ref.k(5418);
                                break L14;
                              }
                            } else {
                              var4_ref.k(5418);
                              break L14;
                            }
                          }
                        } else {
                          var4_ref.p(82);
                          break L14;
                        }
                      }
                      var4_ref = (nv) (Object) var7.a(-1);
                      continue L11;
                    }
                  }
                } else {
                  var4.b(1);
                  var4 = (wda) (Object) var6.a(-1);
                  continue L10;
                }
              }
            }
          }
          var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
          L15: while (true) {
            if (var3 == null) {
              L16: {
                if (!((fsa) this).field_eb) {
                  break L16;
                } else {
                  if (!((fsa) this).field_B.d((byte) 14)) {
                    break L16;
                  } else {
                    ((fsa) this).v((byte) 109);
                    return;
                  }
                }
              }
              L17: {
                if (!((fsa) this).field_p) {
                  break L17;
                } else {
                  if (((fsa) this).field_u.d((byte) 14)) {
                    ((fsa) this).v((byte) 109);
                    return;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (param0 > 26) {
                  break L18;
                } else {
                  ((fsa) this).e(-93, 58);
                  break L18;
                }
              }
              L19: {
                if (((fsa) this).field_r) {
                  break L19;
                } else {
                  L20: {
                    if (!((fsa) this).field_A) {
                      break L20;
                    } else {
                      if (null != ((fsa) this).field_X) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (((fsa) this).field_y.a(0, (gma) this) == 1) {
                    ((fsa) this).i(true);
                    return;
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (((fsa) this).field_hb == 0) {
                  break L21;
                } else {
                  L22: {
                    if (((fsa) this).field_X == null) {
                      break L22;
                    } else {
                      if (!((fsa) this).field_X.j(-1)) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  ((fsa) this).field_hb = ((fsa) this).field_hb + ((fsa) this).field_kb;
                  ((fsa) this).field_kb = ((fsa) this).field_kb + 16384;
                  if (17825792 <= ((fsa) this).field_hb) {
                    ((fsa) this).c(4, (byte) 9);
                    return;
                  } else {
                    break L21;
                  }
                }
              }
              ((fsa) this).field_M = false;
              return;
            } else {
              var3.d(-1);
              var3 = (dg) (Object) ((fsa) this).field_O.e(126);
              continue L15;
            }
          }
        } else {
          return;
        }
    }

    final void x(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((fsa) this).field_X == null)) {
            ((fsa) this).field_g = hua.a((byte) 124, -((fsa) this).field_X.g(-25787) >> 2);
            ((fsa) this).field_w = bua.a(0, -((fsa) this).field_X.g(param0 + -25727) >> 2);
        }
        if (param0 != -60) {
            ((fsa) this).field_g = -7;
        }
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(param0 ^ 116);
        while (var2 != null) {
            var2.x((byte) -60);
            var2 = (fsa) (Object) ((fsa) this).field_K.e(113);
        }
    }

    public final int b(int param0) {
        int var2 = -112 % ((param0 - 1) / 45);
        return ((fsa) this).field_S;
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (param1 > 36) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param0 == 57) {
                      break L2;
                    } else {
                      int discarded$1 = fsa.a(110, -65, true, (CharSequence) null);
                      break L2;
                    }
                  }
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_42_0 = var6;
                        stackIn_43_0 = stackOut_42_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                L6: {
                                  if (param2) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8++;
                                continue L3;
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            if (var9 < 48) {
                              break L8;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 65) {
                              break L9;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var9 < 97) {
                              break L10;
                            } else {
                              if (122 >= var9) {
                                var9 -= 87;
                                break L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param1) {
                          throw new NumberFormatException();
                        } else {
                          L11: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10 = param1 * var6 - -var9;
                          if (var6 == var10 / param1) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("fsa.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
        return stackIn_43_0;
    }

    final void a(byte param0, int param1) {
        ((fsa) this).field_S = param1;
        if (param0 != -3) {
            ((fsa) this).field_D = false;
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 != 11468) {
            int discarded$0 = ((fsa) this).i(-92);
        }
        ((fsa) this).field_A = param0 ? true : false;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
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
            if (param0 <= -77) {
              if (this.b(12507, param1)) {
                if (((fsa) this).field_R < ((fsa) this).field_I) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  ((fsa) this).c(3, (byte) 9);
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fsa.OD(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int y(byte param0) {
        if (param0 >= -56) {
            int discarded$0 = ((fsa) this).b(80);
        }
        return ((fsa) this).field_n;
    }

    final lj a(boolean param0, int param1, byte param2) {
        lj var4 = null;
        wda var5 = null;
        nv var6 = null;
        fsa var6_ref = null;
        int var7 = 0;
        uja var8 = null;
        uja var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        if (vh.a(param1, param0, -27201, (lj) this)) {
          return (lj) this;
        } else {
          var5 = (wda) (Object) ((fsa) this).field_B.f(-80);
          L0: while (true) {
            if (var5 == null) {
              var8 = new uja(((fsa) this).field_u);
              var6 = (nv) (Object) var8.a(true);
              L1: while (true) {
                if (var6 == null) {
                  L2: {
                    var9 = new uja(((fsa) this).field_K);
                    if (param2 == -26) {
                      break L2;
                    } else {
                      ((fsa) this).h(122, -84);
                      break L2;
                    }
                  }
                  var6_ref = (fsa) (Object) var9.a(true);
                  L3: while (true) {
                    if (var6_ref != null) {
                      var4 = var6_ref.a(param0, param1, (byte) -26);
                      if (var4 != null) {
                        return var4;
                      } else {
                        var6_ref = (fsa) (Object) var9.a(-1);
                        continue L3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  var4 = var6.a(0, param1, param0);
                  if (var4 != null) {
                    return var4;
                  } else {
                    var6 = (nv) (Object) var8.a(-1);
                    continue L1;
                  }
                }
              }
            } else {
              var4 = var5.a(param0, 1, param1);
              if (var4 == null) {
                var5 = (wda) (Object) ((fsa) this).field_B.e(119);
                continue L0;
              } else {
                return var4;
              }
            }
          }
        }
    }

    public final la f(byte param0) {
        int var2 = 38 % (param0 / 61);
        return ((fsa) this).field_y;
    }

    public final boolean l(int param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = ((fsa) this).a((up) null, (ep) null, -25);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (null == ((fsa) this).field_X) {
                break L3;
              } else {
                if (((fsa) this).field_X.l(0)) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (!((fsa) this).field_y.o((byte) -82)) {
                break L4;
              } else {
                if (((fsa) this).a(((fsa) this).field_y.i(6029), 31749)) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    public final int a(boolean param0) {
        if (!param0) {
            return 123;
        }
        return 3 * (1 + ((fsa) this).field_ab);
    }

    final int Q(int param0) {
        if (param0 != 2) {
            return 72;
        }
        return ((fsa) this).e(9648) - ((fsa) this).field_gb / 2;
    }

    private final int a(int param0, gr param1) {
        ub var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            int discarded$2 = -30;
            var3 = this.k();
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.a(-1)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if ((Object) (Object) param1 != var3.a(true, var4)) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_4_0 = var4;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("fsa.HC(").append(13464).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    private fsa(la param0, fsa param1, kh param2, boolean param3) {
        this(param0, 0, 0, 32, 32, 0, param3);
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        wda var7_ref_wda = null;
        nv var8_ref_nv = null;
        int var8 = 0;
        fsa var9_ref_fsa = null;
        int var9 = 0;
        int var10 = 0;
        dg var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_X = param1;
              if (param1 == null) {
                break L1;
              } else {
                ((fsa) this).field_cb = false;
                break L1;
              }
            }
            L2: {
              ((fsa) this).field_Z = bla.a(true, 12, param2.b((byte) 44, 12)) << 16;
              ((fsa) this).field_mb = bla.a(true, 12, param2.b((byte) 44, 12)) << 16;
              ((fsa) this).field_t = param2.b((byte) 44, 10) << 16;
              ((fsa) this).field_gb = param2.b((byte) 44, 10) << 16;
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param2.b((byte) 44, 1) == 1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((fsa) this).field_eb = stackIn_6_1 != 0;
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param2.b((byte) 44, 1) == 1) {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              ((fsa) this).field_p = stackIn_9_1 != 0;
              ((fsa) this).field_N = param2.b((byte) 44, 6) * 50;
              if (param0.field_E >= 10) {
                ((fsa) this).field_F = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
                break L4;
              } else {
                ((fsa) this).field_F = oo.a(3, 8192, 0, param2.b((byte) 44, 3));
                break L4;
              }
            }
            L5: {
              if (10 >= param0.field_E) {
                ((fsa) this).field_S = param2.b((byte) 44, 8) / 5;
                ((fsa) this).field_I = 0;
                break L5;
              } else {
                ((fsa) this).field_S = param2.b((byte) 44, 8);
                ((fsa) this).field_I = param2.b((byte) 44, 8);
                break L5;
              }
            }
            L6: {
              if (4 > param0.field_E) {
                break L6;
              } else {
                L7: {
                  stackOut_16_0 = this;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (param2.b((byte) 44, 1) != -2) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L7;
                  }
                }
                L8: {
                  ((fsa) this).field_r = stackIn_19_1 != 0;
                  stackOut_19_0 = this;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (-2 == param2.b((byte) 44, 1)) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L8;
                  } else {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 0;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L8;
                  }
                }
                ((fsa) this).field_v = stackIn_22_1 != 0;
                ((fsa) this).field_f = param2.b((byte) 44, 3);
                ((fsa) this).field_V = param2.b((byte) 44, 3);
                ((fsa) this).field_L = param2.b((byte) 44, 3);
                break L6;
              }
            }
            L9: {
              if (param0.field_E > 9) {
                break L9;
              } else {
                L10: {
                  if (((fsa) this).field_V <= 1) {
                    break L10;
                  } else {
                    ((fsa) this).field_V = ((fsa) this).field_V + 1;
                    break L10;
                  }
                }
                if (((fsa) this).field_f <= 1) {
                  break L9;
                } else {
                  ((fsa) this).field_f = ((fsa) this).field_f + 1;
                  break L9;
                }
              }
            }
            var5_int = param2.b((byte) 44, 3);
            var6 = 0;
            L11: while (true) {
              if (var5_int <= var6) {
                var6 = param2.b((byte) 44, 3);
                var7 = 0;
                L12: while (true) {
                  if (var7 >= var6) {
                    L13: {
                      if (param0.field_E < 2) {
                        var7 = param2.b((byte) 44, 2);
                        break L13;
                      } else {
                        var7 = param2.b((byte) 44, 3);
                        break L13;
                      }
                    }
                    var8 = 0;
                    L14: while (true) {
                      if (var8 >= var7) {
                        L15: {
                          if (param0.field_E > 8) {
                            var8 = param2.b((byte) 44, 3);
                            var9 = 0;
                            L16: while (true) {
                              if (var9 >= var8) {
                                break L15;
                              } else {
                                var10 = param2.b((byte) 44, 5) - 1;
                                var11 = rm.field_a.a(param0, param2, false);
                                ((fsa) this).a(this.b(3, var10), (byte) 124, var11);
                                var9++;
                                continue L16;
                              }
                            }
                          } else {
                            ((fsa) this).c(437453352, false);
                            break L15;
                          }
                        }
                        L17: {
                          ((fsa) this).field_o = new bca(param0.field_E, param2);
                          this.N(0);
                          if (param0.field_E < 14) {
                            ((fsa) this).field_A = true;
                            break L17;
                          } else {
                            L18: {
                              stackOut_46_0 = this;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_47_0 = stackOut_46_0;
                              if (1 != param2.b((byte) 44, 1)) {
                                stackOut_48_0 = this;
                                stackOut_48_1 = 0;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                break L18;
                              } else {
                                stackOut_47_0 = this;
                                stackOut_47_1 = 1;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                break L18;
                              }
                            }
                            ((fsa) this).field_A = stackIn_49_1 != 0;
                            break L17;
                          }
                        }
                        L19: {
                          if (param0.field_E >= 15) {
                            ((fsa) this).field_db = param2.b((byte) 44, 8);
                            break L19;
                          } else {
                            ((fsa) this).field_db = 0;
                            break L19;
                          }
                        }
                        break L0;
                      } else {
                        var9_ref_fsa = new fsa(param0, (fsa) this, param2, param3);
                        ((fsa) this).field_K.b((byte) -120, (vg) (Object) var9_ref_fsa);
                        var8++;
                        continue L14;
                      }
                    }
                  } else {
                    var8_ref_nv = bda.a(param3, (byte) 44, param0, param2);
                    ((fsa) this).field_u.b((byte) -88, (vg) (Object) var8_ref_nv);
                    var8_ref_nv.a(true, (fsa) this);
                    var7++;
                    continue L12;
                  }
                }
              } else {
                var7_ref_wda = ki.a(param2, (byte) 95, param0, param3);
                ((fsa) this).field_B.b((byte) -49, (vg) (Object) var7_ref_wda);
                var7_ref_wda.a(64, (fsa) this);
                var6++;
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var5;
            stackOut_55_1 = new StringBuilder().append("fsa.<init>(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L20;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L20;
            }
          }
          L21: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L21;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L21;
            }
          }
          L22: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L22;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L22;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param3 + ')');
        }
    }

    final boolean z(byte param0) {
        if (param0 < 56) {
            ((fsa) this).field_ab = 22;
        }
        return ((fsa) this).field_r;
    }

    final void e(boolean param0, int param1) {
        if (param1 < 114) {
            return;
        }
        ((fsa) this).field_v = param0 ? true : false;
    }

    final void h(boolean param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(((fsa) this).field_u);
        nv var3 = (nv) (Object) var2.a(true);
        while (var3 != null) {
            var3.g(-2);
            var3 = (nv) (Object) var2.a(-1);
        }
        var2 = new uja(((fsa) this).field_K);
        fsa var3_ref = (fsa) (Object) var2.a(param0);
        while (var3_ref != null) {
            var3_ref.h(true);
            var3_ref = (fsa) (Object) var2.a(-1);
        }
    }

    public final int g(int param0) {
        int var2 = ((fsa) this).field_F;
        if (((fsa) this).field_X != null) {
            var2 = var2 + ((fsa) this).field_X.g(param0);
        }
        if (param0 != -25787) {
            int discarded$0 = ((fsa) this).a(false);
        }
        return dfa.a(var2, 8192, 124);
    }

    public final int b(byte param0) {
        int var2 = -82 % ((-23 - param0) / 53);
        return ((fsa) this).field_Z;
    }

    public final int c(int param0) {
        if (param0 > -11) {
            ((fsa) this).field_mb = 62;
        }
        return ((fsa) this).field_t;
    }

    final void c(int param0, int param1) {
        ((fsa) this).field_mb = param0;
        if (param1 != -19879) {
            ((fsa) this).c(-99, -65);
        }
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            return -54;
        }
        return ((fsa) this).field_gb;
    }

    public final String toString() {
        int discarded$0 = 116;
        return this.E() + " (id " + (Object) (Object) ((fsa) this).field_i + ")";
    }

    final boolean m(byte param0) {
        if (param0 >= -63) {
            return true;
        }
        return ((fsa) this).field_G > 0 ? true : false;
    }

    final int E(byte param0) {
        if (param0 != 3) {
            int discarded$0 = ((fsa) this).e(false);
        }
        return ((fsa) this).field_H;
    }

    final boolean s(byte param0) {
        int var2 = 0;
        int discarded$2 = 0;
        if (!this.f()) {
          return false;
        } else {
          L0: {
            if (((fsa) this).j(-1)) {
              break L0;
            } else {
              if (((fsa) this).h(18407)) {
                break L0;
              } else {
                if (((fsa) this).field_f >= 1) {
                  var2 = -59 % ((param0 - -33) / 62);
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        }
    }

    public final int g(byte param0) {
        int var2 = -((fsa) this).field_hb;
        if (param0 != 115) {
            return -57;
        }
        if (((fsa) this).field_X != null) {
            var2 = var2 + ((fsa) this).field_X.g((byte) 115);
        }
        return var2;
    }

    final int o(byte param0) {
        if (param0 >= -91) {
            int discarded$0 = ((fsa) this).c(101);
        }
        return ((fsa) this).field_j;
    }

    final int q(byte param0) {
        if (param0 != -80) {
            ((fsa) this).field_s = 121;
        }
        return ((fsa) this).field_F;
    }

    final int g(boolean param0) {
        if (!param0) {
            return -108;
        }
        return ((fsa) this).field_V;
    }

    private final boolean b(int param0, byte param1) {
        if (param1 <= 104) {
            int discarded$0 = ((fsa) this).k(-34);
        }
        return ((fsa) this).field_W[param0];
    }

    final void a(int param0, uw param1) {
        fsa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            int discarded$4 = 1;
            this.a(param1);
            var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (param0 > 115) {
                    break L2;
                  } else {
                    int discarded$5 = fsa.a(-115, -22, false, (CharSequence) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var3.a(127, param1);
                var3 = (fsa) (Object) ((fsa) this).field_K.e(115);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("fsa.WE(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(kh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        wda var4 = null;
        nv var4_ref = null;
        fsa var4_ref2 = null;
        dg var4_ref3 = null;
        int var5 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        kh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        kh stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        kh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kh stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        kh stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        kh stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a((byte) 0, dqa.a(true, ((fsa) this).field_Z >> 16, 12), 12);
              param0.a((byte) -126, dqa.a(true, ((fsa) this).field_mb >> 16, 12), 12);
              param0.a((byte) -127, ((fsa) this).field_t >> 16, 10);
              param0.a((byte) 72, ((fsa) this).field_gb >> 16, 10);
              stackOut_1_0 = (kh) param0;
              stackOut_1_1 = 58;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((fsa) this).field_eb) {
                stackOut_3_0 = (kh) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
              stackOut_4_0 = (kh) param0;
              stackOut_4_1 = 118;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (!((fsa) this).field_p) {
                stackOut_6_0 = (kh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (kh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, 1);
              param0.a((byte) -125, ((fsa) this).field_N / 50, 6);
              var3_int = -112 / ((param1 - -58) / 39);
              param0.a((byte) -125, cn.a((byte) 59, ((fsa) this).field_F, 8192, 4), 4);
              param0.a((byte) -127, ((fsa) this).field_S, 8);
              param0.a((byte) -128, ((fsa) this).field_I, 8);
              stackOut_7_0 = (kh) param0;
              stackOut_7_1 = 123;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (((fsa) this).field_r) {
                stackOut_9_0 = (kh) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L3;
              } else {
                stackOut_8_0 = (kh) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L3;
              }
            }
            L4: {
              ((kh) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, 1);
              stackOut_10_0 = (kh) param0;
              stackOut_10_1 = -25;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (!((fsa) this).field_v) {
                stackOut_12_0 = (kh) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L4;
              } else {
                stackOut_11_0 = (kh) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                break L4;
              }
            }
            ((kh) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, 1);
            param0.a((byte) 26, ((fsa) this).field_f, 3);
            param0.a((byte) -127, ((fsa) this).field_V, 3);
            param0.a((byte) -126, ((fsa) this).field_L, 3);
            param0.a((byte) -125, ((fsa) this).field_B.a((byte) -16), 3);
            var4 = (wda) (Object) ((fsa) this).field_B.f(-80);
            L5: while (true) {
              if (var4 == null) {
                param0.a((byte) -127, ((fsa) this).field_u.a((byte) -16), 3);
                var4_ref = (nv) (Object) ((fsa) this).field_u.f(-80);
                L6: while (true) {
                  if (var4_ref == null) {
                    int discarded$1 = 112;
                    param0.a((byte) -126, this.t(), 3);
                    var4_ref2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                    L7: while (true) {
                      if (var4_ref2 == null) {
                        L8: {
                          if (((fsa) this).field_y.field_E < 9) {
                            break L8;
                          } else {
                            param0.a((byte) 88, ((fsa) this).field_O.a((byte) -16), 3);
                            var4_ref3 = (dg) (Object) ((fsa) this).field_O.f(-80);
                            L9: while (true) {
                              if (var4_ref3 == null) {
                                break L8;
                              } else {
                                param0.a((byte) -127, 1 + this.a(13464, var4_ref3.c(-93)), 5);
                                rm.field_a.a(15682, param0, var4_ref3);
                                var4_ref3 = (dg) (Object) ((fsa) this).field_O.e(109);
                                continue L9;
                              }
                            }
                          }
                        }
                        L10: {
                          ((fsa) this).field_o.a((byte) -125, param0);
                          stackOut_29_0 = (kh) param0;
                          stackOut_29_1 = -127;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          if (!((fsa) this).field_A) {
                            stackOut_31_0 = (kh) (Object) stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            break L10;
                          } else {
                            stackOut_30_0 = (kh) (Object) stackIn_30_0;
                            stackOut_30_1 = stackIn_30_1;
                            stackOut_30_2 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_32_2 = stackOut_30_2;
                            break L10;
                          }
                        }
                        ((kh) (Object) stackIn_32_0).a((byte) stackIn_32_1, stackIn_32_2, 1);
                        param0.a((byte) -126, ((fsa) this).field_db, 8);
                        break L0;
                      } else {
                        L11: {
                          if (var4_ref2.w((byte) -119)) {
                            var4_ref2.B(-165);
                            var4_ref2.p(17);
                            break L11;
                          } else {
                            var4_ref2.a(param0, -14);
                            break L11;
                          }
                        }
                        var4_ref2 = (fsa) (Object) ((fsa) this).field_K.e(124);
                        continue L7;
                      }
                    }
                  } else {
                    var4_ref.a(false, param0);
                    var4_ref = (nv) (Object) ((fsa) this).field_u.e(111);
                    continue L6;
                  }
                }
              } else {
                var4.a(param0, (byte) -100);
                var4 = (wda) (Object) ((fsa) this).field_B.e(118);
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("fsa.BF(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
    }

    final void d(byte param0, boolean param1) {
        ((fsa) this).field_jb = param1 ? true : false;
        int var3 = 114 / ((param0 - 2) / 50);
    }

    final void A(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var2 = (dg) (Object) ((fsa) this).field_O.f(-80);
        while (var2 != null) {
            var2.e(param0 ^ -23607);
            var2 = (dg) (Object) ((fsa) this).field_O.e(param0 ^ 23599);
        }
        fsa var2_ref = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2_ref != null) {
            var2_ref.A(23645);
            var2_ref = (fsa) (Object) ((fsa) this).field_K.e(110);
        }
        if (param0 != 23645) {
            ((fsa) this).field_lb = -40;
        }
    }

    public final int d(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
            ((fsa) this).a((byte) 51, true, -11);
        }
        int var2 = ((fsa) this).field_Z;
        if (!(null == ((fsa) this).field_X)) {
            var3 = var2 >> 8;
            var4 = ((fsa) this).field_mb >> 8;
            var2 = -((((fsa) this).field_g >> 8) * var4) + var3 * (((fsa) this).field_w >> 8);
            var2 = var2 + ((fsa) this).field_X.d(3);
        }
        return var2;
    }

    private final void a(uw param0, int param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.A((byte) 26)) {
                  break L2;
                } else {
                  if (!this.B((byte) -81)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param0.a(9, (fo) this, (byte) -33);
              break L1;
            }
            L3: {
              if (param1 == 9411) {
                break L3;
              } else {
                ((fsa) this).field_cb = true;
                break L3;
              }
            }
            var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
            L4: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.a(param0, 120);
                var3 = (dg) (Object) ((fsa) this).field_O.e(125);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("fsa.GD(");
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        fsa var3_ref = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        int discarded$0 = -1332;
        this.v();
        nv var3 = (nv) (Object) ((fsa) this).field_u.f(param0 ^ -437453416);
        while (var3 != null) {
            ((fsa) this).a((gr) (Object) var3, (byte) 124, rm.field_a.a((gr) (Object) var3, (gma) this, -126));
            var3 = (nv) (Object) ((fsa) this).field_u.e(107);
        }
        if (!(!param1)) {
            var3_ref = (fsa) (Object) ((fsa) this).field_K.f(param0 ^ -437453416);
            while (var3_ref != null) {
                var3_ref.c(437453352, true);
                var3_ref = (fsa) (Object) ((fsa) this).field_K.e(117);
            }
        }
        if (param0 != 437453352) {
            int discarded$1 = ((fsa) this).Q(108);
        }
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
            return false;
        }
        return ((fsa) this).n((byte) 120);
    }

    final void a(int param0, boolean param1, int param2) {
        ((fsa) this).field_W[param2] = param1;
        if (!(((fsa) this).field_X == null)) {
            ((fsa) this).field_X.a(26492, param1, param2);
        }
        if (param0 != 26492) {
            ((fsa) this).a(-7, (uw) null);
        }
    }

    final int I(int param0) {
        if (param0 != -16423) {
            ((fsa) this).a(false, -102);
        }
        return ((fsa) this).field_lb;
    }

    final void o(int param0, int param1) {
        ((fsa) this).field_y.field_u.a((ffa) this, (byte) 112);
        ((fsa) this).field_Z = ((fsa) this).field_Z + param0;
        ((fsa) this).field_mb = ((fsa) this).field_mb + param0;
        if (param1 <= 78) {
            return;
        }
        ((fsa) this).field_y.field_u.b((ffa) this, 7073);
        this.N(0);
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
            ((fsa) this).field_j = 102;
        }
        return (ew) (Object) ((fsa) this).r(0);
    }

    final int O(int param0) {
        if (param0 < 7) {
            ((fsa) this).f(54, -8);
        }
        return ((fsa) this).field_J;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 31749) {
            int discarded$0 = ((fsa) this).s(5);
        }
        return ((fsa) this).field_o.a(param0, 14530);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((fsa) this).m(-103, -125);
        }
        return ((fsa) this).field_C;
    }

    final void l(int param0, int param1) {
        ((fsa) this).field_H = param0;
        if (param1 != 146366800) {
            ((fsa) this).field_J = -18;
        }
    }

    private final boolean b(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 12507) {
                break L1;
              } else {
                ((fsa) this).field_C = true;
                break L1;
              }
            }
            L2: {
              if (((fsa) this).field_I == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("fsa.UB(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final boolean a(dg param0, int param1) {
        gr var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
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
            L1: {
              if (param0.a((byte) 70)) {
                break L1;
              } else {
                L2: {
                  var3 = param0.c(-100);
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (this != (Object) (Object) var3.f((byte) 74)) {
                      break L2;
                    } else {
                      if (!var3.a((byte) 87)) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
            var3_int = 89 / ((param1 - -65) / 41);
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("fsa.LD(");
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
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void e(int param0, int param1) {
        if (param1 <= 15) {
            int discarded$0 = ((fsa) this).a(true);
        }
        ((fsa) this).field_z = param0;
    }

    final int M(int param0) {
        if (param0 != 0) {
            return -91;
        }
        return ((fsa) this).field_ib;
    }

    final void B(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        ((fsa) this).field_y.field_u.a((ffa) this, (byte) 112);
        if (((fsa) this).field_y.j((byte) -74) != null) {
            this.a(((fsa) this).field_y.j((byte) -96), param0 ^ -9320);
        }
        if (param0 != -165) {
            return;
        }
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2 != null) {
            var2.B(-165);
            var2 = (fsa) (Object) ((fsa) this).field_K.e(110);
        }
    }

    final void g(int param0, int param1) {
        ((fsa) this).field_L = param1;
        if (param0 < 99) {
            fsa.a(-31, (kea) null);
        }
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            ((fsa) this).a(-74, (byte) 85);
        }
        return ((fsa) this).field_i;
    }

    final void D(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int discarded$0 = 116;
        this.u();
        ((fsa) this).field_n = ((fsa) this).field_E;
        if (param0 != 118) {
            ((fsa) this).field_i = null;
        }
        ((fsa) this).field_lb = ((fsa) this).field_U;
        uja var2 = new uja(((fsa) this).field_K);
        fsa var3 = (fsa) (Object) var2.a(true);
        while (var3 != null) {
            var3.D((byte) 118);
            var3 = (fsa) (Object) var2.a(-1);
        }
    }

    public final on c(boolean param0) {
        if (param0) {
            ((fsa) this).field_eb = false;
        }
        return ((fsa) this).field_fb;
    }

    final void m(int param0, int param1) {
        ((fsa) this).field_Z = param1;
        if (param0 != 1) {
            ((fsa) this).a(120, (iq) null);
        }
    }

    final boolean w(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -108) {
          L0: {
            L1: {
              if (((fsa) this).field_jb) {
                break L1;
              } else {
                L2: {
                  if (null == ((fsa) this).field_X) {
                    break L2;
                  } else {
                    if (!((fsa) this).field_X.w((byte) -113)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -74)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!this.b(param0.field_j, (byte) 120)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                L1: {
                  if (param2 < -97) {
                    break L1;
                  } else {
                    ((fsa) this).field_P = false;
                    break L1;
                  }
                }
                var4_int = param1.i(-1);
                if (!((fsa) this).a((byte) 110, param1.e(9648), param1.d(3), var4_int, var4_int)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  var5 = 0;
                  var6 = new uja(((fsa) this).field_u);
                  var7 = (nv) (Object) var6.a(true);
                  L2: while (true) {
                    if (var7 == null) {
                      stackOut_18_0 = var5;
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var5 = var5 + var7.a(25940, param1, param0);
                      var7 = (nv) (Object) var6.a(-1);
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("fsa.SD(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          L4: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    public final int e(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = ((fsa) this).field_mb;
        if (param0 != 9648) {
            ((fsa) this).c(-71, false);
        }
        if (!(((fsa) this).field_X == null)) {
            var3 = ((fsa) this).field_Z >> 8;
            var4 = var2 >> 8;
            var2 = (((fsa) this).field_w >> 8) * var4 - -(var3 * (((fsa) this).field_g >> 8));
            var2 = var2 + ((fsa) this).field_X.e(param0);
        }
        return var2;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        uja var8 = null;
        nv var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -119)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!this.b(param0.field_j, (byte) 125)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!((fsa) this).a((byte) 110, param4, param2, param5, param1)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var7_int = param3;
                  var8 = new uja(((fsa) this).field_u);
                  var9 = (nv) (Object) var8.a(true);
                  L1: while (true) {
                    if (var9 == null) {
                      stackOut_16_0 = var7_int;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      var7_int = var7_int + var9.a(param5, param1, param0, param2, (byte) 8, param4);
                      var9 = (nv) (Object) var8.a(-1);
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var7;
            stackOut_18_1 = new StringBuilder().append("fsa.WC(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_17_0;
    }

    final hca H(int param0) {
        int var2 = 68 % ((-84 - param0) / 32);
        return ((fsa) this).field_y.u(-53);
    }

    final void b(byte param0, boolean param1) {
        ((fsa) this).field_r = param1 ? true : false;
        if (param0 != 17) {
            ((fsa) this).field_lb = 34;
        }
    }

    fsa(la param0, kh param1, boolean param2) {
        this(param0, (fsa) null, param1, param2);
    }

    final int s(int param0) {
        if (param0 != 25745) {
            ((fsa) this).field_C = true;
        }
        return ((fsa) this).field_Z;
    }

    final void n(int param0, int param1) {
        if (((fsa) this).field_G <= param0) {
            ((fsa) this).field_G = param0;
            if (param1 >= -103) {
                fsa.K(-88);
            }
            return;
        }
    }

    final boolean J(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 > 35) {
            break L0;
          } else {
            ((fsa) this).field_lb = 122;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((fsa) this).field_K.d((byte) 14)) {
              break L2;
            } else {
              if (!((fsa) this).field_u.d((byte) 14)) {
                break L2;
              } else {
                if (!((fsa) this).field_B.d((byte) 14)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void z(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((fsa) this).field_y)) {
            return;
        }
        ((fsa) this).field_y.field_u.a((ffa) this, -78);
        ((fsa) this).field_y.field_u.b((ffa) this, param0 + 7072);
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        if (param0 != 1) {
            ((fsa) this).field_j = 74;
        }
        while (var2 != null) {
            var2.z(param0);
            var2 = (fsa) (Object) ((fsa) this).field_K.e(122);
        }
    }

    final void u(int param0) {
        fsa var2 = null;
        wda var2_ref = null;
        nv var2_ref2 = null;
        dg var2_ref3 = null;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (((fsa) this).field_jb) {
            ((fsa) this).field_x = true;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        L1: while (true) {
          if (var2 == null) {
            ((fsa) this).x((byte) -60);
            this.N(param0 ^ param0);
            var2_ref = (wda) (Object) ((fsa) this).field_B.f(param0 + -80);
            L2: while (true) {
              if (var2_ref == null) {
                var2_ref2 = (nv) (Object) ((fsa) this).field_u.f(-80);
                L3: while (true) {
                  if (var2_ref2 == null) {
                    var2_ref3 = (dg) (Object) ((fsa) this).field_O.f(-80);
                    L4: while (true) {
                      if (var2_ref3 == null) {
                        var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                        L5: while (true) {
                          if (var2 == null) {
                            return;
                          } else {
                            var2.field_X = (fsa) this;
                            var2.u(param0);
                            var2 = (fsa) (Object) ((fsa) this).field_K.e(126);
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (this.a(var2_ref3, param0 ^ -113)) {
                            var2_ref3.a(var2_ref3.c(-118), (gma) this, (byte) 36);
                            break L6;
                          } else {
                            var2_ref3.p(91);
                            break L6;
                          }
                        }
                        var2_ref3 = (dg) (Object) ((fsa) this).field_O.e(124);
                        continue L4;
                      }
                    }
                  } else {
                    var2_ref2.a(true, (fsa) this);
                    var2_ref2.n((byte) 86);
                    var2_ref2 = (nv) (Object) ((fsa) this).field_u.e(122);
                    continue L3;
                  }
                }
              } else {
                var2_ref.a(88, (fsa) this);
                var2_ref = (wda) (Object) ((fsa) this).field_B.e(120);
                continue L2;
              }
            }
          } else {
            L7: {
              if (var2.w((byte) -127)) {
                var2.B(param0 ^ -165);
                var2.p(48);
                break L7;
              } else {
                break L7;
              }
            }
            var2 = (fsa) (Object) ((fsa) this).field_K.e(118);
            continue L1;
          }
        }
    }

    final qea y(int param0) {
        if (param0 != 1751085328) {
            return null;
        }
        return ((fsa) this).field_y.q(param0 + -1751085231);
    }

    final boolean d(int param0, boolean param1) {
        if (param0 != 50) {
            return false;
        }
        if (((fsa) this).field_M) {
            return true;
        }
        if (param1) {
            if (null == ((fsa) this).field_X) {
                return false;
            }
            return ((fsa) this).field_X.d(50, param1);
        }
        return false;
    }

    final int P(int param0) {
        if (param0 != 0) {
            fsa.K(-55);
        }
        return ((fsa) this).field_db - -((fsa) this).g((byte) 115);
    }

    private final String E() {
        String var2 = null;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!((fsa) this).field_K.d((byte) 14)) {
            var2 = "Compound Trap";
            break L0;
          } else {
            L1: {
              if (!((fsa) this).field_u.d((byte) 14)) {
                break L1;
              } else {
                if (((fsa) this).field_B.d((byte) 14)) {
                  var2 = "Empty Trap";
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = "Regular Trap";
            break L0;
          }
        }
        var2 = var2 + " [" + ((fsa) this).field_i.field_d + "]";
        return var2;
    }

    private final gr b(int param0, int param1) {
        int discarded$0 = -30;
        ub var3 = this.k();
        if (param1 >= 0) {
            if (!(param1 >= var3.a(-1))) {
                return (gr) var3.a(true, param1);
            }
        }
        return null;
    }

    public final boolean b(boolean param0) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((fsa) this).a(-86, (gma) null, (ffa) null, -88);
            break L0;
          }
        }
        L1: {
          if (null == ((fsa) this).field_X) {
            break L1;
          } else {
            if (((fsa) this).field_X.b(param0)) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            int discarded$2 = 0;
            if (this.f()) {
              break L3;
            } else {
              if (((fsa) this).field_B.d((byte) 14)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L2;
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, boolean param1) {
        ((fsa) this).field_p = true;
        int var3 = 18 / ((-5 - param0) / 36);
    }

    final void a(iq param0, int param1) {
        nv var3 = null;
        fsa var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (nv) (Object) ((fsa) this).field_u.f(-80);
            L1: while (true) {
              if (var3 == null) {
                var3_ref = (fsa) (Object) ((fsa) this).field_K.f(-80);
                L2: while (true) {
                  if (var3_ref == null) {
                    L3: {
                      if (param1 == -10425) {
                        break L3;
                      } else {
                        boolean discarded$2 = this.B((byte) 57);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    var3_ref.a(param0, -10425);
                    var3_ref = (fsa) (Object) ((fsa) this).field_K.e(123);
                    continue L2;
                  }
                }
              } else {
                var3.b(123, param0);
                var3 = (nv) (Object) ((fsa) this).field_u.e(param1 + 10546);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref2;
            stackOut_10_1 = new StringBuilder().append("fsa.SB(");
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
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void a(uw param0) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.A((byte) 105)) {
                  break L2;
                } else {
                  if (this.B((byte) -81)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              param0.a((byte) 4, 9, (fo) this);
              break L1;
            }
            var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
            L3: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.b(0, param0);
                var3 = (dg) (Object) ((fsa) this).field_O.e(111);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("fsa.VE(");
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
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + true + ')');
        }
    }

    private final void F(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int discarded$0 = 116;
        this.u();
        uja var2 = new uja(((fsa) this).field_K);
        fsa var3 = (fsa) (Object) var2.a(true);
        while (var3 != null) {
            var3.F((byte) -102);
            var3 = (fsa) (Object) var2.a(-1);
        }
        if (param0 > -90) {
            ((fsa) this).field_mb = 92;
        }
    }

    final void b(int param0, int param1, int param2) {
        ((fsa) this).field_mb = param1;
        if (param0 != 437453352) {
            return;
        }
        ((fsa) this).field_Z = param2;
    }

    public final void m(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        fsa var2_ref_fsa = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2_ref_fsa != null) {
            var2_ref_fsa.m(-93);
            var2_ref_fsa = (fsa) (Object) ((fsa) this).field_K.e(123);
        }
        wda var2_ref_wda = (wda) (Object) ((fsa) this).field_B.f(-80);
        while (var2_ref_wda != null) {
            var2_ref_wda.m(127);
            var2_ref_wda = (wda) (Object) ((fsa) this).field_B.e(109);
        }
        nv var2_ref_nv = (nv) (Object) ((fsa) this).field_u.f(-80);
        while (var2_ref_nv != null) {
            var2_ref_nv.m(-109);
            var2_ref_nv = (nv) (Object) ((fsa) this).field_u.e(112);
        }
        int var2 = 14 / ((28 - param0) / 49);
    }

    final void d(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        fsa var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var3 != null) {
            if (!var3.a(param0, 31749)) {
                var3.v((byte) 109);
                var3.p(39);
            }
            var3 = (fsa) (Object) ((fsa) this).field_K.e(119);
        }
        if (param1 >= -7) {
            ((fsa) this).a(true, false, (ui) null, (ui) null);
        }
    }

    private final void N(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        ((fsa) this).field_J = ((fsa) this).s(25745);
        ((fsa) this).field_j = ((fsa) this).e(false);
        if (param0 != 0) {
            return;
        }
        ((fsa) this).field_ib = ((fsa) this).q((byte) -80);
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2 != null) {
            var2.N(0);
            var2 = (fsa) (Object) ((fsa) this).field_K.e(126);
        }
        int discarded$0 = 116;
        this.u();
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -12) {
            return;
        }
        this.b(0, param1, 127, ((fsa) this).field_L, param2);
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        nv var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 55) {
              if (this.D(-107)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (!this.a(param1, (byte) -72)) {
                  if (param7 <= ((fsa) this).field_f) {
                    if (!((fsa) this).a((byte) 110, param4, param6, param0, param3)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      var9 = (nv) (Object) ((fsa) this).field_u.f(-80);
                      L1: while (true) {
                        if (var9 == null) {
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          if (!var9.a(param0, param3, 1, param6, param4, param7, param5)) {
                            var9 = (nv) (Object) ((fsa) this).field_u.e(126);
                            continue L1;
                          } else {
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var9_ref;
            stackOut_26_1 = new StringBuilder().append("fsa.IC(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L2;
            }
          }
          L3: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_25_0 != 0;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = TombRacer.field_G ? 1 : 0;
        if (!(this.j(param4, 8192))) {
            return 0;
        }
        if (!((fsa) this).a((byte) 110, param2, param3, param5, param1)) {
            return 0;
        }
        if (!param0) {
            ((fsa) this).field_Q = true;
        }
        int var7 = 0;
        nv var8 = (nv) (Object) ((fsa) this).field_u.f(-80);
        while (var8 != null) {
            if (!(!var8.a(-97))) {
                var7 = var7 + var8.a(param1, param5, param2, param4, (byte) 88, param3);
            }
            var8 = (nv) (Object) ((fsa) this).field_u.e(126);
        }
        return var7;
    }

    final void c(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        ((fsa) this).x(param1 ^ 15463).m(9262).a((fsa) this, param1 ^ 8);
        if (param1 != 9) {
            ((fsa) this).field_D = true;
        }
        this.t(param1 ^ 2097161);
        dg var3 = (dg) (Object) ((fsa) this).field_O.f(param1 + -89);
        while (var3 != null) {
            var3.a((byte) -91, param0);
            var3 = (dg) (Object) ((fsa) this).field_O.e(118);
        }
        ((fsa) this).v((byte) 109);
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = -63 % ((param0 - -61) / 41);
        ((fsa) this).field_h[param2] = param1;
        if (!(((fsa) this).field_X == null)) {
            ((fsa) this).field_X.a((byte) 102, param1, param2);
        }
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return null;
        }
        return ((fsa) this).field_Y;
    }

    public final void a(int param0, int param1, int param2) {
        ((fsa) this).field_y.field_u.a((ffa) this, (byte) 115);
        ((fsa) this).b(437453352, param0, param1);
        this.F((byte) -108);
        ((fsa) this).field_y.field_u.b((ffa) this, param2 ^ 7075);
        if (param2 != 2) {
            ((fsa) this).field_w = -48;
        }
    }

    final void f(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        dg var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
        while (var3 != null) {
            var3.a(param1, (byte) 122);
            var3 = (dg) (Object) ((fsa) this).field_O.e(param0 ^ 102);
        }
        if (param0 != 10) {
            ((fsa) this).field_i = null;
        }
        ((fsa) this).field_db = ((fsa) this).field_db + param1;
    }

    public static void K(int param0) {
        if (param0 != 8424) {
            field_m = -93;
        }
        field_q = null;
    }

    public final lj a(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
            return null;
        }
        if (param2) {
            return ((fsa) this).a(param2, param1, (byte) -26);
        }
        return ((fsa) this).field_y.a(param0, param1, param2);
    }

    final fsa a(int param0, la param1, boolean param2) {
        kh var4 = null;
        RuntimeException var4_ref = null;
        fsa var5 = null;
        Object stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new kh(30000);
            var4.i(8);
            if (param0 == -14402) {
              ((fsa) this).a(var4, -108);
              var4.k(-1826190686);
              var4.field_h = 0;
              var4.h((byte) 111);
              var5 = new fsa(param1, var4, param2);
              var4.i((byte) 98);
              var5.a(true, param2, (ui) null, new ui());
              var5.h(true);
              stackOut_3_0 = (fsa) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fsa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("fsa.SE(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((fsa) this).field_M = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.b(param1 ^ 12507, param0)) {
                  break L3;
                } else {
                  if (((fsa) this).field_I > ((fsa) this).field_R) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fsa.OA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void L(int param0) {
        ((fsa) this).field_D = true;
        int var2 = 66 % ((param0 - 60) / 58);
    }

    final void a(la param0, boolean param1) {
        RuntimeException var3 = null;
        wda var3_ref = null;
        nv var3_ref2 = null;
        dg var3_ref3 = null;
        fsa var3_ref4 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_u.a((ffa) this, (byte) 116);
              if (!param1) {
                break L1;
              } else {
                ((fsa) this).field_Y = null;
                break L1;
              }
            }
            L2: {
              if (!((fsa) this).n((byte) 122)) {
                ((fsa) this).field_s = -((fsa) this).field_s;
                ((fsa) this).field_Z = -((fsa) this).field_Z;
                break L2;
              } else {
                ((fsa) this).field_Z = param0.a(((fsa) this).field_Z, (byte) 71);
                ((fsa) this).field_s = param0.a(((fsa) this).field_s, (byte) 71);
                break L2;
              }
            }
            L3: {
              ((fsa) this).field_lb = param0.a(((fsa) this).field_lb, (byte) 71);
              ((fsa) this).field_U = param0.a(((fsa) this).field_U, (byte) 71);
              if (((fsa) this).n((byte) 108)) {
                ((fsa) this).field_J = param0.a(((fsa) this).field_J, (byte) 71);
                break L3;
              } else {
                ((fsa) this).field_J = -((fsa) this).field_J;
                break L3;
              }
            }
            ((fsa) this).field_ib = dfa.a(-((fsa) this).field_ib, 8192, -35);
            ((fsa) this).field_F = dfa.a(-((fsa) this).field_F, 8192, -97);
            param0.field_u.b((ffa) this, 7073);
            var3_ref = (wda) (Object) ((fsa) this).field_B.f(-80);
            L4: while (true) {
              if (var3_ref == null) {
                var3_ref2 = (nv) (Object) ((fsa) this).field_u.f(-80);
                L5: while (true) {
                  if (var3_ref2 == null) {
                    var3_ref3 = (dg) (Object) ((fsa) this).field_O.f(-80);
                    L6: while (true) {
                      if (var3_ref3 == null) {
                        var3_ref4 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                        L7: while (true) {
                          if (var3_ref4 == null) {
                            break L0;
                          } else {
                            var3_ref4.a(param0, false);
                            var3_ref4 = (fsa) (Object) ((fsa) this).field_K.e(121);
                            continue L7;
                          }
                        }
                      } else {
                        var3_ref3.h(65);
                        var3_ref3 = (dg) (Object) ((fsa) this).field_O.e(110);
                        continue L6;
                      }
                    }
                  } else {
                    var3_ref2.h(28701);
                    var3_ref2 = (nv) (Object) ((fsa) this).field_u.e(116);
                    continue L5;
                  }
                }
              } else {
                var3_ref.c((byte) -122);
                var3_ref = (wda) (Object) ((fsa) this).field_B.e(114);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("fsa.CC(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 <= 105) {
            int discarded$0 = ((fsa) this).q((byte) -1);
        }
        return ((fsa) this).field_cb;
    }

    final void F(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((fsa) this).field_y.j((byte) 104) == null)) {
            int discarded$0 = 1;
            this.a(((fsa) this).field_y.j((byte) 49));
        }
        fsa var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2 != null) {
            var2.F(127);
            var2 = (fsa) (Object) ((fsa) this).field_K.e(108);
        }
        ((fsa) this).u(0);
        int discarded$1 = 116;
        this.u();
        if (param0 < 96) {
            ((fsa) this).c(-88, 5);
        }
        ((fsa) this).z(1);
    }

    private final boolean C(int param0) {
        if (param0 >= -40) {
            hca discarded$0 = ((fsa) this).H(37);
        }
        return null != ((fsa) this).field_X ? true : false;
    }

    final void a(int param0, byte param1, boolean param2) {
        uja var4 = null;
        fsa var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        ((fsa) this).field_V = param0;
        if (param2) {
            var4 = new uja(((fsa) this).field_K);
            var5 = (fsa) (Object) var4.a(true);
            while (var5 != null) {
                var5.a(param0, (byte) -12, param2);
                var5 = (fsa) (Object) var4.a(param1 ^ 11);
            }
        }
        if (param1 != -12) {
            ((fsa) this).field_I = -21;
        }
    }

    final void a(wda param0, int param1) {
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
              ((fsa) this).field_B.b((byte) -101, (vg) (Object) param0);
              param0.a(45, (fsa) this);
              if (param1 == 0) {
                break L1;
              } else {
                ((fsa) this).field_y = null;
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
            stackOut_3_1 = new StringBuilder().append("fsa.WD(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(gma param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
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
            if ((Object) (Object) param0 != this) {
              if (((fsa) this).field_x) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                L1: {
                  if (param1 < -43) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((fsa) this).w((byte) -34);
                    break L1;
                  }
                }
                L2: {
                  if (!(param0 instanceof fsa)) {
                    break L2;
                  } else {
                    if (((fsa) this).r(0) != ((fsa) (Object) param0).r(0)) {
                      break L2;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("fsa.AD(");
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
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void b(byte param0, int param1) {
        int var3 = -10 / ((-12 - param0) / 42);
    }

    final fsa r(int param0) {
        if (param0 != 0) {
            ((fsa) this).field_f = 55;
        }
        if (((fsa) this).field_X != null) {
            return ((fsa) this).field_X.r(0);
        }
        return (fsa) this;
    }

    fsa(la param0, boolean param1) {
        this(param0, 0, 0, 32, 32, 0, param1);
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            ((fsa) this).a(65, 113, 36);
        }
        return ((fsa) this).g((byte) 115);
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (((fsa) this).field_C) {
            return false;
        }
        if (param0 != 110) {
            ((fsa) this).a(false, false, (ui) null, (ui) null);
        }
        return io.a(((fsa) this).c(-72), param1, (byte) -89, ((fsa) this).a((byte) 55), param2, ((fsa) this).e(9648), param3, param4, ((fsa) this).d(3));
    }

    final int r(byte param0) {
        if (param0 != -95) {
            ((fsa) this).z(-122);
        }
        return ((fsa) this).d(3) - ((fsa) this).field_t / 2;
    }

    final boolean C(byte param0) {
        if (param0 > -40) {
            return false;
        }
        return ((fsa) this).field_P;
    }

    final void a(int param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_K.b((byte) -111, (vg) (Object) param1);
              param1.field_cb = false;
              param1.field_X = (fsa) this;
              param1.u(0);
              if (param0 < -29) {
                break L1;
              } else {
                ((fsa) this).d((byte) 16, false);
                break L1;
              }
            }
            L2: {
              if (((fsa) this).w((byte) -117)) {
                param1.d((byte) -74, true);
                param1.F(98);
                break L2;
              } else {
                param1.F(98);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fsa.UC(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final int e(boolean param0) {
        if (param0) {
            return 31;
        }
        return ((fsa) this).field_mb;
    }

    final void a(int param0, byte param1) {
        if (param1 < 69) {
            ((fsa) this).d(-37, 91);
        }
        ((fsa) this).field_F = param0;
    }

    final dt x(int param0) {
        if (param0 != 15470) {
            gpa discarded$0 = ((fsa) this).i((byte) -88);
        }
        return ((fsa) this).field_y.a(param0 ^ -1553485410);
    }

    final int w(int param0) {
        if (param0 != 17825792) {
            ((fsa) this).field_k = null;
        }
        return ((fsa) this).field_z;
    }

    private final boolean f() {
        return ((fsa) this).field_v;
    }

    final void a(boolean param0, byte param1, int param2) {
        ((fsa) this).field_k[param2] = param0;
        if (!(((fsa) this).field_X == null)) {
            ((fsa) this).field_X.a(param0, (byte) -116, param2);
        }
        int var4 = -79 / ((param1 - 40) / 58);
    }

    final void v(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(!((fsa) this).field_C)) {
            return;
        }
        ((fsa) this).field_C = true;
        nv var2 = (nv) (Object) ((fsa) this).field_u.f(-80);
        while (var2 != null) {
            var2.c(false);
            var2 = (nv) (Object) ((fsa) this).field_u.e(120);
        }
        if (param0 != 109) {
            boolean discarded$0 = ((fsa) this).a((gma) null, -13);
        }
        fsa var2_ref = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var2_ref != null) {
            var2_ref.v((byte) 109);
            var2_ref = (fsa) (Object) ((fsa) this).field_K.e(111);
        }
        ((fsa) this).B(-165);
        int discarded$1 = -1332;
        this.v();
    }

    final boolean p(byte param0) {
        if (param0 >= -101) {
            int discarded$0 = ((fsa) this).k(-114);
        }
        return ((fsa) this).field_Q;
    }

    public final int a(up param0, int param1, pc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -116)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (this.b(param0.field_j, (byte) 125)) {
                  break L1;
                } else {
                  if (!((fsa) this).field_T) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    break L1;
                  }
                }
              }
              int discarded$2 = 2;
              var4_int = eha.a(((fsa) this).field_t, param1, ((fsa) this).e(param1 + 9636), ((fsa) this).field_gb, param2, ((fsa) this).d(param1 ^ 15));
              if (var4_int != -1) {
                var5 = 0;
                var6 = new uja(((fsa) this).field_u);
                var7 = (nv) (Object) var6.a(true);
                L2: while (true) {
                  if (var7 == null) {
                    stackOut_16_0 = var5;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    var5 = var5 + var7.a(-119, param0, param2);
                    var7 = (nv) (Object) var6.a(-1);
                    continue L2;
                  }
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("fsa.ED(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          L4: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final void a(int param0, gma param1, ffa param2, int param3) {
        nv var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.k(param3, 0)) {
              if (!((fsa) this).a((byte) 110, param1.e(9648), param1.d(3), param1.a((byte) 55), param1.c(param0 ^ -26685))) {
                return;
              } else {
                L1: {
                  if (param0 == 26689) {
                    break L1;
                  } else {
                    ((fsa) this).field_I = -15;
                    break L1;
                  }
                }
                var5 = (nv) (Object) ((fsa) this).field_u.f(-80);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    L3: {
                      if (!var5.a(-115)) {
                        break L3;
                      } else {
                        var5.a(param2, (byte) 24, param1, param3);
                        break L3;
                      }
                    }
                    var5 = (nv) (Object) ((fsa) this).field_u.e(113);
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5_ref;
            stackOut_14_1 = new StringBuilder().append("fsa.GB(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    private final boolean d(boolean param0, int param1) {
        fsa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uja var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = new uja(((fsa) this).field_K);
        if (param1 == -3) {
          var4 = (fsa) (Object) var8.a(true);
          L0: while (true) {
            if (var4 == null) {
              return false;
            } else {
              L1: {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    if (((fsa) this).field_L != 0) {
                      var5 = var4.d(3) - var4.i(122);
                      var6 = var4.e(9648) + -var4.k(-21185);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = 0;
                var5 = 0;
                break L1;
              }
              L3: {
                if (var4.a(var5, var6, -4648, ((fsa) this).field_L, 0) == 2) {
                  break L3;
                } else {
                  if (var4.d(param0, param1)) {
                    break L3;
                  } else {
                    var4 = (fsa) (Object) var8.a(-1);
                    continue L0;
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            ((fsa) this).field_z = 79;
        }
        return ((fsa) this).field_C;
    }

    private final ub k() {
        int var4 = TombRacer.field_G ? 1 : 0;
        ub var2 = new ub();
        wda var3 = (wda) (Object) ((fsa) this).field_B.f(-80);
        while (var3 != null) {
            var2.a((byte) -37, (Object) (Object) var3);
            var3 = (wda) (Object) ((fsa) this).field_B.e(112);
        }
        nv var3_ref = (nv) (Object) ((fsa) this).field_u.f(-80);
        while (var3_ref != null) {
            var2.a((byte) -37, (Object) (Object) var3_ref);
            var3_ref = (nv) (Object) ((fsa) this).field_u.e(117);
        }
        return var2;
    }

    private final boolean k(int param0, int param1) {
        if (param1 != 0) {
            ((fsa) this).field_db = -92;
        }
        return ((fsa) this).field_h[param0];
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((fsa) this).field_J = 18;
        }
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            return -45;
        }
        return ((fsa) this).field_E;
    }

    final void c(byte param0, boolean param1) {
        if (param0 < 46) {
            field_q = null;
        }
        ((fsa) this).field_cb = param1 ? true : false;
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param1);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (((fsa) this).field_y == null) {
          return 0;
        } else {
          if (((fsa) this).field_V == 0) {
            return 0;
          } else {
            L0: {
              if (param3 == 0) {
                break L0;
              } else {
                L1: {
                  if (param0 != 0) {
                    break L1;
                  } else {
                    if (0 != param1) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                return ((fsa) this).field_y.a((ffa) this, (gma) this, ((fsa) this).field_V, ((fsa) this).field_t, param1, 12, ((fsa) this).field_gb, ((fsa) this).d(3), param3, param0, ((fsa) this).e(9648), param4, true);
              }
            }
            L2: {
              if (((fsa) this).field_y.a((ffa) this, ((fsa) this).field_gb, 2, ((fsa) this).field_V, ((fsa) this).e(9648), ((fsa) this).d(3), true, (gma) this, ((fsa) this).field_t)) {
                stackOut_12_0 = 2;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 0;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0;
          }
        }
    }

    final void G(int param0) {
        if (param0 < 118) {
            return;
        }
        ((fsa) this).field_D = false;
    }

    final void a(ir param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != ((fsa) this).field_X) {
                param0.field_f = param0.field_f - ((fsa) this).field_X.d(3);
                param0.field_d = param0.field_d - ((fsa) this).field_X.e(9648);
                var3_int = param0.field_f >> 8;
                var4 = param0.field_d >> 8;
                param0.field_d = var4 * (((fsa) this).field_w >> 8) + -(var3_int * (((fsa) this).field_g >> 8));
                param0.field_f = var3_int * (((fsa) this).field_w >> 8) + (((fsa) this).field_g >> 8) * var4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 9) {
                break L2;
              } else {
                ((fsa) this).field_fb = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("fsa.CA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
            return false;
        }
        return !((fsa) this).field_K.d((byte) 14) ? true : false;
    }

    private final boolean A(byte param0) {
        if (param0 <= 12) {
            return false;
        }
        return ((fsa) this).field_y.o((byte) -82);
    }

    final void a(byte param0, ir param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 54) {
                break L1;
              } else {
                int discarded$3 = ((fsa) this).r((byte) 1);
                break L1;
              }
            }
            L2: {
              if (null != ((fsa) this).field_X) {
                var3_int = param1.field_f >> 8;
                var4 = param1.field_d >> 8;
                param1.field_f = -((((fsa) this).field_g >> 8) * var4) + (((fsa) this).field_w >> 8) * var3_int;
                param1.field_d = (((fsa) this).field_w >> 8) * var4 - -(var3_int * (((fsa) this).field_g >> 8));
                param1.field_f = param1.field_f + ((fsa) this).field_X.d(3);
                param1.field_d = param1.field_d + ((fsa) this).field_X.e(9648);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("fsa.SC(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final boolean D(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -80) {
            break L0;
          } else {
            ((fsa) this).field_j = -124;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((fsa) this).field_A) {
              break L2;
            } else {
              if (null == ((fsa) this).field_X) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final boolean j(int param0, int param1) {
        return ((fsa) this).field_k[param0];
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((fsa) this).a((byte) 41, (nv) null);
        }
        return ((fsa) this).field_mb;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nv var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.D(param0 + -85)) {
              if (!this.a(param1, (byte) -51)) {
                L1: {
                  if (((fsa) this).field_f >= param2) {
                    break L1;
                  } else {
                    if (((fsa) this).field_T) {
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    }
                  }
                }
                int discarded$2 = 2;
                var5_int = eha.a(((fsa) this).field_t, 12, ((fsa) this).e(param0 + 9649), ((fsa) this).field_gb, param3, ((fsa) this).d(3));
                if (param0 == var5_int) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  var6 = wm.a(4096, var5_int, param0 + 125);
                  var7 = 0;
                  var8 = (nv) (Object) ((fsa) this).field_u.f(-80);
                  L2: while (true) {
                    if (var8 == null) {
                      stackOut_20_0 = var7;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      L3: {
                        if (!var8.a(param2, 1, param3, var6)) {
                          break L3;
                        } else {
                          var7 = 1;
                          break L3;
                        }
                      }
                      var8 = (nv) (Object) ((fsa) this).field_u.e(param0 ^ -114);
                      continue L2;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("fsa.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          L5: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final void a(boolean param0, int param1) {
        ((fsa) this).field_T = param0 ? true : false;
        if (null != ((fsa) this).field_X) {
            ((fsa) this).field_X.a(param0, -102);
        }
        int var3 = -77 % ((param1 - -34) / 49);
    }

    private final int t() {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        fsa var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
        while (var3 != null) {
            if (!(var3.w((byte) -113))) {
                var2++;
            }
            var3 = (fsa) (Object) ((fsa) this).field_K.e(116);
        }
        return var2;
    }

    fsa(la param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((fsa) this).field_K = new vna();
        ((fsa) this).field_B = new vna();
        ((fsa) this).field_u = new vna();
        ((fsa) this).field_T = false;
        ((fsa) this).field_h = new boolean[3];
        ((fsa) this).field_f = 0;
        ((fsa) this).field_W = new boolean[6];
        ((fsa) this).field_cb = true;
        ((fsa) this).field_r = true;
        ((fsa) this).field_jb = false;
        ((fsa) this).field_L = 0;
        ((fsa) this).field_V = 0;
        ((fsa) this).field_k = new boolean[3];
        ((fsa) this).field_O = new vna();
        ((fsa) this).field_o = new bca();
        ((fsa) this).field_fb = new on();
        ((fsa) this).field_z = -1;
        ((fsa) this).field_db = 32;
        try {
          L0: {
            L1: {
              ((fsa) this).field_ab = rn.field_b;
              ((fsa) this).field_gb = param4 << 16;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param6) {
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
            ((fsa) this).field_jb = stackIn_4_1 != 0;
            ((fsa) this).field_D = true;
            rn.field_b = rn.field_b + 1;
            ((fsa) this).field_y = param0;
            ((fsa) this).field_mb = param2 << 16;
            ((fsa) this).field_F = param5;
            ((fsa) this).field_t = param3 << 16;
            ((fsa) this).field_Z = param1 << 16;
            ((fsa) this).a(true, param6, param0.e(-51), (ui) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("fsa.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
