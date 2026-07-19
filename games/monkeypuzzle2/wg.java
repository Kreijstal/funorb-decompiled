/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ug {
    float[] field_f;
    float[] field_e;
    float[] field_i;
    static pj field_k;
    static int field_h;
    static le field_g;
    static kj field_j;

    final static void a(int param0) {
        int discarded$2 = 0;
        float discarded$3 = 0.0f;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = sb.field_r.field_C - -sb.field_r.field_D;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (5 <= var2) {
                      break L4;
                    } else {
                      fd.field_o[var2] = false;
                      m.field_e[var2] = 272;
                      th.field_o[var2] = 30 + (var1_int + (pl.field_e.field_D + pl.field_e.field_C) * pl.field_e.a(th.field_n[var2], -57 + m.field_e[var2]));
                      var7 = th.field_o[var2] ^ -1;
                      var6 = -138;
                      if (var4 != 0) {
                        if (var6 < var7) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var6 >= var7) {
                            break L5;
                          } else {
                            th.field_o[var2] = 137;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      sl.field_k[var2] = -(m.field_e[var2] / 2) + 320;
                                      si.field_v[var2] = 240 - th.field_o[var2] / 2;
                                      vh.field_E[var2] = new le(m.field_e[var2], th.field_o[var2]);
                                      vh.field_E[var2].e();
                                      lb.a(0, m.field_e[var2], (byte) -128, wc.field_e, 0, th.field_o[var2]);
                                      discarded$2 = pl.field_e.a(th.field_n[var2], 57, 15, m.field_e[var2] + -72, th.field_o[var2] + -30, 1, -1, 0, 0, pl.field_e.field_C + pl.field_e.field_D);
                                      sb.field_r.b(lb.field_A, 57, th.field_o[var2] + -15, 1, 6579300);
                                      var3 = var2;
                                      if (0 != var3) {
                                        break L12;
                                      } else {
                                        if (var4 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (3 != var3) {
                                        break L13;
                                      } else {
                                        if (var4 == 0) {
                                          break L10;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (var3 == 4) {
                                      break L9;
                                    } else {
                                      if (-2 == (var3 ^ -1)) {
                                        break L8;
                                      } else {
                                        if ((var3 ^ -1) != -3) {
                                          break L6;
                                        } else {
                                          if (var4 == 0) {
                                            break L7;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  nh.field_f[0][0][0].c(15, 15);
                                  ak.field_t[0].c(15, 47);
                                  ak.field_t[0].c(15, 79);
                                  if (var4 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                                qi.field_K[0].d(15, 15, 32, 32);
                                qi.field_K[0].d(15, 47, 32, 32);
                                qi.field_K[0].d(15, 79, 32, 32);
                                if (var4 == 0) {
                                  break L6;
                                } else {
                                  break L9;
                                }
                              }
                              qi.field_K[1].d(15, 15, 32, 32);
                              qi.field_K[2].d(15, 47, 32, 32);
                              qi.field_K[3].d(15, 79, 32, 32);
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                            ak.field_t[1].c(15, 15);
                            ak.field_t[2].c(15, 47);
                            tl.field_b.c(15, 79);
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          ge.h(15, 15, 42, 106);
                          wc.field_h.c(15, 15);
                          hb.field_m[4][0].c(15, 47);
                          ak.field_t[4].c(15, 79);
                          break L6;
                        }
                        var2++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ac.field_a.a((byte) 118);
                  if (param0 < -78) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var5 = (float[]) null;
                discarded$3 = wg.a((float[]) null, (byte) -105);
                break L2;
              }
              ck.field_b = -1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "wg.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, ad param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param3 == -3) {
                break L1;
              } else {
                field_g = (le) null;
                break L1;
              }
            }
            var5 = param2.b(255, param1, param0);
            var4 = var5;
            if (var5 != null) {
              ol.a(var5, -83);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4_ref);
            stackOut_7_1 = new StringBuilder().append("wg.I(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static float a(float[] param0, byte param1) {
        String discarded$2 = null;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_2_0 = 0.0f;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 113) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = wg.a(false, (CharSequence) null, 26);
                break L1;
              }
            }
            stackOut_2_0 = param0[1] * param0[1] + param0[0] * param0[0];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wg.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, java.applet.Applet param1, String param2, int param3, long param4) {
        try {
            boolean discarded$1 = false;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            ad var8 = null;
            String var9 = null;
            String var10 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
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
                try {
                  L1: {
                    L2: {
                      L3: {
                        var9 = param1.getParameter("cookiehost");
                        var7 = var9;
                        var7 = var9;
                        var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                        var7 = var10;
                        var7 = var10;
                        var7 = var10;
                        if ((param4 ^ -1L) <= -1L) {
                          break L3;
                        } else {
                          var7 = var10 + "; Discard;";
                          if (!MonkeyPuzzle2.field_F) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var7 = var7 + "; Expires=" + ha.a((byte) 126, 1000L * param4 + pf.a(0)) + "; Max-Age=" + param4;
                      break L2;
                    }
                    mf.a(true, param1, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                if (param3 == -26372) {
                  break L0;
                } else {
                  var8 = (ad) null;
                  discarded$1 = wg.a(-106, -61, (ad) null, -79);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var6_ref);
                stackOut_9_1 = new StringBuilder().append("wg.D(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              L7: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param2 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        float discarded$0 = 0.0f;
        jh.field_C.c((byte) 73, new lb());
        if (param0 != -1) {
            float[] var2 = (float[]) null;
            discarded$0 = wg.a((float[]) null, (byte) -21);
        }
    }

    final void e(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        var2 = this.field_e[0];
        var3 = this.field_e[1];
        wj.a(this.field_e, -110, vj.a(uh.a(this.field_f, 0.00009999999747378752f, (byte) 40), (byte) -2, ac.a(this.field_i, 117, this.field_e)));
        this.field_i[0] = var2;
        this.field_i[1] = var3;
        if (param0 >= -81) {
          field_h = 28;
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        String stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        String stackOut_9_0 = null;
        int stackOut_12_0 = 0;
        String stackOut_15_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = pc.a((byte) -123, param0, param1);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length() <= var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = vb.a((byte) 110, param1.charAt(var4));
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackOut_9_0 = kd.field_b;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = param2;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                if (stackIn_13_0 != 17212) {
                  stackOut_15_0 = (String) null;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = (String) (var3);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("wg.H(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            if (!param0) {
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var5 >= var4) {
                    stackOut_10_0 = var3_int;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_6_0 = param2 ^ -1;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (stackIn_7_0 != (param1.charAt(var5) ^ -1)) {
                          break L3;
                        } else {
                          var3_int++;
                          break L3;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 16;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("wg.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_k = null;
        field_g = null;
        field_j = null;
    }

    wg(float param0, float param1) {
        this.field_e = new float[2];
        this.field_f = new float[2];
        this.field_i = new float[2];
        this.field_i[0] = param0;
        this.field_e[0] = param0;
        this.field_i[1] = param1;
        this.field_e[1] = param1;
    }

    static {
        field_k = new pj();
    }
}
