/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends rg {
    private int field_I;
    private int field_J;
    private int field_M;
    private int field_G;
    static String[] field_F;
    static hr[] field_H;
    static String[] field_L;
    private int field_N;
    private int field_K;

    boolean h(int param0) {
        this.f((byte) -128);
        if (param0 != 0) {
            wi var3 = (wi) null;
            hf.a(true, (wi) null, -72, -89, 23, -11);
        }
        return super.h(0);
    }

    final static hr a(ha param0, ri param1, byte param2) {
        RuntimeException var3 = null;
        wi var4 = null;
        hr stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -11) {
                break L1;
              } else {
                var4 = (wi) null;
                hf.a(false, (wi) null, -97, 35, 94, -35);
                break L1;
              }
            }
            stackIn_3_0 = param0.a(param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hf.FA(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void j(int param0) {
        if (param0 <= 8) {
            field_H = (hr[]) null;
        }
        field_H = null;
        field_F = null;
        field_L = null;
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > 110) {
          lk.a(6 + param1, 35 + param2, this.field_q + -12, -40 + this.field_p, 2105376, 0);
          var4 = 35;
          var5 = 211;
          var6 = 194;
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var7 >= var4) {
              var6 = 169;
              var5 = 194;
              var4 = 22;
              var7 = 0;
              var8 = 35 + param2;
              L1: while (true) {
                if (var4 <= var7) {
                  ar.field_E.a(param1 + (this.field_q + -90), 10 + param2);
                  ud.a(35 + param2, this.field_q + -10, 2, param1 + 5, li.field_v);
                  ud.a(-22 + this.field_p + param2, this.field_q, 2, param1, hd.field_O);
                  var6 = 127;
                  var5 = 169;
                  var4 = this.field_p + -79;
                  var7 = 0;
                  var8 = param2 - -57;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var7 * (-var5 + var6) / var4 + var5;
                      var9 = var9 | (var9 << 1797814768 | var9 << -1619192344);
                      lk.f(param1, var8, 6, var9);
                      lk.f(-6 + (this.field_q + param1), var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var5 + (-var5 + var6) * var7 / var4;
                  var9 = var9 | (var9 << -1288974672 | var9 << -1532349560);
                  lk.f(param1, var8, 6, var9);
                  lk.f(param1 + this.field_q - 6, var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if ((var8 ^ -1) <= (lk.field_i ^ -1)) {
                if (lk.field_e > var8) {
                  L3: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = this.field_q;
                    if ((var7 ^ -1) < -21) {
                      break L3;
                    } else {
                      L4: while (true) {
                        if (var10 > 20) {
                          break L3;
                        } else {
                          var12 = (20 - var7) * (-var7 + 20) - -((20 + -var10) * (-var10 + 20));
                          if (var12 <= 462) {
                            if (var12 < 420) {
                              break L3;
                            } else {
                              var13 = var9 * (-var12 + 462) / 42;
                              var13 = var13 | (var13 << -1227166864 | var13 << -745737208);
                              lk.field_a[param1 + (var8 * lk.field_b - -var10)] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if ((var7 ^ -1) >= -21) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if ((var13 ^ -1) < -21) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (-var7 + 20) - -(var13 * var13);
                            if ((var14 ^ -1) < -463) {
                              break L7;
                            } else {
                              if ((var14 ^ -1) > -421) {
                                var12 = 1 + var11;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var15 = var9 * (462 + -var14) / 42;
                                var15 = var15 | (var15 << 513132008 | var15 << -1708079184);
                                lk.field_a[param1 + var8 * lk.field_b - -var11] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var9 = var9 | (var9 << -1728300120 | var9 << -243846192);
                  lk.f(var10 + param1, var8, -var10 + var11, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void i(int param0) {
        if (param0 != 0) {
            this.g(122);
        }
    }

    final static java.awt.Frame a(boolean param0, wi param1, int param2, int param3, int param4, int param5) {
        Object stackIn_8_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cd[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        cd[] var10 = null;
        jr var11 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) 125)) {
              L1: {
                if (param3 == 0) {
                  var10 = ul.a((byte) -73, param1);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (param5 == var10[var8].field_a) {
                          if (var10[var8].field_g == param4) {
                            L3: {
                              if (param2 == 0) {
                                break L3;
                              } else {
                                if (var10[var8].field_b == param2) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              if (var7_int == 0) {
                                break L4;
                              } else {
                                if (param3 < var10[var8].field_e) {
                                  break L4;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            param3 = var10[var8].field_e;
                            var7_int = 1;
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(false, param2, param3, param5, param4);
              L5: while (true) {
                if (0 != var11.field_c) {
                  var7 = (java.awt.Frame) (var11.field_d);
                  if (var7 != null) {
                    L6: {
                      if (param0) {
                        break L6;
                      } else {
                        field_H = (hr[]) null;
                        break L6;
                      }
                    }
                    if (var11.field_c == 2) {
                      wj.a(var7, param1, false);
                      stackIn_38_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  tg.a(10L, (byte) 118);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var6_ref);

            stackIn_41_1 = new StringBuilder().append("hf.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_32_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_38_0);
          }
        }
    }

    hf(dg param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_K = 0;
    }

    boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -28778) {
            this.field_N = 52;
        }
        if (0 >= this.field_K) {
        } else {
            var2 = this.field_J;
            var3 = this.field_I;
            fieldTemp$0 = this.field_G + 1;
            this.field_G = this.field_G + 1;
            if (fieldTemp$0 >= this.field_K) {
                this.field_K = 0;
                this.i(0);
            } else {
                var4 = this.field_G * (2 * this.field_K + -this.field_G);
                var5 = this.field_K * this.field_K;
                var2 = this.field_M - -(var4 * (-this.field_M + this.field_J) / var5);
                var3 = this.field_N + var4 * (this.field_I - this.field_N) / var5;
            }
            this.c(var2, var3, 109);
        }
        return super.g(-28778);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (-1 <= (param2 ^ -1)) {
            this.c(param3, param1, 103);
            return;
        }
        this.field_M = this.field_q;
        this.field_K = param2;
        this.field_I = param1;
        this.field_J = param3;
        this.field_G = 0;
        this.field_N = this.field_p;
        if (param0) {
            this.a(false, -70, -124, -36);
        }
    }

    void f(byte param0) {
        if (!(this.field_K > 0)) {
            return;
        }
        this.c(this.field_J, this.field_I, 45);
        if (param0 != -128) {
            this.field_K = 65;
        }
        this.field_K = 0;
        this.i(0);
    }

    static {
        field_L = new String[]{"Access the new turrets!", "Challenging levels!", "Diabolical bosses!"};
    }
}
