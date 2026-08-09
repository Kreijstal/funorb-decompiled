/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca implements fo, gma, ffa, jfa, t {
    private ac field_u;
    private int field_c;
    private int field_G;
    private int field_lb;
    private int field_H;
    private int field_z;
    private int field_S;
    private int field_b;
    private boolean field_gb;
    static fta field_p;
    private int field_r;
    private int field_M;
    private la field_J;
    private int field_d;
    private int field_Q;
    private vna field_fb;
    static vna field_I;
    private int field_mb;
    private int field_A;
    private int field_K;
    private roa field_i;
    private int field_h;
    private int field_t;
    private vna field_v;
    private boolean field_q;
    private int field_X;
    private boolean[] field_C;
    private int field_k;
    private int field_m;
    private boolean field_L;
    private boolean field_l;
    private int field_Y;
    private boolean field_Z;
    static iu field_W;
    private int[] field_P;
    private int field_N;
    private int field_f;
    static String[] field_U;
    static String field_s;
    private int[] field_x;
    private int field_a;
    private on field_jb;
    private int field_kb;
    private boolean field_o;
    private boolean field_V;
    private gma field_g;
    private int field_T;
    private int field_y;
    private gma field_eb;
    private int field_F;
    private int field_n;
    private int field_e;
    private int field_j;
    private int[] field_D;
    private int field_E;
    private int field_ib;
    private boolean field_hb;
    private int field_cb;
    private boolean field_db;
    private int field_bb;
    private int field_w;
    private int field_B;
    private int field_O;
    private int field_ab;
    private int field_R;

    public final on c(boolean param0) {
        RuntimeException var2 = null;
        on stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_y = -109;
                break L1;
              }
            }
            stackIn_4_0 = this.field_jb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final void f(int param0) {
        try {
            if (param0 != -4366) {
                this.b(103, (gma) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.N(" + param0 + ')');
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 103) {
                break L1;
              } else {
                this.field_j = -41;
                break L1;
              }
            }
            if (null != this.field_u) {
              this.field_u.a(106, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("hca.DB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_ab;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 23;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void b(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                if (!this.s((byte) 91)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.C(-1).a((hca) (this), param0 + -16385);
            if (param0 == 16384) {
              this.k(false);
              this.a(1, (byte) 124);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "hca.EA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void G(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 31027) {
                break L1;
              } else {
                this.b(-101, (gma) null);
                break L1;
              }
            }
            this.field_A = 25;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BD(" + param0 + ')');
        }
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 196608) {
                break L1;
              } else {
                this.w(49);
                break L1;
              }
            }
            stackIn_4_0 = this.field_x[param1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.FB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void d(int param0, int param1) {
        boolean stackIn_39_0 = false;
        boolean stackIn_49_0 = false;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        wf var3 = null;
        hr var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_db) {
                            statePc = 17;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_z = this.field_z - 262144;
                        if (3 != this.field_lb) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_M = this.field_M - 1;
                        if (0 >= this.field_M) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.C(param0 ^ -6).c(-1);
                        if (var4 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!this.field_J.g((byte) 104)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.a(60, (byte) 2);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        this.o((byte) 120);
                        this.field_jb.a(86);
                        if (param0 == 5) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        this.field_bb = this.field_bb + 1;
                        if (this.field_kb > 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_kb = this.field_kb - 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((this.field_S ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_S = this.field_S - 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((this.field_A ^ -1) < -1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_A = this.field_A - 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3_int = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((this.field_C.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_C[var3_int] = false;
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3 = (wf) ((Object) this.field_fb.f(-80));
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == var3) {
                            statePc = 48;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3.c(-9);
                        stackIn_49_0 = var3.b((byte) 81);
                        stackIn_39_0 = stackIn_49_0;
                        if (var4 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_C[var3.a((byte) 91)] = true;
                        if (var4 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3.p(param0 ^ 93);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = (wf) ((Object) this.field_fb.e(117));
                        if (var4 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = this.field_q;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_C[5] = true;
                        this.field_q = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_l = false;
                        if (this.field_Z) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_Z = false;
                        this.field_C[2] = true;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!this.field_L) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        this.field_C[3] = true;
                        this.field_L = false;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_i != null) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_i.c(-28);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var3_int = this.field_lb;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var3_int ^ -1) == -1) {
                            statePc = 82;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var3_int != 1) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var4 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (-3 != (var3_int ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var4 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((var3_int ^ -1) == -4) {
                            statePc = 121;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.c((byte) 111, param1);
                        if (this.field_J.a(0, (gma) (this)) != 1) {
                            statePc = 127;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        this.field_J.a(0, (gma) (this));
                        if (4 == this.field_r) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        this.field_d = 0;
                        this.field_H = 0;
                        if (var4 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((this.field_w ^ -1) >= 17825791) {
                            statePc = 102;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        this.field_w = this.field_w + this.field_O;
                        this.field_O = this.field_O - 16384;
                        if (17825791 > (this.field_w ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (this.field_T == 6) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var3_ref = this.field_J.a(this.field_mb, this.field_z, (byte) 100, -17825792);
                        var3_ref.a(false, 32, 4, 16, 5 - -uca.field_c.a(5, 0));
                        var3_ref.b(param0 + 99, 0, 0);
                        var3_ref.a(uca.field_c.a(8192, param0 ^ 5), -32 + uca.field_c.a(64, param0 + -5), -125);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        this.field_w = -17825793;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        this.field_M = this.field_M - 1;
                        if ((this.field_M ^ -1) < -1) {
                            statePc = 127;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (-6 == (this.field_T ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if ((this.field_T ^ -1) != -7) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (this.field_J.a(this.field_G, this.field_G, (gma) (this), this.field_mb, this.field_z, (byte) -126) == 0) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_J.a(8, this.o(-94));
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.field_J.i((byte) -124);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        this.field_K = -1;
                        this.field_b = 0;
                        this.field_M = this.field_M - 1;
                        this.field_z = this.field_z - 393216;
                        if (0 >= this.field_M) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        this.field_d = -393216;
                        this.field_lb = 0;
                        this.field_c = 40;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        this.field_J.field_u.a((ffa) (this), -46);
                        this.field_J.field_u.b((ffa) (this), 7073);
                        if (var4 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_M = this.field_M - 1;
                        if (0 >= this.field_M) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        this.t(3);
                        this.C(-1).c(-1);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_V = false;
                        if (this.field_u != null) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        this.field_u.a(param0 ^ 21458);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    var3_ref2 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var3_ref2), "hca.DA(" + param0 + ',' + param1 + ')');
                }
                case 133: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int E(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -25763) {
                break L1;
              } else {
                this.a(113, -115);
                break L1;
              }
            }
            stackIn_4_0 = this.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.NA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int A(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = this.field_Q;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 16) {
                break L1;
              } else {
                this.L(-34);
                break L1;
              }
            }
            this.field_R = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.EE(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        try {
            this.field_a = param3;
            this.field_N = param2;
            int var5_int = 25 % ((-9 - param1) / 55);
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.NE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void t(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.C(-1);
                        if (param0 == 3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_L = false;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (3 <= var2_int) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_x[var2_int] = this.field_x[var2_int] + this.field_P[var2_int];
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2), "hca.JA(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int u(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 124) {
                break L1;
              } else {
                this.field_V = false;
                break L1;
              }
            }
            stackIn_4_0 = this.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_47_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            if (this.field_db) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param4 != 0) {
                  break L1;
                } else {
                  if (param3 == 0) {
                    stackIn_12_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var7_int = this.field_mb;
                if (param0 > 68) {
                  break L2;
                } else {
                  this.J(-3);
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8 = this.field_z;
                  this.a(param3, 127, param4, param2, 0);
                  if (var7_int != this.field_mb) {
                    break L4;
                  } else {
                    if (this.field_z != var8) {
                      break L4;
                    } else {
                      stackIn_23_0 = 1;
                      break L3;
                    }
                  }
                }
                stackIn_23_0 = 0;
                break L3;
              }
              L5: {
                var9 = stackIn_23_0;
                if (param1) {
                  break L5;
                } else {
                  L6: {
                    if (var9 != 0) {
                      break L6;
                    } else {
                      if (0 == this.field_ab) {
                        break L6;
                      } else {
                        if (-7 != (this.field_ab ^ -1)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    if (2 == param2) {
                      this.field_b = lw.a(-param4, (byte) -109);
                      this.field_K = lw.a(-param3, (byte) -119);
                      this.a(-5636, 2, false);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (-1 == (this.field_A ^ -1)) {
                    this.field_A = 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L8: {
                if (var9 != 0) {
                  stackIn_47_0 = 0;
                  break L8;
                } else {
                  stackIn_47_0 = 1;
                  break L8;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_47_0 != 0;
          }
        }
    }

    final boolean p(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -72) {
              stackIn_4_0 = this.field_l;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void g(int param0, int param1) {
        try {
            this.field_J.a(this.field_z, this.field_mb, param0, 0, (byte) 6);
            int var3_int = 35 % ((57 - param1) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(gma param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_db) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this == param0) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.q(param2 ^ 111)) {
                  if (param2 < param1) {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_19_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("hca.KE(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    final int i(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -54 / ((1 - param0) / 51);
            stackIn_1_0 = this.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.JC(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final int c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 91) {
                break L1;
              } else {
                this.field_gb = true;
                break L1;
              }
            }
            stackIn_4_0 = this.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = "(Player x=" + this.field_mb + " y=" + this.field_z + " vx=" + this.field_H + " vy=" + this.field_d + ")";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "hca.toString()");
        }
        return stackIn_1_0;
    }

    final int v(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 72) {
              stackIn_4_0 = this.field_n;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 25;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((this.field_H ^ -1) <= -1) {
                  break L2;
                } else {
                  this.field_H = this.field_H + param4;
                  if (-1 <= (this.field_H ^ -1)) {
                    break L1;
                  } else {
                    this.field_H = 0;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (-1 <= (this.field_H ^ -1)) {
                break L1;
              } else {
                this.field_H = this.field_H - param4;
                if (-1 >= (this.field_H ^ -1)) {
                  break L1;
                } else {
                  this.field_H = 0;
                  break L1;
                }
              }
            }
            L3: {
              L4: {
                if (this.field_d >= 0) {
                  break L4;
                } else {
                  this.field_d = this.field_d + param4;
                  if (0 < this.field_d) {
                    this.field_d = 0;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if ((this.field_d ^ -1) < -1) {
                this.field_d = this.field_d - param4;
                if (-1 < (this.field_d ^ -1)) {
                  this.field_d = 0;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            this.field_H = this.field_H + gqa.a(param3, (byte) 24, param2);
            this.field_H = za.a(-param0, (byte) 108, param0, this.field_H);
            this.field_d = this.field_d + gqa.a(param3, (byte) 24, param1);
            this.field_d = za.a(-param0, (byte) 84, param0, this.field_d);
            var7_int = -47 % ((75 - param5) / 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this == param0.field_g) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.field_C[2]) {
                if (0 == (eha.a(this.field_G, param1, this.field_z, this.field_G, param2, this.field_mb, 2) ^ -1)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = this.a(param0, -1);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("hca.ED(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        kua discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == 89) {
                break L1;
              } else {
                discarded$1 = this.o(-67);
                break L1;
              }
            }
            this.a(param1, (byte) -128, (roa) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.VD(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(roa param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_f = 91;
                break L1;
              }
            }
            this.a(25, (byte) -127, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hca.PB(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -29 % ((param0 - 1) / 45);
              var3 = this.field_f + 2;
              if (this.field_i != null) {
                var3 = var3 + this.field_i.d(70);
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_5_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HA(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    final boolean s(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 77) {
                break L1;
              } else {
                this.a(89, (uw) null);
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void h(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_n = this.field_n + param1;
              if ((this.field_n ^ -1) <= -1) {
                break L1;
              } else {
                this.field_n = 0;
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                hca.D(123);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.DC(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -61 % ((param1 - 53) / 35);
              if ((this.field_lb ^ -1) != -4) {
                this.field_lb = 3;
                this.field_M = param0;
                this.field_F = this.field_J.p((byte) 18) - -param0;
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
          throw tba.a((Throwable) ((Object) runtimeException), "hca.WB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uw var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_db) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.q(97)) {
                L1: {
                  if ((this.field_lb ^ -1) == -3) {
                    break L1;
                  } else {
                    if (this.field_lb == 3) {
                      break L1;
                    } else {
                      if (param0 == 0) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L2: {
                          if (param0 != 4) {
                            break L2;
                          } else {
                            if (!this.field_C[4]) {
                              break L2;
                            } else {
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        L3: {
                          L4: {
                            this.C(-1).a((hca) (this), param0, 1, param2);
                            this.field_J.field_u.a((ffa) (this), (byte) 107);
                            if (4 != param0) {
                              break L4;
                            } else {
                              L5: {
                                var4 = this.field_J.j((byte) 52);
                                if (null == var4) {
                                  break L5;
                                } else {
                                  if (this.field_u == null) {
                                    break L5;
                                  } else {
                                    var4.a(7, this.field_u, (byte) -33);
                                    var4.a((byte) -82, 2, this.field_u);
                                    break L5;
                                  }
                                }
                              }
                              this.a(-5636, 12, true);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (-2 == (param0 ^ -1)) {
                              break L6;
                            } else {
                              L7: {
                                L8: {
                                  if (-3 != (param0 ^ -1)) {
                                    break L8;
                                  } else {
                                    if (7 == param2) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (-10 == (param2 ^ -1)) {
                                    break L9;
                                  } else {
                                    if (11 == param2) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if ((param2 ^ -1) != -15) {
                                          break L10;
                                        } else {
                                          this.a(-5636, 20, true);
                                          if (var5 == 0) {
                                            break L3;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if ((param2 ^ -1) == -16) {
                                          break L11;
                                        } else {
                                          if (-11 == (param2 ^ -1)) {
                                            break L11;
                                          } else {
                                            L12: {
                                              if (param2 == 8) {
                                                break L12;
                                              } else {
                                                this.a(-5636, 14, true);
                                                if (var5 == 0) {
                                                  break L3;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            this.a(-5636, 22, true);
                                            if (var5 == 0) {
                                              break L3;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      this.a(-5636, 21, true);
                                      if (var5 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                this.a(-5636, 17, true);
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              }
                              this.a(-5636, 16, true);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.a(-5636, 13, true);
                          this.field_J.b(false).a((byte) 61, 2097152 + this.g((byte) 115), this.field_mb, this.field_z);
                          break L3;
                        }
                        this.p(30358);
                        this.field_r = param0;
                        this.field_lb = 1;
                        this.field_M = fe.field_C[param0];
                        this.k(false);
                        this.field_D[param0] = this.field_D[param0] + 1;
                        var4_int = -81 % ((param1 - -64) / 41);
                        this.field_j = 18202625 ^ (18202625 ^ this.field_j) - -1;
                        this.field_T = param2;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "hca.QC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (this.field_J == null) {
                    break L3;
                  } else {
                    if (!this.field_J.o((byte) -82)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_lb = 0;
                this.field_mb = this.field_e;
                this.field_z = this.field_ib;
                this.field_M = 0;
                this.field_r = 0;
                this.a(-5636, 0, true);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_M = 17;
              this.field_lb = 2;
              this.field_mb = this.field_e;
              this.field_r = 0;
              this.field_z = 2097152 + (this.field_M * 393216 + this.field_ib);
              this.a(-5636, 4, true);
              break L1;
            }
            L4: {
              this.field_q = false;
              this.field_d = 0;
              var3_int = -16 / ((-55 - param0) / 44);
              this.field_A = 0;
              this.field_h = 0;
              this.field_t = 0;
              this.field_c = 0;
              this.field_H = 0;
              this.field_S = 0;
              this.field_V = false;
              this.field_b = 0;
              this.field_l = false;
              this.field_K = -1;
              this.field_O = 0;
              this.field_Z = false;
              this.field_L = false;
              this.field_Y = 0;
              this.v((byte) 74);
              this.o((byte) 116);
              this.field_jb.b((byte) 93);
              this.field_B = 0;
              this.field_eb = null;
              this.field_kb = 0;
              this.field_w = 0;
              this.field_g = null;
              if (!param1) {
                break L4;
              } else {
                this.field_fb.d(8);
                this.b((byte) 89, 10);
                this.m(15876);
                this.field_o = false;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.CE(" + param0 + ',' + param1 + ')');
        }
    }

    public final int b(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -94 / ((-23 - param0) / 53);
            stackIn_1_0 = this.field_mb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.M(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final int r(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -95) {
                break L1;
              } else {
                this.I(-94);
                break L1;
              }
            }
            stackIn_4_0 = this.field_J.c(81);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.GE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void t(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if (param0 >= 115) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (var2_int >= 3) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_x[var2_int] = 0;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_cb = 0;
                        this.field_y = -1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "hca.GD(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static iu[] c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        iu var9 = null;
        iu var10 = null;
        iu var11 = null;
        iu var12 = null;
        iu var13 = null;
        Object var14 = null;
        iu[] stackIn_2_0 = null;
        iu[] stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 < -110) {
              L1: {
                var6 = bea.field_l;
                var7 = bea.field_g;
                var8 = bea.field_a;
                var9 = new iu(param2, -(param2 * 2) + param0);
                var9.c();
                bea.b(0, 0, param2, -(param2 * 2) + param0, param3, param5);
                var10 = new iu(param2, param2);
                var10.c();
                bea.e(0, 0, param2, param2, param3);
                var11 = new iu(16, param2);
                var11.c();
                bea.e(0, 0, 16, param2, param3);
                var12 = new iu(param2, param2);
                var12.c();
                bea.e(0, 0, param2, param2, param5);
                var13 = new iu(16, param2);
                var13.c();
                bea.e(0, 0, 16, param2, param5);
                var14 = null;
                if ((param1 ^ -1) < -1) {
                  var14 = new iu(16, 16);
                  ((iu) (var14)).c();
                  bea.e(0, 0, 16, 16, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              bea.a(var6, var7, var8);
              stackIn_8_0 = new iu[]{var10, var11, var10, var9, (iu) (var14), var9, var12, var13, var12};
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (iu[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6_ref), "hca.QE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 110) {
              stackIn_4_0 = io.a(param4, this.field_z, (byte) -118, param3, this.field_mb, param1, this.field_G, this.field_G, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        Object stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        Object stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param2 == -103) {
              L1: {
                stackIn_5_0 = this;

                stackIn_5_1 = param0;

                stackIn_5_2 = 127;

                stackIn_5_3 = param1;

                if (!this.x(param2 + 223)) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = stackIn_5_3;
                  stackIn_6_4 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = stackIn_5_3;
                  stackIn_6_4 = 0;
                  break L1;
                }
              }
              this.a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.SE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int k(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -21185) {
                break L1;
              } else {
                this.field_D = (int[]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.U(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void p(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fsa var2 = null;
        RuntimeException var2_ref = null;
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.x(param0 ^ -30382)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2 = new fsa(this.field_J, true);
                var2.b(437453352, this.field_z, this.field_mb);
                if (param0 == 30358) {
                  break L1;
                } else {
                  this.field_S = -25;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    var2.b((byte) -11, 2097152, 2097152);
                    var2.b((byte) 17, false);
                    var2.a((byte) -3, this.field_f);
                    var2.a(92, true);
                    var3 = new ue(this.field_J, true);
                    var4 = this.field_a;
                    if (0 != var4) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        var3.a(3, false);
                        this.field_P[2] = this.field_P[2] - 1;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 == 1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                var3.a(0, false);
                break L2;
              }
              var3.a(true, (byte) 2);
              var2.a((byte) 83, (nv) (var3));
              var2.c(437453352, true);
              var2.e(true, param0 ^ 30447);
              this.field_J.a(var2, (byte) 32);
              this.J(0);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "hca.CC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void D(int param0) {
        try {
            field_p = null;
            field_s = null;
            field_W = null;
            field_U = null;
            field_I = null;
            if (param0 != -1) {
                hca.D(-63);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.TA(" + param0 + ')');
        }
    }

    private final void o(byte param0) {
        try {
            this.field_X = this.field_mb;
            this.field_k = this.field_z;
            int var2_int = 103 % ((-7 - param0) / 44);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.JE(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 40) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_H = 6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (3 < var4_int) {
                            statePc = 37;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 != (param1 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 <= (param2 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = stackIn_16_0;
                        if (!this.a(-1, -1, 0, 0, var5, var4_int)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        if (!this.a(param0 + -41, 1, 0, 0, var5, var4_int)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        if (var6 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param2 ^ -1) == -1) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0 >= param1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = -1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = stackIn_30_0;
                        if (!this.a(-1, 0, -1, var5, 0, var4_int)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (!this.a(param0 ^ -41, 0, 1, var5, 0, var4_int)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        var4_int++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var4), "hca.HB(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void n(int param0) {
        try {
            this.field_Z = true;
            if (param0 != 21120) {
                this.field_kb = 32;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.RD(" + param0 + ')');
        }
    }

    final void q(byte param0) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_mb = this.field_J.a(this.field_mb, (byte) 71);
              this.field_b = -this.field_b;
              if (param0 == -57) {
                break L1;
              } else {
                this.a((wf) null, (byte) -39);
                break L1;
              }
            }
            L2: {
              this.field_H = -this.field_H;
              stackIn_6_0 = this;

              if (this.field_o) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            ((hca) (this)).field_o = stackIn_7_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MD(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 393216) {
                break L1;
              } else {
                this.a(126, false);
                break L1;
              }
            }
            stackIn_4_0 = this.field_P[param1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.QA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int j(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_cb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 104;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int H(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= this.field_b) {
                break L1;
              } else {
                if ((this.field_K ^ -1) == -1) {
                  stackIn_7_0 = 6;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-1 <= (this.field_b ^ -1)) {
                break L2;
              } else {
                if (this.field_K != 0) {
                  break L2;
                } else {
                  stackIn_13_0 = 2;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (-1 != (this.field_b ^ -1)) {
                break L3;
              } else {
                if (-1 < (this.field_K ^ -1)) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (this.field_b != 0) {
                break L4;
              } else {
                if (this.field_K <= 0) {
                  break L4;
                } else {
                  stackIn_27_0 = 4;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L5: {
              if (0 <= this.field_b) {
                break L5;
              } else {
                if (0 <= this.field_K) {
                  break L5;
                } else {
                  stackIn_33_0 = 7;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            L6: {
              if (0 <= this.field_b) {
                break L6;
              } else {
                if (-1 <= (this.field_K ^ -1)) {
                  break L6;
                } else {
                  stackIn_39_0 = 5;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            }
            L7: {
              if (this.field_b <= 0) {
                break L7;
              } else {
                if (this.field_K >= 0) {
                  break L7;
                } else {
                  stackIn_45_0 = 1;
                  decompiledRegionSelector0 = 6;
                  break L0;
                }
              }
            }
            L8: {
              if (0 >= this.field_b) {
                break L8;
              } else {
                if (0 >= this.field_K) {
                  break L8;
                } else {
                  stackIn_51_0 = 3;
                  decompiledRegionSelector0 = 7;
                  break L0;
                }
              }
            }
            stackIn_53_0 = -1;
            decompiledRegionSelector0 = 8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_45_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_51_0;
                      } else {
                        return stackIn_53_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void k(boolean param0) {
        try {
            this.m(15876);
            if (param0) {
                this.field_y = 21;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.NC(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int stackIn_31_0 = 0;
        boolean stackIn_36_0 = false;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_35_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int[][] var9 = null;
        int var10 = 0;
        ffa[] var11 = null;
        ffa[] var12 = null;
        int var13 = 0;
        ffa var14 = null;
        fsa var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.x(93)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_g = null;
                        this.field_eb = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        this.field_eb = null;
                        var3_int = 1048576 + this.field_G / 2;
                        if (param1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_cb = 60;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = lw.a(this.field_b, (byte) -96);
                        var5 = var3_int * var4 + this.field_mb;
                        var6 = lw.a(this.field_K, (byte) -109);
                        var7 = var6 * var3_int + this.field_z;
                        if (null != this.field_g) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!(this.field_g instanceof fsa)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!((fsa) ((Object) this.field_g)).s((byte) 92)) {
                            statePc = 26;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!this.field_g.a((byte) 110, var7, var5, 2, 2)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_eb = this.field_g;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_eb = null;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_eb = null;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null != this.field_eb) {
                            statePc = 68;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = new int[][]{new int[]{var5, var7}, new int[]{this.field_mb - var3_int * var4, this.field_z + var3_int * var6}, new int[]{this.field_mb + var4 * var3_int, this.field_z + -(var6 * var3_int)}, new int[]{-(var4 * var3_int) + this.field_mb, -(var6 * var3_int) + this.field_z}};
                        var9 = new int[][]{new int[]{this.field_b, this.field_K}, new int[]{-this.field_b, this.field_K}, new int[]{this.field_b, -this.field_K}, new int[]{-this.field_b, -this.field_K}};
                        var10 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = -5;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 >= (var10 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11 = this.field_J.field_u.b(var8[var10][1], -1, var8[var10][0], 2, 2);
                        var12 = var11;
                        if (var20 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var13 >= var12.length) {
                            statePc = 67;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var14 = var12[var13];
                        stackOut_35_0 = var14 instanceof fsa;
                        stackIn_31_0 = stackOut_35_0 ? 1 : 0;
                        stackIn_36_0 = stackOut_35_0;
                        if (var20 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var15 = (fsa) ((Object) var14);
                        if (!var15.s((byte) -114)) {
                            statePc = 64;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!var15.a((byte) 110, var8[var10][1], var8[var10][0], 2, 2)) {
                            statePc = 64;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_eb = (gma) ((Object) var14);
                        var16 = this.field_eb.d(3);
                        var17 = this.field_eb.e(9648);
                        var18 = -this.field_mb + var16;
                        var19 = -this.field_z + var17;
                        if (((var18 >> 76473160) * (var18 >> -2063485624) ^ -1) < ((var19 >> -2137857464) * (var19 >> 861993928) ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var19 >= 0) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var19 = var19 + (this.field_G + this.field_eb.a((byte) 55) >> -279267295);
                        if (var20 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var19 > 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var19 = var19 - (this.field_G + this.field_eb.a((byte) 55) >> 571960769);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_z = this.field_z + var19;
                        if (var20 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var18 ^ -1) <= -1) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var18 = var18 + (this.field_G + this.field_eb.c(-114) >> -1483697631);
                        if (var20 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-1 <= (var18 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var18 = var18 - (this.field_G - -this.field_eb.c(-110) >> -163585215);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_mb = this.field_mb + var18;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_b = var9[var10][0];
                        this.field_K = var9[var10][1];
                        if (var20 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var13++;
                        if (var20 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10++;
                        if (var20 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (null != this.field_eb) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.field_g = null;
                        if (var20 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_g = this.field_eb;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var3), "hca.OC(" + param0 + ',' + param1 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.b(24, (gma) null);
                break L1;
              }
            }
            var7_int = param5 * 393216 * param1;
            var8 = param5 * (393216 * param2);
            var9 = param3 * 786432;
            var10 = 786432 * param4;
            var11 = var9 / 2 + (var7_int + this.field_mb);
            var12 = var10 / 2 + (var8 + this.field_z);
            var13 = this.field_G + ua.a(var9, -113);
            var14 = this.field_G - -ua.a(var10, 67);
            if (!this.field_J.a(var11, 131072, var13, var14, var12, true)) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_J.a((ffa) (this), var14, param0 ^ -3, 1, var12, var11, false, (gma) (this), var13)) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.a(131072 * param2, param0 + 128, 131072 * param1, 0, 0);
                this.field_c = 0;
                stackIn_14_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final int L(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2158) {
                break L1;
              } else {
                this.field_C = (boolean[]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_F;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_J != null) {
              L1: {
                if (0 < this.field_A) {
                  param1 = param1 / 2;
                  param4 = param4 / 2;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.field_T = 52;
                  break L2;
                }
              }
              stackIn_11_0 = this.field_J.a((ffa) (this), (gma) (this), 1, this.field_G, param1, 12, this.field_G, this.field_mb, param3, param4, this.field_z, param2, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.TC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = this.field_b;
                if (-1 < (param2 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (param2 <= 0) {
                      break L3;
                    } else {
                      this.field_b = 1;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0 == 0) {
                    break L1;
                  } else {
                    this.field_b = 0;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_b = -1;
              break L1;
            }
            L4: {
              L5: {
                var5 = this.field_K;
                if (-1 >= (param0 ^ -1)) {
                  break L5;
                } else {
                  this.field_K = -1;
                  if (var6 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (-1 > (param0 ^ -1)) {
                  break L6;
                } else {
                  if ((param2 ^ -1) == -1) {
                    break L4;
                  } else {
                    this.field_K = 0;
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              this.field_K = 1;
              break L4;
            }
            L7: {
              if (param1 <= -26) {
                break L7;
              } else {
                this.t((byte) -73);
                break L7;
              }
            }
            L8: {
              L9: {
                if (this.field_b != var4_int) {
                  break L9;
                } else {
                  if ((this.field_K ^ -1) != (var5 ^ -1)) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_kb = 0;
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.LE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(wf param0, byte param1) {
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.a((byte) -60, (hca) (this))) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_fb.b((byte) -123, param0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (3 >= this.field_fb.a((byte) -16)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_fb.c(param1 ^ -106);
                        if (var4 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 == 3) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.c(-54, 121, 66);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var3);
                    stackIn_14_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("hca.FC(");
                    stackIn_14_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int e(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_R;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -46;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.WD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void b(int param0, gma param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a((byte) 121, 43, -99);
                break L1;
              }
            }
            var3_int = param1.d(3);
            var4 = param1.e(9648);
            var5 = this.field_mb + -var3_int;
            var6 = -var4 + this.field_z;
            this.c(var6, param0 ^ -58, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hca.LD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int g(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_E;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -7;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int w(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 85 / ((param0 - 15) / 48);
            stackIn_1_0 = this.field_mb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HC(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final int i(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 90) {
                break L1;
              } else {
                this.q(127);
                break L1;
              }
            }
            stackIn_4_0 = this.field_X;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.KA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void v(byte param0) {
        if (param0 != 74) {
            this.field_y = -19;
        }
        if (this.field_J == null) {
            return;
        }
        try {
            za.a(0, (byte) 108, this.field_J.m((byte) -86), this.field_mb);
            this.field_J.o(param0 + -66);
            this.field_m = za.a(0, (byte) 73, this.field_J.s(120), this.field_z) - -this.field_J.n((byte) -51);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.TB(" + param0 + ')');
        }
    }

    final void a(fsa param0, boolean param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_hb = true;
              if (!param1) {
                break L1;
              } else {
                this.b(65, 76, -9, -128, -79, -56);
                break L1;
              }
            }
            L2: {
              this.field_P[param2] = this.field_P[param2] + 1;
              if (null == param0) {
                break L2;
              } else {
                if (param2 != 0) {
                  this.field_v.b((byte) -118, new vl(param2, param0));
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            this.C(-1).m(9262).a(param2, 15818, (hca) (this), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("hca.UB(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_141_0 = 0;
        Object stackIn_205_0 = null;
        int stackIn_241_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_314_0 = 0;
        int stackIn_330_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == (1 & param1)) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_5_0;
              if (0 == (2 & param1)) {
                stackIn_9_0 = 0;
                break L2;
              } else {
                stackIn_9_0 = 1;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_9_0;
              if (0 == (param1 & 4)) {
                stackIn_13_0 = 0;
                break L3;
              } else {
                stackIn_13_0 = 1;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_13_0;
              if (0 == (8 & param1)) {
                stackIn_17_0 = 0;
                break L4;
              } else {
                stackIn_17_0 = 1;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_17_0;
              if ((16 & param1) == 0) {
                stackIn_21_0 = 0;
                break L5;
              } else {
                stackIn_21_0 = 1;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_21_0;
              if ((param1 & 128) == 0) {
                stackIn_25_0 = 0;
                break L6;
              } else {
                stackIn_25_0 = 1;
                break L6;
              }
            }
            L7: {
              var8 = stackIn_25_0;
              if (0 == (32 & param1)) {
                stackIn_29_0 = 0;
                break L7;
              } else {
                stackIn_29_0 = 1;
                break L7;
              }
            }
            L8: {
              var9 = stackIn_29_0;
              if ((256 & param1 ^ -1) == -1) {
                stackIn_33_0 = 0;
                break L8;
              } else {
                stackIn_33_0 = 1;
                break L8;
              }
            }
            L9: {
              var10 = stackIn_33_0;
              if ((64 & param1 ^ -1) == -1) {
                stackIn_37_0 = 0;
                break L9;
              } else {
                stackIn_37_0 = 1;
                break L9;
              }
            }
            L10: {
              var11 = stackIn_37_0;
              if (var10 == 0) {
                break L10;
              } else {
                if (this.s((byte) 97)) {
                  this.b(16384, false);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              this.a(var9 != 0, true);
              if (this.C(-1).f(1, 10915)) {
                var12 = var3_int;
                var3_int = var4;
                var4 = var12;
                var12 = var5;
                var5 = var6;
                var6 = var12;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var12 = 0;
              var13 = 0;
              if (var3_int != 0) {
                var12--;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (var4 == 0) {
                break L13;
              } else {
                var12++;
                break L13;
              }
            }
            L14: {
              if (var5 == 0) {
                break L14;
              } else {
                var13--;
                break L14;
              }
            }
            L15: {
              if (var6 != 0) {
                var13++;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var14 = this.C(-1).g(113) ? 1 : 0;
              var15 = this.field_N;
              if (!this.C(-1).f(0, 10915)) {
                break L16;
              } else {
                var15 = var15 / 2;
                break L16;
              }
            }
            var16 = 0;
            if (param0 > 81) {
              L17: {
                if (!this.field_C[1]) {
                  break L17;
                } else {
                  var16 = 1;
                  break L17;
                }
              }
              L18: {
                if (var11 != 0) {
                  stackIn_73_0 = 65536;
                  break L18;
                } else {
                  stackIn_73_0 = 393216;
                  break L18;
                }
              }
              L19: {
                L20: {
                  var17 = stackIn_73_0;
                  if (var9 == 0) {
                    break L20;
                  } else {
                    if (this.field_g == null) {
                      break L20;
                    } else {
                      stackIn_80_0 = 1;
                      break L19;
                    }
                  }
                }
                stackIn_80_0 = 0;
                break L19;
              }
              L21: {
                L22: {
                  var18 = stackIn_80_0;
                  if (var7 == 0) {
                    break L22;
                  } else {
                    if (this.field_i == null) {
                      break L22;
                    } else {
                      stackIn_87_0 = 1;
                      break L21;
                    }
                  }
                }
                stackIn_87_0 = 0;
                break L21;
              }
              L23: {
                var19 = stackIn_87_0;
                if (var9 != 0) {
                  break L23;
                } else {
                  L24: {
                    if (this.field_eb == null) {
                      break L24;
                    } else {
                      L25: {
                        L26: {
                          if ((this.field_eb.c(-117) ^ -1) >= -2097153) {
                            break L26;
                          } else {
                            if ((this.field_eb.a((byte) 55) ^ -1) >= -2097153) {
                              break L26;
                            } else {
                              stackIn_100_0 = 1;
                              break L25;
                            }
                          }
                        }
                        stackIn_100_0 = 0;
                        break L25;
                      }
                      L27: {
                        L28: {
                          var20 = stackIn_100_0;
                          if (var20 == 0) {
                            break L28;
                          } else {
                            var17 = 131072;
                            if (var29 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        var17 = 196608;
                        break L27;
                      }
                      if (var29 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  if (null == this.field_g) {
                    break L23;
                  } else {
                    L29: {
                      var20 = this.I(5) ? 1 : 0;
                      if (var20 != 0) {
                        break L29;
                      } else {
                        var17 = 196608;
                        if (var29 == 0) {
                          break L23;
                        } else {
                          break L29;
                        }
                      }
                    }
                    var17 = 131072;
                    break L23;
                  }
                }
              }
              L30: {
                if (var19 == 0) {
                  break L30;
                } else {
                  var17 = 262144;
                  var16 = -1;
                  break L30;
                }
              }
              L31: {
                if (var18 == 0) {
                  break L31;
                } else {
                  L32: {
                    L33: {
                      if (-2097153 <= (this.field_g.c(-64) ^ -1)) {
                        break L33;
                      } else {
                        if (2097152 >= this.field_g.a((byte) 55)) {
                          break L33;
                        } else {
                          stackIn_122_0 = 1;
                          break L32;
                        }
                      }
                    }
                    stackIn_122_0 = 0;
                    break L32;
                  }
                  L34: {
                    var20 = stackIn_122_0;
                    if (var20 == 0) {
                      break L34;
                    } else {
                      var17 = 131072;
                      if (var29 == 0) {
                        break L31;
                      } else {
                        break L34;
                      }
                    }
                  }
                  var17 = 196608;
                  break L31;
                }
              }
              L35: {
                L36: {
                  L37: {
                    this.field_E = var17;
                    if ((var12 ^ -1) == -1) {
                      break L37;
                    } else {
                      if (0 != var13) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  var21 = var13 << -1560524848;
                  var20 = var12 << 1130047440;
                  if (var29 == 0) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
                var21 = var13 * 46333;
                var20 = var12 * 46333;
                break L35;
              }
              L38: {
                L39: {
                  var22 = 0;
                  var23 = 0;
                  if (var19 != 0) {
                    break L39;
                  } else {
                    L40: {
                      if ((var20 ^ -1) != -1) {
                        break L40;
                      } else {
                        if (-1 == (var21 ^ -1)) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    stackIn_141_0 = 1;
                    break L38;
                  }
                }
                stackIn_141_0 = 0;
                break L38;
              }
              var24 = stackIn_141_0;
              L41: while (true) {
                L42: {
                  L43: {
                    if (0 > var16) {
                      break L43;
                    } else {
                      L44: {
                        L45: {
                          if (4 == this.field_ab) {
                            break L45;
                          } else {
                            this.field_c = 0;
                            if (var29 == 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        this.field_c = this.field_c + 1;
                        break L44;
                      }
                      L46: {
                        if (var24 != 0) {
                          break L46;
                        } else {
                          L47: {
                            if (-5 == (this.field_ab ^ -1)) {
                              break L47;
                            } else {
                              if (9 != this.field_ab) {
                                break L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          if (-41 > (this.field_c ^ -1)) {
                            this.field_A = 5;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L48: {
                        L49: {
                          if (this.field_A <= 0) {
                            break L49;
                          } else {
                            L50: {
                              L51: {
                                var23 = 1;
                                if (-1 > (this.field_S ^ -1)) {
                                  break L51;
                                } else {
                                  var25 = 100000;
                                  var26 = 32000;
                                  this.field_J.a(this.field_z, 0, (byte) 126, this.field_mb, this.field_d * 6, this.field_H * 6);
                                  if (var29 == 0) {
                                    break L50;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              this.field_gb = true;
                              var22 = 1;
                              var25 = 20000;
                              var26 = 8000;
                              break L50;
                            }
                            this.b(gqa.a(var17, (byte) 24, var15), var21, var20, gqa.a(var25, (byte) 24, var15), var26, 127);
                            if (var29 == 0) {
                              break L48;
                            } else {
                              break L49;
                            }
                          }
                        }
                        this.a(var20, 89, gqa.a(var17, (byte) 24, var15), var21);
                        break L48;
                      }
                      L52: {
                        if (var14 != 0) {
                          break L52;
                        } else {
                          if (0 != var16) {
                            break L52;
                          } else {
                            if (!this.C(-1).f(8, 10915)) {
                              break L52;
                            } else {
                              this.field_gb = true;
                              var22 = 1;
                              this.field_H = this.field_H + (131072 - this.field_J.q(-81).a(262144, 0));
                              this.field_d = this.field_d + (131072 - this.field_J.q(-83).a(262144, 0));
                              break L52;
                            }
                          }
                        }
                      }
                      L53: {
                        L54: {
                          var16--;
                          if (null == this.field_g) {
                            break L54;
                          } else {
                            this.a((byte) 56, var21, var20);
                            if (var29 == 0) {
                              break L53;
                            } else {
                              break L54;
                            }
                          }
                        }
                        this.a(this.field_d, this.field_H, (byte) -103);
                        if (this.field_eb != null) {
                          break L53;
                        } else {
                          if (this.field_kb != 0) {
                            break L53;
                          } else {
                            if (this.field_X != this.field_mb) {
                              break L53;
                            } else {
                              if ((this.field_k ^ -1) != (this.field_z ^ -1)) {
                                break L53;
                              } else {
                                if (var24 == 0) {
                                  break L53;
                                } else {
                                  this.b((byte) 40, var20, var21);
                                  break L53;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var16 < 0) {
                        continue L41;
                      } else {
                        stackIn_205_0 = this;

                        if (var29 != 0) {
                          break L42;
                        } else {
                          if (((hca) (this)).field_u == null) {
                            continue L41;
                          } else {
                            this.field_u.a(21463);
                            if (var29 == 0) {
                              continue L41;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_205_0 = this;
                  break L42;
                }
                L55: {
                  L56: {
                    if (!this.x(117)) {
                      break L56;
                    } else {
                      L57: {
                        this.c(var21, -67, var20);
                        if (var9 != 0) {
                          break L57;
                        } else {
                          if (var7 != 0) {
                            break L57;
                          } else {
                            break L55;
                          }
                        }
                      }
                      this.p(30358);
                      if (var29 == 0) {
                        break L55;
                      } else {
                        break L56;
                      }
                    }
                  }
                  L58: {
                    if (var9 == 0) {
                      break L58;
                    } else {
                      if (null == this.field_g) {
                        break L58;
                      } else {
                        break L55;
                      }
                    }
                  }
                  L59: {
                    if (var7 != 0) {
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  this.c(var21, -86, var20);
                  if (this.field_i == null) {
                    break L55;
                  } else {
                    if (var7 == 0) {
                      break L55;
                    } else {
                      if (-1 <= (this.field_kb ^ -1)) {
                        this.y(2);
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                  }
                }
                L60: {
                  L61: {
                    if (this.field_X != this.field_mb) {
                      break L61;
                    } else {
                      if ((this.field_z ^ -1) == (this.field_k ^ -1)) {
                        stackIn_241_0 = 0;
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  stackIn_241_0 = 1;
                  break L60;
                }
                L62: {
                  var25 = stackIn_241_0;
                  if (-1 <= (this.field_A ^ -1)) {
                    break L62;
                  } else {
                    if (-1 > (this.field_S ^ -1)) {
                      break L62;
                    } else {
                      if (!this.field_V) {
                        break L62;
                      } else {
                        var23 = 0;
                        this.field_A = 0;
                        this.field_B = 0;
                        break L62;
                      }
                    }
                  }
                }
                L63: {
                  L64: {
                    if (var22 != 0) {
                      break L64;
                    } else {
                      L65: {
                        if (var25 != 0) {
                          break L65;
                        } else {
                          if (!this.field_J.a(false, this.field_z, (gma) (this), this.field_mb)) {
                            break L65;
                          } else {
                            break L64;
                          }
                        }
                      }
                      stackIn_259_0 = 0;
                      break L63;
                    }
                  }
                  stackIn_259_0 = 1;
                  break L63;
                }
                L66: {
                  var22 = stackIn_259_0;
                  if (var24 == 0) {
                    break L66;
                  } else {
                    if (var25 == 0) {
                      break L66;
                    } else {
                      if (var23 == 0) {
                        this.field_J.a(false, this.field_mb, 0, -this.field_H, this.field_z, -this.field_d);
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                  }
                }
                L67: {
                  L68: {
                    var26 = -1;
                    if (this.x(-77)) {
                      break L68;
                    } else {
                      L69: {
                        if ((this.field_ab ^ -1) == -1) {
                          break L69;
                        } else {
                          if (this.field_ab == 6) {
                            break L69;
                          } else {
                            if ((this.field_ab ^ -1) == -19) {
                              break L69;
                            } else {
                              break L69;
                            }
                          }
                        }
                      }
                      L70: {
                        L71: {
                          if (0 < this.field_B) {
                            break L71;
                          } else {
                            if (this.field_B == -1) {
                              break L70;
                            } else {
                              var26 = 0;
                              if (var18 == 0) {
                                break L70;
                              } else {
                                var26 = 2;
                                if (var29 == 0) {
                                  break L70;
                                } else {
                                  break L71;
                                }
                              }
                            }
                          }
                        }
                        this.field_B = this.field_B - 1;
                        break L70;
                      }
                      L72: {
                        if (this.field_ab != 0) {
                          break L72;
                        } else {
                          if (150 >= this.field_bb) {
                            break L72;
                          } else {
                            L73: {
                              if ((this.field_J.q(-91).a(2, 0) ^ -1) != -1) {
                                break L73;
                              } else {
                                var26 = 6;
                                if (var29 == 0) {
                                  break L72;
                                } else {
                                  break L73;
                                }
                              }
                            }
                            var26 = 18;
                            break L72;
                          }
                        }
                      }
                      L74: {
                        L75: {
                          if (var22 != 0) {
                            break L75;
                          } else {
                            this.field_gb = true;
                            if (var29 == 0) {
                              break L74;
                            } else {
                              break L75;
                            }
                          }
                        }
                        if (!this.field_gb) {
                          break L74;
                        } else {
                          var26 = 7;
                          break L74;
                        }
                      }
                      L76: {
                        if (var24 == 0) {
                          break L76;
                        } else {
                          if (var25 == 0) {
                            break L76;
                          } else {
                            L77: {
                              if (var11 != 0) {
                                stackIn_314_0 = 19;
                                break L77;
                              } else {
                                stackIn_314_0 = 4;
                                break L77;
                              }
                            }
                            var26 = stackIn_314_0;
                            break L76;
                          }
                        }
                      }
                      L78: {
                        if (var22 != 0) {
                          break L78;
                        } else {
                          if (var23 == 0) {
                            break L78;
                          } else {
                            L79: {
                              if (0 != this.field_H) {
                                break L79;
                              } else {
                                if ((this.field_d ^ -1) == -1) {
                                  break L78;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            var26 = 5;
                            break L78;
                          }
                        }
                      }
                      L80: {
                        if (-1 <= (this.field_kb ^ -1)) {
                          stackIn_330_0 = 0;
                          break L80;
                        } else {
                          stackIn_330_0 = 1;
                          break L80;
                        }
                      }
                      L81: {
                        var28 = stackIn_330_0;
                        if (var24 == 0) {
                          break L81;
                        } else {
                          L82: {
                            if (var18 != 0) {
                              break L82;
                            } else {
                              if (var28 == 0) {
                                break L81;
                              } else {
                                break L82;
                              }
                            }
                          }
                          L83: {
                            if (var25 == 0) {
                              break L83;
                            } else {
                              L84: {
                                if (var18 == 0) {
                                  break L84;
                                } else {
                                  L85: {
                                    if ((this.field_b ^ -1) == -1) {
                                      break L85;
                                    } else {
                                      if ((var12 ^ -1) == (this.field_b ^ -1)) {
                                        break L84;
                                      } else {
                                        break L85;
                                      }
                                    }
                                  }
                                  L86: {
                                    if ((this.field_K ^ -1) == -1) {
                                      break L86;
                                    } else {
                                      if (this.field_K == var13) {
                                        break L84;
                                      } else {
                                        break L86;
                                      }
                                    }
                                  }
                                  var26 = 3;
                                  if (var29 == 0) {
                                    break L81;
                                  } else {
                                    break L84;
                                  }
                                }
                              }
                              var26 = 1;
                              if (var29 == 0) {
                                break L81;
                              } else {
                                break L83;
                              }
                            }
                          }
                          var26 = 2;
                          break L81;
                        }
                      }
                      L87: {
                        if (var24 == 0) {
                          break L87;
                        } else {
                          if (var25 != 0) {
                            break L87;
                          } else {
                            var26 = 2;
                            break L87;
                          }
                        }
                      }
                      L88: {
                        if ((var26 ^ -1) == -2) {
                          break L88;
                        } else {
                          if (-4 != (var26 ^ -1)) {
                            break L88;
                          } else {
                            break L88;
                          }
                        }
                      }
                      if (var29 == 0) {
                        break L67;
                      } else {
                        break L68;
                      }
                    }
                  }
                  L89: {
                    L90: {
                      if (var23 == 0) {
                        break L90;
                      } else {
                        if (0 != this.field_H) {
                          break L89;
                        } else {
                          if (-1 != (this.field_d ^ -1)) {
                            break L89;
                          } else {
                            break L90;
                          }
                        }
                      }
                    }
                    L91: {
                      if (var24 != 0) {
                        break L91;
                      } else {
                        var26 = 8;
                        if (var29 == 0) {
                          break L67;
                        } else {
                          break L91;
                        }
                      }
                    }
                    var26 = 9;
                    if (var29 == 0) {
                      break L67;
                    } else {
                      break L89;
                    }
                  }
                  var26 = 10;
                  break L67;
                }
                L92: {
                  var27 = 0;
                  if (0 == (var26 ^ -1)) {
                    break L92;
                  } else {
                    this.field_B = 0;
                    this.a(-5636, var26, var27 != 0);
                    break L92;
                  }
                }
                L93: {
                  if (var8 == 0) {
                    break L93;
                  } else {
                    if (this.q(72)) {
                      break L93;
                    } else {
                      this.a(2, (byte) -126, 1);
                      break L93;
                    }
                  }
                }
                L94: {
                  if (!this.field_C[0]) {
                    break L94;
                  } else {
                    var28 = this.field_J.q(-96).a(32, 0) + 256 << -1379969584;
                    this.field_J.a(-116, this.field_z, new up(4, 32), var28, var28, this.field_mb);
                    break L94;
                  }
                }
                L95: {
                  if (this.field_J.g((byte) -67)) {
                    this.a(1, (byte) -25);
                    break L95;
                  } else {
                    break L95;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.LC(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 55) {
              stackIn_4_0 = this.field_G;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -39;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean M(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -75) {
                break L1;
              } else {
                hca.D(-48);
                break L1;
              }
            }
            stackIn_4_0 = this.field_hb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.AE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int F(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var2_int = var2_int + this.a(param0 ^ -401207, 0) * gp.field_i[0];
              var2_int = var2_int + this.a(393216, 1) * gp.field_i[1];
              if (param0 == -7991) {
                break L1;
              } else {
                this.field_u = (ac) null;
                break L1;
              }
            }
            var2_int = var2_int + this.a(393216, 2) * gp.field_i[2];
            stackIn_4_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void i(boolean param0) {
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.JD(" + param0 + ')');
        }
    }

    public final boolean d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 48) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.LB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.u(0);
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.E(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void f(int param0, int param1) {
        if (param1 != -25915) {
            return;
        }
        try {
            this.field_cb = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.VB(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean l(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_fb = (vna) null;
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void y(int param0) {
        int var2_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-1 != (this.field_b ^ -1)) {
                break L1;
              } else {
                if (-1 == (this.field_K ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.C(param0 + -3).f(2, 10915)) {
              if (this.field_i == null) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                var2_int = im.a(this.field_K, this.field_b, param0 + -1);
                this.field_l = this.field_i.a(var2_int, 1572864, (gma) (this), this.field_mb, this.field_z, this.f((byte) 80), this.field_H, this.field_d, this.field_G / param0, false);
                if (this.field_l) {
                  L2: {
                    this.a(-5636, 11, true);
                    if ((this.field_i.b((byte) -16).field_j ^ -1) != -4) {
                      break L2;
                    } else {
                      if ((this.field_A ^ -1) >= -1) {
                        break L2;
                      } else {
                        this.field_A = 0;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!this.field_i.a(param0 ^ 12109)) {
                      this.b((byte) 89, 25);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.JB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0 = fs.a((byte) 114, param0, this.field_mb);
              param0 = fs.a((byte) 105, param0, this.field_z);
              if (param1 <= -22) {
                break L1;
              } else {
                this.field_w = -19;
                break L1;
              }
            }
            param0 = fs.a((byte) 44, param0, this.field_H);
            param0 = fs.a((byte) 38, param0, this.field_d);
            stackIn_4_0 = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.UA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final boolean a(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 37 % ((param0 - 6) / 46);
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.UD(" + param0 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public final void a(int param0, int param1, int param2) {
        this.field_J.field_u.a((ffa) (this), (byte) 121);
        if (param2 != 2) {
            return;
        }
        try {
            this.b(param1, param0, 76473160);
            this.o((byte) -116);
            this.field_J.field_u.b((ffa) (this), 7073);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.DD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(la param0, int param1, int param2, boolean param3) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_e = param1;
              this.field_ib = param2;
              this.field_J = param0;
              if (!this.field_db) {
                break L1;
              } else {
                this.field_ib = this.field_ib + 157286400;
                break L1;
              }
            }
            L2: {
              this.v((byte) 74);
              if (param3) {
                break L2;
              } else {
                discarded$1 = this.a((gma) null, 119, -93);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("hca.GA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void l(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 28) {
                break L1;
              } else {
                this.field_o = true;
                break L1;
              }
            }
            this.field_q = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PC(" + param0 + ')');
        }
    }

    final ac n(byte param0) {
        RuntimeException var2 = null;
        ac stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -36) {
                break L1;
              } else {
                this.q(-3);
                break L1;
              }
            }
            stackIn_4_0 = this.field_u;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.GC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -11) {
                break L1;
              } else {
                this.g(117, 73);
                break L1;
              }
            }
            stackIn_4_0 = this.field_G;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.P(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int h(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_bb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 124;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.BE(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -86) {
                break L1;
              } else {
                hca.D(-76);
                break L1;
              }
            }
            stackIn_4_0 = this.g((byte) 115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.O(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int z(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -22 / ((-23 - param0) / 58);
            stackIn_1_0 = this.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.MB(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.a(param1, param7, 1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 > 55) {
                  break L1;
                } else {
                  this.field_B = 46;
                  break L1;
                }
              }
              if (!this.a((byte) 110, param4, param6, param0, param3)) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_14_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var9);

            stackIn_18_1 = new StringBuilder().append("hca.IC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -77) {
                break L1;
              } else {
                this.q((byte) -68);
                break L1;
              }
            }
            this.a(3, (byte) 25, 3);
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hca.OD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean d(byte param0, int param1) {
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = -117 % ((param0 - -29) / 60);
            stackIn_1_0 = this.field_C[param1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.KC(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              if (this.a(param1, param2, 1)) {
                var5_int = eha.a(this.field_G, 12, this.e(9648), this.field_G, param3, this.d(3), 2);
                if (-1 == var5_int) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var6 = wm.a(4096, var5_int, -110);
                  param3.a(var6, (byte) 47);
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("hca.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                if ((param1 ^ -1) == (this.field_ab ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_ab != 11) {
                break L2;
              } else {
                if (7 != param1) {
                  break L2;
                } else {
                  if (null == this.field_u) {
                    break L2;
                  } else {
                    if (this.field_u.a((byte) -113)) {
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            if (param0 == -5636) {
              L3: {
                L4: {
                  if ((param1 ^ -1) != -6) {
                    break L4;
                  } else {
                    this.field_B = 50;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1 == 15) {
                    break L5;
                  } else {
                    if (11 == param1) {
                      break L5;
                    } else {
                      L6: {
                        if (7 == param1) {
                          break L6;
                        } else {
                          L7: {
                            if (-7 == (param1 ^ -1)) {
                              break L7;
                            } else {
                              this.field_B = 0;
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          }
                          this.field_B = 300;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_B = 300;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.field_B = -1;
                break L3;
              }
              L8: {
                this.field_ab = param1;
                this.field_bb = 0;
                if (null == this.field_u) {
                  break L8;
                } else {
                  this.field_u.a(26, param1, param2);
                  break L8;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.VC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == 18202625) {
                break L1;
              } else {
                this.field_Q = -96;
                break L1;
              }
            }
            this.field_y = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.ND(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean l(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_db;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.ME(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public final boolean j(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -102) {
                break L1;
              } else {
                this.a(81, false);
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.DE(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_O = 60;
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "hca.KD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(up param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        try {
          L0: {
            if (!this.q(87)) {
              L1: {
                if ((param0.field_j ^ -1) == -5) {
                  this.field_S = 25;
                  this.field_A = 25;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == -1) {
                  break L2;
                } else {
                  this.q((byte) 16);
                  break L2;
                }
              }
              L3: {
                var3_int = 0;
                if ((param0.field_b ^ -1) <= -4) {
                  var4 = param0.c(-127);
                  if (var4 != 0) {
                    L4: {
                      var5 = param0.e(-98);
                      if (var5 == 14) {
                        this.b(param1 ^ -1, param0.field_c);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.a(var4, (byte) 89, var5);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var3_int = param0.field_b;
              stackIn_22_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("hca.F(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_22_0;
        }
    }

    final int r(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -41 % ((-37 - param0) / 49);
            stackIn_1_0 = 18202625 ^ this.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.OE(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, byte param1, roa param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_i = param2;
              if (param1 < -126) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            L2: {
              if (this.field_i != null) {
                this.field_i.a(param0, (byte) 25);
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
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("hca.EC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_eb = (gma) null;
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hca.OA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public final int g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 115) {
              stackIn_4_0 = this.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 66;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -55) {
                break L1;
              } else {
                this.a(-42, -25, true);
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "hca.RB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final kua o(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        kua stackIn_12_0 = null;
        kua stackIn_14_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_mb;
              if (!this.field_o) {
                break L1;
              } else {
                var2_int = this.field_J.a(var2_int, (byte) 71);
                break L1;
              }
            }
            L2: {
              if (param0 <= -76) {
                break L2;
              } else {
                field_U = (String[]) null;
                break L2;
              }
            }
            L3: {
              if (this.field_lb != 1) {
                break L3;
              } else {
                if ((this.field_r ^ -1) == -5) {
                  stackIn_12_0 = new kua((hca) (this), var2_int, this.field_z, -17825792, this.field_r);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            stackIn_14_0 = new kua((hca) (this), var2_int, this.field_z, 0, this.field_r);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.HD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= 3) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_P[var2_int] = 0;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_v.d(8);
                        this.field_hb = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 15876) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        this.J(0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "hca.TD(" + param0 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0, boolean param1) {
        try {
            this.field_db = param1;
            if (!param0) {
                this.G(118);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.V(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.a((up) null, 58, -120, 50, 126, -106);
                break L1;
              }
            }
            L2: {
              L3: {
                if (1 != this.field_lb) {
                  break L3;
                } else {
                  if (this.field_r != 4) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.D(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public final int g(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -25787) {
              stackIn_4_0 = im.a(this.field_K, this.field_b, 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 58;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final la f(byte param0) {
        la stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 45 / ((0 - param0) / 61);
            stackIn_1_0 = this.field_J;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SA(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final int k(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -79) {
              stackIn_4_0 = this.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 90;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.ID(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int B(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_bb = 42;
                break L1;
              }
            }
            stackIn_4_0 = this.field_d;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RE(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean I(int param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_g == null) {
                  break L3;
                } else {
                  if (2097152 >= this.field_g.c(-57)) {
                    break L3;
                  } else {
                    if (this.field_g.a((byte) 55) <= 2097152) {
                      break L3;
                    } else {
                      stackIn_13_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_13_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CB(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.e(true);
                break L1;
              }
            }
            stackIn_4_0 = this.field_mb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean u(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -25561) {
                break L1;
              } else {
                this.a(91, false);
                break L1;
              }
            }
            stackIn_4_0 = this.d((byte) -98, 5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.QD(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, ac param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == -27496) {
                break L1;
              } else {
                hca.c(117, 34, -84, 122, 125, -27);
                break L1;
              }
            }
            this.field_u = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hca.PD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_mb = param0;
              if (param2 == 76473160) {
                break L1;
              } else {
                this.field_V = false;
                break L1;
              }
            }
            this.field_z = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean s(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.h(45);
                break L1;
              }
            }
            L2: {
              if (this.field_a != 1) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.IE(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 69) {
                break L1;
              } else {
                this.field_D = (int[]) null;
                break L1;
              }
            }
            L2: {
              if ((this.field_lb ^ -1) != -2) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RC(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int m(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -41) {
                break L1;
              } else {
                this.field_d = 111;
                break L1;
              }
            }
            stackIn_4_0 = this.field_H;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.UC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final roa K(int param0) {
        RuntimeException var2 = null;
        roa stackIn_2_0 = null;
        roa stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -163585215) {
              stackIn_4_0 = this.field_i;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (roa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(ue param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0.j((byte) -106);
              if (param1 >= 69) {
                break L1;
              } else {
                this.field_L = false;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var3_int == 0) {
                  break L3;
                } else {
                  if (-4 != (var3_int ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_g == null) {
                break L2;
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_13_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("hca.T(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == 56) {
                break L1;
              } else {
                this.a((la) null, -116, 25, false);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var4_int = 0;
                  if (this.field_b <= 0) {
                    break L4;
                  } else {
                    if (-1 > (param2 ^ -1)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-1 >= (this.field_b ^ -1)) {
                    break L5;
                  } else {
                    if (0 > param2) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (-1 <= (this.field_K ^ -1)) {
                    break L6;
                  } else {
                    if ((param1 ^ -1) < -1) {
                      break L3;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_K >= 0) {
                  break L2;
                } else {
                  if ((param1 ^ -1) <= -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4_int = 1;
              break L2;
            }
            L7: {
              this.field_g.a(80, false, var4_int, this.field_d, this.field_H, 0);
              if (this.field_mb != this.field_X) {
                break L7;
              } else {
                if ((this.field_z ^ -1) == (this.field_k ^ -1)) {
                  this.a(this.field_d, this.field_H, (byte) -103);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "hca.KB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final boolean h(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 18407) {
                break L1;
              } else {
                this.field_d = 52;
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean x(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 68 % ((-19 - param0) / 37);
              if (this.field_a == -1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.PE(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void J(int param0) {
        try {
            this.a(param0, (byte) -103, 65536, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.GB(" + param0 + ')');
        }
    }

    public final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = 2 + 2 * this.field_Q;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -125;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.FD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.o((byte) 45);
                var6_int = this.field_mb;
                var7 = this.field_z;
                var8 = 0;
                if (-1 >= (param2 ^ -1)) {
                  break L2;
                } else {
                  var8 = 1;
                  this.field_mb = this.field_mb + param2;
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 <= (param2 ^ -1)) {
                break L1;
              } else {
                var8 = 1;
                this.field_mb = this.field_mb + param2;
                break L1;
              }
            }
            L3: {
              L4: {
                if (var8 != 0) {
                  break L4;
                } else {
                  this.field_t = this.field_t - 1;
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var9 = this.a(false, 0, param4, param3, param2);
                if (2 == var9) {
                  this.field_H = 0;
                  this.field_V = true;
                  this.field_mb = var6_int;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (1 != var9) {
                  break L6;
                } else {
                  this.field_kb = 5;
                  break L6;
                }
              }
              L7: {
                if ((var9 ^ -1) != -1) {
                  break L7;
                } else {
                  this.field_t = this.field_t - 1;
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_t = 2;
              break L3;
            }
            L8: {
              L9: {
                var8 = 0;
                if (0 <= param0) {
                  break L9;
                } else {
                  var8 = 1;
                  this.field_z = this.field_z + param0;
                  if (var10 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 > (param0 ^ -1)) {
                this.field_z = this.field_z + param0;
                var8 = 1;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              L11: {
                if (var8 == 0) {
                  break L11;
                } else {
                  L12: {
                    L13: {
                      var9 = this.a(false, param0, param4, param3, 0);
                      if (0 != var9) {
                        break L13;
                      } else {
                        this.field_h = this.field_h - 1;
                        if (var10 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_h = 2;
                    break L12;
                  }
                  L14: {
                    if (-2 != (var9 ^ -1)) {
                      break L14;
                    } else {
                      this.field_kb = 5;
                      break L14;
                    }
                  }
                  L15: {
                    if (var9 != 2) {
                      break L15;
                    } else {
                      this.field_z = var7;
                      this.field_d = 0;
                      this.field_V = true;
                      break L15;
                    }
                  }
                  if (var10 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              this.field_h = this.field_h - 1;
              break L10;
            }
            L16: {
              L17: {
                if ((this.field_mb ^ -1) <= (this.field_G / 2 ^ -1)) {
                  break L17;
                } else {
                  this.field_mb = this.field_G / 2;
                  if (var10 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (this.field_mb <= this.field_J.m((byte) -86) + -(this.field_G / 2)) {
                break L16;
              } else {
                this.field_mb = this.field_J.m((byte) -86) - this.field_G / 2;
                break L16;
              }
            }
            L18: {
              if (param1 > 126) {
                break L18;
              } else {
                this.field_e = -23;
                break L18;
              }
            }
            L19: {
              if ((this.field_z ^ -1) >= (this.field_J.s(-125) - this.field_G / 2 ^ -1)) {
                break L19;
              } else {
                this.field_z = this.field_J.s(-121) - this.field_G / 2;
                break L19;
              }
            }
            L20: {
              L21: {
                this.v((byte) 74);
                this.field_t = za.a(0, (byte) 36, 5, this.field_t);
                this.field_h = za.a(0, (byte) 89, 5, this.field_h);
                if ((param2 ^ -1) != -1) {
                  break L21;
                } else {
                  if ((param0 ^ -1) != -1) {
                    break L21;
                  } else {
                    this.field_Y = 5;
                    if (var10 == 0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              this.field_Y = this.field_Y - 1;
              if (this.field_Y >= 0) {
                break L20;
              } else {
                this.field_Y = 0;
                break L20;
              }
            }
            this.field_J.field_u.a((ffa) (this), -86);
            this.field_J.field_u.b((ffa) (this), 7073);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "hca.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = 1;

              stackIn_3_1 = 71;

              stackIn_3_2 = 4;

              if (this.field_t <= 0) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = 0;
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = 2;
                break L1;
              }
            }
            L2: {
              var5_int = za.a(stackIn_4_0, (byte) stackIn_4_1, stackIn_4_2, stackIn_4_3 + 2 * this.field_Y);
              if (param1 > 85) {
                break L2;
              } else {
                this.field_L = false;
                break L2;
              }
            }
            L3: {
              stackIn_10_0 = 1;

              stackIn_10_1 = 74;

              stackIn_10_2 = 4;

              if (-1 > (this.field_h ^ -1)) {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = stackIn_10_2;
                stackIn_11_3 = 2;
                break L3;
              } else {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = stackIn_10_2;
                stackIn_11_3 = 0;
                break L3;
              }
            }
            var6 = za.a(stackIn_11_0, (byte) stackIn_11_1, stackIn_11_2, stackIn_11_3 + 2 * this.field_Y);
            this.field_H = gqa.a(param0, (byte) 24, param2) / var5_int;
            this.field_d = gqa.a(param3, (byte) 24, param2) / var6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "hca.FE(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this == param0.field_g) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.a((byte) 110, param4, param2, param5, param1)) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param3 == 0) {
                    break L1;
                  } else {
                    this.b((byte) -11, 86, 56);
                    break L1;
                  }
                }
                stackIn_14_0 = this.a(param0, -1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("hca.WC(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public final int e(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 9648) {
                break L1;
              } else {
                this.field_S = 6;
                break L1;
              }
            }
            stackIn_4_0 = this.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.RA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 123) {
              stackIn_4_0 = this.field_K;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.CD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final dt C(int param0) {
        RuntimeException var2 = null;
        dt stackIn_2_0 = null;
        dt stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              stackIn_4_0 = this.field_J.a(-1553494544);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (dt) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.OB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, uw param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -37 / ((-23 - param0) / 38);
              if (this.field_u != null) {
                param1.a((byte) -82, 7, this.field_u);
                this.field_u.a(30355, this.field_J);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("hca.BC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        try {
            this.field_x[param1] = param2;
            if (!param0) {
                this.field_bb = 119;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.HE(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -97) {
                break L1;
              } else {
                this.d(125, 118);
                break L1;
              }
            }
            if (this == param0.field_g) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.field_C[2]) {
                var4_int = param1.i(-1);
                if (!this.a((byte) 110, param1.e(9648), param1.d(3), var4_int, var4_int)) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (this.field_J.k((byte) 53)) {
                      break L2;
                    } else {
                      if (-5 != (param0.field_j ^ -1)) {
                        break L2;
                      } else {
                        this.field_H = this.field_H + param1.k(-71) / 8;
                        this.field_d = this.field_d + param1.b(false) / 8;
                        break L2;
                      }
                    }
                  }
                  stackIn_23_0 = this.a(param0, -1);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("hca.SD(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    final int f(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = this.field_z;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -61;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "hca.SB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    hca(int param0) {
        this.field_G = 1572864;
        this.field_fb = new vna();
        this.field_C = new boolean[6];
        this.field_v = new vna();
        this.field_N = 65536;
        this.field_x = new int[3];
        this.field_P = new int[3];
        this.field_a = -1;
        this.field_jb = new on();
        this.field_F = -1;
        this.field_hb = false;
        this.field_cb = 0;
        this.field_w = 0;
        this.field_y = -1;
        this.field_B = 0;
        this.field_D = new int[5];
        this.field_j = 18202625;
        try {
            this.field_Q = param0;
            this.a(-101, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hca.<init>(" + param0 + ')');
        }
    }

    static {
        field_p = new fta();
        field_I = new vna();
        field_U = new String[]{"Banging drums", "Shooting rival", "Uncompressing orchestra", "Performing dramatic piece", "Plotting route to treasure", "Found mum's diary", "Found the Ark", "Escaping mountain fortress", "Ordering MacGuffin", "Getting bored of hieroglyphs...", "Ordering stair lift", "Filling pits with snakes", "Filling pits with lava", "Ordering fragile rope bridges", "Setting dart shooters to kill", "Disregarding historical research", "Pacifying volcano god", "Killing time", "Leaving idols in tomb"};
        field_s = "Bobby-George Totems";
    }
}
