/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends jd {
    static int[] field_j;
    static String field_k;
    private ga field_n;
    private ga field_o;
    static String field_m;
    static boolean field_l;

    private final boolean b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var3 = this.field_o.field_q.toLowerCase();
            if (param1 <= -60) {
              L1: {
                var4 = param0.toLowerCase();
                if (0 >= var3.length()) {
                  break L1;
                } else {
                  if (0 >= var4.length()) {
                    break L1;
                  } else {
                    var5 = var3.lastIndexOf("@");
                    if ((var5 ^ -1) > -1) {
                      break L1;
                    } else {
                      if (var3.length() - 1 > var5) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(1 + var5);
                        if ((var4.indexOf(var6) ^ -1) > -1) {
                          L2: {
                            if (0 <= var4.indexOf(var7)) {
                              stackOut_13_0 = 1;
                              stackIn_14_0 = stackOut_13_0;
                              break L2;
                            } else {
                              stackOut_12_0 = 0;
                              stackIn_14_0 = stackOut_12_0;
                              break L2;
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("lo.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    lo(ga param0, ga param1, ga param2) {
        super(param0);
        try {
            this.field_n = param1;
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != -96) {
            lo.a(32, -1, 38, -7, 52, false);
        }
        field_k = null;
        field_m = null;
        field_j = null;
    }

    final rv a(String param0, int param1) {
        boolean discarded$2 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        rv stackIn_5_0 = null;
        rv stackIn_9_0 = null;
        rv stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rv stackOut_4_0 = null;
        rv stackOut_8_0 = null;
        rv stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = this.b((String) null, (byte) -69);
                break L1;
              }
            }
            var3 = this.field_n.field_q.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 == (var4.length() ^ -1)) {
              stackOut_4_0 = jt.field_Bb;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!bi.a(var4, param1 + -32336, var3)) {
                stackOut_8_0 = jt.field_Bb;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.b(param0, (byte) -77)) {
                  stackOut_12_0 = jt.field_Bb;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return he.field_yb;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("lo.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (gv.field_h != param2) {
                break L1;
              } else {
                if (param1 != jr.field_Kb) {
                  break L1;
                } else {
                  if (wi.field_C != param3) {
                    break L1;
                  } else {
                    if (param4 != gb.field_K) {
                      break L1;
                    } else {
                      if (rg.field_f != param5) {
                        break L1;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            L2: {
              gb.field_K = param4;
              gv.field_h = param2;
              wi.field_C = param3;
              if (!param5) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
            }
            L3: {
              rg.field_f = stackIn_11_0 != 0;
              jr.field_Kb = param1;
              var6_int = (100 * jr.field_Kb >> -1579258584) + 50;
              var7 = (116 * gv.field_h >> -1028605144) + 40;
              iw.a(-68, wn.field_j);
              on.b();
              pt.a(var7, -22914, 0, on.field_f, 0);
              tn.field_e.a(0, 0, tn.field_e.field_o * var7 / 140, tn.field_e.field_v);
              ta.e(124);
              pt.a(on.field_g, -22914, var7, on.field_f, 0);
              tn.field_e.d(-140 + var7, 0);
              ta.e(param0 + -706856552);
              if (rg.field_f) {
                var8 = 0;
                L4: while (true) {
                  if (on.field_a.length <= var8) {
                    break L3;
                  } else {
                    on.field_a[var8] = (var6_int * on.field_a[var8] >> 1910864744) * 65793;
                    var8++;
                    continue L4;
                  }
                }
              } else {
                var8 = 0;
                L5: while (true) {
                  if (var8 >= on.field_a.length) {
                    break L3;
                  } else {
                    on.field_a[var8] = 16777215 + -(257 * (var6_int * on.field_a[var8] >> 1770599784));
                    var8++;
                    continue L5;
                  }
                }
              }
            }
            L6: {
              ta.e(121);
              iw.a(65, iw.field_g);
              on.b();
              var8 = uv.b(-gb.field_K, wi.field_C, (byte) 2);
              if (param0 == 706856675) {
                break L6;
              } else {
                field_j = (int[]) null;
                break L6;
              }
            }
            var9 = wn.field_j.field_o;
            sa.field_e = -(var9 * we.a(var8, false)) >> 800626257;
            lr.field_m = var9 * ei.a(var8, (byte) -23) >> -1204910319;
            wn.field_j.a(wn.field_j.field_o << 534975331, wn.field_j.field_v << 706856675, on.field_g << 1491629315, on.field_f << -1672132157, var8 << -1837277181, 4096);
            ta.e(118);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var6), "lo.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
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
              var2 = param1.getParameter("username");
              if (param0 <= -78) {
                break L1;
              } else {
                lo.a(110, 93, 93);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if ((jc.a(var3, false) ^ -1L) != -1L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("lo.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static he a(long param0, boolean param1) {
        if (param1) {
            field_j = (int[]) null;
        }
        return (he) ((Object) pq.field_N.a(-3611, param0));
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte param4) {
        he discarded$0 = null;
        if (param4 != -55) {
            discarded$0 = lo.a(124L, false);
        }
        int var5 = (int)(nj.a(-62) % 2000L * 100L) / 2000;
        var5 = (var5 - -(param0 * 100 >> 1946682832)) % 100;
        ut var6 = lt.field_c[var5];
        if (!param3) {
            var6.c(-(var6.field_o >> -2078193791) + param1, -(var6.field_v >> 1581116417) + param2);
        } else {
            var6.f(param1 + -(var6.field_o >> 1990978049), param2 - (var6.field_v >> 680860993));
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_14_0 = null;
        String stackOut_31_0 = null;
        String stackOut_25_0 = null;
        String stackOut_29_0 = null;
        String stackOut_21_0 = null;
        String stackOut_17_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var6 = this.field_n.field_q.toLowerCase();
              var4 = param1.toLowerCase();
              if (param0 == 25) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            if (var4.length() != 0) {
              var5 = var4;
              if (lg.a(var5, (byte) 79)) {
                stackOut_7_0 = b.field_M;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!hf.a(var5, -3)) {
                  if (qe.a(true, var5)) {
                    stackOut_14_0 = tq.field_D;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (!this.b(param1, (byte) -67)) {
                      if (0 >= var6.length()) {
                        stackOut_31_0 = jq.field_c;
                        stackIn_32_0 = stackOut_31_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (!j.a((byte) 71, var6, var5)) {
                          if (uj.a(68, var5, var6)) {
                            stackOut_25_0 = js.field_f;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (lj.a((byte) 69, var6, var5)) {
                              stackOut_29_0 = we.field_b;
                              stackIn_30_0 = stackOut_29_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              return b.field_M;
                            }
                          }
                        } else {
                          stackOut_21_0 = we.field_b;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_17_0 = no.field_G;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackOut_10_0 = ua.field_h;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("lo.A(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L2;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_30_0;
                    } else {
                      return stackIn_32_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        uo var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uo var11 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var11 = pb.field_C;
            var3_ref = var11;
            if (param2 > 44) {
              var4 = Math.max(((hu) ((Object) var11)).a(ns.field_d[0]), Math.max(((hu) ((Object) var11)).a(ns.field_d[3]), ((hu) ((Object) var11)).a(ns.field_d[4]))) + 20;
              var5 = Math.max(((hu) ((Object) var11)).a(ns.field_d[1]), ((hu) ((Object) var11)).a(ns.field_d[2])) + 20;
              var6 = var5 + var5 + var4;
              var7 = -(var6 >> 2031871105) + param1;
              var8 = -34 + param0;
              on.a(var7, var8, var4 + (var5 << -549638527), 69, 16777215, 30);
              on.h(var7 + -1, -1 + var8, 2 + (var4 - -(var5 << 486463937)), 71, 16777215, 128);
              var9 = 1;
              L1: while (true) {
                if (var9 >= 3) {
                  on.f(var7 + var4, 4 + var8, 59, 16777215, 100);
                  on.f(var4 + var7 + var5, 4 + var8, 59, 16777215, 100);
                  var9 = 22 + var8 + -4;
                  ((hu) ((Object) var3_ref)).c(ns.field_d[0], var7 - (-var4 - -5), var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d(ns.field_d[1], (var5 >> -1534714495) + (var7 + var4), var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d(ns.field_d[2], (var5 >> 2474593) + (var5 + var7 - -var4), var9, 16777215, 65793);
                  var9 += 22;
                  ((hu) ((Object) var3_ref)).c(ns.field_d[3], -5 + var7 - -var4, var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d("+30", (var5 >> -1099075359) + (var4 + var7), var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d("+3", -2 + var7 + (var4 + (var5 - -(var5 >> -1994115103))), var9, 16777215, 65793);
                  var9 += 22;
                  ((hu) ((Object) var3_ref)).c(ns.field_d[4], -5 + (var4 + var7), var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d("-10", (var5 >> 1266386209) + (var4 + var7), var9, 16777215, 65793);
                  ((hu) ((Object) var3_ref)).d("0", -2 + (var4 + var7 - (-var5 + -(var5 >> 167076321))), var9, 16777215, 65793);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  on.c(var7 - -4, var8 + (var9 * 22 + -1), -10 + var6, 16777215, 100);
                  var9++;
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
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "lo.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static li a(li[] param0, boolean param1, tm[] param2, String param3) throws dw {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        li stackIn_5_0 = null;
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_4_0 = null;
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
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param2.length) {
                L2: {
                  var7 = new StringBuilder("The method " + param3 + "(");
                  if (!param1) {
                    break L2;
                  } else {
                    field_k = (String) null;
                    break L2;
                  }
                }
                var5 = 0;
                L3: while (true) {
                  if (param0.length <= var5) {
                    discarded$4 = var7.append(") is undefined.");
                    throw new dw(var7.toString());
                  } else {
                    L4: {
                      if (!param0[var5].field_b) {
                        discarded$5 = var7.append(dr.a(-117, param0[var5].field_d.getClass()));
                        break L4;
                      } else {
                        discarded$6 = var7.append(rm.a(param0[var5].field_d, (byte) 106).toString());
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 + param0.length <= var5) {
                        break L5;
                      } else {
                        discarded$7 = var7.append(',');
                        break L5;
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (!param2[var4_int].a(param0, 2, param3)) {
                  var4_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = param2[var4_int].a((byte) 84, param0);
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("lo.K(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_m = "Gamemodes";
        field_k = "There are no teams in this league";
    }
}
