/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends nv {
    private int field_n;
    private int field_q;
    private boolean field_s;
    private int field_u;
    private hj field_t;
    private int field_o;
    private boolean field_r;
    private boolean field_p;

    final static jea b(int param0) {
        if (param0 > -31) {
            mo.b(47);
        }
        return dn.field_b.field_tb;
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            return -114;
        }
        return param0;
    }

    final void a(int param0, boolean param1) {
        if (param0 != 16) {
            this.a(-128, 105);
        }
        this.field_p = param1 ? true : false;
    }

    final void k(int param0) {
        if (param0 != 5418) {
            this.a(true);
        }
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        la var7_ref_la = null;
        int var8 = 0;
        tqa var8_ref_tqa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        hca var19 = null;
        var18 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, (byte) 54, param2, param3);
            if (param3 != 1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!(param2 instanceof hca)) {
                if (this.field_n != 0) {
                  var5_int = param2.d(3);
                  var6 = param2.e(9648);
                  var7 = param2.c(-93);
                  var8 = param2.a((byte) 55);
                  var9 = var5_int + -(var7 / 2) + -this.field_g.r((byte) -95) + -this.field_o;
                  var10 = var6 - var8 / 2 + (-this.field_g.Q(2) + -this.field_q);
                  var11 = var9 + (var7 - 1);
                  var12 = var10 + var8 + -1;
                  var9 = var9 / this.field_u;
                  var11 = var11 / this.field_u;
                  var12 = var12 / this.field_u;
                  var10 = var10 / this.field_u;
                  if (param1 > 18) {
                    var13 = param2.b(-124);
                    var15 = var9;
                    L1: while (true) {
                      if (var11 < var15) {
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        var16 = var10;
                        L2: while (true) {
                          if (var16 > var12) {
                            var15++;
                            continue L1;
                          } else {
                            L3: {
                              if (this.field_t.a(var15, var16, (byte) -128)) {
                                var14 = this.field_t.b((byte) -5, var16, var15);
                                if (-1 != var14) {
                                  if (this.field_r) {
                                    L4: {
                                      var14 = var14 + var13;
                                      if (var14 >= this.field_n) {
                                        var14 = -1;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    this.field_t.a(var16, var14, 0, var15);
                                    break L3;
                                  } else {
                                    if (this.field_n <= var13) {
                                      if ((this.field_n ^ -1) <= -1) {
                                        this.field_t.a(var16, -1, 0, var15);
                                        break L3;
                                      } else {
                                        var16++;
                                        continue L2;
                                      }
                                    } else {
                                      var16++;
                                      continue L2;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                            var16++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 7;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 6;
                  break L0;
                }
              } else {
                L5: {
                  var5_int = param2.d(3);
                  var6 = param2.e(9648);
                  var7_ref_la = this.b(true);
                  var8_ref_tqa = var7_ref_la.f((byte) 93);
                  var9 = var8_ref_tqa.a(var5_int, false);
                  var10 = var8_ref_tqa.a(var6, false);
                  var11 = var6 % this.field_u;
                  var12 = var5_int % this.field_u;
                  var13 = this.field_u / 2;
                  if (var11 <= var13) {
                    break L5;
                  } else {
                    if (var8_ref_tqa.a(79, var9, 1 + var10).a(-111, new int[]{1, 0})) {
                      break L5;
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L6: {
                  if (var11 >= var13) {
                    break L6;
                  } else {
                    if (!var8_ref_tqa.a(74, var9, var10 - 1).a(-126, new int[]{1, 0})) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var12 >= var13) {
                    break L7;
                  } else {
                    if (var8_ref_tqa.a(-108, var9 + -1, var10).a(-117, new int[]{1, 0})) {
                      break L7;
                    } else {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                L8: {
                  if (var12 <= var13) {
                    break L8;
                  } else {
                    if (!var8_ref_tqa.a(-112, var9 + 1, var10).a(-111, new int[]{1, 0})) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  var19 = (hca) ((Object) param2);
                  if (this.field_s) {
                    var19.a(10, (byte) -19);
                    break L9;
                  } else {
                    if (this.field_p) {
                      var19.a(4, (byte) -18, 6);
                      break L9;
                    } else {
                      var19.a(4, (byte) 102, 5);
                      break L9;
                    }
                  }
                }
                decompiledRegionSelector0 = 5;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var5);

            stackIn_53_1 = new StringBuilder().append("mo.SB(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L10;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L11;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_54_0), stackIn_57_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    mo(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = jm.field_l;
        this.field_n = 0;
        this.field_p = false;
        this.field_s = false;
        this.field_r = false;
        try {
            this.field_u = jm.field_l;
            this.c(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            super.a(param0, param1);
            this.field_g.b((byte) -102, 4);
            this.field_g.a(true, (byte) -25, 0);
            this.field_g.a((byte) -114, true, 1);
            this.field_g.b((byte) 17, param0);
            var3_int = this.field_g.c(-56) / this.field_u;
            var4 = this.field_g.a((byte) 55) / this.field_u;
            this.field_t = new hj(var3_int, var4, 0);
            this.field_o = (this.field_g.c(-92) + -(this.field_t.field_f * this.field_u)) / 2;
            this.field_q = (this.field_g.a((byte) 55) + -(this.field_t.field_a * this.field_u)) / 2;
            this.field_g.f((byte) -93).a(1, -1, this.field_g.d(3), this.field_g.e(9648), this.field_g.c(-27), this.field_g.a((byte) 55), 123);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mo.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        var16 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return 0;
        } else {
          if (!io.a(this.field_u * this.field_t.field_f, param2, (byte) -115, this.field_u * this.field_t.field_a, param5, this.field_g.e(9648), param1, param0, this.field_g.d(3))) {
            return 0;
          } else {
            L0: {
              var7 = 0;
              var8 = this.field_g.r((byte) -95) - -this.field_o;
              if (param4 >= 79) {
                break L0;
              } else {
                this.a(false);
                break L0;
              }
            }
            var9 = this.field_g.Q(2) - -this.field_q;
            var10 = -(param0 / 2) - (var8 - param5);
            var11 = param2 - param1 / 2 - var9;
            var12 = -1 + (param0 + var10);
            var13 = var11 - (-param1 - -1);
            var10 = var10 / this.field_u;
            var11 = var11 / this.field_u;
            var13 = var13 / this.field_u;
            var12 = var12 / this.field_u;
            var14 = var10;
            L1: while (true) {
              if (var12 < var14) {
                return var7;
              } else {
                var15 = var11;
                L2: while (true) {
                  if (var15 > var13) {
                    var14++;
                    continue L1;
                  } else {
                    if (this.field_t.a(var14, var15, (byte) -128)) {
                      if (this.field_t.b((byte) -5, var15, var14) != -1) {
                        var7 = var7 + foa.a(param1, param5, var15 * this.field_u + (this.field_u / 2 + var9), param2, this.field_u, (byte) 75, param0, this.field_u, 16, var8 - (-(this.field_u / 2) - this.field_u * var14));
                        var15++;
                        continue L2;
                      } else {
                        var15++;
                        continue L2;
                      }
                    } else {
                      var15++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    mo(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = jm.field_l;
        this.field_n = 0;
        this.field_p = false;
        this.field_s = false;
        this.field_r = false;
        try {
          L0: {
            L1: {
              this.field_n = param1.b((byte) 44, 8);
              stackIn_3_0 = this;

              if (1 != param1.b((byte) 44, 1)) {
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
              ((mo) (this)).field_r = stackIn_4_1 != 0;
              if (param0.field_E < 4) {
                this.field_u = jm.field_l;
                break L2;
              } else {
                this.field_u = param1.b((byte) 44, 10) << -327303504;
                break L2;
              }
            }
            L3: {
              if (-12 >= (param0.field_E ^ -1)) {
                L4: {
                  stackIn_11_0 = this;

                  if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                    stackIn_12_0 = this;
                    stackIn_12_1 = 0;
                    break L4;
                  } else {
                    stackIn_12_0 = this;
                    stackIn_12_1 = 1;
                    break L4;
                  }
                }
                ((mo) (this)).field_s = stackIn_12_1 != 0;
                this.c(0);
                break L3;
              } else {
                this.c(0);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("mo.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_t = (hj) null;
        }
        return 8;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 71, this.field_n, 8);
            param1.a((byte) 34, this.field_r ? 1 : 0, 1);
            param1.a((byte) 69, this.field_u >> 169596400, 10);
            param1.a((byte) -128, !this.field_s ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mo.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
            this.field_t = (hj) null;
        }
        if (!(!this.field_s)) {
            this.field_n = 0;
        }
        if (!(dsa.field_b <= this.field_u)) {
            this.field_u = dsa.field_b;
        }
    }

    static {
    }
}
