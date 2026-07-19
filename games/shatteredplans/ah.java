/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ts {
    static int field_T;
    static int field_P;
    static String field_O;
    static int field_X;
    static int field_R;
    private gk field_M;
    private bi field_V;
    private String field_W;
    private int field_N;
    static String field_Q;
    static String field_S;
    static int field_U;

    ah(gk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ea.b(114));
        try {
            this.field_M = param0;
            this.field_W = param1;
            this.a(param3, param5, (byte) 113, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int h(int param0) {
        if (param0 <= 92) {
            field_S = (String) null;
            return rn.field_b;
        }
        return rn.field_b;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            this.field_N = this.field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ah.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        u var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var14 = null;
        String var17 = null;
        Object var18 = null;
        bi var19 = null;
        bi var20 = null;
        bi var21 = null;
        bi var22 = null;
        String var23 = null;
        Object var24 = null;
        bi var25 = null;
        bi var26 = null;
        bi var27 = null;
        bi var28 = null;
        String var29 = null;
        Object var30 = null;
        bi var31 = null;
        bi var35 = null;
        bi var37 = null;
        Object var38 = null;
        bi var39 = null;
        bi var40 = null;
        bi var41 = null;
        bi var42 = null;
        pj var43 = null;
        pj var44 = null;
        pj var45 = null;
        pj var46 = null;
        var18 = null;
        var24 = null;
        var30 = null;
        var38 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = this.field_M.c(126);
        if (var6 != pd.field_h) {
          if (var6 != lm.field_d) {
            var5 = this.field_M.a((byte) -63);
            if (var5 != null) {
              L0: {
                if (!var5.equals(this.field_s)) {
                  this.field_s = var5;
                  this.e(false);
                  break L0;
                } else {
                  break L0;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = this.field_M.c(-123);
              var46 = (pj) ((Object) this.field_p);
              var9 = this.field_m + param3;
              var10 = var46.a(param2, (vg) (this), 66) - -(var46.a((vg) (this), true).b(438) >> 1453876705);
              if (pd.field_h == var6) {
                L1: {
                  var40 = lp.field_w[0];
                  var11 = var40.field_o << -2099590239;
                  var12 = var40.field_p << 285590465;
                  if (this.field_V == null) {
                    break L1;
                  } else {
                    if (this.field_V.field_z < var11) {
                      break L1;
                    } else {
                      if (this.field_V.field_w < var12) {
                        break L1;
                      } else {
                        aq.a((byte) 106, this.field_V);
                        gf.b();
                        var40.b(112, 144, var40.field_o << -1607677340, var40.field_p << 685219460, -this.field_N << 69133002, 4096);
                        ln.f((byte) -63);
                        this.field_V.c(var9 + -(var40.field_o >> -130526591), -var40.field_p + var10, 256);
                        return;
                      }
                    }
                  }
                }
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
                var40.b(112, 144, var40.field_o << -1607677340, var40.field_p << 685219460, -this.field_N << 69133002, 4096);
                ln.f((byte) -63);
                this.field_V.c(var9 + -(var40.field_o >> -130526591), -var40.field_p + var10, 256);
                return;
              } else {
                if (var6 != lm.field_d) {
                  L2: {
                    if (var6 == tj.field_b) {
                      var42 = lp.field_w[2];
                      var42.c(var9, var10 + -(var42.field_w >> -1100554015), 256);
                      break L2;
                    } else {
                      if (p.field_g != var6) {
                        break L2;
                      } else {
                        var41 = lp.field_w[1];
                        var41.c(var9, -(var41.field_w >> 1832213633) + var10, 256);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  var39 = lp.field_w[0];
                  var11 = var39.field_o << -2099590239;
                  var12 = var39.field_p << 285590465;
                  if (this.field_V != null) {
                    L3: {
                      if (this.field_V.field_z < var11) {
                        break L3;
                      } else {
                        if (this.field_V.field_w < var12) {
                          break L3;
                        } else {
                          aq.a((byte) 106, this.field_V);
                          gf.b();
                          var39.b(112, 144, var39.field_o << -1607677340, var39.field_p << 685219460, -this.field_N << 69133002, 4096);
                          ln.f((byte) -63);
                          this.field_V.c(var9 + -(var39.field_o >> -130526591), -var39.field_p + var10, 256);
                          return;
                        }
                      }
                    }
                    this.field_V = new bi(var11, var12);
                    aq.a((byte) -31, this.field_V);
                    var39.b(112, 144, var39.field_o << -1607677340, var39.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var39.field_o >> -130526591), -var39.field_p + var10, 256);
                    return;
                  } else {
                    this.field_V = new bi(var11, var12);
                    aq.a((byte) -31, this.field_V);
                    var39.b(112, 144, var39.field_o << -1607677340, var39.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var39.field_o >> -130526591), -var39.field_p + var10, 256);
                    return;
                  }
                }
              }
            } else {
              L4: {
                var29 = this.field_W;
                var5 = var29;
                if (!var29.equals(this.field_s)) {
                  this.field_s = var29;
                  this.e(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_M.c(-123);
                var45 = (pj) ((Object) this.field_p);
                var9 = this.field_m + param3;
                var10 = var45.a(param2, (vg) (this), 66) - -(var45.a((vg) (this), true).b(438) >> 1453876705);
                if (pd.field_h == var6) {
                  break L5;
                } else {
                  if (var6 != lm.field_d) {
                    if (var6 != tj.field_b) {
                      if (p.field_g == var6) {
                        var35 = lp.field_w[1];
                        var35.c(var9, -(var35.field_w >> 1832213633) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var37 = lp.field_w[2];
                      var37.c(var9, var10 + -(var37.field_w >> -1100554015), 256);
                      return;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var31 = lp.field_w[0];
              var14 = var31;
              var11 = var31.field_o << -2099590239;
              var12 = var31.field_p << 285590465;
              if (this.field_V != null) {
                if (this.field_V.field_z >= var11) {
                  if (this.field_V.field_w < var12) {
                    this.field_V = new bi(var11, var12);
                    aq.a((byte) -31, this.field_V);
                    var31.b(112, 144, var31.field_o << -1607677340, var31.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var31.field_o >> -130526591), -var31.field_p + var10, 256);
                    return;
                  } else {
                    aq.a((byte) 106, this.field_V);
                    gf.b();
                    var31.b(112, 144, var31.field_o << -1607677340, var31.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var31.field_o >> -130526591), -var31.field_p + var10, 256);
                    return;
                  }
                } else {
                  this.field_V = new bi(var11, var12);
                  aq.a((byte) -31, this.field_V);
                  var31.b(112, 144, var31.field_o << -1607677340, var31.field_p << 685219460, -this.field_N << 69133002, 4096);
                  ln.f((byte) -63);
                  this.field_V.c(var9 + -(var31.field_o >> -130526591), -var31.field_p + var10, 256);
                  return;
                }
              } else {
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
                var31.b(112, 144, var31.field_o << -1607677340, var31.field_p << 685219460, -this.field_N << 69133002, 4096);
                ln.f((byte) -63);
                this.field_V.c(var9 + -(var31.field_o >> -130526591), -var31.field_p + var10, 256);
                return;
              }
            }
          } else {
            L6: {
              var23 = qr.field_R;
              if (!var23.equals(this.field_s)) {
                this.field_s = var23;
                this.e(false);
                break L6;
              } else {
                break L6;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = this.field_M.c(-123);
            var44 = (pj) ((Object) this.field_p);
            var9 = this.field_m + param3;
            var10 = var44.a(param2, (vg) (this), 66) - -(var44.a((vg) (this), true).b(438) >> 1453876705);
            if (pd.field_h == var6) {
              var26 = lp.field_w[0];
              var11 = var26.field_o << -2099590239;
              var12 = var26.field_p << 285590465;
              if (this.field_V != null) {
                if (this.field_V.field_z >= var11) {
                  if (this.field_V.field_w >= var12) {
                    aq.a((byte) 106, this.field_V);
                    gf.b();
                    var26.b(112, 144, var26.field_o << -1607677340, var26.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var26.field_o >> -130526591), -var26.field_p + var10, 256);
                    return;
                  } else {
                    this.field_V = new bi(var11, var12);
                    aq.a((byte) -31, this.field_V);
                    var26.b(112, 144, var26.field_o << -1607677340, var26.field_p << 685219460, -this.field_N << 69133002, 4096);
                    ln.f((byte) -63);
                    this.field_V.c(var9 + -(var26.field_o >> -130526591), -var26.field_p + var10, 256);
                    return;
                  }
                } else {
                  this.field_V = new bi(var11, var12);
                  aq.a((byte) -31, this.field_V);
                  var26.b(112, 144, var26.field_o << -1607677340, var26.field_p << 685219460, -this.field_N << 69133002, 4096);
                  ln.f((byte) -63);
                  this.field_V.c(var9 + -(var26.field_o >> -130526591), -var26.field_p + var10, 256);
                  return;
                }
              } else {
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
                var26.b(112, 144, var26.field_o << -1607677340, var26.field_p << 685219460, -this.field_N << 69133002, 4096);
                ln.f((byte) -63);
                this.field_V.c(var9 + -(var26.field_o >> -130526591), -var26.field_p + var10, 256);
                return;
              }
            } else {
              if (var6 != lm.field_d) {
                if (var6 != tj.field_b) {
                  if (p.field_g != var6) {
                    return;
                  } else {
                    var27 = lp.field_w[1];
                    var27.c(var9, -(var27.field_w >> 1832213633) + var10, 256);
                    return;
                  }
                } else {
                  var28 = lp.field_w[2];
                  var28.c(var9, var10 + -(var28.field_w >> -1100554015), 256);
                  return;
                }
              } else {
                L7: {
                  L8: {
                    var25 = lp.field_w[0];
                    var11 = var25.field_o << -2099590239;
                    var12 = var25.field_p << 285590465;
                    if (this.field_V == null) {
                      break L8;
                    } else {
                      if (this.field_V.field_z < var11) {
                        break L8;
                      } else {
                        if (this.field_V.field_w < var12) {
                          break L8;
                        } else {
                          aq.a((byte) 106, this.field_V);
                          gf.b();
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_V = new bi(var11, var12);
                  aq.a((byte) -31, this.field_V);
                  break L7;
                }
                var25.b(112, 144, var25.field_o << -1607677340, var25.field_p << 685219460, -this.field_N << 69133002, 4096);
                ln.f((byte) -63);
                this.field_V.c(var9 + -(var25.field_o >> -130526591), -var25.field_p + var10, 256);
                return;
              }
            }
          }
        } else {
          L9: {
            var17 = qr.field_R;
            if (!var17.equals(this.field_s)) {
              this.field_s = var17;
              this.e(false);
              break L9;
            } else {
              break L9;
            }
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_M.c(-123);
          var43 = (pj) ((Object) this.field_p);
          var9 = this.field_m + param3;
          var10 = var43.a(param2, (vg) (this), 66) - -(var43.a((vg) (this), true).b(438) >> 1453876705);
          if (pd.field_h == var6) {
            var20 = lp.field_w[0];
            var11 = var20.field_o << -2099590239;
            var12 = var20.field_p << 285590465;
            if (this.field_V != null) {
              if (this.field_V.field_z >= var11) {
                if (this.field_V.field_w >= var12) {
                  aq.a((byte) 106, this.field_V);
                  gf.b();
                  var20.b(112, 144, var20.field_o << -1607677340, var20.field_p << 685219460, -this.field_N << 69133002, 4096);
                  ln.f((byte) -63);
                  this.field_V.c(var9 + -(var20.field_o >> -130526591), -var20.field_p + var10, 256);
                  return;
                } else {
                  this.field_V = new bi(var11, var12);
                  aq.a((byte) -31, this.field_V);
                  var20.b(112, 144, var20.field_o << -1607677340, var20.field_p << 685219460, -this.field_N << 69133002, 4096);
                  ln.f((byte) -63);
                  this.field_V.c(var9 + -(var20.field_o >> -130526591), -var20.field_p + var10, 256);
                  return;
                }
              } else {
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
                var20.b(112, 144, var20.field_o << -1607677340, var20.field_p << 685219460, -this.field_N << 69133002, 4096);
                ln.f((byte) -63);
                this.field_V.c(var9 + -(var20.field_o >> -130526591), -var20.field_p + var10, 256);
                return;
              }
            } else {
              this.field_V = new bi(var11, var12);
              aq.a((byte) -31, this.field_V);
              var20.b(112, 144, var20.field_o << -1607677340, var20.field_p << 685219460, -this.field_N << 69133002, 4096);
              ln.f((byte) -63);
              this.field_V.c(var9 + -(var20.field_o >> -130526591), -var20.field_p + var10, 256);
              return;
            }
          } else {
            if (var6 != lm.field_d) {
              if (var6 != tj.field_b) {
                if (p.field_g == var6) {
                  var21 = lp.field_w[1];
                  var21.c(var9, -(var21.field_w >> 1832213633) + var10, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var22 = lp.field_w[2];
                var22.c(var9, var10 + -(var22.field_w >> -1100554015), 256);
                return;
              }
            } else {
              L10: {
                L11: {
                  var19 = lp.field_w[0];
                  var11 = var19.field_o << -2099590239;
                  var12 = var19.field_p << 285590465;
                  if (this.field_V == null) {
                    break L11;
                  } else {
                    if (this.field_V.field_z < var11) {
                      break L11;
                    } else {
                      if (this.field_V.field_w < var12) {
                        break L11;
                      } else {
                        aq.a((byte) 106, this.field_V);
                        gf.b();
                        break L10;
                      }
                    }
                  }
                }
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
                break L10;
              }
              var19.b(112, 144, var19.field_o << -1607677340, var19.field_p << 685219460, -this.field_N << 69133002, 4096);
              ln.f((byte) -63);
              this.field_V.c(var9 + -(var19.field_o >> -130526591), -var19.field_p + var10, 256);
              return;
            }
          }
        }
    }

    final boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -79 / ((param0 - 61) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ah.CA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void g(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6 = gd.field_b;
            var1 = var6;
            var3 = -98 % ((param0 - 2) / 53);
            var2 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "ah.A(" + param0 + ')');
        }
    }

    final String c(boolean param0) {
        if (param0) {
            return null;
        }
        this.field_N = -109;
        return null;
    }

    public static void i(int param0) {
        field_S = null;
        field_Q = null;
        if (param0 != 4096) {
            field_S = (String) null;
            field_O = null;
            return;
        }
        field_O = null;
    }

    static {
        field_O = "Hide lobby chat";
        field_T = 0;
        field_U = 0;
        field_Q = "Human Players";
    }
}
