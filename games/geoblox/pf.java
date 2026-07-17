/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class pf extends ee implements ga, pl {
    private String field_L;
    static rh field_O;
    private dj field_P;
    private boolean field_C;
    private hk field_G;
    private static gk field_K;
    static boolean field_D;
    private boolean field_I;
    private hk field_M;
    private dj field_J;
    private hk field_E;
    static String field_H;
    private boolean field_N;

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param0 == -123) {
            break L0;
          } else {
            var3 = null;
            pf.a(-108, (pk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 48) {
                break L3;
              } else {
                if (param1 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 65) {
                break L4;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 < 97) {
                break L5;
              } else {
                if (param1 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ea var4_ref_ea = null;
        int var4 = 0;
        se var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var9 = eh.field_d;
              var2 = var9.c((byte) 34);
              var3 = var9.c((byte) 34);
              if (0 != var2) {
                if (var2 != 1) {
                  gi.a((Throwable) null, "LR1: " + og.e(55), (byte) 125);
                  jl.a((byte) -123);
                  break L1;
                } else {
                  var4 = var9.h(76);
                  var5 = (se) (Object) sj.field_g.g(0);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.field_g != var3) {
                            break L4;
                          } else {
                            if (var5.field_j != var4) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = (se) (Object) sj.field_g.d(1);
                        continue L2;
                      }
                    }
                    if (var5 != null) {
                      var5.a(false);
                      break L1;
                    } else {
                      jl.a((byte) -116);
                      return;
                    }
                  }
                }
              } else {
                var4_ref_ea = (ea) (Object) ea.field_g.g(0);
                if (var4_ref_ea != null) {
                  L5: {
                    var5_int = -var9.field_f + p.field_k;
                    var13 = var4_ref_ea.field_h;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5_int <= var13.length << 2) {
                      break L5;
                    } else {
                      var5_int = var13.length << 2;
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var5_int <= var7) {
                      var4_ref_ea.a(false);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.c((byte) 34) << cd.a(var7 << 8, 768));
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  jl.a((byte) -116);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "pf.K(" + -103 + 41);
        }
    }

    public static void a(byte param0) {
        field_H = null;
        field_K = null;
        field_O = null;
        if (param0 >= -18) {
            pf.a((byte) -108);
        }
    }

    public final void a(dj param0, int param1) {
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
              if (param0 != ((pf) this).field_J) {
                break L1;
              } else {
                boolean discarded$2 = ((pf) this).field_P.a((byte) -69, (el) this);
                break L1;
              }
            }
            L2: {
              if (((pf) this).field_P == param0) {
                this.g(param1 ^ -18649);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == -18649) {
                break L3;
              } else {
                field_O = null;
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
            stackOut_8_1 = new StringBuilder().append("pf.S(");
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void a(String param0, int param1) {
        dj var3 = null;
        String var4 = null;
        try {
            var3 = ((pf) this).field_J;
            var4 = param0;
            var3.a(param1 ^ 2, var4, false);
            if (param1 != 0) {
                ((pf) this).i(114);
            }
            ((pf) this).field_P.i((byte) 110);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pf.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((pf) this).field_L == null)) {
            int discarded$0 = ng.field_F.a(((pf) this).field_L, ((pf) this).field_v + param0 - -20, 15 + ((pf) this).field_m + param1, -40 + ((pf) this).field_r, ((pf) this).field_h, 16777215, -1, 1, 0, ng.field_F.field_o);
        }
        if (null != ((pf) this).field_M) {
            vb.c(10 + param0, 134 + param1, -20 + ((pf) this).field_r, 4210752);
        }
        int var5 = 20 / ((param2 - 1) / 43);
        super.a(param0, param1, (byte) -48, param3);
    }

    public final void a(dj param0, byte param1) {
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
              if (param1 == 74) {
                break L1;
              } else {
                field_H = null;
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
            stackOut_3_1 = new StringBuilder().append("pf.J(");
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param0) {
                if (param0 == 99) {
                  stackOut_8_0 = ((pf) this).a(param3, -109);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((pf) this).a(7305, param3);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("pf.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final String h(int param0) {
        if (null == ((pf) this).field_J.field_s) {
            return "";
        }
        if (param0 < 62) {
            Object var3 = null;
            boolean discarded$0 = ((pf) this).a(28, 70, '"', (el) null);
        }
        return ((pf) this).field_J.field_s;
    }

    final static int a(int param0, int param1, mb param2, mb param3, String param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        CharSequence var14 = null;
        int stackIn_4_0 = 0;
        qc stackIn_8_0 = null;
        qc stackIn_9_0 = null;
        qc stackIn_10_0 = null;
        String stackIn_10_1 = null;
        qc stackIn_11_0 = null;
        qc stackIn_12_0 = null;
        qc stackIn_13_0 = null;
        String stackIn_13_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        qc stackOut_7_0 = null;
        qc stackOut_9_0 = null;
        String stackOut_9_1 = null;
        qc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        qc stackOut_10_0 = null;
        qc stackOut_12_0 = null;
        String stackOut_12_1 = null;
        qc stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_30_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        try {
          L0: {
            L1: {
              var13 = param2.b(16925);
              var8 = param3.b(16925);
              if (oc.field_e != null) {
                break L1;
              } else {
                if (!w.a(false, 52)) {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (gi.field_d != pk.field_l) {
                break L2;
              } else {
                L3: {
                  fj.field_q.field_f = 0;
                  fi.field_b = null;
                  if (param4 != null) {
                    L4: {
                      var9 = 0;
                      fc.field_d.field_f = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      fc.field_d.c((byte) 95, bh.field_d.nextInt());
                      fc.field_d.c((byte) 95, bh.field_d.nextInt());
                      fc.field_d.a(var13, (byte) -126);
                      fc.field_d.a(var8, (byte) -126);
                      var14 = (CharSequence) (Object) param4;
                      fc.field_d.a(sl.a(var14, 48), (byte) -126);
                      fc.field_d.e(param0, 28695);
                      fc.field_d.d((byte) -94, param1);
                      fc.field_d.d((byte) 123, var9);
                      fj.field_q.d((byte) 127, 18);
                      fj.field_q.field_f = fj.field_q.field_f + 2;
                      var10 = fj.field_q.field_f;
                      var11_ref_String = s.a(-1, k.c(105));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    fj.field_q.a(var11_ref_String, 0);
                    el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
                    fj.field_q.a(-var10 + fj.field_q.field_f, true);
                    break L3;
                  } else {
                    L6: {
                      fc.field_d.field_f = 0;
                      fc.field_d.c((byte) 95, bh.field_d.nextInt());
                      fc.field_d.c((byte) 95, bh.field_d.nextInt());
                      stackOut_7_0 = fc.field_d;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (!param2.a((byte) 97)) {
                        stackOut_9_0 = (qc) (Object) stackIn_9_0;
                        stackOut_9_1 = "";
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L6;
                      } else {
                        stackOut_8_0 = (qc) (Object) stackIn_8_0;
                        stackOut_8_1 = (String) var13;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L6;
                      }
                    }
                    L7: {
                      ((qc) (Object) stackIn_10_0).a(stackIn_10_1, (byte) -126);
                      stackOut_10_0 = fc.field_d;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (!param3.a((byte) 126)) {
                        stackOut_12_0 = (qc) (Object) stackIn_12_0;
                        stackOut_12_1 = "";
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L7;
                      } else {
                        stackOut_11_0 = (qc) (Object) stackIn_11_0;
                        stackOut_11_1 = (String) var8;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L7;
                      }
                    }
                    ((qc) (Object) stackIn_13_0).a(stackIn_13_1, (byte) -126);
                    fj.field_q.d((byte) 124, 16);
                    fj.field_q.field_f = fj.field_q.field_f + 1;
                    var9 = fj.field_q.field_f;
                    el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
                    fj.field_q.f(11700, fj.field_q.field_f - var9);
                    break L3;
                  }
                }
                cm.a(-1, -1);
                pk.field_l = field_K;
                break L2;
              }
            }
            L8: {
              if (field_K == pk.field_l) {
                if (el.b(30000, 1)) {
                  L9: {
                    var9 = eh.field_d.c((byte) 34);
                    eh.field_d.field_f = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        pk.field_l = v.field_l;
                        si.field_i = new String[var9 - 100];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if (99 != var9) {
                      pk.field_l = qh.field_F;
                      p.field_k = -1;
                      me.field_l = var9;
                      break L8;
                    } else {
                      boolean discarded$1 = el.b(30000, rc.d(112));
                      fi.field_b = new Boolean(jl.a((qc) (Object) eh.field_d, 0));
                      eh.field_d.field_f = 0;
                      break L8;
                    }
                  } else {
                    sj.a(k.c(124), (byte) 123);
                    kh.field_a = ph.field_k;
                    jl.a((byte) -124);
                    ck.field_e = false;
                    stackOut_30_0 = var9;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (pk.field_l == v.field_l) {
                var9 = 2;
                if (el.b(30000, var9)) {
                  var10 = eh.field_d.b(true);
                  eh.field_d.field_f = 0;
                  if (!el.b(30000, var10)) {
                    break L10;
                  } else {
                    var11 = si.field_i.length;
                    var12 = 0;
                    L11: while (true) {
                      if (~var12 <= ~var11) {
                        jl.a((byte) -114);
                        ck.field_e = false;
                        stackOut_44_0 = var11 + 100;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        si.field_i[var12] = eh.field_d.f(27425);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (pk.field_l != qh.field_F) {
                break L12;
              } else {
                if (nf.a(false)) {
                  L13: {
                    if (me.field_l != 255) {
                      kh.field_a = eh.field_d.e((byte) 98);
                      break L13;
                    } else {
                      var9_ref_String = eh.field_d.i((byte) 53);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        tc.a(-128, var9_ref_String, k.c(106));
                        break L13;
                      }
                    }
                  }
                  jl.a((byte) -114);
                  ck.field_e = false;
                  stackOut_53_0 = me.field_l;
                  stackIn_54_0 = stackOut_53_0;
                  return stackIn_54_0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (param6 >= 56) {
                break L14;
              } else {
                field_K = null;
                break L14;
              }
            }
            L15: {
              if (oc.field_e != null) {
                break L15;
              } else {
                if (!ck.field_e) {
                  var9 = sd.field_x;
                  sd.field_x = ac.field_s;
                  ck.field_e = true;
                  ac.field_s = var9;
                  break L15;
                } else {
                  L16: {
                    if (ll.a((byte) 12) <= 30000L) {
                      kh.field_a = uj.field_e;
                      break L16;
                    } else {
                      kh.field_a = hf.field_e;
                      break L16;
                    }
                  }
                  ck.field_e = false;
                  stackOut_62_0 = 249;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                }
              }
            }
            stackOut_65_0 = -1;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("pf.N(").append(param0).append(44).append(param1).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L17;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L17;
            }
          }
          L18: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L18;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L18;
            }
          }
          L19: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L19;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L19;
            }
          }
          throw t.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_66_0;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
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
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param1 == -20) {
                break L1;
              } else {
                ((pf) this).field_E = null;
                break L1;
              }
            }
            L2: {
              if (((pf) this).field_E == param4) {
                this.g(0);
                break L2;
              } else {
                if (((pf) this).field_M == param4) {
                  jf.a((byte) 108);
                  break L2;
                } else {
                  if (((pf) this).field_G == param4) {
                    if (!((pf) this).field_N) {
                      if (!((pf) this).field_I) {
                        hg.b(param1 + -23718);
                        break L2;
                      } else {
                        qc.g(0);
                        break L2;
                      }
                    } else {
                      sd.h(param1 ^ -60);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("pf.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
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
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void a(int param0, pk param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            eg var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            eg var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            try {
              L0: {
                var13 = (eg) (Object) sl.field_k.g(0);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var4 = 2 % ((param0 - -26) / 62);
                  var3 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var17.field_f) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var5 = param1.field_f;
                        param1.c((byte) 95, var17.field_m);
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var17.field_f) {
                            int discarded$1 = param1.d(8, var5);
                            var17.a(false);
                            break L0;
                          } else {
                            L3: {
                              if (var13.field_j[var6] != 0) {
                                param1.d((byte) 6, var13.field_j[var6]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var13.field_k[var6];
                                      if (var7_int == 0) {
                                        var15 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                        var9 = var15.getInt((Object) null);
                                        param1.d((byte) 3, 0);
                                        param1.c((byte) 95, var9);
                                        break L5;
                                      } else {
                                        if (var7_int == 1) {
                                          var14 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                          var8 = var14;
                                          var14.setInt((Object) null, var13.field_g[var6]);
                                          param1.d((byte) 124, 0);
                                          break L5;
                                        } else {
                                          if (2 == var7_int) {
                                            var25 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                            var9 = var25.getModifiers();
                                            param1.d((byte) 126, 0);
                                            param1.c((byte) 95, var9);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var7_int == 3) {
                                        var27 = (java.lang.reflect.Method) var13.field_i[var6].field_b;
                                        var24 = var13.field_o[var6];
                                        var10 = new Object[var24.length];
                                        var11_int = 0;
                                        L7: while (true) {
                                          if (var11_int >= var24.length) {
                                            var11 = var27.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (!(var11 instanceof Number)) {
                                                if (var11 instanceof String) {
                                                  param1.d((byte) 121, 2);
                                                  param1.a((String) var11, 0);
                                                  break L6;
                                                } else {
                                                  param1.d((byte) -86, 4);
                                                  break L6;
                                                }
                                              } else {
                                                param1.d((byte) 126, 1);
                                                param1.b((byte) 116, ((Number) var11).longValue());
                                                break L6;
                                              }
                                            } else {
                                              param1.d((byte) -88, 0);
                                              break L6;
                                            }
                                          } else {
                                            var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var24[var11_int]));
                                            var10[var11_int] = var12.readObject();
                                            var11_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var7_int != 4) {
                                          break L6;
                                        } else {
                                          var26 = (java.lang.reflect.Method) var13.field_i[var6].field_b;
                                          var9 = var26.getModifiers();
                                          param1.d((byte) 123, 0);
                                          param1.c((byte) 95, var9);
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.d((byte) 4, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.d((byte) 11, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.d((byte) -127, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.d((byte) 121, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.d((byte) -100, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.d((byte) -74, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var7_ref11 = decompiledCaughtException;
                                    param1.d((byte) -37, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L20: {
                        if (var13.field_n[var5] != null) {
                          L21: {
                            if (var13.field_n[var5].field_a != 2) {
                              break L21;
                            } else {
                              var13.field_j[var5] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_n[var5].field_a != 0) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var13.field_i[var5] != null) {
                          L23: {
                            if (2 == var13.field_i[var5].field_a) {
                              var13.field_j[var5] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (var13.field_i[var5].field_a == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_65_0 = (RuntimeException) var2;
                stackOut_65_1 = new StringBuilder().append("pf.M(").append(param0).append(44);
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param1 == null) {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "null";
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L24;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L24;
                }
              }
              throw t.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        L0: {
          L1: {
            if (wh.e(param0)) {
              break L1;
            } else {
              if (((pf) this).field_J.field_s.length() <= 0) {
                break L0;
              } else {
                if (0 < ((pf) this).field_P.field_s.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ef.a(((pf) this).field_P.field_s, (byte) 66, ((pf) this).field_J.field_s);
          break L0;
        }
    }

    pf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (dh) null);
        RuntimeException var6 = null;
        ml var6_ref = null;
        m var7 = null;
        String var8 = null;
        od var9 = null;
        hd var12 = null;
        hd var13 = null;
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
        hk stackIn_17_1 = null;
        hk stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hk stackIn_18_1 = null;
        hk stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        hk stackIn_19_1 = null;
        hk stackIn_19_2 = null;
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
        hk stackOut_16_1 = null;
        hk stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        hk stackOut_18_1 = null;
        hk stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        hk stackOut_17_1 = null;
        hk stackOut_17_2 = null;
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
              ((pf) this).field_C = stackIn_4_1 != 0;
              ((pf) this).field_L = param1;
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
              ((pf) this).field_N = stackIn_7_1 != 0;
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
              ((pf) this).field_I = stackIn_10_1 != 0;
              if (!((pf) this).field_N) {
                break L4;
              } else {
                L5: {
                  if (((pf) this).field_C) {
                    break L5;
                  } else {
                    if (!((pf) this).field_I) {
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
              ((pf) this).field_J = (dj) (Object) new hc(param0, (bb) this, 100);
              ((pf) this).field_P = (dj) (Object) new hc("", (bb) this, 20);
              if (!((pf) this).field_N) {
                L7: {
                  ((pf) this).field_E = new hk(k.field_k, (bb) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((pf) this).field_I) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = ok.field_d;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = ll.field_b;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((pf) this).field_G = new hk(stackIn_19_3, (bb) null);
                if (!((pf) this).field_C) {
                  break L6;
                } else {
                  ((pf) this).field_M = new hk(se.field_m, (bb) this);
                  break L6;
                }
              } else {
                ((pf) this).field_E = new hk(a.field_b, (bb) null);
                ((pf) this).field_G = new hk(rj.field_e, (bb) null);
                ((pf) this).field_J.field_D = false;
                break L6;
              }
            }
            L8: {
              ((pf) this).field_J.field_q = (dh) (Object) new ac(10000536);
              ((pf) this).field_P.field_q = (dh) (Object) new uh(10000536);
              var6_ref = new ml();
              ((pf) this).field_E.field_q = (dh) (Object) var6_ref;
              if (((pf) this).field_G == null) {
                break L8;
              } else {
                ((pf) this).field_G.field_q = (dh) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((pf) this).field_M == null) {
                break L9;
              } else {
                ((pf) this).field_M.field_q = (dh) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((pf) this).field_J.field_j = kk.field_v;
              if (null == ((pf) this).field_M) {
                break L10;
              } else {
                ((pf) this).field_M.field_j = ic.field_b;
                break L10;
              }
            }
            L11: {
              if (((pf) this).field_N) {
                ((pf) this).field_G.field_j = j.field_jb;
                break L11;
              } else {
                if (!((pf) this).field_I) {
                  ((pf) this).field_G.field_q = (dh) (Object) new fh();
                  break L11;
                } else {
                  ((pf) this).field_G.field_j = vi.field_F;
                  ((pf) this).field_G.field_q = (dh) (Object) new fh();
                  break L11;
                }
              }
            }
            L12: {
              ((pf) this).field_m = 15;
              var7 = ng.field_F;
              if (((pf) this).field_L == null) {
                break L12;
              } else {
                ((pf) this).field_m = ((pf) this).field_m + (var7.b(((pf) this).field_L, ((pf) this).field_r + -40, var7.field_o) + 5);
                break L12;
              }
            }
            L13: {
              var8 = jj.field_c;
              var9 = th.a(k.c(120), 200);
              if (var9 != mb.field_b) {
                if (var9 != rl.field_W) {
                  break L13;
                } else {
                  var8 = bk.field_c;
                  break L13;
                }
              } else {
                var8 = sl.field_b;
                break L13;
              }
            }
            L14: {
              hd dupTemp$2 = new hd(10, ((pf) this).field_m, -20 + ((pf) this).field_r, 25, (el) (Object) ((pf) this).field_J, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((pf) this).b((byte) -110, (el) (Object) dupTemp$2);
              ((pf) this).field_m = ((pf) this).field_m + (((el) (Object) var12).field_h - -5);
              hd dupTemp$3 = new hd(10, ((pf) this).field_m, ((pf) this).field_r + -20, 25, (el) (Object) ((pf) this).field_P, false, 80, 3, var7, 16777215, qg.field_b);
              var13 = dupTemp$3;
              ((pf) this).b((byte) -120, (el) (Object) dupTemp$3);
              ((pf) this).field_E.field_u = (bb) this;
              ((pf) this).field_m = ((pf) this).field_m + (((el) (Object) var13).field_h - -5);
              if (((pf) this).field_M == null) {
                break L14;
              } else {
                ((pf) this).field_M.field_u = (bb) this;
                break L14;
              }
            }
            L15: {
              if (((pf) this).field_G == null) {
                break L15;
              } else {
                ((pf) this).field_G.field_u = (bb) this;
                break L15;
              }
            }
            L16: {
              if (((pf) this).field_M != null) {
                ((pf) this).field_E.a(30, ((pf) this).field_r - 95, (byte) -92, ((pf) this).field_m, 85);
                ((pf) this).field_m = ((pf) this).field_m + 60;
                break L16;
              } else {
                ((pf) this).field_E.a(30, -10 + ((pf) this).field_r + -6, (byte) -33, ((pf) this).field_m, 8);
                ((pf) this).field_m = ((pf) this).field_m + 35;
                break L16;
              }
            }
            L17: {
              if (((pf) this).field_M == null) {
                break L17;
              } else {
                ((pf) this).field_M.a(30, -10 + ((pf) this).field_r - 6, (byte) -42, ((pf) this).field_m, 8);
                ((pf) this).field_m = ((pf) this).field_m + 35;
                break L17;
              }
            }
            L18: {
              if (((pf) this).field_G == null) {
                break L18;
              } else {
                L19: {
                  if (((pf) this).field_N) {
                    break L19;
                  } else {
                    if (((pf) this).field_I) {
                      break L19;
                    } else {
                      ((pf) this).field_G.a(20, 40, (byte) -55, ((pf) this).field_m, 8);
                      ((pf) this).field_m = ((pf) this).field_m + 25;
                      break L18;
                    }
                  }
                }
                ((pf) this).field_G.a(30, -10 + (((pf) this).field_r - 6), (byte) -64, ((pf) this).field_m, 8);
                ((pf) this).field_m = ((pf) this).field_m + 35;
                break L18;
              }
            }
            L20: {
              ((pf) this).a(3 + ((pf) this).field_m, ((pf) this).field_r, (byte) -17, 0, 0);
              ((pf) this).b((byte) -83, (el) (Object) ((pf) this).field_E);
              if (null == ((pf) this).field_M) {
                break L20;
              } else {
                ((pf) this).b((byte) -111, (el) (Object) ((pf) this).field_M);
                break L20;
              }
            }
            L21: {
              if (((pf) this).field_G == null) {
                break L21;
              } else {
                ((pf) this).b((byte) -127, (el) (Object) ((pf) this).field_G);
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
            stackOut_57_1 = new StringBuilder().append("pf.<init>(");
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
          throw t.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static mb h(byte param0) {
        if (param0 != -42) {
            mb discarded$0 = pf.h((byte) -98);
        }
        return new mb(vh.f(100), jg.d(7));
    }

    final void i(int param0) {
        ((pf) this).field_J.i((byte) 48);
        ((pf) this).field_P.i((byte) 116);
        int var2 = 40 % ((param0 - 17) / 38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = false;
        field_H = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_K = new gk();
    }
}
