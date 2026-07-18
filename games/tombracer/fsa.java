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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final boolean a(ffa param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void u(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_bb = ((fsa) this).field_mb;
              if (param0 == 116) {
                break L1;
              } else {
                this.b(83, 92, 87, -71, -11);
                break L1;
              }
            }
            ((fsa) this).field_s = ((fsa) this).field_Z;
            ((fsa) this).field_U = ((fsa) this).d(3);
            ((fsa) this).field_E = ((fsa) this).e(9648);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.PC(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, ui param2, ui param3) {
        RuntimeException var5 = null;
        wda var5_ref = null;
        nv var5_ref2 = null;
        fsa var5_ref3 = null;
        int var6 = 0;
        int stackIn_8_0 = 0;
        nv stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        nv stackOut_26_0 = null;
        vg stackOut_28_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  if (!((fsa) this).w((byte) -110)) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
            L3: {
              param1 = stackIn_8_0 != 0;
              if (null != param2) {
                ((fsa) this).field_i = param2.a(-114, param1);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param3 == null) {
                break L4;
              } else {
                ((fsa) this).field_Y = param3.a(-102, false);
                break L4;
              }
            }
            var5_ref = (wda) (Object) ((fsa) this).field_B.f(-80);
            L5: while (true) {
              L6: {
                L7: {
                  if (null == var5_ref) {
                    break L7;
                  } else {
                    var5_ref.a(param1, (byte) -128, param2, param3);
                    var5_ref = (wda) (Object) ((fsa) this).field_B.e(116);
                    if (var6 != 0) {
                      break L6;
                    } else {
                      if (var6 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (param0) {
                  break L6;
                } else {
                  ((fsa) this).b((byte) -99, -59);
                  break L6;
                }
              }
              var5_ref2 = (nv) (Object) ((fsa) this).field_u.f(-80);
              L8: while (true) {
                L9: {
                  L10: {
                    if (var5_ref2 == null) {
                      break L10;
                    } else {
                      var5_ref2.a(-121, param2, param1, param3);
                      stackOut_26_0 = (nv) (Object) ((fsa) this).field_u.e(115);
                      stackIn_29_0 = (Object) (Object) stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var6 != 0) {
                        break L9;
                      } else {
                        var5_ref2 = stackIn_27_0;
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = ((fsa) this).field_K.f(-80);
                  stackIn_29_0 = (Object) (Object) stackOut_28_0;
                  break L9;
                }
                var5_ref3 = (fsa) (Object) stackIn_29_0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (null == var5_ref3) {
                        break L13;
                      } else {
                        var5_ref3.a(true, param1, param2, param3);
                        var5_ref3 = (fsa) (Object) ((fsa) this).field_K.e(109);
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (var6 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    break L12;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("fsa.W(").append(param0).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L14;
            }
          }
          L15: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
    }

    final void a(bca param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
                boolean discarded$3 = this.k(-16, 107);
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0, int param1) {
        try {
            ((fsa) this).field_I = param0;
            if (param1 != -1) {
                ((fsa) this).field_eb = true;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.HF(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == -55) {
                break L1;
              } else {
                ((fsa) this).g(74, 122);
                break L1;
              }
            }
            if (param1) {
              L2: {
                if (((fsa) this).field_r) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_4_0 = ((fsa) this).field_v;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.RB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void t(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        try {
            var2_int = ((fsa) this).d(3);
            var3 = ((fsa) this).e(param0 + -2087504);
            var4 = ((fsa) this).g((byte) 115);
            ((fsa) this).field_y.b(false).a((byte) 101, param0 + var4, var2_int, var3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.V(" + param0 + ')');
        }
    }

    final void h(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_f = param0;
              if (null == ((fsa) this).field_X) {
                break L1;
              } else {
                ((fsa) this).field_X.h(param0, 0);
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                boolean discarded$2 = this.C(-45);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.UF(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!((fsa) this).field_C) {
              L1: {
                boolean discarded$5 = this.C(-76);
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
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(gr param0, byte param1, dg param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (null != param2) {
              if (param1 == 124) {
                ((fsa) this).field_O.b((byte) -74, (vg) (Object) param2);
                param2.a(param0, (gma) this, (byte) 36);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("fsa.OE(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void c(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((fsa) this).field_V == 0) {
                    break L3;
                  } else {
                    if (((fsa) this).d(true)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((fsa) this).field_F = ((fsa) this).field_F + param1;
                ((fsa) this).field_F = dfa.a(((fsa) this).field_F, 8192, -67);
                ((fsa) this).x((byte) -60);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var3_int = ((fsa) this).field_F;
              ((fsa) this).field_F = ((fsa) this).field_F + param1;
              ((fsa) this).field_F = dfa.a(((fsa) this).field_F, 8192, -126);
              ((fsa) this).x((byte) -60);
              var4 = this.d(true, -3) ? 1 : 0;
              if (var4 == 0) {
                break L1;
              } else {
                ((fsa) this).field_F = var3_int;
                ((fsa) this).x((byte) -60);
                break L1;
              }
            }
            if (!param0) {
              ((fsa) this).z(1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.CF(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean B(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -81) {
                break L1;
              } else {
                String discarded$2 = ((fsa) this).toString();
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.K(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((fsa) this).field_l = false;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((fsa) this).field_hb != 0) {
                  break L3;
                } else {
                  L4: {
                    if (!((fsa) this).field_A) {
                      break L4;
                    } else {
                      if (((fsa) this).field_X == null) {
                        break L4;
                      } else {
                        if (!((fsa) this).field_X.j(-1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.D(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final void v(int param0) {
        RuntimeException runtimeException = null;
        dg var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = (dg) (Object) ((fsa) this).field_O.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.i((byte) -30);
                    var2 = (dg) (Object) ((fsa) this).field_O.e(126);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == -1332) {
                    break L4;
                  } else {
                    qea discarded$2 = ((fsa) this).y(5);
                    break L4;
                  }
                }
                ((fsa) this).field_O.d(8);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.MB(" + param0 + ')');
        }
    }

    final static void a(int param0, kea param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              kh.a(true, la.field_k, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("fsa.AF(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public final int i(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 90) {
                break L1;
              } else {
                ((fsa) this).field_P = true;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_U;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.KA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int i(int param0, int param1) {
        wda var3 = null;
        nv var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        wda stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        wda stackOut_6_0 = null;
        vg stackOut_8_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0 = fs.a((byte) 79, param0, ((fsa) this).field_Z);
              if (param1 < -100) {
                break L1;
              } else {
                ((fsa) this).field_db = -42;
                break L1;
              }
            }
            param0 = fs.a((byte) 64, param0, ((fsa) this).field_mb);
            param0 = fs.a((byte) 84, param0, ((fsa) this).field_F);
            var3 = (wda) (Object) ((fsa) this).field_B.f(-80);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    param0 = var3.a(0, param0);
                    stackOut_6_0 = (wda) (Object) ((fsa) this).field_B.e(121);
                    stackIn_9_0 = (Object) (Object) stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      var3 = stackIn_7_0;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_8_0 = ((fsa) this).field_u.f(-80);
                stackIn_9_0 = (Object) (Object) stackOut_8_0;
                break L3;
              }
              var3_ref = (nv) (Object) stackIn_9_0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (null == var3_ref) {
                      break L7;
                    } else {
                      stackOut_11_0 = var3_ref.a(param0, -109);
                      stackIn_14_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        param0 = stackIn_12_0;
                        var3_ref = (nv) (Object) ((fsa) this).field_u.e(115);
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = param0;
                  stackIn_14_0 = stackOut_13_0;
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref2, "fsa.EE(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_52_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != 0) {
                break L1;
              } else {
                if (param3 == 0) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (!((fsa) this).a((byte) -55, param1)) {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            } else {
              L2: {
                L3: {
                  if (param2 != 2) {
                    var7_int = 0;
                    L4: while (true) {
                      if (param5 <= var7_int) {
                        break L3;
                      } else {
                        param4 = param4 * 11 / 12;
                        param3 = 11 * param3 / 12;
                        var7_int++;
                        if (var8 != 0) {
                          break L2;
                        } else {
                          if (var8 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0 > 68) {
                  this.b(1 + param5, param4, 123, param2, param3);
                  break L2;
                } else {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
              L5: {
                L6: {
                  if (((fsa) this).field_s - -param4 != ((fsa) this).field_Z) {
                    break L6;
                  } else {
                    if (((fsa) this).field_mb != param3 + ((fsa) this).field_bb) {
                      break L6;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_34_0 = stackOut_31_0;
                      break L5;
                    }
                  }
                }
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L5;
              }
              L7: {
                var7_int = stackIn_34_0;
                if (var7_int != 0) {
                  break L7;
                } else {
                  if (param2 != 2) {
                    break L7;
                  } else {
                    ((fsa) this).field_l = true;
                    break L7;
                  }
                }
              }
              L8: {
                if (param1) {
                  break L8;
                } else {
                  if (var7_int == 0) {
                    break L8;
                  } else {
                    if (8192 > ua.a(param4, -124) - -ua.a(param3, -127)) {
                      break L8;
                    } else {
                      if (param5 > 2) {
                        break L8;
                      } else {
                        ((fsa) this).field_y.a(false, ((fsa) this).d(3), 0, 0, ((fsa) this).e(9648), 0);
                        break L8;
                      }
                    }
                  }
                }
              }
              stackOut_52_0 = var7_int;
              stackIn_53_0 = stackOut_52_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "fsa.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_53_0 != 0;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -11) {
            return;
        }
        try {
            ((fsa) this).field_gb = param1;
            ((fsa) this).field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void i(boolean param0) {
        fsa var2 = null;
        uw var2_ref = null;
        RuntimeException var2_ref2 = null;
        dg var3 = null;
        int var4 = 0;
        fsa stackIn_11_0 = null;
        fsa stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_10_0 = null;
        Object stackOut_18_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((fsa) this).j(-1)) {
              return;
            } else {
              L1: {
                if (((fsa) this).field_X == null) {
                  break L1;
                } else {
                  if (((fsa) this).field_A) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var2) {
                      break L4;
                    } else {
                      stackOut_10_0 = (fsa) var2;
                      stackIn_19_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_11_0.field_A) {
                            var2.i(true);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2 = (fsa) (Object) ((fsa) this).field_K.e(120);
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((fsa) this).field_hb = 1;
                  ((fsa) this).field_f = 0;
                  ((fsa) this).field_kb = 0;
                  ((fsa) this).field_r = param0;
                  stackOut_18_0 = this;
                  stackIn_19_0 = (fsa) (Object) stackOut_18_0;
                  break L3;
                }
                L6: {
                  L7: {
                    var2_ref = this.field_y.j((byte) 104);
                    if (null == var2_ref) {
                      break L7;
                    } else {
                      var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
                      L8: while (true) {
                        if (null == var3) {
                          break L7;
                        } else {
                          var3.a(-65, var2_ref);
                          var3 = (dg) (Object) ((fsa) this).field_O.e(123);
                          if (var4 != 0) {
                            break L6;
                          } else {
                            if (var4 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref2, "fsa.UA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                this.F((byte) -116);
                if (((fsa) this).field_V <= 0) {
                  break L2;
                } else {
                  L3: {
                    var6_int = 0;
                    if (param1 != 0) {
                      var6_int = 1;
                      ((fsa) this).field_Z = ((fsa) this).field_Z + param1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6_int == 0) {
                      break L4;
                    } else {
                      if (this.a(((fsa) this).d(3) - ((fsa) this).field_U, 0, -4648, param3, param0) == 2) {
                        ((fsa) this).field_Z = ((fsa) this).field_s;
                        ((fsa) this).field_Q = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var6_int = 0;
                    if (0 == param4) {
                      break L5;
                    } else {
                      ((fsa) this).field_mb = ((fsa) this).field_mb + param4;
                      var6_int = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (var6_int == 0) {
                      break L6;
                    } else {
                      if (this.a(0, ((fsa) this).e(9648) - ((fsa) this).field_E, -4648, param3, param0) != 2) {
                        break L6;
                      } else {
                        ((fsa) this).field_P = true;
                        ((fsa) this).field_mb = ((fsa) this).field_bb;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (!this.d(false, -3)) {
                      break L7;
                    } else {
                      L8: {
                        if (~((fsa) this).field_s == ~((fsa) this).field_Z) {
                          break L8;
                        } else {
                          ((fsa) this).field_Q = true;
                          break L8;
                        }
                      }
                      L9: {
                        if (~((fsa) this).field_bb != ~((fsa) this).field_mb) {
                          ((fsa) this).field_P = true;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ((fsa) this).field_Z = ((fsa) this).field_s;
                      ((fsa) this).field_mb = ((fsa) this).field_bb;
                      break L7;
                    }
                  }
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fsa) this).field_mb = ((fsa) this).field_mb + param4;
              ((fsa) this).field_Z = ((fsa) this).field_Z + param1;
              break L1;
            }
            L10: {
              L11: {
                if (((fsa) this).field_s != ((fsa) this).field_Z) {
                  break L11;
                } else {
                  if (((fsa) this).field_mb != ((fsa) this).field_bb) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              ((fsa) this).field_M = true;
              ((fsa) this).z(1);
              break L10;
            }
            L12: {
              if (param2 > 109) {
                break L12;
              } else {
                boolean discarded$1 = ((fsa) this).j(109);
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "fsa.PB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 14 / ((param0 - 6) / 46);
              if (((fsa) this).field_r) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.UD(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        uja var3_ref = null;
        dg var3_ref2 = null;
        wda var4 = null;
        nv var4_ref = null;
        fsa var4_ref2 = null;
        int var5 = 0;
        int stackIn_33_0 = 0;
        wda stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        wda stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        nv stackIn_81_0 = null;
        Object stackIn_100_0 = null;
        fsa stackIn_103_0 = null;
        Object stackIn_110_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        wda stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        wda stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        nv stackOut_80_0 = null;
        vg stackOut_99_0 = null;
        fsa stackOut_102_0 = null;
        vg stackOut_109_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((fsa) this).field_C) {
              L1: {
                L2: {
                  ((fsa) this).field_fb.a(86);
                  if (((fsa) this).field_l) {
                    break L2;
                  } else {
                    ((fsa) this).field_R = 0;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 == ((fsa) this).field_R) {
                    break L3;
                  } else {
                    ((fsa) this).field_R = ((fsa) this).field_R + 1;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                ((fsa) this).field_R = ((fsa) this).field_y.q(-88).a(3, 0);
                break L1;
              }
              L4: {
                ((fsa) this).field_l = false;
                if (((fsa) this).field_N <= 0) {
                  break L4;
                } else {
                  ((fsa) this).field_N = ((fsa) this).field_N - 1;
                  if (((fsa) this).field_N == 0) {
                    ((fsa) this).v((byte) 109);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (((fsa) this).n((byte) 123)) {
                  ((fsa) this).D((byte) 118);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (param1) {
                    break L7;
                  } else {
                    if (!((fsa) this).x(15470).g(99)) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                stackOut_30_0 = 1;
                stackIn_33_0 = stackOut_30_0;
                break L6;
              }
              L8: {
                param1 = stackIn_33_0 != 0;
                if (param1) {
                  break L8;
                } else {
                  if (((fsa) this).field_G > 0) {
                    ((fsa) this).field_G = ((fsa) this).field_G - 1;
                    param1 = true;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param1) {
                  break L9;
                } else {
                  if (!((fsa) this).field_v) {
                    break L9;
                  } else {
                    if (!((fsa) this).x(15470).f(8, 10915)) {
                      break L9;
                    } else {
                      boolean discarded$1 = ((fsa) this).a(86, true, 1, 131072 - ((fsa) this).field_y.q(90).a(262144, 0), -((fsa) this).field_y.q(85).a(262144, 0) + 131072, 0);
                      break L9;
                    }
                  }
                }
              }
              L10: {
                L11: {
                  if (((fsa) this).j(-1)) {
                    break L11;
                  } else {
                    L12: {
                      L13: {
                        L14: {
                          L15: {
                            ((fsa) this).field_Q = false;
                            ((fsa) this).field_P = false;
                            var3_ref = new uja(((fsa) this).field_B);
                            if (!((fsa) this).field_D) {
                              break L15;
                            } else {
                              if (param1) {
                                break L15;
                              } else {
                                var4 = (wda) (Object) var3_ref.a(true);
                                L16: while (true) {
                                  if (null == var4) {
                                    break L15;
                                  } else {
                                    stackOut_56_0 = (wda) var4;
                                    stackOut_56_1 = 87;
                                    stackIn_73_0 = stackOut_56_0;
                                    stackIn_73_1 = stackOut_56_1;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    if (var5 != 0) {
                                      L17: while (true) {
                                        ((wda) (Object) stackIn_73_0).b(stackIn_73_1);
                                        var4 = (wda) (Object) var3_ref.a(-1);
                                        if (var5 != 0) {
                                          break L12;
                                        } else {
                                          if (var5 == 0) {
                                            if (null == var4) {
                                              break L13;
                                            } else {
                                              stackOut_72_0 = (wda) var4;
                                              stackOut_72_1 = 1;
                                              stackIn_73_0 = stackOut_72_0;
                                              stackIn_73_1 = stackOut_72_1;
                                              continue L17;
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    } else {
                                      L18: {
                                        L19: {
                                          if (!((wda) (Object) stackIn_57_0).a((byte) stackIn_57_1)) {
                                            break L19;
                                          } else {
                                            var4.p(126);
                                            if (var5 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        if (var4.a(-80)) {
                                          var4.b((byte) -121);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var4 = (wda) (Object) var3_ref.a(-1);
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4 = (wda) (Object) var3_ref.a(true);
                          L20: while (true) {
                            if (null == var4) {
                              break L13;
                            } else {
                              stackOut_72_0 = (wda) var4;
                              stackOut_72_1 = 1;
                              stackIn_73_0 = stackOut_72_0;
                              stackIn_73_1 = stackOut_72_1;
                              ((wda) (Object) stackIn_73_0).b(stackIn_73_1);
                              var4 = (wda) (Object) var3_ref.a(-1);
                              if (var5 != 0) {
                                break L12;
                              } else {
                                if (var5 == 0) {
                                  continue L20;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        break L13;
                      }
                      var3_ref = new uja(((fsa) this).field_u);
                      break L12;
                    }
                    var4_ref = (nv) (Object) var3_ref.a(true);
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (null == var4_ref) {
                            break L23;
                          } else {
                            stackOut_80_0 = (nv) var4_ref;
                            stackIn_100_0 = (Object) (Object) stackOut_80_0;
                            stackIn_81_0 = stackOut_80_0;
                            if (var5 != 0) {
                              break L22;
                            } else {
                              L24: {
                                L25: {
                                  if (!((nv) (Object) stackIn_81_0).a((byte) 87)) {
                                    break L25;
                                  } else {
                                    var4_ref.p(82);
                                    if (var5 == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                if (!var4_ref.a(-116)) {
                                  break L24;
                                } else {
                                  L26: {
                                    if (!param1) {
                                      break L26;
                                    } else {
                                      if (var4_ref.p((byte) 120)) {
                                        break L24;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var4_ref.k(5418);
                                  break L24;
                                }
                              }
                              var4_ref = (nv) (Object) var3_ref.a(-1);
                              if (var5 == 0) {
                                continue L21;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        var3_ref = new uja(((fsa) this).field_K);
                        stackOut_99_0 = var3_ref.a(true);
                        stackIn_100_0 = (Object) (Object) stackOut_99_0;
                        break L22;
                      }
                      var4_ref2 = (fsa) (Object) stackIn_100_0;
                      L27: while (true) {
                        if (var4_ref2 == null) {
                          break L11;
                        } else {
                          var4_ref2.b(75, param1);
                          stackOut_102_0 = (fsa) var4_ref2;
                          stackIn_110_0 = (Object) (Object) stackOut_102_0;
                          stackIn_103_0 = stackOut_102_0;
                          if (var5 != 0) {
                            break L10;
                          } else {
                            L28: {
                              if (!stackIn_103_0.field_C) {
                                break L28;
                              } else {
                                var4_ref2.p(2);
                                var4_ref2.B(-165);
                                break L28;
                              }
                            }
                            var4_ref2 = (fsa) (Object) var3_ref.a(-1);
                            if (var5 == 0) {
                              continue L27;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_109_0 = ((fsa) this).field_O.f(-80);
                stackIn_110_0 = (Object) (Object) stackOut_109_0;
                break L10;
              }
              var3_ref2 = (dg) (Object) stackIn_110_0;
              L29: while (true) {
                L30: {
                  L31: {
                    if (null == var3_ref2) {
                      break L31;
                    } else {
                      var3_ref2.d(-1);
                      var3_ref2 = (dg) (Object) ((fsa) this).field_O.e(126);
                      if (var5 != 0) {
                        break L30;
                      } else {
                        if (var5 == 0) {
                          continue L29;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  if (!((fsa) this).field_eb) {
                    break L30;
                  } else {
                    if (!((fsa) this).field_B.d((byte) 14)) {
                      break L30;
                    } else {
                      ((fsa) this).v((byte) 109);
                      return;
                    }
                  }
                }
                L32: {
                  if (!((fsa) this).field_p) {
                    break L32;
                  } else {
                    if (((fsa) this).field_u.d((byte) 14)) {
                      ((fsa) this).v((byte) 109);
                      return;
                    } else {
                      break L32;
                    }
                  }
                }
                L33: {
                  if (param0 > 26) {
                    break L33;
                  } else {
                    ((fsa) this).e(-93, 58);
                    break L33;
                  }
                }
                L34: {
                  if (((fsa) this).field_r) {
                    break L34;
                  } else {
                    L35: {
                      if (!((fsa) this).field_A) {
                        break L35;
                      } else {
                        if (null != ((fsa) this).field_X) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    if (((fsa) this).field_y.a(0, (gma) this) == 1) {
                      ((fsa) this).i(true);
                      return;
                    } else {
                      break L34;
                    }
                  }
                }
                L36: {
                  if (((fsa) this).field_hb == 0) {
                    break L36;
                  } else {
                    L37: {
                      if (((fsa) this).field_X == null) {
                        break L37;
                      } else {
                        if (!((fsa) this).field_X.j(-1)) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    ((fsa) this).field_hb = ((fsa) this).field_hb + ((fsa) this).field_kb;
                    ((fsa) this).field_kb = ((fsa) this).field_kb + 16384;
                    if (17825792 <= ((fsa) this).field_hb) {
                      ((fsa) this).c(4, (byte) 9);
                      return;
                    } else {
                      break L36;
                    }
                  }
                }
                ((fsa) this).field_M = false;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void x(byte param0) {
        fsa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((fsa) this).field_X != null) {
                ((fsa) this).field_g = hua.a((byte) 124, -((fsa) this).field_X.g(-25787) >> -831829566);
                ((fsa) this).field_w = bua.a(0, -((fsa) this).field_X.g(param0 + -25727) >> 937734050);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -60) {
                break L2;
              } else {
                ((fsa) this).field_g = -7;
                break L2;
              }
            }
            var2 = (fsa) (Object) ((fsa) this).field_K.f(param0 ^ 116);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var2) {
                    break L5;
                  } else {
                    var2.x((byte) -60);
                    var2 = (fsa) (Object) ((fsa) this).field_K.e(113);
                    if (var3 != 0) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "fsa.IB(" + param0 + ')');
        }
    }

    public final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -112 % ((param0 - 1) / 45);
            stackOut_0_0 = ((fsa) this).field_S;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.HA(" + param0 + ')');
        }
        return stackIn_1_0;
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
        int stackIn_14_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_70_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
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
                    L4: {
                      L5: {
                        if (var7 <= var8) {
                          break L5;
                        } else {
                          var9 = param3.charAt(var8);
                          stackOut_13_0 = ~var8;
                          stackIn_67_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_14_0 != -1) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var9 != 45) {
                                      break L8;
                                    } else {
                                      var4_int = 1;
                                      if (var11 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (var9 != 43) {
                                    break L7;
                                  } else {
                                    if (param2) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L9: {
                                L10: {
                                  L11: {
                                    if (var9 < 48) {
                                      break L11;
                                    } else {
                                      if (var9 <= 57) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    L13: {
                                      if (var9 < 65) {
                                        break L13;
                                      } else {
                                        if (var9 <= 90) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (var9 < 97) {
                                        break L14;
                                      } else {
                                        if (122 >= var9) {
                                          var9 -= 87;
                                          if (var11 == 0) {
                                            break L9;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    throw new NumberFormatException();
                                  }
                                  var9 -= 55;
                                  if (var11 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                                var9 -= 48;
                                break L9;
                              }
                              if (~var9 <= ~param1) {
                                throw new NumberFormatException();
                              } else {
                                L15: {
                                  if (var4_int != 0) {
                                    var9 = -var9;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var10 = param1 * var6 - -var9;
                                if (~var6 == ~(var10 / param1)) {
                                  var6 = var10;
                                  var5 = 1;
                                  break L6;
                                } else {
                                  throw new NumberFormatException();
                                }
                              }
                            }
                            var8++;
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_66_0 = var5;
                      stackIn_67_0 = stackOut_66_0;
                      break L4;
                    }
                    if (stackIn_67_0 == 0) {
                      throw new NumberFormatException();
                    } else {
                      stackOut_70_0 = var6;
                      stackIn_71_0 = stackOut_70_0;
                      break L0;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var4;
            stackOut_72_1 = new StringBuilder().append("fsa.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L16;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L16;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
        return stackIn_71_0;
    }

    final void a(byte param0, int param1) {
        try {
            ((fsa) this).field_S = param1;
            if (param0 != -3) {
                ((fsa) this).field_D = false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.BD(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 11468) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).i(-92);
                break L1;
              }
            }
            ((fsa) this).field_A = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.MD(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 <= -77) {
              if (this.b(12507, param1)) {
                if (~((fsa) this).field_R > ~((fsa) this).field_I) {
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
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int y(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -56) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).b(80);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_n;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.RC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final lj a(boolean param0, int param1, byte param2) {
        RuntimeException var4 = null;
        lj var4_ref = null;
        wda var5 = null;
        uja var5_ref = null;
        nv var6 = null;
        fsa var6_ref = null;
        int var7 = 0;
        Object stackIn_5_0 = null;
        lj stackIn_10_0 = null;
        lj stackIn_21_0 = null;
        Object stackIn_30_0 = null;
        lj stackIn_36_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        lj stackOut_9_0 = null;
        lj stackOut_20_0 = null;
        Object stackOut_29_0 = null;
        lj stackOut_35_0 = null;
        Object stackOut_38_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (vh.a(param1, param0, -27201, (lj) this)) {
              stackOut_4_0 = this;
              stackIn_5_0 = stackOut_4_0;
              return (lj) this;
            } else {
              var5 = (wda) (Object) ((fsa) this).field_B.f(-80);
              L1: while (true) {
                L2: {
                  if (null == var5) {
                    break L2;
                  } else {
                    var4_ref = var5.a(param0, 1, param1);
                    if (var4_ref == null) {
                      var5 = (wda) (Object) ((fsa) this).field_B.e(119);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      stackOut_9_0 = (lj) var4_ref;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  }
                }
                var5_ref = new uja(((fsa) this).field_u);
                var6 = (nv) (Object) var5_ref.a(true);
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        var4_ref = var6.a(0, param1, param0);
                        if (var7 != 0) {
                          break L4;
                        } else {
                          if (null != var4_ref) {
                            stackOut_20_0 = (lj) var4_ref;
                            stackIn_21_0 = stackOut_20_0;
                            return stackIn_21_0;
                          } else {
                            var6 = (nv) (Object) var5_ref.a(-1);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var5_ref = new uja(((fsa) this).field_K);
                    break L4;
                  }
                  L6: {
                    if (param2 == -26) {
                      break L6;
                    } else {
                      ((fsa) this).h(122, -84);
                      break L6;
                    }
                  }
                  var6_ref = (fsa) (Object) var5_ref.a(true);
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (null == var6_ref) {
                          break L9;
                        } else {
                          var4_ref = var6_ref.a(param0, param1, (byte) -26);
                          stackOut_29_0 = null;
                          stackIn_39_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (var7 != 0) {
                            break L8;
                          } else {
                            if (stackIn_30_0 != (Object) (Object) var4_ref) {
                              stackOut_35_0 = (lj) var4_ref;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0;
                            } else {
                              var6_ref = (fsa) (Object) var5_ref.a(-1);
                              if (var7 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = stackOut_38_0;
                      break L8;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fsa.RE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (lj) (Object) stackIn_39_0;
    }

    public final la f(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        la stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 38 % ((param0 - 0) / 61);
            stackOut_0_0 = ((fsa) this).field_y;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.SA(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final boolean l(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).a((up) null, (ep) null, -25);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (null == ((fsa) this).field_X) {
                    break L4;
                  } else {
                    if (((fsa) this).field_X.l(0)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (!((fsa) this).field_y.o((byte) -82)) {
                    break L5;
                  } else {
                    if (((fsa) this).a(((fsa) this).field_y.i(6029), 31749)) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.IA(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = 3 * (1 + ((fsa) this).field_ab);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 123;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.FD(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int Q(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 2) {
              stackOut_3_0 = ((fsa) this).e(9648) - ((fsa) this).field_gb / 2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 72;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.QD(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(int param0, gr param1) {
        ub var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = this.k((byte) -30);
              if (param0 == 13464) {
                break L1;
              } else {
                ((fsa) this).field_D = true;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (~var4 <= ~var3.a(-1)) {
                  break L3;
                } else {
                  if ((Object) (Object) param1 != var3.a(true, var4)) {
                    var4++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    stackOut_7_0 = var4;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_10_0 = -1;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fsa.HC(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    private fsa(la param0, fsa param1, kh param2, boolean param3) {
        this(param0, 0, 0, 32, 32, 0, param3);
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        wda var7_ref_wda = null;
        int var7 = 0;
        nv var8_ref_nv = null;
        int var8 = 0;
        fsa var9_ref_fsa = null;
        int var9 = 0;
        int var10 = 0;
        dg var11 = null;
        int var12 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fsa) this).field_X = param1;
              if (null == param1) {
                break L1;
              } else {
                ((fsa) this).field_cb = false;
                break L1;
              }
            }
            L2: {
              ((fsa) this).field_Z = bla.a(true, 12, param2.b((byte) 44, 12)) << -1683769520;
              ((fsa) this).field_mb = bla.a(true, 12, param2.b((byte) 44, 12)) << -1838839952;
              ((fsa) this).field_t = param2.b((byte) 44, 10) << -1456860176;
              ((fsa) this).field_gb = param2.b((byte) 44, 10) << 146366800;
              stackOut_3_0 = this;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param2.b((byte) 44, 1) == 1) {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((fsa) this).field_eb = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_10_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (param2.b((byte) 44, 1) == 1) {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              L5: {
                ((fsa) this).field_p = stackIn_11_1 != 0;
                ((fsa) this).field_N = param2.b((byte) 44, 6) * 50;
                if (param0.field_E >= 10) {
                  break L5;
                } else {
                  ((fsa) this).field_F = oo.a(3, 8192, 0, param2.b((byte) 44, 3));
                  if (var12 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ((fsa) this).field_F = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
              break L4;
            }
            L6: {
              L7: {
                if (10 >= param0.field_E) {
                  break L7;
                } else {
                  ((fsa) this).field_S = param2.b((byte) 44, 8);
                  ((fsa) this).field_I = param2.b((byte) 44, 8);
                  if (var12 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((fsa) this).field_S = param2.b((byte) 44, 8) / 5;
              ((fsa) this).field_I = 0;
              break L6;
            }
            L8: {
              if (4 > param0.field_E) {
                break L8;
              } else {
                L9: {
                  stackOut_24_0 = this;
                  stackIn_29_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (param2.b((byte) 44, 1) != 1) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L9;
                  } else {
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackOut_27_0 = this;
                    stackOut_27_1 = 1;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    break L9;
                  }
                }
                L10: {
                  ((fsa) this).field_r = stackIn_30_1 != 0;
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (param2.b((byte) 44, 1) == 1) {
                    stackOut_33_0 = this;
                    stackOut_33_1 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L10;
                  } else {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 0;
                    stackIn_34_0 = stackOut_31_0;
                    stackIn_34_1 = stackOut_31_1;
                    break L10;
                  }
                }
                ((fsa) this).field_v = stackIn_34_1 != 0;
                ((fsa) this).field_f = param2.b((byte) 44, 3);
                ((fsa) this).field_V = param2.b((byte) 44, 3);
                ((fsa) this).field_L = param2.b((byte) 44, 3);
                break L8;
              }
            }
            L11: {
              if (param0.field_E > 9) {
                break L11;
              } else {
                L12: {
                  if (((fsa) this).field_V > 1) {
                    ((fsa) this).field_V = ((fsa) this).field_V + 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (((fsa) this).field_f > 1) {
                  ((fsa) this).field_f = ((fsa) this).field_f + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            var5_int = param2.b((byte) 44, 3);
            var6 = 0;
            L13: while (true) {
              L14: {
                L15: {
                  if (var5_int <= var6) {
                    break L15;
                  } else {
                    var7_ref_wda = ki.a(param2, (byte) 95, param0, param3);
                    ((fsa) this).field_B.b((byte) -49, (vg) (Object) var7_ref_wda);
                    var7_ref_wda.a(64, (fsa) this);
                    var6++;
                    if (var12 != 0) {
                      break L14;
                    } else {
                      if (var12 == 0) {
                        continue L13;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                var6 = param2.b((byte) 44, 3);
                break L14;
              }
              var7 = 0;
              L16: while (true) {
                L17: {
                  L18: {
                    L19: {
                      if (var7 >= var6) {
                        break L19;
                      } else {
                        var8_ref_nv = bda.a(param3, (byte) 44, param0, param2);
                        ((fsa) this).field_u.b((byte) -88, (vg) (Object) var8_ref_nv);
                        var8_ref_nv.a(true, (fsa) this);
                        var7++;
                        if (var12 != 0) {
                          break L18;
                        } else {
                          if (var12 == 0) {
                            continue L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    if (param0.field_E < 2) {
                      break L18;
                    } else {
                      var7 = param2.b((byte) 44, 3);
                      if (var12 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var7 = param2.b((byte) 44, 2);
                  break L17;
                }
                var8 = 0;
                L20: while (true) {
                  L21: {
                    L22: {
                      L23: {
                        L24: {
                          if (~var8 <= ~var7) {
                            break L24;
                          } else {
                            var9_ref_fsa = new fsa(param0, (fsa) this, param2, param3);
                            ((fsa) this).field_K.b((byte) -120, (vg) (Object) var9_ref_fsa);
                            var8++;
                            if (var12 != 0) {
                              break L23;
                            } else {
                              if (var12 == 0) {
                                continue L20;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        L25: {
                          if (param0.field_E > 8) {
                            break L25;
                          } else {
                            ((fsa) this).c(437453352, false);
                            if (var12 == 0) {
                              break L22;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var8 = param2.b((byte) 44, 3);
                        break L23;
                      }
                      var9 = 0;
                      L26: while (true) {
                        if (var9 >= var8) {
                          break L22;
                        } else {
                          var10 = param2.b((byte) 44, 5) - 1;
                          var11 = rm.field_a.a(param0, param2, false);
                          ((fsa) this).a(this.b(3, var10), (byte) 124, var11);
                          var9++;
                          if (var12 != 0) {
                            break L21;
                          } else {
                            if (var12 == 0) {
                              continue L26;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                    ((fsa) this).field_o = new bca(param0.field_E, param2);
                    this.N(0);
                    break L21;
                  }
                  L27: {
                    L28: {
                      if (param0.field_E < 14) {
                        break L28;
                      } else {
                        L29: {
                          stackOut_81_0 = this;
                          stackIn_86_0 = stackOut_81_0;
                          stackIn_82_0 = stackOut_81_0;
                          if (1 != param2.b((byte) 44, 1)) {
                            stackOut_86_0 = this;
                            stackOut_86_1 = 0;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            break L29;
                          } else {
                            stackOut_82_0 = this;
                            stackIn_84_0 = stackOut_82_0;
                            stackOut_84_0 = this;
                            stackOut_84_1 = 1;
                            stackIn_87_0 = stackOut_84_0;
                            stackIn_87_1 = stackOut_84_1;
                            break L29;
                          }
                        }
                        ((fsa) this).field_A = stackIn_87_1 != 0;
                        if (var12 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    ((fsa) this).field_A = true;
                    break L27;
                  }
                  L30: {
                    L31: {
                      if (param0.field_E >= 15) {
                        break L31;
                      } else {
                        ((fsa) this).field_db = 0;
                        if (var12 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    ((fsa) this).field_db = param2.b((byte) 44, 8);
                    break L30;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var5 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) var5;
            stackOut_97_1 = new StringBuilder().append("fsa.<init>(");
            stackIn_100_0 = stackOut_97_0;
            stackIn_100_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L32;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_101_0 = stackOut_98_0;
              stackIn_101_1 = stackOut_98_1;
              stackIn_101_2 = stackOut_98_2;
              break L32;
            }
          }
          L33: {
            stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
            stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');
            stackIn_104_0 = stackOut_101_0;
            stackIn_104_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L33;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_105_0 = stackOut_102_0;
              stackIn_105_1 = stackOut_102_1;
              stackIn_105_2 = stackOut_102_2;
              break L33;
            }
          }
          L34: {
            stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');
            stackIn_108_0 = stackOut_105_0;
            stackIn_108_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param2 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L34;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_109_0 = stackOut_106_0;
              stackIn_109_1 = stackOut_106_1;
              stackIn_109_2 = stackOut_106_2;
              break L34;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_109_0, stackIn_109_2 + ',' + param3 + ')');
        }
    }

    final boolean z(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 >= 56) {
                break L1;
              } else {
                ((fsa) this).field_ab = 22;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_r;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.GA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void e(boolean param0, int param1) {
        if (param1 < 114) {
            return;
        }
        try {
            ((fsa) this).field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.MC(" + param0 + ',' + param1 + ')');
        }
    }

    final void h(boolean param0) {
        RuntimeException runtimeException = null;
        uja var2 = null;
        nv var3 = null;
        fsa var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new uja(((fsa) this).field_u);
            var3 = (nv) (Object) var2.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.g(-2);
                    var3 = (nv) (Object) var2.a(-1);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2 = new uja(((fsa) this).field_K);
                break L2;
              }
              var3_ref = (fsa) (Object) var2.a(param0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3_ref == null) {
                      break L6;
                    } else {
                      var3_ref.h(true);
                      var3_ref = (fsa) (Object) var2.a(-1);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.BB(" + param0 + ')');
        }
    }

    public final int g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = ((fsa) this).field_F;
              if (((fsa) this).field_X == null) {
                break L1;
              } else {
                var2_int = var2_int + ((fsa) this).field_X.g(param0);
                break L1;
              }
            }
            L2: {
              if (param0 == -25787) {
                break L2;
              } else {
                int discarded$2 = ((fsa) this).a(false);
                break L2;
              }
            }
            stackOut_5_0 = dfa.a(var2_int, 8192, 124);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.G(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    public final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -82 % ((-23 - param0) / 53);
            stackOut_0_0 = ((fsa) this).field_Z;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.M(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -11) {
                break L1;
              } else {
                ((fsa) this).field_mb = 62;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_t;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.P(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void c(int param0, int param1) {
        try {
            ((fsa) this).field_mb = param0;
            if (param1 != -19879) {
                ((fsa) this).c(-99, -65);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.FB(" + param0 + ',' + param1 + ')');
        }
    }

    public final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 55) {
              stackOut_3_0 = ((fsa) this).field_gb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -54;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.LA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = this.E(116) + " (id " + (Object) (Object) ((fsa) this).field_i + ")";
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "fsa.toString()");
        }
        return stackIn_1_0;
    }

    final boolean m(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -63) {
              L1: {
                if (((fsa) this).field_G <= 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.A(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int E(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).e(false);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_H;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.CE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean s(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            if (!this.f(false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((fsa) this).j(-1)) {
                  break L1;
                } else {
                  if (((fsa) this).h(18407)) {
                    break L1;
                  } else {
                    if (((fsa) this).field_f >= 1) {
                      var2_int = -59 % ((param0 - -33) / 62);
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.BC(" + param0 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2_int = -((fsa) this).field_hb;
            if (param0 == 115) {
              L1: {
                if (((fsa) this).field_X == null) {
                  break L1;
                } else {
                  var2_int = var2_int + ((fsa) this).field_X.g((byte) 115);
                  break L1;
                }
              }
              stackOut_5_0 = var2_int;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = -57;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.L(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    final int o(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -91) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).c(101);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_j;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.JE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int q(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -80) {
                break L1;
              } else {
                ((fsa) this).field_s = 121;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_F;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.SF(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int g(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = ((fsa) this).field_V;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -108;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.TA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean b(int param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1 > 104) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).k(-34);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_W[param0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.TF(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, uw param1) {
        RuntimeException runtimeException = null;
        fsa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a(param1, true);
            var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.a(127, param1);
                    var3 = (fsa) (Object) ((fsa) this).field_K.e(115);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 > 115) {
                  break L2;
                } else {
                  int discarded$3 = fsa.a(-115, -22, false, (CharSequence) null);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("fsa.WE(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
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
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_44_0 = 0;
        kh stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        kh stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        kh stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        kh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        kh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_43_0 = 0;
        kh stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        kh stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        kh stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a((byte) 0, dqa.a(true, ((fsa) this).field_Z >> -869016592, 12), 12);
              param0.a((byte) -126, dqa.a(true, ((fsa) this).field_mb >> 580796592, 12), 12);
              param0.a((byte) -127, ((fsa) this).field_t >> -1753092112, 10);
              param0.a((byte) 72, ((fsa) this).field_gb >> -173257264, 10);
              stackOut_1_0 = (kh) param0;
              stackOut_1_1 = 58;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((fsa) this).field_eb) {
                stackOut_4_0 = (kh) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2, 1);
              stackOut_5_0 = (kh) param0;
              stackOut_5_1 = 118;
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (!((fsa) this).field_p) {
                stackOut_8_0 = (kh) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                break L2;
              } else {
                stackOut_6_0 = (kh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 1;
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_9_2 = stackOut_6_2;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, 1);
              param0.a((byte) -125, ((fsa) this).field_N / 50, 6);
              var3_int = -112 / ((param1 - -58) / 39);
              param0.a((byte) -125, cn.a((byte) 59, ((fsa) this).field_F, 8192, 4), 4);
              param0.a((byte) -127, ((fsa) this).field_S, 8);
              param0.a((byte) -128, ((fsa) this).field_I, 8);
              stackOut_9_0 = (kh) param0;
              stackOut_9_1 = 123;
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (((fsa) this).field_r) {
                stackOut_12_0 = (kh) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L3;
              } else {
                stackOut_10_0 = (kh) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_13_2 = stackOut_10_2;
                break L3;
              }
            }
            L4: {
              ((kh) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, 1);
              stackOut_13_0 = (kh) param0;
              stackOut_13_1 = -25;
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (!((fsa) this).field_v) {
                stackOut_16_0 = (kh) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L4;
              } else {
                stackOut_14_0 = (kh) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 1;
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_17_2 = stackOut_14_2;
                break L4;
              }
            }
            ((kh) (Object) stackIn_17_0).a((byte) stackIn_17_1, stackIn_17_2, 1);
            param0.a((byte) 26, ((fsa) this).field_f, 3);
            param0.a((byte) -127, ((fsa) this).field_V, 3);
            param0.a((byte) -126, ((fsa) this).field_L, 3);
            param0.a((byte) -125, ((fsa) this).field_B.a((byte) -16), 3);
            var4 = (wda) (Object) ((fsa) this).field_B.f(-80);
            L5: while (true) {
              L6: {
                L7: {
                  if (var4 == null) {
                    break L7;
                  } else {
                    var4.a(param0, (byte) -100);
                    var4 = (wda) (Object) ((fsa) this).field_B.e(118);
                    if (var5 != 0) {
                      break L6;
                    } else {
                      if (var5 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                param0.a((byte) -127, ((fsa) this).field_u.a((byte) -16), 3);
                break L6;
              }
              var4_ref = (nv) (Object) ((fsa) this).field_u.f(-80);
              L8: while (true) {
                L9: {
                  L10: {
                    if (var4_ref == null) {
                      break L10;
                    } else {
                      var4_ref.a(false, param0);
                      var4_ref = (nv) (Object) ((fsa) this).field_u.e(111);
                      if (var5 != 0) {
                        break L9;
                      } else {
                        if (var5 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  param0.a((byte) -126, this.t((byte) 112), 3);
                  break L9;
                }
                var4_ref2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                L11: while (true) {
                  L12: {
                    L13: {
                      if (var4_ref2 == null) {
                        break L13;
                      } else {
                        stackOut_33_0 = var4_ref2.w((byte) -119);
                        stackIn_44_0 = stackOut_33_0 ? 1 : 0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var5 != 0) {
                          break L12;
                        } else {
                          L14: {
                            L15: {
                              if (stackIn_34_0) {
                                break L15;
                              } else {
                                var4_ref2.a(param0, -14);
                                if (var5 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var4_ref2.B(-165);
                            var4_ref2.p(17);
                            break L14;
                          }
                          var4_ref2 = (fsa) (Object) ((fsa) this).field_K.e(124);
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    stackOut_43_0 = ~((fsa) this).field_y.field_E;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  }
                  L16: {
                    L17: {
                      if (stackIn_44_0 > -10) {
                        break L17;
                      } else {
                        param0.a((byte) 88, ((fsa) this).field_O.a((byte) -16), 3);
                        var4_ref3 = (dg) (Object) ((fsa) this).field_O.f(-80);
                        L18: while (true) {
                          if (var4_ref3 == null) {
                            break L17;
                          } else {
                            param0.a((byte) -127, 1 + this.a(13464, var4_ref3.c(-93)), 5);
                            rm.field_a.a(15682, param0, var4_ref3);
                            var4_ref3 = (dg) (Object) ((fsa) this).field_O.e(109);
                            if (var5 != 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                continue L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    ((fsa) this).field_o.a((byte) -125, param0);
                    break L16;
                  }
                  L19: {
                    stackOut_52_0 = (kh) param0;
                    stackOut_52_1 = -127;
                    stackIn_55_0 = stackOut_52_0;
                    stackIn_55_1 = stackOut_52_1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    if (!((fsa) this).field_A) {
                      stackOut_55_0 = (kh) (Object) stackIn_55_0;
                      stackOut_55_1 = stackIn_55_1;
                      stackOut_55_2 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      stackIn_56_2 = stackOut_55_2;
                      break L19;
                    } else {
                      stackOut_53_0 = (kh) (Object) stackIn_53_0;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = 1;
                      stackIn_56_0 = stackOut_53_0;
                      stackIn_56_1 = stackOut_53_1;
                      stackIn_56_2 = stackOut_53_2;
                      break L19;
                    }
                  }
                  ((kh) (Object) stackIn_56_0).a((byte) stackIn_56_1, stackIn_56_2, 1);
                  param0.a((byte) -126, ((fsa) this).field_db, 8);
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var3;
            stackOut_58_1 = new StringBuilder().append("fsa.BF(");
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L20;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L20;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ',' + param1 + ')');
        }
    }

    final void d(byte param0, boolean param1) {
        try {
            ((fsa) this).field_jb = param1;
            int var3_int = 114 / ((param0 - 2) / 50);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.TE(" + param0 + ',' + param1 + ')');
        }
    }

    final void A(int param0) {
        RuntimeException runtimeException = null;
        dg var2 = null;
        fsa var2_ref = null;
        int var3 = 0;
        dg stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        dg stackOut_3_0 = null;
        vg stackOut_5_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = (dg) (Object) ((fsa) this).field_O.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.e(param0 ^ -23607);
                    stackOut_3_0 = (dg) (Object) ((fsa) this).field_O.e(param0 ^ 23599);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = ((fsa) this).field_K.f(-80);
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var2_ref = (fsa) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_ref == null) {
                      break L6;
                    } else {
                      var2_ref.A(23645);
                      var2_ref = (fsa) (Object) ((fsa) this).field_K.e(110);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 == 23645) {
                    break L5;
                  } else {
                    ((fsa) this).field_lb = -40;
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.CB(" + param0 + ')');
        }
    }

    public final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                ((fsa) this).a((byte) 51, true, -11);
                break L1;
              }
            }
            L2: {
              var2_int = ((fsa) this).field_Z;
              if (null != ((fsa) this).field_X) {
                var3 = var2_int >> -1111105272;
                var4 = ((fsa) this).field_mb >> 275325672;
                var2_int = -((((fsa) this).field_g >> 518666536) * var4) + var3 * (((fsa) this).field_w >> 1470272296);
                var2_int = var2_int + ((fsa) this).field_X.d(3);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = var2_int;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.J(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private final void a(uw param0, int param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
              L5: {
                L6: {
                  if (var3 == null) {
                    break L6;
                  } else {
                    var3.a(param0, 120);
                    var3 = (dg) (Object) ((fsa) this).field_O.e(125);
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("fsa.GD(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        nv var3 = null;
        fsa var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.v(-1332);
            var3 = (nv) (Object) ((fsa) this).field_u.f(param0 ^ -437453416);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (null == var3) {
                        break L5;
                      } else {
                        ((fsa) this).a((gr) (Object) var3, (byte) 124, rm.field_a.a((gr) (Object) var3, (gma) this, -126));
                        var3 = (nv) (Object) ((fsa) this).field_u.e(107);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (param1) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  var3_ref = (fsa) (Object) ((fsa) this).field_K.f(param0 ^ -437453416);
                  L6: while (true) {
                    if (var3_ref == null) {
                      break L3;
                    } else {
                      var3_ref.c(437453352, true);
                      var3_ref = (fsa) (Object) ((fsa) this).field_K.e(117);
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param0 == 437453352) {
                  break L2;
                } else {
                  int discarded$2 = ((fsa) this).Q(108);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.WF(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean j(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -102) {
              stackOut_3_0 = ((fsa) this).n((byte) 120);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.DE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_W[param2] = param1;
              if (((fsa) this).field_X != null) {
                ((fsa) this).field_X.a(26492, param1, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 26492) {
                break L2;
              } else {
                ((fsa) this).a(-7, (uw) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fsa.JD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int I(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -16423) {
                break L1;
              } else {
                ((fsa) this).a(false, -102);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_lb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.VB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void o(int param0, int param1) {
        ((fsa) this).field_y.field_u.a((ffa) this, (byte) 112);
        ((fsa) this).field_Z = ((fsa) this).field_Z + param0;
        ((fsa) this).field_mb = ((fsa) this).field_mb + param0;
        if (param1 <= 78) {
            return;
        }
        try {
            ((fsa) this).field_y.field_u.b((ffa) this, 7073);
            this.N(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.QE(" + param0 + ',' + param1 + ')');
        }
    }

    public final ew h(byte param0) {
        RuntimeException var2 = null;
        fsa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 105) {
                break L1;
              } else {
                ((fsa) this).field_j = 102;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).r(0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.I(" + param0 + ')');
        }
        return (ew) (Object) stackIn_4_0;
    }

    final int O(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 7) {
                break L1;
              } else {
                ((fsa) this).f(54, -8);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_J;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.NF(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == 31749) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).s(5);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_o.a(param0, 14530);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.KE(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean d(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                ((fsa) this).m(-103, -125);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_C;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.LB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void l(int param0, int param1) {
        try {
            ((fsa) this).field_H = param0;
            if (param1 != 146366800) {
                ((fsa) this).field_J = -18;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.TB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fsa.UB(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(dg param0, int param1) {
        gr var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                        break L2;
                      }
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            }
            var3_int = 89 / ((param1 - -65) / 41);
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fsa.LD(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final void e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 15) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).a(true);
                break L1;
              }
            }
            ((fsa) this).field_z = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.KB(" + param0 + ',' + param1 + ')');
        }
    }

    final int M(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = ((fsa) this).field_ib;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -91;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.WA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void B(int param0) {
        RuntimeException runtimeException = null;
        fsa var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fsa) this).field_y.field_u.a((ffa) this, (byte) 112);
              if (((fsa) this).field_y.j((byte) -74) == null) {
                break L1;
              } else {
                this.a(((fsa) this).field_y.j((byte) -96), param0 ^ -9320);
                break L1;
              }
            }
            if (param0 == -165) {
              var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      var2.B(-165);
                      var2 = (fsa) (Object) ((fsa) this).field_K.e(110);
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.ME(" + param0 + ')');
        }
    }

    final void g(int param0, int param1) {
        try {
            ((fsa) this).field_L = param1;
            if (param0 < 99) {
                fsa.a(-31, (kea) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.AA(" + param0 + ',' + param1 + ')');
        }
    }

    public final gpa n(int param0) {
        RuntimeException var2 = null;
        gpa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        gpa stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 31974) {
                break L1;
              } else {
                ((fsa) this).a(-74, (byte) 85);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_i;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void D(byte param0) {
        uja var2 = null;
        RuntimeException var2_ref = null;
        fsa var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.u((byte) 116);
              ((fsa) this).field_n = ((fsa) this).field_E;
              if (param0 == 118) {
                break L1;
              } else {
                ((fsa) this).field_i = null;
                break L1;
              }
            }
            ((fsa) this).field_lb = ((fsa) this).field_U;
            var2 = new uja(((fsa) this).field_K);
            var3 = (fsa) (Object) var2.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var3.D((byte) 118);
                    var3 = (fsa) (Object) var2.a(-1);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "fsa.GC(" + param0 + ')');
        }
    }

    public final on c(boolean param0) {
        RuntimeException var2 = null;
        on stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        on stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((fsa) this).field_eb = false;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_fb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.BA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void m(int param0, int param1) {
        try {
            ((fsa) this).field_Z = param1;
            if (param0 != 1) {
                ((fsa) this).a(120, (iq) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.EF(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean w(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -108) {
              L1: {
                L2: {
                  if (((fsa) this).field_jb) {
                    break L2;
                  } else {
                    L3: {
                      if (null == ((fsa) this).field_X) {
                        break L3;
                      } else {
                        if (!((fsa) this).field_X.w((byte) -113)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  }
                }
                stackOut_10_0 = 1;
                stackIn_13_0 = stackOut_10_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.ID(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -74)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (!this.b(param0.field_j, (byte) 120)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
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
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  var5 = 0;
                  var6 = new uja(((fsa) this).field_u);
                  var7 = (nv) (Object) var6.a(true);
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (null == var7) {
                          break L4;
                        } else {
                          stackOut_21_0 = var5 + var7.a(25940, param1, param0);
                          stackIn_24_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            var5 = stackIn_22_0;
                            var7 = (nv) (Object) var6.a(-1);
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      stackOut_23_0 = var5;
                      stackIn_24_0 = stackOut_23_0;
                      break L3;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("fsa.SD(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          L6: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ')');
        }
        return stackIn_24_0;
    }

    public final int e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = ((fsa) this).field_mb;
              if (param0 == 9648) {
                break L1;
              } else {
                ((fsa) this).c(-71, false);
                break L1;
              }
            }
            L2: {
              if (((fsa) this).field_X != null) {
                var3 = ((fsa) this).field_Z >> 1207747176;
                var4 = var2_int >> -499582456;
                var2_int = (((fsa) this).field_w >> 437453352) * var4 - -(var3 * (((fsa) this).field_g >> 1024644840));
                var2_int = var2_int + ((fsa) this).field_X.e(param0);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = var2_int;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.RA(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        uja var8 = null;
        nv var9 = null;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -119)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (!this.b(param0.field_j, (byte) 125)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (!((fsa) this).a((byte) 110, param4, param2, param5, param1)) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var7_int = param3;
                  var8 = new uja(((fsa) this).field_u);
                  var9 = (nv) (Object) var8.a(true);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var9 == null) {
                          break L3;
                        } else {
                          stackOut_18_0 = var7_int + var9.a(param5, param1, param0, param2, (byte) 8, param4);
                          stackIn_21_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (var10 != 0) {
                            break L2;
                          } else {
                            var7_int = stackIn_19_0;
                            var9 = (nv) (Object) var8.a(-1);
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      stackOut_20_0 = var7_int;
                      stackIn_21_0 = stackOut_20_0;
                      break L2;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("fsa.WC(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_21_0;
    }

    final hca H(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hca stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        hca stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 68 % ((-84 - param0) / 32);
            stackOut_0_0 = ((fsa) this).field_y.u(-53);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.FC(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final void b(byte param0, boolean param1) {
        try {
            ((fsa) this).field_r = param1;
            if (param0 != 17) {
                ((fsa) this).field_lb = 34;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.VD(" + param0 + ',' + param1 + ')');
        }
    }

    fsa(la param0, kh param1, boolean param2) {
        this(param0, (fsa) null, param1, param2);
    }

    final int s(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 25745) {
                break L1;
              } else {
                ((fsa) this).field_C = true;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_Z;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.JB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void n(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((fsa) this).field_G > param0) {
                break L1;
              } else {
                ((fsa) this).field_G = param0;
                if (!TombRacer.field_G) {
                  L2: {
                    if (param1 < -103) {
                      break L2;
                    } else {
                      fsa.K(-88);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.KC(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean J(int param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 35) {
                break L1;
              } else {
                ((fsa) this).field_lb = 122;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((fsa) this).field_K.d((byte) 14)) {
                  break L3;
                } else {
                  if (!((fsa) this).field_u.d((byte) 14)) {
                    break L3;
                  } else {
                    if (!((fsa) this).field_B.d((byte) 14)) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_13_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.JF(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void z(int param0) {
        RuntimeException runtimeException = null;
        fsa var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == ((fsa) this).field_y) {
              return;
            } else {
              L1: {
                ((fsa) this).field_y.field_u.a((ffa) this, -78);
                ((fsa) this).field_y.field_u.b((ffa) this, param0 + 7072);
                var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                if (param0 == 1) {
                  break L1;
                } else {
                  ((fsa) this).field_j = 74;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var2) {
                      break L4;
                    } else {
                      var2.z(param0);
                      var2 = (fsa) (Object) ((fsa) this).field_K.e(122);
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.GF(" + param0 + ')');
        }
    }

    final void u(int param0) {
        RuntimeException var2 = null;
        fsa var2_ref = null;
        wda var2_ref2 = null;
        nv var2_ref3 = null;
        dg var2_ref4 = null;
        int var3 = 0;
        fsa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        fsa stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        wda stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        nv stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        fsa stackIn_39_0 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        wda stackOut_18_0 = null;
        vg stackOut_20_0 = null;
        nv stackOut_23_0 = null;
        vg stackOut_25_0 = null;
        Object stackOut_28_0 = null;
        fsa stackOut_38_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((fsa) this).field_jb) {
                ((fsa) this).field_x = true;
                break L1;
              } else {
                break L1;
              }
            }
            var2_ref = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_ref == null) {
                    break L4;
                  } else {
                    stackOut_7_0 = (fsa) var2_ref;
                    stackOut_7_1 = -127;
                    stackIn_16_0 = stackOut_7_0;
                    stackIn_16_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((fsa) (Object) stackIn_8_0).w((byte) stackIn_8_1)) {
                          var2_ref.B(param0 ^ -165);
                          var2_ref.p(48);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var2_ref = (fsa) (Object) ((fsa) this).field_K.e(118);
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((fsa) this).x((byte) -60);
                stackOut_15_0 = this;
                stackOut_15_1 = param0 ^ param0;
                stackIn_16_0 = (fsa) (Object) stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L3;
              }
              this.N(stackIn_16_1);
              var2_ref2 = (wda) (Object) ((fsa) this).field_B.f(param0 + -80);
              L6: while (true) {
                L7: {
                  L8: {
                    if (var2_ref2 == null) {
                      break L8;
                    } else {
                      var2_ref2.a(88, (fsa) this);
                      stackOut_18_0 = (wda) (Object) ((fsa) this).field_B.e(120);
                      stackIn_21_0 = (Object) (Object) stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var3 != 0) {
                        break L7;
                      } else {
                        var2_ref2 = stackIn_19_0;
                        if (var3 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = ((fsa) this).field_u.f(-80);
                  stackIn_21_0 = (Object) (Object) stackOut_20_0;
                  break L7;
                }
                var2_ref3 = (nv) (Object) stackIn_21_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var2_ref3 == null) {
                        break L11;
                      } else {
                        var2_ref3.a(true, (fsa) this);
                        var2_ref3.n((byte) 86);
                        stackOut_23_0 = (nv) (Object) ((fsa) this).field_u.e(122);
                        stackIn_26_0 = (Object) (Object) stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var3 != 0) {
                          break L10;
                        } else {
                          var2_ref3 = stackIn_24_0;
                          if (var3 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_25_0 = ((fsa) this).field_O.f(-80);
                    stackIn_26_0 = (Object) (Object) stackOut_25_0;
                    break L10;
                  }
                  var2_ref4 = (dg) (Object) stackIn_26_0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (null == var2_ref4) {
                          break L14;
                        } else {
                          stackOut_28_0 = this;
                          stackIn_39_0 = (fsa) (Object) stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var3 != 0) {
                            break L13;
                          } else {
                            L15: {
                              L16: {
                                if (this.a(var2_ref4, param0 ^ -113)) {
                                  break L16;
                                } else {
                                  var2_ref4.p(91);
                                  if (var3 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var2_ref4.a(var2_ref4.c(-118), (gma) this, (byte) 36);
                              break L15;
                            }
                            var2_ref4 = (dg) (Object) ((fsa) this).field_O.e(124);
                            if (var3 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      stackOut_38_0 = (fsa) (Object) ((fsa) this).field_K.f(-80);
                      stackIn_39_0 = stackOut_38_0;
                      break L13;
                    }
                    var2_ref = stackIn_39_0;
                    L17: while (true) {
                      L18: {
                        L19: {
                          if (null == var2_ref) {
                            break L19;
                          } else {
                            var2_ref.field_X = (fsa) this;
                            var2_ref.u(param0);
                            var2_ref = (fsa) (Object) ((fsa) this).field_K.e(126);
                            if (var3 != 0) {
                              break L18;
                            } else {
                              if (var3 == 0) {
                                continue L17;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        break L18;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.RD(" + param0 + ')');
        }
    }

    final qea y(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        qea stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qea stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 1751085328) {
              stackOut_3_0 = ((fsa) this).field_y.q(param0 + -1751085231);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qea) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.QA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean d(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 50) {
              if (!((fsa) this).field_M) {
                L1: {
                  if (!param1) {
                    break L1;
                  } else {
                    if (null != ((fsa) this).field_X) {
                      stackOut_12_0 = ((fsa) this).field_X.d(50, param1);
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.DC(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final int P(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                fsa.K(-55);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_db - -((fsa) this).g((byte) 115);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.UE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final String E(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((fsa) this).field_K.d((byte) 14)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!((fsa) this).field_u.d((byte) 14)) {
                        break L4;
                      } else {
                        if (((fsa) this).field_B.d((byte) 14)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = "Regular Trap";
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  var2 = "Empty Trap";
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = "Compound Trap";
              break L1;
            }
            L5: {
              var2 = var2 + " [" + ((fsa) this).field_i.field_d + "]";
              if (param0 > 108) {
                break L5;
              } else {
                ((fsa) this).field_db = -28;
                break L5;
              }
            }
            stackOut_14_0 = (String) var2;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "fsa.VF(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    private final gr b(int param0, int param1) {
        ub var3 = null;
        RuntimeException var3_ref = null;
        gr stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        gr stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              var3 = this.k((byte) -30);
              if (param1 < 0) {
                break L1;
              } else {
                if (param1 < var3.a(-1)) {
                  stackOut_6_0 = (gr) var3.a(true, param1);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 3) {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              return (gr) (Object) stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "fsa.TD(" + param0 + ',' + param1 + ')');
        }
        return (gr) (Object) stackIn_12_0;
    }

    public final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((fsa) this).a(-86, (gma) null, (ffa) null, -88);
                break L1;
              }
            }
            L2: {
              if (null == ((fsa) this).field_X) {
                break L2;
              } else {
                if (((fsa) this).field_X.b(param0)) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (this.f(false)) {
                  break L4;
                } else {
                  if (((fsa) this).field_B.d((byte) 14)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_18_0 = stackOut_15_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.E(" + param0 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(int param0, boolean param1) {
        try {
            ((fsa) this).field_p = true;
            int var3_int = 18 / ((-5 - param0) / 36);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.IF(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(iq param0, int param1) {
        RuntimeException runtimeException = null;
        nv var3 = null;
        fsa var3_ref = null;
        int var4 = 0;
        nv stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        nv stackOut_3_0 = null;
        vg stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (nv) (Object) ((fsa) this).field_u.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.b(123, param0);
                    stackOut_3_0 = (nv) (Object) ((fsa) this).field_u.e(param1 + 10546);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = ((fsa) this).field_K.f(-80);
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var3_ref = (fsa) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var3_ref) {
                      break L6;
                    } else {
                      var3_ref.a(param0, -10425);
                      var3_ref = (fsa) (Object) ((fsa) this).field_K.e(123);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param1 == -10425) {
                    break L5;
                  } else {
                    boolean discarded$3 = this.B((byte) 57);
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("fsa.SB(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(uw param0, boolean param1) {
        RuntimeException runtimeException = null;
        dg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
            if (param1) {
              var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var3) {
                      break L5;
                    } else {
                      var3.b(0, param0);
                      var3 = (dg) (Object) ((fsa) this).field_O.e(111);
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("fsa.VE(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void F(byte param0) {
        RuntimeException runtimeException = null;
        uja var2 = null;
        fsa var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.u((byte) 116);
            var2 = new uja(((fsa) this).field_K);
            var3 = (fsa) (Object) var2.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.F((byte) -102);
                    var3 = (fsa) (Object) var2.a(-1);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -90) {
                  break L2;
                } else {
                  ((fsa) this).field_mb = 92;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.HD(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        ((fsa) this).field_mb = param1;
        if (param0 != 437453352) {
            return;
        }
        try {
            ((fsa) this).field_Z = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.OF(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void m(int param0) {
        RuntimeException runtimeException = null;
        fsa var2 = null;
        wda var2_ref = null;
        nv var2_ref2 = null;
        int var2_int = 0;
        int var3 = 0;
        fsa stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        wda stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        vg stackOut_5_0 = null;
        wda stackOut_8_0 = null;
        vg stackOut_10_0 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    var2.m(-93);
                    stackOut_3_0 = (fsa) (Object) ((fsa) this).field_K.e(123);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = ((fsa) this).field_B.f(-80);
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var2_ref = (wda) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var2_ref) {
                      break L6;
                    } else {
                      var2_ref.m(127);
                      stackOut_8_0 = (wda) (Object) ((fsa) this).field_B.e(109);
                      stackIn_11_0 = (Object) (Object) stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        var2_ref = stackIn_9_0;
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = ((fsa) this).field_u.f(-80);
                  stackIn_11_0 = (Object) (Object) stackOut_10_0;
                  break L5;
                }
                var2_ref2 = (nv) (Object) stackIn_11_0;
                L7: while (true) {
                  L8: {
                    if (null == var2_ref2) {
                      break L8;
                    } else {
                      var2_ref2.m(-109);
                      var2_ref2 = (nv) (Object) ((fsa) this).field_u.e(112);
                      if (var3 == 0) {
                        continue L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var2_int = 14 / ((28 - param0) / 49);
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.QB(" + param0 + ')');
        }
    }

    final void d(int param0, byte param1) {
        RuntimeException runtimeException = null;
        fsa var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_10_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3.a(param0, 31749);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          var3.v((byte) 109);
                          var3.p(39);
                          break L4;
                        }
                      }
                      var3 = (fsa) (Object) ((fsa) this).field_K.e(119);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = param1;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L5: {
                if (stackIn_11_0 < -7) {
                  break L5;
                } else {
                  ((fsa) this).a(true, false, (ui) null, (ui) null);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.FF(" + param0 + ',' + param1 + ')');
        }
    }

    private final void N(int param0) {
        RuntimeException runtimeException = null;
        fsa var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            ((fsa) this).field_J = ((fsa) this).s(25745);
            ((fsa) this).field_j = ((fsa) this).e(false);
            if (param0 == 0) {
              ((fsa) this).field_ib = ((fsa) this).q((byte) -80);
              var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      var2.N(0);
                      var2 = (fsa) (Object) ((fsa) this).field_K.e(126);
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.u((byte) 116);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.MA(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -12) {
            return;
        }
        try {
            this.b(0, param1, 127, ((fsa) this).field_L, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        nv var9_ref = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 55) {
              if (this.D(-107)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (!this.a(param1, (byte) -72)) {
                  if (~param7 >= ~((fsa) this).field_f) {
                    if (!((fsa) this).a((byte) 110, param4, param6, param0, param3)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      var9_ref = (nv) (Object) ((fsa) this).field_u.f(-80);
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (var9_ref == null) {
                              break L3;
                            } else {
                              stackOut_22_0 = var9_ref.a(param0, param3, 1, param6, param4, param7, param5);
                              stackIn_30_0 = stackOut_22_0 ? 1 : 0;
                              stackIn_23_0 = stackOut_22_0;
                              if (var10 != 0) {
                                break L2;
                              } else {
                                if (!stackIn_23_0) {
                                  var9_ref = (nv) (Object) ((fsa) this).field_u.e(126);
                                  if (var10 == 0) {
                                    continue L1;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  stackOut_26_0 = 1;
                                  stackIn_27_0 = stackOut_26_0;
                                  return stackIn_27_0 != 0;
                                }
                              }
                            }
                          }
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L2;
                        }
                        break L0;
                      }
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
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
          L4: {
            var9 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var9;
            stackOut_31_1 = new StringBuilder().append("fsa.IC(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L4;
            }
          }
          L5: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param5 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L5;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_30_0 != 0;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        nv var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_7_0 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.j(param4, 8192)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (((fsa) this).a((byte) 110, param2, param3, param5, param1)) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    ((fsa) this).field_Q = true;
                    break L1;
                  }
                }
                var7_int = 0;
                var8 = (nv) (Object) ((fsa) this).field_u.f(-80);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var8) {
                        break L4;
                      } else {
                        stackOut_14_0 = var8.a(-97);
                        stackIn_22_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_15_0) {
                              var7_int = var7_int + var8.a(param1, param5, param2, param4, (byte) 88, param3);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var8 = (nv) (Object) ((fsa) this).field_u.e(126);
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_21_0 = var7_int;
                    stackIn_22_0 = stackOut_21_0;
                    break L3;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "fsa.KD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_22_0;
    }

    final void c(int param0, byte param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fsa) this).x(param1 ^ 15463).m(9262).a((fsa) this, param1 ^ 8);
              if (param1 == 9) {
                break L1;
              } else {
                ((fsa) this).field_D = true;
                break L1;
              }
            }
            this.t(param1 ^ 2097161);
            var3 = (dg) (Object) ((fsa) this).field_O.f(param1 + -89);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var3.a((byte) -91, param0);
                    var3 = (dg) (Object) ((fsa) this).field_O.e(118);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((fsa) this).v((byte) 109);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "fsa.OB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = -63 % ((param0 - -61) / 41);
              ((fsa) this).field_h[param2] = param1;
              if (((fsa) this).field_X != null) {
                ((fsa) this).field_X.a((byte) 102, param1, param2);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.ND(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final gpa i(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        gpa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        gpa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 84) {
              stackOut_3_0 = ((fsa) this).field_Y;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gpa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.VA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0, int param1, int param2) {
        try {
            ((fsa) this).field_y.field_u.a((ffa) this, (byte) 115);
            ((fsa) this).b(437453352, param0, param1);
            this.F((byte) -108);
            ((fsa) this).field_y.field_u.b((ffa) this, param2 ^ 7075);
            if (param2 != 2) {
                ((fsa) this).field_w = -48;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.DD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        dg var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (dg) (Object) ((fsa) this).field_O.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.a(param1, (byte) 122);
                    var3 = (dg) (Object) ((fsa) this).field_O.e(param0 ^ 102);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == 10) {
                    break L4;
                  } else {
                    ((fsa) this).field_i = null;
                    break L4;
                  }
                }
                ((fsa) this).field_db = ((fsa) this).field_db + param1;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.EC(" + param0 + ',' + param1 + ')');
        }
    }

    public static void K(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8424) {
                break L1;
              } else {
                field_m = -93;
                break L1;
              }
            }
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "fsa.T(" + param0 + ')');
        }
    }

    public final lj a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        lj stackIn_5_0 = null;
        lj stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_6_0 = null;
        lj stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 28672) {
              if (!param2) {
                stackOut_6_0 = ((fsa) this).field_y.a(param0, param1, param2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((fsa) this).a(param2, param1, (byte) -26);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fsa.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final fsa a(int param0, la param1, boolean param2) {
        kh var4 = null;
        RuntimeException var4_ref = null;
        fsa var5 = null;
        Object stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                  if (~((fsa) this).field_I < ~((fsa) this).field_R) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fsa.OA(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void L(int param0) {
        try {
            ((fsa) this).field_D = true;
            int var2_int = 66 % ((param0 - 60) / 58);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.CD(" + param0 + ')');
        }
    }

    final void a(la param0, boolean param1) {
        RuntimeException var3 = null;
        wda var3_ref = null;
        nv var3_ref2 = null;
        dg var3_ref3 = null;
        fsa var3_ref4 = null;
        int var4 = 0;
        wda stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        nv stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        dg stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        wda stackOut_18_0 = null;
        vg stackOut_20_0 = null;
        nv stackOut_23_0 = null;
        vg stackOut_25_0 = null;
        dg stackOut_28_0 = null;
        vg stackOut_30_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
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
              L3: {
                if (!((fsa) this).n((byte) 122)) {
                  break L3;
                } else {
                  ((fsa) this).field_Z = param0.a(((fsa) this).field_Z, (byte) 71);
                  ((fsa) this).field_s = param0.a(((fsa) this).field_s, (byte) 71);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((fsa) this).field_s = -((fsa) this).field_s;
              ((fsa) this).field_Z = -((fsa) this).field_Z;
              break L2;
            }
            L4: {
              L5: {
                ((fsa) this).field_lb = param0.a(((fsa) this).field_lb, (byte) 71);
                ((fsa) this).field_U = param0.a(((fsa) this).field_U, (byte) 71);
                if (((fsa) this).n((byte) 108)) {
                  break L5;
                } else {
                  ((fsa) this).field_J = -((fsa) this).field_J;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ((fsa) this).field_J = param0.a(((fsa) this).field_J, (byte) 71);
              break L4;
            }
            ((fsa) this).field_ib = dfa.a(-((fsa) this).field_ib, 8192, -35);
            ((fsa) this).field_F = dfa.a(-((fsa) this).field_F, 8192, -97);
            param0.field_u.b((ffa) this, 7073);
            var3_ref = (wda) (Object) ((fsa) this).field_B.f(-80);
            L6: while (true) {
              L7: {
                L8: {
                  if (null == var3_ref) {
                    break L8;
                  } else {
                    var3_ref.c((byte) -122);
                    stackOut_18_0 = (wda) (Object) ((fsa) this).field_B.e(114);
                    stackIn_21_0 = (Object) (Object) stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var4 != 0) {
                      break L7;
                    } else {
                      var3_ref = stackIn_19_0;
                      if (var4 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                stackOut_20_0 = ((fsa) this).field_u.f(-80);
                stackIn_21_0 = (Object) (Object) stackOut_20_0;
                break L7;
              }
              var3_ref2 = (nv) (Object) stackIn_21_0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var3_ref2 == null) {
                      break L11;
                    } else {
                      var3_ref2.h(28701);
                      stackOut_23_0 = (nv) (Object) ((fsa) this).field_u.e(116);
                      stackIn_26_0 = (Object) (Object) stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var4 != 0) {
                        break L10;
                      } else {
                        var3_ref2 = stackIn_24_0;
                        if (var4 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = ((fsa) this).field_O.f(-80);
                  stackIn_26_0 = (Object) (Object) stackOut_25_0;
                  break L10;
                }
                var3_ref3 = (dg) (Object) stackIn_26_0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (null == var3_ref3) {
                        break L14;
                      } else {
                        var3_ref3.h(65);
                        stackOut_28_0 = (dg) (Object) ((fsa) this).field_O.e(110);
                        stackIn_31_0 = (Object) (Object) stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var4 != 0) {
                          break L13;
                        } else {
                          var3_ref3 = stackIn_29_0;
                          if (var4 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = ((fsa) this).field_K.f(-80);
                    stackIn_31_0 = (Object) (Object) stackOut_30_0;
                    break L13;
                  }
                  var3_ref4 = (fsa) (Object) stackIn_31_0;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (var3_ref4 == null) {
                          break L17;
                        } else {
                          var3_ref4.a(param0, false);
                          var3_ref4 = (fsa) (Object) ((fsa) this).field_K.e(121);
                          if (var4 != 0) {
                            break L16;
                          } else {
                            if (var4 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      break L16;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("fsa.CC(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L18;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L18;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ')');
        }
    }

    final boolean n(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 105) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).q((byte) -1);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_cb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.QC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void F(int param0) {
        fsa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((fsa) this).field_y.j((byte) 104) != null) {
                this.a(((fsa) this).field_y.j((byte) 49), true);
                break L1;
              } else {
                break L1;
              }
            }
            var2 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    var2.F(127);
                    var2 = (fsa) (Object) ((fsa) this).field_K.e(108);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((fsa) this).u(0);
                this.u((byte) 116);
                break L3;
              }
              L5: {
                if (param0 >= 96) {
                  break L5;
                } else {
                  ((fsa) this).c(-88, 5);
                  break L5;
                }
              }
              ((fsa) this).z(1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "fsa.JA(" + param0 + ')');
        }
    }

    private final boolean C(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -40) {
                break L1;
              } else {
                hca discarded$2 = ((fsa) this).H(37);
                break L1;
              }
            }
            L2: {
              if (null == ((fsa) this).field_X) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.NA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        uja var4 = null;
        fsa var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ((fsa) this).field_V = param0;
                if (!param2) {
                  break L2;
                } else {
                  var4 = new uja(((fsa) this).field_K);
                  var5 = (fsa) (Object) var4.a(true);
                  L3: while (true) {
                    if (null == var5) {
                      break L2;
                    } else {
                      var5.a(param0, (byte) -12, param2);
                      var5 = (fsa) (Object) var4.a(param1 ^ 11);
                      if (var6 != 0) {
                        break L1;
                      } else {
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == -12) {
                break L1;
              } else {
                ((fsa) this).field_I = -21;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.PF(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(wda param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(gma param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if ((Object) (Object) param0 != this) {
              if (((fsa) this).field_x) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
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
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("fsa.AD(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void b(byte param0, int param1) {
        try {
            int var3_int = -10 / ((-12 - param0) / 42);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.GE(" + param0 + ',' + param1 + ')');
        }
    }

    final fsa r(int param0) {
        RuntimeException var2 = null;
        fsa stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        fsa stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((fsa) this).field_f = 55;
                break L1;
              }
            }
            if (((fsa) this).field_X == null) {
              stackOut_6_0 = this;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = ((fsa) this).field_X.r(0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.IE(" + param0 + ')');
        }
        return (fsa) this;
    }

    fsa(la param0, boolean param1) {
        this(param0, 0, 0, 32, 32, 0, param1);
    }

    public final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -86) {
                break L1;
              } else {
                ((fsa) this).a(65, 113, 36);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).g((byte) 115);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.O(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!((fsa) this).field_C) {
              L1: {
                if (param0 == 110) {
                  break L1;
                } else {
                  ((fsa) this).a(false, false, (ui) null, (ui) null);
                  break L1;
                }
              }
              stackOut_6_0 = io.a(((fsa) this).c(-72), param1, (byte) -89, ((fsa) this).a((byte) 55), param2, ((fsa) this).e(9648), param3, param4, ((fsa) this).d(3));
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "fsa.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_7_0;
    }

    final int r(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -95) {
                break L1;
              } else {
                ((fsa) this).z(-122);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).d(3) - ((fsa) this).field_t / 2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.VC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean C(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -40) {
              stackOut_3_0 = ((fsa) this).field_P;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.PD(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              if (!((fsa) this).w((byte) -117)) {
                break L2;
              } else {
                param1.d((byte) -74, true);
                break L2;
              }
            }
            param1.F(98);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fsa.UC(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final int e(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = ((fsa) this).field_mb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 31;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.KF(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 69) {
                break L1;
              } else {
                ((fsa) this).d(-37, 91);
                break L1;
              }
            }
            ((fsa) this).field_F = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.NE(" + param0 + ',' + param1 + ')');
        }
    }

    final dt x(int param0) {
        RuntimeException var2 = null;
        dt stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        dt stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 15470) {
                break L1;
              } else {
                gpa discarded$2 = ((fsa) this).i((byte) -88);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_y.a(param0 ^ -1553485410);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.FA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int w(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 17825792) {
                break L1;
              } else {
                ((fsa) this).field_k = null;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_z;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.JC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean f(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((fsa) this).m(-111);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_v;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.AC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_k[param2] = param0;
              if (((fsa) this).field_X != null) {
                ((fsa) this).field_X.a(param0, (byte) -116, param2);
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = -79 / ((param1 - 40) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "fsa.NC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void v(byte param0) {
        RuntimeException runtimeException = null;
        nv var2 = null;
        fsa var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((fsa) this).field_C) {
              return;
            } else {
              ((fsa) this).field_C = true;
              var2 = (nv) (Object) ((fsa) this).field_u.f(-80);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      var2.c(false);
                      var2 = (nv) (Object) ((fsa) this).field_u.e(120);
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == 109) {
                    break L2;
                  } else {
                    boolean discarded$2 = ((fsa) this).a((gma) null, -13);
                    break L2;
                  }
                }
                var2_ref = (fsa) (Object) ((fsa) this).field_K.f(-80);
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var2_ref == null) {
                        break L6;
                      } else {
                        var2_ref.v((byte) 109);
                        var2_ref = (fsa) (Object) ((fsa) this).field_K.e(111);
                        if (var3 != 0) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ((fsa) this).B(-165);
                    this.v(-1332);
                    break L5;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "fsa.LF(" + param0 + ')');
        }
    }

    final boolean p(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 < -101) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).k(-114);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_Q;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.QF(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final int a(up param0, int param1, pc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -116)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (this.b(param0.field_j, (byte) 125)) {
                  break L1;
                } else {
                  if (!((fsa) this).field_T) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              var4_int = eha.a(((fsa) this).field_t, param1, ((fsa) this).e(param1 + 9636), ((fsa) this).field_gb, param2, ((fsa) this).d(param1 ^ 15), 2);
              if (var4_int != -1) {
                var5 = 0;
                var6 = new uja(((fsa) this).field_u);
                var7 = (nv) (Object) var6.a(true);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var7 == null) {
                        break L4;
                      } else {
                        stackOut_19_0 = var5 + var7.a(-119, param0, param2);
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          var5 = stackIn_20_0;
                          var7 = (nv) (Object) var6.a(-1);
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_21_0 = var5;
                    stackIn_22_0 = stackOut_21_0;
                    break L3;
                  }
                  break L0;
                }
              } else {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("fsa.ED(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_22_0;
    }

    final void a(int param0, gma param1, ffa param2, int param3) {
        nv var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                  L3: {
                    L4: {
                      if (null == var5) {
                        break L4;
                      } else {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (!var5.a(-115)) {
                              break L5;
                            } else {
                              var5.a(param2, (byte) 24, param1, param3);
                              break L5;
                            }
                          }
                          var5 = (nv) (Object) ((fsa) this).field_u.e(113);
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("fsa.GB(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ')');
        }
    }

    private final boolean d(boolean param0, int param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        fsa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = new uja(((fsa) this).field_K);
            if (param1 == -3) {
              var4 = (fsa) (Object) var3.a(true);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = param0;
                      stackIn_25_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              if (!stackIn_7_0) {
                                break L6;
                              } else {
                                if (((fsa) this).field_L != 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var6 = 0;
                            var5 = 0;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          var5 = var4.d(3) - var4.i(122);
                          var6 = var4.e(9648) + -var4.k(-21185);
                          break L4;
                        }
                        L7: {
                          if (var4.a(var5, var6, -4648, ((fsa) this).field_L, 0) == 2) {
                            break L7;
                          } else {
                            if (var4.d(param0, param1)) {
                              break L7;
                            } else {
                              var4 = (fsa) (Object) var3.a(-1);
                              if (var7 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref, "fsa.MF(" + param0 + ',' + param1 + ')');
        }
        return stackIn_25_0 != 0;
    }

    public final boolean h(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 18407) {
                break L1;
              } else {
                ((fsa) this).field_z = 79;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_C;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.PA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final ub k(byte param0) {
        ub var2 = null;
        RuntimeException var2_ref = null;
        wda var3 = null;
        nv var3_ref = null;
        int var4 = 0;
        wda stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        ub stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        wda stackOut_3_0 = null;
        vg stackOut_5_0 = null;
        ub stackOut_15_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new ub();
            var3 = (wda) (Object) ((fsa) this).field_B.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var2.a((byte) -37, (Object) (Object) var3);
                    stackOut_3_0 = (wda) (Object) ((fsa) this).field_B.e(param0 ^ -110);
                    stackIn_6_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = ((fsa) this).field_u.f(param0 + -50);
                stackIn_6_0 = (Object) (Object) stackOut_5_0;
                break L2;
              }
              var3_ref = (nv) (Object) stackIn_6_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3_ref == null) {
                      break L6;
                    } else {
                      var2.a((byte) -37, (Object) (Object) var3_ref);
                      var3_ref = (nv) (Object) ((fsa) this).field_u.e(117);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 == -30) {
                    break L5;
                  } else {
                    boolean discarded$2 = ((fsa) this).w((byte) 21);
                    break L5;
                  }
                }
                stackOut_15_0 = (ub) var2;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "fsa.LE(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    private final boolean k(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((fsa) this).field_db = -92;
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_h[param0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.NB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final void f(int param0) {
        try {
            if (param0 != -4366) {
                ((fsa) this).field_J = 18;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.N(" + param0 + ')');
        }
    }

    public final int k(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -21185) {
              stackOut_3_0 = ((fsa) this).field_E;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -45;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.U(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void c(byte param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 46) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            ((fsa) this).field_cb = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.LC(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException var3 = null;
            RuntimeException var3_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      Thread.sleep(param1);
                      if (param0 == 9) {
                        break L2;
                      } else {
                        field_q = null;
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = (InterruptedException) (Object) decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw tba.a((Throwable) (Object) var3_ref, "fsa.OC(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 == -4648) {
                break L1;
              } else {
                ((fsa) this).field_F = 108;
                break L1;
              }
            }
            if (((fsa) this).field_y == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (((fsa) this).field_V == 0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L2: {
                  if (param3 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != 0) {
                        break L3;
                      } else {
                        if (0 != param1) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_27_0 = ((fsa) this).field_y.a((ffa) this, (gma) this, ((fsa) this).field_V, ((fsa) this).field_t, param1, param2 ^ -4652, ((fsa) this).field_gb, ((fsa) this).d(param2 + 4651), param3, param0, ((fsa) this).e(9648), param4, true);
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  }
                }
                L4: {
                  if (((fsa) this).field_y.a((ffa) this, ((fsa) this).field_gb, 2, ((fsa) this).field_V, ((fsa) this).e(param2 + 14296), ((fsa) this).d(3), true, (gma) this, ((fsa) this).field_t)) {
                    stackOut_25_0 = 2;
                    stackIn_26_0 = stackOut_25_0;
                    break L4;
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_26_0 = stackOut_23_0;
                    break L4;
                  }
                }
                return stackIn_26_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "fsa.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_28_0;
    }

    final void G(int param0) {
        if (param0 < 118) {
            return;
        }
        try {
            ((fsa) this).field_D = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fsa.DF(" + param0 + ')');
        }
    }

    final void a(ir param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null != ((fsa) this).field_X) {
                param0.field_f = param0.field_f - ((fsa) this).field_X.d(3);
                param0.field_d = param0.field_d - ((fsa) this).field_X.e(9648);
                var3_int = param0.field_f >> -2132007288;
                var4 = param0.field_d >> -804509720;
                param0.field_d = var4 * (((fsa) this).field_w >> 577543112) + -(var3_int * (((fsa) this).field_g >> -1427410488));
                param0.field_f = var3_int * (((fsa) this).field_w >> -252788888) + (((fsa) this).field_g >> -1625835416) * var4;
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fsa.CA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final boolean d(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                if (((fsa) this).field_K.d((byte) 14)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.RF(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean A(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 12) {
              stackOut_3_0 = ((fsa) this).field_y.o((byte) -82);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.FE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, ir param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 54) {
                break L1;
              } else {
                int discarded$2 = ((fsa) this).r((byte) 1);
                break L1;
              }
            }
            L2: {
              if (null != ((fsa) this).field_X) {
                var3_int = param1.field_f >> 1038409928;
                var4 = param1.field_d >> -609209528;
                param1.field_f = -((((fsa) this).field_g >> -1830055064) * var4) + (((fsa) this).field_w >> 866570056) * var3_int;
                param1.field_d = (((fsa) this).field_w >> -588319896) * var4 - -(var3_int * (((fsa) this).field_g >> 1842504872));
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fsa.SC(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final boolean D(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -80) {
                break L1;
              } else {
                ((fsa) this).field_j = -124;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((fsa) this).field_A) {
                  break L3;
                } else {
                  if (null == ((fsa) this).field_X) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.AE(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final boolean j(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 8192) {
              stackOut_3_0 = ((fsa) this).field_k[param0];
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.HE(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final int c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 91) {
                break L1;
              } else {
                ((fsa) this).a((byte) 41, (nv) null);
                break L1;
              }
            }
            stackOut_3_0 = ((fsa) this).field_mb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.AB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        nv var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.D(param0 + -85)) {
              if (!this.a(param1, (byte) -51)) {
                L1: {
                  if (~((fsa) this).field_f <= ~param2) {
                    break L1;
                  } else {
                    if (((fsa) this).field_T) {
                      break L1;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
                var5_int = eha.a(((fsa) this).field_t, 12, ((fsa) this).e(param0 + 9649), ((fsa) this).field_gb, param3, ((fsa) this).d(3), 2);
                if (param0 == var5_int) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  var6 = wm.a(4096, var5_int, param0 + 125);
                  var7 = 0;
                  var8 = (nv) (Object) ((fsa) this).field_u.f(-80);
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (null == var8) {
                          break L4;
                        } else {
                          stackOut_20_0 = var8.a(param2, 1, param3, var6);
                          stackIn_27_0 = stackOut_20_0 ? 1 : 0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (!stackIn_21_0) {
                                break L5;
                              } else {
                                var7 = 1;
                                break L5;
                              }
                            }
                            var8 = (nv) (Object) ((fsa) this).field_u.e(param0 ^ -114);
                            if (var9 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      stackOut_26_0 = var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L3;
                    }
                    break L0;
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
          L6: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("fsa.C(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L6;
            }
          }
          L7: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final void a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fsa) this).field_T = param0;
              if (null == ((fsa) this).field_X) {
                break L1;
              } else {
                ((fsa) this).field_X.a(param0, -102);
                break L1;
              }
            }
            var3_int = -77 % ((param1 - -34) / 49);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "fsa.BE(" + param0 + ',' + param1 + ')');
        }
    }

    private final int t(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fsa var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = (fsa) (Object) ((fsa) this).field_K.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3.w((byte) -113);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          var2_int++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (fsa) (Object) ((fsa) this).field_K.e(116);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = param0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              if (stackIn_11_0 > 15) {
                stackOut_14_0 = var2_int;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_12_0 = -30;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "fsa.DA(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    fsa(la param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            ((fsa) this).field_ab = rn.field_b;
            ((fsa) this).field_gb = param4 << 814222512;
            ((fsa) this).field_jb = param6;
            ((fsa) this).field_D = true;
            rn.field_b = rn.field_b + 1;
            ((fsa) this).field_y = param0;
            ((fsa) this).field_mb = param2 << 1751085328;
            ((fsa) this).field_F = param5;
            ((fsa) this).field_t = param3 << 756070160;
            ((fsa) this).field_Z = param1 << -1428174928;
            ((fsa) this).a(true, param6, param0.e(-51), (ui) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var8;
            stackOut_3_1 = new StringBuilder().append("fsa.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
