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
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (!this.field_F) {
            if (super.a(false)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_J = -22;
          if (this.field_F) {
            return true;
          } else {
            L0: {
              if (!super.a(false)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        super.a(param3, param4, param1, 8192, param0);
        var6 = 2 % ((-8 - param2) / 44);
        this.field_E.a(0, param4 + -20, 0, 8192, this.field_J);
        this.field_N.a(param4 - 20, 20, 0, 8192, this.field_J);
        if (this.field_H) {
          this.field_Q.a(0, param4, this.field_J, 8192, param0 + -this.field_J);
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("gh.M(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
            return;
        }
    }

    final boolean l(int param0) {
        if (param0 != 11180) {
            kb var3 = (kb) null;
            this.a(-2, 83, 58, (kb) null);
            return this.field_H;
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
        int discarded$2 = 0;
        String var3 = null;
        if (!this.l(11180)) {
          return;
        } else {
          this.a(this.field_J, this.field_p, (byte) -97, this.field_B, this.field_l);
          if (param0 >= -66) {
            var3 = (String) null;
            discarded$2 = this.a(-114, (String) null);
            this.field_H = false;
            this.field_Q.d(124);
            return;
          } else {
            this.field_H = false;
            this.field_Q.d(124);
            return;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 == 11) {
                break L1;
              } else {
                this.field_K = (ka) null;
                break L1;
              }
            }
            L2: {
              if (this.l(11180)) {
                break L2;
              } else {
                this.m(param1 + -11);
                if (!ArmiesOfGielinor.field_M) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            this.k(-128);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("gh.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param3 > 103) {
                break L1;
              } else {
                this.f(-3);
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, 107, param4, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("gh.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
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
                    var9 = ei.field_e;
                    var7 = var9;
                    var5 = var7;
                    var1_array = var5;
                    var10 = gu.field_b.field_l;
                    var8 = var10;
                    var6 = var8;
                    var2 = var6;
                    var3 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3 >= 8) {
                          var1_array = i.field_Nb;
                          var2 = gu.field_b.field_l;
                          break L5;
                        } else {
                          var5[var3] = oe.c(var9[var3], var10[var3]);
                          var3++;
                          if (var4 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      var3 = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if ((var3 ^ -1) <= -9) {
                              break L8;
                            } else {
                              var1_array[var3] = rn.a(var1_array[var3], var2[var3] ^ -1);
                              var3++;
                              if (var4 != 0) {
                                break L7;
                              } else {
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          gu.field_b = null;
                          as.field_B = true;
                          jd.m(77);
                          break L7;
                        }
                        if (rb.a(0, ei.field_e, 1)) {
                          rt.d((byte) 125);
                          break L3;
                        } else {
                          break L3;
                        }
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
            L9: {
              if (im.field_w) {
                break L9;
              } else {
                if (de.field_a) {
                  break L9;
                } else {
                  vl.field_n.h(32161, 69);
                  de.field_a = true;
                  break L9;
                }
              }
            }
            L10: {
              if (ve.field_b) {
                break L10;
              } else {
                if (af.field_c) {
                  break L10;
                } else {
                  vl.field_n.h(32161, 75);
                  af.field_c = true;
                  break L10;
                }
              }
            }
            L11: {
              var1_int = -118 / ((16 - param0) / 35);
              if (sh.field_h) {
                break L11;
              } else {
                L12: {
                  if (null != jr.field_f) {
                    break L12;
                  } else {
                    jr.field_f = fq.a(14663, 6);
                    break L12;
                  }
                }
                if (!jr.field_f.field_n) {
                  break L11;
                } else {
                  L13: {
                    if (null == jr.field_f.field_s) {
                      break L13;
                    } else {
                      oe.a(jr.field_f.field_s, 1);
                      break L13;
                    }
                  }
                  L14: {
                    if (ps.field_v) {
                      rj.a(1);
                      break L14;
                    } else {
                      L15: {
                        ek.field_d = wp.field_E >> 74681154 & 3;
                        if ((wp.field_E & 1) == 0) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L15;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L15;
                        }
                      }
                      L16: {
                        cu.field_a = stackIn_43_0 != 0;
                        if (-1 == (2 & wp.field_E ^ -1)) {
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L16;
                        } else {
                          stackOut_44_0 = 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L16;
                        }
                      }
                      uc.field_a = stackIn_46_0 != 0;
                      if (3 > ek.field_d) {
                        break L14;
                      } else {
                        ek.field_d = 0;
                        if (var4 == 0) {
                          break L14;
                        } else {
                          rj.a(1);
                          break L14;
                        }
                      }
                    }
                  }
                  sh.field_h = true;
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gh.E(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 71) {
            return -94;
        }
        return this.field_O.field_T;
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.l(11180)) {
          if (0 != (this.field_O.field_T ^ -1)) {
            if (null != this.field_O.field_W) {
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
                  if (param0 != 107805154) {
                    return;
                  } else {
                    L0: {
                      if (var6 >= var7) {
                        break L0;
                      } else {
                        L1: {
                          var8 = -(-var5 + var7 << 1756314736) / var4;
                          if ((var8 ^ -1) <= -1) {
                            break L1;
                          } else {
                            var8 = 0;
                            break L1;
                          }
                        }
                        this.field_Q.field_K.field_W = var8;
                        break L0;
                      }
                    }
                    L2: {
                      var7 = -var3 + (3 * var2 >> -46585790);
                      if (var7 < var6) {
                        L3: {
                          var8 = -(var7 - var5 << 364100752) / var4;
                          if ((var8 ^ -1) < -65537) {
                            var8 = 65536;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        this.field_Q.field_K.field_W = var8;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
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

    final boolean a(kb param0, int param1, char param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        kb var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        boolean stackIn_64_0 = false;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_61_0 = 0;
        boolean stackOut_63_0 = false;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.a(false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
                                      stackOut_55_0 = 1;
                                      stackIn_56_0 = stackOut_55_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    }
                                  }
                                } else {
                                  var6_int = this.field_I.length();
                                  if (var6_int <= 0) {
                                    stackOut_51_0 = 1;
                                    stackIn_52_0 = stackOut_51_0;
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
                                    if (var7 == 0) {
                                      break L4;
                                    } else {
                                      this.m(0);
                                      break L4;
                                    }
                                  }
                                }
                                stackOut_46_0 = 1;
                                stackIn_47_0 = stackOut_46_0;
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
                          L7: {
                            var6_int = this.field_Q.field_S.field_w / this.field_O.field_Z;
                            if (105 != param1) {
                              break L7;
                            } else {
                              this.field_O.field_T = this.field_O.field_T + var6_int;
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          this.field_O.field_T = this.field_O.field_T - var6_int;
                          break L6;
                        }
                        L8: {
                          if (0 > this.field_O.field_T) {
                            this.field_O.field_T = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (var5_int > this.field_O.field_T) {
                            break L9;
                          } else {
                            this.field_O.field_T = -1 + var5_int;
                            break L9;
                          }
                        }
                        this.n(param3 ^ -107796053);
                        stackOut_38_0 = 1;
                        stackIn_39_0 = stackOut_38_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  L10: {
                    if (this.l(11180)) {
                      break L10;
                    } else {
                      this.m(0);
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      if (-100 != (param1 ^ -1)) {
                        break L12;
                      } else {
                        this.field_O.field_T = this.field_O.field_T + 1;
                        if (var7 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_O.field_T = this.field_O.field_T - 1;
                    break L11;
                  }
                  L13: {
                    if ((this.field_O.field_T ^ -1) > -1) {
                      this.field_O.field_T = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_O.field_T >= var5_int) {
                      this.field_O.field_T = var5_int - 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  this.n(107805154);
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              L15: {
                if (param3 == -12215) {
                  break L15;
                } else {
                  var8 = (kb) null;
                  discarded$1 = this.a((kb) null, -8, 'd', 65);
                  break L15;
                }
              }
              if (-81 == (param1 ^ -1)) {
                this.k(param3 + 12094);
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackOut_63_0 = super.a(param0, param1, param2, -12215);
                stackIn_64_0 = stackOut_63_0;
                decompiledRegionSelector0 = 7;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5);
            stackOut_65_1 = new StringBuilder().append("gh.F(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_39_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_47_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_52_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_56_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_62_0 != 0;
                    } else {
                      return stackIn_64_0;
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
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1.toLowerCase();
            var3_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_O.field_W.length <= var3_int) {
                    break L3;
                  } else {
                    var4 = this.field_O.field_W[var3_int].toString().toLowerCase();
                    stackOut_3_0 = var4.startsWith(param1);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0) {
                        stackOut_6_0 = var3_int;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("gh.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_7_0;
        }
    }

    final String h(int param0) {
        if (this.field_t) {
          if (param0 == 21384) {
            if (this.l(11180)) {
              if (this.field_Q.field_t) {
                if (-1 == this.field_O.field_O) {
                  if (this.field_O.j(-6508) != null) {
                    return this.field_O.j(-6508).toString();
                  } else {
                    return super.h(param0 + 0);
                  }
                } else {
                  return this.field_O.field_W[this.field_O.field_O].toString();
                }
              } else {
                if (this.field_O.j(-6508) != null) {
                  return this.field_O.j(-6508).toString();
                } else {
                  return super.h(param0 + 0);
                }
              }
            } else {
              if (this.field_O.j(-6508) != null) {
                return this.field_O.j(-6508).toString();
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nr param12, int param13, nr param14, int param15, int param16, int param17, nr param18, ka param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
            stackOut_4_0 = (RuntimeException) (var20);
            stackOut_4_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param13).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param14 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param18 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param19 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.field_O.a((byte) -126);
          var3 = var2;
          var4 = 0;
          if (this.field_G >= var3) {
            break L0;
          } else {
            var3 = this.field_G;
            var4 = 1;
            break L0;
          }
        }
        this.a(var3 + this.field_J, this.field_p, (byte) 50, this.field_B, this.field_l);
        this.field_O.a(0, this.field_l, param0, param0 ^ 8192, var2);
        this.field_Q = new ai(0, 0, 0, 0, new fc(), this.field_O, (kh) null);
        if (var4 != 0) {
          this.field_Q.a((byte) 118, true, lw.n(param0 ^ 0));
          this.field_Q.a(0, this.field_l, this.field_J, param0 + 8192, this.field_w - this.field_J);
          this.field_H = true;
          this.a((byte) 10, (kb) (this.field_Q));
          this.n(107805154);
          return;
        } else {
          this.field_Q.a(0, this.field_l, this.field_J, param0 + 8192, this.field_w - this.field_J);
          this.field_H = true;
          this.a((byte) 10, (kb) (this.field_Q));
          this.n(107805154);
          return;
        }
    }

    final void f(int param0) {
        this.field_F = false;
        super.f(param0 + 0);
        if (param0 != 1) {
            this.field_G = -4;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int discarded$2 = 0;
        String var7 = null;
        this.field_J = param4;
        if (param3 != 8192) {
          var7 = (String) null;
          discarded$2 = this.a(20, (String) null);
          this.a(param4, param2, (byte) 107, param0, param1);
          return;
        } else {
          this.a(param4, param2, (byte) 107, param0, param1);
          return;
        }
    }

    static {
    }
}
