/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ana extends nv {
    static caa field_o;
    private int field_n;
    private iu field_r;
    private int field_q;
    private int field_p;

    private final int b(int param0, int param1) {
        if (param0 >= -20) {
            return 49;
        }
        return param1 / 8 >> 2082632048;
    }

    public final void m(int param0) {
        int var2;
        if (this.field_k) {
          return;
        } else {
          L0: {
            super.m(82);
            var2 = -79 % ((28 - param0) / 49);
            if (!this.field_f) {
              this.e(false);
              break L0;
            } else {
              if (this.b(true).o((byte) -82)) {
                this.a((byte) -115, this.field_p);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            this.field_p = 110;
        }
        return param0;
    }

    final int a(int param0, ep param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
              if (param0 == 25940) {
                break L1;
              } else {
                this.field_q = 56;
                break L1;
              }
            }
            var4_int = param1.i(-1);
            stackIn_3_0 = this.a(var4_int, var4_int, param2, param1.d(3), (byte) -36, param1.e(9648));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ana.BC(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.b(0);
            param1.a(26492, true, 1);
            param1.a(param0, 35);
            param1.b((byte) 112, 8);
            param1.a(true, (byte) 109, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ana.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          if (param4 > 79) {
            break L0;
          } else {
            this.field_r = (iu) null;
            break L0;
          }
        }
        if (2 == param3) {
          if (null != this.field_r) {
            nm.a(this.field_r, (byte) 89);
            var7 = 0;
            var8 = param5 - (param0 / 2 - -this.field_g.d(3) + -(this.field_g.c(-15) / 2));
            var9 = -this.field_g.e(9648) + this.field_g.a((byte) 55) / 2 + (param2 - param1 / 2);
            var10 = param0 + var8;
            var11 = var9 - -param1;
            var12 = this.b(-105, var8);
            var13 = this.b(-127, var9);
            var14 = this.b(-68, 7 + var10);
            var15 = this.b(-73, 8 + (var11 - 1));
            var16 = 64;
            var17 = var13;
            L1: while (true) {
              if (var17 > var15) {
                pfa.a(1);
                return var7;
              } else {
                var18 = this.field_r.field_m * var17 + var12;
                var19 = var12;
                L2: while (true) {
                  if (var14 < var19) {
                    var17++;
                    continue L1;
                  } else {
                    if ((var18 ^ -1) <= -1) {
                      if (var18 < bea.field_l.length) {
                        if (this.field_q <= bea.field_l[var18]) {
                          L3: {
                            if (var13 == var17) {
                              break L3;
                            } else {
                              if (var17 == var15) {
                                break L3;
                              } else {
                                if (var19 == var12) {
                                  break L3;
                                } else {
                                  if (var14 != var19) {
                                    var7 = var7 + var16;
                                    var18++;
                                    var19++;
                                    continue L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          var20 = jqa.a(var9 >> -1380671440, 1, 8 * var17, var17 * 8 + 8, var11 >> -740645968, 0, 8 * var19, var10 >> 1260955504, 8 + var19 * 8, var8 >> -409295376);
                          var7 = var7 + var20;
                          var18++;
                          var19++;
                          continue L2;
                        } else {
                          var18++;
                          var19++;
                          continue L2;
                        }
                      } else {
                        var18++;
                        var19++;
                        continue L2;
                      }
                    } else {
                      var18++;
                      var19++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.k(2);
        }
        return 3;
    }

    ana(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = 240;
        this.field_n = 2621440;
        this.field_p = 255;
        try {
          L0: {
            L1: {
              if (-5 < (param0.field_E ^ -1)) {
                break L1;
              } else {
                this.field_n = param1.b((byte) 44, 10) << -1821334192;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ana.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              param3.setLength(param0);
              if (param2 == -11) {
                break L1;
              } else {
                var7 = (StringBuilder) null;
                ana.a(101, 'ﾘ', -14, (StringBuilder) null);
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param0 <= var5) {
                stackIn_7_0 = (StringBuilder) (param3);
                break L0;
              } else {
                param3.setCharAt(var5, param1);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ana.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void d(boolean param0) {
        field_o = null;
        if (!param0) {
            StringBuilder var2 = (StringBuilder) null;
            ana.a(101, 'ﾥ', 42, (StringBuilder) null);
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 59, this.field_n >> 1936665904, 10);
            if (param0) {
                kh var4 = (kh) null;
                this.a(true, (kh) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ana.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2.field_j != 1) {
                break L1;
              } else {
                var7_int = et.b(param0, param1, -48) / 2;
                this.a(param3, (byte) 90, param2.field_b, var7_int, param5);
                break L1;
              }
            }
            var7_int = -5 / ((param4 - 62) / 52);
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ana.UB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final void k(int param0) {
        int[] var2;
        int var3_int;
        int var4;
        kh var5;
        int[] var6;
        int[] var7;
        int[] var8;
        hca var3;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_r == null) {
          return;
        } else {
          if (!this.field_f) {
            return;
          } else {
            L0: {
              var8 = this.field_r.field_r;
              var7 = var8;
              var6 = var7;
              var2 = var6;
              if (param0 == 5418) {
                break L0;
              } else {
                var5 = (kh) null;
                this.a(true, (kh) null);
                break L0;
              }
            }
            var3_int = -1 + var8.length;
            L1: while (true) {
              if (var3_int < 0) {
                L2: {
                  if ((this.field_n ^ -1) < -1) {
                    var3 = this.m((byte) 19);
                    this.a(var3.d(3), (byte) 86, 10, this.field_n, var3.e(param0 ^ 12442));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  if (var8[var3_int] >= this.field_p) {
                    break L3;
                  } else {
                    var6 = var2;
                    var6[var3_int] = var6[var3_int] + 8;
                    break L3;
                  }
                }
                var6 = var2;
                if (var8[var3_int] > this.field_p) {
                  var6[var3_int] = this.field_p;
                  var3_int--;
                  continue L1;
                } else {
                  var3_int--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int a(int param0, up param1, pc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pc var10 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -85) {
                break L1;
              } else {
                var10 = (pc) null;
                this.a(26, (up) null, (pc) null);
                break L1;
              }
            }
            L2: {
              var4_int = param2.field_d - this.field_g.d(3) + this.field_g.c(-67) / 2;
              var5 = param2.field_e - (this.field_g.d(3) + -(this.field_g.c(-63) / 2));
              var6 = param2.field_k + -this.field_g.e(9648) - -(this.field_g.a((byte) 55) / 2);
              var7 = param2.field_a + (-this.field_g.e(9648) - -(this.field_g.a((byte) 55) / 2));
              var8 = param1.field_b;
              if (-11 >= (var8 ^ -1)) {
                var8 = 9;
                break L2;
              } else {
                break L2;
              }
            }
            var9 = var8 * sl.field_e.length / 10;
            nm.a(this.field_r, (byte) 110);
            iha.a(var4_int / 8 >> -1807295760, var6 / 8 >> -167885584, var5 / 8 >> -1108005776, var7 / 8 >> -537920880, 2, var9, sl.field_e);
            pfa.a(1);
            stackIn_6_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ana.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void e(boolean param0) {
        if (param0) {
            return;
        }
        this.a((byte) -125, 0);
    }

    private final void b(int param0) {
        int var2;
        int var3;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        var2 = this.field_g.c(param0 + -21) >> -1497250736;
        var3 = this.field_g.a((byte) 55) >> -206665488;
        if (param0 == 0) {
          L0: {
            if (this.b(true).o((byte) -82)) {
              this.field_p = 128;
              break L0;
            } else {
              this.field_p = 255;
              break L0;
            }
          }
          L1: {
            this.field_r = null;
            if (var2 < 32) {
              break L1;
            } else {
              L2: {
                if (-33 < (var3 ^ -1)) {
                  break L2;
                } else {
                  if (-1025 >= (var2 ^ -1)) {
                    break L2;
                  } else {
                    if ((var3 ^ -1) > -1025) {
                      L3: {
                        this.field_r = new iu(var2 / 8, var3 / 8);
                        stackIn_12_0 = this;

                        stackIn_12_1 = -117;

                        if (!this.field_f) {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 0;
                          break L3;
                        } else {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 255;
                          break L3;
                        }
                      }
                      this.a((byte) stackIn_13_1, stackIn_13_2);
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    ana(la param0, boolean param1) {
        super(param0, param1);
        this.field_q = 240;
        this.field_n = 2621440;
        this.field_p = 255;
    }

    private final void a(byte param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(null != this.field_r)) {
            return;
        }
        if (this.b(true).o((byte) -82)) {
            param1 = param1 / 2;
        }
        int[] var6 = this.field_r.field_r;
        int[] var3 = var6;
        int var4 = -1 + var6.length;
        if (param0 >= -93) {
            field_o = (caa) null;
        }
        while (var4 >= 0) {
            var3[var4] = param1;
            var4--;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = -106 % ((-24 - param1) / 60);
        if (null == this.field_r) {
            return;
        }
    }

    static {
    }
}
