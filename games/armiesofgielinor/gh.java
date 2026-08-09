/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends tj implements he {
    static String field_P;
    private int field_J;
    String field_I;
    private boolean field_F;
    static wk field_M;
    ka field_K;
    private fw field_E;
    boolean field_H;
    pp field_O;
    private fw field_N;
    private int field_G;
    ai field_Q;

    public static void a(int param0) {
        field_M = null;
        if (param0 != -11835) {
            return;
        }
        field_P = null;
    }

    private final void a(boolean param0, String param1) {
        if (!(null != this.field_O.field_W)) {
            return;
        }
        int var3_int = this.a(0, param1.toLowerCase());
        if (!(var3_int != -1)) {
            return;
        }
        try {
            this.field_O.field_T = var3_int;
            if (!param0) {
                this.field_F = true;
            }
            this.n(107805154);
            this.field_I = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_J = -22;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_F) {
              break L2;
            } else {
              if (!super.a(false)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param3, param4, param1, 8192, param0);
        int var6 = 2 % ((-8 - param2) / 44);
        this.field_E.a(0, param4 + -20, 0, 8192, this.field_J);
        this.field_N.a(param4 - 20, 20, 0, 8192, this.field_J);
        if (this.field_H) {
            this.field_Q.a(0, param4, this.field_J, 8192, param0 + -this.field_J);
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param1.f(1);
            if (param0 == 11) {
              L1: {
                this.field_I = "";
                this.field_F = true;
                if (null == this.field_x) {
                  break L1;
                } else {
                  if (!(this.field_x instanceof ie)) {
                    break L1;
                  } else {
                    ((ie) ((Object) this.field_x)).a((kb) (this), this.field_F, (byte) -41);
                    break L1;
                  }
                }
              }
              stackIn_7_0 = 1;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("gh.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void g(byte param0) {
        if (!(!(this.field_x instanceof rp))) {
            ((rp) ((Object) this.field_x)).a(-109, (gh) (this));
        }
        if (param0 <= 4) {
            gh.a(-40);
        }
    }

    final boolean l(int param0) {
        if (param0 != 11180) {
            kb var3 = (kb) null;
            this.a(-2, 83, 58, (kb) null);
        }
        return this.field_H;
    }

    gh(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (kh) null);
        this.field_I = "";
        this.field_K = ArmiesOfGielinor.field_J;
        try {
            this.field_O = new pp((gh) (this), this.field_K, param0, param1);
            this.field_H = false;
            this.field_O.field_x = (qo) (this);
            this.field_G = param2;
            this.field_E = new fw("", new fk((gh) (this)), (qo) (this));
            this.field_N = new fw();
            this.field_N.field_k = (kh) ((Object) new gs());
            this.field_N.field_x = (qo) (this);
            this.a((byte) 10, (kb) (this.field_E));
            this.a((byte) 10, (kb) (this.field_N));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        int discarded$0 = 0;
        if (!(this.l(11180))) {
            return;
        }
        this.a(this.field_J, this.field_p, (byte) -97, this.field_B, this.field_l);
        if (param0 >= -66) {
            String var3 = (String) null;
            discarded$0 = this.a(-114, (String) null);
        }
        this.field_H = false;
        this.field_Q.d(124);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                this.field_K = (ka) null;
                break L1;
              }
            }
            L2: {
              if (this.l(11180)) {
                this.k(-128);
                break L2;
              } else {
                this.m(param1 + -11);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("gh.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gh.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                this.f(-3);
                break L1;
              }
            }
            stackIn_3_0 = super.a(param0, param1, param2, 107, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("gh.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static void f(byte param0) {
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!as.field_B) {
                L2: {
                  if (null == gu.field_b) {
                    gu.field_b = jc.b(-1, 4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (gu.field_b.field_m) {
                    var12 = ei.field_e;
                    var10 = var12;
                    var5 = var10;
                    var1 = var5;
                    var16 = gu.field_b.field_l;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var13 = i.field_Nb;
                        var11 = var13;
                        var7 = var11;
                        var1 = var7;
                        var17 = gu.field_b.field_l;
                        var9 = 0;
                        var3 = var9;
                        L5: while (true) {
                          if ((var9 ^ -1) <= -9) {
                            gu.field_b = null;
                            as.field_B = true;
                            jd.m(77);
                            if (rb.a(0, ei.field_e, 1)) {
                              rt.d((byte) 125);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var7[var9] = rn.a(var13[var9], var17[var9] ^ -1);
                            var9++;
                            continue L5;
                          }
                        }
                      } else {
                        var5[var3] = oe.c(var12[var3], var16[var3]);
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (!as.field_B) {
                  break L1;
                } else {
                  qj.h(-78);
                  ws.b(true);
                  if (-10 != (tg.field_a ^ -1)) {
                    break L1;
                  } else {
                    if (io.a(i.field_Nb, (byte) 116)) {
                      break L1;
                    } else {
                      tg.field_a = 0;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (im.field_w) {
                break L6;
              } else {
                if (de.field_a) {
                  break L6;
                } else {
                  vl.field_n.h(32161, 69);
                  de.field_a = true;
                  break L6;
                }
              }
            }
            L7: {
              if (ve.field_b) {
                break L7;
              } else {
                if (af.field_c) {
                  break L7;
                } else {
                  vl.field_n.h(32161, 75);
                  af.field_c = true;
                  break L7;
                }
              }
            }
            L8: {
              var1_int = -118 / ((16 - param0) / 35);
              if (sh.field_h) {
                break L8;
              } else {
                L9: {
                  if (null != jr.field_f) {
                    break L9;
                  } else {
                    jr.field_f = fq.a(14663, 6);
                    break L9;
                  }
                }
                if (!jr.field_f.field_n) {
                  break L8;
                } else {
                  L10: {
                    if (null == jr.field_f.field_s) {
                      break L10;
                    } else {
                      oe.a(jr.field_f.field_s, 1);
                      break L10;
                    }
                  }
                  L11: {
                    if (ps.field_v) {
                      rj.a(1);
                      break L11;
                    } else {
                      L12: {
                        ek.field_d = wp.field_E >> 74681154 & 3;
                        if ((wp.field_E & 1) == 0) {
                          stackIn_37_0 = 0;
                          break L12;
                        } else {
                          stackIn_37_0 = 1;
                          break L12;
                        }
                      }
                      L13: {
                        cu.field_a = stackIn_37_0 != 0;
                        if (-1 == (2 & wp.field_E ^ -1)) {
                          stackIn_40_0 = 0;
                          break L13;
                        } else {
                          stackIn_40_0 = 1;
                          break L13;
                        }
                      }
                      uc.field_a = stackIn_40_0 != 0;
                      if (3 > ek.field_d) {
                        break L11;
                      } else {
                        ek.field_d = 0;
                        break L11;
                      }
                    }
                  }
                  sh.field_h = true;
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "gh.E(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 71) {
            return -94;
        }
        return this.field_O.field_T;
    }

    private final void n(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          if (!this.l(11180)) {
            break L0;
          } else {
            if (0 == (this.field_O.field_T ^ -1)) {
              break L0;
            } else {
              if (null == this.field_O.field_W) {
                break L0;
              } else {
                if (null != this.field_Q.field_K) {
                  var2 = this.field_Q.field_S.field_w;
                  var3 = this.field_O.field_Z;
                  var4 = this.field_O.field_w + -var2;
                  if ((var4 ^ -1) >= -1) {
                    return;
                  } else {
                    var5 = var3 * this.field_O.field_T;
                    var6 = var5 + this.field_Q.field_S.field_E.field_p;
                    var7 = var2 >> 107805154;
                    if (param0 == 107805154) {
                      L1: {
                        if (var6 >= var7) {
                          break L1;
                        } else {
                          L2: {
                            var8 = -(-var5 + var7 << 1756314736) / var4;
                            if ((var8 ^ -1) <= -1) {
                              break L2;
                            } else {
                              var8 = 0;
                              break L2;
                            }
                          }
                          this.field_Q.field_K.field_W = var8;
                          break L1;
                        }
                      }
                      L3: {
                        var7 = -var3 + (3 * var2 >> -46585790);
                        if (var7 < var6) {
                          L4: {
                            var8 = -(var7 - var5 << 364100752) / var4;
                            if ((var8 ^ -1) < -65537) {
                              var8 = 65536;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          this.field_Q.field_K.field_W = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        boolean stackIn_60_0 = false;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        kb var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.a(false)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_O.field_W != null) {
                  L2: {
                    var5_int = this.field_O.field_W.length;
                    if (-100 == (param1 ^ -1)) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) == -99) {
                        break L2;
                      } else {
                        L3: {
                          if (param1 == 105) {
                            break L3;
                          } else {
                            if (param1 == 104) {
                              break L3;
                            } else {
                              if (param1 != 84) {
                                if (param1 != 85) {
                                  if (32 > param2) {
                                    break L1;
                                  } else {
                                    if (param2 >= 128) {
                                      break L1;
                                    } else {
                                      var6 = this.field_I + param2;
                                      this.a(true, var6);
                                      stackIn_52_0 = 1;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    }
                                  }
                                } else {
                                  var6_int = this.field_I.length();
                                  if (var6_int <= 0) {
                                    stackIn_48_0 = 1;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    this.field_I = this.field_I.substring(0, var6_int - 1);
                                    return true;
                                  }
                                }
                              } else {
                                L4: {
                                  if (!this.field_H) {
                                    this.m(0);
                                    break L4;
                                  } else {
                                    this.k(-116);
                                    break L4;
                                  }
                                }
                                stackIn_43_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                        L5: {
                          if (this.l(param3 + 23395)) {
                            break L5;
                          } else {
                            this.m(0);
                            break L5;
                          }
                        }
                        L6: {
                          var6_int = this.field_Q.field_S.field_w / this.field_O.field_Z;
                          if (105 != param1) {
                            this.field_O.field_T = this.field_O.field_T - var6_int;
                            break L6;
                          } else {
                            this.field_O.field_T = this.field_O.field_T + var6_int;
                            break L6;
                          }
                        }
                        L7: {
                          if (0 > this.field_O.field_T) {
                            this.field_O.field_T = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var5_int > this.field_O.field_T) {
                            break L8;
                          } else {
                            this.field_O.field_T = -1 + var5_int;
                            break L8;
                          }
                        }
                        this.n(param3 ^ -107796053);
                        stackIn_37_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  L9: {
                    if (this.l(11180)) {
                      break L9;
                    } else {
                      this.m(0);
                      break L9;
                    }
                  }
                  L10: {
                    if (-100 != (param1 ^ -1)) {
                      this.field_O.field_T = this.field_O.field_T - 1;
                      break L10;
                    } else {
                      this.field_O.field_T = this.field_O.field_T + 1;
                      break L10;
                    }
                  }
                  L11: {
                    if ((this.field_O.field_T ^ -1) > -1) {
                      this.field_O.field_T = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (this.field_O.field_T >= var5_int) {
                      this.field_O.field_T = var5_int - 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  this.n(107805154);
                  stackIn_22_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              L13: {
                if (param3 == -12215) {
                  break L13;
                } else {
                  var8 = (kb) null;
                  this.a((kb) null, -8, 'd', 65);
                  break L13;
                }
              }
              if (-81 == (param1 ^ -1)) {
                this.k(param3 + 12094);
                stackIn_58_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackIn_60_0 = super.a(param0, param1, param2, -12215);
                decompiledRegionSelector0 = 7;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var5);

            stackIn_63_1 = new StringBuilder().append("gh.F(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L14;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_43_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_48_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_52_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_58_0 != 0;
                    } else {
                      return stackIn_60_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1.toLowerCase();
            var3_int = param0;
            L1: while (true) {
              if (this.field_O.field_W.length <= var3_int) {
                stackIn_9_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = this.field_O.field_W[var3_int].toString().toLowerCase();
                if (var4.startsWith(param1)) {
                  stackIn_6_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("gh.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_9_0;
        }
    }

    final String h(int param0) {
        if (this.field_t) {
          if (param0 == 21384) {
            L0: {
              if (!this.l(11180)) {
                break L0;
              } else {
                if (!this.field_Q.field_t) {
                  break L0;
                } else {
                  if (-1 != this.field_O.field_O) {
                    return this.field_O.field_W[this.field_O.field_O].toString();
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (this.field_O.j(-6508) != null) {
              return this.field_O.j(-6508).toString();
            } else {
              return super.h(param0 + 0);
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nr param12, int param13, nr param14, int param15, int param16, int param17, nr param18, ka param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            uk.field_s = param4;
            ej.field_G = param19;
            kq.a(param3, param17, (byte) 87, param10, param2);
            cv.a((byte) 123, param18, param5, param16);
            if (param11 == -99) {
              op.a(param7, param1, param12, param14, -3, param6);
              g.a((byte) -85, param15, param9);
              mi.a(param8, param0, param13, 3815);
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
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void m(int param0) {
        int var2 = this.field_O.a((byte) -126);
        int var3 = var2;
        int var4 = 0;
        if (this.field_G < var3) {
            var3 = this.field_G;
            var4 = 1;
        }
        this.a(var3 + this.field_J, this.field_p, (byte) 50, this.field_B, this.field_l);
        this.field_O.a(0, this.field_l, param0, param0 ^ 8192, var2);
        this.field_Q = new ai(0, 0, 0, 0, new fc(), this.field_O, (kh) null);
        if (var4 != 0) {
            this.field_Q.a((byte) 118, true, lw.n(param0 ^ 0));
        }
        this.field_Q.a(0, this.field_l, this.field_J, param0 + 8192, this.field_w - this.field_J);
        this.field_H = true;
        this.a((byte) 10, (kb) (this.field_Q));
        this.n(107805154);
    }

    final void f(int param0) {
        this.field_F = false;
        super.f(param0 + 0);
        if (param0 != 1) {
            this.field_G = -4;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        this.field_J = param4;
        if (param3 != 8192) {
            String var7 = (String) null;
            discarded$0 = this.a(20, (String) null);
        }
        this.a(param4, param2, (byte) 107, param0, param1);
    }

    static {
    }
}
