/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends nv {
    private int field_r;
    static int field_o;
    private int field_s;
    private int field_p;
    private boolean field_q;
    private String[] field_n;
    private int field_u;
    private int field_t;

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, this.field_t >> 512291344, 10);
            param1.a((byte) -126, this.field_p / 50, 6);
            param1.a((byte) 1, this.field_s / 50, 6);
            param1.a((byte) 105, !this.field_q ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, fna[] param1) {
        jea discarded$2 = null;
        RuntimeException runtimeException = null;
        dea var2 = null;
        fna[] var3 = null;
        int var4 = 0;
        fna var5 = null;
        int var6 = 0;
        dea var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = param1[0].field_c;
              var2 = var7;
              if (param0 == -91) {
                break L1;
              } else {
                discarded$2 = oh.b(-52);
                break L1;
              }
            }
            var3 = param1;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3.length <= var4) {
                    break L4;
                  } else {
                    var5 = var3[var4];
                    var5.field_c = var7;
                    var5.field_a = true;
                    var4++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param1[0].field_a = false;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("oh.L(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -29;
        }
        return 23;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.field_n = fda.field_a;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oh.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            this.field_p = 75;
            return param0;
        }
        return param0;
    }

    final static jea b(int param0) {
        if (param0 != 19845) {
            return (jea) null;
        }
        return bsa.field_j.field_tb;
    }

    oh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = 0;
        this.field_p = 50;
        this.field_u = 0;
        this.field_s = 50;
        this.field_q = true;
        this.field_t = 8388608;
        try {
            this.field_t = param1.b((byte) 44, 10) << 9382800;
            this.field_p = param1.b((byte) 44, 6) * 50;
            this.field_s = param1.b((byte) 44, 6) * 50;
            this.field_q = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hca var9 = null;
        hr var10 = null;
        hca var11 = null;
        hr var12 = null;
        hr var13 = null;
        hca var14 = null;
        hr var15 = null;
        hr var16 = null;
        hca var17 = null;
        hr var18 = null;
        hr var19 = null;
        L0: {
          if (null == this.field_n) {
            break L0;
          } else {
            if (0 != this.field_n.length) {
              if (0 < this.field_p) {
                if (-1 <= (this.field_r ^ -1)) {
                  var2 = this.field_t >> -1426969840;
                  if (param0 == 5418) {
                    var2 = var2 * var2;
                    var17 = this.m((byte) 19);
                    var4 = this.field_g.d(3) + -var17.d(param0 ^ 5417) >> 486038448;
                    var5 = this.field_g.e(9648) + -var17.e(9648) >> -1954226704;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 > var6) {
                      L1: {
                        if (!this.field_q) {
                          break L1;
                        } else {
                          var7 = this.o((byte) 46).a(this.field_n.length, 0);
                          if (TombRacer.field_G) {
                            break L1;
                          } else {
                            var19 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                            var19.a(false, 8388608, 0, 8388608, this.field_s);
                            var19.a(0, 16777215, this.field_n[var7]);
                            var19.a(65536, 0, -101, 0);
                            this.field_r = this.field_p;
                            return;
                          }
                        }
                      }
                      var7 = this.field_u;
                      this.field_u = this.field_u + 1;
                      if (this.field_n.length <= this.field_u) {
                        this.field_u = 0;
                        var19 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                        var19.a(false, 8388608, 0, 8388608, this.field_s);
                        var19.a(0, 16777215, this.field_n[var7]);
                        var19.a(65536, 0, -101, 0);
                        this.field_r = this.field_p;
                        return;
                      } else {
                        var18 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                        var18.a(false, 8388608, 0, 8388608, this.field_s);
                        var18.a(0, 16777215, this.field_n[var7]);
                        var18.a(65536, 0, -101, 0);
                        this.field_r = this.field_p;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    discarded$4 = this.a(-91, 115);
                    var2 = var2 * var2;
                    var14 = this.m((byte) 19);
                    var4 = this.field_g.d(3) + -var14.d(param0 ^ 5417) >> 486038448;
                    var5 = this.field_g.e(9648) + -var14.e(9648) >> -1954226704;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 > var6) {
                      L2: {
                        if (!this.field_q) {
                          break L2;
                        } else {
                          var7 = this.o((byte) 46).a(this.field_n.length, 0);
                          if (TombRacer.field_G) {
                            break L2;
                          } else {
                            var16 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                            var16.a(false, 8388608, 0, 8388608, this.field_s);
                            var16.a(0, 16777215, this.field_n[var7]);
                            var16.a(65536, 0, -101, 0);
                            this.field_r = this.field_p;
                            return;
                          }
                        }
                      }
                      var7 = this.field_u;
                      this.field_u = this.field_u + 1;
                      if (this.field_n.length > this.field_u) {
                        var15 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                        var15.a(false, 8388608, 0, 8388608, this.field_s);
                        var15.a(0, 16777215, this.field_n[var7]);
                        var15.a(65536, 0, -101, 0);
                        this.field_r = this.field_p;
                        return;
                      } else {
                        this.field_u = 0;
                        var16 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                        var16.a(false, 8388608, 0, 8388608, this.field_s);
                        var16.a(0, 16777215, this.field_n[var7]);
                        var16.a(65536, 0, -101, 0);
                        this.field_r = this.field_p;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  this.field_r = this.field_r - 1;
                  return;
                }
              } else {
                var2 = this.field_t >> -1426969840;
                if (param0 == 5418) {
                  var2 = var2 * var2;
                  var11 = this.m((byte) 19);
                  var4 = this.field_g.d(3) + -var11.d(param0 ^ 5417) >> 486038448;
                  var5 = this.field_g.e(9648) + -var11.e(9648) >> -1954226704;
                  var6 = var4 * var4 - -(var5 * var5);
                  if (var2 > var6) {
                    L3: {
                      if (!this.field_q) {
                        break L3;
                      } else {
                        var7 = this.o((byte) 46).a(this.field_n.length, 0);
                        if (TombRacer.field_G) {
                          break L3;
                        } else {
                          var13 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                          var13.a(false, 8388608, 0, 8388608, this.field_s);
                          var13.a(0, 16777215, this.field_n[var7]);
                          var13.a(65536, 0, -101, 0);
                          this.field_r = this.field_p;
                          return;
                        }
                      }
                    }
                    var7 = this.field_u;
                    this.field_u = this.field_u + 1;
                    if (this.field_n.length > this.field_u) {
                      var12 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                      var12.a(false, 8388608, 0, 8388608, this.field_s);
                      var12.a(0, 16777215, this.field_n[var7]);
                      var12.a(65536, 0, -101, 0);
                      this.field_r = this.field_p;
                      return;
                    } else {
                      this.field_u = 0;
                      var13 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                      var13.a(false, 8388608, 0, 8388608, this.field_s);
                      var13.a(0, 16777215, this.field_n[var7]);
                      var13.a(65536, 0, -101, 0);
                      this.field_r = this.field_p;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    discarded$5 = this.a(-91, 115);
                    var2 = var2 * var2;
                    var9 = this.m((byte) 19);
                    var4 = this.field_g.d(3) + -var9.d(param0 ^ 5417) >> 486038448;
                    var5 = this.field_g.e(9648) + -var9.e(9648) >> -1954226704;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 <= var6) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (!this.field_q) {
                            break L6;
                          } else {
                            var7 = this.o((byte) 46).a(this.field_n.length, 0);
                            if (!TombRacer.field_G) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7 = this.field_u;
                        this.field_u = this.field_u + 1;
                        if (this.field_n.length <= this.field_u) {
                          this.field_u = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var10 = this.b(true).a(this.field_g.d(3), this.field_g.e(param0 ^ 12442), (byte) 100, this.field_g.P(0));
                      var10.a(false, 8388608, 0, 8388608, this.field_s);
                      var10.a(0, 16777215, this.field_n[var7]);
                      var10.a(65536, 0, -101, 0);
                      this.field_r = this.field_p;
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        field_o = 0;
    }
}
