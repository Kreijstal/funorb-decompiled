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
        String var5;
        u var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        bi var14;
        String var17;
        Object var18;
        bi var19;
        bi var20;
        bi var21;
        bi var22;
        String var23;
        Object var24;
        bi var25;
        bi var26;
        bi var27;
        bi var28;
        String var29;
        Object var30;
        bi var31;
        bi var35;
        bi var37;
        Object var38;
        bi var39;
        bi var40;
        bi var41;
        bi var42;
        pj var43;
        pj var44;
        pj var45;
        pj var46;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -79 / ((param0 - 61) / 59);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ah.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void g(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
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
