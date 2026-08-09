/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends wm {
    private String field_t;
    static vj field_r;
    static String field_u;
    static ud[] field_v;
    static int field_p;
    static ck field_q;
    private boolean field_s;

    jm(rk param0) {
        super(param0);
        this.field_s = false;
    }

    final tb b(String param0, byte param1) {
        cd var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        tb stackIn_5_0 = null;
        tb stackIn_12_0 = null;
        tb stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -40) {
                break L1;
              } else {
                var4 = (String) null;
                jm.a('�', (String) null, (String) null, 32);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            if (!rd.a(var5, param1 ^ 27418)) {
              stackIn_5_0 = vm.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_t)) {
                  L3: {
                    var3 = f.a(param1 + -11039, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_f) {
                        this.field_s = var3.field_n;
                        this.field_t = param0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_12_0 = jb.field_j;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_s) {
                  stackIn_17_0 = dc.field_b;
                  break L4;
                } else {
                  stackIn_17_0 = vm.field_u;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("jm.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            this.field_s = true;
            this.field_t = null;
            return;
        }
        this.field_t = null;
    }

    final static void a(int param0, boolean param1) {
        String var3;
        if (param0 == 0) {
          if (ph.n(-30146)) {
            wj.a(0, -80, true, 2, param1, bc.field_K);
            if (client.field_A) {
              we.field_b.f(9, -4);
              mn.field_c = true;
              ef.field_N = dl.field_M;
              return;
            } else {
              return;
            }
          } else {
            we.field_b.f(9, -4);
            mn.field_c = true;
            ef.field_N = dl.field_M;
            return;
          }
        } else {
          var3 = (String) null;
          jm.a('_', (String) null, (String) null, -55);
          if (ph.n(-30146)) {
            wj.a(0, -80, true, 2, param1, bc.field_K);
            if (!client.field_A) {
              return;
            } else {
              we.field_b.f(9, -4);
              mn.field_c = true;
              ef.field_N = dl.field_M;
              return;
            }
          } else {
            we.field_b.f(9, -4);
            mn.field_c = true;
            ef.field_N = dl.field_M;
            return;
          }
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        cd var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = ij.a(5, var5);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0.equals(this.field_t)) {
                  var4 = f.a(param1 + -11068, param0);
                  if (var4 != null) {
                    if (null == var4.field_f) {
                      this.field_t = param0;
                      this.field_s = var4.field_n;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == -11) {
                  break L2;
                } else {
                  jm.a(109, false);
                  break L2;
                }
              }
              if (this.field_s) {
                stackIn_18_0 = ed.field_e;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_16_0 = of.field_g;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("jm.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_r = null;
        field_u = null;
        if (param0 <= 41) {
            field_q = (ck) null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.length();
                        var5 = param2.length();
                        var6 = var4_int;
                        var7 = -1 + var5;
                        if ((var7 ^ -1) == param3) {
                            statePc = 5;
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
                        var8_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = param1.indexOf((int) param0, var8_int);
                        if (-1 < (var8_int ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = var6 + var7;
                        var8_int++;
                        if (var11 == 0) {
                            statePc = 3;
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
                        var8 = new StringBuilder(var6);
                        var9 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = param1.indexOf((int) param0, var9);
                        if ((var10 ^ -1) > -1) {
                            statePc = 10;
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
                        discarded$3 = var8.append(param1.substring(var9, var10));
                        var9 = 1 + var10;
                        discarded$4 = var8.append(param2);
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        discarded$5 = var8.append(param1.substring(var9));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = var8.toString();
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var4);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("jm.L(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, fm param1, int param2, byte param3, boolean param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              pd.field_h[0] = gg.field_A.nextInt();
              pd.field_h[1] = gg.field_A.nextInt();
              pd.field_h[2] = (int)(lc.field_j >> -457716384);
              vi.field_A.field_n = 0;
              pd.field_h[3] = (int)lc.field_j;
              vi.field_A.a(pd.field_h[0], false);
              vi.field_A.a(pd.field_h[1], false);
              if (param3 >= 123) {
                break L1;
              } else {
                jm.e(2);
                break L1;
              }
            }
            L2: {
              vi.field_A.a(pd.field_h[2], false);
              vi.field_A.a(pd.field_h[3], false);
              i.a(vi.field_A, 0);
              vi.field_A.d(-1, param2);
              param1.a(vi.field_A, (byte) 124);
              we.field_b.field_n = 0;
              if (!param0) {
                we.field_b.a(true, 16);
                break L2;
              } else {
                we.field_b.a(true, 18);
                if (!client.field_A) {
                  break L2;
                } else {
                  we.field_b.a(true, 16);
                  break L2;
                }
              }
            }
            L3: {
              we.field_b.field_n = we.field_b.field_n + 2;
              var5_int = we.field_b.field_n;
              we.field_b.a(re.field_v, false);
              we.field_b.a(rm.field_c, (byte) 0);
              var6 = 0;
              if (ce.field_w) {
                var6 = var6 | 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ci.field_c) {
                var6 = var6 | 4;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!param4) {
                break L5;
              } else {
                var6 = var6 | 8;
                break L5;
              }
            }
            L6: {
              if (null == vh.field_f) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              we.field_b.a(true, var6);
              var7 = a.a(se.h(25144), (byte) 114);
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              we.field_b.a(0, var7);
              if (vh.field_f != null) {
                we.field_b.b(8, vh.field_f);
                break L8;
              } else {
                break L8;
              }
            }
            re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
            we.field_b.b(true, we.field_b.field_n - var5_int);
            wj.c(4792, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("jm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = new vj();
        field_v = new ud[4];
        field_p = 0;
    }
}
