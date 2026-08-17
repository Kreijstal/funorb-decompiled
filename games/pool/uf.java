/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf {
    private int field_B;
    private int field_h;
    private kj field_w;
    private kj[] field_x;
    boolean field_r;
    private hq field_c;
    static int field_X;
    private boolean field_Y;
    static String field_K;
    private boolean field_kb;
    private int[] field_F;
    int field_L;
    private int field_Z;
    private int field_N;
    private int field_p;
    private int field_d;
    int field_db;
    private String[] field_i;
    private int field_k;
    static int field_z;
    private int field_V;
    private int field_Q;
    private boolean field_T;
    private int field_m;
    al field_I;
    static String field_s;
    private boolean field_j;
    int field_S;
    private int field_l;
    private int field_e;
    mm field_eb;
    static String field_J;
    private int field_g;
    static int field_hb;
    private int field_t;
    static int field_jb;
    int field_f;
    kj field_G;
    private static int field_fb;
    private boolean field_bb;
    private boolean field_H;
    private int field_A;
    private int field_u;
    static int field_W;
    static wc field_gb;
    private boolean field_q;
    private kj field_b;
    static byte[][] field_y;
    private mm field_O;
    private int[] field_ib;
    private int field_E;
    private int field_o;
    private int field_a;
    private int field_C;
    private int field_n;
    int field_cb;
    int[] field_ab;
    private int field_P;
    private int field_R;
    private boolean field_D;
    private int field_M;
    private int field_v;
    private int field_U;

    private final void z(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_ib = new int[this.field_I.field_l.length];
              this.field_E = 16 * (-1 + this.field_I.field_l.length);
              if (param0 == 4476) {
                break L1;
              } else {
                this.field_c = (hq) null;
                break L1;
              }
            }
            this.field_U = this.field_E + qh.field_f >> -962455423;
            this.field_n = id.field_a[3].field_z + 18 + id.field_a[5].field_z;
            this.field_P = qh.field_f - this.field_E >> -117616863;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.WD(" + param0 + ')');
        }
    }

    private final String a(String param0, String param1, String param2, String param3, byte param4, int param5, String param6, String param7) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int incrementValue$3 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_44_0 = null;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String stackIn_70_0 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_86_1 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_90_1 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_94_1 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        StringBuilder var12 = null;
        int var13 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == (param5 & 1 << this.field_db)) {
                  break L2;
                } else {
                  if (0 == (this.field_L & hq.field_c)) {
                    break L2;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L1;
            }
            var9_int = stackIn_7_0;
            var10 = new int[this.field_I.field_n];
            var11 = 0;
            var12_int = 0;
            var13 = 0;
            L3: while (true) {
              if (var13 >= this.field_I.field_n) {
                L4: {
                  if (param4 == 61) {
                    break L4;
                  } else {
                    this.field_Q = -77;
                    break L4;
                  }
                }
                if (var11 != 0) {
                  if (-2 != (var11 ^ -1)) {
                    if (var11 == 2) {
                      if (var9_int != 0) {
                        stackIn_44_0 = nr.a(new String[]{this.e(-30360, var10[0]), "<%1>", "<%2>"}, param4 + -62, param3);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        stackIn_42_0 = nr.a(new String[]{this.e(-30360, var10[0]), this.e(-30360, var10[1]), "<%2>"}, -1, param2);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      L5: {
                        var12 = new StringBuilder(128);
                        if (var9_int != 0) {
                          var11--;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var13 = 0;
                      L6: while (true) {
                        if ((var11 ^ -1) >= (var13 ^ -1)) {
                          L7: {
                            stackIn_68_0 = new String[]{var12.toString(), "<%1>", "<%2>"};

                            stackIn_68_1 = -1;

                            if (var9_int == 0) {
                              stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                              stackIn_69_1 = stackIn_68_1;
                              stackIn_69_2 = (String) (param6);
                              break L7;
                            } else {
                              stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                              stackIn_69_1 = stackIn_68_1;
                              stackIn_69_2 = (String) (param0);
                              break L7;
                            }
                          }
                          stackIn_70_0 = nr.a(stackIn_69_0, stackIn_69_1, stackIn_69_2);
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          L8: {
                            L9: {
                              if (0 != var13) {
                                break L9;
                              } else {
                                if (var9_int == 0) {
                                  discarded$0 = var12.append(nr.a(new String[]{this.e(param4 ^ -30379, var10[var13]), "<%1>", "<%2>"}, param4 + -62, en.field_e));
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if ((var13 ^ -1) == (-1 + var11 ^ -1)) {
                              discarded$1 = var12.append(nr.a(new String[]{this.e(-30360, var10[var13]), "<%1>", "<%2>"}, -1, lq.field_N));
                              break L8;
                            } else {
                              discarded$2 = var12.append(nr.a(new String[]{this.e(-30360, var10[var13]), "<%1>", "<%2>"}, -1, bc.field_h));
                              break L8;
                            }
                          }
                          var13++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    if (var9_int != 0) {
                      stackIn_36_0 = (String) (param7);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_34_0 = nr.a(new String[]{this.e(param4 ^ -30379, var10[0]), "<%1>", "<%2>"}, -1, param1);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_28_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L10: {
                  if (-1 != (param5 & 1 << var13 ^ -1)) {
                    L11: {
                      L12: {
                        if (this.field_db != var13) {
                          break L12;
                        } else {
                          if ((this.field_L & hq.field_c ^ -1) == -1) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      incrementValue$3 = var12_int;
                      var12_int++;
                      var10[incrementValue$3] = var13;
                      break L11;
                    }
                    var11++;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var9);

            stackIn_74_1 = new StringBuilder().append("uf.OC(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L13;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');

            if (param1 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L14;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');

            if (param2 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L15;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');

            if (param3 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L16;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_90_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "null";
              break L17;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',');

            if (param7 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L18;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_75_0), stackIn_95_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_28_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_42_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_44_0;
                } else {
                  return stackIn_70_0;
                }
              }
            }
          }
        }
    }

    private final void e(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (iq.field_i) {
                stackIn_4_0 = 1;
                break L1;
              } else {
                stackIn_4_0 = 0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            tk.field_k.field_ab = dq.field_e[var2_int + 0];
            if (!param0) {
              tk.field_k.field_hb = dq.field_e[var2_int + 2];
              tk.field_k.field_xb = dq.field_e[4 - -var2_int];
              tk.field_k.field_yb = dq.field_e[6 + var2_int];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.PC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        int[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            L2: {
              if (-1 < (param0 ^ -1)) {
                param0 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) < -4097) {
                param0 = 4096;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_Q ^ -1) == (param0 ^ -1)) {
                break L4;
              } else {
                var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, param0, (byte) 95, this.field_G.field_h);
                if (null != var3) {
                  this.field_G.field_k = var3[0];
                  this.field_G.field_d = var3[1];
                  this.field_G.field_e = var3[2];
                  this.field_Q = param0;
                  id.field_c.field_g = true;
                  break L4;
                } else {
                  this.m(107);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        qe var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -122 % ((-69 - param0) / 45);
              var3 = this.field_I.j(92);
              if (-1 == (var3.field_u ^ -1)) {
                break L1;
              } else {
                if (!this.field_Y) {
                  break L1;
                } else {
                  L2: {
                    ej.field_j.b(false, 72);
                    var3.a(this.field_I, ej.field_j, -7478);
                    if ((pd.field_i & 2097152L ^ -1L) != -1L) {
                      System.out.println("->C2S_MANHANDLE_BALL: " + vi.a((byte) 108, 16, 4, (long)var3.field_P) + "," + vi.a((byte) 64, 16, 4, (long)var3.field_Q));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_Y = false;
                  this.field_d = 0;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ')');
        }
    }

    private final boolean x(byte param0) {
        qe var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -102) {
                break L1;
              } else {
                this.c(5, true);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = this.field_I.j(52);
                if (0 <= var2.field_M) {
                  break L3;
                } else {
                  if (-1 > (this.field_I.field_y ^ -1)) {
                    break L3;
                  } else {
                    if ((var2.field_u ^ -1) != -1) {
                      break L3;
                    } else {
                      if (!var2.field_E) {
                        stackIn_16_0 = 0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.UA(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void g(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_Y = true;
                break L1;
              }
            }
            this.field_S = -1;
            this.s((byte) -37);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.K(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        try {
            this.field_I.j(109).field_V = (short)param0;
            this.field_I.e((byte) -124);
            this.a(this.field_I.j(param0 + 126), 1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.KD(" + param0 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        int var3_int = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((hq.field_c & this.field_L ^ -1) != -1) {
                break L1;
              } else {
                if (hk.b(-119)) {
                  L2: {
                    if (oe.a(false, hp.field_c)) {
                      break L2;
                    } else {
                      if (ti.field_d == null) {
                        fq.a(param0 + -3661, 21, 0, param1);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var3_int = param1 ? 1 : 0;
                    stackIn_30_0 = -3405;

                    stackIn_30_1 = 19;

                    if (mg.a(true)) {
                      stackIn_31_0 = stackIn_30_0;
                      stackIn_31_1 = stackIn_30_1;
                      stackIn_31_2 = 21;
                      break L3;
                    } else {
                      stackIn_31_0 = stackIn_30_0;
                      stackIn_31_1 = stackIn_30_1;
                      stackIn_31_2 = 0;
                      break L3;
                    }
                  }
                  fq.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, var3_int != 0);
                  break L1;
                } else {
                  if (!oe.a(false, hp.field_c)) {
                    if (null == ti.field_d) {
                      L4: {
                        var3_int = param1 ? 1 : 0;
                        stackIn_21_0 = -3405;

                        stackIn_21_1 = 0;

                        if (!mg.a(true)) {
                          stackIn_22_0 = stackIn_21_0;
                          stackIn_22_1 = stackIn_21_1;
                          stackIn_22_2 = 0;
                          break L4;
                        } else {
                          stackIn_22_0 = stackIn_21_0;
                          stackIn_22_1 = stackIn_21_1;
                          stackIn_22_2 = 21;
                          break L4;
                        }
                      }
                      fq.a(stackIn_22_0, stackIn_22_1, stackIn_22_2, var3_int != 0);
                      break L1;
                    } else {
                      L5: {
                        var3_int = param1 ? 1 : 0;
                        stackIn_16_0 = -3405;

                        stackIn_16_1 = 16;

                        if (!mg.a(true)) {
                          stackIn_17_0 = stackIn_16_0;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 0;
                          break L5;
                        } else {
                          stackIn_17_0 = stackIn_16_0;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 21;
                          break L5;
                        }
                      }
                      fq.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, var3_int != 0);
                      break L1;
                    }
                  } else {
                    L6: {
                      var3_int = param1 ? 1 : 0;
                      stackIn_10_0 = -3405;

                      stackIn_10_1 = 18;

                      if (mg.a(true)) {
                        stackIn_11_0 = stackIn_10_0;
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 21;
                        break L6;
                      } else {
                        stackIn_11_0 = stackIn_10_0;
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 0;
                        break L6;
                      }
                    }
                    fq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, var3_int != 0);
                    break L1;
                  }
                }
              }
            }
            L7: {
              kh.field_gc.a(false);
              if (param0 == 256) {
                break L7;
              } else {
                this.c(-75, -111);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.OD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              var2_int = -121 % ((48 - param0) / 36);
              if ((this.field_S ^ -1) <= -1) {
                break L1;
              } else {
                if (!this.i(-1)) {
                  break L1;
                } else {
                  if (!this.field_I.field_l[this.field_e].field_s) {
                    break L1;
                  } else {
                    L2: {
                      if (-1L != (524288L & pd.field_i ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_I.j(70).field_q != 0) {
                          break L1;
                        } else {
                          if (-1 == (this.field_I.j(55).field_u ^ -1)) {
                            break L1;
                          } else {
                            if (0 != this.field_e) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    L3: {
                      var3 = wn.field_i + -vn.field_b;
                      var4 = -up.field_m + gg.field_f;
                      if ((var3 ^ -1) > 2) {
                        break L3;
                      } else {
                        if ((var3 ^ -1) < -4) {
                          break L3;
                        } else {
                          if ((var4 ^ -1) > 2) {
                            break L3;
                          } else {
                            if (3 < var4) {
                              break L3;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    this.field_V = this.field_e;
                    this.field_H = false;
                    if ((this.field_V ^ -1) != -1) {
                      break L1;
                    } else {
                      if (this.field_T) {
                        this.e(-92);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.ND(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        double[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                this.field_x = (kj[]) null;
                break L1;
              }
            }
            L2: {
              if (this.b(1, 2, false)) {
                var2 = new double[2];
                if (!rq.a(64, ua.field_o, false, this.field_O.d(8), lq.field_W, var2, this.field_ab)) {
                  break L2;
                } else {
                  this.field_O.field_f = var2[0];
                  this.field_O.field_m = var2[1];
                  this.field_O.c((byte) -40);
                  this.field_R = -1;
                  this.field_M = -1;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.JD(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, boolean param2) {
        int stackIn_110_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == 9587) {
                break L1;
              } else {
                this.field_k = -110;
                break L1;
              }
            }
            L2: {
              var4_int = 0;
              if (this.field_T) {
                L3: {
                  if (0 != this.field_I.j(102).field_q) {
                    break L3;
                  } else {
                    if ((param1 ^ -1) != -2) {
                      break L3;
                    } else {
                      if (vj.field_c[82]) {
                        break L3;
                      } else {
                        if (vj.field_c[86]) {
                          break L3;
                        } else {
                          if (vj.field_c[81]) {
                            var4_int = 4;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (this.field_I.j(74).field_q != 0) {
                    break L4;
                  } else {
                    if (-3 != (param1 ^ -1)) {
                      break L4;
                    } else {
                      if (vj.field_c[82]) {
                        break L4;
                      } else {
                        if (vj.field_c[86]) {
                          break L4;
                        } else {
                          if (!vj.field_c[81]) {
                            var4_int = 3;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                if (0 != this.field_I.j(75).field_q) {
                  break L2;
                } else {
                  if ((param1 ^ -1) != -2) {
                    break L2;
                  } else {
                    if (!vj.field_c[82]) {
                      break L2;
                    } else {
                      if (vj.field_c[86]) {
                        break L2;
                      } else {
                        if (vj.field_c[81]) {
                          break L2;
                        } else {
                          var4_int = 3;
                          break L2;
                        }
                      }
                    }
                  }
                }
              } else {
                L5: {
                  if (param1 != 1) {
                    break L5;
                  } else {
                    if (vj.field_c[82]) {
                      break L5;
                    } else {
                      if (vj.field_c[86]) {
                        break L5;
                      } else {
                        if (vj.field_c[81]) {
                          var4_int = 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (-3 != (param1 ^ -1)) {
                    break L6;
                  } else {
                    if (vj.field_c[82]) {
                      break L6;
                    } else {
                      if (vj.field_c[86]) {
                        break L6;
                      } else {
                        if (vj.field_c[81]) {
                          break L6;
                        } else {
                          var4_int = 1;
                          break L6;
                        }
                      }
                    }
                  }
                }
                if (-2 != (param1 ^ -1)) {
                  break L2;
                } else {
                  if (!vj.field_c[82]) {
                    break L2;
                  } else {
                    if (vj.field_c[86]) {
                      break L2;
                    } else {
                      if (vj.field_c[81]) {
                        break L2;
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 != 1) {
                break L7;
              } else {
                if (vj.field_c[82]) {
                  break L7;
                } else {
                  if (vj.field_c[86]) {
                    break L7;
                  } else {
                    if (vj.field_c[81]) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          if (!param2) {
                            break L9;
                          } else {
                            if (-6 == (this.field_t ^ -1)) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (this.g((byte) 124) == -1) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      var4_int = 5;
                      break L7;
                    }
                  }
                }
              }
            }
            stackIn_110_0 = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.SC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_110_0;
    }

    private final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == -69) {
                break L1;
              } else {
                this.field_u = -13;
                break L1;
              }
            }
            L2: {
              if (this.b(1, 4, false)) {
                var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, this.field_Q, (byte) 95, param1);
                if (var3 == null) {
                  this.m(99);
                  break L2;
                } else {
                  this.field_G.field_k = var3[0];
                  this.field_G.field_h = param1;
                  this.field_G.field_d = var3[1];
                  this.field_G.field_e = var3[2];
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.DC(" + param0 + ',' + param1 + ')');
        }
    }

    private final static void a(di param0, int param1, di param2, di param3) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd var4 = null;
        RuntimeException var4_ref = null;
        qb[] var5 = null;
        qb[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        dd var10 = null;
        qb[] var10_array = null;
        dd var11 = null;
        int var11_int = 0;
        dd var12 = null;
        int var13 = 0;
        var13 = Pool.field_O;
        try {
          L0: {
            gr.field_I = aj.a(0, "commonui", param2, "frame_top");
            rb.field_d = aj.a(0, "commonui", param2, "frame_bottom");
            me.field_p = pf.a("commonui", (byte) 124, "jagex_logo_grey", param2);
            jj.field_S = aj.a(0, "commonui", param2, "button");
            bo.field_a = ep.a(param1 ^ -22692, param2, "validation", "commonui");
            qk.field_a = (lr) ((Object) hn.a(param3, "commonui", "arezzo12", -25154, param2));
            lc.field_O = (lr) ((Object) hn.a(param3, "commonui", "arezzo14", -25154, param2));
            bi.field_e = (lr) ((Object) hn.a(param3, "commonui", "arezzo14bold", -25154, param2));
            var4 = new dd(param0.a(false, "", "button.gif"), (java.awt.Component) ((Object) pa.field_K));
            tl.a(param2, 3812, "dropdown", "commonui");
            var5 = gr.a(param2, "commonui", -24155, "screen_options");
            vl.field_l = new qb[4];
            la.field_c = new qb[4];
            sn.field_h = new qb[4];
            var6 = new qb[][]{vl.field_l, sn.field_h, la.field_c};
            var7 = new int[4][];
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              if ((var8 ^ -1) <= (var7.length ^ -1)) {
                var8 = var5[0].field_j[0];
                var7[2][var8] = 16777215;
                var7[1][var8] = 2394342;
                var7[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if ((var9 ^ -1) <= -4) {
                    L3: {
                      var9 = var4.field_A;
                      uc.a((byte) 125);
                      var4.e();
                      qh.e(0, 0, qh.field_l, qh.field_f);
                      var10 = new dd(var9, var9);
                      var10.e();
                      var4.a(0, 0);
                      var11 = new dd(var9, var9);
                      var11.e();
                      var4.a(var9 - var4.field_z, 0);
                      if (param1 == -22764) {
                        break L3;
                      } else {
                        uf.a(26, false, (di) null, (di) null, (di) null);
                        break L3;
                      }
                    }
                    var12 = new dd(var4.field_z - var9 * 2, var9);
                    var12.e();
                    var4.a(-var9, 0);
                    oc.a(112);
                    jj.field_S = new dd[]{var10, var12, var11};
                    break L0;
                  } else {
                    var10_array = var6[var9];
                    var11_int = 0;
                    L4: while (true) {
                      if (var10_array.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var10_array[var11_int] = ud.a(var5[var9], (byte) 91, var7[var11_int]);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var7[0].clone());
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4_ref);

            stackIn_22_1 = new StringBuilder().append("uf.PA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_31_2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fe.a(oa.field_g, -13671, param1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = oa.field_g;
                var5 = param1;
                var4[var5 >> -1524423259] = md.a(var4[var5 >> -1524423259], 1 << rb.b(var5, 31));
                var4 = hp.field_c;
                var5 = param1;
                var4[var5 >> -800513371] = md.a(var4[var5 >> -800513371], 1 << rb.b(var5, 31));
                if (param0 == 104) {
                  break L1;
                } else {
                  this.field_a = 100;
                  break L1;
                }
              }
              L2: {
                ui.field_U.b((byte) 115, new bq(param1));
                gj.a(true, 0, md.field_a[param1], ef.a((String) null, kc.field_d[param1], (byte) 4, (String) null));
                if (!this.field_q) {
                  ad.field_l.b((byte) 84, new i(param1, param2, vm.field_f, wq.field_c, field_fb, dk.field_f + this.field_o));
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.OB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -40) {
                break L1;
              } else {
                this.c(45, -72, -20);
                break L1;
              }
            }
            L2: {
              if (!this.b(0, 6, false)) {
                break L2;
              } else {
                this.a(false, (byte) -114);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.G(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.K(35);
                break L1;
              }
            }
            L2: {
              if (0 < this.field_l) {
                var2_int = -5 + il.field_f.field_w + -5;
                var3 = -14 + il.field_f.field_y;
                var4 = this.b(-16439);
                var5 = fl.field_q.field_ib - il.field_f.field_y >> -1764766495;
                var6 = this.b(this.field_Q, 0, var3);
                qh.a(ho.field_s);
                qh.c(var4 - -5, -var6 + (7 + (var5 + var3)), var2_int + (var4 + 5), var5 - (-7 - var3));
                v.field_c.c(var4, var5);
                qh.b(ho.field_s);
                il.field_f.c(var4, var5);
                if ((2L & pd.field_i) == 0L) {
                  break L2;
                } else {
                  sa.field_h.c("power=" + this.field_Q + ", bar_filled=" + var6, var4, var5, 16777215, 1);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.L(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.i(-1)) {
                break L1;
              } else {
                if (this.field_I.field_o) {
                  break L1;
                } else {
                  if (-1 == (this.field_I.j(36).field_q ^ -1)) {
                    L2: {
                      var2_int = -36 % ((param0 - -15) / 63);
                      if (!this.b(0, 3, false)) {
                        break L2;
                      } else {
                        this.u((byte) 117);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void C(int param0) {
        hh.field_c = true;
        this.field_G = this.field_x[this.field_I.j(57).field_L];
        if (param0 < 15) {
            return;
        }
        try {
            this.field_Q = this.field_G.field_n;
            this.field_h = 0;
            if (null != this.field_b) {
                this.field_b.b((byte) 63);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_281_1 = 0;
        boolean stackIn_295_0 = false;
        int stackIn_396_0 = 0;
        int stackIn_400_0 = 0;
        int stackIn_479_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_294_0;
        long var4_long = 0L;
        int var4_int = 0;
        qe var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4_long = pd.field_i;
              var4_long = var4_long | var4_long >>> -329496096;
              var4_long = var4_long | var4_long << 1235215568;
              var4_long = var4_long | var4_long << 442015112;
              wq.field_c = (int)((long)wq.field_c | var4_long >>> -485280944 & 65280L);
              vm.field_f = (int)((long)vm.field_f | -16777216L & var4_long);
              var6 = -117 % ((param2 - -60) / 47);
              var4_int = this.field_o;
              var5 = var4_int;
              var6 = var5 + dk.field_f;
              var7 = var6 % 7621;
              var6 = (var7 + 2) % 7621 + (-var7 + var6);
              dk.field_f = -var5 + var6;
              field_fb = ((field_fb >>> 1541760240) + 2) % 30484 << -1237914864 | field_fb & 65535;
              var4_int = pa.f(-1);
              if ((vm.field_f & 255) >= var4_int) {
                break L1;
              } else {
                L2: {
                  stackIn_7_0 = -256 & vm.field_f;

                  if ((var4_int ^ -1) < -256) {
                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = 255;
                    break L2;
                  } else {

                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = var4_int;
                    break L2;
                  }
                }
                vm.field_f = stackIn_8_0 + stackIn_8_1;
                break L1;
              }
            }
            L3: {
              if ((sk.field_d & this.field_L ^ -1) == -1) {
                break L3;
              } else {
                this.field_c.f(25);
                if (param0) {
                  break L3;
                } else {
                  param0 = this.field_c.b(99);
                  break L3;
                }
              }
            }
            L4: {
              if ((this.field_L & hq.field_c ^ -1) == -1) {
                break L4;
              } else {
                L5: {
                  if (lc.field_U == null) {
                    break L5;
                  } else {
                    L6: {
                      if (-1 <= (ib.field_r ^ -1)) {
                        lc.field_U.field_hb = ta.field_e;
                        break L6;
                      } else {
                        lc.field_U.field_hb = jh.field_e;
                        break L6;
                      }
                    }
                    lc.field_U.field_hb.field_B = 5;
                    lc.field_U.field_hb.field_G = 9;
                    lc.field_U.field_Db = lc.field_U.field_hb.field_A + 5 - -5;
                    lc.field_U.field_gb = 9 + (lc.field_U.field_hb.field_z + 9);
                    lc.field_U.field_eb = fl.field_q.field_ib - 5 + -lc.field_U.field_hb.field_A + -5;
                    break L5;
                  }
                }
                if (!un.field_b) {
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if ((this.field_L & hq.field_c ^ -1) == -1) {
                break L7;
              } else {
                if (!param1) {
                  break L7;
                } else {
                  if (rg.field_p) {
                    break L7;
                  } else {
                    lc.field_U.a(true, false);
                    if (-2 == (lc.field_U.field_R ^ -1)) {
                      L8: {
                        param0 = true;
                        if (un.field_b) {
                          stackIn_44_0 = 0;
                          break L8;
                        } else {
                          stackIn_44_0 = 1;
                          break L8;
                        }
                      }
                      un.field_b = stackIn_44_0 != 0;
                      if (-1 == this.field_M) {
                        break L7;
                      } else {
                        this.b(false, 22, this.field_M);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L9: {
              if (param1) {
                L10: {
                  L11: {
                    if (0 == (this.field_L & hq.field_c)) {
                      break L11;
                    } else {
                      if (rg.field_p) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (!this.i(-1)) {
                    break L10;
                  } else {
                    if (-1 >= (this.field_S ^ -1)) {
                      break L10;
                    } else {
                      this.J(0);
                      break L10;
                    }
                  }
                }
                L12: {
                  tk.field_k.a(true, false);
                  if (param0) {
                    break L12;
                  } else {
                    if (tk.field_k.field_R == 1) {
                      L13: {
                        if (iq.field_i) {
                          stackIn_72_0 = 0;
                          break L13;
                        } else {
                          stackIn_72_0 = 1;
                          break L13;
                        }
                      }
                      iq.field_i = stackIn_72_0 != 0;
                      param0 = true;
                      this.e(false);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if (this.field_T) {
                    L15: {
                      L16: {
                        if (wn.field_i != this.field_p) {
                          break L16;
                        } else {
                          if (this.field_g != gg.field_f) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.f(false);
                      if ((this.field_e ^ -1) != -1) {
                        break L15;
                      } else {
                        this.a(-119, gg.field_f, wn.field_i);
                        break L15;
                      }
                    }
                    if (0 == this.field_e) {
                      break L14;
                    } else {
                      discarded$0 = this.a(false, this.field_G.field_e * 3 / 4, this.field_G.field_d * 3 / 4);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                L17: {
                  if (param0) {
                    break L17;
                  } else {
                    if (!this.h(3460)) {
                      break L17;
                    } else {
                      param0 = true;
                      break L17;
                    }
                  }
                }
                L18: {
                  if (!e.a(-19839, (uf) (this))) {
                    break L18;
                  } else {
                    L19: {
                      var4 = this.field_I.j(70);
                      if ((hq.field_c & this.field_L ^ -1) != -1) {
                        ej.field_j.b(false, 71);
                        var4.a(ej.field_j, (byte) 0);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (var4.d(126)) {
                        break L20;
                      } else {
                        this.field_I.f((byte) 38);
                        this.b(127, var4);
                        break L20;
                      }
                    }
                    param0 = true;
                    break L18;
                  }
                }
                L21: {
                  if (vj.field_c[82]) {
                    break L21;
                  } else {
                    if (!vj.field_c[86]) {
                      if (cd.field_b == 1) {
                        L22: {
                          var4_int = this.field_o;
                          wq.field_c = ((65535 & wq.field_c) + 2) % 31676 | wq.field_c & -65536;
                          var5 = var4_int;
                          var6 = dk.field_f - -var5;
                          var7 = var6 % 7621;
                          var8 = var6 / 7621;
                          var6 = var7 + (var8 - -2) % 31676 * 7621;
                          dk.field_f = -var5 + var6;
                          var4_int = this.field_o;
                          field_fb = 65535 & field_fb | (16 + (field_fb >>> -1950244048)) % 30484 << -1941399856;
                          var5 = var4_int;
                          var6 = dk.field_f + var5;
                          var7 = var6 % 7621;
                          var6 = -var7 + (var6 - -((16 + var7) % 7621));
                          dk.field_f = -var5 + var6;
                          if (param0) {
                            break L22;
                          } else {
                            if ((pd.field_i & 1L) == 0L) {
                              break L22;
                            } else {
                              if (!ti.a((byte) 94)) {
                                break L22;
                              } else {
                                param0 = true;
                                break L22;
                              }
                            }
                          }
                        }
                        L23: {
                          if (param0) {
                            break L23;
                          } else {
                            if (of.field_Ob >= lq.field_W) {
                              break L23;
                            } else {
                              if ((of.field_Ob - -no.field_q.field_w ^ -1) >= (lq.field_W ^ -1)) {
                                break L23;
                              } else {
                                if (ua.field_o <= fm.field_M) {
                                  break L23;
                                } else {
                                  if ((ua.field_o ^ -1) > (fm.field_M - -no.field_q.field_y ^ -1)) {
                                    param0 = true;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (param0) {
                          break L21;
                        } else {
                          if (1 != ne.field_s) {
                            if (this.field_H) {
                              this.l(-72);
                              break L21;
                            } else {
                              if (0 == (this.field_V ^ -1)) {
                                break L21;
                              } else {
                                this.w((byte) 112);
                                break L21;
                              }
                            }
                          } else {
                            L24: {
                              if (this.field_T) {
                                break L24;
                              } else {
                                this.f(false);
                                break L24;
                              }
                            }
                            if (this.field_e != -1) {
                              vn.field_b = wn.field_i;
                              this.field_H = true;
                              up.field_m = gg.field_f;
                              break L21;
                            } else {
                              L25: {
                                if (this.field_T) {
                                  this.e(-69);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              this.e((byte) 11);
                              break L21;
                            }
                          }
                        }
                      } else {
                        if ((cd.field_b ^ -1) == -1) {
                          L26: {
                            if (!this.field_H) {
                              break L26;
                            } else {
                              if (!this.field_T) {
                                this.f(false);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          }
                          L27: {
                            if (!this.field_H) {
                              break L27;
                            } else {
                              L28: {
                                if (!this.field_T) {
                                  L29: {
                                    if ((this.field_S ^ -1) <= -1) {
                                      break L29;
                                    } else {
                                      if (0 != this.field_e) {
                                        break L29;
                                      } else {
                                        this.a((byte) 78);
                                        break L28;
                                      }
                                    }
                                  }
                                  this.e((byte) 11);
                                  break L28;
                                } else {
                                  if ((this.field_e ^ -1) == -1) {
                                    this.A(1);
                                    break L28;
                                  } else {
                                    this.e(-98);
                                    this.e((byte) 11);
                                    break L28;
                                  }
                                }
                              }
                              this.field_H = false;
                              break L27;
                            }
                          }
                          this.field_V = -1;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L30: {
                  if ((wp.field_d ^ -1) == -1) {
                    break L30;
                  } else {
                    if (!fl.field_q.field_W) {
                      L31: {
                        var4_int = 0;
                        if (!this.i(-1)) {
                          break L31;
                        } else {
                          L32: {
                            if (var4_int != 0) {
                              break L32;
                            } else {
                              if ((pd.field_i & 1L) == 0L) {
                                break L32;
                              } else {
                                if (!bi.a((byte) -92)) {
                                  break L32;
                                } else {
                                  var4_int = 1;
                                  break L32;
                                }
                              }
                            }
                          }
                          if (var4_int != 0) {
                            break L31;
                          } else {
                            if (this.I(122)) {
                              var4_int = 1;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      if (var4_int == 0) {
                        discarded$1 = this.b((byte) -118);
                        break L30;
                      } else {
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                }
                if (!this.i(-1)) {
                  break L9;
                } else {
                  if (-1 == (this.field_I.j(65).field_q ^ -1)) {
                    L33: {
                      if (!this.field_I.a(this.field_G.field_e, this.field_G.field_h, this.field_G.field_k, 359, this.field_Q, this.field_G.field_d)) {
                        var4_array = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, this.field_Q, (byte) 95, this.field_G.field_h);
                        if (var4_array != null) {
                          this.field_G.field_d = var4_array[1];
                          this.field_G.field_e = var4_array[2];
                          this.field_G.field_k = var4_array[0];
                          break L33;
                        } else {
                          this.m(110);
                          break L33;
                        }
                      } else {
                        break L33;
                      }
                    }
                    this.d((byte) -47);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
            L34: {
              if ((this.field_L & hq.field_c) == 0) {
                break L34;
              } else {
                if (this.i(-1)) {
                  break L34;
                } else {
                  if (this.field_b.a(false)) {
                    L35: {
                      this.field_G.c(255, this.field_b);
                      if (!this.field_G.a(-2043, this.field_b)) {
                        break L35;
                      } else {
                        this.field_b.b((byte) 94);
                        break L35;
                      }
                    }
                    hh.field_c = true;
                    id.field_c.field_g = true;
                    break L34;
                  } else {
                    break L34;
                  }
                }
              }
            }
            L36: {
              L37: {
                if (!param1) {
                  break L37;
                } else {
                  if (!this.field_T) {
                    break L37;
                  } else {
                    if (this.field_e != 0) {
                      break L37;
                    } else {
                      if (!this.i(-1)) {
                        break L37;
                      } else {
                        lg.field_s.a(false, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -46)));
                        break L36;
                      }
                    }
                  }
                }
              }
              lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -83)));
              break L36;
            }
            L38: {
              this.u(-114);
              var4_int = f.field_g;
              if ((var4_int ^ -1) < (vm.field_f & 255 ^ -1)) {
                L39: {
                  stackIn_280_0 = vm.field_f & -256;

                  if (-256 <= (var4_int ^ -1)) {
                    stackIn_281_0 = stackIn_280_0;
                    stackIn_281_1 = var4_int;
                    break L39;
                  } else {
                    stackIn_281_0 = stackIn_280_0;
                    stackIn_281_1 = 255;
                    break L39;
                  }
                }
                vm.field_f = stackIn_281_0 + stackIn_281_1;
                break L38;
              } else {
                break L38;
              }
            }
            L40: {
              L41: {
                var4 = this.field_I.j(71);
                if (!ne.field_r.c(0)) {
                  break L41;
                } else {
                  if (-1 == (this.field_L & sk.field_d ^ -1)) {
                    L42: {
                      if (!this.field_I.field_o) {
                        var6 = 0;
                        var7 = 0;
                        L43: while (true) {
                          if (this.field_I.field_n <= var7) {
                            L44: {
                              var5_ref_String = this.a(rk.field_e, qe.field_F, mg.field_a, sl.field_W, (byte) 61, var6, jl.field_b, vj.field_g);
                              if (var5_ref_String == null) {
                                break L44;
                              } else {
                                em.a((byte) 127, false, 1, var5_ref_String);
                                break L44;
                              }
                            }
                            L45: {
                              var5_ref_String = this.a(wj.field_U, ah.field_b, w.field_e, bl.field_j, (byte) 61, this.field_I.field_p & (var6 ^ -1), dl.field_i, cd.field_c);
                              if (var5_ref_String != null) {
                                em.a((byte) 124, false, 1, var5_ref_String);
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            var5_ref_String = this.a(jk.field_f, rn.field_h, rg.field_o, qp.field_bc, (byte) 61, this.field_I.field_x, fd.field_H, ae.field_f);
                            if (var5_ref_String == null) {
                              break L42;
                            } else {
                              em.a((byte) 119, false, 1, var5_ref_String);
                              break L42;
                            }
                          } else {
                            stackOut_294_0 = this.field_I.field_f.a((byte) 94, var7);
                            stackIn_396_0 = stackOut_294_0 ? 1 : 0;
                            stackIn_295_0 = stackOut_294_0;
                            L46: {
                              if (!stackIn_295_0) {
                                var6 = var6 | 1 << var7;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            var7++;
                            continue L43;
                          }
                        }
                      } else {
                        var5_ref_String = this.a(o.field_B, p.field_k, hp.field_e, pq.field_D, (byte) 61, this.field_I.field_b, ee.field_a, kb.field_f);
                        if (var5_ref_String == null) {
                          break L42;
                        } else {
                          em.a((byte) 122, false, 1, var5_ref_String);
                          break L42;
                        }
                      }
                    }
                    if (0 == var4.field_q) {
                      if (this.i(-1)) {
                        if (!this.field_T) {
                          fieldTemp$2 = (1 + mk.field_b) % 4;
                          mk.field_b = (1 + mk.field_b) % 4;
                          var6 = fieldTemp$2;
                          if (var6 != 0) {
                            if ((var6 ^ -1) != -2) {
                              if ((var6 ^ -1) == -3) {
                                em.a((byte) 127, true, 1, pm.field_o);
                                break L41;
                              } else {
                                if ((var6 ^ -1) == -4) {
                                  em.a((byte) 119, true, 1, sa.field_l);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            } else {
                              em.a((byte) 117, true, 1, sm.field_B);
                              break L41;
                            }
                          } else {
                            em.a((byte) 127, true, 1, ah.field_h);
                            break L41;
                          }
                        } else {
                          fieldTemp$3 = (mk.field_b + 1) % 5;
                          mk.field_b = (mk.field_b + 1) % 5;
                          var6 = fieldTemp$3;
                          if (-1 != (var6 ^ -1)) {
                            if (-2 == (var6 ^ -1)) {
                              em.a((byte) 126, true, 1, gk.field_lb);
                              break L41;
                            } else {
                              if (2 == var6) {
                                em.a((byte) 119, true, 1, sf.field_z);
                                break L41;
                              } else {
                                if (var6 == 3) {
                                  em.a((byte) 117, true, 1, em.field_O);
                                  break L41;
                                } else {
                                  if (4 != var6) {
                                    break L41;
                                  } else {
                                    if ((var4.field_u ^ -1) != -1) {
                                      em.a((byte) 119, true, 1, up.field_L);
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            em.a((byte) 118, true, 1, field_s);
                            break L41;
                          }
                        }
                      } else {
                        fieldTemp$4 = (1 + mk.field_b) % 4;
                        mk.field_b = (1 + mk.field_b) % 4;
                        var6 = fieldTemp$4;
                        if ((var6 ^ -1) != -1) {
                          if (1 == var6) {
                            em.a((byte) 119, true, 1, pm.field_o);
                            break L41;
                          } else {
                            break L41;
                          }
                        } else {
                          em.a((byte) 119, true, 1, sm.field_B);
                          break L41;
                        }
                      }
                    } else {
                      break L41;
                    }
                  } else {
                    break L41;
                  }
                }
              }
              ie.a(false, (no.field_q.field_y >> 356222177) + fm.field_M, 300);
              stackIn_396_0 = -1;
              break L40;
            }
            L47: {
              if (stackIn_396_0 <= (this.field_o ^ -1)) {
                stackIn_400_0 = 0;
                break L47;
              } else {
                stackIn_400_0 = this.field_o;
                break L47;
              }
            }
            L48: {
              var5 = stackIn_400_0;
              if (0 == (f.field_f & this.field_L)) {
                break L48;
              } else {
                if (0 > this.field_o) {
                  break L48;
                } else {
                  if (!this.field_I.field_o) {
                    this.field_o = this.field_o + 1;
                    break L48;
                  } else {
                    break L48;
                  }
                }
              }
            }
            L49: {
              var6 = var4.field_q;
              if ((var6 ^ -1) != -1) {
                if (-2 != (var6 ^ -1)) {
                  if (2 == var6) {
                    if (0 == (hq.field_c & this.field_L)) {
                      break L49;
                    } else {
                      if (!var4.d(116)) {
                        break L49;
                      } else {
                        if (1 >= this.field_o) {
                          break L49;
                        } else {
                          this.field_o = this.field_o - 1;
                          break L49;
                        }
                      }
                    }
                  } else {
                    if (var6 == 3) {
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                } else {
                  this.a(-65, var4);
                  break L49;
                }
              } else {
                this.b(var4, -17601);
                break L49;
              }
            }
            L50: {
              if (this.field_T) {
                this.field_O.a((uf) (this), 1);
                if (this.field_Q == 0) {
                  break L50;
                } else {
                  if (-6 == (this.field_t ^ -1)) {
                    break L50;
                  } else {
                    if (-5 == (this.field_t ^ -1)) {
                      break L50;
                    } else {
                      L51: {
                        if ((this.field_I.j(112).field_q ^ -1) == -1) {
                          this.b(this.field_G.field_n - -(int)(0.5 + 192.0 * Math.sin(3.141592653589793 * (double)this.field_h * 2.0 / 150.0)), true);
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                      if (0L == (pd.field_i & 1024L)) {
                        this.field_h = this.field_h + 1;
                        break L50;
                      } else {
                        this.field_h = 0;
                        break L50;
                      }
                    }
                  }
                }
              } else {
                break L50;
              }
            }
            L52: {
              if (this.field_R != -1) {
                L53: {
                  fieldTemp$5 = this.field_R + 1;
                  this.field_R = this.field_R + 1;
                  if (400 >= fieldTemp$5) {
                    break L53;
                  } else {
                    this.field_R = 0;
                    break L53;
                  }
                }
                this.field_O.b((double)this.field_R * 3.141592653589793 * 2.0 / 400.0, 2.356194490192345, (double)this.field_a, -6861);
                this.field_D = true;
                break L52;
              } else {
                break L52;
              }
            }
            L54: {
              if (!this.field_eb.a(this.field_O, (byte) -78)) {
                break L54;
              } else {
                this.field_D = true;
                break L54;
              }
            }
            L55: {
              if ((this.field_o ^ -1) < -1) {
                stackIn_479_0 = this.field_o;
                break L55;
              } else {
                stackIn_479_0 = 0;
                break L55;
              }
            }
            L56: {
              var6 = stackIn_479_0;
              if (0 < this.field_S) {
                this.field_S = this.field_S - 1;
                if (-1 != (this.field_S ^ -1)) {
                  break L56;
                } else {
                  if (0 == (hq.field_c & this.field_L)) {
                    this.s((byte) -101);
                    this.field_S = -1;
                    break L56;
                  } else {
                    ej.field_j.b(false, 73);
                    break L56;
                  }
                }
              } else {
                break L56;
              }
            }
            L57: {
              var7 = -1;
              if (-1 != (this.field_L & sk.field_d ^ -1)) {
                var7 = pm.a(-27011);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              if ((var7 ^ -1) != 0) {
                break L58;
              } else {
                var7 = this.f(1163);
                if (q.field_b.field_R == 0) {
                  break L58;
                } else {
                  this.y((byte) 75);
                  break L58;
                }
              }
            }
            L59: {
              if (0 == (sk.field_d & this.field_L)) {
                break L59;
              } else {
                if (-1 != var7) {
                  break L59;
                } else {
                  this.field_c.field_h.c(-62);
                  if (this.field_c.field_h.field_q == null) {
                    break L59;
                  } else {
                    var7 = 256 | this.field_c.field_h.field_q.field_p;
                    break L59;
                  }
                }
              }
            }
            L60: {
              se.field_l = 12;
              eo.field_Vb = 12;
              jo.g(0, var7);
              if (!q.field_b.field_pb) {
                break L60;
              } else {
                if (!q.field_b.field_W) {
                  break L60;
                } else {
                  if (-1 != dp.a(104)) {
                    this.y((byte) -108);
                    break L60;
                  } else {
                    break L60;
                  }
                }
              }
            }
            L61: {
              ea.field_p = ea.field_p + 1;
              ea.field_p = ea.field_p & 31;
              this.m((byte) 127);
              kh.field_gc.a(10, (uf) (this));
              dq.field_a.h(-56);
              ep.a((byte) -73, (uf) (this));
              this.w(87);
              if (-1 != (eo.field_Tb % 100 ^ -1)) {
                break L61;
              } else {
                this.d(0);
                break L61;
              }
            }
            L62: {
              wc.b(127);
              if ((var6 ^ -1) < (var5 ^ -1)) {
                dk.field_f = dk.field_f + (-var6 + var5);
                break L62;
              } else {
                break L62;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.AD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(ge param0, boolean param1) {
        RuntimeException runtimeException = null;
        ge var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              var3 = param0;
              this.field_o = var3.d(-1034);
              this.field_I.a(2, param0);
              this.s((byte) -43);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("uf.GB(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(qe param0, byte param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (-1 == (param0.field_s & ag.field_e ^ -1)) {
                if (0 == (param0.field_s & hm.field_e)) {
                  break L1;
                } else {
                  kh.field_gc.a(11, 128, (byte) 96, 128);
                  break L1;
                }
              } else {
                kh.field_gc.a(12, 128, (byte) -123, 128);
                break L1;
              }
            }
            L2: {
              if (param1 == -28) {
                break L2;
              } else {
                this.field_eb = (mm) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("uf.NA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(ge param0, int param1) {
        try {
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException decompiledCaughtException = null;
            qe var3 = null;
            RuntimeException var3_ref = null;
            int var4 = 0;
            int var5 = 0;
            var5 = Pool.field_O;
            try {
              L0: {
                L1: {
                  var3 = this.field_I.j(62);
                  if (param1 == 0) {
                    break L1;
                  } else {
                    this.field_I = (al) null;
                    break L1;
                  }
                }
                L2: {
                  var4 = var3.c((byte) -28, param0);
                  if (var4 == 0) {
                    L3: {
                      if (1 > var3.field_q) {
                        if (var3.field_V > 0) {
                          this.B((byte) 17);
                          break L3;
                        } else {
                          this.field_I.e((byte) 85);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    this.field_j = true;
                    break L2;
                  } else {
                    if (-2 == (var4 ^ -1)) {
                      tc.a(new Throwable(), "Wrong shot!", -8555);
                      dn.c(-115);
                      break L2;
                    } else {
                      if (2 != var4) {
                        break L2;
                      } else {
                        L4: {
                          if (var3.field_q == 1) {
                            gj.a(true, 0, "Just too late!", (String) null);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (-1 > (var3.field_V ^ -1)) {
                          this.B((byte) 17);
                          break L2;
                        } else {
                          this.field_I.e((byte) -114);
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var3_ref = decompiledCaughtException;
                stackIn_45_0 = (RuntimeException) (var3_ref);

                stackIn_45_1 = new StringBuilder().append("uf.BB(");

                if (param0 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L5;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L5;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.a(param0, true, wn.field_i, gg.field_f);
              if (!this.field_H) {
                break L1;
              } else {
                if ((cd.field_b ^ -1) != -2) {
                  break L1;
                } else {
                  if (this.field_e == var2_int) {
                    break L1;
                  } else {
                    this.field_H = false;
                    break L1;
                  }
                }
              }
            }
            this.field_e = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.JE(" + param0 + ')');
        }
    }

    private final void c(qe param0, int param1) {
        ge stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ge stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ge var3 = null;
        RuntimeException var3_ref = null;
        al var4 = null;
        ge var5 = null;
        int var6 = 0;
        try {
          L0: {
            this.b(param0, (byte) 93);
            var3 = new ge(this.field_I.a(-1) + 8);
            var3.a(true, f.field_g);
            var4 = this.field_I;
            var5 = var3;
            var5.a(var4.field_l.length, false);
            var6 = 0;
            L1: while (true) {
              if (var4.field_l.length <= var6) {
                if (param1 < -124) {
                  var6 = 0;
                  L2: while (true) {
                    if ((var6 ^ -1) <= (var4.field_w.length ^ -1)) {
                      L3: {
                        stackIn_13_0 = (ge) (var3);

                        stackIn_13_1 = 1;

                        if (pq.field_B != null) {
                          stackIn_14_0 = (ge) ((Object) stackIn_13_0);
                          stackIn_14_1 = stackIn_13_1;
                          stackIn_14_2 = pq.field_B.length;
                          break L3;
                        } else {
                          stackIn_14_0 = (ge) ((Object) stackIn_13_0);
                          stackIn_14_1 = stackIn_13_1;
                          stackIn_14_2 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        ((ge) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2);
                        param0.field_x = ii.a(var3.field_t, var3.field_v, 0, 154302664);
                        if ((this.field_L & hq.field_c ^ -1) != -1) {
                          break L4;
                        } else {
                          if (0 == (this.field_I.field_q ^ -1)) {
                            break L4;
                          } else {
                            this.field_o = wn.field_f[this.field_I.field_q];
                            break L4;
                          }
                        }
                      }
                      L5: {
                        this.b((int) param0.field_V, true);
                        if ((this.field_L & hq.field_c) == 0) {
                          this.a(param0, 1);
                          break L5;
                        } else {
                          ej.field_j.b(false, 69);
                          ej.field_j.a(param0.field_x, (byte) -127);
                          break L5;
                        }
                      }
                      id.field_c.field_g = true;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4.field_w[var6].a(var5, 0);
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4.field_l[var6].a(0, var5);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3_ref);

            stackIn_29_1 = new StringBuilder().append("uf.DD(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(String[] param0, int param1, int param2, int param3) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            hp.field_c = ek.a(120);
            var5_int = -61 / ((-59 - param2) / 38);
            this.field_I = new al(param3, param1, param0, -1);
            this.field_F = new int[this.field_I.field_h.length];
            this.field_i = new String[this.field_I.field_h.length];
            this.field_x = new kj[param0.length];
            var6 = 0;
            L1: while (true) {
              if (this.field_x.length <= var6) {
                L2: {
                  this.z(4476);
                  if (this.field_G == null) {
                    this.field_G = this.field_x[0];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != this.field_I.field_q) {
                    this.field_o = wn.field_f[this.field_I.field_q];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  oh.field_h = false;
                  if (0 == (f.field_f & this.field_L)) {
                    break L4;
                  } else {
                    this.field_o = -1;
                    break L4;
                  }
                }
                break L0;
              } else {
                this.field_x[var6] = new kj();
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("uf.QD(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -106 % ((param0 - -69) / 46);
            if (!this.b(1, 1, false)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_R = -1;
              var3 = Math.max(12.0, this.field_eb.d(8) * ((double)wp.field_d / 32.0 + 1.0));
              this.field_eb.a(true, var3);
              this.field_O.a(true, var3);
              this.field_D = true;
              this.field_M = -1;
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    private final void B(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        pq var4 = null;
        try {
          L0: {
            qh.a(bk.field_w);
            qh.c(t.field_e + gg.field_b[3].field_z, (fl.field_q.field_ib >> 1785353441) + -240 + this.field_P - 16, t.field_e - -gg.field_b[3].field_z + 18, -240 - (-(fl.field_q.field_ib >> -1409205695) - 16) + this.field_U);
            fb.a();
            fb.b(320 - -t.field_e, fl.field_q.field_ib >> 1262481057);
            var2_int = 0;
            L1: while (true) {
              if (this.field_C <= var2_int) {
                L2: {
                  if (param0 == 32) {
                    break L2;
                  } else {
                    this.field_G = (kj) null;
                    break L2;
                  }
                }
                L3: {
                  qh.b(bk.field_w);
                  fb.a();
                  fb.b(320, 240);
                  nj.a(id.field_a, (byte) -82, this.field_n, t.field_e, -240 + (fl.field_q.field_ib >> 543444769) + -8 + this.field_P - id.field_a[1].field_y, 16 + (this.field_E - (-id.field_a[1].field_y + -id.field_a[7].field_y)));
                  if (0L == (pd.field_i & 268435456L)) {
                    break L3;
                  } else {
                    var2 = null;
                    var3 = 0;
                    L4: while (true) {
                      if (this.field_C <= var3) {
                        if (var2 != null) {
                          sa.field_h.d((String) (var2), 40, 400, 13421772, 3355443);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (null != var2) {
                            var2 = (String) (var2) + ", " + this.field_ib[var3];
                            break L5;
                          } else {
                            var2 = "rack: " + this.field_ib[var3];
                            break L5;
                          }
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  var3 = this.field_ib[var2_int];
                  var4 = this.field_I.field_l[var3];
                  if (!var4.field_p) {
                    break L6;
                  } else {
                    var4.i(param0 ^ 34);
                    dq.field_a.a(false, var4.field_G, var3);
                    break L6;
                  }
                }
                dq.field_a.a(param0 + -1912602401, var3, var4.field_G, sa.field_m, false);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (var2), "uf.HA(" + param0 + ')');
        }
    }

    final void d(int param0, ge param1) {
        qe var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == 4096) {
                break L1;
              } else {
                this.e(false);
                break L1;
              }
            }
            L2: {
              var3 = this.field_I.j(param0 + -4029);
              var3.b((byte) 111, param1);
              if (var3.d(param0 + -3985)) {
                break L2;
              } else {
                this.field_I.f((byte) 78);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("uf.JB(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void s(byte param0) {
        oh.field_h = false;
        this.C(120);
        this.l((byte) -37);
        if (param0 > -23) {
            return;
        }
        try {
            this.r(-14034);
            this.y((byte) -99);
            if (dq.field_a instanceof ul) {
                ((ul) ((Object) dq.field_a)).a(this.field_I.j(108).field_I, (byte) -37, this.field_I.field_l);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.P(" + param0 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        Object stackIn_23_0 = null;
        int[] stackIn_26_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param4 == 95) {
                break L1;
              } else {
                this.b(false, 33, 64);
                break L1;
              }
            }
            L2: while (true) {
              if (this.field_I.a(param0, param5, param2, 359, param3, param1)) {
                stackIn_26_0 = new int[]{param2, param1, param0};
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var7_int = 1;
                  if (-97 < (param0 ^ -1)) {
                    var7_int = 0;
                    param0++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: while (true) {
                  L5: {
                    if ((param0 * param0 + param1 * param1 ^ -1) >= -9217) {
                      break L5;
                    } else {
                      if ((param1 ^ -1) >= -1) {
                        if (-1 >= (param1 ^ -1)) {
                          var7_int = 1;
                          break L5;
                        } else {
                          param1++;
                          var7_int = 0;
                          continue L4;
                        }
                      } else {
                        var7_int = 0;
                        param1--;
                        continue L4;
                      }
                    }
                  }
                  L6: {
                    if (var7_int == 0) {
                      break L6;
                    } else {
                      if (-769 >= (param2 ^ -1)) {
                        break L6;
                      } else {
                        var7_int = 0;
                        param2++;
                        break L6;
                      }
                    }
                  }
                  if (var7_int == 0) {
                    continue L2;
                  } else {
                    stackIn_23_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var7), "uf.LD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_23_0);
        } else {
          return stackIn_26_0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_I.j(31).field_q ^ -1) != -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_p = param2;
              this.field_g = param1;
              var4_int = param2 + -320;
              var5 = -240 + param1;
              var6 = this.field_eb.d(8);
              var8 = -var6 * ((double)this.field_ab[9] * 0.0000152587890625) + 0.0000152587890625 * (double)this.field_ab[3] * (double)var4_int * -var6 / 512.0 + (double)var5 * ((double)this.field_ab[6] * 0.0000152587890625) * -var6 / 512.0;
              var10 = -var6 * (0.0000152587890625 * (double)this.field_ab[10]) + -var6 * (0.0000152587890625 * (double)this.field_ab[4] * (double)var4_int) / 512.0 + -var6 * (0.0000152587890625 * (double)this.field_ab[7] * (double)var5) / 512.0;
              if (param0 <= -89) {
                L1: {
                  var12 = (double)this.field_ab[8] * 0.0000152587890625 * (double)var5 * -var6 / 512.0 + (-var6 * (0.0000152587890625 * (double)this.field_ab[11]) + (double)var4_int * ((double)this.field_ab[5] * 0.0000152587890625) * -var6 / 512.0);
                  var14 = (double)(-((float)this.field_I.field_l[0].field_g / 8192.0f * (float)id.field_c.field_l[9] + (float)id.field_c.field_l[10] * ((float)this.field_I.field_l[0].field_k / 8192.0f) + (float)id.field_c.field_l[11] * ((float)this.field_I.field_l[0].field_j / 8192.0f))) * 0.0000152587890625;
                  var16 = -((double)(id.field_c.field_l[11] * this.field_ab[2]) * 0.0000152587890625 + (0.0000152587890625 * (double)(this.field_ab[0] * id.field_c.field_l[9]) + var14 + 0.0000152587890625 * (double)(this.field_ab[1] * id.field_c.field_l[10]))) / (0.0000152587890625 * ((double)id.field_c.field_l[10] * var10 + (double)id.field_c.field_l[9] * var8 + (double)id.field_c.field_l[11] * var12));
                  var18 = var8 * var16 + (double)this.field_ab[0];
                  var20 = var10 * var16 + (double)this.field_ab[1];
                  var22 = (double)this.field_ab[2] + var12 * var16;
                  var18 = var18 - (double)this.field_I.field_l[0].field_g / 8192.0;
                  var20 = -((double)this.field_I.field_l[0].field_k / 8192.0) + var20;
                  var22 = -((double)this.field_I.field_l[0].field_j / 8192.0) + var22;
                  var24 = var22 * ((double)id.field_c.field_l[5] / 65536.0) + (var20 * ((double)id.field_c.field_l[4] / 65536.0) + var18 * ((double)id.field_c.field_l[3] / 65536.0));
                  var26 = var22 * ((double)id.field_c.field_l[8] / 65536.0) + ((double)id.field_c.field_l[7] / 65536.0 * var20 + var18 * ((double)id.field_c.field_l[6] / 65536.0));
                  var24 = var24 * 2.0;
                  var26 = var26 * 2.0;
                  var28 = var26 * var26 + var24 * var24;
                  if (var28 >= 16384.0) {
                    break L1;
                  } else {
                    L2: {
                      if (9216.0 < var28) {
                        var26 = 96.0 * var26 / 128.0;
                        var24 = 96.0 * var24 / 128.0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (!this.a(false, (int)(0.5 + var26), (int)(0.5 + var24))) {
                      break L1;
                    } else {
                      id.field_c.field_g = true;
                      hh.field_c = true;
                      break L1;
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
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.I(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    private final void b(boolean param0, int param1, int param2) {
        double[][] var4 = null;
        double[][] stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              this.field_M = param2;
              if (param1 > 1) {
                break L1;
              } else {
                this.field_C = -73;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!un.field_b) {
                  break L3;
                } else {
                  if (0 != (hq.field_c & this.field_L)) {
                    stackIn_10_0 = f.field_a;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = f.field_c;
              break L2;
            }
            L4: {
              var4 = stackIn_10_0;
              this.field_R = -1;
              this.field_O.a(var4[param2], (byte) -55);
              if (param0) {
                this.field_eb.a(var4[param2], (byte) -106);
                break L4;
              } else {
                break L4;
              }
            }
            this.field_D = true;
            this.e(-69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.CD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (-1 >= (param1 ^ -1)) {
                break L1;
              } else {
                param1 = 0;
                break L1;
              }
            }
            L2: {
              if (-4097 > (param1 ^ -1)) {
                param1 = 4096;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0) {
              L3: {
                if ((param1 ^ -1) != (this.field_G.field_n ^ -1)) {
                  var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, param1, (byte) 95, this.field_G.field_h);
                  if (var3 == null) {
                    this.m(97);
                    break L3;
                  } else {
                    this.field_G.field_n = param1;
                    kh.field_gc.b(99, this.field_G.field_n);
                    this.field_G.field_e = var3[2];
                    this.field_G.field_d = var3[1];
                    this.field_G.field_k = var3[0];
                    id.field_c.field_g = true;
                    hh.field_c = true;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.UD(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void t(int param0) {
        mm stackIn_4_0 = null;
        mm stackIn_7_0 = null;
        double[][] stackIn_7_1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              L2: {
                stackIn_4_0 = this.field_O;

                if (!un.field_b) {
                  break L2;
                } else {


                  if (0 != (this.field_L & hq.field_c)) {
                    stackIn_7_0 = (mm) ((Object) stackIn_4_0);
                    stackIn_7_1 = f.field_a;
                    break L1;
                  } else {
                    stackIn_4_0 = (mm) ((Object) stackIn_4_0);
                    break L2;
                  }
                }
              }
              stackIn_7_0 = (mm) ((Object) stackIn_4_0);
              stackIn_7_1 = f.field_c;
              break L1;
            }
            ((mm) (Object) stackIn_7_0).a(stackIn_7_1[0], (byte) -117);
            this.field_D = true;
            this.field_M = param0;
            this.e(param0 + -96);
            this.field_R = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.HD(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          L0: {
            L1: {
              if (this.field_D) {
                this.field_eb.a(this.field_ab, true);
                kh.field_gc.a((byte) -123, this.field_ab);
                this.field_D = false;
                this.field_p = -1;
                this.field_g = -1;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -29423) {
              L2: {
                kh.field_gc.a((byte) -55, (uf) (this));
                if (this.field_I.j(param1 + 29476).field_q != 0) {
                  break L2;
                } else {
                  if (0 != this.field_e) {
                    break L2;
                  } else {
                    this.a(false);
                    break L2;
                  }
                }
              }
              L3: {
                if (0L == (131072L & pd.field_i)) {
                  this.a(true, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                this.G(-9449);
                if ((pd.field_i & 4294967296L ^ -1L) == -1L) {
                  re.a((byte) 121);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                ua.b(true);
                if (this.field_I.field_n <= 1) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      var3_int = 60;
                      var4 = 55;
                      if (iq.field_i) {
                        break L7;
                      } else {
                        L8: {
                          if (-1 < (wn.field_i ^ -1)) {
                            break L8;
                          } else {
                            if ((qh.field_l >> -354419167 ^ -1) >= (wn.field_i ^ -1)) {
                              break L8;
                            } else {
                              if (0 > gg.field_f) {
                                break L8;
                              } else {
                                if (gg.field_f < var4) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        if (0 < lk.field_u) {
                          lk.field_u = lk.field_u - 16;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if ((lk.field_u ^ -1) <= -257) {
                      break L6;
                    } else {
                      lk.field_u = lk.field_u + 16;
                      break L6;
                    }
                  }
                  var5 = this.h(true);
                  var6 = 0;
                  var7 = 0;
                  L9: while (true) {
                    if (var7 >= var5.length) {
                      var7 = of.field_Ob;
                      var8 = no.field_q.field_A + fm.field_M + 2;
                      var9 = 16 + var6 - (-eq.field_Q[4].field_z - eq.field_Q[6].field_z);
                      var10 = 4 + eq.field_Q[1].field_A + (var5.length * sa.field_h.field_G - -eq.field_Q[7].field_A);
                      var4 = var8 - -eq.field_Q[1].field_A + sa.field_h.field_G;
                      qh.a(var7, var8, var9, var10, 8, 4144959, 192 * lk.field_u >> 1793809288);
                      rk.a(114, var8, lk.field_u, var7, var9, var10, eq.field_Q);
                      var11 = 0;
                      L10: while (true) {
                        if (var5.length <= var11) {
                          break L5;
                        } else {
                          sa.field_h.b(var5[var11], var3_int, var4, 15658734, 2039583, lk.field_u);
                          var4 = var4 + sa.field_h.field_G;
                          var11++;
                          continue L10;
                        }
                      }
                    } else {
                      L11: {
                        var8 = sa.field_h.b(var5[var7]);
                        if (var8 > var6) {
                          var6 = var8;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var7++;
                      continue L9;
                    }
                  }
                }
              }
              L12: {
                if (0 == (this.field_L & sk.field_d)) {
                  break L12;
                } else {
                  this.field_c.j(param1 + 29451);
                  break L12;
                }
              }
              L13: {
                if (param0) {
                  var3_int = dp.a(104);
                  if (-1 < (var3_int ^ -1)) {
                    break L13;
                  } else {
                    if (0 != (256 & var3_int)) {
                      L14: {
                        if ((this.field_L & sk.field_d ^ -1) == -1) {
                          break L14;
                        } else {
                          if (this.field_c.field_h.field_q == null) {
                            break L14;
                          } else {
                            this.field_c.field_h.a(15658734, 128, 9750);
                            break L14;
                          }
                        }
                      }
                      pf.a(4144959, 15658734, param1 + 29427, sa.field_h, re.field_e[var3_int + -256]);
                      break L13;
                    } else {
                      pf.a(4144959, 15658734, 4, sa.field_h, wj.field_S[var3_int]);
                      break L13;
                    }
                  }
                } else {
                  break L13;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.BD(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        try {
            this.field_I.a(ga.a(512, true, ea.field_r), -1, 0, 0, 19063);
            if (param0 >= -67) {
                this.l((byte) 34);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.TA(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 38) {
                break L1;
              } else {
                this.n(48);
                break L1;
              }
            }
            if (0 != this.field_I.j(117).field_q) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!this.b(1, 5, false)) {
                  break L2;
                } else {
                  this.b(true, param1 + this.field_G.field_n);
                  this.b(param1 + this.field_Q, true);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.HE(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        try {
            uo.c(false);
            this.field_T = false;
            this.field_Q = this.field_G.field_n;
            kh.field_gc.a((byte) 124, param0, 9);
            if (param1 >= -100) {
                this.field_m = -118;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -16439) {
                break L1;
              } else {
                this.c((qe) null, 120);
                break L1;
              }
            }
            stackIn_4_0 = qh.field_l - ((65536 + -hc.a(2047, this.field_l)) * (1 + il.field_f.field_w) >> 172001393);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.TB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void B(byte param0) {
        RuntimeException runtimeException = null;
        qe var2 = null;
        oo stackIn_3_0;
        int stackIn_3_1;
        int[] stackIn_3_2;
        int stackIn_3_3;
        int[] stackIn_3_4;
        oo stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int[] stackIn_4_4 = null;
        int stackIn_4_5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = this.field_I.j(69);
              hh.field_c = true;
              var2.field_q = 1;
              stackIn_3_0 = kh.field_gc;

              stackIn_3_1 = 1336449640;

              stackIn_3_2 = this.field_ab;

              stackIn_3_3 = 32 - -(192 * this.field_G.field_n / 4096);

              stackIn_3_4 = id.field_c.field_l;

              if ((this.field_G.field_n ^ -1) < -2049) {
                stackIn_4_0 = (oo) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = (int[]) ((Object) stackIn_3_2);
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = (int[]) ((Object) stackIn_3_4);
                stackIn_4_5 = 7;
                break L1;
              } else {
                stackIn_4_0 = (oo) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = (int[]) ((Object) stackIn_3_2);
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = (int[]) ((Object) stackIn_3_4);
                stackIn_4_5 = 8;
                break L1;
              }
            }
            L2: {
              ((oo) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5);
              this.field_B = -37;
              this.a(true, (byte) -114);
              if (this.i(-1)) {
                break L2;
              } else {
                this.E(-24070);
                break L2;
              }
            }
            L3: {
              vm.field_f = 2147483647 & vm.field_f - -1048576;
              if (param0 == 17) {
                break L3;
              } else {
                this.o(50);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.RB(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, di param2, di param3, di param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == -11934) {
                break L1;
              } else {
                uf.a(-105, true, (di) null, (di) null, (di) null);
                break L1;
              }
            }
            ig.field_j = oh.a(-71, "");
            ig.field_j.a(false, (byte) 120);
            uf.a(param3, -22764, param2, param4);
            nd.b((byte) -124);
            pa.field_I = aa.field_c;
            wd.field_Lb = aa.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("uf.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
    }

    private final int a(boolean param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] stackIn_12_0 = null;
        double stackIn_16_0 = 0.0;
        double stackIn_23_0 = 0.0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pq var28 = null;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        try {
          L0: {
            L1: {
              param2 -= 320;
              var5_int = -240 + param3;
              var6 = this.field_ab;
              var7 = (double)((var6[9] << -772955159) + param2 * var6[3] + var6[6] * var5_int);
              var9 = (double)((var6[10] << -1841925879) - -(var6[4] * param2) - -(var5_int * var6[7]));
              var11 = (double)(var6[8] * var5_int + (var6[5] * param2 + (var6[11] << -1020810967)));
              var13 = Math.sqrt(var9 * var9 + var7 * var7 + var11 * var11);
              var11 = var11 / var13;
              var5_int = -(fl.field_q.field_ib >> 1826502753) + param3;
              var6 = sa.field_m;
              var9 = var9 / var13;
              var7 = var7 / var13;
              var15 = (double)((var6[9] << -1850243159) - -(var6[3] * param2) + var6[6] * var5_int);
              var17 = (double)(var5_int * var6[7] + (var6[4] * param2 + (var6[10] << -940350199)));
              var19 = (double)(param2 * var6[5] + ((var6[11] << 1916504265) + var6[8] * var5_int));
              var21 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
              var15 = var15 / var21;
              var19 = var19 / var21;
              var17 = var17 / var21;
              var23 = -1.0;
              if (!param0) {
                break L1;
              } else {
                field_y = (byte[][]) null;
                break L1;
              }
            }
            var25 = -1;
            var26 = 0;
            L2: while (true) {
              if (pd.field_f.length <= var26) {
                stackIn_36_0 = var25;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var27 = pd.field_f[var26];
                  if ((var27 ^ -1) > (this.field_I.field_l.length ^ -1)) {
                    L4: {
                      var28 = this.field_I.field_l[var27];
                      if (!var28.field_o) {
                        stackIn_12_0 = this.field_ab;
                        break L4;
                      } else {
                        stackIn_12_0 = sa.field_m;
                        break L4;
                      }
                    }
                    L5: {
                      var6 = stackIn_12_0;
                      var29 = (double)rj.e(-(var28.field_g >> 159425933) + var6[0], 3);
                      var31 = (double)rj.e(var6[1] - (var28.field_k >> 748886701), 3);
                      var33 = (double)rj.e(-(var28.field_j >> -1757824243) + var6[2], 3);
                      var35 = var31 * var17 + var15 * var29 + var19 * var33;
                      var37 = var9 * var31 + var7 * var29 + var33 * var11;
                      if (var28.field_o) {
                        stackIn_16_0 = -var35;
                        break L5;
                      } else {
                        stackIn_16_0 = -var37;
                        break L5;
                      }
                    }
                    var39 = stackIn_16_0;
                    if (0.0 < var39) {
                      L6: {
                        var41 = var33 * var33 + (var29 * var29 + var31 * var31);
                        if (!var28.field_o) {
                          stackIn_23_0 = var41 + var39 * (var39 + var37 * 2.0);
                          break L6;
                        } else {
                          stackIn_23_0 = var41 + (var35 * 2.0 + var39) * var39;
                          break L6;
                        }
                      }
                      var43 = stackIn_23_0;
                      if (param1) {
                        if (var43 > 64.0) {
                          break L3;
                        } else {
                          stackIn_28_0 = var27;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        L7: {
                          if ((var25 ^ -1) == 0) {
                            break L7;
                          } else {
                            if (var43 >= var23) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var23 = var43;
                        var25 = var27;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var26++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5), "uf.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_28_0;
        } else {
          return stackIn_36_0;
        }
    }

    private final void w(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 >= 24) {
              L1: {
                L2: {
                  if (!wb.field_a) {
                    break L2;
                  } else {
                    if (-11 >= (fm.field_M ^ -1)) {
                      break L2;
                    } else {
                      ac.b(1, (byte) 103);
                      break L1;
                    }
                  }
                }
                if (wb.field_a) {
                  break L1;
                } else {
                  if ((-no.field_q.field_A ^ -1) > (fm.field_M ^ -1)) {
                    ac.b(-1, (byte) 69);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              tq.field_q = (sa.field_h.field_C + no.field_q.field_y >> -1150580351) + fm.field_M;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.IB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void A(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        qe var3 = null;
        kj var4 = null;
        oq var4_ref = null;
        try {
          L0: {
            if (this.field_I.field_o) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (0 != this.field_Q) {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    this.c((byte) -56);
                    break L1;
                  }
                }
                L2: {
                  if (!this.i(-1)) {
                    break L2;
                  } else {
                    if (!this.b(1, 7, false)) {
                      break L2;
                    } else {
                      var2 = this.field_I.j(96);
                      if (var2.field_q >= 1) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L3: {
                          this.field_G.field_n = this.field_Q;
                          this.field_j = false;
                          var2.field_s = uk.field_a;
                          var3 = var2;
                          var4 = this.field_G;
                          var3.field_C = (short)((1024 + var4.field_h) % 2048);
                          var3.field_V = (short)var4.field_n;
                          var3.field_D = (byte)var4.field_d;
                          var3.field_A = (short)var4.field_k;
                          var3.field_H = (byte)var4.field_e;
                          if (-1 == (hq.field_c & this.field_L ^ -1)) {
                            break L3;
                          } else {
                            this.j((byte) -118);
                            ej.field_j.b(false, 65);
                            var3 = var2;
                            var4_ref = ej.field_j;
                            ((ge) ((Object) var4_ref)).a(var3.field_v, false);
                            ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3.field_C);
                            ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3.field_A);
                            ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3.field_V);
                            ((ge) ((Object) var4_ref)).a((int) var3.field_D, false);
                            ((ge) ((Object) var4_ref)).a((int) var3.field_H, false);
                            break L3;
                          }
                        }
                        this.field_I.field_i = null;
                        this.B((byte) 17);
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.Q(" + param0 + ')');
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

    final static void r(byte param0) {
        try {
            cr.a(16, hk.d(122));
            if (param0 != -80) {
                field_gb = (wc) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.VA(" + param0 + ')');
        }
    }

    private final void x(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        long var6 = 0L;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12_int = 0;
        double var12 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          L0: {
            var2_double = 0.0;
            var4 = 0.0;
            var6 = 0L;
            var8 = 0;
            L1: while (true) {
              if (this.field_I.field_l.length <= var8) {
                L2: {
                  if (var6 > 0L) {
                    this.field_R = -1;
                    this.field_O.field_m = var4 / (double)var6;
                    this.field_O.field_f = var2_double / (double)var6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 1) {
                    break L3;
                  } else {
                    field_X = 98;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (!this.field_I.field_l[var8].field_s) {
                    break L4;
                  } else {
                    if (-1 == (this.field_I.field_l[var8].field_v ^ -1)) {
                      break L4;
                    } else {
                      var9 = Math.sqrt((double)(this.field_I.field_l[0].field_I * this.field_I.field_l[0].field_I - -(this.field_I.field_l[0].field_t * this.field_I.field_l[0].field_t)) / 65536.0 / 65536.0);
                      var11 = -1;
                      var12_int = 0;
                      L5: while (true) {
                        if ((this.field_I.field_w.length ^ -1) >= (var12_int ^ -1)) {
                          var12 = Math.sqrt((double)var11 / 65536.0) * Math.max(0.0, -0.04998779296875 + var9);
                          var2_double = var2_double + var12 * ((double)this.field_I.field_l[var8].field_g / 65536.0);
                          var4 = var4 + var12 * ((double)this.field_I.field_l[var8].field_k / 65536.0);
                          var6 = (long)((double)var6 + var12);
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              var13 = -this.field_I.field_l[var8].field_g + this.field_I.field_w[var12_int].field_g;
                              var14 = this.field_I.field_w[var12_int].field_f + -this.field_I.field_l[var8].field_k;
                              var15 = aj.a(var13, false, var13) - -aj.a(var14, false, var14);
                              if (var11 < 0) {
                                break L7;
                              } else {
                                if (var11 <= var15) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var11 = var15;
                            break L6;
                          }
                          var12_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.MB(" + param0 + ')');
        }
    }

    final void c(int param0, ge param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_I.a(param1, (byte) 123);
              if (param0 == 16915) {
                break L1;
              } else {
                this.b(34, false);
                break L1;
              }
            }
            L2: {
              kh.field_gc.b(this.field_I, 0);
              this.f((byte) 93);
              if ((hq.field_c & this.field_L) != 0) {
                break L2;
              } else {
                if (-1 != (this.field_I.j(72).field_q ^ -1)) {
                  break L2;
                } else {
                  this.s((byte) -74);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("uf.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void a(int param0, ko param1, byte param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        aa var5 = null;
        qe var6 = null;
        try {
          L0: {
            L1: {
              if (param2 == 27) {
                break L1;
              } else {
                this.field_T = false;
                break L1;
              }
            }
            var4_int = -sa.field_h.field_w + qh.field_f;
            var5 = new aa(param1);
            var6 = (qe) ((Object) var5.a(0));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  L4: {
                    if (-4 >= (var6.field_q ^ -1)) {
                      sa.field_h.d(var6.a(true), param0, var4_int, 16724787, 1);
                      var4_int = var4_int - 5 * (sa.field_h.field_w + sa.field_h.field_C) / 4;
                      if (sa.field_h.field_C >= var4_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var6.field_q ^ -1) <= -3) {
                      sa.field_h.d(var6.c(param2 ^ 26864), param0, var4_int, 16724787, 1);
                      var4_int = var4_int - (sa.field_h.field_C - -sa.field_h.field_w) * 5 / 4;
                      if (sa.field_h.field_C < var4_int) {
                        break L5;
                      } else {
                        break L3;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (1 <= var6.field_q) {
                        break L7;
                      } else {
                        if (0 == (var6.field_V ^ -1)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var6.field_q != 0) {
                        sa.field_h.d(var6.e(0), param0, var4_int, 16750899, 1);
                        break L8;
                      } else {
                        sa.field_h.b(var6.e(0), param0, var4_int, 16750899, 1, 128);
                        break L8;
                      }
                    }
                    var4_int = var4_int - 5 * (sa.field_h.field_C - -sa.field_h.field_w) / 4;
                    if (var4_int <= sa.field_h.field_C) {
                      break L3;
                    } else {
                      break L6;
                    }
                  }
                  L9: {
                    if ((var6.field_q ^ -1) <= -1) {
                      sa.field_h.d(var6.a(param2 ^ 26, this.field_I), param0, var4_int, 10092339, 1);
                      var4_int = var4_int - (sa.field_h.field_w + sa.field_h.field_C) * 5 / 4;
                      if ((sa.field_h.field_C ^ -1) <= (var4_int ^ -1)) {
                        break L3;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  var6 = (qe) ((Object) var5.c((byte) -71));
                  continue L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("uf.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L10;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L10;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1 = param1 + this.field_G.field_k;
              if (param0 <= param1) {
                if (param1 <= 1024) {
                  break L1;
                } else {
                  param1 = 1024;
                  break L1;
                }
              } else {
                param1 = 512;
                break L1;
              }
            }
            L2: {
              if (this.field_G.field_k != param1) {
                this.b(param0 + -511, param1);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(qe param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_R) {
                break L1;
              } else {
                if (!param0.field_R.c(0)) {
                  var3 = (dn) ((Object) param0.field_R.c((byte) -54));
                  L2: while (true) {
                    if (var3 == null) {
                      break L1;
                    } else {
                      var4 = nr.a(new String[]{this.field_I.field_h[param0.field_L]}, -1, e.field_h[var3.field_q]);
                      em.a((byte) 120, false, 1, var4);
                      var3 = (dn) ((Object) param0.field_R.f((byte) -5));
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1 >= 86) {
                break L3;
              } else {
                discarded$1 = this.a(-95, 0, -15, (vh) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uf.QC(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    private final void J(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (vj.field_c[bc.field_f]) {
                  break L2;
                } else {
                  if (!vj.field_c[mb.field_a]) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_7_0 = -1;
              break L1;
            }
            L3: {
              L4: {

                if (vj.field_c[gn.field_c]) {
                  break L4;
                } else {

                  if (vj.field_c[di.field_b]) {
                    break L4;
                  } else {

                    stackIn_14_0 = stackIn_7_0;
                    stackIn_14_1 = 0;
                    break L3;
                  }
                }
              }
              stackIn_14_0 = stackIn_7_0;
              stackIn_14_1 = 1;
              break L3;
            }
            L5: {
              var2_int = stackIn_14_0 - -stackIn_14_1;
              if (!vj.field_c[105]) {
                stackIn_18_0 = 0;
                break L5;
              } else {
                stackIn_18_0 = -1;
                break L5;
              }
            }
            L6: {


              if (vj.field_c[104]) {

                stackIn_22_1 = 1;
                break L6;
              } else {

                stackIn_22_1 = 0;
                break L6;
              }
            }
            L7: {
              L8: {
                var3 = stackIn_18_0 + stackIn_22_1;
                if (vj.field_c[gp.field_b]) {
                  break L8;
                } else {
                  if (!vj.field_c[fl.field_p]) {
                    stackIn_29_0 = 0;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              stackIn_29_0 = -1;
              break L7;
            }
            L9: {
              L10: {

                if (vj.field_c[hm.field_j]) {
                  break L10;
                } else {


                  if (!vj.field_c[kr.field_h]) {
                    stackIn_36_0 = stackIn_29_0;
                    stackIn_36_1 = 0;
                    break L9;
                  } else {

                    break L10;
                  }
                }
              }
              stackIn_36_0 = stackIn_29_0;
              stackIn_36_1 = 1;
              break L9;
            }
            L11: {
              L12: {
                var4 = stackIn_36_0 - -stackIn_36_1;
                if (param0 != this.field_I.j(72).field_q) {
                  break L12;
                } else {
                  if (0 == var2_int) {
                    break L12;
                  } else {
                    if (this.b(1, 4, false)) {
                      this.field_A = this.field_A - var2_int;
                      this.c(param0 + -69, 2047 & this.field_A + this.field_G.field_h);
                      hh.field_c = true;
                      id.field_c.field_g = true;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              if (-1 != (this.field_A ^ -1)) {
                this.field_A = 0;
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              if (0 != this.field_I.j(28).field_q) {
                break L13;
              } else {
                if (var3 != 0) {
                  this.f(512, var3 * 8);
                  hh.field_c = true;
                  id.field_c.field_g = true;
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              L15: {
                if ((this.field_I.j(77).field_q ^ -1) != -1) {
                  break L15;
                } else {
                  if (var4 == 0) {
                    break L15;
                  } else {
                    if (this.b(1, 5, false)) {
                      L16: {
                        if (0 == this.field_u) {
                          this.field_u = var4 << -1507015760;
                          break L16;
                        } else {
                          this.field_u = this.field_u + (var4 << -1511979761);
                          break L16;
                        }
                      }
                      L17: {
                        this.field_G.field_n = this.field_Q;
                        kh.field_gc.b(101, this.field_G.field_n);
                        if (this.field_u >= 0) {
                          this.field_h = 75;
                          break L17;
                        } else {
                          this.field_h = 0;
                          break L17;
                        }
                      }
                      this.b((byte) 74, -(this.field_u >> 1649784976));
                      id.field_c.field_g = true;
                      hh.field_c = true;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              if ((this.field_u ^ -1) == -1) {
                break L14;
              } else {
                this.field_u = 0;
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.VC(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_M = -1;
              this.field_O.a(105);
              if (param0 == -23095) {
                break L1;
              } else {
                this.field_B = 121;
                break L1;
              }
            }
            this.e(param0 ^ 23155);
            this.field_R = (int)(this.field_O.a(true) * 400.0 / 3.141592653589793 / 2.0) % 400;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, qe param1) {
        oo stackIn_34_0 = null;
        oo stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        oo stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int[] stackIn_41_4;
        oo stackIn_42_0;
        int stackIn_42_1;
        int[] stackIn_42_2;
        int stackIn_42_3;
        int[] stackIn_42_4;
        int stackIn_42_5;
        int stackIn_59_0 = 0;
        boolean stackIn_85_0 = false;
        int stackIn_98_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_84_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ij var5 = null;
        aa var5_ref = null;
        int[] var6 = null;
        cr var6_ref = null;
        ij var7_ref_ij = null;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if (-1L == (pd.field_i & 2048L ^ -1L)) {
                  break L2;
                } else {
                  if (!this.field_kb) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if ((this.field_B ^ -1) <= -1) {
                if (0 != this.field_B) {
                  L3: {
                    this.field_kb = false;
                    if (0 == (param1.field_n ^ -1)) {
                      stackIn_59_0 = 0;
                      break L3;
                    } else {
                      stackIn_59_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var3_int = stackIn_59_0;
                    var4 = param1.field_t ? 1 : 0;
                    this.field_I.g((byte) -126);
                    if (var4 == 0) {
                      L5: {
                        if (var3_int != 0) {
                          break L5;
                        } else {
                          if (0 != (param1.field_n ^ -1)) {
                            if (this.field_I.field_f.c(param1, -110)) {
                              break L5;
                            } else {
                              if (!nq.a((byte) 49, 4)) {
                                L6: {
                                  var5 = gj.a(true, 4, bq.field_s, (String) null);
                                  var6 = wm.field_ac[0];
                                  param1.field_t = true;
                                  var5.field_D = new int[]{var6[0] >> -576849395, var6[1] >> -1207210259, var6[2] >> -1187362451};
                                  var5.field_F = new int[]{var6[0] >> -576849395, var6[1] >> -1207210259, var6[2] >> -1187362451};
                                  var5.field_p = new int[]{var6[0] >> -576849395, var6[1] >> -1207210259, var6[2] >> -1187362451};
                                  if ((16711680 & wq.field_c) != 16711680) {
                                    wq.field_c = wq.field_c + 65536;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var5.field_v = 5;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L7: {
                        L8: {
                          if (this.field_I.field_j > 0) {
                            var5_ref = new aa(param1.field_m);
                            var6_ref = (cr) ((Object) var5_ref.b((byte) -92));
                            L9: while (true) {
                              if (null == var6_ref) {
                                break L8;
                              } else {
                                stackOut_84_0 = this.field_I.field_f.a(var6_ref.field_n, (byte) 9, param1);
                                stackIn_98_0 = stackOut_84_0 ? 1 : 0;
                                stackIn_85_0 = stackOut_84_0;
                                L10: {
                                  if (stackIn_85_0) {
                                    break L10;
                                  } else {
                                    if (nq.a((byte) 95, 4)) {
                                      break L10;
                                    } else {
                                      L11: {
                                        var7_ref_ij = gj.a(true, 4, bq.field_s, (String) null);
                                        var8 = this.field_I.field_w[var6_ref.field_r];
                                        if ((16711680 & wq.field_c ^ -1) != -16711681) {
                                          wq.field_c = wq.field_c + 65536;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      param1.field_t = true;
                                      var7_ref_ij.field_v = 5;
                                      var7_ref_ij.field_D = new int[]{var8.field_g >> 130706061, var8.field_f >> 164474253, 0};
                                      var7_ref_ij.field_F = new int[]{var8.field_g >> 130706061, var8.field_f >> 164474253, 0};
                                      var7_ref_ij.field_p = new int[]{var8.field_g >> 130706061, var8.field_f >> 164474253, 0};
                                      break L8;
                                    }
                                  }
                                }
                                var6_ref = (cr) ((Object) var5_ref.b(-126));
                                continue L9;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                        stackIn_98_0 = param1.field_q;
                        break L7;
                      }
                      if (stackIn_98_0 != 2) {
                        break L4;
                      } else {
                        if (0 != (param1.field_n ^ -1)) {
                          break L4;
                        } else {
                          if (param1.field_t) {
                            var5 = gj.a(true, 4, bq.field_s, (String) null);
                            var5.field_v = 5;
                            var5.field_D = new int[]{this.field_I.field_l[0].field_g >> 1280751565, this.field_I.field_l[0].field_k >> 1614672013, this.field_I.field_l[0].field_j >> 1058009517};
                            var5.field_F = new int[]{this.field_I.field_l[0].field_g >> 1280751565, this.field_I.field_l[0].field_k >> 1614672013, this.field_I.field_l[0].field_j >> 1058009517};
                            var5.field_p = new int[]{this.field_I.field_l[0].field_g >> 1280751565, this.field_I.field_l[0].field_k >> 1614672013, this.field_I.field_l[0].field_j >> 1058009517};
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L12: {
                    L13: {
                      if (-1 > (this.field_I.field_j ^ -1)) {
                        var5_ref = new aa(param1.field_m);
                        var6_ref = (cr) ((Object) var5_ref.a(0));
                        var7 = 0;
                        L14: while (true) {
                          if (var7 >= this.field_I.field_j) {
                            break L13;
                          } else {
                            stackIn_121_0 = -1;

                            stackIn_121_1 = var6_ref.field_n ^ -1;

                            L15: {
                              if (stackIn_121_0 != stackIn_121_1) {
                                vm.field_f = vm.field_f + 65536;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            var6_ref = (cr) ((Object) var5_ref.c((byte) -71));
                            var7++;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    this.t((byte) -113);
                    stackIn_121_0 = this.field_L;
                    stackIn_121_1 = sk.field_d;
                    break L12;
                  }
                  L16: {
                    if ((stackIn_121_0 & stackIn_121_1) != 0) {
                      break L16;
                    } else {
                      this.p(-709);
                      break L16;
                    }
                  }
                  L17: {
                    this.c(-118);
                    if (-3 != (param1.field_q ^ -1)) {
                      break L17;
                    } else {
                      this.c(param1, -128);
                      break L17;
                    }
                  }
                  this.field_B = this.field_B + 1;
                  break L1;
                } else {
                  L18: {
                    this.field_f = 57;
                    if (!this.i(-1)) {
                      L19: {
                        stackIn_41_0 = kh.field_gc;

                        stackIn_41_1 = 1336449640;

                        stackIn_41_2 = this.field_ab;

                        stackIn_41_3 = 32 - -(this.field_G.field_n * 128 / 4096);

                        stackIn_41_4 = id.field_c.field_l;

                        if (this.field_G.field_n > 2048) {
                          stackIn_42_0 = (oo) ((Object) stackIn_41_0);
                          stackIn_42_1 = stackIn_41_1;
                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                          stackIn_42_3 = stackIn_41_3;
                          stackIn_42_4 = (int[]) ((Object) stackIn_41_4);
                          stackIn_42_5 = 0;
                          break L19;
                        } else {





                          stackIn_42_0 = (oo) ((Object) stackIn_41_0);
                          stackIn_42_1 = stackIn_41_1;
                          stackIn_42_2 = (int[]) ((Object) stackIn_41_2);
                          stackIn_42_3 = stackIn_41_3;
                          stackIn_42_4 = (int[]) ((Object) stackIn_41_4);
                          stackIn_42_5 = 1;
                          break L19;
                        }
                      }
                      ((oo) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5);
                      break L18;
                    } else {
                      L20: {
                        stackIn_34_0 = kh.field_gc;

                        if (-2049 > (this.field_G.field_n ^ -1)) {
                          stackIn_35_0 = (oo) ((Object) stackIn_34_0);
                          stackIn_35_1 = 0;
                          break L20;
                        } else {

                          stackIn_35_0 = (oo) ((Object) stackIn_34_0);
                          stackIn_35_1 = 1;
                          break L20;
                        }
                      }
                      ((oo) (Object) stackIn_35_0).a(stackIn_35_1, this.field_G.field_n * 128 / 4096 + 32, (byte) -115, 128);
                      break L18;
                    }
                  }
                  L21: {
                    this.field_I.i((byte) -51);
                    if (!this.i(-1)) {
                      break L21;
                    } else {
                      this.E(-24070);
                      break L21;
                    }
                  }
                  this.field_B = this.field_B + 1;
                  if ((f.field_f & this.field_L) == 0) {
                    break L1;
                  } else {
                    if ((this.field_o ^ -1) == 0) {
                      this.field_o = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                if (this.field_B < -12) {
                  this.field_f = (this.field_B + 37) * this.field_G.field_n * 228 / 4096 / 25;
                  id.field_c.field_g = true;
                  this.field_B = this.field_B + 1;
                  break L1;
                } else {
                  L22: {
                    if (-1 == (hq.field_c & this.field_L ^ -1)) {
                      break L22;
                    } else {
                      if (this.field_j) {
                        break L22;
                      } else {
                        break L1;
                      }
                    }
                  }
                  id.field_c.field_g = true;
                  this.field_f = -this.field_B * this.field_G.field_n * 228 / 4096 / 12;
                  this.field_B = this.field_B + 1;
                  break L1;
                }
              }
            }
            var3_int = 104 % ((-12 - param0) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackIn_133_0 = (RuntimeException) (var3);

            stackIn_133_1 = new StringBuilder().append("uf.SB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_134_0 = (RuntimeException) ((Object) stackIn_133_0);
              stackIn_134_1 = (StringBuilder) ((Object) stackIn_133_1);
              stackIn_134_2 = "null";
              break L23;
            } else {
              stackIn_134_0 = (RuntimeException) ((Object) stackIn_133_0);
              stackIn_134_1 = (StringBuilder) ((Object) stackIn_133_1);
              stackIn_134_2 = "{...}";
              break L23;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_134_0), stackIn_134_2 + ')');
        }
    }

    private final void q(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_I.c((byte) -79);
              id.field_c.field_g = true;
              hh.field_c = true;
              if (param0 == 114) {
                break L1;
              } else {
                this.field_bb = true;
                break L1;
              }
            }
            this.K(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EA(" + param0 + ')');
        }
    }

    private final void b(int param0, qe param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        af var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ij var6 = null;
        try {
          L0: {
            if (this.field_I.field_f instanceof af) {
              var3 = (af) ((Object) this.field_I.field_f);
              var4 = dq.field_a.a(var3.f(22533, param1.field_L), (byte) 116);
              var5 = 0;
              var6_int = 0;
              L1: while (true) {
                if ((var6_int ^ -1) <= (this.field_I.field_n ^ -1)) {
                  L2: {
                    if (param0 > 114) {
                      break L2;
                    } else {
                      this.field_f = 23;
                      break L2;
                    }
                  }
                  var6 = gj.a(true, 10, nr.a(new String[]{null, null, var4}, -1, this.a(ij.field_A, sd.field_O, of.field_Qb, qq.field_zb, (byte) 61, var5, w.field_c, rj.field_g)), (String) null);
                  var6.field_q = q.field_b;
                  var6.field_r = 5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if ((this.field_I.field_f.c(-107, var6_int) ^ -1) != (this.field_I.field_f.c(-64, param1.field_L) ^ -1)) {
                      break L3;
                    } else {
                      var5 = var5 | 1 << var6_int;
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("uf.DE(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (0 == (this.field_L & hq.field_c)) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 <= -89) {
                  break L1;
                } else {
                  this.field_F = (int[]) null;
                  break L1;
                }
              }
              ej.field_j.b(false, 66);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.PD(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        pq var3 = null;
        try {
          L0: {
            if (0 == (hq.field_c & this.field_L)) {
              if (!this.field_I.field_o) {
                L1: {
                  var2 = this.field_I.j(29);
                  if (param0 > 62) {
                    break L1;
                  } else {
                    this.b(8, true);
                    break L1;
                  }
                }
                if ((var2.field_q ^ -1) != -1) {
                  System.out.println("Can't redo: Shot is waiting.");
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (0 > var2.field_V) {
                    System.out.println("Can't redo: Power less than zero.");
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2.field_V ^ -1) != -1) {
                      L2: {
                        if (-1 == var2.field_P) {
                          break L2;
                        } else {
                          if (0 == (var2.field_Q ^ -1)) {
                            break L2;
                          } else {
                            var3 = this.field_I.field_l[0];
                            var3.field_p = true;
                            var3.field_g = var2.field_P;
                            var3.field_k = var2.field_Q;
                            System.out.println("moved cueball to " + var2.field_P + "," + var2.field_Q);
                            break L2;
                          }
                        }
                      }
                      this.field_G.field_d = var2.field_D;
                      this.field_G.field_e = var2.field_H;
                      this.field_Q = var2.field_V;
                      this.field_G.field_n = var2.field_V;
                      this.field_G.field_h = (1024 + var2.field_C) % 2048;
                      this.field_G.field_k = var2.field_A;
                      System.out.println("Redoing shot: " + var2.e(0));
                      this.B((byte) 17);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      this.v(0);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                System.out.println("Can't redo: Game is finished.");
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L3: {
                if (!(this.field_q | false)) {
                  break L3;
                } else {
                  gj.a(true, 0, "Sorry", "Redo not supported for networked multiplayer, you can still dump the state though.");
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.IE(" + param0 + ')');
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

    private final void d(int param0) {
        qe var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2 = this.field_I.j(58);
            if (var2 != null) {
              var3 = var2.field_I;
              if ((var3 ^ -1) != param0) {
                var4 = 0;
                L1: while (true) {
                  if (this.field_I.field_l.length <= var4) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!this.field_I.field_l[var4].field_s) {
                        ji.field_b[var4] = 0;
                        no.field_n[var4] = 0;
                        break L2;
                      } else {
                        if ((var4 ^ -1) != (var3 ^ -1)) {
                          break L2;
                        } else {
                          ji.field_b[var4] = 32;
                          break L2;
                        }
                      }
                    }
                    var4++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.GC(" + param0 + ')');
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

    private final String e(int param0, int param1) {
        String dupTemp$2 = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != this.field_i[param1]) {
                var3 = this.field_i[param1];
                break L1;
              } else {
                dupTemp$2 = this.field_I.field_h[param1];
                this.field_i[param1] = dupTemp$2;
                var3 = dupTemp$2;
                this.field_F[param1] = sa.field_h.b(this.field_i[param1]);
                break L1;
              }
            }
            L2: {
              if (param0 == -30360) {
                break L2;
              } else {
                this.field_D = true;
                break L2;
              }
            }
            stackIn_7_0 = (String) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.PB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void G(int param0) {
        int[] discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        try {
          L0: {
            L1: {
              if (0L != (pd.field_i & 4294967296L)) {
                break L1;
              } else {
                if ((wn.field_i ^ -1) > -1) {
                  break L1;
                } else {
                  if (0 <= gg.field_f) {
                    L2: {
                      var2_int = this.a(false, true, wn.field_i, gg.field_f);
                      if (!this.field_T) {
                        if (-1 == var2_int) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        if (var2_int <= 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3 = dq.field_a.a(var2_int, this.field_I.field_f, (byte) -111);
                    er.a(gg.field_f, var3, wn.field_i, 3355443, sa.field_h, true, dq.field_a.a(var2_int, true));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0 == -9449) {
                break L3;
              } else {
                discarded$1 = this.a(27, -92, 8, -80, (byte) 101, -122);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.D(" + param0 + ')');
        }
    }

    final void a(int param0, ge param1) {
        try {
            RuntimeException runtimeException = null;
            qe var3 = null;
            ge var4 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var3 = this.field_I.j(31);
                  if (var3.field_q == 2) {
                    break L1;
                  } else {
                    L2: {
                      if (!this.i(-1)) {
                        break L2;
                      } else {
                        if (!this.field_j) {
                          this.field_I.e((byte) 80);
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    tc.a(new Throwable(), "Reading end shot packet before we have finished this shot!", -8555);
                    dn.c(54);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
                L3: {
                  var4 = param1;
                  this.field_o = var4.d(-1034);
                  if (param0 > 55) {
                    break L3;
                  } else {
                    this.field_bb = false;
                    break L3;
                  }
                }
                var3.a((byte) 112, param1);
                this.a(var3, 1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                runtimeException = decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (runtimeException);

                stackIn_18_1 = new StringBuilder().append("uf.GE(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L4;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L4;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean b(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((this.field_L & sk.field_d ^ -1) != -1) {
                if ((1 << param1 & this.field_c.field_h.field_o) == 0) {
                  this.field_c.b(param0, param1, -28186);
                  break L1;
                } else {
                  this.field_c.g(-123);
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                this.field_g = -113;
                break L2;
              }
            }
            stackIn_11_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.ED(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final void i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = -35 % ((-34 - param0) / 42);
              if (null != ti.field_d) {
                break L1;
              } else {
                if (0 >= this.field_o) {
                  break L1;
                } else {
                  if (this.field_q) {
                    break L1;
                  } else {
                    if (0 == (this.field_L & f.field_f)) {
                      break L1;
                    } else {
                      if (!this.field_I.field_m) {
                        break L1;
                      } else {
                        L2: {
                          if ((f.field_g ^ -1) < -1) {
                            ti.field_d = new oj(0, 65535, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.field_o});
                            break L2;
                          } else {
                            ti.field_d = new oj(1, 65534, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.field_o});
                            break L2;
                          }
                        }
                        if (hk.b(77)) {
                          break L1;
                        } else {
                          ml.a(25756, ti.field_d, 3);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.VB(" + param0 + ')');
        }
    }

    final void p(byte param0) {
        int stackIn_39_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              var2_int = 3 - -f.field_g;
              wq.field_c = wq.field_c & -65536 | (var2_int + (wq.field_c & 65535)) % 31676;
              if (-1 == qi.field_a) {
                break L1;
              } else {
                if (this.field_q) {
                  break L1;
                } else {
                  if (59 != qi.field_a) {
                    L2: {
                      if (null == uh.field_r) {
                        break L2;
                      } else {
                        if ((uh.field_r.field_v ^ -1) <= -31) {
                          break L2;
                        } else {
                          uh.field_r.a(qi.field_a, false);
                          break L1;
                        }
                      }
                    }
                    uh.field_r = null;
                    break L1;
                  } else {
                    if (uh.field_r != null) {
                      L3: {
                        if ((uh.field_r.field_v ^ -1) != -31) {
                          break L3;
                        } else {
                          if (-1099305073023L == (cp.a(uh.field_r.field_t, (byte) -83, 30) ^ -1L)) {
                            this.field_q = true;
                            em.a((byte) 121, false, 1, ec.a((byte) -119, 64525515431L));
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      uh.field_r = null;
                      break L1;
                    } else {
                      uh.field_r = new ge(30);
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (null != pq.field_B) {
                stackIn_39_0 = pq.field_B.length + 3;
                break L4;
              } else {
                stackIn_39_0 = 3;
                break L4;
              }
            }
            L5: {
              var2_int = stackIn_39_0;
              var3 = this.field_o;
              var4 = dk.field_f - -var3;
              var5 = var4 % 7621;
              var6 = var4 / 7621;
              var4 = 7621 * ((var2_int + var6) % 31676) + var5;
              dk.field_f = -var3 + var4;
              if (param0 > 78) {
                break L5;
              } else {
                this.c(61, 127, -6);
                break L5;
              }
            }
            if (-14 == (qi.field_a ^ -1)) {
              L6: {
                if ((hq.field_c & this.field_L ^ -1) != -1) {
                  if (this.field_db < 0) {
                    var2_int = 12;
                    break L6;
                  } else {
                    if (this.field_I.field_o) {
                      var2_int = 11;
                      break L6;
                    } else {
                      var2_int = 10;
                      break L6;
                    }
                  }
                } else {
                  L7: {
                    if (-1 == (oj.field_m & this.field_L ^ -1)) {
                      break L7;
                    } else {
                      if (!this.field_I.field_o) {
                        break L7;
                      } else {
                        var2_int = 9;
                        break L6;
                      }
                    }
                  }
                  if ((this.field_L & f.field_f ^ -1) == -1) {
                    if ((this.field_L & sk.field_d ^ -1) != -1) {
                      var2_int = 24;
                      break L6;
                    } else {
                      var2_int = 8;
                      break L6;
                    }
                  } else {
                    var2_int = 3;
                    break L6;
                  }
                }
              }
              L8: {
                var3 = var2_int;
                stackIn_74_0 = -3405;

                stackIn_74_1 = var3;

                if (mg.a(true)) {
                  stackIn_75_0 = stackIn_74_0;
                  stackIn_75_1 = stackIn_74_1;
                  stackIn_75_2 = 21;
                  break L8;
                } else {
                  stackIn_75_0 = stackIn_74_0;
                  stackIn_75_1 = stackIn_74_1;
                  stackIn_75_2 = 0;
                  break L8;
                }
              }
              fq.a(stackIn_75_0, stackIn_75_1, stackIn_75_2, false);
              lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -100)));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L9: {
                if (oj.c(-62)) {
                  break L9;
                } else {
                  L10: {
                    if (0 == (this.field_L & hq.field_c)) {
                      break L10;
                    } else {
                      if (!rg.field_p) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (this.field_q) {
                      if (!sm.d(-18791)) {
                        this.n((byte) -116);
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (this.field_S >= 0) {
                    break L9;
                  } else {
                    var2_int = qi.field_a;
                    if (-84 != (var2_int ^ -1)) {
                      if (var2_int == 59) {
                        if (this.field_q) {
                          break L9;
                        } else {
                          if (!this.field_bb) {
                            break L9;
                          } else {
                            if (!vj.field_c[82]) {
                              break L9;
                            } else {
                              if (!vj.field_c[86]) {
                                break L9;
                              } else {
                                if (!vj.field_c[81]) {
                                  break L9;
                                } else {
                                  this.field_q = true;
                                  em.a((byte) 118, false, 1, "Cheat mode enabled.");
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L9;
                      }
                    } else {
                      if (this.field_T) {
                        if (this.b(1, 6, false)) {
                          this.t(0);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        if (-2 == (this.field_I.j(101).field_q ^ -1)) {
                          break L9;
                        } else {
                          if (!this.b(1, 3, false)) {
                            break L9;
                          } else {
                            this.a((byte) 79);
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.TD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                uf.c(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (em.field_K) {
                  break L3;
                } else {
                  if (!hk.b(-126)) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "uf.AC(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void r(int param0) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        ij var3 = null;
        try {
          L0: {
            L1: {
              if (-2 > (this.field_I.field_n ^ -1)) {
                if (this.field_I.j(param0 + 14107).field_k != this.field_I.field_u.field_e) {
                  if (((qe) ((Object) this.field_I.j(85).field_k)).field_L != this.field_I.field_A) {
                    L2: {
                      var2 = (qe) ((Object) this.field_I.j(53).field_k);
                      if ((sg.field_O & var2.field_s ^ -1) == -1) {
                        break L2;
                      } else {
                        var3 = gj.a(true, 3, nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, gr.field_A), (String) null);
                        var3.field_q = qo.field_F;
                        var3.field_r = 5;
                        break L2;
                      }
                    }
                    if (0 == (var2.field_s & nr.field_Y)) {
                      break L1;
                    } else {
                      var3 = gj.a(true, 8, nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, uo.field_Ob), (String) null);
                      var3.field_q = df.field_f;
                      var3.field_r = 5;
                      break L1;
                    }
                  } else {
                    L3: {
                      L4: {
                        stackIn_13_0 = 1;

                        stackIn_13_1 = 3;

                        if (this.field_I.field_z > 0) {
                          break L4;
                        } else {






                          if (0 >= this.field_I.field_y) {
                            stackIn_16_0 = stackIn_13_0;
                            stackIn_16_1 = stackIn_13_1;
                            stackIn_16_2 = this.e(-30360, this.field_I.field_A);
                            break L3;
                          } else {


                            break L4;
                          }
                        }
                      }
                      stackIn_16_0 = stackIn_13_0;
                      stackIn_16_1 = stackIn_13_1;
                      stackIn_16_2 = nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, vp.field_e);
                      break L3;
                    }
                    gj.a(stackIn_16_0 != 0, stackIn_16_1, stackIn_16_2, (String) null);
                    break L1;
                  }
                } else {
                  gj.a(true, 3, this.e(-30360, this.field_I.field_A), (String) null);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 == -14034) {
                break L5;
              } else {
                this.field_x = (kj[]) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.RA(" + param0 + ')');
        }
    }

    private final void y(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var3 = 50 / ((18 - param0) / 54);
            var2_int = this.field_I.field_f.a(-1);
            if (0 == (var2_int ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (this.field_I.field_l.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (this.field_I.field_l[var4].field_s) {
                      if ((var2_int ^ -1) != (this.field_I.field_f.b(var4, 30554) ^ -1)) {
                        break L2;
                      } else {
                        ji.field_b[var4] = 32;
                        break L2;
                      }
                    } else {
                      ji.field_b[var4] = 0;
                      no.field_n[var4] = 0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 82) {
              if ((this.field_l ^ -1) >= -1) {
                stackIn_21_0 = -1;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                L1: {
                  var2_int = -5 + il.field_f.field_w + -5;
                  var3 = -7 + (il.field_f.field_y - 7);
                  var4 = this.b(-16439) + 5;
                  var5 = (-il.field_f.field_A + fl.field_q.field_ib >> 701792033) - -7;
                  var6 = wn.field_i - var4;
                  if (-1 < (var6 ^ -1)) {
                    break L1;
                  } else {
                    if ((var2_int ^ -1) <= (var6 ^ -1)) {
                      L2: {
                        var7 = -var5 + gg.field_f;
                        if (0 > var7) {
                          break L2;
                        } else {
                          if (var3 < var7) {
                            break L2;
                          } else {
                            stackIn_19_0 = this.b(var3, -var7 + var3, (byte) 30);
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      stackIn_17_0 = -1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -58;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            L1: {
              if (-no.field_q.field_A >= fm.field_M) {
                break L1;
              } else {
                L2: {
                  bq.field_n.a(of.field_Ob, fm.field_M, 128);
                  no.field_q.c(of.field_Ob, fm.field_M);
                  var3 = this.field_I.j(109);
                  if (0 > this.field_I.field_A) {
                    stackIn_5_0 = var3.field_L;
                    break L2;
                  } else {
                    stackIn_5_0 = this.field_I.field_A;
                    break L2;
                  }
                }
                L3: {
                  var4 = stackIn_5_0;
                  var5 = this.e(-30360, var4);
                  var6 = 16 + of.field_Ob;
                  if (this.field_I.field_n <= 1) {
                    tk.field_k.field_pb = false;
                    break L3;
                  } else {
                    var6 = this.a(-30818, var6, no.field_q.field_y / 2 + fm.field_M, tk.field_k);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (this.x((byte) -102)) {
                      break L5;
                    } else {
                      if (this.field_I.field_f.f(114)) {
                        break L5;
                      } else {
                        if (this.field_I.field_f instanceof rj) {
                          break L5;
                        } else {
                          sa.field_h.d(var5, var6, tq.field_q, 16777215, 0);
                          var6 = var6 + this.field_F[var4];
                          break L4;
                        }
                      }
                    }
                  }
                  var7_ref_String = nr.a(new String[]{var5}, -1, this.H(2));
                  sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
                  var6 = var6 + sa.field_h.b(var7_ref_String);
                  break L4;
                }
                L6: {
                  if (!this.field_I.field_f.f(119)) {
                    break L6;
                  } else {
                    q.field_b.field_hb = this.field_I.field_f.b(var3, 1);
                    var6 = this.a(-30818, var6, fm.field_M + no.field_q.field_y / 2, q.field_b);
                    break L6;
                  }
                }
                L7: {
                  if (!(this.field_I.field_f instanceof rj)) {
                    break L7;
                  } else {
                    var7_ref_String = Integer.toString(((rj) ((Object) this.field_I.field_f)).field_e[var4]);
                    sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
                    var6 = var6 + sa.field_h.b(var7_ref_String);
                    break L7;
                  }
                }
                L8: {
                  if (this.field_I.field_o) {
                    L9: {
                      if (param1) {
                        break L9;
                      } else {
                        if (23 != ne.field_w) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (0 > this.field_I.field_A) {
                        var7_ref_String = no.field_b;
                        break L10;
                      } else {
                        if ((hq.field_c & this.field_L) != 0) {
                          L11: {
                            var8_int = this.field_I.field_f.b((byte) -121, this.field_I.field_f.c(-59, this.field_I.field_A));
                            if (-2 <= (se.a(false, var8_int) ^ -1)) {
                              if (this.field_I.field_A != this.field_db) {
                                var7_ref_String = nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, ge.field_r);
                                break L11;
                              } else {
                                var7_ref_String = il.field_h;
                                break L11;
                              }
                            } else {
                              var7_ref_String = this.a(jq.field_h, ge.field_r, gk.field_jb, nf.field_db, (byte) 61, var8_int, sk.field_e, il.field_h);
                              break L11;
                            }
                          }
                          break L10;
                        } else {
                          if (-1 != (f.field_f & this.field_L ^ -1)) {
                            if (this.field_I.field_m) {
                              var7_ref_String = bc.field_a + "<br>" + lh.b(this.field_o, (byte) -80);
                              break L10;
                            } else {
                              var7_ref_String = ql.field_b;
                              break L10;
                            }
                          } else {
                            if ((sk.field_d & this.field_L) == 0) {
                              var7_ref_String = nr.a(new String[]{this.field_I.field_h[this.field_I.field_A]}, -1, ge.field_r);
                              break L10;
                            } else {
                              if ((var3.field_s & ag.field_e ^ -1) == -1) {
                                var7_ref_String = nd.field_g;
                                break L10;
                              } else {
                                var7_ref_String = il.field_h;
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      if (sa.field_v == var7_ref_String) {
                        break L12;
                      } else {
                        if (!var7_ref_String.equals(sa.field_v)) {
                          sa.field_v = var7_ref_String;
                          ig.field_i = ic.a(1, param0, 320, var7_ref_String, 4);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ig.field_i.c(qh.field_l - ig.field_i.field_z >> -539606431, 80);
                    if ((f.field_f & this.field_L) == 0) {
                      sa.field_h.a(nf.field_Z, bi.field_d);
                      sa.field_h.b(fl.field_m, qh.field_l >> -663657695, 150, 16777215, 0);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    if ((var4 ^ -1) <= -1) {
                      discarded$0 = this.a(var6, no.field_q.field_y / 2 + fm.field_M, (byte) -51);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L13: {
                  L14: {
                    if (-1 != this.field_I.field_q) {
                      break L14;
                    } else {
                      if ((f.field_f & this.field_L ^ -1) != -1) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if ((this.field_L & f.field_f) != 0) {
                      stackIn_81_0 = 0;
                      break L15;
                    } else {
                      stackIn_81_0 = 49;
                      break L15;
                    }
                  }
                  L16: {
                    var7 = (stackIn_81_0 + this.field_o) / 50;
                    var9 = -1;
                    if (-1 == (this.field_L & f.field_f ^ -1)) {
                      var8 = Integer.toString(var7);
                      if ((this.field_o ^ -1) >= -2) {
                        break L16;
                      } else {
                        if (-251 >= (this.field_o ^ -1)) {
                          break L16;
                        } else {
                          if ((this.field_I.j(72).field_q ^ -1) == -1) {
                            var9 = (-250 + this.field_o << 505206990) / 50;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    } else {
                      L17: {
                        var10 = 150;
                        var11 = this.field_v - -750;
                        if (-1 == this.field_v) {
                          break L17;
                        } else {
                          if (var10 > this.field_o + -var11) {
                            var9 = (-var11 + this.field_o << 870576046) / 50;
                            var12 = this.field_v + (this.field_o - this.field_v) * (this.field_o - var11) / var10;
                            var7 = (var12 - -49) / 50;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (var7 < 3600) {
                          var8 = ek.a(var7 / 60, var7 % 60, 10);
                          break L18;
                        } else {
                          var8 = p.a(var7 / 60 % 60, var7 % 60, 45, var7 / 60 / 60);
                          break L18;
                        }
                      }
                      break L16;
                    }
                  }
                  var8 = nr.a(new String[]{var8}, -1, p.field_n);
                  if ((var9 ^ -1) == 0) {
                    sa.field_h.d(var8, vk.field_H + 4, tq.field_q, 16777215, 0);
                    break L13;
                  } else {
                    sa.field_h.b(var8, 4 + vk.field_H, tq.field_q, 16777215, 0, (o.a(var9, (byte) -64) >> 1393626379) + 191);
                    break L13;
                  }
                }
                of.a(353, false, (no.field_q.field_y >> -309355711) + fm.field_M);
                break L1;
              }
            }
            L19: {
              this.b(param0);
              if ((hq.field_c & this.field_L ^ -1) == -1) {
                break L19;
              } else {
                if (lc.field_U != null) {
                  lc.field_U.a((byte) -79, false);
                  break L19;
                } else {
                  break L19;
                }
              }
            }
            L20: {
              if (param0) {
                break L20;
              } else {
                field_y = (byte[][]) null;
                break L20;
              }
            }
            this.B(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.HC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void A(byte param0) {
        float[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        try {
          L0: {
            var2 = new float[640];
            var3 = mj.a(-31121);
            var4 = mj.a(-31121);
            var5_int = 0;
            L1: while (true) {
              if (-641 >= (var5_int ^ -1)) {
                sa.field_h.d("audio falloff start=" + re.field_a + " speed=" + k.a((long)ap.field_G, 3, true, 8) + " (" + ap.field_G + ")" + ", slope=" + ue.field_e, 10, 50, 65280, 3355443);
                qh.d(0, 440, 0, 445, 65280);
                sa.field_h.d("camera", 1, 460, 65280, 1);
                qh.d(qh.field_l / 2, 440, qh.field_l / 2, 445, 65280);
                sa.field_h.b("table length dist", qh.field_l / 2, 460, 65280, 1);
                qh.d(-1 + qh.field_l, 440, qh.field_l - 1, 445, 65280);
                sa.field_h.c("2x table length dist", -1 + qh.field_l, 460, 65280, 1);
                var5 = -16.0f;
                var6 = 300.0f;
                var7 = 1;
                L2: while (true) {
                  if (var7 >= 640) {
                    L3: {
                      if (param0 >= 43) {
                        break L3;
                      } else {
                        this.field_N = 27;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    qh.d(var7 + -1, -(int)((-var5 + var2[-1 + var7]) * 480.0f / (-var5 + var6)) + 479, var7, 479 + -(int)((var2[var7] - var5) * 480.0f / (var6 - var5)), 65280);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (!Float.isNaN(var2[var5_int])) {
                    break L4;
                  } else {
                    var2[var5_int] = 0.0f;
                    break L4;
                  }
                }
                var3[2] = var5_int * 9216 / 640;
                ma.a(2, var3, var4);
                var2[var5_int] = (float)mn.field_g;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.FB(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -43) {
                break L1;
              } else {
                this.field_S = 64;
                break L1;
              }
            }
            L2: {
              if (al.field_B[param0] == dq.field_a) {
                break L2;
              } else {
                dq.field_a.e(-26707);
                dq.field_a = al.field_B[param0];
                dq.field_a.a(2147483647, this.field_I);
                this.K(0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.CB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_f = -56;
                break L1;
              }
            }
            L2: {
              if ((this.field_G.field_d ^ -1) != (param2 ^ -1)) {
                break L2;
              } else {
                if (this.field_G.field_e == param1) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            var4 = this.a(param1, param2, this.field_G.field_k, this.field_Q, (byte) 95, this.field_G.field_h);
            if (null != var4) {
              this.field_G.field_d = param2;
              this.field_G.field_k = var4[0];
              this.field_G.field_e = var4[2];
              this.field_G.field_d = var4[1];
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.m(93);
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.WC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    private final String H(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 2) {
              L1: {
                if (gj.field_S != 2) {
                  stackIn_7_0 = vl.field_r;
                  break L1;
                } else {
                  stackIn_7_0 = rc.field_g;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final boolean h(int param0) {
        double stackIn_71_0 = 0.0;
        double stackIn_72_0 = 0.0;
        int stackIn_72_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (0 == this.field_t) {
                this.field_t = this.a(param0 ^ 10487, ne.field_s, false);
                break L1;
              } else {
                if (this.a(9587, cd.field_b, true) != this.field_t) {
                  this.field_t = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((this.field_t ^ -1) == -1) {
                break L2;
              } else {
                var2_int = this.field_o;
                var3 = var2_int;
                var4 = var3 + dk.field_f;
                var5_int = var4 % 7621;
                var6 = var4 / 7621;
                var4 = var5_int + 7621 * ((4 + var6) % 31676);
                dk.field_f = var4 + -var3;
                wq.field_c = wq.field_c & -65536 | ((wq.field_c & 65535) + 4) % 31676;
                break L2;
              }
            }
            L3: {
              var2_int = 0;
              if (param0 == 3460) {
                break L3;
              } else {
                field_hb = -62;
                break L3;
              }
            }
            L4: {
              if (this.field_N == -1) {
                break L4;
              } else {
                if (0 != (this.field_k ^ -1)) {
                  var5_int = this.field_t;
                  if (var5_int != 2) {
                    if (-2 != (var5_int ^ -1)) {
                      if (4 != var5_int) {
                        if (3 == var5_int) {
                          L5: {
                            var3 = -(-this.field_N + wn.field_i);
                            this.field_R = -1;
                            if (-20 <= var3) {
                              if (-10 <= var3) {
                                if ((var3 ^ -1) < -21) {
                                  var3 = var3 * 2 + -20 + 10;
                                  break L5;
                                } else {
                                  if (10 < var3) {
                                    var3 = (-20 + var3) * 3 - -30;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                var3 = -10 + 2 * (var3 - -10);
                                break L5;
                              }
                            } else {
                              var3 = 3 * (var3 + 20) + -30;
                              break L5;
                            }
                          }
                          L6: {
                            if (this.field_N == wn.field_i) {
                              break L6;
                            } else {
                              this.c(param0 ^ -3521, this.field_G.field_h + var3);
                              break L6;
                            }
                          }
                          L7: {
                            if ((this.field_k ^ -1) == (gg.field_f ^ -1)) {
                              break L7;
                            } else {
                              L8: {
                                stackIn_105_0 = this;

                                stackIn_105_1 = 512;

                                if (th.field_h) {
                                  stackIn_106_0 = this;
                                  stackIn_106_1 = stackIn_105_1;
                                  stackIn_106_2 = -(-gg.field_f + this.field_k);
                                  break L8;
                                } else {
                                  stackIn_103_0 = this;

                                  stackIn_106_0 = this;
                                  stackIn_106_1 = stackIn_105_1;
                                  stackIn_106_2 = -gg.field_f + this.field_k;
                                  break L8;
                                }
                              }
                              this.f(stackIn_106_1, stackIn_106_2);
                              break L7;
                            }
                          }
                          var2_int = 1;
                          id.field_c.field_g = true;
                          hh.field_c = true;
                          break L4;
                        } else {
                          if (-6 != (var5_int ^ -1)) {
                            break L4;
                          } else {
                            this.field_R = -1;
                            var4 = this.g((byte) 113);
                            if (-1 != var4) {
                              this.b(var4, true);
                              this.b(true, var4);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        this.field_R = -1;
                        var2_int = 1;
                        this.b((byte) 86, this.field_k + -gg.field_f);
                        break L4;
                      }
                    } else {
                      L9: {
                        L10: {
                          if (this.field_N != wn.field_i) {
                            break L10;
                          } else {
                            if (gg.field_f == this.field_k) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (this.b(1, 0, false)) {
                          L11: {
                            this.field_R = -1;
                            var5 = this.field_eb.a(true);
                            var7 = this.field_eb.a((byte) 116);
                            if (this.field_k != gg.field_f) {
                              L12: {
                                stackIn_71_0 = var7;

                                if (th.field_h) {
                                  stackIn_72_0 = stackIn_71_0;
                                  stackIn_72_1 = -(this.field_k + -gg.field_f);
                                  break L12;
                                } else {
                                  stackIn_72_0 = stackIn_71_0;
                                  stackIn_72_1 = -gg.field_f + this.field_k;
                                  break L12;
                                }
                              }
                              var7 = stackIn_72_0 + (double)stackIn_72_1 * 3.141592653589793 / 2.0 / 480.0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            if ((wn.field_i ^ -1) != (this.field_N ^ -1)) {
                              var5 = var5 + 3.141592653589793 * (double)((wn.field_i + -this.field_N) * 2) / 640.0;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          this.field_eb.a(var7, 1, var5);
                          this.field_O.a(144, this.field_eb);
                          this.field_D = true;
                          this.field_M = -1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var2_int = 1;
                      break L4;
                    }
                  } else {
                    L14: {
                      var2_int = 1;
                      if ((this.field_N ^ -1) != (wn.field_i ^ -1)) {
                        break L14;
                      } else {
                        if ((this.field_k ^ -1) == (gg.field_f ^ -1)) {
                          break L4;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (this.b(1, 1, false)) {
                      this.field_R = -1;
                      var5 = Math.max(12.0, this.field_eb.d(8) * ((double)(-this.field_k + gg.field_f) / 256.0 + 1.0));
                      this.field_eb.a(true, var5);
                      this.field_O.a(true, var5);
                      this.field_M = -1;
                      this.field_D = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            if (0 == this.field_t) {
              this.field_k = -1;
              this.field_N = -1;
              stackIn_130_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L15: {
                L16: {
                  if (var2_int == 0) {
                    break L16;
                  } else {
                    if (this.field_N == -1) {
                      break L16;
                    } else {
                      if (this.field_k != -1) {
                        lg.field_s.a((java.awt.Component) ((Object) vj.a((byte) -54)), this.field_N, -80, this.field_k);
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                this.field_k = gg.field_f;
                this.field_N = wn.field_i;
                break L15;
              }
              stackIn_128_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EE(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_128_0 != 0;
        } else {
          return stackIn_130_0 != 0;
        }
    }

    private final int b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = (int)Math.round((double)param2 * Math.pow((double)param0 / 4096.0, 0.5));
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
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void p(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        pq var3 = null;
        or var4 = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        int var6_int = 0;
        long var6 = 0L;
        aa var7 = null;
        cr var8_ref_cr = null;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Pool.field_O;
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
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var2_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= this.field_I.field_l.length) {
                            statePc = 85;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = this.field_I.field_l[var2_int];
                        var4 = var3.field_q;
                        if (null != var4) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4.field_c) {
                            statePc = 84;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (1 == var4.field_n) {
                            statePc = 74;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-6 == (var4.field_n ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 != var4.field_n) {
                            statePc = 84;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = 2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4 = var4.field_f;
                        if (null == var4) {
                            statePc = 33;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var4.field_c ? 1 : 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var4.a(-5877, this.field_I.field_c)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5--;
                        if ((var5 ^ -1) < -1) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_25_0 = var5;
                        stackIn_34_0 = stackIn_25_0;
                        if (false) {
                            statePc = 25;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (kh.field_gc.a(param0 ^ -657)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        kh.field_gc.a(13, 128, (byte) 125, 128);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3.field_q.field_c = true;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5_ref_qe = this.field_I.j(param0 ^ -704);
                        if (this.field_I.field_f.a(var5_ref_qe.field_z, (byte) 125, var2_int)) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        kh.field_gc.a(14, 128, (byte) 99, 128);
                        var3.field_q.field_c = true;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6_int = 0;
                        var7 = new aa(var5_ref_qe.field_m);
                        var8_ref_cr = (cr) ((Object) var7.b((byte) -92));
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == var8_ref_cr) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_86_0 = var2_int;
                        stackIn_51_0 = stackIn_86_0;
                        stackIn_86_1 = var8_ref_cr.field_n;
                        stackIn_51_1 = stackIn_86_1;
                        if (false) {
                            statePc = 86;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == stackIn_51_1) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (this.field_I.field_f.a(var5_ref_qe.field_z, (byte) 124, var8_ref_cr.field_n)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var6_int = 1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8_ref_cr = (cr) ((Object) var7.b(param0 ^ 697));
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var5_ref_qe.field_t) {
                            statePc = 73;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var6_int != 0) {
                            statePc = 71;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (kh.field_gc.a(124)) {
                            statePc = 73;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        kh.field_gc.a(11, 128, (byte) -112, 128);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        kh.field_gc.a(12, 128, (byte) -106, 128);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3.field_q.field_c = true;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var5 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((this.field_I.field_w.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var6 = (long)(-this.field_I.field_w[var5].field_g + var3.field_g);
                        var8 = (long)(-this.field_I.field_w[var5].field_f + var3.field_k);
                        var10 = var6 * var6 + var8 * var8 >> -1893400624;
                        stackIn_3_0 = ((var10 ^ -1L) < -75759617L ? -1 : ((var10 ^ -1L) == -75759617L ? 0 : 1));
                        stackIn_77_0 = stackIn_3_0;
                        if (false) {
                            statePc = 3;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (stackIn_77_0 <= 0) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        kh.field_gc.a(13, 128, (byte) -101, 128);
                        var3.field_q.field_c = true;
                        var3.field_q = null;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var5++;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = param0;
                        stackIn_86_1 = -709;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 == stackIn_86_1) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        this.k((byte) 81);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw wm.a((Throwable) ((Object) var2), "uf.R(" + param0 + ')');
                }
                case 91: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0, boolean param1) {
        int stackIn_53_0 = 0;
        StringBuilder stackIn_53_1 = null;
        int stackIn_54_0 = 0;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        an stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        an stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        an stackIn_96_0 = null;
        an stackIn_97_0 = null;
        String stackIn_97_1 = null;
        int stackIn_154_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        int stackIn_183_0 = 0;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_187_4 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        int stackIn_191_0 = 0;
        int stackIn_191_1 = 0;
        int stackIn_191_2 = 0;
        int stackIn_191_3 = 0;
        int stackIn_195_4;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        float[] var3 = null;
        String var3_ref = null;
        long var3_long = 0L;
        aa var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int[] var4_ref_int__ = null;
        bf var4_ref_bf = null;
        int var4 = 0;
        qe var4_ref_qe = null;
        af var4_ref_af = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        String var5_ref_String = null;
        int var6 = 0;
        pq var6_ref_pq = null;
        kj var6_ref_kj = null;
        tc var6_ref_tc = null;
        df var6_ref_df = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        try {
          L0: {
            L1: {
              if (-1L == (2L & pd.field_i ^ -1L)) {
                break L1;
              } else {
                cl.a(16751001, param0 ^ 301, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{432.0f, 144.0f, 0.0f});
                cl.a(10092441, 1, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 288.0f, 0.0f});
                cl.a(10066431, 1, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 144.0f, 144.0f});
                break L1;
              }
            }
            L2: {
              if ((pd.field_i & 16L ^ -1L) == -1L) {
                break L2;
              } else {
                if (this.field_I.a(this.field_G.field_e, this.field_G.field_h, this.field_G.field_k, 359, this.field_Q, this.field_G.field_d)) {
                  break L2;
                } else {
                  sa.field_h.b("cue intersects something!", 320, 240, 16764142, 1);
                  break L2;
                }
              }
            }
            L3: {
              if ((8192L & pd.field_i ^ -1L) != -1L) {
                var3_int = 0;
                L4: while (true) {
                  if (var3_int >= this.field_I.field_c.length) {
                    var3_int = 0;
                    L5: while (true) {
                      if (var3_int >= this.field_I.field_e.length) {
                        break L3;
                      } else {
                        L6: {
                          var4_ref_int__ = this.field_I.field_e[var3_int];
                          var5 = (var4_ref_int__[0] >> -784938291) + -this.field_ab[0];
                          var6 = -this.field_ab[1] + (var4_ref_int__[1] >> -1807663891);
                          var7 = -64 - this.field_ab[2];
                          var8 = this.field_ab[11] * var7 + this.field_ab[10] * var6 + this.field_ab[9] * var5 >> -353466352;
                          if (0 >= var8) {
                            break L6;
                          } else {
                            var9 = (this.field_ab[4] * var6 + (this.field_ab[3] * var5 + this.field_ab[5] * var7) >> 351867015) / var8 + 320;
                            var10 = 240 - -((var5 * this.field_ab[6] - -(var6 * this.field_ab[7]) + var7 * this.field_ab[8] >> 701469159) / var8);
                            if (qh.field_b >= var9) {
                              break L6;
                            } else {
                              if (qh.field_j <= var9) {
                                break L6;
                              } else {
                                if (var10 <= qh.field_c) {
                                  break L6;
                                } else {
                                  if ((var10 ^ -1) <= (qh.field_g ^ -1)) {
                                    break L6;
                                  } else {
                                    sa.field_h.d("point " + var3_int, var9, var10, 14522879, 3355443);
                                    qh.d(-4 + var9, var10, var9 - -4, var10, 16768409);
                                    qh.d(var9, var10 + -4, var9, var10 + 4, 16768409);
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var3_int++;
                        continue L5;
                      }
                    }
                  } else {
                    L7: {
                      var4_ref_bf = this.field_I.field_c[var3_int];
                      var5 = -this.field_ab[0] + (var4_ref_bf.field_a - -var4_ref_bf.field_f >> -1332741522);
                      var6 = (var4_ref_bf.field_l + var4_ref_bf.field_j >> 1214940206) - this.field_ab[1];
                      var7 = -64 - this.field_ab[2];
                      var8 = var6 * this.field_ab[10] + var5 * this.field_ab[9] - -(var7 * this.field_ab[11]) >> 1790596080;
                      if (var8 <= 0) {
                        break L7;
                      } else {
                        var9 = 320 + (this.field_ab[3] * var5 + (var6 * this.field_ab[4] - -(this.field_ab[5] * var7)) >> -385532441) / var8;
                        var10 = (var6 * this.field_ab[7] + (this.field_ab[6] * var5 - -(var7 * this.field_ab[8])) >> 222039975) / var8 + 240;
                        if (qh.field_b >= var9) {
                          break L7;
                        } else {
                          if ((var9 ^ -1) <= (qh.field_j ^ -1)) {
                            break L7;
                          } else {
                            if ((var10 ^ -1) >= (qh.field_c ^ -1)) {
                              break L7;
                            } else {
                              if ((qh.field_g ^ -1) >= (var10 ^ -1)) {
                                break L7;
                              } else {
                                sa.field_h.b("wall " + var3_int, var9, var10, 16768409, 3355443);
                                qh.d(-4 + var9, var10, var9 + 4, var10, 16768409);
                                qh.d(var9, -4 + var10, var9, var10 - -4, 16768409);
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            L8: {
              if ((8L & pd.field_i ^ -1L) == -1L) {
                break L8;
              } else {
                var3 = new float[3];
                var4 = -1 + pd.field_f.length;
                L9: while (true) {
                  if ((var4 ^ -1) > -1) {
                    break L8;
                  } else {
                    L10: {
                      var5 = pd.field_f[var4];
                      if (var5 < this.field_I.field_l.length) {
                        L11: {
                          var6_ref_pq = this.field_I.field_l[var5];
                          var3[0] = (float)(var6_ref_pq.field_g / 8192);
                          var3[2] = (float)(var6_ref_pq.field_j / 8192);
                          var3[1] = (float)(var6_ref_pq.field_k / 8192);
                          ag.a(this.field_ab, var3, param0 ^ 293);
                          var7 = (int)(0.5f + var3[0]);
                          var8 = (int)(0.5f + var3[1]);
                          stackIn_53_0 = var8;

                          stackIn_53_1 = new StringBuilder();

                          if (var6_ref_pq.field_s) {
                            stackIn_54_0 = stackIn_53_0;
                            stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                            stackIn_54_2 = "in play: ";
                            break L11;
                          } else {
                            stackIn_54_0 = stackIn_53_0;
                            stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                            stackIn_54_2 = "potted: ";
                            break L11;
                          }
                        }
                        L12: {
                          er.a(stackIn_54_0, stackIn_54_2 + var6_ref_pq.b(param0 + -12350), var7, 1, sa.field_h, true, 11193599);
                          var8 = var8 - (sa.field_h.field_w + sa.field_h.field_C);
                          if (ap.field_D == null) {
                            break L12;
                          } else {
                            if (ap.field_D[var5] != null) {
                              er.a(var8, "finished: " + ap.field_D[var5].field_o.i(), var7, 1, sa.field_h, true, 11193599);
                              var8 = var8 - (sa.field_h.field_C - -sa.field_h.field_w);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        er.a(var8, "@" + var6_ref_pq.field_g + "," + var6_ref_pq.field_k, var7, 1, sa.field_h, true, 65535);
                        var8 = var8 - (sa.field_h.field_C - -sa.field_h.field_w);
                        er.a(var8, Integer.toString(var5), var7, 1, sa.field_h, true, 11193599);
                        var8 = var8 - (sa.field_h.field_w + sa.field_h.field_C);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var4--;
                    continue L9;
                  }
                }
              }
            }
            L13: {
              if (0L == (32768L & pd.field_i)) {
                break L13;
              } else {
                sa.field_h.d(kh.field_gc.b((byte) 123), 10, 50, 16772795, 1);
                sa.field_h.d(kh.field_gc.c((byte) 32), 10, 70, 16772795, 1);
                cl.a(16772795, 1, this.field_ab, new float[]{rj.e(2304, 3), rj.e(1152, param0 + -297), 0.0f}, new float[]{rj.e(kh.field_gc.field_q + 2304, 3), rj.e(1152 - -kh.field_gc.field_e, 3), rj.e(0 - -kh.field_gc.field_u, 3)});
                break L13;
              }
            }
            L14: {
              if ((pd.field_i & 4194304L) == 0L) {
                break L14;
              } else {
                var3_ref = "extra_model_dist=" + hf.field_a + "; extra_model_dist_scatter=" + fl.field_l + "; extra_model_z=" + kh.field_vc + "; num_extra_models=" + ek.field_a;
                sa.field_h.d(var3_ref, 10, 70, 15650047, 1);
                break L14;
              }
            }
            L15: {
              if (-1L == (pd.field_i & 65536L ^ -1L)) {
                break L15;
              } else {
                sa.field_h.d("Generated balls: Segments=" + ne.field_v + ", slices=" + hr.field_b + ", polys/ball=" + ne.field_v * (hr.field_b * 2), 10, 70, 16772795, 1);
                var3_int = -sa.field_h.field_w + 480 - 4;
                var4 = 0;
                L16: while (true) {
                  if ((var4 ^ -1) <= (pd.field_f.length ^ -1)) {
                    break L15;
                  } else {
                    sa.field_h.d(var4 + ": " + pd.field_f[var4] + " dist=" + tc.field_d[var4], 300, var3_int, 16772829, 0);
                    var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                    var4++;
                    continue L16;
                  }
                }
              }
            }
            L17: {
              if (param0 == 300) {
                break L17;
              } else {
                this.b((byte) -76, 91);
                break L17;
              }
            }
            L18: {
              if ((1L & pd.field_i) == 0L) {
                break L18;
              } else {
                rk.a((byte) 114);
                break L18;
              }
            }
            L19: {
              if (0L != (8192L & pd.field_i)) {
                var3_int = 476 - sa.field_h.field_w;
                sa.field_h.d("currentplayer " + this.field_I.field_A + ", extra shots " + this.field_I.field_z + ", extra visits " + this.field_I.field_y, 300, var3_int, 16772829, 0);
                var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if ((2L & pd.field_i) != 0L) {
                L21: {
                  var3_int = -4 + -sa.field_h.field_w + 480;
                  sa.field_h.d("cur cam ang " + (int)(this.field_eb.a(true) * 180.0 / 3.141592653589793) + ", " + (int)(180.0 * this.field_eb.a((byte) 106) / 3.141592653589793) + ", dist " + this.field_eb.d(param0 ^ 292), 300, var3_int, 16772829, 0);
                  var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                  sa.field_h.d("drag " + this.field_t + ", prev=" + this.field_N + ", " + this.field_k, 300, var3_int, 16772829, 0);
                  var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                  sa.field_h.d("cur tgt " + this.field_eb.field_f / 576.0 + ", " + this.field_eb.field_m / 288.0 + ", " + (this.field_eb.field_k + 8.0) / 512.0, 300, var3_int, 16772829, 0);
                  var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                  sa.field_h.d("cur pos " + this.field_eb.field_d / 576.0 + ", " + this.field_eb.field_a / 288.0 + ", " + this.field_eb.field_h / 512.0, 300, var3_int, 16772829, 0);
                  var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                  var4_ref_qe = new qe();
                  var5_ref_qe = var4_ref_qe;
                  var6_ref_kj = this.field_G;
                  var5_ref_qe.field_V = (short)var6_ref_kj.field_n;
                  var5_ref_qe.field_A = (short)var6_ref_kj.field_k;
                  var5_ref_qe.field_H = (byte)var6_ref_kj.field_e;
                  var5_ref_qe.field_D = (byte)var6_ref_kj.field_d;
                  var5_ref_qe.field_C = (short)((var6_ref_kj.field_h - -1024) % 2048);
                  sa.field_h.d(var4_ref_qe.e(param0 + -300), 300, var3_int, 16772829, 0);
                  var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                  sa.field_h.d("cue ang " + this.field_G.field_h + ", " + this.field_G.field_k + ", power " + this.field_Q + ", loc " + id.field_c.field_l[0] + ",  " + id.field_c.field_l[1] + ", " + id.field_c.field_l[2], 300, var3_int, 16772829, 0);
                  var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                  stackIn_88_0 = sa.field_h;

                  stackIn_88_1 = new StringBuilder().append("shot_camera_strategy  ").append(this.field_Z);

                  if (this.field_T) {
                    stackIn_89_0 = (an) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = " tracking";
                    break L21;
                  } else {
                    stackIn_89_0 = (an) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "";
                    break L21;
                  }
                }
                ((an) (Object) stackIn_89_0).d(stackIn_89_2, 300, var3_int, 16772829, 0);
                var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                sa.field_h.d("camera_location " + this.field_M, 300, var3_int, 16772829, 0);
                break L20;
              } else {
                break L20;
              }
            }
            L22: {
              if ((2048L & pd.field_i) == 0L) {
                break L22;
              } else {
                L23: {
                  stackIn_96_0 = sa.field_h;

                  if (!this.field_kb) {
                    stackIn_97_0 = (an) ((Object) stackIn_96_0);
                    stackIn_97_1 = "||";
                    break L23;
                  } else {

                    stackIn_97_0 = (an) ((Object) stackIn_96_0);
                    stackIn_97_1 = "|>";
                    break L23;
                  }
                }
                ((an) (Object) stackIn_97_0).d(stackIn_97_1, -(sa.field_h.field_C * 2) + 640, -10 + (480 + (-(2 * sa.field_h.field_w) + -sa.field_h.field_C)), 16777215, 1);
                break L22;
              }
            }
            L24: {
              if (-1L == (128L & pd.field_i ^ -1L)) {
                break L24;
              } else {
                this.h((byte) -28);
                break L24;
              }
            }
            L25: {
              if (-1L != (16777216L & pd.field_i ^ -1L)) {
                if (tl.field_N.d(-11414)) {
                  var3_long = tl.field_N.c((byte) -93);
                  var5 = (int)(var3_long / 1000L);
                  var6 = var5 / 1000;
                  var5 = var5 % 1000;
                  var7 = var6 / 60;
                  sa.field_h.d("midip: ", 10, 380, 13421823, 1118515);
                  var6 = var6 % 60;
                  sa.field_h.c(Integer.toString(var7), 68, 380, 13421823, 1118515);
                  sa.field_h.c(Integer.toString(var6), 85, 380, 13421823, 1118515);
                  sa.field_h.c(Integer.toString(var5), 110, 380, 13421823, 1118515);
                  break L25;
                } else {
                  sa.field_h.d("midip: stopped", 10, 380, 13421823, 1118515);
                  break L25;
                }
              } else {
                break L25;
              }
            }
            L26: {
              if ((1048576L & pd.field_i) != 0L) {
                var3_int = 320;
                var4 = 40;
                var5 = 0;
                L27: while (true) {
                  if (this.field_I.field_w.length <= var5) {
                    break L26;
                  } else {
                    L28: {
                      var6_ref_tc = this.field_I.field_w[var5].field_c;
                      if (null == var6_ref_tc) {
                        break L28;
                      } else {
                        if (-1 <= (var6_ref_tc.a((byte) 122) ^ -1)) {
                          break L28;
                        } else {
                          var7_ref_String = "pocket " + var5 + ": " + var6_ref_tc.a(0, 2229);
                          var8 = 1;
                          L29: while (true) {
                            if ((var6_ref_tc.a((byte) 112) ^ -1) >= (var8 ^ -1)) {
                              sa.field_h.d(var7_ref_String, var3_int, var4, 10066329, 8947848);
                              var4 = var4 + sa.field_h.field_G;
                              break L28;
                            } else {
                              var7_ref_String = var7_ref_String + ", " + var6_ref_tc.a(var8, param0 + 1929);
                              var8++;
                              continue L29;
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L27;
                  }
                }
              } else {
                break L26;
              }
            }
            L30: {
              if ((67108864L & pd.field_i ^ -1L) == -1L) {
                break L30;
              } else {
                var3_int = 60;
                var4 = 0;
                L31: while (true) {
                  if (qh.field_f <= var3_int) {
                    break L30;
                  } else {
                    if ((md.field_a.length ^ -1) >= (var4 ^ -1)) {
                      break L30;
                    } else {
                      L32: {
                        var5_ref_String = md.field_a[var4];
                        if (!fe.a(oa.field_g, -13671, var4)) {
                          break L32;
                        } else {
                          var5_ref_String = var5_ref_String + " [all]";
                          break L32;
                        }
                      }
                      L33: {
                        if (!fe.a(hp.field_c, -13671, var4)) {
                          break L33;
                        } else {
                          var5_ref_String = var5_ref_String + " [this game]";
                          break L33;
                        }
                      }
                      L34: {
                        if (md.field_a[var4] != var5_ref_String) {
                          sa.field_h.d(var5_ref_String, 40, var3_int, 16764074, 1);
                          var3_int = var3_int + sa.field_h.field_G;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      var4++;
                      continue L31;
                    }
                  }
                }
              }
            }
            L35: {
              if (-1L != (134217728L & pd.field_i ^ -1L)) {
                var3_ref2 = new aa(this.field_I.field_u);
                var4_ref_qe = (qe) ((Object) var3_ref2.b((byte) -92));
                var5 = 0;
                var6 = 0;
                var7 = 60;
                var8 = 40;
                var9 = 80;
                L36: while (true) {
                  L37: {
                    if (qh.field_f <= var7) {
                      break L37;
                    } else {
                      if (null == var4_ref_qe) {
                        break L37;
                      } else {
                        L38: {
                          if (null != var4_ref_qe.field_U) {
                            L39: {
                              var10 = 0;
                              if (-1 != (1 & var4_ref_qe.field_L ^ -1)) {
                                stackIn_154_0 = var9;
                                break L39;
                              } else {
                                stackIn_154_0 = var8;
                                break L39;
                              }
                            }
                            var11 = stackIn_154_0;
                            var12 = 0;
                            L40: while (true) {
                              if (var12 >= var4_ref_qe.field_U.length) {
                                L41: {
                                  sa.field_h.d(" =" + var10, var11, var7, 16764074, 1);
                                  if ((1 & var4_ref_qe.field_L ^ -1) == -1) {
                                    var5 = var5 + var10;
                                    break L41;
                                  } else {
                                    var6 = var6 + var10;
                                    break L41;
                                  }
                                }
                                var7 = var7 + sa.field_h.field_G;
                                break L38;
                              } else {
                                var13 = "+" + var4_ref_qe.field_U[var12];
                                sa.field_h.d(var13, var11, var7, 16777215, 1);
                                var11 = var11 + sa.field_h.b(var13);
                                var10 = var10 + var4_ref_qe.field_U[var12];
                                var12++;
                                continue L40;
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                        var4_ref_qe = (qe) ((Object) var3_ref2.b(-96));
                        continue L36;
                      }
                    }
                  }
                  sa.field_h.d("p1=" + var5, var8, var7, 16764074, 1);
                  sa.field_h.d("p2=" + var6, var9, var7, 16764074, 1);
                  var7 = var7 + sa.field_h.field_G;
                  break L35;
                }
              } else {
                break L35;
              }
            }
            L42: {
              if ((pd.field_i & 262144L) != 0L) {
                if (pq.field_i == null) {
                  break L42;
                } else {
                  dn.a(0, param0 + 30109, 3, pq.field_i);
                  break L42;
                }
              } else {
                break L42;
              }
            }
            L43: {
              if ((pd.field_i & 16777216L) != 0L) {
                this.A((byte) 95);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              if ((8388608L & pd.field_i) == 0L) {
                break L44;
              } else {
                this.field_I.e(12226, 0);
                var3_int = this.field_I.field_l[0].field_g >> 1094651309;
                var4 = this.field_I.field_l[0].field_k >> 1028886573;
                var5 = 1;
                L45: while (true) {
                  if (this.field_I.field_r.length <= var5) {
                    break L44;
                  } else {
                    L46: {
                      var6_ref_df = this.field_I.field_r[var5];
                      if (!var6_ref_df.a((byte) -8, 0, this.field_I)) {
                        break L46;
                      } else {
                        L47: {
                          stackIn_182_0 = param0 + -293;

                          stackIn_182_1 = var4;

                          stackIn_182_2 = -64;

                          if (var6_ref_df.field_j) {
                            stackIn_183_0 = stackIn_182_0;
                            stackIn_183_1 = stackIn_182_1;
                            stackIn_183_2 = stackIn_182_2;
                            stackIn_183_3 = 255;
                            break L47;
                          } else {



                            stackIn_183_0 = stackIn_182_0;
                            stackIn_183_1 = stackIn_182_1;
                            stackIn_183_2 = stackIn_182_2;
                            stackIn_183_3 = 64;
                            break L47;
                          }
                        }
                        L48: {








                          if (var6_ref_df.field_h) {




                            stackIn_187_4 = 16727871;
                            break L48;
                          } else {




                            stackIn_187_4 = 4145151;
                            break L48;
                          }
                        }
                        L49: {
                          co.a(stackIn_183_0, stackIn_183_1, stackIn_183_2, stackIn_183_3, stackIn_187_4, this.field_ab, var3_int + (o.a(var6_ref_df.field_k, (byte) -120) * (var6_ref_df.field_l >> -648410643) >> -1738830768), -64, (af.c((byte) -128, var6_ref_df.field_k) * (var6_ref_df.field_l >> -1313566451) >> -1125076592) + var4, var3_int);
                          stackIn_190_0 = 7;

                          stackIn_190_1 = var4;

                          stackIn_190_2 = -64;

                          if (!var6_ref_df.field_j) {
                            stackIn_191_0 = stackIn_190_0;
                            stackIn_191_1 = stackIn_190_1;
                            stackIn_191_2 = stackIn_190_2;
                            stackIn_191_3 = 64;
                            break L49;
                          } else {
                            stackIn_191_0 = stackIn_190_0;
                            stackIn_191_1 = stackIn_190_1;
                            stackIn_191_2 = stackIn_190_2;
                            stackIn_191_3 = 255;
                            break L49;
                          }
                        }
                        L50: {








                          if (var6_ref_df.field_h) {




                            stackIn_195_4 = 16744255;
                            break L50;
                          } else {




                            stackIn_195_4 = 4161535;
                            break L50;
                          }
                        }
                        co.a(stackIn_191_0, stackIn_191_1, stackIn_191_2, stackIn_191_3, stackIn_195_4, this.field_ab, (o.a(var6_ref_df.field_d, (byte) 92) * (var6_ref_df.field_l >> 1233636461) >> 1017798704) + var3_int, -64, var4 + (af.c((byte) -128, var6_ref_df.field_d) * (var6_ref_df.field_l >> 1081385613) >> -1809290288), var3_int);
                        break L46;
                      }
                    }
                    var5++;
                    continue L45;
                  }
                }
              }
            }
            L51: {
              if ((pd.field_i & 536870912L) == 0L) {
                break L51;
              } else {
                L52: {
                  var3_int = 480 + -sa.field_h.field_w - 4;
                  if (this.field_I.field_f instanceof af) {
                    var4_ref_af = (af) ((Object) this.field_I.field_f);
                    sa.field_h.d("groups allocations: {" + var4_ref_af.field_g[0] + ", " + var4_ref_af.field_g[1] + "}", 300, var3_int, 16772829, 0);
                    var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                    break L52;
                  } else {
                    break L52;
                  }
                }
                sa.field_h.d("shot mode: " + this.field_T, 300, var3_int, 16772829, 0);
                var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                sa.field_h.d("ruleset: " + this.field_I.field_f.getClass().getName(), 300, var3_int, 16772829, 0);
                var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                sa.field_h.d("cg.currentplayer: " + this.field_I.field_A, 300, var3_int, 16772829, 0);
                var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                var4 = 0;
                var5 = 0;
                var6 = 3456;
                var7 = 1152;
                var8 = 0;
                L53: while (true) {
                  if (var8 >= 2000) {
                    break L51;
                  } else {
                    L54: {
                      var4 += 2048;
                      if ((var4 ^ -1) <= -262145) {
                        var5 = var5 + dn.a(67108864 / (var4 >> 1544952616), false);
                        break L54;
                      } else {
                        var5 += 256;
                        break L54;
                      }
                    }
                    var5 = var5 % 4096;
                    var9 = (af.c((byte) -123, var5) >> -147134140) * (var4 >> -69083316);
                    var10 = (o.a(var5, (byte) -67) >> 1822104196) * (var4 >> 2105433772);
                    var11 = 3456 + (var9 >> -1308327827);
                    var12 = 1152 + (var10 >> -1018721203);
                    bb.a(var12, this.field_ab, var6, -28361, 13408614, var11, var7, 0, 0);
                    cd.a(var11, var12, this.field_ab, 16764057, 10521, 0);
                    var7 = var12;
                    var6 = var11;
                    var8++;
                    continue L53;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref3), "uf.AE(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_M = -1;
              this.field_O.a((uf) (this), 1);
              if (param0 == 117) {
                break L1;
              } else {
                this.a(false, (byte) 49);
                break L1;
              }
            }
            this.field_D = true;
            this.field_O.a(true, 1.0);
            this.field_T = true;
            uo.c(false);
            this.field_G.field_n = this.field_Q;
            this.field_R = -1;
            kh.field_gc.a(9, 256, (byte) -112, 128);
            kh.field_gc.b(-50, this.field_G.field_n);
            this.field_h = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.M(" + param0 + ')');
        }
    }

    final void a(int param0, String[] param1, hq param2) {
        pq[] array$0 = null;
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
        al var4 = null;
        RuntimeException var4_ref = null;
        al var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            un.a(676);
            vi.a(-7414);
            this.field_c = param2;
            this.field_S = 200;
            this.field_c.field_a = (uf) (this);
            this.a(param1, this.field_c.field_n, -115, -1);
            this.c((byte) -121);
            var4 = this.field_I;
            f.field_g = 12;
            var5 = var4;
            pq.field_B = new pq[12][];
            var6 = 0;
            L1: while (true) {
              if ((var6 ^ -1) <= (pq.field_B.length ^ -1)) {
                rb.field_e = new ar[pq.field_B.length * 12];
                if (param0 > 25) {
                  var6 = 0;
                  L2: while (true) {
                    if ((rb.field_e.length ^ -1) >= (var6 ^ -1)) {
                      wh.field_g = 0;
                      this.c(0, 0, 126);
                      this.field_c.a(-1);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      rb.field_e[var6] = new ar();
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                array$0 = new pq[var5.field_l.length];
                pq.field_B[var6] = array$0;
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= (pq.field_B[var6].length ^ -1)) {
                    var6++;
                    continue L1;
                  } else {
                    pq.field_B[var6][var7] = new pq();
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("uf.UC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_long = 0L;
            var4 = 0L;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if ((this.field_I.field_l.length ^ -1) >= (var7 ^ -1)) {
                var7 = 45 % ((-21 - param0) / 58);
                this.field_R = -1;
                this.field_O.field_f = cr.a((byte) 89, var2_long) / (double)var6;
                this.field_O.field_m = cr.a((byte) 89, var4) / (double)var6;
                break L0;
              } else {
                L2: {
                  if (!this.field_I.field_l[var7].field_s) {
                    break L2;
                  } else {
                    if ((this.field_I.field_l[var7].field_v ^ -1) != -1) {
                      var2_long = var2_long + (long)this.field_I.field_l[var7].field_g;
                      var4 = var4 + (long)this.field_I.field_l[var7].field_k;
                      var6++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.IC(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-1 > (ij.field_G ^ -1)) {
                L2: {
                  if (ij.field_G > 25) {
                    uo.c(false);
                    ui.a(tn.field_p, 16729156, -6, false, 1);
                    vj.a((String) null, (byte) 18, jd.field_f, 7);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ij.field_G = ij.field_G - 1;
                if (-1 == (ij.field_G ^ -1)) {
                  qg.a((byte) 48, 7);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -47) {
                break L3;
              } else {
                this.c(-48, (ge) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.KC(" + param0 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              id.field_c.field_g = true;
              if (param0 == 0) {
                break L1;
              } else {
                this.field_Q = -11;
                break L1;
              }
            }
            hh.field_c = true;
            this.field_I.c(param0 ^ -88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.OA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (ij.field_G >= 50) {
                break L1;
              } else {
                ij.field_G = ij.field_G + 2;
                break L1;
              }
            }
            L2: {
              if (param0 > 88) {
                break L2;
              } else {
                this.f((byte) 65);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.BC(" + param0 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              tk.field_k = new vh();
              q.field_b = new vh();
              b.field_H = new vh();
              qo.field_F = new vh();
              df.field_f = new vh();
              ub.field_q = new vh();
              this.e(false);
              q.field_b.field_hb = mf.field_n;
              b.field_H.field_hb = iq.field_d;
              qo.field_F.field_hb = gd.field_e;
              df.field_f.field_hb = il.field_a;
              ub.field_q.field_hb = oo.field_D;
              if (kh.field_gc != nn.field_b[param1]) {
                L2: {
                  if (null != kh.field_gc) {
                    kh.field_gc.d(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                kh.field_gc = nn.field_b[param1];
                kh.field_gc.a(this.field_I, 21894);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              kh.field_gc.b(this.field_I, 0);
              kh.field_gc.b(false);
              if (al.field_B[param0] == dq.field_a) {
                L4: {
                  if (dq.field_a.field_j == null) {
                    break L4;
                  } else {
                    if (dq.field_a.field_j.length != this.field_I.field_l.length) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                dq.field_a.a(2147483647, this.field_I);
                break L3;
              } else {
                L5: {
                  if (dq.field_a == null) {
                    break L5;
                  } else {
                    dq.field_a.e(-26707);
                    break L5;
                  }
                }
                dq.field_a = al.field_B[param0];
                dq.field_a.a(2147483647, this.field_I);
                break L3;
              }
            }
            id.field_c = kh.field_gc.field_A;
            id.field_c.field_g = true;
            kh.field_gc.a((byte) -116, this.field_ab);
            this.field_I.field_f.c(-83);
            var4_int = 0;
            L6: while (true) {
              if ((this.field_I.field_l.length ^ -1) >= (var4_int ^ -1)) {
                L7: {
                  am.field_q = 150;
                  ff.field_c = true;
                  this.field_g = -1;
                  id.field_c.field_g = true;
                  hh.field_c = true;
                  wb.field_a = true;
                  if (param2 > 70) {
                    break L7;
                  } else {
                    this.field_eb = (mm) null;
                    break L7;
                  }
                }
                this.field_p = -1;
                this.field_D = true;
                aq.b(0);
                break L0;
              } else {
                this.field_I.field_l[var4_int].a(120);
                this.field_I.field_l[var4_int].field_p = true;
                var4_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.CC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String d(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder stackIn_25_0 = null;
        StringBuilder stackIn_29_0 = null;
        String stackIn_29_1 = null;
        String stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -22804) {
                break L1;
              } else {
                this.field_T = true;
                break L1;
              }
            }
            L2: {
              var3 = new StringBuilder(this.e(-30360, param0));
              var4 = 0;
              if (!(this.field_I.field_f instanceof rj)) {
                if ((this.field_I.field_p & 1 << param0 ^ -1) == -1) {
                  break L2;
                } else {
                  L3: {
                    if (var4 != 0) {
                      discarded$0 = var3.append(' ');
                      break L3;
                    } else {
                      var4 = 1;
                      var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, -1, this.H(2)));
                      break L3;
                    }
                  }
                  discarded$1 = var3.append(n.field_Q);
                  break L2;
                }
              } else {
                L4: {
                  var5 = ((rj) ((Object) this.field_I.field_f)).field_e[param0];
                  if (var4 != 0) {
                    discarded$2 = var3.append(' ');
                    break L4;
                  } else {
                    var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, -1, this.H(2)));
                    var4 = 1;
                    break L4;
                  }
                }
                L5: {
                  if (1 >= var5) {
                    discarded$3 = var3.append("<col=ff9999>");
                    break L5;
                  } else {
                    if (var5 == 2) {
                      discarded$4 = var3.append("<col=ffff99>");
                      break L5;
                    } else {
                      if (3 == var5) {
                        discarded$5 = var3.append("<col=99ff99>");
                        break L5;
                      } else {
                        if (-4 <= (var5 ^ -1)) {
                          break L5;
                        } else {
                          discarded$6 = var3.append("<col=99ffff>");
                          break L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  stackIn_25_0 = (StringBuilder) (var3);

                  if (this.field_I.field_f.a((byte) 50, param0)) {


                    if ((this.field_I.field_p & 1 << param0 ^ -1) != -1) {
                      stackIn_29_0 = (StringBuilder) ((Object) stackIn_25_0);
                      stackIn_29_1 = n.field_Q;
                      break L6;
                    } else {
                      stackIn_29_0 = (StringBuilder) ((Object) stackIn_25_0);
                      stackIn_29_1 = Integer.toString(var5);
                      break L6;
                    }
                  } else {
                    stackIn_29_0 = (StringBuilder) ((Object) stackIn_25_0);
                    stackIn_29_1 = rg.field_l;
                    break L6;
                  }
                }
                discarded$7 = ((StringBuilder) (Object) stackIn_29_0).append(stackIn_29_1);
                discarded$8 = var3.append("</col>");
                break L2;
              }
            }
            L7: {
              L8: {
                if (!this.field_I.field_o) {
                  break L8;
                } else {
                  if ((1 << param0 & this.field_I.field_b) != 0) {
                    L9: {
                      if (var4 != 0) {
                        discarded$9 = var3.append(' ');
                        break L9;
                      } else {
                        var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, param1 + 22803, this.H(2)));
                        var4 = 1;
                        break L9;
                      }
                    }
                    discarded$10 = var3.append(ge.field_n);
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if ((this.field_I.field_x & 1 << param0) == 0) {
                break L7;
              } else {
                L10: {
                  if (var4 == 0) {
                    var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, param1 ^ 22803, this.H(param1 + 22806)));
                    var4 = 1;
                    break L10;
                  } else {
                    discarded$11 = var3.append(' ');
                    break L10;
                  }
                }
                discarded$12 = var3.append(sh.field_R);
                break L7;
              }
            }
            stackIn_56_0 = var3.toString();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.VD(" + param0 + ',' + param1 + ')');
        }
        return stackIn_56_0;
    }

    private final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            id.field_c.field_g = true;
            hh.field_c = true;
            this.field_I.b(param0, 456);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.FD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void w(byte param0) {
        RuntimeException decompiledCaughtException = null;
        pq var2 = null;
        RuntimeException var2_ref = null;
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        al var7 = null;
        pq var8 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 106) {
                break L1;
              } else {
                field_X = 61;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = this.field_I.field_l[this.field_V];
                if ((wn.field_i ^ -1) != (vn.field_b ^ -1)) {
                  break L3;
                } else {
                  if (up.field_m != gg.field_f) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var3 = new double[]{(double)var2.field_g / 65536.0, (double)var2.field_k / 65536.0, (double)var2.field_j / 65536.0};
                rq.a(-64, gg.field_f, false, this.field_eb.d(8), wn.field_i, var3, this.field_ab);
                var4 = var2.field_g;
                var5 = var2.field_k;
                if (this.field_I.a((int)(65536.0 * var3[1] + 0.5), (int)(65536.0 * var3[0] + 0.5), -96, this.field_V, true)) {
                  vm.field_f = vm.field_f | this.field_V;
                  if (this.b(1, 13, false)) {
                    L5: {
                      var2.field_p = true;
                      hh.field_c = true;
                      var2.field_j = -524288;
                      this.field_Y = true;
                      if ((this.field_V ^ -1) != -1) {
                        break L5;
                      } else {
                        id.field_c.field_g = true;
                        break L5;
                      }
                    }
                    var6 = this.field_I.j(83);
                    var7 = this.field_I;
                    var8 = var7.field_l[0];
                    var6.field_Q = var8.field_k;
                    var6.field_P = var8.field_g;
                    break L4;
                  } else {
                    var2.field_g = var4;
                    var2.field_k = var5;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              vn.field_b = wn.field_i;
              up.field_m = gg.field_f;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.BE(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) <= (nn.field_b.length ^ -1)) {
                break L1;
              } else {
                if (kh.field_gc == nn.field_b[param1]) {
                  break L1;
                } else {
                  dq.field_a.e(param0 + -26831);
                  kh.field_gc.d(true);
                  kh.field_gc = nn.field_b[param1];
                  id.field_c = kh.field_gc.field_A;
                  id.field_c.field_g = true;
                  dq.field_a = al.field_B[param1];
                  dq.field_a.a(2147483647, this.field_I);
                  kh.field_gc.a(this.field_I, 21894);
                  kh.field_gc.a((byte) 115, this.field_ab);
                  this.field_I.field_f.c(-42);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 124) {
                break L2;
              } else {
                this.field_i = (String[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.SD(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_L & hq.field_c ^ -1) != param0) {
              L1: {
                if (this.field_db != this.field_I.field_A) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
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
          throw wm.a((Throwable) ((Object) var2), "uf.TC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void a(boolean param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_I = (al) null;
                break L1;
              }
            }
            L2: {
              var2 = new float[]{(float)this.field_I.field_l[0].field_g / 65536.0f, (float)this.field_I.field_l[0].field_k / 65536.0f, (float)this.field_I.field_l[0].field_j / 65536.0f};
              var3 = (float)this.field_G.field_d / 128.0f;
              var4 = (float)this.field_G.field_e / 128.0f;
              var5 = (float)Math.sqrt((double)(-(var3 * var3) + 1.0f - var4 * var4));
              var2[1] = var2[1] + 8.0f * (var5 * (float)id.field_c.field_l[10] + ((float)id.field_c.field_l[7] * var4 + var3 * (float)id.field_c.field_l[4])) / 65536.0f;
              var2[0] = var2[0] + 8.0f * (var5 * (float)id.field_c.field_l[9] + (var3 * (float)id.field_c.field_l[3] + var4 * (float)id.field_c.field_l[6])) / 65536.0f;
              var2[2] = var2[2] + 8.0f * (var4 * (float)id.field_c.field_l[8] + var3 * (float)id.field_c.field_l[5] + (float)id.field_c.field_l[11] * var5) / 65536.0f;
              if (!this.field_T) {
                break L2;
              } else {
                hr.a(var2, 16724787, -114, this.field_ab);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.WA(" + param0 + ')');
        }
    }

    final void K(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (this.field_I.field_l.length <= var2_int) {
                break L0;
              } else {
                this.field_I.field_l[var2_int].field_p = true;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.V(" + param0 + ')');
        }
    }

    private final void m(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var2_int = -240 + this.field_U << 1807096912;
              if (param0 >= 112) {
                break L1;
              } else {
                this.w(-58);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = 240 + -(fl.field_q.field_ib >> -1852332799);
                var4 = -var3 + this.field_U;
                var5 = this.field_P - var3;
                if (var5 > gg.field_f) {
                  break L3;
                } else {
                  if ((gg.field_f ^ -1) < (var4 ^ -1)) {
                    break L3;
                  } else {
                    if (wn.field_i >= this.field_n) {
                      break L3;
                    } else {
                      ff.field_c = true;
                      am.field_q = 150;
                      break L2;
                    }
                  }
                }
              }
              if (-1 <= (am.field_q ^ -1)) {
                break L2;
              } else {
                fieldTemp$0 = am.field_q - 1;
                am.field_q = am.field_q - 1;
                if (-1 == (fieldTemp$0 ^ -1)) {
                  ff.field_c = false;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              L5: {
                if (!ff.field_c) {
                  break L5;
                } else {
                  if (-1 < (t.field_e ^ -1)) {
                    t.field_e = t.field_e + 2;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (ff.field_c) {
                break L4;
              } else {
                if (-this.field_n >= t.field_e) {
                  break L4;
                } else {
                  t.field_e = t.field_e - 1;
                  break L4;
                }
              }
            }
            var6 = 0;
            L6: while (true) {
              L7: {
                if ((this.field_C ^ -1) >= (var6 ^ -1)) {
                  break L7;
                } else {
                  var7 = this.field_ib[var6];
                  var8 = this.field_I.field_l[var7];
                  L8: while (true) {
                    if (!var8.field_s) {
                      L9: {
                        L10: {
                          var8.field_p = true;
                          if (var8.field_v != 0) {
                            break L10;
                          } else {
                            if ((var8.field_k ^ -1) <= (var2_int ^ -1)) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var8.field_t < 262144) {
                            var8.field_t = var8.field_t + 4096;
                            if (var8.field_v == 0) {
                              var8.field_v = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        var8.a((byte) -124);
                        var8.field_w = 0;
                        var8.a(false);
                        break L9;
                      }
                      L12: {
                        if ((var2_int ^ -1) < (var8.field_k ^ -1)) {
                          var2_int = var8.field_k;
                          break L12;
                        } else {
                          var8.field_k = var2_int;
                          var8.d((byte) 102);
                          break L12;
                        }
                      }
                      var2_int = var2_int - 1048576;
                      var6++;
                      continue L6;
                    } else {
                      var8.field_o = false;
                      var8.d((byte) 87);
                      var9 = 1 + var6;
                      L13: while (true) {
                        if (var9 >= this.field_C) {
                          this.field_C = this.field_C - 1;
                          if ((this.field_C ^ -1) == (var6 ^ -1)) {
                            break L7;
                          } else {
                            var7 = this.field_ib[var6];
                            var8 = this.field_I.field_l[var7];
                            continue L8;
                          }
                        } else {
                          this.field_ib[var9 + -1] = this.field_ib[var9];
                          var9++;
                          continue L13;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.UB(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_J = null;
              field_y = (byte[][]) null;
              field_K = null;
              field_gb = null;
              if (param0) {
                break L1;
              } else {
                field_y = (byte[][]) null;
                break L1;
              }
            }
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "uf.KB(" + param0 + ')');
        }
    }

    private final String[] h(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        String[] stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.c(-32);
                break L1;
              }
            }
            L2: {
              if ((this.field_I.field_f.e(111) ^ -1) == (this.field_I.field_n ^ -1)) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_7_0;
              stackIn_10_0 = this.field_I.field_n;

              if (var2_int != 0) {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = this.field_I.field_f.e(119) + -1;
                break L3;
              } else {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = 0;
                break L3;
              }
            }
            var3 = new String[stackIn_11_0 - -stackIn_11_1];
            var4 = -1;
            var6 = 0;
            var7 = 0;
            L4: while (true) {
              L5: {
                if (var6 >= var3.length) {
                  break L5;
                } else {
                  if (var7 >= this.field_I.field_n) {
                    break L5;
                  } else {
                    L6: {
                      if (var2_int != 0) {
                        L7: {
                          var5 = this.field_I.field_f.c(-119, var7);
                          if (var4 == -1) {
                            break L7;
                          } else {
                            if ((var5 ^ -1) != (var4 ^ -1)) {
                              incrementValue$0 = var6;
                              var6++;
                              var3[incrementValue$0] = tp.field_a;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var4 = var5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if ((this.field_I.field_A ^ -1) == (var7 ^ -1)) {
                        incrementValue$1 = var6;
                        var6++;
                        var3[incrementValue$1] = "<col=9999ff>" + this.d(var7, -22804) + "</col>";
                        break L8;
                      } else {
                        incrementValue$2 = var6;
                        var6++;
                        var3[incrementValue$2] = this.d(var7, -22804);
                        break L8;
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              }
              stackIn_35_0 = (String[]) (var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.QA(" + param0 + ')');
        }
        return stackIn_35_0;
    }

    final void E(int param0) {
        Object stackIn_7_0 = null;
        mm stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0;
        mm stackIn_10_1;
        int stackIn_10_2;
        double[][] stackIn_10_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_R = -1;
              if (param0 == -24070) {
                break L1;
              } else {
                this.h((byte) 96);
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_7_0 = this;

                stackIn_7_1 = this.field_O;

                stackIn_7_2 = param0 ^ 29962;

                if (!un.field_b) {
                  break L3;
                } else {
                  stackIn_9_0 = this;

                  if (-1 != (hq.field_c & this.field_L ^ -1)) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = (mm) ((Object) stackIn_7_1);
                    stackIn_10_2 = stackIn_7_2;
                    stackIn_10_3 = f.field_a;
                    break L2;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = (mm) ((Object) stackIn_7_1);

                    break L3;
                  }
                }
              }
              stackIn_10_0 = this;
              stackIn_10_1 = (mm) ((Object) stackIn_7_1);
              stackIn_10_2 = stackIn_7_2;
              stackIn_10_3 = f.field_c;
              break L2;
            }
            ((uf) (this)).field_M = ((mm) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3);
            this.field_D = true;
            this.e(param0 + 23954);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.GD(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 88) {
                break L1;
              } else {
                this.field_eb = (mm) null;
                break L1;
              }
            }
            this.z(4476);
            this.field_C = 0;
            var2_int = 0;
            L2: while (true) {
              if ((var2_int ^ -1) <= (this.field_I.field_w.length ^ -1)) {
                break L0;
              } else {
                L3: {
                  var3 = this.field_I.field_w[var2_int];
                  if (null == var3.field_c) {
                    break L3;
                  } else {
                    var4 = 0;
                    L4: while (true) {
                      if ((var3.field_c.a((byte) 117) ^ -1) >= (var4 ^ -1)) {
                        break L3;
                      } else {
                        var5 = var3.field_c.a(var4, 2229);
                        this.field_I.field_l[var5].field_o = false;
                        this.a(0, var5);
                        var4++;
                        continue L4;
                      }
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.KA(" + param0 + ')');
        }
    }

    final void o(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (0 != (hq.field_c & this.field_L)) {
              L1: {
                if (param0 <= -15) {
                  break L1;
                } else {
                  this.d(63, true);
                  break L1;
                }
              }
              ej.field_j.b(false, 68);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.JC(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, vh param3) {
        RuntimeException var5 = null;
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
              param3.field_Db = param3.field_hb.field_y;
              param3.field_pb = true;
              if (param0 == -30818) {
                break L1;
              } else {
                this.field_Q = -110;
                break L1;
              }
            }
            param3.field_qb = param1;
            param3.field_eb = -(param3.field_hb.field_y >> -1776104127) + param2;
            param3.field_gb = param3.field_hb.field_w;
            param3.a((byte) -79, false);
            stackIn_4_0 = param1 + param3.field_hb.field_w + 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("uf.ID(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void u(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_T) {
                if (-1 <= (this.field_l ^ -1)) {
                  break L1;
                } else {
                  this.field_l = this.field_l - 64;
                  if (-1 < (this.field_l ^ -1)) {
                    this.field_l = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if ((this.field_l ^ -1) > -1025) {
                  this.field_l = this.field_l + 64;
                  if (1024 < this.field_l) {
                    this.field_l = 1024;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            var2_int = -33 / ((20 - param0) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.WB(" + param0 + ')');
        }
    }

    final void z(byte param0) {
        int[] var2 = null;
        try {
            var2 = dq.field_a.b(0, param0 + -1);
            op.a(gd.field_a, 2, ci.field_s, 1, this.field_ab, (byte) 1, (var2.length - 1) / 4, var2, op.field_d, param0, kg.field_s);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.SA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) < -769) {
                param1 = 768;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_I.a(this.field_G.field_e, this.field_G.field_h, param1, 359, this.field_Q, this.field_G.field_d)) {
                break L2;
              } else {
                this.field_G.field_k = param1;
                break L2;
              }
            }
            L3: {
              if (param0 == 1) {
                break L3;
              } else {
                this.b(10, (qe) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void n(byte param0) {
        cg dupTemp$0 = null;
        cg dupTemp$1 = null;
        cg dupTemp$2 = null;
        cg dupTemp$3 = null;
        cg dupTemp$4 = null;
        oo stackIn_618_0 = null;
        oo stackIn_619_0 = null;
        int stackIn_619_1 = 0;
        int stackIn_622_0 = 0;
        int stackIn_622_1 = 0;
        int stackIn_622_2 = 0;
        int stackIn_623_0;
        int stackIn_623_1;
        int stackIn_623_2;
        String stackIn_623_3;
        int stackIn_851_0 = 0;
        int stackIn_858_0 = 0;
        int stackIn_863_0 = 0;
        int stackIn_866_0 = 0;
        int stackIn_867_0 = 0;
        int stackIn_867_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ij var2 = null;
        int var2_int = 0;
        mm var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        mm var3_ref_mm = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 < -99) {
                break L1;
              } else {
                this.a(1, -99, 85);
                break L1;
              }
            }
            L2: {
              if (vj.field_c[82]) {
                if (vj.field_c[81]) {
                  var3 = qi.field_a;
                  if ((var3 ^ -1) != -2) {
                    if ((var3 ^ -1) == -3) {
                      this.a(1, (byte) -43);
                      break L2;
                    } else {
                      if (var3 == 3) {
                        this.a(2, (byte) -43);
                        break L2;
                      } else {
                        if ((var3 ^ -1) != -5) {
                          if (var3 != 5) {
                            if (var3 == 6) {
                              this.a(5, (byte) -43);
                              break L2;
                            } else {
                              if (-8 != (var3 ^ -1)) {
                                if ((var3 ^ -1) != -9) {
                                  if (var3 == 16) {
                                    ij.field_u = ul.field_m;
                                    ac.a(256, false, true, ul.field_m);
                                    break L2;
                                  } else {
                                    if (-18 == (var3 ^ -1)) {
                                      dupTemp$0 = nn.field_b[0].field_b;
                                      ij.field_u = dupTemp$0;
                                      ac.a(256, false, true, dupTemp$0);
                                      break L2;
                                    } else {
                                      if (var3 != 18) {
                                        if (19 != var3) {
                                          if (var3 == 20) {
                                            dupTemp$1 = nn.field_b[3].field_b;
                                            ij.field_u = dupTemp$1;
                                            ac.a(256, false, true, dupTemp$1);
                                            break L2;
                                          } else {
                                            if (21 == var3) {
                                              dupTemp$2 = nn.field_b[4].field_b;
                                              ij.field_u = dupTemp$2;
                                              ac.a(256, false, true, dupTemp$2);
                                              break L2;
                                            } else {
                                              if ((var3 ^ -1) == -65) {
                                                this.s(72);
                                                break L2;
                                              } else {
                                                if (-49 != (var3 ^ -1)) {
                                                  if (var3 != 40) {
                                                    if (66 != var3) {
                                                      if (var3 != 36) {
                                                        if (var3 != 56) {
                                                          if (39 == var3) {
                                                            this.y((byte) 99);
                                                            break L2;
                                                          } else {
                                                            if (-71 == (var3 ^ -1)) {
                                                              var2 = gj.a(true, 0, "Wowsers, penny!", (String) null);
                                                              var2.field_r = 8;
                                                              var2.field_v = 8;
                                                              break L2;
                                                            } else {
                                                              if (var3 != 69) {
                                                                if (41 != var3) {
                                                                  if (49 == var3) {
                                                                    break L2;
                                                                  } else {
                                                                    if ((var3 ^ -1) == -54) {
                                                                      L3: {
                                                                        if (wb.field_a) {
                                                                          stackIn_851_0 = 0;
                                                                          break L3;
                                                                        } else {
                                                                          stackIn_851_0 = 1;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                      wb.field_a = stackIn_851_0 != 0;
                                                                      break L2;
                                                                    } else {
                                                                      if ((var3 ^ -1) != -55) {
                                                                        if (-52 == (var3 ^ -1)) {
                                                                          L4: {
                                                                            var3 = ((qe) ((Object) this.field_I.field_u.c((byte) -52))).field_M;
                                                                            var4 = f.field_g;
                                                                            if (pq.field_B != null) {
                                                                              stackIn_863_0 = pq.field_B.length;
                                                                              break L4;
                                                                            } else {
                                                                              stackIn_863_0 = 0;
                                                                              break L4;
                                                                            }
                                                                          }
                                                                          L5: {
                                                                            var5 = stackIn_863_0;
                                                                            var6 = -var4 + var3 + 1465;
                                                                            var7 = var5 + (-var3 + 940);
                                                                            wq.field_c = 39595 + var6 | wq.field_c & -16777216;
                                                                            vm.field_f = vm.field_f & 65280;
                                                                            dk.field_f = var7 + 7621 * var6;
                                                                            field_fb = (var7 << 2065105456) - -998899712;
                                                                            stackIn_866_0 = dk.field_f;

                                                                            if ((this.field_o ^ -1) >= -1) {
                                                                              stackIn_867_0 = stackIn_866_0;
                                                                              stackIn_867_1 = 0;
                                                                              break L5;
                                                                            } else {
                                                                              stackIn_867_0 = stackIn_866_0;
                                                                              stackIn_867_1 = this.field_o;
                                                                              break L5;
                                                                            }
                                                                          }
                                                                          dk.field_f = stackIn_867_0 - stackIn_867_1;
                                                                          break L2;
                                                                        } else {
                                                                          if ((var3 ^ -1) == -68) {
                                                                            var3 = this.field_o;
                                                                            field_fb = 65535 & field_fb | (100 + (field_fb >>> 1861648464)) % 30484 << -500175920;
                                                                            var4 = var3;
                                                                            var5 = var4 + dk.field_f;
                                                                            var6 = var5 % 7621;
                                                                            var5 = (100 + var6) % 7621 + -var6 + var5;
                                                                            dk.field_f = var5 + -var4;
                                                                            break L2;
                                                                          } else {
                                                                            if (68 == var3) {
                                                                              var3 = this.field_o;
                                                                              var4 = var3;
                                                                              var5 = var4 + dk.field_f;
                                                                              var6 = var5 % 7621;
                                                                              var7 = var5 / 7621;
                                                                              var5 = 7621 * ((100 + var7) % 31676) + var6;
                                                                              dk.field_f = var5 + -var4;
                                                                              wq.field_c = -65536 & wq.field_c | ((65535 & wq.field_c) + 100) % 31676;
                                                                              break L2;
                                                                            } else {
                                                                              break L2;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L6: {
                                                                          if (ff.field_c) {
                                                                            stackIn_858_0 = 0;
                                                                            break L6;
                                                                          } else {
                                                                            stackIn_858_0 = 1;
                                                                            break L6;
                                                                          }
                                                                        }
                                                                        ff.field_c = stackIn_858_0 != 0;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  this.f((byte) 99);
                                                                  break L2;
                                                                }
                                                              } else {
                                                                em.a((byte) 123, false, 2, "Test message in the ticker!");
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          this.field_O.field_a = 144.0;
                                                          this.field_O.field_h = -143.19449088;
                                                          this.field_O.field_m = 144.0;
                                                          this.field_O.field_k = 0.0;
                                                          this.field_O.field_f = 379.3516416;
                                                          this.field_O.field_d = 718.8717888;
                                                          this.field_O.field_k = this.field_O.field_k - 8.0;
                                                          break L2;
                                                        }
                                                      } else {
                                                        if (this.field_c != null) {
                                                          this.field_c.a(-1);
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      hi.g(-128);
                                                      break L2;
                                                    }
                                                  } else {
                                                    this.a(-23095);
                                                    break L2;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          dupTemp$3 = nn.field_b[2].field_b;
                                          ij.field_u = dupTemp$3;
                                          ac.a(256, false, true, dupTemp$3);
                                          break L2;
                                        }
                                      } else {
                                        dupTemp$4 = nn.field_b[1].field_b;
                                        ij.field_u = dupTemp$4;
                                        ac.a(256, false, true, dupTemp$4);
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  this.a(7, (byte) -43);
                                  break L2;
                                }
                              } else {
                                this.a(6, (byte) -43);
                                break L2;
                              }
                            }
                          } else {
                            this.a(4, (byte) -43);
                            break L2;
                          }
                        } else {
                          this.a(3, (byte) -43);
                          break L2;
                        }
                      }
                    }
                  } else {
                    this.a(0, (byte) -43);
                    break L2;
                  }
                } else {
                  var2_int = qi.field_a;
                  if ((var2_int ^ -1) != -71) {
                    if ((var2_int ^ -1) == -41) {
                      this.field_Z = (this.field_Z + 1) % 6;
                      break L2;
                    } else {
                      if (-2 == (var2_int ^ -1)) {
                        this.a((byte) 124, 0);
                        break L2;
                      } else {
                        if (2 != var2_int) {
                          if ((var2_int ^ -1) == -4) {
                            this.a((byte) 124, 2);
                            break L2;
                          } else {
                            if (var2_int != 4) {
                              if (5 != var2_int) {
                                if (6 == var2_int) {
                                  this.a((byte) 124, 5);
                                  break L2;
                                } else {
                                  if (var2_int != 7) {
                                    if (8 != var2_int) {
                                      if (var2_int != 9) {
                                        if (-69 == (var2_int ^ -1)) {
                                          this.K(0);
                                          break L2;
                                        } else {
                                          if ((var2_int ^ -1) != -70) {
                                            if ((var2_int ^ -1) != -51) {
                                              if (-72 == (var2_int ^ -1)) {
                                                if (-1 != (hq.field_c & this.field_L ^ -1)) {
                                                  break L2;
                                                } else {
                                                  this.field_o = this.field_o - 1000;
                                                  break L2;
                                                }
                                              } else {
                                                if ((var2_int ^ -1) != -73) {
                                                  if (-52 == (var2_int ^ -1)) {
                                                    break L2;
                                                  } else {
                                                    if (52 == var2_int) {
                                                      break L2;
                                                    } else {
                                                      if (-68 == (var2_int ^ -1)) {
                                                        this.field_I.e(12226, 0);
                                                        break L2;
                                                      } else {
                                                        if (var2_int != 59) {
                                                          if (41 == var2_int) {
                                                            hh.field_c = true;
                                                            break L2;
                                                          } else {
                                                            if (-39 != (var2_int ^ -1)) {
                                                              if (39 == var2_int) {
                                                                break L2;
                                                              } else {
                                                                if ((var2_int ^ -1) != -33) {
                                                                  if (64 != var2_int) {
                                                                    if ((var2_int ^ -1) == -50) {
                                                                      li.a(2243, this.field_I);
                                                                      break L2;
                                                                    } else {
                                                                      if ((var2_int ^ -1) != -57) {
                                                                        if (36 != var2_int) {
                                                                          if (var2_int == 35) {
                                                                            this.field_I.e(-54);
                                                                            this.a(1 + ga.a(512, true, ea.field_r), false);
                                                                            if (this.field_I.field_f instanceof af) {
                                                                              this.field_I.field_f = (sq) ((Object) new af(this.field_I));
                                                                              break L2;
                                                                            } else {
                                                                              break L2;
                                                                            }
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          if ((this.field_L & sk.field_d ^ -1) == -1) {
                                                                            break L2;
                                                                          } else {
                                                                            this.field_c.a(-1);
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    this.q((byte) 114);
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  L7: {
                                                                    stackIn_618_0 = kh.field_gc;

                                                                    if (kh.field_gc.field_h) {
                                                                      stackIn_619_0 = (oo) ((Object) stackIn_618_0);
                                                                      stackIn_619_1 = 0;
                                                                      break L7;
                                                                    } else {

                                                                      stackIn_619_0 = (oo) ((Object) stackIn_618_0);
                                                                      stackIn_619_1 = 1;
                                                                      break L7;
                                                                    }
                                                                  }
                                                                  L8: {
                                                                    stackIn_619_0.field_h = stackIn_619_1 != 0;
                                                                    stackIn_622_0 = 122;

                                                                    stackIn_622_1 = 0;

                                                                    stackIn_622_2 = 1;

                                                                    if (!kh.field_gc.field_h) {
                                                                      stackIn_623_0 = stackIn_622_0;
                                                                      stackIn_623_1 = stackIn_622_1;
                                                                      stackIn_623_2 = stackIn_622_2;
                                                                      stackIn_623_3 = "Linear sorting";
                                                                      break L8;
                                                                    } else {
                                                                      stackIn_623_0 = stackIn_622_0;
                                                                      stackIn_623_1 = stackIn_622_1;
                                                                      stackIn_623_2 = stackIn_622_2;
                                                                      stackIn_623_3 = "Radial sorting";
                                                                      break L8;
                                                                    }
                                                                  }
                                                                  em.a((byte) stackIn_623_0, stackIn_623_1 != 0, stackIn_623_2, stackIn_623_3);
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          dq.field_a.a(7096);
                                                          dq.field_a.a(2147483647, this.field_I);
                                                          kh.field_gc.i(25879);
                                                          kh.field_gc.a(this.field_I, 21894);
                                                          kh.field_gc.a((byte) -128, this.field_ab);
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (-1 != (hq.field_c & this.field_L ^ -1)) {
                                                    break L2;
                                                  } else {
                                                    this.field_o = this.field_o + 1000;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              this.field_I.k(0);
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      } else {
                                        this.a((byte) 124, 8);
                                        break L2;
                                      }
                                    } else {
                                      this.a((byte) 124, 7);
                                      break L2;
                                    }
                                  } else {
                                    this.a((byte) 124, 6);
                                    break L2;
                                  }
                                }
                              } else {
                                this.a((byte) 124, 4);
                                break L2;
                              }
                            } else {
                              this.a((byte) 124, 3);
                              break L2;
                            }
                          }
                        } else {
                          this.a((byte) 124, 1);
                          break L2;
                        }
                      }
                    }
                  } else {
                    this.y(17);
                    break L2;
                  }
                }
              } else {
                if (!vj.field_c[86]) {
                  var4 = qi.field_a;
                  if (16 == var4) {
                    this.b(vj.field_c[82], 6, 0);
                    break L2;
                  } else {
                    if (17 == var4) {
                      this.b(vj.field_c[82], 115, 1);
                      break L2;
                    } else {
                      if (18 != var4) {
                        if (-20 != (var4 ^ -1)) {
                          if (20 == var4) {
                            this.b(vj.field_c[82], 100, 4);
                            break L2;
                          } else {
                            if (-22 != (var4 ^ -1)) {
                              if ((var4 ^ -1) != -23) {
                                if ((var4 ^ -1) != -24) {
                                  if ((var4 ^ -1) != -25) {
                                    if ((var4 ^ -1) == -26) {
                                      this.b(vj.field_c[82], 106, 9);
                                      break L2;
                                    } else {
                                      if (-27 == (var4 ^ -1)) {
                                        this.b(vj.field_c[82], 99, 10);
                                        break L2;
                                      } else {
                                        if (-44 == (var4 ^ -1)) {
                                          this.field_kb = true;
                                          break L2;
                                        } else {
                                          if (var4 != 85) {
                                            if ((var4 ^ -1) == -65) {
                                              this.field_eb.field_d = this.field_eb.field_f;
                                              this.field_O.a(144, this.field_eb);
                                              this.field_D = true;
                                              break L2;
                                            } else {
                                              if (-66 == (var4 ^ -1)) {
                                                this.field_eb.field_a = this.field_eb.field_m;
                                                this.field_O.a(144, this.field_eb);
                                                this.field_D = true;
                                                break L2;
                                              } else {
                                                if (-67 == (var4 ^ -1)) {
                                                  this.field_eb.field_f = 288.0;
                                                  var2_ref = this.field_eb;
                                                  var2_ref.field_d = 288.0;
                                                  this.field_O.a(144, this.field_eb);
                                                  this.field_D = true;
                                                  break L2;
                                                } else {
                                                  if (67 != var4) {
                                                    break L2;
                                                  } else {
                                                    var3_ref_mm = this.field_eb;
                                                    this.field_eb.field_m = 144.0;
                                                    var3_ref_mm.field_a = 144.0;
                                                    this.field_O.a(144, this.field_eb);
                                                    this.field_D = true;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            this.field_I.e(-51);
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.b(vj.field_c[82], 33, 8);
                                    break L2;
                                  }
                                } else {
                                  this.b(vj.field_c[82], 19, 7);
                                  break L2;
                                }
                              } else {
                                this.b(vj.field_c[82], 42, 6);
                                break L2;
                              }
                            } else {
                              this.b(vj.field_c[82], 78, 5);
                              break L2;
                            }
                          }
                        } else {
                          this.b(vj.field_c[82], 56, 3);
                          break L2;
                        }
                      } else {
                        this.b(vj.field_c[82], 14, 2);
                        break L2;
                      }
                    }
                  }
                } else {
                  var2_int = qi.field_a;
                  if (-33 == (var2_int ^ -1)) {
                    if (vj.field_c[81]) {
                      kh.field_gc.field_d = kh.field_gc.field_d + 1;
                      this.K(0);
                      break L2;
                    } else {
                      kh.field_gc.field_C = kh.field_gc.field_C + 1;
                      break L2;
                    }
                  } else {
                    if (var2_int != 48) {
                      if (var2_int != 33) {
                        if (49 == var2_int) {
                          if (!vj.field_c[81]) {
                            kh.field_gc.field_x = kh.field_gc.field_x - 1;
                            break L2;
                          } else {
                            kh.field_gc.field_m = kh.field_gc.field_m - 1;
                            this.K(0);
                            break L2;
                          }
                        } else {
                          if (var2_int != 34) {
                            if (var2_int == 50) {
                              kh.field_gc.field_j = kh.field_gc.field_j - 0.04908738521234052;
                              break L2;
                            } else {
                              if ((var2_int ^ -1) == -36) {
                                kh.field_gc.field_p = kh.field_gc.field_p + 0.04908738521234052;
                                break L2;
                              } else {
                                if (var2_int == 51) {
                                  kh.field_gc.field_p = kh.field_gc.field_p - 0.04908738521234052;
                                  break L2;
                                } else {
                                  if ((var2_int ^ -1) != -37) {
                                    if ((var2_int ^ -1) == -53) {
                                      kh.field_gc.field_E = kh.field_gc.field_E * 0.9375;
                                      break L2;
                                    } else {
                                      if (-38 == (var2_int ^ -1)) {
                                        kh.field_gc.field_z = kh.field_gc.field_z * 1.0078125f;
                                        break L2;
                                      } else {
                                        if (53 != var2_int) {
                                          if (38 != var2_int) {
                                            if (var2_int != 54) {
                                              if (var2_int != 39) {
                                                if (55 == var2_int) {
                                                  fl.field_l = fl.field_l * 15 / 16;
                                                  break L2;
                                                } else {
                                                  if (40 == var2_int) {
                                                    kh.field_vc = kh.field_vc - 50;
                                                    break L2;
                                                  } else {
                                                    if (var2_int != 56) {
                                                      if ((var2_int ^ -1) == -42) {
                                                        ek.field_a = ek.field_a + 1;
                                                        break L2;
                                                      } else {
                                                        if ((var2_int ^ -1) != -58) {
                                                          if (64 == var2_int) {
                                                            if (-1L == (pd.field_i & 16777216L ^ -1L)) {
                                                              break L2;
                                                            } else {
                                                              if (-17 > (re.field_a ^ -1)) {
                                                                re.field_a = re.field_a - 8;
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            if (var2_int == 65) {
                                                              if (-1L == (16777216L & pd.field_i ^ -1L)) {
                                                                break L2;
                                                              } else {
                                                                if (2304 <= re.field_a) {
                                                                  break L2;
                                                                } else {
                                                                  re.field_a = re.field_a + 8;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              if (-67 != (var2_int ^ -1)) {
                                                                if (var2_int == 67) {
                                                                  if ((pd.field_i & 16777216L) == 0L) {
                                                                    break L2;
                                                                  } else {
                                                                    if ((ue.field_e ^ -1) <= -65537) {
                                                                      break L2;
                                                                    } else {
                                                                      ue.field_e = ue.field_e * 17 / 16;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (-69 != (var2_int ^ -1)) {
                                                                    if ((var2_int ^ -1) == -70) {
                                                                      if ((16777216L & pd.field_i ^ -1L) == -1L) {
                                                                        break L2;
                                                                      } else {
                                                                        if ((ap.field_G ^ -1) > -65537) {
                                                                          ap.field_G = ap.field_G + 4;
                                                                          break L2;
                                                                        } else {
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if ((var2_int ^ -1) != -60) {
                                                                        if ((var2_int ^ -1) != -88) {
                                                                          if (var2_int != 88) {
                                                                            break L2;
                                                                          } else {
                                                                            if (-1L == (65536L & pd.field_i ^ -1L)) {
                                                                              break L2;
                                                                            } else {
                                                                              if (-3 <= (hr.field_b ^ -1)) {
                                                                                break L2;
                                                                              } else {
                                                                                ne.field_v = ne.field_v - 2;
                                                                                hr.field_b = hr.field_b - 1;
                                                                                this.j(-93);
                                                                                break L2;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if ((pd.field_i & 65536L ^ -1L) == -1L) {
                                                                            break L2;
                                                                          } else {
                                                                            if (hr.field_b >= 26) {
                                                                              break L2;
                                                                            } else {
                                                                              ne.field_v = ne.field_v + 2;
                                                                              hr.field_b = hr.field_b + 1;
                                                                              this.j(46);
                                                                              break L2;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        this.o(3);
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if ((16777216L & pd.field_i ^ -1L) == -1L) {
                                                                      break L2;
                                                                    } else {
                                                                      if (-5 > (ap.field_G ^ -1)) {
                                                                        ap.field_G = ap.field_G - 4;
                                                                        break L2;
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if ((pd.field_i & 16777216L) == 0L) {
                                                                  break L2;
                                                                } else {
                                                                  if (-17 > (ue.field_e ^ -1)) {
                                                                    ue.field_e = ue.field_e * 15 / 16;
                                                                    break L2;
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          ek.field_a = ek.field_a - 1;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      kh.field_vc = kh.field_vc + 50;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                fl.field_l = fl.field_l * 17 / 16;
                                                break L2;
                                              }
                                            } else {
                                              hf.field_a = hf.field_a * 15 / 16;
                                              break L2;
                                            }
                                          } else {
                                            hf.field_a = 17 * hf.field_a / 16;
                                            break L2;
                                          }
                                        } else {
                                          kh.field_gc.field_z = kh.field_gc.field_z * 0.9921875f;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    kh.field_gc.field_E = kh.field_gc.field_E * 1.0625;
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            kh.field_gc.field_j = kh.field_gc.field_j + 0.04908738521234052;
                            break L2;
                          }
                        }
                      } else {
                        if (!vj.field_c[81]) {
                          kh.field_gc.field_x = kh.field_gc.field_x + 1;
                          break L2;
                        } else {
                          kh.field_gc.field_m = kh.field_gc.field_m + 1;
                          this.K(0);
                          break L2;
                        }
                      }
                    } else {
                      if (vj.field_c[81]) {
                        kh.field_gc.field_d = kh.field_gc.field_d - 1;
                        this.K(0);
                        break L2;
                      } else {
                        kh.field_gc.field_C = kh.field_gc.field_C - 1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref2), "uf.MD(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, byte param2) {
        qe var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.field_I.j(122);
              if (var4.field_M < 0) {
                b.field_H.field_pb = false;
                break L1;
              } else {
                param0 = this.a(-30818, param0, param1, b.field_H);
                break L1;
              }
            }
            L2: {
              if (param2 == -51) {
                break L2;
              } else {
                this.field_Z = -70;
                break L2;
              }
            }
            L3: {
              if (this.field_I.field_y <= 0) {
                qo.field_F.field_pb = false;
                break L3;
              } else {
                param0 = this.a(-30818, param0, param1, qo.field_F);
                break L3;
              }
            }
            L4: {
              if (var4.field_u != 0) {
                param0 = this.a(-30818, param0, param1, df.field_f);
                break L4;
              } else {
                df.field_f.field_pb = false;
                break L4;
              }
            }
            L5: {
              if (var4.field_E) {
                param0 = this.a(-30818, param0, param1, ub.field_q);
                break L5;
              } else {
                ub.field_q.field_pb = false;
                break L5;
              }
            }
            stackIn_18_0 = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final int f(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!df.field_f.field_pb) {
                break L1;
              } else {
                df.field_f.a(true, false);
                break L1;
              }
            }
            L2: {
              if (b.field_H.field_pb) {
                b.field_H.a(true, false);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (qo.field_F.field_pb) {
                qo.field_F.a(true, false);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!ub.field_q.field_pb) {
                break L4;
              } else {
                ub.field_q.a(true, false);
                break L4;
              }
            }
            L5: {
              if (!q.field_b.field_pb) {
                break L5;
              } else {
                q.field_b.a(true, false);
                break L5;
              }
            }
            L6: {
              if (!df.field_f.field_pb) {
                break L6;
              } else {
                if (df.field_f.field_W) {
                  stackIn_24_0 = 4;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!b.field_H.field_pb) {
                break L7;
              } else {
                if (!b.field_H.field_W) {
                  break L7;
                } else {
                  stackIn_30_0 = 5;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L8: {
              if (!qo.field_F.field_pb) {
                break L8;
              } else {
                if (qo.field_F.field_W) {
                  stackIn_38_0 = 6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (param0 == 1163) {
                break L9;
              } else {
                uf.a((di) null, -44, (di) null, (di) null);
                break L9;
              }
            }
            L10: {
              if (!ub.field_q.field_pb) {
                break L10;
              } else {
                if (ub.field_q.field_W) {
                  stackIn_49_0 = 8;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (!q.field_b.field_pb) {
                break L11;
              } else {
                if (!q.field_b.field_W) {
                  break L11;
                } else {
                  stackIn_55_0 = this.field_I.field_f.a(this.field_I.j(113), param0 ^ -1223);
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            stackIn_57_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_49_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0;
                } else {
                  return stackIn_57_0;
                }
              }
            }
          }
        }
    }

    private final void j(int param0) {
        try {
            dq.field_a.a(7096);
            dq.field_a.a(2147483647, this.field_I);
            kh.field_gc.a(this.field_I, 21894);
            kh.field_gc.a((byte) 0, this.field_ab);
            int var2_int = 90 % ((-12 - param0) / 58);
            this.K(0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uf.W(" + param0 + ')');
        }
    }

    private final void a(qe param0, int param1) {
        int stackIn_60_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        String stackIn_82_2 = null;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        String stackIn_87_2 = null;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        String stackIn_92_2 = null;
        int stackIn_118_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_196_0 = 0;
        int stackIn_196_1 = 0;
        int stackIn_196_2 = 0;
        Object stackIn_254_0 = null;
        StringBuilder stackIn_254_1 = null;
        Object stackIn_255_0 = null;
        StringBuilder stackIn_255_1 = null;
        String stackIn_255_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var3_int = 0;
        cr var4_ref_cr = null;
        int var4 = 0;
        aa var5_ref_aa = null;
        int var5 = 0;
        String var5_ref_String = null;
        qe var6 = null;
        aa var6_ref = null;
        int var6_int = 0;
        aa var7 = null;
        qe var8 = null;
        int var9 = 0;
        cr var10 = null;
        try {
          L0: {
            L1: {
              if (param0.field_m == null) {
                break L1;
              } else {
                if (!param0.field_m.c(0)) {
                  var3 = new aa(param0.field_m);
                  var4_ref_cr = (cr) ((Object) ((aa) (var3)).b((byte) -92));
                  L2: while (true) {
                    if (var4_ref_cr == null) {
                      break L1;
                    } else {
                      L3: {
                        if (0 != var4_ref_cr.field_n) {
                          field_fb = field_fb + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4_ref_cr = (cr) ((Object) ((aa) (var3)).b(-100));
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L4: {
              field_fb = 16 + field_fb & 65535 | -65536 & field_fb;
              if (param1 == 1) {
                break L4;
              } else {
                this.A((byte) -46);
                break L4;
              }
            }
            L5: {
              if (0 != (this.field_I.j(69).field_s & um.field_c)) {
                kh.field_gc.a(6, 256, (byte) 18, 128);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((sk.field_d & this.field_L ^ -1) == -1) {
                break L6;
              } else {
                if ((hm.field_e & param0.field_s) == 0) {
                  break L6;
                } else {
                  L7: {
                    if (!(this.field_I.field_f instanceof af)) {
                      break L7;
                    } else {
                      gj.a(true, 0, ph.field_a, c.field_a);
                      this.field_I.a(9437184, (li) null, (byte) -114, 9437184, 8);
                      param0.field_s = param0.field_s & (hm.field_e ^ -1);
                      if (this.field_I.d((byte) 105)) {
                        param0.field_s = param0.field_s | um.field_c;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (this.field_I.field_f instanceof fj) {
                    gj.a(true, 0, ph.field_a, cr.field_q);
                    this.field_I.a(9437184, (li) null, (byte) -108, 9437184, 9);
                    param0.field_s = param0.field_s & (hm.field_e ^ -1);
                    if (!this.field_I.d((byte) 127)) {
                      break L6;
                    } else {
                      param0.field_s = param0.field_s | um.field_c;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
            }
            L8: {
              if (this.field_I.h(param1 + 22041)) {
                if ((this.field_L & hq.field_c) != 0) {
                  break L8;
                } else {
                  L9: {
                    if (-1 != (ag.field_e & param0.field_s ^ -1)) {
                      L10: {
                        this.field_I.c(-14286, param0.field_L);
                        if (0 != (f.field_f & this.field_L)) {
                          L11: {
                            dk.field_f = dk.field_f - 1;
                            this.field_I.field_m = true;
                            this.i((byte) -102);
                            if (9000 <= this.field_o) {
                              stackIn_118_0 = 0;
                              break L11;
                            } else {
                              stackIn_118_0 = 1;
                              break L11;
                            }
                          }
                          var3_int = stackIn_118_0;
                          var4 = 1;
                          var5_ref_aa = new aa(this.field_I.field_u);
                          var6 = (qe) ((Object) var5_ref_aa.b((byte) -92));
                          L12: while (true) {
                            L13: {
                              if (var6 == null) {
                                break L13;
                              } else {
                                L14: {
                                  if (var6.field_t) {
                                    break L14;
                                  } else {
                                    if ((var6.field_s & be.field_I) == 0) {
                                      var6 = (qe) ((Object) var5_ref_aa.b(param1 + -106));
                                      continue L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var4 = 0;
                                break L13;
                              }
                            }
                            var5 = 1;
                            var6_ref = new aa(this.field_I.field_u);
                            var7 = new aa();
                            var8 = (qe) ((Object) var6_ref.b((byte) -92));
                            var8 = (qe) ((Object) var6_ref.b(-97));
                            L15: while (true) {
                              L16: {
                                if (var8 == null) {
                                  break L16;
                                } else {
                                  if (var8.field_m == null) {
                                    var5 = 0;
                                    break L16;
                                  } else {
                                    var7.a(var8.field_m, false);
                                    var9 = 0;
                                    var10 = (cr) ((Object) var7.b((byte) -92));
                                    L17: while (true) {
                                      L18: {
                                        if (var10 == null) {
                                          break L18;
                                        } else {
                                          if (-1 != (var10.field_n ^ -1)) {
                                            var9 = 1;
                                            break L18;
                                          } else {
                                            var10 = (cr) ((Object) var7.b(-113));
                                            continue L17;
                                          }
                                        }
                                      }
                                      if (var9 != 0) {
                                        var8 = (qe) ((Object) var6_ref.b(-125));
                                        continue L15;
                                      } else {
                                        var5 = 0;
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (pq.field_B == null) {
                                  break L19;
                                } else {
                                  if (-1 <= (pq.field_B.length ^ -1)) {
                                    break L19;
                                  } else {
                                    L20: {
                                      if (var4 == 0) {
                                        break L20;
                                      } else {
                                        if (t.a(0, oa.field_g, 21)) {
                                          this.a((byte) 104, 21, 234);
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    L21: {
                                      if (var5 == 0) {
                                        break L21;
                                      } else {
                                        if (!t.a(param1 + -1, oa.field_g, 22)) {
                                          break L21;
                                        } else {
                                          this.a((byte) 104, 22, 233);
                                          break L21;
                                        }
                                      }
                                    }
                                    if (var3_int == 0) {
                                      break L10;
                                    } else {
                                      if (!t.a(0, oa.field_g, 20)) {
                                        break L10;
                                      } else {
                                        this.a((byte) 104, 20, 235);
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              L22: {
                                if (var4 == 0) {
                                  break L22;
                                } else {
                                  if (!t.a(0, oa.field_g, 24)) {
                                    break L22;
                                  } else {
                                    this.a((byte) 104, 24, 231);
                                    break L22;
                                  }
                                }
                              }
                              L23: {
                                if (var5 == 0) {
                                  break L23;
                                } else {
                                  if (!t.a(0, oa.field_g, 25)) {
                                    break L23;
                                  } else {
                                    this.a((byte) 104, 25, 230);
                                    break L23;
                                  }
                                }
                              }
                              if (var3_int == 0) {
                                break L10;
                              } else {
                                if (!t.a(param1 ^ 1, oa.field_g, 23)) {
                                  break L10;
                                } else {
                                  this.a((byte) 104, 23, 232);
                                  break L10;
                                }
                              }
                            }
                          }
                        } else {
                          break L10;
                        }
                      }
                      kh.field_gc.a(17, 256, (byte) -100, 128);
                      break L9;
                    } else {
                      if ((hm.field_e & param0.field_s) == 0) {
                        break L9;
                      } else {
                        L24: {
                          this.field_I.c(-14286, this.field_I.field_f.a(param0, (byte) 114));
                          if (0 != (this.field_L & f.field_f)) {
                            this.field_I.field_m = false;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        if ((this.field_L & oj.field_m) == 0) {
                          kh.field_gc.a(18, 256, (byte) 98, 128);
                          break L9;
                        } else {
                          kh.field_gc.a(17, 256, (byte) -103, 128);
                          break L9;
                        }
                      }
                    }
                  }
                  L25: {
                    stackIn_195_0 = -3405;

                    stackIn_195_1 = -1;

                    if (mg.a(true)) {
                      stackIn_196_0 = stackIn_195_0;
                      stackIn_196_1 = stackIn_195_1;
                      stackIn_196_2 = 21;
                      break L25;
                    } else {
                      stackIn_196_0 = stackIn_195_0;
                      stackIn_196_1 = stackIn_195_1;
                      stackIn_196_2 = 0;
                      break L25;
                    }
                  }
                  fq.a(stackIn_196_0, stackIn_196_1, stackIn_196_2, false);
                  this.a(-23095);
                  if ((this.field_L & f.field_f ^ -1) == -1) {
                    break L8;
                  } else {
                    sq.field_b = 23;
                    ne.field_w = 23;
                    break L8;
                  }
                }
              } else {
                if (this.field_I.field_f.a((byte) -83, param0.field_L)) {
                  if (!(this.field_I.field_f instanceof rj)) {
                    break L8;
                  } else {
                    if (0 == (this.field_I.field_p & 1 << param0.field_L)) {
                      L26: {
                        L27: {
                          if (param0.field_L != this.field_db) {
                            break L27;
                          } else {
                            if ((this.field_L & hq.field_c ^ -1) == -1) {
                              break L27;
                            } else {
                              stackIn_60_0 = 1;
                              break L26;
                            }
                          }
                        }
                        stackIn_60_0 = 0;
                        break L26;
                      }
                      L28: {
                        var3_int = stackIn_60_0;
                        var4 = ((rj) ((Object) this.field_I.field_f)).field_e[param0.field_L];
                        if (var3_int == 0) {
                          if (var4 != 1) {
                            var5_ref_String = nr.a(new String[]{this.e(-30360, param0.field_L), Integer.toString(var4)}, -1, cj.field_U);
                            break L28;
                          } else {
                            var5_ref_String = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, kn.field_f);
                            break L28;
                          }
                        } else {
                          if (1 == var4) {
                            var5_ref_String = bh.field_d;
                            break L28;
                          } else {
                            var5_ref_String = nr.a(new String[]{Integer.toString(var4)}, param1 ^ -2, hk.field_q);
                            break L28;
                          }
                        }
                      }
                      L29: {
                        var6_int = -param0.field_N + var4;
                        if ((var6_int ^ -1) != -2) {
                          if (0 == (var6_int ^ -1)) {
                            L30: {
                              stackIn_86_0 = 1;

                              stackIn_86_1 = 0;

                              if (var3_int != 0) {
                                stackIn_87_0 = stackIn_86_0;
                                stackIn_87_1 = stackIn_86_1;
                                stackIn_87_2 = o.field_D;
                                break L30;
                              } else {
                                stackIn_87_0 = stackIn_86_0;
                                stackIn_87_1 = stackIn_86_1;
                                stackIn_87_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, jk.field_c);
                                break L30;
                              }
                            }
                            gj.a(stackIn_87_0 != 0, stackIn_87_1, stackIn_87_2, var5_ref_String);
                            break L29;
                          } else {
                            if (-2 == var6_int) {
                              L31: {
                                stackIn_91_0 = 1;

                                stackIn_91_1 = 0;

                                if (var3_int == 0) {
                                  stackIn_92_0 = stackIn_91_0;
                                  stackIn_92_1 = stackIn_91_1;
                                  stackIn_92_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, oh.field_f);
                                  break L31;
                                } else {
                                  stackIn_92_0 = stackIn_91_0;
                                  stackIn_92_1 = stackIn_91_1;
                                  stackIn_92_2 = jk.field_j;
                                  break L31;
                                }
                              }
                              gj.a(stackIn_92_0 != 0, stackIn_92_1, stackIn_92_2, var5_ref_String);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        } else {
                          L32: {
                            stackIn_81_0 = 1;

                            stackIn_81_1 = 0;

                            if (var3_int != 0) {
                              stackIn_82_0 = stackIn_81_0;
                              stackIn_82_1 = stackIn_81_1;
                              stackIn_82_2 = oj.field_u;
                              break L32;
                            } else {
                              stackIn_82_0 = stackIn_81_0;
                              stackIn_82_1 = stackIn_81_1;
                              stackIn_82_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, ad.field_b);
                              break L32;
                            }
                          }
                          gj.a(stackIn_82_0 != 0, stackIn_82_1, stackIn_82_2, var5_ref_String);
                          break L29;
                        }
                      }
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                } else {
                  gj.a(true, 0, nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, qe.field_F), (String) null);
                  break L8;
                }
              }
            }
            L33: {
              if ((param0.field_s & i.field_m ^ -1) == -1) {
                break L33;
              } else {
                if ((param0.field_s & oa.field_b ^ -1) == -1) {
                  this.b(124, param0);
                  break L33;
                } else {
                  break L33;
                }
              }
            }
            L34: {
              if (-1 == (sk.field_d & this.field_L ^ -1)) {
                L35: {
                  if (param0.field_w > -3) {
                    if (1 != (param0.field_w ^ -1)) {
                      if (param0.field_w != -1) {
                        if (param0.field_w != 1) {
                          if ((param0.field_w ^ -1) != -3) {
                            if ((param0.field_w ^ -1) > -4) {
                              var3 = null;
                              break L35;
                            } else {
                              var3 = wo.field_b;
                              break L35;
                            }
                          } else {
                            var3 = pq.field_C;
                            break L35;
                          }
                        } else {
                          var3 = v.field_k;
                          break L35;
                        }
                      } else {
                        var3 = qp.field_fc;
                        break L35;
                      }
                    } else {
                      var3 = he.field_d;
                      break L35;
                    }
                  } else {
                    var3 = jr.field_l;
                    break L35;
                  }
                }
                if (null != var3) {
                  gj.a(true, 5, (String) (((Object[]) (var3))[ga.a(java.lang.reflect.Array.getLength(var3), true, ea.field_r)]), (String) null);
                  break L34;
                } else {
                  break L34;
                }
              } else {
                break L34;
              }
            }
            L36: {
              this.a(param0, (byte) -28);
              tn.a((uf) (this), -16813);
              if (-1 != (this.field_L & sk.field_d ^ -1)) {
                this.field_c.a(false, param0);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (-1 != (f.field_f & this.field_L ^ -1)) {
                if ((param0.field_s & be.field_I ^ -1) == -1) {
                  break L37;
                } else {
                  gj.a(true, 6, nr.a(new String[]{Integer.toString(15)}, -1, iq.field_b), (String) null);
                  this.field_v = this.field_o;
                  this.field_o = this.field_o + 750;
                  if ((16711680 & wq.field_c) != 16711680) {
                    wq.field_c = wq.field_c + 65536;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              } else {
                break L37;
              }
            }
            L38: {
              if (0 != (this.field_L & hq.field_c)) {
                break L38;
              } else {
                if (this.field_I.j(param1 + 114) == param0) {
                  break L38;
                } else {
                  this.s((byte) -84);
                  if ((this.field_I.field_q ^ -1) != 0) {
                    this.field_o = wn.field_f[this.field_I.field_q];
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackIn_254_0 = var3;

            stackIn_254_1 = new StringBuilder().append("uf.F(");

            if (param0 == null) {
              stackIn_255_0 = stackIn_254_0;
              stackIn_255_1 = (StringBuilder) ((Object) stackIn_254_1);
              stackIn_255_2 = "null";
              break L39;
            } else {
              stackIn_255_0 = stackIn_254_0;
              stackIn_255_1 = (StringBuilder) ((Object) stackIn_254_1);
              stackIn_255_2 = "{...}";
              break L39;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_255_0), stackIn_255_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$1 = 0;
        pq var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_Z = 125;
                break L1;
              }
            }
            L2: {
              var3 = this.field_I.field_l[param1];
              if (var3.field_o) {
                break L2;
              } else {
                var3.field_k = this.field_P - 264 << -726146928;
                var3.field_j = 33554432;
                var3.field_g = id.field_a[3].field_z - -9 - 320 << 548119344;
                var3.d((byte) 115);
                var3.field_o = true;
                var3.field_p = true;
                fieldTemp$1 = this.field_C;
                this.field_C = this.field_C + 1;
                this.field_ib[fieldTemp$1] = param1;
                am.field_q = 250;
                ff.field_c = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.QB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((this.field_I.field_l.length ^ -1) >= (var2_int ^ -1)) {
                L2: {
                  dq.field_a.a(param0 ^ 2147483630, this.field_I);
                  id.field_c.field_g = true;
                  hh.field_c = true;
                  if (param0 == 17) {
                    break L2;
                  } else {
                    this.field_m = 107;
                    break L2;
                  }
                }
                break L0;
              } else {
                this.field_I.field_l[var2_int].a(118);
                this.field_I.field_l[var2_int].field_p = true;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.E(" + param0 + ')');
        }
    }

    final void q(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (this.k(-38)) {
                  L2: {
                    if (!id.field_c.field_g) {
                      break L2;
                    } else {
                      id.field_c.a(param0 + 1, (uf) (this));
                      this.field_p = -1;
                      this.field_g = -1;
                      break L2;
                    }
                  }
                  id.field_c.a(32624, this.field_ab);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.RD(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ge param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException runtimeException = null;
        qe var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_I.j(23);
            if (0 == var3.field_q) {
              if (this.field_db != var3.field_L) {
                L1: {
                  this.field_b.a(65280, param0);
                  hh.field_c = true;
                  id.field_c.field_g = true;
                  if (!param1) {
                    break L1;
                  } else {
                    discarded$1 = this.a(44, 37, -38, -117);
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param0.field_v = param0.field_v + 8;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              param0.field_v = param0.field_v + 8;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("uf.N(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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

    final void D(int param0) {
        int dupTemp$0 = 0;
        boolean stackIn_41_0 = false;
        boolean stackIn_48_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        qe var2 = null;
        int[] var2_array = null;
        RuntimeException var2_ref = null;
        qe var3_ref_qe = null;
        al var3_ref_al = null;
        int var3 = 0;
        kj var4_ref_kj = null;
        qe var4_ref_qe = null;
        int var4 = 0;
        al var5_ref_al = null;
        pq[] var5_ref_pq__ = null;
        int var5 = 0;
        qe var6_ref_qe = null;
        int var6 = 0;
        pq[] var6_ref_pq__ = null;
        int var7 = 0;
        qe var7_ref_qe = null;
        pq var8 = null;
        int var9 = 0;
        int var10_int = 0;
        pq var10 = null;
        int var11_int = 0;
        pq var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        long var19 = 0L;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != this.field_I.j(43).field_q) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (!hh.field_c) {
                            statePc = 53;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = new qe();
                        var3_ref_qe = var2;
                        var4_ref_kj = this.field_G;
                        var3_ref_qe.field_H = (byte)var4_ref_kj.field_e;
                        var3_ref_qe.field_C = (short)((1024 + var4_ref_kj.field_h) % 2048);
                        var3_ref_qe.field_D = (byte)var4_ref_kj.field_d;
                        var3_ref_qe.field_V = (short)var4_ref_kj.field_n;
                        var3_ref_qe.field_A = (short)var4_ref_kj.field_k;
                        var2.field_V = (short) 2048;
                        var3_ref_al = this.field_I;
                        var4_ref_qe = var2;
                        o.field_y = 0;
                        if (null == pq.field_B) {
                            statePc = 52;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((pq.field_B.length ^ -1) != -1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4_ref_qe.field_D * var4_ref_qe.field_D + var4_ref_qe.field_H * var4_ref_qe.field_H <= 9216) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_ref_al = var3_ref_al;
                        var6_ref_qe = var4_ref_qe;
                        var7 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var7 ^ -1) <= (var5_ref_al.field_l.length ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        pq.field_B[0][var7].a(var5_ref_al.field_l[var7], (byte) -12);
                        var7++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pc.field_a = pq.field_B[0];
                        var7_ref_qe = var6_ref_qe;
                        var8 = pq.field_B[0][0];
                        var9 = var7_ref_qe.field_D * var7_ref_qe.field_D + var7_ref_qe.field_H * var7_ref_qe.field_H;
                        if (-9217 <= (var9 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw new IllegalStateException("Strike point out of range! " + var7_ref_qe.field_D + "," + var7_ref_qe.field_H);
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10_int = -rf.a(65536 - (var9 << -855896766), -125) >> -484276055;
                        var11_int = ao.a((int) var7_ref_qe.field_A, true);
                        var12 = hc.a(2047, (int) var7_ref_qe.field_A);
                        var13 = ao.a((int) var7_ref_qe.field_C, true);
                        var14 = hc.a(2047, (int) var7_ref_qe.field_C);
                        var15 = var13;
                        var16 = -var14;
                        var17 = aj.a(var11_int, false, -var16);
                        var18 = aj.a(var11_int, false, var15);
                        var19_int = var12;
                        var20 = -(var19_int * var16) + var18 * 0 >> 879906736;
                        var21_int = -(var17 * 0) + var19_int * var15 >> -1880012176;
                        var22 = var17 * var16 + -(var18 * var15) >> 749197840;
                        var23 = var20 * var7_ref_qe.field_H + (var15 * var7_ref_qe.field_D + var10_int * var17) >> 1278118057;
                        var24 = var16 * var7_ref_qe.field_D + (var18 * var10_int + var7_ref_qe.field_H * var21_int) >> 1767517417;
                        var25 = var10_int * var19_int - -(var7_ref_qe.field_D * 0) - -(var22 * var7_ref_qe.field_H) >> -997048727;
                        var8.field_I = lh.a(uh.field_q, (byte) -79, (long)(int)(od.a((long)(var7_ref_qe.field_V * var17), (long)kj.field_f, false) / 4096L));
                        var8.field_t = lh.a(uh.field_q, (byte) -116, (long)(int)(od.a((long)(var7_ref_qe.field_V * var18), (long)kj.field_f, false) / 4096L));
                        var8.field_v = 1;
                        var26 = lh.a(uh.field_w, (byte) -93, (long)(int)(od.a((long)(var7_ref_qe.field_V * bl.field_g), (long)kj.field_f, false) / 4096L));
                        var8.field_n = aj.a(-aj.a(var18, false, var25), false, var26);
                        var8.field_b = aj.a(aj.a(var17, false, var25), false, var26);
                        var8.field_K = aj.a(aj.a(var18, false, var23) + -aj.a(var17, false, var24), false, var26);
                        fn.f(-13164);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        hb.field_s = -1;
                        td.field_b = 0;
                        or.field_l = 0;
                        var5_ref_pq__ = pc.field_a;
                        var6 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6 >= var5_ref_pq__.length) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_ref_pq__[var6].field_w = 0;
                        var6++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dupTemp$0 = oe.a(var3_ref_al.field_c, var5, pc.field_a, var3_ref_al.field_e, 0);
                        var5 = dupTemp$0;
                        if (dupTemp$0 == -1) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (fn.f(-13164)) {
                            statePc = 33;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6_ref_pq__ = pc.field_a;
                        var7 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var6_ref_pq__.length <= var7) {
                            statePc = 47;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_48_0 = var6_ref_pq__[var7].field_s;
                        stackIn_41_0 = stackIn_48_0;
                        if (false) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!stackIn_41_0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6_ref_pq__[var7].a(false);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3_ref_al.a(6582, pc.field_a, var4_ref_qe);
                        stackIn_48_0 = fn.f(-13164);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!stackIn_48_0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (bk.a(pc.field_a, (byte) 57)) {
                            statePc = 27;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        hh.field_c = false;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param0 < -120) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_O = (mm) null;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var2_array = this.field_ab;
                        wh.field_g = 0;
                        if (0L == (pd.field_i & 16384L)) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == pq.field_B) {
                            statePc = 136;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (pq.field_B.length != 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var3 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = var3;
                        stackIn_71_1 = ((pd.field_i & 8589934592L ^ -1L) < -1L ? -1 : ((pd.field_i & 8589934592L ^ -1L) == -1L ? 0 : 1));
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_74_0 = stackIn_71_0;
                        stackIn_72_0 = stackIn_74_0;
                        if (stackIn_71_1 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_75_0 = stackIn_72_0;
                        stackIn_75_1 = 1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = stackIn_74_0;
                        stackIn_75_1 = pc.field_a.length;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 >= stackIn_75_1) {
                            statePc = 136;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var4 = ea.field_p << 1798874027;
                        var5 = 0;
                        var8 = pq.field_B[0][var3];
                        var9 = 1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (o.field_y <= var9) {
                            statePc = 133;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var10 = pq.field_B[-1 + var9][var3];
                        var11 = pq.field_B[var9][var3];
                        var6 = var5 + (var10.field_w & 65535);
                        stackIn_71_0 = 0;
                        stackIn_79_0 = stackIn_71_0;
                        stackIn_71_1 = var11.field_w;
                        stackIn_79_1 = stackIn_71_1;
                        if (false) {
                            statePc = 71;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 == stackIn_79_1) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var11.field_w < 65536) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7 = var5 + 65536;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var7 = var5 - -var11.field_w;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((var10.field_g ^ -1) != (var11.field_g ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var10.field_k ^ -1) != (var11.field_k ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var5 = var5 + 65536;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var12 = var4 + var5;
                        if ((var12 ^ -1) > (var6 ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (0 != var10.field_v) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (0 == var11.field_v) {
                            statePc = 125;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var10.field_v != 2) {
                            statePc = 108;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (-3 != (var11.field_v ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var13 = (-var12 + (o.field_y << -1159311312)) / o.field_y >> 1389486280;
                        var14 = (var11.field_g - var10.field_g >> -238778003) * (var12 - var6) / (var7 - var6) + (var10.field_g >> -1744110003);
                        var15 = (var10.field_k >> -1069169235) + (-var10.field_k + var11.field_k >> -1957884147) * (-var6 + var12) / (-var6 + var7);
                        var16 = -64;
                        var17 = -(var8.field_g >> -741662451) + var14;
                        var18 = -(var8.field_k >> 485422061) + var15;
                        var19 = (long)(var17 * var17 - -(var18 * var18));
                        var21 = bm.a(-127, var19 << 572508682) >> -1168955635;
                        if ((var21 ^ -1L) <= -49L) {
                            statePc = 112;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (80L <= var21) {
                            statePc = 116;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var23 = (int)(-48L + var21);
                        var13 = var13 * var23 / 32;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var16 = var16 - var2_array[2];
                        var14 = var14 - var2_array[0];
                        var15 = var15 - var2_array[1];
                        var23 = var2_array[10] * var15 + var14 * var2_array[9] + var16 * var2_array[11] >> -912880560;
                        if (0 < var23) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var24 = var2_array[5] * var16 + var2_array[3] * var14 + var2_array[4] * var15 >> -1003952573;
                        var25 = var2_array[8] * var16 + (var2_array[6] * var14 - -(var2_array[7] * var15)) >> 780862723;
                        if (-1 != (var23 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var23 = 1;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var24 = var24 / var23 + 5120;
                        var25 = 3840 + var25 / var23;
                        var13 = (var13 << -901390102) / var23;
                        if (4088 >= var13) {
                            statePc = 124;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var13 = 4088;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        rb.field_e[wh.field_g].field_c = var14;
                        rb.field_e[wh.field_g].field_e = var15;
                        rb.field_e[wh.field_g].field_a = var16;
                        rb.field_e[wh.field_g].field_h = var24;
                        rb.field_e[wh.field_g].field_f = var25;
                        rb.field_e[wh.field_g].field_b = var13;
                        rb.field_e[wh.field_g].field_d = var3;
                        wh.field_g = wh.field_g + 1;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((var11.field_w ^ -1) == -1) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if ((var11.field_w ^ -1) <= -65537) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var5 = var5 + 65536;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var9++;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var3++;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw wm.a((Throwable) ((Object) var2_ref), "uf.FA(" + param0 + ')');
                }
                case 136: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void t(byte param0) {
        int fieldTemp$0 = 0;
        oo stackIn_16_0;
        int stackIn_16_1;
        int[] stackIn_16_2;
        int stackIn_16_3;
        int[] stackIn_16_4;
        oo stackIn_17_0;
        int stackIn_17_1;
        int[] stackIn_17_2;
        int stackIn_17_3;
        int[] stackIn_17_4;
        int stackIn_17_5;
        int stackIn_19_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        aa var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        cr var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if (or.field_l <= 0) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    if ((or.field_l ^ -1) >= (var2_int ^ -1)) {
                      break L2;
                    } else {
                      var3_int = wd.field_Qb[var2_int];
                      stackIn_19_0 = ((16777216L & pd.field_i) < 0L ? -1 : ((16777216L & pd.field_i) == 0L ? 0 : 1));

                      L4: {
                        if (stackIn_19_0 != 0) {
                          System.out.println("bbmom: " + lo.a((long)var3_int, 7697781));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if ((var3_int ^ -1) >= -16777217) {
                          var3_int = 192 * var3_int >> -671848457;
                          break L5;
                        } else {
                          var3_int = 192;
                          break L5;
                        }
                      }
                      L6: {
                        stackIn_16_0 = kh.field_gc;

                        stackIn_16_1 = 1336449640;

                        stackIn_16_2 = this.field_ab;

                        stackIn_16_3 = 32 - -var3_int;

                        stackIn_16_4 = new int[]{wm.field_ac[var2_int][0] >> -1800454387, wm.field_ac[var2_int][1] >> -100742227, wm.field_ac[var2_int][2] >> -132435571};

                        if (65536 >= var3_int) {
                          stackIn_17_0 = (oo) ((Object) stackIn_16_0);
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = (int[]) ((Object) stackIn_16_2);
                          stackIn_17_3 = stackIn_16_3;
                          stackIn_17_4 = (int[]) ((Object) stackIn_16_4);
                          stackIn_17_5 = 3;
                          break L6;
                        } else {
                          stackIn_17_0 = (oo) ((Object) stackIn_16_0);
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = (int[]) ((Object) stackIn_16_2);
                          stackIn_17_3 = stackIn_16_3;
                          stackIn_17_4 = (int[]) ((Object) stackIn_16_4);
                          stackIn_17_5 = 2;
                          break L6;
                        }
                      }
                      ((oo) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5);
                      var2_int++;
                      continue L3;
                    }
                  }
                }
              }
              stackIn_19_0 = param0;
              break L1;
            }
            L7: {
              if (stackIn_19_0 < -69) {
                break L7;
              } else {
                this.field_q = true;
                break L7;
              }
            }
            L8: {
              L9: {
                if ((td.field_b ^ -1) < -1) {
                  var2_int = 0;
                  L10: while (true) {
                    if (td.field_b <= var2_int) {
                      break L9;
                    } else {
                      var3_int = cf.field_g[var2_int];
                      stackIn_38_0 = (-1L < (16777216L & pd.field_i ^ -1L) ? -1 : (-1L == (16777216L & pd.field_i ^ -1L) ? 0 : 1));

                      L11: {
                        if (stackIn_38_0 == 0) {
                          break L11;
                        } else {
                          System.out.println("bwmom: " + lo.a((long)var3_int, 7697781));
                          break L11;
                        }
                      }
                      L12: {
                        if (var3_int > 134217728) {
                          var3_int = 192;
                          break L12;
                        } else {
                          var3_int = 192 * var3_int >> -643653382;
                          break L12;
                        }
                      }
                      kh.field_gc.a(1336449640, this.field_ab, 32 - -var3_int, new int[]{nn.field_e[var2_int][0] >> 681898765, nn.field_e[var2_int][1] >> 338418285, nn.field_e[var2_int][2] >> -677556019}, 5);
                      var2_int++;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
              stackIn_38_0 = 0;
              break L8;
            }
            L13: {
              if (stackIn_38_0 >= this.field_I.field_j) {
                break L13;
              } else {
                var2 = new aa(this.field_I.j(25).field_m);
                var3 = (cr) ((Object) var2.a(0));
                L14: while (true) {
                  if (var3 == null) {
                    break L13;
                  } else {
                    fieldTemp$0 = this.field_I.field_j;
                    this.field_I.field_j = this.field_I.field_j - 1;
                    if (fieldTemp$0 <= 0) {
                      break L13;
                    } else {
                      kh.field_gc.a(this.field_ab, 4, -94, new int[]{this.field_I.field_w[var3.field_r].field_g >> -814765555, this.field_I.field_w[var3.field_r].field_f >> 1653151565, -64});
                      var3 = (cr) ((Object) var2.c((byte) -71));
                      continue L14;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.MC(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, byte param2) {
        String discarded$1 = null;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 4) {
                break L1;
              } else {
                discarded$1 = this.H(-68);
                break L1;
              }
            }
            stackIn_4_0 = (int)Math.round(Math.pow((double)param1 / (double)param0, 2.0) * 4096.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void l(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -37) {
                break L1;
              } else {
                this.J(53);
                break L1;
              }
            }
            L2: {
              if (!this.i(-1)) {
                this.E(param0 ^ 24097);
                break L2;
              } else {
                L3: {
                  if (0 <= this.field_I.j(param0 ^ -86).field_M) {
                    this.field_G.field_h = 0;
                    break L3;
                  } else {
                    if (this.field_M == 0) {
                      break L3;
                    } else {
                      this.field_G.a(this.field_eb, this.field_I.field_l[0], (byte) -106);
                      break L3;
                    }
                  }
                }
                this.a((byte) -116);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EC(" + param0 + ')');
        }
    }

    private final boolean v(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = -79 % ((param0 - -33) / 60);
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_I.field_l.length) {
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (!this.field_I.field_l[var3].field_s) {
                    break L2;
                  } else {
                    if (this.field_I.field_l[var3].field_v == 0) {
                      break L2;
                    } else {
                      if (!this.a(this.field_I.field_l[var3].field_j, this.field_I.field_l[var3].field_g, -98, this.field_I.field_l[var3].field_k)) {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.NC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var6 = 82 / ((-30 - param2) / 57);
                var5 = new float[]{(float)(0 * param1), (float)(param3 * 0), (float)(param0 * 0)};
                ag.a(this.field_ab, var5, 9);
                if (0.0f > var5[0]) {
                  break L2;
                } else {
                  if (var5[0] > 640.0f) {
                    break L2;
                  } else {
                    if (var5[1] < 0.0f) {
                      break L2;
                    } else {
                      if (480.0f < var5[1]) {
                        break L2;
                      } else {
                        stackIn_13_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
              }
              stackIn_13_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5_ref), "uf.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void F(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if ((hq.field_c & this.field_L ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 == 1791) {
                  break L1;
                } else {
                  this.field_c = (hq) null;
                  break L1;
                }
              }
              ej.field_j.b(false, 67);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.C(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.a(sa.field_h.field_w, this.field_I.field_u, (byte) 27);
              if (this.field_I.field_i == null) {
                break L1;
              } else {
                this.a(sa.field_h.field_w + 320, this.field_I.field_i, (byte) 27);
                break L1;
              }
            }
            L2: {
              if (param0 == -28) {
                break L2;
              } else {
                this.g(35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.U(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              kh.field_gc.b(122);
              if (param0 == 3) {
                break L1;
              } else {
                field_W = -119;
                break L1;
              }
            }
            kh.field_gc.c(true);
            L2: while (true) {
              if (kh.field_gc.field_H >= kh.field_gc.field_G) {
                this.K(0);
                id.field_c.field_g = true;
                break L0;
              } else {
                kh.field_gc.j(2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.J(" + param0 + ')');
        }
    }

    private final boolean I(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 == this.field_I.j(66).field_q) {
              L1: {
                var2_int = this.g((byte) 102);
                var3 = -81 % ((-57 - param0) / 54);
                if (var2_int != -1) {
                  break L1;
                } else {
                  if (this.field_T) {
                    break L1;
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              this.b((byte) 121, -wp.field_d << 458875911);
              stackIn_10_0 = 1;
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
          throw wm.a((Throwable) ((Object) var2), "uf.CE(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -38) {
                break L1;
              } else {
                this.o((byte) 53);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = this.field_I.j(52).field_q;
                if (-1 == (var2_int ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (1 != var2_int) {
                      break L4;
                    } else {
                      if (-38 >= (this.field_B ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  break L2;
                }
              }
              stackIn_13_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.NB(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void b(qe param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        pq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (this.field_S >= 0) {
                break L1;
              } else {
                L2: {
                  if (-1 != (hq.field_c & this.field_L ^ -1)) {
                    if (this.field_o > 1) {
                      this.field_o = this.field_o - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if ((f.field_f & this.field_L ^ -1) != -1) {
                      break L2;
                    } else {
                      if (this.field_I.field_o) {
                        break L2;
                      } else {
                        L3: {
                          if (this.field_I.field_i == null) {
                            break L3;
                          } else {
                            if (!this.field_I.field_i.c(0)) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (0L != (512L & pd.field_i)) {
                          break L2;
                        } else {
                          if (0 != (this.field_I.field_q ^ -1)) {
                            this.field_o = this.field_o - 1;
                            if (0 == this.field_o) {
                              this.v(0);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                if (0 == (this.field_L & hq.field_c)) {
                  break L1;
                } else {
                  if (!this.i(-1)) {
                    break L1;
                  } else {
                    L4: {
                      fieldTemp$0 = this.field_m;
                      this.field_m = this.field_m + 1;
                      if (-51 >= (fieldTemp$0 ^ -1)) {
                        L5: {
                          L6: {
                            if (this.field_w == null) {
                              break L6;
                            } else {
                              if (this.field_G.a(-2043, this.field_w)) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ej.field_j.b(false, 70);
                          this.field_G.a(ej.field_j, (byte) 106);
                          if (this.field_w == null) {
                            this.field_w = this.field_G.a(-14513);
                            break L5;
                          } else {
                            this.field_w.b(param1 ^ -17639, this.field_G);
                            break L5;
                          }
                        }
                        this.field_m = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (param0.field_u != 0) {
                      fieldTemp$1 = this.field_d;
                      this.field_d = this.field_d + 1;
                      if ((fieldTemp$1 ^ -1) <= -51) {
                        this.j((byte) -8);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 == -17601) {
                break L7;
              } else {
                this.m(-67);
                break L7;
              }
            }
            L8: {
              if (!this.i(-1)) {
                L9: {
                  var3 = this.field_I.field_l[0];
                  if ((param0.field_P ^ -1) != (var3.field_g ^ -1)) {
                    break L9;
                  } else {
                    if ((param0.field_Q ^ -1) == (var3.field_k ^ -1)) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var3.field_k = var3.field_k + (-var3.field_k + param0.field_Q >> -1452669597);
                hh.field_c = true;
                var3.field_g = var3.field_g + (param0.field_P + -var3.field_g >> -247858557);
                id.field_c.field_g = true;
                var3.field_p = true;
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var3_ref);

            stackIn_80_1 = new StringBuilder().append("uf.FE(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L10;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L10;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, ge param1) {
        RuntimeException runtimeException = null;
        qe var3 = null;
        qe var4 = null;
        ge var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_I.j(23);
              var6 = 62 % ((-58 - param0) / 63);
              var4 = var3;
              var5 = param1;
              var4.field_P = var5.b(true);
              var4.field_Q = var5.b(true);
              if (0L != (pd.field_i & 2097152L)) {
                System.out.println("<-S2C_BALL_MANHANDLED: " + vi.a((byte) 111, 16, 4, (long)var3.field_P) + "," + vi.a((byte) 55, 16, 4, (long)var3.field_Q));
                break L1;
              } else {
                break L1;
              }
            }
            id.field_c.field_g = true;
            hh.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("uf.RC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        pq var10 = null;
        float var11 = 0.0f;
        int var12 = 0;
        try {
          L0: {
            L1: {
              var12 = this.field_Z;
              if (-1 != (var12 ^ -1)) {
                if (1 == var12) {
                  L2: {
                    L3: {
                      this.x(1);
                      var2_double = Math.abs(this.field_eb.field_d);
                      var4 = Math.abs(576.0 - this.field_eb.field_d);
                      var6 = Math.abs(this.field_eb.field_a);
                      var8 = Math.abs(288.0 - this.field_eb.field_a);
                      this.field_O.field_h = -256.0;
                      if (var2_double >= var4) {
                        break L3;
                      } else {
                        if (var2_double >= var6) {
                          break L3;
                        } else {
                          if (var8 <= var2_double) {
                            break L3;
                          } else {
                            this.field_O.field_d = -120.0;
                            break L2;
                          }
                        }
                      }
                    }
                    L4: {
                      if (var6 <= var4) {
                        break L4;
                      } else {
                        if (var4 < var8) {
                          this.field_O.field_d = 696.0;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 <= var6) {
                      this.field_O.field_a = 408.0;
                      break L2;
                    } else {
                      this.field_O.field_a = -120.0;
                      break L2;
                    }
                  }
                  this.field_R = -1;
                  break L1;
                } else {
                  if (-3 != (var12 ^ -1)) {
                    if (var12 != 3) {
                      if (var12 != 4) {
                        break L1;
                      } else {
                        this.t(0);
                        break L1;
                      }
                    } else {
                      var10 = this.field_I.field_l[0];
                      var11 = (float)var10.g(-8);
                      if (var10.field_s) {
                        this.field_O.field_f = (double)pf.b(127, var10.field_g);
                        this.field_O.field_m = (double)pf.b(126, var10.field_k);
                        this.field_O.field_k = (double)pf.b(127, var10.field_j);
                        this.field_O.field_d = (double)(pf.b(126, var10.field_g) - 80.0f * ((float)var10.field_I / var11));
                        this.field_O.field_a = (double)(pf.b(127, var10.field_k) - 80.0f * ((float)var10.field_t / var11));
                        this.field_O.field_h = (double)(-24.0f + pf.b(126, var10.field_j));
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    this.g(124);
                    if (this.v((byte) -96)) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 <= -25) {
                break L5;
              } else {
                this.a(false, -39);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.FC(" + param0 + ')');
        }
    }

    uf(int param0, int param1, int param2, int param3, int param4, boolean param5, String[] param6, int param7, boolean param8) {
        String discarded$0 = null;
        pq[] array$1 = null;
        pq[] array$2 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_71_0 = 0;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var10 = null;
        int var11 = 0;
        String var11_ref_String = null;
        al var11_ref_al = null;
        al var12_ref_al = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Pool.field_O;
        this.field_h = 0;
        this.field_Y = false;
        this.field_kb = false;
        this.field_d = 0;
        this.field_V = -1;
        this.field_m = 0;
        this.field_T = false;
        this.field_p = -1;
        this.field_e = -1;
        this.field_k = -1;
        this.field_t = 0;
        this.field_H = false;
        this.field_g = -1;
        this.field_Q = 0;
        this.field_j = false;
        this.field_N = -1;
        this.field_A = 0;
        this.field_u = 0;
        this.field_f = 57;
        this.field_l = 0;
        this.field_q = false;
        this.field_Z = 0;
        this.field_eb = new mm();
        this.field_O = new mm();
        this.field_o = 0;
        this.field_ab = new int[12];
        this.field_a = 500;
        this.field_R = -1;
        this.field_D = true;
        this.field_M = -1;
        this.field_v = -1;
        this.field_C = 0;
        try {
          L0: {
            L1: {
              this.field_L = param0;
              this.field_db = param7;
              this.field_r = param8;
              stackIn_3_0 = this;

              if (hq.field_i < 2) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((uf) (this)).field_bb = stackIn_4_1 != 0;
              un.a(676);
              vi.a(-7414);
              this.a(param6, param2, -112, param1);
              var10 = null;
              if (-1 != (f.field_f & this.field_L ^ -1)) {
                var10 = gj.a(true, 0, oo.field_c, Pool.field_M);
                break L2;
              } else {
                if (0 == (hq.field_c & this.field_L)) {
                  break L2;
                } else {
                  if (im.field_ic[param2] != null) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= this.field_I.field_n) {
                        L4: {
                          var11_ref_String = this.field_I.field_f.a(1, this.field_i);
                          if (null == var11_ref_String) {
                            break L4;
                          } else {
                            var10 = gj.a(true, 0, im.field_ic[param2], var11_ref_String);
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        discarded$0 = this.e(-30360, var11);
                        var11++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              this.field_S = 200;
              if (var10 != null) {
                ((ij) (var10)).field_B = 250;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 != (hq.field_c & this.field_L)) {
                break L6;
              } else {
                this.c((byte) -102);
                break L6;
              }
            }
            L7: {
              L8: {
                if ((hq.field_c & this.field_L ^ -1) == -1) {
                  break L8;
                } else {
                  if (-2 != this.field_db) {
                    lc.field_U = new vh("chat_toggle", (vh) null, 0, 440, 60, 20, ua.field_n);
                    lc.field_U.field_Gb = lb.field_O;
                    lc.field_U.field_F = hm.field_l;
                    lc.field_U.field_hb = ta.field_e;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              lc.field_U = null;
              break L7;
            }
            L9: {
              if (!param5) {
                var11_ref_al = this.field_I;
                f.field_g = 0;
                var12_ref_al = var11_ref_al;
                pq.field_B = new pq[][]{};
                var13 = 0;
                L10: while (true) {
                  if ((pq.field_B.length ^ -1) >= (var13 ^ -1)) {
                    rb.field_e = new ar[pq.field_B.length * 0];
                    var13 = 0;
                    L11: while (true) {
                      if (rb.field_e.length <= var13) {
                        wh.field_g = 0;
                        break L9;
                      } else {
                        rb.field_e[var13] = new ar();
                        var13++;
                        continue L11;
                      }
                    }
                  } else {
                    array$1 = new pq[var12_ref_al.field_l.length];
                    pq.field_B[var13] = array$1;
                    var14 = 0;
                    L12: while (true) {
                      if ((pq.field_B[var13].length ^ -1) >= (var14 ^ -1)) {
                        var13++;
                        continue L10;
                      } else {
                        pq.field_B[var13][var14] = new pq();
                        var14++;
                        continue L12;
                      }
                    }
                  }
                }
              } else {
                var11_ref_al = this.field_I;
                f.field_g = 12;
                var12_ref_al = var11_ref_al;
                pq.field_B = new pq[12][];
                var13 = 0;
                L13: while (true) {
                  if (var13 >= pq.field_B.length) {
                    rb.field_e = new ar[12 * pq.field_B.length];
                    var13 = 0;
                    L14: while (true) {
                      if ((var13 ^ -1) <= (rb.field_e.length ^ -1)) {
                        wh.field_g = 0;
                        break L9;
                      } else {
                        rb.field_e[var13] = new ar();
                        var13++;
                        continue L14;
                      }
                    }
                  } else {
                    array$2 = new pq[var12_ref_al.field_l.length];
                    pq.field_B[var13] = array$2;
                    var14 = 0;
                    L15: while (true) {
                      if (pq.field_B[var13].length <= var14) {
                        var13++;
                        continue L13;
                      } else {
                        pq.field_B[var13][var14] = new pq();
                        var14++;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            L16: {
              this.c(param4, param3, 125);
              var11 = this.field_I.j(97).field_M;
              var12 = f.field_g;
              if (null != pq.field_B) {
                stackIn_71_0 = pq.field_B.length;
                break L16;
              } else {
                stackIn_71_0 = 0;
                break L16;
              }
            }
            L17: {
              var13 = stackIn_71_0;
              var14 = 1465 + var11 + -var12;
              vm.field_f = vm.field_f & 65280;
              var15 = -var11 + 940 - -var13;
              wq.field_c = -16777216 & wq.field_c | 39595 + var14;
              dk.field_f = 7621 * var14 + var15;
              field_fb = 998899712 + (var15 << -1350591920);
              if ((this.field_L & hq.field_c) == 0) {
                break L17;
              } else {
                this.field_b = new kj();
                break L17;
              }
            }
            this.a(-23095);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var10 = decompiledCaughtException;
            stackIn_79_0 = var10;

            stackIn_79_1 = new StringBuilder().append("uf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L18;
            } else {
              stackIn_80_0 = stackIn_79_0;
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    uf(hq param0, String[] param1) {
        RuntimeException runtimeException = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_Y = false;
        this.field_kb = false;
        this.field_d = 0;
        this.field_V = -1;
        this.field_m = 0;
        this.field_T = false;
        this.field_p = -1;
        this.field_e = -1;
        this.field_k = -1;
        this.field_t = 0;
        this.field_H = false;
        this.field_g = -1;
        this.field_Q = 0;
        this.field_j = false;
        this.field_N = -1;
        this.field_A = 0;
        this.field_u = 0;
        this.field_f = 57;
        this.field_l = 0;
        this.field_q = false;
        this.field_Z = 0;
        this.field_eb = new mm();
        this.field_O = new mm();
        this.field_o = 0;
        this.field_ab = new int[12];
        this.field_a = 500;
        this.field_R = -1;
        this.field_D = true;
        this.field_M = -1;
        this.field_v = -1;
        this.field_C = 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if ((hq.field_i ^ -1) > -3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((uf) (this)).field_bb = stackIn_4_1 != 0;
            this.field_db = 0;
            this.field_L = sk.field_d;
            this.a(76, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("uf.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_s = "Press <img=4> to leave shot mode for top-view.";
        field_J = "Type your age in years";
        field_X = 0;
        field_K = "Mouse Y-axis: Normal";
        field_fb = 0;
        field_y = new byte[1000][];
    }
}
