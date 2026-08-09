/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private le field_f;
    private sj field_b;
    private java.net.URL field_i;
    private int field_e;
    static oq field_j;
    private le field_a;
    private ge field_d;
    static String field_c;
    private DataInputStream field_h;
    static int field_g;
    private le field_k;
    static boolean field_l;

    final synchronized boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        java.net.Socket var3 = null;
        IOException var3_ref = null;
        OutputStream var4 = null;
        try {
          L0: {
            if ((this.field_e ^ -1) <= -3) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if ((this.field_e ^ -1) != -1) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_a != null) {
                      break L2;
                    } else {
                      this.field_a = this.field_b.a(this.field_i, 1);
                      break L2;
                    }
                  }
                  if (this.field_a.field_f != 0) {
                    if ((this.field_a.field_f ^ -1) != -2) {
                      this.field_a = null;
                      this.field_e = this.field_e + 1;
                      stackIn_18_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                if (this.field_e != 1) {
                  break L3;
                } else {
                  L4: {
                    if (null != this.field_k) {
                      break L4;
                    } else {
                      this.field_k = this.field_b.a(this.field_i.getHost(), 443, 0);
                      break L4;
                    }
                  }
                  if ((this.field_k.field_f ^ -1) != -1) {
                    if ((this.field_k.field_f ^ -1) == -2) {
                      break L3;
                    } else {
                      this.field_e = this.field_e + 1;
                      this.field_k = null;
                      stackIn_30_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_27_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              L5: {
                var2_int = 25 % ((-61 - param0) / 46);
                if (null != this.field_h) {
                  break L5;
                } else {
                  try {
                    L6: {
                      L7: {
                        if (0 == this.field_e) {
                          this.field_h = (DataInputStream) (this.field_a.field_e);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (1 != this.field_e) {
                          break L8;
                        } else {
                          var3 = (java.net.Socket) (this.field_k.field_e);
                          var3.setSoTimeout(10000);
                          var4 = var3.getOutputStream();
                          var4.write(17);
                          var4.write(hi.a(-98, (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"))));
                          this.field_h = new DataInputStream(var3.getInputStream());
                          break L8;
                        }
                      }
                      this.field_d.field_v = 0;
                      break L6;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L9: {
                      var3_ref = (IOException) (Object) decompiledCaughtException;
                      this.finalize();
                      this.field_e = this.field_e + 1;
                      break L9;
                    }
                  }
                  break L5;
                }
              }
              L10: {
                if (null != this.field_f) {
                  break L10;
                } else {
                  this.field_f = this.field_b.a(45, 5, (Runnable) (this));
                  break L10;
                }
              }
              if (0 == this.field_f.field_f) {
                stackIn_48_0 = 0;
                decompiledRegionSelector0 = 5;
                break L0;
              } else {
                L11: {
                  if (this.field_f.field_f != 1) {
                    this.finalize();
                    this.field_e = this.field_e + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                stackIn_54_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ej.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_48_0 != 0;
                  } else {
                    return stackIn_54_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, eg param1, int param2, boolean param3, int param4, int param5, int param6, int param7, eg param8, eg param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        RuntimeException stackIn_193_0 = null;
        StringBuilder stackIn_193_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_196_2 = null;
        RuntimeException stackIn_197_0 = null;
        StringBuilder stackIn_197_1 = null;
        RuntimeException stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        RuntimeException stackIn_200_0 = null;
        StringBuilder stackIn_200_1 = null;
        String stackIn_200_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        eg var10 = null;
        RuntimeException var10_ref = null;
        eg var11 = null;
        int var12 = 0;
        eg var12_ref_eg = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mj.field_a = param1.field_Y;
                        hi.field_k = param8.field_N;
                        vn.field_h = param8.field_v;
                        kp.field_h = param1;
                        nr.field_P = param8.field_X;
                        ro.field_d = param8.field_q;
                        sa.field_r = param8.field_Y;
                        eh.field_w = param1.field_g;
                        gn.field_e = param8;
                        nk.field_b = param1.field_X;
                        wn.field_d = param1.field_N;
                        qp.field_Yb = param8.field_g;
                        sa.field_w = param1.field_q;
                        f.field_b = param1.field_v;
                        u.a(param0, param4, param6, true, (int[]) null, (int[]) null, param9.field_g, param9.field_N, param5, (int[]) null, param9.field_q, param2, param9.field_K, param9.field_Y, param9.field_Q, param9.field_X, (int[]) null, param7, param9.field_v, param9.field_l, (int[]) null, param9, param9.field_B, (int[]) null);
                        var10 = param8;
                        param1.field_J = null;
                        var10.field_J = null;
                        var11 = param8;
                        param1.field_Z = null;
                        param8.field_X = nr.field_P;
                        param8.field_g = qp.field_Yb;
                        param8.field_B = nk.field_a;
                        param8.field_Y = sa.field_r;
                        param8.field_q = ro.field_d;
                        param8.field_l = ld.field_g;
                        param8.field_M = nj.field_d;
                        param8.field_K = uf.field_W;
                        var11.field_Z = null;
                        param8.field_v = vn.field_h;
                        param8.field_N = hi.field_k;
                        param1.field_N = wn.field_d;
                        param1.field_q = sa.field_w;
                        param1.field_v = f.field_b;
                        param1.field_Y = mj.field_a;
                        param1.field_g = eh.field_w;
                        param1.field_M = vk.field_bb;
                        param1.field_B = de.field_a;
                        param1.field_K = eq.field_R;
                        param1.field_X = nk.field_b;
                        param1.field_l = ja.field_a;
                        if (param9.field_Q == null) {
                            statePc = 31;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param8.field_Q) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param8.field_Q.length ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param8.field_Q = new byte[param8.field_K - -100];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1.field_Q == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((param1.field_Q.length ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param1.field_Q = new byte[100 + param1.field_K];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param8.field_K <= var12) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param8.field_Q[var12] = param9.field_Q[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var13 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var12 ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param1.field_Q[var12] = param9.field_Q[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var13 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var13 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param1.field_Q = null;
                        var12_ref_eg = param8;
                        var12_ref_eg.field_Q = null;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!param3) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        field_j = (oq) null;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param9.field_P != null) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param1.field_P = null;
                        var12_ref_eg = param8;
                        fieldTemp$0 = param9.field_t;
                        param1.field_t = param9.field_t;
                        param8.field_t = fieldTemp$0;
                        var12_ref_eg.field_P = null;
                        if (var13 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param8.field_P == null) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((param8.field_P.length ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param8.field_P = new byte[param8.field_K + 100];
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == param1.field_P) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((param1.field_K ^ -1) >= (param1.field_P.length ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1.field_P = new byte[100 + param1.field_K];
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var12 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var12 ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param8.field_P[var12] = param9.field_P[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var13 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var12 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        param1.field_P[var12] = param9.field_P[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var13 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (null != param9.field_f) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var12_ref_eg = param8;
                        param1.field_f = null;
                        var12_ref_eg.field_f = null;
                        if (var13 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (null == param8.field_f) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (param8.field_K <= param8.field_f.length) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param8.field_f = new byte[param8.field_K + 100];
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (null == param1.field_f) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (param1.field_f.length >= param1.field_K) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        param1.field_f = new byte[param1.field_K + 100];
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var12 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (param8.field_K <= var12) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        param8.field_f[var12] = param9.field_f[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var13 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var12 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var12 ^ -1) <= (param1.field_K ^ -1)) {
                            statePc = 93;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        param1.field_f[var12] = param9.field_f[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var13 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (null == param9.field_k) {
                            statePc = 123;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (null == param8.field_k) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((param8.field_K ^ -1) >= (param8.field_k.length ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param8.field_k = new byte[100 + param8.field_K];
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (null == param1.field_k) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (param1.field_k.length >= param1.field_K) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        param1.field_k = new byte[100 + param1.field_K];
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var12 = 0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((param8.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        param8.field_k[var12] = param9.field_k[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var13 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var12 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        param1.field_k[var12] = param9.field_k[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 124;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var13 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var13 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var12_ref_eg = param8;
                        param1.field_k = null;
                        var12_ref_eg.field_k = null;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (param9.field_n == null) {
                            statePc = 155;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (param8.field_n == null) {
                            statePc = 133;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (param8.field_K > param8.field_n.length) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        param8.field_n = new short[100 + param8.field_K];
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (param1.field_n == null) {
                            statePc = 138;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if ((param1.field_K ^ -1) >= (param1.field_n.length ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        param1.field_n = new short[param1.field_K + 100];
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var12 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var12 >= param8.field_K) {
                            statePc = 146;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        param8.field_n[var12] = param9.field_n[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (var13 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var12 = 0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        param1.field_n[var12] = param9.field_n[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 156;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var13 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (var13 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        param1.field_n = null;
                        var12_ref_eg = param8;
                        var12_ref_eg.field_n = null;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (param9.field_L != null) {
                            statePc = 158;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var12_ref_eg = param8;
                        param1.field_L = null;
                        var12_ref_eg.field_L = null;
                        if (var13 == 0) {
                            statePc = 201;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (param8.field_L == null) {
                            statePc = 164;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if ((param8.field_L.length ^ -1) <= (param8.field_K ^ -1)) {
                            statePc = 166;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        param8.field_L = new short[100 + param8.field_K];
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (null == param1.field_L) {
                            statePc = 172;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if ((param1.field_L.length ^ -1) > (param1.field_K ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        param1.field_L = new short[100 + param1.field_K];
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var12 = 0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (var12 >= param8.field_K) {
                            statePc = 179;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        param8.field_L[var12] = param9.field_L[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 180;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (var13 == 0) {
                            statePc = 174;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var12 = 0;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if ((param1.field_K ^ -1) >= (var12 ^ -1)) {
                            statePc = 201;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        param1.field_L[var12] = param9.field_L[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                            statePc = 201;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (var13 == 0) {
                            statePc = 180;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 188: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_191_0 = (RuntimeException) (var10_ref);
                    stackIn_189_0 = stackIn_191_0;
                    stackIn_191_1 = new StringBuilder().append("ej.C(").append(param0).append(',');
                    stackIn_189_1 = stackIn_191_1;
                    if (param1 == null) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_192_0 = (RuntimeException) ((Object) stackIn_189_0);
                    stackIn_192_1 = (StringBuilder) ((Object) stackIn_189_1);
                    stackIn_192_2 = "{...}";
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = (RuntimeException) ((Object) stackIn_191_0);
                    stackIn_192_1 = (StringBuilder) ((Object) stackIn_191_1);
                    stackIn_192_2 = "null";
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_195_0 = (RuntimeException) ((Object) stackIn_192_0);
                    stackIn_193_0 = stackIn_195_0;
                    stackIn_195_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                    stackIn_193_1 = stackIn_195_1;
                    if (param8 == null) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_196_0 = (RuntimeException) ((Object) stackIn_193_0);
                    stackIn_196_1 = (StringBuilder) ((Object) stackIn_193_1);
                    stackIn_196_2 = "{...}";
                    statePc = 196;
                    continue stateLoop;
                }
                case 195: {
                    stackIn_196_0 = (RuntimeException) ((Object) stackIn_195_0);
                    stackIn_196_1 = (StringBuilder) ((Object) stackIn_195_1);
                    stackIn_196_2 = "null";
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    stackIn_199_0 = (RuntimeException) ((Object) stackIn_196_0);
                    stackIn_197_0 = stackIn_199_0;
                    stackIn_199_1 = ((StringBuilder) (Object) stackIn_196_1).append(stackIn_196_2).append(',');
                    stackIn_197_1 = stackIn_199_1;
                    if (param9 == null) {
                        statePc = 199;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    stackIn_200_0 = (RuntimeException) ((Object) stackIn_197_0);
                    stackIn_200_1 = (StringBuilder) ((Object) stackIn_197_1);
                    stackIn_200_2 = "{...}";
                    statePc = 200;
                    continue stateLoop;
                }
                case 199: {
                    stackIn_200_0 = (RuntimeException) ((Object) stackIn_199_0);
                    stackIn_200_1 = (StringBuilder) ((Object) stackIn_199_1);
                    stackIn_200_2 = "null";
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    throw wm.a((Throwable) ((Object) stackIn_200_0), stackIn_200_2 + ')');
                }
                case 201: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ge a(int param0) {
        RuntimeException var2 = null;
        ge stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -25955) {
              if ((this.field_e ^ -1) != -4) {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = this.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ge) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ej.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return (ge) ((Object) stackIn_7_0);
          }
        }
    }

    public final void run() {
        try {
            int stackIn_13_0 = 0;
            int stackIn_13_1 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            RuntimeException var1_ref2 = null;
            Object var2 = null;
            int var4 = 0;
            var4 = Pool.field_O;
            try {
              L0: {
                try {
                  L1: {
                    L2: while (true) {
                      L3: {
                        L4: {
                          if ((this.field_d.field_t.length ^ -1) >= (this.field_d.field_v ^ -1)) {
                            break L4;
                          } else {
                            var1_int = this.field_h.read(this.field_d.field_t, this.field_d.field_v, this.field_d.field_t.length + -this.field_d.field_v);
                            stackIn_13_0 = -1;

                            stackIn_13_1 = var1_int ^ -1;

                            if (var4 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_13_0 >= stackIn_13_1) {
                                  break L5;
                                } else {
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              this.field_d.field_v = this.field_d.field_v + var1_int;
                              if (var4 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackIn_13_0 = this.field_d.field_t.length ^ -1;
                        stackIn_13_1 = this.field_d.field_v ^ -1;
                        break L3;
                      }
                      if (stackIn_13_0 != stackIn_13_1) {
                        var1 = this;
                        synchronized (var1) {
                          L6: {
                            this.finalize();
                            this.field_e = 3;
                            break L6;
                          }
                        }
                        break L1;
                      } else {
                        throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_t.length + " " + this.field_i));
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var1_ref = (Exception) (Object) decompiledCaughtException;
                    var2 = this;
                    synchronized (var2) {
                      L8: {
                        this.finalize();
                        this.field_e = this.field_e + 1;
                        break L8;
                      }
                    }
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw wm.a((Throwable) ((Object) var1_ref2), "ej.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, oc param4) {
        byte dupTemp$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        try {
          L0: {
            L1: {
              var7 = 101 / ((-47 - param3) / 46);
              var5_int = gi.a(3 * (-param2 + param1), 0);
              var6 = param2 * 3;
              var8 = -10 + var5_int;
              ar.a((byte) 48);
              if (0 >= param4.field_I) {
                break L1;
              } else {
                if (param4.field_K == null) {
                  break L1;
                } else {
                  ka.h(0);
                  break L1;
                }
              }
            }
            eh.field_x = 0;
            var9 = 0;
            L2: while (true) {
              if (param4.field_d <= var9) {
                L3: {
                  if (0 >= param4.field_I) {
                    break L3;
                  } else {
                    if (param4.field_K != null) {
                      var9 = 0;
                      var10 = 0;
                      L4: while (true) {
                        if (wa.field_ib.length <= var10) {
                          break L3;
                        } else {
                          var11 = wa.field_ib[var10];
                          wa.field_ib[var10] = var9;
                          var9 = var9 + var11;
                          var10++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.field_y[var9];
                    var11 = param4.field_r[var9];
                    var12 = param4.field_u[var9];
                    if (param0) {
                      var13 = ch.field_M[var10];
                      var14 = li.field_h[var10];
                      var15 = ch.field_M[var11] - var13;
                      var16 = -var13 + ch.field_M[var12];
                      var17 = -var14 + li.field_h[var11];
                      var18 = li.field_h[var12] - var14;
                      if ((var15 * var18 + -(var16 * var17) ^ -1) > -1) {
                        break L6;
                      } else {
                        break L5;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var13 = fe.field_L[var10];
                  if (-2147483648 != var13) {
                    var14 = fe.field_L[var11];
                    if (var14 == -2147483648) {
                      break L5;
                    } else {
                      var15 = fe.field_L[var12];
                      if ((var15 ^ -1) != 2147483647) {
                        L7: {
                          var16 = -var6 + (var14 + var13 + var15);
                          if (0 > var8) {
                            stackIn_25_0 = var16 << -var8;
                            break L7;
                          } else {
                            stackIn_25_0 = var16 >> var8;
                            break L7;
                          }
                        }
                        var17 = -stackIn_25_0 + (lq.field_T.length - 1);
                        var18 = lq.field_T[var17];
                        L8: while (true) {
                          if ((var18 >> -581151548 ^ -1) == -1) {
                            L9: {
                              var19 = var18 + (var17 << -1406096316);
                              tl.field_I[var19] = var9;
                              lq.field_T[var17] = 1 + var18;
                              if (-1 <= (param4.field_I ^ -1)) {
                                break L9;
                              } else {
                                if (null == param4.field_K) {
                                  break L9;
                                } else {
                                  dupTemp$0 = param4.field_K[var9];
                                  wa.field_ib[dupTemp$0] = wa.field_ib[dupTemp$0] + 1;
                                  break L9;
                                }
                              }
                            }
                            eh.field_x = eh.field_x + 1;
                            break L5;
                          } else {
                            var17--;
                            if (var17 < 0) {
                              System.err.println("Out of range!");
                              break L5;
                            } else {
                              var18 = lq.field_T[var17];
                              continue L8;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var5);

            stackIn_55_1 = new StringBuilder().append("ej.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L10;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L10;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
    }

    protected final void finalize() {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (this.field_a != null) {
                L2: {
                  if (this.field_a.field_e != null) {
                    try {
                      L3: {
                        ((DataInputStream) (this.field_a.field_e)).close();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_a = null;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (null == this.field_k) {
                break L5;
              } else {
                L6: {
                  if (this.field_k.field_e == null) {
                    break L6;
                  } else {
                    try {
                      L7: {
                        ((java.net.Socket) (this.field_k.field_e)).close();
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L8;
                      }
                    }
                    break L6;
                  }
                }
                this.field_k = null;
                break L5;
              }
            }
            L9: {
              if (null == this.field_h) {
                break L9;
              } else {
                try {
                  L10: {
                    this.field_h.close();
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                this.field_h = null;
                break L9;
              }
            }
            this.field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ej.finalize()");
        }
    }

    ej(sj param0, java.net.URL param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i = param1;
            this.field_b = param0;
            this.field_d = new ge(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ej.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
            field_c = null;
            field_j = null;
            if (!param0) {
                field_l = false;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ej.B(" + param0 + ')');
        }
    }

    static {
        field_c = "Please enter a year between <%0> and <%1>";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
