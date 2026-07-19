/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    private int field_a;
    private String field_f;
    cf field_b;
    static String field_g;
    int field_d;
    private int[] field_e;
    private long field_j;
    String field_i;
    ci field_k;
    static String field_h;
    static int field_c;

    private final boolean b(int param0, int param1, int param2) {
        if (17 == param1) {
          pj.field_h = new pc(this.field_k.field_U, this.field_k.field_wb, this.field_k.field_M, this.field_k.field_pb, param0, ki.field_P, dc.field_s, gd.field_b, qn.field_P, kj.field_g, sj.field_k, this.field_i, this.field_j);
          return true;
        } else {
          if (param2 != 13563) {
            field_g = (String) null;
            return false;
          } else {
            return false;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
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
                if (param1) {
                  break L0;
                } else {
                  field_c = -94;
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                  param0.getAppletContext().showDocument(rh.a(var2, param0, (byte) -87), "_top");
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("dh.R(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -75) {
            return;
        }
        field_h = null;
        field_g = null;
    }

    final void a(int param0, boolean param1) {
        r var4 = null;
        String var5 = null;
        int var6 = 0;
        r var7 = null;
        r var8 = null;
        r var9 = null;
        var6 = Chess.field_G;
        if (param0 != 0) {
          this.field_j = 17L;
          if (null != this.field_i) {
            if (this.field_j != gb.field_t) {
              if (pd.field_Rb != null) {
                L0: {
                  if (!ci.f(-52)) {
                    break L0;
                  } else {
                    var9 = ug.a((byte) -86, this.field_j);
                    var4 = mi.a(134217727, this.field_j);
                    var5 = this.a(28);
                    if (var4 != null) {
                      if (!pd.field_Rb.field_Vb) {
                        this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
                        return;
                      } else {
                        if (pd.field_Rb.field_pc >= 0) {
                          this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (var9 == null) {
                        break L0;
                      } else {
                        if (!pd.field_Rb.field_ac) {
                          break L0;
                        } else {
                          if (pd.field_Rb.field_Xb < pd.field_Rb.field_hc) {
                            if (var9.field_ac) {
                              this.field_b.a((byte) -12, oc.a(sh.field_a, new String[]{var5}, (byte) -92), 1);
                              return;
                            } else {
                              if (!param1) {
                                this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                                return;
                              } else {
                                if (var9.field_Qb) {
                                  this.field_b.a((byte) -12, oc.a(ub.field_c, new String[]{var5}, (byte) -127), 0);
                                  this.field_b.a((byte) -12, oc.a(w.field_Fb, new String[]{var5}, (byte) -81), 1);
                                  return;
                                } else {
                                  this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                                  return;
                                }
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (null != this.field_i) {
            if (this.field_j != gb.field_t) {
              if (pd.field_Rb != null) {
                if (ci.f(-52)) {
                  var8 = ug.a((byte) -86, this.field_j);
                  var7 = var8;
                  var4 = mi.a(134217727, this.field_j);
                  var5 = this.a(28);
                  if (var4 != null) {
                    if (!pd.field_Rb.field_Vb) {
                      this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
                      return;
                    } else {
                      if (pd.field_Rb.field_pc >= 0) {
                        this.field_b.a((byte) -12, oc.a(am.field_b, new String[]{var5}, (byte) -124), 1);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var8 != null) {
                      if (pd.field_Rb.field_ac) {
                        if (pd.field_Rb.field_Xb < pd.field_Rb.field_hc) {
                          if (var8.field_ac) {
                            this.field_b.a((byte) -12, oc.a(sh.field_a, new String[]{var5}, (byte) -92), 1);
                            return;
                          } else {
                            if (!param1) {
                              this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                              return;
                            } else {
                              if (var8.field_Qb) {
                                this.field_b.a((byte) -12, oc.a(ub.field_c, new String[]{var5}, (byte) -127), 0);
                                this.field_b.a((byte) -12, oc.a(w.field_Fb, new String[]{var5}, (byte) -81), 1);
                                return;
                              } else {
                                this.field_b.a((byte) -12, oc.a(pi.field_b, new String[]{var5}, (byte) -102), 0);
                                return;
                              }
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, j param1) {
        try {
            int var2_int = 22 / ((35 - param0) / 41);
            param1.field_s = new char[]{(char)63};
            param1.field_t = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5 = 0;
        var5 = Chess.field_G;
        if (param1 > 63) {
          if (-9 != (param0 ^ -1)) {
            if ((param0 ^ -1) != -19) {
              if (param0 != 11) {
                if ((param0 ^ -1) != -13) {
                  if (13 != param0) {
                    if (-15 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -21) {
                        if ((param0 ^ -1) == -20) {
                          discarded$1 = fl.a(this.field_e, this.field_j, this.field_a, this.field_i, (byte) 113);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        sh.a(false);
                        return true;
                      }
                    } else {
                      jg.n(-66);
                      return true;
                    }
                  } else {
                    oj.a(this.field_a, (byte) -99, 2, param2);
                    return true;
                  }
                } else {
                  oj.a(this.field_a, (byte) -99, 1, param2);
                  return true;
                }
              } else {
                oj.a(this.field_a, (byte) -99, 0, param2);
                return true;
              }
            } else {
              lj.a(this.field_i, this.field_j, 112);
              return true;
            }
          } else {
            wg.a(this.field_i, (byte) -118, this.field_j);
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, ld param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (param1.field_d) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_a = param1.field_k;
                if (0 == param1.field_k) {
                  L2: {
                    if (sg.field_d != 0) {
                      break L2;
                    } else {
                      this.field_b.a((byte) -12, dl.field_m, 12);
                      break L2;
                    }
                  }
                  this.field_b.a((byte) -12, ua.field_e, 13);
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: {
                var3_int = -49 % ((param0 - 3) / 36);
                if (param1.field_k == 1) {
                  L4: {
                    if (-1 != (ii.field_Q ^ -1)) {
                      break L4;
                    } else {
                      this.field_b.a((byte) -12, nk.field_v, 12);
                      break L4;
                    }
                  }
                  this.field_b.a((byte) -12, un.field_i, 13);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (param1.field_k != 2) {
                  break L5;
                } else {
                  L6: {
                    if (-1 != (v.field_d ^ -1)) {
                      break L6;
                    } else {
                      this.field_b.a((byte) -12, wf.field_X, 12);
                      break L6;
                    }
                  }
                  this.field_b.a((byte) -12, in.field_e, 13);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (runtimeException);
            stackOut_18_1 = new StringBuilder().append("dh.B(").append(param0).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void c(byte param0) {
        int discarded$34 = 0;
        int discarded$35 = 0;
        int discarded$36 = 0;
        int discarded$37 = 0;
        int discarded$38 = 0;
        hh var1 = null;
        nk var2 = null;
        var1 = (hh) ((Object) eh.field_R.g(-18110));
        if (var1 != null) {
          var2 = tk.field_h;
          discarded$34 = var2.e((byte) -96);
          discarded$35 = var2.e((byte) -92);
          discarded$36 = var2.e((byte) -99);
          if (param0 != 49) {
            field_c = -36;
            discarded$37 = var2.e((byte) -109);
            var1.c(-2193);
            return;
          } else {
            discarded$38 = var2.e((byte) -109);
            var1.c(-2193);
            return;
          }
        } else {
          si.d(65280);
          return;
        }
    }

    final void b(int param0, boolean param1) {
        this.field_b.a(false, param1);
        if (param0 > -58) {
            this.field_f = (String) null;
        }
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ve var5 = null;
        int var6 = 0;
        p var7 = null;
        String var8 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_i == null) {
                break L1;
              } else {
                L2: {
                  if ((this.field_j ^ -1L) != (gb.field_t ^ -1L)) {
                    break L2;
                  } else {
                    if (param2 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-3 == (ld.field_g ^ -1)) {
                  L3: {
                    var8 = this.a(param0 + 106);
                    var4_ref = var8;
                    var5 = mn.a(param0 + -18, this.field_i);
                    var6 = va.a(this.field_i, -19554) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        this.field_b.a((byte) -12, oc.a(jl.field_a, new String[]{var8}, (byte) -71), 4);
                        this.field_b.a((byte) -12, oc.a(bb.field_c, new String[]{var8}, (byte) -62), 6);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (-3 == (param2 ^ -1)) {
                            break L3;
                          } else {
                            if (qf.field_b) {
                              break L3;
                            } else {
                              this.field_e = param1;
                              this.field_b.a((byte) -12, oc.a(ci.field_x, new String[]{var8}, (byte) -93), 19);
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 != null) {
                      L5: {
                        if (am.a(false, this.field_i)) {
                          break L5;
                        } else {
                          if (!qf.field_b) {
                            L6: {
                              if (kh.field_o) {
                                break L6;
                              } else {
                                this.field_b.a((byte) -12, oc.a(bc.field_c, new String[]{var8}, (byte) -57), 8);
                                break L6;
                              }
                            }
                            this.field_b.a((byte) -12, oc.a(nd.field_b, new String[]{var8}, (byte) -89), 18);
                            if (param1 == null) {
                              break L5;
                            } else {
                              this.field_e = param1;
                              this.field_b.a((byte) -12, oc.a(ci.field_x, new String[]{var8}, (byte) -62), 19);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_b.a((byte) -12, oc.a(un.field_h, new String[]{var8}, (byte) -100), 5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    this.field_b.a((byte) -12, oc.a(tb.field_b, new String[]{var8}, (byte) -119), 7);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 17) {
              break L0;
            } else {
              var7 = (p) null;
              dh.a(29, -33, -123, 35, (p) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("dh.U(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var6 = 0;
        j var7 = null;
        var6 = this.field_b.a(param1, -19);
        if ((var6 ^ -1) == 1) {
          return false;
        } else {
          discarded$7 = this.a(5069, var6, param0);
          if (param4 != -11) {
            var7 = (j) null;
            dh.a(113, (j) null);
            discarded$8 = this.a(false, var6, param2);
            discarded$9 = this.d(var6, param4 + 120, param2);
            discarded$10 = this.b(param3, var6, 13563);
            return true;
          } else {
            discarded$11 = this.a(false, var6, param2);
            discarded$12 = this.d(var6, param4 + 120, param2);
            discarded$13 = this.b(param3, var6, 13563);
            return true;
          }
        }
    }

    final void b(byte param0) {
        String var3 = null;
        int var4 = 0;
        ln var5 = null;
        var4 = Chess.field_G;
        if (param0 < -67) {
          if (null == pd.field_Rb) {
            var5 = bk.a(-118, this.field_d);
            if (var5 != null) {
              var3 = var5.field_Gb;
              if (!var5.field_dc) {
                if (var5.field_Pb) {
                  this.field_b.a((byte) -12, oc.a(lj.field_d, new String[]{var3}, (byte) -46), 2);
                  if (var5.field_Tb) {
                    this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!var5.field_Tb) {
                    if (var5.field_ac) {
                      if (var5.field_Vb) {
                        if (!var5.field_Pb) {
                          if (var5.field_Tb) {
                            this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          this.field_b.a((byte) -12, oc.a(ki.field_O, new String[]{var3}, (byte) -68), 2);
                          if (var5.field_Tb) {
                            this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        this.field_b.a((byte) -12, oc.a(ki.field_O, new String[]{var3}, (byte) -68), 2);
                        if (var5.field_Tb) {
                          this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (var5.field_Tb) {
                        this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var5.field_Tb) {
                      this.field_b.a((byte) -12, oc.a(qa.field_g, new String[]{var3}, (byte) -96), 3);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_b.a((byte) -12, oc.a(sj.field_p, new String[]{var3}, (byte) -76), 2);
                this.field_b.a((byte) -12, oc.a(kh.field_p, new String[]{var3}, (byte) -101), 3);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            var5 = lc.field_n;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                if (param0 > 61) {
                  break L0;
                } else {
                  dh.d((byte) 5);
                  return;
                }
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "dh.N(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, p param4) {
        param4.c(12, (byte) -81);
        param4.b(17, 91);
        param4.b(param0, param1 + 78);
        param4.b(param2, param1 ^ 118);
        if (param1 != 11) {
            return;
        }
        try {
            param4.c(param3, (byte) 109);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "dh.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        if (param0 >= -6) {
          L0: {
            var3 = (j) null;
            dh.a(57, (j) null);
            if (this.field_i == null) {
              break L0;
            } else {
              if (this.field_j == gb.field_t) {
                break L0;
              } else {
                var4 = this.a(72);
                var2 = var4;
                this.field_b.a((byte) -12, oc.a(oh.field_c, new String[]{var4}, (byte) -127), 17);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (this.field_i == null) {
              break L1;
            } else {
              if (this.field_j == gb.field_t) {
                break L1;
              } else {
                var4 = this.a(72);
                var2 = var4;
                this.field_b.a((byte) -12, oc.a(oh.field_c, new String[]{var4}, (byte) -127), 17);
                break L1;
              }
            }
          }
          return;
        }
    }

    private final static void c(int param0, int param1, int param2) {
        nk var4 = null;
        ln var6 = null;
        ln var7 = null;
        if (param2 == cn.field_g) {
          if (param0 <= 107) {
            field_g = (String) null;
            return;
          } else {
            return;
          }
        } else {
          var6 = (ln) ((Object) ae.field_f.a((long)cn.field_g, 3000));
          var7 = var6;
          cn.field_g = param2;
          if (var7 == null) {
            var4 = qn.field_U;
            var4.f(param1, -94);
            var4.c(3, (byte) 82);
            var4.c(11, (byte) 76);
            var4.b(param2, 117);
            if (param0 > 107) {
              return;
            } else {
              field_g = (String) null;
              return;
            }
          } else {
            var7.field_ec = null;
            var4 = qn.field_U;
            var4.f(param1, -94);
            var4.c(3, (byte) 82);
            var4.c(11, (byte) 76);
            var4.b(param2, 117);
            if (param0 > 107) {
              return;
            } else {
              field_g = (String) null;
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = Chess.field_G;
        if (param0 != 5069) {
            return false;
        }
        if (param1 == 0) {
            ue.a(this.field_j, 16581, param2);
        } else {
            if (-2 == (param1 ^ -1)) {
                fd.a(param2, -125, this.field_j);
                return true;
            }
            if (-3 == (param1 ^ -1)) {
                fj.a(param2, 3, this.field_d);
                return true;
            }
            if (-4 == (param1 ^ -1)) {
                db.a(param2, this.field_d, param0 ^ 32284);
                return true;
            }
            if (10 == param1) {
                la.a(param2, (byte) 127, this.field_d);
                return true;
            }
            if (param1 == 15) {
                dh.c(114, param2, this.field_d);
                return true;
            }
            if (16 == param1) {
                dh.c(113, param2, 0);
                return true;
            }
            return false;
        }
        return true;
    }

    final boolean b(int param0) {
        if (param0 == 4) {
          if (this.field_b != null) {
            if (!this.field_b.l(3)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        if (!param0) {
          var4 = null;
          if (-5 != (param1 ^ -1)) {
            if (5 != param1) {
              if (-7 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -8) {
                  return false;
                } else {
                  L0: {
                    var8 = of.a(this.field_f, param2, this.field_i, -1);
                    if (var8 != null) {
                      var5 = (String) null;
                      lc.a(this.field_i, (String) null, 2, 0, var8, false);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return true;
                }
              } else {
                L1: {
                  var7 = a.a(param2, this.field_i, (byte) 64);
                  if (var7 != null) {
                    var5 = (String) null;
                    lc.a(this.field_i, (String) null, 2, 0, var7, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              }
            } else {
              L2: {
                var9 = ab.a(param2, 21250, this.field_i);
                if (var9 != null) {
                  var5 = (String) null;
                  lc.a(this.field_i, (String) null, 2, 0, var9, false);
                  break L2;
                } else {
                  break L2;
                }
              }
              return true;
            }
          } else {
            var6 = hf.a(param2, 107, this.field_i);
            if (var6 == null) {
              return true;
            } else {
              var5 = (String) null;
              lc.a(this.field_i, (String) null, 2, 0, var6, false);
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final String a(int param0) {
        String var2 = null;
        if (param0 <= 17) {
          L0: {
            this.field_d = -57;
            if (this.field_f != null) {
              var2 = this.field_f;
              break L0;
            } else {
              var2 = this.field_i;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (this.field_f != null) {
              var2 = this.field_f;
              break L1;
            } else {
              var2 = this.field_i;
              break L1;
            }
          }
          return var2;
        }
    }

    final static void c(int param0) {
        if (-11 == (rm.field_Q ^ -1)) {
          sh.a((byte) -59);
          rm.field_Q = 11;
          if (param0 != 12) {
            return;
          } else {
            gg.field_n = true;
            return;
          }
        } else {
          if (!tb.a((byte) 87)) {
            sh.a((byte) -59);
            rm.field_Q = 11;
            if (param0 != 12) {
              return;
            } else {
              gg.field_n = true;
              return;
            }
          } else {
            if (param0 != 12) {
              return;
            } else {
              gg.field_n = true;
              return;
            }
          }
        }
    }

    dh(ci param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_b = new cf(bd.field_a);
            this.field_j = param1;
            this.field_a = param5;
            param0.field_gb = true;
            this.field_e = param6;
            this.field_k = param0;
            this.field_f = param3;
            this.field_i = param2;
            this.field_d = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Discard";
        field_g = "<%0> is already on your ignore list.";
    }
}
