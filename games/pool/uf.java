/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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

    private final void z() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((uf) this).field_ib = new int[((uf) this).field_I.field_l.length];
            ((uf) this).field_E = 16 * (-1 + ((uf) this).field_I.field_l.length);
            ((uf) this).field_U = ((uf) this).field_E + qh.field_f >> 1;
            ((uf) this).field_n = id.field_a[3].field_z + 18 + id.field_a[5].field_z;
            ((uf) this).field_P = qh.field_f - ((uf) this).field_E >> 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.WD(" + 4476 + ')');
        }
    }

    private final String a(String param0, String param1, String param2, String param3, byte param4, int param5, String param6, String param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        StringBuilder var12 = null;
        int var13 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_44_0 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        String stackOut_43_0 = null;
        String stackOut_41_0 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        String stackOut_68_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String stackOut_69_0 = null;
        String stackOut_35_0 = null;
        String stackOut_33_0 = null;
        Object stackOut_27_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == (param5 & 1 << ((uf) this).field_db)) {
                  break L2;
                } else {
                  if (0 == (((uf) this).field_L & hq.field_c)) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            var9_int = stackIn_7_0;
            var10 = new int[((uf) this).field_I.field_n];
            var11 = 0;
            var12_int = 0;
            var13 = 0;
            L3: while (true) {
              if (var13 >= ((uf) this).field_I.field_n) {
                if (var11 != 0) {
                  if (var11 != 1) {
                    if (var11 == 2) {
                      if (var9_int != 0) {
                        stackOut_43_0 = nr.a(new String[3], -1, param3);
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      } else {
                        stackOut_41_0 = nr.a(new String[3], -1, param2);
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      }
                    } else {
                      L4: {
                        var12 = new StringBuilder(128);
                        if (var9_int != 0) {
                          var11--;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var13 = 0;
                      L5: while (true) {
                        if (~var11 >= ~var13) {
                          L6: {
                            stackOut_65_0 = new String[]{var12.toString(), "<%1>", "<%2>"};
                            stackOut_65_1 = -1;
                            stackIn_68_0 = stackOut_65_0;
                            stackIn_68_1 = stackOut_65_1;
                            stackIn_66_0 = stackOut_65_0;
                            stackIn_66_1 = stackOut_65_1;
                            if (var9_int == 0) {
                              stackOut_68_0 = (String[]) (Object) stackIn_68_0;
                              stackOut_68_1 = stackIn_68_1;
                              stackOut_68_2 = (String) param6;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              stackIn_69_2 = stackOut_68_2;
                              break L6;
                            } else {
                              stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                              stackOut_66_1 = stackIn_66_1;
                              stackOut_66_2 = (String) param0;
                              stackIn_69_0 = stackOut_66_0;
                              stackIn_69_1 = stackOut_66_1;
                              stackIn_69_2 = stackOut_66_2;
                              break L6;
                            }
                          }
                          stackOut_69_0 = nr.a(stackIn_69_0, stackIn_69_1, stackIn_69_2);
                          stackIn_70_0 = stackOut_69_0;
                          break L0;
                        } else {
                          L7: {
                            L8: {
                              if (0 != var13) {
                                break L8;
                              } else {
                                if (var9_int == 0) {
                                  StringBuilder discarded$4 = var12.append(nr.a(new String[3], -1, en.field_e));
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (~var13 == ~(-1 + var11)) {
                              StringBuilder discarded$5 = var12.append(nr.a(new String[3], -1, lq.field_N));
                              break L7;
                            } else {
                              StringBuilder discarded$6 = var12.append(nr.a(new String[3], -1, bc.field_h));
                              break L7;
                            }
                          }
                          var13++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (var9_int != 0) {
                      stackOut_35_0 = (String) param7;
                      stackIn_36_0 = stackOut_35_0;
                      return stackIn_36_0;
                    } else {
                      stackOut_33_0 = nr.a(new String[3], -1, param1);
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0;
                    }
                  }
                } else {
                  stackOut_27_0 = null;
                  stackIn_28_0 = stackOut_27_0;
                  return (String) (Object) stackIn_28_0;
                }
              } else {
                L9: {
                  if ((param5 & 1 << var13) != 0) {
                    L10: {
                      L11: {
                        if (((uf) this).field_db != var13) {
                          break L11;
                        } else {
                          if ((((uf) this).field_L & hq.field_c) == 0) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      int incrementValue$7 = var12_int;
                      var12_int++;
                      var10[incrementValue$7] = var13;
                      break L10;
                    }
                    var11++;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var9 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var9;
            stackOut_71_1 = new StringBuilder().append("uf.OC(");
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L12;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L12;
            }
          }
          L13: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L13;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L13;
            }
          }
          L14: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L14;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L14;
            }
          }
          L15: {
            stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');
            stackIn_86_0 = stackOut_83_0;
            stackIn_86_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param3 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L15;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_87_0 = stackOut_84_0;
              stackIn_87_1 = stackOut_84_1;
              stackIn_87_2 = stackOut_84_2;
              break L15;
            }
          }
          L16: {
            stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
            stackOut_87_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',').append(61).append(',').append(param5).append(',');
            stackIn_90_0 = stackOut_87_0;
            stackIn_90_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param6 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L16;
            } else {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "{...}";
              stackIn_91_0 = stackOut_88_0;
              stackIn_91_1 = stackOut_88_1;
              stackIn_91_2 = stackOut_88_2;
              break L16;
            }
          }
          L17: {
            stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
            stackOut_91_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',');
            stackIn_94_0 = stackOut_91_0;
            stackIn_94_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param7 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L17;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_95_0 = stackOut_92_0;
              stackIn_95_1 = stackOut_92_1;
              stackIn_95_2 = stackOut_92_2;
              break L17;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + ')');
        }
        return stackIn_70_0;
    }

    private final void e(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              if (iq.field_i) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            tk.field_k.field_ab = dq.field_e[var2_int];
            tk.field_k.field_hb = dq.field_e[var2_int + 2];
            tk.field_k.field_xb = dq.field_e[4 - -var2_int];
            tk.field_k.field_yb = dq.field_e[6 + var2_int];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.PC(" + false + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            L2: {
              if (param0 < 0) {
                param0 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > 4096) {
                param0 = 4096;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~((uf) this).field_Q == ~param0) {
                break L4;
              } else {
                var3 = this.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_d, ((uf) this).field_G.field_k, param0, (byte) 95, ((uf) this).field_G.field_h);
                if (null != var3) {
                  ((uf) this).field_G.field_k = var3[0];
                  ((uf) this).field_G.field_d = var3[1];
                  ((uf) this).field_G.field_e = var3[2];
                  ((uf) this).field_Q = param0;
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
          throw wm.a((Throwable) (Object) var3_ref, "uf.CA(" + param0 + ',' + param1 + ')');
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
              var3 = ((uf) this).field_I.j(92);
              if (var3.field_u == 0) {
                break L1;
              } else {
                if (!((uf) this).field_Y) {
                  break L1;
                } else {
                  L2: {
                    ej.field_j.b(false, 72);
                    var3.a(((uf) this).field_I, (ge) (Object) ej.field_j, -7478);
                    if ((pd.field_i & 2097152L) != 0L) {
                      System.out.println("->C2S_MANHANDLE_BALL: " + vi.a((byte) 108, 16, 4, (long)var3.field_P) + "," + vi.a((byte) 64, 16, 4, (long)var3.field_Q));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((uf) this).field_Y = false;
                  ((uf) this).field_d = 0;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uf.A(" + param0 + ')');
        }
    }

    private final boolean x() {
        RuntimeException var2 = null;
        qe var2_ref = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_ref = ((uf) this).field_I.j(52);
                if (0 <= var2_ref.field_M) {
                  break L2;
                } else {
                  if (((uf) this).field_I.field_y > 0) {
                    break L2;
                  } else {
                    if (var2_ref.field_u != 0) {
                      break L2;
                    } else {
                      if (!var2_ref.field_E) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.UA(" + -102 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void g(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((uf) this).field_Y = true;
                break L1;
              }
            }
            ((uf) this).field_S = -1;
            ((uf) this).s((byte) -37);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.K(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        try {
            ((uf) this).field_I.j(109).field_V = (short) 0;
            ((uf) this).field_I.e((byte) -124);
            this.a(((uf) this).field_I.j(126), 1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.KD(" + 0 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        try {
          L0: {
            L1: {
              if ((hq.field_c & ((uf) this).field_L) != 0) {
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
                    stackOut_27_0 = -3405;
                    stackOut_27_1 = 19;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (mg.a(true)) {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = 21;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      stackIn_31_2 = stackOut_30_2;
                      break L3;
                    } else {
                      stackOut_28_0 = stackIn_28_0;
                      stackOut_28_1 = stackIn_28_1;
                      stackOut_28_2 = 0;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      stackIn_31_2 = stackOut_28_2;
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
                        stackOut_18_0 = -3405;
                        stackOut_18_1 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (!mg.a(true)) {
                          stackOut_21_0 = stackIn_21_0;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          break L4;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackOut_19_1 = stackIn_19_1;
                          stackOut_19_2 = 21;
                          stackIn_22_0 = stackOut_19_0;
                          stackIn_22_1 = stackOut_19_1;
                          stackIn_22_2 = stackOut_19_2;
                          break L4;
                        }
                      }
                      fq.a(stackIn_22_0, stackIn_22_1, stackIn_22_2, var3_int != 0);
                      break L1;
                    } else {
                      L5: {
                        var3_int = param1 ? 1 : 0;
                        stackOut_13_0 = -3405;
                        stackOut_13_1 = 16;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (!mg.a(true)) {
                          stackOut_16_0 = stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L5;
                        } else {
                          stackOut_14_0 = stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 21;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L5;
                        }
                      }
                      fq.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, var3_int != 0);
                      break L1;
                    }
                  } else {
                    L6: {
                      var3_int = param1 ? 1 : 0;
                      stackOut_7_0 = -3405;
                      stackOut_7_1 = 18;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (mg.a(true)) {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 21;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L6;
                      } else {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 0;
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
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
          throw wm.a((Throwable) (Object) var3, "uf.OD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void l() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -1;
              if (((uf) this).field_S >= 0) {
                break L1;
              } else {
                if (!((uf) this).i(-1)) {
                  break L1;
                } else {
                  if (!((uf) this).field_I.field_l[((uf) this).field_e].field_s) {
                    break L1;
                  } else {
                    L2: {
                      if ((524288L & pd.field_i) != 0L) {
                        break L2;
                      } else {
                        if (((uf) this).field_I.j(70).field_q != 0) {
                          break L1;
                        } else {
                          if (((uf) this).field_I.j(55).field_u == 0) {
                            break L1;
                          } else {
                            if (0 != ((uf) this).field_e) {
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
                      if (var3 < -3) {
                        break L3;
                      } else {
                        if (var3 > 3) {
                          break L3;
                        } else {
                          if (var4 < -3) {
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
                    ((uf) this).field_V = ((uf) this).field_e;
                    ((uf) this).field_H = false;
                    if (((uf) this).field_V != 0) {
                      break L1;
                    } else {
                      if (((uf) this).field_T) {
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
          throw wm.a((Throwable) (Object) var2, "uf.ND(" + -72 + ')');
        }
    }

    private final void e() {
        RuntimeException var2 = null;
        double[] var2_array = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.b(1, 2, false)) {
                var2_array = new double[2];
                if (!rq.a(64, ua.field_o, false, ((uf) this).field_O.d(8), lq.field_W, var2_array, ((uf) this).field_ab)) {
                  break L1;
                } else {
                  ((uf) this).field_O.field_f = var2_array[0];
                  ((uf) this).field_O.field_m = var2_array[1];
                  ((uf) this).field_O.c((byte) -40);
                  ((uf) this).field_R = -1;
                  ((uf) this).field_M = -1;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.JD(" + 11 + ')');
        }
    }

    private final int a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int stackIn_110_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_109_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (((uf) this).field_T) {
                L2: {
                  if (0 != ((uf) this).field_I.j(102).field_q) {
                    break L2;
                  } else {
                    if (param1 != 1) {
                      break L2;
                    } else {
                      if (vj.field_c[82]) {
                        break L2;
                      } else {
                        if (vj.field_c[86]) {
                          break L2;
                        } else {
                          if (vj.field_c[81]) {
                            var4_int = 4;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (((uf) this).field_I.j(74).field_q != 0) {
                    break L3;
                  } else {
                    if (param1 != 2) {
                      break L3;
                    } else {
                      if (vj.field_c[82]) {
                        break L3;
                      } else {
                        if (vj.field_c[86]) {
                          break L3;
                        } else {
                          if (!vj.field_c[81]) {
                            var4_int = 3;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                if (0 != ((uf) this).field_I.j(75).field_q) {
                  break L1;
                } else {
                  if (param1 != 1) {
                    break L1;
                  } else {
                    if (!vj.field_c[82]) {
                      break L1;
                    } else {
                      if (vj.field_c[86]) {
                        break L1;
                      } else {
                        if (vj.field_c[81]) {
                          break L1;
                        } else {
                          var4_int = 3;
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                L4: {
                  if (param1 != 1) {
                    break L4;
                  } else {
                    if (vj.field_c[82]) {
                      break L4;
                    } else {
                      if (vj.field_c[86]) {
                        break L4;
                      } else {
                        if (vj.field_c[81]) {
                          var4_int = 2;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param1 != 2) {
                    break L5;
                  } else {
                    if (vj.field_c[82]) {
                      break L5;
                    } else {
                      if (vj.field_c[86]) {
                        break L5;
                      } else {
                        if (vj.field_c[81]) {
                          break L5;
                        } else {
                          var4_int = 1;
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (param1 != 1) {
                  break L1;
                } else {
                  if (!vj.field_c[82]) {
                    break L1;
                  } else {
                    if (vj.field_c[86]) {
                      break L1;
                    } else {
                      if (vj.field_c[81]) {
                        break L1;
                      } else {
                        var4_int = 1;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param1 != 1) {
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
                      L7: {
                        L8: {
                          if (!param2) {
                            break L8;
                          } else {
                            if (((uf) this).field_t == 5) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (this.g((byte) 124) == -1) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                      var4_int = 5;
                      break L6;
                    }
                  }
                }
              }
            }
            stackOut_109_0 = var4_int;
            stackIn_110_0 = stackOut_109_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.SC(" + 9587 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_110_0;
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -69) {
                break L1;
              } else {
                ((uf) this).field_u = -13;
                break L1;
              }
            }
            L2: {
              if (this.b(1, 4, false)) {
                var3_array = this.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_d, ((uf) this).field_G.field_k, ((uf) this).field_Q, (byte) 95, param1);
                if (var3_array == null) {
                  this.m(99);
                  break L2;
                } else {
                  ((uf) this).field_G.field_k = var3_array[0];
                  ((uf) this).field_G.field_h = param1;
                  ((uf) this).field_G.field_d = var3_array[1];
                  ((uf) this).field_G.field_e = var3_array[2];
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
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.DC(" + param0 + ',' + param1 + ')');
        }
    }

    private final static void a(di param0, int param1, di param2, di param3) {
        RuntimeException var4 = null;
        dd var4_ref = null;
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
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
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var13 = Pool.field_O;
        try {
          L0: {
            gr.field_I = aj.a(0, "commonui", param2, "frame_top");
            rb.field_d = aj.a(0, "commonui", param2, "frame_bottom");
            me.field_p = pf.a("commonui", (byte) 124, "jagex_logo_grey", param2);
            jj.field_S = aj.a(0, "commonui", param2, "button");
            bo.field_a = ep.a(72, param2, "validation", "commonui");
            qk.field_a = (lr) (Object) hn.a(param3, "commonui", "arezzo12", -25154, param2);
            lc.field_O = (lr) (Object) hn.a(param3, "commonui", "arezzo14", -25154, param2);
            bi.field_e = (lr) (Object) hn.a(param3, "commonui", "arezzo14bold", -25154, param2);
            var4_ref = new dd(param0.a(false, "", "button.gif"), (java.awt.Component) (Object) pa.field_K);
            qb discarded$1 = tl.a(param2, 3812, "dropdown", "commonui");
            var5 = gr.a(param2, "commonui", -24155, "screen_options");
            vl.field_l = new qb[4];
            la.field_c = new qb[4];
            sn.field_h = new qb[4];
            var6 = new qb[][]{vl.field_l, sn.field_h, la.field_c};
            var7 = new int[4][];
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              if (~var8 <= ~var7.length) {
                var8 = var5[0].field_j[0];
                var7[2][var8] = 16777215;
                var7[1][var8] = 2394342;
                var7[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var4_ref.field_A;
                    uc.a((byte) 125);
                    var4_ref.e();
                    qh.e(0, 0, qh.field_l, qh.field_f);
                    var10 = new dd(var9, var9);
                    var10.e();
                    var4_ref.a(0, 0);
                    var11 = new dd(var9, var9);
                    var11.e();
                    var4_ref.a(var9 - var4_ref.field_z, 0);
                    var12 = new dd(var4_ref.field_z - var9 * 2, var9);
                    var12.e();
                    var4_ref.a(-var9, 0);
                    oc.a(112);
                    jj.field_S = new dd[]{var10, var12, var11};
                    break L0;
                  } else {
                    var10_array = var6[var9];
                    var11_int = 0;
                    L3: while (true) {
                      if (var10_array.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var10_array[var11_int] = ud.a(var5[var9], (byte) 91, var7[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var7[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("uf.PA(");
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
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(-22764).append(',');
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fe.a(oa.field_g, -13671, param1)) {
              return;
            } else {
              var4 = oa.field_g;
              var5 = param1;
              var4[var5 >> 5] = md.a(var4[var5 >> 5], 1 << rb.b(var5, 31));
              var4 = hp.field_c;
              var5 = param1;
              var4[var5 >> 5] = md.a(var4[var5 >> 5], 1 << rb.b(var5, 31));
              L1: {
                ui.field_U.b((byte) 115, (ma) (Object) new bq(param1));
                ij discarded$1 = gj.a(true, 0, md.field_a[param1], ef.a((String) null, kc.field_d[param1], (byte) 4, (String) null));
                if (!((uf) this).field_q) {
                  ad.field_l.b((byte) 84, (ma) (Object) new i(param1, param2, vm.field_f, wq.field_c, field_fb, dk.field_f + ((uf) this).field_o));
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4_ref, "uf.OB(" + 104 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
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
                ((uf) this).a(false, (byte) -114);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.G(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 < ((uf) this).field_l) {
                var2_int = -5 + il.field_f.field_w + -5;
                var3 = -14 + il.field_f.field_y;
                var4 = this.b(-16439);
                var5 = fl.field_q.field_ib - il.field_f.field_y >> 1;
                var6 = this.b(((uf) this).field_Q, 0, var3);
                qh.a(ho.field_s);
                qh.c(var4 - -5, -var6 + (7 + (var5 + var3)), var2_int + (var4 + 5), var5 - (-7 - var3));
                v.field_c.c(var4, var5);
                qh.b(ho.field_s);
                il.field_f.c(var4, var5);
                if ((2L & pd.field_i) == 0L) {
                  break L1;
                } else {
                  sa.field_h.c("power=" + ((uf) this).field_Q + ", bar_filled=" + var6, var4, var5, 16777215, 1);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.L(" + true + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((uf) this).i(-1)) {
                break L1;
              } else {
                if (((uf) this).field_I.field_o) {
                  break L1;
                } else {
                  if (((uf) this).field_I.j(36).field_q == 0) {
                    L2: {
                      var2_int = -36 % ((param0 - -15) / 63);
                      if (!this.b(0, 3, false)) {
                        break L2;
                      } else {
                        int discarded$2 = 117;
                        this.u();
                        break L2;
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uf.BA(" + param0 + ')');
        }
    }

    private final void C() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            hh.field_c = true;
            ((uf) this).field_G = ((uf) this).field_x[((uf) this).field_I.j(57).field_L];
            L1: {
              ((uf) this).field_Q = ((uf) this).field_G.field_n;
              ((uf) this).field_h = 0;
              if (null == ((uf) this).field_b) {
                break L1;
              } else {
                ((uf) this).field_b.b((byte) 63);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.B(" + 120 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2) {
        long var4_long = 0L;
        int var4_int = 0;
        qe var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_188_1 = 0;
        int stackIn_258_0 = 0;
        int stackIn_308_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_187_1 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_257_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_306_0 = 0;
        L0: {
          var9 = Pool.field_O;
          var4_long = pd.field_i;
          var4_long = var4_long | var4_long >>> 32;
          var4_long = var4_long | var4_long << 16;
          var4_long = var4_long | var4_long << 8;
          wq.field_c = (int)((long)wq.field_c | var4_long >>> 16 & 65280L);
          vm.field_f = (int)((long)vm.field_f | -16777216L & var4_long);
          var6 = -117 % ((param2 - -60) / 47);
          var4_int = ((uf) this).field_o;
          var5 = var4_int;
          var6 = var5 + dk.field_f;
          var7 = var6 % 7621;
          var6 = (var7 + 2) % 7621 + (-var7 + var6);
          dk.field_f = -var5 + var6;
          field_fb = ((field_fb >>> 16) + 2) % 30484 << 16 | field_fb & 65535;
          int discarded$27 = -1;
          var4_int = pa.f();
          if ((vm.field_f & 255) >= var4_int) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = -256 & vm.field_f;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (var4_int > 255) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 255;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackIn_3_0 = stackOut_2_0;
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = var4_int;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            vm.field_f = stackIn_5_0 + stackIn_5_1;
            break L0;
          }
        }
        L2: {
          if ((sk.field_d & ((uf) this).field_L) == 0) {
            break L2;
          } else {
            ((uf) this).field_c.f(25);
            if (param0) {
              break L2;
            } else {
              param0 = ((uf) this).field_c.b(99);
              break L2;
            }
          }
        }
        L3: {
          if ((((uf) this).field_L & hq.field_c) == 0) {
            break L3;
          } else {
            L4: {
              if (lc.field_U == null) {
                break L4;
              } else {
                L5: {
                  if (ib.field_r <= 0) {
                    lc.field_U.field_hb = ta.field_e;
                    break L5;
                  } else {
                    lc.field_U.field_hb = jh.field_e;
                    break L5;
                  }
                }
                lc.field_U.field_hb.field_B = 5;
                lc.field_U.field_hb.field_G = 9;
                lc.field_U.field_Db = lc.field_U.field_hb.field_A + 10;
                lc.field_U.field_gb = 9 + (lc.field_U.field_hb.field_z + 9);
                lc.field_U.field_eb = fl.field_q.field_ib - 5 + -lc.field_U.field_hb.field_A + -5;
                break L4;
              }
            }
            if (!un.field_b) {
              break L3;
            } else {
              break L3;
            }
          }
        }
        L6: {
          if ((((uf) this).field_L & hq.field_c) == 0) {
            break L6;
          } else {
            if (!param1) {
              break L6;
            } else {
              if (rg.field_p) {
                break L6;
              } else {
                lc.field_U.a(true, false);
                if (lc.field_U.field_R == 1) {
                  L7: {
                    param0 = true;
                    if (un.field_b) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                  un.field_b = stackIn_30_0 != 0;
                  if (-1 == ((uf) this).field_M) {
                    break L6;
                  } else {
                    this.b(false, 22, ((uf) this).field_M);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
          }
        }
        L8: {
          if (param1) {
            L9: {
              L10: {
                if (0 == (((uf) this).field_L & hq.field_c)) {
                  break L10;
                } else {
                  if (rg.field_p) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (!((uf) this).i(-1)) {
                break L9;
              } else {
                if (((uf) this).field_S >= 0) {
                  break L9;
                } else {
                  this.J(0);
                  break L9;
                }
              }
            }
            L11: {
              tk.field_k.a(true, false);
              if (param0) {
                break L11;
              } else {
                if (tk.field_k.field_R == 1) {
                  L12: {
                    if (iq.field_i) {
                      stackOut_48_0 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      break L12;
                    } else {
                      stackOut_47_0 = 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L12;
                    }
                  }
                  iq.field_i = stackIn_49_0 != 0;
                  param0 = true;
                  this.e(false);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (((uf) this).field_T) {
                L14: {
                  L15: {
                    if (wn.field_i != ((uf) this).field_p) {
                      break L15;
                    } else {
                      if (((uf) this).field_g != gg.field_f) {
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.f(false);
                  if (((uf) this).field_e != 0) {
                    break L14;
                  } else {
                    this.a(-119, gg.field_f, wn.field_i);
                    break L14;
                  }
                }
                if (0 == ((uf) this).field_e) {
                  break L13;
                } else {
                  boolean discarded$28 = this.a(false, ((uf) this).field_G.field_e * 3 / 4, ((uf) this).field_G.field_d * 3 / 4);
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L16: {
              if (param0) {
                break L16;
              } else {
                int discarded$29 = 3460;
                if (!this.h()) {
                  break L16;
                } else {
                  param0 = true;
                  break L16;
                }
              }
            }
            L17: {
              if (!e.a(-19839, (uf) this)) {
                break L17;
              } else {
                L18: {
                  var4 = ((uf) this).field_I.j(70);
                  if ((hq.field_c & ((uf) this).field_L) != 0) {
                    ej.field_j.b(false, 71);
                    var4.a((ge) (Object) ej.field_j, (byte) 0);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var4.d(126)) {
                    break L19;
                  } else {
                    boolean discarded$30 = ((uf) this).field_I.f((byte) 38);
                    this.b(127, var4);
                    break L19;
                  }
                }
                param0 = true;
                break L17;
              }
            }
            L20: {
              if (vj.field_c[82]) {
                break L20;
              } else {
                if (!vj.field_c[86]) {
                  if (cd.field_b == 1) {
                    L21: {
                      var4_int = ((uf) this).field_o;
                      wq.field_c = ((65535 & wq.field_c) + 2) % 31676 | wq.field_c & -65536;
                      var5 = var4_int;
                      var6 = dk.field_f - -var5;
                      var7 = var6 % 7621;
                      var8 = var6 / 7621;
                      var6 = var7 + (var8 - -2) % 31676 * 7621;
                      dk.field_f = -var5 + var6;
                      var4_int = ((uf) this).field_o;
                      field_fb = 65535 & field_fb | (16 + (field_fb >>> 16)) % 30484 << 16;
                      var5 = var4_int;
                      var6 = dk.field_f + var5;
                      var7 = var6 % 7621;
                      var6 = -var7 + (var6 - -((16 + var7) % 7621));
                      dk.field_f = -var5 + var6;
                      if (param0) {
                        break L21;
                      } else {
                        if ((pd.field_i & 1L) == 0L) {
                          break L21;
                        } else {
                          int discarded$31 = 94;
                          if (!ti.a()) {
                            break L21;
                          } else {
                            param0 = true;
                            break L21;
                          }
                        }
                      }
                    }
                    L22: {
                      if (param0) {
                        break L22;
                      } else {
                        if (of.field_Ob >= lq.field_W) {
                          break L22;
                        } else {
                          if (~(of.field_Ob - -no.field_q.field_w) >= ~lq.field_W) {
                            break L22;
                          } else {
                            if (ua.field_o <= fm.field_M) {
                              break L22;
                            } else {
                              if (~ua.field_o > ~(fm.field_M - -no.field_q.field_y)) {
                                param0 = true;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0) {
                      break L20;
                    } else {
                      if (1 != ne.field_s) {
                        if (((uf) this).field_H) {
                          int discarded$32 = -72;
                          this.l();
                          break L20;
                        } else {
                          if (((uf) this).field_V == -1) {
                            break L20;
                          } else {
                            int discarded$33 = 112;
                            this.w();
                            break L20;
                          }
                        }
                      } else {
                        L23: {
                          if (((uf) this).field_T) {
                            break L23;
                          } else {
                            this.f(false);
                            break L23;
                          }
                        }
                        if (((uf) this).field_e != -1) {
                          vn.field_b = wn.field_i;
                          ((uf) this).field_H = true;
                          up.field_m = gg.field_f;
                          break L20;
                        } else {
                          L24: {
                            if (((uf) this).field_T) {
                              this.e(-69);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          int discarded$34 = 11;
                          this.e();
                          break L20;
                        }
                      }
                    }
                  } else {
                    if (cd.field_b == 0) {
                      L25: {
                        if (!((uf) this).field_H) {
                          break L25;
                        } else {
                          if (!((uf) this).field_T) {
                            this.f(false);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                      L26: {
                        if (!((uf) this).field_H) {
                          break L26;
                        } else {
                          L27: {
                            if (!((uf) this).field_T) {
                              L28: {
                                if (((uf) this).field_S >= 0) {
                                  break L28;
                                } else {
                                  if (0 != ((uf) this).field_e) {
                                    break L28;
                                  } else {
                                    this.a((byte) 78);
                                    break L27;
                                  }
                                }
                              }
                              int discarded$35 = 11;
                              this.e();
                              break L27;
                            } else {
                              if (((uf) this).field_e == 0) {
                                int discarded$36 = 1;
                                this.A();
                                break L27;
                              } else {
                                this.e(-98);
                                int discarded$37 = 11;
                                this.e();
                                break L27;
                              }
                            }
                          }
                          ((uf) this).field_H = false;
                          break L26;
                        }
                      }
                      ((uf) this).field_V = -1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            L29: {
              if (wp.field_d == 0) {
                break L29;
              } else {
                if (!fl.field_q.field_W) {
                  L30: {
                    var4_int = 0;
                    if (!((uf) this).i(-1)) {
                      break L30;
                    } else {
                      L31: {
                        if (var4_int != 0) {
                          break L31;
                        } else {
                          if ((pd.field_i & 1L) == 0L) {
                            break L31;
                          } else {
                            int discarded$38 = -92;
                            if (!bi.a()) {
                              break L31;
                            } else {
                              var4_int = 1;
                              break L31;
                            }
                          }
                        }
                      }
                      if (var4_int != 0) {
                        break L30;
                      } else {
                        int discarded$39 = 122;
                        if (this.I()) {
                          var4_int = 1;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                  if (var4_int == 0) {
                    int discarded$40 = -118;
                    boolean discarded$41 = this.b();
                    break L29;
                  } else {
                    break L29;
                  }
                } else {
                  break L29;
                }
              }
            }
            if (!((uf) this).i(-1)) {
              break L8;
            } else {
              if (((uf) this).field_I.j(65).field_q == 0) {
                L32: {
                  if (!((uf) this).field_I.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_h, ((uf) this).field_G.field_k, 359, ((uf) this).field_Q, ((uf) this).field_G.field_d)) {
                    var4_array = this.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_d, ((uf) this).field_G.field_k, ((uf) this).field_Q, (byte) 95, ((uf) this).field_G.field_h);
                    if (var4_array != null) {
                      ((uf) this).field_G.field_d = var4_array[1];
                      ((uf) this).field_G.field_e = var4_array[2];
                      ((uf) this).field_G.field_k = var4_array[0];
                      break L32;
                    } else {
                      this.m(110);
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                int discarded$42 = -47;
                this.d();
                break L8;
              } else {
                break L8;
              }
            }
          } else {
            break L8;
          }
        }
        L33: {
          if ((((uf) this).field_L & hq.field_c) == 0) {
            break L33;
          } else {
            if (((uf) this).i(-1)) {
              break L33;
            } else {
              if (((uf) this).field_b.a(false)) {
                L34: {
                  ((uf) this).field_G.c(255, ((uf) this).field_b);
                  if (!((uf) this).field_G.a(-2043, ((uf) this).field_b)) {
                    break L34;
                  } else {
                    ((uf) this).field_b.b((byte) 94);
                    break L34;
                  }
                }
                hh.field_c = true;
                id.field_c.field_g = true;
                break L33;
              } else {
                break L33;
              }
            }
          }
        }
        L35: {
          L36: {
            if (!param1) {
              break L36;
            } else {
              if (!((uf) this).field_T) {
                break L36;
              } else {
                if (((uf) this).field_e != 0) {
                  break L36;
                } else {
                  if (!((uf) this).i(-1)) {
                    break L36;
                  } else {
                    le discarded$43 = lg.field_s.a(false, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -46));
                    break L35;
                  }
                }
              }
            }
          }
          le discarded$44 = lg.field_s.a(true, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -83));
          break L35;
        }
        L37: {
          this.u(-114);
          var4_int = f.field_g;
          if (~var4_int < ~(vm.field_f & 255)) {
            L38: {
              stackOut_185_0 = vm.field_f & -256;
              stackIn_187_0 = stackOut_185_0;
              stackIn_186_0 = stackOut_185_0;
              if (var4_int <= 255) {
                stackOut_187_0 = stackIn_187_0;
                stackOut_187_1 = var4_int;
                stackIn_188_0 = stackOut_187_0;
                stackIn_188_1 = stackOut_187_1;
                break L38;
              } else {
                stackOut_186_0 = stackIn_186_0;
                stackOut_186_1 = 255;
                stackIn_188_0 = stackOut_186_0;
                stackIn_188_1 = stackOut_186_1;
                break L38;
              }
            }
            vm.field_f = stackIn_188_0 + stackIn_188_1;
            break L37;
          } else {
            break L37;
          }
        }
        L39: {
          var4 = ((uf) this).field_I.j(71);
          if (!ne.field_r.c(0)) {
            break L39;
          } else {
            if ((((uf) this).field_L & sk.field_d) == 0) {
              L40: {
                if (!((uf) this).field_I.field_o) {
                  var6 = 0;
                  var7 = 0;
                  L41: while (true) {
                    if (((uf) this).field_I.field_n <= var7) {
                      L42: {
                        var5_ref_String = this.a(rk.field_e, qe.field_F, mg.field_a, sl.field_W, (byte) 61, var6, jl.field_b, vj.field_g);
                        if (var5_ref_String == null) {
                          break L42;
                        } else {
                          em.a((byte) 127, false, 1, var5_ref_String);
                          break L42;
                        }
                      }
                      L43: {
                        var5_ref_String = this.a(wj.field_U, ah.field_b, w.field_e, bl.field_j, (byte) 61, ((uf) this).field_I.field_p & ~var6, dl.field_i, cd.field_c);
                        if (var5_ref_String != null) {
                          em.a((byte) 124, false, 1, var5_ref_String);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      var5_ref_String = this.a(jk.field_f, rn.field_h, rg.field_o, qp.field_bc, (byte) 61, ((uf) this).field_I.field_x, fd.field_H, ae.field_f);
                      if (var5_ref_String == null) {
                        break L40;
                      } else {
                        em.a((byte) 119, false, 1, var5_ref_String);
                        break L40;
                      }
                    } else {
                      L44: {
                        if (!((uf) this).field_I.field_f.a((byte) 94, var7)) {
                          var6 = var6 | 1 << var7;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                      var7++;
                      continue L41;
                    }
                  }
                } else {
                  var5_ref_String = this.a(o.field_B, p.field_k, hp.field_e, pq.field_D, (byte) 61, ((uf) this).field_I.field_b, ee.field_a, kb.field_f);
                  if (var5_ref_String == null) {
                    break L40;
                  } else {
                    em.a((byte) 122, false, 1, var5_ref_String);
                    break L40;
                  }
                }
              }
              if (0 == var4.field_q) {
                if (((uf) this).i(-1)) {
                  if (!((uf) this).field_T) {
                    int fieldTemp$45 = (1 + mk.field_b) % 4;
                    mk.field_b = (1 + mk.field_b) % 4;
                    var6 = fieldTemp$45;
                    if (var6 != 0) {
                      if (var6 != 1) {
                        if (var6 == 2) {
                          em.a((byte) 127, true, 1, pm.field_o);
                          break L39;
                        } else {
                          if (var6 == 3) {
                            em.a((byte) 119, true, 1, sa.field_l);
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                      } else {
                        em.a((byte) 117, true, 1, sm.field_B);
                        break L39;
                      }
                    } else {
                      em.a((byte) 127, true, 1, ah.field_h);
                      break L39;
                    }
                  } else {
                    int fieldTemp$46 = (mk.field_b + 1) % 5;
                    mk.field_b = (mk.field_b + 1) % 5;
                    var6 = fieldTemp$46;
                    if (var6 != 0) {
                      if (var6 == 1) {
                        em.a((byte) 126, true, 1, gk.field_lb);
                        break L39;
                      } else {
                        if (2 == var6) {
                          em.a((byte) 119, true, 1, sf.field_z);
                          break L39;
                        } else {
                          if (var6 == 3) {
                            em.a((byte) 117, true, 1, em.field_O);
                            break L39;
                          } else {
                            if (4 != var6) {
                              break L39;
                            } else {
                              if (var4.field_u != 0) {
                                em.a((byte) 119, true, 1, up.field_L);
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      em.a((byte) 118, true, 1, field_s);
                      break L39;
                    }
                  }
                } else {
                  int fieldTemp$47 = (1 + mk.field_b) % 4;
                  mk.field_b = (1 + mk.field_b) % 4;
                  var6 = fieldTemp$47;
                  if (var6 != 0) {
                    if (1 == var6) {
                      em.a((byte) 119, true, 1, pm.field_o);
                      break L39;
                    } else {
                      break L39;
                    }
                  } else {
                    em.a((byte) 119, true, 1, sm.field_B);
                    break L39;
                  }
                }
              } else {
                break L39;
              }
            } else {
              break L39;
            }
          }
        }
        L45: {
          int discarded$48 = 300;
          ie.a(false, (no.field_q.field_y >> 1) + fm.field_M);
          if (((uf) this).field_o <= 0) {
            stackOut_257_0 = 0;
            stackIn_258_0 = stackOut_257_0;
            break L45;
          } else {
            stackOut_256_0 = ((uf) this).field_o;
            stackIn_258_0 = stackOut_256_0;
            break L45;
          }
        }
        L46: {
          var5 = stackIn_258_0;
          if (0 == (f.field_f & ((uf) this).field_L)) {
            break L46;
          } else {
            if (0 > ((uf) this).field_o) {
              break L46;
            } else {
              if (!((uf) this).field_I.field_o) {
                ((uf) this).field_o = ((uf) this).field_o + 1;
                break L46;
              } else {
                break L46;
              }
            }
          }
        }
        L47: {
          var6 = var4.field_q;
          if (var6 != 0) {
            if (var6 != 1) {
              if (2 == var6) {
                if (0 == (hq.field_c & ((uf) this).field_L)) {
                  break L47;
                } else {
                  if (!var4.d(116)) {
                    break L47;
                  } else {
                    if (1 >= ((uf) this).field_o) {
                      break L47;
                    } else {
                      ((uf) this).field_o = ((uf) this).field_o - 1;
                      break L47;
                    }
                  }
                }
              } else {
                if (var6 == 3) {
                  break L47;
                } else {
                  break L47;
                }
              }
            } else {
              this.a(-65, var4);
              break L47;
            }
          } else {
            this.b(var4, -17601);
            break L47;
          }
        }
        L48: {
          if (((uf) this).field_T) {
            ((uf) this).field_O.a((uf) this, 1);
            if (((uf) this).field_Q == 0) {
              break L48;
            } else {
              if (((uf) this).field_t == 5) {
                break L48;
              } else {
                if (((uf) this).field_t == 4) {
                  break L48;
                } else {
                  L49: {
                    if (((uf) this).field_I.j(112).field_q == 0) {
                      this.b(((uf) this).field_G.field_n - -(int)(0.5 + 192.0 * Math.sin(3.141592653589793 * (double)((uf) this).field_h * 2.0 / 150.0)), true);
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  if (0L == (pd.field_i & 1024L)) {
                    ((uf) this).field_h = ((uf) this).field_h + 1;
                    break L48;
                  } else {
                    ((uf) this).field_h = 0;
                    break L48;
                  }
                }
              }
            }
          } else {
            break L48;
          }
        }
        L50: {
          if (((uf) this).field_R != -1) {
            L51: {
              int fieldTemp$49 = ((uf) this).field_R + 1;
              ((uf) this).field_R = ((uf) this).field_R + 1;
              if (400 >= fieldTemp$49) {
                break L51;
              } else {
                ((uf) this).field_R = 0;
                break L51;
              }
            }
            ((uf) this).field_O.b((double)((uf) this).field_R * 3.141592653589793 * 2.0 / 400.0, 2.356194490192345, (double)((uf) this).field_a, -6861);
            ((uf) this).field_D = true;
            break L50;
          } else {
            break L50;
          }
        }
        L52: {
          if (!((uf) this).field_eb.a(((uf) this).field_O, (byte) -78)) {
            break L52;
          } else {
            ((uf) this).field_D = true;
            break L52;
          }
        }
        L53: {
          if (((uf) this).field_o > 0) {
            stackOut_307_0 = ((uf) this).field_o;
            stackIn_308_0 = stackOut_307_0;
            break L53;
          } else {
            stackOut_306_0 = 0;
            stackIn_308_0 = stackOut_306_0;
            break L53;
          }
        }
        L54: {
          var6 = stackIn_308_0;
          if (0 < ((uf) this).field_S) {
            ((uf) this).field_S = ((uf) this).field_S - 1;
            if (((uf) this).field_S != 0) {
              break L54;
            } else {
              if (0 == (hq.field_c & ((uf) this).field_L)) {
                ((uf) this).s((byte) -101);
                ((uf) this).field_S = -1;
                break L54;
              } else {
                ej.field_j.b(false, 73);
                break L54;
              }
            }
          } else {
            break L54;
          }
        }
        L55: {
          var7 = -1;
          if ((((uf) this).field_L & sk.field_d) != 0) {
            int discarded$50 = -27011;
            var7 = pm.a();
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          if (var7 != -1) {
            break L56;
          } else {
            int discarded$51 = 1163;
            var7 = this.f();
            if (q.field_b.field_R == 0) {
              break L56;
            } else {
              this.y((byte) 75);
              break L56;
            }
          }
        }
        L57: {
          if (0 == (sk.field_d & ((uf) this).field_L)) {
            break L57;
          } else {
            if (-1 != var7) {
              break L57;
            } else {
              ((uf) this).field_c.field_h.c(-62);
              if (((uf) this).field_c.field_h.field_q == null) {
                break L57;
              } else {
                var7 = 256 | ((uf) this).field_c.field_h.field_q.field_p;
                break L57;
              }
            }
          }
        }
        L58: {
          se.field_l = 12;
          eo.field_Vb = 12;
          jo.g(0, var7);
          if (!q.field_b.field_pb) {
            break L58;
          } else {
            if (!q.field_b.field_W) {
              break L58;
            } else {
              if (-1 != dp.a(104)) {
                this.y((byte) -108);
                break L58;
              } else {
                break L58;
              }
            }
          }
        }
        L59: {
          ea.field_p = ea.field_p + 1;
          ea.field_p = ea.field_p & 31;
          int discarded$52 = 127;
          this.m();
          kh.field_gc.a(10, (uf) this);
          dq.field_a.h(-56);
          ep.a((byte) -73, (uf) this);
          this.w(87);
          if (eo.field_Tb % 100 != 0) {
            break L59;
          } else {
            this.d(0);
            break L59;
          }
        }
        L60: {
          int discarded$53 = 127;
          wc.b();
          if (~var6 < ~var5) {
            dk.field_f = dk.field_f + (-var6 + var5);
            break L60;
          } else {
            break L60;
          }
        }
    }

    final void b(ge param0, boolean param1) {
        RuntimeException runtimeException = null;
        ge var3 = null;
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
            if (!param1) {
              var3 = param0;
              ((uf) this).field_o = var3.d(-1034);
              ((uf) this).field_I.a(2, param0);
              ((uf) this).s((byte) -43);
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
            stackOut_4_1 = new StringBuilder().append("uf.GB(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(qe param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if ((param0.field_s & ag.field_e) == 0) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("uf.NA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -28 + ')');
        }
    }

    final void a(ge param0, int param1) {
        try {
            RuntimeException var3 = null;
            qe var3_ref = null;
            int var4 = 0;
            int var5 = 0;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException decompiledCaughtException = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            var5 = Pool.field_O;
            try {
              L0: {
                L1: {
                  var3_ref = ((uf) this).field_I.j(62);
                  if (param1 == 0) {
                    break L1;
                  } else {
                    ((uf) this).field_I = null;
                    break L1;
                  }
                }
                L2: {
                  var4 = var3_ref.c((byte) -28, param0);
                  if (var4 == 0) {
                    L3: {
                      if (1 > var3_ref.field_q) {
                        if (var3_ref.field_V > 0) {
                          int discarded$3 = 17;
                          this.B();
                          break L3;
                        } else {
                          ((uf) this).field_I.e((byte) 85);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    ((uf) this).field_j = true;
                    break L2;
                  } else {
                    if (var4 == 1) {
                      tc.a(new Throwable(), "Wrong shot!", -8555);
                      dn.c(-115);
                      break L2;
                    } else {
                      if (2 != var4) {
                        break L2;
                      } else {
                        L4: {
                          if (var3_ref.field_q == 1) {
                            ij discarded$4 = gj.a(true, 0, "Just too late!", (String) null);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (var3_ref.field_V > 0) {
                          int discarded$5 = 17;
                          this.B();
                          break L2;
                        } else {
                          ((uf) this).field_I.e((byte) -114);
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
                var3 = decompiledCaughtException;
                stackOut_42_0 = (RuntimeException) var3;
                stackOut_42_1 = new StringBuilder().append("uf.BB(");
                stackIn_45_0 = stackOut_42_0;
                stackIn_45_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L5;
                } else {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "{...}";
                  stackIn_46_0 = stackOut_43_0;
                  stackIn_46_1 = stackOut_43_1;
                  stackIn_46_2 = stackOut_43_2;
                  break L5;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
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
              var2_int = this.a(false, true, wn.field_i, gg.field_f);
              if (!((uf) this).field_H) {
                break L1;
              } else {
                if (cd.field_b != 1) {
                  break L1;
                } else {
                  if (((uf) this).field_e == var2_int) {
                    break L1;
                  } else {
                    ((uf) this).field_H = false;
                    break L1;
                  }
                }
              }
            }
            ((uf) this).field_e = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uf.JE(" + false + ')');
        }
    }

    private final void c(qe param0) {
        ge var3 = null;
        RuntimeException var3_ref = null;
        al var4 = null;
        ge var5 = null;
        int var6 = 0;
        ge stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ge stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ge stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ge stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        ge stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            int discarded$1 = 93;
            this.b(param0);
            var3 = new ge(((uf) this).field_I.a(-1) + 8);
            var3.a(true, f.field_g);
            var4 = ((uf) this).field_I;
            var5 = var3;
            var5.a(var4.field_l.length, false);
            var6 = 0;
            L1: while (true) {
              if (var4.field_l.length <= var6) {
                var6 = 0;
                L2: while (true) {
                  if (~var6 <= ~var4.field_w.length) {
                    L3: {
                      stackOut_10_0 = (ge) var3;
                      stackOut_10_1 = 1;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_13_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (pq.field_B != null) {
                        stackOut_13_0 = (ge) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = pq.field_B.length;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L3;
                      } else {
                        stackOut_11_0 = (ge) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        break L3;
                      }
                    }
                    L4: {
                      ((ge) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2);
                      param0.field_x = ii.a(var3.field_t, var3.field_v, 0, 154302664);
                      if ((((uf) this).field_L & hq.field_c) != 0) {
                        break L4;
                      } else {
                        if (((uf) this).field_I.field_q == -1) {
                          break L4;
                        } else {
                          ((uf) this).field_o = wn.field_f[((uf) this).field_I.field_q];
                          break L4;
                        }
                      }
                    }
                    L5: {
                      this.b((int) param0.field_V, true);
                      if ((((uf) this).field_L & hq.field_c) == 0) {
                        this.a(param0, 1);
                        break L5;
                      } else {
                        ej.field_j.b(false, 69);
                        ej.field_j.a(param0.field_x, (byte) -127);
                        break L5;
                      }
                    }
                    id.field_c.field_g = true;
                    break L0;
                  } else {
                    var4.field_w[var6].a(var5, 0);
                    var6++;
                    continue L2;
                  }
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
            stackOut_26_0 = (RuntimeException) var3_ref;
            stackOut_26_1 = new StringBuilder().append("uf.DD(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + -128 + ')');
        }
    }

    private final void a(String[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            hp.field_c = ek.a(120);
            var5_int = -61 / ((-59 - param2) / 38);
            ((uf) this).field_I = new al(param3, param1, param0, -1);
            ((uf) this).field_F = new int[((uf) this).field_I.field_h.length];
            ((uf) this).field_i = new String[((uf) this).field_I.field_h.length];
            ((uf) this).field_x = new kj[param0.length];
            var6 = 0;
            L1: while (true) {
              if (((uf) this).field_x.length <= var6) {
                L2: {
                  int discarded$1 = 4476;
                  this.z();
                  if (((uf) this).field_G == null) {
                    ((uf) this).field_G = ((uf) this).field_x[0];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != ((uf) this).field_I.field_q) {
                    ((uf) this).field_o = wn.field_f[((uf) this).field_I.field_q];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  oh.field_h = false;
                  if (0 == (f.field_f & ((uf) this).field_L)) {
                    break L4;
                  } else {
                    ((uf) this).field_o = -1;
                    break L4;
                  }
                }
                break L0;
              } else {
                ((uf) this).field_x[var6] = new kj();
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("uf.QD(");
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean b() {
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2_int = 0;
            if (!this.b(1, 1, false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              ((uf) this).field_R = -1;
              var3 = Math.max(12.0, ((uf) this).field_eb.d(8) * ((double)wp.field_d / 32.0 + 1.0));
              ((uf) this).field_eb.a(true, var3);
              ((uf) this).field_O.a(true, var3);
              ((uf) this).field_D = true;
              ((uf) this).field_M = -1;
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.GA(" + -118 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void B(int param0) {
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        pq var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            qh.a(bk.field_w);
            qh.c(t.field_e + gg.field_b[3].field_z, (fl.field_q.field_ib >> 1) + -240 + ((uf) this).field_P - 16, t.field_e - -gg.field_b[3].field_z + 18, -240 - (-(fl.field_q.field_ib >> 1) - 16) + ((uf) this).field_U);
            fb.a();
            fb.b(320 - -t.field_e, fl.field_q.field_ib >> 1);
            var2_int = 0;
            L1: while (true) {
              if (((uf) this).field_C <= var2_int) {
                L2: {
                  qh.b(bk.field_w);
                  fb.a();
                  fb.b(320, 240);
                  nj.a(id.field_a, (byte) -82, ((uf) this).field_n, t.field_e, -240 + (fl.field_q.field_ib >> 1) + -8 + ((uf) this).field_P - id.field_a[1].field_y, 16 + (((uf) this).field_E - (-id.field_a[1].field_y + -id.field_a[7].field_y)));
                  if (0L == (pd.field_i & 268435456L)) {
                    break L2;
                  } else {
                    var2 = null;
                    var3 = 0;
                    L3: while (true) {
                      if (((uf) this).field_C <= var3) {
                        if (var2 != null) {
                          sa.field_h.d((String) var2, 40, 400, 13421772, 3355443);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        L4: {
                          if (null != var2) {
                            var2 = (Object) (Object) ((String) var2 + ", " + ((uf) this).field_ib[var3]);
                            break L4;
                          } else {
                            var2 = (Object) (Object) ("rack: " + ((uf) this).field_ib[var3]);
                            break L4;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  var3 = ((uf) this).field_ib[var2_int];
                  var4 = ((uf) this).field_I.field_l[var3];
                  if (!var4.field_p) {
                    break L5;
                  } else {
                    var4.i(2);
                    dq.field_a.a(false, var4.field_G, var3);
                    break L5;
                  }
                }
                dq.field_a.a(-1912602369, var3, var4.field_G, sa.field_m, false);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw wm.a((Throwable) var2, "uf.HA(" + 32 + ')');
        }
    }

    final void d(int param0, ge param1) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              var3 = ((uf) this).field_I.j(param0 + -4029);
              var3.b((byte) 111, param1);
              if (var3.d(param0 + -3985)) {
                break L2;
              } else {
                boolean discarded$2 = ((uf) this).field_I.f((byte) 78);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("uf.JB(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void s(byte param0) {
        oh.field_h = false;
        int discarded$0 = 120;
        this.C();
        this.l((byte) -37);
        if (param0 > -23) {
            return;
        }
        try {
            this.r(-14034);
            this.y((byte) -99);
            if (dq.field_a instanceof ul) {
                ((ul) (Object) dq.field_a).a(((uf) this).field_I.j(108).field_I, (byte) -37, ((uf) this).field_I.field_l);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.P(" + param0 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        Object stackIn_23_0 = null;
        int[] stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_25_0 = null;
        Object stackOut_22_0 = null;
        try {
          L0: {
            L1: while (true) {
              if (((uf) this).field_I.a(param0, param5, param2, 359, param3, param1)) {
                stackOut_25_0 = new int[]{param2, param1, param0};
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L2: {
                  var7_int = 1;
                  if (param0 < 96) {
                    var7_int = 0;
                    param0++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: while (true) {
                  L4: {
                    if (param0 * param0 + param1 * param1 <= 9216) {
                      break L4;
                    } else {
                      if (param1 <= 0) {
                        if (param1 >= 0) {
                          var7_int = 1;
                          break L4;
                        } else {
                          param1++;
                          var7_int = 0;
                          continue L3;
                        }
                      } else {
                        var7_int = 0;
                        param1--;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    if (var7_int == 0) {
                      break L5;
                    } else {
                      if (param2 >= 768) {
                        break L5;
                      } else {
                        var7_int = 0;
                        param2++;
                        break L5;
                      }
                    }
                  }
                  if (var7_int == 0) {
                    continue L1;
                  } else {
                    stackOut_22_0 = null;
                    stackIn_23_0 = stackOut_22_0;
                    return (int[]) (Object) stackIn_23_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var7, "uf.LD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 95 + ',' + param5 + ')');
        }
        return stackIn_26_0;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((uf) this).field_I.j(31).field_q != 0) {
              return;
            } else {
              ((uf) this).field_p = param2;
              ((uf) this).field_g = param1;
              var4_int = param2 + -320;
              var5 = -240 + param1;
              var6 = ((uf) this).field_eb.d(8);
              var8 = -var6 * ((double)((uf) this).field_ab[9] * 0.0000152587890625) + 0.0000152587890625 * (double)((uf) this).field_ab[3] * (double)var4_int * -var6 / 512.0 + (double)var5 * ((double)((uf) this).field_ab[6] * 0.0000152587890625) * -var6 / 512.0;
              var10 = -var6 * (0.0000152587890625 * (double)((uf) this).field_ab[10]) + -var6 * (0.0000152587890625 * (double)((uf) this).field_ab[4] * (double)var4_int) / 512.0 + -var6 * (0.0000152587890625 * (double)((uf) this).field_ab[7] * (double)var5) / 512.0;
              L1: {
                var12 = (double)((uf) this).field_ab[8] * 0.0000152587890625 * (double)var5 * -var6 / 512.0 + (-var6 * (0.0000152587890625 * (double)((uf) this).field_ab[11]) + (double)var4_int * ((double)((uf) this).field_ab[5] * 0.0000152587890625) * -var6 / 512.0);
                var14 = (double)(-((float)((uf) this).field_I.field_l[0].field_g / 8192.0f * (float)id.field_c.field_l[9] + (float)id.field_c.field_l[10] * ((float)((uf) this).field_I.field_l[0].field_k / 8192.0f) + (float)id.field_c.field_l[11] * ((float)((uf) this).field_I.field_l[0].field_j / 8192.0f))) * 0.0000152587890625;
                var16 = -((double)(id.field_c.field_l[11] * ((uf) this).field_ab[2]) * 0.0000152587890625 + (0.0000152587890625 * (double)(((uf) this).field_ab[0] * id.field_c.field_l[9]) + var14 + 0.0000152587890625 * (double)(((uf) this).field_ab[1] * id.field_c.field_l[10]))) / (0.0000152587890625 * ((double)id.field_c.field_l[10] * var10 + (double)id.field_c.field_l[9] * var8 + (double)id.field_c.field_l[11] * var12));
                var18 = var8 * var16 + (double)((uf) this).field_ab[0];
                var20 = var10 * var16 + (double)((uf) this).field_ab[1];
                var22 = (double)((uf) this).field_ab[2] + var12 * var16;
                var18 = var18 - (double)((uf) this).field_I.field_l[0].field_g / 8192.0;
                var20 = -((double)((uf) this).field_I.field_l[0].field_k / 8192.0) + var20;
                var22 = -((double)((uf) this).field_I.field_l[0].field_j / 8192.0) + var22;
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.I(" + -119 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        double[][] var4 = null;
        RuntimeException var4_ref = null;
        double[][] stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        double[][] stackOut_9_0 = null;
        double[][] stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              ((uf) this).field_M = param2;
              if (param1 > 1) {
                break L1;
              } else {
                ((uf) this).field_C = -73;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!un.field_b) {
                  break L3;
                } else {
                  if (0 != (hq.field_c & ((uf) this).field_L)) {
                    stackOut_9_0 = f.field_a;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = f.field_c;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            L4: {
              var4 = stackIn_10_0;
              ((uf) this).field_R = -1;
              ((uf) this).field_O.a(var4[param2], (byte) -55);
              if (param0) {
                ((uf) this).field_eb.a(var4[param2], (byte) -106);
                break L4;
              } else {
                break L4;
              }
            }
            ((uf) this).field_D = true;
            this.e(-69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4_ref, "uf.CD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 0) {
                break L1;
              } else {
                param1 = 0;
                break L1;
              }
            }
            L2: {
              if (param1 > 4096) {
                param1 = 4096;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~param1 != ~((uf) this).field_G.field_n) {
                var3_array = this.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_d, ((uf) this).field_G.field_k, param1, (byte) 95, ((uf) this).field_G.field_h);
                if (var3_array == null) {
                  this.m(97);
                  break L3;
                } else {
                  ((uf) this).field_G.field_n = param1;
                  kh.field_gc.b(99, ((uf) this).field_G.field_n);
                  ((uf) this).field_G.field_e = var3_array[2];
                  ((uf) this).field_G.field_d = var3_array[1];
                  ((uf) this).field_G.field_k = var3_array[0];
                  id.field_c.field_g = true;
                  hh.field_c = true;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.UD(" + true + ',' + param1 + ')');
        }
    }

    private final void t(int param0) {
        RuntimeException var2 = null;
        mm stackIn_1_0 = null;
        mm stackIn_2_0 = null;
        mm stackIn_4_0 = null;
        mm stackIn_6_0 = null;
        mm stackIn_7_0 = null;
        double[][] stackIn_7_1 = null;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_0_0 = null;
        mm stackOut_1_0 = null;
        mm stackOut_6_0 = null;
        double[][] stackOut_6_1 = null;
        mm stackOut_2_0 = null;
        mm stackOut_4_0 = null;
        double[][] stackOut_4_1 = null;
        try {
          L0: {
            L1: {
              L2: {
                stackOut_0_0 = ((uf) this).field_O;
                stackIn_4_0 = stackOut_0_0;
                stackIn_1_0 = stackOut_0_0;
                if (!un.field_b) {
                  break L2;
                } else {
                  stackOut_1_0 = (mm) (Object) stackIn_1_0;
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (0 != (((uf) this).field_L & hq.field_c)) {
                    stackOut_6_0 = (mm) (Object) stackIn_6_0;
                    stackOut_6_1 = f.field_a;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_2_0 = (mm) (Object) stackIn_2_0;
                    stackIn_4_0 = stackOut_2_0;
                    break L2;
                  }
                }
              }
              stackOut_4_0 = (mm) (Object) stackIn_4_0;
              stackOut_4_1 = f.field_c;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              break L1;
            }
            ((mm) (Object) stackIn_7_0).a(stackIn_7_1[0], (byte) -117);
            ((uf) this).field_D = true;
            ((uf) this).field_M = 0;
            this.e(-96);
            ((uf) this).field_R = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.HD(" + 0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((uf) this).field_D) {
                ((uf) this).field_eb.a(((uf) this).field_ab, true);
                kh.field_gc.a((byte) -123, ((uf) this).field_ab);
                ((uf) this).field_D = false;
                ((uf) this).field_p = -1;
                ((uf) this).field_g = -1;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -29423) {
              L2: {
                kh.field_gc.a((byte) -55, (uf) this);
                if (((uf) this).field_I.j(param1 + 29476).field_q != 0) {
                  break L2;
                } else {
                  if (0 != ((uf) this).field_e) {
                    break L2;
                  } else {
                    int discarded$4 = 0;
                    this.a();
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
                int discarded$5 = -9449;
                this.G();
                if ((pd.field_i & 4294967296L) == 0L) {
                  int discarded$6 = 121;
                  re.a();
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                int discarded$7 = 1;
                ua.b();
                if (((uf) this).field_I.field_n <= 1) {
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
                          if (wn.field_i < 0) {
                            break L8;
                          } else {
                            if (~(qh.field_l >> 1) >= ~wn.field_i) {
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
                    if (lk.field_u >= 256) {
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
                      qh.a(var7, var8, var9, var10, 8, 4144959, 192 * lk.field_u >> 8);
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
                if (0 == (((uf) this).field_L & sk.field_d)) {
                  break L12;
                } else {
                  ((uf) this).field_c.j(param1 + 29451);
                  break L12;
                }
              }
              L13: {
                if (param0) {
                  var3_int = dp.a(104);
                  if (var3_int < 0) {
                    break L13;
                  } else {
                    if (0 != (256 & var3_int)) {
                      L14: {
                        if ((((uf) this).field_L & sk.field_d) == 0) {
                          break L14;
                        } else {
                          if (((uf) this).field_c.field_h.field_q == null) {
                            break L14;
                          } else {
                            ((uf) this).field_c.field_h.a(15658734, 128, 9750);
                            break L14;
                          }
                        }
                      }
                      pf.a(4144959, 15658734, param1 + 29427, (lr) (Object) sa.field_h, re.field_e[var3_int + -256]);
                      break L13;
                    } else {
                      pf.a(4144959, 15658734, 4, (lr) (Object) sa.field_h, wj.field_S[var3_int]);
                      break L13;
                    }
                  }
                } else {
                  break L13;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.BD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        try {
            ((uf) this).field_I.a(ga.a(512, true, ea.field_r), -1, 0, 0, 19063);
            if (param0 >= -67) {
                this.l((byte) 34);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.TA(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 38) {
                break L1;
              } else {
                ((uf) this).n(48);
                break L1;
              }
            }
            if (0 != ((uf) this).field_I.j(117).field_q) {
              return;
            } else {
              L2: {
                if (!this.b(1, 5, false)) {
                  break L2;
                } else {
                  this.b(true, param1 + ((uf) this).field_G.field_n);
                  this.b(param1 + ((uf) this).field_Q, true);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uf.HE(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        try {
            uo.c(false);
            ((uf) this).field_T = false;
            ((uf) this).field_Q = ((uf) this).field_G.field_n;
            kh.field_gc.a((byte) 124, param0, 9);
            if (param1 >= -100) {
                ((uf) this).field_m = -118;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = qh.field_l - ((65536 + -hc.a(2047, ((uf) this).field_l)) * (1 + il.field_f.field_w) >> 17);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.TB(" + -16439 + ')');
        }
        return stackIn_4_0;
    }

    private final void B() {
        qe var2 = null;
        RuntimeException var2_ref = null;
        oo stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int[] stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        int[] stackIn_1_4 = null;
        oo stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int[] stackIn_3_4 = null;
        oo stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int[] stackIn_4_4 = null;
        int stackIn_4_5 = 0;
        RuntimeException decompiledCaughtException = null;
        oo stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int[] stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        int[] stackOut_0_4 = null;
        oo stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int[] stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int[] stackOut_3_4 = null;
        int stackOut_3_5 = 0;
        oo stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int[] stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        int[] stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        try {
          L0: {
            L1: {
              var2 = ((uf) this).field_I.j(69);
              hh.field_c = true;
              var2.field_q = 1;
              stackOut_0_0 = kh.field_gc;
              stackOut_0_1 = 1336449640;
              stackOut_0_2 = ((uf) this).field_ab;
              stackOut_0_3 = 32 - -(192 * ((uf) this).field_G.field_n / 4096);
              stackOut_0_4 = id.field_c.field_l;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_3_2 = stackOut_0_2;
              stackIn_3_3 = stackOut_0_3;
              stackIn_3_4 = stackOut_0_4;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              if (((uf) this).field_G.field_n > 2048) {
                stackOut_3_0 = (oo) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = (int[]) (Object) stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = (int[]) (Object) stackIn_3_4;
                stackOut_3_5 = 7;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                break L1;
              } else {
                stackOut_1_0 = (oo) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = (int[]) (Object) stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = (int[]) (Object) stackIn_1_4;
                stackOut_1_5 = 8;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                stackIn_4_4 = stackOut_1_4;
                stackIn_4_5 = stackOut_1_5;
                break L1;
              }
            }
            L2: {
              ((oo) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5);
              ((uf) this).field_B = -37;
              ((uf) this).a(true, (byte) -114);
              if (((uf) this).i(-1)) {
                break L2;
              } else {
                ((uf) this).E(-24070);
                break L2;
              }
            }
            vm.field_f = 2147483647 & vm.field_f - -1048576;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2_ref, "uf.RB(" + 17 + ')');
        }
    }

    final static void a(int param0, boolean param1, di param2, di param3, di param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            int discarded$2 = -124;
            nd.b();
            pa.field_I = aa.field_c;
            wd.field_Lb = aa.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("uf.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
        pq var28 = null;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        int[] stackIn_12_0 = null;
        double stackIn_16_0 = 0.0;
        double stackIn_23_0 = 0.0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int[] stackOut_11_0 = null;
        int[] stackOut_9_0 = null;
        double stackOut_15_0 = 0.0;
        double stackOut_13_0 = 0.0;
        double stackOut_22_0 = 0.0;
        double stackOut_20_0 = 0.0;
        int stackOut_27_0 = 0;
        try {
          L0: {
            param2 -= 320;
            var5_int = -240 + param3;
            var6 = ((uf) this).field_ab;
            var7 = (double)((var6[9] << 9) + param2 * var6[3] + var6[6] * var5_int);
            var9 = (double)((var6[10] << 9) - -(var6[4] * param2) - -(var5_int * var6[7]));
            var11 = (double)(var6[8] * var5_int + (var6[5] * param2 + (var6[11] << 9)));
            var13 = Math.sqrt(var9 * var9 + var7 * var7 + var11 * var11);
            var11 = var11 / var13;
            var5_int = -(fl.field_q.field_ib >> 1) + param3;
            var6 = sa.field_m;
            var9 = var9 / var13;
            var7 = var7 / var13;
            var15 = (double)((var6[9] << 9) - -(var6[3] * param2) + var6[6] * var5_int);
            var17 = (double)(var5_int * var6[7] + (var6[4] * param2 + (var6[10] << 9)));
            var19 = (double)(param2 * var6[5] + ((var6[11] << 9) + var6[8] * var5_int));
            var21 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
            var15 = var15 / var21;
            var19 = var19 / var21;
            var17 = var17 / var21;
            var23 = -1.0;
            var25 = -1;
            var26 = 0;
            L1: while (true) {
              if (pd.field_f.length <= var26) {
                stackOut_35_0 = var25;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L2: {
                  var27 = pd.field_f[var26];
                  if (~var27 > ~((uf) this).field_I.field_l.length) {
                    L3: {
                      var28 = ((uf) this).field_I.field_l[var27];
                      if (!var28.field_o) {
                        stackOut_11_0 = ((uf) this).field_ab;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_9_0 = sa.field_m;
                        stackIn_12_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_12_0;
                      var29 = (double)rj.e(-(var28.field_g >> 13) + var6[0], 3);
                      var31 = (double)rj.e(var6[1] - (var28.field_k >> 13), 3);
                      var33 = (double)rj.e(-(var28.field_j >> 13) + var6[2], 3);
                      var35 = var31 * var17 + var15 * var29 + var19 * var33;
                      var37 = var9 * var31 + var7 * var29 + var33 * var11;
                      if (var28.field_o) {
                        stackOut_15_0 = -var35;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_13_0 = -var37;
                        stackIn_16_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    var39 = stackIn_16_0;
                    if (0.0 < var39) {
                      L5: {
                        var41 = var33 * var33 + (var29 * var29 + var31 * var31);
                        if (!var28.field_o) {
                          stackOut_22_0 = var41 + var39 * (var39 + var37 * 2.0);
                          stackIn_23_0 = stackOut_22_0;
                          break L5;
                        } else {
                          stackOut_20_0 = var41 + (var35 * 2.0 + var39) * var39;
                          stackIn_23_0 = stackOut_20_0;
                          break L5;
                        }
                      }
                      var43 = stackIn_23_0;
                      if (var43 > 64.0) {
                        break L2;
                      } else {
                        stackOut_27_0 = var27;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var26++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5, "uf.T(" + false + ',' + true + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_36_0;
    }

    private final void w(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!wb.field_a) {
                  break L2;
                } else {
                  if (fm.field_M >= 10) {
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
                if (~-no.field_q.field_A > ~fm.field_M) {
                  ac.b(-1, (byte) 69);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            tq.field_q = (sa.field_h.field_C + no.field_q.field_y >> 1) + fm.field_M;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.IB(" + 87 + ')');
        }
    }

    private final void A() {
        RuntimeException var2 = null;
        qe var2_ref = null;
        qe var3 = null;
        kj var4 = null;
        oq var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((uf) this).field_I.field_o) {
              return;
            } else {
              if (0 != ((uf) this).field_Q) {
                L1: {
                  if (!((uf) this).i(-1)) {
                    break L1;
                  } else {
                    if (!this.b(1, 7, false)) {
                      break L1;
                    } else {
                      var2_ref = ((uf) this).field_I.j(96);
                      if (var2_ref.field_q >= 1) {
                        return;
                      } else {
                        L2: {
                          ((uf) this).field_G.field_n = ((uf) this).field_Q;
                          ((uf) this).field_j = false;
                          var2_ref.field_s = uk.field_a;
                          var3 = var2_ref;
                          var4 = ((uf) this).field_G;
                          var3.field_C = (short)((1024 + var4.field_h) % 2048);
                          var3.field_V = (short)var4.field_n;
                          var3.field_D = (byte)var4.field_d;
                          var3.field_A = (short)var4.field_k;
                          var3.field_H = (byte)var4.field_e;
                          if ((hq.field_c & ((uf) this).field_L) == 0) {
                            break L2;
                          } else {
                            this.j((byte) -118);
                            ej.field_j.b(false, 65);
                            var3 = var2_ref;
                            var4_ref = ej.field_j;
                            ((ge) (Object) var4_ref).a(var3.field_v, false);
                            ((ge) (Object) var4_ref).a((byte) -81, (int) var3.field_C);
                            ((ge) (Object) var4_ref).a((byte) -81, (int) var3.field_A);
                            ((ge) (Object) var4_ref).a((byte) -81, (int) var3.field_V);
                            ((ge) (Object) var4_ref).a((int) var3.field_D, false);
                            ((ge) (Object) var4_ref).a((int) var3.field_H, false);
                            break L2;
                          }
                        }
                        ((uf) this).field_I.field_i = null;
                        int discarded$1 = 17;
                        this.B();
                        break L1;
                      }
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.Q(" + 1 + ')');
        }
    }

    final static void r() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            cr.a(16, hk.d(122));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "uf.VA(" + -80 + ')');
        }
    }

    private final void x(int param0) {
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_double = 0.0;
            var4 = 0.0;
            var6 = 0L;
            var8 = 0;
            L1: while (true) {
              if (((uf) this).field_I.field_l.length <= var8) {
                L2: {
                  if (var6 > 0L) {
                    ((uf) this).field_R = -1;
                    ((uf) this).field_O.field_m = var4 / (double)var6;
                    ((uf) this).field_O.field_f = var2_double / (double)var6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (!((uf) this).field_I.field_l[var8].field_s) {
                    break L3;
                  } else {
                    if (((uf) this).field_I.field_l[var8].field_v == 0) {
                      break L3;
                    } else {
                      var9 = Math.sqrt((double)(((uf) this).field_I.field_l[0].field_I * ((uf) this).field_I.field_l[0].field_I - -(((uf) this).field_I.field_l[0].field_t * ((uf) this).field_I.field_l[0].field_t)) / 65536.0 / 65536.0);
                      var11 = -1;
                      var12_int = 0;
                      L4: while (true) {
                        if (~((uf) this).field_I.field_w.length >= ~var12_int) {
                          var12 = Math.sqrt((double)var11 / 65536.0) * Math.max(0.0, -0.04998779296875 + var9);
                          var2_double = var2_double + var12 * ((double)((uf) this).field_I.field_l[var8].field_g / 65536.0);
                          var4 = var4 + var12 * ((double)((uf) this).field_I.field_l[var8].field_k / 65536.0);
                          var6 = (long)((double)var6 + var12);
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              var13 = -((uf) this).field_I.field_l[var8].field_g + ((uf) this).field_I.field_w[var12_int].field_g;
                              var14 = ((uf) this).field_I.field_w[var12_int].field_f + -((uf) this).field_I.field_l[var8].field_k;
                              var15 = aj.a(var13, false, var13) - -aj.a(var14, false, var14);
                              if (var11 < 0) {
                                break L6;
                              } else {
                                if (var11 <= var15) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11 = var15;
                            break L5;
                          }
                          var12_int++;
                          continue L4;
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
          throw wm.a((Throwable) (Object) var2, "uf.MB(" + 1 + ')');
        }
    }

    final void c(int param0, ge param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              ((uf) this).field_I.a(param1, (byte) 123);
              if (param0 == 16915) {
                break L1;
              } else {
                this.b(34, false);
                break L1;
              }
            }
            L2: {
              kh.field_gc.b(((uf) this).field_I, 0);
              this.f((byte) 93);
              if ((hq.field_c & ((uf) this).field_L) != 0) {
                break L2;
              } else {
                if (((uf) this).field_I.j(72).field_q != 0) {
                  break L2;
                } else {
                  ((uf) this).s((byte) -74);
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("uf.IA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void a(int param0, ko param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        aa var5 = null;
        qe var6 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            var4_int = -sa.field_h.field_w + qh.field_f;
            var5 = new aa(param1);
            var6 = (qe) (Object) var5.a(0);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var6.field_q >= 3) {
                      sa.field_h.d(var6.a(true), param0, var4_int, 16724787, 1);
                      var4_int = var4_int - 5 * (sa.field_h.field_w + sa.field_h.field_C) / 4;
                      if (sa.field_h.field_C >= var4_int) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6.field_q >= 2) {
                      sa.field_h.d(var6.c(26859), param0, var4_int, 16724787, 1);
                      var4_int = var4_int - (sa.field_h.field_C - -sa.field_h.field_w) * 5 / 4;
                      if (sa.field_h.field_C < var4_int) {
                        break L4;
                      } else {
                        break L2;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (1 <= var6.field_q) {
                        break L6;
                      } else {
                        if (var6.field_V == -1) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6.field_q != 0) {
                        sa.field_h.d(var6.e(0), param0, var4_int, 16750899, 1);
                        break L7;
                      } else {
                        sa.field_h.b(var6.e(0), param0, var4_int, 16750899, 1, 128);
                        break L7;
                      }
                    }
                    var4_int = var4_int - 5 * (sa.field_h.field_C - -sa.field_h.field_w) / 4;
                    if (var4_int <= sa.field_h.field_C) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                  L8: {
                    if (var6.field_q >= 0) {
                      sa.field_h.d(var6.a(1, ((uf) this).field_I), param0, var4_int, 10092339, 1);
                      var4_int = var4_int - (sa.field_h.field_w + sa.field_h.field_C) * 5 / 4;
                      if (~sa.field_h.field_C <= ~var4_int) {
                        break L2;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  var6 = (qe) (Object) var5.c((byte) -71);
                  continue L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("uf.EB(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L9;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 27 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1 = param1 + ((uf) this).field_G.field_k;
              if (512 <= param1) {
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
              if (((uf) this).field_G.field_k != param1) {
                this.b(1, param1);
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
          throw wm.a((Throwable) (Object) runtimeException, "uf.AB(" + 512 + ',' + param1 + ')');
        }
    }

    private final void b(qe param0) {
        RuntimeException var3 = null;
        dn var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_R) {
                break L1;
              } else {
                if (!param0.field_R.c(0)) {
                  var3_ref = (dn) (Object) param0.field_R.c((byte) -54);
                  L2: while (true) {
                    if (var3_ref == null) {
                      break L1;
                    } else {
                      var4 = nr.a(new String[1], -1, e.field_h[var3_ref.field_q]);
                      em.a((byte) 120, false, 1, var4);
                      var3_ref = (dn) (Object) param0.field_R.f((byte) -5);
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("uf.QC(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 93 + ')');
        }
    }

    private final void J(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (vj.field_c[bc.field_f]) {
                  break L2;
                } else {
                  if (!vj.field_c[mb.field_a]) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = -1;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              L4: {
                stackOut_7_0 = stackIn_7_0;
                stackIn_13_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (vj.field_c[gn.field_c]) {
                  break L4;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackIn_13_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (vj.field_c[di.field_b]) {
                    break L4;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackIn_11_0 = stackOut_9_0;
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    break L3;
                  }
                }
              }
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L3;
            }
            L5: {
              var2_int = stackIn_14_0 - -stackIn_14_1;
              if (!vj.field_c[105]) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_15_0 = -1;
                stackIn_18_0 = stackOut_15_0;
                break L5;
              }
            }
            L6: {
              stackOut_18_0 = stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (vj.field_c[104]) {
                stackOut_21_0 = stackIn_21_0;
                stackOut_21_1 = 1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L6;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 0;
                stackIn_22_0 = stackOut_19_0;
                stackIn_22_1 = stackOut_19_1;
                break L6;
              }
            }
            L7: {
              L8: {
                var3 = stackIn_22_0 + stackIn_22_1;
                if (vj.field_c[gp.field_b]) {
                  break L8;
                } else {
                  if (!vj.field_c[fl.field_p]) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              stackOut_26_0 = -1;
              stackIn_29_0 = stackOut_26_0;
              break L7;
            }
            L9: {
              L10: {
                stackOut_29_0 = stackIn_29_0;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (vj.field_c[hm.field_j]) {
                  break L10;
                } else {
                  stackOut_30_0 = stackIn_30_0;
                  stackIn_35_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (!vj.field_c[kr.field_h]) {
                    stackOut_35_0 = stackIn_35_0;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L9;
                  } else {
                    stackOut_31_0 = stackIn_31_0;
                    stackIn_33_0 = stackOut_31_0;
                    break L10;
                  }
                }
              }
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = 1;
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              break L9;
            }
            L11: {
              L12: {
                var4 = stackIn_36_0 - -stackIn_36_1;
                if (param0 != ((uf) this).field_I.j(72).field_q) {
                  break L12;
                } else {
                  if (0 == var2_int) {
                    break L12;
                  } else {
                    if (this.b(1, 4, false)) {
                      ((uf) this).field_A = ((uf) this).field_A - var2_int;
                      this.c(param0 + -69, 2047 & ((uf) this).field_A + ((uf) this).field_G.field_h);
                      hh.field_c = true;
                      id.field_c.field_g = true;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              if (((uf) this).field_A != 0) {
                ((uf) this).field_A = 0;
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              if (0 != ((uf) this).field_I.j(28).field_q) {
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
                if (((uf) this).field_I.j(77).field_q != 0) {
                  break L15;
                } else {
                  if (var4 == 0) {
                    break L15;
                  } else {
                    if (this.b(1, 5, false)) {
                      L16: {
                        if (0 == ((uf) this).field_u) {
                          ((uf) this).field_u = var4 << 16;
                          break L16;
                        } else {
                          ((uf) this).field_u = ((uf) this).field_u + (var4 << 15);
                          break L16;
                        }
                      }
                      L17: {
                        ((uf) this).field_G.field_n = ((uf) this).field_Q;
                        kh.field_gc.b(101, ((uf) this).field_G.field_n);
                        if (((uf) this).field_u >= 0) {
                          ((uf) this).field_h = 75;
                          break L17;
                        } else {
                          ((uf) this).field_h = 0;
                          break L17;
                        }
                      }
                      this.b((byte) 74, -(((uf) this).field_u >> 16));
                      id.field_c.field_g = true;
                      hh.field_c = true;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              if (((uf) this).field_u == 0) {
                break L14;
              } else {
                ((uf) this).field_u = 0;
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.VC(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((uf) this).field_M = -1;
              ((uf) this).field_O.a(105);
              if (param0 == -23095) {
                break L1;
              } else {
                ((uf) this).field_B = 121;
                break L1;
              }
            }
            this.e(param0 ^ 23155);
            ((uf) this).field_R = (int)(((uf) this).field_O.a(true) * 400.0 / 3.141592653589793 / 2.0) % 400;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, qe param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        aa var5 = null;
        ij var5_ref = null;
        cr var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        ij var7_ref_ij = null;
        dl var8 = null;
        int var9 = 0;
        oo stackIn_30_0 = null;
        oo stackIn_32_0 = null;
        oo stackIn_34_0 = null;
        oo stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        oo stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_37_2 = null;
        int stackIn_37_3 = 0;
        int[] stackIn_37_4 = null;
        oo stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int[] stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        int[] stackIn_39_4 = null;
        oo stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        int[] stackIn_41_4 = null;
        oo stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_42_2 = null;
        int stackIn_42_3 = 0;
        int[] stackIn_42_4 = null;
        int stackIn_42_5 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        oo stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_36_2 = null;
        int stackOut_36_3 = 0;
        int[] stackOut_36_4 = null;
        oo stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        int[] stackOut_41_4 = null;
        int stackOut_41_5 = 0;
        oo stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int[] stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        int[] stackOut_37_4 = null;
        oo stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int[] stackOut_39_4 = null;
        int stackOut_39_5 = 0;
        oo stackOut_29_0 = null;
        oo stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        oo stackOut_30_0 = null;
        oo stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if ((pd.field_i & 2048L) == 0L) {
                  break L2;
                } else {
                  if (!((uf) this).field_kb) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((uf) this).field_B >= 0) {
                if (0 != ((uf) this).field_B) {
                  L3: {
                    ((uf) this).field_kb = false;
                    if (param1.field_n == -1) {
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L3;
                    } else {
                      stackOut_56_0 = 1;
                      stackIn_59_0 = stackOut_56_0;
                      break L3;
                    }
                  }
                  L4: {
                    var3_int = stackIn_59_0;
                    var4 = param1.field_t ? 1 : 0;
                    ((uf) this).field_I.g((byte) -126);
                    if (var4 == 0) {
                      L5: {
                        if (var3_int != 0) {
                          break L5;
                        } else {
                          if (param1.field_n != -1) {
                            if (((uf) this).field_I.field_f.c(param1, -110)) {
                              break L5;
                            } else {
                              int discarded$6 = 4;
                              if (!nq.a((byte) 49)) {
                                L6: {
                                  var5_ref = gj.a(true, 4, bq.field_s, (String) null);
                                  var6_array = wm.field_ac[0];
                                  param1.field_t = true;
                                  var5_ref.field_D = new int[]{var6_array[0] >> 13, var6_array[1] >> 13, var6_array[2] >> 13};
                                  var5_ref.field_F = new int[]{var6_array[0] >> 13, var6_array[1] >> 13, var6_array[2] >> 13};
                                  var5_ref.field_p = new int[]{var6_array[0] >> 13, var6_array[1] >> 13, var6_array[2] >> 13};
                                  if ((16711680 & wq.field_c) != 16711680) {
                                    wq.field_c = wq.field_c + 65536;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var5_ref.field_v = 5;
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
                        if (((uf) this).field_I.field_j > 0) {
                          var5 = new aa(param1.field_m);
                          var6 = (cr) (Object) var5.b((byte) -92);
                          L8: while (true) {
                            if (null == var6) {
                              break L7;
                            } else {
                              L9: {
                                if (((uf) this).field_I.field_f.a(var6.field_n, (byte) 9, param1)) {
                                  break L9;
                                } else {
                                  int discarded$7 = 4;
                                  if (nq.a((byte) 95)) {
                                    break L9;
                                  } else {
                                    L10: {
                                      var7_ref_ij = gj.a(true, 4, bq.field_s, (String) null);
                                      var8 = ((uf) this).field_I.field_w[var6.field_r];
                                      if ((16711680 & wq.field_c) != 16711680) {
                                        wq.field_c = wq.field_c + 65536;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    param1.field_t = true;
                                    var7_ref_ij.field_v = 5;
                                    var7_ref_ij.field_D = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                                    var7_ref_ij.field_F = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                                    var7_ref_ij.field_p = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                                    break L7;
                                  }
                                }
                              }
                              var6 = (cr) (Object) var5.b(-126);
                              continue L8;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      if (param1.field_q != 2) {
                        break L4;
                      } else {
                        if (param1.field_n != -1) {
                          break L4;
                        } else {
                          if (param1.field_t) {
                            var5_ref = gj.a(true, 4, bq.field_s, (String) null);
                            var5_ref.field_v = 5;
                            var5_ref.field_D = new int[]{((uf) this).field_I.field_l[0].field_g >> 13, ((uf) this).field_I.field_l[0].field_k >> 13, ((uf) this).field_I.field_l[0].field_j >> 13};
                            var5_ref.field_F = new int[]{((uf) this).field_I.field_l[0].field_g >> 13, ((uf) this).field_I.field_l[0].field_k >> 13, ((uf) this).field_I.field_l[0].field_j >> 13};
                            var5_ref.field_p = new int[]{((uf) this).field_I.field_l[0].field_g >> 13, ((uf) this).field_I.field_l[0].field_k >> 13, ((uf) this).field_I.field_l[0].field_j >> 13};
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
                  L11: {
                    if (((uf) this).field_I.field_j > 0) {
                      var5 = new aa(param1.field_m);
                      var6 = (cr) (Object) var5.a(0);
                      var7 = 0;
                      L12: while (true) {
                        if (var7 >= ((uf) this).field_I.field_j) {
                          break L11;
                        } else {
                          L13: {
                            if (var6.field_n != 0) {
                              vm.field_f = vm.field_f + 65536;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          var6 = (cr) (Object) var5.c((byte) -71);
                          var7++;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  L14: {
                    int discarded$8 = -113;
                    this.t();
                    if ((((uf) this).field_L & sk.field_d) != 0) {
                      break L14;
                    } else {
                      int discarded$9 = -709;
                      this.p();
                      break L14;
                    }
                  }
                  L15: {
                    int discarded$10 = -118;
                    this.c();
                    if (param1.field_q != 2) {
                      break L15;
                    } else {
                      int discarded$11 = -128;
                      this.c(param1);
                      break L15;
                    }
                  }
                  ((uf) this).field_B = ((uf) this).field_B + 1;
                  break L1;
                } else {
                  L16: {
                    ((uf) this).field_f = 57;
                    if (!((uf) this).i(-1)) {
                      L17: {
                        stackOut_36_0 = kh.field_gc;
                        stackOut_36_1 = 1336449640;
                        stackOut_36_2 = ((uf) this).field_ab;
                        stackOut_36_3 = 32 - -(((uf) this).field_G.field_n * 128 / 4096);
                        stackOut_36_4 = id.field_c.field_l;
                        stackIn_41_0 = stackOut_36_0;
                        stackIn_41_1 = stackOut_36_1;
                        stackIn_41_2 = stackOut_36_2;
                        stackIn_41_3 = stackOut_36_3;
                        stackIn_41_4 = stackOut_36_4;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        if (((uf) this).field_G.field_n > 2048) {
                          stackOut_41_0 = (oo) (Object) stackIn_41_0;
                          stackOut_41_1 = stackIn_41_1;
                          stackOut_41_2 = (int[]) (Object) stackIn_41_2;
                          stackOut_41_3 = stackIn_41_3;
                          stackOut_41_4 = (int[]) (Object) stackIn_41_4;
                          stackOut_41_5 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          stackIn_42_2 = stackOut_41_2;
                          stackIn_42_3 = stackOut_41_3;
                          stackIn_42_4 = stackOut_41_4;
                          stackIn_42_5 = stackOut_41_5;
                          break L17;
                        } else {
                          stackOut_37_0 = (oo) (Object) stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = (int[]) (Object) stackIn_37_2;
                          stackOut_37_3 = stackIn_37_3;
                          stackOut_37_4 = (int[]) (Object) stackIn_37_4;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          stackIn_39_3 = stackOut_37_3;
                          stackIn_39_4 = stackOut_37_4;
                          stackOut_39_0 = (oo) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = (int[]) (Object) stackIn_39_2;
                          stackOut_39_3 = stackIn_39_3;
                          stackOut_39_4 = (int[]) (Object) stackIn_39_4;
                          stackOut_39_5 = 1;
                          stackIn_42_0 = stackOut_39_0;
                          stackIn_42_1 = stackOut_39_1;
                          stackIn_42_2 = stackOut_39_2;
                          stackIn_42_3 = stackOut_39_3;
                          stackIn_42_4 = stackOut_39_4;
                          stackIn_42_5 = stackOut_39_5;
                          break L17;
                        }
                      }
                      ((oo) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5);
                      break L16;
                    } else {
                      L18: {
                        stackOut_29_0 = kh.field_gc;
                        stackIn_34_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (((uf) this).field_G.field_n > 2048) {
                          stackOut_34_0 = (oo) (Object) stackIn_34_0;
                          stackOut_34_1 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          break L18;
                        } else {
                          stackOut_30_0 = (oo) (Object) stackIn_30_0;
                          stackIn_32_0 = stackOut_30_0;
                          stackOut_32_0 = (oo) (Object) stackIn_32_0;
                          stackOut_32_1 = 1;
                          stackIn_35_0 = stackOut_32_0;
                          stackIn_35_1 = stackOut_32_1;
                          break L18;
                        }
                      }
                      ((oo) (Object) stackIn_35_0).a(stackIn_35_1, ((uf) this).field_G.field_n * 128 / 4096 + 32, (byte) -115, 128);
                      break L16;
                    }
                  }
                  L19: {
                    ((uf) this).field_I.i((byte) -51);
                    if (!((uf) this).i(-1)) {
                      break L19;
                    } else {
                      ((uf) this).E(-24070);
                      break L19;
                    }
                  }
                  ((uf) this).field_B = ((uf) this).field_B + 1;
                  if ((f.field_f & ((uf) this).field_L) == 0) {
                    break L1;
                  } else {
                    if (((uf) this).field_o == -1) {
                      ((uf) this).field_o = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                if (((uf) this).field_B < -12) {
                  ((uf) this).field_f = (((uf) this).field_B + 37) * ((uf) this).field_G.field_n * 228 / 4096 / 25;
                  id.field_c.field_g = true;
                  ((uf) this).field_B = ((uf) this).field_B + 1;
                  break L1;
                } else {
                  L20: {
                    if ((hq.field_c & ((uf) this).field_L) == 0) {
                      break L20;
                    } else {
                      if (((uf) this).field_j) {
                        break L20;
                      } else {
                        break L1;
                      }
                    }
                  }
                  id.field_c.field_g = true;
                  ((uf) this).field_f = -((uf) this).field_B * ((uf) this).field_G.field_n * 228 / 4096 / 12;
                  ((uf) this).field_B = ((uf) this).field_B + 1;
                  break L1;
                }
              }
            }
            var3_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) var3;
            stackOut_126_1 = new StringBuilder().append("uf.SB(").append(-65).append(',');
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param1 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L21;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L21;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + ')');
        }
    }

    private final void q() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((uf) this).field_I.c((byte) -79);
            id.field_c.field_g = true;
            hh.field_c = true;
            ((uf) this).K(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.EA(" + 114 + ')');
        }
    }

    private final void b(int param0, qe param1) {
        RuntimeException var3 = null;
        af var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ij var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((uf) this).field_I.field_f instanceof af) {
              var3_ref = (af) (Object) ((uf) this).field_I.field_f;
              var4 = dq.field_a.a(var3_ref.f(22533, param1.field_L), (byte) 116);
              var5 = 0;
              var6_int = 0;
              L1: while (true) {
                if (~var6_int <= ~((uf) this).field_I.field_n) {
                  L2: {
                    if (param0 > 114) {
                      break L2;
                    } else {
                      ((uf) this).field_f = 23;
                      break L2;
                    }
                  }
                  var6 = gj.a(true, 10, nr.a(new String[3], -1, this.a(ij.field_A, sd.field_O, of.field_Qb, qq.field_zb, (byte) 61, var5, w.field_c, rj.field_g)), (String) null);
                  var6.field_q = q.field_b;
                  var6.field_r = 5;
                  break L0;
                } else {
                  L3: {
                    if (~((uf) this).field_I.field_f.c(-107, var6_int) != ~((uf) this).field_I.field_f.c(-64, param1.field_L)) {
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("uf.DE(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final void k(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 == (((uf) this).field_L & hq.field_c)) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 <= -89) {
                  break L1;
                } else {
                  ((uf) this).field_F = null;
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
          throw wm.a((Throwable) (Object) var2, "uf.PD(" + param0 + ')');
        }
    }

    private final void s() {
        RuntimeException var2 = null;
        qe var2_ref = null;
        pq var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 == (hq.field_c & ((uf) this).field_L)) {
              if (!((uf) this).field_I.field_o) {
                var2_ref = ((uf) this).field_I.j(29);
                if (var2_ref.field_q != 0) {
                  System.out.println("Can't redo: Shot is waiting.");
                  return;
                } else {
                  if (0 > var2_ref.field_V) {
                    System.out.println("Can't redo: Power less than zero.");
                    return;
                  } else {
                    if (var2_ref.field_V != 0) {
                      L1: {
                        if (-1 == var2_ref.field_P) {
                          break L1;
                        } else {
                          if (var2_ref.field_Q == -1) {
                            break L1;
                          } else {
                            var3 = ((uf) this).field_I.field_l[0];
                            var3.field_p = true;
                            var3.field_g = var2_ref.field_P;
                            var3.field_k = var2_ref.field_Q;
                            System.out.println("moved cueball to " + var2_ref.field_P + "," + var2_ref.field_Q);
                            break L1;
                          }
                        }
                      }
                      ((uf) this).field_G.field_d = var2_ref.field_D;
                      ((uf) this).field_G.field_e = var2_ref.field_H;
                      ((uf) this).field_Q = var2_ref.field_V;
                      ((uf) this).field_G.field_n = var2_ref.field_V;
                      ((uf) this).field_G.field_h = (1024 + var2_ref.field_C) % 2048;
                      ((uf) this).field_G.field_k = var2_ref.field_A;
                      System.out.println("Redoing shot: " + var2_ref.e(0));
                      int discarded$2 = 17;
                      this.B();
                      break L0;
                    } else {
                      this.v(0);
                      return;
                    }
                  }
                }
              } else {
                System.out.println("Can't redo: Game is finished.");
                return;
              }
            } else {
              L2: {
                if (!((uf) this).field_q) {
                  break L2;
                } else {
                  ij discarded$3 = gj.a(true, 0, "Sorry", "Redo not supported for networked multiplayer, you can still dump the state though.");
                  break L2;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.IE(" + 72 + ')');
        }
    }

    private final void d(int param0) {
        qe var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2 = ((uf) this).field_I.j(58);
            if (var2 != null) {
              var3 = var2.field_I;
              if (var3 != -1) {
                var4 = 0;
                L1: while (true) {
                  if (((uf) this).field_I.field_l.length <= var4) {
                    break L0;
                  } else {
                    L2: {
                      if (!((uf) this).field_I.field_l[var4].field_s) {
                        ji.field_b[var4] = 0;
                        no.field_n[var4] = 0;
                        break L2;
                      } else {
                        if (~var4 != ~var3) {
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
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2_ref, "uf.GC(" + 0 + ')');
        }
    }

    private final String e(int param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (null != ((uf) this).field_i[param1]) {
                var3 = ((uf) this).field_i[param1];
                break L1;
              } else {
                ((uf) this).field_i[param1] = ((uf) this).field_I.field_h[param1];
                var3 = ((uf) this).field_I.field_h[param1];
                ((uf) this).field_F[param1] = sa.field_h.b(((uf) this).field_i[param1]);
                break L1;
              }
            }
            stackOut_6_0 = (String) var3;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "uf.PB(" + -30360 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void G() {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0L != (pd.field_i & 4294967296L)) {
                break L1;
              } else {
                if (wn.field_i < 0) {
                  break L1;
                } else {
                  if (0 <= gg.field_f) {
                    L2: {
                      var2_int = this.a(false, true, wn.field_i, gg.field_f);
                      if (!((uf) this).field_T) {
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
                    var3 = dq.field_a.a(var2_int, ((uf) this).field_I.field_f, (byte) -111);
                    er.a(gg.field_f, var3, wn.field_i, 3355443, (lr) (Object) sa.field_h, true, dq.field_a.a(var2_int, true));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.D(" + -9449 + ')');
        }
    }

    final void a(int param0, ge param1) {
        try {
            RuntimeException runtimeException = null;
            qe var3 = null;
            ge var4 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            RuntimeException decompiledCaughtException = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                L1: {
                  var3 = ((uf) this).field_I.j(31);
                  if (var3.field_q == 2) {
                    break L1;
                  } else {
                    L2: {
                      if (!((uf) this).i(-1)) {
                        break L2;
                      } else {
                        if (!((uf) this).field_j) {
                          ((uf) this).field_I.e((byte) 80);
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    tc.a(new Throwable(), "Reading end shot packet before we have finished this shot!", -8555);
                    dn.c(54);
                    return;
                  }
                }
                L3: {
                  var4 = param1;
                  ((uf) this).field_o = var4.d(-1034);
                  if (param0 > 55) {
                    break L3;
                  } else {
                    ((uf) this).field_bb = false;
                    break L3;
                  }
                }
                var3.a((byte) 112, param1);
                this.a(var3, 1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                runtimeException = decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) runtimeException;
                stackOut_15_1 = new StringBuilder().append("uf.GE(").append(param0).append(',');
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if ((((uf) this).field_L & sk.field_d) != 0) {
                if ((1 << param1 & ((uf) this).field_c.field_h.field_o) == 0) {
                  ((uf) this).field_c.b(param0, param1, -28186);
                  break L1;
                } else {
                  ((uf) this).field_c.g(-123);
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              } else {
                break L1;
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.ED(" + param0 + ',' + param1 + ',' + false + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void i() {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (null != ti.field_d) {
                break L1;
              } else {
                if (0 >= ((uf) this).field_o) {
                  break L1;
                } else {
                  if (((uf) this).field_q) {
                    break L1;
                  } else {
                    if (0 == (((uf) this).field_L & f.field_f)) {
                      break L1;
                    } else {
                      if (!((uf) this).field_I.field_m) {
                        break L1;
                      } else {
                        L2: {
                          if (f.field_g > 0) {
                            ti.field_d = new oj(0, 65535, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[1]);
                            break L2;
                          } else {
                            ti.field_d = new oj(1, 65534, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[1]);
                            break L2;
                          }
                        }
                        if (hk.b(77)) {
                          break L1;
                        } else {
                          int discarded$2 = 3;
                          ml.a(25756, ti.field_d);
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
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uf.VB(" + -102 + ')');
        }
    }

    final void p(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_39_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              var2_int = 3 - -f.field_g;
              wq.field_c = wq.field_c & -65536 | (var2_int + (wq.field_c & 65535)) % 31676;
              if (-1 == qi.field_a) {
                break L1;
              } else {
                if (((uf) this).field_q) {
                  break L1;
                } else {
                  if (59 != qi.field_a) {
                    L2: {
                      if (null == uh.field_r) {
                        break L2;
                      } else {
                        if (uh.field_r.field_v >= 30) {
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
                        if (uh.field_r.field_v != 30) {
                          break L3;
                        } else {
                          if (cp.a(uh.field_r.field_t, (byte) -83, 30) == 1099305073022L) {
                            ((uf) this).field_q = true;
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
                stackOut_38_0 = pq.field_B.length + 3;
                stackIn_39_0 = stackOut_38_0;
                break L4;
              } else {
                stackOut_36_0 = 3;
                stackIn_39_0 = stackOut_36_0;
                break L4;
              }
            }
            L5: {
              var2_int = stackIn_39_0;
              var3 = ((uf) this).field_o;
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
            if (qi.field_a == 13) {
              L6: {
                if ((hq.field_c & ((uf) this).field_L) != 0) {
                  if (((uf) this).field_db < 0) {
                    var2_int = 12;
                    break L6;
                  } else {
                    if (((uf) this).field_I.field_o) {
                      var2_int = 11;
                      break L6;
                    } else {
                      var2_int = 10;
                      break L6;
                    }
                  }
                } else {
                  L7: {
                    if ((oj.field_m & ((uf) this).field_L) == 0) {
                      break L7;
                    } else {
                      if (!((uf) this).field_I.field_o) {
                        break L7;
                      } else {
                        var2_int = 9;
                        break L6;
                      }
                    }
                  }
                  if ((((uf) this).field_L & f.field_f) == 0) {
                    if ((((uf) this).field_L & sk.field_d) != 0) {
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
                stackOut_71_0 = -3405;
                stackOut_71_1 = var3;
                stackIn_74_0 = stackOut_71_0;
                stackIn_74_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (mg.a(true)) {
                  stackOut_74_0 = stackIn_74_0;
                  stackOut_74_1 = stackIn_74_1;
                  stackOut_74_2 = 21;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L8;
                } else {
                  stackOut_72_0 = stackIn_72_0;
                  stackOut_72_1 = stackIn_72_1;
                  stackOut_72_2 = 0;
                  stackIn_75_0 = stackOut_72_0;
                  stackIn_75_1 = stackOut_72_1;
                  stackIn_75_2 = stackOut_72_2;
                  break L8;
                }
              }
              fq.a(stackIn_75_0, stackIn_75_1, stackIn_75_2, false);
              le discarded$2 = lg.field_s.a(true, (byte) 106, (java.awt.Component) (Object) vj.a((byte) -100));
              return;
            } else {
              L9: {
                if (oj.c(-62)) {
                  break L9;
                } else {
                  L10: {
                    if (0 == (((uf) this).field_L & hq.field_c)) {
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
                    if (((uf) this).field_q) {
                      if (!sm.d(-18791)) {
                        int discarded$3 = -116;
                        this.n();
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (((uf) this).field_S >= 0) {
                    break L9;
                  } else {
                    var2_int = qi.field_a;
                    if (var2_int != 83) {
                      if (var2_int == 59) {
                        if (((uf) this).field_q) {
                          break L9;
                        } else {
                          if (!((uf) this).field_bb) {
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
                                  ((uf) this).field_q = true;
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
                      if (((uf) this).field_T) {
                        if (this.b(1, 6, false)) {
                          this.t(0);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        if (((uf) this).field_I.j(101).field_q == 1) {
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.TD(" + param0 + ')');
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
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
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "uf.AC(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void r(int param0) {
        RuntimeException var2 = null;
        qe var2_ref = null;
        ij var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (((uf) this).field_I.field_n > 1) {
                if (((uf) this).field_I.j(73).field_k != ((uf) this).field_I.field_u.field_e) {
                  if (((qe) (Object) ((uf) this).field_I.j(85).field_k).field_L != ((uf) this).field_I.field_A) {
                    L2: {
                      var2_ref = (qe) (Object) ((uf) this).field_I.j(53).field_k;
                      if ((sg.field_O & var2_ref.field_s) == 0) {
                        break L2;
                      } else {
                        var3 = gj.a(true, 3, nr.a(new String[1], -1, gr.field_A), (String) null);
                        var3.field_q = qo.field_F;
                        var3.field_r = 5;
                        break L2;
                      }
                    }
                    if (0 == (var2_ref.field_s & nr.field_Y)) {
                      break L1;
                    } else {
                      var3 = gj.a(true, 8, nr.a(new String[1], -1, uo.field_Ob), (String) null);
                      var3.field_q = df.field_f;
                      var3.field_r = 5;
                      break L1;
                    }
                  } else {
                    L3: {
                      L4: {
                        stackOut_7_0 = 1;
                        stackOut_7_1 = 3;
                        stackIn_13_0 = stackOut_7_0;
                        stackIn_13_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (((uf) this).field_I.field_z > 0) {
                          break L4;
                        } else {
                          stackOut_8_0 = stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackIn_15_0 = stackOut_10_0;
                          stackIn_15_1 = stackOut_10_1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          if (0 >= ((uf) this).field_I.field_y) {
                            stackOut_15_0 = stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = this.e(-30360, ((uf) this).field_I.field_A);
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            break L3;
                          } else {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L4;
                          }
                        }
                      }
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = nr.a(new String[1], -1, vp.field_e);
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_16_1 = stackOut_13_1;
                      stackIn_16_2 = stackOut_13_2;
                      break L3;
                    }
                    ij discarded$2 = gj.a(stackIn_16_0 != 0, stackIn_16_1, stackIn_16_2, (String) null);
                    break L1;
                  }
                } else {
                  ij discarded$3 = gj.a(true, 3, this.e(-30360, ((uf) this).field_I.field_A), (String) null);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.RA(" + -14034 + ')');
        }
    }

    private final void y(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = 50 / ((18 - param0) / 54);
            var2_int = ((uf) this).field_I.field_f.a(-1);
            if (var2_int == -1) {
              return;
            } else {
              var4 = 0;
              L1: while (true) {
                if (((uf) this).field_I.field_l.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    if (((uf) this).field_I.field_l[var4].field_s) {
                      if (~var2_int != ~((uf) this).field_I.field_f.b(var4, 30554)) {
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
          throw wm.a((Throwable) (Object) var2, "uf.LC(" + param0 + ')');
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 82) {
              if (((uf) this).field_l <= 0) {
                stackOut_20_0 = -1;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L1: {
                  var2_int = -5 + il.field_f.field_w + -5;
                  var3 = -7 + (il.field_f.field_y - 7);
                  var4 = this.b(-16439) + 5;
                  var5 = (-il.field_f.field_A + fl.field_q.field_ib >> 1) - -7;
                  var6 = wn.field_i - var4;
                  if (var6 < 0) {
                    break L1;
                  } else {
                    if (~var2_int <= ~var6) {
                      L2: {
                        var7 = -var5 + gg.field_f;
                        if (0 > var7) {
                          break L2;
                        } else {
                          if (var3 < var7) {
                            break L2;
                          } else {
                            stackOut_18_0 = this.b(var3, -var7 + var3, (byte) 30);
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0;
                          }
                        }
                      }
                      stackOut_16_0 = -1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              stackOut_1_0 = -58;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.AA(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        qe var3_ref = null;
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
        int stackIn_5_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        try {
          L0: {
            L1: {
              if (-no.field_q.field_A >= fm.field_M) {
                break L1;
              } else {
                L2: {
                  bq.field_n.a(of.field_Ob, fm.field_M, 128);
                  no.field_q.c(of.field_Ob, fm.field_M);
                  var3_ref = ((uf) this).field_I.j(109);
                  if (0 > ((uf) this).field_I.field_A) {
                    stackOut_4_0 = var3_ref.field_L;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_2_0 = ((uf) this).field_I.field_A;
                    stackIn_5_0 = stackOut_2_0;
                    break L2;
                  }
                }
                L3: {
                  var4 = stackIn_5_0;
                  var5 = this.e(-30360, var4);
                  var6 = 16 + of.field_Ob;
                  if (((uf) this).field_I.field_n <= 1) {
                    tk.field_k.field_pb = false;
                    break L3;
                  } else {
                    var6 = this.a(-30818, var6, no.field_q.field_y / 2 + fm.field_M, tk.field_k);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    int discarded$5 = -102;
                    if (this.x()) {
                      break L5;
                    } else {
                      if (((uf) this).field_I.field_f.f(114)) {
                        break L5;
                      } else {
                        if (((uf) this).field_I.field_f instanceof rj) {
                          break L5;
                        } else {
                          sa.field_h.d(var5, var6, tq.field_q, 16777215, 0);
                          var6 = var6 + ((uf) this).field_F[var4];
                          break L4;
                        }
                      }
                    }
                  }
                  int discarded$6 = 2;
                  var7_ref_String = nr.a(new String[1], -1, this.H());
                  sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
                  var6 = var6 + sa.field_h.b(var7_ref_String);
                  break L4;
                }
                L6: {
                  if (!((uf) this).field_I.field_f.f(119)) {
                    break L6;
                  } else {
                    q.field_b.field_hb = ((uf) this).field_I.field_f.b(var3_ref, 1);
                    var6 = this.a(-30818, var6, fm.field_M + no.field_q.field_y / 2, q.field_b);
                    break L6;
                  }
                }
                L7: {
                  if (!(((uf) this).field_I.field_f instanceof rj)) {
                    break L7;
                  } else {
                    var7_ref_String = Integer.toString(((rj) (Object) ((uf) this).field_I.field_f).field_e[var4]);
                    sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
                    var6 = var6 + sa.field_h.b(var7_ref_String);
                    break L7;
                  }
                }
                L8: {
                  if (((uf) this).field_I.field_o) {
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
                      if (0 > ((uf) this).field_I.field_A) {
                        var7_ref_String = no.field_b;
                        break L10;
                      } else {
                        if ((hq.field_c & ((uf) this).field_L) != 0) {
                          L11: {
                            var8_int = ((uf) this).field_I.field_f.b((byte) -121, ((uf) this).field_I.field_f.c(-59, ((uf) this).field_I.field_A));
                            if (se.a(false, var8_int) <= 1) {
                              if (((uf) this).field_I.field_A != ((uf) this).field_db) {
                                var7_ref_String = nr.a(new String[1], -1, ge.field_r);
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
                          if ((f.field_f & ((uf) this).field_L) != 0) {
                            if (((uf) this).field_I.field_m) {
                              var7_ref_String = bc.field_a + "<br>" + lh.b(((uf) this).field_o, (byte) -80);
                              break L10;
                            } else {
                              var7_ref_String = ql.field_b;
                              break L10;
                            }
                          } else {
                            if ((sk.field_d & ((uf) this).field_L) == 0) {
                              var7_ref_String = nr.a(new String[1], -1, ge.field_r);
                              break L10;
                            } else {
                              if ((var3_ref.field_s & ag.field_e) == 0) {
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
                        if (!var7_ref_String.equals((Object) (Object) sa.field_v)) {
                          sa.field_v = var7_ref_String;
                          int discarded$7 = 4;
                          ig.field_i = ic.a(1, true, 320, var7_ref_String);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ig.field_i.c(qh.field_l - ig.field_i.field_z >> 1, 80);
                    if ((f.field_f & ((uf) this).field_L) == 0) {
                      sa.field_h.a((bb[]) (Object) nf.field_Z, bi.field_d);
                      sa.field_h.b(fl.field_m, qh.field_l >> 1, 150, 16777215, 0);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    if (var4 >= 0) {
                      int discarded$8 = this.a(var6, no.field_q.field_y / 2 + fm.field_M, (byte) -51);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L13: {
                  L14: {
                    if (-1 != ((uf) this).field_I.field_q) {
                      break L14;
                    } else {
                      if ((f.field_f & ((uf) this).field_L) != 0) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if ((((uf) this).field_L & f.field_f) != 0) {
                      stackOut_80_0 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      break L15;
                    } else {
                      stackOut_78_0 = 49;
                      stackIn_81_0 = stackOut_78_0;
                      break L15;
                    }
                  }
                  L16: {
                    var7 = (stackIn_81_0 + ((uf) this).field_o) / 50;
                    var9 = -1;
                    if ((((uf) this).field_L & f.field_f) == 0) {
                      var8 = Integer.toString(var7);
                      if (((uf) this).field_o <= 1) {
                        break L16;
                      } else {
                        if (((uf) this).field_o >= 250) {
                          break L16;
                        } else {
                          if (((uf) this).field_I.j(72).field_q == 0) {
                            var9 = (-250 + ((uf) this).field_o << 14) / 50;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    } else {
                      L17: {
                        var10 = 150;
                        var11 = ((uf) this).field_v - -750;
                        if (-1 == ((uf) this).field_v) {
                          break L17;
                        } else {
                          if (var10 > ((uf) this).field_o + -var11) {
                            var9 = (-var11 + ((uf) this).field_o << 14) / 50;
                            var12 = ((uf) this).field_v + (((uf) this).field_o - ((uf) this).field_v) * (((uf) this).field_o - var11) / var10;
                            var7 = (var12 - -49) / 50;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (var7 < 3600) {
                          int discarded$9 = 10;
                          var8 = ek.a(var7 / 60, var7 % 60);
                          break L18;
                        } else {
                          var8 = p.a(var7 / 60 % 60, var7 % 60, 45, var7 / 60 / 60);
                          break L18;
                        }
                      }
                      break L16;
                    }
                  }
                  var8 = nr.a(new String[1], -1, p.field_n);
                  if (var9 == -1) {
                    sa.field_h.d(var8, vk.field_H + 4, tq.field_q, 16777215, 0);
                    break L13;
                  } else {
                    sa.field_h.b(var8, 4 + vk.field_H, tq.field_q, 16777215, 0, (o.a(var9, (byte) -64) >> 11) + 191);
                    break L13;
                  }
                }
                of.a(353, false, (no.field_q.field_y >> 1) + fm.field_M);
                break L1;
              }
            }
            L19: {
              this.b(true);
              if ((hq.field_c & ((uf) this).field_L) == 0) {
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
            this.B(32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.HC(" + true + ',' + param1 + ')');
        }
    }

    private final void A(byte param0) {
        float[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new float[640];
            var3 = mj.a(-31121);
            var4 = mj.a(-31121);
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= 640) {
                int discarded$3 = 8;
                int discarded$4 = 1;
                int discarded$5 = 3;
                sa.field_h.d("audio falloff start=" + re.field_a + " speed=" + k.a((long)ap.field_G) + " (" + ap.field_G + ")" + ", slope=" + ue.field_e, 10, 50, 65280, 3355443);
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
                        ((uf) this).field_N = 27;
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
          throw wm.a((Throwable) (Object) var2_ref, "uf.FB(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (al.field_B[param0] == dq.field_a) {
                break L1;
              } else {
                dq.field_a.e(-26707);
                dq.field_a = al.field_B[param0];
                dq.field_a.a(2147483647, ((uf) this).field_I);
                ((uf) this).K(0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.CB(" + param0 + ',' + -43 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (~((uf) this).field_G.field_d != ~param2) {
                break L1;
              } else {
                if (((uf) this).field_G.field_e == param1) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4_array = this.a(param1, param2, ((uf) this).field_G.field_k, ((uf) this).field_Q, (byte) 95, ((uf) this).field_G.field_h);
            if (null != var4_array) {
              ((uf) this).field_G.field_d = param2;
              ((uf) this).field_G.field_k = var4_array[0];
              ((uf) this).field_G.field_e = var4_array[2];
              ((uf) this).field_G.field_d = var4_array[1];
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            } else {
              this.m(93);
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.WC(" + false + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final String H() {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (gj.field_S != 2) {
                stackOut_6_0 = vl.field_r;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = rc.field_g;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.LB(" + 2 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean h() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        double stackIn_69_0 = 0.0;
        double stackIn_71_0 = 0.0;
        double stackIn_72_0 = 0.0;
        int stackIn_72_1 = 0;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        double stackOut_68_0 = 0.0;
        double stackOut_71_0 = 0.0;
        int stackOut_71_1 = 0;
        double stackOut_69_0 = 0.0;
        int stackOut_69_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (0 == ((uf) this).field_t) {
                ((uf) this).field_t = this.a(9587, ne.field_s, false);
                break L1;
              } else {
                if (this.a(9587, cd.field_b, true) != ((uf) this).field_t) {
                  ((uf) this).field_t = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((uf) this).field_t == 0) {
                break L2;
              } else {
                var2_int = ((uf) this).field_o;
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
            var2_int = 0;
            L3: {
              if (((uf) this).field_N == -1) {
                break L3;
              } else {
                if (((uf) this).field_k != -1) {
                  var5_int = ((uf) this).field_t;
                  if (var5_int != 2) {
                    if (var5_int != 1) {
                      if (4 != var5_int) {
                        if (3 == var5_int) {
                          L4: {
                            var3 = -(-((uf) this).field_N + wn.field_i);
                            ((uf) this).field_R = -1;
                            if (-20 <= var3) {
                              if (-10 <= var3) {
                                if (var3 > 20) {
                                  var3 = var3 * 2 - 10;
                                  break L4;
                                } else {
                                  if (10 < var3) {
                                    var3 = (-20 + var3) * 3 - -30;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              } else {
                                var3 = -10 + 2 * (var3 - -10);
                                break L4;
                              }
                            } else {
                              var3 = 3 * (var3 + 20) + -30;
                              break L4;
                            }
                          }
                          L5: {
                            if (((uf) this).field_N == wn.field_i) {
                              break L5;
                            } else {
                              this.c(-69, ((uf) this).field_G.field_h + var3);
                              break L5;
                            }
                          }
                          L6: {
                            if (~((uf) this).field_k == ~gg.field_f) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_100_0 = this;
                                stackOut_100_1 = 512;
                                stackIn_105_0 = stackOut_100_0;
                                stackIn_105_1 = stackOut_100_1;
                                stackIn_101_0 = stackOut_100_0;
                                stackIn_101_1 = stackOut_100_1;
                                if (th.field_h) {
                                  stackOut_105_0 = this;
                                  stackOut_105_1 = stackIn_105_1;
                                  stackOut_105_2 = -(-gg.field_f + ((uf) this).field_k);
                                  stackIn_106_0 = stackOut_105_0;
                                  stackIn_106_1 = stackOut_105_1;
                                  stackIn_106_2 = stackOut_105_2;
                                  break L7;
                                } else {
                                  stackOut_101_0 = this;
                                  stackOut_101_1 = stackIn_101_1;
                                  stackIn_103_0 = stackOut_101_0;
                                  stackIn_103_1 = stackOut_101_1;
                                  stackOut_103_0 = this;
                                  stackOut_103_1 = stackIn_103_1;
                                  stackOut_103_2 = -gg.field_f + ((uf) this).field_k;
                                  stackIn_106_0 = stackOut_103_0;
                                  stackIn_106_1 = stackOut_103_1;
                                  stackIn_106_2 = stackOut_103_2;
                                  break L7;
                                }
                              }
                              this.f(stackIn_106_1, stackIn_106_2);
                              break L6;
                            }
                          }
                          var2_int = 1;
                          id.field_c.field_g = true;
                          hh.field_c = true;
                          break L3;
                        } else {
                          if (var5_int != 5) {
                            break L3;
                          } else {
                            ((uf) this).field_R = -1;
                            var4 = this.g((byte) 113);
                            if (-1 != var4) {
                              this.b(var4, true);
                              this.b(true, var4);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        ((uf) this).field_R = -1;
                        var2_int = 1;
                        this.b((byte) 86, ((uf) this).field_k + -gg.field_f);
                        break L3;
                      }
                    } else {
                      L8: {
                        L9: {
                          if (((uf) this).field_N != wn.field_i) {
                            break L9;
                          } else {
                            if (gg.field_f == ((uf) this).field_k) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (this.b(1, 0, false)) {
                          L10: {
                            ((uf) this).field_R = -1;
                            var5 = ((uf) this).field_eb.a(true);
                            var7 = ((uf) this).field_eb.a((byte) 116);
                            if (((uf) this).field_k != gg.field_f) {
                              L11: {
                                stackOut_68_0 = var7;
                                stackIn_71_0 = stackOut_68_0;
                                stackIn_69_0 = stackOut_68_0;
                                if (th.field_h) {
                                  stackOut_71_0 = stackIn_71_0;
                                  stackOut_71_1 = -(((uf) this).field_k + -gg.field_f);
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  break L11;
                                } else {
                                  stackOut_69_0 = stackIn_69_0;
                                  stackOut_69_1 = -gg.field_f + ((uf) this).field_k;
                                  stackIn_72_0 = stackOut_69_0;
                                  stackIn_72_1 = stackOut_69_1;
                                  break L11;
                                }
                              }
                              var7 = stackIn_72_0 + (double)stackIn_72_1 * 3.141592653589793 / 2.0 / 480.0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L12: {
                            if (~wn.field_i != ~((uf) this).field_N) {
                              var5 = var5 + 3.141592653589793 * (double)((wn.field_i + -((uf) this).field_N) * 2) / 640.0;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ((uf) this).field_eb.a(var7, 1, var5);
                          ((uf) this).field_O.a(144, ((uf) this).field_eb);
                          ((uf) this).field_D = true;
                          ((uf) this).field_M = -1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var2_int = 1;
                      break L3;
                    }
                  } else {
                    L13: {
                      var2_int = 1;
                      if (~((uf) this).field_N != ~wn.field_i) {
                        break L13;
                      } else {
                        if (~((uf) this).field_k == ~gg.field_f) {
                          break L3;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (this.b(1, 1, false)) {
                      ((uf) this).field_R = -1;
                      var5 = Math.max(12.0, ((uf) this).field_eb.d(8) * ((double)(-((uf) this).field_k + gg.field_f) / 256.0 + 1.0));
                      ((uf) this).field_eb.a(true, var5);
                      ((uf) this).field_O.a(true, var5);
                      ((uf) this).field_M = -1;
                      ((uf) this).field_D = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            if (0 == ((uf) this).field_t) {
              ((uf) this).field_k = -1;
              ((uf) this).field_N = -1;
              stackOut_129_0 = 0;
              stackIn_130_0 = stackOut_129_0;
              break L0;
            } else {
              L14: {
                L15: {
                  if (var2_int == 0) {
                    break L15;
                  } else {
                    if (((uf) this).field_N == -1) {
                      break L15;
                    } else {
                      if (((uf) this).field_k != -1) {
                        le discarded$1 = lg.field_s.a((java.awt.Component) (Object) vj.a((byte) -54), ((uf) this).field_N, -80, ((uf) this).field_k);
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                ((uf) this).field_k = gg.field_f;
                ((uf) this).field_N = wn.field_i;
                break L14;
              }
              stackOut_127_0 = 1;
              stackIn_128_0 = stackOut_127_0;
              return stackIn_128_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.EE(" + 3460 + ')');
        }
        return stackIn_130_0 != 0;
    }

    private final int b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = (int)Math.round((double)param2 * Math.pow((double)param0 / 4096.0, 0.5));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.DA(" + param0 + ',' + 0 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void p() {
        RuntimeException var2 = null;
        int var2_int = 0;
        pq var3 = null;
        or var4 = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        long var6 = 0L;
        int var6_int = 0;
        aa var7 = null;
        long var8 = 0L;
        cr var8_ref_cr = null;
        long var10 = 0L;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= ((uf) this).field_I.field_l.length) {
                  break L2;
                } else {
                  L3: {
                    var3 = ((uf) this).field_I.field_l[var2_int];
                    var4 = var3.field_q;
                    if (null != var4) {
                      if (var4.field_c) {
                        break L3;
                      } else {
                        if (1 == var4.field_n) {
                          var5 = 0;
                          L4: while (true) {
                            if (~((uf) this).field_I.field_w.length >= ~var5) {
                              break L3;
                            } else {
                              var6 = (long)(-((uf) this).field_I.field_w[var5].field_g + var3.field_g);
                              var8 = (long)(-((uf) this).field_I.field_w[var5].field_f + var3.field_k);
                              var10 = var6 * var6 + var8 * var8 >> 16;
                              if (var10 >= 75759616L) {
                                var5++;
                                continue L4;
                              } else {
                                kh.field_gc.a(13, 128, (byte) -101, 128);
                                var3.field_q.field_c = true;
                                var3.field_q = null;
                                break L3;
                              }
                            }
                          }
                        } else {
                          if (var4.field_n == 5) {
                            var5_ref_qe = ((uf) this).field_I.j(123);
                            if (((uf) this).field_I.field_f.a(var5_ref_qe.field_z, (byte) 125, var2_int)) {
                              var6_int = 0;
                              var7 = new aa(var5_ref_qe.field_m);
                              var8_ref_cr = (cr) (Object) var7.b((byte) -92);
                              L5: while (true) {
                                L6: {
                                  if (null == var8_ref_cr) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (var2_int == var8_ref_cr.field_n) {
                                        break L7;
                                      } else {
                                        if (((uf) this).field_I.field_f.a(var5_ref_qe.field_z, (byte) 124, var8_ref_cr.field_n)) {
                                          var6_int = 1;
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var8_ref_cr = (cr) (Object) var7.b(-126);
                                    continue L5;
                                  }
                                }
                                L8: {
                                  if (var5_ref_qe.field_t) {
                                    break L8;
                                  } else {
                                    if (var6_int != 0) {
                                      kh.field_gc.a(12, 128, (byte) -106, 128);
                                      break L8;
                                    } else {
                                      if (kh.field_gc.a(124)) {
                                        break L8;
                                      } else {
                                        kh.field_gc.a(11, 128, (byte) -112, 128);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                var3.field_q.field_c = true;
                                break L2;
                              }
                            } else {
                              kh.field_gc.a(14, 128, (byte) 99, 128);
                              var3.field_q.field_c = true;
                              break L2;
                            }
                          } else {
                            if (0 != var4.field_n) {
                              break L3;
                            } else {
                              var5 = 2;
                              L9: while (true) {
                                L10: {
                                  var4 = var4.field_f;
                                  if (null == var4) {
                                    break L10;
                                  } else {
                                    if (var4.field_c) {
                                      break L10;
                                    } else {
                                      if (var4.a(-5877, ((uf) this).field_I.field_c)) {
                                        var5--;
                                        if (var5 > 0) {
                                          continue L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                if (var5 != 0) {
                                  break L3;
                                } else {
                                  L11: {
                                    if (kh.field_gc.a(84)) {
                                      break L11;
                                    } else {
                                      kh.field_gc.a(13, 128, (byte) 125, 128);
                                      break L11;
                                    }
                                  }
                                  var3.field_q.field_c = true;
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
              L12: {
                if (-709 == -709) {
                  break L12;
                } else {
                  ((uf) this).k((byte) 81);
                  break L12;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.R(" + -709 + ')');
        }
    }

    final void d(int param0, boolean param1) {
        int var3_int = 0;
        float[] var3 = null;
        String var3_ref = null;
        long var3_long = 0L;
        aa var3_ref2 = null;
        bf var4_ref_bf = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
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
        int stackIn_38_0 = 0;
        StringBuilder stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        StringBuilder stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        an stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        an stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        an stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        an stackIn_70_0 = null;
        an stackIn_71_0 = null;
        an stackIn_72_0 = null;
        an stackIn_73_0 = null;
        String stackIn_73_1 = null;
        int stackIn_118_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_140_2 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        int stackIn_142_3 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        int stackIn_143_3 = 0;
        int stackIn_144_0 = 0;
        int stackIn_144_1 = 0;
        int stackIn_144_2 = 0;
        int stackIn_144_3 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        int stackIn_145_3 = 0;
        int stackIn_145_4 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        int stackIn_149_3 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        int stackIn_150_3 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_151_2 = 0;
        int stackIn_151_3 = 0;
        int stackIn_151_4 = 0;
        int stackOut_37_0 = 0;
        StringBuilder stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int stackOut_38_0 = 0;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        an stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        an stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        an stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        an stackOut_69_0 = null;
        an stackOut_72_0 = null;
        String stackOut_72_1 = null;
        an stackOut_70_0 = null;
        an stackOut_71_0 = null;
        String stackOut_71_1 = null;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        int stackOut_141_3 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        int stackOut_140_3 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        int stackOut_142_3 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        int stackOut_144_4 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        int stackOut_143_3 = 0;
        int stackOut_143_4 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        int stackOut_147_3 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        int stackOut_150_3 = 0;
        int stackOut_150_4 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        int stackOut_149_3 = 0;
        int stackOut_149_4 = 0;
        L0: {
          if ((2L & pd.field_i) == 0L) {
            break L0;
          } else {
            cl.a(16751001, param0 ^ 301, ((uf) this).field_ab, new float[3], new float[3]);
            cl.a(10092441, 1, ((uf) this).field_ab, new float[3], new float[3]);
            cl.a(10066431, 1, ((uf) this).field_ab, new float[3], new float[3]);
            break L0;
          }
        }
        L1: {
          if ((pd.field_i & 16L) == 0L) {
            break L1;
          } else {
            if (((uf) this).field_I.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_h, ((uf) this).field_G.field_k, 359, ((uf) this).field_Q, ((uf) this).field_G.field_d)) {
              break L1;
            } else {
              sa.field_h.b("cue intersects something!", 320, 240, 16764142, 1);
              break L1;
            }
          }
        }
        L2: {
          if ((8192L & pd.field_i) != 0L) {
            var3_int = 0;
            L3: while (true) {
              if (var3_int >= ((uf) this).field_I.field_c.length) {
                var3_int = 0;
                L4: while (true) {
                  if (var3_int >= ((uf) this).field_I.field_e.length) {
                    break L2;
                  } else {
                    L5: {
                      var4_ref_int__ = ((uf) this).field_I.field_e[var3_int];
                      var5 = (var4_ref_int__[0] >> 13) + -((uf) this).field_ab[0];
                      var6 = -((uf) this).field_ab[1] + (var4_ref_int__[1] >> 13);
                      var7 = -64 - ((uf) this).field_ab[2];
                      var8 = ((uf) this).field_ab[11] * var7 + ((uf) this).field_ab[10] * var6 + ((uf) this).field_ab[9] * var5 >> 16;
                      if (0 >= var8) {
                        break L5;
                      } else {
                        var9 = (((uf) this).field_ab[4] * var6 + (((uf) this).field_ab[3] * var5 + ((uf) this).field_ab[5] * var7) >> 7) / var8 + 320;
                        var10 = 240 - -((var5 * ((uf) this).field_ab[6] - -(var6 * ((uf) this).field_ab[7]) + var7 * ((uf) this).field_ab[8] >> 7) / var8);
                        if (qh.field_b >= var9) {
                          break L5;
                        } else {
                          if (qh.field_j <= var9) {
                            break L5;
                          } else {
                            if (var10 <= qh.field_c) {
                              break L5;
                            } else {
                              if (~var10 <= ~qh.field_g) {
                                break L5;
                              } else {
                                sa.field_h.d("point " + var3_int, var9, var10, 14522879, 3355443);
                                qh.d(-4 + var9, var10, var9 - -4, var10, 16768409);
                                qh.d(var9, var10 + -4, var9, var10 + 4, 16768409);
                                break L5;
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
                L6: {
                  var4_ref_bf = ((uf) this).field_I.field_c[var3_int];
                  var5 = -((uf) this).field_ab[0] + (var4_ref_bf.field_a - -var4_ref_bf.field_f >> 14);
                  var6 = (var4_ref_bf.field_l + var4_ref_bf.field_j >> 14) - ((uf) this).field_ab[1];
                  var7 = -64 - ((uf) this).field_ab[2];
                  var8 = var6 * ((uf) this).field_ab[10] + var5 * ((uf) this).field_ab[9] - -(var7 * ((uf) this).field_ab[11]) >> 16;
                  if (var8 <= 0) {
                    break L6;
                  } else {
                    var9 = 320 + (((uf) this).field_ab[3] * var5 + (var6 * ((uf) this).field_ab[4] - -(((uf) this).field_ab[5] * var7)) >> 7) / var8;
                    var10 = (var6 * ((uf) this).field_ab[7] + (((uf) this).field_ab[6] * var5 - -(var7 * ((uf) this).field_ab[8])) >> 7) / var8 + 240;
                    if (qh.field_b >= var9) {
                      break L6;
                    } else {
                      if (~var9 <= ~qh.field_j) {
                        break L6;
                      } else {
                        if (~var10 >= ~qh.field_c) {
                          break L6;
                        } else {
                          if (~qh.field_g >= ~var10) {
                            break L6;
                          } else {
                            sa.field_h.b("wall " + var3_int, var9, var10, 16768409, 3355443);
                            qh.d(-4 + var9, var10, var9 + 4, var10, 16768409);
                            qh.d(var9, -4 + var10, var9, var10 - -4, 16768409);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
                var3_int++;
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
        L7: {
          if ((8L & pd.field_i) == 0L) {
            break L7;
          } else {
            var3 = new float[3];
            var4 = -1 + pd.field_f.length;
            L8: while (true) {
              if (var4 < 0) {
                break L7;
              } else {
                L9: {
                  var5 = pd.field_f[var4];
                  if (var5 < ((uf) this).field_I.field_l.length) {
                    L10: {
                      var6_ref_pq = ((uf) this).field_I.field_l[var5];
                      var3[0] = (float)(var6_ref_pq.field_g / 8192);
                      var3[2] = (float)(var6_ref_pq.field_j / 8192);
                      var3[1] = (float)(var6_ref_pq.field_k / 8192);
                      ag.a(((uf) this).field_ab, var3, param0 ^ 293);
                      var7 = (int)(0.5f + var3[0]);
                      var8 = (int)(0.5f + var3[1]);
                      stackOut_37_0 = var8;
                      stackOut_37_1 = new StringBuilder();
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (var6_ref_pq.field_s) {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                        stackOut_39_2 = "in play: ";
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        break L10;
                      } else {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = "potted: ";
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L10;
                      }
                    }
                    L11: {
                      er.a(stackIn_40_0, stackIn_40_2 + var6_ref_pq.b(param0 + -12350), var7, 1, (lr) (Object) sa.field_h, true, 11193599);
                      var8 = var8 - (sa.field_h.field_w + sa.field_h.field_C);
                      if (ap.field_D == null) {
                        break L11;
                      } else {
                        if (ap.field_D[var5] != null) {
                          er.a(var8, "finished: " + ap.field_D[var5].field_o.i(), var7, 1, (lr) (Object) sa.field_h, true, 11193599);
                          var8 = var8 - (sa.field_h.field_C - -sa.field_h.field_w);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    er.a(var8, "@" + var6_ref_pq.field_g + "," + var6_ref_pq.field_k, var7, 1, (lr) (Object) sa.field_h, true, 65535);
                    var8 = var8 - (sa.field_h.field_C - -sa.field_h.field_w);
                    er.a(var8, Integer.toString(var5), var7, 1, (lr) (Object) sa.field_h, true, 11193599);
                    var8 = var8 - (sa.field_h.field_w + sa.field_h.field_C);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var4--;
                continue L8;
              }
            }
          }
        }
        L12: {
          if (0L == (32768L & pd.field_i)) {
            break L12;
          } else {
            sa.field_h.d(kh.field_gc.b((byte) 123), 10, 50, 16772795, 1);
            sa.field_h.d(kh.field_gc.c((byte) 32), 10, 70, 16772795, 1);
            cl.a(16772795, 1, ((uf) this).field_ab, new float[3], new float[3]);
            break L12;
          }
        }
        L13: {
          if ((pd.field_i & 4194304L) == 0L) {
            break L13;
          } else {
            var3_ref = "extra_model_dist=" + hf.field_a + "; extra_model_dist_scatter=" + fl.field_l + "; extra_model_z=" + kh.field_vc + "; num_extra_models=" + ek.field_a;
            sa.field_h.d(var3_ref, 10, 70, 15650047, 1);
            break L13;
          }
        }
        L14: {
          if ((pd.field_i & 65536L) == 0L) {
            break L14;
          } else {
            sa.field_h.d("Generated balls: Segments=" + ne.field_v + ", slices=" + hr.field_b + ", polys/ball=" + ne.field_v * (hr.field_b * 2), 10, 70, 16772795, 1);
            var3_int = -sa.field_h.field_w + 476;
            var4 = 0;
            L15: while (true) {
              if (~var4 <= ~pd.field_f.length) {
                break L14;
              } else {
                sa.field_h.d(var4 + ": " + pd.field_f[var4] + " dist=" + tc.field_d[var4], 300, var3_int, 16772829, 0);
                var3_int = var3_int - 3 * sa.field_h.field_C / 2;
                var4++;
                continue L15;
              }
            }
          }
        }
        L16: {
          if (param0 == 300) {
            break L16;
          } else {
            this.b((byte) -76, 91);
            break L16;
          }
        }
        L17: {
          if ((1L & pd.field_i) == 0L) {
            break L17;
          } else {
            rk.a((byte) 114);
            break L17;
          }
        }
        L18: {
          if (0L != (8192L & pd.field_i)) {
            var3_int = 476 - sa.field_h.field_w;
            sa.field_h.d("currentplayer " + ((uf) this).field_I.field_A + ", extra shots " + ((uf) this).field_I.field_z + ", extra visits " + ((uf) this).field_I.field_y, 300, var3_int, 16772829, 0);
            var3_int = var3_int - sa.field_h.field_C * 3 / 2;
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          if ((2L & pd.field_i) != 0L) {
            L20: {
              var3_int = -4 + -sa.field_h.field_w + 480;
              sa.field_h.d("cur cam ang " + (int)(((uf) this).field_eb.a(true) * 180.0 / 3.141592653589793) + ", " + (int)(180.0 * ((uf) this).field_eb.a((byte) 106) / 3.141592653589793) + ", dist " + ((uf) this).field_eb.d(param0 ^ 292), 300, var3_int, 16772829, 0);
              var3_int = var3_int - 3 * sa.field_h.field_C / 2;
              sa.field_h.d("drag " + ((uf) this).field_t + ", prev=" + ((uf) this).field_N + ", " + ((uf) this).field_k, 300, var3_int, 16772829, 0);
              var3_int = var3_int - 3 * sa.field_h.field_C / 2;
              sa.field_h.d("cur tgt " + ((uf) this).field_eb.field_f / 576.0 + ", " + ((uf) this).field_eb.field_m / 288.0 + ", " + (((uf) this).field_eb.field_k + 8.0) / 512.0, 300, var3_int, 16772829, 0);
              var3_int = var3_int - sa.field_h.field_C * 3 / 2;
              sa.field_h.d("cur pos " + ((uf) this).field_eb.field_d / 576.0 + ", " + ((uf) this).field_eb.field_a / 288.0 + ", " + ((uf) this).field_eb.field_h / 512.0, 300, var3_int, 16772829, 0);
              var3_int = var3_int - 3 * sa.field_h.field_C / 2;
              var4_ref_qe = new qe();
              var5_ref_qe = var4_ref_qe;
              var6_ref_kj = ((uf) this).field_G;
              var5_ref_qe.field_V = (short)var6_ref_kj.field_n;
              var5_ref_qe.field_A = (short)var6_ref_kj.field_k;
              var5_ref_qe.field_H = (byte)var6_ref_kj.field_e;
              var5_ref_qe.field_D = (byte)var6_ref_kj.field_d;
              var5_ref_qe.field_C = (short)((var6_ref_kj.field_h - -1024) % 2048);
              sa.field_h.d(var4_ref_qe.e(param0 + -300), 300, var3_int, 16772829, 0);
              var3_int = var3_int - sa.field_h.field_C * 3 / 2;
              sa.field_h.d("cue ang " + ((uf) this).field_G.field_h + ", " + ((uf) this).field_G.field_k + ", power " + ((uf) this).field_Q + ", loc " + id.field_c.field_l[0] + ",  " + id.field_c.field_l[1] + ", " + id.field_c.field_l[2], 300, var3_int, 16772829, 0);
              var3_int = var3_int - sa.field_h.field_C * 3 / 2;
              stackOut_64_0 = sa.field_h;
              stackOut_64_1 = new StringBuilder().append("shot_camera_strategy  ").append(((uf) this).field_Z);
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              if (((uf) this).field_T) {
                stackOut_66_0 = (an) (Object) stackIn_66_0;
                stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                stackOut_66_2 = " tracking";
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                stackIn_67_2 = stackOut_66_2;
                break L20;
              } else {
                stackOut_65_0 = (an) (Object) stackIn_65_0;
                stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                stackOut_65_2 = "";
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_67_2 = stackOut_65_2;
                break L20;
              }
            }
            ((an) (Object) stackIn_67_0).d(stackIn_67_2, 300, var3_int, 16772829, 0);
            var3_int = var3_int - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("camera_location " + ((uf) this).field_M, 300, var3_int, 16772829, 0);
            break L19;
          } else {
            break L19;
          }
        }
        L21: {
          if ((2048L & pd.field_i) == 0L) {
            break L21;
          } else {
            L22: {
              stackOut_69_0 = sa.field_h;
              stackIn_72_0 = stackOut_69_0;
              stackIn_70_0 = stackOut_69_0;
              if (!((uf) this).field_kb) {
                stackOut_72_0 = (an) (Object) stackIn_72_0;
                stackOut_72_1 = "||";
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                break L22;
              } else {
                stackOut_70_0 = (an) (Object) stackIn_70_0;
                stackIn_71_0 = stackOut_70_0;
                stackOut_71_0 = (an) (Object) stackIn_71_0;
                stackOut_71_1 = "|>";
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                break L22;
              }
            }
            ((an) (Object) stackIn_73_0).d(stackIn_73_1, -(sa.field_h.field_C * 2) + 640, -10 + (480 + (-(2 * sa.field_h.field_w) + -sa.field_h.field_C)), 16777215, 1);
            break L21;
          }
        }
        L23: {
          if ((128L & pd.field_i) == 0L) {
            break L23;
          } else {
            this.h((byte) -28);
            break L23;
          }
        }
        L24: {
          if ((16777216L & pd.field_i) != 0L) {
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
              break L24;
            } else {
              sa.field_h.d("midip: stopped", 10, 380, 13421823, 1118515);
              break L24;
            }
          } else {
            break L24;
          }
        }
        L25: {
          if ((1048576L & pd.field_i) != 0L) {
            var3_int = 320;
            var4 = 40;
            var5 = 0;
            L26: while (true) {
              if (((uf) this).field_I.field_w.length <= var5) {
                break L25;
              } else {
                L27: {
                  var6_ref_tc = ((uf) this).field_I.field_w[var5].field_c;
                  if (null == var6_ref_tc) {
                    break L27;
                  } else {
                    if (var6_ref_tc.a((byte) 122) <= 0) {
                      break L27;
                    } else {
                      var7_ref_String = "pocket " + var5 + ": " + var6_ref_tc.a(0, 2229);
                      var8 = 1;
                      L28: while (true) {
                        if (~var6_ref_tc.a((byte) 112) >= ~var8) {
                          sa.field_h.d(var7_ref_String, var3_int, var4, 10066329, 8947848);
                          var4 = var4 + sa.field_h.field_G;
                          break L27;
                        } else {
                          var7_ref_String = var7_ref_String + ", " + var6_ref_tc.a(var8, param0 + 1929);
                          var8++;
                          continue L28;
                        }
                      }
                    }
                  }
                }
                var5++;
                continue L26;
              }
            }
          } else {
            break L25;
          }
        }
        L29: {
          if ((67108864L & pd.field_i) == 0L) {
            break L29;
          } else {
            var3_int = 60;
            var4 = 0;
            L30: while (true) {
              if (qh.field_f <= var3_int) {
                break L29;
              } else {
                if (~md.field_a.length >= ~var4) {
                  break L29;
                } else {
                  L31: {
                    var5_ref_String = md.field_a[var4];
                    if (!fe.a(oa.field_g, -13671, var4)) {
                      break L31;
                    } else {
                      var5_ref_String = var5_ref_String + " [all]";
                      break L31;
                    }
                  }
                  L32: {
                    if (!fe.a(hp.field_c, -13671, var4)) {
                      break L32;
                    } else {
                      var5_ref_String = var5_ref_String + " [this game]";
                      break L32;
                    }
                  }
                  L33: {
                    if (md.field_a[var4] != var5_ref_String) {
                      sa.field_h.d(var5_ref_String, 40, var3_int, 16764074, 1);
                      var3_int = var3_int + sa.field_h.field_G;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  var4++;
                  continue L30;
                }
              }
            }
          }
        }
        L34: {
          if ((134217728L & pd.field_i) != 0L) {
            var3_ref2 = new aa(((uf) this).field_I.field_u);
            var4_ref_qe = (qe) (Object) var3_ref2.b((byte) -92);
            var5 = 0;
            var6 = 0;
            var7 = 60;
            var8 = 40;
            var9 = 80;
            L35: while (true) {
              L36: {
                if (qh.field_f <= var7) {
                  break L36;
                } else {
                  if (null == var4_ref_qe) {
                    break L36;
                  } else {
                    L37: {
                      if (null != var4_ref_qe.field_U) {
                        L38: {
                          var10 = 0;
                          if ((1 & var4_ref_qe.field_L) != 0) {
                            stackOut_117_0 = var9;
                            stackIn_118_0 = stackOut_117_0;
                            break L38;
                          } else {
                            stackOut_116_0 = var8;
                            stackIn_118_0 = stackOut_116_0;
                            break L38;
                          }
                        }
                        var11 = stackIn_118_0;
                        var12 = 0;
                        L39: while (true) {
                          if (var12 >= var4_ref_qe.field_U.length) {
                            L40: {
                              sa.field_h.d(" =" + var10, var11, var7, 16764074, 1);
                              if ((1 & var4_ref_qe.field_L) == 0) {
                                var5 = var5 + var10;
                                break L40;
                              } else {
                                var6 = var6 + var10;
                                break L40;
                              }
                            }
                            var7 = var7 + sa.field_h.field_G;
                            break L37;
                          } else {
                            var13 = "+" + var4_ref_qe.field_U[var12];
                            sa.field_h.d(var13, var11, var7, 16777215, 1);
                            var11 = var11 + sa.field_h.b(var13);
                            var10 = var10 + var4_ref_qe.field_U[var12];
                            var12++;
                            continue L39;
                          }
                        }
                      } else {
                        break L37;
                      }
                    }
                    var4_ref_qe = (qe) (Object) var3_ref2.b(-96);
                    continue L35;
                  }
                }
              }
              sa.field_h.d("p1=" + var5, var8, var7, 16764074, 1);
              sa.field_h.d("p2=" + var6, var9, var7, 16764074, 1);
              var7 = var7 + sa.field_h.field_G;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L41: {
          if ((pd.field_i & 262144L) != 0L) {
            if (pq.field_i == null) {
              break L41;
            } else {
              int discarded$1 = dn.a(0, param0 + 30109, 3, pq.field_i);
              break L41;
            }
          } else {
            break L41;
          }
        }
        L42: {
          if ((pd.field_i & 16777216L) != 0L) {
            this.A((byte) 95);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          if ((8388608L & pd.field_i) == 0L) {
            break L43;
          } else {
            ((uf) this).field_I.e(12226, 0);
            var3_int = ((uf) this).field_I.field_l[0].field_g >> 13;
            var4 = ((uf) this).field_I.field_l[0].field_k >> 13;
            var5 = 1;
            L44: while (true) {
              if (((uf) this).field_I.field_r.length <= var5) {
                break L43;
              } else {
                L45: {
                  var6_ref_df = ((uf) this).field_I.field_r[var5];
                  if (!var6_ref_df.a((byte) -8, 0, ((uf) this).field_I)) {
                    break L45;
                  } else {
                    L46: {
                      stackOut_138_0 = param0 + -293;
                      stackOut_138_1 = var4;
                      stackOut_138_2 = -64;
                      stackIn_141_0 = stackOut_138_0;
                      stackIn_141_1 = stackOut_138_1;
                      stackIn_141_2 = stackOut_138_2;
                      stackIn_139_0 = stackOut_138_0;
                      stackIn_139_1 = stackOut_138_1;
                      stackIn_139_2 = stackOut_138_2;
                      if (var6_ref_df.field_j) {
                        stackOut_141_0 = stackIn_141_0;
                        stackOut_141_1 = stackIn_141_1;
                        stackOut_141_2 = stackIn_141_2;
                        stackOut_141_3 = 255;
                        stackIn_142_0 = stackOut_141_0;
                        stackIn_142_1 = stackOut_141_1;
                        stackIn_142_2 = stackOut_141_2;
                        stackIn_142_3 = stackOut_141_3;
                        break L46;
                      } else {
                        stackOut_139_0 = stackIn_139_0;
                        stackOut_139_1 = stackIn_139_1;
                        stackOut_139_2 = stackIn_139_2;
                        stackIn_140_0 = stackOut_139_0;
                        stackIn_140_1 = stackOut_139_1;
                        stackIn_140_2 = stackOut_139_2;
                        stackOut_140_0 = stackIn_140_0;
                        stackOut_140_1 = stackIn_140_1;
                        stackOut_140_2 = stackIn_140_2;
                        stackOut_140_3 = 64;
                        stackIn_142_0 = stackOut_140_0;
                        stackIn_142_1 = stackOut_140_1;
                        stackIn_142_2 = stackOut_140_2;
                        stackIn_142_3 = stackOut_140_3;
                        break L46;
                      }
                    }
                    L47: {
                      stackOut_142_0 = stackIn_142_0;
                      stackOut_142_1 = stackIn_142_1;
                      stackOut_142_2 = stackIn_142_2;
                      stackOut_142_3 = stackIn_142_3;
                      stackIn_144_0 = stackOut_142_0;
                      stackIn_144_1 = stackOut_142_1;
                      stackIn_144_2 = stackOut_142_2;
                      stackIn_144_3 = stackOut_142_3;
                      stackIn_143_0 = stackOut_142_0;
                      stackIn_143_1 = stackOut_142_1;
                      stackIn_143_2 = stackOut_142_2;
                      stackIn_143_3 = stackOut_142_3;
                      if (var6_ref_df.field_h) {
                        stackOut_144_0 = stackIn_144_0;
                        stackOut_144_1 = stackIn_144_1;
                        stackOut_144_2 = stackIn_144_2;
                        stackOut_144_3 = stackIn_144_3;
                        stackOut_144_4 = 16727871;
                        stackIn_145_0 = stackOut_144_0;
                        stackIn_145_1 = stackOut_144_1;
                        stackIn_145_2 = stackOut_144_2;
                        stackIn_145_3 = stackOut_144_3;
                        stackIn_145_4 = stackOut_144_4;
                        break L47;
                      } else {
                        stackOut_143_0 = stackIn_143_0;
                        stackOut_143_1 = stackIn_143_1;
                        stackOut_143_2 = stackIn_143_2;
                        stackOut_143_3 = stackIn_143_3;
                        stackOut_143_4 = 4145151;
                        stackIn_145_0 = stackOut_143_0;
                        stackIn_145_1 = stackOut_143_1;
                        stackIn_145_2 = stackOut_143_2;
                        stackIn_145_3 = stackOut_143_3;
                        stackIn_145_4 = stackOut_143_4;
                        break L47;
                      }
                    }
                    L48: {
                      co.a(stackIn_145_0, stackIn_145_1, stackIn_145_2, stackIn_145_3, stackIn_145_4, ((uf) this).field_ab, var3_int + (o.a(var6_ref_df.field_k, (byte) -120) * (var6_ref_df.field_l >> 13) >> 16), -64, (af.c((byte) -128, var6_ref_df.field_k) * (var6_ref_df.field_l >> 13) >> 16) + var4, var3_int);
                      stackOut_145_0 = 7;
                      stackOut_145_1 = var4;
                      stackOut_145_2 = -64;
                      stackIn_147_0 = stackOut_145_0;
                      stackIn_147_1 = stackOut_145_1;
                      stackIn_147_2 = stackOut_145_2;
                      stackIn_146_0 = stackOut_145_0;
                      stackIn_146_1 = stackOut_145_1;
                      stackIn_146_2 = stackOut_145_2;
                      if (!var6_ref_df.field_j) {
                        stackOut_147_0 = stackIn_147_0;
                        stackOut_147_1 = stackIn_147_1;
                        stackOut_147_2 = stackIn_147_2;
                        stackOut_147_3 = 64;
                        stackIn_148_0 = stackOut_147_0;
                        stackIn_148_1 = stackOut_147_1;
                        stackIn_148_2 = stackOut_147_2;
                        stackIn_148_3 = stackOut_147_3;
                        break L48;
                      } else {
                        stackOut_146_0 = stackIn_146_0;
                        stackOut_146_1 = stackIn_146_1;
                        stackOut_146_2 = stackIn_146_2;
                        stackOut_146_3 = 255;
                        stackIn_148_0 = stackOut_146_0;
                        stackIn_148_1 = stackOut_146_1;
                        stackIn_148_2 = stackOut_146_2;
                        stackIn_148_3 = stackOut_146_3;
                        break L48;
                      }
                    }
                    L49: {
                      stackOut_148_0 = stackIn_148_0;
                      stackOut_148_1 = stackIn_148_1;
                      stackOut_148_2 = stackIn_148_2;
                      stackOut_148_3 = stackIn_148_3;
                      stackIn_150_0 = stackOut_148_0;
                      stackIn_150_1 = stackOut_148_1;
                      stackIn_150_2 = stackOut_148_2;
                      stackIn_150_3 = stackOut_148_3;
                      stackIn_149_0 = stackOut_148_0;
                      stackIn_149_1 = stackOut_148_1;
                      stackIn_149_2 = stackOut_148_2;
                      stackIn_149_3 = stackOut_148_3;
                      if (var6_ref_df.field_h) {
                        stackOut_150_0 = stackIn_150_0;
                        stackOut_150_1 = stackIn_150_1;
                        stackOut_150_2 = stackIn_150_2;
                        stackOut_150_3 = stackIn_150_3;
                        stackOut_150_4 = 16744255;
                        stackIn_151_0 = stackOut_150_0;
                        stackIn_151_1 = stackOut_150_1;
                        stackIn_151_2 = stackOut_150_2;
                        stackIn_151_3 = stackOut_150_3;
                        stackIn_151_4 = stackOut_150_4;
                        break L49;
                      } else {
                        stackOut_149_0 = stackIn_149_0;
                        stackOut_149_1 = stackIn_149_1;
                        stackOut_149_2 = stackIn_149_2;
                        stackOut_149_3 = stackIn_149_3;
                        stackOut_149_4 = 4161535;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_151_1 = stackOut_149_1;
                        stackIn_151_2 = stackOut_149_2;
                        stackIn_151_3 = stackOut_149_3;
                        stackIn_151_4 = stackOut_149_4;
                        break L49;
                      }
                    }
                    co.a(stackIn_151_0, stackIn_151_1, stackIn_151_2, stackIn_151_3, stackIn_151_4, ((uf) this).field_ab, (o.a(var6_ref_df.field_d, (byte) 92) * (var6_ref_df.field_l >> 13) >> 16) + var3_int, -64, var4 + (af.c((byte) -128, var6_ref_df.field_d) * (var6_ref_df.field_l >> 13) >> 16), var3_int);
                    break L45;
                  }
                }
                var5++;
                continue L44;
              }
            }
          }
        }
        L50: {
          if ((pd.field_i & 536870912L) == 0L) {
            break L50;
          } else {
            L51: {
              var3_int = 480 + -sa.field_h.field_w - 4;
              if (((uf) this).field_I.field_f instanceof af) {
                var4_ref_af = (af) (Object) ((uf) this).field_I.field_f;
                sa.field_h.d("groups allocations: {" + var4_ref_af.field_g[0] + ", " + var4_ref_af.field_g[1] + "}", 300, var3_int, 16772829, 0);
                var3_int = var3_int - sa.field_h.field_C * 3 / 2;
                break L51;
              } else {
                break L51;
              }
            }
            sa.field_h.d("shot mode: " + ((uf) this).field_T, 300, var3_int, 16772829, 0);
            var3_int = var3_int - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("ruleset: " + ((Object) (Object) ((uf) this).field_I.field_f).getClass().getName(), 300, var3_int, 16772829, 0);
            var3_int = var3_int - sa.field_h.field_C * 3 / 2;
            sa.field_h.d("cg.currentplayer: " + ((uf) this).field_I.field_A, 300, var3_int, 16772829, 0);
            var3_int = var3_int - 3 * sa.field_h.field_C / 2;
            var4 = 0;
            var5 = 0;
            var6 = 3456;
            var7 = 1152;
            var8 = 0;
            L52: while (true) {
              if (var8 >= 2000) {
                break L50;
              } else {
                L53: {
                  var4 += 2048;
                  if (var4 >= 262144) {
                    var5 = var5 + dn.a(67108864 / (var4 >> 8), false);
                    break L53;
                  } else {
                    var5 += 256;
                    break L53;
                  }
                }
                var5 = var5 % 4096;
                var9 = (af.c((byte) -123, var5) >> 4) * (var4 >> 12);
                var10 = (o.a(var5, (byte) -67) >> 4) * (var4 >> 12);
                var11 = 3456 + (var9 >> 13);
                var12 = 1152 + (var10 >> 13);
                bb.a(var12, ((uf) this).field_ab, var6, -28361, 13408614, var11, var7, 0, 0);
                cd.a(var11, var12, ((uf) this).field_ab, 16764057, 10521, 0);
                var7 = var12;
                var6 = var11;
                var8++;
                continue L52;
              }
            }
          }
        }
    }

    private final void u() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((uf) this).field_M = -1;
            ((uf) this).field_O.a((uf) this, 1);
            ((uf) this).field_D = true;
            ((uf) this).field_O.a(true, 1.0);
            ((uf) this).field_T = true;
            uo.c(false);
            ((uf) this).field_G.field_n = ((uf) this).field_Q;
            ((uf) this).field_R = -1;
            kh.field_gc.a(9, 256, (byte) -112, 128);
            kh.field_gc.b(-50, ((uf) this).field_G.field_n);
            ((uf) this).field_h = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.M(" + 117 + ')');
        }
    }

    final void a(int param0, String[] param1, hq param2) {
        al var4 = null;
        RuntimeException var4_ref = null;
        al var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            un.a(676);
            int discarded$1 = -7414;
            vi.a();
            ((uf) this).field_c = param2;
            ((uf) this).field_S = 200;
            ((uf) this).field_c.field_a = (uf) this;
            this.a(param1, ((uf) this).field_c.field_n, -115, -1);
            this.c((byte) -121);
            var4 = ((uf) this).field_I;
            f.field_g = 12;
            var5 = var4;
            pq.field_B = new pq[12][];
            var6 = 0;
            L1: while (true) {
              if (~var6 <= ~pq.field_B.length) {
                rb.field_e = new ar[pq.field_B.length * 12];
                if (param0 > 25) {
                  var6 = 0;
                  L2: while (true) {
                    if (~rb.field_e.length >= ~var6) {
                      wh.field_g = 0;
                      this.c(0, 0, 126);
                      ((uf) this).field_c.a(-1);
                      break L0;
                    } else {
                      rb.field_e[var6] = new ar();
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                pq.field_B[var6] = new pq[var5.field_l.length];
                var7 = 0;
                L3: while (true) {
                  if (~var7 <= ~pq.field_B[var6].length) {
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
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("uf.UC(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    private final void g(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = 0L;
            var4 = 0L;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (~((uf) this).field_I.field_l.length >= ~var7) {
                var7 = 45 % ((-21 - param0) / 58);
                ((uf) this).field_R = -1;
                ((uf) this).field_O.field_f = cr.a((byte) 89, var2_long) / (double)var6;
                ((uf) this).field_O.field_m = cr.a((byte) 89, var4) / (double)var6;
                break L0;
              } else {
                L2: {
                  if (!((uf) this).field_I.field_l[var7].field_s) {
                    break L2;
                  } else {
                    if (((uf) this).field_I.field_l[var7].field_v != 0) {
                      var2_long = var2_long + (long)((uf) this).field_I.field_l[var7].field_g;
                      var4 = var4 + (long)((uf) this).field_I.field_l[var7].field_k;
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
          throw wm.a((Throwable) (Object) var2, "uf.IC(" + param0 + ')');
        }
    }

    private final void d() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ij.field_G > 0) {
                L2: {
                  if (ij.field_G > 25) {
                    uo.c(false);
                    int discarded$5 = 1;
                    int discarded$6 = 0;
                    int discarded$7 = -6;
                    int discarded$8 = 16729156;
                    ui.a(tn.field_p);
                    ij discarded$9 = vj.a((String) null, (byte) 18, jd.field_f, 7);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ij.field_G = ij.field_G - 1;
                if (ij.field_G == 0) {
                  qg.a((byte) 48, 7);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.KC(" + -47 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              id.field_c.field_g = true;
              if (param0 == 0) {
                break L1;
              } else {
                ((uf) this).field_Q = -11;
                break L1;
              }
            }
            hh.field_c = true;
            ((uf) this).field_I.c(param0 ^ -88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.OA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
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
          throw wm.a((Throwable) (Object) var2, "uf.BC(" + param0 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
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
                kh.field_gc.a(((uf) this).field_I, 21894);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              kh.field_gc.b(((uf) this).field_I, 0);
              kh.field_gc.b(false);
              if (al.field_B[param0] == dq.field_a) {
                L4: {
                  if (dq.field_a.field_j == null) {
                    break L4;
                  } else {
                    if (dq.field_a.field_j.length != ((uf) this).field_I.field_l.length) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                dq.field_a.a(2147483647, ((uf) this).field_I);
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
                dq.field_a.a(2147483647, ((uf) this).field_I);
                break L3;
              }
            }
            id.field_c = kh.field_gc.field_A;
            id.field_c.field_g = true;
            kh.field_gc.a((byte) -116, ((uf) this).field_ab);
            ((uf) this).field_I.field_f.c(-83);
            var4_int = 0;
            L6: while (true) {
              if (~((uf) this).field_I.field_l.length >= ~var4_int) {
                L7: {
                  am.field_q = 150;
                  ff.field_c = true;
                  ((uf) this).field_g = -1;
                  id.field_c.field_g = true;
                  hh.field_c = true;
                  wb.field_a = true;
                  if (param2 > 70) {
                    break L7;
                  } else {
                    ((uf) this).field_eb = null;
                    break L7;
                  }
                }
                ((uf) this).field_p = -1;
                ((uf) this).field_D = true;
                int discarded$1 = 0;
                aq.b();
                break L0;
              } else {
                ((uf) this).field_I.field_l[var4_int].a(120);
                ((uf) this).field_I.field_l[var4_int].field_p = true;
                var4_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.CC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String d(int param0, int param1) {
        RuntimeException var3 = null;
        StringBuilder var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        StringBuilder stackIn_23_0 = null;
        StringBuilder stackIn_25_0 = null;
        StringBuilder stackIn_26_0 = null;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_29_0 = null;
        String stackIn_29_1 = null;
        String stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_22_0 = null;
        StringBuilder stackOut_25_0 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        StringBuilder stackOut_26_0 = null;
        String stackOut_26_1 = null;
        StringBuilder stackOut_23_0 = null;
        String stackOut_23_1 = null;
        String stackOut_55_0 = null;
        try {
          L0: {
            L1: {
              var3_ref = new StringBuilder(this.e(-30360, param0));
              var4 = 0;
              if (!(((uf) this).field_I.field_f instanceof rj)) {
                if ((((uf) this).field_I.field_p & 1 << param0) == 0) {
                  break L1;
                } else {
                  L2: {
                    if (var4 != 0) {
                      StringBuilder discarded$19 = var3_ref.append(' ');
                      break L2;
                    } else {
                      var4 = 1;
                      int discarded$20 = 2;
                      var3_ref = new StringBuilder(nr.a(new String[1], -1, this.H()));
                      break L2;
                    }
                  }
                  StringBuilder discarded$21 = var3_ref.append(n.field_Q);
                  break L1;
                }
              } else {
                L3: {
                  var5 = ((rj) (Object) ((uf) this).field_I.field_f).field_e[param0];
                  if (var4 != 0) {
                    StringBuilder discarded$22 = var3_ref.append(' ');
                    break L3;
                  } else {
                    int discarded$23 = 2;
                    var3_ref = new StringBuilder(nr.a(new String[1], -1, this.H()));
                    var4 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (1 >= var5) {
                    StringBuilder discarded$24 = var3_ref.append("<col=ff9999>");
                    break L4;
                  } else {
                    if (var5 == 2) {
                      StringBuilder discarded$25 = var3_ref.append("<col=ffff99>");
                      break L4;
                    } else {
                      if (3 == var5) {
                        StringBuilder discarded$26 = var3_ref.append("<col=99ff99>");
                        break L4;
                      } else {
                        if (var5 <= 3) {
                          break L4;
                        } else {
                          StringBuilder discarded$27 = var3_ref.append("<col=99ffff>");
                          break L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  stackOut_22_0 = (StringBuilder) var3_ref;
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (((uf) this).field_I.field_f.a((byte) 50, param0)) {
                    stackOut_25_0 = (StringBuilder) (Object) stackIn_25_0;
                    stackIn_28_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if ((((uf) this).field_I.field_p & 1 << param0) != 0) {
                      stackOut_28_0 = (StringBuilder) (Object) stackIn_28_0;
                      stackOut_28_1 = n.field_Q;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L5;
                    } else {
                      stackOut_26_0 = (StringBuilder) (Object) stackIn_26_0;
                      stackOut_26_1 = Integer.toString(var5);
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_29_1 = stackOut_26_1;
                      break L5;
                    }
                  } else {
                    stackOut_23_0 = (StringBuilder) (Object) stackIn_23_0;
                    stackOut_23_1 = rg.field_l;
                    stackIn_29_0 = stackOut_23_0;
                    stackIn_29_1 = stackOut_23_1;
                    break L5;
                  }
                }
                StringBuilder discarded$28 = ((StringBuilder) (Object) stackIn_29_0).append(stackIn_29_1);
                StringBuilder discarded$29 = var3_ref.append("</col>");
                break L1;
              }
            }
            L6: {
              L7: {
                if (!((uf) this).field_I.field_o) {
                  break L7;
                } else {
                  if ((1 << param0 & ((uf) this).field_I.field_b) != 0) {
                    L8: {
                      if (var4 != 0) {
                        StringBuilder discarded$30 = var3_ref.append(' ');
                        break L8;
                      } else {
                        int discarded$31 = 2;
                        var3_ref = new StringBuilder(nr.a(new String[1], -1, this.H()));
                        var4 = 1;
                        break L8;
                      }
                    }
                    StringBuilder discarded$32 = var3_ref.append(ge.field_n);
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((((uf) this).field_I.field_x & 1 << param0) == 0) {
                break L6;
              } else {
                L9: {
                  if (var4 == 0) {
                    int discarded$33 = 2;
                    var3_ref = new StringBuilder(nr.a(new String[1], -1, this.H()));
                    var4 = 1;
                    break L9;
                  } else {
                    StringBuilder discarded$34 = var3_ref.append(' ');
                    break L9;
                  }
                }
                StringBuilder discarded$35 = var3_ref.append(sh.field_R);
                break L6;
              }
            }
            stackOut_55_0 = var3_ref.toString();
            stackIn_56_0 = stackOut_55_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.VD(" + param0 + ',' + -22804 + ')');
        }
        return stackIn_56_0;
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            id.field_c.field_g = true;
            hh.field_c = true;
            ((uf) this).field_I.b(param0, 456);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.FD(" + param0 + ',' + false + ')');
        }
    }

    private final void w() {
        RuntimeException var2 = null;
        pq var2_ref = null;
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        al var7 = null;
        pq var8 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_ref = ((uf) this).field_I.field_l[((uf) this).field_V];
                if (~wn.field_i != ~vn.field_b) {
                  break L2;
                } else {
                  if (up.field_m != gg.field_f) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var3 = new double[]{(double)var2_ref.field_g / 65536.0, (double)var2_ref.field_k / 65536.0, (double)var2_ref.field_j / 65536.0};
                boolean discarded$1 = rq.a(-64, gg.field_f, false, ((uf) this).field_eb.d(8), wn.field_i, var3, ((uf) this).field_ab);
                var4 = var2_ref.field_g;
                var5 = var2_ref.field_k;
                if (((uf) this).field_I.a((int)(65536.0 * var3[1] + 0.5), (int)(65536.0 * var3[0] + 0.5), -96, ((uf) this).field_V, true)) {
                  vm.field_f = vm.field_f | ((uf) this).field_V;
                  if (this.b(1, 13, false)) {
                    L4: {
                      var2_ref.field_p = true;
                      hh.field_c = true;
                      var2_ref.field_j = -524288;
                      ((uf) this).field_Y = true;
                      if (((uf) this).field_V != 0) {
                        break L4;
                      } else {
                        id.field_c.field_g = true;
                        break L4;
                      }
                    }
                    var6 = ((uf) this).field_I.j(83);
                    var7 = ((uf) this).field_I;
                    var8 = var7.field_l[0];
                    var6.field_Q = var8.field_k;
                    var6.field_P = var8.field_g;
                    break L3;
                  } else {
                    var2_ref.field_g = var4;
                    var2_ref.field_k = var5;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              vn.field_b = wn.field_i;
              up.field_m = gg.field_f;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.BE(" + 112 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (~param1 <= ~nn.field_b.length) {
                break L1;
              } else {
                if (kh.field_gc == nn.field_b[param1]) {
                  break L1;
                } else {
                  dq.field_a.e(-26707);
                  kh.field_gc.d(true);
                  kh.field_gc = nn.field_b[param1];
                  id.field_c = kh.field_gc.field_A;
                  id.field_c.field_g = true;
                  dq.field_a = al.field_B[param1];
                  dq.field_a.a(2147483647, ((uf) this).field_I);
                  kh.field_gc.a(((uf) this).field_I, 21894);
                  kh.field_gc.a((byte) 115, ((uf) this).field_ab);
                  ((uf) this).field_I.field_f.c(-42);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.SD(" + 124 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (~(((uf) this).field_L & hq.field_c) != param0) {
              L1: {
                if (((uf) this).field_db != ((uf) this).field_I.field_A) {
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
          throw wm.a((Throwable) (Object) var2, "uf.TC(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void a() {
        RuntimeException var2 = null;
        float[] var2_array = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_array = new float[]{(float)((uf) this).field_I.field_l[0].field_g / 65536.0f, (float)((uf) this).field_I.field_l[0].field_k / 65536.0f, (float)((uf) this).field_I.field_l[0].field_j / 65536.0f};
              var3 = (float)((uf) this).field_G.field_d / 128.0f;
              var4 = (float)((uf) this).field_G.field_e / 128.0f;
              var5 = (float)Math.sqrt((double)(-(var3 * var3) + 1.0f - var4 * var4));
              var2_array[1] = var2_array[1] + 8.0f * (var5 * (float)id.field_c.field_l[10] + ((float)id.field_c.field_l[7] * var4 + var3 * (float)id.field_c.field_l[4])) / 65536.0f;
              var2_array[0] = var2_array[0] + 8.0f * (var5 * (float)id.field_c.field_l[9] + (var3 * (float)id.field_c.field_l[3] + var4 * (float)id.field_c.field_l[6])) / 65536.0f;
              var2_array[2] = var2_array[2] + 8.0f * (var4 * (float)id.field_c.field_l[8] + var3 * (float)id.field_c.field_l[5] + (float)id.field_c.field_l[11] * var5) / 65536.0f;
              if (!((uf) this).field_T) {
                break L1;
              } else {
                hr.a(var2_array, 16724787, -114, ((uf) this).field_ab);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.WA(" + false + ')');
        }
    }

    final void K(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (((uf) this).field_I.field_l.length <= var2_int) {
                break L0;
              } else {
                ((uf) this).field_I.field_l[var2_int].field_p = true;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.V(" + param0 + ')');
        }
    }

    private final void m() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            var2_int = -240 + ((uf) this).field_U << 16;
            L1: {
              L2: {
                var3 = 240 + -(fl.field_q.field_ib >> 1);
                var4 = -var3 + ((uf) this).field_U;
                var5 = ((uf) this).field_P - var3;
                if (var5 > gg.field_f) {
                  break L2;
                } else {
                  if (~gg.field_f < ~var4) {
                    break L2;
                  } else {
                    if (wn.field_i >= ((uf) this).field_n) {
                      break L2;
                    } else {
                      ff.field_c = true;
                      am.field_q = 150;
                      break L1;
                    }
                  }
                }
              }
              if (am.field_q <= 0) {
                break L1;
              } else {
                int fieldTemp$1 = am.field_q - 1;
                am.field_q = am.field_q - 1;
                if (fieldTemp$1 == 0) {
                  ff.field_c = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              L4: {
                if (!ff.field_c) {
                  break L4;
                } else {
                  if (t.field_e < 0) {
                    t.field_e = t.field_e + 2;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (ff.field_c) {
                break L3;
              } else {
                if (-((uf) this).field_n >= t.field_e) {
                  break L3;
                } else {
                  t.field_e = t.field_e - 1;
                  break L3;
                }
              }
            }
            var6 = 0;
            L5: while (true) {
              L6: {
                if (~((uf) this).field_C >= ~var6) {
                  break L6;
                } else {
                  var7 = ((uf) this).field_ib[var6];
                  var8 = ((uf) this).field_I.field_l[var7];
                  L7: while (true) {
                    if (!var8.field_s) {
                      L8: {
                        L9: {
                          var8.field_p = true;
                          if (var8.field_v != 0) {
                            break L9;
                          } else {
                            if (~var8.field_k <= ~var2_int) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var8.field_t < 262144) {
                            var8.field_t = var8.field_t + 4096;
                            if (var8.field_v == 0) {
                              var8.field_v = 1;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        var8.a((byte) -124);
                        var8.field_w = 0;
                        var8.a(false);
                        break L8;
                      }
                      L11: {
                        if (~var2_int < ~var8.field_k) {
                          var2_int = var8.field_k;
                          break L11;
                        } else {
                          var8.field_k = var2_int;
                          var8.d((byte) 102);
                          break L11;
                        }
                      }
                      var2_int = var2_int - 1048576;
                      var6++;
                      continue L5;
                    } else {
                      var8.field_o = false;
                      var8.d((byte) 87);
                      var9 = 1 + var6;
                      L12: while (true) {
                        if (var9 >= ((uf) this).field_C) {
                          ((uf) this).field_C = ((uf) this).field_C - 1;
                          if (~((uf) this).field_C == ~var6) {
                            break L6;
                          } else {
                            var7 = ((uf) this).field_ib[var6];
                            var8 = ((uf) this).field_I.field_l[var7];
                            continue L7;
                          }
                        } else {
                          ((uf) this).field_ib[var9 + -1] = ((uf) this).field_ib[var9];
                          var9++;
                          continue L12;
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
          throw wm.a((Throwable) (Object) var2, "uf.UB(" + 127 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_J = null;
            field_y = null;
            field_K = null;
            field_gb = null;
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "uf.KB(" + true + ')');
        }
    }

    private final String[] h(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        String[] stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        String[] stackOut_34_0 = null;
        try {
          L0: {
            L1: {
              if (~((uf) this).field_I.field_f.e(111) == ~((uf) this).field_I.field_n) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_7_0;
              stackOut_7_0 = ((uf) this).field_I.field_n;
              stackIn_10_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var2_int != 0) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = ((uf) this).field_I.field_f.e(119) + -1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                break L2;
              }
            }
            var3 = new String[stackIn_11_0 - -stackIn_11_1];
            var4 = -1;
            var6 = 0;
            var7 = 0;
            L3: while (true) {
              L4: {
                if (var6 >= var3.length) {
                  break L4;
                } else {
                  if (var7 >= ((uf) this).field_I.field_n) {
                    break L4;
                  } else {
                    L5: {
                      if (var2_int != 0) {
                        L6: {
                          var5 = ((uf) this).field_I.field_f.c(-119, var7);
                          if (var4 == -1) {
                            break L6;
                          } else {
                            if (~var5 != ~var4) {
                              int incrementValue$3 = var6;
                              var6++;
                              var3[incrementValue$3] = tp.field_a;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4 = var5;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (~((uf) this).field_I.field_A == ~var7) {
                        int incrementValue$4 = var6;
                        var6++;
                        var3[incrementValue$4] = "<col=9999ff>" + this.d(var7, -22804) + "</col>";
                        break L7;
                      } else {
                        int incrementValue$5 = var6;
                        var6++;
                        var3[incrementValue$5] = this.d(var7, -22804);
                        break L7;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              }
              stackOut_34_0 = (String[]) var3;
              stackIn_35_0 = stackOut_34_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.QA(" + true + ')');
        }
        return stackIn_35_0;
    }

    final void E(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        mm stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        mm stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        mm stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        Object stackIn_9_0 = null;
        mm stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        mm stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        double[][] stackIn_10_3 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        mm stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Object stackOut_4_0 = null;
        mm stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        Object stackOut_9_0 = null;
        mm stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        double[][] stackOut_9_3 = null;
        Object stackOut_5_0 = null;
        mm stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        mm stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        double[][] stackOut_7_3 = null;
        try {
          L0: {
            L1: {
              ((uf) this).field_R = -1;
              if (param0 == -24070) {
                break L1;
              } else {
                this.h((byte) 96);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = this;
                stackOut_3_1 = ((uf) this).field_O;
                stackOut_3_2 = param0 ^ 29962;
                stackIn_7_0 = stackOut_3_0;
                stackIn_7_1 = stackOut_3_1;
                stackIn_7_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (!un.field_b) {
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = (mm) (Object) stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackIn_9_0 = stackOut_4_0;
                  stackIn_9_1 = stackOut_4_1;
                  stackIn_9_2 = stackOut_4_2;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  if ((hq.field_c & ((uf) this).field_L) != 0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = (mm) (Object) stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = f.field_a;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = (mm) (Object) stackIn_5_1;
                    stackOut_5_2 = stackIn_5_2;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L3;
                  }
                }
              }
              stackOut_7_0 = this;
              stackOut_7_1 = (mm) (Object) stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = f.field_c;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              stackIn_10_3 = stackOut_7_3;
              break L2;
            }
            ((uf) this).field_M = ((mm) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3);
            ((uf) this).field_D = true;
            this.e(param0 + 23954);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.GD(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 88) {
                break L1;
              } else {
                ((uf) this).field_eb = null;
                break L1;
              }
            }
            int discarded$2 = 4476;
            this.z();
            ((uf) this).field_C = 0;
            var2_int = 0;
            L2: while (true) {
              if (~var2_int <= ~((uf) this).field_I.field_w.length) {
                break L0;
              } else {
                L3: {
                  var3 = ((uf) this).field_I.field_w[var2_int];
                  if (null == var3.field_c) {
                    break L3;
                  } else {
                    var4 = 0;
                    L4: while (true) {
                      if (~var3.field_c.a((byte) 117) >= ~var4) {
                        break L3;
                      } else {
                        var5 = var3.field_c.a(var4, 2229);
                        ((uf) this).field_I.field_l[var5].field_o = false;
                        ((uf) this).a(0, var5);
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
          throw wm.a((Throwable) (Object) var2, "uf.KA(" + param0 + ')');
        }
    }

    final void o(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 != (hq.field_c & ((uf) this).field_L)) {
              L1: {
                if (param0 <= -15) {
                  break L1;
                } else {
                  ((uf) this).d(63, true);
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
          throw wm.a((Throwable) (Object) var2, "uf.JC(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, vh param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            param3.field_Db = param3.field_hb.field_y;
            param3.field_pb = true;
            param3.field_qb = param1;
            param3.field_eb = -(param3.field_hb.field_y >> 1) + param2;
            param3.field_gb = param3.field_hb.field_w;
            param3.a((byte) -79, false);
            stackOut_3_0 = param1 + param3.field_hb.field_w + 2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("uf.ID(").append(-30818).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void u(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((uf) this).field_T) {
                if (((uf) this).field_l <= 0) {
                  break L1;
                } else {
                  ((uf) this).field_l = ((uf) this).field_l - 64;
                  if (((uf) this).field_l < 0) {
                    ((uf) this).field_l = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (((uf) this).field_l < 1024) {
                  ((uf) this).field_l = ((uf) this).field_l + 64;
                  if (1024 < ((uf) this).field_l) {
                    ((uf) this).field_l = 1024;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            var2_int = -16;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.WB(" + -114 + ')');
        }
    }

    final void z(byte param0) {
        int[] var2 = null;
        try {
            var2 = dq.field_a.b(0, param0 + -1);
            op.a(gd.field_a, 2, ci.field_s, 1, ((uf) this).field_ab, (byte) 1, (var2.length - 1) / 4, var2, op.field_d, param0, kg.field_s);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.SA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 768) {
                param1 = 768;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!((uf) this).field_I.a(((uf) this).field_G.field_e, ((uf) this).field_G.field_h, param1, 359, ((uf) this).field_Q, ((uf) this).field_G.field_d)) {
                break L2;
              } else {
                ((uf) this).field_G.field_k = param1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "uf.DB(" + 1 + ',' + param1 + ')');
        }
    }

    private final void n() {
        int var2_int = 0;
        mm var2 = null;
        ij var2_ref = null;
        int var3 = 0;
        mm var3_ref_mm = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oo stackIn_310_0 = null;
        oo stackIn_311_0 = null;
        oo stackIn_312_0 = null;
        oo stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_314_1 = 0;
        int stackIn_314_2 = 0;
        int stackIn_315_0 = 0;
        int stackIn_315_1 = 0;
        int stackIn_315_2 = 0;
        int stackIn_316_0 = 0;
        int stackIn_316_1 = 0;
        int stackIn_316_2 = 0;
        String stackIn_316_3 = null;
        int stackIn_431_0 = 0;
        int stackIn_436_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_441_0 = 0;
        int stackIn_442_0 = 0;
        int stackIn_443_0 = 0;
        int stackIn_443_1 = 0;
        int stackOut_430_0 = 0;
        int stackOut_429_0 = 0;
        int stackOut_439_0 = 0;
        int stackOut_438_0 = 0;
        int stackOut_440_0 = 0;
        int stackOut_442_0 = 0;
        int stackOut_442_1 = 0;
        int stackOut_441_0 = 0;
        int stackOut_441_1 = 0;
        int stackOut_435_0 = 0;
        int stackOut_434_0 = 0;
        oo stackOut_309_0 = null;
        oo stackOut_312_0 = null;
        int stackOut_312_1 = 0;
        oo stackOut_310_0 = null;
        oo stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        int stackOut_313_0 = 0;
        int stackOut_313_1 = 0;
        int stackOut_313_2 = 0;
        int stackOut_315_0 = 0;
        int stackOut_315_1 = 0;
        int stackOut_315_2 = 0;
        String stackOut_315_3 = null;
        int stackOut_314_0 = 0;
        int stackOut_314_1 = 0;
        int stackOut_314_2 = 0;
        String stackOut_314_3 = null;
        var8 = Pool.field_O;
        L0: {
          if (vj.field_c[82]) {
            if (vj.field_c[81]) {
              var3 = qi.field_a;
              if (var3 != 1) {
                if (var3 == 2) {
                  this.a(1, (byte) -43);
                  break L0;
                } else {
                  if (var3 == 3) {
                    this.a(2, (byte) -43);
                    break L0;
                  } else {
                    if (var3 != 4) {
                      if (var3 != 5) {
                        if (var3 == 6) {
                          this.a(5, (byte) -43);
                          break L0;
                        } else {
                          if (var3 != 7) {
                            if (var3 != 8) {
                              if (var3 == 16) {
                                ij.field_u = ul.field_m;
                                ac.a(256, false, true, ul.field_m);
                                break L0;
                              } else {
                                if (var3 == 17) {
                                  ij.field_u = nn.field_b[0].field_b;
                                  ac.a(256, false, true, nn.field_b[0].field_b);
                                  break L0;
                                } else {
                                  if (var3 != 18) {
                                    if (19 != var3) {
                                      if (var3 == 20) {
                                        ij.field_u = nn.field_b[3].field_b;
                                        ac.a(256, false, true, nn.field_b[3].field_b);
                                        break L0;
                                      } else {
                                        if (21 == var3) {
                                          ij.field_u = nn.field_b[4].field_b;
                                          ac.a(256, false, true, nn.field_b[4].field_b);
                                          break L0;
                                        } else {
                                          if (var3 == 64) {
                                            int discarded$5 = 72;
                                            this.s();
                                            break L0;
                                          } else {
                                            if (var3 != 48) {
                                              if (var3 != 40) {
                                                if (66 != var3) {
                                                  if (var3 != 36) {
                                                    if (var3 != 56) {
                                                      if (39 == var3) {
                                                        this.y((byte) 99);
                                                        break L0;
                                                      } else {
                                                        if (var3 == 70) {
                                                          var2_ref = gj.a(true, 0, "Wowsers, penny!", (String) null);
                                                          var2_ref.field_r = 8;
                                                          var2_ref.field_v = 8;
                                                          break L0;
                                                        } else {
                                                          if (var3 != 69) {
                                                            if (41 != var3) {
                                                              if (49 == var3) {
                                                                break L0;
                                                              } else {
                                                                if (var3 == 53) {
                                                                  L1: {
                                                                    if (wb.field_a) {
                                                                      stackOut_430_0 = 0;
                                                                      stackIn_431_0 = stackOut_430_0;
                                                                      break L1;
                                                                    } else {
                                                                      stackOut_429_0 = 1;
                                                                      stackIn_431_0 = stackOut_429_0;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  wb.field_a = stackIn_431_0 != 0;
                                                                  break L0;
                                                                } else {
                                                                  if (var3 != 54) {
                                                                    if (var3 == 51) {
                                                                      L2: {
                                                                        var3 = ((qe) (Object) ((uf) this).field_I.field_u.c((byte) -52)).field_M;
                                                                        var4 = f.field_g;
                                                                        if (pq.field_B != null) {
                                                                          stackOut_439_0 = pq.field_B.length;
                                                                          stackIn_440_0 = stackOut_439_0;
                                                                          break L2;
                                                                        } else {
                                                                          stackOut_438_0 = 0;
                                                                          stackIn_440_0 = stackOut_438_0;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                      L3: {
                                                                        var5 = stackIn_440_0;
                                                                        var6 = -var4 + var3 + 1465;
                                                                        var7 = var5 + (-var3 + 940);
                                                                        wq.field_c = 39595 + var6 | wq.field_c & -16777216;
                                                                        vm.field_f = vm.field_f & 65280;
                                                                        dk.field_f = var7 + 7621 * var6;
                                                                        field_fb = (var7 << 16) - -998899712;
                                                                        stackOut_440_0 = dk.field_f;
                                                                        stackIn_442_0 = stackOut_440_0;
                                                                        stackIn_441_0 = stackOut_440_0;
                                                                        if (((uf) this).field_o <= 0) {
                                                                          stackOut_442_0 = stackIn_442_0;
                                                                          stackOut_442_1 = 0;
                                                                          stackIn_443_0 = stackOut_442_0;
                                                                          stackIn_443_1 = stackOut_442_1;
                                                                          break L3;
                                                                        } else {
                                                                          stackOut_441_0 = stackIn_441_0;
                                                                          stackOut_441_1 = ((uf) this).field_o;
                                                                          stackIn_443_0 = stackOut_441_0;
                                                                          stackIn_443_1 = stackOut_441_1;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                      dk.field_f = stackIn_443_0 - stackIn_443_1;
                                                                      break L0;
                                                                    } else {
                                                                      if (var3 == 67) {
                                                                        var3 = ((uf) this).field_o;
                                                                        field_fb = 65535 & field_fb | (100 + (field_fb >>> 16)) % 30484 << 16;
                                                                        var4 = var3;
                                                                        var5 = var4 + dk.field_f;
                                                                        var6 = var5 % 7621;
                                                                        var5 = (100 + var6) % 7621 + -var6 + var5;
                                                                        dk.field_f = var5 + -var4;
                                                                        break L0;
                                                                      } else {
                                                                        if (68 == var3) {
                                                                          var3 = ((uf) this).field_o;
                                                                          var4 = var3;
                                                                          var5 = var4 + dk.field_f;
                                                                          var6 = var5 % 7621;
                                                                          var7 = var5 / 7621;
                                                                          var5 = 7621 * ((100 + var7) % 31676) + var6;
                                                                          dk.field_f = var5 + -var4;
                                                                          wq.field_c = -65536 & wq.field_c | ((65535 & wq.field_c) + 100) % 31676;
                                                                          break L0;
                                                                        } else {
                                                                          break L0;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L4: {
                                                                      if (ff.field_c) {
                                                                        stackOut_435_0 = 0;
                                                                        stackIn_436_0 = stackOut_435_0;
                                                                        break L4;
                                                                      } else {
                                                                        stackOut_434_0 = 1;
                                                                        stackIn_436_0 = stackOut_434_0;
                                                                        break L4;
                                                                      }
                                                                    }
                                                                    ff.field_c = stackIn_436_0 != 0;
                                                                    break L0;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              this.f((byte) 99);
                                                              break L0;
                                                            }
                                                          } else {
                                                            em.a((byte) 123, false, 2, "Test message in the ticker!");
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      ((uf) this).field_O.field_a = 144.0;
                                                      ((uf) this).field_O.field_h = -143.19449088;
                                                      ((uf) this).field_O.field_m = 144.0;
                                                      ((uf) this).field_O.field_k = 0.0;
                                                      ((uf) this).field_O.field_f = 379.3516416;
                                                      ((uf) this).field_O.field_d = 718.8717888;
                                                      ((uf) this).field_O.field_k = ((uf) this).field_O.field_k - 8.0;
                                                      break L0;
                                                    }
                                                  } else {
                                                    if (((uf) this).field_c != null) {
                                                      ((uf) this).field_c.a(-1);
                                                      break L0;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  int discarded$6 = -128;
                                                  hi.g();
                                                  break L0;
                                                }
                                              } else {
                                                ((uf) this).a(-23095);
                                                break L0;
                                              }
                                            } else {
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      ij.field_u = nn.field_b[2].field_b;
                                      ac.a(256, false, true, nn.field_b[2].field_b);
                                      break L0;
                                    }
                                  } else {
                                    ij.field_u = nn.field_b[1].field_b;
                                    ac.a(256, false, true, nn.field_b[1].field_b);
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              this.a(7, (byte) -43);
                              break L0;
                            }
                          } else {
                            this.a(6, (byte) -43);
                            break L0;
                          }
                        }
                      } else {
                        this.a(4, (byte) -43);
                        break L0;
                      }
                    } else {
                      this.a(3, (byte) -43);
                      break L0;
                    }
                  }
                }
              } else {
                this.a(0, (byte) -43);
                break L0;
              }
            } else {
              var2_int = qi.field_a;
              if (var2_int != 70) {
                if (var2_int == 40) {
                  ((uf) this).field_Z = (((uf) this).field_Z + 1) % 6;
                  break L0;
                } else {
                  if (var2_int == 1) {
                    this.a((byte) 124, 0);
                    break L0;
                  } else {
                    if (2 != var2_int) {
                      if (var2_int == 3) {
                        this.a((byte) 124, 2);
                        break L0;
                      } else {
                        if (var2_int != 4) {
                          if (5 != var2_int) {
                            if (6 == var2_int) {
                              this.a((byte) 124, 5);
                              break L0;
                            } else {
                              if (var2_int != 7) {
                                if (8 != var2_int) {
                                  if (var2_int != 9) {
                                    if (var2_int == 68) {
                                      ((uf) this).K(0);
                                      break L0;
                                    } else {
                                      if (var2_int != 69) {
                                        if (var2_int != 50) {
                                          if (var2_int == 71) {
                                            if ((hq.field_c & ((uf) this).field_L) != 0) {
                                              break L0;
                                            } else {
                                              ((uf) this).field_o = ((uf) this).field_o - 1000;
                                              break L0;
                                            }
                                          } else {
                                            if (var2_int != 72) {
                                              if (var2_int == 51) {
                                                break L0;
                                              } else {
                                                if (52 == var2_int) {
                                                  break L0;
                                                } else {
                                                  if (var2_int == 67) {
                                                    ((uf) this).field_I.e(12226, 0);
                                                    break L0;
                                                  } else {
                                                    if (var2_int != 59) {
                                                      if (41 == var2_int) {
                                                        hh.field_c = true;
                                                        break L0;
                                                      } else {
                                                        if (var2_int != 38) {
                                                          if (39 == var2_int) {
                                                            break L0;
                                                          } else {
                                                            if (var2_int != 32) {
                                                              if (64 != var2_int) {
                                                                if (var2_int == 49) {
                                                                  li.a(2243, ((uf) this).field_I);
                                                                  break L0;
                                                                } else {
                                                                  if (var2_int != 56) {
                                                                    if (36 != var2_int) {
                                                                      if (var2_int == 35) {
                                                                        ((uf) this).field_I.e(-54);
                                                                        this.a(1 + ga.a(512, true, ea.field_r), false);
                                                                        if (((uf) this).field_I.field_f instanceof af) {
                                                                          ((uf) this).field_I.field_f = (sq) (Object) new af(((uf) this).field_I);
                                                                          break L0;
                                                                        } else {
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      if ((((uf) this).field_L & sk.field_d) == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        ((uf) this).field_c.a(-1);
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                int discarded$7 = 114;
                                                                this.q();
                                                                break L0;
                                                              }
                                                            } else {
                                                              L5: {
                                                                stackOut_309_0 = kh.field_gc;
                                                                stackIn_312_0 = stackOut_309_0;
                                                                stackIn_310_0 = stackOut_309_0;
                                                                if (kh.field_gc.field_h) {
                                                                  stackOut_312_0 = (oo) (Object) stackIn_312_0;
                                                                  stackOut_312_1 = 0;
                                                                  stackIn_313_0 = stackOut_312_0;
                                                                  stackIn_313_1 = stackOut_312_1;
                                                                  break L5;
                                                                } else {
                                                                  stackOut_310_0 = (oo) (Object) stackIn_310_0;
                                                                  stackIn_311_0 = stackOut_310_0;
                                                                  stackOut_311_0 = (oo) (Object) stackIn_311_0;
                                                                  stackOut_311_1 = 1;
                                                                  stackIn_313_0 = stackOut_311_0;
                                                                  stackIn_313_1 = stackOut_311_1;
                                                                  break L5;
                                                                }
                                                              }
                                                              L6: {
                                                                stackIn_313_0.field_h = stackIn_313_1 != 0;
                                                                stackOut_313_0 = 122;
                                                                stackOut_313_1 = 0;
                                                                stackOut_313_2 = 1;
                                                                stackIn_315_0 = stackOut_313_0;
                                                                stackIn_315_1 = stackOut_313_1;
                                                                stackIn_315_2 = stackOut_313_2;
                                                                stackIn_314_0 = stackOut_313_0;
                                                                stackIn_314_1 = stackOut_313_1;
                                                                stackIn_314_2 = stackOut_313_2;
                                                                if (!kh.field_gc.field_h) {
                                                                  stackOut_315_0 = stackIn_315_0;
                                                                  stackOut_315_1 = stackIn_315_1;
                                                                  stackOut_315_2 = stackIn_315_2;
                                                                  stackOut_315_3 = "Linear sorting";
                                                                  stackIn_316_0 = stackOut_315_0;
                                                                  stackIn_316_1 = stackOut_315_1;
                                                                  stackIn_316_2 = stackOut_315_2;
                                                                  stackIn_316_3 = stackOut_315_3;
                                                                  break L6;
                                                                } else {
                                                                  stackOut_314_0 = stackIn_314_0;
                                                                  stackOut_314_1 = stackIn_314_1;
                                                                  stackOut_314_2 = stackIn_314_2;
                                                                  stackOut_314_3 = "Radial sorting";
                                                                  stackIn_316_0 = stackOut_314_0;
                                                                  stackIn_316_1 = stackOut_314_1;
                                                                  stackIn_316_2 = stackOut_314_2;
                                                                  stackIn_316_3 = stackOut_314_3;
                                                                  break L6;
                                                                }
                                                              }
                                                              em.a((byte) stackIn_316_0, stackIn_316_1 != 0, stackIn_316_2, stackIn_316_3);
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          break L0;
                                                        }
                                                      }
                                                    } else {
                                                      dq.field_a.a(7096);
                                                      dq.field_a.a(2147483647, ((uf) this).field_I);
                                                      kh.field_gc.i(25879);
                                                      kh.field_gc.a(((uf) this).field_I, 21894);
                                                      kh.field_gc.a((byte) -128, ((uf) this).field_ab);
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              if ((hq.field_c & ((uf) this).field_L) != 0) {
                                                break L0;
                                              } else {
                                                ((uf) this).field_o = ((uf) this).field_o + 1000;
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          ((uf) this).field_I.k(0);
                                          break L0;
                                        }
                                      } else {
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.a((byte) 124, 8);
                                    break L0;
                                  }
                                } else {
                                  this.a((byte) 124, 7);
                                  break L0;
                                }
                              } else {
                                this.a((byte) 124, 6);
                                break L0;
                              }
                            }
                          } else {
                            this.a((byte) 124, 4);
                            break L0;
                          }
                        } else {
                          this.a((byte) 124, 3);
                          break L0;
                        }
                      }
                    } else {
                      this.a((byte) 124, 1);
                      break L0;
                    }
                  }
                }
              } else {
                int discarded$8 = 17;
                this.y();
                break L0;
              }
            }
          } else {
            if (!vj.field_c[86]) {
              var4 = qi.field_a;
              if (16 == var4) {
                this.b(vj.field_c[82], 6, 0);
                break L0;
              } else {
                if (17 == var4) {
                  this.b(vj.field_c[82], 115, 1);
                  break L0;
                } else {
                  if (18 != var4) {
                    if (var4 != 19) {
                      if (20 == var4) {
                        this.b(vj.field_c[82], 100, 4);
                        break L0;
                      } else {
                        if (var4 != 21) {
                          if (var4 != 22) {
                            if (var4 != 23) {
                              if (var4 != 24) {
                                if (var4 == 25) {
                                  this.b(vj.field_c[82], 106, 9);
                                  break L0;
                                } else {
                                  if (var4 == 26) {
                                    this.b(vj.field_c[82], 99, 10);
                                    break L0;
                                  } else {
                                    if (var4 == 43) {
                                      ((uf) this).field_kb = true;
                                      break L0;
                                    } else {
                                      if (var4 != 85) {
                                        if (var4 == 64) {
                                          ((uf) this).field_eb.field_d = ((uf) this).field_eb.field_f;
                                          ((uf) this).field_O.a(144, ((uf) this).field_eb);
                                          ((uf) this).field_D = true;
                                          break L0;
                                        } else {
                                          if (var4 == 65) {
                                            ((uf) this).field_eb.field_a = ((uf) this).field_eb.field_m;
                                            ((uf) this).field_O.a(144, ((uf) this).field_eb);
                                            ((uf) this).field_D = true;
                                            break L0;
                                          } else {
                                            if (var4 == 66) {
                                              ((uf) this).field_eb.field_f = 288.0;
                                              var2 = ((uf) this).field_eb;
                                              var2.field_d = 288.0;
                                              ((uf) this).field_O.a(144, ((uf) this).field_eb);
                                              ((uf) this).field_D = true;
                                              break L0;
                                            } else {
                                              if (67 != var4) {
                                                break L0;
                                              } else {
                                                var3_ref_mm = ((uf) this).field_eb;
                                                ((uf) this).field_eb.field_m = 144.0;
                                                var3_ref_mm.field_a = 144.0;
                                                ((uf) this).field_O.a(144, ((uf) this).field_eb);
                                                ((uf) this).field_D = true;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        ((uf) this).field_I.e(-51);
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.b(vj.field_c[82], 33, 8);
                                break L0;
                              }
                            } else {
                              this.b(vj.field_c[82], 19, 7);
                              break L0;
                            }
                          } else {
                            this.b(vj.field_c[82], 42, 6);
                            break L0;
                          }
                        } else {
                          this.b(vj.field_c[82], 78, 5);
                          break L0;
                        }
                      }
                    } else {
                      this.b(vj.field_c[82], 56, 3);
                      break L0;
                    }
                  } else {
                    this.b(vj.field_c[82], 14, 2);
                    break L0;
                  }
                }
              }
            } else {
              var2_int = qi.field_a;
              if (var2_int == 32) {
                if (vj.field_c[81]) {
                  kh.field_gc.field_d = kh.field_gc.field_d + 1;
                  ((uf) this).K(0);
                  break L0;
                } else {
                  kh.field_gc.field_C = kh.field_gc.field_C + 1;
                  break L0;
                }
              } else {
                if (var2_int != 48) {
                  if (var2_int != 33) {
                    if (49 == var2_int) {
                      if (!vj.field_c[81]) {
                        kh.field_gc.field_x = kh.field_gc.field_x - 1;
                        break L0;
                      } else {
                        kh.field_gc.field_m = kh.field_gc.field_m - 1;
                        ((uf) this).K(0);
                        break L0;
                      }
                    } else {
                      if (var2_int != 34) {
                        if (var2_int == 50) {
                          kh.field_gc.field_j = kh.field_gc.field_j - 0.04908738521234052;
                          break L0;
                        } else {
                          if (var2_int == 35) {
                            kh.field_gc.field_p = kh.field_gc.field_p + 0.04908738521234052;
                            break L0;
                          } else {
                            if (var2_int == 51) {
                              kh.field_gc.field_p = kh.field_gc.field_p - 0.04908738521234052;
                              break L0;
                            } else {
                              if (var2_int != 36) {
                                if (var2_int == 52) {
                                  kh.field_gc.field_E = kh.field_gc.field_E * 0.9375;
                                  break L0;
                                } else {
                                  if (var2_int == 37) {
                                    kh.field_gc.field_z = kh.field_gc.field_z * 1.0078125f;
                                    break L0;
                                  } else {
                                    if (53 != var2_int) {
                                      if (38 != var2_int) {
                                        if (var2_int != 54) {
                                          if (var2_int != 39) {
                                            if (55 == var2_int) {
                                              fl.field_l = fl.field_l * 15 / 16;
                                              break L0;
                                            } else {
                                              if (40 == var2_int) {
                                                kh.field_vc = kh.field_vc - 50;
                                                break L0;
                                              } else {
                                                if (var2_int != 56) {
                                                  if (var2_int == 41) {
                                                    ek.field_a = ek.field_a + 1;
                                                    break L0;
                                                  } else {
                                                    if (var2_int != 57) {
                                                      if (64 == var2_int) {
                                                        if ((pd.field_i & 16777216L) == 0L) {
                                                          break L0;
                                                        } else {
                                                          if (re.field_a > 16) {
                                                            re.field_a = re.field_a - 8;
                                                            break L0;
                                                          } else {
                                                            break L0;
                                                          }
                                                        }
                                                      } else {
                                                        if (var2_int == 65) {
                                                          if ((16777216L & pd.field_i) == 0L) {
                                                            break L0;
                                                          } else {
                                                            if (2304 <= re.field_a) {
                                                              break L0;
                                                            } else {
                                                              re.field_a = re.field_a + 8;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          if (var2_int != 66) {
                                                            if (var2_int == 67) {
                                                              if ((pd.field_i & 16777216L) == 0L) {
                                                                break L0;
                                                              } else {
                                                                if (ue.field_e >= 65536) {
                                                                  break L0;
                                                                } else {
                                                                  ue.field_e = ue.field_e * 17 / 16;
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              if (var2_int != 68) {
                                                                if (var2_int == 69) {
                                                                  if ((16777216L & pd.field_i) == 0L) {
                                                                    break L0;
                                                                  } else {
                                                                    if (ap.field_G < 65536) {
                                                                      ap.field_G = ap.field_G + 4;
                                                                      break L0;
                                                                    } else {
                                                                      break L0;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (var2_int != 59) {
                                                                    if (var2_int != 87) {
                                                                      if (var2_int != 88) {
                                                                        break L0;
                                                                      } else {
                                                                        if ((65536L & pd.field_i) == 0L) {
                                                                          break L0;
                                                                        } else {
                                                                          if (hr.field_b <= 2) {
                                                                            break L0;
                                                                          } else {
                                                                            ne.field_v = ne.field_v - 2;
                                                                            hr.field_b = hr.field_b - 1;
                                                                            this.j(-93);
                                                                            break L0;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if ((pd.field_i & 65536L) == 0L) {
                                                                        break L0;
                                                                      } else {
                                                                        if (hr.field_b >= 26) {
                                                                          break L0;
                                                                        } else {
                                                                          ne.field_v = ne.field_v + 2;
                                                                          hr.field_b = hr.field_b + 1;
                                                                          this.j(46);
                                                                          break L0;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    int discarded$9 = 3;
                                                                    this.o();
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                if ((16777216L & pd.field_i) == 0L) {
                                                                  break L0;
                                                                } else {
                                                                  if (ap.field_G > 4) {
                                                                    ap.field_G = ap.field_G - 4;
                                                                    break L0;
                                                                  } else {
                                                                    break L0;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if ((pd.field_i & 16777216L) == 0L) {
                                                              break L0;
                                                            } else {
                                                              if (ue.field_e > 16) {
                                                                ue.field_e = ue.field_e * 15 / 16;
                                                                break L0;
                                                              } else {
                                                                break L0;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      ek.field_a = ek.field_a - 1;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  kh.field_vc = kh.field_vc + 50;
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            fl.field_l = fl.field_l * 17 / 16;
                                            break L0;
                                          }
                                        } else {
                                          hf.field_a = hf.field_a * 15 / 16;
                                          break L0;
                                        }
                                      } else {
                                        hf.field_a = 17 * hf.field_a / 16;
                                        break L0;
                                      }
                                    } else {
                                      kh.field_gc.field_z = kh.field_gc.field_z * 0.9921875f;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                kh.field_gc.field_E = kh.field_gc.field_E * 1.0625;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        kh.field_gc.field_j = kh.field_gc.field_j + 0.04908738521234052;
                        break L0;
                      }
                    }
                  } else {
                    if (!vj.field_c[81]) {
                      kh.field_gc.field_x = kh.field_gc.field_x + 1;
                      break L0;
                    } else {
                      kh.field_gc.field_m = kh.field_gc.field_m + 1;
                      ((uf) this).K(0);
                      break L0;
                    }
                  }
                } else {
                  if (vj.field_c[81]) {
                    kh.field_gc.field_d = kh.field_gc.field_d - 1;
                    ((uf) this).K(0);
                    break L0;
                  } else {
                    kh.field_gc.field_C = kh.field_gc.field_C - 1;
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        qe var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        try {
          L0: {
            L1: {
              var4 = ((uf) this).field_I.j(122);
              if (var4.field_M < 0) {
                b.field_H.field_pb = false;
                break L1;
              } else {
                param0 = this.a(-30818, param0, param1, b.field_H);
                break L1;
              }
            }
            L2: {
              if (((uf) this).field_I.field_y <= 0) {
                qo.field_F.field_pb = false;
                break L2;
              } else {
                param0 = this.a(-30818, param0, param1, qo.field_F);
                break L2;
              }
            }
            L3: {
              if (var4.field_u != 0) {
                param0 = this.a(-30818, param0, param1, df.field_f);
                break L3;
              } else {
                df.field_f.field_pb = false;
                break L3;
              }
            }
            L4: {
              if (var4.field_E) {
                param0 = this.a(-30818, param0, param1, ub.field_q);
                break L4;
              } else {
                ub.field_q.field_pb = false;
                break L4;
              }
            }
            stackOut_17_0 = param0;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4_ref, "uf.MA(" + param0 + ',' + param1 + ',' + -51 + ')');
        }
        return stackIn_18_0;
    }

    private final int f() {
        RuntimeException var2 = null;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
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
                  stackOut_23_0 = 4;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
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
                  stackOut_29_0 = 5;
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0;
                }
              }
            }
            L8: {
              if (!qo.field_F.field_pb) {
                break L8;
              } else {
                if (qo.field_F.field_W) {
                  stackOut_37_0 = 6;
                  stackIn_38_0 = stackOut_37_0;
                  return stackIn_38_0;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (!ub.field_q.field_pb) {
                break L9;
              } else {
                if (ub.field_q.field_W) {
                  stackOut_48_0 = 8;
                  stackIn_49_0 = stackOut_48_0;
                  return stackIn_49_0;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (!q.field_b.field_pb) {
                break L10;
              } else {
                if (!q.field_b.field_W) {
                  break L10;
                } else {
                  stackOut_54_0 = ((uf) this).field_I.field_f.a(((uf) this).field_I.j(113), -78);
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                }
              }
            }
            stackOut_56_0 = -1;
            stackIn_57_0 = stackOut_56_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.O(" + 1163 + ')');
        }
        return stackIn_57_0;
    }

    private final void j(int param0) {
        try {
            dq.field_a.a(7096);
            dq.field_a.a(2147483647, ((uf) this).field_I);
            kh.field_gc.a(((uf) this).field_I, 21894);
            kh.field_gc.a((byte) 0, ((uf) this).field_ab);
            int var2_int = 90 % ((-12 - param0) / 58);
            ((uf) this).K(0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uf.W(" + param0 + ')');
        }
    }

    private final void a(qe param0, int param1) {
        aa var3 = null;
        String[] var3_array = null;
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
        int stackIn_41_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        String stackIn_58_2 = null;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        String stackIn_66_2 = null;
        int stackIn_85_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        String stackOut_57_2 = null;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        String stackOut_56_2 = null;
        L0: {
          if (param0.field_m == null) {
            break L0;
          } else {
            if (!param0.field_m.c(0)) {
              var3 = new aa(param0.field_m);
              var4_ref_cr = (cr) (Object) var3.b((byte) -92);
              L1: while (true) {
                if (var4_ref_cr == null) {
                  break L0;
                } else {
                  L2: {
                    if (0 != var4_ref_cr.field_n) {
                      field_fb = field_fb + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4_ref_cr = (cr) (Object) var3.b(-100);
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        field_fb = 16 + field_fb & 65535 | -65536 & field_fb;
        L3: {
          if (0 != (((uf) this).field_I.j(69).field_s & um.field_c)) {
            kh.field_gc.a(6, 256, (byte) 18, 128);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((sk.field_d & ((uf) this).field_L) == 0) {
            break L4;
          } else {
            if ((hm.field_e & param0.field_s) == 0) {
              break L4;
            } else {
              L5: {
                if (!(((uf) this).field_I.field_f instanceof af)) {
                  break L5;
                } else {
                  ij discarded$13 = gj.a(true, 0, ph.field_a, c.field_a);
                  ((uf) this).field_I.a(9437184, (li) null, (byte) -114, 9437184, 8);
                  param0.field_s = param0.field_s & ~hm.field_e;
                  if (((uf) this).field_I.d((byte) 105)) {
                    param0.field_s = param0.field_s | um.field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              if (((uf) this).field_I.field_f instanceof fj) {
                ij discarded$14 = gj.a(true, 0, ph.field_a, cr.field_q);
                ((uf) this).field_I.a(9437184, (li) null, (byte) -108, 9437184, 9);
                param0.field_s = param0.field_s & ~hm.field_e;
                if (!((uf) this).field_I.d((byte) 127)) {
                  break L4;
                } else {
                  param0.field_s = param0.field_s | um.field_c;
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
        L6: {
          if (((uf) this).field_I.h(22042)) {
            if ((((uf) this).field_L & hq.field_c) != 0) {
              break L6;
            } else {
              L7: {
                if ((ag.field_e & param0.field_s) != 0) {
                  L8: {
                    ((uf) this).field_I.c(-14286, param0.field_L);
                    if (0 != (f.field_f & ((uf) this).field_L)) {
                      L9: {
                        dk.field_f = dk.field_f - 1;
                        ((uf) this).field_I.field_m = true;
                        int discarded$15 = -102;
                        this.i();
                        if (9000 <= ((uf) this).field_o) {
                          stackOut_84_0 = 0;
                          stackIn_85_0 = stackOut_84_0;
                          break L9;
                        } else {
                          stackOut_83_0 = 1;
                          stackIn_85_0 = stackOut_83_0;
                          break L9;
                        }
                      }
                      var3_int = stackIn_85_0;
                      var4 = 1;
                      var5_ref_aa = new aa(((uf) this).field_I.field_u);
                      var6 = (qe) (Object) var5_ref_aa.b((byte) -92);
                      L10: while (true) {
                        L11: {
                          if (var6 == null) {
                            break L11;
                          } else {
                            L12: {
                              if (var6.field_t) {
                                break L12;
                              } else {
                                if ((var6.field_s & be.field_I) == 0) {
                                  var6 = (qe) (Object) var5_ref_aa.b(-105);
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var4 = 0;
                            break L11;
                          }
                        }
                        var5 = 1;
                        var6_ref = new aa(((uf) this).field_I.field_u);
                        var7 = new aa();
                        var8 = (qe) (Object) var6_ref.b((byte) -92);
                        var8 = (qe) (Object) var6_ref.b(-97);
                        L13: while (true) {
                          L14: {
                            if (var8 == null) {
                              break L14;
                            } else {
                              if (var8.field_m == null) {
                                var5 = 0;
                                break L14;
                              } else {
                                var7.a(var8.field_m, false);
                                var9 = 0;
                                var10 = (cr) (Object) var7.b((byte) -92);
                                L15: while (true) {
                                  L16: {
                                    if (var10 == null) {
                                      break L16;
                                    } else {
                                      if (var10.field_n != 0) {
                                        var9 = 1;
                                        break L16;
                                      } else {
                                        var10 = (cr) (Object) var7.b(-113);
                                        continue L15;
                                      }
                                    }
                                  }
                                  if (var9 != 0) {
                                    var8 = (qe) (Object) var6_ref.b(-125);
                                    continue L13;
                                  } else {
                                    var5 = 0;
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            if (pq.field_B == null) {
                              break L17;
                            } else {
                              if (pq.field_B.length <= 0) {
                                break L17;
                              } else {
                                L18: {
                                  if (var4 == 0) {
                                    break L18;
                                  } else {
                                    if (t.a(0, oa.field_g, 21)) {
                                      this.a((byte) 104, 21, 234);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (var5 == 0) {
                                    break L19;
                                  } else {
                                    if (!t.a(0, oa.field_g, 22)) {
                                      break L19;
                                    } else {
                                      this.a((byte) 104, 22, 233);
                                      break L19;
                                    }
                                  }
                                }
                                if (var3_int == 0) {
                                  break L8;
                                } else {
                                  if (!t.a(0, oa.field_g, 20)) {
                                    break L8;
                                  } else {
                                    this.a((byte) 104, 20, 235);
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          L20: {
                            if (var4 == 0) {
                              break L20;
                            } else {
                              if (!t.a(0, oa.field_g, 24)) {
                                break L20;
                              } else {
                                this.a((byte) 104, 24, 231);
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (var5 == 0) {
                              break L21;
                            } else {
                              if (!t.a(0, oa.field_g, 25)) {
                                break L21;
                              } else {
                                this.a((byte) 104, 25, 230);
                                break L21;
                              }
                            }
                          }
                          if (var3_int == 0) {
                            break L8;
                          } else {
                            if (!t.a(0, oa.field_g, 23)) {
                              break L8;
                            } else {
                              this.a((byte) 104, 23, 232);
                              break L8;
                            }
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  kh.field_gc.a(17, 256, (byte) -100, 128);
                  break L7;
                } else {
                  if ((hm.field_e & param0.field_s) == 0) {
                    break L7;
                  } else {
                    L22: {
                      ((uf) this).field_I.c(-14286, ((uf) this).field_I.field_f.a(param0, (byte) 114));
                      if (0 != (((uf) this).field_L & f.field_f)) {
                        ((uf) this).field_I.field_m = false;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if ((((uf) this).field_L & oj.field_m) == 0) {
                      kh.field_gc.a(18, 256, (byte) 98, 128);
                      break L7;
                    } else {
                      kh.field_gc.a(17, 256, (byte) -103, 128);
                      break L7;
                    }
                  }
                }
              }
              L23: {
                stackOut_139_0 = -3405;
                stackOut_139_1 = -1;
                stackIn_141_0 = stackOut_139_0;
                stackIn_141_1 = stackOut_139_1;
                stackIn_140_0 = stackOut_139_0;
                stackIn_140_1 = stackOut_139_1;
                if (mg.a(true)) {
                  stackOut_141_0 = stackIn_141_0;
                  stackOut_141_1 = stackIn_141_1;
                  stackOut_141_2 = 21;
                  stackIn_142_0 = stackOut_141_0;
                  stackIn_142_1 = stackOut_141_1;
                  stackIn_142_2 = stackOut_141_2;
                  break L23;
                } else {
                  stackOut_140_0 = stackIn_140_0;
                  stackOut_140_1 = stackIn_140_1;
                  stackOut_140_2 = 0;
                  stackIn_142_0 = stackOut_140_0;
                  stackIn_142_1 = stackOut_140_1;
                  stackIn_142_2 = stackOut_140_2;
                  break L23;
                }
              }
              fq.a(stackIn_142_0, stackIn_142_1, stackIn_142_2, false);
              ((uf) this).a(-23095);
              if ((((uf) this).field_L & f.field_f) == 0) {
                break L6;
              } else {
                sq.field_b = 23;
                ne.field_w = 23;
                break L6;
              }
            }
          } else {
            if (((uf) this).field_I.field_f.a((byte) -83, param0.field_L)) {
              if (!(((uf) this).field_I.field_f instanceof rj)) {
                break L6;
              } else {
                if (0 == (((uf) this).field_I.field_p & 1 << param0.field_L)) {
                  L24: {
                    L25: {
                      if (param0.field_L != ((uf) this).field_db) {
                        break L25;
                      } else {
                        if ((((uf) this).field_L & hq.field_c) == 0) {
                          break L25;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L24;
                        }
                      }
                    }
                    stackOut_40_0 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    break L24;
                  }
                  L26: {
                    var3_int = stackIn_41_0;
                    var4 = ((rj) (Object) ((uf) this).field_I.field_f).field_e[param0.field_L];
                    if (var3_int == 0) {
                      if (var4 != 1) {
                        var5_ref_String = nr.a(new String[2], -1, cj.field_U);
                        break L26;
                      } else {
                        var5_ref_String = nr.a(new String[1], -1, kn.field_f);
                        break L26;
                      }
                    } else {
                      if (1 == var4) {
                        var5_ref_String = bh.field_d;
                        break L26;
                      } else {
                        var5_ref_String = nr.a(new String[1], -1, hk.field_q);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var6_int = -param0.field_N + var4;
                    if (var6_int != 1) {
                      if (var6_int == -1) {
                        L28: {
                          stackOut_59_0 = 1;
                          stackOut_59_1 = 0;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_61_1 = stackOut_59_1;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          if (var3_int != 0) {
                            stackOut_61_0 = stackIn_61_0;
                            stackOut_61_1 = stackIn_61_1;
                            stackOut_61_2 = o.field_D;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            stackIn_62_2 = stackOut_61_2;
                            break L28;
                          } else {
                            stackOut_60_0 = stackIn_60_0;
                            stackOut_60_1 = stackIn_60_1;
                            stackOut_60_2 = nr.a(new String[1], -1, jk.field_c);
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            stackIn_62_2 = stackOut_60_2;
                            break L28;
                          }
                        }
                        ij discarded$16 = gj.a(stackIn_62_0 != 0, stackIn_62_1, stackIn_62_2, var5_ref_String);
                        break L27;
                      } else {
                        if (-2 == var6_int) {
                          L29: {
                            stackOut_63_0 = 1;
                            stackOut_63_1 = 0;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            if (var3_int == 0) {
                              stackOut_65_0 = stackIn_65_0;
                              stackOut_65_1 = stackIn_65_1;
                              stackOut_65_2 = nr.a(new String[1], -1, oh.field_f);
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              stackIn_66_2 = stackOut_65_2;
                              break L29;
                            } else {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = stackIn_64_1;
                              stackOut_64_2 = jk.field_j;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              stackIn_66_2 = stackOut_64_2;
                              break L29;
                            }
                          }
                          ij discarded$17 = gj.a(stackIn_66_0 != 0, stackIn_66_1, stackIn_66_2, var5_ref_String);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                    } else {
                      L30: {
                        stackOut_55_0 = 1;
                        stackOut_55_1 = 0;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_57_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (var3_int != 0) {
                          stackOut_57_0 = stackIn_57_0;
                          stackOut_57_1 = stackIn_57_1;
                          stackOut_57_2 = oj.field_u;
                          stackIn_58_0 = stackOut_57_0;
                          stackIn_58_1 = stackOut_57_1;
                          stackIn_58_2 = stackOut_57_2;
                          break L30;
                        } else {
                          stackOut_56_0 = stackIn_56_0;
                          stackOut_56_1 = stackIn_56_1;
                          stackOut_56_2 = nr.a(new String[1], -1, ad.field_b);
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_58_1 = stackOut_56_1;
                          stackIn_58_2 = stackOut_56_2;
                          break L30;
                        }
                      }
                      ij discarded$18 = gj.a(stackIn_58_0 != 0, stackIn_58_1, stackIn_58_2, var5_ref_String);
                      break L27;
                    }
                  }
                  break L6;
                } else {
                  break L6;
                }
              }
            } else {
              ij discarded$19 = gj.a(true, 0, nr.a(new String[1], -1, qe.field_F), (String) null);
              break L6;
            }
          }
        }
        L31: {
          if ((param0.field_s & i.field_m) == 0) {
            break L31;
          } else {
            if ((param0.field_s & oa.field_b) == 0) {
              this.b(124, param0);
              break L31;
            } else {
              break L31;
            }
          }
        }
        L32: {
          if ((sk.field_d & ((uf) this).field_L) == 0) {
            L33: {
              if (param0.field_w > -3) {
                if (param0.field_w != -2) {
                  if (param0.field_w != -1) {
                    if (param0.field_w != 1) {
                      if (param0.field_w != 2) {
                        if (param0.field_w < 3) {
                          var3_array = null;
                          break L33;
                        } else {
                          var3_array = wo.field_b;
                          break L33;
                        }
                      } else {
                        var3_array = pq.field_C;
                        break L33;
                      }
                    } else {
                      var3_array = v.field_k;
                      break L33;
                    }
                  } else {
                    var3_array = qp.field_fc;
                    break L33;
                  }
                } else {
                  var3_array = he.field_d;
                  break L33;
                }
              } else {
                var3_array = jr.field_l;
                break L33;
              }
            }
            if (null != var3_array) {
              ij discarded$20 = gj.a(true, 5, var3_array[ga.a(var3_array.length, true, ea.field_r)], (String) null);
              break L32;
            } else {
              break L32;
            }
          } else {
            break L32;
          }
        }
        L34: {
          int discarded$21 = -28;
          this.a(param0);
          int discarded$22 = -16813;
          tn.a((uf) this);
          if ((((uf) this).field_L & sk.field_d) != 0) {
            ((uf) this).field_c.a(false, param0);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          if ((f.field_f & ((uf) this).field_L) != 0) {
            if ((param0.field_s & be.field_I) == 0) {
              break L35;
            } else {
              ij discarded$23 = gj.a(true, 6, nr.a(new String[1], -1, iq.field_b), (String) null);
              ((uf) this).field_v = ((uf) this).field_o;
              ((uf) this).field_o = ((uf) this).field_o + 750;
              if ((16711680 & wq.field_c) != 16711680) {
                wq.field_c = wq.field_c + 65536;
                break L35;
              } else {
                break L35;
              }
            }
          } else {
            break L35;
          }
        }
        L36: {
          if (0 != (((uf) this).field_L & hq.field_c)) {
            break L36;
          } else {
            if (((uf) this).field_I.j(115) == param0) {
              break L36;
            } else {
              ((uf) this).s((byte) -84);
              if (((uf) this).field_I.field_q != -1) {
                ((uf) this).field_o = wn.field_f[((uf) this).field_I.field_q];
                break L36;
              } else {
                break L36;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        pq var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((uf) this).field_Z = 125;
                break L1;
              }
            }
            L2: {
              var3 = ((uf) this).field_I.field_l[param1];
              if (var3.field_o) {
                break L2;
              } else {
                var3.field_k = ((uf) this).field_P - 264 << 16;
                var3.field_j = 33554432;
                var3.field_g = id.field_a[3].field_z - 311 << 16;
                var3.d((byte) 115);
                var3.field_o = true;
                var3.field_p = true;
                int fieldTemp$2 = ((uf) this).field_C;
                ((uf) this).field_C = ((uf) this).field_C + 1;
                ((uf) this).field_ib[fieldTemp$2] = param1;
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
          throw wm.a((Throwable) (Object) var3_ref, "uf.QB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void y() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (~((uf) this).field_I.field_l.length >= ~var2_int) {
                dq.field_a.a(2147483647, ((uf) this).field_I);
                id.field_c.field_g = true;
                hh.field_c = true;
                break L0;
              } else {
                ((uf) this).field_I.field_l[var2_int].a(118);
                ((uf) this).field_I.field_l[var2_int].field_p = true;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.E(" + 17 + ')');
        }
    }

    final void q(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (((uf) this).k(-38)) {
                  L2: {
                    if (!id.field_c.field_g) {
                      break L2;
                    } else {
                      id.field_c.a(param0 + 1, (uf) this);
                      ((uf) this).field_p = -1;
                      ((uf) this).field_g = -1;
                      break L2;
                    }
                  }
                  id.field_c.a(32624, ((uf) this).field_ab);
                  break L1;
                } else {
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
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.RD(" + param0 + ')');
        }
    }

    final void a(ge param0, boolean param1) {
        RuntimeException runtimeException = null;
        qe var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3 = ((uf) this).field_I.j(23);
            if (0 == var3.field_q) {
              if (((uf) this).field_db != var3.field_L) {
                L1: {
                  ((uf) this).field_b.a(65280, param0);
                  hh.field_c = true;
                  id.field_c.field_g = true;
                  if (!param1) {
                    break L1;
                  } else {
                    boolean discarded$3 = this.a(44, 37, -38, -117);
                    break L1;
                  }
                }
                break L0;
              } else {
                param0.field_v = param0.field_v + 8;
                return;
              }
            } else {
              param0.field_v = param0.field_v + 8;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("uf.N(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void D(int param0) {
        RuntimeException var2 = null;
        qe var2_ref = null;
        int[] var2_array = null;
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
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        var27 = Pool.field_O;
        try {
          L0: {
            if (0 != ((uf) this).field_I.j(43).field_q) {
              return;
            } else {
              L1: {
                if (!hh.field_c) {
                  break L1;
                } else {
                  L2: {
                    var2_ref = new qe();
                    var3_ref_qe = var2_ref;
                    var4_ref_kj = ((uf) this).field_G;
                    var3_ref_qe.field_H = (byte)var4_ref_kj.field_e;
                    var3_ref_qe.field_C = (short)((1024 + var4_ref_kj.field_h) % 2048);
                    var3_ref_qe.field_D = (byte)var4_ref_kj.field_d;
                    var3_ref_qe.field_V = (short)var4_ref_kj.field_n;
                    var3_ref_qe.field_A = (short)var4_ref_kj.field_k;
                    var2_ref.field_V = (short) 2048;
                    var3_ref_al = ((uf) this).field_I;
                    var4_ref_qe = var2_ref;
                    o.field_y = 0;
                    if (null == pq.field_B) {
                      break L2;
                    } else {
                      if (pq.field_B.length != 0) {
                        if (var4_ref_qe.field_D * var4_ref_qe.field_D + var4_ref_qe.field_H * var4_ref_qe.field_H <= 9216) {
                          var5_ref_al = var3_ref_al;
                          var6_ref_qe = var4_ref_qe;
                          var7 = 0;
                          L3: while (true) {
                            if (~var7 <= ~var5_ref_al.field_l.length) {
                              pc.field_a = pq.field_B[0];
                              var7_ref_qe = var6_ref_qe;
                              var8 = pq.field_B[0][0];
                              var9 = var7_ref_qe.field_D * var7_ref_qe.field_D + var7_ref_qe.field_H * var7_ref_qe.field_H;
                              if (var9 <= 9216) {
                                var10_int = -rf.a(65536 - (var9 << 2), -125) >> 9;
                                var11_int = ao.a((int) var7_ref_qe.field_A, true);
                                var12 = hc.a(2047, (int) var7_ref_qe.field_A);
                                var13 = ao.a((int) var7_ref_qe.field_C, true);
                                var14 = hc.a(2047, (int) var7_ref_qe.field_C);
                                var15 = var13;
                                var16 = -var14;
                                var17 = aj.a(var11_int, false, -var16);
                                var18 = aj.a(var11_int, false, var15);
                                var19_int = var12;
                                var20 = -(var19_int * var16) + var18 * 0 >> 16;
                                var21_int = -(var17 * 0) + var19_int * var15 >> 16;
                                var22 = var17 * var16 + -(var18 * var15) >> 16;
                                var23 = var20 * var7_ref_qe.field_H + (var15 * var7_ref_qe.field_D + var10_int * var17) >> 9;
                                var24 = var16 * var7_ref_qe.field_D + (var18 * var10_int + var7_ref_qe.field_H * var21_int) >> 9;
                                var25 = var10_int * var19_int - -(var7_ref_qe.field_D * 0) - -(var22 * var7_ref_qe.field_H) >> 9;
                                int discarded$7 = 0;
                                var8.field_I = lh.a(uh.field_q, (byte) -79, (long)(int)(od.a((long)(var7_ref_qe.field_V * var17), (long)kj.field_f) / 4096L));
                                int discarded$8 = 0;
                                var8.field_t = lh.a(uh.field_q, (byte) -116, (long)(int)(od.a((long)(var7_ref_qe.field_V * var18), (long)kj.field_f) / 4096L));
                                var8.field_v = 1;
                                int discarded$9 = 0;
                                var26 = lh.a(uh.field_w, (byte) -93, (long)(int)(od.a((long)(var7_ref_qe.field_V * bl.field_g), (long)kj.field_f) / 4096L));
                                var8.field_n = aj.a(-aj.a(var18, false, var25), false, var26);
                                var8.field_b = aj.a(aj.a(var17, false, var25), false, var26);
                                var8.field_K = aj.a(aj.a(var18, false, var23) + -aj.a(var17, false, var24), false, var26);
                                boolean discarded$10 = fn.f(-13164);
                                L4: while (true) {
                                  hb.field_s = -1;
                                  td.field_b = 0;
                                  or.field_l = 0;
                                  var5_ref_pq__ = pc.field_a;
                                  var6 = 0;
                                  L5: while (true) {
                                    if (var6 >= var5_ref_pq__.length) {
                                      var5 = 0;
                                      L6: while (true) {
                                        int discarded$11 = 0;
                                        int dupTemp$12 = oe.a(var3_ref_al.field_c, var5, pc.field_a, var3_ref_al.field_e);
                                        var5 = dupTemp$12;
                                        if (dupTemp$12 == -1) {
                                          var6_ref_pq__ = pc.field_a;
                                          var7 = 0;
                                          L7: while (true) {
                                            if (var6_ref_pq__.length <= var7) {
                                              var3_ref_al.a(6582, pc.field_a, var4_ref_qe);
                                              if (!fn.f(-13164)) {
                                                break L2;
                                              } else {
                                                int discarded$13 = 57;
                                                if (bk.a(pc.field_a)) {
                                                  continue L4;
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              L8: {
                                                if (!var6_ref_pq__[var7].field_s) {
                                                  break L8;
                                                } else {
                                                  var6_ref_pq__[var7].a(false);
                                                  break L8;
                                                }
                                              }
                                              var7++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          if (fn.f(-13164)) {
                                            continue L6;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      var5_ref_pq__[var6].field_w = 0;
                                      var6++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                throw new IllegalStateException("Strike point out of range! " + var7_ref_qe.field_D + "," + var7_ref_qe.field_H);
                              }
                            } else {
                              pq.field_B[0][var7].a(var5_ref_al.field_l[var7], (byte) -12);
                              var7++;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  hh.field_c = false;
                  break L1;
                }
              }
              L9: {
                if (param0 < -120) {
                  break L9;
                } else {
                  ((uf) this).field_O = null;
                  break L9;
                }
              }
              L10: {
                var2_array = ((uf) this).field_ab;
                wh.field_g = 0;
                if (0L == (pd.field_i & 16384L)) {
                  if (null == pq.field_B) {
                    break L10;
                  } else {
                    if (pq.field_B.length != 0) {
                      var3 = 0;
                      L11: while (true) {
                        L12: {
                          stackOut_68_0 = var3;
                          stackIn_71_0 = stackOut_68_0;
                          stackIn_69_0 = stackOut_68_0;
                          if ((pd.field_i & 8589934592L) == 0L) {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = pc.field_a.length;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            break L12;
                          } else {
                            stackOut_69_0 = stackIn_69_0;
                            stackOut_69_1 = 1;
                            stackIn_72_0 = stackOut_69_0;
                            stackIn_72_1 = stackOut_69_1;
                            break L12;
                          }
                        }
                        if (stackIn_72_0 >= stackIn_72_1) {
                          break L10;
                        } else {
                          var4 = ea.field_p << 11;
                          var5 = 0;
                          var8 = pq.field_B[0][var3];
                          var9 = 1;
                          L13: while (true) {
                            if (o.field_y <= var9) {
                              var3++;
                              continue L11;
                            } else {
                              L14: {
                                L15: {
                                  var10 = pq.field_B[-1 + var9][var3];
                                  var11 = pq.field_B[var9][var3];
                                  var6 = var5 + (var10.field_w & 65535);
                                  if (0 == var11.field_w) {
                                    break L15;
                                  } else {
                                    if (var11.field_w < 65536) {
                                      var7 = var5 - -var11.field_w;
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var7 = var5 + 65536;
                                break L14;
                              }
                              L16: {
                                L17: {
                                  if (~var10.field_g != ~var11.field_g) {
                                    break L17;
                                  } else {
                                    if (~var10.field_k != ~var11.field_k) {
                                      break L17;
                                    } else {
                                      var5 = var5 + 65536;
                                      break L16;
                                    }
                                  }
                                }
                                L18: {
                                  var12 = var4 + var5;
                                  if (~var12 > ~var6) {
                                    break L18;
                                  } else {
                                    if (~var7 >= ~var12) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (0 != var10.field_v) {
                                          break L19;
                                        } else {
                                          if (0 == var11.field_v) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (var10.field_v != 2) {
                                          break L20;
                                        } else {
                                          if (var11.field_v != 2) {
                                            break L20;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var13 = (-var12 + (o.field_y << 16)) / o.field_y >> 8;
                                      var14 = (var11.field_g - var10.field_g >> 13) * (var12 - var6) / (var7 - var6) + (var10.field_g >> 13);
                                      var15 = (var10.field_k >> 13) + (-var10.field_k + var11.field_k >> 13) * (-var6 + var12) / (-var6 + var7);
                                      var16 = -64;
                                      var17 = -(var8.field_g >> 13) + var14;
                                      var18 = -(var8.field_k >> 13) + var15;
                                      var19 = (long)(var17 * var17 - -(var18 * var18));
                                      var21 = bm.a(-127, var19 << 10) >> 13;
                                      if (var21 >= 48L) {
                                        L21: {
                                          if (80L <= var21) {
                                            break L21;
                                          } else {
                                            var23 = (int)(-48L + var21);
                                            var13 = var13 * var23 / 32;
                                            break L21;
                                          }
                                        }
                                        var16 = var16 - var2_array[2];
                                        var14 = var14 - var2_array[0];
                                        var15 = var15 - var2_array[1];
                                        var23 = var2_array[10] * var15 + var14 * var2_array[9] + var16 * var2_array[11] >> 16;
                                        if (0 < var23) {
                                          L22: {
                                            var24 = var2_array[5] * var16 + var2_array[3] * var14 + var2_array[4] * var15 >> 3;
                                            var25 = var2_array[8] * var16 + (var2_array[6] * var14 - -(var2_array[7] * var15)) >> 3;
                                            if (var23 != 0) {
                                              break L22;
                                            } else {
                                              var23 = 1;
                                              break L22;
                                            }
                                          }
                                          L23: {
                                            var24 = var24 / var23 + 5120;
                                            var25 = 3840 + var25 / var23;
                                            var13 = (var13 << 10) / var23;
                                            if (4088 >= var13) {
                                              break L23;
                                            } else {
                                              var13 = 4088;
                                              break L23;
                                            }
                                          }
                                          rb.field_e[wh.field_g].field_c = var14;
                                          rb.field_e[wh.field_g].field_e = var15;
                                          rb.field_e[wh.field_g].field_a = var16;
                                          rb.field_e[wh.field_g].field_h = var24;
                                          rb.field_e[wh.field_g].field_f = var25;
                                          rb.field_e[wh.field_g].field_b = var13;
                                          rb.field_e[wh.field_g].field_d = var3;
                                          wh.field_g = wh.field_g + 1;
                                          break L18;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                L24: {
                                  if (var11.field_w == 0) {
                                    break L24;
                                  } else {
                                    if (var11.field_w >= 65536) {
                                      break L24;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var5 = var5 + 65536;
                                break L16;
                              }
                              var9++;
                              continue L13;
                            }
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                } else {
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.FA(" + param0 + ')');
        }
    }

    private final void t() {
        RuntimeException var2 = null;
        int var2_int = 0;
        aa var2_ref = null;
        int var3_int = 0;
        cr var3 = null;
        int var4 = 0;
        oo stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        int[] stackIn_13_4 = null;
        oo stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int[] stackIn_15_4 = null;
        oo stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int[] stackIn_16_4 = null;
        int stackIn_16_5 = 0;
        RuntimeException decompiledCaughtException = null;
        oo stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int[] stackOut_12_4 = null;
        oo stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int[] stackOut_15_4 = null;
        int stackOut_15_5 = 0;
        oo stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int[] stackOut_13_4 = null;
        int stackOut_13_5 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (or.field_l <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (~or.field_l >= ~var2_int) {
                    break L1;
                  } else {
                    L3: {
                      var3_int = wd.field_Qb[var2_int];
                      if ((16777216L & pd.field_i) != 0L) {
                        int discarded$3 = 7697781;
                        System.out.println("bbmom: " + lo.a((long)var3_int));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var3_int <= 16777216) {
                        var3_int = 192 * var3_int >> 23;
                        break L4;
                      } else {
                        var3_int = 192;
                        break L4;
                      }
                    }
                    L5: {
                      stackOut_12_0 = kh.field_gc;
                      stackOut_12_1 = 1336449640;
                      stackOut_12_2 = ((uf) this).field_ab;
                      stackOut_12_3 = 32 - -var3_int;
                      stackOut_12_4 = new int[]{wm.field_ac[var2_int][0] >> 13, wm.field_ac[var2_int][1] >> 13, wm.field_ac[var2_int][2] >> 13};
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      stackIn_15_2 = stackOut_12_2;
                      stackIn_15_3 = stackOut_12_3;
                      stackIn_15_4 = stackOut_12_4;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      if (65536 >= var3_int) {
                        stackOut_15_0 = (oo) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (int[]) (Object) stackIn_15_2;
                        stackOut_15_3 = stackIn_15_3;
                        stackOut_15_4 = (int[]) (Object) stackIn_15_4;
                        stackOut_15_5 = 3;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        stackIn_16_4 = stackOut_15_4;
                        stackIn_16_5 = stackOut_15_5;
                        break L5;
                      } else {
                        stackOut_13_0 = (oo) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (int[]) (Object) stackIn_13_2;
                        stackOut_13_3 = stackIn_13_3;
                        stackOut_13_4 = (int[]) (Object) stackIn_13_4;
                        stackOut_13_5 = 2;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        stackIn_16_3 = stackOut_13_3;
                        stackIn_16_4 = stackOut_13_4;
                        stackIn_16_5 = stackOut_13_5;
                        break L5;
                      }
                    }
                    ((oo) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5);
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (-113 < -69) {
                break L6;
              } else {
                ((uf) this).field_q = true;
                break L6;
              }
            }
            L7: {
              if (td.field_b > 0) {
                var2_int = 0;
                L8: while (true) {
                  if (td.field_b <= var2_int) {
                    break L7;
                  } else {
                    L9: {
                      var3_int = cf.field_g[var2_int];
                      if ((16777216L & pd.field_i) == 0L) {
                        break L9;
                      } else {
                        int discarded$4 = 7697781;
                        System.out.println("bwmom: " + lo.a((long)var3_int));
                        break L9;
                      }
                    }
                    L10: {
                      if (var3_int > 134217728) {
                        var3_int = 192;
                        break L10;
                      } else {
                        var3_int = 192 * var3_int >> 26;
                        break L10;
                      }
                    }
                    kh.field_gc.a(1336449640, ((uf) this).field_ab, 32 - -var3_int, new int[3], 5);
                    var2_int++;
                    continue L8;
                  }
                }
              } else {
                break L7;
              }
            }
            L11: {
              if (0 >= ((uf) this).field_I.field_j) {
                break L11;
              } else {
                var2_ref = new aa(((uf) this).field_I.j(25).field_m);
                var3 = (cr) (Object) var2_ref.a(0);
                L12: while (true) {
                  if (var3 == null) {
                    break L11;
                  } else {
                    int fieldTemp$5 = ((uf) this).field_I.field_j;
                    ((uf) this).field_I.field_j = ((uf) this).field_I.field_j - 1;
                    if (fieldTemp$5 <= 0) {
                      break L11;
                    } else {
                      kh.field_gc.a(((uf) this).field_ab, 4, -94, new int[3]);
                      var3 = (cr) (Object) var2_ref.c((byte) -71);
                      continue L12;
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
          throw wm.a((Throwable) (Object) var2, "uf.MC(" + -113 + ')');
        }
    }

    private final int b(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = (int)Math.round(Math.pow((double)param1 / (double)param0, 2.0) * 4096.0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "uf.S(" + param0 + ',' + param1 + ',' + 30 + ')');
        }
        return stackIn_4_0;
    }

    private final void l(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (!((uf) this).i(-1)) {
                ((uf) this).E(param0 ^ 24097);
                break L2;
              } else {
                L3: {
                  if (0 <= ((uf) this).field_I.j(param0 ^ -86).field_M) {
                    ((uf) this).field_G.field_h = 0;
                    break L3;
                  } else {
                    if (((uf) this).field_M == 0) {
                      break L3;
                    } else {
                      ((uf) this).field_G.a(((uf) this).field_eb, ((uf) this).field_I.field_l[0], (byte) -106);
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
          throw wm.a((Throwable) (Object) var2, "uf.EC(" + param0 + ')');
        }
    }

    private final boolean v() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((uf) this).field_I.field_l.length) {
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L2: {
                  if (!((uf) this).field_I.field_l[var3].field_s) {
                    break L2;
                  } else {
                    if (((uf) this).field_I.field_l[var3].field_v == 0) {
                      break L2;
                    } else {
                      if (!this.a(((uf) this).field_I.field_l[var3].field_j, ((uf) this).field_I.field_l[var3].field_g, -98, ((uf) this).field_I.field_l[var3].field_k)) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
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
          throw wm.a((Throwable) (Object) var2, "uf.NC(" + -96 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var6 = 82 / ((-30 - param2) / 57);
                var5 = new float[]{(float)(0 * param1), (float)(param3 * 0), (float)(param0 * 0)};
                ag.a(((uf) this).field_ab, var5, 9);
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
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        break L1;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5_ref, "uf.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void F(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((hq.field_c & ((uf) this).field_L) == 0) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (param0 == 1791) {
                  break L1;
                } else {
                  ((uf) this).field_c = null;
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
          throw wm.a((Throwable) (Object) var2, "uf.C(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$4 = 27;
              this.a(sa.field_h.field_w, ((uf) this).field_I.field_u);
              if (((uf) this).field_I.field_i == null) {
                break L1;
              } else {
                int discarded$5 = 27;
                this.a(sa.field_h.field_w + 320, ((uf) this).field_I.field_i);
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
          throw wm.a((Throwable) (Object) var2, "uf.U(" + param0 + ')');
        }
    }

    private final void o() {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            kh.field_gc.b(122);
            kh.field_gc.c(true);
            L1: while (true) {
              if (kh.field_gc.field_H >= kh.field_gc.field_G) {
                ((uf) this).K(0);
                id.field_c.field_g = true;
                break L0;
              } else {
                kh.field_gc.j(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.J(" + 3 + ')');
        }
    }

    private final boolean I() {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (0 == ((uf) this).field_I.j(66).field_q) {
              L1: {
                var2_int = this.g((byte) 102);
                var3 = 0;
                if (var2_int != -1) {
                  break L1;
                } else {
                  if (((uf) this).field_T) {
                    break L1;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  }
                }
              }
              this.b((byte) 121, -wp.field_d << 7);
              stackOut_9_0 = 1;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.CE(" + 122 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -38) {
                break L1;
              } else {
                ((uf) this).o((byte) 53);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = ((uf) this).field_I.j(52).field_q;
                if (var2_int == 0) {
                  break L3;
                } else {
                  L4: {
                    if (1 != var2_int) {
                      break L4;
                    } else {
                      if (((uf) this).field_B >= 37) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
              }
              stackOut_10_0 = 1;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.NB(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void b(qe param0, int param1) {
        RuntimeException var3 = null;
        pq var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (((uf) this).field_S >= 0) {
                break L1;
              } else {
                L2: {
                  if ((hq.field_c & ((uf) this).field_L) != 0) {
                    if (((uf) this).field_o > 1) {
                      ((uf) this).field_o = ((uf) this).field_o - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if ((f.field_f & ((uf) this).field_L) != 0) {
                      break L2;
                    } else {
                      if (((uf) this).field_I.field_o) {
                        break L2;
                      } else {
                        L3: {
                          if (((uf) this).field_I.field_i == null) {
                            break L3;
                          } else {
                            if (!((uf) this).field_I.field_i.c(0)) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (0L != (512L & pd.field_i)) {
                          break L2;
                        } else {
                          if (((uf) this).field_I.field_q != -1) {
                            ((uf) this).field_o = ((uf) this).field_o - 1;
                            if (0 == ((uf) this).field_o) {
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
                if (0 == (((uf) this).field_L & hq.field_c)) {
                  break L1;
                } else {
                  if (!((uf) this).i(-1)) {
                    break L1;
                  } else {
                    L4: {
                      int fieldTemp$2 = ((uf) this).field_m;
                      ((uf) this).field_m = ((uf) this).field_m + 1;
                      if (fieldTemp$2 >= 50) {
                        L5: {
                          L6: {
                            if (((uf) this).field_w == null) {
                              break L6;
                            } else {
                              if (((uf) this).field_G.a(-2043, ((uf) this).field_w)) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ej.field_j.b(false, 70);
                          ((uf) this).field_G.a((ge) (Object) ej.field_j, (byte) 106);
                          if (((uf) this).field_w == null) {
                            ((uf) this).field_w = ((uf) this).field_G.a(-14513);
                            break L5;
                          } else {
                            ((uf) this).field_w.b(38, ((uf) this).field_G);
                            break L5;
                          }
                        }
                        ((uf) this).field_m = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (param0.field_u != 0) {
                      int fieldTemp$3 = ((uf) this).field_d;
                      ((uf) this).field_d = ((uf) this).field_d + 1;
                      if (fieldTemp$3 >= 50) {
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
              if (!((uf) this).i(-1)) {
                L8: {
                  var3_ref = ((uf) this).field_I.field_l[0];
                  if (~param0.field_P != ~var3_ref.field_g) {
                    break L8;
                  } else {
                    if (~param0.field_Q == ~var3_ref.field_k) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var3_ref.field_k = var3_ref.field_k + (-var3_ref.field_k + param0.field_Q >> 3);
                hh.field_c = true;
                var3_ref.field_g = var3_ref.field_g + (param0.field_P + -var3_ref.field_g >> 3);
                id.field_c.field_g = true;
                var3_ref.field_p = true;
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var3;
            stackOut_77_1 = new StringBuilder().append("uf.FE(");
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L9;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L9;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + -17601 + ')');
        }
    }

    final void b(int param0, ge param1) {
        RuntimeException runtimeException = null;
        qe var3 = null;
        qe var4 = null;
        ge var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((uf) this).field_I.j(23);
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
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("uf.RC(").append(param0).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void c() {
        RuntimeException var2 = null;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        pq var10 = null;
        float var11 = 0.0f;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var12 = ((uf) this).field_Z;
              if (var12 != 0) {
                if (1 == var12) {
                  L2: {
                    L3: {
                      this.x(1);
                      var2_double = Math.abs(((uf) this).field_eb.field_d);
                      var4 = Math.abs(576.0 - ((uf) this).field_eb.field_d);
                      var6 = Math.abs(((uf) this).field_eb.field_a);
                      var8 = Math.abs(288.0 - ((uf) this).field_eb.field_a);
                      ((uf) this).field_O.field_h = -256.0;
                      if (var2_double >= var4) {
                        break L3;
                      } else {
                        if (var2_double >= var6) {
                          break L3;
                        } else {
                          if (var8 <= var2_double) {
                            break L3;
                          } else {
                            ((uf) this).field_O.field_d = -120.0;
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
                          ((uf) this).field_O.field_d = 696.0;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 <= var6) {
                      ((uf) this).field_O.field_a = 408.0;
                      break L2;
                    } else {
                      ((uf) this).field_O.field_a = -120.0;
                      break L2;
                    }
                  }
                  ((uf) this).field_R = -1;
                  break L1;
                } else {
                  if (var12 != 2) {
                    if (var12 != 3) {
                      if (var12 != 4) {
                        break L1;
                      } else {
                        this.t(0);
                        break L1;
                      }
                    } else {
                      var10 = ((uf) this).field_I.field_l[0];
                      var11 = (float)var10.g(-8);
                      if (var10.field_s) {
                        ((uf) this).field_O.field_f = (double)pf.b(127, var10.field_g);
                        ((uf) this).field_O.field_m = (double)pf.b(126, var10.field_k);
                        ((uf) this).field_O.field_k = (double)pf.b(127, var10.field_j);
                        ((uf) this).field_O.field_d = (double)(pf.b(126, var10.field_g) - 80.0f * ((float)var10.field_I / var11));
                        ((uf) this).field_O.field_a = (double)(pf.b(127, var10.field_k) - 80.0f * ((float)var10.field_t / var11));
                        ((uf) this).field_O.field_h = (double)(-24.0f + pf.b(126, var10.field_j));
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    this.g(124);
                    int discarded$1 = -96;
                    if (this.v()) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "uf.FC(" + -118 + ')');
        }
    }

    uf(int param0, int param1, int param2, int param3, int param4, boolean param5, String[] param6, int param7, boolean param8) {
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_71_0 = 0;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        Object stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        Object stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var16 = Pool.field_O;
        ((uf) this).field_h = 0;
        ((uf) this).field_Y = false;
        ((uf) this).field_kb = false;
        ((uf) this).field_d = 0;
        ((uf) this).field_V = -1;
        ((uf) this).field_m = 0;
        ((uf) this).field_T = false;
        ((uf) this).field_p = -1;
        ((uf) this).field_e = -1;
        ((uf) this).field_k = -1;
        ((uf) this).field_t = 0;
        ((uf) this).field_H = false;
        ((uf) this).field_g = -1;
        ((uf) this).field_Q = 0;
        ((uf) this).field_j = false;
        ((uf) this).field_N = -1;
        ((uf) this).field_A = 0;
        ((uf) this).field_u = 0;
        ((uf) this).field_f = 57;
        ((uf) this).field_l = 0;
        ((uf) this).field_q = false;
        ((uf) this).field_Z = 0;
        ((uf) this).field_eb = new mm();
        ((uf) this).field_O = new mm();
        ((uf) this).field_o = 0;
        ((uf) this).field_ab = new int[12];
        ((uf) this).field_a = 500;
        ((uf) this).field_R = -1;
        ((uf) this).field_D = true;
        ((uf) this).field_M = -1;
        ((uf) this).field_v = -1;
        ((uf) this).field_C = 0;
        try {
          L0: {
            L1: {
              ((uf) this).field_L = param0;
              ((uf) this).field_db = param7;
              ((uf) this).field_r = param8;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (hq.field_i < 2) {
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
              ((uf) this).field_bb = stackIn_4_1 != 0;
              un.a(676);
              int discarded$2 = -7414;
              vi.a();
              this.a(param6, param2, -112, param1);
              var10 = null;
              if ((f.field_f & ((uf) this).field_L) != 0) {
                var10 = (Object) (Object) gj.a(true, 0, oo.field_c, Pool.field_M);
                break L2;
              } else {
                if (0 == (hq.field_c & ((uf) this).field_L)) {
                  break L2;
                } else {
                  if (im.field_ic[param2] != null) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= ((uf) this).field_I.field_n) {
                        L4: {
                          var11_ref_String = ((uf) this).field_I.field_f.a(1, ((uf) this).field_i);
                          if (null == var11_ref_String) {
                            break L4;
                          } else {
                            var10 = (Object) (Object) gj.a(true, 0, im.field_ic[param2], var11_ref_String);
                            break L4;
                          }
                        }
                        break L2;
                      } else {
                        String discarded$3 = this.e(-30360, var11);
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
              ((uf) this).field_S = 200;
              if (var10 != null) {
                ((ij) var10).field_B = 250;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 != (hq.field_c & ((uf) this).field_L)) {
                break L6;
              } else {
                this.c((byte) -102);
                break L6;
              }
            }
            L7: {
              L8: {
                if ((hq.field_c & ((uf) this).field_L) == 0) {
                  break L8;
                } else {
                  if (-2 != ((uf) this).field_db) {
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
                var11_ref_al = ((uf) this).field_I;
                f.field_g = 0;
                var12_ref_al = var11_ref_al;
                pq.field_B = new pq[][]{};
                var13 = 0;
                L10: while (true) {
                  if (~pq.field_B.length >= ~var13) {
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
                    pq.field_B[var13] = new pq[var12_ref_al.field_l.length];
                    var14 = 0;
                    L12: while (true) {
                      if (~pq.field_B[var13].length >= ~var14) {
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
                var11_ref_al = ((uf) this).field_I;
                f.field_g = 12;
                var12_ref_al = var11_ref_al;
                pq.field_B = new pq[12][];
                var13 = 0;
                L13: while (true) {
                  if (var13 >= pq.field_B.length) {
                    rb.field_e = new ar[12 * pq.field_B.length];
                    var13 = 0;
                    L14: while (true) {
                      if (~var13 <= ~rb.field_e.length) {
                        wh.field_g = 0;
                        break L9;
                      } else {
                        rb.field_e[var13] = new ar();
                        var13++;
                        continue L14;
                      }
                    }
                  } else {
                    pq.field_B[var13] = new pq[var12_ref_al.field_l.length];
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
              var11 = ((uf) this).field_I.j(97).field_M;
              var12 = f.field_g;
              if (null != pq.field_B) {
                stackOut_70_0 = pq.field_B.length;
                stackIn_71_0 = stackOut_70_0;
                break L16;
              } else {
                stackOut_68_0 = 0;
                stackIn_71_0 = stackOut_68_0;
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
              field_fb = 998899712 + (var15 << 16);
              if ((((uf) this).field_L & hq.field_c) == 0) {
                break L17;
              } else {
                ((uf) this).field_b = new kj();
                break L17;
              }
            }
            ((uf) this).a(-23095);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var10 = (Object) (Object) decompiledCaughtException;
            stackOut_76_0 = var10;
            stackOut_76_1 = new StringBuilder().append("uf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param6 == null) {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L18;
            } else {
              stackOut_77_0 = stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L18;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    uf(hq param0, String[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
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
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
        ((uf) this).field_h = 0;
        ((uf) this).field_Y = false;
        ((uf) this).field_kb = false;
        ((uf) this).field_d = 0;
        ((uf) this).field_V = -1;
        ((uf) this).field_m = 0;
        ((uf) this).field_T = false;
        ((uf) this).field_p = -1;
        ((uf) this).field_e = -1;
        ((uf) this).field_k = -1;
        ((uf) this).field_t = 0;
        ((uf) this).field_H = false;
        ((uf) this).field_g = -1;
        ((uf) this).field_Q = 0;
        ((uf) this).field_j = false;
        ((uf) this).field_N = -1;
        ((uf) this).field_A = 0;
        ((uf) this).field_u = 0;
        ((uf) this).field_f = 57;
        ((uf) this).field_l = 0;
        ((uf) this).field_q = false;
        ((uf) this).field_Z = 0;
        ((uf) this).field_eb = new mm();
        ((uf) this).field_O = new mm();
        ((uf) this).field_o = 0;
        ((uf) this).field_ab = new int[12];
        ((uf) this).field_a = 500;
        ((uf) this).field_R = -1;
        ((uf) this).field_D = true;
        ((uf) this).field_M = -1;
        ((uf) this).field_v = -1;
        ((uf) this).field_C = 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (hq.field_i < 2) {
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
            ((uf) this).field_bb = stackIn_4_1 != 0;
            ((uf) this).field_db = 0;
            ((uf) this).field_L = sk.field_d;
            ((uf) this).a(76, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("uf.<init>(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Press <img=4> to leave shot mode for top-view.";
        field_J = "Type your age in years";
        field_X = 0;
        field_K = "Mouse Y-axis: Normal";
        field_fb = 0;
        field_y = new byte[1000][];
    }
}
