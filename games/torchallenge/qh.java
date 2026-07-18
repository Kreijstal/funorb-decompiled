/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends kj implements tl, sg {
    static int field_J;
    static int field_P;
    private ta field_Q;
    private df field_N;
    private ng field_K;
    static boolean[][][] field_O;
    static String field_L;
    static lj field_M;

    private final String a(int param0) {
        return "</col></u>";
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        ka var10 = null;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          if (null != uk.field_N) {
            uk.field_N.d();
            qg.b();
            break L0;
          } else {
            uk.field_N = new ka(640, 480);
            uk.field_N.d();
            break L0;
          }
        }
        L1: {
          if (3 != param0) {
            L2: {
              if (ii.field_h != null) {
                break L2;
              } else {
                ue.b((byte) 102);
                break L2;
              }
            }
            ag.a(52);
            break L1;
          } else {
            param0 = 0;
            break L1;
          }
        }
        L3: {
          L4: {
            var2 = af.field_f[0];
            var3 = af.field_f[1];
            var5 = af.field_f[3];
            var4 = af.field_f[2];
            sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
            if (param0 == 0) {
              break L4;
            } else {
              if (param0 != 1) {
                if (param0 == 2) {
                  var3 = ed.field_i[1];
                  var5 = ed.field_i[3];
                  var4 = ed.field_i[2];
                  var2 = ed.field_i[0];
                  sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L4;
              }
            }
          }
          var4 = ob.field_b[2];
          var3 = ob.field_b[1];
          var2 = ob.field_b[0];
          var5 = ob.field_b[3];
          sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
          break L3;
        }
        L5: {
          L6: {
            var4 = oj.field_e[2];
            var2 = oj.field_e[0];
            var5 = oj.field_e[3];
            var3 = oj.field_e[1];
            var10 = new ka(1 + var4 / 2, var5);
            sf.a(var10, ph.field_h, 0, var5, 0, var4 / 2 + 1, (byte) -55);
            uk.field_N.d();
            var10.g(var2, var3);
            var10.d(var2 - -(var4 / 2) - 2, var3);
            var7 = di.field_t[vj.field_c].field_v;
            var6 = di.field_t[vj.field_c].field_q;
            var8 = null;
            di.field_t[vj.field_c].g(var2 + (-var6 + var4 / 2) / 2 - -2, (var5 - var7) / 2 + var3);
            if (0 == param0) {
              break L6;
            } else {
              if (param0 == 2) {
                break L6;
              } else {
                if (param0 != 1) {
                  break L5;
                } else {
                  var3 = oa.field_a[1];
                  var2 = oa.field_a[0];
                  var4 = oa.field_a[2];
                  var5 = oa.field_a[3];
                  sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
                  break L5;
                }
              }
            }
          }
          var3 = rf.field_eb[vj.field_c][1];
          var2 = rf.field_eb[vj.field_c][0];
          uk.field_N.d();
          ie.field_f[vj.field_c][0].g(var2, var3);
          fd.field_h = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          ac.field_a = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          fd.field_h.d();
          ie.field_f[vj.field_c][1].a(0, 0, 0, 47211);
          break L5;
        }
        L7: {
          L8: {
            if (param0 == 0) {
              break L8;
            } else {
              if (2 == param0) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var3 = nh.field_db[1];
          var2 = nh.field_db[0];
          uk.field_N.d();
          wf.field_b.g(var2, var3);
          break L7;
        }
        la.field_f.a(-53);
    }

    public final void a(df param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
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
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                var7 = null;
                ((qh) this).a((ng) null, -60, 57, -19, true);
                break L1;
              }
            }
            L2: {
              if (0 == param1) {
                ri.a("terms.ws", (byte) -90);
                break L2;
              } else {
                if (param1 != 1) {
                  if (param1 == 2) {
                    ri.a("conduct.ws", (byte) -100);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ri.a("privacy.ws", (byte) -79);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("qh.D(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void d(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 2) {
                break L0;
              } else {
                L2: {
                  if (tg.field_r == null) {
                    break L2;
                  } else {
                    if (var1_int >= tg.field_r.length) {
                      break L2;
                    } else {
                      if (tg.field_r[var1_int] == null) {
                        break L2;
                      } else {
                        je.a((byte) 15, tg.field_r[var1_int]);
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  if (tg.field_r == null) {
                    break L3;
                  } else {
                    if (tg.field_r.length <= var1_int) {
                      break L3;
                    } else {
                      tg.field_r[var1_int] = null;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (da.field_g == null) {
                    break L4;
                  } else {
                    if (var1_int >= da.field_g.length) {
                      break L4;
                    } else {
                      da.field_g[var1_int] = null;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (wh.field_d == null) {
                    break L5;
                  } else {
                    if (wh.field_d.length <= var1_int) {
                      break L5;
                    } else {
                      wh.field_d[var1_int] = false;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (fk.field_u == null) {
                    break L6;
                  } else {
                    if (var1_int < fk.field_u.length) {
                      fk.field_u[var1_int] = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (fh.field_h == null) {
                    break L7;
                  } else {
                    if (fh.field_h.length <= var1_int) {
                      break L7;
                    } else {
                      fh.field_h[var1_int] = 0;
                      break L7;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "qh.F(" + true + ')');
        }
    }

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 < -60) {
              stackOut_3_0 = vh.a((byte) -128, true, 10, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 109;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qh.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void f(byte param0) {
        if (param0 != -36) {
            field_O = null;
        }
        field_O = null;
        field_L = null;
        field_M = null;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 9) {
                break L1;
              } else {
                qh.f((byte) -104);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 51, param3)) {
              if (param0 == 98) {
                stackOut_7_0 = ((qh) this).a(param3, (byte) -16);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (99 == param0) {
                  stackOut_11_0 = ((qh) this).b(109, param3);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(int param0, int[] param1, byte param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
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
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < param4) {
                L2: {
                  var5_int = (param0 - -param4) / 2;
                  var6 = param0;
                  var7 = param3[var5_int];
                  param3[var5_int] = param3[param4];
                  param3[param4] = var7;
                  var8 = param1[var5_int];
                  param1[var5_int] = param1[param4];
                  param1[param4] = var8;
                  if (var7 != 2147483647) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var9 = stackIn_6_0;
                var10 = param0;
                L3: while (true) {
                  if (param4 <= var10) {
                    param3[param4] = param3[var6];
                    param3[var6] = var7;
                    param1[param4] = param1[var6];
                    param1[var6] = var8;
                    qh.a(param0, param1, (byte) 75, param3, -1 + var6);
                    qh.a(1 + var6, param1, (byte) 75, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (param3[var10] > -(var9 & var10) + var7) {
                        var11 = param3[var10];
                        param3[var10] = param3[var6];
                        param3[var6] = var11;
                        var12 = param1[var10];
                        param1[var10] = param1[var6];
                        int incrementValue$1 = var6;
                        var6++;
                        param1[incrementValue$1] = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
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
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("qh.J(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(75).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
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
              if (((qh) this).field_K == param0) {
                bj.a(120);
                ((qh) this).field_Q.o(77);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param4) {
                break L2;
              } else {
                ((qh) this).field_N = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("qh.A(");
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
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String c(boolean param0) {
        return "<u=2164A2><col=2164A2>";
    }

    qh(ta param0) {
        super(0, 0, 288, 0, (j) null);
        RuntimeException var2 = null;
        int var3 = 0;
        bc var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
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
            ((qh) this).field_Q = param0;
            ((qh) this).field_K = new ng(be.field_a, (gg) null);
            ((qh) this).field_K.field_q = (j) (Object) new cl();
            var7 = ni.a(new String[2], 0, lc.field_m);
            var3 = 20;
            var4 = new bc(oe.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, oe.field_g.field_x, -1, 2147483647, true);
            ((qh) this).field_N = new df(var7, (j) (Object) var4);
            ((qh) this).field_N.field_r = "";
            ((qh) this).field_N.a(0, false, gh.field_z);
            ((qh) this).field_N.a(1, false, gh.field_z);
            ((qh) this).field_N.field_p = ((qh) this).field_p + -40;
            ((qh) this).field_N.field_k = (gg) this;
            ((qh) this).field_N.b(var3, 2, -40 + ((qh) this).field_p, 26);
            var3 = var3 + (15 + ((qh) this).field_N.field_l);
            ((qh) this).a(0, (ee) (Object) ((qh) this).field_N);
            var5 = 4;
            var6 = 200;
            ((qh) this).field_K.a((byte) 105, 300 + -var6 >> 1, 40, var6, var3);
            ((qh) this).field_K.field_k = (gg) this;
            ((qh) this).a(0, (ee) (Object) ((qh) this).field_K);
            ((qh) this).a((byte) 106, 0, var5 + 55 + var3, 300, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("qh.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 0;
        field_O = new boolean[][][]{new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][], new boolean[8][]};
        field_L = "Waiting for music";
    }
}
