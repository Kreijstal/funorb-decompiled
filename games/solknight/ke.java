/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends si {
    static int field_I;
    private int field_P;
    static int field_J;
    static o field_K;
    private mg field_M;
    static String[] field_O;
    static int field_N;
    static mg field_H;
    private int field_S;
    private String field_Q;
    private boolean field_L;
    private int field_R;

    public static void d(byte param0) {
        String var2 = null;
        if (param0 != -61) {
          var2 = (String) null;
          ke.a((byte) 115, (java.applet.Applet) null, (String) null, false);
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        }
    }

    final static int a(byte param0) {
        int var1 = 0;
        d.field_b.a(24561);
        var1 = 17 / ((40 - param0) / 47);
        if (il.field_c.d((byte) 0)) {
          return 0;
        } else {
          return pg.a((byte) 83);
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            int discarded$2 = 0;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                L1: {
                  if (!dl.field_t.startsWith("win")) {
                    break L1;
                  } else {
                    if (!sj.a(97, param2)) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                try {
                  L2: {
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    if (param0 < -60) {
                      break L2;
                    } else {
                      discarded$2 = ke.a((byte) -80);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  hi.a((Throwable) null, "MGR1: " + param2, 1);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) (var4_ref);
                stackOut_8_1 = new StringBuilder().append("ke.F(").append(param0).append(',');
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              L4: {
                stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
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

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(boolean param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_85_0 = 0;
        boolean stackOut_72_0 = false;
        int stackOut_79_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_83_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            ua.field_L = ua.field_L + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (sb.a(ua.field_L, uc.field_b, 1513551664) < 65536) {
                    break L3;
                  } else {
                    wd.field_a = wd.field_a + 1;
                    stackOut_3_0 = ua.field_L - uc.field_b;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      ua.field_L = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              L4: {
                var2_int = stackIn_7_0;
                if (param1) {
                  break L4;
                } else {
                  discarded$1 = ke.b(-18, 56, 85);
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (null == jb.field_d) {
                    break L6;
                  } else {
                    var2_int = jb.field_d.length;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (qd.field_e == null) {
                  break L5;
                } else {
                  var2_int = qd.field_e.length;
                  break L5;
                }
              }
              L7: {
                if ((var2_int ^ -1) == 0) {
                  break L7;
                } else {
                  L8: {
                    if (ti.field_e < uc.field_c) {
                      L9: {
                        ti.field_e = ti.field_e + 1;
                        if (ti.field_e <= uc.field_e) {
                          break L9;
                        } else {
                          L10: {
                            if (null == jb.field_d) {
                              break L10;
                            } else {
                              if (null != jb.field_d[we.field_h]) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          ti.field_e = ti.field_e - 1;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (uc.field_c > ti.field_e) {
                        break L8;
                      } else {
                        if (null != jb.field_d[(we.field_h + 1) % var2_int]) {
                          break L8;
                        } else {
                          ti.field_e = ti.field_e - 1;
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    if (uc.field_c <= ti.field_e) {
                      L12: {
                        L13: {
                          vb.field_g = we.field_h;
                          if (!fh.field_g) {
                            break L13;
                          } else {
                            we.field_h = we.field_h + 1;
                            if (var2_int <= we.field_h) {
                              we.field_h = we.field_h - var2_int;
                              if (var5 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        we.field_h = we.field_h - 1;
                        if (-1 < (we.field_h ^ -1)) {
                          we.field_h = we.field_h + var2_int;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      ti.field_e = ti.field_e - uc.field_c;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (uc.field_e < ti.field_e) {
                    fh.field_g = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L14: {
                if (kj.field_S != null) {
                  L15: {
                    var3 = 357 - kj.field_S.field_r / 2;
                    var4 = 0;
                    if (hg.field_F == 0) {
                      break L15;
                    } else {
                      if (s.field_gb <= var3) {
                        break L15;
                      } else {
                        if (s.field_gb < kj.field_S.field_t + var3) {
                          L16: {
                            if (db.field_o <= 269 + -kj.field_S.field_p) {
                              break L16;
                            } else {
                              if (-270 >= (db.field_o ^ -1)) {
                                break L16;
                              } else {
                                var4 = 1;
                                ti.field_e = uc.field_c;
                                fh.field_g = false;
                                break L16;
                              }
                            }
                          }
                          if (db.field_o <= 586) {
                            break L15;
                          } else {
                            if (kj.field_S.field_p + 586 > db.field_o) {
                              var4 = 1;
                              ti.field_e = uc.field_c;
                              fh.field_g = true;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L14;
                  } else {
                    if (uc.field_e >= ti.field_e) {
                      break L14;
                    } else {
                      if (var3 >= ad.field_m) {
                        break L14;
                      } else {
                        if (ad.field_m >= var3 - -kj.field_S.field_t) {
                          break L14;
                        } else {
                          L17: {
                            if (gb.field_j <= 269 - kj.field_S.field_p) {
                              break L17;
                            } else {
                              if ((gb.field_j ^ -1) <= -270) {
                                break L17;
                              } else {
                                ti.field_e = uc.field_e;
                                break L17;
                              }
                            }
                          }
                          if (586 >= gb.field_j) {
                            break L14;
                          } else {
                            if (kj.field_S.field_p + 586 <= gb.field_j) {
                              break L14;
                            } else {
                              ti.field_e = uc.field_e;
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L14;
                }
              }
              if (param0) {
                L18: {
                  qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                  if (!qh.field_b.d((byte) -8)) {
                    break L18;
                  } else {
                    if (qh.field_b.field_f != 0) {
                      if (-2 != (qh.field_b.field_f ^ -1)) {
                        break L18;
                      } else {
                        stackOut_68_0 = 2;
                        stackIn_69_0 = stackOut_68_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackOut_65_0 = 3;
                      stackIn_66_0 = stackOut_65_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                L19: while (true) {
                  L20: {
                    if (!wk.a((byte) -56)) {
                      stackOut_85_0 = 0;
                      stackIn_86_0 = stackOut_85_0;
                      break L20;
                    } else {
                      qh.field_b.a(0, false);
                      stackOut_72_0 = qh.field_b.d((byte) -33);
                      stackIn_86_0 = stackOut_72_0 ? 1 : 0;
                      stackIn_73_0 = stackOut_72_0;
                      if (var5 != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (stackIn_73_0) {
                            if (-1 != (qh.field_b.field_f ^ -1)) {
                              if (-2 != (qh.field_b.field_f ^ -1)) {
                                break L21;
                              } else {
                                stackOut_79_0 = 1;
                                stackIn_80_0 = stackOut_79_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            } else {
                              stackOut_76_0 = 3;
                              stackIn_77_0 = stackOut_76_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            break L21;
                          }
                        }
                        if (-14 == (el.field_n ^ -1)) {
                          stackOut_83_0 = 1;
                          stackIn_84_0 = stackOut_83_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          continue L19;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                return 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ke.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_66_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_69_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_86_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_77_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_80_0;
                } else {
                  return stackIn_84_0;
                }
              }
            }
          }
        }
    }

    final String c(byte param0) {
        int discarded$2 = 0;
        int var2 = 0;
        String var3 = null;
        rc stackIn_1_0 = null;
        rc stackIn_2_0 = null;
        rc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        rc stackOut_0_0 = null;
        rc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        rc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = this.field_G.field_v ? 1 : 0;
          this.field_G.field_v = this.field_v;
          var3 = this.field_G.c((byte) 45);
          stackOut_0_0 = this.field_G;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (rc) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (rc) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        if (param0 <= 14) {
          discarded$2 = ke.a(false, true);
          return var3;
        } else {
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_m;
        int var6 = this.field_j + param0;
        super.a(param0, param1, param2, param3 + 0);
        if (!(param1 == param3)) {
            return;
        }
        int var7 = this.field_L ? this.field_t + (-this.field_R + -(2 * this.field_P)) : 0;
        int discarded$0 = this.field_M.a(this.field_Q, this.field_P + (var5 - -var7), this.field_P + var6, this.field_R + -this.field_P, this.field_x - 2 * this.field_P, this.field_S, -1, this.field_L ? 0 : 2, 1, this.field_M.field_F);
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 != -1697860097) {
            return 78;
        }
        int var3 = param0 >>> -1697860097;
        return -var3 + (param0 + var3) / param2;
    }

    ke(int param0, int param1, int param2, int param3, rc param4, boolean param5, int param6, int param7, mg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (j) null, (dg) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              this.field_S = param9;
              this.field_M = param8;
              this.field_G = param4;
              this.field_R = param6;
              this.field_Q = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
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
              L3: {
                ((ke) (this)).field_L = stackIn_4_1 != 0;
                this.field_P = param7;
                var12_int = this.field_R + -this.field_P;
                var13 = this.field_M.b(param10, var12_int, this.field_M.field_F) + 2 * this.field_P;
                if (param3 >= var13) {
                  break L3;
                } else {
                  this.b(var13, param2, param0, 0, param1);
                  if (!SolKnight.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var13 = param3;
              break L2;
            }
            L4: {
              if (!this.field_L) {
                stackOut_9_0 = 2 * this.field_P + this.field_R;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_G.b(-(2 * this.field_P) + param3, -(this.field_P * 3) + param2 + -this.field_R, var14, 0, (-param3 + var13 >> -30316799) + this.field_P);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("ke.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
    }
}
