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
        String var2;
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
        int var1;
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
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
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
                      ke.a((byte) -80);
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
                stackIn_10_0 = (RuntimeException) (var4_ref);

                stackIn_10_1 = new StringBuilder().append("ke.F(").append(param0).append(',');

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
              L4: {


                stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

                if (param2 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
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
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            ua.field_L = ua.field_L + 65536;
            L1: while (true) {
              if (sb.a(ua.field_L, uc.field_b, 1513551664) < 65536) {
                L2: {
                  var2_int = -1;
                  if (param1) {
                    break L2;
                  } else {
                    ke.b(-18, 56, 85);
                    break L2;
                  }
                }
                L3: {
                  if (null == jb.field_d) {
                    if (qd.field_e == null) {
                      break L3;
                    } else {
                      var2_int = qd.field_e.length;
                      break L3;
                    }
                  } else {
                    var2_int = jb.field_d.length;
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int ^ -1) == 0) {
                    break L4;
                  } else {
                    L5: {
                      if (ti.field_e < uc.field_c) {
                        L6: {
                          ti.field_e = ti.field_e + 1;
                          if (ti.field_e <= uc.field_e) {
                            break L6;
                          } else {
                            L7: {
                              if (null == jb.field_d) {
                                break L7;
                              } else {
                                if (null != jb.field_d[we.field_h]) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ti.field_e = ti.field_e - 1;
                            break L5;
                          }
                        }
                        if (uc.field_c > ti.field_e) {
                          break L5;
                        } else {
                          if (null != jb.field_d[(we.field_h + 1) % var2_int]) {
                            break L5;
                          } else {
                            ti.field_e = ti.field_e - 1;
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (uc.field_c <= ti.field_e) {
                        L9: {
                          vb.field_g = we.field_h;
                          if (!fh.field_g) {
                            we.field_h = we.field_h - 1;
                            if (-1 < (we.field_h ^ -1)) {
                              we.field_h = we.field_h + var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            we.field_h = we.field_h + 1;
                            if (var2_int <= we.field_h) {
                              we.field_h = we.field_h - var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ti.field_e = ti.field_e - uc.field_c;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (uc.field_e < ti.field_e) {
                      fh.field_g = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (kj.field_S != null) {
                    L11: {
                      var3 = 357 - kj.field_S.field_r / 2;
                      var4 = 0;
                      if (hg.field_F == 0) {
                        break L11;
                      } else {
                        if (s.field_gb <= var3) {
                          break L11;
                        } else {
                          if (s.field_gb < kj.field_S.field_t + var3) {
                            L12: {
                              if (db.field_o <= 269 + -kj.field_S.field_p) {
                                break L12;
                              } else {
                                if (-270 >= (db.field_o ^ -1)) {
                                  break L12;
                                } else {
                                  var4 = 1;
                                  ti.field_e = uc.field_c;
                                  fh.field_g = false;
                                  break L12;
                                }
                              }
                            }
                            if (db.field_o <= 586) {
                              break L11;
                            } else {
                              if (kj.field_S.field_p + 586 > db.field_o) {
                                var4 = 1;
                                ti.field_e = uc.field_c;
                                fh.field_g = true;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (uc.field_e >= ti.field_e) {
                        break L10;
                      } else {
                        if (var3 >= ad.field_m) {
                          break L10;
                        } else {
                          if (ad.field_m >= var3 - -kj.field_S.field_t) {
                            break L10;
                          } else {
                            L13: {
                              if (gb.field_j <= 269 - kj.field_S.field_p) {
                                break L13;
                              } else {
                                if ((gb.field_j ^ -1) <= -270) {
                                  break L13;
                                } else {
                                  ti.field_e = uc.field_e;
                                  break L13;
                                }
                              }
                            }
                            if (586 >= gb.field_j) {
                              break L10;
                            } else {
                              if (kj.field_S.field_p + 586 <= gb.field_j) {
                                break L10;
                              } else {
                                ti.field_e = uc.field_e;
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                if (param0) {
                  L14: {
                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                    if (!qh.field_b.d((byte) -8)) {
                      break L14;
                    } else {
                      if (qh.field_b.field_f != 0) {
                        if (-2 != (qh.field_b.field_f ^ -1)) {
                          break L14;
                        } else {
                          stackIn_65_0 = 2;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_62_0 = 3;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L15: while (true) {
                    if (!wk.a((byte) -56)) {
                      stackIn_81_0 = 0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L16: {
                        qh.field_b.a(0, false);
                        if (qh.field_b.d((byte) -33)) {
                          if (-1 != (qh.field_b.field_f ^ -1)) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L16;
                            } else {
                              stackIn_75_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            stackIn_72_0 = 3;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          break L16;
                        }
                      }
                      if (-14 == (el.field_n ^ -1)) {
                        stackIn_79_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        continue L15;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                wd.field_a = wd.field_a + 1;
                ua.field_L = ua.field_L - uc.field_b;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ke.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_62_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_72_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_75_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0;
                } else {
                  return stackIn_81_0;
                }
              }
            }
          }
        }
    }

    final String c(byte param0) {
        int var2;
        String var3;
        rc stackIn_2_0 = null;
        rc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var2 = this.field_G.field_v ? 1 : 0;
          this.field_G.field_v = this.field_v;
          var3 = this.field_G.c((byte) 45);
          stackIn_2_0 = this.field_G;

          if (var2 == 0) {
            stackIn_3_0 = (rc) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (rc) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        if (param0 <= 14) {
          ke.a(false, true);
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
        this.field_M.a(this.field_Q, this.field_P + (var5 - -var7), this.field_P + var6, this.field_R + -this.field_P, this.field_x - 2 * this.field_P, this.field_S, -1, this.field_L ? 0 : 2, 1, this.field_M.field_F);
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_S = param9;
              this.field_M = param8;
              this.field_G = param4;
              this.field_R = param6;
              this.field_Q = param10;
              stackIn_3_0 = this;

              if (!param5) {
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
              ((ke) (this)).field_L = stackIn_4_1 != 0;
              this.field_P = param7;
              var12_int = this.field_R + -this.field_P;
              var13 = this.field_M.b(param10, var12_int, this.field_M.field_F) + 2 * this.field_P;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.b(var13, param2, param0, 0, param1);
                break L2;
              }
            }
            L3: {
              if (!this.field_L) {
                stackIn_10_0 = 2 * this.field_P + this.field_R;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_G.b(-(2 * this.field_P) + param3, -(this.field_P * 3) + param2 + -this.field_R, var14, 0, (-param3 + var13 >> -30316799) + this.field_P);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ke.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
    }
}
